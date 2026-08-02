package defpackage;

import com.connectsdk.service.airplay.PListParser;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i9i implements b0j {
    public final boolean a;
    public final String b;
    public final pv9 c;
    public final efs d;

    public i9i(boolean z, String str, pv9 pv9Var, efs efsVar) {
        this.a = z;
        this.b = str;
        this.c = pv9Var;
        this.d = efsVar;
    }

    public final uyo a(e1j e1jVar, Boolean bool) {
        String str;
        q0j method = e1jVar.method();
        String b = e1jVar.b();
        z9h d = e1jVar.d();
        z9h a = e1jVar.a();
        z9h c = e1jVar.c();
        if (this.a) {
            c.i(1, "X-SDK-Force-CVV");
        }
        c.getClass();
        String str2 = this.b;
        if (str2 != null) {
            c.j("X-SDK-Integration-Profile-Id", str2);
        }
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            c.j("X-DEBRANDING", PListParser.TAG_TRUE);
        }
        this.d.getClass();
        ues uesVar = hmd.a;
        int ordinal = (uesVar == ls7.a ? z6w.a : uesVar == ls7.b ? z6w.b : z6w.a).ordinal();
        if (ordinal == 0) {
            str = "light";
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            str = "dark";
        }
        c.j("X-SDK-THEME", str);
        return new uyo(method, b, d, a, c, e1jVar.encoding());
    }

    @Override // defpackage.b0j
    public final mif c(e1j e1jVar) {
        e1jVar.getClass();
        return mif.b(nif.b(nif.a, new wk0(3, this.c)), new h9i(this, e1jVar, 0), new h9i(this, e1jVar, 1), 1);
    }
}
