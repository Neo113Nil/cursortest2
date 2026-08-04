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
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.k3.a;
import com.gamericefishpro.space.k3.d;
import com.gamericefishpro.space.k3.e;
import com.gamericefishpro.space.k3.j;
import com.gamericefishpro.space.l3.k;
import com.gamericefishpro.space.l3.m;
import com.gamericefishpro.space.n3.f;
import com.gamericefishpro.space.n3.g;
import com.gamericefishpro.space.n3.h;
import com.gamericefishpro.space.n3.o;
import com.gamericefishpro.space.n3.p;
import com.gamericefishpro.space.n3.q;
import com.gamericefishpro.space.n3.s;
import com.gamericefishpro.space.n3.t;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.u6.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static t K;
    public boolean A;
    public int B;
    public o C;
    public c D;
    public int E;
    public HashMap F;
    public final SparseArray G;
    public final f H;
    public int I;
    public int J;
    public final SparseArray d;
    public final ArrayList e;
    public final e i;
    public int v;
    public int w;
    public int y;
    public int z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new SparseArray();
        this.e = new ArrayList(4);
        this.i = new e();
        this.v = 0;
        this.w = 0;
        this.y = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.A = true;
        this.B = 257;
        this.C = null;
        this.D = null;
        this.E = -1;
        this.F = new HashMap();
        this.G = new SparseArray();
        this.H = new f(this, this);
        this.I = 0;
        this.J = 0;
        i(attributeSet, 0);
    }

    public static com.gamericefishpro.space.n3.e d() {
        com.gamericefishpro.space.n3.e eVar = new com.gamericefishpro.space.n3.e(-2, -2);
        eVar.a = -1;
        eVar.b = -1;
        eVar.c = -1.0f;
        eVar.d = -1;
        eVar.e = -1;
        eVar.f = -1;
        eVar.g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.j = -1;
        eVar.k = -1;
        eVar.l = -1;
        eVar.m = -1;
        eVar.n = -1;
        eVar.o = -1;
        eVar.p = 0;
        eVar.q = 0.0f;
        eVar.r = -1;
        eVar.s = -1;
        eVar.t = -1;
        eVar.u = -1;
        eVar.v = Integer.MIN_VALUE;
        eVar.w = Integer.MIN_VALUE;
        eVar.x = Integer.MIN_VALUE;
        eVar.y = Integer.MIN_VALUE;
        eVar.z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.a0 = true;
        eVar.b0 = false;
        eVar.c0 = false;
        eVar.d0 = false;
        eVar.e0 = -1;
        eVar.f0 = -1;
        eVar.g0 = -1;
        eVar.h0 = -1;
        eVar.i0 = Integer.MIN_VALUE;
        eVar.j0 = Integer.MIN_VALUE;
        eVar.k0 = 0.5f;
        eVar.o0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static t getSharedValues() {
        if (K == null) {
            t tVar = new t();
            new SparseIntArray();
            new HashMap();
            K = tVar;
        }
        return K;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.gamericefishpro.space.n3.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((com.gamericefishpro.space.n3.c) arrayList.get(i)).getClass();
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
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public final d e(View view) {
        if (view == this) {
            return this.i;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof com.gamericefishpro.space.n3.e) {
            return ((com.gamericefishpro.space.n3.e) view.getLayoutParams()).o0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof com.gamericefishpro.space.n3.e) {
            return ((com.gamericefishpro.space.n3.e) view.getLayoutParams()).o0;
        }
        return null;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.A = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        com.gamericefishpro.space.n3.e eVar = new com.gamericefishpro.space.n3.e(context, attributeSet);
        eVar.a = -1;
        eVar.b = -1;
        eVar.c = -1.0f;
        eVar.d = -1;
        eVar.e = -1;
        eVar.f = -1;
        eVar.g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.j = -1;
        eVar.k = -1;
        eVar.l = -1;
        eVar.m = -1;
        eVar.n = -1;
        eVar.o = -1;
        eVar.p = 0;
        eVar.q = 0.0f;
        eVar.r = -1;
        eVar.s = -1;
        eVar.t = -1;
        eVar.u = -1;
        eVar.v = Integer.MIN_VALUE;
        eVar.w = Integer.MIN_VALUE;
        eVar.x = Integer.MIN_VALUE;
        eVar.y = Integer.MIN_VALUE;
        eVar.z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.a0 = true;
        eVar.b0 = false;
        eVar.c0 = false;
        eVar.d0 = false;
        eVar.e0 = -1;
        eVar.f0 = -1;
        eVar.g0 = -1;
        eVar.h0 = -1;
        eVar.i0 = Integer.MIN_VALUE;
        eVar.j0 = Integer.MIN_VALUE;
        eVar.k0 = 0.5f;
        eVar.o0 = new d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = com.gamericefishpro.space.n3.d.a.get(index);
            switch (i2) {
                case 1:
                    eVar.U = typedArrayObtainStyledAttributes.getInt(index, eVar.U);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.o);
                    eVar.o = resourceId;
                    if (resourceId == -1) {
                        eVar.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    eVar.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.p);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, eVar.q) % 360.0f;
                    eVar.q = f;
                    if (f < 0.0f) {
                        eVar.q = (360.0f - f) % 360.0f;
                    }
                    break;
                case i.STRING_FIELD_NUMBER /* 5 */:
                    eVar.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.a);
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    eVar.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.b);
                    break;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    eVar.c = typedArrayObtainStyledAttributes.getFloat(index, eVar.c);
                    break;
                case i.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.d);
                    eVar.d = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.e);
                    eVar.e = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f);
                    eVar.f = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.g);
                    eVar.g = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.h);
                    eVar.h = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.i);
                    eVar.i = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.j);
                    eVar.j = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.k);
                    eVar.k = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.l);
                    eVar.l = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.r);
                    eVar.r = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.s);
                    eVar.s = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.t);
                    eVar.t = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.u);
                    eVar.u = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    eVar.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.v);
                    break;
                case 22:
                    eVar.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.w);
                    break;
                case 23:
                    eVar.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.x);
                    break;
                case 24:
                    eVar.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.y);
                    break;
                case 25:
                    eVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.z);
                    break;
                case 26:
                    eVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.A);
                    break;
                case 27:
                    eVar.V = typedArrayObtainStyledAttributes.getBoolean(index, eVar.V);
                    break;
                case 28:
                    eVar.W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.W);
                    break;
                case 29:
                    eVar.D = typedArrayObtainStyledAttributes.getFloat(index, eVar.D);
                    break;
                case 30:
                    eVar.E = typedArrayObtainStyledAttributes.getFloat(index, eVar.E);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.K = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.L = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        eVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.M);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.M) == -2) {
                            eVar.M = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        eVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.O);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.O) == -2) {
                            eVar.O = -2;
                        }
                    }
                    break;
                case 35:
                    eVar.Q = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.Q));
                    eVar.K = 2;
                    break;
                case 36:
                    try {
                        eVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.N);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.N) == -2) {
                            eVar.N = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.P);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.P) == -2) {
                            eVar.P = -2;
                        }
                    }
                    break;
                case 38:
                    eVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.R));
                    eVar.L = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            o.h(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.G = typedArrayObtainStyledAttributes.getFloat(index, eVar.G);
                            break;
                        case 46:
                            eVar.H = typedArrayObtainStyledAttributes.getFloat(index, eVar.H);
                            break;
                        case 47:
                            eVar.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.S);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            eVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.T);
                            break;
                        case 51:
                            eVar.X = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.m);
                            eVar.m = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.n);
                            eVar.n = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            eVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.C);
                            break;
                        case 55:
                            eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.B);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.Y = typedArrayObtainStyledAttributes.getInt(index, eVar.Y);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.z;
    }

    public int getMaxWidth() {
        return this.y;
    }

    public int getMinHeight() {
        return this.w;
    }

    public int getMinWidth() {
        return this.v;
    }

    public int getOptimizationLevel() {
        return this.i.C0;
    }

    public final void i(AttributeSet attributeSet, int i) {
        e eVar = this.i;
        eVar.e0 = this;
        f fVar = this.H;
        eVar.t0 = fVar;
        eVar.r0.f = fVar;
        this.d.put(getId(), this);
        this.C = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.v);
                } else if (index == 17) {
                    this.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.w);
                } else if (index == 14) {
                    this.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.y);
                } else if (index == 15) {
                    this.z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.z);
                } else if (index == 112) {
                    this.B = typedArrayObtainStyledAttributes.getInt(index, this.B);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.D = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.C = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.C = null;
                    }
                    this.E = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.C0 = this.B;
        com.gamericefishpro.space.i3.c.p = eVar.R(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        c cVar = new c();
        cVar.d = new SparseArray();
        cVar.e = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            g gVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                cVar.n(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                gVar = new g(context, xml);
                                ((SparseArray) cVar.d).put(gVar.d, gVar);
                            }
                            break;
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
                                h hVar = new h(context, xml);
                                if (gVar != null) {
                                    ((ArrayList) gVar.i).add(hVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        this.D = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x030c  */
    /* JADX WARN: Code duplicated, block: B:162:0x032a  */
    /* JADX WARN: Code duplicated, block: B:164:0x032d  */
    /* JADX WARN: Code duplicated, block: B:168:0x034c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0368  */
    /* JADX WARN: Code duplicated, block: B:403:0x0399 A[SYNTHETIC] */
    public final void k(e eVar, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        ArrayList arrayList;
        f fVar;
        int i7;
        boolean zO;
        int i8;
        int i9;
        f fVar2;
        int i10;
        boolean z2;
        f fVar3;
        k kVar;
        m mVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        int size;
        int i18;
        int size2;
        int i19;
        com.gamericefishpro.space.l3.o oVar;
        com.gamericefishpro.space.l3.o oVar2;
        int mode = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i20 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        f fVar4 = this.H;
        fVar4.b = iMax3;
        fVar4.c = iMax4;
        fVar4.d = paddingWidth;
        fVar4.e = i20;
        fVar4.f = i2;
        fVar4.g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i21 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i22 = size3 - paddingWidth;
        int i23 = size4 - i20;
        int i24 = fVar4.e;
        int i25 = fVar4.d;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.v);
                iMin = iMax;
            } else {
                iMin = i22;
            }
            i21 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.v);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i21 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.y - i25, i22);
            i21 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.w);
                iMin2 = iMax2;
            } else {
                iMin2 = i23;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.z - i24, i23);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.w);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iN = eVar.n();
        com.gamericefishpro.space.l3.e eVar2 = eVar.r0;
        int[] iArr = eVar.B;
        int i26 = iMin;
        if (i26 == iN && iMin2 == eVar.k()) {
            c = 1;
        } else {
            eVar2.c = true;
            c = 1;
        }
        eVar.X = 0;
        eVar.Y = 0;
        iArr[0] = this.y - i25;
        iArr[c] = this.z - i24;
        eVar.a0 = 0;
        eVar.b0 = 0;
        eVar.H(i21);
        eVar.J(i26);
        eVar.I(i4);
        eVar.G(iMin2);
        int i27 = this.v - i25;
        if (i27 < 0) {
            eVar.a0 = 0;
        } else {
            eVar.a0 = i27;
        }
        int i28 = this.w - i24;
        if (i28 < 0) {
            eVar.b0 = 0;
        } else {
            eVar.b0 = i28;
        }
        eVar.w0 = iMax5;
        eVar.x0 = iMax3;
        com.gamericefishpro.space.a8.c cVar = eVar.q0;
        e eVar3 = (e) cVar.v;
        ArrayList arrayList2 = (ArrayList) cVar.e;
        f fVar5 = eVar.t0;
        int size5 = eVar.p0.size();
        int iN2 = eVar.n();
        int iK = eVar.k();
        boolean zC = j.c(i, 128);
        boolean z4 = zC || j.c(i, 64);
        if (z4) {
            int i29 = 0;
            while (true) {
                if (i29 < size5) {
                    boolean z5 = z4;
                    d dVar = (d) eVar.p0.get(i29);
                    int i30 = i29;
                    int[] iArr2 = dVar.o0;
                    i5 = size5;
                    boolean z6 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.V > 0.0f;
                    if ((dVar.u() && z6) || ((dVar.v() && z6) || (dVar instanceof com.gamericefishpro.space.k3.g) || dVar.u() || dVar.v())) {
                        i6 = 1073741824;
                        z = false;
                    } else {
                        i29 = i30 + 1;
                        z4 = z5;
                        size5 = i5;
                    }
                } else {
                    z = z4;
                    i5 = size5;
                    i6 = 1073741824;
                }
            }
        } else {
            z = z4;
            i5 = size5;
            i6 = 1073741824;
        }
        boolean z7 = z & ((mode == i6 && mode2 == i6) || zC);
        if (z7) {
            int iMin3 = Math.min(iArr[0], i22);
            int iMin4 = Math.min(iArr[1], i23);
            int i31 = 1073741824;
            if (mode == 1073741824) {
                if (eVar.n() != iMin3) {
                    eVar.J(iMin3);
                    eVar2.b = true;
                }
                i31 = 1073741824;
            }
            if (mode2 == i31 && eVar.k() != iMin4) {
                eVar.G(iMin4);
                eVar2.b = true;
            }
            if (mode == i31 && mode2 == i31) {
                ArrayList arrayList3 = eVar2.e;
                e eVar4 = eVar2.a;
                if (eVar2.b || eVar2.c) {
                    ArrayList arrayList4 = eVar4.p0;
                    int size6 = arrayList4.size();
                    int i32 = 0;
                    while (i32 < size6) {
                        Object obj = arrayList4.get(i32);
                        int i33 = i32 + 1;
                        d dVar2 = (d) obj;
                        dVar2.h();
                        dVar2.a = false;
                        dVar2.d.n();
                        dVar2.e.m();
                        arrayList4 = arrayList4;
                        i32 = i33;
                    }
                    eVar4.h();
                    i13 = 0;
                    eVar4.a = false;
                    eVar4.d.n();
                    eVar4.e.m();
                    eVar2.c = false;
                } else {
                    i13 = 0;
                }
                eVar2.b(eVar2.d);
                eVar4.X = i13;
                int[] iArr3 = eVar4.o0;
                eVar4.Y = i13;
                int iJ = eVar4.j(i13);
                int iJ2 = eVar4.j(1);
                if (eVar2.b) {
                    eVar2.c();
                }
                int iO = eVar4.o();
                fVar = fVar5;
                int iP = eVar4.p();
                arrayList = arrayList2;
                eVar4.d.h.d(iO);
                eVar4.e.h.d(iP);
                eVar2.g();
                if (iJ == 2 || iJ2 == 2) {
                    if (zC) {
                        int size7 = arrayList3.size();
                        i14 = iO;
                        int i34 = 0;
                        while (i34 < size7) {
                            Object obj2 = arrayList3.get(i34);
                            i34++;
                            if (!((com.gamericefishpro.space.l3.o) obj2).k()) {
                                zC = false;
                                break;
                            }
                        }
                    } else {
                        i14 = iO;
                    }
                    if (zC && iJ == 2) {
                        eVar4.H(1);
                        eVar4.J(eVar2.d(eVar4, 0));
                        eVar4.d.e.d(eVar4.n());
                    }
                    if (zC && iJ2 == 2) {
                        i15 = 1;
                        eVar4.I(1);
                        eVar4.G(eVar2.d(eVar4, 1));
                        eVar4.e.e.d(eVar4.k());
                    }
                    i16 = iArr3[0];
                    if (i16 != i15 || i16 == 4) {
                        int iN3 = eVar4.n() + i14;
                        eVar4.d.i.d(iN3);
                        eVar4.d.e.d(iN3 - i14);
                        eVar2.g();
                        i17 = iArr3[1];
                        if (i17 != 1 || i17 == 4) {
                            int iK2 = eVar4.k() + iP;
                            eVar4.e.i.d(iK2);
                            eVar4.e.e.d(iK2 - iP);
                        }
                        eVar2.g();
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    size = arrayList3.size();
                    i18 = 0;
                    while (i18 < size) {
                        Object obj3 = arrayList3.get(i18);
                        i18++;
                        oVar2 = (com.gamericefishpro.space.l3.o) obj3;
                        if (oVar2.b == eVar4 || oVar2.g) {
                            oVar2.e();
                        }
                    }
                    size2 = arrayList3.size();
                    i19 = 0;
                    while (true) {
                        if (i19 < size2) {
                            zO = true;
                            break;
                        }
                        Object obj4 = arrayList3.get(i19);
                        i19++;
                        oVar = (com.gamericefishpro.space.l3.o) obj4;
                        if (!z3 || oVar.b != eVar4) {
                            if (oVar.h.j || ((!oVar.i.j && !(oVar instanceof com.gamericefishpro.space.l3.i)) || (!oVar.e.j && !(oVar instanceof com.gamericefishpro.space.l3.c) && !(oVar instanceof com.gamericefishpro.space.l3.i)))) {
                                zO = false;
                                break;
                            }
                        }
                    }
                    eVar4.H(iJ);
                    eVar4.I(iJ2);
                    i7 = 2;
                    i12 = 1073741824;
                } else {
                    i14 = iO;
                }
                i15 = 1;
                i16 = iArr3[0];
                if (i16 != i15) {
                    int iN4 = eVar4.n() + i14;
                    eVar4.d.i.d(iN4);
                    eVar4.d.e.d(iN4 - i14);
                    eVar2.g();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iK3 = eVar4.k() + iP;
                        eVar4.e.i.d(iK3);
                        eVar4.e.e.d(iK3 - iP);
                    } else {
                        int iK4 = eVar4.k() + iP;
                        eVar4.e.i.d(iK4);
                        eVar4.e.e.d(iK4 - iP);
                    }
                    eVar2.g();
                    z3 = true;
                } else {
                    int iN5 = eVar4.n() + i14;
                    eVar4.d.i.d(iN5);
                    eVar4.d.e.d(iN5 - i14);
                    eVar2.g();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iK5 = eVar4.k() + iP;
                        eVar4.e.i.d(iK5);
                        eVar4.e.e.d(iK5 - iP);
                    } else {
                        int iK6 = eVar4.k() + iP;
                        eVar4.e.i.d(iK6);
                        eVar4.e.e.d(iK6 - iP);
                    }
                    eVar2.g();
                    z3 = true;
                }
                size = arrayList3.size();
                i18 = 0;
                while (i18 < size) {
                    Object obj5 = arrayList3.get(i18);
                    i18++;
                    oVar2 = (com.gamericefishpro.space.l3.o) obj5;
                    if (oVar2.b == eVar4) {
                    }
                    oVar2.e();
                }
                size2 = arrayList3.size();
                i19 = 0;
                while (true) {
                    if (i19 < size2) {
                        zO = true;
                        break;
                    }
                    Object obj6 = arrayList3.get(i19);
                    i19++;
                    oVar = (com.gamericefishpro.space.l3.o) obj6;
                    if (!z3) {
                    }
                    if (oVar.h.j) {
                    }
                    zO = false;
                    break;
                }
                eVar4.H(iJ);
                eVar4.I(iJ2);
                i7 = 2;
                i12 = 1073741824;
            } else {
                z7 = z7;
                arrayList = arrayList2;
                fVar = fVar5;
                e eVar5 = eVar2.a;
                if (eVar2.b) {
                    ArrayList arrayList5 = eVar5.p0;
                    int size8 = arrayList5.size();
                    int i35 = 0;
                    while (i35 < size8) {
                        Object obj7 = arrayList5.get(i35);
                        i35++;
                        d dVar3 = (d) obj7;
                        dVar3.h();
                        dVar3.a = false;
                        k kVar2 = dVar3.d;
                        ArrayList arrayList6 = arrayList5;
                        kVar2.e.j = false;
                        kVar2.g = false;
                        kVar2.n();
                        m mVar2 = dVar3.e;
                        mVar2.e.j = false;
                        mVar2.g = false;
                        mVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i11 = 0;
                    eVar5.h();
                    eVar5.a = false;
                    k kVar3 = eVar5.d;
                    kVar3.e.j = false;
                    kVar3.g = false;
                    kVar3.n();
                    m mVar3 = eVar5.e;
                    mVar3.e.j = false;
                    mVar3.g = false;
                    mVar3.m();
                    eVar2.c();
                } else {
                    i11 = 0;
                }
                eVar2.b(eVar2.d);
                eVar5.X = i11;
                eVar5.Y = i11;
                eVar5.d.h.d(i11);
                eVar5.e.h.d(i11);
                i12 = 1073741824;
                if (mode == 1073741824) {
                    zO = eVar.O(i11, zC);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zO = true;
                }
                if (mode2 == 1073741824) {
                    zO &= eVar.O(1, zC);
                    i7++;
                }
            }
            if (zO) {
                eVar.K(mode == i12, mode2 == i12);
            }
        } else {
            z7 = z7;
            arrayList = arrayList2;
            fVar = fVar5;
            i7 = 0;
            zO = false;
        }
        if (zO && i7 == 2) {
            return;
        }
        int i36 = eVar.C0;
        if (i5 > 0) {
            int size9 = eVar.p0.size();
            boolean zR = eVar.R(64);
            f fVar6 = eVar.t0;
            for (int i37 = 0; i37 < size9; i37++) {
                d dVar4 = (d) eVar.p0.get(i37);
                if (!(dVar4 instanceof com.gamericefishpro.space.k3.h) && !(dVar4 instanceof a) && !dVar4.E && (!zR || (kVar = dVar4.d) == null || (mVar = dVar4.e) == null || !kVar.e.j || !mVar.e.j)) {
                    int iJ3 = dVar4.j(0);
                    int iJ4 = dVar4.j(1);
                    boolean z8 = iJ3 == 3 && dVar4.q != 1 && iJ4 == 3 && dVar4.r != 1;
                    if (!z8 && eVar.R(1) && !(dVar4 instanceof com.gamericefishpro.space.k3.g)) {
                        if (iJ3 == 3 && dVar4.q == 0 && iJ4 != 3 && !dVar4.u()) {
                            z8 = true;
                        }
                        if (iJ4 == 3 && dVar4.r == 0 && iJ3 != 3 && !dVar4.u()) {
                            z8 = true;
                        }
                        if ((iJ3 == 3 || iJ4 == 3) && dVar4.V > 0.0f) {
                            z8 = true;
                        }
                    }
                    if (!z8) {
                        cVar.r(0, dVar4, fVar6);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.e;
            for (int i38 = 0; i38 < childCount2; i38++) {
                constraintLayout.getChildAt(i38);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i39 = 0; i39 < size10; i39++) {
                    ((com.gamericefishpro.space.n3.c) arrayList7.get(i39)).getClass();
                }
            }
        }
        cVar.K(eVar);
        int size11 = arrayList.size();
        if (i5 > 0) {
            cVar.I(eVar, 0, iN2, iK);
        }
        if (size11 > 0) {
            int[] iArr4 = eVar.o0;
            boolean z9 = iArr4[0] == 2;
            boolean z10 = iArr4[1] == 2;
            int iMax7 = Math.max(eVar.n(), eVar3.a0);
            int iMax8 = Math.max(eVar.k(), eVar3.b0);
            int i40 = 0;
            boolean zR2 = false;
            while (i40 < size11) {
                ArrayList arrayList8 = arrayList;
                d dVar5 = (d) arrayList8.get(i40);
                if (dVar5 instanceof com.gamericefishpro.space.k3.g) {
                    int iN6 = dVar5.n();
                    int iK7 = dVar5.k();
                    z2 = z10;
                    fVar3 = fVar;
                    boolean zR3 = zR2 | cVar.r(1, dVar5, fVar3);
                    int iN7 = dVar5.n();
                    boolean z11 = zR3;
                    int iK8 = dVar5.k();
                    if (iN7 != iN6) {
                        dVar5.J(iN7);
                        if (z9 && dVar5.o() + dVar5.T > iMax7) {
                            iMax7 = Math.max(iMax7, dVar5.i(4).e() + dVar5.o() + dVar5.T);
                        }
                        z11 = true;
                    }
                    if (iK8 != iK7) {
                        dVar5.G(iK8);
                        if (z2 && dVar5.p() + dVar5.U > iMax8) {
                            iMax8 = Math.max(iMax8, dVar5.i(5).e() + dVar5.p() + dVar5.U);
                        }
                        z11 = true;
                    }
                    zR2 = z11 | ((com.gamericefishpro.space.k3.g) dVar5).x0;
                } else {
                    z2 = z10;
                    fVar3 = fVar;
                }
                i40++;
                fVar = fVar3;
                arrayList = arrayList8;
                z10 = z2;
            }
            boolean z12 = z10;
            ArrayList arrayList9 = arrayList;
            int i41 = 0;
            while (true) {
                f fVar7 = fVar;
                if (i41 >= 2) {
                    break;
                }
                int i42 = 0;
                while (i42 < size11) {
                    d dVar6 = (d) arrayList9.get(i42);
                    if ((!(dVar6 instanceof com.gamericefishpro.space.k3.i) || (dVar6 instanceof com.gamericefishpro.space.k3.g)) && !(dVar6 instanceof com.gamericefishpro.space.k3.h)) {
                        i8 = size11;
                        if (dVar6.f0 != 8 && ((!z7 || !dVar6.d.e.j || !dVar6.e.e.j) && !(dVar6 instanceof com.gamericefishpro.space.k3.g))) {
                            int iN8 = dVar6.n();
                            int iK9 = dVar6.k();
                            i9 = i42;
                            int i43 = dVar6.Z;
                            zR2 |= cVar.r(i41 == 1 ? 2 : 1, dVar6, fVar7);
                            fVar2 = fVar7;
                            int iN9 = dVar6.n();
                            i10 = i41;
                            int iK10 = dVar6.k();
                            if (iN9 != iN8) {
                                dVar6.J(iN9);
                                if (z9 && dVar6.o() + dVar6.T > iMax7) {
                                    iMax7 = Math.max(iMax7, dVar6.i(4).e() + dVar6.o() + dVar6.T);
                                }
                                zR2 = true;
                            }
                            if (iK10 != iK9) {
                                dVar6.G(iK10);
                                if (z12 && dVar6.p() + dVar6.U > iMax8) {
                                    iMax8 = Math.max(iMax8, dVar6.i(5).e() + dVar6.p() + dVar6.U);
                                }
                                zR2 = true;
                            }
                            if (dVar6.D && i43 != dVar6.Z) {
                                zR2 = true;
                            }
                        }
                        i42 = i9 + 1;
                        size11 = i8;
                        fVar7 = fVar2;
                        i41 = i10;
                    } else {
                        i8 = size11;
                    }
                    fVar2 = fVar7;
                    i10 = i41;
                    i9 = i42;
                    i42 = i9 + 1;
                    size11 = i8;
                    fVar7 = fVar2;
                    i41 = i10;
                }
                int i44 = size11;
                fVar = fVar7;
                int i45 = i41;
                if (!zR2) {
                    break;
                }
                int i46 = i45 + 1;
                cVar.I(eVar, i46, iN2, iK);
                i41 = i46;
                size11 = i44;
                zR2 = false;
            }
        }
        eVar.C0 = i36;
        com.gamericefishpro.space.i3.c.p = eVar.R(512);
    }

    public final void l(d dVar, com.gamericefishpro.space.n3.e eVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.d.get(i);
        d dVar2 = (d) sparseArray.get(i);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof com.gamericefishpro.space.n3.e)) {
            return;
        }
        eVar.b0 = true;
        if (i2 == 6) {
            com.gamericefishpro.space.n3.e eVar2 = (com.gamericefishpro.space.n3.e) view.getLayoutParams();
            eVar2.b0 = true;
            eVar2.o0.D = true;
        }
        dVar.i(6).b(dVar2.i(i2), eVar.C, eVar.B, true);
        dVar.D = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            com.gamericefishpro.space.n3.e eVar = (com.gamericefishpro.space.n3.e) childAt.getLayoutParams();
            d dVar = eVar.o0;
            if (childAt.getVisibility() != 8 || eVar.c0 || eVar.d0 || zIsInEditMode) {
                int iO = dVar.o();
                int iP = dVar.p();
                childAt.layout(iO, iP, dVar.n() + iO, dVar.k() + iP);
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((com.gamericefishpro.space.n3.c) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:128:0x0231  */
    /* JADX WARN: Code duplicated, block: B:167:0x033c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0346  */
    /* JADX WARN: Code duplicated, block: B:172:0x0354  */
    /* JADX WARN: Code duplicated, block: B:179:0x0372  */
    /* JADX WARN: Code duplicated, block: B:181:0x037c  */
    /* JADX WARN: Code duplicated, block: B:182:0x038c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0394  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:197:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:204:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:206:0x0409  */
    /* JADX WARN: Code duplicated, block: B:208:0x040d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0416  */
    /* JADX WARN: Code duplicated, block: B:211:0x0420  */
    /* JADX WARN: Code duplicated, block: B:214:0x0427  */
    /* JADX WARN: Code duplicated, block: B:217:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0554  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        d dVar;
        int i4;
        d dVar2;
        int i5;
        int i6;
        int i7;
        d dVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        d dVar4;
        int i14;
        int i15;
        int i16;
        d dVar5;
        com.gamericefishpro.space.n3.e eVar;
        int i17;
        int i18;
        int i19;
        d dVar6;
        int i20;
        float f;
        d dVar7;
        d dVar8;
        int i21;
        d dVar9;
        int i22;
        int i23;
        int i24;
        int i25;
        float fAbs;
        int i26;
        byte b;
        SparseArray sparseArray;
        ArrayList arrayList;
        String str;
        int iF;
        int i27;
        d dVar10;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.I == i) {
            int i28 = constraintLayout.J;
        }
        int i29 = 1;
        int i30 = 0;
        if (!constraintLayout.A) {
            int childCount = constraintLayout.getChildCount();
            for (int i31 = 0; i31 < childCount; i31++) {
                if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                    constraintLayout.A = true;
                    break;
                }
            }
        }
        constraintLayout.I = i;
        constraintLayout.J = i2;
        boolean z3 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        e eVar2 = constraintLayout.i;
        eVar2.u0 = z3;
        if (constraintLayout.A) {
            constraintLayout.A = false;
            int childCount2 = constraintLayout.getChildCount();
            int i32 = 0;
            while (true) {
                if (i32 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i32).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i32++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i33 = 0; i33 < childCount3; i33++) {
                    d dVarE = constraintLayout.e(constraintLayout.getChildAt(i33));
                    if (dVarE != null) {
                        dVarE.z();
                    }
                }
                SparseArray sparseArray2 = constraintLayout.d;
                if (zIsInEditMode) {
                    int i34 = 0;
                    while (i34 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i34);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i27 = i29;
                                try {
                                    if (constraintLayout.F == null) {
                                        constraintLayout.F = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.F.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i27 = i29;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray2.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                dVar10 = viewFindViewById == constraintLayout ? eVar2 : viewFindViewById == null ? null : ((com.gamericefishpro.space.n3.e) viewFindViewById.getLayoutParams()).o0;
                            }
                            dVar10.g0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i27 = i29;
                        }
                        i34++;
                        i29 = i27;
                    }
                }
                int i35 = i29;
                if (constraintLayout.E != -1) {
                    for (int i36 = 0; i36 < childCount3; i36++) {
                        constraintLayout.getChildAt(i36).getId();
                    }
                }
                o oVar = constraintLayout.C;
                if (oVar != null) {
                    oVar.a(constraintLayout);
                }
                eVar2.p0.clear();
                ArrayList arrayList2 = constraintLayout.e;
                int size = arrayList2.size();
                if (size > 0) {
                    int i37 = 0;
                    while (i37 < size) {
                        com.gamericefishpro.space.n3.c cVar = (com.gamericefishpro.space.n3.c) arrayList2.get(i37);
                        HashMap map = cVar.z;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.w);
                        }
                        com.gamericefishpro.space.k3.i iVar = cVar.v;
                        if (iVar == null) {
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                        } else {
                            iVar.q0 = i30;
                            Arrays.fill(iVar.p0, (Object) null);
                            int i38 = i30;
                            while (i38 < cVar.e) {
                                int i39 = cVar.d[i38];
                                View view = (View) sparseArray2.get(i39);
                                if (view == null && (iF = cVar.f(constraintLayout, (str = (String) map.get(Integer.valueOf(i39))))) != 0) {
                                    cVar.d[i38] = iF;
                                    map.put(Integer.valueOf(iF), str);
                                    view = (View) sparseArray2.get(iF);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    com.gamericefishpro.space.k3.i iVar2 = cVar.v;
                                    d dVarE2 = constraintLayout.e(view2);
                                    iVar2.getClass();
                                    if (dVarE2 != iVar2 && dVarE2 != null) {
                                        int i40 = iVar2.q0 + 1;
                                        d[] dVarArr = iVar2.p0;
                                        if (i40 > dVarArr.length) {
                                            iVar2.p0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.p0;
                                        int i41 = iVar2.q0;
                                        dVarArr2[i41] = dVarE2;
                                        iVar2.q0 = i41 + 1;
                                    }
                                }
                                i38++;
                                sparseArray2 = sparseArray2;
                                arrayList2 = arrayList2;
                            }
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                            cVar.v.N();
                        }
                        i37++;
                        sparseArray2 = sparseArray;
                        arrayList2 = arrayList;
                        i30 = 0;
                    }
                }
                int i42 = 2;
                for (int i43 = 0; i43 < childCount3; i43++) {
                    constraintLayout.getChildAt(i43);
                }
                SparseArray sparseArray3 = constraintLayout.G;
                sparseArray3.clear();
                sparseArray3.put(0, eVar2);
                sparseArray3.put(constraintLayout.getId(), eVar2);
                for (int i44 = 0; i44 < childCount3; i44++) {
                    View childAt2 = constraintLayout.getChildAt(i44);
                    sparseArray3.put(childAt2.getId(), constraintLayout.e(childAt2));
                }
                int i45 = 0;
                while (i45 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i45);
                    d dVarE3 = constraintLayout.e(childAt3);
                    if (dVarE3 == null) {
                        i3 = i45;
                        z2 = z;
                        i23 = i42;
                    } else {
                        com.gamericefishpro.space.n3.e eVar3 = (com.gamericefishpro.space.n3.e) childAt3.getLayoutParams();
                        eVar2.p0.add(dVarE3);
                        d dVar11 = dVarE3.S;
                        if (dVar11 != null) {
                            ((e) dVar11).p0.remove(dVarE3);
                            dVarE3.z();
                        }
                        dVarE3.S = eVar2;
                        eVar3.a();
                        dVarE3.f0 = childAt3.getVisibility();
                        dVarE3.e0 = childAt3;
                        if (childAt3 instanceof com.gamericefishpro.space.n3.c) {
                            ((com.gamericefishpro.space.n3.c) childAt3).h(dVarE3, eVar2.u0);
                        }
                        if (eVar3.c0) {
                            com.gamericefishpro.space.k3.h hVar = (com.gamericefishpro.space.k3.h) dVarE3;
                            int i46 = eVar3.l0;
                            int i47 = eVar3.m0;
                            float f2 = eVar3.n0;
                            if (f2 == -1.0f) {
                                b = -1;
                                if (i46 != -1) {
                                    if (i46 > -1) {
                                        hVar.p0 = -1.0f;
                                        hVar.q0 = i46;
                                        hVar.r0 = -1;
                                    }
                                } else if (i47 != -1 && i47 > -1) {
                                    hVar.p0 = -1.0f;
                                    hVar.q0 = -1;
                                    hVar.r0 = i47;
                                    i3 = i45;
                                    z2 = z;
                                    i23 = i42;
                                }
                                i3 = i45;
                                z2 = z;
                                i23 = i42;
                            } else if (f2 > -1.0f) {
                                hVar.p0 = f2;
                                b = -1;
                                hVar.q0 = -1;
                                hVar.r0 = -1;
                                i3 = i45;
                                z2 = z;
                                i23 = i42;
                            } else {
                                i3 = i45;
                                z2 = z;
                                i23 = i42;
                            }
                        } else {
                            int i48 = eVar3.e0;
                            int i49 = eVar3.f0;
                            int i50 = eVar3.g0;
                            int i51 = eVar3.h0;
                            int i52 = eVar3.i0;
                            int i53 = eVar3.j0;
                            i3 = i45;
                            float f3 = eVar3.k0;
                            int i54 = eVar3.o;
                            z2 = z;
                            if (i54 != -1) {
                                d dVar12 = (d) sparseArray3.get(i54);
                                if (dVar12 != null) {
                                    float f4 = eVar3.q;
                                    dVarE3.s(7, 7, eVar3.p, 0, dVar12);
                                    dVarE3.C = f4;
                                }
                                constraintLayout = this;
                                dVar6 = dVarE3;
                                eVar = eVar3;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i48 != -1) {
                                    d dVar13 = (d) sparseArray3.get(i48);
                                    if (dVar13 != null) {
                                        dVar = dVarE3;
                                        i4 = 2;
                                        dVar.s(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i52, dVar13);
                                    } else {
                                        dVar = dVarE3;
                                        i4 = 2;
                                    }
                                } else {
                                    dVar = dVarE3;
                                    i4 = 2;
                                    if (i49 != -1 && (dVar2 = (d) sparseArray3.get(i49)) != null) {
                                        dVar.s(2, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i52, dVar2);
                                        i5 = 2;
                                        i6 = 4;
                                    }
                                    if (i50 != -1) {
                                        dVar9 = (d) sparseArray3.get(i50);
                                        if (dVar9 != null) {
                                            dVar.s(i6, i5, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i53, dVar9);
                                        }
                                        i7 = i5;
                                    } else {
                                        i7 = i5;
                                        if (i51 != -1 && (dVar3 = (d) sparseArray3.get(i51)) != null) {
                                            dVar.s(i6, i6, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i53, dVar3);
                                        }
                                    }
                                    i8 = i6;
                                    i9 = eVar3.h;
                                    if (i9 != -1) {
                                        dVar8 = (d) sparseArray3.get(i9);
                                        if (dVar8 != null) {
                                            i21 = 3;
                                            dVar.s(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.w, dVar8);
                                        } else {
                                            i21 = 3;
                                        }
                                        i12 = i21;
                                        i13 = 5;
                                        i11 = -1;
                                    } else {
                                        i10 = eVar3.i;
                                        i11 = -1;
                                        if (i10 != -1 || (dVar4 = (d) sparseArray3.get(i10)) == null) {
                                            i12 = 3;
                                            i13 = 5;
                                        } else {
                                            dVar.s(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.w, dVar4);
                                            i12 = 3;
                                            i13 = 5;
                                        }
                                    }
                                    i14 = eVar3.j;
                                    if (i14 != i11) {
                                        dVar7 = (d) sparseArray3.get(i14);
                                        if (dVar7 != null) {
                                            int i55 = i12;
                                            dVar.s(i13, i55, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.y, dVar7);
                                            i15 = i55;
                                        } else {
                                            i15 = i12;
                                        }
                                    } else {
                                        i15 = i12;
                                        i16 = eVar3.k;
                                        if (i16 != i11 && (dVar5 = (d) sparseArray3.get(i16)) != null) {
                                            dVar.s(i13, i13, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.y, dVar5);
                                        }
                                    }
                                    eVar = eVar3;
                                    i17 = eVar.l;
                                    if (i17 != -1) {
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        constraintLayout.l(dVar6, eVar, sparseArray3, i17, 6);
                                    } else {
                                        i18 = eVar.m;
                                        if (i18 != -1) {
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            constraintLayout.l(dVar6, eVar, sparseArray3, i18, i15);
                                        } else {
                                            i19 = eVar.n;
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            i20 = i13;
                                            if (i19 != -1) {
                                                constraintLayout.l(dVar6, eVar, sparseArray3, i19, i20);
                                            }
                                        }
                                        if (f3 >= 0.0f) {
                                            dVar6.c0 = f3;
                                        }
                                        f = eVar.E;
                                        if (f >= 0.0f) {
                                            dVar6.d0 = f;
                                        }
                                    }
                                    if (f3 >= 0.0f) {
                                        dVar6.c0 = f3;
                                    }
                                    f = eVar.E;
                                    if (f >= 0.0f) {
                                        dVar6.d0 = f;
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i50 != -1) {
                                    dVar9 = (d) sparseArray3.get(i50);
                                    if (dVar9 != null) {
                                        dVar.s(i6, i5, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i53, dVar9);
                                    }
                                    i7 = i5;
                                } else {
                                    i7 = i5;
                                    if (i51 != -1) {
                                        dVar.s(i6, i6, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i53, dVar3);
                                    }
                                }
                                i8 = i6;
                                i9 = eVar3.h;
                                if (i9 != -1) {
                                    dVar8 = (d) sparseArray3.get(i9);
                                    if (dVar8 != null) {
                                        i21 = 3;
                                        dVar.s(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.w, dVar8);
                                    } else {
                                        i21 = 3;
                                    }
                                    i12 = i21;
                                    i13 = 5;
                                    i11 = -1;
                                } else {
                                    i10 = eVar3.i;
                                    i11 = -1;
                                    if (i10 != -1) {
                                        i12 = 3;
                                        i13 = 5;
                                    } else {
                                        i12 = 3;
                                        i13 = 5;
                                    }
                                }
                                i14 = eVar3.j;
                                if (i14 != i11) {
                                    dVar7 = (d) sparseArray3.get(i14);
                                    if (dVar7 != null) {
                                        int i56 = i12;
                                        dVar.s(i13, i56, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.y, dVar7);
                                        i15 = i56;
                                    } else {
                                        i15 = i12;
                                    }
                                } else {
                                    i15 = i12;
                                    i16 = eVar3.k;
                                    if (i16 != i11) {
                                        dVar.s(i13, i13, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.y, dVar5);
                                    }
                                }
                                eVar = eVar3;
                                i17 = eVar.l;
                                if (i17 != -1) {
                                    constraintLayout = this;
                                    dVar6 = dVar;
                                    constraintLayout.l(dVar6, eVar, sparseArray3, i17, 6);
                                } else {
                                    i18 = eVar.m;
                                    if (i18 != -1) {
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        constraintLayout.l(dVar6, eVar, sparseArray3, i18, i15);
                                    } else {
                                        i19 = eVar.n;
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        i20 = i13;
                                        if (i19 != -1) {
                                            constraintLayout.l(dVar6, eVar, sparseArray3, i19, i20);
                                        }
                                    }
                                    if (f3 >= 0.0f) {
                                        dVar6.c0 = f3;
                                    }
                                    f = eVar.E;
                                    if (f >= 0.0f) {
                                        dVar6.d0 = f;
                                    }
                                }
                                if (f3 >= 0.0f) {
                                    dVar6.c0 = f3;
                                }
                                f = eVar.E;
                                if (f >= 0.0f) {
                                    dVar6.d0 = f;
                                }
                            }
                            if (zIsInEditMode && ((i26 = eVar.S) != -1 || eVar.T != -1)) {
                                int i57 = eVar.T;
                                dVar6.X = i26;
                                dVar6.Y = i57;
                            }
                            if (eVar.Z) {
                                dVar6.H(i35);
                                dVar6.J(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    dVar6.H(i42);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.V) {
                                    dVar6.H(3);
                                } else {
                                    dVar6.H(4);
                                }
                                dVar6.i(i7).g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                dVar6.i(i8).g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                dVar6.H(3);
                                dVar6.J(0);
                            }
                            if (eVar.a0) {
                                i22 = -1;
                                dVar6.I(1);
                                dVar6.G(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    dVar6.I(2);
                                }
                            } else {
                                i22 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.W) {
                                        dVar6.I(3);
                                    } else {
                                        dVar6.I(4);
                                    }
                                    dVar6.i(3).g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    dVar6.i(5).g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    dVar6.I(3);
                                    dVar6.G(0);
                                }
                            }
                            String str2 = eVar.F;
                            if (str2 == null || str2.length() == 0) {
                                dVar6.V = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i24 = i22;
                                    i25 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i24 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i22;
                                    i25 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i25);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i25, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 <= 0.0f || f6 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i24 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    dVar6.V = fAbs;
                                    dVar6.W = i24;
                                }
                            }
                            float f7 = eVar.G;
                            float[] fArr = dVar6.j0;
                            fArr[0] = f7;
                            i35 = 1;
                            fArr[1] = eVar.H;
                            dVar6.h0 = eVar.I;
                            dVar6.i0 = eVar.J;
                            int i58 = eVar.Y;
                            if (i58 >= 0 && i58 <= 3) {
                                dVar6.p = i58;
                            }
                            int i59 = eVar.K;
                            int i60 = eVar.M;
                            int i61 = eVar.O;
                            float f8 = eVar.Q;
                            dVar6.q = i59;
                            dVar6.t = i60;
                            if (i61 == Integer.MAX_VALUE) {
                                i61 = 0;
                            }
                            dVar6.u = i61;
                            dVar6.v = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i59 == 0) {
                                dVar6.q = 2;
                            }
                            int i62 = eVar.L;
                            int i63 = eVar.N;
                            int i64 = eVar.P;
                            float f9 = eVar.R;
                            dVar6.r = i62;
                            dVar6.w = i63;
                            if (i64 == Integer.MAX_VALUE) {
                                i64 = 0;
                            }
                            dVar6.x = i64;
                            dVar6.y = f9;
                            if (f9 <= 0.0f || f9 >= 1.0f || i62 != 0) {
                                i23 = 2;
                            } else {
                                i23 = 2;
                                dVar6.r = 2;
                            }
                        }
                    }
                    i45 = i3 + 1;
                    i42 = i23;
                    z = z2;
                }
            }
            if (z) {
                eVar2.q0.K(eVar2);
            }
        }
        constraintLayout.k(eVar2, constraintLayout.B, i, i2);
        int iN = eVar2.n();
        int iK = eVar2.k();
        boolean z4 = eVar2.D0;
        boolean z5 = eVar2.E0;
        f fVar = constraintLayout.H;
        int i65 = fVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(iN + fVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i65, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.y, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.z, iResolveSizeAndState2);
        if (z4) {
            iMin |= 16777216;
        }
        if (z5) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d dVarE = e(view);
        if ((view instanceof q) && !(dVarE instanceof com.gamericefishpro.space.k3.h)) {
            com.gamericefishpro.space.n3.e eVar = (com.gamericefishpro.space.n3.e) view.getLayoutParams();
            com.gamericefishpro.space.k3.h hVar = new com.gamericefishpro.space.k3.h();
            eVar.o0 = hVar;
            eVar.c0 = true;
            hVar.N(eVar.U);
        }
        if (view instanceof com.gamericefishpro.space.n3.c) {
            com.gamericefishpro.space.n3.c cVar = (com.gamericefishpro.space.n3.c) view;
            cVar.i();
            ((com.gamericefishpro.space.n3.e) view.getLayoutParams()).d0 = true;
            ArrayList arrayList = this.e;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.d.put(view.getId(), view);
        this.A = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.d.remove(view.getId());
        d dVarE = e(view);
        this.i.p0.remove(dVarE);
        dVarE.z();
        this.e.remove(view);
        this.A = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.A = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.C = oVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.d;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.z) {
            return;
        }
        this.z = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.y) {
            return;
        }
        this.y = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.w) {
            return;
        }
        this.w = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.v) {
            return;
        }
        this.v = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(p pVar) {
        c cVar = this.D;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.B = i;
        e eVar = this.i;
        eVar.C0 = i;
        com.gamericefishpro.space.i3.c.p = eVar.R(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new SparseArray();
        this.e = new ArrayList(4);
        this.i = new e();
        this.v = 0;
        this.w = 0;
        this.y = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.A = true;
        this.B = 257;
        this.C = null;
        this.D = null;
        this.E = -1;
        this.F = new HashMap();
        this.G = new SparseArray();
        this.H = new f(this, this);
        this.I = 0;
        this.J = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        com.gamericefishpro.space.n3.e eVar = new com.gamericefishpro.space.n3.e(layoutParams);
        eVar.a = -1;
        eVar.b = -1;
        eVar.c = -1.0f;
        eVar.d = -1;
        eVar.e = -1;
        eVar.f = -1;
        eVar.g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.j = -1;
        eVar.k = -1;
        eVar.l = -1;
        eVar.m = -1;
        eVar.n = -1;
        eVar.o = -1;
        eVar.p = 0;
        eVar.q = 0.0f;
        eVar.r = -1;
        eVar.s = -1;
        eVar.t = -1;
        eVar.u = -1;
        eVar.v = Integer.MIN_VALUE;
        eVar.w = Integer.MIN_VALUE;
        eVar.x = Integer.MIN_VALUE;
        eVar.y = Integer.MIN_VALUE;
        eVar.z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.a0 = true;
        eVar.b0 = false;
        eVar.c0 = false;
        eVar.d0 = false;
        eVar.e0 = -1;
        eVar.f0 = -1;
        eVar.g0 = -1;
        eVar.h0 = -1;
        eVar.i0 = Integer.MIN_VALUE;
        eVar.j0 = Integer.MIN_VALUE;
        eVar.k0 = 0.5f;
        eVar.o0 = new d();
        return eVar;
    }
}
