package w;

import java.util.ArrayList;
import x.AbstractC5170h;
import x.C5177o;

/* loaded from: classes.dex */
public abstract class i extends C5139d {

    /* renamed from: q0, reason: collision with root package name */
    public C5139d[] f41622q0 = new C5139d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f41623r0 = 0;

    public final void R(int i, ArrayList arrayList, C5177o c5177o) {
        for (int i6 = 0; i6 < this.f41623r0; i6++) {
            C5139d c5139d = this.f41622q0[i6];
            ArrayList arrayList2 = c5177o.f41736a;
            if (!arrayList2.contains(c5139d)) {
                arrayList2.add(c5139d);
            }
        }
        for (int i9 = 0; i9 < this.f41623r0; i9++) {
            AbstractC5170h.b(this.f41622q0[i9], i, arrayList, c5177o);
        }
    }

    public void S() {
    }
}
