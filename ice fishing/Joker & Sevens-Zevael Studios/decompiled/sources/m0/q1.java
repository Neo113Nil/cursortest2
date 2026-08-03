package m0;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4715b;

    /* renamed from: c, reason: collision with root package name */
    public int f4716c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4717d;

    /* renamed from: e, reason: collision with root package name */
    public final s.u f4718e;

    /* renamed from: f, reason: collision with root package name */
    public final ac.m f4719f;

    public q1(int i10, ArrayList arrayList) {
        this.f4714a = arrayList;
        this.f4715b = i10;
        if (i10 < 0) {
            s1.a("Invalid start index");
        }
        this.f4717d = new ArrayList();
        s.u uVar = new s.u();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            v0 v0Var = (v0) this.f4714a.get(i12);
            int i13 = v0Var.f4782c;
            int i14 = v0Var.f4783d;
            uVar.h(i13, new o0(i12, i11, i14));
            i11 += i14;
        }
        this.f4718e = uVar;
        this.f4719f = bc.a0.y(new p1(this));
    }

    public final boolean a(int i10, int i11) {
        int i12;
        s.u uVar = this.f4718e;
        o0 o0Var = (o0) uVar.b(i10);
        if (o0Var == null) {
            return false;
        }
        int i13 = o0Var.f4690b;
        int i14 = i11 - o0Var.f4691c;
        o0Var.f4691c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = uVar.f6297c;
        long[] jArr = uVar.f6295a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j3 = jArr[i15];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j3) < 128) {
                        o0 o0Var2 = (o0) objArr[(i15 << 3) + i17];
                        if (o0Var2.f4690b >= i13 && !o0Var2.equals(o0Var) && (i12 = o0Var2.f4690b + i14) >= 0) {
                            o0Var2.f4690b = i12;
                        }
                    }
                    j3 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
