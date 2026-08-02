package defpackage;

import android.content.Context;
import java.io.InterruptedIOException;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class t20 extends pu2 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(int i) {
        super(true, f8g.A(), true);
        this.f = i;
        switch (i) {
            case 1:
                super(true, f8g.A(), false);
                this.g = l18.b.b(hag.I(t35.class), true);
                this.h = btf.b(new r25(2, this));
                break;
            default:
                bdt I = hag.I(l0t.class);
                l18 l18Var = l18.b;
                this.g = l18Var.b(I, true);
                this.h = l18Var.b(hag.I(yr.class), true);
                break;
        }
    }

    public static mqs d(oq oqVar, String str) {
        Object obj;
        Iterator it = oqVar.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            mqs mqsVar = (mqs) obj;
            if (Intrinsics.d(str, mqsVar.a) || Intrinsics.d(str, mqsVar.b)) {
                break;
            }
        }
        return (mqs) obj;
    }

    @Override // defpackage.pu2
    public final kqt b(Context context, ypt yptVar) {
        oq oqVar;
        String str;
        kqt kqtVar;
        switch (this.f) {
            case 0:
                s20 s20Var = (s20) yptVar;
                s20Var.getClass();
                String a = s20Var.a(1);
                if (a != null) {
                    yr yrVar = (yr) ((jyr) this.h).getValue();
                    yrVar.getClass();
                    mqs mqsVar = null;
                    rj6 rj6Var = (rj6) x97.D(g.a, new l5(yrVar, a, null, 9));
                    if (rj6Var instanceof qj6) {
                        oqVar = (oq) ((qj6) rj6Var).a;
                    } else if (rj6Var instanceof pj6) {
                        pj6 pj6Var = (pj6) rj6Var;
                        if (!(pj6Var instanceof nj6)) {
                            throw pj6Var.a();
                        }
                        oqVar = null;
                    } else {
                        b6e.s();
                    }
                    if (oqVar == null) {
                        return new kqt(s20Var, 5);
                    }
                    String a2 = s20Var.a(3);
                    if (a2 == null || StringsKt.U(a2)) {
                        return new kqt((ypt) s20Var, (Object) new u20(oqVar, null));
                    }
                    mqs d = d(oqVar, a2);
                    if (d != null) {
                        return new kqt((ypt) s20Var, (Object) new u20(oqVar, d));
                    }
                    l0t l0tVar = (l0t) ((jyr) this.g).getValue();
                    psd psdVar = new psd(2);
                    psdVar.b = "AlbumValidator";
                    rj6 a3 = l0tVar.a(a2, psdVar);
                    if (a3 instanceof qj6) {
                        mqsVar = (mqs) ((qj6) a3).a;
                    } else if (a3 instanceof pj6) {
                        pj6 pj6Var2 = (pj6) a3;
                        if (!(pj6Var2 instanceof nj6)) {
                            throw pj6Var2.a();
                        }
                    } else {
                        b6e.s();
                    }
                    if (mqsVar == null || (str = mqsVar.b) == null) {
                        return new kqt(s20Var, 5);
                    }
                    mqs d2 = d(oqVar, str);
                    if (d2 != null) {
                        return new kqt((ypt) s20Var, (Object) new u20(oqVar, d2));
                    }
                    xq0.x(hrg.s("Track(id=", a2, ") not found in album(id=", a, ")"));
                } else {
                    xq0.x("No albumId!");
                }
                return null;
            case 1:
                u15 u15Var = (u15) yptVar;
                u15Var.getClass();
                s15 s15Var = (s15) u15Var.g.getValue();
                if (s15Var == null) {
                    return new kqt(u15Var, 5);
                }
                switch (s15Var.ordinal()) {
                    case 0:
                        return new kqt(u15Var, c25.a);
                    case 1:
                        return new kqt(u15Var, b25.a);
                    case 2:
                        return new kqt(u15Var, v15.a);
                    case 3:
                        return new kqt(u15Var, f25.a);
                    case 4:
                        return new kqt(u15Var, w15.a);
                    case 5:
                        return new kqt(u15Var, d25.a);
                    case 6:
                        return new kqt(u15Var, x15.a);
                    case 7:
                        return new kqt(u15Var, a25.a);
                    case 8:
                    case 10:
                        return new kqt(u15Var, y15.a);
                    case 9:
                        mn7 mn7Var = dm6.b;
                        ja4 ja4Var = new ja4(this, null, 7);
                        mn7Var.getClass();
                        try {
                            cvl cvlVar = (cvl) x97.D(mn7Var, ja4Var);
                            return cvlVar == null ? new kqt(u15Var, 5) : new kqt(u15Var, new z15(cvlVar));
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    case 11:
                        return new kqt(u15Var, e25.a);
                    default:
                        b6e.s();
                        return null;
                }
            default:
                mim mimVar = (mim) yptVar;
                if (((yhb) this.g) == null) {
                    this.g = (yhb) sk3.I(yhb.class);
                }
                if (((xhb) this.h) == null) {
                    this.h = (xhb) sk3.I(xhb.class);
                }
                String a4 = mimVar.a(1);
                if (a4 != null) {
                    xhb xhbVar = (xhb) this.h;
                    xhbVar.getClass();
                    rj6 rj6Var2 = (rj6) x97.D(g.a, new f98(xhbVar, a4, (Continuation) null, 23));
                    if (rj6Var2 instanceof qj6) {
                        qxm qxmVar = (qxm) ((qj6) rj6Var2).a;
                        ((yhb) this.g).a.put(qxmVar.c, qxmVar);
                        return new kqt(mimVar, qxmVar);
                    }
                    if (!(rj6Var2 instanceof nj6)) {
                        throw ((pj6) rj6Var2).a();
                    }
                    kqtVar = new kqt(mimVar, 5);
                } else {
                    kqtVar = new kqt(mimVar, 5);
                }
                return kqtVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(boolean z, boolean z2, boolean z3) {
        super(z, z2, z3);
        this.f = 2;
    }
}
