package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.pager.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes.dex */
public final class q2l implements jt31 {
    public final RecyclerView a;
    public final rvo b;
    public final SparseArray c;
    public final int d;
    public final a1l e;
    public final n2l f;
    public final boolean g;

    public q2l(RecyclerView recyclerView, rvo rvoVar, SparseArray sparseArray, int i, a1l a1lVar, n2l n2lVar, boolean z) {
        this.a = recyclerView;
        this.b = rvoVar;
        this.c = sparseArray;
        this.d = i;
        this.e = a1lVar;
        this.f = n2lVar;
        this.g = z;
    }

    public final void a(View view, float f, Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
        float f2 = f >= -1.0f ? f : -1.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float abs = Math.abs(f2);
        rvo rvoVar = this.b;
        float interpolation = 1.0f - uml.e((DivAnimationInterpolator) expression.a(rvoVar)).getInterpolation(abs);
        if (f > 0.0f) {
            d(view, interpolation, ((Number) expression2.a(rvoVar)).doubleValue());
            double doubleValue = ((Number) expression3.a(rvoVar)).doubleValue();
            if (doubleValue == 1.0d) {
                return;
            }
            float abs2 = (float) ((Math.abs(doubleValue - 1.0d) * interpolation) + Math.min(1.0d, doubleValue));
            view.setScaleX(abs2);
            view.setScaleY(abs2);
            return;
        }
        d(view, interpolation, ((Number) expression4.a(rvoVar)).doubleValue());
        double doubleValue2 = ((Number) expression5.a(rvoVar)).doubleValue();
        if (doubleValue2 == 1.0d) {
            return;
        }
        float abs3 = (float) ((Math.abs(doubleValue2 - 1.0d) * interpolation) + Math.min(1.0d, doubleValue2));
        view.setScaleX(abs3);
        view.setScaleY(abs3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r11 >= r10) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(float f, boolean z, View view) {
        float c;
        float f2;
        float b;
        float f3;
        Float f4;
        float f5;
        Float g;
        float f6;
        Float f7;
        float f8;
        float f9;
        RecyclerView recyclerView = this.a;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (z) {
            f9 = this.d * f;
        } else {
            boolean z2 = this.e instanceof y0l;
            n2l n2lVar = this.f;
            if (f == 0.0f) {
                c = 0.0f;
            } else {
                int signum = (int) Math.signum(f);
                int abs = (int) Math.abs(f);
                int i = childAdapterPosition;
                float f10 = 0.0f;
                if (1 <= abs) {
                    int i2 = 1;
                    while (true) {
                        f10 = n2lVar.c(i, signum) + f10;
                        i -= signum;
                        if (i2 == abs) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                float a = n2l.a(f);
                c = f10 + (a > 0.0f ? n2lVar.c(i, signum) * a : 0.0f);
            }
            DivPager$ItemAlignment divPager$ItemAlignment = n2lVar.g;
            a aVar = n2lVar.f;
            l2l l2lVar = n2lVar.d;
            p2l p2lVar = n2lVar.c;
            float f11 = n2lVar.b;
            if (!z2) {
                double d = f;
                int ceil = childAdapterPosition - ((int) Math.ceil(d));
                int floor = childAdapterPosition - ((int) Math.floor(d));
                float f12 = n2lVar.a;
                float f13 = l2lVar.g;
                float f14 = l2lVar.h;
                float f15 = (f12 - f13) - f14;
                Float f16 = p2lVar.f(ceil);
                if (f16 != null) {
                    float floatValue = f16.floatValue();
                    if (floatValue < f15) {
                        if (ceil != floor) {
                            Float f17 = p2lVar.f(floor);
                            if (f17 != null) {
                                floatValue = f17.floatValue() + f11 + floatValue;
                            }
                        }
                        for (int i3 = ceil - 1; -1 < i3; i3--) {
                            Float f18 = p2lVar.f(i3);
                            if (f18 == null) {
                                break;
                            }
                            floatValue = f18.floatValue() + f11 + floatValue;
                            if (floatValue >= f15) {
                                break;
                            }
                        }
                        int size = aVar.G.size();
                        for (int i4 = floor + 1; i4 < size; i4++) {
                            Float f19 = p2lVar.f(i4);
                            if (f19 == null) {
                                break;
                            }
                            floatValue = f19.floatValue() + f11 + floatValue;
                            if (floatValue < f15) {
                            }
                        }
                    }
                    if (!n2lVar.e) {
                        if (divPager$ItemAlignment != DivPager$ItemAlignment.START) {
                            if (f <= 0.0f) {
                                f3 = n2l.a(f);
                            } else {
                                float a2 = n2l.a(f);
                                f3 = a2 > 0.0f ? 1.0f - a2 : 0.0f;
                            }
                            float b2 = n2lVar.b(f3, ceil, floor);
                            if (b2 != 0.0f && (f4 = p2lVar.f(ceil)) != null) {
                                float floatValue2 = f4.floatValue() * f3;
                                if (floatValue2 < Math.abs(b2)) {
                                    for (int i5 = ceil - 1; -1 < i5; i5--) {
                                        Float f20 = p2lVar.f(i5);
                                        if (f20 != null) {
                                            floatValue2 += f20.floatValue() + f11;
                                            if (floatValue2 < Math.abs(b2)) {
                                            }
                                        }
                                    }
                                    f5 = floatValue2 - b2;
                                    if (f5 != 0.0f) {
                                        if (divPager$ItemAlignment != DivPager$ItemAlignment.END && (g = p2lVar.g(ceil)) != null) {
                                            float floatValue3 = g.floatValue();
                                            Float g2 = p2lVar.g(floor);
                                            if (g2 != null) {
                                                float floatValue4 = g2.floatValue();
                                                if (f > 0.0f) {
                                                    f6 = n2l.a(f);
                                                } else {
                                                    float a3 = n2l.a(f);
                                                    f6 = a3 > 0.0f ? 1.0f - a3 : 0.0f;
                                                }
                                                float f21 = (((1.0f - f6) * floatValue4) + (floatValue3 * f6)) - f14;
                                                if (f21 != 0.0f && (f7 = p2lVar.f(floor)) != null) {
                                                    float floatValue5 = f7.floatValue() * f6;
                                                    if (floatValue5 < Math.abs(f21)) {
                                                        int size2 = aVar.G.size();
                                                        for (int i6 = floor + 1; i6 < size2; i6++) {
                                                            Float f22 = p2lVar.f(i6);
                                                            if (f22 != null) {
                                                                floatValue5 += f22.floatValue() + f11;
                                                                if (floatValue5 < Math.abs(f21)) {
                                                                }
                                                            }
                                                        }
                                                        f8 = f21 - floatValue5;
                                                        if (f8 != 0.0f) {
                                                            b = f8;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        f8 = 0.0f;
                                        if (f8 != 0.0f) {
                                        }
                                    } else {
                                        b = f5;
                                    }
                                    f9 = c - b;
                                }
                            }
                        }
                        f5 = 0.0f;
                        if (f5 != 0.0f) {
                        }
                        f9 = c - b;
                    }
                }
                if (f <= 0.0f) {
                    f2 = n2l.a(f);
                } else {
                    float a4 = n2l.a(f);
                    f2 = a4 > 0.0f ? 1.0f - a4 : 0.0f;
                }
                Float f23 = p2lVar.f(ceil);
                if (f23 != null) {
                    float floatValue6 = f23.floatValue() * f2;
                    for (int i7 = ceil - 1; -1 < i7; i7--) {
                        Float f24 = p2lVar.f(i7);
                        if (f24 != null) {
                            floatValue6 += f24.floatValue() + f11;
                        }
                    }
                    b = floatValue6 - n2lVar.b(f2, ceil, floor);
                    f9 = c - b;
                }
            }
            b = 0.0f;
            f9 = c - b;
        }
        float f25 = -f9;
        boolean z3 = this.g;
        if (z3 && ffx.W(recyclerView)) {
            f25 = -f25;
        }
        this.c.put(childAdapterPosition, Float.valueOf(f25));
        if (z3) {
            view.setTranslationX(f25);
        } else {
            view.setTranslationY(f25);
        }
    }

    @Override // defpackage.jt31
    public final void c(float f, View view) {
        a1l a1lVar = this.e;
        Object a = a1lVar != null ? a1lVar.a() : null;
        if (a instanceof j1l) {
            j1l j1lVar = (j1l) a;
            a(view, f, j1lVar.a, j1lVar.b, j1lVar.c, j1lVar.d, j1lVar.e);
            b(f, false, view);
        } else {
            if (!(a instanceof e1l)) {
                b(f, false, view);
                return;
            }
            e1l e1lVar = (e1l) a;
            a(view, f, e1lVar.a, e1lVar.b, e1lVar.c, e1lVar.d, e1lVar.e);
            if (f > 0.0f || (f < 0.0f && ((Boolean) e1lVar.f.a(this.b)).booleanValue())) {
                b(f, false, view);
                view.setTranslationZ(0.0f);
            } else {
                b(f, true, view);
                view.setTranslationZ(-Math.abs(f));
            }
        }
    }

    public final void d(View view, float f, double d) {
        RecyclerView recyclerView = this.a;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        a aVar = adapter instanceof a ? (a) adapter : null;
        if (aVar == null) {
            return;
        }
        double doubleValue = ((Number) ((cxk) aVar.G.get(childAdapterPosition)).a.d().a().a(this.b)).doubleValue();
        view.setAlpha((float) ((Math.abs(d - doubleValue) * f) + Math.min(doubleValue, d)));
    }
}
