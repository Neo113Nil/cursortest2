package j5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.o0;
import b0.p0;
import b0.w;
import bc.m;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import m0.l;
import m0.l0;
import m0.r;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f3536a = new l0();

    public static final void a(m5.c cVar, oc.c cVar2, r rVar) {
        Activity activity;
        rVar.Y(1961347382);
        rVar.Y(-1990842533);
        Object obj = (Context) rVar.j(AndroidCompositionLocals_androidKt.f603b);
        rVar.Y(1157296644);
        boolean f10 = rVar.f(obj);
        Object M = rVar.M();
        Object obj2 = l.f4646a;
        if (f10 || M == obj2) {
            while (true) {
                if (!(obj instanceof Activity)) {
                    if (!(obj instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else {
                        obj = ((ContextWrapper) obj).getBaseContext();
                        pc.j.d(obj, "getBaseContext(...)");
                    }
                } else {
                    activity = (Activity) obj;
                    break;
                }
            }
            M = new a(activity);
            rVar.i0(M);
        }
        rVar.q(false);
        a aVar = (a) M;
        rVar.q(false);
        rVar.Y(511388516);
        boolean f11 = rVar.f(cVar) | rVar.f(aVar);
        Object M2 = rVar.M();
        if (f11 || M2 == obj2) {
            rVar.i0(new c(aVar, cVar2));
        }
        rVar.q(false);
        rVar.q(false);
    }

    public static final void b(List list, u0.d dVar, u0.d dVar2, r rVar, int i10) {
        pc.j.e(list, "screenLifecycleContentProviders");
        rVar.Z(1115004036);
        if (list.isEmpty()) {
            rVar.Y(-441237704);
            dVar2.invoke(rVar, 6);
            rVar.q(false);
        } else {
            rVar.Y(-441238046);
            ArrayList f02 = m.f0(list);
            if (f02.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            c((j) f02.remove(0), dVar, dVar2, new p0(8, f02), rVar, 432);
            rVar.q(false);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new e(list, dVar, dVar2, i10, 0);
        }
    }

    public static final void c(j jVar, u0.d dVar, u0.d dVar2, p0 p0Var, r rVar, int i10) {
        rVar.Z(1467702800);
        int i11 = (rVar.f(jVar) ? 4 : 2) | i10;
        if ((i10 & 112) == 0) {
            i11 |= rVar.h(dVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= rVar.h(dVar2) ? 256 : 128;
        }
        int i12 = i11 | (rVar.h(p0Var) ? 2048 : 1024);
        if ((i12 & 5851) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            Object[] objArr = {jVar, dVar, dVar2, p0Var};
            rVar.Y(-568225417);
            boolean z10 = false;
            for (int i13 = 0; i13 < 4; i13++) {
                z10 |= rVar.f(objArr[i13]);
            }
            Object M = rVar.M();
            if (z10 || M == l.f4646a) {
                M = (j) p0Var.invoke();
                rVar.i0(M);
            }
            rVar.q(false);
            j jVar2 = (j) M;
            if (jVar2 != null) {
                rVar.Y(586454009);
                u0.d b2 = u0.e.b(rVar, -201295924, new w(jVar2, dVar, dVar2, p0Var));
                jVar.c(u0.e.b(rVar, 1050024488, new f(0, dVar, b2)), u0.e.b(rVar, -666683194, new o0(b2, 3, (byte) 0)), rVar, ((i12 << 6) & 896) | 54);
                rVar.q(false);
            } else {
                rVar.Y(586454584);
                jVar.c(u0.e.b(rVar, 260867377, new i4.b(1, dVar)), u0.e.b(rVar, -393432241, new o0(dVar2, 4, (byte) 0)), rVar, ((i12 << 6) & 896) | 54);
                rVar.q(false);
            }
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new j0.w(jVar, dVar, dVar2, p0Var, i10);
        }
    }
}
