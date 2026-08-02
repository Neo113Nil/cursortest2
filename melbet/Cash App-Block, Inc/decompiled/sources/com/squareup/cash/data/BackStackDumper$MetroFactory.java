package com.squareup.cash.data;

import android.media.MediaDrm;
import android.os.HandlerThread;
import android.os.Looper;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.fillr.e;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.WireJsonAdapterFactory;
import dev.zacsweers.metro.internal.Factory;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;

/* loaded from: classes.dex */
public final class BackStackDumper$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public static final BackStackDumper$MetroFactory INSTANCE$1 = new BackStackDumper$MetroFactory(1);
    public static final BackStackDumper$MetroFactory INSTANCE = new BackStackDumper$MetroFactory(0);
    public static final BackStackDumper$MetroFactory INSTANCE$2 = new BackStackDumper$MetroFactory(2);
    public static final BackStackDumper$MetroFactory INSTANCE$3 = new BackStackDumper$MetroFactory(3);
    public static final BackStackDumper$MetroFactory INSTANCE$4 = new BackStackDumper$MetroFactory(4);
    public static final BackStackDumper$MetroFactory INSTANCE$5 = new BackStackDumper$MetroFactory(5);
    public static final BackStackDumper$MetroFactory INSTANCE$6 = new BackStackDumper$MetroFactory(6);
    public static final BackStackDumper$MetroFactory INSTANCE$7 = new BackStackDumper$MetroFactory(7);

    public /* synthetic */ BackStackDumper$MetroFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new e();
            case 1:
                Moshi.Builder builder = new Moshi.Builder();
                builder.add((JsonAdapter.Factory) new WireJsonAdapterFactory());
                return new Moshi(builder);
            case 2:
                return 400L;
            case 3:
                return Boolean.FALSE;
            case 4:
                HandlerThread handlerThread = new HandlerThread("js");
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                looper.getClass();
                return looper;
            case 5:
                String str = null;
                try {
                    MediaDrm mediaDrm = new MediaDrm(UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"));
                    try {
                        byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                        propertyByteArray.getClass();
                        ByteString.Companion companion = ByteString.Companion;
                        str = ByteString.Companion.of$default(propertyByteArray).base64();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        try {
                            mediaDrm.release();
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                    mediaDrm.release();
                } catch (Exception unused3) {
                }
                return str;
            case 6:
                return Thread$State$EnumUnboxingLocalUtility.m("Shopping", "Shop");
            case 7:
                return new AtomicInteger();
            default:
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                defaultIoScheduler.getClass();
                return JobKt.plus(defaultIoScheduler, JobKt.MainScope());
        }
    }
}
