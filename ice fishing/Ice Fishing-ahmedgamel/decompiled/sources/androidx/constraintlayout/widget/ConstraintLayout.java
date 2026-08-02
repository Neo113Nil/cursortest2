package androidx.constraintlayout.widget;

import N6.h;
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
import com.anythink.basead.b.b.j;
import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.n.a.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import o1.C4797a;
import org.xmlpull.v1.XmlPullParserException;
import u.C5048c;
import w.C5126a;
import w.C5130e;
import w.k;
import x.AbstractC5177p;
import x.C5164c;
import x.C5166e;
import x.C5170i;
import x.C5172k;
import x.C5174m;
import z.c;
import z.d;
import z.e;
import z.f;
import z.g;
import z.n;
import z.o;
import z.p;
import z.r;
import z.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: I, reason: collision with root package name */
    public static s f4611I;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4612A;

    /* renamed from: B, reason: collision with root package name */
    public int f4613B;

    /* renamed from: C, reason: collision with root package name */
    public n f4614C;

    /* renamed from: D, reason: collision with root package name */
    public C4797a f4615D;

    /* renamed from: E, reason: collision with root package name */
    public int f4616E;

    /* renamed from: F, reason: collision with root package name */
    public HashMap f4617F;

    /* renamed from: G, reason: collision with root package name */
    public final SparseArray f4618G;

    /* renamed from: H, reason: collision with root package name */
    public final f f4619H;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f4620n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4621u;

    /* renamed from: v, reason: collision with root package name */
    public final w.f f4622v;

    /* renamed from: w, reason: collision with root package name */
    public int f4623w;

    /* renamed from: x, reason: collision with root package name */
    public int f4624x;

    /* renamed from: y, reason: collision with root package name */
    public int f4625y;

    /* renamed from: z, reason: collision with root package name */
    public int f4626z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4620n = new SparseArray();
        this.f4621u = new ArrayList(4);
        this.f4622v = new w.f();
        this.f4623w = 0;
        this.f4624x = 0;
        this.f4625y = Integer.MAX_VALUE;
        this.f4626z = Integer.MAX_VALUE;
        this.f4612A = true;
        this.f4613B = 257;
        this.f4614C = null;
        this.f4615D = null;
        this.f4616E = -1;
        this.f4617F = new HashMap();
        this.f4618G = new SparseArray();
        this.f4619H = new f(this, this);
        i(attributeSet, 0);
    }

    public static e g() {
        e eVar = new e(-2, -2);
        eVar.f42016a = -1;
        eVar.f42018b = -1;
        eVar.f42020c = -1.0f;
        eVar.f42022d = true;
        eVar.f42024e = -1;
        eVar.f42026f = -1;
        eVar.f42028g = -1;
        eVar.f42030h = -1;
        eVar.i = -1;
        eVar.f42033j = -1;
        eVar.f42035k = -1;
        eVar.f42037l = -1;
        eVar.f42039m = -1;
        eVar.f42040n = -1;
        eVar.f42042o = -1;
        eVar.f42044p = -1;
        eVar.f42046q = 0;
        eVar.f42047r = 0.0f;
        eVar.f42048s = -1;
        eVar.f42049t = -1;
        eVar.f42050u = -1;
        eVar.f42051v = -1;
        eVar.f42052w = Integer.MIN_VALUE;
        eVar.f42053x = Integer.MIN_VALUE;
        eVar.f42054y = Integer.MIN_VALUE;
        eVar.f42055z = Integer.MIN_VALUE;
        eVar.f41992A = Integer.MIN_VALUE;
        eVar.f41993B = Integer.MIN_VALUE;
        eVar.f41994C = Integer.MIN_VALUE;
        eVar.f41995D = 0;
        eVar.f41996E = 0.5f;
        eVar.f41997F = 0.5f;
        eVar.f41998G = null;
        eVar.f41999H = -1.0f;
        eVar.f42000I = -1.0f;
        eVar.J = 0;
        eVar.f42001K = 0;
        eVar.f42002L = 0;
        eVar.f42003M = 0;
        eVar.f42004N = 0;
        eVar.f42005O = 0;
        eVar.f42006P = 0;
        eVar.f42007Q = 0;
        eVar.f42008R = 1.0f;
        eVar.f42009S = 1.0f;
        eVar.f42010T = -1;
        eVar.f42011U = -1;
        eVar.f42012V = -1;
        eVar.f42013W = false;
        eVar.f42014X = false;
        eVar.Y = null;
        eVar.f42015Z = 0;
        eVar.f42017a0 = true;
        eVar.f42019b0 = true;
        eVar.f42021c0 = false;
        eVar.f42023d0 = false;
        eVar.f42025e0 = false;
        eVar.f42027f0 = -1;
        eVar.f42029g0 = -1;
        eVar.f42031h0 = -1;
        eVar.f42032i0 = -1;
        eVar.f42034j0 = Integer.MIN_VALUE;
        eVar.f42036k0 = Integer.MIN_VALUE;
        eVar.f42038l0 = 0.5f;
        eVar.f42045p0 = new C5130e();
        return eVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f4611I == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f4611I = sVar;
        }
        return f4611I;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f4621u;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i6 = (int) ((parseInt / 1080.0f) * width);
                        int i9 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i6;
                        float f9 = i9;
                        float f10 = i6 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f9, f10, f9, paint);
                        float parseInt4 = i9 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f9, f10, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f10, f9, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f4612A = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f42016a = -1;
        eVar.f42018b = -1;
        eVar.f42020c = -1.0f;
        eVar.f42022d = true;
        eVar.f42024e = -1;
        eVar.f42026f = -1;
        eVar.f42028g = -1;
        eVar.f42030h = -1;
        eVar.i = -1;
        eVar.f42033j = -1;
        eVar.f42035k = -1;
        eVar.f42037l = -1;
        eVar.f42039m = -1;
        eVar.f42040n = -1;
        eVar.f42042o = -1;
        eVar.f42044p = -1;
        eVar.f42046q = 0;
        eVar.f42047r = 0.0f;
        eVar.f42048s = -1;
        eVar.f42049t = -1;
        eVar.f42050u = -1;
        eVar.f42051v = -1;
        eVar.f42052w = Integer.MIN_VALUE;
        eVar.f42053x = Integer.MIN_VALUE;
        eVar.f42054y = Integer.MIN_VALUE;
        eVar.f42055z = Integer.MIN_VALUE;
        eVar.f41992A = Integer.MIN_VALUE;
        eVar.f41993B = Integer.MIN_VALUE;
        eVar.f41994C = Integer.MIN_VALUE;
        eVar.f41995D = 0;
        eVar.f41996E = 0.5f;
        eVar.f41997F = 0.5f;
        eVar.f41998G = null;
        eVar.f41999H = -1.0f;
        eVar.f42000I = -1.0f;
        eVar.J = 0;
        eVar.f42001K = 0;
        eVar.f42002L = 0;
        eVar.f42003M = 0;
        eVar.f42004N = 0;
        eVar.f42005O = 0;
        eVar.f42006P = 0;
        eVar.f42007Q = 0;
        eVar.f42008R = 1.0f;
        eVar.f42009S = 1.0f;
        eVar.f42010T = -1;
        eVar.f42011U = -1;
        eVar.f42012V = -1;
        eVar.f42013W = false;
        eVar.f42014X = false;
        eVar.Y = null;
        eVar.f42015Z = 0;
        eVar.f42017a0 = true;
        eVar.f42019b0 = true;
        eVar.f42021c0 = false;
        eVar.f42023d0 = false;
        eVar.f42025e0 = false;
        eVar.f42027f0 = -1;
        eVar.f42029g0 = -1;
        eVar.f42031h0 = -1;
        eVar.f42032i0 = -1;
        eVar.f42034j0 = Integer.MIN_VALUE;
        eVar.f42036k0 = Integer.MIN_VALUE;
        eVar.f42038l0 = 0.5f;
        eVar.f42045p0 = new C5130e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42184b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i4 = d.f41991a.get(index);
            switch (i4) {
                case 1:
                    eVar.f42012V = obtainStyledAttributes.getInt(index, eVar.f42012V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, eVar.f42044p);
                    eVar.f42044p = resourceId;
                    if (resourceId == -1) {
                        eVar.f42044p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f42046q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42046q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, eVar.f42047r) % 360.0f;
                    eVar.f42047r = f2;
                    if (f2 < 0.0f) {
                        eVar.f42047r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f42016a = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f42016a);
                    break;
                case 6:
                    eVar.f42018b = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f42018b);
                    break;
                case 7:
                    eVar.f42020c = obtainStyledAttributes.getFloat(index, eVar.f42020c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, eVar.f42024e);
                    eVar.f42024e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f42024e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, eVar.f42026f);
                    eVar.f42026f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f42026f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, eVar.f42028g);
                    eVar.f42028g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f42028g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, eVar.f42030h);
                    eVar.f42030h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f42030h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, eVar.i);
                    eVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, eVar.f42033j);
                    eVar.f42033j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f42033j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, eVar.f42035k);
                    eVar.f42035k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f42035k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, eVar.f42037l);
                    eVar.f42037l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f42037l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, eVar.f42039m);
                    eVar.f42039m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f42039m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, eVar.f42048s);
                    eVar.f42048s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f42048s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, eVar.f42049t);
                    eVar.f42049t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f42049t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, eVar.f42050u);
                    eVar.f42050u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f42050u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, eVar.f42051v);
                    eVar.f42051v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f42051v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f42052w = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42052w);
                    break;
                case 22:
                    eVar.f42053x = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42053x);
                    break;
                case 23:
                    eVar.f42054y = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42054y);
                    break;
                case 24:
                    eVar.f42055z = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42055z);
                    break;
                case 25:
                    eVar.f41992A = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41992A);
                    break;
                case 26:
                    eVar.f41993B = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41993B);
                    break;
                case 27:
                    eVar.f42013W = obtainStyledAttributes.getBoolean(index, eVar.f42013W);
                    break;
                case 28:
                    eVar.f42014X = obtainStyledAttributes.getBoolean(index, eVar.f42014X);
                    break;
                case 29:
                    eVar.f41996E = obtainStyledAttributes.getFloat(index, eVar.f41996E);
                    break;
                case 30:
                    eVar.f41997F = obtainStyledAttributes.getFloat(index, eVar.f41997F);
                    break;
                case 31:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    eVar.f42002L = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i9 = obtainStyledAttributes.getInt(index, 0);
                    eVar.f42003M = i9;
                    if (i9 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.f42004N = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42004N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, eVar.f42004N) == -2) {
                            eVar.f42004N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.f42006P = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42006P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, eVar.f42006P) == -2) {
                            eVar.f42006P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.f42008R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, eVar.f42008R));
                    eVar.f42002L = 2;
                    break;
                case 36:
                    try {
                        eVar.f42005O = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42005O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, eVar.f42005O) == -2) {
                            eVar.f42005O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.f42007Q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42007Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, eVar.f42007Q) == -2) {
                            eVar.f42007Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case j.f6592M /* 38 */:
                    eVar.f42009S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, eVar.f42009S));
                    eVar.f42003M = 2;
                    break;
                default:
                    switch (i4) {
                        case j.f6598S /* 44 */:
                            n.h(eVar, obtainStyledAttributes.getString(index));
                            break;
                        case j.f6599T /* 45 */:
                            eVar.f41999H = obtainStyledAttributes.getFloat(index, eVar.f41999H);
                            break;
                        case 46:
                            eVar.f42000I = obtainStyledAttributes.getFloat(index, eVar.f42000I);
                            break;
                        case 47:
                            eVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case j.f6602W /* 48 */:
                            eVar.f42001K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case j.f6603X /* 49 */:
                            eVar.f42010T = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f42010T);
                            break;
                        case 50:
                            eVar.f42011U = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f42011U);
                            break;
                        case 51:
                            eVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, eVar.f42040n);
                            eVar.f42040n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f42040n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case i.f15609d /* 53 */:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar.f42042o);
                            eVar.f42042o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f42042o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            eVar.f41995D = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41995D);
                            break;
                        case 55:
                            eVar.f41994C = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41994C);
                            break;
                        default:
                            switch (i4) {
                                case 64:
                                    n.g(eVar, obtainStyledAttributes, index, 0);
                                    break;
                                case j.v.f13362G /* 65 */:
                                    n.g(eVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.f42015Z = obtainStyledAttributes.getInt(index, eVar.f42015Z);
                                    break;
                                case j.v.f13368d /* 67 */:
                                    eVar.f42022d = obtainStyledAttributes.getBoolean(index, eVar.f42022d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f4626z;
    }

    public int getMaxWidth() {
        return this.f4625y;
    }

    public int getMinHeight() {
        return this.f4624x;
    }

    public int getMinWidth() {
        return this.f4623w;
    }

    public int getOptimizationLevel() {
        return this.f4622v.f41324D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        w.f fVar = this.f4622v;
        if (fVar.f41299j == null) {
            int id2 = getId();
            if (id2 != -1) {
                fVar.f41299j = getContext().getResources().getResourceEntryName(id2);
            } else {
                fVar.f41299j = "parent";
            }
        }
        if (fVar.f41297h0 == null) {
            fVar.f41297h0 = fVar.f41299j;
            Log.v("ConstraintLayout", " setDebugName " + fVar.f41297h0);
        }
        Iterator it = fVar.f41333q0.iterator();
        while (it.hasNext()) {
            C5130e c5130e = (C5130e) it.next();
            View view = c5130e.f41293f0;
            if (view != null) {
                if (c5130e.f41299j == null && (id = view.getId()) != -1) {
                    c5130e.f41299j = getContext().getResources().getResourceEntryName(id);
                }
                if (c5130e.f41297h0 == null) {
                    c5130e.f41297h0 = c5130e.f41299j;
                    Log.v("ConstraintLayout", " setDebugName " + c5130e.f41297h0);
                }
            }
        }
        fVar.n(sb);
        return sb.toString();
    }

    public final C5130e h(View view) {
        if (view == this) {
            return this.f4622v;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f42045p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f42045p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        w.f fVar = this.f4622v;
        fVar.f41293f0 = this;
        f fVar2 = this.f4619H;
        fVar.f41337u0 = fVar2;
        fVar.f41335s0.f41769f = fVar2;
        this.f4620n.put(getId(), this);
        this.f4614C = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f42184b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.f4623w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4623w);
                } else if (index == 17) {
                    this.f4624x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4624x);
                } else if (index == 14) {
                    this.f4625y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4625y);
                } else if (index == 15) {
                    this.f4626z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4626z);
                } else if (index == 113) {
                    this.f4613B = obtainStyledAttributes.getInt(index, this.f4613B);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4615D = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f4614C = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4614C = null;
                    }
                    this.f4616E = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        fVar.f41324D0 = this.f4613B;
        C5048c.f40917q = fVar.W(512);
    }

    public final void j(int i) {
        int eventType;
        h hVar;
        Context context = getContext();
        C4797a c4797a = new C4797a();
        c4797a.f39715b = new SparseArray();
        c4797a.f39716c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            hVar = null;
        } catch (IOException e9) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e9);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e10);
        }
        while (true) {
            char c9 = 1;
            if (eventType == 1) {
                this.f4615D = c4797a;
                return;
            }
            if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c9 = 4;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                if (c9 == 2) {
                    h hVar2 = new h(context, xml);
                    ((SparseArray) c4797a.f39715b).put(hVar2.f2058a, hVar2);
                    hVar = hVar2;
                } else if (c9 == 3) {
                    g gVar = new g(context, xml);
                    if (hVar != null) {
                        hVar.f2059b.add(gVar);
                    }
                } else if (c9 == 4) {
                    c4797a.a(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(w.f fVar, int i, int i4, int i6) {
        int i9;
        int max;
        int i10;
        int max2;
        int i11;
        boolean z6;
        int i12;
        int i13;
        boolean z9;
        int i14;
        boolean z10;
        ArrayList arrayList;
        int i15;
        boolean z11;
        boolean z12;
        C5172k c5172k;
        C5174m c5174m;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList2;
        int i19;
        int i20;
        int i21;
        boolean z13;
        Iterator it;
        Iterator it2;
        boolean z14;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i22 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar2 = this.f4619H;
        fVar2.f42057b = max3;
        fVar2.f42058c = max4;
        fVar2.f42059d = paddingWidth;
        fVar2.f42060e = i22;
        fVar2.f42061f = i4;
        fVar2.f42062g = i6;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i23 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i24 = size - paddingWidth;
        int i25 = size2 - i22;
        int i26 = fVar2.f42060e;
        int i27 = fVar2.f42059d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i9 = 0;
                } else {
                    i9 = Math.min(this.f4625y - i27, i24);
                    i23 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f4623w);
                i9 = max;
                i23 = 2;
            } else {
                i9 = 0;
                i23 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f4623w);
            i9 = max;
            i23 = 2;
        } else {
            i9 = i24;
            i23 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i10 = mode2 != 1073741824 ? 0 : Math.min(this.f4626z - i26, i25);
                i11 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f4624x);
                i10 = max2;
                i11 = 2;
            } else {
                i10 = 0;
                i11 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f4624x);
            i10 = max2;
            i11 = 2;
        } else {
            i10 = i25;
            i11 = 2;
        }
        int q8 = fVar.q();
        C5166e c5166e = fVar.f41335s0;
        int i28 = i9;
        if (i28 != q8 || i10 != fVar.k()) {
            c5166e.f41766c = true;
        }
        fVar.Y = 0;
        fVar.f41281Z = 0;
        int i29 = this.f4625y - i27;
        int[] iArr = fVar.f41260C;
        iArr[0] = i29;
        iArr[1] = this.f4626z - i26;
        fVar.f41285b0 = 0;
        fVar.f41287c0 = 0;
        fVar.M(i23);
        fVar.O(i28);
        fVar.N(i11);
        fVar.L(i10);
        int i30 = this.f4623w - i27;
        if (i30 < 0) {
            fVar.f41285b0 = 0;
        } else {
            fVar.f41285b0 = i30;
        }
        int i31 = this.f4624x - i26;
        if (i31 < 0) {
            fVar.f41287c0 = 0;
        } else {
            fVar.f41287c0 = i31;
        }
        fVar.f41340x0 = max5;
        fVar.f41341y0 = max3;
        l4.g gVar = fVar.f41334r0;
        gVar.getClass();
        f fVar3 = fVar.f41337u0;
        int size3 = fVar.f41333q0.size();
        int q9 = fVar.q();
        int k9 = fVar.k();
        boolean c9 = k.c(i, 128);
        boolean z15 = c9 || k.c(i, 64);
        if (z15) {
            int i32 = 0;
            while (i32 < size3) {
                C5130e c5130e = (C5130e) fVar.f41333q0.get(i32);
                boolean z16 = z15;
                int[] iArr2 = c5130e.f41311p0;
                i12 = size3;
                boolean z17 = (iArr2[0] == 3) && (iArr2[1] == 3) && c5130e.f41279W > 0.0f;
                if ((c5130e.x() && z17) || ((c5130e.y() && z17) || (c5130e instanceof w.h) || c5130e.x() || c5130e.y())) {
                    i13 = 1073741824;
                    z6 = false;
                    break;
                } else {
                    i32++;
                    z15 = z16;
                    size3 = i12;
                }
            }
        }
        z6 = z15;
        i12 = size3;
        i13 = 1073741824;
        boolean z18 = z6 & ((mode == i13 && mode2 == i13) || c9);
        if (z18) {
            int min = Math.min(iArr[0], i24);
            int min2 = Math.min(iArr[1], i25);
            if (mode == 1073741824 && fVar.q() != min) {
                fVar.O(min);
                fVar.f41335s0.f41765b = true;
            }
            if (mode2 == 1073741824 && fVar.k() != min2) {
                fVar.L(min2);
                fVar.f41335s0.f41765b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z19 = c5166e.f41765b;
                w.f fVar4 = c5166e.f41764a;
                if (z19 || c5166e.f41766c) {
                    Iterator it3 = fVar4.f41333q0.iterator();
                    while (it3.hasNext()) {
                        C5130e c5130e2 = (C5130e) it3.next();
                        c5130e2.h();
                        c5130e2.f41282a = false;
                        c5130e2.f41288d.n();
                        c5130e2.f41290e.m();
                    }
                    i18 = 0;
                    fVar4.h();
                    fVar4.f41282a = false;
                    fVar4.f41288d.n();
                    fVar4.f41290e.m();
                    c5166e.f41766c = false;
                } else {
                    i18 = 0;
                }
                c5166e.b(c5166e.f41767d);
                fVar4.Y = i18;
                fVar4.f41281Z = i18;
                int j6 = fVar4.j(i18);
                int j9 = fVar4.j(1);
                if (c5166e.f41765b) {
                    c5166e.c();
                }
                int r9 = fVar4.r();
                int s9 = fVar4.s();
                fVar4.f41288d.f41803h.d(r9);
                fVar4.f41290e.f41803h.d(s9);
                c5166e.g();
                ArrayList arrayList3 = c5166e.f41768e;
                z9 = z18;
                if (j6 == 2 || j9 == 2) {
                    if (c9) {
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC5177p) it4.next()).k()) {
                                    c9 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c9 && j6 == 2) {
                        fVar4.M(1);
                        arrayList2 = arrayList3;
                        fVar4.O(c5166e.d(fVar4, 0));
                        fVar4.f41288d.f41800e.d(fVar4.q());
                    } else {
                        arrayList2 = arrayList3;
                    }
                    if (c9 && j9 == 2) {
                        i19 = 1;
                        fVar4.N(1);
                        fVar4.L(c5166e.d(fVar4, 1));
                        fVar4.f41290e.f41800e.d(fVar4.k());
                        int[] iArr3 = fVar4.f41311p0;
                        i20 = iArr3[0];
                        if (i20 != i19 || i20 == 4) {
                            int q10 = fVar4.q() + r9;
                            fVar4.f41288d.i.d(q10);
                            fVar4.f41288d.f41800e.d(q10 - r9);
                            c5166e.g();
                            i21 = iArr3[1];
                            if (i21 != 1 || i21 == 4) {
                                int k10 = fVar4.k() + s9;
                                fVar4.f41290e.i.d(k10);
                                fVar4.f41290e.f41800e.d(k10 - s9);
                            }
                            c5166e.g();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC5177p abstractC5177p = (AbstractC5177p) it.next();
                            if (abstractC5177p.f41797b != fVar4 || abstractC5177p.f41802g) {
                                abstractC5177p.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC5177p abstractC5177p2 = (AbstractC5177p) it2.next();
                            if (z13 || abstractC5177p2.f41797b != fVar4) {
                                if (!abstractC5177p2.f41803h.f41780j || ((!abstractC5177p2.i.f41780j && !(abstractC5177p2 instanceof C5170i)) || (!abstractC5177p2.f41800e.f41780j && !(abstractC5177p2 instanceof C5164c) && !(abstractC5177p2 instanceof C5170i)))) {
                                    z14 = false;
                                    break;
                                }
                            }
                        }
                        z14 = true;
                        fVar4.M(j6);
                        fVar4.N(j9);
                        z10 = z14;
                        i17 = 1073741824;
                        i14 = 2;
                    }
                } else {
                    arrayList2 = arrayList3;
                }
                i19 = 1;
                int[] iArr32 = fVar4.f41311p0;
                i20 = iArr32[0];
                if (i20 != i19) {
                }
                int q102 = fVar4.q() + r9;
                fVar4.f41288d.i.d(q102);
                fVar4.f41288d.f41800e.d(q102 - r9);
                c5166e.g();
                i21 = iArr32[1];
                if (i21 != 1) {
                }
                int k102 = fVar4.k() + s9;
                fVar4.f41290e.i.d(k102);
                fVar4.f41290e.f41800e.d(k102 - s9);
                c5166e.g();
                z13 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z14 = true;
                fVar4.M(j6);
                fVar4.N(j9);
                z10 = z14;
                i17 = 1073741824;
                i14 = 2;
            } else {
                z9 = z18;
                boolean z20 = c5166e.f41765b;
                w.f fVar5 = c5166e.f41764a;
                if (z20) {
                    Iterator it5 = fVar5.f41333q0.iterator();
                    while (it5.hasNext()) {
                        C5130e c5130e3 = (C5130e) it5.next();
                        c5130e3.h();
                        c5130e3.f41282a = false;
                        C5172k c5172k2 = c5130e3.f41288d;
                        c5172k2.f41800e.f41780j = false;
                        c5172k2.f41802g = false;
                        c5172k2.n();
                        C5174m c5174m2 = c5130e3.f41290e;
                        c5174m2.f41800e.f41780j = false;
                        c5174m2.f41802g = false;
                        c5174m2.m();
                    }
                    i16 = 0;
                    fVar5.h();
                    fVar5.f41282a = false;
                    C5172k c5172k3 = fVar5.f41288d;
                    c5172k3.f41800e.f41780j = false;
                    c5172k3.f41802g = false;
                    c5172k3.n();
                    C5174m c5174m3 = fVar5.f41290e;
                    c5174m3.f41800e.f41780j = false;
                    c5174m3.f41802g = false;
                    c5174m3.m();
                    c5166e.c();
                } else {
                    i16 = 0;
                }
                c5166e.b(c5166e.f41767d);
                fVar5.Y = i16;
                fVar5.f41281Z = i16;
                fVar5.f41288d.f41803h.d(i16);
                fVar5.f41290e.f41803h.d(i16);
                i17 = 1073741824;
                if (mode == 1073741824) {
                    z10 = fVar.T(i16, c9);
                    i14 = 1;
                } else {
                    i14 = 0;
                    z10 = true;
                }
                if (mode2 == 1073741824) {
                    z10 &= fVar.T(1, c9);
                    i14++;
                }
            }
            if (z10) {
                fVar.P(mode == i17, mode2 == i17);
            }
        } else {
            z9 = z18;
            i14 = 0;
            z10 = false;
        }
        if (z10 && i14 == 2) {
            return;
        }
        int i33 = fVar.f41324D0;
        if (i12 > 0) {
            int size4 = fVar.f41333q0.size();
            boolean W3 = fVar.W(64);
            f fVar6 = fVar.f41337u0;
            for (int i34 = 0; i34 < size4; i34++) {
                C5130e c5130e4 = (C5130e) fVar.f41333q0.get(i34);
                if (!(c5130e4 instanceof w.i) && !(c5130e4 instanceof C5126a) && !c5130e4.f41263F && (!W3 || (c5172k = c5130e4.f41288d) == null || (c5174m = c5130e4.f41290e) == null || !c5172k.f41800e.f41780j || !c5174m.f41800e.f41780j)) {
                    int j10 = c5130e4.j(0);
                    int j11 = c5130e4.j(1);
                    boolean z21 = j10 == 3 && c5130e4.f41313r != 1 && j11 == 3 && c5130e4.f41314s != 1;
                    if (!z21 && fVar.W(1) && !(c5130e4 instanceof w.h)) {
                        if (j10 == 3 && c5130e4.f41313r == 0 && j11 != 3 && !c5130e4.x()) {
                            z21 = true;
                        }
                        if (j11 == 3 && c5130e4.f41314s == 0 && j10 != 3 && !c5130e4.x()) {
                            z21 = true;
                        }
                        if ((j10 == 3 || j11 == 3) && c5130e4.f41279W > 0.0f) {
                            z21 = true;
                        }
                    }
                    if (!z21) {
                        gVar.q(0, c5130e4, fVar6);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.f42056a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i35 = 0; i35 < childCount2; i35++) {
                constraintLayout.getChildAt(i35);
            }
            ArrayList arrayList4 = constraintLayout.f4621u;
            int size5 = arrayList4.size();
            if (size5 > 0) {
                for (int i36 = 0; i36 < size5; i36++) {
                    ((c) arrayList4.get(i36)).getClass();
                }
            }
        }
        gVar.w(fVar);
        ArrayList arrayList5 = (ArrayList) gVar.f38916u;
        int size6 = arrayList5.size();
        if (i12 > 0) {
            gVar.u(fVar, 0, q9, k9);
        }
        if (size6 > 0) {
            int[] iArr4 = fVar.f41311p0;
            boolean z22 = iArr4[0] == 2;
            boolean z23 = iArr4[1] == 2;
            int q11 = fVar.q();
            w.f fVar7 = (w.f) gVar.f38918w;
            int max7 = Math.max(q11, fVar7.f41285b0);
            int max8 = Math.max(fVar.k(), fVar7.f41287c0);
            int i37 = 0;
            boolean z24 = false;
            while (i37 < size6) {
                C5130e c5130e5 = (C5130e) arrayList5.get(i37);
                if (c5130e5 instanceof w.h) {
                    int q12 = c5130e5.q();
                    z11 = z23;
                    int k11 = c5130e5.k();
                    z12 = z22;
                    boolean q13 = z24 | gVar.q(1, c5130e5, fVar3);
                    int q14 = c5130e5.q();
                    boolean z25 = q13;
                    int k12 = c5130e5.k();
                    if (q14 != q12) {
                        c5130e5.O(q14);
                        if (z12 && c5130e5.r() + c5130e5.f41277U > max7) {
                            max7 = Math.max(max7, c5130e5.i(4).e() + c5130e5.r() + c5130e5.f41277U);
                        }
                        z25 = true;
                    }
                    if (k12 != k11) {
                        c5130e5.L(k12);
                        if (z11 && c5130e5.s() + c5130e5.f41278V > max8) {
                            max8 = Math.max(max8, c5130e5.i(5).e() + c5130e5.s() + c5130e5.f41278V);
                        }
                        z25 = true;
                    }
                    z24 = z25 | ((w.h) c5130e5).f41393y0;
                } else {
                    z11 = z23;
                    z12 = z22;
                }
                i37++;
                z23 = z11;
                z22 = z12;
            }
            boolean z26 = z23;
            boolean z27 = z22;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C5130e c5130e6 = (C5130e) arrayList5.get(i39);
                    if (((c5130e6 instanceof w.j) && !(c5130e6 instanceof w.h)) || (c5130e6 instanceof w.i) || c5130e6.f41295g0 == 8 || ((z9 && c5130e6.f41288d.f41800e.f41780j && c5130e6.f41290e.f41800e.f41780j) || (c5130e6 instanceof w.h))) {
                        arrayList = arrayList5;
                        i15 = size6;
                    } else {
                        int q15 = c5130e6.q();
                        int k13 = c5130e6.k();
                        arrayList = arrayList5;
                        int i40 = c5130e6.f41283a0;
                        i15 = size6;
                        boolean q16 = gVar.q(i38 == 1 ? 2 : 1, c5130e6, fVar3) | z24;
                        int q17 = c5130e6.q();
                        boolean z28 = q16;
                        int k14 = c5130e6.k();
                        if (q17 != q15) {
                            c5130e6.O(q17);
                            if (z27 && c5130e6.r() + c5130e6.f41277U > max7) {
                                max7 = Math.max(max7, c5130e6.i(4).e() + c5130e6.r() + c5130e6.f41277U);
                            }
                            z28 = true;
                        }
                        if (k14 != k13) {
                            c5130e6.L(k14);
                            if (z26 && c5130e6.s() + c5130e6.f41278V > max8) {
                                max8 = Math.max(max8, c5130e6.i(5).e() + c5130e6.s() + c5130e6.f41278V);
                            }
                            z28 = true;
                        }
                        z24 = (!c5130e6.f41262E || i40 == c5130e6.f41283a0) ? z28 : true;
                    }
                    i39++;
                    arrayList5 = arrayList;
                    size6 = i15;
                }
                ArrayList arrayList6 = arrayList5;
                int i41 = size6;
                if (!z24) {
                    break;
                }
                i38++;
                gVar.u(fVar, i38, q9, k9);
                arrayList5 = arrayList6;
                size6 = i41;
                z24 = false;
            }
        }
        fVar.f41324D0 = i33;
        C5048c.f40917q = fVar.W(512);
    }

    public final void l(C5130e c5130e, e eVar, SparseArray sparseArray, int i, int i4) {
        View view = (View) this.f4620n.get(i);
        C5130e c5130e2 = (C5130e) sparseArray.get(i);
        if (c5130e2 == null || view == null || !(view.getLayoutParams() instanceof e)) {
            return;
        }
        eVar.f42021c0 = true;
        if (i4 == 6) {
            e eVar2 = (e) view.getLayoutParams();
            eVar2.f42021c0 = true;
            eVar2.f42045p0.f41262E = true;
        }
        c5130e.i(6).b(c5130e2.i(i4), eVar.f41995D, eVar.f41994C, true);
        c5130e.f41262E = true;
        c5130e.i(3).j();
        c5130e.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            C5130e c5130e = eVar.f42045p0;
            if (childAt.getVisibility() != 8 || eVar.f42023d0 || eVar.f42025e0 || isInEditMode) {
                int r9 = c5130e.r();
                int s9 = c5130e.s();
                childAt.layout(r9, s9, c5130e.q() + r9, c5130e.k() + s9);
            }
        }
        ArrayList arrayList = this.f4621u;
        int size = arrayList.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((c) arrayList.get(i11)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0341  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i4) {
        boolean z6;
        int i6;
        boolean z9;
        C5130e c5130e;
        int i9;
        C5130e c5130e2;
        int i10;
        int i11;
        int i12;
        C5130e c5130e3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C5130e c5130e4;
        int i18;
        int i19;
        C5130e c5130e5;
        e eVar;
        int i20;
        C5130e c5130e6;
        float f2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        float parseFloat;
        int i26;
        char c9;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i27;
        String resourceName;
        int id;
        C5130e c5130e7;
        ConstraintLayout constraintLayout = this;
        boolean z10 = constraintLayout.f4612A;
        constraintLayout.f4612A = z10;
        int i28 = 0;
        int i29 = 1;
        if (!z10) {
            int childCount = constraintLayout.getChildCount();
            int i30 = 0;
            while (true) {
                if (i30 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i30).isLayoutRequested()) {
                    constraintLayout.f4612A = true;
                    break;
                }
                i30++;
            }
        }
        boolean z11 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        w.f fVar = constraintLayout.f4622v;
        fVar.f41338v0 = z11;
        if (constraintLayout.f4612A) {
            constraintLayout.f4612A = false;
            int childCount2 = constraintLayout.getChildCount();
            int i31 = 0;
            while (true) {
                if (i31 >= childCount2) {
                    z6 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                        z6 = true;
                        break;
                    }
                    i31++;
                }
            }
            if (z6) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i32 = 0; i32 < childCount3; i32++) {
                    C5130e h3 = constraintLayout.h(constraintLayout.getChildAt(i32));
                    if (h3 != null) {
                        h3.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    int i33 = 0;
                    while (i33 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i33);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f4617F == null) {
                                    constraintLayout.f4617F = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                i27 = i29;
                                try {
                                    constraintLayout.f4617F.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i27 = i29;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i27 = i29;
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f4620n.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c5130e7 = view == null ? null : ((e) view.getLayoutParams()).f42045p0;
                                c5130e7.f41297h0 = resourceName;
                                i33++;
                                i29 = i27;
                            }
                        }
                        c5130e7 = fVar;
                        c5130e7.f41297h0 = resourceName;
                        i33++;
                        i29 = i27;
                    }
                }
                int i34 = i29;
                if (constraintLayout.f4616E != -1) {
                    for (int i35 = 0; i35 < childCount3; i35++) {
                        constraintLayout.getChildAt(i35).getId();
                    }
                }
                n nVar = constraintLayout.f4614C;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                fVar.f41333q0.clear();
                ArrayList arrayList3 = constraintLayout.f4621u;
                int size = arrayList3.size();
                if (size > 0) {
                    int i36 = 0;
                    while (i36 < size) {
                        c cVar = (c) arrayList3.get(i36);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f41988x);
                        }
                        w.j jVar = cVar.f41987w;
                        if (jVar == null) {
                            arrayList = arrayList3;
                        } else {
                            jVar.f41402r0 = i28;
                            Arrays.fill(jVar.f41401q0, obj);
                            int i37 = i28;
                            while (i37 < cVar.f41985u) {
                                int i38 = cVar.f41984n[i37];
                                View view2 = (View) constraintLayout.f4620n.get(i38);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i38);
                                    HashMap hashMap = cVar.f41990z;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f9 = cVar.f(constraintLayout, str);
                                    if (f9 != 0) {
                                        cVar.f41984n[i37] = f9;
                                        hashMap.put(Integer.valueOf(f9), str);
                                        view2 = (View) constraintLayout.f4620n.get(f9);
                                    }
                                }
                                if (view2 != null) {
                                    w.j jVar2 = cVar.f41987w;
                                    C5130e h9 = constraintLayout.h(view2);
                                    jVar2.getClass();
                                    if (h9 != jVar2 && h9 != null) {
                                        int i39 = jVar2.f41402r0 + 1;
                                        C5130e[] c5130eArr = jVar2.f41401q0;
                                        arrayList2 = arrayList3;
                                        if (i39 > c5130eArr.length) {
                                            jVar2.f41401q0 = (C5130e[]) Arrays.copyOf(c5130eArr, c5130eArr.length * 2);
                                        }
                                        C5130e[] c5130eArr2 = jVar2.f41401q0;
                                        int i40 = jVar2.f41402r0;
                                        c5130eArr2[i40] = h9;
                                        jVar2.f41402r0 = i40 + 1;
                                        i37++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i37++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            cVar.f41987w.S();
                        }
                        i36++;
                        arrayList3 = arrayList;
                        obj = null;
                        i28 = 0;
                    }
                }
                int i41 = 2;
                for (int i42 = 0; i42 < childCount3; i42++) {
                    constraintLayout.getChildAt(i42);
                }
                SparseArray sparseArray = constraintLayout.f4618G;
                sparseArray.clear();
                sparseArray.put(0, fVar);
                sparseArray.put(constraintLayout.getId(), fVar);
                for (int i43 = 0; i43 < childCount3; i43++) {
                    View childAt2 = constraintLayout.getChildAt(i43);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i44 = 0;
                while (i44 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i44);
                    C5130e h10 = constraintLayout.h(childAt3);
                    if (h10 != null) {
                        e eVar2 = (e) childAt3.getLayoutParams();
                        fVar.f41333q0.add(h10);
                        C5130e c5130e8 = h10.f41276T;
                        if (c5130e8 != null) {
                            ((w.f) c5130e8).f41333q0.remove(h10);
                            h10.C();
                        }
                        h10.f41276T = fVar;
                        eVar2.a();
                        h10.f41295g0 = childAt3.getVisibility();
                        h10.f41293f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(h10, fVar.f41338v0);
                        }
                        if (eVar2.f42023d0) {
                            w.i iVar = (w.i) h10;
                            int i45 = eVar2.m0;
                            int i46 = eVar2.f42041n0;
                            float f10 = eVar2.f42043o0;
                            if (f10 == -1.0f) {
                                c9 = 65535;
                                if (i45 != -1) {
                                    if (i45 > -1) {
                                        iVar.f41395q0 = -1.0f;
                                        iVar.f41396r0 = i45;
                                        iVar.f41397s0 = -1;
                                    }
                                } else if (i46 != -1 && i46 > -1) {
                                    iVar.f41395q0 = -1.0f;
                                    iVar.f41396r0 = -1;
                                    iVar.f41397s0 = i46;
                                }
                                i6 = i44;
                                z9 = z6;
                                i23 = i41;
                            } else if (f10 > -1.0f) {
                                iVar.f41395q0 = f10;
                                c9 = 65535;
                                iVar.f41396r0 = -1;
                                iVar.f41397s0 = -1;
                                i6 = i44;
                                z9 = z6;
                                i23 = i41;
                            }
                        } else {
                            int i47 = eVar2.f42027f0;
                            int i48 = eVar2.f42029g0;
                            int i49 = eVar2.f42031h0;
                            int i50 = eVar2.f42032i0;
                            int i51 = eVar2.f42034j0;
                            int i52 = eVar2.f42036k0;
                            i6 = i44;
                            float f11 = eVar2.f42038l0;
                            int i53 = eVar2.f42044p;
                            z9 = z6;
                            if (i53 != -1) {
                                C5130e c5130e9 = (C5130e) sparseArray.get(i53);
                                if (c5130e9 != null) {
                                    float f12 = eVar2.f42047r;
                                    h10.v(7, 7, eVar2.f42046q, 0, c5130e9);
                                    h10.f41261D = f12;
                                }
                                constraintLayout = this;
                                c5130e6 = h10;
                                eVar = eVar2;
                                i13 = 4;
                                i12 = 2;
                            } else {
                                if (i47 != -1) {
                                    C5130e c5130e10 = (C5130e) sparseArray.get(i47);
                                    if (c5130e10 != null) {
                                        c5130e = h10;
                                        i9 = 2;
                                        c5130e.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar2).leftMargin, i51, c5130e10);
                                    } else {
                                        c5130e = h10;
                                        i9 = 2;
                                    }
                                } else {
                                    c5130e = h10;
                                    i9 = 2;
                                    if (i48 != -1 && (c5130e2 = (C5130e) sparseArray.get(i48)) != null) {
                                        c5130e.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar2).leftMargin, i51, c5130e2);
                                        i10 = 2;
                                        i11 = 4;
                                        if (i49 == -1) {
                                            C5130e c5130e11 = (C5130e) sparseArray.get(i49);
                                            if (c5130e11 != null) {
                                                c5130e.v(i11, i10, ((ViewGroup.MarginLayoutParams) eVar2).rightMargin, i52, c5130e11);
                                            }
                                            i12 = i10;
                                        } else {
                                            i12 = i10;
                                            if (i50 != -1 && (c5130e3 = (C5130e) sparseArray.get(i50)) != null) {
                                                c5130e.v(i11, i11, ((ViewGroup.MarginLayoutParams) eVar2).rightMargin, i52, c5130e3);
                                            }
                                        }
                                        i13 = i11;
                                        i14 = eVar2.i;
                                        if (i14 == -1) {
                                            C5130e c5130e12 = (C5130e) sparseArray.get(i14);
                                            if (c5130e12 != null) {
                                                i21 = 3;
                                                c5130e.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar2).topMargin, eVar2.f42053x, c5130e12);
                                            } else {
                                                i21 = 3;
                                            }
                                            i16 = i21;
                                            i17 = 5;
                                            i15 = -1;
                                        } else {
                                            int i54 = eVar2.f42033j;
                                            i15 = -1;
                                            if (i54 == -1 || (c5130e4 = (C5130e) sparseArray.get(i54)) == null) {
                                                i16 = 3;
                                                i17 = 5;
                                            } else {
                                                c5130e.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar2).topMargin, eVar2.f42053x, c5130e4);
                                                i16 = 3;
                                                i17 = 5;
                                            }
                                        }
                                        i18 = eVar2.f42035k;
                                        if (i18 == i15) {
                                            C5130e c5130e13 = (C5130e) sparseArray.get(i18);
                                            if (c5130e13 != null) {
                                                int i55 = i16;
                                                c5130e.v(i17, i55, ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin, eVar2.f42055z, c5130e13);
                                                i19 = i55;
                                            } else {
                                                i19 = i16;
                                            }
                                        } else {
                                            i19 = i16;
                                            int i56 = eVar2.f42037l;
                                            if (i56 != i15 && (c5130e5 = (C5130e) sparseArray.get(i56)) != null) {
                                                c5130e.v(i17, i17, ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin, eVar2.f42055z, c5130e5);
                                            }
                                        }
                                        eVar = eVar2;
                                        i20 = eVar.f42039m;
                                        if (i20 == -1) {
                                            constraintLayout = this;
                                            c5130e6 = c5130e;
                                            constraintLayout.l(c5130e6, eVar, sparseArray, i20, 6);
                                        } else {
                                            int i57 = eVar.f42040n;
                                            if (i57 != -1) {
                                                constraintLayout = this;
                                                c5130e6 = c5130e;
                                                constraintLayout.l(c5130e6, eVar, sparseArray, i57, i19);
                                            } else {
                                                int i58 = eVar.f42042o;
                                                constraintLayout = this;
                                                c5130e6 = c5130e;
                                                int i59 = i17;
                                                if (i58 != -1) {
                                                    constraintLayout.l(c5130e6, eVar, sparseArray, i58, i59);
                                                }
                                                if (f11 >= 0.0f) {
                                                    c5130e6.f41289d0 = f11;
                                                }
                                                f2 = eVar.f41997F;
                                                if (f2 >= 0.0f) {
                                                    c5130e6.f41291e0 = f2;
                                                }
                                            }
                                        }
                                        if (f11 >= 0.0f) {
                                        }
                                        f2 = eVar.f41997F;
                                        if (f2 >= 0.0f) {
                                        }
                                    }
                                }
                                i10 = i9;
                                i11 = 4;
                                if (i49 == -1) {
                                }
                                i13 = i11;
                                i14 = eVar2.i;
                                if (i14 == -1) {
                                }
                                i18 = eVar2.f42035k;
                                if (i18 == i15) {
                                }
                                eVar = eVar2;
                                i20 = eVar.f42039m;
                                if (i20 == -1) {
                                }
                                if (f11 >= 0.0f) {
                                }
                                f2 = eVar.f41997F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i26 = eVar.f42010T) != -1 || eVar.f42011U != -1)) {
                                int i60 = eVar.f42011U;
                                c5130e6.Y = i26;
                                c5130e6.f41281Z = i60;
                            }
                            if (eVar.f42017a0) {
                                c5130e6.M(i34);
                                c5130e6.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    c5130e6.M(i41);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.f42013W) {
                                    c5130e6.M(3);
                                } else {
                                    c5130e6.M(4);
                                }
                                c5130e6.i(i12).f41256g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                c5130e6.i(i13).f41256g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                c5130e6.M(3);
                                c5130e6.O(0);
                            }
                            if (eVar.f42019b0) {
                                i22 = -1;
                                c5130e6.N(1);
                                c5130e6.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    c5130e6.N(2);
                                }
                            } else {
                                i22 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.f42014X) {
                                        c5130e6.N(3);
                                    } else {
                                        c5130e6.N(4);
                                    }
                                    c5130e6.i(3).f41256g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    c5130e6.i(5).f41256g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    c5130e6.N(3);
                                    c5130e6.L(0);
                                }
                            }
                            String str2 = eVar.f41998G;
                            if (str2 == null || str2.length() == 0) {
                                c5130e6.f41279W = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i24 = i22;
                                    i25 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i24 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i22;
                                    i25 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i25);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i25, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i24 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    c5130e6.f41279W = parseFloat;
                                    c5130e6.f41280X = i24;
                                }
                            }
                            float f13 = eVar.f41999H;
                            float[] fArr = c5130e6.f41302k0;
                            fArr[0] = f13;
                            i34 = 1;
                            fArr[1] = eVar.f42000I;
                            c5130e6.f41298i0 = eVar.J;
                            c5130e6.f41300j0 = eVar.f42001K;
                            int i61 = eVar.f42015Z;
                            if (i61 >= 0 && i61 <= 3) {
                                c5130e6.f41312q = i61;
                            }
                            int i62 = eVar.f42002L;
                            int i63 = eVar.f42004N;
                            int i64 = eVar.f42006P;
                            float f14 = eVar.f42008R;
                            c5130e6.f41313r = i62;
                            c5130e6.f41316u = i63;
                            if (i64 == Integer.MAX_VALUE) {
                                i64 = 0;
                            }
                            c5130e6.f41317v = i64;
                            c5130e6.f41318w = f14;
                            if (f14 > 0.0f && f14 < 1.0f && i62 == 0) {
                                c5130e6.f41313r = 2;
                            }
                            int i65 = eVar.f42003M;
                            int i66 = eVar.f42005O;
                            int i67 = eVar.f42007Q;
                            float f15 = eVar.f42009S;
                            c5130e6.f41314s = i65;
                            c5130e6.f41319x = i66;
                            if (i67 == Integer.MAX_VALUE) {
                                i67 = 0;
                            }
                            c5130e6.f41320y = i67;
                            c5130e6.f41321z = f15;
                            if (f15 <= 0.0f || f15 >= 1.0f || i65 != 0) {
                                i23 = 2;
                            } else {
                                i23 = 2;
                                c5130e6.f41314s = 2;
                            }
                        }
                        i44 = i6 + 1;
                        i41 = i23;
                        z6 = z9;
                    }
                    i6 = i44;
                    z9 = z6;
                    i23 = i41;
                    i44 = i6 + 1;
                    i41 = i23;
                    z6 = z9;
                }
            }
            if (z6) {
                fVar.f41334r0.w(fVar);
            }
        }
        fVar.f41339w0.getClass();
        constraintLayout.k(fVar, constraintLayout.f4613B, i, i4);
        int q8 = fVar.q();
        int k9 = fVar.k();
        boolean z12 = fVar.f41325E0;
        boolean z13 = fVar.f41326F0;
        f fVar2 = constraintLayout.f4619H;
        int i68 = fVar2.f42060e;
        int resolveSizeAndState = View.resolveSizeAndState(q8 + fVar2.f42059d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k9 + i68, i4, 0) & 16777215;
        int min = Math.min(constraintLayout.f4625y, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.f4626z, resolveSizeAndState2);
        if (z12) {
            min |= b.bc;
        }
        if (z13) {
            min2 |= b.bc;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C5130e h3 = h(view);
        if ((view instanceof p) && !(h3 instanceof w.i)) {
            e eVar = (e) view.getLayoutParams();
            w.i iVar = new w.i();
            eVar.f42045p0 = iVar;
            eVar.f42023d0 = true;
            iVar.S(eVar.f42012V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((e) view.getLayoutParams()).f42025e0 = true;
            ArrayList arrayList = this.f4621u;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f4620n.put(view.getId(), view);
        this.f4612A = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4620n.remove(view.getId());
        C5130e h3 = h(view);
        this.f4622v.f41333q0.remove(h3);
        h3.C();
        this.f4621u.remove(view);
        this.f4612A = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4612A = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f4614C = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f4620n;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f4626z) {
            return;
        }
        this.f4626z = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f4625y) {
            return;
        }
        this.f4625y = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f4624x) {
            return;
        }
        this.f4624x = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f4623w) {
            return;
        }
        this.f4623w = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        C4797a c4797a = this.f4615D;
        if (c4797a != null) {
            c4797a.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f4613B = i;
        w.f fVar = this.f4622v;
        fVar.f41324D0 = i;
        C5048c.f40917q = fVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4620n = new SparseArray();
        this.f4621u = new ArrayList(4);
        this.f4622v = new w.f();
        this.f4623w = 0;
        this.f4624x = 0;
        this.f4625y = Integer.MAX_VALUE;
        this.f4626z = Integer.MAX_VALUE;
        this.f4612A = true;
        this.f4613B = 257;
        this.f4614C = null;
        this.f4615D = null;
        this.f4616E = -1;
        this.f4617F = new HashMap();
        this.f4618G = new SparseArray();
        this.f4619H = new f(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e eVar = new e(layoutParams);
        eVar.f42016a = -1;
        eVar.f42018b = -1;
        eVar.f42020c = -1.0f;
        eVar.f42022d = true;
        eVar.f42024e = -1;
        eVar.f42026f = -1;
        eVar.f42028g = -1;
        eVar.f42030h = -1;
        eVar.i = -1;
        eVar.f42033j = -1;
        eVar.f42035k = -1;
        eVar.f42037l = -1;
        eVar.f42039m = -1;
        eVar.f42040n = -1;
        eVar.f42042o = -1;
        eVar.f42044p = -1;
        eVar.f42046q = 0;
        eVar.f42047r = 0.0f;
        eVar.f42048s = -1;
        eVar.f42049t = -1;
        eVar.f42050u = -1;
        eVar.f42051v = -1;
        eVar.f42052w = Integer.MIN_VALUE;
        eVar.f42053x = Integer.MIN_VALUE;
        eVar.f42054y = Integer.MIN_VALUE;
        eVar.f42055z = Integer.MIN_VALUE;
        eVar.f41992A = Integer.MIN_VALUE;
        eVar.f41993B = Integer.MIN_VALUE;
        eVar.f41994C = Integer.MIN_VALUE;
        eVar.f41995D = 0;
        eVar.f41996E = 0.5f;
        eVar.f41997F = 0.5f;
        eVar.f41998G = null;
        eVar.f41999H = -1.0f;
        eVar.f42000I = -1.0f;
        eVar.J = 0;
        eVar.f42001K = 0;
        eVar.f42002L = 0;
        eVar.f42003M = 0;
        eVar.f42004N = 0;
        eVar.f42005O = 0;
        eVar.f42006P = 0;
        eVar.f42007Q = 0;
        eVar.f42008R = 1.0f;
        eVar.f42009S = 1.0f;
        eVar.f42010T = -1;
        eVar.f42011U = -1;
        eVar.f42012V = -1;
        eVar.f42013W = false;
        eVar.f42014X = false;
        eVar.Y = null;
        eVar.f42015Z = 0;
        eVar.f42017a0 = true;
        eVar.f42019b0 = true;
        eVar.f42021c0 = false;
        eVar.f42023d0 = false;
        eVar.f42025e0 = false;
        eVar.f42027f0 = -1;
        eVar.f42029g0 = -1;
        eVar.f42031h0 = -1;
        eVar.f42032i0 = -1;
        eVar.f42034j0 = Integer.MIN_VALUE;
        eVar.f42036k0 = Integer.MIN_VALUE;
        eVar.f42038l0 = 0.5f;
        eVar.f42045p0 = new C5130e();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = marginLayoutParams.bottomMargin;
            eVar.setMarginStart(marginLayoutParams.getMarginStart());
            eVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof e)) {
            return eVar;
        }
        e eVar2 = (e) layoutParams;
        eVar.f42016a = eVar2.f42016a;
        eVar.f42018b = eVar2.f42018b;
        eVar.f42020c = eVar2.f42020c;
        eVar.f42022d = eVar2.f42022d;
        eVar.f42024e = eVar2.f42024e;
        eVar.f42026f = eVar2.f42026f;
        eVar.f42028g = eVar2.f42028g;
        eVar.f42030h = eVar2.f42030h;
        eVar.i = eVar2.i;
        eVar.f42033j = eVar2.f42033j;
        eVar.f42035k = eVar2.f42035k;
        eVar.f42037l = eVar2.f42037l;
        eVar.f42039m = eVar2.f42039m;
        eVar.f42040n = eVar2.f42040n;
        eVar.f42042o = eVar2.f42042o;
        eVar.f42044p = eVar2.f42044p;
        eVar.f42046q = eVar2.f42046q;
        eVar.f42047r = eVar2.f42047r;
        eVar.f42048s = eVar2.f42048s;
        eVar.f42049t = eVar2.f42049t;
        eVar.f42050u = eVar2.f42050u;
        eVar.f42051v = eVar2.f42051v;
        eVar.f42052w = eVar2.f42052w;
        eVar.f42053x = eVar2.f42053x;
        eVar.f42054y = eVar2.f42054y;
        eVar.f42055z = eVar2.f42055z;
        eVar.f41992A = eVar2.f41992A;
        eVar.f41993B = eVar2.f41993B;
        eVar.f41994C = eVar2.f41994C;
        eVar.f41995D = eVar2.f41995D;
        eVar.f41996E = eVar2.f41996E;
        eVar.f41997F = eVar2.f41997F;
        eVar.f41998G = eVar2.f41998G;
        eVar.f41999H = eVar2.f41999H;
        eVar.f42000I = eVar2.f42000I;
        eVar.J = eVar2.J;
        eVar.f42001K = eVar2.f42001K;
        eVar.f42013W = eVar2.f42013W;
        eVar.f42014X = eVar2.f42014X;
        eVar.f42002L = eVar2.f42002L;
        eVar.f42003M = eVar2.f42003M;
        eVar.f42004N = eVar2.f42004N;
        eVar.f42006P = eVar2.f42006P;
        eVar.f42005O = eVar2.f42005O;
        eVar.f42007Q = eVar2.f42007Q;
        eVar.f42008R = eVar2.f42008R;
        eVar.f42009S = eVar2.f42009S;
        eVar.f42010T = eVar2.f42010T;
        eVar.f42011U = eVar2.f42011U;
        eVar.f42012V = eVar2.f42012V;
        eVar.f42017a0 = eVar2.f42017a0;
        eVar.f42019b0 = eVar2.f42019b0;
        eVar.f42021c0 = eVar2.f42021c0;
        eVar.f42023d0 = eVar2.f42023d0;
        eVar.f42027f0 = eVar2.f42027f0;
        eVar.f42029g0 = eVar2.f42029g0;
        eVar.f42031h0 = eVar2.f42031h0;
        eVar.f42032i0 = eVar2.f42032i0;
        eVar.f42034j0 = eVar2.f42034j0;
        eVar.f42036k0 = eVar2.f42036k0;
        eVar.f42038l0 = eVar2.f42038l0;
        eVar.Y = eVar2.Y;
        eVar.f42015Z = eVar2.f42015Z;
        eVar.f42045p0 = eVar2.f42045p0;
        return eVar;
    }
}
