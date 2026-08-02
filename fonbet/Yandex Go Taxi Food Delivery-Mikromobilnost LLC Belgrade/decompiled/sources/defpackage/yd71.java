package defpackage;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;
import yads.wk2;

/* loaded from: classes7.dex */
public abstract class yd71 implements u871 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public no71 w;

    public yd71(boolean z) {
        this.a = z;
    }

    @Override // defpackage.u871
    public final void S(mr81 mr81Var) {
        mr81Var.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(mr81Var)) {
            return;
        }
        arrayList.add(mr81Var);
        this.c++;
    }

    public final void a(no71 no71Var) {
        this.w = no71Var;
        for (int i = 0; i < this.c; i++) {
            mr81 mr81Var = (mr81) this.b.get(i);
            boolean z = this.a;
            cj71 cj71Var = (cj71) mr81Var;
            synchronized (cj71Var) {
                try {
                    wk2 wk2Var = cj71.n;
                    if (z && (no71Var.h & 8) != 8) {
                        if (cj71Var.f == 0) {
                            cj71Var.d.getClass();
                            cj71Var.g = SystemClock.elapsedRealtime();
                        }
                        cj71Var.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(int i) {
        no71 no71Var = this.w;
        int i2 = rf71.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            mr81 mr81Var = (mr81) this.b.get(i3);
            boolean z = this.a;
            cj71 cj71Var = (cj71) mr81Var;
            synchronized (cj71Var) {
                wk2 wk2Var = cj71.n;
                if (z && (no71Var.h & 8) != 8) {
                    cj71Var.h += i;
                }
            }
        }
    }

    public final void g() {
        int i;
        az61 az61Var;
        float f;
        long j;
        no71 no71Var = this.w;
        int i2 = rf71.a;
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.c) {
            mr81 mr81Var = (mr81) this.b.get(i4);
            boolean z = this.a;
            cj71 cj71Var = (cj71) mr81Var;
            synchronized (cj71Var) {
                try {
                    wk2 wk2Var = cj71.n;
                    if (!z || (no71Var.h & 8) == 8) {
                        i = i4;
                    } else {
                        if (cj71Var.f <= 0) {
                            throw new IllegalStateException();
                        }
                        cj71Var.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i5 = (int) (elapsedRealtime - cj71Var.g);
                        cj71Var.j += i5;
                        long j2 = cj71Var.k;
                        long j3 = cj71Var.h;
                        cj71Var.k = j2 + j3;
                        if (i5 > 0) {
                            float f2 = (j3 * 8000.0f) / i5;
                            d271 d271Var = cj71Var.c;
                            int sqrt = (int) Math.sqrt(j3);
                            if (d271Var.c != 1) {
                                Collections.sort(d271Var.a, d271.g);
                                d271Var.c = 1;
                            }
                            int i6 = d271Var.f;
                            if (i6 > 0) {
                                az61[] az61VarArr = d271Var.b;
                                int i7 = i6 - 1;
                                d271Var.f = i7;
                                az61Var = az61VarArr[i7];
                            } else {
                                az61Var = new az61();
                            }
                            int i8 = d271Var.d;
                            d271Var.d = i8 + 1;
                            az61Var.a = i8;
                            az61Var.b = sqrt;
                            az61Var.c = f2;
                            d271Var.a.add(az61Var);
                            d271Var.e += sqrt;
                            while (true) {
                                int i9 = d271Var.e;
                                if (i9 <= 2000) {
                                    break;
                                }
                                int i10 = i9 - 2000;
                                az61 az61Var2 = (az61) d271Var.a.get(i3);
                                int i11 = az61Var2.b;
                                if (i11 <= i10) {
                                    d271Var.e -= i11;
                                    d271Var.a.remove(i3);
                                    int i12 = d271Var.f;
                                    if (i12 < 5) {
                                        az61[] az61VarArr2 = d271Var.b;
                                        d271Var.f = i12 + 1;
                                        az61VarArr2[i12] = az61Var2;
                                    }
                                } else {
                                    az61Var2.b = i11 - i10;
                                    d271Var.e -= i10;
                                }
                            }
                            if (cj71Var.j >= 2000 || cj71Var.k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                d271 d271Var2 = cj71Var.c;
                                if (d271Var2.c != 0) {
                                    Collections.sort(d271Var2.a, d271.h);
                                    d271Var2.c = i3;
                                }
                                float f3 = 0.5f * d271Var2.e;
                                int i13 = i3;
                                int i14 = i13;
                                while (true) {
                                    int size = d271Var2.a.size();
                                    ArrayList arrayList = d271Var2.a;
                                    if (i13 < size) {
                                        az61 az61Var3 = (az61) arrayList.get(i13);
                                        i14 += az61Var3.b;
                                        if (i14 >= f3) {
                                            f = az61Var3.c;
                                            break;
                                        }
                                        i13++;
                                    } else if (arrayList.isEmpty()) {
                                        f = Float.NaN;
                                    } else {
                                        ArrayList arrayList2 = d271Var2.a;
                                        f = ((az61) arrayList2.get(arrayList2.size() - 1)).c;
                                    }
                                }
                                cj71Var.l = (long) f;
                            }
                            long j4 = cj71Var.h;
                            long j5 = cj71Var.l;
                            if (i5 == 0 && j4 == 0) {
                                i = i4;
                                if (j5 == cj71Var.m) {
                                    j = 0;
                                    cj71Var.g = elapsedRealtime;
                                    cj71Var.h = j;
                                }
                            } else {
                                i = i4;
                            }
                            cj71Var.m = j5;
                            j = 0;
                            cj71Var.b.a(i5, j4, j5);
                            cj71Var.g = elapsedRealtime;
                            cj71Var.h = j;
                        } else {
                            i = i4;
                        }
                        cj71Var.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i4 = i + 1;
            i3 = 0;
        }
        this.w = null;
    }

    public final void h() {
        for (int i = 0; i < this.c; i++) {
            ((mr81) this.b.get(i)).getClass();
        }
    }
}
