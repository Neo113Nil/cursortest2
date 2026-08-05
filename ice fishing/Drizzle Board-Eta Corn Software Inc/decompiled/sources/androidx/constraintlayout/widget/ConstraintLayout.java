package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.am;
import defpackage.bm;
import defpackage.c4;
import defpackage.f0;
import defpackage.f8;
import defpackage.g8;
import defpackage.gp;
import defpackage.h8;
import defpackage.i8;
import defpackage.j70;
import defpackage.j8;
import defpackage.k8;
import defpackage.l8;
import defpackage.lm;
import defpackage.mcXgUFR8;
import defpackage.n8;
import defpackage.o8;
import defpackage.q70;
import defpackage.q8;
import defpackage.r00;
import defpackage.r8;
import defpackage.s8;
import defpackage.sf0;
import defpackage.t8;
import defpackage.th0;
import defpackage.u8;
import defpackage.v8;
import defpackage.w30;
import defpackage.x1;
import defpackage.y1;
import defpackage.zb;
import defpackage.zl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static j70 OxcuoDLp;
    public final ArrayList MdtA4re8;
    public final SparseArray NCTxEWno;
    public int OnDfzHZD;
    public int P7K7Inc8;
    public int Qr9iLBAD;
    public int VgvYg0wo;
    public int b2ZJblxo;
    public int eVhOlqcC;
    public boolean jb9XjC4I;
    public s8 k3x7lurq;
    public final SparseArray lDXGDhIF;
    public mcXgUFR8 ow5vqvCr;
    public final j8 sjUBp5pO;
    public final u8 wxUZMvaN;
    public HashMap ygLcUYwZ;

    public ConstraintLayout(Context context) {
        super(context);
        this.NCTxEWno = new SparseArray();
        this.MdtA4re8 = new ArrayList(4);
        this.wxUZMvaN = new u8();
        this.VgvYg0wo = 0;
        this.P7K7Inc8 = 0;
        this.b2ZJblxo = Integer.MAX_VALUE;
        this.Qr9iLBAD = Integer.MAX_VALUE;
        this.jb9XjC4I = true;
        this.eVhOlqcC = 257;
        this.k3x7lurq = null;
        this.ow5vqvCr = null;
        this.OnDfzHZD = -1;
        this.ygLcUYwZ = new HashMap();
        this.lDXGDhIF = new SparseArray();
        this.sjUBp5pO = new j8(this, this);
        jb9XjC4I(null);
    }

    public static i8 b2ZJblxo() {
        i8 i8Var = new i8(-2, -2);
        i8Var.qoPGr6Ce = -1;
        i8Var.NCTxEWno = -1;
        i8Var.MdtA4re8 = -1.0f;
        i8Var.wxUZMvaN = true;
        i8Var.VgvYg0wo = -1;
        i8Var.P7K7Inc8 = -1;
        i8Var.b2ZJblxo = -1;
        i8Var.Qr9iLBAD = -1;
        i8Var.jb9XjC4I = -1;
        i8Var.eVhOlqcC = -1;
        i8Var.k3x7lurq = -1;
        i8Var.ow5vqvCr = -1;
        i8Var.OnDfzHZD = -1;
        i8Var.ygLcUYwZ = -1;
        i8Var.lDXGDhIF = -1;
        i8Var.sjUBp5pO = -1;
        i8Var.OxcuoDLp = 0;
        i8Var.amk52bBQ = 0.0f;
        i8Var.KlHjfFWx = -1;
        i8Var.Ey6iv0m0 = -1;
        i8Var.I5GHvsYW = -1;
        i8Var.RXQxj5Oe = -1;
        i8Var.FySoLYna = Integer.MIN_VALUE;
        i8Var.gjV1z5T1 = Integer.MIN_VALUE;
        i8Var.WYNAV5pd = Integer.MIN_VALUE;
        i8Var.DK9slbsy = Integer.MIN_VALUE;
        i8Var.lwWCatUu = Integer.MIN_VALUE;
        i8Var.U0LaHZX7 = Integer.MIN_VALUE;
        i8Var.i7xS8jrb = Integer.MIN_VALUE;
        i8Var.Mq3SeTnW = 0;
        i8Var.euDDoUNr = 0.5f;
        i8Var.SgZGMMPL = 0.5f;
        i8Var.ytu5o6f4 = null;
        i8Var.eIA6dogk = -1.0f;
        i8Var.pRiPUEwG = -1.0f;
        i8Var.VhgXwMj9 = 0;
        i8Var.aZz0PFXp = 0;
        i8Var.Xkz7p5xa = 0;
        i8Var.fVMzMhyS = 0;
        i8Var.hzgxAD8d = 0;
        i8Var.zCflySGU = 0;
        i8Var.FXJmAAN1 = 0;
        i8Var.nSmgoSB5 = 0;
        i8Var.N8VPGzVC = 1.0f;
        i8Var.HdOGZAzC = 1.0f;
        i8Var.ZyZthT5G = -1;
        i8Var.bvfAo0eO = -1;
        i8Var.KRabZ4CU = -1;
        i8Var.gmkaJpmS = false;
        i8Var.TrssYQ34 = false;
        i8Var.g2aRJUAd = null;
        i8Var.ESscZ9M1 = 0;
        i8Var.VGmz0ccI = true;
        i8Var.LfKQckgD = true;
        i8Var.pP9Y2m6O = false;
        i8Var.tef3qNMP = false;
        i8Var.Sjrx9cEN = false;
        i8Var.LvHlPNBd = -1;
        i8Var.hGvurcGl = -1;
        i8Var.Wi7iiXC4 = -1;
        i8Var.QT4Tf9Dt = -1;
        i8Var.orhfF2Ya = Integer.MIN_VALUE;
        i8Var.dHozS53r = Integer.MIN_VALUE;
        i8Var.f7oeun2L = 0.5f;
        i8Var.SMax8wMR = new t8();
        return i8Var;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static j70 getSharedValues() {
        j70 j70Var = OxcuoDLp;
        if (j70Var != null) {
            return j70Var;
        }
        j70 j70Var2 = new j70();
        new SparseIntArray();
        new HashMap();
        OxcuoDLp = j70Var2;
        return j70Var2;
    }

    public final t8 Qr9iLBAD(View view) {
        if (view == this) {
            return this.wxUZMvaN;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof i8) {
            return ((i8) view.getLayoutParams()).SMax8wMR;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof i8) {
            return ((i8) view.getLayoutParams()).SMax8wMR;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.MdtA4re8;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((g8) arrayList.get(i)).getClass();
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

    public final void eVhOlqcC(int i) {
        String str;
        Context context = getContext();
        mcXgUFR8 mcxgufr8 = new mcXgUFR8(12, false);
        mcxgufr8.MdtA4re8 = new SparseArray();
        mcxgufr8.wxUZMvaN = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            k8 k8Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                mcxgufr8.ytu5o6f4(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                k8 k8Var2 = new k8(context, xml);
                                ((SparseArray) mcxgufr8.MdtA4re8).put(k8Var2.qoPGr6Ce, k8Var2);
                                k8Var = k8Var2;
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
                                l8 l8Var = new l8(context, xml);
                                if (k8Var != null) {
                                    k8Var.NCTxEWno.add(l8Var);
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
        this.ow5vqvCr = mcxgufr8;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.jb9XjC4I = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return b2ZJblxo();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        i8 i8Var = new i8(context, attributeSet);
        i8Var.qoPGr6Ce = -1;
        i8Var.NCTxEWno = -1;
        i8Var.MdtA4re8 = -1.0f;
        i8Var.wxUZMvaN = true;
        i8Var.VgvYg0wo = -1;
        i8Var.P7K7Inc8 = -1;
        i8Var.b2ZJblxo = -1;
        i8Var.Qr9iLBAD = -1;
        i8Var.jb9XjC4I = -1;
        i8Var.eVhOlqcC = -1;
        i8Var.k3x7lurq = -1;
        i8Var.ow5vqvCr = -1;
        i8Var.OnDfzHZD = -1;
        i8Var.ygLcUYwZ = -1;
        i8Var.lDXGDhIF = -1;
        i8Var.sjUBp5pO = -1;
        i8Var.OxcuoDLp = 0;
        i8Var.amk52bBQ = 0.0f;
        i8Var.KlHjfFWx = -1;
        i8Var.Ey6iv0m0 = -1;
        i8Var.I5GHvsYW = -1;
        i8Var.RXQxj5Oe = -1;
        i8Var.FySoLYna = Integer.MIN_VALUE;
        i8Var.gjV1z5T1 = Integer.MIN_VALUE;
        i8Var.WYNAV5pd = Integer.MIN_VALUE;
        i8Var.DK9slbsy = Integer.MIN_VALUE;
        i8Var.lwWCatUu = Integer.MIN_VALUE;
        i8Var.U0LaHZX7 = Integer.MIN_VALUE;
        i8Var.i7xS8jrb = Integer.MIN_VALUE;
        i8Var.Mq3SeTnW = 0;
        i8Var.euDDoUNr = 0.5f;
        i8Var.SgZGMMPL = 0.5f;
        i8Var.ytu5o6f4 = null;
        i8Var.eIA6dogk = -1.0f;
        i8Var.pRiPUEwG = -1.0f;
        i8Var.VhgXwMj9 = 0;
        i8Var.aZz0PFXp = 0;
        i8Var.Xkz7p5xa = 0;
        i8Var.fVMzMhyS = 0;
        i8Var.hzgxAD8d = 0;
        i8Var.zCflySGU = 0;
        i8Var.FXJmAAN1 = 0;
        i8Var.nSmgoSB5 = 0;
        i8Var.N8VPGzVC = 1.0f;
        i8Var.HdOGZAzC = 1.0f;
        i8Var.ZyZthT5G = -1;
        i8Var.bvfAo0eO = -1;
        i8Var.KRabZ4CU = -1;
        i8Var.gmkaJpmS = false;
        i8Var.TrssYQ34 = false;
        i8Var.g2aRJUAd = null;
        i8Var.ESscZ9M1 = 0;
        i8Var.VGmz0ccI = true;
        i8Var.LfKQckgD = true;
        i8Var.pP9Y2m6O = false;
        i8Var.tef3qNMP = false;
        i8Var.Sjrx9cEN = false;
        i8Var.LvHlPNBd = -1;
        i8Var.hGvurcGl = -1;
        i8Var.Wi7iiXC4 = -1;
        i8Var.QT4Tf9Dt = -1;
        i8Var.orhfF2Ya = Integer.MIN_VALUE;
        i8Var.dHozS53r = Integer.MIN_VALUE;
        i8Var.f7oeun2L = 0.5f;
        i8Var.SMax8wMR = new t8();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r00.NCTxEWno);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = h8.qoPGr6Ce.get(index);
            switch (i2) {
                case 1:
                    i8Var.KRabZ4CU = obtainStyledAttributes.getInt(index, i8Var.KRabZ4CU);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, i8Var.sjUBp5pO);
                    i8Var.sjUBp5pO = resourceId;
                    if (resourceId == -1) {
                        i8Var.sjUBp5pO = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i8Var.OxcuoDLp = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.OxcuoDLp);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, i8Var.amk52bBQ) % 360.0f;
                    i8Var.amk52bBQ = f;
                    if (f < 0.0f) {
                        i8Var.amk52bBQ = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i8Var.qoPGr6Ce = obtainStyledAttributes.getDimensionPixelOffset(index, i8Var.qoPGr6Ce);
                    break;
                case 6:
                    i8Var.NCTxEWno = obtainStyledAttributes.getDimensionPixelOffset(index, i8Var.NCTxEWno);
                    break;
                case 7:
                    i8Var.MdtA4re8 = obtainStyledAttributes.getFloat(index, i8Var.MdtA4re8);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, i8Var.VgvYg0wo);
                    i8Var.VgvYg0wo = resourceId2;
                    if (resourceId2 == -1) {
                        i8Var.VgvYg0wo = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, i8Var.P7K7Inc8);
                    i8Var.P7K7Inc8 = resourceId3;
                    if (resourceId3 == -1) {
                        i8Var.P7K7Inc8 = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, i8Var.b2ZJblxo);
                    i8Var.b2ZJblxo = resourceId4;
                    if (resourceId4 == -1) {
                        i8Var.b2ZJblxo = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, i8Var.Qr9iLBAD);
                    i8Var.Qr9iLBAD = resourceId5;
                    if (resourceId5 == -1) {
                        i8Var.Qr9iLBAD = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, i8Var.jb9XjC4I);
                    i8Var.jb9XjC4I = resourceId6;
                    if (resourceId6 == -1) {
                        i8Var.jb9XjC4I = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, i8Var.eVhOlqcC);
                    i8Var.eVhOlqcC = resourceId7;
                    if (resourceId7 == -1) {
                        i8Var.eVhOlqcC = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, i8Var.k3x7lurq);
                    i8Var.k3x7lurq = resourceId8;
                    if (resourceId8 == -1) {
                        i8Var.k3x7lurq = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, i8Var.ow5vqvCr);
                    i8Var.ow5vqvCr = resourceId9;
                    if (resourceId9 == -1) {
                        i8Var.ow5vqvCr = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, i8Var.OnDfzHZD);
                    i8Var.OnDfzHZD = resourceId10;
                    if (resourceId10 == -1) {
                        i8Var.OnDfzHZD = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, i8Var.KlHjfFWx);
                    i8Var.KlHjfFWx = resourceId11;
                    if (resourceId11 == -1) {
                        i8Var.KlHjfFWx = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, i8Var.Ey6iv0m0);
                    i8Var.Ey6iv0m0 = resourceId12;
                    if (resourceId12 == -1) {
                        i8Var.Ey6iv0m0 = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, i8Var.I5GHvsYW);
                    i8Var.I5GHvsYW = resourceId13;
                    if (resourceId13 == -1) {
                        i8Var.I5GHvsYW = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, i8Var.RXQxj5Oe);
                    i8Var.RXQxj5Oe = resourceId14;
                    if (resourceId14 == -1) {
                        i8Var.RXQxj5Oe = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    i8Var.FySoLYna = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.FySoLYna);
                    break;
                case 22:
                    i8Var.gjV1z5T1 = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.gjV1z5T1);
                    break;
                case 23:
                    i8Var.WYNAV5pd = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.WYNAV5pd);
                    break;
                case 24:
                    i8Var.DK9slbsy = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.DK9slbsy);
                    break;
                case 25:
                    i8Var.lwWCatUu = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.lwWCatUu);
                    break;
                case 26:
                    i8Var.U0LaHZX7 = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.U0LaHZX7);
                    break;
                case 27:
                    i8Var.gmkaJpmS = obtainStyledAttributes.getBoolean(index, i8Var.gmkaJpmS);
                    break;
                case 28:
                    i8Var.TrssYQ34 = obtainStyledAttributes.getBoolean(index, i8Var.TrssYQ34);
                    break;
                case 29:
                    i8Var.euDDoUNr = obtainStyledAttributes.getFloat(index, i8Var.euDDoUNr);
                    break;
                case 30:
                    i8Var.SgZGMMPL = obtainStyledAttributes.getFloat(index, i8Var.SgZGMMPL);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    i8Var.Xkz7p5xa = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    i8Var.fVMzMhyS = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        i8Var.hzgxAD8d = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.hzgxAD8d);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, i8Var.hzgxAD8d) == -2) {
                            i8Var.hzgxAD8d = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        i8Var.FXJmAAN1 = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.FXJmAAN1);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, i8Var.FXJmAAN1) == -2) {
                            i8Var.FXJmAAN1 = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    i8Var.N8VPGzVC = Math.max(0.0f, obtainStyledAttributes.getFloat(index, i8Var.N8VPGzVC));
                    i8Var.Xkz7p5xa = 2;
                    break;
                case 36:
                    try {
                        i8Var.zCflySGU = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.zCflySGU);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, i8Var.zCflySGU) == -2) {
                            i8Var.zCflySGU = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        i8Var.nSmgoSB5 = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.nSmgoSB5);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, i8Var.nSmgoSB5) == -2) {
                            i8Var.nSmgoSB5 = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    i8Var.HdOGZAzC = Math.max(0.0f, obtainStyledAttributes.getFloat(index, i8Var.HdOGZAzC));
                    i8Var.fVMzMhyS = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            s8.b2ZJblxo(i8Var, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            i8Var.eIA6dogk = obtainStyledAttributes.getFloat(index, i8Var.eIA6dogk);
                            break;
                        case 46:
                            i8Var.pRiPUEwG = obtainStyledAttributes.getFloat(index, i8Var.pRiPUEwG);
                            break;
                        case 47:
                            i8Var.VhgXwMj9 = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            i8Var.aZz0PFXp = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            i8Var.ZyZthT5G = obtainStyledAttributes.getDimensionPixelOffset(index, i8Var.ZyZthT5G);
                            break;
                        case 50:
                            i8Var.bvfAo0eO = obtainStyledAttributes.getDimensionPixelOffset(index, i8Var.bvfAo0eO);
                            break;
                        case 51:
                            i8Var.g2aRJUAd = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, i8Var.ygLcUYwZ);
                            i8Var.ygLcUYwZ = resourceId15;
                            if (resourceId15 == -1) {
                                i8Var.ygLcUYwZ = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, i8Var.lDXGDhIF);
                            i8Var.lDXGDhIF = resourceId16;
                            if (resourceId16 == -1) {
                                i8Var.lDXGDhIF = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            i8Var.Mq3SeTnW = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.Mq3SeTnW);
                            break;
                        case 55:
                            i8Var.i7xS8jrb = obtainStyledAttributes.getDimensionPixelSize(index, i8Var.i7xS8jrb);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    s8.P7K7Inc8(i8Var, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    s8.P7K7Inc8(i8Var, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    i8Var.ESscZ9M1 = obtainStyledAttributes.getInt(index, i8Var.ESscZ9M1);
                                    break;
                                case 67:
                                    i8Var.wxUZMvaN = obtainStyledAttributes.getBoolean(index, i8Var.wxUZMvaN);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        i8Var.qoPGr6Ce();
        return i8Var;
    }

    public int getMaxHeight() {
        return this.Qr9iLBAD;
    }

    public int getMaxWidth() {
        return this.b2ZJblxo;
    }

    public int getMinHeight() {
        return this.P7K7Inc8;
    }

    public int getMinWidth() {
        return this.VgvYg0wo;
    }

    public int getOptimizationLevel() {
        return this.wxUZMvaN.QhQjwNAr;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        u8 u8Var = this.wxUZMvaN;
        String str = u8Var.eVhOlqcC;
        if (str == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
                u8Var.eVhOlqcC = str;
            } else {
                str = "parent";
                u8Var.eVhOlqcC = "parent";
            }
        }
        if (u8Var.hGvurcGl == null) {
            u8Var.hGvurcGl = str;
            Log.v("ConstraintLayout", " setDebugName " + u8Var.hGvurcGl);
        }
        ArrayList arrayList = u8Var.SMax8wMR;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t8 t8Var = (t8) obj;
            View view = t8Var.Sjrx9cEN;
            if (view != null) {
                if (t8Var.eVhOlqcC == null && (id = view.getId()) != -1) {
                    t8Var.eVhOlqcC = getContext().getResources().getResourceEntryName(id);
                }
                if (t8Var.hGvurcGl == null) {
                    t8Var.hGvurcGl = t8Var.eVhOlqcC;
                    Log.v("ConstraintLayout", " setDebugName " + t8Var.hGvurcGl);
                }
            }
        }
        u8Var.ow5vqvCr(sb);
        return sb.toString();
    }

    public final void jb9XjC4I(AttributeSet attributeSet) {
        u8 u8Var = this.wxUZMvaN;
        u8Var.Sjrx9cEN = this;
        j8 j8Var = this.sjUBp5pO;
        u8Var.X1t0wlBd = j8Var;
        u8Var.CTE3lpUp.b2ZJblxo = j8Var;
        this.NCTxEWno.put(getId(), this);
        this.k3x7lurq = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r00.NCTxEWno, 0, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.VgvYg0wo = obtainStyledAttributes.getDimensionPixelOffset(index, this.VgvYg0wo);
                } else if (index == 17) {
                    this.P7K7Inc8 = obtainStyledAttributes.getDimensionPixelOffset(index, this.P7K7Inc8);
                } else if (index == 14) {
                    this.b2ZJblxo = obtainStyledAttributes.getDimensionPixelOffset(index, this.b2ZJblxo);
                } else if (index == 15) {
                    this.Qr9iLBAD = obtainStyledAttributes.getDimensionPixelOffset(index, this.Qr9iLBAD);
                } else if (index == 113) {
                    this.eVhOlqcC = obtainStyledAttributes.getInt(index, this.eVhOlqcC);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            eVhOlqcC(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.ow5vqvCr = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        s8 s8Var = new s8();
                        this.k3x7lurq = s8Var;
                        s8Var.wxUZMvaN(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.k3x7lurq = null;
                    }
                    this.OnDfzHZD = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        u8Var.QhQjwNAr = this.eVhOlqcC;
        gp.OxcuoDLp = u8Var.HdOGZAzC(512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034d  */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k3x7lurq(u8 u8Var, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        char c;
        boolean z;
        int i7;
        int i8;
        boolean z2;
        ArrayList arrayList;
        j8 j8Var;
        int i9;
        boolean z3;
        int i10;
        boolean z4;
        boolean z5;
        int i11;
        j8 j8Var2;
        boolean z6;
        lm lmVar;
        sf0 sf0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int size;
        int i19;
        int size2;
        int i20;
        int mode = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i21 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        j8 j8Var3 = this.sjUBp5pO;
        j8Var3.NCTxEWno = max3;
        j8Var3.MdtA4re8 = max4;
        j8Var3.wxUZMvaN = paddingWidth;
        j8Var3.VgvYg0wo = i21;
        j8Var3.P7K7Inc8 = i2;
        j8Var3.b2ZJblxo = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i22 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i23 = size3 - paddingWidth;
        int i24 = size4 - i21;
        int i25 = j8Var3.VgvYg0wo;
        int i26 = j8Var3.wxUZMvaN;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.b2ZJblxo - i26, i23);
                    i22 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.VgvYg0wo);
                i4 = max;
                i22 = 2;
            } else {
                i4 = 0;
                i22 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.VgvYg0wo);
            i4 = max;
            i22 = 2;
        } else {
            i4 = i23;
            i22 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.Qr9iLBAD - i25, i24);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.P7K7Inc8);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.P7K7Inc8);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i24;
            i6 = 2;
        }
        int lDXGDhIF = u8Var.lDXGDhIF();
        zb zbVar = u8Var.CTE3lpUp;
        int[] iArr = u8Var.i7xS8jrb;
        int i27 = i4;
        if (i27 == lDXGDhIF && i5 == u8Var.jb9XjC4I()) {
            c = 1;
        } else {
            zbVar.NCTxEWno = true;
            c = 1;
        }
        u8Var.TrssYQ34 = 0;
        u8Var.g2aRJUAd = 0;
        iArr[0] = this.b2ZJblxo - i26;
        iArr[c] = this.Qr9iLBAD - i25;
        u8Var.VGmz0ccI = 0;
        u8Var.LfKQckgD = 0;
        u8Var.pRiPUEwG(i22);
        u8Var.aZz0PFXp(i27);
        u8Var.VhgXwMj9(i6);
        u8Var.eIA6dogk(i5);
        int i28 = this.VgvYg0wo - i26;
        if (i28 < 0) {
            u8Var.VGmz0ccI = 0;
        } else {
            u8Var.VGmz0ccI = i28;
        }
        int i29 = this.P7K7Inc8 - i25;
        if (i29 < 0) {
            u8Var.LfKQckgD = 0;
        } else {
            u8Var.LfKQckgD = i29;
        }
        u8Var.AxnhUDtd = max5;
        u8Var.d3vfVszL = max3;
        f0 f0Var = u8Var.S7WAX0X5;
        u8 u8Var2 = (u8) f0Var.VgvYg0wo;
        ArrayList arrayList2 = (ArrayList) f0Var.MdtA4re8;
        j8 j8Var4 = u8Var.X1t0wlBd;
        int size5 = u8Var.SMax8wMR.size();
        int lDXGDhIF2 = u8Var.lDXGDhIF();
        int jb9XjC4I = u8Var.jb9XjC4I();
        boolean amk52bBQ = w30.amk52bBQ(i, 128);
        boolean z8 = amk52bBQ || w30.amk52bBQ(i, 64);
        if (z8) {
            int i30 = 0;
            while (i30 < size5) {
                boolean z9 = z8;
                t8 t8Var = (t8) u8Var.SMax8wMR.get(i30);
                i7 = size5;
                int[] iArr2 = t8Var.N2kLh4D5;
                int i31 = i30;
                boolean z10 = (iArr2[0] == 3) && (iArr2[1] == 3) && t8Var.KRabZ4CU > 0.0f;
                if ((t8Var.RXQxj5Oe() && z10) || ((t8Var.FySoLYna() && z10) || t8Var.RXQxj5Oe() || t8Var.FySoLYna())) {
                    i8 = 1073741824;
                    z = false;
                    break;
                } else {
                    i30 = i31 + 1;
                    z8 = z9;
                    size5 = i7;
                }
            }
        }
        z = z8;
        i7 = size5;
        i8 = 1073741824;
        boolean z11 = z & ((mode == i8 && mode2 == i8) || amk52bBQ);
        if (z11) {
            int min = Math.min(iArr[0], i23);
            int min2 = Math.min(iArr[1], i24);
            int i32 = 1073741824;
            if (mode == 1073741824) {
                if (u8Var.lDXGDhIF() != min) {
                    u8Var.aZz0PFXp(min);
                    zbVar.qoPGr6Ce = true;
                }
                i32 = 1073741824;
            }
            if (mode2 == i32 && u8Var.jb9XjC4I() != min2) {
                u8Var.eIA6dogk(min2);
                zbVar.qoPGr6Ce = true;
            }
            if (mode == i32 && mode2 == i32) {
                ArrayList arrayList3 = (ArrayList) zbVar.VgvYg0wo;
                u8 u8Var3 = (u8) zbVar.MdtA4re8;
                if (zbVar.qoPGr6Ce || zbVar.NCTxEWno) {
                    ArrayList arrayList4 = u8Var3.SMax8wMR;
                    int size6 = arrayList4.size();
                    z2 = z11;
                    int i33 = 0;
                    while (i33 < size6) {
                        Object obj = arrayList4.get(i33);
                        int i34 = i33 + 1;
                        t8 t8Var2 = (t8) obj;
                        t8Var2.P7K7Inc8();
                        t8Var2.qoPGr6Ce = false;
                        t8Var2.wxUZMvaN.ygLcUYwZ();
                        t8Var2.VgvYg0wo.OnDfzHZD();
                        arrayList4 = arrayList4;
                        i33 = i34;
                    }
                    u8Var3.P7K7Inc8();
                    i14 = 0;
                    u8Var3.qoPGr6Ce = false;
                    u8Var3.wxUZMvaN.ygLcUYwZ();
                    u8Var3.VgvYg0wo.OnDfzHZD();
                    zbVar.NCTxEWno = false;
                } else {
                    z2 = z11;
                    i14 = 0;
                }
                zbVar.NCTxEWno((u8) zbVar.wxUZMvaN);
                u8Var3.TrssYQ34 = i14;
                int[] iArr3 = u8Var3.N2kLh4D5;
                u8Var3.g2aRJUAd = i14;
                int Qr9iLBAD = u8Var3.Qr9iLBAD(i14);
                int Qr9iLBAD2 = u8Var3.Qr9iLBAD(1);
                if (zbVar.qoPGr6Ce) {
                    zbVar.MdtA4re8();
                }
                int sjUBp5pO = u8Var3.sjUBp5pO();
                j8Var = j8Var4;
                int OxcuoDLp2 = u8Var3.OxcuoDLp();
                arrayList = arrayList2;
                u8Var3.wxUZMvaN.Qr9iLBAD.wxUZMvaN(sjUBp5pO);
                u8Var3.VgvYg0wo.Qr9iLBAD.wxUZMvaN(OxcuoDLp2);
                zbVar.jb9XjC4I();
                if (Qr9iLBAD == 2 || Qr9iLBAD2 == 2) {
                    if (amk52bBQ) {
                        int size7 = arrayList3.size();
                        i15 = OxcuoDLp2;
                        int i35 = 0;
                        while (true) {
                            if (i35 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i35);
                            i35++;
                            if (!((th0) obj2).k3x7lurq()) {
                                amk52bBQ = false;
                                break;
                            }
                        }
                    } else {
                        i15 = OxcuoDLp2;
                    }
                    if (amk52bBQ && Qr9iLBAD == 2) {
                        u8Var3.pRiPUEwG(1);
                        u8Var3.aZz0PFXp(zbVar.wxUZMvaN(u8Var3, 0));
                        u8Var3.wxUZMvaN.VgvYg0wo.wxUZMvaN(u8Var3.lDXGDhIF());
                    }
                    if (amk52bBQ && Qr9iLBAD2 == 2) {
                        i16 = 1;
                        u8Var3.VhgXwMj9(1);
                        u8Var3.eIA6dogk(zbVar.wxUZMvaN(u8Var3, 1));
                        u8Var3.VgvYg0wo.VgvYg0wo.wxUZMvaN(u8Var3.jb9XjC4I());
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int lDXGDhIF3 = u8Var3.lDXGDhIF() + sjUBp5pO;
                            u8Var3.wxUZMvaN.jb9XjC4I.wxUZMvaN(lDXGDhIF3);
                            u8Var3.wxUZMvaN.VgvYg0wo.wxUZMvaN(lDXGDhIF3 - sjUBp5pO);
                            zbVar.jb9XjC4I();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int jb9XjC4I2 = u8Var3.jb9XjC4I() + i15;
                                u8Var3.VgvYg0wo.jb9XjC4I.wxUZMvaN(jb9XjC4I2);
                                u8Var3.VgvYg0wo.VgvYg0wo.wxUZMvaN(jb9XjC4I2 - i15);
                            }
                            zbVar.jb9XjC4I();
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        size = arrayList3.size();
                        i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            th0 th0Var = (th0) obj3;
                            if (th0Var.NCTxEWno != u8Var3 || th0Var.b2ZJblxo) {
                                th0Var.VgvYg0wo();
                            }
                        }
                        size2 = arrayList3.size();
                        i20 = 0;
                        while (i20 < size2) {
                            Object obj4 = arrayList3.get(i20);
                            i20++;
                            th0 th0Var2 = (th0) obj4;
                            if (z7 || th0Var2.NCTxEWno != u8Var3) {
                                if (!th0Var2.Qr9iLBAD.eVhOlqcC || ((!th0Var2.jb9XjC4I.eVhOlqcC && !(th0Var2 instanceof bm)) || (!th0Var2.VgvYg0wo.eVhOlqcC && !(th0Var2 instanceof c4) && !(th0Var2 instanceof bm)))) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = true;
                        u8Var3.pRiPUEwG(Qr9iLBAD);
                        u8Var3.VhgXwMj9(Qr9iLBAD2);
                        i9 = 2;
                        i13 = 1073741824;
                    }
                } else {
                    i15 = OxcuoDLp2;
                }
                i16 = 1;
                i17 = iArr3[0];
                if (i17 != i16) {
                }
                int lDXGDhIF32 = u8Var3.lDXGDhIF() + sjUBp5pO;
                u8Var3.wxUZMvaN.jb9XjC4I.wxUZMvaN(lDXGDhIF32);
                u8Var3.wxUZMvaN.VgvYg0wo.wxUZMvaN(lDXGDhIF32 - sjUBp5pO);
                zbVar.jb9XjC4I();
                i18 = iArr3[1];
                if (i18 != 1) {
                }
                int jb9XjC4I22 = u8Var3.jb9XjC4I() + i15;
                u8Var3.VgvYg0wo.jb9XjC4I.wxUZMvaN(jb9XjC4I22);
                u8Var3.VgvYg0wo.VgvYg0wo.wxUZMvaN(jb9XjC4I22 - i15);
                zbVar.jb9XjC4I();
                z7 = true;
                size = arrayList3.size();
                i19 = 0;
                while (i19 < size) {
                }
                size2 = arrayList3.size();
                i20 = 0;
                while (i20 < size2) {
                }
                z3 = true;
                u8Var3.pRiPUEwG(Qr9iLBAD);
                u8Var3.VhgXwMj9(Qr9iLBAD2);
                i9 = 2;
                i13 = 1073741824;
            } else {
                z2 = z11;
                arrayList = arrayList2;
                j8Var = j8Var4;
                u8 u8Var4 = (u8) zbVar.MdtA4re8;
                if (zbVar.qoPGr6Ce) {
                    ArrayList arrayList5 = u8Var4.SMax8wMR;
                    int size8 = arrayList5.size();
                    int i36 = 0;
                    while (i36 < size8) {
                        Object obj5 = arrayList5.get(i36);
                        i36++;
                        t8 t8Var3 = (t8) obj5;
                        t8Var3.P7K7Inc8();
                        t8Var3.qoPGr6Ce = false;
                        lm lmVar2 = t8Var3.wxUZMvaN;
                        ArrayList arrayList6 = arrayList5;
                        lmVar2.VgvYg0wo.eVhOlqcC = false;
                        lmVar2.b2ZJblxo = false;
                        lmVar2.ygLcUYwZ();
                        sf0 sf0Var2 = t8Var3.VgvYg0wo;
                        sf0Var2.VgvYg0wo.eVhOlqcC = false;
                        sf0Var2.b2ZJblxo = false;
                        sf0Var2.OnDfzHZD();
                        arrayList5 = arrayList6;
                    }
                    i12 = 0;
                    u8Var4.P7K7Inc8();
                    u8Var4.qoPGr6Ce = false;
                    lm lmVar3 = u8Var4.wxUZMvaN;
                    lmVar3.VgvYg0wo.eVhOlqcC = false;
                    lmVar3.b2ZJblxo = false;
                    lmVar3.ygLcUYwZ();
                    sf0 sf0Var3 = u8Var4.VgvYg0wo;
                    sf0Var3.VgvYg0wo.eVhOlqcC = false;
                    sf0Var3.b2ZJblxo = false;
                    sf0Var3.OnDfzHZD();
                    zbVar.MdtA4re8();
                } else {
                    i12 = 0;
                }
                zbVar.NCTxEWno((u8) zbVar.wxUZMvaN);
                u8Var4.TrssYQ34 = i12;
                u8Var4.g2aRJUAd = i12;
                u8Var4.wxUZMvaN.Qr9iLBAD.wxUZMvaN(i12);
                u8Var4.VgvYg0wo.Qr9iLBAD.wxUZMvaN(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    z3 = u8Var.FXJmAAN1(i12, amk52bBQ);
                    i9 = 1;
                } else {
                    i9 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= u8Var.FXJmAAN1(1, amk52bBQ);
                    i9++;
                }
            }
            if (z3) {
                u8Var.Xkz7p5xa(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z11;
            arrayList = arrayList2;
            j8Var = j8Var4;
            i9 = 0;
            z3 = false;
        }
        if (z3 && i9 == 2) {
            return;
        }
        int i37 = u8Var.QhQjwNAr;
        if (i7 > 0) {
            int size9 = u8Var.SMax8wMR.size();
            boolean HdOGZAzC = u8Var.HdOGZAzC(64);
            j8 j8Var5 = u8Var.X1t0wlBd;
            for (int i38 = 0; i38 < size9; i38++) {
                t8 t8Var4 = (t8) u8Var.SMax8wMR.get(i38);
                if (!(t8Var4 instanceof am) && !(t8Var4 instanceof y1)) {
                    t8Var4.getClass();
                    if (!HdOGZAzC || (lmVar = t8Var4.wxUZMvaN) == null || (sf0Var = t8Var4.VgvYg0wo) == null || !lmVar.VgvYg0wo.eVhOlqcC || !sf0Var.VgvYg0wo.eVhOlqcC) {
                        int Qr9iLBAD3 = t8Var4.Qr9iLBAD(0);
                        int Qr9iLBAD4 = t8Var4.Qr9iLBAD(1);
                        boolean z12 = Qr9iLBAD3 == 3 && t8Var4.amk52bBQ != 1 && Qr9iLBAD4 == 3 && t8Var4.KlHjfFWx != 1;
                        if (!z12 && u8Var.HdOGZAzC(1)) {
                            if (Qr9iLBAD3 == 3 && t8Var4.amk52bBQ == 0 && Qr9iLBAD4 != 3 && !t8Var4.RXQxj5Oe()) {
                                z12 = true;
                            }
                            if (Qr9iLBAD4 == 3 && t8Var4.KlHjfFWx == 0 && Qr9iLBAD3 != 3 && !t8Var4.RXQxj5Oe()) {
                                z12 = true;
                            }
                            if ((Qr9iLBAD3 == 3 || Qr9iLBAD4 == 3) && t8Var4.KRabZ4CU > 0.0f) {
                                z12 = true;
                            }
                        }
                        if (!z12) {
                            f0Var.U0LaHZX7(0, j8Var5, t8Var4);
                        }
                    }
                }
            }
            ConstraintLayout constraintLayout = j8Var5.qoPGr6Ce;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.MdtA4re8;
            for (int i39 = 0; i39 < childCount2; i39++) {
                constraintLayout.getChildAt(i39);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i40 = 0; i40 < size10; i40++) {
                    ((g8) arrayList7.get(i40)).getClass();
                }
            }
        }
        f0Var.pRiPUEwG(u8Var);
        int size11 = arrayList.size();
        boolean z13 = false;
        if (i7 > 0) {
            f0Var.ytu5o6f4(u8Var, 0, lDXGDhIF2, jb9XjC4I);
        }
        if (size11 > 0) {
            int[] iArr4 = u8Var.N2kLh4D5;
            boolean z14 = iArr4[0] == 2;
            boolean z15 = iArr4[1] == 2;
            int max7 = Math.max(u8Var.lDXGDhIF(), u8Var2.VGmz0ccI);
            int max8 = Math.max(u8Var.jb9XjC4I(), u8Var2.LfKQckgD);
            for (int i41 = 0; i41 < size11; i41++) {
            }
            ?? r9 = arrayList;
            int i42 = 0;
            while (i42 < 2) {
                boolean z16 = z13;
                boolean z17 = z16;
                for (?? r11 = z16; r11 < size11; r11++) {
                    t8 t8Var5 = (t8) r9.get(r11);
                    if ((t8Var5 instanceof y1) || (t8Var5 instanceof am)) {
                        i10 = size11;
                    } else {
                        i10 = size11;
                        if (t8Var5.LvHlPNBd != 8 && (!z2 || !t8Var5.wxUZMvaN.VgvYg0wo.eVhOlqcC || !t8Var5.VgvYg0wo.VgvYg0wo.eVhOlqcC)) {
                            int lDXGDhIF4 = t8Var5.lDXGDhIF();
                            int jb9XjC4I3 = t8Var5.jb9XjC4I();
                            z4 = z15;
                            int i43 = t8Var5.ESscZ9M1;
                            z5 = z14;
                            int i44 = i42 == 1 ? 2 : 1;
                            i11 = i42;
                            j8Var2 = j8Var;
                            boolean U0LaHZX7 = f0Var.U0LaHZX7(i44, j8Var2, t8Var5) | z17;
                            int lDXGDhIF5 = t8Var5.lDXGDhIF();
                            boolean z18 = U0LaHZX7;
                            int jb9XjC4I4 = t8Var5.jb9XjC4I();
                            if (lDXGDhIF5 != lDXGDhIF4) {
                                t8Var5.aZz0PFXp(lDXGDhIF5);
                                if (z5 && t8Var5.sjUBp5pO() + t8Var5.ZyZthT5G > max7) {
                                    max7 = Math.max(max7, t8Var5.b2ZJblxo(4).wxUZMvaN() + t8Var5.sjUBp5pO() + t8Var5.ZyZthT5G);
                                }
                                z18 = true;
                            }
                            if (jb9XjC4I4 != jb9XjC4I3) {
                                t8Var5.eIA6dogk(jb9XjC4I4);
                                if (z4 && t8Var5.OxcuoDLp() + t8Var5.bvfAo0eO > max8) {
                                    max8 = Math.max(max8, t8Var5.b2ZJblxo(5).wxUZMvaN() + t8Var5.OxcuoDLp() + t8Var5.bvfAo0eO);
                                }
                                z6 = true;
                            } else {
                                z6 = z18;
                            }
                            if (t8Var5.euDDoUNr && i43 != t8Var5.ESscZ9M1) {
                                z6 = true;
                            }
                            size11 = i10;
                            z15 = z4;
                            j8Var = j8Var2;
                            z17 = z6;
                            z14 = z5;
                            i42 = i11;
                        }
                    }
                    z4 = z15;
                    z5 = z14;
                    i11 = i42;
                    z6 = z17;
                    j8Var2 = j8Var;
                    size11 = i10;
                    z15 = z4;
                    j8Var = j8Var2;
                    z17 = z6;
                    z14 = z5;
                    i42 = i11;
                }
                int i45 = size11;
                boolean z19 = z15;
                boolean z20 = z14;
                int i46 = i42;
                j8 j8Var6 = j8Var;
                if (!z17) {
                    break;
                }
                int i47 = i46 + 1;
                f0Var.ytu5o6f4(u8Var, i47, lDXGDhIF2, jb9XjC4I);
                z15 = z19;
                j8Var = j8Var6;
                z14 = z20;
                z13 = false;
                i42 = i47;
                size11 = i45;
            }
        }
        u8Var.QhQjwNAr = i37;
        gp.OxcuoDLp = u8Var.HdOGZAzC(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            i8 i8Var = (i8) childAt.getLayoutParams();
            t8 t8Var = i8Var.SMax8wMR;
            if (childAt.getVisibility() != 8 || i8Var.tef3qNMP || i8Var.Sjrx9cEN || isInEditMode) {
                int sjUBp5pO = t8Var.sjUBp5pO();
                int OxcuoDLp2 = t8Var.OxcuoDLp();
                childAt.layout(sjUBp5pO, OxcuoDLp2, t8Var.lDXGDhIF() + sjUBp5pO, t8Var.jb9XjC4I() + OxcuoDLp2);
            }
        }
        ArrayList arrayList = this.MdtA4re8;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((g8) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0634, code lost:
    
        if (r2 == 6) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x063b, code lost:
    
        if (r2 == 6) goto L239;
     */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0716  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        u8 u8Var;
        boolean z;
        boolean z2;
        SparseArray sparseArray;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        t8 t8Var;
        int i7;
        int i8;
        int i9;
        t8 t8Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        t8 t8Var3;
        int i14;
        int i15;
        t8 t8Var4;
        float f2;
        int i16;
        int i17;
        t8 t8Var5;
        int i18;
        int i19;
        float f3;
        int i20;
        int i21;
        char c;
        int i22;
        int i23;
        float parseFloat;
        int i24;
        char c2;
        SparseArray sparseArray2;
        String str;
        int wxUZMvaN;
        SparseArray sparseArray3;
        HashSet hashSet;
        int i25;
        u8 u8Var2;
        boolean z4;
        boolean z5;
        int i26;
        SparseArray sparseArray4;
        String str2;
        u8 u8Var3;
        String str3;
        String resourceName;
        int id;
        t8 t8Var6;
        ConstraintLayout constraintLayout = this;
        boolean z6 = constraintLayout.jb9XjC4I;
        constraintLayout.jb9XjC4I = z6;
        if (!z6) {
            int childCount = constraintLayout.getChildCount();
            int i27 = 0;
            while (true) {
                if (i27 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i27).isLayoutRequested()) {
                    constraintLayout.jb9XjC4I = true;
                    break;
                }
                i27++;
            }
        }
        boolean z7 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        u8 u8Var4 = constraintLayout.wxUZMvaN;
        u8Var4.D4B4MtvK = z7;
        if (constraintLayout.jb9XjC4I) {
            constraintLayout.jb9XjC4I = false;
            int childCount2 = constraintLayout.getChildCount();
            int i28 = 0;
            while (true) {
                if (i28 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i28).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i28++;
                }
            }
            if (z) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i29 = 0; i29 < childCount3; i29++) {
                    t8 Qr9iLBAD = constraintLayout.Qr9iLBAD(constraintLayout.getChildAt(i29));
                    if (Qr9iLBAD != null) {
                        Qr9iLBAD.lwWCatUu();
                    }
                }
                SparseArray sparseArray5 = constraintLayout.NCTxEWno;
                if (isInEditMode) {
                    for (int i30 = 0; i30 < childCount3; i30++) {
                        View childAt = constraintLayout.getChildAt(i30);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.ygLcUYwZ == null) {
                                    constraintLayout.ygLcUYwZ = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.ygLcUYwZ.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) sparseArray5.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                t8Var6 = view == null ? null : ((i8) view.getLayoutParams()).SMax8wMR;
                                t8Var6.hGvurcGl = resourceName;
                            }
                        }
                        t8Var6 = u8Var4;
                        t8Var6.hGvurcGl = resourceName;
                    }
                }
                if (constraintLayout.OnDfzHZD != -1) {
                    for (int i31 = 0; i31 < childCount3; i31++) {
                        constraintLayout.getChildAt(i31).getId();
                    }
                }
                s8 s8Var = constraintLayout.k3x7lurq;
                if (s8Var != null) {
                    int childCount4 = constraintLayout.getChildCount();
                    HashMap hashMap = s8Var.NCTxEWno;
                    HashSet hashSet2 = new HashSet(hashMap.keySet());
                    int i32 = 0;
                    while (i32 < childCount4) {
                        View childAt2 = constraintLayout.getChildAt(i32);
                        int id2 = childAt2.getId();
                        if (!hashMap.containsKey(Integer.valueOf(id2))) {
                            StringBuilder sb = new StringBuilder("id unknown ");
                            try {
                                str3 = childAt2.getContext().getResources().getResourceEntryName(childAt2.getId());
                            } catch (Exception unused2) {
                                str3 = "UNKNOWN";
                            }
                            sb.append(str3);
                            Log.w("ConstraintSet", sb.toString());
                        } else {
                            if (id2 == -1) {
                                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                            }
                            if (id2 != -1) {
                                if (hashMap.containsKey(Integer.valueOf(id2))) {
                                    hashSet2.remove(Integer.valueOf(id2));
                                    n8 n8Var = (n8) hashMap.get(Integer.valueOf(id2));
                                    if (n8Var != null) {
                                        q8 q8Var = n8Var.NCTxEWno;
                                        hashSet = hashSet2;
                                        o8 o8Var = n8Var.wxUZMvaN;
                                        i25 = i32;
                                        r8 r8Var = n8Var.VgvYg0wo;
                                        z4 = z;
                                        if (childAt2 instanceof x1) {
                                            o8Var.Wi7iiXC4 = 1;
                                            x1 x1Var = (x1) childAt2;
                                            x1Var.setId(id2);
                                            x1Var.setType(o8Var.LvHlPNBd);
                                            x1Var.setMargin(o8Var.hGvurcGl);
                                            x1Var.setAllowsGoneWidget(o8Var.XrPeKzBk);
                                            int[] iArr = o8Var.QT4Tf9Dt;
                                            if (iArr != null) {
                                                x1Var.setReferencedIds(iArr);
                                            } else {
                                                String str4 = o8Var.orhfF2Ya;
                                                if (str4 != null) {
                                                    int[] NCTxEWno = s8.NCTxEWno(x1Var, str4);
                                                    o8Var.QT4Tf9Dt = NCTxEWno;
                                                    x1Var.setReferencedIds(NCTxEWno);
                                                }
                                            }
                                        }
                                        i8 i8Var = (i8) childAt2.getLayoutParams();
                                        i8Var.qoPGr6Ce();
                                        n8Var.qoPGr6Ce(i8Var);
                                        HashMap hashMap2 = n8Var.P7K7Inc8;
                                        z5 = isInEditMode;
                                        Class<?> cls = childAt2.getClass();
                                        for (String str5 : hashMap2.keySet()) {
                                            int i33 = childCount3;
                                            f8 f8Var = (f8) hashMap2.get(str5);
                                            HashMap hashMap3 = hashMap2;
                                            if (f8Var.qoPGr6Ce) {
                                                sparseArray4 = sparseArray5;
                                                str2 = str5;
                                            } else {
                                                sparseArray4 = sparseArray5;
                                                str2 = "set" + str5;
                                            }
                                            try {
                                                int k3x7lurq = q70.k3x7lurq(f8Var.NCTxEWno);
                                                Class cls2 = Float.TYPE;
                                                Class cls3 = Integer.TYPE;
                                                switch (k3x7lurq) {
                                                    case 0:
                                                        u8Var3 = u8Var4;
                                                        cls.getMethod(str2, cls3).invoke(childAt2, Integer.valueOf(f8Var.MdtA4re8));
                                                        break;
                                                    case 1:
                                                        u8Var3 = u8Var4;
                                                        cls.getMethod(str2, cls2).invoke(childAt2, Float.valueOf(f8Var.wxUZMvaN));
                                                        break;
                                                    case 2:
                                                        u8Var3 = u8Var4;
                                                        cls.getMethod(str2, cls3).invoke(childAt2, Integer.valueOf(f8Var.b2ZJblxo));
                                                        break;
                                                    case 3:
                                                        Method method = cls.getMethod(str2, Drawable.class);
                                                        u8Var3 = u8Var4;
                                                        try {
                                                            ColorDrawable colorDrawable = new ColorDrawable();
                                                            colorDrawable.setColor(f8Var.b2ZJblxo);
                                                            method.invoke(childAt2, colorDrawable);
                                                        } catch (IllegalAccessException e) {
                                                            e = e;
                                                            StringBuilder b2ZJblxo = q70.b2ZJblxo(" Custom Attribute \"", str5, "\" not found on ");
                                                            b2ZJblxo.append(cls.getName());
                                                            Log.e("TransitionLayout", b2ZJblxo.toString(), e);
                                                            childCount3 = i33;
                                                            hashMap2 = hashMap3;
                                                            sparseArray5 = sparseArray4;
                                                            u8Var4 = u8Var3;
                                                        } catch (NoSuchMethodException e2) {
                                                            e = e2;
                                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e);
                                                            childCount3 = i33;
                                                            hashMap2 = hashMap3;
                                                            sparseArray5 = sparseArray4;
                                                            u8Var4 = u8Var3;
                                                        } catch (InvocationTargetException e3) {
                                                            e = e3;
                                                            StringBuilder b2ZJblxo2 = q70.b2ZJblxo(" Custom Attribute \"", str5, "\" not found on ");
                                                            b2ZJblxo2.append(cls.getName());
                                                            Log.e("TransitionLayout", b2ZJblxo2.toString(), e);
                                                            childCount3 = i33;
                                                            hashMap2 = hashMap3;
                                                            sparseArray5 = sparseArray4;
                                                            u8Var4 = u8Var3;
                                                        }
                                                    case 4:
                                                        cls.getMethod(str2, CharSequence.class).invoke(childAt2, f8Var.VgvYg0wo);
                                                        u8Var3 = u8Var4;
                                                        break;
                                                    case 5:
                                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt2, Boolean.valueOf(f8Var.P7K7Inc8));
                                                        u8Var3 = u8Var4;
                                                        break;
                                                    case 6:
                                                        cls.getMethod(str2, cls2).invoke(childAt2, Float.valueOf(f8Var.wxUZMvaN));
                                                        u8Var3 = u8Var4;
                                                        break;
                                                    case 7:
                                                        cls.getMethod(str2, cls3).invoke(childAt2, Integer.valueOf(f8Var.MdtA4re8));
                                                        u8Var3 = u8Var4;
                                                        break;
                                                    default:
                                                        u8Var3 = u8Var4;
                                                        break;
                                                }
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                u8Var3 = u8Var4;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                u8Var3 = u8Var4;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                u8Var3 = u8Var4;
                                            }
                                            childCount3 = i33;
                                            hashMap2 = hashMap3;
                                            sparseArray5 = sparseArray4;
                                            u8Var4 = u8Var3;
                                        }
                                        sparseArray3 = sparseArray5;
                                        u8Var2 = u8Var4;
                                        i26 = childCount3;
                                        childAt2.setLayoutParams(i8Var);
                                        if (q8Var.NCTxEWno == 0) {
                                            childAt2.setVisibility(q8Var.qoPGr6Ce);
                                        }
                                        childAt2.setAlpha(q8Var.MdtA4re8);
                                        childAt2.setRotation(r8Var.qoPGr6Ce);
                                        childAt2.setRotationX(r8Var.NCTxEWno);
                                        childAt2.setRotationY(r8Var.MdtA4re8);
                                        childAt2.setScaleX(r8Var.wxUZMvaN);
                                        childAt2.setScaleY(r8Var.VgvYg0wo);
                                        if (r8Var.Qr9iLBAD != -1) {
                                            if (((View) childAt2.getParent()).findViewById(r8Var.Qr9iLBAD) != null) {
                                                float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                                float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                                if (childAt2.getRight() - childAt2.getLeft() > 0 && childAt2.getBottom() - childAt2.getTop() > 0) {
                                                    childAt2.setPivotX(right - childAt2.getLeft());
                                                    childAt2.setPivotY(bottom - childAt2.getTop());
                                                }
                                            }
                                        } else {
                                            if (!Float.isNaN(r8Var.P7K7Inc8)) {
                                                childAt2.setPivotX(r8Var.P7K7Inc8);
                                            }
                                            if (!Float.isNaN(r8Var.b2ZJblxo)) {
                                                childAt2.setPivotY(r8Var.b2ZJblxo);
                                            }
                                        }
                                        childAt2.setTranslationX(r8Var.jb9XjC4I);
                                        childAt2.setTranslationY(r8Var.eVhOlqcC);
                                        childAt2.setTranslationZ(r8Var.k3x7lurq);
                                        if (r8Var.ow5vqvCr) {
                                            childAt2.setElevation(r8Var.OnDfzHZD);
                                        }
                                    }
                                } else {
                                    sparseArray3 = sparseArray5;
                                    hashSet = hashSet2;
                                    i25 = i32;
                                    u8Var2 = u8Var4;
                                    z4 = z;
                                    z5 = isInEditMode;
                                    i26 = childCount3;
                                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                                }
                                i32 = i25 + 1;
                                hashSet2 = hashSet;
                                z = z4;
                                isInEditMode = z5;
                                childCount3 = i26;
                                sparseArray5 = sparseArray3;
                                u8Var4 = u8Var2;
                            }
                        }
                        sparseArray3 = sparseArray5;
                        hashSet = hashSet2;
                        i25 = i32;
                        u8Var2 = u8Var4;
                        z4 = z;
                        z5 = isInEditMode;
                        i26 = childCount3;
                        i32 = i25 + 1;
                        hashSet2 = hashSet;
                        z = z4;
                        isInEditMode = z5;
                        childCount3 = i26;
                        sparseArray5 = sparseArray3;
                        u8Var4 = u8Var2;
                    }
                    sparseArray = sparseArray5;
                    u8 u8Var5 = u8Var4;
                    z2 = z;
                    z3 = isInEditMode;
                    i3 = childCount3;
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        n8 n8Var2 = (n8) hashMap.get(num);
                        if (n8Var2 != null) {
                            o8 o8Var2 = n8Var2.wxUZMvaN;
                            if (o8Var2.Wi7iiXC4 == 1) {
                                Context context = constraintLayout.getContext();
                                x1 x1Var2 = new x1(context);
                                x1Var2.NCTxEWno = new int[32];
                                x1Var2.Qr9iLBAD = new HashMap();
                                x1Var2.wxUZMvaN = context;
                                y1 y1Var = new y1();
                                y1Var.SMax8wMR = new t8[4];
                                y1Var.S7WAX0X5 = 0;
                                y1Var.CTE3lpUp = 0;
                                y1Var.B1cjorwa = true;
                                y1Var.X1t0wlBd = 0;
                                y1Var.D4B4MtvK = false;
                                x1Var2.eVhOlqcC = y1Var;
                                x1Var2.VgvYg0wo = y1Var;
                                x1Var2.VgvYg0wo();
                                x1Var2.setVisibility(8);
                                x1Var2.setId(num.intValue());
                                int[] iArr2 = o8Var2.QT4Tf9Dt;
                                if (iArr2 != null) {
                                    x1Var2.setReferencedIds(iArr2);
                                } else {
                                    String str6 = o8Var2.orhfF2Ya;
                                    if (str6 != null) {
                                        int[] NCTxEWno2 = s8.NCTxEWno(x1Var2, str6);
                                        o8Var2.QT4Tf9Dt = NCTxEWno2;
                                        x1Var2.setReferencedIds(NCTxEWno2);
                                    }
                                }
                                x1Var2.setType(o8Var2.LvHlPNBd);
                                x1Var2.setMargin(o8Var2.hGvurcGl);
                                i8 b2ZJblxo3 = b2ZJblxo();
                                x1Var2.VgvYg0wo();
                                n8Var2.qoPGr6Ce(b2ZJblxo3);
                                constraintLayout.addView(x1Var2, b2ZJblxo3);
                            }
                            if (o8Var2.qoPGr6Ce) {
                                zl zlVar = new zl(constraintLayout.getContext());
                                zlVar.setId(num.intValue());
                                i8 b2ZJblxo4 = b2ZJblxo();
                                n8Var2.qoPGr6Ce(b2ZJblxo4);
                                constraintLayout.addView(zlVar, b2ZJblxo4);
                            }
                        }
                    }
                    for (int i34 = 0; i34 < childCount4; i34++) {
                        constraintLayout.getChildAt(i34);
                    }
                    u8Var = u8Var5;
                } else {
                    sparseArray = sparseArray5;
                    z2 = z;
                    z3 = isInEditMode;
                    i3 = childCount3;
                    u8Var = u8Var4;
                }
                u8Var.SMax8wMR.clear();
                ArrayList arrayList = constraintLayout.MdtA4re8;
                int size = arrayList.size();
                char c3 = 2;
                if (size > 0) {
                    int i35 = 0;
                    while (i35 < size) {
                        g8 g8Var = (g8) arrayList.get(i35);
                        HashMap hashMap4 = g8Var.Qr9iLBAD;
                        if (g8Var.isInEditMode()) {
                            g8Var.setIds(g8Var.P7K7Inc8);
                        }
                        y1 y1Var2 = g8Var.VgvYg0wo;
                        if (y1Var2 == null) {
                            sparseArray2 = sparseArray;
                        } else {
                            y1Var2.S7WAX0X5 = 0;
                            Arrays.fill(y1Var2.SMax8wMR, (Object) null);
                            int i36 = 0;
                            while (i36 < g8Var.MdtA4re8) {
                                int i37 = g8Var.NCTxEWno[i36];
                                SparseArray sparseArray6 = sparseArray;
                                View view2 = (View) sparseArray6.get(i37);
                                if (view2 == null && (wxUZMvaN = g8Var.wxUZMvaN(constraintLayout, (str = (String) hashMap4.get(Integer.valueOf(i37))))) != 0) {
                                    g8Var.NCTxEWno[i36] = wxUZMvaN;
                                    hashMap4.put(Integer.valueOf(wxUZMvaN), str);
                                    view2 = (View) sparseArray6.get(wxUZMvaN);
                                }
                                if (view2 != null) {
                                    y1 y1Var3 = g8Var.VgvYg0wo;
                                    t8 Qr9iLBAD2 = constraintLayout.Qr9iLBAD(view2);
                                    y1Var3.getClass();
                                    if (Qr9iLBAD2 != y1Var3 && Qr9iLBAD2 != null) {
                                        int i38 = y1Var3.S7WAX0X5 + 1;
                                        t8[] t8VarArr = y1Var3.SMax8wMR;
                                        if (i38 > t8VarArr.length) {
                                            t8VarArr = (t8[]) Arrays.copyOf(t8VarArr, t8VarArr.length * 2);
                                            y1Var3.SMax8wMR = t8VarArr;
                                        }
                                        int i39 = y1Var3.S7WAX0X5;
                                        t8VarArr[i39] = Qr9iLBAD2;
                                        y1Var3.S7WAX0X5 = i39 + 1;
                                    }
                                }
                                i36++;
                                sparseArray = sparseArray6;
                            }
                            sparseArray2 = sparseArray;
                            g8Var.VgvYg0wo.getClass();
                        }
                        i35++;
                        sparseArray = sparseArray2;
                    }
                }
                int i40 = i3;
                for (int i41 = 0; i41 < i40; i41++) {
                    constraintLayout.getChildAt(i41);
                }
                SparseArray sparseArray7 = constraintLayout.lDXGDhIF;
                sparseArray7.clear();
                sparseArray7.put(0, u8Var);
                sparseArray7.put(constraintLayout.getId(), u8Var);
                for (int i42 = 0; i42 < i40; i42++) {
                    View childAt3 = constraintLayout.getChildAt(i42);
                    sparseArray7.put(childAt3.getId(), constraintLayout.Qr9iLBAD(childAt3));
                }
                int i43 = 0;
                while (i43 < i40) {
                    View childAt4 = constraintLayout.getChildAt(i43);
                    t8 Qr9iLBAD3 = constraintLayout.Qr9iLBAD(childAt4);
                    if (Qr9iLBAD3 != null) {
                        i8 i8Var2 = (i8) childAt4.getLayoutParams();
                        u8Var.SMax8wMR.add(Qr9iLBAD3);
                        u8 u8Var6 = Qr9iLBAD3.HdOGZAzC;
                        if (u8Var6 != null) {
                            u8Var6.SMax8wMR.remove(Qr9iLBAD3);
                            Qr9iLBAD3.lwWCatUu();
                        }
                        Qr9iLBAD3.HdOGZAzC = u8Var;
                        i8Var2.qoPGr6Ce();
                        Qr9iLBAD3.LvHlPNBd = childAt4.getVisibility();
                        Qr9iLBAD3.Sjrx9cEN = childAt4;
                        if (childAt4 instanceof g8) {
                            boolean z8 = u8Var.D4B4MtvK;
                            int i44 = ((x1) ((g8) childAt4)).jb9XjC4I;
                            if (z8) {
                                if (i44 != 5) {
                                }
                                i44 = 1;
                                if (Qr9iLBAD3 instanceof y1) {
                                    ((y1) Qr9iLBAD3).CTE3lpUp = i44;
                                }
                            } else {
                                if (i44 != 5) {
                                }
                                i44 = 0;
                                if (Qr9iLBAD3 instanceof y1) {
                                }
                            }
                        }
                        if (i8Var2.tef3qNMP) {
                            am amVar = (am) Qr9iLBAD3;
                            int i45 = i8Var2.uQ3KJUK5;
                            int i46 = i8Var2.XrPeKzBk;
                            float f4 = i8Var2.N2kLh4D5;
                            if (f4 == -1.0f) {
                                c2 = 65535;
                                if (i45 != -1) {
                                    if (i45 > -1) {
                                        amVar.SMax8wMR = -1.0f;
                                        amVar.S7WAX0X5 = i45;
                                        amVar.CTE3lpUp = -1;
                                    }
                                } else if (i46 != -1 && i46 > -1) {
                                    amVar.SMax8wMR = -1.0f;
                                    amVar.S7WAX0X5 = -1;
                                    amVar.CTE3lpUp = i46;
                                }
                                c = c3;
                            } else if (f4 > -1.0f) {
                                amVar.SMax8wMR = f4;
                                c2 = 65535;
                                amVar.S7WAX0X5 = -1;
                                amVar.CTE3lpUp = -1;
                                c = c3;
                            }
                            i43++;
                            c3 = c;
                        } else {
                            int i47 = i8Var2.LvHlPNBd;
                            int i48 = i8Var2.hGvurcGl;
                            int i49 = i8Var2.Wi7iiXC4;
                            int i50 = i8Var2.QT4Tf9Dt;
                            int i51 = i8Var2.orhfF2Ya;
                            int i52 = i8Var2.dHozS53r;
                            float f5 = i8Var2.f7oeun2L;
                            int i53 = i8Var2.sjUBp5pO;
                            if (i53 != -1) {
                                t8 t8Var7 = (t8) sparseArray7.get(i53);
                                if (t8Var7 != null) {
                                    float f6 = i8Var2.amk52bBQ;
                                    Qr9iLBAD3.Ey6iv0m0(7, 7, i8Var2.OxcuoDLp, 0, t8Var7);
                                    Qr9iLBAD3.Mq3SeTnW = f6;
                                }
                                t8Var5 = Qr9iLBAD3;
                                i17 = 4;
                                i18 = 2;
                                i13 = 5;
                                i19 = 3;
                            } else {
                                if (i47 != -1) {
                                    t8 t8Var8 = (t8) sparseArray7.get(i47);
                                    if (t8Var8 != null) {
                                        i5 = i52;
                                        f = f5;
                                        i4 = i50;
                                        i6 = 2;
                                        Qr9iLBAD3.Ey6iv0m0(2, 2, ((ViewGroup.MarginLayoutParams) i8Var2).leftMargin, i51, t8Var8);
                                    } else {
                                        i4 = i50;
                                        i5 = i52;
                                        f = f5;
                                        i6 = 2;
                                    }
                                } else {
                                    i4 = i50;
                                    i5 = i52;
                                    i6 = 2;
                                    if (i48 == -1 || (t8Var = (t8) sparseArray7.get(i48)) == null) {
                                        f = f5;
                                    } else {
                                        f = f5;
                                        Qr9iLBAD3.Ey6iv0m0(2, 4, ((ViewGroup.MarginLayoutParams) i8Var2).leftMargin, i51, t8Var);
                                        i7 = 2;
                                        i8 = 4;
                                        if (i49 == -1) {
                                            t8 t8Var9 = (t8) sparseArray7.get(i49);
                                            if (t8Var9 != null) {
                                                Qr9iLBAD3.Ey6iv0m0(i8, i7, ((ViewGroup.MarginLayoutParams) i8Var2).rightMargin, i5, t8Var9);
                                            }
                                            i9 = i7;
                                        } else {
                                            i9 = i7;
                                            int i54 = i5;
                                            if (i4 != -1 && (t8Var2 = (t8) sparseArray7.get(i4)) != null) {
                                                Qr9iLBAD3.Ey6iv0m0(i8, i8, ((ViewGroup.MarginLayoutParams) i8Var2).rightMargin, i54, t8Var2);
                                            }
                                        }
                                        int i55 = i8;
                                        i10 = i8Var2.jb9XjC4I;
                                        if (i10 == -1) {
                                            t8 t8Var10 = (t8) sparseArray7.get(i10);
                                            if (t8Var10 != null) {
                                                i20 = 3;
                                                Qr9iLBAD3.Ey6iv0m0(3, 3, ((ViewGroup.MarginLayoutParams) i8Var2).topMargin, i8Var2.gjV1z5T1, t8Var10);
                                            } else {
                                                i20 = 3;
                                            }
                                            i12 = i20;
                                            i13 = 5;
                                            i11 = -1;
                                        } else {
                                            int i56 = i8Var2.eVhOlqcC;
                                            if (i56 == -1 || (t8Var3 = (t8) sparseArray7.get(i56)) == null) {
                                                i11 = -1;
                                                i12 = 3;
                                                i13 = 5;
                                            } else {
                                                i11 = -1;
                                                Qr9iLBAD3.Ey6iv0m0(3, 5, ((ViewGroup.MarginLayoutParams) i8Var2).topMargin, i8Var2.gjV1z5T1, t8Var3);
                                                i12 = 3;
                                                i13 = 5;
                                            }
                                        }
                                        i14 = i8Var2.k3x7lurq;
                                        if (i14 == i11) {
                                            t8 t8Var11 = (t8) sparseArray7.get(i14);
                                            if (t8Var11 != null) {
                                                Qr9iLBAD3.Ey6iv0m0(i13, i12, ((ViewGroup.MarginLayoutParams) i8Var2).bottomMargin, i8Var2.DK9slbsy, t8Var11);
                                            }
                                            i15 = i12;
                                        } else {
                                            i15 = i12;
                                            int i57 = i8Var2.ow5vqvCr;
                                            if (i57 != i11 && (t8Var4 = (t8) sparseArray7.get(i57)) != null) {
                                                Qr9iLBAD3.Ey6iv0m0(i13, i13, ((ViewGroup.MarginLayoutParams) i8Var2).bottomMargin, i8Var2.DK9slbsy, t8Var4);
                                            }
                                        }
                                        f2 = f;
                                        i16 = i8Var2.OnDfzHZD;
                                        if (i16 == -1) {
                                            i18 = i9;
                                            i17 = i55;
                                            t8Var5 = Qr9iLBAD3;
                                            constraintLayout.ow5vqvCr(t8Var5, i8Var2, sparseArray7, i16, 6);
                                            constraintLayout = this;
                                            i19 = i15;
                                        } else {
                                            i17 = i55;
                                            t8Var5 = Qr9iLBAD3;
                                            i18 = i9;
                                            int i58 = i8Var2.ygLcUYwZ;
                                            if (i58 != -1) {
                                                constraintLayout = this;
                                                int i59 = i15;
                                                constraintLayout.ow5vqvCr(t8Var5, i8Var2, sparseArray7, i58, i59);
                                                i19 = i59;
                                            } else {
                                                i19 = i15;
                                                int i60 = i8Var2.lDXGDhIF;
                                                constraintLayout = this;
                                                if (i60 != -1) {
                                                    constraintLayout.ow5vqvCr(t8Var5, i8Var2, sparseArray7, i60, i13);
                                                }
                                            }
                                        }
                                        if (f2 >= 0.0f) {
                                            t8Var5.pP9Y2m6O = f2;
                                        }
                                        f3 = i8Var2.SgZGMMPL;
                                        if (f3 >= 0.0f) {
                                            t8Var5.tef3qNMP = f3;
                                        }
                                    }
                                }
                                i7 = i6;
                                i8 = 4;
                                if (i49 == -1) {
                                }
                                int i552 = i8;
                                i10 = i8Var2.jb9XjC4I;
                                if (i10 == -1) {
                                }
                                i14 = i8Var2.k3x7lurq;
                                if (i14 == i11) {
                                }
                                f2 = f;
                                i16 = i8Var2.OnDfzHZD;
                                if (i16 == -1) {
                                }
                                if (f2 >= 0.0f) {
                                }
                                f3 = i8Var2.SgZGMMPL;
                                if (f3 >= 0.0f) {
                                }
                            }
                            if (z3 && ((i24 = i8Var2.ZyZthT5G) != -1 || i8Var2.bvfAo0eO != -1)) {
                                int i61 = i8Var2.bvfAo0eO;
                                t8Var5.TrssYQ34 = i24;
                                t8Var5.g2aRJUAd = i61;
                            }
                            if (i8Var2.VGmz0ccI) {
                                t8Var5.pRiPUEwG(1);
                                t8Var5.aZz0PFXp(((ViewGroup.MarginLayoutParams) i8Var2).width);
                                if (((ViewGroup.MarginLayoutParams) i8Var2).width == -2) {
                                    t8Var5.pRiPUEwG(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) i8Var2).width == -1) {
                                if (i8Var2.gmkaJpmS) {
                                    t8Var5.pRiPUEwG(3);
                                } else {
                                    t8Var5.pRiPUEwG(4);
                                }
                                t8Var5.b2ZJblxo(i18).b2ZJblxo = ((ViewGroup.MarginLayoutParams) i8Var2).leftMargin;
                                t8Var5.b2ZJblxo(i17).b2ZJblxo = ((ViewGroup.MarginLayoutParams) i8Var2).rightMargin;
                            } else {
                                t8Var5.pRiPUEwG(3);
                                t8Var5.aZz0PFXp(0);
                            }
                            if (i8Var2.LfKQckgD) {
                                i21 = -1;
                                t8Var5.VhgXwMj9(1);
                                t8Var5.eIA6dogk(((ViewGroup.MarginLayoutParams) i8Var2).height);
                                if (((ViewGroup.MarginLayoutParams) i8Var2).height == -2) {
                                    t8Var5.VhgXwMj9(2);
                                }
                            } else {
                                i21 = -1;
                                if (((ViewGroup.MarginLayoutParams) i8Var2).height == -1) {
                                    if (i8Var2.TrssYQ34) {
                                        t8Var5.VhgXwMj9(3);
                                    } else {
                                        t8Var5.VhgXwMj9(4);
                                    }
                                    t8Var5.b2ZJblxo(i19).b2ZJblxo = ((ViewGroup.MarginLayoutParams) i8Var2).topMargin;
                                    t8Var5.b2ZJblxo(i13).b2ZJblxo = ((ViewGroup.MarginLayoutParams) i8Var2).bottomMargin;
                                } else {
                                    t8Var5.VhgXwMj9(3);
                                    t8Var5.eIA6dogk(0);
                                }
                            }
                            String str7 = i8Var2.ytu5o6f4;
                            if (str7 == null || str7.length() == 0) {
                                t8Var5.KRabZ4CU = 0.0f;
                            } else {
                                int length = str7.length();
                                int indexOf3 = str7.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i22 = i21;
                                    i23 = 0;
                                } else {
                                    String substring = str7.substring(0, indexOf3);
                                    i22 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i21;
                                    i23 = indexOf3 + 1;
                                }
                                int indexOf4 = str7.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str7.substring(i23);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str7.substring(i23, indexOf4);
                                    String substring4 = str7.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i22 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    t8Var5.KRabZ4CU = parseFloat;
                                    t8Var5.gmkaJpmS = i22;
                                }
                            }
                            float f7 = i8Var2.eIA6dogk;
                            float[] fArr = t8Var5.orhfF2Ya;
                            fArr[0] = f7;
                            fArr[1] = i8Var2.pRiPUEwG;
                            t8Var5.Wi7iiXC4 = i8Var2.VhgXwMj9;
                            t8Var5.QT4Tf9Dt = i8Var2.aZz0PFXp;
                            int i62 = i8Var2.ESscZ9M1;
                            if (i62 >= 0 && i62 <= 3) {
                                t8Var5.OxcuoDLp = i62;
                            }
                            int i63 = i8Var2.Xkz7p5xa;
                            int i64 = i8Var2.hzgxAD8d;
                            int i65 = i8Var2.FXJmAAN1;
                            float f8 = i8Var2.N8VPGzVC;
                            t8Var5.amk52bBQ = i63;
                            t8Var5.I5GHvsYW = i64;
                            if (i65 == Integer.MAX_VALUE) {
                                i65 = 0;
                            }
                            t8Var5.RXQxj5Oe = i65;
                            t8Var5.FySoLYna = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i63 == 0) {
                                t8Var5.amk52bBQ = 2;
                            }
                            int i66 = i8Var2.fVMzMhyS;
                            int i67 = i8Var2.zCflySGU;
                            int i68 = i8Var2.nSmgoSB5;
                            float f9 = i8Var2.HdOGZAzC;
                            t8Var5.KlHjfFWx = i66;
                            t8Var5.gjV1z5T1 = i67;
                            if (i68 == Integer.MAX_VALUE) {
                                i68 = 0;
                            }
                            t8Var5.WYNAV5pd = i68;
                            t8Var5.DK9slbsy = f9;
                            if (f9 <= 0.0f || f9 >= 1.0f || i66 != 0) {
                                c = 2;
                            } else {
                                c = 2;
                                t8Var5.KlHjfFWx = 2;
                            }
                            i43++;
                            c3 = c;
                        }
                    }
                    c = c3;
                    i43++;
                    c3 = c;
                }
            } else {
                u8Var = u8Var4;
                z2 = z;
            }
            if (z2) {
                u8Var.S7WAX0X5.pRiPUEwG(u8Var);
            }
        } else {
            u8Var = u8Var4;
        }
        u8Var.yzvmSy3z.getClass();
        constraintLayout.k3x7lurq(u8Var, constraintLayout.eVhOlqcC, i, i2);
        int lDXGDhIF = u8Var.lDXGDhIF();
        int jb9XjC4I = u8Var.jb9XjC4I();
        boolean z9 = u8Var.NRrvEVSS;
        boolean z10 = u8Var.YksF3V7p;
        j8 j8Var = constraintLayout.sjUBp5pO;
        int i69 = j8Var.VgvYg0wo;
        int resolveSizeAndState = View.resolveSizeAndState(lDXGDhIF + j8Var.wxUZMvaN, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(jb9XjC4I + i69, i2, 0) & 16777215;
        int min = Math.min(constraintLayout.b2ZJblxo, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.Qr9iLBAD, resolveSizeAndState2);
        if (z9) {
            min |= 16777216;
        }
        if (z10) {
            min2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        t8 Qr9iLBAD = Qr9iLBAD(view);
        if ((view instanceof zl) && !(Qr9iLBAD instanceof am)) {
            i8 i8Var = (i8) view.getLayoutParams();
            am amVar = new am();
            i8Var.SMax8wMR = amVar;
            i8Var.tef3qNMP = true;
            amVar.zCflySGU(i8Var.KRabZ4CU);
        }
        if (view instanceof g8) {
            g8 g8Var = (g8) view;
            g8Var.VgvYg0wo();
            ((i8) view.getLayoutParams()).Sjrx9cEN = true;
            ArrayList arrayList = this.MdtA4re8;
            if (!arrayList.contains(g8Var)) {
                arrayList.add(g8Var);
            }
        }
        this.NCTxEWno.put(view.getId(), view);
        this.jb9XjC4I = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.NCTxEWno.remove(view.getId());
        t8 Qr9iLBAD = Qr9iLBAD(view);
        this.wxUZMvaN.SMax8wMR.remove(Qr9iLBAD);
        Qr9iLBAD.lwWCatUu();
        this.MdtA4re8.remove(view);
        this.jb9XjC4I = true;
    }

    public final void ow5vqvCr(t8 t8Var, i8 i8Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.NCTxEWno.get(i);
        t8 t8Var2 = (t8) sparseArray.get(i);
        if (t8Var2 == null || view == null || !(view.getLayoutParams() instanceof i8)) {
            return;
        }
        i8Var.pP9Y2m6O = true;
        if (i2 == 6) {
            i8 i8Var2 = (i8) view.getLayoutParams();
            i8Var2.pP9Y2m6O = true;
            i8Var2.SMax8wMR.euDDoUNr = true;
        }
        t8Var.b2ZJblxo(6).qoPGr6Ce(t8Var2.b2ZJblxo(i2), i8Var.Mq3SeTnW, i8Var.i7xS8jrb);
        t8Var.euDDoUNr = true;
        t8Var.b2ZJblxo(3).b2ZJblxo();
        t8Var.b2ZJblxo(5).b2ZJblxo();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.jb9XjC4I = true;
        super.requestLayout();
    }

    public void setConstraintSet(s8 s8Var) {
        this.k3x7lurq = s8Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.NCTxEWno;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.Qr9iLBAD) {
            return;
        }
        this.Qr9iLBAD = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.b2ZJblxo) {
            return;
        }
        this.b2ZJblxo = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.P7K7Inc8) {
            return;
        }
        this.P7K7Inc8 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.VgvYg0wo) {
            return;
        }
        this.VgvYg0wo = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(v8 v8Var) {
        mcXgUFR8 mcxgufr8 = this.ow5vqvCr;
        if (mcxgufr8 != null) {
            mcxgufr8.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.eVhOlqcC = i;
        u8 u8Var = this.wxUZMvaN;
        u8Var.QhQjwNAr = i;
        gp.OxcuoDLp = u8Var.HdOGZAzC(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.NCTxEWno = new SparseArray();
        this.MdtA4re8 = new ArrayList(4);
        this.wxUZMvaN = new u8();
        this.VgvYg0wo = 0;
        this.P7K7Inc8 = 0;
        this.b2ZJblxo = Integer.MAX_VALUE;
        this.Qr9iLBAD = Integer.MAX_VALUE;
        this.jb9XjC4I = true;
        this.eVhOlqcC = 257;
        this.k3x7lurq = null;
        this.ow5vqvCr = null;
        this.OnDfzHZD = -1;
        this.ygLcUYwZ = new HashMap();
        this.lDXGDhIF = new SparseArray();
        this.sjUBp5pO = new j8(this, this);
        jb9XjC4I(attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        i8 i8Var = new i8(layoutParams);
        i8Var.qoPGr6Ce = -1;
        i8Var.NCTxEWno = -1;
        i8Var.MdtA4re8 = -1.0f;
        i8Var.wxUZMvaN = true;
        i8Var.VgvYg0wo = -1;
        i8Var.P7K7Inc8 = -1;
        i8Var.b2ZJblxo = -1;
        i8Var.Qr9iLBAD = -1;
        i8Var.jb9XjC4I = -1;
        i8Var.eVhOlqcC = -1;
        i8Var.k3x7lurq = -1;
        i8Var.ow5vqvCr = -1;
        i8Var.OnDfzHZD = -1;
        i8Var.ygLcUYwZ = -1;
        i8Var.lDXGDhIF = -1;
        i8Var.sjUBp5pO = -1;
        i8Var.OxcuoDLp = 0;
        i8Var.amk52bBQ = 0.0f;
        i8Var.KlHjfFWx = -1;
        i8Var.Ey6iv0m0 = -1;
        i8Var.I5GHvsYW = -1;
        i8Var.RXQxj5Oe = -1;
        i8Var.FySoLYna = Integer.MIN_VALUE;
        i8Var.gjV1z5T1 = Integer.MIN_VALUE;
        i8Var.WYNAV5pd = Integer.MIN_VALUE;
        i8Var.DK9slbsy = Integer.MIN_VALUE;
        i8Var.lwWCatUu = Integer.MIN_VALUE;
        i8Var.U0LaHZX7 = Integer.MIN_VALUE;
        i8Var.i7xS8jrb = Integer.MIN_VALUE;
        i8Var.Mq3SeTnW = 0;
        i8Var.euDDoUNr = 0.5f;
        i8Var.SgZGMMPL = 0.5f;
        i8Var.ytu5o6f4 = null;
        i8Var.eIA6dogk = -1.0f;
        i8Var.pRiPUEwG = -1.0f;
        i8Var.VhgXwMj9 = 0;
        i8Var.aZz0PFXp = 0;
        i8Var.Xkz7p5xa = 0;
        i8Var.fVMzMhyS = 0;
        i8Var.hzgxAD8d = 0;
        i8Var.zCflySGU = 0;
        i8Var.FXJmAAN1 = 0;
        i8Var.nSmgoSB5 = 0;
        i8Var.N8VPGzVC = 1.0f;
        i8Var.HdOGZAzC = 1.0f;
        i8Var.ZyZthT5G = -1;
        i8Var.bvfAo0eO = -1;
        i8Var.KRabZ4CU = -1;
        i8Var.gmkaJpmS = false;
        i8Var.TrssYQ34 = false;
        i8Var.g2aRJUAd = null;
        i8Var.ESscZ9M1 = 0;
        i8Var.VGmz0ccI = true;
        i8Var.LfKQckgD = true;
        i8Var.pP9Y2m6O = false;
        i8Var.tef3qNMP = false;
        i8Var.Sjrx9cEN = false;
        i8Var.LvHlPNBd = -1;
        i8Var.hGvurcGl = -1;
        i8Var.Wi7iiXC4 = -1;
        i8Var.QT4Tf9Dt = -1;
        i8Var.orhfF2Ya = Integer.MIN_VALUE;
        i8Var.dHozS53r = Integer.MIN_VALUE;
        i8Var.f7oeun2L = 0.5f;
        i8Var.SMax8wMR = new t8();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) i8Var).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) i8Var).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) i8Var).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) i8Var).bottomMargin = marginLayoutParams.bottomMargin;
            i8Var.setMarginStart(marginLayoutParams.getMarginStart());
            i8Var.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof i8)) {
            return i8Var;
        }
        i8 i8Var2 = (i8) layoutParams;
        i8Var.qoPGr6Ce = i8Var2.qoPGr6Ce;
        i8Var.NCTxEWno = i8Var2.NCTxEWno;
        i8Var.MdtA4re8 = i8Var2.MdtA4re8;
        i8Var.wxUZMvaN = i8Var2.wxUZMvaN;
        i8Var.VgvYg0wo = i8Var2.VgvYg0wo;
        i8Var.P7K7Inc8 = i8Var2.P7K7Inc8;
        i8Var.b2ZJblxo = i8Var2.b2ZJblxo;
        i8Var.Qr9iLBAD = i8Var2.Qr9iLBAD;
        i8Var.jb9XjC4I = i8Var2.jb9XjC4I;
        i8Var.eVhOlqcC = i8Var2.eVhOlqcC;
        i8Var.k3x7lurq = i8Var2.k3x7lurq;
        i8Var.ow5vqvCr = i8Var2.ow5vqvCr;
        i8Var.OnDfzHZD = i8Var2.OnDfzHZD;
        i8Var.ygLcUYwZ = i8Var2.ygLcUYwZ;
        i8Var.lDXGDhIF = i8Var2.lDXGDhIF;
        i8Var.sjUBp5pO = i8Var2.sjUBp5pO;
        i8Var.OxcuoDLp = i8Var2.OxcuoDLp;
        i8Var.amk52bBQ = i8Var2.amk52bBQ;
        i8Var.KlHjfFWx = i8Var2.KlHjfFWx;
        i8Var.Ey6iv0m0 = i8Var2.Ey6iv0m0;
        i8Var.I5GHvsYW = i8Var2.I5GHvsYW;
        i8Var.RXQxj5Oe = i8Var2.RXQxj5Oe;
        i8Var.FySoLYna = i8Var2.FySoLYna;
        i8Var.gjV1z5T1 = i8Var2.gjV1z5T1;
        i8Var.WYNAV5pd = i8Var2.WYNAV5pd;
        i8Var.DK9slbsy = i8Var2.DK9slbsy;
        i8Var.lwWCatUu = i8Var2.lwWCatUu;
        i8Var.U0LaHZX7 = i8Var2.U0LaHZX7;
        i8Var.i7xS8jrb = i8Var2.i7xS8jrb;
        i8Var.Mq3SeTnW = i8Var2.Mq3SeTnW;
        i8Var.euDDoUNr = i8Var2.euDDoUNr;
        i8Var.SgZGMMPL = i8Var2.SgZGMMPL;
        i8Var.ytu5o6f4 = i8Var2.ytu5o6f4;
        i8Var.eIA6dogk = i8Var2.eIA6dogk;
        i8Var.pRiPUEwG = i8Var2.pRiPUEwG;
        i8Var.VhgXwMj9 = i8Var2.VhgXwMj9;
        i8Var.aZz0PFXp = i8Var2.aZz0PFXp;
        i8Var.gmkaJpmS = i8Var2.gmkaJpmS;
        i8Var.TrssYQ34 = i8Var2.TrssYQ34;
        i8Var.Xkz7p5xa = i8Var2.Xkz7p5xa;
        i8Var.fVMzMhyS = i8Var2.fVMzMhyS;
        i8Var.hzgxAD8d = i8Var2.hzgxAD8d;
        i8Var.FXJmAAN1 = i8Var2.FXJmAAN1;
        i8Var.zCflySGU = i8Var2.zCflySGU;
        i8Var.nSmgoSB5 = i8Var2.nSmgoSB5;
        i8Var.N8VPGzVC = i8Var2.N8VPGzVC;
        i8Var.HdOGZAzC = i8Var2.HdOGZAzC;
        i8Var.ZyZthT5G = i8Var2.ZyZthT5G;
        i8Var.bvfAo0eO = i8Var2.bvfAo0eO;
        i8Var.KRabZ4CU = i8Var2.KRabZ4CU;
        i8Var.VGmz0ccI = i8Var2.VGmz0ccI;
        i8Var.LfKQckgD = i8Var2.LfKQckgD;
        i8Var.pP9Y2m6O = i8Var2.pP9Y2m6O;
        i8Var.tef3qNMP = i8Var2.tef3qNMP;
        i8Var.LvHlPNBd = i8Var2.LvHlPNBd;
        i8Var.hGvurcGl = i8Var2.hGvurcGl;
        i8Var.Wi7iiXC4 = i8Var2.Wi7iiXC4;
        i8Var.QT4Tf9Dt = i8Var2.QT4Tf9Dt;
        i8Var.orhfF2Ya = i8Var2.orhfF2Ya;
        i8Var.dHozS53r = i8Var2.dHozS53r;
        i8Var.f7oeun2L = i8Var2.f7oeun2L;
        i8Var.g2aRJUAd = i8Var2.g2aRJUAd;
        i8Var.ESscZ9M1 = i8Var2.ESscZ9M1;
        i8Var.SMax8wMR = i8Var2.SMax8wMR;
        return i8Var;
    }
}
