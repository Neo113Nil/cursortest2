package defpackage;

/* loaded from: classes6.dex */
public enum wqi implements jyd {
    TotalDuration(10000),
    InitialRendering(5000),
    /* JADX INFO: Fake field, exist only in values array */
    DataReceiving(10000),
    /* JADX INFO: Fake field, exist only in values array */
    ViewModelConstruction(500),
    /* JADX INFO: Fake field, exist only in values array */
    FinalRendering(5000);

    public final long a;

    wqi(long j) {
        this.a = j;
    }

    @Override // defpackage.jyd
    public final long G() {
        return this.a;
    }

    @Override // defpackage.jyd
    public final String z() {
        return f1d.g("Content.my_music.", name());
    }
}
