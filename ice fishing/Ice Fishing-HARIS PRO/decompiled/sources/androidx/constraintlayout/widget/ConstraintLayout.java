package androidx.constraintlayout.widget;

import F.i;
import M0.h;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u.C0355c;
import w.C0363a;
import w.d;
import w.e;
import w.g;
import x.C0368c;
import x.C0370e;
import x.C0374i;
import x.k;
import x.m;
import x.o;
import z.AbstractC0381c;
import z.AbstractC0382d;
import z.AbstractC0393o;
import z.AbstractC0396r;
import z.C0383e;
import z.C0384f;
import z.C0385g;
import z.C0392n;
import z.C0394p;
import z.C0397s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: p, reason: collision with root package name */
    public static C0397s f1889p;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1890a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1891b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1892c;

    /* renamed from: d, reason: collision with root package name */
    public int f1893d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1894f;

    /* renamed from: g, reason: collision with root package name */
    public int f1895g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1896h;
    public int i;
    public C0392n j;

    /* renamed from: k, reason: collision with root package name */
    public i f1897k;

    /* renamed from: l, reason: collision with root package name */
    public int f1898l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1899m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1900n;

    /* renamed from: o, reason: collision with root package name */
    public final C0384f f1901o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1890a = new SparseArray();
        this.f1891b = new ArrayList(4);
        this.f1892c = new e();
        this.f1893d = 0;
        this.e = 0;
        this.f1894f = Integer.MAX_VALUE;
        this.f1895g = Integer.MAX_VALUE;
        this.f1896h = true;
        this.i = 257;
        this.j = null;
        this.f1897k = null;
        this.f1898l = -1;
        this.f1899m = new HashMap();
        this.f1900n = new SparseArray();
        this.f1901o = new C0384f(this, this);
        j(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static C0397s getSharedValues() {
        if (f1889p == null) {
            C0397s c0397s = new C0397s();
            new SparseIntArray();
            new HashMap();
            f1889p = c0397s;
        }
        return f1889p;
    }

    public static C0383e h() {
        C0383e c0383e = new C0383e(-2, -2);
        c0383e.f4809a = -1;
        c0383e.f4811b = -1;
        c0383e.f4813c = -1.0f;
        c0383e.f4815d = true;
        c0383e.e = -1;
        c0383e.f4818f = -1;
        c0383e.f4820g = -1;
        c0383e.f4822h = -1;
        c0383e.i = -1;
        c0383e.j = -1;
        c0383e.f4826k = -1;
        c0383e.f4828l = -1;
        c0383e.f4830m = -1;
        c0383e.f4832n = -1;
        c0383e.f4834o = -1;
        c0383e.f4836p = -1;
        c0383e.f4838q = 0;
        c0383e.f4839r = RecyclerView.f2111C0;
        c0383e.f4840s = -1;
        c0383e.f4841t = -1;
        c0383e.f4842u = -1;
        c0383e.f4843v = -1;
        c0383e.f4844w = Integer.MIN_VALUE;
        c0383e.f4845x = Integer.MIN_VALUE;
        c0383e.f4846y = Integer.MIN_VALUE;
        c0383e.f4847z = Integer.MIN_VALUE;
        c0383e.f4784A = Integer.MIN_VALUE;
        c0383e.f4785B = Integer.MIN_VALUE;
        c0383e.f4786C = Integer.MIN_VALUE;
        c0383e.f4787D = 0;
        c0383e.f4788E = 0.5f;
        c0383e.f4789F = 0.5f;
        c0383e.f4790G = null;
        c0383e.f4791H = -1.0f;
        c0383e.f4792I = -1.0f;
        c0383e.J = 0;
        c0383e.f4793K = 0;
        c0383e.f4794L = 0;
        c0383e.f4795M = 0;
        c0383e.f4796N = 0;
        c0383e.f4797O = 0;
        c0383e.f4798P = 0;
        c0383e.f4799Q = 0;
        c0383e.f4800R = 1.0f;
        c0383e.f4801S = 1.0f;
        c0383e.f4802T = -1;
        c0383e.f4803U = -1;
        c0383e.f4804V = -1;
        c0383e.f4805W = false;
        c0383e.f4806X = false;
        c0383e.f4807Y = null;
        c0383e.f4808Z = 0;
        c0383e.f4810a0 = true;
        c0383e.f4812b0 = true;
        c0383e.f4814c0 = false;
        c0383e.f4816d0 = false;
        c0383e.f4817e0 = false;
        c0383e.f4819f0 = -1;
        c0383e.f4821g0 = -1;
        c0383e.f4823h0 = -1;
        c0383e.f4824i0 = -1;
        c0383e.f4825j0 = Integer.MIN_VALUE;
        c0383e.f4827k0 = Integer.MIN_VALUE;
        c0383e.f4829l0 = 0.5f;
        c0383e.f4837p0 = new d();
        return c0383e;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0383e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1891b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0381c) arrayList.get(i)).getClass();
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
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1896h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0383e c0383e = new C0383e(context, attributeSet);
        c0383e.f4809a = -1;
        c0383e.f4811b = -1;
        c0383e.f4813c = -1.0f;
        c0383e.f4815d = true;
        c0383e.e = -1;
        c0383e.f4818f = -1;
        c0383e.f4820g = -1;
        c0383e.f4822h = -1;
        c0383e.i = -1;
        c0383e.j = -1;
        c0383e.f4826k = -1;
        c0383e.f4828l = -1;
        c0383e.f4830m = -1;
        c0383e.f4832n = -1;
        c0383e.f4834o = -1;
        c0383e.f4836p = -1;
        c0383e.f4838q = 0;
        c0383e.f4839r = RecyclerView.f2111C0;
        c0383e.f4840s = -1;
        c0383e.f4841t = -1;
        c0383e.f4842u = -1;
        c0383e.f4843v = -1;
        c0383e.f4844w = Integer.MIN_VALUE;
        c0383e.f4845x = Integer.MIN_VALUE;
        c0383e.f4846y = Integer.MIN_VALUE;
        c0383e.f4847z = Integer.MIN_VALUE;
        c0383e.f4784A = Integer.MIN_VALUE;
        c0383e.f4785B = Integer.MIN_VALUE;
        c0383e.f4786C = Integer.MIN_VALUE;
        c0383e.f4787D = 0;
        c0383e.f4788E = 0.5f;
        c0383e.f4789F = 0.5f;
        c0383e.f4790G = null;
        c0383e.f4791H = -1.0f;
        c0383e.f4792I = -1.0f;
        c0383e.J = 0;
        c0383e.f4793K = 0;
        c0383e.f4794L = 0;
        c0383e.f4795M = 0;
        c0383e.f4796N = 0;
        c0383e.f4797O = 0;
        c0383e.f4798P = 0;
        c0383e.f4799Q = 0;
        c0383e.f4800R = 1.0f;
        c0383e.f4801S = 1.0f;
        c0383e.f4802T = -1;
        c0383e.f4803U = -1;
        c0383e.f4804V = -1;
        c0383e.f4805W = false;
        c0383e.f4806X = false;
        c0383e.f4807Y = null;
        c0383e.f4808Z = 0;
        c0383e.f4810a0 = true;
        c0383e.f4812b0 = true;
        c0383e.f4814c0 = false;
        c0383e.f4816d0 = false;
        c0383e.f4817e0 = false;
        c0383e.f4819f0 = -1;
        c0383e.f4821g0 = -1;
        c0383e.f4823h0 = -1;
        c0383e.f4824i0 = -1;
        c0383e.f4825j0 = Integer.MIN_VALUE;
        c0383e.f4827k0 = Integer.MIN_VALUE;
        c0383e.f4829l0 = 0.5f;
        c0383e.f4837p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0396r.f4966b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0382d.f4783a.get(index);
            switch (i2) {
                case 1:
                    c0383e.f4804V = obtainStyledAttributes.getInt(index, c0383e.f4804V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0383e.f4836p);
                    c0383e.f4836p = resourceId;
                    if (resourceId == -1) {
                        c0383e.f4836p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0383e.f4838q = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4838q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0383e.f4839r) % 360.0f;
                    c0383e.f4839r = f2;
                    if (f2 < RecyclerView.f2111C0) {
                        c0383e.f4839r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0383e.f4809a = obtainStyledAttributes.getDimensionPixelOffset(index, c0383e.f4809a);
                    break;
                case 6:
                    c0383e.f4811b = obtainStyledAttributes.getDimensionPixelOffset(index, c0383e.f4811b);
                    break;
                case 7:
                    c0383e.f4813c = obtainStyledAttributes.getFloat(index, c0383e.f4813c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0383e.e);
                    c0383e.e = resourceId2;
                    if (resourceId2 == -1) {
                        c0383e.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0383e.f4818f);
                    c0383e.f4818f = resourceId3;
                    if (resourceId3 == -1) {
                        c0383e.f4818f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0383e.f4820g);
                    c0383e.f4820g = resourceId4;
                    if (resourceId4 == -1) {
                        c0383e.f4820g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0383e.f4822h);
                    c0383e.f4822h = resourceId5;
                    if (resourceId5 == -1) {
                        c0383e.f4822h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0383e.i);
                    c0383e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0383e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0383e.j);
                    c0383e.j = resourceId7;
                    if (resourceId7 == -1) {
                        c0383e.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0383e.f4826k);
                    c0383e.f4826k = resourceId8;
                    if (resourceId8 == -1) {
                        c0383e.f4826k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0383e.f4828l);
                    c0383e.f4828l = resourceId9;
                    if (resourceId9 == -1) {
                        c0383e.f4828l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0383e.f4830m);
                    c0383e.f4830m = resourceId10;
                    if (resourceId10 == -1) {
                        c0383e.f4830m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0383e.f4840s);
                    c0383e.f4840s = resourceId11;
                    if (resourceId11 == -1) {
                        c0383e.f4840s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0383e.f4841t);
                    c0383e.f4841t = resourceId12;
                    if (resourceId12 == -1) {
                        c0383e.f4841t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0383e.f4842u);
                    c0383e.f4842u = resourceId13;
                    if (resourceId13 == -1) {
                        c0383e.f4842u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0383e.f4843v);
                    c0383e.f4843v = resourceId14;
                    if (resourceId14 == -1) {
                        c0383e.f4843v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0383e.f4844w = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4844w);
                    break;
                case 22:
                    c0383e.f4845x = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4845x);
                    break;
                case 23:
                    c0383e.f4846y = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4846y);
                    break;
                case 24:
                    c0383e.f4847z = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4847z);
                    break;
                case 25:
                    c0383e.f4784A = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4784A);
                    break;
                case 26:
                    c0383e.f4785B = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4785B);
                    break;
                case 27:
                    c0383e.f4805W = obtainStyledAttributes.getBoolean(index, c0383e.f4805W);
                    break;
                case 28:
                    c0383e.f4806X = obtainStyledAttributes.getBoolean(index, c0383e.f4806X);
                    break;
                case 29:
                    c0383e.f4788E = obtainStyledAttributes.getFloat(index, c0383e.f4788E);
                    break;
                case 30:
                    c0383e.f4789F = obtainStyledAttributes.getFloat(index, c0383e.f4789F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0383e.f4794L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0383e.f4795M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0383e.f4796N = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4796N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0383e.f4796N) == -2) {
                            c0383e.f4796N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0383e.f4798P = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4798P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0383e.f4798P) == -2) {
                            c0383e.f4798P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0383e.f4800R = Math.max(RecyclerView.f2111C0, obtainStyledAttributes.getFloat(index, c0383e.f4800R));
                    c0383e.f4794L = 2;
                    break;
                case 36:
                    try {
                        c0383e.f4797O = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4797O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0383e.f4797O) == -2) {
                            c0383e.f4797O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0383e.f4799Q = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4799Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0383e.f4799Q) == -2) {
                            c0383e.f4799Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0383e.f4801S = Math.max(RecyclerView.f2111C0, obtainStyledAttributes.getFloat(index, c0383e.f4801S));
                    c0383e.f4795M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C0392n.h(c0383e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0383e.f4791H = obtainStyledAttributes.getFloat(index, c0383e.f4791H);
                            break;
                        case 46:
                            c0383e.f4792I = obtainStyledAttributes.getFloat(index, c0383e.f4792I);
                            break;
                        case 47:
                            c0383e.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0383e.f4793K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0383e.f4802T = obtainStyledAttributes.getDimensionPixelOffset(index, c0383e.f4802T);
                            break;
                        case 50:
                            c0383e.f4803U = obtainStyledAttributes.getDimensionPixelOffset(index, c0383e.f4803U);
                            break;
                        case 51:
                            c0383e.f4807Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0383e.f4832n);
                            c0383e.f4832n = resourceId15;
                            if (resourceId15 == -1) {
                                c0383e.f4832n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0383e.f4834o);
                            c0383e.f4834o = resourceId16;
                            if (resourceId16 == -1) {
                                c0383e.f4834o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0383e.f4787D = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4787D);
                            break;
                        case 55:
                            c0383e.f4786C = obtainStyledAttributes.getDimensionPixelSize(index, c0383e.f4786C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C0392n.g(c0383e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C0392n.g(c0383e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0383e.f4808Z = obtainStyledAttributes.getInt(index, c0383e.f4808Z);
                                    break;
                                case 67:
                                    c0383e.f4815d = obtainStyledAttributes.getBoolean(index, c0383e.f4815d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0383e.a();
        return c0383e;
    }

    public int getMaxHeight() {
        return this.f1895g;
    }

    public int getMaxWidth() {
        return this.f1894f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.f1893d;
    }

    public int getOptimizationLevel() {
        return this.f1892c.f4589D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f1892c;
        if (eVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.j = "parent";
            }
        }
        if (eVar.f4561h0 == null) {
            eVar.f4561h0 = eVar.j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f4561h0);
        }
        Iterator it = eVar.f4597q0.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            View view = dVar.f4557f0;
            if (view != null) {
                if (dVar.j == null && (id = view.getId()) != -1) {
                    dVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f4561h0 == null) {
                    dVar.f4561h0 = dVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f4561h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d i(View view) {
        if (view == this) {
            return this.f1892c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0383e) {
            return ((C0383e) view.getLayoutParams()).f4837p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0383e) {
            return ((C0383e) view.getLayoutParams()).f4837p0;
        }
        return null;
    }

    public final void j(AttributeSet attributeSet, int i) {
        e eVar = this.f1892c;
        eVar.f4557f0 = this;
        C0384f c0384f = this.f1901o;
        eVar.f4600u0 = c0384f;
        eVar.s0.f4682f = c0384f;
        this.f1890a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0396r.f4966b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f1893d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1893d);
                } else if (index == 17) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f1894f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1894f);
                } else if (index == 15) {
                    this.f1895g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1895g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1897k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0392n c0392n = new C0392n();
                        this.j = c0392n;
                        c0392n.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.f1898l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.f4589D0 = this.i;
        C0355c.f4403q = eVar.W(512);
    }

    public final void k(int i) {
        int eventType;
        j jVar;
        Context context = getContext();
        i iVar = new i(17, false);
        iVar.f208b = new SparseArray();
        iVar.f209c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            jVar = null;
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1897k = iVar;
                return;
            }
            if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 2) {
                    j jVar2 = new j(context, xml);
                    ((SparseArray) iVar.f208b).put(jVar2.f2526b, jVar2);
                    jVar = jVar2;
                } else if (c2 == 3) {
                    C0385g c0385g = new C0385g(context, xml);
                    if (jVar != null) {
                        ((ArrayList) jVar.f2525a).add(c0385g);
                    }
                } else if (c2 == 4) {
                    iVar.E(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(e eVar, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0384f c0384f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0384f c0384f2;
        int i12;
        C0384f c0384f3;
        boolean z4;
        k kVar;
        m mVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z5;
        Iterator it;
        Iterator it2;
        boolean z6;
        e eVar2 = eVar;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0384f c0384f4 = this.f1901o;
        c0384f4.f4849b = max3;
        c0384f4.f4850c = max4;
        c0384f4.f4851d = paddingWidth;
        c0384f4.e = i19;
        c0384f4.f4852f = i2;
        c0384f4.f4853g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i20 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i21 = size - paddingWidth;
        int i22 = size2 - i19;
        int i23 = c0384f4.e;
        int i24 = c0384f4.f4851d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1894f - i24, i21);
                    i20 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f1893d);
                i4 = max;
                i20 = 2;
            } else {
                i4 = 0;
                i20 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f1893d);
            i4 = max;
            i20 = 2;
        } else {
            i4 = i21;
            i20 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1895g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = eVar.q();
        C0370e c0370e = eVar2.s0;
        int i25 = i4;
        if (i25 != q2 || i5 != eVar.k()) {
            c0370e.f4680c = true;
        }
        eVar2.f4545Y = 0;
        eVar2.f4546Z = 0;
        int i26 = this.f1894f - i24;
        int[] iArr = eVar2.f4524C;
        iArr[0] = i26;
        iArr[1] = this.f1895g - i23;
        eVar2.f4550b0 = 0;
        eVar2.f4552c0 = 0;
        eVar2.M(i20);
        eVar2.O(i25);
        eVar2.N(i6);
        eVar2.L(i5);
        int i27 = this.f1893d - i24;
        if (i27 < 0) {
            eVar2.f4550b0 = 0;
        } else {
            eVar2.f4550b0 = i27;
        }
        int i28 = this.e - i23;
        if (i28 < 0) {
            eVar2.f4552c0 = 0;
        } else {
            eVar2.f4552c0 = i28;
        }
        eVar2.f4603x0 = max5;
        eVar2.f4604y0 = max3;
        h hVar = eVar2.f4598r0;
        hVar.getClass();
        C0384f c0384f5 = eVar2.f4600u0;
        int size3 = eVar2.f4597q0.size();
        int q3 = eVar.q();
        int k2 = eVar.k();
        boolean c2 = w.j.c(i, 128);
        boolean z7 = c2 || w.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                d dVar = (d) eVar2.f4597q0.get(i29);
                int[] iArr2 = dVar.f4575p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.f4543W > RecyclerView.f2111C0;
                if ((dVar.x() && z8) || ((dVar.y() && z8) || (dVar instanceof g) || dVar.x() || dVar.y())) {
                    i7 = 1073741824;
                    z7 = false;
                    break;
                }
            }
        }
        i7 = 1073741824;
        boolean z9 = ((mode == i7 && mode2 == i7) || c2) & z7;
        if (z9) {
            int min = Math.min(iArr[0], i21);
            int min2 = Math.min(iArr[1], i22);
            if (mode == 1073741824 && eVar.q() != min) {
                eVar2.O(min);
                eVar2.s0.f4679b = true;
            }
            if (mode2 == 1073741824 && eVar.k() != min2) {
                eVar2.L(min2);
                eVar2.s0.f4679b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0370e.f4679b;
                e eVar3 = c0370e.f4678a;
                if (z10 || c0370e.f4680c) {
                    Iterator it3 = eVar3.f4597q0.iterator();
                    while (it3.hasNext()) {
                        d dVar2 = (d) it3.next();
                        dVar2.h();
                        dVar2.f4547a = false;
                        dVar2.f4553d.n();
                        dVar2.e.m();
                    }
                    i15 = 0;
                    eVar3.h();
                    eVar3.f4547a = false;
                    eVar3.f4553d.n();
                    eVar3.e.m();
                    c0370e.f4680c = false;
                } else {
                    i15 = 0;
                }
                c0370e.b(c0370e.f4681d);
                eVar3.f4545Y = i15;
                eVar3.f4546Z = i15;
                int j = eVar3.j(i15);
                int j2 = eVar3.j(1);
                if (c0370e.f4679b) {
                    c0370e.c();
                }
                int r2 = eVar3.r();
                int s2 = eVar3.s();
                z2 = z9;
                eVar3.f4553d.f4712h.d(r2);
                eVar3.e.f4712h.d(s2);
                c0370e.g();
                ArrayList arrayList2 = c0370e.e;
                c0384f = c0384f5;
                if (j == 2 || j2 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j == 2) {
                        eVar3.M(1);
                        i8 = q3;
                        eVar3.O(c0370e.d(eVar3, 0));
                        eVar3.f4553d.e.d(eVar3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j2 == 2) {
                        i16 = 1;
                        eVar3.N(1);
                        eVar3.L(c0370e.d(eVar3, 1));
                        eVar3.e.e.d(eVar3.k());
                        int[] iArr3 = eVar3.f4575p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = eVar3.q() + r2;
                            eVar3.f4553d.i.d(q4);
                            eVar3.f4553d.e.d(q4 - r2);
                            c0370e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = eVar3.k() + s2;
                                eVar3.e.i.d(k3);
                                eVar3.e.e.d(k3 - s2);
                            }
                            c0370e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            o oVar = (o) it.next();
                            if (oVar.f4707b != eVar3 || oVar.f4711g) {
                                oVar.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            o oVar2 = (o) it2.next();
                            if (z5 || oVar2.f4707b != eVar3) {
                                if (!oVar2.f4712h.j || ((!oVar2.i.j && !(oVar2 instanceof C0374i)) || (!oVar2.e.j && !(oVar2 instanceof C0368c) && !(oVar2 instanceof C0374i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        eVar3.M(j);
                        eVar3.N(j2);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = eVar3.f4575p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = eVar3.q() + r2;
                eVar3.f4553d.i.d(q42);
                eVar3.f4553d.e.d(q42 - r2);
                c0370e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = eVar3.k() + s2;
                eVar3.e.i.d(k32);
                eVar3.e.e.d(k32 - s2);
                c0370e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                eVar3.M(j);
                eVar3.N(j2);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0384f = c0384f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0370e.f4679b;
                e eVar4 = c0370e.f4678a;
                if (z11) {
                    Iterator it5 = eVar4.f4597q0.iterator();
                    while (it5.hasNext()) {
                        d dVar3 = (d) it5.next();
                        dVar3.h();
                        dVar3.f4547a = false;
                        k kVar2 = dVar3.f4553d;
                        kVar2.e.j = false;
                        kVar2.f4711g = false;
                        kVar2.n();
                        m mVar2 = dVar3.e;
                        mVar2.e.j = false;
                        mVar2.f4711g = false;
                        mVar2.m();
                    }
                    i13 = 0;
                    eVar4.h();
                    eVar4.f4547a = false;
                    k kVar3 = eVar4.f4553d;
                    kVar3.e.j = false;
                    kVar3.f4711g = false;
                    kVar3.n();
                    m mVar3 = eVar4.e;
                    mVar3.e.j = false;
                    mVar3.f4711g = false;
                    mVar3.m();
                    c0370e.c();
                } else {
                    i13 = 0;
                }
                c0370e.b(c0370e.f4681d);
                eVar4.f4545Y = i13;
                eVar4.f4546Z = i13;
                eVar4.f4553d.f4712h.d(i13);
                eVar4.e.f4712h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = eVar2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= eVar2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                eVar2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0384f = c0384f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = eVar2.f4589D0;
        if (size3 > 0) {
            int size4 = eVar2.f4597q0.size();
            boolean W2 = eVar2.W(64);
            C0384f c0384f6 = eVar2.f4600u0;
            for (int i31 = 0; i31 < size4; i31++) {
                d dVar4 = (d) eVar2.f4597q0.get(i31);
                if (!(dVar4 instanceof w.h) && !(dVar4 instanceof C0363a) && !dVar4.f4527F && (!W2 || (kVar = dVar4.f4553d) == null || (mVar = dVar4.e) == null || !kVar.e.j || !mVar.e.j)) {
                    int j3 = dVar4.j(0);
                    int j4 = dVar4.j(1);
                    boolean z12 = j3 == 3 && dVar4.f4577r != 1 && j4 == 3 && dVar4.f4578s != 1;
                    if (!z12 && eVar2.W(1) && !(dVar4 instanceof g)) {
                        if (j3 == 3 && dVar4.f4577r == 0 && j4 != 3 && !dVar4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 && dVar4.f4578s == 0 && j3 != 3 && !dVar4.x()) {
                            z12 = true;
                        }
                        if (j3 == 3 || j4 == 3) {
                            if (dVar4.f4543W > RecyclerView.f2111C0) {
                                z12 = true;
                            }
                            if (z12) {
                                hVar.h(0, dVar4, c0384f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0384f6.f4848a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1891b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0381c) arrayList3.get(i33)).getClass();
                }
            }
        }
        hVar.n(eVar2);
        ArrayList arrayList4 = (ArrayList) hVar.f616b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            hVar.m(eVar2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar2.f4575p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = eVar.q();
            e eVar5 = (e) hVar.f618d;
            int max7 = Math.max(q5, eVar5.f4550b0);
            int max8 = Math.max(eVar.k(), eVar5.f4552c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                d dVar5 = (d) arrayList4.get(i36);
                if (dVar5 instanceof g) {
                    int q6 = dVar5.q();
                    int k4 = dVar5.k();
                    i12 = i30;
                    c0384f3 = c0384f;
                    boolean h2 = z15 | hVar.h(1, dVar5, c0384f3);
                    int q7 = dVar5.q();
                    int k5 = dVar5.k();
                    if (q7 != q6) {
                        dVar5.O(q7);
                        if (z13 && dVar5.r() + dVar5.f4541U > max7) {
                            max7 = Math.max(max7, dVar5.i(4).e() + dVar5.r() + dVar5.f4541U);
                        }
                        z4 = true;
                    } else {
                        z4 = h2;
                    }
                    if (k5 != k4) {
                        dVar5.L(k5);
                        if (z14 && dVar5.s() + dVar5.f4542V > max8) {
                            max8 = Math.max(max8, dVar5.i(5).e() + dVar5.s() + dVar5.f4542V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) dVar5).f4652y0 | z4;
                } else {
                    i12 = i30;
                    c0384f3 = c0384f;
                }
                i36++;
                c0384f = c0384f3;
                i30 = i12;
            }
            int i37 = i30;
            C0384f c0384f7 = c0384f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    d dVar6 = (d) arrayList4.get(i39);
                    if (((dVar6 instanceof w.i) && !(dVar6 instanceof g)) || (dVar6 instanceof w.h) || dVar6.f4559g0 == 8 || ((z2 && dVar6.f4553d.e.j && dVar6.e.e.j) || (dVar6 instanceof g))) {
                        c0384f2 = c0384f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q8 = dVar6.q();
                        int k6 = dVar6.k();
                        arrayList = arrayList4;
                        int i40 = dVar6.f4548a0;
                        i11 = size6;
                        boolean h3 = hVar.h(i38 == 1 ? 2 : 1, dVar6, c0384f7) | z15;
                        int q9 = dVar6.q();
                        c0384f2 = c0384f7;
                        int k7 = dVar6.k();
                        if (q9 != q8) {
                            dVar6.O(q9);
                            if (z13 && dVar6.r() + dVar6.f4541U > max7) {
                                max7 = Math.max(max7, dVar6.i(4).e() + dVar6.r() + dVar6.f4541U);
                            }
                            h3 = true;
                        }
                        if (k7 != k6) {
                            dVar6.L(k7);
                            if (z14 && dVar6.s() + dVar6.f4542V > max8) {
                                max8 = Math.max(max8, dVar6.i(5).e() + dVar6.s() + dVar6.f4542V);
                            }
                            h3 = true;
                        }
                        z15 = (!dVar6.f4526E || i40 == dVar6.f4548a0) ? h3 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0384f7 = c0384f2;
                }
                C0384f c0384f8 = c0384f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                hVar.m(eVar, i38, i34, i35);
                c0384f7 = c0384f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            eVar2 = eVar;
            i30 = i37;
        }
        eVar2.f4589D0 = i30;
        C0355c.f4403q = eVar2.W(512);
    }

    public final void m(d dVar, C0383e c0383e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1890a.get(i);
        d dVar2 = (d) sparseArray.get(i);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof C0383e)) {
            return;
        }
        c0383e.f4814c0 = true;
        if (i2 == 6) {
            C0383e c0383e2 = (C0383e) view.getLayoutParams();
            c0383e2.f4814c0 = true;
            c0383e2.f4837p0.f4526E = true;
        }
        dVar.i(6).b(dVar2.i(i2), c0383e.f4787D, c0383e.f4786C, true);
        dVar.f4526E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0383e c0383e = (C0383e) childAt.getLayoutParams();
            d dVar = c0383e.f4837p0;
            if (childAt.getVisibility() != 8 || c0383e.f4816d0 || c0383e.f4817e0 || isInEditMode) {
                int r2 = dVar.r();
                int s2 = dVar.s();
                childAt.layout(r2, s2, dVar.q() + r2, dVar.k() + s2);
            }
        }
        ArrayList arrayList = this.f1891b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0381c) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0308  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        d dVar;
        int i5;
        d dVar2;
        int i6;
        d dVar3;
        int i7;
        C0383e c0383e;
        float f2;
        int i8;
        int i9;
        int i10;
        float parseFloat;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        String resourceName;
        int id;
        d dVar4;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.f1896h;
        constraintLayout.f1896h = z3;
        int i12 = 0;
        if (!z3) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i13).isLayoutRequested()) {
                    constraintLayout.f1896h = true;
                    break;
                }
                i13++;
            }
        }
        boolean z4 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        e eVar = constraintLayout.f1892c;
        eVar.f4601v0 = z4;
        if (constraintLayout.f1896h) {
            constraintLayout.f1896h = false;
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i14).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i14++;
                }
            }
            if (z2) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    d i16 = constraintLayout.i(constraintLayout.getChildAt(i15));
                    if (i16 != null) {
                        i16.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt = constraintLayout.getChildAt(i17);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f1899m == null) {
                                    constraintLayout.f1899m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1899m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1890a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                dVar4 = view == null ? null : ((C0383e) view.getLayoutParams()).f4837p0;
                                dVar4.f4561h0 = resourceName;
                            }
                        }
                        dVar4 = eVar;
                        dVar4.f4561h0 = resourceName;
                    }
                }
                if (constraintLayout.f1898l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                C0392n c0392n = constraintLayout.j;
                if (c0392n != null) {
                    c0392n.a(constraintLayout);
                }
                eVar.f4597q0.clear();
                ArrayList arrayList3 = constraintLayout.f1891b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0381c abstractC0381c = (AbstractC0381c) arrayList3.get(i19);
                        if (abstractC0381c.isInEditMode()) {
                            abstractC0381c.setIds(abstractC0381c.e);
                        }
                        w.i iVar = abstractC0381c.f4780d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f4659r0 = i12;
                            Arrays.fill(iVar.f4658q0, obj);
                            int i20 = i12;
                            while (i20 < abstractC0381c.f4778b) {
                                int i21 = abstractC0381c.f4777a[i20];
                                View view2 = (View) constraintLayout.f1890a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0381c.f4782g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0381c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0381c.f4777a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1890a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    w.i iVar2 = abstractC0381c.f4780d;
                                    d i22 = constraintLayout.i(view2);
                                    iVar2.getClass();
                                    if (i22 != iVar2 && i22 != null) {
                                        int i23 = iVar2.f4659r0 + 1;
                                        d[] dVarArr = iVar2.f4658q0;
                                        arrayList2 = arrayList3;
                                        if (i23 > dVarArr.length) {
                                            iVar2.f4658q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f4658q0;
                                        int i24 = iVar2.f4659r0;
                                        dVarArr2[i24] = i22;
                                        iVar2.f4659r0 = i24 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0381c.f4780d.S();
                        }
                        i19++;
                        arrayList3 = arrayList;
                        obj = null;
                        i12 = 0;
                    }
                }
                for (int i25 = 0; i25 < childCount3; i25++) {
                    constraintLayout.getChildAt(i25);
                }
                SparseArray sparseArray = constraintLayout.f1900n;
                sparseArray.clear();
                sparseArray.put(0, eVar);
                sparseArray.put(getId(), eVar);
                for (int i26 = 0; i26 < childCount3; i26++) {
                    View childAt2 = constraintLayout.getChildAt(i26);
                    sparseArray.put(childAt2.getId(), constraintLayout.i(childAt2));
                }
                int i27 = 0;
                while (i27 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i27);
                    d i28 = constraintLayout.i(childAt3);
                    if (i28 != null) {
                        C0383e c0383e2 = (C0383e) childAt3.getLayoutParams();
                        eVar.f4597q0.add(i28);
                        d dVar5 = i28.f4540T;
                        if (dVar5 != null) {
                            ((e) dVar5).f4597q0.remove(i28);
                            i28.C();
                        }
                        i28.f4540T = eVar;
                        c0383e2.a();
                        i28.f4559g0 = childAt3.getVisibility();
                        i28.f4557f0 = childAt3;
                        if (childAt3 instanceof AbstractC0381c) {
                            ((AbstractC0381c) childAt3).h(i28, eVar.f4601v0);
                        }
                        if (c0383e2.f4816d0) {
                            w.h hVar = (w.h) i28;
                            int i29 = c0383e2.f4831m0;
                            int i30 = c0383e2.f4833n0;
                            float f4 = c0383e2.f4835o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f4653q0 = f4;
                                    hVar.f4654r0 = -1;
                                    hVar.s0 = -1;
                                }
                            } else if (i29 != -1) {
                                if (i29 > -1) {
                                    hVar.f4653q0 = -1.0f;
                                    hVar.f4654r0 = i29;
                                    hVar.s0 = -1;
                                }
                            } else if (i30 != -1 && i30 > -1) {
                                hVar.f4653q0 = -1.0f;
                                hVar.f4654r0 = -1;
                                hVar.s0 = i30;
                            }
                        } else {
                            int i31 = c0383e2.f4819f0;
                            int i32 = c0383e2.f4821g0;
                            int i33 = c0383e2.f4823h0;
                            int i34 = c0383e2.f4824i0;
                            int i35 = c0383e2.f4825j0;
                            i3 = childCount3;
                            int i36 = c0383e2.f4827k0;
                            float f5 = c0383e2.f4829l0;
                            int i37 = c0383e2.f4836p;
                            if (i37 != -1) {
                                d dVar6 = (d) sparseArray.get(i37);
                                if (dVar6 != null) {
                                    float f6 = c0383e2.f4839r;
                                    i28.v(7, 7, c0383e2.f4838q, 0, dVar6);
                                    i28.f4525D = f6;
                                }
                                c0383e = c0383e2;
                            } else {
                                if (i31 != -1) {
                                    d dVar7 = (d) sparseArray.get(i31);
                                    if (dVar7 != null) {
                                        i28.v(2, 2, ((ViewGroup.MarginLayoutParams) c0383e2).leftMargin, i35, dVar7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i32 != -1) {
                                        d dVar8 = (d) sparseArray.get(i32);
                                        if (dVar8 != null) {
                                            i28.v(2, 4, ((ViewGroup.MarginLayoutParams) c0383e2).leftMargin, i35, dVar8);
                                        }
                                    }
                                    if (i33 == i4) {
                                        d dVar9 = (d) sparseArray.get(i33);
                                        if (dVar9 != null) {
                                            i28.v(4, 2, ((ViewGroup.MarginLayoutParams) c0383e2).rightMargin, i36, dVar9);
                                        }
                                    } else if (i34 != i4 && (dVar = (d) sparseArray.get(i34)) != null) {
                                        i28.v(4, 4, ((ViewGroup.MarginLayoutParams) c0383e2).rightMargin, i36, dVar);
                                    }
                                    i5 = c0383e2.i;
                                    if (i5 == -1) {
                                        d dVar10 = (d) sparseArray.get(i5);
                                        if (dVar10 != null) {
                                            i28.v(3, 3, ((ViewGroup.MarginLayoutParams) c0383e2).topMargin, c0383e2.f4845x, dVar10);
                                        }
                                    } else {
                                        int i38 = c0383e2.j;
                                        if (i38 != -1 && (dVar2 = (d) sparseArray.get(i38)) != null) {
                                            i28.v(3, 5, ((ViewGroup.MarginLayoutParams) c0383e2).topMargin, c0383e2.f4845x, dVar2);
                                        }
                                    }
                                    i6 = c0383e2.f4826k;
                                    if (i6 == -1) {
                                        d dVar11 = (d) sparseArray.get(i6);
                                        if (dVar11 != null) {
                                            i28.v(5, 3, ((ViewGroup.MarginLayoutParams) c0383e2).bottomMargin, c0383e2.f4847z, dVar11);
                                        }
                                    } else {
                                        int i39 = c0383e2.f4828l;
                                        if (i39 != -1 && (dVar3 = (d) sparseArray.get(i39)) != null) {
                                            i28.v(5, 5, ((ViewGroup.MarginLayoutParams) c0383e2).bottomMargin, c0383e2.f4847z, dVar3);
                                        }
                                    }
                                    i7 = c0383e2.f4830m;
                                    if (i7 == -1) {
                                        c0383e = c0383e2;
                                        m(i28, c0383e2, sparseArray, i7, 6);
                                    } else {
                                        c0383e = c0383e2;
                                        int i40 = c0383e.f4832n;
                                        if (i40 != -1) {
                                            m(i28, c0383e, sparseArray, i40, 3);
                                        } else {
                                            int i41 = c0383e.f4834o;
                                            if (i41 != -1) {
                                                m(i28, c0383e, sparseArray, i41, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= RecyclerView.f2111C0) {
                                        i28.f4554d0 = f5;
                                    }
                                    f2 = c0383e.f4789F;
                                    if (f2 >= RecyclerView.f2111C0) {
                                        i28.f4555e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i33 == i4) {
                                }
                                i5 = c0383e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0383e2.f4826k;
                                if (i6 == -1) {
                                }
                                i7 = c0383e2.f4830m;
                                if (i7 == -1) {
                                }
                                if (f5 >= RecyclerView.f2111C0) {
                                }
                                f2 = c0383e.f4789F;
                                if (f2 >= RecyclerView.f2111C0) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0383e.f4802T) != -1 || c0383e.f4803U != -1)) {
                                int i42 = c0383e.f4803U;
                                i28.f4545Y = i11;
                                i28.f4546Z = i42;
                            }
                            if (c0383e.f4810a0) {
                                i28.M(1);
                                i28.O(((ViewGroup.MarginLayoutParams) c0383e).width);
                                if (((ViewGroup.MarginLayoutParams) c0383e).width == -2) {
                                    i28.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0383e).width == -1) {
                                if (c0383e.f4805W) {
                                    i28.M(3);
                                } else {
                                    i28.M(4);
                                }
                                i28.i(2).f4520g = ((ViewGroup.MarginLayoutParams) c0383e).leftMargin;
                                i28.i(4).f4520g = ((ViewGroup.MarginLayoutParams) c0383e).rightMargin;
                            } else {
                                i28.M(3);
                                i28.O(0);
                            }
                            if (c0383e.f4812b0) {
                                i8 = -1;
                                i28.N(1);
                                i28.L(((ViewGroup.MarginLayoutParams) c0383e).height);
                                if (((ViewGroup.MarginLayoutParams) c0383e).height == -2) {
                                    i28.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0383e).height == -1) {
                                    if (c0383e.f4806X) {
                                        i28.N(3);
                                    } else {
                                        i28.N(4);
                                    }
                                    i28.i(3).f4520g = ((ViewGroup.MarginLayoutParams) c0383e).topMargin;
                                    i28.i(5).f4520g = ((ViewGroup.MarginLayoutParams) c0383e).bottomMargin;
                                } else {
                                    i28.N(3);
                                    i28.L(0);
                                }
                            }
                            String str2 = c0383e.f4790G;
                            if (str2 == null || str2.length() == 0) {
                                i28.f4543W = RecyclerView.f2111C0;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i9 = i8;
                                    i10 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i9 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i8;
                                    i10 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i10);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = RecyclerView.f2111C0;
                                } else {
                                    String substring3 = str2.substring(i10, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > RecyclerView.f2111C0 && parseFloat3 > RecyclerView.f2111C0) {
                                                parseFloat = i9 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    parseFloat = RecyclerView.f2111C0;
                                }
                                if (parseFloat > RecyclerView.f2111C0) {
                                    i28.f4543W = parseFloat;
                                    i28.f4544X = i9;
                                }
                            }
                            float f7 = c0383e.f4791H;
                            float[] fArr = i28.f4565k0;
                            fArr[0] = f7;
                            fArr[1] = c0383e.f4792I;
                            i28.f4562i0 = c0383e.J;
                            i28.f4563j0 = c0383e.f4793K;
                            int i43 = c0383e.f4808Z;
                            if (i43 >= 0 && i43 <= 3) {
                                i28.f4576q = i43;
                            }
                            int i44 = c0383e.f4794L;
                            int i45 = c0383e.f4796N;
                            int i46 = c0383e.f4798P;
                            float f8 = c0383e.f4800R;
                            i28.f4577r = i44;
                            i28.f4580u = i45;
                            if (i46 == Integer.MAX_VALUE) {
                                i46 = 0;
                            }
                            i28.f4581v = i46;
                            i28.f4582w = f8;
                            if (f8 > RecyclerView.f2111C0 && f8 < 1.0f && i44 == 0) {
                                i28.f4577r = 2;
                            }
                            int i47 = c0383e.f4795M;
                            int i48 = c0383e.f4797O;
                            int i49 = c0383e.f4799Q;
                            float f9 = c0383e.f4801S;
                            i28.f4578s = i47;
                            i28.f4583x = i48;
                            if (i49 == Integer.MAX_VALUE) {
                                i49 = 0;
                            }
                            i28.f4584y = i49;
                            i28.f4585z = f9;
                            if (f9 > RecyclerView.f2111C0 && f9 < 1.0f && i47 == 0) {
                                i28.f4578s = 2;
                            }
                            i27++;
                            constraintLayout = this;
                            childCount3 = i3;
                        }
                    }
                    i3 = childCount3;
                    i27++;
                    constraintLayout = this;
                    childCount3 = i3;
                }
            }
            if (z2) {
                eVar.f4598r0.n(eVar);
            }
        }
        eVar.f4602w0.getClass();
        l(eVar, this.i, i, i2);
        int q2 = eVar.q();
        int k2 = eVar.k();
        boolean z5 = eVar.f4590E0;
        boolean z6 = eVar.f4591F0;
        C0384f c0384f = this.f1901o;
        int i50 = c0384f.e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0384f.f4851d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i50, i2, 0) & 16777215;
        int min = Math.min(this.f1894f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1895g, resolveSizeAndState2);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d i = i(view);
        if ((view instanceof C0394p) && !(i instanceof w.h)) {
            C0383e c0383e = (C0383e) view.getLayoutParams();
            w.h hVar = new w.h();
            c0383e.f4837p0 = hVar;
            c0383e.f4816d0 = true;
            hVar.S(c0383e.f4804V);
        }
        if (view instanceof AbstractC0381c) {
            AbstractC0381c abstractC0381c = (AbstractC0381c) view;
            abstractC0381c.i();
            ((C0383e) view.getLayoutParams()).f4817e0 = true;
            ArrayList arrayList = this.f1891b;
            if (!arrayList.contains(abstractC0381c)) {
                arrayList.add(abstractC0381c);
            }
        }
        this.f1890a.put(view.getId(), view);
        this.f1896h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1890a.remove(view.getId());
        d i = i(view);
        this.f1892c.f4597q0.remove(i);
        i.C();
        this.f1891b.remove(view);
        this.f1896h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1896h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0392n c0392n) {
        this.j = c0392n;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1890a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1895g) {
            return;
        }
        this.f1895g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1894f) {
            return;
        }
        this.f1894f = i;
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
        if (i == this.f1893d) {
            return;
        }
        this.f1893d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0393o abstractC0393o) {
        i iVar = this.f1897k;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        e eVar = this.f1892c;
        eVar.f4589D0 = i;
        C0355c.f4403q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1890a = new SparseArray();
        this.f1891b = new ArrayList(4);
        this.f1892c = new e();
        this.f1893d = 0;
        this.e = 0;
        this.f1894f = Integer.MAX_VALUE;
        this.f1895g = Integer.MAX_VALUE;
        this.f1896h = true;
        this.i = 257;
        this.j = null;
        this.f1897k = null;
        this.f1898l = -1;
        this.f1899m = new HashMap();
        this.f1900n = new SparseArray();
        this.f1901o = new C0384f(this, this);
        j(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0383e c0383e = new C0383e(layoutParams);
        c0383e.f4809a = -1;
        c0383e.f4811b = -1;
        c0383e.f4813c = -1.0f;
        c0383e.f4815d = true;
        c0383e.e = -1;
        c0383e.f4818f = -1;
        c0383e.f4820g = -1;
        c0383e.f4822h = -1;
        c0383e.i = -1;
        c0383e.j = -1;
        c0383e.f4826k = -1;
        c0383e.f4828l = -1;
        c0383e.f4830m = -1;
        c0383e.f4832n = -1;
        c0383e.f4834o = -1;
        c0383e.f4836p = -1;
        c0383e.f4838q = 0;
        c0383e.f4839r = RecyclerView.f2111C0;
        c0383e.f4840s = -1;
        c0383e.f4841t = -1;
        c0383e.f4842u = -1;
        c0383e.f4843v = -1;
        c0383e.f4844w = Integer.MIN_VALUE;
        c0383e.f4845x = Integer.MIN_VALUE;
        c0383e.f4846y = Integer.MIN_VALUE;
        c0383e.f4847z = Integer.MIN_VALUE;
        c0383e.f4784A = Integer.MIN_VALUE;
        c0383e.f4785B = Integer.MIN_VALUE;
        c0383e.f4786C = Integer.MIN_VALUE;
        c0383e.f4787D = 0;
        c0383e.f4788E = 0.5f;
        c0383e.f4789F = 0.5f;
        c0383e.f4790G = null;
        c0383e.f4791H = -1.0f;
        c0383e.f4792I = -1.0f;
        c0383e.J = 0;
        c0383e.f4793K = 0;
        c0383e.f4794L = 0;
        c0383e.f4795M = 0;
        c0383e.f4796N = 0;
        c0383e.f4797O = 0;
        c0383e.f4798P = 0;
        c0383e.f4799Q = 0;
        c0383e.f4800R = 1.0f;
        c0383e.f4801S = 1.0f;
        c0383e.f4802T = -1;
        c0383e.f4803U = -1;
        c0383e.f4804V = -1;
        c0383e.f4805W = false;
        c0383e.f4806X = false;
        c0383e.f4807Y = null;
        c0383e.f4808Z = 0;
        c0383e.f4810a0 = true;
        c0383e.f4812b0 = true;
        c0383e.f4814c0 = false;
        c0383e.f4816d0 = false;
        c0383e.f4817e0 = false;
        c0383e.f4819f0 = -1;
        c0383e.f4821g0 = -1;
        c0383e.f4823h0 = -1;
        c0383e.f4824i0 = -1;
        c0383e.f4825j0 = Integer.MIN_VALUE;
        c0383e.f4827k0 = Integer.MIN_VALUE;
        c0383e.f4829l0 = 0.5f;
        c0383e.f4837p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0383e).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c0383e).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c0383e).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c0383e).bottomMargin = marginLayoutParams.bottomMargin;
            c0383e.setMarginStart(marginLayoutParams.getMarginStart());
            c0383e.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (layoutParams instanceof C0383e) {
            C0383e c0383e2 = (C0383e) layoutParams;
            c0383e.f4809a = c0383e2.f4809a;
            c0383e.f4811b = c0383e2.f4811b;
            c0383e.f4813c = c0383e2.f4813c;
            c0383e.f4815d = c0383e2.f4815d;
            c0383e.e = c0383e2.e;
            c0383e.f4818f = c0383e2.f4818f;
            c0383e.f4820g = c0383e2.f4820g;
            c0383e.f4822h = c0383e2.f4822h;
            c0383e.i = c0383e2.i;
            c0383e.j = c0383e2.j;
            c0383e.f4826k = c0383e2.f4826k;
            c0383e.f4828l = c0383e2.f4828l;
            c0383e.f4830m = c0383e2.f4830m;
            c0383e.f4832n = c0383e2.f4832n;
            c0383e.f4834o = c0383e2.f4834o;
            c0383e.f4836p = c0383e2.f4836p;
            c0383e.f4838q = c0383e2.f4838q;
            c0383e.f4839r = c0383e2.f4839r;
            c0383e.f4840s = c0383e2.f4840s;
            c0383e.f4841t = c0383e2.f4841t;
            c0383e.f4842u = c0383e2.f4842u;
            c0383e.f4843v = c0383e2.f4843v;
            c0383e.f4844w = c0383e2.f4844w;
            c0383e.f4845x = c0383e2.f4845x;
            c0383e.f4846y = c0383e2.f4846y;
            c0383e.f4847z = c0383e2.f4847z;
            c0383e.f4784A = c0383e2.f4784A;
            c0383e.f4785B = c0383e2.f4785B;
            c0383e.f4786C = c0383e2.f4786C;
            c0383e.f4787D = c0383e2.f4787D;
            c0383e.f4788E = c0383e2.f4788E;
            c0383e.f4789F = c0383e2.f4789F;
            c0383e.f4790G = c0383e2.f4790G;
            c0383e.f4791H = c0383e2.f4791H;
            c0383e.f4792I = c0383e2.f4792I;
            c0383e.J = c0383e2.J;
            c0383e.f4793K = c0383e2.f4793K;
            c0383e.f4805W = c0383e2.f4805W;
            c0383e.f4806X = c0383e2.f4806X;
            c0383e.f4794L = c0383e2.f4794L;
            c0383e.f4795M = c0383e2.f4795M;
            c0383e.f4796N = c0383e2.f4796N;
            c0383e.f4798P = c0383e2.f4798P;
            c0383e.f4797O = c0383e2.f4797O;
            c0383e.f4799Q = c0383e2.f4799Q;
            c0383e.f4800R = c0383e2.f4800R;
            c0383e.f4801S = c0383e2.f4801S;
            c0383e.f4802T = c0383e2.f4802T;
            c0383e.f4803U = c0383e2.f4803U;
            c0383e.f4804V = c0383e2.f4804V;
            c0383e.f4810a0 = c0383e2.f4810a0;
            c0383e.f4812b0 = c0383e2.f4812b0;
            c0383e.f4814c0 = c0383e2.f4814c0;
            c0383e.f4816d0 = c0383e2.f4816d0;
            c0383e.f4819f0 = c0383e2.f4819f0;
            c0383e.f4821g0 = c0383e2.f4821g0;
            c0383e.f4823h0 = c0383e2.f4823h0;
            c0383e.f4824i0 = c0383e2.f4824i0;
            c0383e.f4825j0 = c0383e2.f4825j0;
            c0383e.f4827k0 = c0383e2.f4827k0;
            c0383e.f4829l0 = c0383e2.f4829l0;
            c0383e.f4807Y = c0383e2.f4807Y;
            c0383e.f4808Z = c0383e2.f4808Z;
            c0383e.f4837p0 = c0383e2.f4837p0;
        }
        return c0383e;
    }
}
