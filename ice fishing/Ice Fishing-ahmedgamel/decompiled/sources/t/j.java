package t;

/* loaded from: classes.dex */
public final class j extends AbstractC4984g {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ k f40583A;

    public j(k kVar) {
        this.f40583A = kVar;
    }

    @Override // t.AbstractC4984g
    public final String h() {
        h hVar = (h) this.f40583A.f40584n.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f40579a + "]";
    }
}
