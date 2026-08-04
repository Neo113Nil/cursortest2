package com.gamericefishpro.space.r2;

import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public final e0 a;
    public final com.gamericefishpro.space.f1.k b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public f0(e0 e0Var, com.gamericefishpro.space.f1.k kVar, long j) {
        this.a = e0Var;
        this.b = kVar;
        this.c = j;
        ArrayList arrayList = (ArrayList) kVar.e;
        float fC = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((m) arrayList.get(0)).a.d.c(0);
        if (!arrayList.isEmpty()) {
            m mVar = (m) CollectionsKt.B(arrayList);
            com.gamericefishpro.space.s2.i iVar = mVar.a.d;
            fC = iVar.c(iVar.f - 1) + mVar.f;
        }
        this.e = fC;
        this.f = (ArrayList) kVar.d;
    }

    public final int a(int i) {
        int iC;
        com.gamericefishpro.space.f1.k kVar = this.b;
        ArrayList arrayList = (ArrayList) kVar.e;
        if (i >= ((e) ((com.gamericefishpro.space.b1.d) kVar.c).e).e.length()) {
            iC = com.gamericefishpro.space.ph.x.e(arrayList);
        } else {
            iC = i < 0 ? 0 : a0.c(i, arrayList);
        }
        m mVar = (m) arrayList.get(iC);
        return mVar.a.d.e.getLineForOffset(mVar.a(i)) + mVar.d;
    }

    public final int b(float f) {
        byte b;
        ArrayList arrayList = (ArrayList) this.b.e;
        int iE = 0;
        if (f > 0.0f) {
            if (f < ((m) CollectionsKt.B(arrayList)).g) {
                int size = arrayList.size() - 1;
                int i = 0;
                while (true) {
                    if (i > size) {
                        iE = -(i + 1);
                        break;
                    }
                    int i2 = (i + size) >>> 1;
                    m mVar = (m) arrayList.get(i2);
                    if (mVar.f > f) {
                        b = 1;
                    } else {
                        b = mVar.g <= f ? (byte) -1 : (byte) 0;
                    }
                    if (b >= 0) {
                        if (b <= 0) {
                            iE = i2;
                            break;
                        }
                        size = i2 - 1;
                    } else {
                        i = i2 + 1;
                    }
                }
            } else {
                iE = com.gamericefishpro.space.ph.x.e(arrayList);
            }
        }
        m mVar2 = (m) arrayList.get(iE);
        int i3 = mVar2.c;
        int i4 = mVar2.d;
        if (i3 - mVar2.b == 0) {
            return i4;
        }
        a aVar = mVar2.a;
        float f2 = f - mVar2.f;
        com.gamericefishpro.space.s2.i iVar = aVar.d;
        return iVar.e.getLineForVertical(((int) f2) - iVar.g) + i4;
    }

    public final int c(int i) {
        com.gamericefishpro.space.f1.k kVar = this.b;
        kVar.g(i);
        ArrayList arrayList = (ArrayList) kVar.e;
        m mVar = (m) arrayList.get(a0.d(i, arrayList));
        a aVar = mVar.a;
        return aVar.d.e.getLineStart(i - mVar.d) + mVar.b;
    }

    public final float d(int i) {
        com.gamericefishpro.space.f1.k kVar = this.b;
        kVar.g(i);
        ArrayList arrayList = (ArrayList) kVar.e;
        m mVar = (m) arrayList.get(a0.d(i, arrayList));
        a aVar = mVar.a;
        return aVar.d.f(i - mVar.d) + mVar.f;
    }

    public final com.gamericefishpro.space.b3.j e(int i) {
        com.gamericefishpro.space.f1.k kVar = this.b;
        ArrayList arrayList = (ArrayList) kVar.e;
        com.gamericefishpro.space.b1.d dVar = (com.gamericefishpro.space.b1.d) kVar.c;
        boolean z = false;
        if (i >= 0 && i <= ((e) dVar.e).e.length()) {
            z = true;
        }
        if (!z) {
            StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "offset(", ") is out of bounds [0, ");
            sbK.append(((e) dVar.e).e.length());
            sbK.append(']');
            com.gamericefishpro.space.w2.a.a(sbK.toString());
        }
        m mVar = (m) arrayList.get(i == ((e) ((com.gamericefishpro.space.b1.d) kVar.c).e).e.length() ? com.gamericefishpro.space.ph.x.e(arrayList) : a0.c(i, arrayList));
        a aVar = mVar.a;
        int iA = mVar.a(i);
        com.gamericefishpro.space.s2.i iVar = aVar.d;
        return iVar.e.getParagraphDirection(iVar.e.getLineForOffset(iA)) == 1 ? com.gamericefishpro.space.b3.j.d : com.gamericefishpro.space.b3.j.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.a(this.a, f0Var.a) && this.b.equals(f0Var.b) && com.gamericefishpro.space.c3.k.a(this.c, f0Var.c) && this.d == f0Var.d && this.e == f0Var.e && Intrinsics.a(this.f, f0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + y0.a(this.e, y0.a(this.d, y0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) com.gamericefishpro.space.c3.k.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
