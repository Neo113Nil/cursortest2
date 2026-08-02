package defpackage;

import android.content.Context;
import com.yandex.go.blur.experiments.BlurConfigurationExperiment;
import com.yandex.go.blur.view.internal.scrim.b;
import com.yandex.go.performance_class.a;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public interface w66 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [m76] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v22, types: [m76] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r11v10, types: [g76] */
    /* JADX WARN: Type inference failed for: r11v11, types: [g76] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v4, types: [kdc] */
    /* JADX WARN: Type inference failed for: r14v10, types: [m76] */
    /* JADX WARN: Type inference failed for: r14v15, types: [m76] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r4v14, types: [cy4[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v17, types: [cy4[], java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static v66 a(w66 w66Var, String str, boolean z, m76 m76Var, k76 k76Var, int i) {
        ?? r27;
        char c;
        int i2;
        v66 v66Var;
        boolean z2;
        Class cls;
        Class cls2;
        boolean z3;
        boolean z4;
        Set M0;
        boolean z5;
        Context context;
        ?? r11;
        v66 v66Var2;
        g76 g76Var;
        ?? r14;
        v66 bVar;
        pjd pjdVar;
        l76 l76Var = l76.b;
        String str2 = (i & 1) != 0 ? null : str;
        boolean z6 = (i & 2) != 0 ? true : z;
        m76 m76Var2 = (i & 8) != 0 ? null : m76Var;
        x66 x66Var = (x66) w66Var;
        u66 u66Var = x66Var.b;
        pdc pdcVar = u66Var.a;
        q66 q66Var = u66Var.d;
        if (q66Var != null) {
            z2 = z6;
            cls = h76.class;
            cls2 = f76.class;
            c = 0;
            r27 = 1;
            i2 = 2;
            v66Var = null;
        } else {
            String d = ((a) u66Var.c).d();
            r27 = 1;
            BlurConfigurationExperiment blurConfigurationExperiment = (BlurConfigurationExperiment) u66Var.b.b.c();
            c = 0;
            BlurConfigurationExperiment.Scrim scrim = blurConfigurationExperiment.d;
            i2 = 2;
            BlurConfigurationExperiment.SystemRenderEffect systemRenderEffect = blurConfigurationExperiment.c;
            v66Var = null;
            BlurConfigurationExperiment.AgslRenderEffect agslRenderEffect = blurConfigurationExperiment.b;
            ufu ufuVar = (ufu) pdcVar;
            kdc i3 = ufuVar.i(scrim.b);
            z2 = z6;
            cls = h76.class;
            cls2 = f76.class;
            kdc h = ufuVar.h(new bdc(hng0.blurFallbackScrimColor), scrim.c);
            g0c a = qoi0.a(cls2);
            if (!agslRenderEffect.a || !u66.a(d, agslRenderEffect.c)) {
                a = null;
            }
            g0c a2 = qoi0.a(cls);
            if (!systemRenderEffect.a || !u66.a(d, systemRenderEffect.g)) {
                a2 = null;
            }
            g0c a3 = qoi0.a(g76.class);
            if (!scrim.a) {
                a3 = null;
            }
            lfx[] lfxVarArr = {a, a2, a3};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i4 = 0;
            for (int i5 = 3; i4 < i5; i5 = 3) {
                lfx lfxVar = lfxVarArr[i4];
                if (lfxVar != null) {
                    linkedHashSet.add(lfxVar);
                }
                i4++;
            }
            q66Var = new q66(linkedHashSet, new f76(agslRenderEffect.b), new h76(systemRenderEffect.c, systemRenderEffect.b, systemRenderEffect.d, systemRenderEffect.e, systemRenderEffect.f), new g76(i3, h, 4), blurConfigurationExperiment.e);
            u66Var.d = q66Var;
        }
        g76 g76Var2 = (g76) q66Var.x;
        Set set = (Set) q66Var.b;
        h76 h76Var = (h76) q66Var.w;
        boolean z7 = h76Var.a;
        boolean z8 = h76Var.c;
        if (!z2) {
            set = kotlin.collections.a.U(Collections.singleton(qoi0.a(g76.class)), set);
        } else if ("".equals(qoi0.a(j76.class).d())) {
            set = Collections.singleton(qoi0.a(cls2));
        } else {
            if ("".equals(qoi0.a(n76.class).d())) {
                set = Collections.singleton(qoi0.a(cls));
                z4 = r27;
                z3 = z4;
                M0 = kotlin.collections.a.M0(set);
                z5 = k76Var instanceof m76;
                if (!z5) {
                    if (!k76Var.equals(l76Var)) {
                        w511.b();
                        return v66Var;
                    }
                    M0.removeIf(new md3(3, new qu(11)));
                }
                context = x66Var.a;
                f76 f76Var = new f76(((f76) q66Var.c).a);
                h76 h76Var2 = new h76(h76Var.b, z4, z3, h76Var.d, h76Var.e);
                if (m76Var2 == null) {
                    ?? r13 = v66Var;
                    r11 = new g76((kdc) r13, m76Var2.a, m76Var2.b);
                    v66Var2 = r13;
                } else {
                    v66 v66Var3 = v66Var;
                    r11 = v66Var3;
                    v66Var2 = v66Var3;
                }
                kdc kdcVar = g76Var2.a;
                r14 = !z5 ? (m76) k76Var : v66Var2;
                if (r14 != null || (r14 = r14.a) == null) {
                    kdc kdcVar2 = g76Var2.b;
                }
                ?? r0 = !z5 ? (m76) k76Var : v66Var2;
                g76Var = new g76(kdcVar, kdcVar2, (Float) (r0 == null ? r0.b : v66Var2));
                if (!jx81.f() && M0.contains(qoi0.a(cls2))) {
                    bVar = new com.yandex.go.blur.view.internal.rendereffect.a(context, f76Var);
                    v66 bVar2 = r11 != null ? new b(context, r11) : v66Var2;
                    if (bVar2 != null) {
                        ?? r4 = new cy4[i2];
                        r4[c] = bVar;
                        r4[r27] = bVar2;
                        pjdVar = new pjd(scc.g(r4));
                        bVar = pjdVar;
                    }
                    if (q66Var.a) {
                    }
                    return bVar;
                }
                if (jx81.e() || !M0.contains(qoi0.a(cls))) {
                    bVar = !M0.contains(qoi0.a(g76.class)) ? new b(context, g76Var) : qvu0.a;
                } else {
                    bVar = new com.yandex.go.blur.view.internal.rendereffect.b(context, h76Var2);
                    v66 bVar3 = r11 != null ? new b(context, r11) : v66Var2;
                    if (bVar3 != null) {
                        ?? r42 = new cy4[2];
                        r42[c] = bVar;
                        r42[r27] = bVar3;
                        pjdVar = new pjd(scc.g(r42));
                        bVar = pjdVar;
                    }
                }
                if (q66Var.a || str2 == null) {
                    return bVar;
                }
                mc mcVar = x66Var.c.a;
                return new com.yandex.go.blur.performance.a(str2, bVar, (ru.yandex.taxi.perf.frame.a) mcVar.a.get(), (tse) mcVar.b.get());
            }
            if ("".equals(qoi0.a(m76.class).d())) {
                set = Collections.singleton(qoi0.a(g76.class));
            } else if ("".equals(qoi0.a(l76.class).d())) {
                set = EmptySet.a;
            }
        }
        z4 = z7;
        z3 = z8;
        M0 = kotlin.collections.a.M0(set);
        z5 = k76Var instanceof m76;
        if (!z5) {
        }
        context = x66Var.a;
        f76 f76Var2 = new f76(((f76) q66Var.c).a);
        h76 h76Var22 = new h76(h76Var.b, z4, z3, h76Var.d, h76Var.e);
        if (m76Var2 == null) {
        }
        kdc kdcVar3 = g76Var2.a;
        if (!z5) {
        }
        if (r14 != null) {
        }
        kdc kdcVar22 = g76Var2.b;
        if (!z5) {
        }
        g76Var = new g76(kdcVar3, kdcVar22, (Float) (r0 == null ? r0.b : v66Var2));
        if (!jx81.f()) {
        }
        if (jx81.e()) {
        }
        if (!M0.contains(qoi0.a(g76.class))) {
        }
        if (q66Var.a) {
        }
        return bVar;
    }
}
