package defpackage;

import android.net.Uri;
import com.yandex.passport.api.g;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class uz1 {
    public final g a;
    public final fos b;
    public final c9k c;
    public final fkn d;

    public uz1(g gVar, jyr jyrVar, fos fosVar, c9k c9kVar) {
        this.a = gVar;
        this.b = fosVar;
        this.c = c9kVar;
        mm6 r = hld.r(new yiq(), dm6.c);
        this.d = zsd.F0(new u21(3, ((iv0) ((av0) jyrVar.getValue())).a.g(), this, jyrVar), r, new hdr(0L, Long.MAX_VALUE), e((yxc) x97.D(kotlin.coroutines.g.a, new tz1(jyrVar, null, 0))));
    }

    public static Object a(uz1 uz1Var, String str, aur aurVar) {
        uz1Var.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((v5w) ((byb) qdcVar.C(I)).c(ern.a(v5w.class))).h() ? uz1Var.c(str, aurVar) : uz1Var.b(str, aurVar);
    }

    public static String d(String str) {
        int W;
        String host = Uri.parse(str).getHost();
        if (host == null || host.length() == 0 || (W = StringsKt.W(host, '.', 0, 6)) <= 0 || W >= host.length() - 1) {
            return null;
        }
        return host.substring(W + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        qz1 qz1Var;
        int i;
        Object k;
        if (cg6Var instanceof qz1) {
            qz1Var = (qz1) cg6Var;
            int i2 = qz1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qz1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = qz1Var.j;
                nm6 nm6Var = nm6.a;
                i = qz1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String d = d(str);
                    if (d == null) {
                        d = "ru";
                    }
                    v02 v02Var = (v02) this.d.a.getValue();
                    Long l = v02Var != null ? new Long(v02Var.a) : null;
                    if (l != null) {
                        g3 g3Var = new g3(12, d, l, str);
                        qz1Var.l = 1;
                        k = this.a.k(g3Var, qz1Var);
                        if (k == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                k = ((z7o) obj).a;
                r7o r7oVar = z7o.b;
                if (k instanceof t7o) {
                    return k;
                }
                return null;
            }
        }
        qz1Var = new qz1(this, cg6Var);
        Object obj2 = qz1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = qz1Var.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (k instanceof t7o) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        rz1 rz1Var;
        int i;
        if (cg6Var instanceof rz1) {
            rz1Var = (rz1) cg6Var;
            int i2 = rz1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rz1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = rz1Var.j;
                nm6 nm6Var = nm6.a;
                i = rz1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String d = d(str);
                    if (d == null) {
                        d = "ru";
                    }
                    v02 v02Var = (v02) this.d.a.getValue();
                    if ((v02Var != null ? new Long(v02Var.a) : null) != null) {
                        rz1Var.l = 1;
                        Object h = this.c.h(str, d, rz1Var);
                        return h == nm6Var ? nm6Var : h;
                    }
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    Object obj2 = ((z7o) obj).a;
                    r7o r7oVar = z7o.b;
                    if (!(obj2 instanceof t7o)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        rz1Var = new rz1(this, cg6Var);
        Object obj3 = rz1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = rz1Var.l;
        if (i != 0) {
        }
        return null;
    }

    public final v02 e(yxc yxcVar) {
        mns mnsVar = (mns) x97.D(kotlin.coroutines.g.a, new hl(this, null, 15));
        if (yxcVar != null) {
            drt drtVar = yxcVar.a;
            if (mnsVar != null && drtVar.d) {
                return new v02(Long.parseLong(drtVar.a), drtVar.b, yxcVar.h, yxcVar.i, mnsVar.a);
            }
        }
        return null;
    }
}
