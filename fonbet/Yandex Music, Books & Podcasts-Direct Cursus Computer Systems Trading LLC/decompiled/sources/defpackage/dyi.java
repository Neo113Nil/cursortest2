package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dyi implements wxi {
    public final View a;
    public final lyi b;
    public final int[] c;

    public dyi(View view) {
        this.a = view;
        lyi lyiVar = new lyi(view);
        lyiVar.g(true);
        this.b = lyiVar;
        this.c = new int[2];
        WeakHashMap weakHashMap = wdu.a;
        ndu.m(view, true);
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        if (!this.b.h(ivf.u(j2), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        uz0.m(iArr, 0);
        int z = ivf.z(Float.intBitsToFloat((int) (j >> 32)));
        int z2 = ivf.z(Float.intBitsToFloat((int) (j & 4294967295L)));
        int z3 = ivf.z(Float.intBitsToFloat((int) (j2 >> 32)));
        int z4 = ivf.z(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        int i2 = i == 1 ? 1 : 0;
        this.b.d(z, z2, z3, z4, null, i2 ^ 1, this.c);
        return ivf.v(iArr, j2);
    }

    @Override // defpackage.wxi
    public final Object k(long j, long j2, Continuation continuation) {
        float b = yzt.b(j2) * (-1.0f);
        float c = yzt.c(j2) * (-1.0f);
        lyi lyiVar = this.b;
        if (!lyiVar.a(b, c, true)) {
            j2 = 0;
        }
        if (lyiVar.f(0)) {
            lyiVar.i(0);
        }
        if (lyiVar.f(1)) {
            lyiVar.i(1);
        }
        return new yzt(j2);
    }

    @Override // defpackage.wxi
    public final Object r0(long j, Continuation continuation) {
        float b = yzt.b(j) * (-1.0f);
        float c = yzt.c(j) * (-1.0f);
        lyi lyiVar = this.b;
        if (!lyiVar.b(b, c)) {
            j = 0;
        }
        if (lyiVar.f(0)) {
            lyiVar.i(0);
        }
        if (lyiVar.f(1)) {
            lyiVar.i(1);
        }
        return new yzt(j);
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        if (!this.b.h(ivf.u(j), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        uz0.m(iArr, 0);
        this.b.c(ivf.z(Float.intBitsToFloat((int) (j >> 32))), ivf.z(Float.intBitsToFloat((int) (4294967295L & j))), (i == 1 ? 1 : 0) ^ 1, this.c, null);
        return ivf.v(iArr, j);
    }
}
