package androidx.versionedparcelable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562 {
    public Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562(int i) {
        switch (i) {
            case 2:
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 300;
                YellowLoopFloatingPointOperatorKlyjAlwPv5t4899pAB35943579541256 yellowLoopFloatingPointOperatorKlyjAlwPv5t4899pAB35943579541256 = ObsidianEngineOperatorLibraryQae7Tz16PErweD9SHB63157304758588.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new YellowLoopFloatingPointOperatorKlyjAlwPv5t4899pAB35943579541256();
                break;
            default:
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 1;
                this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = Collections.singletonList(null);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e2, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Resources resources, int i, Resources.Theme theme) {
        int next;
        int i2;
        int i3;
        float f;
        float f2;
        Object radialGradient;
        int i4;
        TypedArray obtainStyledAttributes;
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
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562(UltraBufferCacheBinaryTreeY9WH2aBu0OXPdCwKDA29209954083607.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(resources, xml, asAttributeSet, theme).getDefaultColor(), obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = WhiteFieldStateOperatorZL2LpKwnlLSAKzktga77202363327524.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i2 = 0;
            i3 = obtainAttributes.getColor(1, 0);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i6 = 1;
        int i7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? obtainAttributes.getInt(6, i2) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, 0.0f) : 0.0f;
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i6) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = WhiteFieldStateOperatorZL2LpKwnlLSAKzktga77202363327524.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i4 = 0;
                } else {
                    i4 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i4);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = obtainStyledAttributes.getColor(0, 0);
                float f11 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i6 = 1;
        }
        QuantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923 quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923 = arrayList2.size() > 0 ? new QuantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923(arrayList2, arrayList) : null;
        if (quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923 == null) {
            quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923 = z ? new QuantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923(color, color2, i3) : new QuantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923(color, i3);
        }
        if (i5 != 1) {
            if (i5 != 2) {
                radialGradient = new LinearGradient(f, f2, f5, f6, quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f7, f8, quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f7, f8, f10, quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, quantumStreamCallbackBitfieldG2IDJwKrt5Y5Mv2Kbc26916606195923.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562(0, radialGradient);
    }

    public boolean ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(long j) {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Float f, int i) {
        ((YellowLoopFloatingPointOperatorKlyjAlwPv5t4899pAB35943579541256) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(i, new SolarMeshRepositoryWildcardGUssWY7g8pYYWl1csW78559430852026(f, EmeraldStackComponentImmutableBbTvGSD5joaPO4tLCP82925958162785.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365));
    }

    public void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(long j) {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)[i2]) {
                int i3 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800--;
                return;
            }
            i2++;
        }
    }

    public void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j) {
        if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(j)) {
            return;
        }
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        long[] jArr = (long[]) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = jArr;
        }
        jArr[i] = j;
        if (i >= this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i + 1;
        }
    }

    public CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562(ConnectionResult connectionResult, int i) {
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(connectionResult);
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = connectionResult;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
    }

    public /* synthetic */ CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562(int i, Object obj) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = obj;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
    }
}
