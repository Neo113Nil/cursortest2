package androidx.versionedparcelable;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class QuantumStreamMutexTransportEBMtyJRZ8mVY0jgB7Q92733453458509 extends AxiomCoreMonitorWorkerEpOThAFmoCLxMwibdJ72468267872406 {
    public static int CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static final boolean CosmicForgePrimitiveAdapterV5FJxZ6EdJ6L6FTiv319575220407660(CharSequence charSequence, int i, String str, int i2, int i3, boolean z) {
        int i4;
        char upperCase;
        char upperCase2;
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= str.length() - i3) {
            for (0; i4 < i3; i4 + 1) {
                char charAt = charSequence.charAt(i + i4);
                char charAt2 = str.charAt(i2 + i4);
                i4 = (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i4 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static String CrimsonRouteSyntaxAsyncObOdDHEEcC0VRkK8sC88172832557720(String str, int i) {
        str.getClass();
        if (i < 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170("Requested character count ", i, " is less than zero.");
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static /* synthetic */ int CrimsonRouteWorkerCacheKhpKboftN2D80QzJPW23993420543245(int i, String str, String str2, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359(0, str, str2, z);
    }

    public static final List GoldenVectorBootstrapTokenJNQ3AneRNCi6XvgcKj43332915784329(String str) {
        AxiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455 axiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455 = new AxiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455(str);
        if (!axiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455.hasNext()) {
            return GoldenVectorLoaderRegistryZGq5hhbhblpJ1mpgXV59878749628960.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        }
        Object next = axiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455.next();
        if (!axiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455.hasNext()) {
            return ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (axiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455.hasNext()) {
            arrayList.add(axiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455.next());
        }
        return arrayList;
    }

    public static boolean JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            if (!RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder PhotonFrameRouterExceptionQjAvXXEXJ8u2ZI6OgX41663540814107(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i2, i, ") is less than start index (", "End index (");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final int RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359(int i, String str, String str2, boolean z) {
        String str3;
        String str4;
        boolean z2;
        boolean regionMatches;
        if (!z) {
            return str.indexOf(str2, i);
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        int i2 = new DragonRouteFunctionFilterVYkGtIFe9rTqxUqnzp24914659461482(i, length, 1).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (true) {
            int length3 = str2.length();
            if (z) {
                str3 = str;
                str4 = str2;
                z2 = z;
                regionMatches = str4.regionMatches(z2, 0, str3, i3, length3);
            } else {
                regionMatches = str2.regionMatches(0, str, i3, length3);
                str3 = str;
                str4 = str2;
                z2 = z;
            }
            if (regionMatches) {
                return i3;
            }
            if (i3 == i2) {
                return -1;
            }
            i3++;
            str2 = str4;
            z = z2;
            str = str3;
        }
    }

    public static boolean TitanCloudCacheAbstractionTMResqLylzdSk6HF7m13862104943550(CharSequence charSequence, char c) {
        charSequence.getClass();
        return CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286(charSequence, c, 0, 2) >= 0;
    }

    public static String VertexLinkPrefixEncryptionS88BTFa1Wv6v7n9U5W75564685177482(String str, String str2) {
        int CrimsonRouteWorkerCacheKhpKboftN2D80QzJPW23993420543245 = CrimsonRouteWorkerCacheKhpKboftN2D80QzJPW23993420543245(6, str, str2, false);
        return CrimsonRouteWorkerCacheKhpKboftN2D80QzJPW23993420543245 == -1 ? str : str.substring(str2.length() + CrimsonRouteWorkerCacheKhpKboftN2D80QzJPW23993420543245, str.length());
    }

    public static CharSequence YellowLoopSerializationStorageXaJURe2ssvFyfOvhoO67447171248106(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216 = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(str.charAt(!z ? i : length));
            if (z) {
                if (!KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216) {
                    break;
                }
                length--;
            } else if (KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
