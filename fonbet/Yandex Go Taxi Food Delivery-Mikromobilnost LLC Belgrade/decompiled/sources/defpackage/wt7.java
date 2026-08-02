package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.camera.core.d;
import androidx.camera.core.e;
import androidx.concurrent.futures.b;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class wt7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ wt7(int i, long j, Context context, e eVar, b bVar, Executor executor) {
        this.w = eVar;
        this.x = executor;
        this.c = j;
        this.b = i;
        this.y = context;
        this.z = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.z;
        Object obj2 = this.y;
        int i2 = this.b;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                Executor executor = (Executor) obj3;
                executor.execute(new d(i2 + 1, this.c, (Context) obj2, (e) obj4, (b) obj, executor));
                return;
            default:
                String str = (String) obj3;
                xfg xfgVar = (xfg) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                long j = this.c;
                FlutterJNI flutterJNI = ((bgg) obj4).a;
                Trace.endAsyncSection(ffx.f0(ozz0.a("PlatformChannel ScheduleHandler on " + str)), i2);
                try {
                    ozz0.c("DartMessenger#handleMessageFromDart on " + str);
                    try {
                        if (xfgVar != null) {
                            try {
                                try {
                                    xfgVar.a.q(byteBuffer, new yfg(flutterJNI, i2));
                                } catch (Exception e) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
                                }
                            } catch (Error e2) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e2;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e2);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
                        }
                        if (byteBuffer != null && byteBuffer.isDirect()) {
                            byteBuffer.limit(0);
                        }
                        Trace.endSection();
                        return;
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j);
                }
        }
    }

    public /* synthetic */ wt7(bgg bggVar, String str, int i, xfg xfgVar, ByteBuffer byteBuffer, long j) {
        this.w = bggVar;
        this.x = str;
        this.b = i;
        this.y = xfgVar;
        this.z = byteBuffer;
        this.c = j;
    }
}
