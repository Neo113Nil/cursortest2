package h1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import d1.C4443a;
import d1.C4444b;
import d1.C4445c;
import i1.C4580b;
import java.util.List;
import k1.C4629a;
import k1.C4630b;
import q5.C4927a;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4560c {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.l f37954a = S0.l.F("a", "p", com.anythink.core.common.s.f16249a, "rz", com.anythink.expressad.foundation.d.d.bv, C4927a.PUSH_MINIFIED_BUTTONS_LIST, "so", "eo", "sk", "sa", "rx", "ry");

    /* renamed from: b, reason: collision with root package name */
    public static final S0.l f37955b = S0.l.F("k");

    public static void a(C4444b c4444b, X0.i iVar) {
        List list = (List) c4444b.f1720u;
        if (list.isEmpty()) {
            list.add(new C4629a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(iVar.f3624m)));
        } else if (((C4629a) list.get(0)).f38552b == null) {
            list.set(0, new C4629a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(iVar.f3624m)));
        }
    }

    public static boolean b(C4444b c4444b) {
        if (c4444b != null) {
            return c4444b.c() && ((Float) ((C4629a) ((List) c4444b.f1720u).get(0)).f38552b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
    
        if (r1.f38567b == 1.0f) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d1.e c(C4580b c4580b, X0.i iVar) {
        C4443a c4443a;
        boolean z3 = c4580b.I() == 3;
        if (z3) {
            c4580b.j();
        }
        C4445c c4445c = null;
        d1.f fVar = null;
        C4444b c4444b = null;
        C4443a c4443a2 = null;
        C4444b c4444b2 = null;
        C4444b c4444b3 = null;
        C4444b c4444b4 = null;
        C4444b c4444b5 = null;
        C4444b c4444b6 = null;
        C4443a c4443a3 = null;
        C4444b c4444b7 = null;
        C4444b c4444b8 = null;
        while (c4580b.D()) {
            switch (c4580b.K(f37954a)) {
                case 0:
                    c4580b.j();
                    while (c4580b.D()) {
                        if (c4580b.K(f37955b) != 0) {
                            c4580b.V();
                            c4580b.W();
                        } else {
                            c4445c = AbstractC4558a.a(c4580b, iVar);
                        }
                    }
                    c4580b.B();
                    break;
                case 1:
                    fVar = AbstractC4558a.b(c4580b, iVar);
                    break;
                case 2:
                    c4443a2 = new C4443a(p.a(c4580b, iVar, 1.0f, f.f37964z, false), 4);
                    break;
                case 3:
                    c4444b6 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    a(c4444b6, iVar);
                    break;
                case 4:
                    c4444b = com.bumptech.glide.f.q(c4580b, iVar, false);
                    a(c4444b, iVar);
                    break;
                case 5:
                    c4443a3 = com.bumptech.glide.f.s(c4580b, iVar);
                    break;
                case 6:
                    c4444b7 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    break;
                case 7:
                    c4444b8 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    break;
                case 8:
                    c4444b2 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    break;
                case 9:
                    c4444b3 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    break;
                case 10:
                    c4444b4 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    a(c4444b4, iVar);
                    break;
                case 11:
                    c4444b5 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    a(c4444b5, iVar);
                    break;
                default:
                    c4580b.V();
                    c4580b.W();
                    break;
            }
        }
        if (z3) {
            c4580b.B();
        }
        if (c4445c == null || (c4445c.c() && ((PointF) ((C4629a) c4445c.f37022n.get(0)).f38552b).equals(0.0f, 0.0f))) {
            c4445c = null;
        }
        d1.f fVar2 = (fVar == null || (!(fVar instanceof d1.d) && fVar.c() && ((PointF) ((C4629a) fVar.b().get(0)).f38552b).equals(0.0f, 0.0f))) ? null : fVar;
        C4444b c4444b9 = b(c4444b) ? null : c4444b;
        if (c4443a2 != null) {
            if (c4443a2.c()) {
                C4630b c4630b = (C4630b) ((C4629a) ((List) c4443a2.f1720u).get(0)).f38552b;
                if (c4630b.f38566a == 1.0f) {
                }
            }
            c4443a = c4443a2;
            return new d1.e(c4445c, fVar2, c4443a, c4444b9, c4443a3, c4444b7, c4444b8, (c4444b2 != null || (c4444b2.c() && ((Float) ((C4629a) ((List) c4444b2.f1720u).get(0)).f38552b).floatValue() == 0.0f)) ? null : c4444b2, (c4444b3 != null || (c4444b3.c() && ((Float) ((C4629a) ((List) c4444b3.f1720u).get(0)).f38552b).floatValue() == 0.0f)) ? null : c4444b3, !b(c4444b4) ? null : c4444b4, !b(c4444b5) ? null : c4444b5, !b(c4444b6) ? null : c4444b6);
        }
        c4443a = null;
        return new d1.e(c4445c, fVar2, c4443a, c4444b9, c4443a3, c4444b7, c4444b8, (c4444b2 != null || (c4444b2.c() && ((Float) ((C4629a) ((List) c4444b2.f1720u).get(0)).f38552b).floatValue() == 0.0f)) ? null : c4444b2, (c4444b3 != null || (c4444b3.c() && ((Float) ((C4629a) ((List) c4444b3.f1720u).get(0)).f38552b).floatValue() == 0.0f)) ? null : c4444b3, !b(c4444b4) ? null : c4444b4, !b(c4444b5) ? null : c4444b5, !b(c4444b6) ? null : c4444b6);
    }
}
