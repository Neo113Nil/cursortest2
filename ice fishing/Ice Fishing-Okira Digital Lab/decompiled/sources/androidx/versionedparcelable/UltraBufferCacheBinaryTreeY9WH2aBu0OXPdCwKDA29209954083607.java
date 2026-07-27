package androidx.versionedparcelable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.icecatchpuzzle.puzzleicecatch.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class UltraBufferCacheBinaryTreeY9WH2aBu0OXPdCwKDA29209954083607 {
    public static final ThreadLocal ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new ThreadLocal();

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
    public static ColorStateList AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
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
        int IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900;
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
                int[] iArr4 = WhiteFieldStateOperatorZL2LpKwnlLSAKzktga77202363327524.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                ?? obtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i6, i6);
                int resourceId = obtainAttributes.getResourceId(i6, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
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
                            color = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(r0, r0.getXml(resourceId), theme2).getDefaultColor();
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
                                MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(color);
                                float f5 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                float f6 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                                XenoGridComponentCryptographyHsvyTLncOvSVw7Ofkf70395602405959 xenoGridComponentCryptographyHsvyTLncOvSVw7Ofkf70395602405959 = XenoGridComponentCryptographyHsvyTLncOvSVw7Ofkf70395602405959.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                                if (f6 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i3 = depth2;
                                    IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900 = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(f3);
                                } else {
                                    float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                                    float f7 = 0.0f;
                                    float f8 = f6;
                                    char c3 = c2;
                                    MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 = null;
                                    while (true) {
                                        if (Math.abs(f7 - f6) >= 0.4f) {
                                            float f9 = 1000.0f;
                                            float f10 = f4;
                                            float f11 = 0.0f;
                                            float f12 = 1000.0f;
                                            MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252092 = null;
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
                                                int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(f13, f8, min).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(XenoGridComponentCryptographyHsvyTLncOvSVw7Ofkf70395602405959.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050);
                                                float NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(Color.red(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
                                                float NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972522 = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(Color.green(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
                                                float NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972523 = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(Color.blue(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
                                                float[] fArr = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170[c2];
                                                float f14 = ((NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972523 * fArr[2]) + ((NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972522 * fArr[c2]) + (NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 * fArr[0]))) / f2;
                                                if (f14 <= 0.008856452f) {
                                                    cbrt = f14 * 903.2963f;
                                                    i4 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                                                } else {
                                                    i4 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                                                    cbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f3 - cbrt);
                                                if (abs < 0.2f) {
                                                    MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003 = MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i4);
                                                    MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, min);
                                                    float f15 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 - AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                                                    float f16 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 - AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                                                    float f17 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 - AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                                                    i3 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f12 = pow;
                                                        f9 = abs;
                                                        mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252092 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003;
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
                                            MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093 = mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252092;
                                            if (c3 == 0) {
                                                if (mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093 == null) {
                                                    f6 = f8;
                                                } else {
                                                    mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 = mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093;
                                                    f7 = f8;
                                                }
                                                f8 = ((f6 - f7) / 2.0f) + f7;
                                                f4 = f2;
                                                trimStateSet = iArr;
                                                depth2 = i3;
                                            } else {
                                                if (mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093 != null) {
                                                    IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900 = mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(xenoGridComponentCryptographyHsvyTLncOvSVw7Ofkf70395602405959);
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
                                            IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900 = mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 == null ? BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(f3) : mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(xenoGridComponentCryptographyHsvyTLncOvSVw7Ofkf70395602405959);
                                        }
                                    }
                                }
                                color = IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900;
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

    public static ColorStateList ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
