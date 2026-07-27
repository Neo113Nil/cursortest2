package t;

/* loaded from: classes.dex */
public final class j extends AbstractC4985g {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ k f40527A;

    public j(k kVar) {
        this.f40527A = kVar;
    }

    @Override // t.AbstractC4985g
    public final String h() {
        h hVar = (h) this.f40527A.f40528n.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f40523a + "]";
    }
}
