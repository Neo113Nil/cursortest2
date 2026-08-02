package defpackage;

import com.ybsdk.core.design.animation.ticker.c;
import com.ybsdk.core.design.animation.ticker.d;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes2.dex */
public final class u0z0 {
    public final d a;
    public final ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public Set d = EmptySet.a;

    public u0z0(d dVar) {
        this.a = dVar;
    }

    public final float a() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.a();
            f += cVar.l;
        }
        return f;
    }

    public final void b(float f) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            if (f == 1.0f) {
                cVar.c = cVar.d;
                cVar.o = 0.0f;
                cVar.p = 0.0f;
            }
            float f2 = cVar.b.c;
            float abs = ((Math.abs(cVar.g - cVar.f) * f2) * f) / f2;
            int i2 = (int) abs;
            float f3 = (1.0f - f) * cVar.p;
            int i3 = cVar.q;
            cVar.i = ((abs - i2) * f2 * i3) + f3;
            cVar.h = (i2 * i3) + cVar.f;
            cVar.j = f2;
            float f4 = cVar.k;
            cVar.l = g8e.b(cVar.m, f4, f, f4);
        }
    }
}
