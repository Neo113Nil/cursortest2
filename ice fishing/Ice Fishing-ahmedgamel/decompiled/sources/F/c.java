package F;

import a.AbstractC0422a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f852a = new ThreadLocal();

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
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
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
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f3;
        int attributeCount;
        int i;
        char c9;
        int[] iArr;
        int i6;
        int d2;
        float f9;
        int i9;
        float cbrt;
        int i10;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z3 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = C.a.f239a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i11, i11);
                int resourceId = obtainAttributes.getResourceId(i11, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f852a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z3);
                    int i13 = typedValue.type;
                    if (i13 < 28 || i13 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i11, -65281);
                        }
                        f3 = !obtainAttributes.hasValue(z3) ? obtainAttributes.getFloat(z3, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c10 = z3;
                        float f10 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i11;
                        int i14 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C5275R.attr.alpha && attributeNameResource != C5275R.attr.lStar) {
                                int i15 = i14 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i14] = attributeNameResource;
                                i14 = i15;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i14);
                        float f11 = 100.0f;
                        c9 = (f10 >= 0.0f || f10 > 100.0f) ? (char) 0 : c10;
                        if (f3 == 1.0f || c9 != 0) {
                            int h9 = AbstractC0422a.h((int) ((Color.alpha(color) * f3) + 0.5f), 0, com.anythink.basead.exoplayer.k.p.f8473b);
                            if (c9 == 0) {
                                a a9 = a.a(color);
                                r rVar = r.f882k;
                                float f12 = a9.f840b;
                                if (f12 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i6 = depth2;
                                    d2 = b.d(f10);
                                } else {
                                    float f13 = a9.f839a;
                                    float min = f13 < 0.0f ? 0.0f : Math.min(360.0f, f13);
                                    float f14 = 0.0f;
                                    float f15 = f12;
                                    char c11 = c10;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f14 - f12) >= 0.4f) {
                                            float f16 = 1000.0f;
                                            float f17 = f11;
                                            float f18 = 0.0f;
                                            float f19 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f18 - f17) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i6 = depth2;
                                                    f9 = f11;
                                                    break;
                                                }
                                                f9 = f11;
                                                float f20 = ((f17 - f18) / 2.0f) + f18;
                                                iArr = trimStateSet;
                                                int c12 = a.b(f20, f15, min).c(r.f882k);
                                                float e9 = b.e(Color.red(c12));
                                                float e10 = b.e(Color.green(c12));
                                                float e11 = b.e(Color.blue(c12));
                                                float[] fArr = b.f848d[c10];
                                                float f21 = ((e11 * fArr[2]) + ((e10 * fArr[c10]) + (e9 * fArr[0]))) / f9;
                                                if (f21 <= 0.008856452f) {
                                                    cbrt = f21 * 903.2963f;
                                                    i9 = c12;
                                                } else {
                                                    i9 = c12;
                                                    cbrt = (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f10 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a10 = a.a(i9);
                                                    a b9 = a.b(a10.f841c, a10.f840b, min);
                                                    float f22 = a10.f842d - b9.f842d;
                                                    float f23 = a10.f843e - b9.f843e;
                                                    float f24 = a10.f844f - b9.f844f;
                                                    i6 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f19 = pow;
                                                        f16 = abs;
                                                        aVar2 = a10;
                                                    }
                                                } else {
                                                    i6 = depth2;
                                                }
                                                if (f16 == 0.0f && f19 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f10) {
                                                    f18 = f20;
                                                } else {
                                                    f17 = f20;
                                                }
                                                f11 = f9;
                                                trimStateSet = iArr;
                                                depth2 = i6;
                                            }
                                            a aVar3 = aVar2;
                                            if (c11 == 0) {
                                                if (aVar3 == null) {
                                                    f12 = f15;
                                                } else {
                                                    aVar = aVar3;
                                                    f14 = f15;
                                                }
                                                f15 = ((f12 - f14) / 2.0f) + f14;
                                                f11 = f9;
                                                trimStateSet = iArr;
                                                depth2 = i6;
                                            } else {
                                                if (aVar3 != null) {
                                                    d2 = aVar3.c(rVar);
                                                    break;
                                                }
                                                f15 = ((f12 - f14) / 2.0f) + f14;
                                                f11 = f9;
                                                trimStateSet = iArr;
                                                depth2 = i6;
                                                c11 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i6 = depth2;
                                            d2 = aVar == null ? b.d(f10) : aVar.c(rVar);
                                        }
                                    }
                                }
                                color = d2;
                            } else {
                                iArr = trimStateSet;
                                i6 = depth2;
                            }
                            color = (16777215 & color) | (h9 << 24);
                        } else {
                            iArr = trimStateSet;
                            i6 = depth2;
                        }
                        i10 = i12 + 1;
                        if (i10 > iArr3.length) {
                            int[] iArr6 = new int[i12 <= 4 ? 8 : i12 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i12);
                            iArr3 = iArr6;
                        }
                        iArr3[i12] = color;
                        if (i10 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i12 > 4 ? i12 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i12);
                            iArr2 = r12;
                        }
                        iArr2[i12] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i12 = i10;
                        z3 = c10;
                        depth2 = i6;
                        i11 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i11, -65281);
                if (!obtainAttributes.hasValue(z3)) {
                }
                char c102 = z3;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i11;
                int i142 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i142);
                float f112 = 100.0f;
                if (f10 >= 0.0f) {
                }
                if (f3 == 1.0f) {
                }
                int h92 = AbstractC0422a.h((int) ((Color.alpha(color) * f3) + 0.5f), 0, com.anythink.basead.exoplayer.k.p.f8473b);
                if (c9 == 0) {
                }
                color = (16777215 & color) | (h92 << 24);
                i10 = i12 + 1;
                if (i10 > iArr3.length) {
                }
                iArr3[i12] = color;
                if (i10 > iArr2.length) {
                }
                iArr2[i12] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i12 = i10;
                z3 = c102;
                depth2 = i6;
                i11 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z3 = z3;
                depth2 = depth2;
                i11 = 0;
            }
        }
        int[] iArr7 = new int[i12];
        int[][] iArr8 = new int[i12][];
        System.arraycopy(iArr3, 0, iArr7, 0, i12);
        System.arraycopy(iArr2, 0, iArr8, 0, i12);
        return new ColorStateList(iArr8, iArr7);
    }
}
