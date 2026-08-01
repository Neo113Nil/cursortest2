package t;

/* loaded from: classes.dex */
public final class j extends AbstractC4985g {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ k f40530A;

    public j(k kVar) {
        this.f40530A = kVar;
    }

    @Override // t.AbstractC4985g
    public final String h() {
        h hVar = (h) this.f40530A.f40531n.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f40526a + "]";
    }
}
