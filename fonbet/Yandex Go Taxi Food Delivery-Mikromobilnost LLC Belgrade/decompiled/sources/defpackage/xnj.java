package defpackage;

import java.util.Map;

/* loaded from: classes6.dex */
public final class xnj implements v1g0 {
    public final h3y a;
    public final h3y b;

    public xnj(h3y h3yVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = h3yVar2;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        if (!jl40.l((String) map.get("local_channel_id"), "fake_disabled_channel")) {
            return false;
        }
        ((ng60) this.a.get()).b(r85.a((wnt) this.b.get(), map).a());
        jst.e.getClass();
        return true;
    }
}
