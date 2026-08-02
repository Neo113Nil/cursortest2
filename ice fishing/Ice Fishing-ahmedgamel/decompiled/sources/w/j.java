package w;

import java.util.ArrayList;
import x.AbstractC5169h;
import x.C5176o;

/* loaded from: classes.dex */
public abstract class j extends C5130e {

    /* renamed from: q0, reason: collision with root package name */
    public C5130e[] f41401q0 = new C5130e[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f41402r0 = 0;

    public final void R(int i, ArrayList arrayList, C5176o c5176o) {
        for (int i4 = 0; i4 < this.f41402r0; i4++) {
            C5130e c5130e = this.f41401q0[i4];
            ArrayList arrayList2 = c5176o.f41791a;
            if (!arrayList2.contains(c5130e)) {
                arrayList2.add(c5130e);
            }
        }
        for (int i6 = 0; i6 < this.f41402r0; i6++) {
            AbstractC5169h.b(this.f41401q0[i6], i, arrayList, c5176o);
        }
    }

    public void S() {
    }
}
