package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bc0 {
    public String MdtA4re8;
    public final String NCTxEWno;
    public final int OnDfzHZD;
    public final float P7K7Inc8;
    public final float Qr9iLBAD;
    public final int VgvYg0wo;
    public final float b2ZJblxo;
    public final float eVhOlqcC;
    public final boolean jb9XjC4I;
    public final ColorStateList k3x7lurq;
    public float ow5vqvCr;
    public final ColorStateList qoPGr6Ce;
    public Typeface sjUBp5pO;
    public final int wxUZMvaN;
    public boolean ygLcUYwZ = false;
    public boolean lDXGDhIF = false;

    public bc0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, z00.RXQxj5Oe);
        this.ow5vqvCr = obtainStyledAttributes.getDimension(0, 0.0f);
        this.k3x7lurq = w30.gjV1z5T1(context, obtainStyledAttributes, 3);
        w30.gjV1z5T1(context, obtainStyledAttributes, 4);
        w30.gjV1z5T1(context, obtainStyledAttributes, 5);
        this.wxUZMvaN = obtainStyledAttributes.getInt(2, 0);
        this.VgvYg0wo = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.OnDfzHZD = obtainStyledAttributes.getResourceId(i2, 0);
        this.NCTxEWno = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.qoPGr6Ce = w30.gjV1z5T1(context, obtainStyledAttributes, 6);
        this.P7K7Inc8 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.b2ZJblxo = obtainStyledAttributes.getFloat(8, 0.0f);
        this.Qr9iLBAD = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, y00.KlHjfFWx);
        this.jb9XjC4I = obtainStyledAttributes2.hasValue(0);
        this.eVhOlqcC = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.MdtA4re8 = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void MdtA4re8(Context context, TextPaint textPaint, e50 e50Var) {
        wxUZMvaN(context, textPaint, e50Var);
        ColorStateList colorStateList = this.k3x7lurq;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.qoPGr6Ce;
        textPaint.setShadowLayer(this.Qr9iLBAD, this.P7K7Inc8, this.b2ZJblxo, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final boolean NCTxEWno(Context context) {
        Context context2;
        Typeface qoPGr6Ce;
        String str;
        Typeface create;
        if (this.ygLcUYwZ) {
            return true;
        }
        int i = this.OnDfzHZD;
        if (i != 0) {
            ThreadLocal threadLocal = i30.qoPGr6Ce;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                qoPGr6Ce = null;
            } else {
                context2 = context;
                qoPGr6Ce = i30.qoPGr6Ce(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (qoPGr6Ce != null) {
                this.sjUBp5pO = qoPGr6Ce;
                this.ygLcUYwZ = true;
                return true;
            }
            if (!this.lDXGDhIF) {
                this.lDXGDhIF = true;
                Resources resources = context2.getResources();
                int i2 = this.OnDfzHZD;
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), s00.NCTxEWno);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.wxUZMvaN);
                }
            }
            if (typeface != null) {
                this.sjUBp5pO = typeface;
                this.ygLcUYwZ = true;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void VgvYg0wo(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typeface2;
        int i;
        int i2;
        int weight;
        int i3;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    int i5 = i3 + weight;
                    if (i5 < 1) {
                        i5 = 1;
                    } else if (i5 > 1000) {
                        i5 = 1000;
                    }
                    typeface2 = Typeface.create(typeface, i5, typeface.isItalic());
                    if (typeface2 != null) {
                        typeface = typeface2;
                    }
                    textPaint.setTypeface(typeface);
                    int i6 = (~typeface.getStyle()) & this.wxUZMvaN;
                    textPaint.setFakeBoldText((i6 & 1) != 0);
                    textPaint.setTextSkewX((i6 & 2) == 0 ? -0.25f : 0.0f);
                    textPaint.setTextSize(this.ow5vqvCr);
                    if (i4 >= 26) {
                        textPaint.setFontVariationSettings(null);
                        textPaint.setFontVariationSettings(this.MdtA4re8);
                    }
                    if (this.jb9XjC4I) {
                        return;
                    }
                    textPaint.setLetterSpacing(this.eVhOlqcC);
                    return;
                }
            }
        }
        typeface2 = null;
        if (typeface2 != null) {
        }
        textPaint.setTypeface(typeface);
        int i62 = (~typeface.getStyle()) & this.wxUZMvaN;
        textPaint.setFakeBoldText((i62 & 1) != 0);
        textPaint.setTextSkewX((i62 & 2) == 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.ow5vqvCr);
        if (i4 >= 26) {
        }
        if (this.jb9XjC4I) {
        }
    }

    public final void qoPGr6Ce() {
        Typeface typeface;
        String str;
        Typeface typeface2 = this.sjUBp5pO;
        int i = this.wxUZMvaN;
        if (typeface2 == null && (str = this.NCTxEWno) != null) {
            typeface2 = Typeface.create(str, i);
            this.sjUBp5pO = typeface2;
        }
        if (typeface2 == null) {
            int i2 = this.VgvYg0wo;
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
                this.sjUBp5pO = typeface;
            } else if (i2 == 2) {
                typeface = Typeface.SERIF;
                this.sjUBp5pO = typeface;
            } else if (i2 != 3) {
                typeface = Typeface.DEFAULT;
                this.sjUBp5pO = typeface;
            } else {
                typeface = Typeface.MONOSPACE;
                this.sjUBp5pO = typeface;
            }
            this.sjUBp5pO = Typeface.create(typeface, i);
        }
    }

    public final void wxUZMvaN(Context context, TextPaint textPaint, e50 e50Var) {
        Typeface typeface;
        if (NCTxEWno(context) && this.ygLcUYwZ && (typeface = this.sjUBp5pO) != null) {
            VgvYg0wo(context, textPaint, typeface);
            return;
        }
        qoPGr6Ce();
        VgvYg0wo(context, textPaint, this.sjUBp5pO);
        ac0 ac0Var = new ac0(this, context, textPaint, e50Var);
        if (!NCTxEWno(context)) {
            qoPGr6Ce();
        }
        int i = this.OnDfzHZD;
        if (i == 0) {
            this.ygLcUYwZ = true;
        }
        if (this.ygLcUYwZ) {
            ac0Var.ow5vqvCr(this.sjUBp5pO, true);
            return;
        }
        try {
            zb0 zb0Var = new zb0(this, ac0Var);
            ThreadLocal threadLocal = i30.qoPGr6Ce;
            if (context.isRestricted()) {
                zb0Var.wxUZMvaN(-4);
            } else {
                i30.qoPGr6Ce(context, i, new TypedValue(), 0, zb0Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.ygLcUYwZ = true;
            ac0Var.k3x7lurq(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.NCTxEWno, e);
            this.ygLcUYwZ = true;
            ac0Var.k3x7lurq(-3);
        }
    }
}
