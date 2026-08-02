package defpackage;

/* loaded from: classes5.dex */
public final class eoj extends o3o {
    public final twh b;
    public final long c;

    public eoj(long j, twh twhVar) {
        this.b = twhVar;
        this.c = j;
    }

    @Override // defpackage.o3o
    public final long g() {
        return this.c;
    }

    @Override // defpackage.o3o
    public final twh o() {
        return this.b;
    }

    @Override // defpackage.o3o
    public final ij3 z() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
