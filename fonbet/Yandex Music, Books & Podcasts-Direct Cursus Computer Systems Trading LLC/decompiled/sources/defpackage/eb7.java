package defpackage;

import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class eb7 implements yqr {
    public final /* synthetic */ int a;

    public /* synthetic */ eb7(int i) {
        this.a = i;
    }

    @Override // defpackage.yqr
    public final Object get() {
        switch (this.a) {
            case 0:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof wdi) {
                    return (wdi) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new zdi((ScheduledExecutorService) newSingleThreadExecutor) : new wdi(newSingleThreadExecutor);
            case 1:
                byte[] bArr = new byte[12];
                kp7.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new do7(new zi7(), 1000);
            case 3:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    invoke.getClass();
                    return (w7l) invoke;
                } catch (Exception e) {
                    wvs.m(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
