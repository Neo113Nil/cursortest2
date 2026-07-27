package I0;

/* loaded from: classes.dex */
public final class l extends b {
    @Override // I0.c
    public final boolean b() {
        if (!super.b() || !com.bumptech.glide.h.s("MULTI_PROCESS")) {
            return false;
        }
        int i = H0.e.f1207a;
        if (m.f1237c.b()) {
            return n.f1243a.getStatics().isMultiProcessEnabled();
        }
        throw m.a();
    }
}
