package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class izd extends gs2 {
    public final List d;
    public final long e;

    public izd(List list, long j) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // defpackage.eih
    public final long b() {
        a();
        return this.e + ((vzd) this.d.get((int) this.c)).e;
    }

    @Override // defpackage.eih
    public final long c() {
        a();
        vzd vzdVar = (vzd) this.d.get((int) this.c);
        return this.e + vzdVar.e + vzdVar.c;
    }
}
