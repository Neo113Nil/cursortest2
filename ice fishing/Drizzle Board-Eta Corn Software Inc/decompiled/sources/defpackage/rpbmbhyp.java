package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class rpbmbhyp {
    public Object MdtA4re8;
    public final Object NCTxEWno;
    public int qoPGr6Ce;

    public rpbmbhyp(Shader shader, ColorStateList colorStateList, int i) {
        this.NCTxEWno = shader;
        this.MdtA4re8 = colorStateList;
        this.qoPGr6Ce = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new defpackage.mcXgUFR8(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.MdtA4re8;
        r17 = (float[]) r0.wxUZMvaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new defpackage.rpbmbhyp(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.MdtA4re8, (float[]) r0.wxUZMvaN);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.MdtA4re8;
        r21 = (float[]) r0.wxUZMvaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new defpackage.mcXgUFR8(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new defpackage.mcXgUFR8(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rpbmbhyp NCTxEWno(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList NCTxEWno = f6.NCTxEWno(resources, xml, asAttributeSet, theme);
                return new rpbmbhyp(null, NCTxEWno, NCTxEWno.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray b2ZJblxo = n50.b2ZJblxo(resources, theme, asAttributeSet, s00.VgvYg0wo);
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? b2ZJblxo.getFloat(8, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? b2ZJblxo.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? b2ZJblxo.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? b2ZJblxo.getFloat(11, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? b2ZJblxo.getFloat(3, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? b2ZJblxo.getFloat(4, 0.0f) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? b2ZJblxo.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? b2ZJblxo.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? b2ZJblxo.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f = f4;
            i2 = b2ZJblxo.getColor(1, 0);
        } else {
            f = f4;
            i2 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f2 = f5;
            i3 = b2ZJblxo.getInt(6, 0);
        } else {
            f2 = f5;
            i3 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? b2ZJblxo.getFloat(5, 0.0f) : 0.0f;
        b2ZJblxo.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f12 = f6;
            if (next2 == 1) {
                f3 = f7;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f7;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray b2ZJblxo2 = n50.b2ZJblxo(resources, theme, asAttributeSet, s00.P7K7Inc8);
                boolean hasValue = b2ZJblxo2.hasValue(0);
                boolean hasValue2 = b2ZJblxo2.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = b2ZJblxo2.getColor(0, 0);
                float f13 = b2ZJblxo2.getFloat(1, 0.0f);
                b2ZJblxo2.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f13));
            }
            f6 = f12;
            f7 = f3;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public boolean MdtA4re8() {
        ColorStateList colorStateList;
        return ((Shader) this.NCTxEWno) == null && (colorStateList = (ColorStateList) this.MdtA4re8) != null && colorStateList.isStateful();
    }

    public void qoPGr6Ce() {
        rc0 rc0Var;
        ImageView imageView = (ImageView) this.NCTxEWno;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            ud.qoPGr6Ce(drawable);
        }
        if (drawable == null || (rc0Var = (rc0) this.MdtA4re8) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = j5BPOSYv.NCTxEWno;
        e30.jb9XjC4I(drawable, rc0Var, drawableState);
    }

    public void wxUZMvaN(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.NCTxEWno;
        Context context = imageView.getContext();
        int[] iArr = z00.P7K7Inc8;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        hg0.jb9XjC4I(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) Mq3SeTnW.MdtA4re8, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = ra.Ey6iv0m0(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                ud.qoPGr6Ce(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(Mq3SeTnW.sjUBp5pO(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(ud.NCTxEWno(typedArray.getInt(3, -1), null));
            }
            Mq3SeTnW.SgZGMMPL();
        } catch (Throwable th) {
            Mq3SeTnW.SgZGMMPL();
            throw th;
        }
    }

    public rpbmbhyp(ImageView imageView) {
        this.qoPGr6Ce = 0;
        this.NCTxEWno = imageView;
    }
}
