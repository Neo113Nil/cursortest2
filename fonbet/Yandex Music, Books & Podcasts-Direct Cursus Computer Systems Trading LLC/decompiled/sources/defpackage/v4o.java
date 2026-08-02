package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class v4o implements p3d {
    public static final v4o a;

    @NotNull
    private static final mhp descriptor;

    static {
        v4o v4oVar = new v4o();
        a = v4oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestDailyWidgetResponseBody.MetricContext", v4oVar, 2);
        j5mVar.k(PListParser.TAG_KEY, true);
        j5mVar.k(Constants.KEY_VALUE, true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            str = (String) c.n(mhpVar, 0, tkrVar, null);
            str2 = (String) c.n(mhpVar, 1, tkrVar, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = (String) c.n(mhpVar, 1, tkr.a, str4);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new x4o(i, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x4o x4oVar = (x4o) obj;
        l6bVar.getClass();
        x4oVar.getClass();
        String str = x4oVar.b;
        String str2 = x4oVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 0, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 1, tkr.a, str);
        }
        c.b(mhpVar);
    }
}
