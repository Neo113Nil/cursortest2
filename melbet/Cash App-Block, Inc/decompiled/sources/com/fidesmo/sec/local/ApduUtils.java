package com.fidesmo.sec.local;

import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.local.models.DeviceApp;
import com.fidesmo.sec.local.models.DeviceAppStatus;
import com.fidesmo.sec.utils.Hex;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate$CreateEmitter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import retrofit2.adapter.rxjava3.CallEnqueueObservable;

/* loaded from: classes4.dex */
class ApduUtils {
    public static Observable<List<byte[]>> enumerateApplets(Device device, String str) {
        return new CallEnqueueObservable(new ApduUtils$$ExternalSyntheticLambda0(device, str), 1);
    }

    public static void enumerateAppletsUtils(Device device, String str, List<byte[]> list, ObservableEmitter observableEmitter, boolean z) {
        Observable<byte[]> transceive = transceive(device, Hex.decodeHex((z ? "00A4040006" : "00A4040206") + str + "00"), "");
        ApduUtils$$ExternalSyntheticLambda2 apduUtils$$ExternalSyntheticLambda2 = new ApduUtils$$ExternalSyntheticLambda2(list, device, str, observableEmitter);
        Objects.requireNonNull(observableEmitter);
        ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(observableEmitter, 27);
        transceive.getClass();
        transceive.subscribe(new LambdaObserver(apduUtils$$ExternalSyntheticLambda2, exoPlayerImplInternal$$ExternalSyntheticLambda2));
    }

    public static byte[] getData(int i) {
        return Hex.decodeHex(String.format("80CA%04X00", Integer.valueOf(i & 65535)).toUpperCase());
    }

    public static byte[] getTlvData(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.get() & Byte.MAX_VALUE];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static int getTlvTag(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = b & 255;
        return (b & 31) == 31 ? (i << 8) + (byteBuffer.get() & 255) : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$enumerateApplets$0(Device device, String str, ObservableEmitter observableEmitter) {
        enumerateAppletsUtils(device, str, new ArrayList(), observableEmitter, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$enumerateAppletsUtils$1(List list, Device device, String str, ObservableEmitter observableEmitter, byte[] bArr) {
        if (statusWord(bArr) == 36864) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.add(bArr);
            enumerateAppletsUtils(device, str, arrayList, observableEmitter, false);
        } else {
            ObservableCreate$CreateEmitter observableCreate$CreateEmitter = (ObservableCreate$CreateEmitter) observableEmitter;
            observableCreate$CreateEmitter.onNext(list);
            observableCreate$CreateEmitter.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$transceive$3(int[] iArr, String str, byte[] bArr) {
        int statusWord = statusWord(bArr);
        int length = iArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            z = (i2 <= 255 && (statusWord >> 8) == i2) || i2 == statusWord;
            if (z) {
                break;
            }
        }
        if (z) {
            return bArr;
        }
        Formatter formatter = new Formatter();
        formatter.format("%s failed with status word %04X, %d", str, Integer.valueOf(statusWord), Integer.valueOf(statusWord));
        throw new RuntimeException(formatter.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$transceiveGetData$2(int i, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (getTlvTag(wrap) == i) {
            return getTlvData(wrap);
        }
        throw new RuntimeException(String.format("Invalid IIN tlv tag 0x%4X", Integer.valueOf(i)));
    }

    public static long parseLong(byte[] bArr, int i) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        if (bArr.length != i) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Data must be ", " bytes"));
            return 0L;
        }
        long j = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            try {
                j += dataInputStream.readUnsignedByte() << (i2 * 8);
            } catch (IOException e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return 0L;
            }
        }
        return j;
    }

    public static DeviceApp readCardletEntry(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(responseData(bArr));
        getTlvTag(wrap);
        ByteBuffer wrap2 = ByteBuffer.wrap(getTlvData(wrap));
        String str = "";
        while (wrap2.remaining() > 0) {
            if (getTlvTag(wrap2) != 132) {
                getTlvData(wrap2);
            } else {
                str = Hex.encodeHex(getTlvData(wrap2));
            }
        }
        return new DeviceApp(str.substring(12, 20).toLowerCase(), DeviceAppStatus.Installed);
    }

    public static Map<Integer, byte[]> readSequenceOfTlvs(ByteBuffer byteBuffer) {
        HashMap hashMap = new HashMap();
        while (byteBuffer.remaining() > 0) {
            int i = byteBuffer.get() & 255;
            int i2 = byteBuffer.get() & 255;
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr, 0, i2);
            hashMap.put(Integer.valueOf(i), bArr);
        }
        return hashMap;
    }

    public static byte[] responseData(byte[] bArr) {
        return Arrays.copyOf(bArr, bArr.length - 2);
    }

    public static ByteBuffer searchForTlvInLv(ByteBuffer byteBuffer, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(getTlvData(byteBuffer));
        while (wrap.remaining() > 0 && getTlvTag(wrap) != i) {
            getTlvData(wrap);
        }
        if (wrap.remaining() == 0) {
            return null;
        }
        return wrap;
    }

    public static int statusWord(byte[] bArr) {
        return (bArr[bArr.length - 1] & 255) + ((bArr[bArr.length - 2] & 255) << 8);
    }

    public static Boolean succesfulStatus(String str) {
        return str.length() <= 4 ? Boolean.FALSE : Boolean.valueOf(str.substring(str.length() - 4).equals("9000"));
    }

    public static Observable<byte[]> transceive(Device device, byte[] bArr, String str) {
        return transceive(device, bArr, str, new int[]{36864, 27266});
    }

    public static Observable<byte[]> transceiveGetData(Device device, final int i, String str) {
        return transceive(device, getData(i), str).map(new Function() { // from class: com.fidesmo.sec.local.ApduUtils$$ExternalSyntheticLambda1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply */
            public final Object mo39apply(Object obj) {
                byte[] lambda$transceiveGetData$2;
                lambda$transceiveGetData$2 = ApduUtils.lambda$transceiveGetData$2(i, (byte[]) obj);
                return lambda$transceiveGetData$2;
            }
        });
    }

    public static Observable<byte[]> transceive(Device device, byte[] bArr, String str, int[] iArr) {
        return device.transceive(bArr).map(new ApduUtils$$ExternalSyntheticLambda0(iArr, str));
    }
}
