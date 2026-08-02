package defpackage;

import android.os.Handler;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class tom implements gfu {
    public final /* synthetic */ int a = 1;
    public final sdk b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Serializable g;
    public final Object h;

    public tom(sdk sdkVar, hek hekVar, n7b n7bVar, boolean z, Handler handler, bml bmlVar, j8o j8oVar) {
        sdkVar.getClass();
        hekVar.getClass();
        n7bVar.getClass();
        j8oVar.getClass();
        this.b = sdkVar;
        this.d = hekVar;
        this.e = n7bVar;
        this.c = z;
        this.f = handler;
        this.g = bmlVar;
        this.h = j8oVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        switch (this.a) {
            case 0:
                if (!cls.equals(lpm.class)) {
                    xq0.q("Unknown view model");
                    break;
                } else {
                    break;
                }
            default:
                if (!cls.equals(gdp.class)) {
                    xq0.q("Unknown view model");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    public tom(jek jekVar, sdk sdkVar, rfk rfkVar, g3j g3jVar, String str, boolean z, g0c g0cVar) {
        jekVar.getClass();
        sdkVar.getClass();
        g0cVar.getClass();
        this.d = jekVar;
        this.b = sdkVar;
        this.e = rfkVar;
        this.f = g3jVar;
        this.g = str;
        this.c = z;
        this.h = g0cVar;
    }
}
