package w;

import java.util.ArrayList;
import x.AbstractC0373h;
import x.n;

/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f4658q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f4659r0 = 0;

    public final void R(int i, ArrayList arrayList, n nVar) {
        for (int i2 = 0; i2 < this.f4659r0; i2++) {
            d dVar = this.f4658q0[i2];
            ArrayList arrayList2 = nVar.f4702a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i3 = 0; i3 < this.f4659r0; i3++) {
            AbstractC0373h.b(this.f4658q0[i3], i, arrayList, nVar);
        }
    }

    public void S() {
    }
}
