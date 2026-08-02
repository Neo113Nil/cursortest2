package bo.app;

import android.os.SystemClock;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.random.Random;
import kotlin.random.XorWowRandom;

/* loaded from: classes3.dex */
public final class x7 {
    public static final int g = 45000;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Random e;
    public int f;

    public x7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.e = new XorWowRandom((int) uptimeMillis, (int) (uptimeMillis >> 32));
    }

    public final int a(int i) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(this, 26), 7, (Object) null);
        Random random = this.e;
        int i2 = this.f * this.d;
        random.getClass();
        int min = Math.min(i, i2) + random.nextInt(Math.abs(i - i2) + 1);
        this.f = Math.max(this.c, Math.min(this.a, min));
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x7$$ExternalSyntheticLambda1(this, i, min, 0), 7, (Object) null);
        return this.f;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        Random random = this.e;
        int i5 = this.f;
        boolean z = i5 != 0;
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "ExponentialBackoffStateProvider(maxSleepDurationMs=", ", defaultNormalFlushIntervalMs=", ", minSleepDurationMs=");
        Recorder$$ExternalSyntheticOutline1.m105m(i3, i4, ", scaleFactor=", ", randomSleepDurationGenerator=", m107m);
        m107m.append(random);
        m107m.append(", lastSleepDurationMs=");
        m107m.append(i5);
        m107m.append(", isBackingOff=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, z, ")");
    }

    public static final String a(x7 x7Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(x7Var.f, "Computing new sleep delay. Previous sleep delay: ");
    }

    public static final String a(x7 x7Var, int i, int i2) {
        int i3 = x7Var.f;
        int i4 = x7Var.a;
        int i5 = x7Var.c;
        int i6 = x7Var.d;
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i3, i, "New sleep duration: ", " ms. Default sleep duration: ", " ms. Max sleep: ");
        Recorder$$ExternalSyntheticOutline1.m105m(i4, i5, " ms. Min sleep: ", " ms. Scale factor: ", m107m);
        return Recorder$$ExternalSyntheticOutline2.m(i6, i2, " randomValueBetweenSleepIntervals: ", m107m);
    }
}
