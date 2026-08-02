package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class jg {
    public final boolean a(v9 v9Var, rg rgVar, long j, long j2) {
        long j3;
        v9Var.getClass();
        rgVar.getClass();
        if (v9Var instanceof uf) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(19), 7, (Object) null);
            return true;
        }
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        long j4 = nowInSeconds + r0.d;
        int i = rgVar.b.g;
        if (i != -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(i, 0), 7, (Object) null);
            j3 = j + i;
        } else {
            j3 = j + j2;
        }
        long j5 = j3;
        if (j4 >= j5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda2(0, j4, j5), 6, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new f2$$ExternalSyntheticLambda3(1, j2, j5, j4), 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
    }

    public static final String a(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Using override minimum display interval: ");
    }

    public static final String a(long j, long j2) {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Minimum time interval requirement met for matched trigger. Action display time: ", " . Next viable display time: ");
        m1149m.append(j2);
        return m1149m.toString();
    }

    public static final String a(long j, long j2, long j3) {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Minimum time interval requirement and triggered action override time interval requirement of ", " not met for matched trigger. Returning null. Next viable display time: ");
        m1149m.append(j2);
        m1149m.append(". Action display time: ");
        m1149m.append(j3);
        return m1149m.toString();
    }
}
