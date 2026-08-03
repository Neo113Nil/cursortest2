package z2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.fortheloss.st.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f9075a = new ThreadLocal();

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
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0139  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f10;
        int attributeCount;
        int i10;
        char c3;
        int alpha;
        int i11;
        int[] iArr;
        int i12;
        int c7;
        float f11;
        int i13;
        float cbrt;
        int i14;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = w2.a.f7641a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i15, i15);
                int resourceId = obtainAttributes.getResourceId(i15, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f9075a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z10);
                    int i17 = typedValue.type;
                    if (i17 < 28 || i17 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i15, -65281);
                        }
                        f10 = !obtainAttributes.hasValue(z10) ? obtainAttributes.getFloat(z10, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c10 = z10;
                        float f12 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i10 = i15;
                        int i18 = i10;
                        while (i10 < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i10);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i19 = i18 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i10, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i18] = attributeNameResource;
                                i18 = i19;
                            }
                            i10++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i18);
                        float f13 = 100.0f;
                        c3 = (f12 >= 0.0f || f12 > 100.0f) ? (char) 0 : c10;
                        if (f10 == 1.0f || c3 != 0) {
                            alpha = (int) ((Color.alpha(color) * f10) + 0.5f);
                            if (alpha >= 0) {
                                i11 = 0;
                            } else {
                                i11 = 255;
                                if (alpha <= 255) {
                                    i11 = alpha;
                                }
                            }
                            if (c3 == 0) {
                                a a6 = a.a(color);
                                float f14 = a6.f9065a;
                                float f15 = a6.f9066b;
                                i iVar = i.f9088k;
                                if (f15 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i12 = depth2;
                                    c7 = b.c(f12);
                                } else {
                                    float min = f14 < 0.0f ? 0.0f : Math.min(360.0f, f14);
                                    float f16 = 0.0f;
                                    float f17 = f15;
                                    char c11 = c10;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f16 - f15) >= 0.4f) {
                                            float f18 = 1000.0f;
                                            float f19 = f13;
                                            float f20 = 0.0f;
                                            float f21 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f20 - f19) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i12 = depth2;
                                                    f11 = f13;
                                                    break;
                                                }
                                                f11 = f13;
                                                float f22 = ((f19 - f20) / 2.0f) + f20;
                                                iArr = trimStateSet;
                                                int c12 = a.b(f22, f17, min).c(i.f9088k);
                                                float d10 = b.d(Color.red(c12));
                                                float d11 = b.d(Color.green(c12));
                                                float d12 = b.d(Color.blue(c12));
                                                float[] fArr = b.f9074d[c10];
                                                float f23 = ((d12 * fArr[2]) + ((d11 * fArr[c10]) + (d10 * fArr[0]))) / f11;
                                                if (f23 <= 0.008856452f) {
                                                    cbrt = f23 * 903.2963f;
                                                    i13 = c12;
                                                } else {
                                                    i13 = c12;
                                                    cbrt = (((float) Math.cbrt(f23)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f12 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a8 = a.a(i13);
                                                    a b2 = a.b(a8.f9067c, a8.f9066b, min);
                                                    float f24 = a8.f9068d - b2.f9068d;
                                                    float f25 = a8.f9069e - b2.f9069e;
                                                    float f26 = a8.f9070f - b2.f9070f;
                                                    i12 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f21 = pow;
                                                        f18 = abs;
                                                        aVar2 = a8;
                                                    }
                                                } else {
                                                    i12 = depth2;
                                                }
                                                if (f18 == 0.0f && f21 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f12) {
                                                    f20 = f22;
                                                } else {
                                                    f19 = f22;
                                                }
                                                f13 = f11;
                                                trimStateSet = iArr;
                                                depth2 = i12;
                                            }
                                            a aVar3 = aVar2;
                                            if (c11 == 0) {
                                                if (aVar3 == null) {
                                                    f15 = f17;
                                                } else {
                                                    aVar = aVar3;
                                                    f16 = f17;
                                                }
                                                f17 = ((f15 - f16) / 2.0f) + f16;
                                                f13 = f11;
                                                trimStateSet = iArr;
                                                depth2 = i12;
                                            } else {
                                                if (aVar3 != null) {
                                                    c7 = aVar3.c(iVar);
                                                    break;
                                                }
                                                f17 = ((f15 - f16) / 2.0f) + f16;
                                                f13 = f11;
                                                trimStateSet = iArr;
                                                depth2 = i12;
                                                c11 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i12 = depth2;
                                            c7 = aVar == null ? b.c(f12) : aVar.c(iVar);
                                        }
                                    }
                                }
                                color = c7;
                            } else {
                                iArr = trimStateSet;
                                i12 = depth2;
                            }
                            color = (16777215 & color) | (i11 << 24);
                        } else {
                            iArr = trimStateSet;
                            i12 = depth2;
                        }
                        i14 = i16 + 1;
                        if (i14 > iArr3.length) {
                            int[] iArr6 = new int[i16 <= 4 ? 8 : i16 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i16);
                            iArr3 = iArr6;
                        }
                        iArr3[i16] = color;
                        if (i14 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i16 > 4 ? i16 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i16);
                            iArr2 = r12;
                        }
                        iArr2[i16] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i16 = i14;
                        z10 = c10;
                        depth2 = i12;
                        i15 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i15, -65281);
                if (!obtainAttributes.hasValue(z10)) {
                }
                char c102 = z10;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i10 = i15;
                int i182 = i10;
                while (i10 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i182);
                float f132 = 100.0f;
                if (f12 >= 0.0f) {
                }
                if (f10 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f10) + 0.5f);
                if (alpha >= 0) {
                }
                if (c3 == 0) {
                }
                color = (16777215 & color) | (i11 << 24);
                i14 = i16 + 1;
                if (i14 > iArr3.length) {
                }
                iArr3[i16] = color;
                if (i14 > iArr2.length) {
                }
                iArr2[i16] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i16 = i14;
                z10 = c102;
                depth2 = i12;
                i15 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z10 = z10;
                depth2 = depth2;
                i15 = 0;
            }
        }
        int[] iArr7 = new int[i16];
        int[][] iArr8 = new int[i16][];
        System.arraycopy(iArr3, 0, iArr7, 0, i16);
        System.arraycopy(iArr2, 0, iArr8, 0, i16);
        return new ColorStateList(iArr8, iArr7);
    }
}
