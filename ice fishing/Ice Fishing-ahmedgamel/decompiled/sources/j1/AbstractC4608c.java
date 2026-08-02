package j1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import f1.C4515a;
import f1.C4516b;
import f1.C4517c;
import java.util.List;
import k1.C4639a;
import k1.C4641c;
import m1.C4739a;
import m1.C4740b;
import q5.C4876a;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4608c {

    /* renamed from: a, reason: collision with root package name */
    public static final C4639a f38423a = C4639a.d("a", "p", com.anythink.core.common.s.f17036a, "rz", com.anythink.expressad.foundation.d.d.bv, C4876a.PUSH_MINIFIED_BUTTONS_LIST, "so", "eo", "sk", "sa", "rx", "ry");

    /* renamed from: b, reason: collision with root package name */
    public static final C4639a f38424b = C4639a.d("k");

    public static void a(C4516b c4516b, Z0.i iVar) {
        List list = (List) c4516b.f67u;
        if (list.isEmpty()) {
            list.add(new C4739a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(iVar.f3976m)));
        } else if (((C4739a) list.get(0)).f39341b == null) {
            list.set(0, new C4739a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(iVar.f3976m)));
        }
    }

    public static boolean b(C4516b c4516b) {
        if (c4516b != null) {
            return c4516b.c() && ((Float) ((C4739a) ((List) c4516b.f67u).get(0)).f39341b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
    
        if (r1.f39356b == 1.0f) goto L65;
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
    public static f1.d c(C4641c c4641c, Z0.i iVar) {
        C4515a c4515a;
        boolean z6 = c4641c.I() == 3;
        if (z6) {
            c4641c.j();
        }
        I1.d dVar = null;
        f1.e eVar = null;
        C4516b c4516b = null;
        C4515a c4515a2 = null;
        C4516b c4516b2 = null;
        C4516b c4516b3 = null;
        C4516b c4516b4 = null;
        C4516b c4516b5 = null;
        C4516b c4516b6 = null;
        C4515a c4515a3 = null;
        C4516b c4516b7 = null;
        C4516b c4516b8 = null;
        while (c4641c.D()) {
            switch (c4641c.K(f38423a)) {
                case 0:
                    c4641c.j();
                    while (c4641c.D()) {
                        if (c4641c.K(f38424b) != 0) {
                            c4641c.V();
                            c4641c.W();
                        } else {
                            dVar = AbstractC4606a.a(c4641c, iVar);
                        }
                    }
                    c4641c.B();
                    break;
                case 1:
                    eVar = AbstractC4606a.b(c4641c, iVar);
                    break;
                case 2:
                    c4515a2 = new C4515a(p.a(c4641c, iVar, 1.0f, f.f38433z, false), 4);
                    break;
                case 3:
                    c4516b6 = Q3.b.n(c4641c, iVar, false);
                    a(c4516b6, iVar);
                    break;
                case 4:
                    c4516b = Q3.b.n(c4641c, iVar, false);
                    a(c4516b, iVar);
                    break;
                case 5:
                    c4515a3 = Q3.b.p(c4641c, iVar);
                    break;
                case 6:
                    c4516b7 = Q3.b.n(c4641c, iVar, false);
                    break;
                case 7:
                    c4516b8 = Q3.b.n(c4641c, iVar, false);
                    break;
                case 8:
                    c4516b2 = Q3.b.n(c4641c, iVar, false);
                    break;
                case 9:
                    c4516b3 = Q3.b.n(c4641c, iVar, false);
                    break;
                case 10:
                    c4516b4 = Q3.b.n(c4641c, iVar, false);
                    a(c4516b4, iVar);
                    break;
                case 11:
                    c4516b5 = Q3.b.n(c4641c, iVar, false);
                    a(c4516b5, iVar);
                    break;
                default:
                    c4641c.V();
                    c4641c.W();
                    break;
            }
        }
        if (z6) {
            c4641c.B();
        }
        if (dVar == null || (dVar.c() && ((PointF) ((C4739a) dVar.f1308n.get(0)).f39341b).equals(0.0f, 0.0f))) {
            dVar = null;
        }
        f1.e eVar2 = (eVar == null || (!(eVar instanceof C4517c) && eVar.c() && ((PointF) ((C4739a) eVar.b().get(0)).f39341b).equals(0.0f, 0.0f))) ? null : eVar;
        C4516b c4516b9 = b(c4516b) ? null : c4516b;
        if (c4515a2 != null) {
            if (c4515a2.c()) {
                C4740b c4740b = (C4740b) ((C4739a) ((List) c4515a2.f67u).get(0)).f39341b;
                if (c4740b.f39355a == 1.0f) {
                }
            }
            c4515a = c4515a2;
            return new f1.d(dVar, eVar2, c4515a, c4516b9, c4515a3, c4516b7, c4516b8, (c4516b2 != null || (c4516b2.c() && ((Float) ((C4739a) ((List) c4516b2.f67u).get(0)).f39341b).floatValue() == 0.0f)) ? null : c4516b2, (c4516b3 != null || (c4516b3.c() && ((Float) ((C4739a) ((List) c4516b3.f67u).get(0)).f39341b).floatValue() == 0.0f)) ? null : c4516b3, !b(c4516b4) ? null : c4516b4, !b(c4516b5) ? null : c4516b5, !b(c4516b6) ? null : c4516b6);
        }
        c4515a = null;
        return new f1.d(dVar, eVar2, c4515a, c4516b9, c4515a3, c4516b7, c4516b8, (c4516b2 != null || (c4516b2.c() && ((Float) ((C4739a) ((List) c4516b2.f67u).get(0)).f39341b).floatValue() == 0.0f)) ? null : c4516b2, (c4516b3 != null || (c4516b3.c() && ((Float) ((C4739a) ((List) c4516b3.f67u).get(0)).f39341b).floatValue() == 0.0f)) ? null : c4516b3, !b(c4516b4) ? null : c4516b4, !b(c4516b5) ? null : c4516b5, !b(c4516b6) ? null : c4516b6);
    }
}
