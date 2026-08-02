package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class xgc {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, theme, asAttributeSet, xmlResourceParser);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a6  */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        float f2;
        boolean z;
        int i2;
        Resources resources2 = resources;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z2 = true;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = j4i0.ColorStateListItem;
                TypedArray obtainAttributes = theme == null ? resources2.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i3, i3);
                int resourceId = obtainAttributes.getResourceId(j4i0.ColorStateListItem_android_color, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue = (TypedValue) threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources2.getValue(resourceId, typedValue, z2);
                    int i5 = typedValue.type;
                    if (i5 < 28 || i5 > 31) {
                        try {
                            color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(j4i0.ColorStateListItem_android_color, -65281);
                        }
                        float f3 = 1.0f;
                        f = !obtainAttributes.hasValue(j4i0.ColorStateListItem_android_alpha) ? obtainAttributes.getFloat(j4i0.ColorStateListItem_android_alpha, 1.0f) : obtainAttributes.hasValue(j4i0.ColorStateListItem_alpha) ? obtainAttributes.getFloat(j4i0.ColorStateListItem_alpha, 1.0f) : 1.0f;
                        float f4 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(j4i0.ColorStateListItem_android_lStar)) ? obtainAttributes.getFloat(j4i0.ColorStateListItem_lStar, -1.0f) : obtainAttributes.getFloat(j4i0.ColorStateListItem_android_lStar, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr4 = new int[attributeCount];
                        int i6 = i3;
                        i = i6;
                        while (i < attributeCount) {
                            float f5 = f3;
                            int attributeNameResource = attributeSet.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != cog0.alpha && attributeNameResource != cog0.lStar) {
                                int i7 = i6 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr4[i6] = attributeNameResource;
                                i6 = i7;
                            }
                            i++;
                            f3 = f5;
                        }
                        f2 = f3;
                        int[] trimStateSet = StateSet.trimStateSet(iArr4, i6);
                        z = f4 < 0.0f && f4 <= 100.0f;
                        if (f == f2 || z) {
                            int k = sb2.k((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                            if (z) {
                                zl7 a2 = zl7.a(color);
                                color = zl7.e(a2.d(), a2.c(), f4);
                            }
                            color = (16777215 & color) | (k << 24);
                        }
                        i2 = i4 + 1;
                        if (i2 > iArr2.length) {
                            int[] iArr5 = new int[i4 <= 4 ? 8 : i4 * 2];
                            System.arraycopy(iArr2, 0, iArr5, 0, i4);
                            iArr2 = iArr5;
                        }
                        iArr2[i4] = color;
                        if (i2 > iArr.length) {
                            ?? r7 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i4 > 4 ? i4 * 2 : 8);
                            System.arraycopy(iArr, 0, r7, 0, i4);
                            iArr = r7;
                        }
                        iArr[i4] = trimStateSet;
                        iArr = iArr;
                        resources2 = resources;
                        i4 = i2;
                    }
                }
                color = obtainAttributes.getColor(j4i0.ColorStateListItem_android_color, -65281);
                float f32 = 1.0f;
                if (!obtainAttributes.hasValue(j4i0.ColorStateListItem_android_alpha)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr42 = new int[attributeCount];
                int i62 = i3;
                i = i62;
                while (i < attributeCount) {
                }
                f2 = f32;
                int[] trimStateSet2 = StateSet.trimStateSet(iArr42, i62);
                if (f4 < 0.0f) {
                }
                if (f == f2) {
                }
                int k2 = sb2.k((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                if (z) {
                }
                color = (16777215 & color) | (k2 << 24);
                i2 = i4 + 1;
                if (i2 > iArr2.length) {
                }
                iArr2[i4] = color;
                if (i2 > iArr.length) {
                }
                iArr[i4] = trimStateSet2;
                iArr = iArr;
                resources2 = resources;
                i4 = i2;
            } else {
                resources2 = resources;
            }
            z2 = true;
            i3 = 0;
        }
        int[] iArr6 = new int[i4];
        int[][] iArr7 = new int[i4][];
        System.arraycopy(iArr2, 0, iArr6, 0, i4);
        System.arraycopy(iArr, 0, iArr7, 0, i4);
        return new ColorStateList(iArr7, iArr6);
    }
}
