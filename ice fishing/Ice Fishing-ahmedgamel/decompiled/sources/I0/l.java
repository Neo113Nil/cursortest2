package I0;

/* loaded from: classes.dex */
public final class l extends b {
    @Override // I0.c
    public final boolean b() {
        if (!super.b() || !com.bumptech.glide.f.m("MULTI_PROCESS")) {
            return false;
        }
        int i = H0.e.f1187a;
        if (m.f1295c.b()) {
            return n.f1301a.getStatics().isMultiProcessEnabled();
        }
        throw m.a();
    }
}
