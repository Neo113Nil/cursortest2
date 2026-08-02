package com.fidesmo.sec.nfc;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.util.Log;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.utils.Hex;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate$CreateEmitter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import retrofit2.adapter.rxjava3.CallEnqueueObservable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bJ\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0019j\u0002`\u001aJ\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\rH\u0016JT\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140'J\b\u0010)\u001a\u00020\bH\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100+2\u0006\u0010,\u001a\u00020\u0010H\u0016J\"\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100-0+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100-H\u0016J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100-H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/fidesmo/sec/nfc/NfcDevice;", "Lcom/fidesmo/sec/devices/Device;", "tag", "Landroid/nfc/Tag;", "(Landroid/nfc/Tag;)V", "card", "Landroid/nfc/tech/IsoDep;", "deviceId", "", "errorListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/fidesmo/sec/nfc/NfcDevice$ErrorListener;", "hasFailedTransceive", "", "hasNotifiedError", "selectIsd", "", "kotlin.jvm.PlatformType", "selectIsdOk", "addErrorListener", "", "listener", "close", BreadcrumbHelper.Category.ERROR, "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getDeviceId", "getMaxTransceiveLength", "", "getUid", "isConnected", "isConnectionStable", "currentCount", "maxCount", "delayMs", "", "device", "isConnectionStableCallback", "Lkotlin/Function1;", "onCount", "toString", "transceive", "Lio/reactivex/rxjava3/core/Observable;", "payload", "", "payloadList", "transceiveUtil", "payloads", "ErrorListener", "sec-client-nfc_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NfcDevice implements Device {
    private final IsoDep card;
    private final String deviceId;
    private final CopyOnWriteArrayList<ErrorListener> errorListeners;
    private boolean hasFailedTransceive;
    private boolean hasNotifiedError;
    private final byte[] selectIsd;
    private final String selectIsdOk;
    private final Tag tag;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH&¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/nfc/NfcDevice$ErrorListener;", "", BreadcrumbHelper.Category.ERROR, "", "device", "Lcom/fidesmo/sec/devices/Device;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sec-client-nfc_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ErrorListener {
        void error(Device device, Exception exception);
    }

    public NfcDevice(Tag tag) {
        tag.getClass();
        this.tag = tag;
        this.deviceId = "nfc:" + Hex.encodeHex(tag.getId());
        IsoDep isoDep = IsoDep.get(tag);
        isoDep.getClass();
        this.card = isoDep;
        this.errorListeners = new CopyOnWriteArrayList<>();
        this.selectIsd = Hex.decodeHex("00A4040000");
        this.selectIsdOk = "9000";
        if (isoDep != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$4("This card is not supported.");
        throw null;
    }

    public static /* synthetic */ void isConnectionStable$default(NfcDevice nfcDevice, int i, int i2, long j, Device device, Function1 function1, Function1 function12, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        if ((i3 & 4) != 0) {
            j = 100;
        }
        nfcDevice.isConnectionStable(i, i2, j, device, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transceive$lambda$0(NfcDevice nfcDevice, List list, ObservableEmitter observableEmitter) {
        nfcDevice.getClass();
        list.getClass();
        observableEmitter.getClass();
        try {
            ObservableCreate$CreateEmitter observableCreate$CreateEmitter = (ObservableCreate$CreateEmitter) observableEmitter;
            observableCreate$CreateEmitter.onNext(nfcDevice.transceiveUtil(list));
            observableCreate$CreateEmitter.onComplete();
        } catch (IOException e) {
            nfcDevice.error(e);
            ((ObservableCreate$CreateEmitter) observableEmitter).onError(e);
            Log.i("NFC", "Error reported on transceive!");
        } catch (SecurityException e2) {
            nfcDevice.error(e2);
            ((ObservableCreate$CreateEmitter) observableEmitter).onError(e2);
            Log.i("NFC", "Security exception reported on transceive, tag is out of date (not present anymore).");
        }
    }

    private final List<byte[]> transceiveUtil(List<byte[]> payloads) {
        if (this.hasFailedTransceive) {
            close();
            Log.d("NFC", "APDU transmit has failed already for this device, not sending more APDUs.");
            a$$ExternalSyntheticBUOutline0.m$4("Device already failed on transceive, not sending more APDUs.");
            return null;
        }
        if (!isConnected()) {
            try {
                Log.i("NFC", "Calling connect!");
                this.card.connect();
                this.card.setTimeout(60000);
            } catch (IOException e) {
                Log.d("NFC", "Exception received during connect, not sending any APDUs");
                this.hasFailedTransceive = true;
                throw e;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : payloads) {
            Log.i("NFC", "command: " + Hex.encodeHex(bArr));
            try {
                byte[] transceive = this.card.transceive(bArr);
                transceive.getClass();
                arrayList.add(transceive);
                Log.i("NFC", "response: " + Hex.encodeHex(transceive));
            } catch (Throwable th) {
                Log.d("NFC", "Exception received during card transmit, not sending more APDUs");
                this.hasFailedTransceive = true;
                throw th;
            }
        }
        return arrayList;
    }

    public final void addErrorListener(ErrorListener listener) {
        listener.getClass();
        this.errorListeners.add(listener);
    }

    @Override // com.fidesmo.sec.devices.Device
    public void close() {
        this.card.close();
    }

    public final void error(Exception exception) {
        exception.getClass();
        if (this.hasNotifiedError) {
            return;
        }
        Iterator<ErrorListener> it = this.errorListeners.iterator();
        while (it.hasNext()) {
            it.next().error(this, exception);
        }
        this.hasNotifiedError = true;
    }

    @Override // com.fidesmo.sec.devices.Device
    public String getDeviceId() {
        return this.deviceId;
    }

    @Override // com.fidesmo.sec.devices.Device
    public int getMaxTransceiveLength() {
        return this.card.getMaxTransceiveLength();
    }

    @Override // com.fidesmo.sec.devices.Device
    public byte[] getUid() {
        byte[] id = this.tag.getId();
        id.getClass();
        return id;
    }

    @Override // com.fidesmo.sec.devices.Device
    public boolean isConnected() {
        try {
            return this.card.isConnected();
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final void isConnectionStable(final int currentCount, final int maxCount, final long delayMs, final Device device, final Function1<? super Boolean, Unit> isConnectionStableCallback, final Function1<? super Integer, Unit> onCount) {
        device.getClass();
        isConnectionStableCallback.getClass();
        onCount.getClass();
        Observable<byte[]> transceive = device.transceive(this.selectIsd);
        Consumer consumer = new Consumer() { // from class: com.fidesmo.sec.nfc.NfcDevice$isConnectionStable$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(byte[] bArr) {
                String str;
                bArr.getClass();
                if (currentCount >= maxCount) {
                    isConnectionStableCallback.invoke(Boolean.TRUE);
                    return;
                }
                String encodeHex = Hex.encodeHex(bArr);
                encodeHex.getClass();
                String substring = encodeHex.substring(encodeHex.length() - 4);
                str = this.selectIsdOk;
                if (!substring.equals(str)) {
                    isConnectionStableCallback.invoke(Boolean.FALSE);
                    return;
                }
                Thread.sleep(delayMs);
                onCount.invoke(Integer.valueOf(currentCount));
                this.isConnectionStable(currentCount + 1, maxCount, delayMs, device, isConnectionStableCallback, onCount);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.fidesmo.sec.nfc.NfcDevice$isConnectionStable$2
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(Throwable th) {
                th.getClass();
                Log.i("NFC", "Error: " + th);
                isConnectionStableCallback.invoke(Boolean.FALSE);
            }
        };
        transceive.getClass();
        transceive.subscribe(new LambdaObserver(consumer, consumer2));
    }

    public String toString() {
        return "NfcDevice{" + getDeviceId() + '}';
    }

    @Override // com.fidesmo.sec.devices.Device
    public Observable<byte[]> transceive(byte[] payload) {
        payload.getClass();
        return transceive(CollectionsKt__CollectionsJVMKt.listOf(payload)).map(new Function() { // from class: com.fidesmo.sec.nfc.NfcDevice$transceive$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final byte[] mo39apply(List<byte[]> list) {
                list.getClass();
                return list.get(0);
            }
        });
    }

    @Override // com.fidesmo.sec.devices.Device
    public Observable<List<byte[]>> transceive(List<byte[]> payloadList) {
        payloadList.getClass();
        return new CallEnqueueObservable(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(23, this, payloadList), 1);
    }
}
