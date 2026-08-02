package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.aa6;
import defpackage.ap2;
import defpackage.awm;
import defpackage.ba6;
import defpackage.cen;
import defpackage.ea6;
import defpackage.f1u;
import defpackage.f96;
import defpackage.ff7;
import defpackage.fxd;
import defpackage.grd;
import defpackage.ha6;
import defpackage.hrd;
import defpackage.j7g;
import defpackage.kiu;
import defpackage.ma;
import defpackage.nsh;
import defpackage.osk;
import defpackage.q8q;
import defpackage.r86;
import defpackage.t86;
import defpackage.ta4;
import defpackage.v97;
import defpackage.w86;
import defpackage.x3e;
import defpackage.x86;
import defpackage.ynv;
import defpackage.z96;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static q8q p;
    public final SparseArray a;
    public final ArrayList b;
    public final ba6 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public f96 j;
    public ma k;
    public int l;
    public HashMap m;
    public final SparseArray n;
    public final awm o;

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ba6();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new awm(this, this);
        m(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static q8q getSharedValues() {
        if (p == null) {
            q8q q8qVar = new q8q();
            new SparseIntArray();
            q8qVar.a = new HashMap();
            p = q8qVar;
        }
        return p;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x02cf -> B:79:0x02d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, View view, aa6 aa6Var, t86 t86Var, SparseArray sparseArray) {
        ConstraintLayout constraintLayout;
        float f;
        int i;
        aa6 aa6Var2;
        int i2;
        int i3;
        int i4;
        aa6 aa6Var3;
        int i5;
        int i6;
        int i7;
        aa6 aa6Var4;
        int i8;
        int i9;
        int i10;
        int i11;
        aa6 aa6Var5;
        int i12;
        t86 t86Var2;
        aa6 aa6Var6;
        int i13;
        float f2;
        int i14;
        float f3;
        int i15;
        float f4;
        aa6 aa6Var7 = aa6Var;
        t86Var.a();
        aa6Var7.i0 = view.getVisibility();
        if (t86Var.f0) {
            aa6Var7.F = true;
            aa6Var7.i0 = 8;
        }
        aa6Var7.h0 = view;
        if (view instanceof r86) {
            constraintLayout = this;
            ((r86) view).j(aa6Var7, constraintLayout.c.z0);
        } else {
            constraintLayout = this;
        }
        int i16 = -1;
        if (t86Var.d0) {
            grd grdVar = (grd) aa6Var7;
            int i17 = t86Var.n0;
            int i18 = t86Var.o0;
            float f5 = t86Var.p0;
            if (f5 != -1.0f) {
                if (f5 > -1.0f) {
                    grdVar.u0 = f5;
                    grdVar.v0 = -1;
                    grdVar.w0 = -1;
                    return;
                }
                return;
            }
            if (i17 != -1) {
                if (i17 > -1) {
                    grdVar.u0 = -1.0f;
                    grdVar.v0 = i17;
                    grdVar.w0 = -1;
                    return;
                }
                return;
            }
            if (i18 == -1 || i18 <= -1) {
                return;
            }
            grdVar.u0 = -1.0f;
            grdVar.v0 = -1;
            grdVar.w0 = i18;
            return;
        }
        int i19 = t86Var.g0;
        int i20 = t86Var.h0;
        int i21 = t86Var.i0;
        int i22 = t86Var.j0;
        int i23 = t86Var.k0;
        int i24 = t86Var.l0;
        float f6 = t86Var.m0;
        int i25 = t86Var.p;
        if (i25 != -1) {
            aa6 aa6Var8 = (aa6) sparseArray.get(i25);
            if (aa6Var8 != null) {
                float f7 = t86Var.r;
                f4 = 0.0f;
                aa6Var.w(7, aa6Var8, 7, t86Var.q, 0);
                aa6Var7 = aa6Var;
                aa6Var7.D = f7;
            } else {
                f4 = 0.0f;
            }
            aa6Var6 = aa6Var7;
            t86Var2 = t86Var;
            f = f4;
            i4 = 2;
            i13 = 5;
            i11 = 3;
            i5 = 4;
        } else {
            if (i19 != -1) {
                aa6 aa6Var9 = (aa6) sparseArray.get(i19);
                if (aa6Var9 != null) {
                    f = 0.0f;
                    i = 2;
                    aa6Var7.w(2, aa6Var9, 2, ((ViewGroup.MarginLayoutParams) t86Var).leftMargin, i23);
                } else {
                    f = 0.0f;
                    i = 2;
                }
            } else {
                f = 0.0f;
                i = 2;
                if (i20 != -1 && (aa6Var2 = (aa6) sparseArray.get(i20)) != null) {
                    aa6Var.w(2, aa6Var2, 4, ((ViewGroup.MarginLayoutParams) t86Var).leftMargin, i23);
                    i2 = 2;
                    i3 = 4;
                    if (i21 == -1) {
                        aa6 aa6Var10 = (aa6) sparseArray.get(i21);
                        if (aa6Var10 != null) {
                            aa6Var.w(i3, aa6Var10, i2, ((ViewGroup.MarginLayoutParams) t86Var).rightMargin, i24);
                        }
                        i4 = i2;
                    } else {
                        i4 = i2;
                        if (i22 != -1 && (aa6Var3 = (aa6) sparseArray.get(i22)) != null) {
                            aa6Var.w(i3, aa6Var3, i3, ((ViewGroup.MarginLayoutParams) t86Var).rightMargin, i24);
                        }
                    }
                    i5 = i3;
                    i6 = t86Var.i;
                    if (i6 == -1) {
                        aa6 aa6Var11 = (aa6) sparseArray.get(i6);
                        if (aa6Var11 != null) {
                            i7 = 3;
                            aa6Var.w(3, aa6Var11, 3, ((ViewGroup.MarginLayoutParams) t86Var).topMargin, t86Var.x);
                        } else {
                            i7 = 3;
                        }
                    } else {
                        i7 = 3;
                        int i26 = t86Var.j;
                        if (i26 != -1 && (aa6Var4 = (aa6) sparseArray.get(i26)) != null) {
                            aa6Var.w(3, aa6Var4, 5, ((ViewGroup.MarginLayoutParams) t86Var).topMargin, t86Var.x);
                            i8 = 3;
                            i9 = 5;
                            i10 = t86Var.k;
                            if (i10 != -1) {
                                aa6 aa6Var12 = (aa6) sparseArray.get(i10);
                                if (aa6Var12 != null) {
                                    aa6Var.w(i9, aa6Var12, i8, ((ViewGroup.MarginLayoutParams) t86Var).bottomMargin, t86Var.z);
                                }
                                i11 = i8;
                            } else {
                                i11 = i8;
                                int i27 = t86Var.l;
                                if (i27 != -1 && (aa6Var5 = (aa6) sparseArray.get(i27)) != null) {
                                    aa6Var.w(i9, aa6Var5, i9, ((ViewGroup.MarginLayoutParams) t86Var).bottomMargin, t86Var.z);
                                }
                            }
                            int i28 = i9;
                            i12 = t86Var.m;
                            if (i12 != -1) {
                                t86Var2 = t86Var;
                                constraintLayout.s(aa6Var, t86Var2, sparseArray, i12, 6);
                            } else {
                                t86Var2 = t86Var;
                                int i29 = t86Var2.n;
                                if (i29 != -1) {
                                    s(aa6Var, t86Var2, sparseArray, i29, i11);
                                } else {
                                    int i30 = t86Var2.o;
                                    if (i30 != -1) {
                                        s(aa6Var, t86Var2, sparseArray, i30, i28);
                                        aa6Var6 = aa6Var;
                                        i13 = i28;
                                        if (f6 >= f) {
                                            aa6Var6.f0 = f6;
                                        }
                                        f2 = t86Var2.F;
                                        if (f2 >= f) {
                                            aa6Var6.g0 = f2;
                                        }
                                    }
                                }
                            }
                            aa6Var6 = aa6Var;
                            i13 = i28;
                            if (f6 >= f) {
                            }
                            f2 = t86Var2.F;
                            if (f2 >= f) {
                            }
                        }
                    }
                    i8 = i7;
                    i9 = 5;
                    i10 = t86Var.k;
                    if (i10 != -1) {
                    }
                    int i282 = i9;
                    i12 = t86Var.m;
                    if (i12 != -1) {
                    }
                    aa6Var6 = aa6Var;
                    i13 = i282;
                    if (f6 >= f) {
                    }
                    f2 = t86Var2.F;
                    if (f2 >= f) {
                    }
                }
            }
            i2 = i;
            i3 = 4;
            if (i21 == -1) {
            }
            i5 = i3;
            i6 = t86Var.i;
            if (i6 == -1) {
            }
            i8 = i7;
            i9 = 5;
            i10 = t86Var.k;
            if (i10 != -1) {
            }
            int i2822 = i9;
            i12 = t86Var.m;
            if (i12 != -1) {
            }
            aa6Var6 = aa6Var;
            i13 = i2822;
            if (f6 >= f) {
            }
            f2 = t86Var2.F;
            if (f2 >= f) {
            }
        }
        if (z && ((i15 = t86Var2.T) != -1 || t86Var2.U != -1)) {
            int i31 = t86Var2.U;
            aa6Var6.a0 = i15;
            aa6Var6.b0 = i31;
        }
        boolean z2 = t86Var2.a0;
        z96 z96Var = z96.b;
        z96 z96Var2 = z96.a;
        z96 z96Var3 = z96.d;
        z96 z96Var4 = z96.c;
        if (z2) {
            aa6Var6.N(z96Var2);
            aa6Var6.P(((ViewGroup.MarginLayoutParams) t86Var2).width);
            if (((ViewGroup.MarginLayoutParams) t86Var2).width == -2) {
                aa6Var6.N(z96Var);
            }
        } else if (((ViewGroup.MarginLayoutParams) t86Var2).width == -1) {
            if (t86Var2.W) {
                aa6Var6.N(z96Var4);
            } else {
                aa6Var6.N(z96Var3);
            }
            aa6Var6.j(i4).g = ((ViewGroup.MarginLayoutParams) t86Var2).leftMargin;
            aa6Var6.j(i5).g = ((ViewGroup.MarginLayoutParams) t86Var2).rightMargin;
        } else {
            aa6Var6.N(z96Var4);
            aa6Var6.P(0);
        }
        if (t86Var2.b0) {
            aa6Var6.O(z96Var2);
            aa6Var6.M(((ViewGroup.MarginLayoutParams) t86Var2).height);
            if (((ViewGroup.MarginLayoutParams) t86Var2).height == -2) {
                aa6Var6.O(z96Var);
            }
        } else if (((ViewGroup.MarginLayoutParams) t86Var2).height == -1) {
            if (t86Var2.X) {
                aa6Var6.O(z96Var4);
            } else {
                aa6Var6.O(z96Var3);
            }
            aa6Var6.j(i11).g = ((ViewGroup.MarginLayoutParams) t86Var2).topMargin;
            aa6Var6.j(i13).g = ((ViewGroup.MarginLayoutParams) t86Var2).bottomMargin;
        } else {
            aa6Var6.O(z96Var4);
            aa6Var6.M(0);
        }
        String str = t86Var2.G;
        if (str == null || str.length() == 0) {
            aa6Var6.Y = f;
        } else {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf <= 0 || indexOf >= length - 1) {
                i14 = 0;
            } else {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i16 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i16 = 1;
                }
                i14 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i14);
                if (substring2.length() > 0) {
                    f3 = Float.parseFloat(substring2);
                }
                f3 = f;
            } else {
                String substring3 = str.substring(i14, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > f && parseFloat2 > f) {
                        f3 = i16 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                f3 = f;
            }
            if (f3 > f) {
                aa6Var6.Y = f3;
                aa6Var6.Z = i16;
            }
        }
        float f8 = t86Var2.H;
        float[] fArr = aa6Var6.n0;
        fArr[0] = f8;
        fArr[1] = t86Var2.I;
        aa6Var6.l0 = t86Var2.J;
        aa6Var6.m0 = t86Var2.K;
        int i32 = t86Var2.Z;
        if (i32 >= 0 && i32 <= 3) {
            aa6Var6.q = i32;
        }
        int i33 = t86Var2.L;
        int i34 = t86Var2.N;
        int i35 = t86Var2.P;
        float f9 = t86Var2.R;
        aa6Var6.r = i33;
        aa6Var6.u = i34;
        if (i35 == Integer.MAX_VALUE) {
            i35 = 0;
        }
        aa6Var6.v = i35;
        aa6Var6.w = f9;
        if (f9 > f && f9 < 1.0f && i33 == 0) {
            aa6Var6.r = 2;
        }
        int i36 = t86Var2.M;
        int i37 = t86Var2.O;
        int i38 = t86Var2.Q;
        float f10 = t86Var2.S;
        aa6Var6.s = i36;
        aa6Var6.x = i37;
        aa6Var6.y = i38 != Integer.MAX_VALUE ? i38 : 0;
        aa6Var6.z = f10;
        if (f10 <= f || f10 >= 1.0f || i36 != 0) {
            return;
        }
        aa6Var6.s = 2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t86;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((r86) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(StringUtils.COMMA);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public t86 generateDefaultLayoutParams() {
        return new t86(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t86 generateLayoutParams(AttributeSet attributeSet) {
        return new t86(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new t86(layoutParams);
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.H0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        ba6 ba6Var = this.c;
        if (ba6Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                ba6Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                ba6Var.j = "parent";
            }
        }
        if (ba6Var.k0 == null) {
            ba6Var.k0 = ba6Var.j;
            Log.v("ConstraintLayout", " setDebugName " + ba6Var.k0);
        }
        Iterator it = ba6Var.u0.iterator();
        while (it.hasNext()) {
            aa6 aa6Var = (aa6) it.next();
            View view = aa6Var.h0;
            if (view != null) {
                if (aa6Var.j == null && (id = view.getId()) != -1) {
                    aa6Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (aa6Var.k0 == null) {
                    aa6Var.k0 = aa6Var.j;
                    Log.v("ConstraintLayout", " setDebugName " + aa6Var.k0);
                }
            }
        }
        ba6Var.o(sb);
        return sb.toString();
    }

    public final View i(int i) {
        return (View) this.a.get(i);
    }

    public final aa6 l(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof t86) {
            return ((t86) view.getLayoutParams()).q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof t86) {
            return ((t86) view.getLayoutParams()).q0;
        }
        return null;
    }

    public final void m(AttributeSet attributeSet, int i, int i2) {
        ba6 ba6Var = this.c;
        ba6Var.h0 = this;
        awm awmVar = this.o;
        ba6Var.y0 = awmVar;
        ba6Var.w0.g = awmVar;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cen.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            p(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        f96 f96Var = new f96();
                        this.j = f96Var;
                        f96Var.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        ba6Var.H0 = this.i;
        j7g.q = ba6Var.X(RemoteCameraConfig.Mic.BUFFER_SIZE);
    }

    public final boolean n() {
        return (getContext().getApplicationInfo().flags & RemoteCameraConfig.Camera.BITRATE) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            t86 t86Var = (t86) childAt.getLayoutParams();
            aa6 aa6Var = t86Var.q0;
            if ((childAt.getVisibility() != 8 || t86Var.d0 || t86Var.e0 || isInEditMode) && !t86Var.f0) {
                int s = aa6Var.s();
                int t = aa6Var.t();
                int r = aa6Var.r() + s;
                int l = aa6Var.l() + t;
                childAt.layout(s, t, r, l);
                if ((childAt instanceof osk) && (content = ((osk) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s, t, r, l);
                }
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((r86) arrayList.get(i6)).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        String str;
        int f;
        String resourceName;
        int id;
        aa6 aa6Var;
        boolean z2 = this.h;
        this.h = z2;
        int i3 = 0;
        if (!z2) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                if (getChildAt(i4).isLayoutRequested()) {
                    this.h = true;
                    break;
                }
                i4++;
            }
        }
        boolean n = n();
        ba6 ba6Var = this.c;
        ba6Var.z0 = n;
        if (this.h) {
            this.h = false;
            int childCount2 = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i5).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i5++;
                }
            }
            if (z) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i6 = 0; i6 < childCount3; i6++) {
                    aa6 l = l(getChildAt(i6));
                    if (l != null) {
                        l.D();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        View childAt = getChildAt(i7);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.m == null) {
                                    this.m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                this.m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) this.a.get(id);
                            if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                aa6Var = view == null ? null : ((t86) view.getLayoutParams()).q0;
                                aa6Var.k0 = resourceName;
                            }
                        }
                        aa6Var = ba6Var;
                        aa6Var.k0 = resourceName;
                    }
                }
                if (this.l != -1) {
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getId() == this.l && (childAt2 instanceof ea6)) {
                            this.j = ((ea6) childAt2).getConstraintSet();
                        }
                    }
                }
                f96 f96Var = this.j;
                if (f96Var != null) {
                    f96Var.c(this);
                }
                ba6Var.u0.clear();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                if (size > 0) {
                    int i9 = 0;
                    while (i9 < size) {
                        r86 r86Var = (r86) arrayList.get(i9);
                        HashMap hashMap = r86Var.h;
                        if (r86Var.isInEditMode()) {
                            r86Var.setIds(r86Var.e);
                        }
                        fxd fxdVar = r86Var.d;
                        if (fxdVar != null) {
                            fxdVar.v0 = i3;
                            Arrays.fill(fxdVar.u0, obj);
                            for (int i10 = i3; i10 < r86Var.b; i10++) {
                                int i11 = r86Var.a[i10];
                                View i12 = i(i11);
                                if (i12 == null && (f = r86Var.f(this, (str = (String) hashMap.get(Integer.valueOf(i11))))) != 0) {
                                    r86Var.a[i10] = f;
                                    hashMap.put(Integer.valueOf(f), str);
                                    i12 = i(f);
                                }
                                View view2 = i12;
                                if (view2 != null) {
                                    r86Var.d.S(l(view2));
                                }
                            }
                            r86Var.d.U();
                        }
                        i9++;
                        i3 = 0;
                        obj = null;
                    }
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    if (childAt3 instanceof osk) {
                        osk oskVar = (osk) childAt3;
                        if (oskVar.a == -1 && !oskVar.isInEditMode()) {
                            oskVar.setVisibility(oskVar.c);
                        }
                        View findViewById = findViewById(oskVar.a);
                        oskVar.b = findViewById;
                        if (findViewById != null) {
                            ((t86) findViewById.getLayoutParams()).f0 = true;
                            oskVar.b.setVisibility(0);
                            oskVar.setVisibility(0);
                        }
                    }
                }
                SparseArray sparseArray = this.n;
                sparseArray.clear();
                sparseArray.put(0, ba6Var);
                sparseArray.put(getId(), ba6Var);
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt4 = getChildAt(i14);
                    sparseArray.put(childAt4.getId(), l(childAt4));
                }
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt5 = getChildAt(i15);
                    aa6 l2 = l(childAt5);
                    if (l2 != null) {
                        t86 t86Var = (t86) childAt5.getLayoutParams();
                        ba6Var.u0.add(l2);
                        aa6 aa6Var2 = l2.V;
                        if (aa6Var2 != null) {
                            ((ba6) aa6Var2).u0.remove(l2);
                            l2.D();
                        }
                        l2.V = ba6Var;
                        a(isInEditMode, childAt5, l2, t86Var, sparseArray);
                    }
                }
            }
            if (z) {
                ba6Var.v0.V(ba6Var);
            }
        }
        ba6Var.A0.getClass();
        r(ba6Var, this.i, i, i2);
        q(i, i2, ba6Var.r(), ba6Var.l(), ba6Var.I0, ba6Var.J0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        aa6 l = l(view);
        if ((view instanceof Guideline) && !(l instanceof grd)) {
            t86 t86Var = (t86) view.getLayoutParams();
            grd grdVar = new grd();
            t86Var.q0 = grdVar;
            t86Var.d0 = true;
            grdVar.T(t86Var.V);
        }
        if (view instanceof r86) {
            r86 r86Var = (r86) view;
            r86Var.k();
            ((t86) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(r86Var)) {
                arrayList.add(r86Var);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        aa6 l = l(view);
        this.c.u0.remove(l);
        l.D();
        this.b.remove(view);
        this.h = true;
    }

    public void p(int i) {
        String str;
        Context context = getContext();
        ma maVar = new ma();
        maVar.a = -1;
        maVar.b = -1;
        maVar.d = new SparseArray();
        maVar.e = new SparseArray();
        maVar.c = this;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            w86 w86Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                maVar.h(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                w86 w86Var2 = new w86(context, xml);
                                ((SparseArray) maVar.d).put(w86Var2.a, w86Var2);
                                w86Var = w86Var2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                x86 x86Var = new x86(context, xml);
                                if (w86Var != null) {
                                    w86Var.b.add(x86Var);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.k = maVar;
    }

    public final void q(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        awm awmVar = this.o;
        int i5 = awmVar.d;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + awmVar.c, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.g, resolveSizeAndState2);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(ba6 ba6Var, int i, int i2, int i3) {
        int max;
        int i4;
        z96 z96Var;
        int i5;
        int max2;
        int i6;
        z96 z96Var2;
        int r;
        v97 v97Var;
        int i7;
        int i8;
        nsh nshVar;
        boolean z;
        int i9;
        boolean z2;
        boolean z3;
        ba6 ba6Var2;
        ArrayList arrayList;
        awm awmVar;
        z96 z96Var3;
        z96 z96Var4;
        int i10;
        boolean z4;
        int size;
        int i11;
        boolean z5;
        awm awmVar2;
        boolean z6;
        int i12;
        awm awmVar3;
        int i13;
        boolean z7;
        int i14;
        x3e x3eVar;
        f1u f1uVar;
        boolean z8;
        int i15;
        int i16;
        ArrayList arrayList2;
        int i17;
        int i18;
        boolean z9;
        int i19;
        boolean z10;
        boolean z11;
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size3 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i20 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        awm awmVar4 = this.o;
        awmVar4.a = max3;
        awmVar4.b = max4;
        awmVar4.c = paddingWidth;
        awmVar4.d = i20;
        awmVar4.e = i2;
        awmVar4.f = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if (n()) {
            max5 = max6;
        }
        int i21 = size2 - paddingWidth;
        int i22 = size3 - i20;
        int i23 = awmVar4.d;
        int i24 = awmVar4.c;
        int childCount = getChildCount();
        z96 z96Var5 = z96.b;
        z96 z96Var6 = z96.a;
        if (mode == Integer.MIN_VALUE) {
            max = childCount == 0 ? Math.max(0, this.d) : i21;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = i23;
                    max = 0;
                } else {
                    max = Math.min(this.f - i24, i21);
                    i4 = i23;
                }
                i5 = Integer.MIN_VALUE;
                z96Var = z96Var6;
                if (mode2 != i5) {
                    if (mode2 != 0) {
                        if (mode2 != 1073741824) {
                            i6 = i24;
                            z96Var2 = z96Var6;
                            max2 = 0;
                        } else {
                            max2 = Math.min(this.g - i4, i22);
                            i6 = i24;
                            z96Var2 = z96Var6;
                        }
                    } else if (childCount == 0) {
                        i6 = i24;
                        z96Var2 = z96Var5;
                        max2 = Math.max(0, this.e);
                    } else {
                        max2 = 0;
                    }
                    r = ba6Var.r();
                    v97Var = ba6Var.w0;
                    if (max == r || max2 != ba6Var.l()) {
                        v97Var.c = true;
                    }
                    ba6Var.a0 = 0;
                    ba6Var.b0 = 0;
                    int i25 = this.f - i6;
                    int[] iArr = ba6Var.C;
                    iArr[0] = i25;
                    iArr[1] = this.g - i4;
                    ba6Var.d0 = 0;
                    ba6Var.e0 = 0;
                    ba6Var.N(z96Var);
                    ba6Var.P(max);
                    ba6Var.O(z96Var2);
                    ba6Var.M(max2);
                    i7 = this.d - i6;
                    if (i7 >= 0) {
                        ba6Var.d0 = 0;
                    } else {
                        ba6Var.d0 = i7;
                    }
                    i8 = this.e - i4;
                    if (i8 >= 0) {
                        ba6Var.e0 = 0;
                    } else {
                        ba6Var.e0 = i8;
                    }
                    ba6Var.B0 = max5;
                    ba6Var.C0 = max3;
                    nshVar = ba6Var.v0;
                    ba6 ba6Var3 = (ba6) nshVar.c;
                    ArrayList arrayList3 = (ArrayList) nshVar.d;
                    awm awmVar5 = ba6Var.y0;
                    int size4 = ba6Var.u0.size();
                    int r2 = ba6Var.r();
                    int l = ba6Var.l();
                    boolean w = ff7.w(i, 128);
                    z = !w || ff7.w(i, 64);
                    z96 z96Var7 = z96.c;
                    boolean z12 = z;
                    if (!z) {
                        int i26 = 0;
                        while (true) {
                            i9 = size4;
                            if (i26 >= size4) {
                                break;
                            }
                            aa6 aa6Var = (aa6) ba6Var.u0.get(i26);
                            int i27 = i26;
                            z96[] z96VarArr = aa6Var.U;
                            boolean z13 = (z96VarArr[0] == z96Var7) && (z96VarArr[1] == z96Var7) && aa6Var.Y > 0.0f;
                            if ((!aa6Var.y() || !z13) && ((!aa6Var.z() || !z13) && !(aa6Var instanceof kiu) && !aa6Var.y() && !aa6Var.z())) {
                                i26 = i27 + 1;
                                size4 = i9;
                            }
                        }
                    } else {
                        i9 = size4;
                    }
                    boolean z14 = z12;
                    z2 = z14 & ((mode != 1073741824 && mode2 == 1073741824) || w);
                    if (z2) {
                        z3 = z2;
                        ba6Var2 = ba6Var3;
                        arrayList = arrayList3;
                        awmVar = awmVar5;
                        z96Var3 = z96Var6;
                        z96Var4 = z96Var5;
                        i10 = 0;
                        z4 = false;
                    } else {
                        int min = Math.min(ba6Var.C[0], i21);
                        int min2 = Math.min(ba6Var.C[1], i22);
                        int i28 = 1073741824;
                        if (mode == 1073741824) {
                            if (ba6Var.r() != min) {
                                ba6Var.P(min);
                                z8 = true;
                                v97Var.b = true;
                            } else {
                                z8 = true;
                            }
                            i28 = 1073741824;
                        } else {
                            z8 = true;
                        }
                        if (mode2 == i28) {
                            if (ba6Var.l() != min2) {
                                ba6Var.M(min2);
                                v97Var.b = z8;
                            }
                            i28 = 1073741824;
                        }
                        if (mode == i28 && mode2 == i28) {
                            ArrayList arrayList4 = (ArrayList) v97Var.f;
                            ba6 ba6Var4 = (ba6) v97Var.d;
                            if (v97Var.b || v97Var.c) {
                                Iterator it = ba6Var4.u0.iterator();
                                while (it.hasNext()) {
                                    boolean z15 = z2;
                                    aa6 aa6Var2 = (aa6) it.next();
                                    aa6Var2.i();
                                    aa6Var2.a = false;
                                    aa6Var2.d.n();
                                    aa6Var2.e.m();
                                    arrayList4 = arrayList4;
                                    z2 = z15;
                                }
                                z3 = z2;
                                arrayList2 = arrayList4;
                                ba6Var4.i();
                                i17 = 0;
                                ba6Var4.a = false;
                                ba6Var4.d.n();
                                ba6Var4.e.m();
                                v97Var.c = false;
                            } else {
                                z3 = z2;
                                arrayList2 = arrayList4;
                                i17 = 0;
                            }
                            v97Var.c((ba6) v97Var.e);
                            ba6Var4.a0 = i17;
                            ba6Var4.b0 = i17;
                            z96 k = ba6Var4.k(i17);
                            z96 k2 = ba6Var4.k(1);
                            if (v97Var.b) {
                                v97Var.d();
                            }
                            int s = ba6Var4.s();
                            awmVar = awmVar5;
                            int t = ba6Var4.t();
                            arrayList = arrayList3;
                            ba6Var4.d.h.d(s);
                            ba6Var4.e.h.d(t);
                            v97Var.l();
                            z96Var4 = z96Var5;
                            if (k == z96Var4 || k2 == z96Var4) {
                                if (w) {
                                    Iterator it2 = arrayList2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (!((ynv) it2.next()).k()) {
                                                w = false;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                if (w && k == z96Var4) {
                                    i18 = s;
                                    z96Var3 = z96Var6;
                                    ba6Var4.N(z96Var3);
                                    i19 = t;
                                    z9 = w;
                                    ba6Var4.P(v97Var.e(ba6Var4, 0));
                                    ba6Var4.d.e.d(ba6Var4.r());
                                } else {
                                    i18 = s;
                                    z9 = w;
                                    z96Var3 = z96Var6;
                                    i19 = t;
                                }
                                if (z9 && k2 == z96Var4) {
                                    ba6Var4.O(z96Var3);
                                    ba6Var4.M(v97Var.e(ba6Var4, 1));
                                    ba6Var4.e.e.d(ba6Var4.l());
                                }
                            } else {
                                i18 = s;
                                z96Var3 = z96Var6;
                                i19 = t;
                            }
                            z96 z96Var8 = ba6Var4.U[0];
                            z96 z96Var9 = z96.d;
                            if (z96Var8 == z96Var3 || z96Var8 == z96Var9) {
                                int r3 = ba6Var4.r() + i18;
                                ba6Var2 = ba6Var3;
                                ba6Var4.d.i.d(r3);
                                ba6Var4.d.e.d(r3 - i18);
                                v97Var.l();
                                z96 z96Var10 = ba6Var4.U[1];
                                if (z96Var10 == z96Var3 || z96Var10 == z96Var9) {
                                    int l2 = ba6Var4.l() + i19;
                                    ba6Var4.e.i.d(l2);
                                    ba6Var4.e.e.d(l2 - i19);
                                }
                                v97Var.l();
                                z10 = true;
                            } else {
                                ba6Var2 = ba6Var3;
                                z10 = false;
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                ynv ynvVar = (ynv) it3.next();
                                if (ynvVar.b != ba6Var4 || ynvVar.g) {
                                    ynvVar.e();
                                }
                            }
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                ynv ynvVar2 = (ynv) it4.next();
                                if (z10 || ynvVar2.b != ba6Var4) {
                                    if (!ynvVar2.h.j || ((!ynvVar2.i.j && !(ynvVar2 instanceof hrd)) || (!ynvVar2.e.j && !(ynvVar2 instanceof ta4) && !(ynvVar2 instanceof hrd)))) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            }
                            z11 = true;
                            ba6Var4.N(k);
                            ba6Var4.O(k2);
                            z4 = z11;
                            i10 = 2;
                            i16 = 1073741824;
                        } else {
                            z3 = z2;
                            ba6Var2 = ba6Var3;
                            arrayList = arrayList3;
                            awmVar = awmVar5;
                            z96Var3 = z96Var6;
                            z96Var4 = z96Var5;
                            ba6 ba6Var5 = (ba6) v97Var.d;
                            if (v97Var.b) {
                                Iterator it5 = ba6Var5.u0.iterator();
                                while (it5.hasNext()) {
                                    aa6 aa6Var3 = (aa6) it5.next();
                                    aa6Var3.i();
                                    aa6Var3.a = false;
                                    x3e x3eVar2 = aa6Var3.d;
                                    Iterator it6 = it5;
                                    x3eVar2.e.j = false;
                                    x3eVar2.g = false;
                                    x3eVar2.n();
                                    f1u f1uVar2 = aa6Var3.e;
                                    f1uVar2.e.j = false;
                                    f1uVar2.g = false;
                                    f1uVar2.m();
                                    it5 = it6;
                                }
                                i15 = 0;
                                ba6Var5.i();
                                ba6Var5.a = false;
                                x3e x3eVar3 = ba6Var5.d;
                                x3eVar3.e.j = false;
                                x3eVar3.g = false;
                                x3eVar3.n();
                                f1u f1uVar3 = ba6Var5.e;
                                f1uVar3.e.j = false;
                                f1uVar3.g = false;
                                f1uVar3.m();
                                v97Var.d();
                            } else {
                                i15 = 0;
                            }
                            v97Var.c((ba6) v97Var.e);
                            ba6Var5.a0 = i15;
                            ba6Var5.b0 = i15;
                            ba6Var5.d.h.d(i15);
                            ba6Var5.e.h.d(i15);
                            i16 = 1073741824;
                            if (mode == 1073741824) {
                                z4 = ba6Var.U(i15, w);
                                i10 = 1;
                            } else {
                                i10 = 0;
                                z4 = true;
                            }
                            if (mode2 == 1073741824) {
                                z4 &= ba6Var.U(1, w);
                                i10++;
                            }
                        }
                        if (z4) {
                            ba6Var.Q(mode == i16, mode2 == i16);
                        }
                    }
                    if (z4 || i10 != 2) {
                        int i29 = ba6Var.H0;
                        if (i9 > 0) {
                            int size5 = ba6Var.u0.size();
                            boolean X = ba6Var.X(64);
                            awm awmVar6 = ba6Var.y0;
                            int i30 = 0;
                            while (i30 < size5) {
                                aa6 aa6Var4 = (aa6) ba6Var.u0.get(i30);
                                if ((aa6Var4 instanceof grd) || (aa6Var4 instanceof ap2) || aa6Var4.G || (X && (x3eVar = aa6Var4.d) != null && (f1uVar = aa6Var4.e) != null && x3eVar.e.j && f1uVar.e.j)) {
                                    i14 = size5;
                                } else {
                                    z96 k3 = aa6Var4.k(0);
                                    z96 k4 = aa6Var4.k(1);
                                    i14 = size5;
                                    boolean z16 = k3 == z96Var7 && aa6Var4.r != 1 && k4 == z96Var7 && aa6Var4.s != 1;
                                    if (!z16 && ba6Var.X(1) && !(aa6Var4 instanceof kiu)) {
                                        if (k3 == z96Var7 && aa6Var4.r == 0 && k4 != z96Var7 && !aa6Var4.y()) {
                                            z16 = true;
                                        }
                                        if (k4 == z96Var7 && aa6Var4.s == 0 && k3 != z96Var7 && !aa6Var4.y()) {
                                            z16 = true;
                                        }
                                        if ((k3 == z96Var7 || k4 == z96Var7) && aa6Var4.Y > 0.0f) {
                                            z16 = true;
                                        }
                                    }
                                    if (!z16) {
                                        nshVar.G(0, aa6Var4, awmVar6);
                                    }
                                }
                                i30++;
                                size5 = i14;
                            }
                            ConstraintLayout constraintLayout = (ConstraintLayout) awmVar6.g;
                            int childCount2 = constraintLayout.getChildCount();
                            ArrayList arrayList5 = constraintLayout.b;
                            for (int i31 = 0; i31 < childCount2; i31++) {
                                View childAt = constraintLayout.getChildAt(i31);
                                if (childAt instanceof osk) {
                                    osk oskVar = (osk) childAt;
                                    if (oskVar.b != null) {
                                        t86 t86Var = (t86) oskVar.getLayoutParams();
                                        t86 t86Var2 = (t86) oskVar.b.getLayoutParams();
                                        aa6 aa6Var5 = t86Var2.q0;
                                        aa6Var5.i0 = 0;
                                        aa6 aa6Var6 = t86Var.q0;
                                        if (aa6Var6.U[0] != z96Var3) {
                                            aa6Var6.P(aa6Var5.r());
                                        }
                                        aa6 aa6Var7 = t86Var.q0;
                                        if (aa6Var7.U[1] != z96Var3) {
                                            aa6Var7.M(t86Var2.q0.l());
                                        }
                                        t86Var2.q0.i0 = 8;
                                    }
                                }
                            }
                            int size6 = arrayList5.size();
                            if (size6 > 0) {
                                for (int i32 = 0; i32 < size6; i32++) {
                                    ((r86) arrayList5.get(i32)).getClass();
                                }
                            }
                        }
                        nshVar.V(ba6Var);
                        size = arrayList.size();
                        if (i9 > 0) {
                            nshVar.U(ba6Var, 0, r2, l);
                        }
                        if (size > 0) {
                            z96[] z96VarArr2 = ba6Var.U;
                            boolean z17 = z96VarArr2[0] == z96Var4;
                            boolean z18 = z96VarArr2[1] == z96Var4;
                            ba6 ba6Var6 = ba6Var2;
                            int max7 = Math.max(ba6Var.r(), ba6Var6.d0);
                            int max8 = Math.max(ba6Var.l(), ba6Var6.e0);
                            int i33 = 0;
                            boolean z19 = false;
                            while (i33 < size) {
                                ArrayList arrayList6 = arrayList;
                                aa6 aa6Var8 = (aa6) arrayList6.get(i33);
                                if (aa6Var8 instanceof kiu) {
                                    int r4 = aa6Var8.r();
                                    int l3 = aa6Var8.l();
                                    z6 = z18;
                                    i12 = i33;
                                    awmVar3 = awmVar;
                                    boolean G = z19 | nshVar.G(1, aa6Var8, awmVar3);
                                    int r5 = aa6Var8.r();
                                    int l4 = aa6Var8.l();
                                    if (r5 != r4) {
                                        aa6Var8.P(r5);
                                        if (z17 && aa6Var8.s() + aa6Var8.W > max7) {
                                            max7 = Math.max(max7, aa6Var8.j(4).e() + aa6Var8.s() + aa6Var8.W);
                                        }
                                        i13 = max7;
                                        z7 = true;
                                    } else {
                                        i13 = max7;
                                        z7 = G;
                                    }
                                    if (l4 != l3) {
                                        aa6Var8.M(l4);
                                        if (z6 && aa6Var8.t() + aa6Var8.X > max8) {
                                            max8 = Math.max(max8, aa6Var8.j(5).e() + aa6Var8.t() + aa6Var8.X);
                                        }
                                        z7 = true;
                                    }
                                    int i34 = i13;
                                    z19 = z7 | ((kiu) aa6Var8).C0;
                                    max7 = i34;
                                } else {
                                    z6 = z18;
                                    i12 = i33;
                                    awmVar3 = awmVar;
                                }
                                i33 = i12 + 1;
                                awmVar = awmVar3;
                                arrayList = arrayList6;
                                z18 = z6;
                            }
                            boolean z20 = z18;
                            ArrayList arrayList7 = arrayList;
                            int i35 = max8;
                            boolean z21 = z19;
                            int i36 = 0;
                            while (true) {
                                awm awmVar7 = awmVar;
                                if (i36 >= 2) {
                                    break;
                                }
                                int i37 = i35;
                                int i38 = max7;
                                boolean z22 = z21;
                                int i39 = i37;
                                int i40 = 0;
                                while (i40 < size) {
                                    aa6 aa6Var9 = (aa6) arrayList7.get(i40);
                                    if ((!(aa6Var9 instanceof fxd) || (aa6Var9 instanceof kiu)) && !(aa6Var9 instanceof grd)) {
                                        i11 = size;
                                        if (aa6Var9.i0 != 8 && ((!z3 || !aa6Var9.d.e.j || !aa6Var9.e.e.j) && !(aa6Var9 instanceof kiu))) {
                                            int r6 = aa6Var9.r();
                                            int l5 = aa6Var9.l();
                                            boolean z23 = z22;
                                            int i41 = aa6Var9.c0;
                                            z5 = z17;
                                            boolean G2 = z23 | nshVar.G(i36 == 1 ? 2 : 1, aa6Var9, awmVar7);
                                            awmVar2 = awmVar7;
                                            int r7 = aa6Var9.r();
                                            boolean z24 = G2;
                                            int l6 = aa6Var9.l();
                                            if (r7 != r6) {
                                                aa6Var9.P(r7);
                                                if (z5 && aa6Var9.s() + aa6Var9.W > i38) {
                                                    i38 = Math.max(i38, aa6Var9.j(4).e() + aa6Var9.s() + aa6Var9.W);
                                                }
                                                z24 = true;
                                            }
                                            if (l6 != l5) {
                                                aa6Var9.M(l6);
                                                if (z20 && aa6Var9.t() + aa6Var9.X > i39) {
                                                    i39 = Math.max(i39, aa6Var9.j(5).e() + aa6Var9.t() + aa6Var9.X);
                                                }
                                                z24 = true;
                                            }
                                            z22 = (!aa6Var9.E || i41 == aa6Var9.c0) ? z24 : true;
                                            i40++;
                                            size = i11;
                                            z17 = z5;
                                            awmVar7 = awmVar2;
                                        }
                                    } else {
                                        i11 = size;
                                    }
                                    awmVar2 = awmVar7;
                                    z5 = z17;
                                    i40++;
                                    size = i11;
                                    z17 = z5;
                                    awmVar7 = awmVar2;
                                }
                                int i42 = size;
                                awmVar = awmVar7;
                                boolean z25 = z17;
                                if (!z22) {
                                    break;
                                }
                                i36++;
                                nshVar.U(ba6Var, i36, r2, l);
                                max7 = i38;
                                i35 = i39;
                                size = i42;
                                z17 = z25;
                                z21 = false;
                            }
                        }
                        ba6Var.H0 = i29;
                        j7g.q = ba6Var.X(RemoteCameraConfig.Mic.BUFFER_SIZE);
                    }
                    return;
                }
                max2 = childCount == 0 ? Math.max(0, this.e) : i22;
                i6 = i24;
                z96Var2 = z96Var5;
                r = ba6Var.r();
                v97Var = ba6Var.w0;
                if (max == r) {
                }
                v97Var.c = true;
                ba6Var.a0 = 0;
                ba6Var.b0 = 0;
                int i252 = this.f - i6;
                int[] iArr2 = ba6Var.C;
                iArr2[0] = i252;
                iArr2[1] = this.g - i4;
                ba6Var.d0 = 0;
                ba6Var.e0 = 0;
                ba6Var.N(z96Var);
                ba6Var.P(max);
                ba6Var.O(z96Var2);
                ba6Var.M(max2);
                i7 = this.d - i6;
                if (i7 >= 0) {
                }
                i8 = this.e - i4;
                if (i8 >= 0) {
                }
                ba6Var.B0 = max5;
                ba6Var.C0 = max3;
                nshVar = ba6Var.v0;
                ba6 ba6Var32 = (ba6) nshVar.c;
                ArrayList arrayList32 = (ArrayList) nshVar.d;
                awm awmVar52 = ba6Var.y0;
                int size42 = ba6Var.u0.size();
                int r22 = ba6Var.r();
                int l7 = ba6Var.l();
                boolean w2 = ff7.w(i, 128);
                if (w2) {
                }
                z96 z96Var72 = z96.c;
                boolean z122 = z;
                if (!z) {
                }
                boolean z142 = z122;
                z2 = z142 & ((mode != 1073741824 && mode2 == 1073741824) || w2);
                if (z2) {
                }
                if (z4) {
                }
                int i292 = ba6Var.H0;
                if (i9 > 0) {
                }
                nshVar.V(ba6Var);
                size = arrayList.size();
                if (i9 > 0) {
                }
                if (size > 0) {
                }
                ba6Var.H0 = i292;
                j7g.q = ba6Var.X(RemoteCameraConfig.Mic.BUFFER_SIZE);
            }
            if (childCount == 0) {
                i4 = i23;
                z96Var = z96Var5;
                max = Math.max(0, this.d);
                i5 = Integer.MIN_VALUE;
                if (mode2 != i5) {
                }
                i6 = i24;
                z96Var2 = z96Var5;
                r = ba6Var.r();
                v97Var = ba6Var.w0;
                if (max == r) {
                }
                v97Var.c = true;
                ba6Var.a0 = 0;
                ba6Var.b0 = 0;
                int i2522 = this.f - i6;
                int[] iArr22 = ba6Var.C;
                iArr22[0] = i2522;
                iArr22[1] = this.g - i4;
                ba6Var.d0 = 0;
                ba6Var.e0 = 0;
                ba6Var.N(z96Var);
                ba6Var.P(max);
                ba6Var.O(z96Var2);
                ba6Var.M(max2);
                i7 = this.d - i6;
                if (i7 >= 0) {
                }
                i8 = this.e - i4;
                if (i8 >= 0) {
                }
                ba6Var.B0 = max5;
                ba6Var.C0 = max3;
                nshVar = ba6Var.v0;
                ba6 ba6Var322 = (ba6) nshVar.c;
                ArrayList arrayList322 = (ArrayList) nshVar.d;
                awm awmVar522 = ba6Var.y0;
                int size422 = ba6Var.u0.size();
                int r222 = ba6Var.r();
                int l72 = ba6Var.l();
                boolean w22 = ff7.w(i, 128);
                if (w22) {
                }
                z96 z96Var722 = z96.c;
                boolean z1222 = z;
                if (!z) {
                }
                boolean z1422 = z1222;
                z2 = z1422 & ((mode != 1073741824 && mode2 == 1073741824) || w22);
                if (z2) {
                }
                if (z4) {
                }
                int i2922 = ba6Var.H0;
                if (i9 > 0) {
                }
                nshVar.V(ba6Var);
                size = arrayList.size();
                if (i9 > 0) {
                }
                if (size > 0) {
                }
                ba6Var.H0 = i2922;
                j7g.q = ba6Var.X(RemoteCameraConfig.Mic.BUFFER_SIZE);
            }
            max = 0;
        }
        i4 = i23;
        z96Var = z96Var5;
        i5 = Integer.MIN_VALUE;
        if (mode2 != i5) {
        }
        i6 = i24;
        z96Var2 = z96Var5;
        r = ba6Var.r();
        v97Var = ba6Var.w0;
        if (max == r) {
        }
        v97Var.c = true;
        ba6Var.a0 = 0;
        ba6Var.b0 = 0;
        int i25222 = this.f - i6;
        int[] iArr222 = ba6Var.C;
        iArr222[0] = i25222;
        iArr222[1] = this.g - i4;
        ba6Var.d0 = 0;
        ba6Var.e0 = 0;
        ba6Var.N(z96Var);
        ba6Var.P(max);
        ba6Var.O(z96Var2);
        ba6Var.M(max2);
        i7 = this.d - i6;
        if (i7 >= 0) {
        }
        i8 = this.e - i4;
        if (i8 >= 0) {
        }
        ba6Var.B0 = max5;
        ba6Var.C0 = max3;
        nshVar = ba6Var.v0;
        ba6 ba6Var3222 = (ba6) nshVar.c;
        ArrayList arrayList3222 = (ArrayList) nshVar.d;
        awm awmVar5222 = ba6Var.y0;
        int size4222 = ba6Var.u0.size();
        int r2222 = ba6Var.r();
        int l722 = ba6Var.l();
        boolean w222 = ff7.w(i, 128);
        if (w222) {
        }
        z96 z96Var7222 = z96.c;
        boolean z12222 = z;
        if (!z) {
        }
        boolean z14222 = z12222;
        z2 = z14222 & ((mode != 1073741824 && mode2 == 1073741824) || w222);
        if (z2) {
        }
        if (z4) {
        }
        int i29222 = ba6Var.H0;
        if (i9 > 0) {
        }
        nshVar.V(ba6Var);
        size = arrayList.size();
        if (i9 > 0) {
        }
        if (size > 0) {
        }
        ba6Var.H0 = i29222;
        j7g.q = ba6Var.X(RemoteCameraConfig.Mic.BUFFER_SIZE);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final void s(aa6 aa6Var, t86 t86Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        aa6 aa6Var2 = (aa6) sparseArray.get(i);
        if (aa6Var2 == null || view == null || !(view.getLayoutParams() instanceof t86)) {
            return;
        }
        t86Var.c0 = true;
        if (i2 == 6) {
            t86 t86Var2 = (t86) view.getLayoutParams();
            t86Var2.c0 = true;
            t86Var2.q0.E = true;
        }
        aa6Var.j(6).b(aa6Var2.j(i2), t86Var.D, t86Var.C, true);
        aa6Var.E = true;
        aa6Var.j(3).j();
        aa6Var.j(5).j();
    }

    public void setConstraintSet(f96 f96Var) {
        this.j = f96Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ha6 ha6Var) {
        ma maVar = this.k;
        if (maVar != null) {
            maVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        ba6 ba6Var = this.c;
        ba6Var.H0 = i;
        j7g.q = ba6Var.X(RemoteCameraConfig.Mic.BUFFER_SIZE);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ba6();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new awm(this, this);
        m(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ba6();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new awm(this, this);
        m(attributeSet, i, 0);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ba6();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new awm(this, this);
        m(attributeSet, i, i2);
    }
}
