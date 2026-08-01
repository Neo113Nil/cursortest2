package u;

import B.j;
import F.i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356d extends C0354b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f4417f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f4418g;

    /* renamed from: h, reason: collision with root package name */
    public int f4419h;
    public i i;

    @Override // u.C0354b
    public final f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f4419h; i2++) {
            f[] fVarArr = this.f4417f;
            f fVar = fVarArr[i2];
            if (!zArr[fVar.f4422b]) {
                i iVar = this.i;
                iVar.f208b = fVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((f) iVar.f208b).f4427h[i3];
                        if (f2 <= RecyclerView.f2111C0) {
                            if (f2 < RecyclerView.f2111C0) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = fVar2.f4427h[i3];
                            float f4 = ((f) iVar.f208b).f4427h[i3];
                            if (f4 == f3) {
                                i3--;
                            } else if (f4 >= f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f4417f[i];
    }

    @Override // u.C0354b
    public final boolean e() {
        return this.f4419h == 0;
    }

    @Override // u.C0354b
    public final void i(C0355c c0355c, C0354b c0354b, boolean z2) {
        f fVar = c0354b.f4399a;
        if (fVar == null) {
            return;
        }
        C0353a c0353a = c0354b.f4402d;
        int d2 = c0353a.d();
        for (int i = 0; i < d2; i++) {
            f e = c0353a.e(i);
            float f2 = c0353a.f(i);
            i iVar = this.i;
            iVar.f208b = e;
            boolean z3 = e.f4421a;
            float[] fArr = fVar.f4427h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((f) iVar.f208b).f4427h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((f) iVar.f208b).f4427h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0356d) iVar.f209c).k((f) iVar.f208b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != RecyclerView.f2111C0) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((f) iVar.f208b).f4427h[i3] = f5;
                    } else {
                        ((f) iVar.f208b).f4427h[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.f4400b = (c0354b.f4400b * f2) + this.f4400b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i;
        int i2 = this.f4419h + 1;
        f[] fVarArr = this.f4417f;
        if (i2 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f4417f = fVarArr2;
            this.f4418g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f4417f;
        int i3 = this.f4419h;
        fVarArr3[i3] = fVar;
        int i4 = i3 + 1;
        this.f4419h = i4;
        if (i4 > 1 && fVarArr3[i3].f4422b > fVar.f4422b) {
            int i5 = 0;
            while (true) {
                i = this.f4419h;
                if (i5 >= i) {
                    break;
                }
                this.f4418g[i5] = this.f4417f[i5];
                i5++;
            }
            Arrays.sort(this.f4418g, 0, i, new j(3));
            for (int i6 = 0; i6 < this.f4419h; i6++) {
                this.f4417f[i6] = this.f4418g[i6];
            }
        }
        fVar.f4421a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i = 0;
        while (i < this.f4419h) {
            if (this.f4417f[i] == fVar) {
                while (true) {
                    int i2 = this.f4419h;
                    if (i >= i2 - 1) {
                        this.f4419h = i2 - 1;
                        fVar.f4421a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f4417f;
                        int i3 = i + 1;
                        fVarArr[i] = fVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // u.C0354b
    public final String toString() {
        String str = " goal -> (" + this.f4400b + ") : ";
        for (int i = 0; i < this.f4419h; i++) {
            f fVar = this.f4417f[i];
            i iVar = this.i;
            iVar.f208b = fVar;
            str = str + iVar + " ";
        }
        return str;
    }
}
