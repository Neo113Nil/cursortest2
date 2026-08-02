package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class t5w {
    public final oc9 a;
    public final float b;
    public final gc9 c;
    public final cc9 d;
    public final hb9 e;
    public int f;

    public t5w(oc9 oc9Var, float f, gc9 gc9Var, cc9 cc9Var, hb9 hb9Var) {
        this.a = oc9Var;
        this.b = f;
        this.c = gc9Var;
        this.d = cc9Var;
        this.e = hb9Var;
        this.f = 1;
        this.f = a();
        RecyclerView recyclerView = oc9Var.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize((this.f * 2) + 3);
        }
        oc9Var.getViewPager().setOffscreenPageLimit(this.f);
        oc9Var.setChangePageCallbackForOffScreenPages$div_release(new dgc(1, this));
    }

    public final int a() {
        fb9 fb9Var = this.e.q;
        cc9 cc9Var = this.d;
        float f = cc9Var.g;
        oc9 oc9Var = this.a;
        int currentItem$div_release = oc9Var.getCurrentItem$div_release();
        gc9 gc9Var = this.c;
        Float m = gc9Var.m(currentItem$div_release);
        if (m != null) {
            float floatValue = m.floatValue();
            int currentItem$div_release2 = oc9Var.getCurrentItem$div_release() - 1;
            int i = 0;
            int i2 = 0;
            while (floatValue > 0.0f && currentItem$div_release2 > 0) {
                i2++;
                Float b = b(currentItem$div_release2);
                if (b == null) {
                    break;
                }
                floatValue -= b.floatValue();
                currentItem$div_release2--;
            }
            if (floatValue > f && currentItem$div_release2 == 0) {
                i2++;
                Float b2 = b(currentItem$div_release2);
                floatValue -= b2 != null ? b2.floatValue() : 0.0f;
            }
            Float l = gc9Var.l(oc9Var.getCurrentItem$div_release());
            if (l != null) {
                float floatValue2 = l.floatValue();
                if (floatValue > f) {
                    floatValue2 += floatValue;
                }
                int currentItem$div_release3 = oc9Var.getCurrentItem$div_release() + 1;
                while (floatValue2 > 0.0f && currentItem$div_release3 < fb9Var.f() - 1) {
                    i++;
                    Float b3 = b(currentItem$div_release3);
                    if (b3 == null) {
                        break;
                    }
                    floatValue2 -= b3.floatValue();
                    currentItem$div_release3++;
                }
                if (floatValue2 > cc9Var.h && currentItem$div_release3 == fb9Var.f() - 1) {
                    i++;
                    Float b4 = b(currentItem$div_release3);
                    floatValue2 -= b4 != null ? b4.floatValue() : 0.0f;
                }
                while (floatValue2 > 0.0f && currentItem$div_release2 >= 0) {
                    i2++;
                    Float b5 = b(currentItem$div_release2);
                    if (b5 == null) {
                        break;
                    }
                    floatValue2 -= b5.floatValue();
                    currentItem$div_release2--;
                }
                int max = Math.max(i2, i);
                if (max >= 1) {
                    return max;
                }
            } else if (i2 >= 1) {
                return i2;
            }
        }
        return 1;
    }

    public final Float b(int i) {
        Float i2 = this.c.i(i);
        if (i2 != null) {
            return Float.valueOf(i2.floatValue() + this.b);
        }
        return null;
    }
}
