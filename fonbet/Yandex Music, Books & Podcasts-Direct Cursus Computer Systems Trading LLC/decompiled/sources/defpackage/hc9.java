package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class hc9 implements egu {
    public final RecyclerView a;
    public final xzb b;
    public final SparseArray c;
    public final int d;
    public final ja9 e;
    public final fc9 f;
    public final boolean g;

    public hc9(RecyclerView recyclerView, xzb xzbVar, SparseArray sparseArray, int i, ja9 ja9Var, fc9 fc9Var, boolean z) {
        this.a = recyclerView;
        this.b = xzbVar;
        this.c = sparseArray;
        this.d = i;
        this.e = ja9Var;
        this.f = fc9Var;
        this.g = z;
    }

    public final void a(View view, float f, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5) {
        float f2 = f >= -1.0f ? f : -1.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float abs = Math.abs(f2);
        xzb xzbVar = this.b;
        float interpolation = 1 - vq1.Q((um8) szbVar.a(xzbVar)).getInterpolation(abs);
        if (f > 0.0f) {
            d(view, interpolation, ((Number) szbVar2.a(xzbVar)).doubleValue());
            double doubleValue = ((Number) szbVar3.a(xzbVar)).doubleValue();
            if (doubleValue == 1.0d) {
                return;
            }
            float abs2 = (float) ((Math.abs(doubleValue - 1.0d) * interpolation) + Math.min(1.0d, doubleValue));
            view.setScaleX(abs2);
            view.setScaleY(abs2);
            return;
        }
        d(view, interpolation, ((Number) szbVar4.a(xzbVar)).doubleValue());
        double doubleValue2 = ((Number) szbVar5.a(xzbVar)).doubleValue();
        if (doubleValue2 == 1.0d) {
            return;
        }
        float abs3 = (float) ((Math.abs(doubleValue2 - 1.0d) * interpolation) + Math.min(1.0d, doubleValue2));
        view.setScaleX(abs3);
        view.setScaleY(abs3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r7 >= r6) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, float f, boolean z) {
        float c;
        float f2;
        float f3;
        float f4;
        Float i;
        float f5;
        Float l;
        int i2;
        float f6;
        Float i3;
        float f7;
        Float i4;
        int Y = RecyclerView.Y(view);
        if (Y == -1) {
            return;
        }
        if (z) {
            f2 = this.d * f;
        } else {
            boolean z2 = this.e instanceof ha9;
            float f8 = 0.0f;
            fc9 fc9Var = this.f;
            if (f == 0.0f) {
                c = 0.0f;
            } else {
                int signum = (int) Math.signum(f);
                int abs = (int) Math.abs(f);
                int i5 = Y;
                float f9 = 0.0f;
                if (1 <= abs) {
                    int i6 = 1;
                    while (true) {
                        f9 += fc9Var.c(i5, signum);
                        i5 -= signum;
                        if (i6 == abs) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                float a = fc9.a(f);
                c = f9 + (a > 0.0f ? fc9Var.c(i5, signum) * a : 0.0f);
            }
            cb9 cb9Var = fc9Var.g;
            fb9 fb9Var = fc9Var.f.q;
            cc9 cc9Var = fc9Var.d;
            gc9 gc9Var = fc9Var.c;
            float f10 = fc9Var.b;
            if (!z2) {
                double d = f;
                int ceil = Y - ((int) Math.ceil(d));
                int floor = Y - ((int) Math.floor(d));
                float f11 = fc9Var.a;
                float f12 = cc9Var.g;
                float f13 = cc9Var.h;
                float f14 = (f11 - f12) - f13;
                Float i7 = gc9Var.i(ceil);
                if (i7 != null) {
                    float floatValue = i7.floatValue();
                    if (floatValue < f14) {
                        if (ceil != floor) {
                            Float i8 = gc9Var.i(floor);
                            if (i8 != null) {
                                floatValue = i8.floatValue() + f10 + floatValue;
                            }
                        }
                        for (int i9 = ceil - 1; -1 < i9 && (i4 = gc9Var.i(i9)) != null; i9--) {
                            floatValue += i4.floatValue() + f10;
                            if (floatValue >= f14) {
                                break;
                            }
                        }
                        int f15 = fb9Var.f();
                        for (int i10 = floor + 1; i10 < f15; i10++) {
                            Float i11 = gc9Var.i(i10);
                            if (i11 == null) {
                                break;
                            }
                            floatValue = i11.floatValue() + f10 + floatValue;
                            if (floatValue < f14) {
                            }
                        }
                    }
                    if (!fc9Var.e) {
                        if (cb9Var != cb9.START) {
                            if (f <= 0.0f) {
                                f4 = fc9.a(f);
                            } else {
                                float a2 = fc9.a(f);
                                f4 = a2 > 0.0f ? 1 - a2 : 0.0f;
                            }
                            float b = fc9Var.b(ceil, f4, floor);
                            if (b != 0.0f && (i = gc9Var.i(ceil)) != null) {
                                float floatValue2 = i.floatValue() * f4;
                                if (floatValue2 < Math.abs(b)) {
                                    for (int i12 = ceil - 1; -1 < i12; i12--) {
                                        Float i13 = gc9Var.i(i12);
                                        if (i13 != null) {
                                            floatValue2 += i13.floatValue() + f10;
                                            if (floatValue2 < Math.abs(b)) {
                                            }
                                        }
                                    }
                                    f5 = floatValue2 - b;
                                    if (f5 != 0.0f) {
                                        if (cb9Var != cb9.END && (l = gc9Var.l(ceil)) != null) {
                                            float floatValue3 = l.floatValue();
                                            Float l2 = gc9Var.l(floor);
                                            if (l2 != null) {
                                                float floatValue4 = l2.floatValue();
                                                if (f > 0.0f) {
                                                    f6 = fc9.a(f);
                                                    i2 = 1;
                                                } else {
                                                    float a3 = fc9.a(f);
                                                    if (a3 > 0.0f) {
                                                        i2 = 1;
                                                        f6 = 1 - a3;
                                                    } else {
                                                        i2 = 1;
                                                        f6 = 0.0f;
                                                    }
                                                }
                                                float f16 = (((i2 - f6) * floatValue4) + (floatValue3 * f6)) - f13;
                                                if (f16 != 0.0f && (i3 = gc9Var.i(floor)) != null) {
                                                    float floatValue5 = i3.floatValue() * f6;
                                                    if (floatValue5 < Math.abs(f16)) {
                                                        int f17 = fb9Var.f();
                                                        for (int i14 = floor + 1; i14 < f17; i14++) {
                                                            Float i15 = gc9Var.i(i14);
                                                            if (i15 != null) {
                                                                floatValue5 += i15.floatValue() + f10;
                                                                if (floatValue5 < Math.abs(f16)) {
                                                                }
                                                            }
                                                        }
                                                        f7 = f16 - floatValue5;
                                                        if (f7 != 0.0f) {
                                                            f8 = f7;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        f7 = 0.0f;
                                        if (f7 != 0.0f) {
                                        }
                                    } else {
                                        f8 = f5;
                                    }
                                }
                            }
                        }
                        f5 = 0.0f;
                        if (f5 != 0.0f) {
                        }
                    }
                    f8 = 0.0f;
                    break;
                }
                if (f <= 0.0f) {
                    f3 = fc9.a(f);
                } else {
                    float a4 = fc9.a(f);
                    f3 = a4 > 0.0f ? 1 - a4 : 0.0f;
                }
                Float i16 = gc9Var.i(ceil);
                if (i16 != null) {
                    float floatValue6 = i16.floatValue() * f3;
                    for (int i17 = ceil - 1; -1 < i17; i17--) {
                        Float i18 = gc9Var.i(i17);
                        if (i18 != null) {
                            floatValue6 += i18.floatValue() + f10;
                        }
                    }
                    f8 = floatValue6 - fc9Var.b(ceil, f3, floor);
                }
                f8 = 0.0f;
                break;
            }
            f2 = c - f8;
        }
        float f18 = -f2;
        boolean z3 = this.g;
        if (z3 && wyf.N(this.a)) {
            f18 = -f18;
        }
        this.c.put(Y, Float.valueOf(f18));
        if (z3) {
            view.setTranslationX(f18);
        } else {
            view.setTranslationY(f18);
        }
    }

    @Override // defpackage.egu
    public final void c(View view, float f) {
        ja9 ja9Var = this.e;
        Object a = ja9Var != null ? ja9Var.a() : null;
        if (a instanceof ta9) {
            ta9 ta9Var = (ta9) a;
            a(view, f, ta9Var.a, ta9Var.b, ta9Var.c, ta9Var.d, ta9Var.e);
            b(view, f, false);
        } else {
            if (!(a instanceof na9)) {
                b(view, f, false);
                return;
            }
            na9 na9Var = (na9) a;
            a(view, f, na9Var.a, na9Var.b, na9Var.c, na9Var.d, na9Var.e);
            if (f > 0.0f || (f < 0.0f && ((Boolean) na9Var.f.a(this.b)).booleanValue())) {
                b(view, f, false);
                view.setTranslationZ(0.0f);
            } else {
                b(view, f, true);
                view.setTranslationZ(-Math.abs(f));
            }
        }
    }

    public final void d(View view, float f, double d) {
        int Y = RecyclerView.Y(view);
        qon adapter = this.a.getAdapter();
        hb9 hb9Var = adapter instanceof hb9 ? (hb9) adapter : null;
        if (hb9Var == null) {
            return;
        }
        double doubleValue = ((Number) ((k79) hb9Var.q.get(Y)).a.d().b().a(this.b)).doubleValue();
        view.setAlpha((float) ((Math.abs(d - doubleValue) * f) + Math.min(doubleValue, d)));
    }
}
