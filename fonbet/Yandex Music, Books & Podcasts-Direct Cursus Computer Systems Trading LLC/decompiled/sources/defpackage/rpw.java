package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class rpw extends spw {
    public final List a;
    public final long b;

    public rpw(ArrayList arrayList, long j) {
        this.a = arrayList;
        this.b = j;
    }

    @Override // defpackage.spw
    public final long a() {
        return this.b;
    }

    public final String toString() {
        return vz1.q("Shuffle(", ")", this.a != null);
    }
}
