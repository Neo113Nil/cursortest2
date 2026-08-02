package defpackage;

/* loaded from: classes6.dex */
public enum hem implements jyd {
    InitialRendering(1000),
    /* JADX INFO: Fake field, exist only in values array */
    DataReceiving(30000),
    /* JADX INFO: Fake field, exist only in values array */
    ViewModelConstruction(500),
    /* JADX INFO: Fake field, exist only in values array */
    FinalRendering(500),
    TotalDuration(30000);

    public final long a;

    hem(long j) {
        this.a = j;
    }

    @Override // defpackage.jyd
    public final long G() {
        return this.a;
    }

    @Override // defpackage.jyd
    public final String z() {
        return f1d.g("Content.Podcasts.", name());
    }
}
