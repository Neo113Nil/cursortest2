package defpackage;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w7t extends j8t {
    public boolean b;
    public boolean c;
    public y8r e;
    public final w2r f;
    public Runnable g;
    public final /* synthetic */ n8t h;
    public long a = -1;
    public int d = 0;

    public w7t(n8t n8tVar) {
        this.h = n8tVar;
        w2r w2rVar = new w2r(7, (byte) 0);
        long[] jArr = new long[20];
        w2rVar.c = jArr;
        w2rVar.d = new float[20];
        w2rVar.b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f = w2rVar;
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void d(b8t b8tVar) {
        this.c = true;
    }

    public final void h() {
        if (this.b) {
            i();
            this.e.a(this.h.A + 1);
        } else {
            this.d = 1;
            this.g = null;
        }
    }

    public final void i() {
        char c;
        float f;
        if (this.e != null) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f2 = this.a;
        w2r w2rVar = this.f;
        int i = w2rVar.b;
        float[] fArr = (float[]) w2rVar.d;
        long[] jArr = (long[]) w2rVar.c;
        char c2 = 20;
        int i2 = (i + 1) % 20;
        w2rVar.b = i2;
        jArr[i2] = currentAnimationTimeMillis;
        fArr[i2] = f2;
        ejc ejcVar = new ejc();
        float f3 = 0.0f;
        ejcVar.a = 0.0f;
        this.e = new y8r(ejcVar);
        z8r z8rVar = new z8r();
        z8rVar.a(1.0f);
        z8rVar.b(200.0f);
        y8r y8rVar = this.e;
        y8rVar.m = z8rVar;
        y8rVar.b = this.a;
        y8rVar.c = true;
        ArrayList arrayList = y8rVar.l;
        if (y8rVar.f) {
            qq6.d("Error: Update listeners must be added beforethe animation.");
            return;
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        y8r y8rVar2 = this.e;
        int i3 = w2rVar.b;
        long j = Long.MIN_VALUE;
        if (i3 != 0 || jArr[i3] != Long.MIN_VALUE) {
            long j2 = jArr[i3];
            int i4 = 0;
            long j3 = j2;
            while (true) {
                long j4 = jArr[i3];
                if (j4 != j) {
                    float f4 = j2 - j4;
                    float abs = Math.abs(j4 - j3);
                    if (f4 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4++;
                    if (i4 >= 20) {
                        break;
                    }
                    j3 = j4;
                    j = Long.MIN_VALUE;
                } else {
                    break;
                }
            }
            if (i4 >= 2) {
                int i5 = w2rVar.b;
                float f5 = 1000.0f;
                if (i4 == 2) {
                    int i6 = i5 == 0 ? 19 : i5 - 1;
                    float f6 = jArr[i5] - jArr[i6];
                    if (f6 != 0.0f) {
                        f3 = ((fArr[i5] - fArr[i6]) / f6) * 1000.0f;
                    }
                } else {
                    int i7 = ((i5 - i4) + 21) % 20;
                    int i8 = (i5 + 21) % 20;
                    long j5 = jArr[i7];
                    float f7 = fArr[i7];
                    int i9 = i7 + 1;
                    int i10 = i9 % 20;
                    float f8 = 0.0f;
                    while (i10 != i8) {
                        long j6 = jArr[i10];
                        float f9 = f3;
                        int i11 = i8;
                        float f10 = j6 - j5;
                        if (f10 == f9) {
                            c = c2;
                            f = f5;
                        } else {
                            float f11 = fArr[i10];
                            c = c2;
                            f = f5;
                            float f12 = (f11 - f7) / f10;
                            float abs2 = (Math.abs(f12) * (f12 - ((float) (Math.sqrt(2.0f * Math.abs(f8)) * Math.signum(f8))))) + f8;
                            if (i10 == i9) {
                                abs2 *= 0.5f;
                            }
                            f8 = abs2;
                            f7 = f11;
                            j5 = j6;
                        }
                        i10 = (i10 + 1) % 20;
                        f3 = f9;
                        i8 = i11;
                        c2 = c;
                        f5 = f;
                    }
                    f3 = ((float) (Math.sqrt(Math.abs(f8) * 2.0f) * Math.signum(f8))) * f5;
                }
            }
        }
        y8rVar2.a = f3;
        y8r y8rVar3 = this.e;
        y8rVar3.g = this.h.A + 1;
        y8rVar3.h = -1.0f;
        y8rVar3.j = 4.0f;
        v7t v7tVar = new v7t(this);
        ArrayList arrayList2 = y8rVar3.k;
        if (arrayList2.contains(v7tVar)) {
            return;
        }
        arrayList2.add(v7tVar);
    }
}
