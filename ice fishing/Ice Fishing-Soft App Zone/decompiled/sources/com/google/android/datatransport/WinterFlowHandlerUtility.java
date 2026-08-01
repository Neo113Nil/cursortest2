package com.google.android.datatransport;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowHandlerUtility {
    public static final ThreadLocal WinterFlowRouterStructure = new ThreadLocal();

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
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.lang.Object[]] */
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
    public static ColorStateList WinterFlowHookDataSource(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        char c;
        int alpha;
        int i2;
        int[] iArr;
        int i3;
        int WinterFlowConcurrencyThread;
        float f2;
        int i4;
        float cbrt;
        int i5;
        TypedValue typedValue;
        ?? r0 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = WinterFlowResolverQueue.WinterFlowRouterStructure;
                ?? obtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i6, i6);
                int resourceId = obtainAttributes.getResourceId(i6, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = WinterFlowRouterStructure;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, z);
                    int i8 = typedValue.type;
                    if (i8 < 28 || i8 > 31) {
                        try {
                            color = WinterFlowRouterStructure(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i6, -65281);
                        }
                        f = !obtainAttributes.hasValue(z) ? obtainAttributes.getFloat(z, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c2 = z;
                        float f3 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i6;
                        int i9 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i10 = i9 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i9] = attributeNameResource;
                                i9 = i10;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i9);
                        float f4 = 100.0f;
                        c = (f3 >= 0.0f || f3 > 100.0f) ? (char) 0 : c2;
                        if (f == 1.0f || c != 0) {
                            alpha = (int) ((Color.alpha(color) * f) + 0.5f);
                            if (alpha >= 0) {
                                i2 = 0;
                            } else {
                                i2 = 255;
                                if (alpha <= 255) {
                                    i2 = alpha;
                                }
                            }
                            if (c == 0) {
                                WinterFlowCacheComponent WinterFlowRouterStructure2 = WinterFlowCacheComponent.WinterFlowRouterStructure(color);
                                float f5 = WinterFlowRouterStructure2.WinterFlowRouterStructure;
                                float f6 = WinterFlowRouterStructure2.WinterFlowHookDataSource;
                                WinterFlowServerRepository winterFlowServerRepository = WinterFlowServerRepository.WinterFlowTransactionAgent;
                                if (f6 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i3 = depth2;
                                    WinterFlowConcurrencyThread = WinterFlowQuerySyntax.WinterFlowConcurrencyThread(f3);
                                } else {
                                    float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                                    float f7 = 0.0f;
                                    float f8 = f6;
                                    char c3 = c2;
                                    WinterFlowCacheComponent winterFlowCacheComponent = null;
                                    while (true) {
                                        if (Math.abs(f7 - f6) >= 0.4f) {
                                            float f9 = 1000.0f;
                                            float f10 = f4;
                                            float f11 = 0.0f;
                                            float f12 = 1000.0f;
                                            WinterFlowCacheComponent winterFlowCacheComponent2 = null;
                                            while (true) {
                                                if (Math.abs(f11 - f10) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i3 = depth2;
                                                    f2 = f4;
                                                    break;
                                                }
                                                f2 = f4;
                                                float f13 = ((f10 - f11) / 2.0f) + f11;
                                                iArr = trimStateSet;
                                                int WinterFlowArrayNetwork = WinterFlowCacheComponent.WinterFlowHookDataSource(f13, f8, min).WinterFlowArrayNetwork(WinterFlowServerRepository.WinterFlowTransactionAgent);
                                                float WinterFlowSerializerStructure = WinterFlowQuerySyntax.WinterFlowSerializerStructure(Color.red(WinterFlowArrayNetwork));
                                                float WinterFlowSerializerStructure2 = WinterFlowQuerySyntax.WinterFlowSerializerStructure(Color.green(WinterFlowArrayNetwork));
                                                float WinterFlowSerializerStructure3 = WinterFlowQuerySyntax.WinterFlowSerializerStructure(Color.blue(WinterFlowArrayNetwork));
                                                float[] fArr = WinterFlowQuerySyntax.WinterFlowVariableVersionControl[c2];
                                                float f14 = ((WinterFlowSerializerStructure3 * fArr[2]) + ((WinterFlowSerializerStructure2 * fArr[c2]) + (WinterFlowSerializerStructure * fArr[0]))) / f2;
                                                if (f14 <= 0.008856452f) {
                                                    cbrt = f14 * 903.2963f;
                                                    i4 = WinterFlowArrayNetwork;
                                                } else {
                                                    i4 = WinterFlowArrayNetwork;
                                                    cbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f3 - cbrt);
                                                if (abs < 0.2f) {
                                                    WinterFlowCacheComponent WinterFlowRouterStructure3 = WinterFlowCacheComponent.WinterFlowRouterStructure(i4);
                                                    WinterFlowCacheComponent WinterFlowHookDataSource = WinterFlowCacheComponent.WinterFlowHookDataSource(WinterFlowRouterStructure3.WinterFlowCacheManagerAgent, WinterFlowRouterStructure3.WinterFlowHookDataSource, min);
                                                    float f15 = WinterFlowRouterStructure3.WinterFlowArrayNetwork - WinterFlowHookDataSource.WinterFlowArrayNetwork;
                                                    float f16 = WinterFlowRouterStructure3.WinterFlowVariableVersionControl - WinterFlowHookDataSource.WinterFlowVariableVersionControl;
                                                    float f17 = WinterFlowRouterStructure3.WinterFlowTransactionManagerStrategy - WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy;
                                                    i3 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f12 = pow;
                                                        f9 = abs;
                                                        winterFlowCacheComponent2 = WinterFlowRouterStructure3;
                                                    }
                                                } else {
                                                    i3 = depth2;
                                                }
                                                if (f9 == 0.0f && f12 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f3) {
                                                    f11 = f13;
                                                } else {
                                                    f10 = f13;
                                                }
                                                f4 = f2;
                                                trimStateSet = iArr;
                                                depth2 = i3;
                                            }
                                            WinterFlowCacheComponent winterFlowCacheComponent3 = winterFlowCacheComponent2;
                                            if (c3 == 0) {
                                                if (winterFlowCacheComponent3 == null) {
                                                    f6 = f8;
                                                } else {
                                                    winterFlowCacheComponent = winterFlowCacheComponent3;
                                                    f7 = f8;
                                                }
                                                f8 = ((f6 - f7) / 2.0f) + f7;
                                                f4 = f2;
                                                trimStateSet = iArr;
                                                depth2 = i3;
                                            } else {
                                                if (winterFlowCacheComponent3 != null) {
                                                    WinterFlowConcurrencyThread = winterFlowCacheComponent3.WinterFlowArrayNetwork(winterFlowServerRepository);
                                                    break;
                                                }
                                                f8 = ((f6 - f7) / 2.0f) + f7;
                                                f4 = f2;
                                                trimStateSet = iArr;
                                                depth2 = i3;
                                                c3 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i3 = depth2;
                                            WinterFlowConcurrencyThread = winterFlowCacheComponent == null ? WinterFlowQuerySyntax.WinterFlowConcurrencyThread(f3) : winterFlowCacheComponent.WinterFlowArrayNetwork(winterFlowServerRepository);
                                        }
                                    }
                                }
                                color = WinterFlowConcurrencyThread;
                            } else {
                                iArr = trimStateSet;
                                i3 = depth2;
                            }
                            color = (16777215 & color) | (i2 << 24);
                        } else {
                            iArr = trimStateSet;
                            i3 = depth2;
                        }
                        i5 = i7 + 1;
                        if (i5 > iArr3.length) {
                            int[] iArr6 = new int[i7 <= 4 ? 8 : i7 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i7);
                            iArr3 = iArr6;
                        }
                        iArr3[i7] = color;
                        if (i5 > iArr2.length) {
                            ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i7 > 4 ? i7 * 2 : 8);
                            System.arraycopy(iArr2, 0, r1, 0, i7);
                            iArr2 = r1;
                        }
                        iArr2[i7] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i7 = i5;
                        z = c2;
                        depth2 = i3;
                        i6 = 0;
                        r0 = resources;
                    }
                }
                color = obtainAttributes.getColor(i6, -65281);
                if (!obtainAttributes.hasValue(z)) {
                }
                char c22 = z;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i6;
                int i92 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i92);
                float f42 = 100.0f;
                if (f3 >= 0.0f) {
                }
                if (f == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f) + 0.5f);
                if (alpha >= 0) {
                }
                if (c == 0) {
                }
                color = (16777215 & color) | (i2 << 24);
                i5 = i7 + 1;
                if (i5 > iArr3.length) {
                }
                iArr3[i7] = color;
                if (i5 > iArr2.length) {
                }
                iArr2[i7] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i7 = i5;
                z = c22;
                depth2 = i3;
                i6 = 0;
                r0 = resources;
            } else {
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z = z;
                depth2 = depth2;
                i6 = 0;
            }
        }
        int[] iArr7 = new int[i7];
        int[][] iArr8 = new int[i7][];
        System.arraycopy(iArr3, 0, iArr7, 0, i7);
        System.arraycopy(iArr2, 0, iArr8, 0, i7);
        return new ColorStateList(iArr8, iArr7);
    }

    public static ColorStateList WinterFlowRouterStructure(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return WinterFlowHookDataSource(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
