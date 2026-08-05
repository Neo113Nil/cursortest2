package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.kolosta.rejin.jilosa.R;
import defpackage.d20;
import defpackage.ke;
import defpackage.m1;
import defpackage.q70;
import defpackage.s3;
import defpackage.t10;
import defpackage.t3;
import defpackage.u10;
import defpackage.u3;
import defpackage.v3;
import defpackage.y00;
import defpackage.z10;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends t10 {
    public final View.OnLayoutChangeListener OxcuoDLp;
    public final ke lDXGDhIF;
    public v3 sjUBp5pO;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        this.OxcuoDLp = new s3(0, this);
        this.lDXGDhIF = new ke();
        f7oeun2L();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.VgvYg0wo);
            obtainStyledAttributes.getInt(0, 0);
            f7oeun2L();
            CIYkyd1d(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final void CIYkyd1d(int i) {
        v3 u3Var;
        if (i != 0 && i != 1) {
            m1.sjUBp5pO(q70.VgvYg0wo("invalid orientation:", i));
            return;
        }
        NCTxEWno(null);
        v3 v3Var = this.sjUBp5pO;
        if (v3Var == null || i != v3Var.qoPGr6Ce) {
            if (i == 0) {
                u3Var = new u3(this);
            } else {
                if (i != 1) {
                    m1.sjUBp5pO("invalid orientation");
                    return;
                }
                u3Var = new t3(1);
            }
            this.sjUBp5pO = u3Var;
            f7oeun2L();
        }
    }

    @Override // defpackage.t10
    public final void ESscZ9M1(int i, int i2) {
        lwWCatUu();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x003b, code lost:
    
        if (r7 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0045, code lost:
    
        if (ZLB5OTob() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0049, code lost:
    
        if (r7 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0052, code lost:
    
        if (ZLB5OTob() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // defpackage.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View HdOGZAzC(View view, int i, z10 z10Var, d20 d20Var) {
        char c;
        if (I5GHvsYW() != 0) {
            int i2 = this.sjUBp5pO.qoPGr6Ce;
            if (i != 1) {
                if (i != 2) {
                    if (i == 17) {
                        if (i2 == 0) {
                        }
                        c = 0;
                    } else if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                            }
                            c = 0;
                        } else {
                            if (i2 == 0) {
                            }
                            c = 0;
                        }
                    }
                    if (c != 0) {
                        if (c == 65535) {
                            if (t10.ytu5o6f4(view) != 0) {
                                int ytu5o6f4 = t10.ytu5o6f4(Ey6iv0m0(0)) - 1;
                                if (ytu5o6f4 < 0 || ytu5o6f4 >= lwWCatUu()) {
                                    return Ey6iv0m0(ZLB5OTob() ? I5GHvsYW() - 1 : 0);
                                }
                                this.sjUBp5pO.qoPGr6Ce();
                                throw null;
                            }
                        } else if (t10.ytu5o6f4(view) != lwWCatUu() - 1) {
                            int ytu5o6f42 = t10.ytu5o6f4(Ey6iv0m0(I5GHvsYW() - 1)) + 1;
                            if (ytu5o6f42 < 0 || ytu5o6f42 >= lwWCatUu()) {
                                return Ey6iv0m0(ZLB5OTob() ? 0 : I5GHvsYW() - 1);
                            }
                            this.sjUBp5pO.qoPGr6Ce();
                            throw null;
                        }
                    }
                }
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        return null;
    }

    @Override // defpackage.t10
    public final void LfKQckgD(z10 z10Var, d20 d20Var) {
        if (d20Var.NCTxEWno() > 0) {
            if ((d3vfVszL() ? this.OnDfzHZD : this.ygLcUYwZ) > 0.0f) {
                ZLB5OTob();
                z10Var.wxUZMvaN(0);
                m1.Ey6iv0m0("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        hGvurcGl(z10Var);
    }

    @Override // defpackage.t10
    public final boolean MdtA4re8() {
        return d3vfVszL();
    }

    @Override // defpackage.t10
    public final void N8VPGzVC(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.OxcuoDLp);
    }

    @Override // defpackage.t10
    public final int OnDfzHZD(d20 d20Var) {
        return 0;
    }

    @Override // defpackage.t10
    public final u10 OxcuoDLp() {
        return new u10(-2, -2);
    }

    @Override // defpackage.t10
    public final void TrssYQ34() {
        lwWCatUu();
    }

    @Override // defpackage.t10
    public final int XrPeKzBk(int i, z10 z10Var, d20 d20Var) {
        if (!wxUZMvaN() || I5GHvsYW() == 0 || i == 0) {
            return 0;
        }
        z10Var.wxUZMvaN(0);
        m1.Ey6iv0m0("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    public final boolean ZLB5OTob() {
        return d3vfVszL() && U0LaHZX7() == 1;
    }

    @Override // defpackage.t10
    public final void ZyZthT5G(AccessibilityEvent accessibilityEvent) {
        super.ZyZthT5G(accessibilityEvent);
        if (I5GHvsYW() > 0) {
            accessibilityEvent.setFromIndex(t10.ytu5o6f4(Ey6iv0m0(0)));
            accessibilityEvent.setToIndex(t10.ytu5o6f4(Ey6iv0m0(I5GHvsYW() - 1)));
        }
    }

    @Override // defpackage.t10
    public final boolean aZz0PFXp() {
        return true;
    }

    public final boolean d3vfVszL() {
        return this.sjUBp5pO.qoPGr6Ce == 0;
    }

    @Override // defpackage.t10
    public final boolean dHozS53r(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.t10
    public final int eVhOlqcC(d20 d20Var) {
        return 0;
    }

    @Override // defpackage.t10
    public final void gjV1z5T1(View view, Rect rect) {
        super.gjV1z5T1(view, rect);
        rect.centerY();
        if (d3vfVszL()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.t10
    public final void gmkaJpmS(int i, int i2) {
        lwWCatUu();
    }

    @Override // defpackage.t10
    public final int jb9XjC4I(d20 d20Var) {
        I5GHvsYW();
        return 0;
    }

    @Override // defpackage.t10
    public final int k3x7lurq(d20 d20Var) {
        return 0;
    }

    @Override // defpackage.t10
    public final void nSmgoSB5(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        ke keVar = this.lDXGDhIF;
        float f = keVar.qoPGr6Ce;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        keVar.qoPGr6Ce = f;
        float f2 = keVar.NCTxEWno;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        keVar.NCTxEWno = f2;
        f7oeun2L();
        recyclerView.addOnLayoutChangeListener(this.OxcuoDLp);
    }

    @Override // defpackage.t10
    public final int ow5vqvCr(d20 d20Var) {
        I5GHvsYW();
        return 0;
    }

    @Override // defpackage.t10
    public final void pP9Y2m6O(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return;
        }
        t10.ytu5o6f4(Ey6iv0m0(0));
    }

    @Override // defpackage.t10
    public final int uQ3KJUK5(int i, z10 z10Var, d20 d20Var) {
        if (!d3vfVszL() || I5GHvsYW() == 0 || i == 0) {
            return 0;
        }
        z10Var.wxUZMvaN(0);
        m1.Ey6iv0m0("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.t10
    public final boolean wxUZMvaN() {
        return !d3vfVszL();
    }

    @Override // defpackage.t10
    public final int ygLcUYwZ(d20 d20Var) {
        return 0;
    }

    public CarouselLayoutManager() {
        ke keVar = new ke();
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        this.OxcuoDLp = new s3(0, this);
        this.lDXGDhIF = keVar;
        f7oeun2L();
        CIYkyd1d(0);
    }
}
