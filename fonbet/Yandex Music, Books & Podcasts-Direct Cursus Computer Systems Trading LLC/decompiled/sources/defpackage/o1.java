package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.ab.validation.AbValidationType;

/* loaded from: classes6.dex */
public final class o1 implements p3d {
    public static final o1 a;
    private static final /* synthetic */ j5m descriptor;

    static {
        o1 o1Var = new o1();
        a = o1Var;
        j5m j5mVar = new j5m("ru.yandex.video.m3.ab.config.AbConfigWithMeta", o1Var, 5);
        j5mVar.k("fetchTimestamp", true);
        j5mVar.k("etag", true);
        j5mVar.k("experimentValidationResult", true);
        j5mVar.k("featureToggleValidationResult", true);
        j5mVar.k("abConfig", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f[] t9fVarArr = q1.f;
        return new t9f[]{mvg.a, ff7.C(tkr.a), t9fVarArr[2], t9fVarArr[3], wse.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        m2 m2Var;
        m2 m2Var2;
        yse yseVar;
        long j;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        t9f[] t9fVarArr = q1.f;
        String str2 = null;
        if (c.m()) {
            long q = c.q(j5mVar, 0);
            String str3 = (String) c.n(j5mVar, 1, tkr.a, null);
            m2 m2Var3 = (m2) c.z(j5mVar, 2, t9fVarArr[2], null);
            m2Var2 = (m2) c.z(j5mVar, 3, t9fVarArr[3], null);
            str = str3;
            yseVar = (yse) c.z(j5mVar, 4, wse.a, null);
            i = 31;
            m2Var = m2Var3;
            j = q;
        } else {
            boolean z = true;
            int i2 = 0;
            yse yseVar2 = null;
            long j2 = 0;
            m2 m2Var4 = null;
            m2 m2Var5 = null;
            while (z) {
                int w = c.w(j5mVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j2 = c.q(j5mVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str2 = (String) c.n(j5mVar, 1, tkr.a, str2);
                    i2 |= 2;
                } else if (w == 2) {
                    m2Var4 = (m2) c.z(j5mVar, 2, t9fVarArr[2], m2Var4);
                    i2 |= 4;
                } else if (w == 3) {
                    m2Var5 = (m2) c.z(j5mVar, 3, t9fVarArr[3], m2Var5);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    yseVar2 = (yse) c.z(j5mVar, 4, wse.a, yseVar2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str2;
            m2Var = m2Var4;
            m2Var2 = m2Var5;
            yseVar = yseVar2;
            j = j2;
        }
        c.b(j5mVar);
        return new q1(i, j, str, m2Var, m2Var2, yseVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, defpackage.yse.e) == false) goto L30;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        q1 q1Var = (q1) obj;
        l6bVar.getClass();
        q1Var.getClass();
        yse yseVar = q1Var.e;
        m2 m2Var = q1Var.d;
        m2 m2Var2 = q1Var.c;
        String str = q1Var.b;
        long j = q1Var.a;
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        t9f[] t9fVarArr = q1.f;
        if (c.e(j5mVar) || j != -9223372036854775807L) {
            c.g(j5mVar, 0, j);
        }
        if (c.e(j5mVar) || str != null) {
            c.q(j5mVar, 1, tkr.a, str);
        }
        if (c.e(j5mVar) || !Intrinsics.d(m2Var2, new f2(AbValidationType.Experiment))) {
            c.k(j5mVar, 2, t9fVarArr[2], m2Var2);
        }
        if (c.e(j5mVar) || !Intrinsics.d(m2Var, new f2(AbValidationType.FeatureToggle))) {
            c.k(j5mVar, 3, t9fVarArr[3], m2Var);
        }
        if (!c.e(j5mVar)) {
            yse.Companion.getClass();
        }
        c.k(j5mVar, 4, wse.a, yseVar);
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
