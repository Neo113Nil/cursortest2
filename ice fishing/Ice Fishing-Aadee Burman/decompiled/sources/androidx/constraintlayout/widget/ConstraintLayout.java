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
import org.xmlpull.v1.XmlPullParserException;
import t0.C5019n;
import u.C5047c;
import w.C5136a;
import w.C5139d;
import w.C5140e;
import x.AbstractC5178p;
import x.C5165c;
import x.C5167e;
import x.C5171i;
import x.C5173k;
import x.C5175m;
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
    public static s f4643I;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4644A;

    /* renamed from: B, reason: collision with root package name */
    public int f4645B;

    /* renamed from: C, reason: collision with root package name */
    public n f4646C;

    /* renamed from: D, reason: collision with root package name */
    public C5019n f4647D;

    /* renamed from: E, reason: collision with root package name */
    public int f4648E;

    /* renamed from: F, reason: collision with root package name */
    public HashMap f4649F;

    /* renamed from: G, reason: collision with root package name */
    public final SparseArray f4650G;

    /* renamed from: H, reason: collision with root package name */
    public final f f4651H;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f4652n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4653u;

    /* renamed from: v, reason: collision with root package name */
    public final C5140e f4654v;

    /* renamed from: w, reason: collision with root package name */
    public int f4655w;

    /* renamed from: x, reason: collision with root package name */
    public int f4656x;

    /* renamed from: y, reason: collision with root package name */
    public int f4657y;

    /* renamed from: z, reason: collision with root package name */
    public int f4658z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4652n = new SparseArray();
        this.f4653u = new ArrayList(4);
        this.f4654v = new C5140e();
        this.f4655w = 0;
        this.f4656x = 0;
        this.f4657y = Integer.MAX_VALUE;
        this.f4658z = Integer.MAX_VALUE;
        this.f4644A = true;
        this.f4645B = 257;
        this.f4646C = null;
        this.f4647D = null;
        this.f4648E = -1;
        this.f4649F = new HashMap();
        this.f4650G = new SparseArray();
        this.f4651H = new f(this, this);
        i(attributeSet, 0);
    }

    public static e g() {
        e eVar = new e(-2, -2);
        eVar.f42042a = -1;
        eVar.f42044b = -1;
        eVar.f42046c = -1.0f;
        eVar.f42048d = true;
        eVar.f42050e = -1;
        eVar.f42052f = -1;
        eVar.f42054g = -1;
        eVar.f42056h = -1;
        eVar.i = -1;
        eVar.f42059j = -1;
        eVar.f42061k = -1;
        eVar.f42063l = -1;
        eVar.f42065m = -1;
        eVar.f42066n = -1;
        eVar.f42068o = -1;
        eVar.f42070p = -1;
        eVar.f42072q = 0;
        eVar.f42073r = 0.0f;
        eVar.f42074s = -1;
        eVar.f42075t = -1;
        eVar.f42076u = -1;
        eVar.f42077v = -1;
        eVar.f42078w = Integer.MIN_VALUE;
        eVar.f42079x = Integer.MIN_VALUE;
        eVar.f42080y = Integer.MIN_VALUE;
        eVar.f42081z = Integer.MIN_VALUE;
        eVar.f42018A = Integer.MIN_VALUE;
        eVar.f42019B = Integer.MIN_VALUE;
        eVar.f42020C = Integer.MIN_VALUE;
        eVar.f42021D = 0;
        eVar.f42022E = 0.5f;
        eVar.f42023F = 0.5f;
        eVar.f42024G = null;
        eVar.f42025H = -1.0f;
        eVar.f42026I = -1.0f;
        eVar.J = 0;
        eVar.f42027K = 0;
        eVar.f42028L = 0;
        eVar.f42029M = 0;
        eVar.f42030N = 0;
        eVar.f42031O = 0;
        eVar.f42032P = 0;
        eVar.f42033Q = 0;
        eVar.f42034R = 1.0f;
        eVar.f42035S = 1.0f;
        eVar.f42036T = -1;
        eVar.f42037U = -1;
        eVar.f42038V = -1;
        eVar.f42039W = false;
        eVar.f42040X = false;
        eVar.Y = null;
        eVar.f42041Z = 0;
        eVar.f42043a0 = true;
        eVar.f42045b0 = true;
        eVar.f42047c0 = false;
        eVar.f42049d0 = false;
        eVar.f42051e0 = false;
        eVar.f42053f0 = -1;
        eVar.f42055g0 = -1;
        eVar.f42057h0 = -1;
        eVar.f42058i0 = -1;
        eVar.f42060j0 = Integer.MIN_VALUE;
        eVar.f42062k0 = Integer.MIN_VALUE;
        eVar.f42064l0 = 0.5f;
        eVar.f42071p0 = new C5139d();
        return eVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f4643I == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f4643I = sVar;
        }
        return f4643I;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f4653u;
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
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i9;
                        float f9 = i10;
                        float f10 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f3, f9, f10, f9, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f3, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f9, f10, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f10, f9, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f4644A = true;
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
        eVar.f42042a = -1;
        eVar.f42044b = -1;
        eVar.f42046c = -1.0f;
        eVar.f42048d = true;
        eVar.f42050e = -1;
        eVar.f42052f = -1;
        eVar.f42054g = -1;
        eVar.f42056h = -1;
        eVar.i = -1;
        eVar.f42059j = -1;
        eVar.f42061k = -1;
        eVar.f42063l = -1;
        eVar.f42065m = -1;
        eVar.f42066n = -1;
        eVar.f42068o = -1;
        eVar.f42070p = -1;
        eVar.f42072q = 0;
        eVar.f42073r = 0.0f;
        eVar.f42074s = -1;
        eVar.f42075t = -1;
        eVar.f42076u = -1;
        eVar.f42077v = -1;
        eVar.f42078w = Integer.MIN_VALUE;
        eVar.f42079x = Integer.MIN_VALUE;
        eVar.f42080y = Integer.MIN_VALUE;
        eVar.f42081z = Integer.MIN_VALUE;
        eVar.f42018A = Integer.MIN_VALUE;
        eVar.f42019B = Integer.MIN_VALUE;
        eVar.f42020C = Integer.MIN_VALUE;
        eVar.f42021D = 0;
        eVar.f42022E = 0.5f;
        eVar.f42023F = 0.5f;
        eVar.f42024G = null;
        eVar.f42025H = -1.0f;
        eVar.f42026I = -1.0f;
        eVar.J = 0;
        eVar.f42027K = 0;
        eVar.f42028L = 0;
        eVar.f42029M = 0;
        eVar.f42030N = 0;
        eVar.f42031O = 0;
        eVar.f42032P = 0;
        eVar.f42033Q = 0;
        eVar.f42034R = 1.0f;
        eVar.f42035S = 1.0f;
        eVar.f42036T = -1;
        eVar.f42037U = -1;
        eVar.f42038V = -1;
        eVar.f42039W = false;
        eVar.f42040X = false;
        eVar.Y = null;
        eVar.f42041Z = 0;
        eVar.f42043a0 = true;
        eVar.f42045b0 = true;
        eVar.f42047c0 = false;
        eVar.f42049d0 = false;
        eVar.f42051e0 = false;
        eVar.f42053f0 = -1;
        eVar.f42055g0 = -1;
        eVar.f42057h0 = -1;
        eVar.f42058i0 = -1;
        eVar.f42060j0 = Integer.MIN_VALUE;
        eVar.f42062k0 = Integer.MIN_VALUE;
        eVar.f42064l0 = 0.5f;
        eVar.f42071p0 = new C5139d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42210b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i6 = d.f42017a.get(index);
            switch (i6) {
                case 1:
                    eVar.f42038V = obtainStyledAttributes.getInt(index, eVar.f42038V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, eVar.f42070p);
                    eVar.f42070p = resourceId;
                    if (resourceId == -1) {
                        eVar.f42070p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f42072q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42072q);
                    break;
                case 4:
                    float f3 = obtainStyledAttributes.getFloat(index, eVar.f42073r) % 360.0f;
                    eVar.f42073r = f3;
                    if (f3 < 0.0f) {
                        eVar.f42073r = (360.0f - f3) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f42042a = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f42042a);
                    break;
                case 6:
                    eVar.f42044b = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f42044b);
                    break;
                case 7:
                    eVar.f42046c = obtainStyledAttributes.getFloat(index, eVar.f42046c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, eVar.f42050e);
                    eVar.f42050e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f42050e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, eVar.f42052f);
                    eVar.f42052f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f42052f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, eVar.f42054g);
                    eVar.f42054g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f42054g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, eVar.f42056h);
                    eVar.f42056h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f42056h = obtainStyledAttributes.getInt(index, -1);
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
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, eVar.f42059j);
                    eVar.f42059j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f42059j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, eVar.f42061k);
                    eVar.f42061k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f42061k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, eVar.f42063l);
                    eVar.f42063l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f42063l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, eVar.f42065m);
                    eVar.f42065m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f42065m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, eVar.f42074s);
                    eVar.f42074s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f42074s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, eVar.f42075t);
                    eVar.f42075t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f42075t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, eVar.f42076u);
                    eVar.f42076u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f42076u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, eVar.f42077v);
                    eVar.f42077v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f42077v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f42078w = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42078w);
                    break;
                case 22:
                    eVar.f42079x = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42079x);
                    break;
                case 23:
                    eVar.f42080y = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42080y);
                    break;
                case 24:
                    eVar.f42081z = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42081z);
                    break;
                case 25:
                    eVar.f42018A = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42018A);
                    break;
                case 26:
                    eVar.f42019B = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42019B);
                    break;
                case 27:
                    eVar.f42039W = obtainStyledAttributes.getBoolean(index, eVar.f42039W);
                    break;
                case 28:
                    eVar.f42040X = obtainStyledAttributes.getBoolean(index, eVar.f42040X);
                    break;
                case 29:
                    eVar.f42022E = obtainStyledAttributes.getFloat(index, eVar.f42022E);
                    break;
                case 30:
                    eVar.f42023F = obtainStyledAttributes.getFloat(index, eVar.f42023F);
                    break;
                case 31:
                    int i9 = obtainStyledAttributes.getInt(index, 0);
                    eVar.f42028L = i9;
                    if (i9 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i10 = obtainStyledAttributes.getInt(index, 0);
                    eVar.f42029M = i10;
                    if (i10 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.f42030N = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42030N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, eVar.f42030N) == -2) {
                            eVar.f42030N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.f42032P = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42032P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, eVar.f42032P) == -2) {
                            eVar.f42032P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.f42034R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, eVar.f42034R));
                    eVar.f42028L = 2;
                    break;
                case 36:
                    try {
                        eVar.f42031O = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42031O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, eVar.f42031O) == -2) {
                            eVar.f42031O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.f42033Q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42033Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, eVar.f42033Q) == -2) {
                            eVar.f42033Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case j.f5806M /* 38 */:
                    eVar.f42035S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, eVar.f42035S));
                    eVar.f42029M = 2;
                    break;
                default:
                    switch (i6) {
                        case j.f5812S /* 44 */:
                            n.h(eVar, obtainStyledAttributes.getString(index));
                            break;
                        case j.f5813T /* 45 */:
                            eVar.f42025H = obtainStyledAttributes.getFloat(index, eVar.f42025H);
                            break;
                        case 46:
                            eVar.f42026I = obtainStyledAttributes.getFloat(index, eVar.f42026I);
                            break;
                        case 47:
                            eVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case j.f5816W /* 48 */:
                            eVar.f42027K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case j.f5817X /* 49 */:
                            eVar.f42036T = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f42036T);
                            break;
                        case 50:
                            eVar.f42037U = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f42037U);
                            break;
                        case 51:
                            eVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, eVar.f42066n);
                            eVar.f42066n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f42066n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case i.f14823d /* 53 */:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar.f42068o);
                            eVar.f42068o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f42068o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            eVar.f42021D = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42021D);
                            break;
                        case 55:
                            eVar.f42020C = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f42020C);
                            break;
                        default:
                            switch (i6) {
                                case 64:
                                    n.g(eVar, obtainStyledAttributes, index, 0);
                                    break;
                                case j.v.f12576G /* 65 */:
                                    n.g(eVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.f42041Z = obtainStyledAttributes.getInt(index, eVar.f42041Z);
                                    break;
                                case j.v.f12582d /* 67 */:
                                    eVar.f42048d = obtainStyledAttributes.getBoolean(index, eVar.f42048d);
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
        return this.f4658z;
    }

    public int getMaxWidth() {
        return this.f4657y;
    }

    public int getMinHeight() {
        return this.f4656x;
    }

    public int getMinWidth() {
        return this.f4655w;
    }

    public int getOptimizationLevel() {
        return this.f4654v.f41542D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C5140e c5140e = this.f4654v;
        if (c5140e.f41517j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c5140e.f41517j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c5140e.f41517j = "parent";
            }
        }
        if (c5140e.f41515h0 == null) {
            c5140e.f41515h0 = c5140e.f41517j;
            Log.v("ConstraintLayout", " setDebugName " + c5140e.f41515h0);
        }
        Iterator it = c5140e.f41551q0.iterator();
        while (it.hasNext()) {
            C5139d c5139d = (C5139d) it.next();
            View view = c5139d.f41511f0;
            if (view != null) {
                if (c5139d.f41517j == null && (id = view.getId()) != -1) {
                    c5139d.f41517j = getContext().getResources().getResourceEntryName(id);
                }
                if (c5139d.f41515h0 == null) {
                    c5139d.f41515h0 = c5139d.f41517j;
                    Log.v("ConstraintLayout", " setDebugName " + c5139d.f41515h0);
                }
            }
        }
        c5140e.n(sb);
        return sb.toString();
    }

    public final C5139d h(View view) {
        if (view == this) {
            return this.f4654v;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f42071p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f42071p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C5140e c5140e = this.f4654v;
        c5140e.f41511f0 = this;
        f fVar = this.f4651H;
        c5140e.f41555u0 = fVar;
        c5140e.f41553s0.f41711f = fVar;
        this.f4652n.put(getId(), this);
        this.f4646C = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f42210b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 16) {
                    this.f4655w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4655w);
                } else if (index == 17) {
                    this.f4656x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4656x);
                } else if (index == 14) {
                    this.f4657y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4657y);
                } else if (index == 15) {
                    this.f4658z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4658z);
                } else if (index == 113) {
                    this.f4645B = obtainStyledAttributes.getInt(index, this.f4645B);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4647D = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f4646C = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4646C = null;
                    }
                    this.f4648E = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c5140e.f41542D0 = this.f4645B;
        C5047c.f40952q = c5140e.W(512);
    }

    public final void j(int i) {
        int eventType;
        h hVar;
        Context context = getContext();
        C5019n c5019n = new C5019n(3);
        c5019n.f40731u = new SparseArray();
        c5019n.f40732v = new SparseArray();
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
                this.f4647D = c5019n;
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
                    ((SparseArray) c5019n.f40731u).put(hVar2.f1970a, hVar2);
                    hVar = hVar2;
                } else if (c9 == 3) {
                    g gVar = new g(context, xml);
                    if (hVar != null) {
                        hVar.f1971b.add(gVar);
                    }
                } else if (c9 == 4) {
                    c5019n.e(context, xml);
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
    public final void k(C5140e c5140e, int i, int i6, int i9) {
        int i10;
        int max;
        int i11;
        int max2;
        int i12;
        boolean z3;
        int i13;
        int i14;
        boolean z6;
        int i15;
        boolean z9;
        ArrayList arrayList;
        int i16;
        boolean z10;
        boolean z11;
        C5173k c5173k;
        C5175m c5175m;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList2;
        int i20;
        int i21;
        int i22;
        boolean z12;
        Iterator it;
        Iterator it2;
        boolean z13;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i23 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar = this.f4651H;
        fVar.f42083b = max3;
        fVar.f42084c = max4;
        fVar.f42085d = paddingWidth;
        fVar.f42086e = i23;
        fVar.f42087f = i6;
        fVar.f42088g = i9;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i24 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i25 = size - paddingWidth;
        int i26 = size2 - i23;
        int i27 = fVar.f42086e;
        int i28 = fVar.f42085d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i10 = 0;
                } else {
                    i10 = Math.min(this.f4657y - i28, i25);
                    i24 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f4655w);
                i10 = max;
                i24 = 2;
            } else {
                i10 = 0;
                i24 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f4655w);
            i10 = max;
            i24 = 2;
        } else {
            i10 = i25;
            i24 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i11 = mode2 != 1073741824 ? 0 : Math.min(this.f4658z - i27, i26);
                i12 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f4656x);
                i11 = max2;
                i12 = 2;
            } else {
                i11 = 0;
                i12 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f4656x);
            i11 = max2;
            i12 = 2;
        } else {
            i11 = i26;
            i12 = 2;
        }
        int q8 = c5140e.q();
        C5167e c5167e = c5140e.f41553s0;
        int i29 = i10;
        if (i29 != q8 || i11 != c5140e.k()) {
            c5167e.f41708c = true;
        }
        c5140e.Y = 0;
        c5140e.f41499Z = 0;
        int i30 = this.f4657y - i28;
        int[] iArr = c5140e.f41478C;
        iArr[0] = i30;
        iArr[1] = this.f4658z - i27;
        c5140e.f41503b0 = 0;
        c5140e.f41505c0 = 0;
        c5140e.M(i24);
        c5140e.O(i29);
        c5140e.N(i12);
        c5140e.L(i11);
        int i31 = this.f4655w - i28;
        if (i31 < 0) {
            c5140e.f41503b0 = 0;
        } else {
            c5140e.f41503b0 = i31;
        }
        int i32 = this.f4656x - i27;
        if (i32 < 0) {
            c5140e.f41505c0 = 0;
        } else {
            c5140e.f41505c0 = i32;
        }
        c5140e.f41558x0 = max5;
        c5140e.f41559y0 = max3;
        j4.g gVar = c5140e.f41552r0;
        gVar.getClass();
        f fVar2 = c5140e.f41555u0;
        int size3 = c5140e.f41551q0.size();
        int q9 = c5140e.q();
        int k9 = c5140e.k();
        boolean c9 = w.j.c(i, 128);
        boolean z14 = c9 || w.j.c(i, 64);
        if (z14) {
            int i33 = 0;
            while (i33 < size3) {
                C5139d c5139d = (C5139d) c5140e.f41551q0.get(i33);
                boolean z15 = z14;
                int[] iArr2 = c5139d.f41529p0;
                i13 = size3;
                boolean z16 = (iArr2[0] == 3) && (iArr2[1] == 3) && c5139d.f41497W > 0.0f;
                if ((c5139d.x() && z16) || ((c5139d.y() && z16) || (c5139d instanceof w.g) || c5139d.x() || c5139d.y())) {
                    i14 = 1073741824;
                    z3 = false;
                    break;
                } else {
                    i33++;
                    z14 = z15;
                    size3 = i13;
                }
            }
        }
        z3 = z14;
        i13 = size3;
        i14 = 1073741824;
        boolean z17 = z3 & ((mode == i14 && mode2 == i14) || c9);
        if (z17) {
            int min = Math.min(iArr[0], i25);
            int min2 = Math.min(iArr[1], i26);
            if (mode == 1073741824 && c5140e.q() != min) {
                c5140e.O(min);
                c5140e.f41553s0.f41707b = true;
            }
            if (mode2 == 1073741824 && c5140e.k() != min2) {
                c5140e.L(min2);
                c5140e.f41553s0.f41707b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z18 = c5167e.f41707b;
                C5140e c5140e2 = c5167e.f41706a;
                if (z18 || c5167e.f41708c) {
                    Iterator it3 = c5140e2.f41551q0.iterator();
                    while (it3.hasNext()) {
                        C5139d c5139d2 = (C5139d) it3.next();
                        c5139d2.h();
                        c5139d2.f41500a = false;
                        c5139d2.f41506d.n();
                        c5139d2.f41508e.m();
                    }
                    i19 = 0;
                    c5140e2.h();
                    c5140e2.f41500a = false;
                    c5140e2.f41506d.n();
                    c5140e2.f41508e.m();
                    c5167e.f41708c = false;
                } else {
                    i19 = 0;
                }
                c5167e.b(c5167e.f41709d);
                c5140e2.Y = i19;
                c5140e2.f41499Z = i19;
                int j6 = c5140e2.j(i19);
                int j9 = c5140e2.j(1);
                if (c5167e.f41707b) {
                    c5167e.c();
                }
                int r9 = c5140e2.r();
                int s9 = c5140e2.s();
                c5140e2.f41506d.f41745h.d(r9);
                c5140e2.f41508e.f41745h.d(s9);
                c5167e.g();
                ArrayList arrayList3 = c5167e.f41710e;
                z6 = z17;
                if (j6 == 2 || j9 == 2) {
                    if (c9) {
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC5178p) it4.next()).k()) {
                                    c9 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c9 && j6 == 2) {
                        c5140e2.M(1);
                        arrayList2 = arrayList3;
                        c5140e2.O(c5167e.d(c5140e2, 0));
                        c5140e2.f41506d.f41742e.d(c5140e2.q());
                    } else {
                        arrayList2 = arrayList3;
                    }
                    if (c9 && j9 == 2) {
                        i20 = 1;
                        c5140e2.N(1);
                        c5140e2.L(c5167e.d(c5140e2, 1));
                        c5140e2.f41508e.f41742e.d(c5140e2.k());
                        int[] iArr3 = c5140e2.f41529p0;
                        i21 = iArr3[0];
                        if (i21 != i20 || i21 == 4) {
                            int q10 = c5140e2.q() + r9;
                            c5140e2.f41506d.i.d(q10);
                            c5140e2.f41506d.f41742e.d(q10 - r9);
                            c5167e.g();
                            i22 = iArr3[1];
                            if (i22 != 1 || i22 == 4) {
                                int k10 = c5140e2.k() + s9;
                                c5140e2.f41508e.i.d(k10);
                                c5140e2.f41508e.f41742e.d(k10 - s9);
                            }
                            c5167e.g();
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC5178p abstractC5178p = (AbstractC5178p) it.next();
                            if (abstractC5178p.f41739b != c5140e2 || abstractC5178p.f41744g) {
                                abstractC5178p.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC5178p abstractC5178p2 = (AbstractC5178p) it2.next();
                            if (z12 || abstractC5178p2.f41739b != c5140e2) {
                                if (!abstractC5178p2.f41745h.f41722j || ((!abstractC5178p2.i.f41722j && !(abstractC5178p2 instanceof C5171i)) || (!abstractC5178p2.f41742e.f41722j && !(abstractC5178p2 instanceof C5165c) && !(abstractC5178p2 instanceof C5171i)))) {
                                    z13 = false;
                                    break;
                                }
                            }
                        }
                        z13 = true;
                        c5140e2.M(j6);
                        c5140e2.N(j9);
                        z9 = z13;
                        i18 = 1073741824;
                        i15 = 2;
                    }
                } else {
                    arrayList2 = arrayList3;
                }
                i20 = 1;
                int[] iArr32 = c5140e2.f41529p0;
                i21 = iArr32[0];
                if (i21 != i20) {
                }
                int q102 = c5140e2.q() + r9;
                c5140e2.f41506d.i.d(q102);
                c5140e2.f41506d.f41742e.d(q102 - r9);
                c5167e.g();
                i22 = iArr32[1];
                if (i22 != 1) {
                }
                int k102 = c5140e2.k() + s9;
                c5140e2.f41508e.i.d(k102);
                c5140e2.f41508e.f41742e.d(k102 - s9);
                c5167e.g();
                z12 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z13 = true;
                c5140e2.M(j6);
                c5140e2.N(j9);
                z9 = z13;
                i18 = 1073741824;
                i15 = 2;
            } else {
                z6 = z17;
                boolean z19 = c5167e.f41707b;
                C5140e c5140e3 = c5167e.f41706a;
                if (z19) {
                    Iterator it5 = c5140e3.f41551q0.iterator();
                    while (it5.hasNext()) {
                        C5139d c5139d3 = (C5139d) it5.next();
                        c5139d3.h();
                        c5139d3.f41500a = false;
                        C5173k c5173k2 = c5139d3.f41506d;
                        c5173k2.f41742e.f41722j = false;
                        c5173k2.f41744g = false;
                        c5173k2.n();
                        C5175m c5175m2 = c5139d3.f41508e;
                        c5175m2.f41742e.f41722j = false;
                        c5175m2.f41744g = false;
                        c5175m2.m();
                    }
                    i17 = 0;
                    c5140e3.h();
                    c5140e3.f41500a = false;
                    C5173k c5173k3 = c5140e3.f41506d;
                    c5173k3.f41742e.f41722j = false;
                    c5173k3.f41744g = false;
                    c5173k3.n();
                    C5175m c5175m3 = c5140e3.f41508e;
                    c5175m3.f41742e.f41722j = false;
                    c5175m3.f41744g = false;
                    c5175m3.m();
                    c5167e.c();
                } else {
                    i17 = 0;
                }
                c5167e.b(c5167e.f41709d);
                c5140e3.Y = i17;
                c5140e3.f41499Z = i17;
                c5140e3.f41506d.f41745h.d(i17);
                c5140e3.f41508e.f41745h.d(i17);
                i18 = 1073741824;
                if (mode == 1073741824) {
                    z9 = c5140e.T(i17, c9);
                    i15 = 1;
                } else {
                    i15 = 0;
                    z9 = true;
                }
                if (mode2 == 1073741824) {
                    z9 &= c5140e.T(1, c9);
                    i15++;
                }
            }
            if (z9) {
                c5140e.P(mode == i18, mode2 == i18);
            }
        } else {
            z6 = z17;
            i15 = 0;
            z9 = false;
        }
        if (z9 && i15 == 2) {
            return;
        }
        int i34 = c5140e.f41542D0;
        if (i13 > 0) {
            int size4 = c5140e.f41551q0.size();
            boolean W8 = c5140e.W(64);
            f fVar3 = c5140e.f41555u0;
            for (int i35 = 0; i35 < size4; i35++) {
                C5139d c5139d4 = (C5139d) c5140e.f41551q0.get(i35);
                if (!(c5139d4 instanceof w.h) && !(c5139d4 instanceof C5136a) && !c5139d4.f41481F && (!W8 || (c5173k = c5139d4.f41506d) == null || (c5175m = c5139d4.f41508e) == null || !c5173k.f41742e.f41722j || !c5175m.f41742e.f41722j)) {
                    int j10 = c5139d4.j(0);
                    int j11 = c5139d4.j(1);
                    boolean z20 = j10 == 3 && c5139d4.f41531r != 1 && j11 == 3 && c5139d4.f41532s != 1;
                    if (!z20 && c5140e.W(1) && !(c5139d4 instanceof w.g)) {
                        if (j10 == 3 && c5139d4.f41531r == 0 && j11 != 3 && !c5139d4.x()) {
                            z20 = true;
                        }
                        if (j11 == 3 && c5139d4.f41532s == 0 && j10 != 3 && !c5139d4.x()) {
                            z20 = true;
                        }
                        if ((j10 == 3 || j11 == 3) && c5139d4.f41497W > 0.0f) {
                            z20 = true;
                        }
                    }
                    if (!z20) {
                        gVar.q(0, c5139d4, fVar3);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar3.f42082a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i36 = 0; i36 < childCount2; i36++) {
                constraintLayout.getChildAt(i36);
            }
            ArrayList arrayList4 = constraintLayout.f4653u;
            int size5 = arrayList4.size();
            if (size5 > 0) {
                for (int i37 = 0; i37 < size5; i37++) {
                    ((c) arrayList4.get(i37)).getClass();
                }
            }
        }
        gVar.w(c5140e);
        ArrayList arrayList5 = (ArrayList) gVar.f38404u;
        int size6 = arrayList5.size();
        if (i13 > 0) {
            gVar.u(c5140e, 0, q9, k9);
        }
        if (size6 > 0) {
            int[] iArr4 = c5140e.f41529p0;
            boolean z21 = iArr4[0] == 2;
            boolean z22 = iArr4[1] == 2;
            int q11 = c5140e.q();
            C5140e c5140e4 = (C5140e) gVar.f38406w;
            int max7 = Math.max(q11, c5140e4.f41503b0);
            int max8 = Math.max(c5140e.k(), c5140e4.f41505c0);
            int i38 = 0;
            boolean z23 = false;
            while (i38 < size6) {
                C5139d c5139d5 = (C5139d) arrayList5.get(i38);
                if (c5139d5 instanceof w.g) {
                    int q12 = c5139d5.q();
                    z10 = z22;
                    int k11 = c5139d5.k();
                    z11 = z21;
                    boolean q13 = z23 | gVar.q(1, c5139d5, fVar2);
                    int q14 = c5139d5.q();
                    boolean z24 = q13;
                    int k12 = c5139d5.k();
                    if (q14 != q12) {
                        c5139d5.O(q14);
                        if (z11 && c5139d5.r() + c5139d5.f41495U > max7) {
                            max7 = Math.max(max7, c5139d5.i(4).e() + c5139d5.r() + c5139d5.f41495U);
                        }
                        z24 = true;
                    }
                    if (k12 != k11) {
                        c5139d5.L(k12);
                        if (z10 && c5139d5.s() + c5139d5.f41496V > max8) {
                            max8 = Math.max(max8, c5139d5.i(5).e() + c5139d5.s() + c5139d5.f41496V);
                        }
                        z24 = true;
                    }
                    z23 = z24 | ((w.g) c5139d5).f41611y0;
                } else {
                    z10 = z22;
                    z11 = z21;
                }
                i38++;
                z22 = z10;
                z21 = z11;
            }
            boolean z25 = z22;
            boolean z26 = z21;
            int i39 = 0;
            while (i39 < 2) {
                int i40 = 0;
                while (i40 < size6) {
                    C5139d c5139d6 = (C5139d) arrayList5.get(i40);
                    if (((c5139d6 instanceof w.i) && !(c5139d6 instanceof w.g)) || (c5139d6 instanceof w.h) || c5139d6.f41513g0 == 8 || ((z6 && c5139d6.f41506d.f41742e.f41722j && c5139d6.f41508e.f41742e.f41722j) || (c5139d6 instanceof w.g))) {
                        arrayList = arrayList5;
                        i16 = size6;
                    } else {
                        int q15 = c5139d6.q();
                        int k13 = c5139d6.k();
                        arrayList = arrayList5;
                        int i41 = c5139d6.f41501a0;
                        i16 = size6;
                        boolean q16 = gVar.q(i39 == 1 ? 2 : 1, c5139d6, fVar2) | z23;
                        int q17 = c5139d6.q();
                        boolean z27 = q16;
                        int k14 = c5139d6.k();
                        if (q17 != q15) {
                            c5139d6.O(q17);
                            if (z26 && c5139d6.r() + c5139d6.f41495U > max7) {
                                max7 = Math.max(max7, c5139d6.i(4).e() + c5139d6.r() + c5139d6.f41495U);
                            }
                            z27 = true;
                        }
                        if (k14 != k13) {
                            c5139d6.L(k14);
                            if (z25 && c5139d6.s() + c5139d6.f41496V > max8) {
                                max8 = Math.max(max8, c5139d6.i(5).e() + c5139d6.s() + c5139d6.f41496V);
                            }
                            z27 = true;
                        }
                        z23 = (!c5139d6.f41480E || i41 == c5139d6.f41501a0) ? z27 : true;
                    }
                    i40++;
                    arrayList5 = arrayList;
                    size6 = i16;
                }
                ArrayList arrayList6 = arrayList5;
                int i42 = size6;
                if (!z23) {
                    break;
                }
                i39++;
                gVar.u(c5140e, i39, q9, k9);
                arrayList5 = arrayList6;
                size6 = i42;
                z23 = false;
            }
        }
        c5140e.f41542D0 = i34;
        C5047c.f40952q = c5140e.W(512);
    }

    public final void l(C5139d c5139d, e eVar, SparseArray sparseArray, int i, int i6) {
        View view = (View) this.f4652n.get(i);
        C5139d c5139d2 = (C5139d) sparseArray.get(i);
        if (c5139d2 == null || view == null || !(view.getLayoutParams() instanceof e)) {
            return;
        }
        eVar.f42047c0 = true;
        if (i6 == 6) {
            e eVar2 = (e) view.getLayoutParams();
            eVar2.f42047c0 = true;
            eVar2.f42071p0.f41480E = true;
        }
        c5139d.i(6).b(c5139d2.i(i6), eVar.f42021D, eVar.f42020C, true);
        c5139d.f41480E = true;
        c5139d.i(3).j();
        c5139d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            C5139d c5139d = eVar.f42071p0;
            if (childAt.getVisibility() != 8 || eVar.f42049d0 || eVar.f42051e0 || isInEditMode) {
                int r9 = c5139d.r();
                int s9 = c5139d.s();
                childAt.layout(r9, s9, c5139d.q() + r9, c5139d.k() + s9);
            }
        }
        ArrayList arrayList = this.f4653u;
        int size = arrayList.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((c) arrayList.get(i12)).getClass();
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
    public void onMeasure(int i, int i6) {
        boolean z3;
        int i9;
        boolean z6;
        C5139d c5139d;
        int i10;
        C5139d c5139d2;
        int i11;
        int i12;
        int i13;
        C5139d c5139d3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C5139d c5139d4;
        int i19;
        int i20;
        C5139d c5139d5;
        e eVar;
        int i21;
        C5139d c5139d6;
        float f3;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float parseFloat;
        int i27;
        char c9;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i28;
        String resourceName;
        int id;
        C5139d c5139d7;
        ConstraintLayout constraintLayout = this;
        boolean z9 = constraintLayout.f4644A;
        constraintLayout.f4644A = z9;
        int i29 = 0;
        int i30 = 1;
        if (!z9) {
            int childCount = constraintLayout.getChildCount();
            int i31 = 0;
            while (true) {
                if (i31 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                    constraintLayout.f4644A = true;
                    break;
                }
                i31++;
            }
        }
        boolean z10 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        C5140e c5140e = constraintLayout.f4654v;
        c5140e.f41556v0 = z10;
        if (constraintLayout.f4644A) {
            constraintLayout.f4644A = false;
            int childCount2 = constraintLayout.getChildCount();
            int i32 = 0;
            while (true) {
                if (i32 >= childCount2) {
                    z3 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i32).isLayoutRequested()) {
                        z3 = true;
                        break;
                    }
                    i32++;
                }
            }
            if (z3) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i33 = 0; i33 < childCount3; i33++) {
                    C5139d h9 = constraintLayout.h(constraintLayout.getChildAt(i33));
                    if (h9 != null) {
                        h9.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    int i34 = 0;
                    while (i34 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i34);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f4649F == null) {
                                    constraintLayout.f4649F = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                i28 = i30;
                                try {
                                    constraintLayout.f4649F.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i28 = i30;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i28 = i30;
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f4652n.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c5139d7 = view == null ? null : ((e) view.getLayoutParams()).f42071p0;
                                c5139d7.f41515h0 = resourceName;
                                i34++;
                                i30 = i28;
                            }
                        }
                        c5139d7 = c5140e;
                        c5139d7.f41515h0 = resourceName;
                        i34++;
                        i30 = i28;
                    }
                }
                int i35 = i30;
                if (constraintLayout.f4648E != -1) {
                    for (int i36 = 0; i36 < childCount3; i36++) {
                        constraintLayout.getChildAt(i36).getId();
                    }
                }
                n nVar = constraintLayout.f4646C;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c5140e.f41551q0.clear();
                ArrayList arrayList3 = constraintLayout.f4653u;
                int size = arrayList3.size();
                if (size > 0) {
                    int i37 = 0;
                    while (i37 < size) {
                        c cVar = (c) arrayList3.get(i37);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f42014x);
                        }
                        w.i iVar = cVar.f42013w;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f41620r0 = i29;
                            Arrays.fill(iVar.f41619q0, obj);
                            int i38 = i29;
                            while (i38 < cVar.f42011u) {
                                int i39 = cVar.f42010n[i38];
                                View view2 = (View) constraintLayout.f4652n.get(i39);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i39);
                                    HashMap hashMap = cVar.f42016z;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f9 = cVar.f(constraintLayout, str);
                                    if (f9 != 0) {
                                        cVar.f42010n[i38] = f9;
                                        hashMap.put(Integer.valueOf(f9), str);
                                        view2 = (View) constraintLayout.f4652n.get(f9);
                                    }
                                }
                                if (view2 != null) {
                                    w.i iVar2 = cVar.f42013w;
                                    C5139d h10 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h10 != iVar2 && h10 != null) {
                                        int i40 = iVar2.f41620r0 + 1;
                                        C5139d[] c5139dArr = iVar2.f41619q0;
                                        arrayList2 = arrayList3;
                                        if (i40 > c5139dArr.length) {
                                            iVar2.f41619q0 = (C5139d[]) Arrays.copyOf(c5139dArr, c5139dArr.length * 2);
                                        }
                                        C5139d[] c5139dArr2 = iVar2.f41619q0;
                                        int i41 = iVar2.f41620r0;
                                        c5139dArr2[i41] = h10;
                                        iVar2.f41620r0 = i41 + 1;
                                        i38++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i38++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            cVar.f42013w.S();
                        }
                        i37++;
                        arrayList3 = arrayList;
                        obj = null;
                        i29 = 0;
                    }
                }
                int i42 = 2;
                for (int i43 = 0; i43 < childCount3; i43++) {
                    constraintLayout.getChildAt(i43);
                }
                SparseArray sparseArray = constraintLayout.f4650G;
                sparseArray.clear();
                sparseArray.put(0, c5140e);
                sparseArray.put(constraintLayout.getId(), c5140e);
                for (int i44 = 0; i44 < childCount3; i44++) {
                    View childAt2 = constraintLayout.getChildAt(i44);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i45 = 0;
                while (i45 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i45);
                    C5139d h11 = constraintLayout.h(childAt3);
                    if (h11 != null) {
                        e eVar2 = (e) childAt3.getLayoutParams();
                        c5140e.f41551q0.add(h11);
                        C5139d c5139d8 = h11.f41494T;
                        if (c5139d8 != null) {
                            ((C5140e) c5139d8).f41551q0.remove(h11);
                            h11.C();
                        }
                        h11.f41494T = c5140e;
                        eVar2.a();
                        h11.f41513g0 = childAt3.getVisibility();
                        h11.f41511f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(h11, c5140e.f41556v0);
                        }
                        if (eVar2.f42049d0) {
                            w.h hVar = (w.h) h11;
                            int i46 = eVar2.m0;
                            int i47 = eVar2.f42067n0;
                            float f10 = eVar2.f42069o0;
                            if (f10 == -1.0f) {
                                c9 = 65535;
                                if (i46 != -1) {
                                    if (i46 > -1) {
                                        hVar.f41613q0 = -1.0f;
                                        hVar.f41614r0 = i46;
                                        hVar.f41615s0 = -1;
                                    }
                                } else if (i47 != -1 && i47 > -1) {
                                    hVar.f41613q0 = -1.0f;
                                    hVar.f41614r0 = -1;
                                    hVar.f41615s0 = i47;
                                }
                                i9 = i45;
                                z6 = z3;
                                i24 = i42;
                            } else if (f10 > -1.0f) {
                                hVar.f41613q0 = f10;
                                c9 = 65535;
                                hVar.f41614r0 = -1;
                                hVar.f41615s0 = -1;
                                i9 = i45;
                                z6 = z3;
                                i24 = i42;
                            }
                        } else {
                            int i48 = eVar2.f42053f0;
                            int i49 = eVar2.f42055g0;
                            int i50 = eVar2.f42057h0;
                            int i51 = eVar2.f42058i0;
                            int i52 = eVar2.f42060j0;
                            int i53 = eVar2.f42062k0;
                            i9 = i45;
                            float f11 = eVar2.f42064l0;
                            int i54 = eVar2.f42070p;
                            z6 = z3;
                            if (i54 != -1) {
                                C5139d c5139d9 = (C5139d) sparseArray.get(i54);
                                if (c5139d9 != null) {
                                    float f12 = eVar2.f42073r;
                                    h11.v(7, 7, eVar2.f42072q, 0, c5139d9);
                                    h11.f41479D = f12;
                                }
                                constraintLayout = this;
                                c5139d6 = h11;
                                eVar = eVar2;
                                i14 = 4;
                                i13 = 2;
                            } else {
                                if (i48 != -1) {
                                    C5139d c5139d10 = (C5139d) sparseArray.get(i48);
                                    if (c5139d10 != null) {
                                        c5139d = h11;
                                        i10 = 2;
                                        c5139d.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar2).leftMargin, i52, c5139d10);
                                    } else {
                                        c5139d = h11;
                                        i10 = 2;
                                    }
                                } else {
                                    c5139d = h11;
                                    i10 = 2;
                                    if (i49 != -1 && (c5139d2 = (C5139d) sparseArray.get(i49)) != null) {
                                        c5139d.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar2).leftMargin, i52, c5139d2);
                                        i11 = 2;
                                        i12 = 4;
                                        if (i50 == -1) {
                                            C5139d c5139d11 = (C5139d) sparseArray.get(i50);
                                            if (c5139d11 != null) {
                                                c5139d.v(i12, i11, ((ViewGroup.MarginLayoutParams) eVar2).rightMargin, i53, c5139d11);
                                            }
                                            i13 = i11;
                                        } else {
                                            i13 = i11;
                                            if (i51 != -1 && (c5139d3 = (C5139d) sparseArray.get(i51)) != null) {
                                                c5139d.v(i12, i12, ((ViewGroup.MarginLayoutParams) eVar2).rightMargin, i53, c5139d3);
                                            }
                                        }
                                        i14 = i12;
                                        i15 = eVar2.i;
                                        if (i15 == -1) {
                                            C5139d c5139d12 = (C5139d) sparseArray.get(i15);
                                            if (c5139d12 != null) {
                                                i22 = 3;
                                                c5139d.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar2).topMargin, eVar2.f42079x, c5139d12);
                                            } else {
                                                i22 = 3;
                                            }
                                            i17 = i22;
                                            i18 = 5;
                                            i16 = -1;
                                        } else {
                                            int i55 = eVar2.f42059j;
                                            i16 = -1;
                                            if (i55 == -1 || (c5139d4 = (C5139d) sparseArray.get(i55)) == null) {
                                                i17 = 3;
                                                i18 = 5;
                                            } else {
                                                c5139d.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar2).topMargin, eVar2.f42079x, c5139d4);
                                                i17 = 3;
                                                i18 = 5;
                                            }
                                        }
                                        i19 = eVar2.f42061k;
                                        if (i19 == i16) {
                                            C5139d c5139d13 = (C5139d) sparseArray.get(i19);
                                            if (c5139d13 != null) {
                                                int i56 = i17;
                                                c5139d.v(i18, i56, ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin, eVar2.f42081z, c5139d13);
                                                i20 = i56;
                                            } else {
                                                i20 = i17;
                                            }
                                        } else {
                                            i20 = i17;
                                            int i57 = eVar2.f42063l;
                                            if (i57 != i16 && (c5139d5 = (C5139d) sparseArray.get(i57)) != null) {
                                                c5139d.v(i18, i18, ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin, eVar2.f42081z, c5139d5);
                                            }
                                        }
                                        eVar = eVar2;
                                        i21 = eVar.f42065m;
                                        if (i21 == -1) {
                                            constraintLayout = this;
                                            c5139d6 = c5139d;
                                            constraintLayout.l(c5139d6, eVar, sparseArray, i21, 6);
                                        } else {
                                            int i58 = eVar.f42066n;
                                            if (i58 != -1) {
                                                constraintLayout = this;
                                                c5139d6 = c5139d;
                                                constraintLayout.l(c5139d6, eVar, sparseArray, i58, i20);
                                            } else {
                                                int i59 = eVar.f42068o;
                                                constraintLayout = this;
                                                c5139d6 = c5139d;
                                                int i60 = i18;
                                                if (i59 != -1) {
                                                    constraintLayout.l(c5139d6, eVar, sparseArray, i59, i60);
                                                }
                                                if (f11 >= 0.0f) {
                                                    c5139d6.f41507d0 = f11;
                                                }
                                                f3 = eVar.f42023F;
                                                if (f3 >= 0.0f) {
                                                    c5139d6.f41509e0 = f3;
                                                }
                                            }
                                        }
                                        if (f11 >= 0.0f) {
                                        }
                                        f3 = eVar.f42023F;
                                        if (f3 >= 0.0f) {
                                        }
                                    }
                                }
                                i11 = i10;
                                i12 = 4;
                                if (i50 == -1) {
                                }
                                i14 = i12;
                                i15 = eVar2.i;
                                if (i15 == -1) {
                                }
                                i19 = eVar2.f42061k;
                                if (i19 == i16) {
                                }
                                eVar = eVar2;
                                i21 = eVar.f42065m;
                                if (i21 == -1) {
                                }
                                if (f11 >= 0.0f) {
                                }
                                f3 = eVar.f42023F;
                                if (f3 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i27 = eVar.f42036T) != -1 || eVar.f42037U != -1)) {
                                int i61 = eVar.f42037U;
                                c5139d6.Y = i27;
                                c5139d6.f41499Z = i61;
                            }
                            if (eVar.f42043a0) {
                                c5139d6.M(i35);
                                c5139d6.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    c5139d6.M(i42);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.f42039W) {
                                    c5139d6.M(3);
                                } else {
                                    c5139d6.M(4);
                                }
                                c5139d6.i(i13).f41474g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                c5139d6.i(i14).f41474g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                c5139d6.M(3);
                                c5139d6.O(0);
                            }
                            if (eVar.f42045b0) {
                                i23 = -1;
                                c5139d6.N(1);
                                c5139d6.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    c5139d6.N(2);
                                }
                            } else {
                                i23 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.f42040X) {
                                        c5139d6.N(3);
                                    } else {
                                        c5139d6.N(4);
                                    }
                                    c5139d6.i(3).f41474g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    c5139d6.i(5).f41474g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    c5139d6.N(3);
                                    c5139d6.L(0);
                                }
                            }
                            String str2 = eVar.f42024G;
                            if (str2 == null || str2.length() == 0) {
                                c5139d6.f41497W = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i25 = i23;
                                    i26 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i25 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i23;
                                    i26 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i26);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i26, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i25 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    c5139d6.f41497W = parseFloat;
                                    c5139d6.f41498X = i25;
                                }
                            }
                            float f13 = eVar.f42025H;
                            float[] fArr = c5139d6.f41520k0;
                            fArr[0] = f13;
                            i35 = 1;
                            fArr[1] = eVar.f42026I;
                            c5139d6.f41516i0 = eVar.J;
                            c5139d6.f41518j0 = eVar.f42027K;
                            int i62 = eVar.f42041Z;
                            if (i62 >= 0 && i62 <= 3) {
                                c5139d6.f41530q = i62;
                            }
                            int i63 = eVar.f42028L;
                            int i64 = eVar.f42030N;
                            int i65 = eVar.f42032P;
                            float f14 = eVar.f42034R;
                            c5139d6.f41531r = i63;
                            c5139d6.f41534u = i64;
                            if (i65 == Integer.MAX_VALUE) {
                                i65 = 0;
                            }
                            c5139d6.f41535v = i65;
                            c5139d6.f41536w = f14;
                            if (f14 > 0.0f && f14 < 1.0f && i63 == 0) {
                                c5139d6.f41531r = 2;
                            }
                            int i66 = eVar.f42029M;
                            int i67 = eVar.f42031O;
                            int i68 = eVar.f42033Q;
                            float f15 = eVar.f42035S;
                            c5139d6.f41532s = i66;
                            c5139d6.f41537x = i67;
                            if (i68 == Integer.MAX_VALUE) {
                                i68 = 0;
                            }
                            c5139d6.f41538y = i68;
                            c5139d6.f41539z = f15;
                            if (f15 <= 0.0f || f15 >= 1.0f || i66 != 0) {
                                i24 = 2;
                            } else {
                                i24 = 2;
                                c5139d6.f41532s = 2;
                            }
                        }
                        i45 = i9 + 1;
                        i42 = i24;
                        z3 = z6;
                    }
                    i9 = i45;
                    z6 = z3;
                    i24 = i42;
                    i45 = i9 + 1;
                    i42 = i24;
                    z3 = z6;
                }
            }
            if (z3) {
                c5140e.f41552r0.w(c5140e);
            }
        }
        c5140e.f41557w0.getClass();
        constraintLayout.k(c5140e, constraintLayout.f4645B, i, i6);
        int q8 = c5140e.q();
        int k9 = c5140e.k();
        boolean z11 = c5140e.f41543E0;
        boolean z12 = c5140e.f41544F0;
        f fVar = constraintLayout.f4651H;
        int i69 = fVar.f42086e;
        int resolveSizeAndState = View.resolveSizeAndState(q8 + fVar.f42085d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k9 + i69, i6, 0) & 16777215;
        int min = Math.min(constraintLayout.f4657y, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.f4658z, resolveSizeAndState2);
        if (z11) {
            min |= b.bc;
        }
        if (z12) {
            min2 |= b.bc;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C5139d h9 = h(view);
        if ((view instanceof p) && !(h9 instanceof w.h)) {
            e eVar = (e) view.getLayoutParams();
            w.h hVar = new w.h();
            eVar.f42071p0 = hVar;
            eVar.f42049d0 = true;
            hVar.S(eVar.f42038V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((e) view.getLayoutParams()).f42051e0 = true;
            ArrayList arrayList = this.f4653u;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f4652n.put(view.getId(), view);
        this.f4644A = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4652n.remove(view.getId());
        C5139d h9 = h(view);
        this.f4654v.f41551q0.remove(h9);
        h9.C();
        this.f4653u.remove(view);
        this.f4644A = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4644A = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f4646C = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f4652n;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f4658z) {
            return;
        }
        this.f4658z = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f4657y) {
            return;
        }
        this.f4657y = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f4656x) {
            return;
        }
        this.f4656x = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f4655w) {
            return;
        }
        this.f4655w = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        C5019n c5019n = this.f4647D;
        if (c5019n != null) {
            c5019n.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f4645B = i;
        C5140e c5140e = this.f4654v;
        c5140e.f41542D0 = i;
        C5047c.f40952q = c5140e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4652n = new SparseArray();
        this.f4653u = new ArrayList(4);
        this.f4654v = new C5140e();
        this.f4655w = 0;
        this.f4656x = 0;
        this.f4657y = Integer.MAX_VALUE;
        this.f4658z = Integer.MAX_VALUE;
        this.f4644A = true;
        this.f4645B = 257;
        this.f4646C = null;
        this.f4647D = null;
        this.f4648E = -1;
        this.f4649F = new HashMap();
        this.f4650G = new SparseArray();
        this.f4651H = new f(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e eVar = new e(layoutParams);
        eVar.f42042a = -1;
        eVar.f42044b = -1;
        eVar.f42046c = -1.0f;
        eVar.f42048d = true;
        eVar.f42050e = -1;
        eVar.f42052f = -1;
        eVar.f42054g = -1;
        eVar.f42056h = -1;
        eVar.i = -1;
        eVar.f42059j = -1;
        eVar.f42061k = -1;
        eVar.f42063l = -1;
        eVar.f42065m = -1;
        eVar.f42066n = -1;
        eVar.f42068o = -1;
        eVar.f42070p = -1;
        eVar.f42072q = 0;
        eVar.f42073r = 0.0f;
        eVar.f42074s = -1;
        eVar.f42075t = -1;
        eVar.f42076u = -1;
        eVar.f42077v = -1;
        eVar.f42078w = Integer.MIN_VALUE;
        eVar.f42079x = Integer.MIN_VALUE;
        eVar.f42080y = Integer.MIN_VALUE;
        eVar.f42081z = Integer.MIN_VALUE;
        eVar.f42018A = Integer.MIN_VALUE;
        eVar.f42019B = Integer.MIN_VALUE;
        eVar.f42020C = Integer.MIN_VALUE;
        eVar.f42021D = 0;
        eVar.f42022E = 0.5f;
        eVar.f42023F = 0.5f;
        eVar.f42024G = null;
        eVar.f42025H = -1.0f;
        eVar.f42026I = -1.0f;
        eVar.J = 0;
        eVar.f42027K = 0;
        eVar.f42028L = 0;
        eVar.f42029M = 0;
        eVar.f42030N = 0;
        eVar.f42031O = 0;
        eVar.f42032P = 0;
        eVar.f42033Q = 0;
        eVar.f42034R = 1.0f;
        eVar.f42035S = 1.0f;
        eVar.f42036T = -1;
        eVar.f42037U = -1;
        eVar.f42038V = -1;
        eVar.f42039W = false;
        eVar.f42040X = false;
        eVar.Y = null;
        eVar.f42041Z = 0;
        eVar.f42043a0 = true;
        eVar.f42045b0 = true;
        eVar.f42047c0 = false;
        eVar.f42049d0 = false;
        eVar.f42051e0 = false;
        eVar.f42053f0 = -1;
        eVar.f42055g0 = -1;
        eVar.f42057h0 = -1;
        eVar.f42058i0 = -1;
        eVar.f42060j0 = Integer.MIN_VALUE;
        eVar.f42062k0 = Integer.MIN_VALUE;
        eVar.f42064l0 = 0.5f;
        eVar.f42071p0 = new C5139d();
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
        eVar.f42042a = eVar2.f42042a;
        eVar.f42044b = eVar2.f42044b;
        eVar.f42046c = eVar2.f42046c;
        eVar.f42048d = eVar2.f42048d;
        eVar.f42050e = eVar2.f42050e;
        eVar.f42052f = eVar2.f42052f;
        eVar.f42054g = eVar2.f42054g;
        eVar.f42056h = eVar2.f42056h;
        eVar.i = eVar2.i;
        eVar.f42059j = eVar2.f42059j;
        eVar.f42061k = eVar2.f42061k;
        eVar.f42063l = eVar2.f42063l;
        eVar.f42065m = eVar2.f42065m;
        eVar.f42066n = eVar2.f42066n;
        eVar.f42068o = eVar2.f42068o;
        eVar.f42070p = eVar2.f42070p;
        eVar.f42072q = eVar2.f42072q;
        eVar.f42073r = eVar2.f42073r;
        eVar.f42074s = eVar2.f42074s;
        eVar.f42075t = eVar2.f42075t;
        eVar.f42076u = eVar2.f42076u;
        eVar.f42077v = eVar2.f42077v;
        eVar.f42078w = eVar2.f42078w;
        eVar.f42079x = eVar2.f42079x;
        eVar.f42080y = eVar2.f42080y;
        eVar.f42081z = eVar2.f42081z;
        eVar.f42018A = eVar2.f42018A;
        eVar.f42019B = eVar2.f42019B;
        eVar.f42020C = eVar2.f42020C;
        eVar.f42021D = eVar2.f42021D;
        eVar.f42022E = eVar2.f42022E;
        eVar.f42023F = eVar2.f42023F;
        eVar.f42024G = eVar2.f42024G;
        eVar.f42025H = eVar2.f42025H;
        eVar.f42026I = eVar2.f42026I;
        eVar.J = eVar2.J;
        eVar.f42027K = eVar2.f42027K;
        eVar.f42039W = eVar2.f42039W;
        eVar.f42040X = eVar2.f42040X;
        eVar.f42028L = eVar2.f42028L;
        eVar.f42029M = eVar2.f42029M;
        eVar.f42030N = eVar2.f42030N;
        eVar.f42032P = eVar2.f42032P;
        eVar.f42031O = eVar2.f42031O;
        eVar.f42033Q = eVar2.f42033Q;
        eVar.f42034R = eVar2.f42034R;
        eVar.f42035S = eVar2.f42035S;
        eVar.f42036T = eVar2.f42036T;
        eVar.f42037U = eVar2.f42037U;
        eVar.f42038V = eVar2.f42038V;
        eVar.f42043a0 = eVar2.f42043a0;
        eVar.f42045b0 = eVar2.f42045b0;
        eVar.f42047c0 = eVar2.f42047c0;
        eVar.f42049d0 = eVar2.f42049d0;
        eVar.f42053f0 = eVar2.f42053f0;
        eVar.f42055g0 = eVar2.f42055g0;
        eVar.f42057h0 = eVar2.f42057h0;
        eVar.f42058i0 = eVar2.f42058i0;
        eVar.f42060j0 = eVar2.f42060j0;
        eVar.f42062k0 = eVar2.f42062k0;
        eVar.f42064l0 = eVar2.f42064l0;
        eVar.Y = eVar2.Y;
        eVar.f42041Z = eVar2.f42041Z;
        eVar.f42071p0 = eVar2.f42071p0;
        return eVar;
    }
}
