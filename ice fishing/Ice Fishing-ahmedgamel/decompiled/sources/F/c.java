package F;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f915a = new ThreadLocal();

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
        float f2;
        int attributeCount;
        int i;
        char c9;
        int[] iArr;
        int i4;
        int d9;
        float f9;
        int i6;
        float cbrt;
        int i9;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z6 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z6 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = C.a.f305a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i10, i10);
                int resourceId = obtainAttributes.getResourceId(i10, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f915a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z6);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i10, -65281);
                        }
                        f2 = !obtainAttributes.hasValue(z6) ? obtainAttributes.getFloat(z6, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c10 = z6;
                        float f10 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i10;
                        int i13 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C5248R.attr.alpha && attributeNameResource != C5248R.attr.lStar) {
                                int i14 = i13 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i13] = attributeNameResource;
                                i13 = i14;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i13);
                        float f11 = 100.0f;
                        c9 = (f10 >= 0.0f || f10 > 100.0f) ? (char) 0 : c10;
                        if (f2 == 1.0f || c9 != 0) {
                            int d10 = S0.f.d((int) ((Color.alpha(color) * f2) + 0.5f), 0, com.anythink.basead.exoplayer.k.p.f9259b);
                            if (c9 == 0) {
                                a a9 = a.a(color);
                                r rVar = r.f945k;
                                float f12 = a9.f903b;
                                if (f12 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i4 = depth2;
                                    d9 = b.d(f10);
                                } else {
                                    float f13 = a9.f902a;
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
                                                    i4 = depth2;
                                                    f9 = f11;
                                                    break;
                                                }
                                                f9 = f11;
                                                float f20 = ((f17 - f18) / 2.0f) + f18;
                                                iArr = trimStateSet;
                                                int c12 = a.b(f20, f15, min).c(r.f945k);
                                                float e9 = b.e(Color.red(c12));
                                                float e10 = b.e(Color.green(c12));
                                                float e11 = b.e(Color.blue(c12));
                                                float[] fArr = b.f911d[c10];
                                                float f21 = ((e11 * fArr[2]) + ((e10 * fArr[c10]) + (e9 * fArr[0]))) / f9;
                                                if (f21 <= 0.008856452f) {
                                                    cbrt = f21 * 903.2963f;
                                                    i6 = c12;
                                                } else {
                                                    i6 = c12;
                                                    cbrt = (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f10 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a10 = a.a(i6);
                                                    a b9 = a.b(a10.f904c, a10.f903b, min);
                                                    float f22 = a10.f905d - b9.f905d;
                                                    float f23 = a10.f906e - b9.f906e;
                                                    float f24 = a10.f907f - b9.f907f;
                                                    i4 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f19 = pow;
                                                        f16 = abs;
                                                        aVar2 = a10;
                                                    }
                                                } else {
                                                    i4 = depth2;
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
                                                depth2 = i4;
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
                                                depth2 = i4;
                                            } else {
                                                if (aVar3 != null) {
                                                    d9 = aVar3.c(rVar);
                                                    break;
                                                }
                                                f15 = ((f12 - f14) / 2.0f) + f14;
                                                f11 = f9;
                                                trimStateSet = iArr;
                                                depth2 = i4;
                                                c11 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i4 = depth2;
                                            d9 = aVar == null ? b.d(f10) : aVar.c(rVar);
                                        }
                                    }
                                }
                                color = d9;
                            } else {
                                iArr = trimStateSet;
                                i4 = depth2;
                            }
                            color = (16777215 & color) | (d10 << 24);
                        } else {
                            iArr = trimStateSet;
                            i4 = depth2;
                        }
                        i9 = i11 + 1;
                        if (i9 > iArr3.length) {
                            int[] iArr6 = new int[i11 <= 4 ? 8 : i11 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i11);
                            iArr3 = iArr6;
                        }
                        iArr3[i11] = color;
                        if (i9 > iArr2.length) {
                            ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                            System.arraycopy(iArr2, 0, r1, 0, i11);
                            iArr2 = r1;
                        }
                        iArr2[i11] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i11 = i9;
                        z6 = c10;
                        depth2 = i4;
                        i10 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i10, -65281);
                if (!obtainAttributes.hasValue(z6)) {
                }
                char c102 = z6;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i10;
                int i132 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i132);
                float f112 = 100.0f;
                if (f10 >= 0.0f) {
                }
                if (f2 == 1.0f) {
                }
                int d102 = S0.f.d((int) ((Color.alpha(color) * f2) + 0.5f), 0, com.anythink.basead.exoplayer.k.p.f9259b);
                if (c9 == 0) {
                }
                color = (16777215 & color) | (d102 << 24);
                i9 = i11 + 1;
                if (i9 > iArr3.length) {
                }
                iArr3[i11] = color;
                if (i9 > iArr2.length) {
                }
                iArr2[i11] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i11 = i9;
                z6 = c102;
                depth2 = i4;
                i10 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z6 = z6;
                depth2 = depth2;
                i10 = 0;
            }
        }
        int[] iArr7 = new int[i11];
        int[][] iArr8 = new int[i11][];
        System.arraycopy(iArr3, 0, iArr7, 0, i11);
        System.arraycopy(iArr2, 0, iArr8, 0, i11);
        return new ColorStateList(iArr8, iArr7);
    }
}
