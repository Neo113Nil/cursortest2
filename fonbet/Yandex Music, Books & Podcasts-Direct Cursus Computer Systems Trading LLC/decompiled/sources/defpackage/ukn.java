package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ukn {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public Object i;

    public ukn(bsf bsfVar) {
        this.g = bsfVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new osf(0, 0));
        this.a = arrayList;
        this.e = -1;
        this.h = new ArrayList();
        this.i = c5b.a;
    }

    public static ukn a(ukn uknVar, int i, evj evjVar, d0o d0oVar, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = uknVar.b;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            evjVar = (evj) uknVar.h;
        }
        evj evjVar2 = evjVar;
        if ((i5 & 4) != 0) {
            d0oVar = (d0o) uknVar.i;
        }
        d0o d0oVar2 = d0oVar;
        if ((i5 & 8) != 0) {
            i2 = uknVar.c;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = uknVar.d;
        }
        int i8 = i3;
        int i9 = (i5 & 32) != 0 ? uknVar.e : i4;
        d0oVar2.getClass();
        return new ukn((mkn) uknVar.g, uknVar.a, i6, evjVar2, d0oVar2, i7, i8, i9);
    }

    public int b() {
        return ((int) Math.sqrt((e() * 1.0d) / this.f)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r9 < r8) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public et7 c(int i) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.h;
        boolean z = true;
        if (!((bsf) this.g).m) {
            int i5 = this.f;
            int i6 = i * i5;
            int e = e() - i6;
            if (i5 > e) {
                i5 = e;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == this.i.size()) {
                arrayList = this.i;
            } else {
                ArrayList arrayList3 = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList3.add(new ypd(fgq.o(1)));
                }
                this.i = arrayList3;
                arrayList = arrayList3;
            }
            return new et7(arrayList, i6);
        }
        int b = i / b();
        ArrayList arrayList4 = this.a;
        int min = Math.min(b, arrayList4.size() - 1);
        int b2 = b() * min;
        int i8 = ((osf) arrayList4.get(min)).a;
        int i9 = ((osf) arrayList4.get(min)).b;
        int i10 = this.b;
        if (b2 <= i10 && i10 <= i) {
            i8 = this.c;
            i9 = this.d;
            b2 = i10;
        } else if (min == this.e && (i2 = i - b2) < arrayList2.size()) {
            i8 = ((Number) arrayList2.get(i2)).intValue();
            b2 = i;
            i9 = 0;
        }
        if (b2 % b() == 0) {
            int b3 = b();
            int i11 = i - b2;
            if (2 <= i11) {
            }
        }
        z = false;
        if (z) {
            this.e = min;
            arrayList2.clear();
        }
        if (b2 > i) {
            vme.c("currentLine (" + b2 + ") > lineIndex (" + i + ')');
        }
        while (b2 < i && i8 < e()) {
            if (z) {
                arrayList2.add(Integer.valueOf(i8));
            }
            int i12 = 0;
            while (i12 < this.f && i8 < e()) {
                if (i9 == 0) {
                    i4 = i9;
                    i9 = g(i8, this.f - i12);
                } else {
                    i4 = 0;
                }
                i12 += i9;
                if (i12 > this.f) {
                    break;
                }
                i8++;
                i9 = i4;
            }
            b2++;
            if (b2 % b() == 0 && i8 < e()) {
                if (arrayList4.size() != b2 / b()) {
                    vme.c("invalid starting point");
                }
                arrayList4.add(new osf(i8, i9));
            }
        }
        this.b = i;
        this.c = i8;
        this.d = i9;
        ArrayList arrayList5 = new ArrayList();
        int i13 = 0;
        int i14 = i8;
        while (i13 < this.f && i14 < e()) {
            if (i9 == 0) {
                int i15 = i9;
                i9 = g(i14, this.f - i13);
                i3 = i15;
            } else {
                i3 = 0;
            }
            i13 += i9;
            if (i13 > this.f) {
                break;
            }
            i14++;
            arrayList5.add(new ypd(fgq.o(i9)));
            i9 = i3;
        }
        return new et7(arrayList5, i8);
    }

    public int d(int i) {
        int i2;
        int i3;
        if (e() <= 0) {
            return 0;
        }
        if (i >= e()) {
            vme.a("ItemIndex > total count");
        }
        if (!((bsf) this.g).m) {
            return i / this.f;
        }
        re0 re0Var = new re0(i, 4);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        u75.l(arrayList.size(), size);
        int i4 = size - 1;
        int i5 = 0;
        while (true) {
            if (i5 > i4) {
                i2 = -(i5 + 1);
                break;
            }
            i2 = (i5 + i4) >>> 1;
            int intValue = ((Number) re0Var.invoke(arrayList.get(i2))).intValue();
            if (intValue >= 0) {
                if (intValue <= 0) {
                    break;
                }
                i4 = i2 - 1;
            } else {
                i5 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int b = b() * i2;
        int i6 = ((osf) arrayList.get(i2)).a;
        if (i6 > i) {
            vme.a("currentItemIndex > itemIndex");
        }
        int i7 = 0;
        while (true) {
            i3 = this.f;
            if (i6 >= i) {
                break;
            }
            int i8 = i6 + 1;
            int g = g(i6, i3 - i7);
            i7 += g;
            int i9 = this.f;
            if (i7 >= i9) {
                if (i7 == i9) {
                    b++;
                    i7 = 0;
                } else {
                    b++;
                    i7 = g;
                }
            }
            if (b % b() == 0 && b / b() >= arrayList.size()) {
                arrayList.add(new osf(i8 - (i7 > 0 ? 1 : 0), 0));
            }
            i6 = i8;
        }
        return g(i, i3 - i7) + i7 > this.f ? b + 1 : b;
    }

    public int e() {
        return ((bsf) this.g).l.b;
    }

    public l3o f(d0o d0oVar) {
        evj evjVar = (evj) this.h;
        d0oVar.getClass();
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i >= arrayList.size()) {
            xq0.q("Check failed.");
            return null;
        }
        this.f++;
        if (evjVar != null) {
            job jobVar = (job) evjVar.b;
            u7e u7eVar = d0oVar.a;
            jobVar.getClass();
            u7eVar.getClass();
            u7e u7eVar2 = jobVar.b.h;
            if (u7eVar.e != u7eVar2.e || !Intrinsics.d(u7eVar.d, u7eVar2.d)) {
                jj4.h(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.f != 1) {
                jj4.h(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        ukn a = a(this, i2, null, d0oVar, 0, 0, 0, 58);
        bse bseVar = (bse) arrayList.get(i);
        l3o b = bseVar.b(a);
        if (b == null) {
            throw new NullPointerException("interceptor " + bseVar + " returned null");
        }
        if (evjVar != null && i2 < arrayList.size() && a.f != 1) {
            jj4.h(bseVar, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (b.g != null) {
            return b;
        }
        jj4.h(bseVar, " returned a response with no body", "interceptor ");
        return null;
    }

    public int g(int i, int i2) {
        psf.b = i2;
        psf.c = this.f;
        dxe z = ((bsf) this.g).l.z(i);
        int i3 = i - z.a;
        return (int) ((ypd) ((asf) z.c).b.invoke(psf.a, Integer.valueOf(i3))).a;
    }

    public ukn(mkn mknVar, ArrayList arrayList, int i, evj evjVar, d0o d0oVar, int i2, int i3, int i4) {
        d0oVar.getClass();
        this.g = mknVar;
        this.a = arrayList;
        this.b = i;
        this.h = evjVar;
        this.i = d0oVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
