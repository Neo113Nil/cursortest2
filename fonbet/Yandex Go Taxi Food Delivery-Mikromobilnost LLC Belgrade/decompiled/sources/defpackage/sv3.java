package defpackage;

import androidx.lifecycle.Lifecycle;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;

/* loaded from: classes3.dex */
public final class sv3 implements iw3 {
    public final /* synthetic */ b3z a;
    public final /* synthetic */ j3h b;
    public final /* synthetic */ np41 c;
    public final /* synthetic */ tfl0 d;
    public final /* synthetic */ wig e;
    public final /* synthetic */ xgk f;

    public sv3(b3z b3zVar, j3h j3hVar, np41 np41Var, tfl0 tfl0Var, wig wigVar, xgk xgkVar) {
        this.a = b3zVar;
        this.b = j3hVar;
        this.c = np41Var;
        this.d = tfl0Var;
        this.e = wigVar;
        this.f = xgkVar;
    }

    public final void a(Lifecycle lifecycle) {
        pv3 pv3Var = new pv3(this.a, 0);
        xgk xgkVar = this.f;
        xgkVar.a.add(pv3Var);
        lifecycle.a(new wgk(0, xgkVar, pv3Var));
    }

    public final void b(tls tlsVar) {
        this.a.a(new qv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, tlsVar, 0));
    }

    public final z2z c(String str) {
        return this.a.c(str);
    }
}
