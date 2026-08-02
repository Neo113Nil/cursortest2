package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wfv extends tfv {
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final xdr n;
    public final fkn o;
    public final j0q p;

    public wfv(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4) {
        this.k = jyrVar;
        this.l = jyrVar3;
        this.m = jyrVar4;
        xdr a = ydr.a(gfv.a);
        this.n = a;
        cq4 F = ot0.F(this);
        this.o = zsd.F0(new l8v(a, this, 1), F, lbq.a, M(this, (kfv) a.getValue()));
        this.p = new j0q();
        if (((z66) jyrVar2.getValue()).g()) {
            return;
        }
        G();
    }

    public static final qfv M(wfv wfvVar, kfv kfvVar) {
        if (Intrinsics.d(kfvVar, gfv.a) || Intrinsics.d(kfvVar, jfv.a)) {
            return nfv.a;
        }
        if (Intrinsics.d(kfvVar, ifv.a)) {
            return ofv.a;
        }
        if (!(kfvVar instanceof hfv)) {
            b6e.s();
            return null;
        }
        hfv hfvVar = (hfv) kfvVar;
        String str = hfvVar.b;
        String str2 = str == null ? hfvVar.a : str;
        boolean z = str != null;
        ((oev) wfvVar.m.getValue()).getClass();
        return new pfv(str2, swf.H().a, z);
    }

    @Override // defpackage.tfv
    public final void G() {
        x97.y(ot0.F(this), null, null, new ufv(this, null, 0), 3);
    }

    @Override // defpackage.tfv
    public final pjc H() {
        return this.p;
    }

    @Override // defpackage.tfv
    public final vdr J() {
        return this.o;
    }

    @Override // defpackage.tfv
    public final boolean K(Context context, Uri uri) {
        String authority;
        context.getClass();
        uri.getClass();
        boolean d = Intrinsics.d(uri.getScheme(), "ym-webview");
        jyr jyrVar = this.l;
        if (d && (authority = uri.getAuthority()) != null) {
            int hashCode = authority.hashCode();
            if (hashCode != -1385596165) {
                if (hashCode == 94756344 && authority.equals("close")) {
                    G();
                    return true;
                }
            } else if (authority.equals("external_url")) {
                String queryParameter = uri.getQueryParameter("url");
                if (queryParameter != null) {
                    String decode = Uri.decode(queryParameter);
                    jgv jgvVar = (jgv) jyrVar.getValue();
                    decode.getClass();
                    jgvVar.getClass();
                    w1g.y(context, decode, true);
                    G();
                }
                return true;
            }
        }
        jgv jgvVar2 = (jgv) jyrVar.getValue();
        String uri2 = uri.toString();
        uri2.getClass();
        jgvVar2.getClass();
        context.getClass();
        uri2.getClass();
        Iterator it = fqt.a.iterator();
        while (it.hasNext()) {
            eqt eqtVar = (eqt) it.next();
            eqtVar.getClass();
            if (eqtVar.b(uri2)) {
                w1g.y(context, uri2, true);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tfv
    public final void L(String str, boolean z) {
        Object value;
        Object value2;
        str.getClass();
        xdr xdrVar = this.n;
        if ((xdrVar.getValue() instanceof gfv) || (xdrVar.getValue() instanceof hfv)) {
            Continuation continuation = null;
            if (!z) {
                do {
                    value2 = xdrVar.getValue();
                } while (!xdrVar.k(value2, new hfv(str, null)));
            } else {
                rar y = x97.y(ot0.F(this), null, pm6.b, new y6v(this, str, continuation, 3), 1);
                x97.y(ot0.F(this), null, null, new ufv(this, continuation, 1), 3);
                do {
                    value = xdrVar.getValue();
                } while (!xdrVar.k(value, jfv.a));
                y.start();
            }
        }
    }
}
