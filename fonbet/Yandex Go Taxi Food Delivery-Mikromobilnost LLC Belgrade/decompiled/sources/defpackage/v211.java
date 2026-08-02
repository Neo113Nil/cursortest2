package defpackage;

import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.navigation.transport.Navigation;

/* loaded from: classes7.dex */
public final class v211 extends q35 {
    public final f311 c;
    public u211 d;
    public final h0z0 e;
    public Location f;

    public v211(ssr ssrVar, f311 f311Var) {
        super(ssrVar, "transport_guidance_listener");
        this.c = f311Var;
        this.e = new h0z0(0);
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        u211 u211Var = this.d;
        if (u211Var != null) {
            ((Navigation) this.c.a).getGuidance().removeListener(u211Var);
            this.d = null;
        }
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        u211 u211Var = new u211(this);
        this.d = u211Var;
        ((Navigation) this.c.a).getGuidance().addListener(u211Var);
    }
}
