package com.gamericefishpro.space.c2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import com.gamericefishpro.space.e4.q;
import com.gamericefishpro.space.vd.m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements q {
    public int d;
    public Object e;

    public /* synthetic */ c(int i, Object obj) {
        this.e = obj;
        this.d = i;
    }

    public static c d(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        com.gamericefishpro.space.u6.c cVar;
        int i2;
        int i3;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
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
                ColorStateList colorStateListB = com.gamericefishpro.space.t3.c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new c(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayF = com.gamericefishpro.space.t3.b.f(resources, theme, attributeSetAsAttributeSet, com.gamericefishpro.space.q3.a.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayF.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayF.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayF.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayF.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayF.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayF.getFloat(4, 0.0f) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", m.EVENT_TYPE_KEY) != null ? typedArrayF.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayF.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayF.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayF.getColor(1, 0) : 0;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayF.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayF.getFloat(5, 0.0f) : 0.0f;
        typedArrayF.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayF2 = com.gamericefishpro.space.t3.b.f(resources, theme, attributeSetAsAttributeSet, com.gamericefishpro.space.q3.a.f);
                boolean zHasValue = typedArrayF2.hasValue(0);
                boolean zHasValue2 = typedArrayF2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayF2.getColor(0, 0);
                float f11 = typedArrayF2.getFloat(1, 0.0f);
                typedArrayF2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        if (arrayList2.size() > 0) {
            cVar = new com.gamericefishpro.space.u6.c();
            int size = arrayList2.size();
            cVar.d = new int[size];
            cVar.e = new float[size];
            for (int i6 = 0; i6 < size; i6++) {
                ((int[]) cVar.d)[i6] = ((Integer) arrayList2.get(i6)).intValue();
                ((float[]) cVar.e)[i6] = ((Float) arrayList.get(i6)).floatValue();
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            i3 = 1;
            i2 = 2;
        } else if (z) {
            cVar = new com.gamericefishpro.space.u6.c();
            cVar.d = new int[]{color, color2, color3};
            cVar.e = new float[]{0.0f, 0.5f, 1.0f};
            i3 = 1;
            i2 = 2;
        } else {
            cVar = new com.gamericefishpro.space.u6.c();
            cVar.d = new int[]{color, color3};
            i2 = 2;
            cVar.e = new float[]{0.0f, 1.0f};
            i3 = 1;
        }
        if (i4 == i3) {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f7, f8, f10, (int[]) cVar.d, (float[]) cVar.e, i5 != 1 ? i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i4 != i2) {
            radialGradient = new LinearGradient(f3, f4, f, f2, (int[]) cVar.d, (float[]) cVar.e, i5 != i3 ? i5 != i2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            radialGradient = new SweepGradient(f7, f8, (int[]) cVar.d, (float[]) cVar.e);
        }
        return new c(radialGradient, null, 0);
    }

    public void a(long j) {
        if (b(j)) {
            return;
        }
        int i = this.d;
        long[] jArrCopyOf = (long[]) this.e;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.e = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.d) {
            this.d = i + 1;
        }
    }

    public boolean b(long j) {
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.e)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.e4.q
    public boolean c(View view) {
        ((BottomSheetBehavior) this.e).B(this.d);
        return true;
    }

    public void e(long j) {
        int i = this.d;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.e)[i2]) {
                int i3 = this.d - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.e;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.d--;
                return;
            }
            i2++;
        }
    }

    public c(Shader shader, ColorStateList colorStateList, int i) {
        this.e = shader;
        this.d = i;
    }
}
