package android.content.Context;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterNestedScrollViewTurboPrime1228 {
    public static final char[] FrostHunterAlphaAnimationNeoCosmos5761;

    static {
        char[] cArr = new char[80];
        FrostHunterAlphaAnimationNeoCosmos5761 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(FrostHunterAlphaAnimationNeoCosmos5761, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0192, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a7, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bd, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterBundlePulseFusionHero2475(FrostHunterSharedFlowTitaniumHeroAurora7367 frostHunterSharedFlowTitaniumHeroAurora7367, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = frostHunterSharedFlowTitaniumHeroAurora7367.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, i, substring.substring(0, substring.length() - 4), FrostHunterSharedFlowTitaniumHeroAurora7367.FrostHunterLifecycleBlazeGammaElite2889(method2, frostHunterSharedFlowTitaniumHeroAurora7367, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, i, substring.substring(0, substring.length() - 3), FrostHunterSharedFlowTitaniumHeroAurora7367.FrostHunterLifecycleBlazeGammaElite2889(method, frostHunterSharedFlowTitaniumHeroAurora7367, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterSharedFlowTitaniumHeroAurora7367.FrostHunterLifecycleBlazeGammaElite2889(method4, frostHunterSharedFlowTitaniumHeroAurora7367, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (FrostHunterLifecycleBlazeGammaElite2889 instanceof Boolean) {
                            equals = !((Boolean) FrostHunterLifecycleBlazeGammaElite2889).booleanValue();
                        } else if (!(FrostHunterLifecycleBlazeGammaElite2889 instanceof Integer)) {
                            if (!(FrostHunterLifecycleBlazeGammaElite2889 instanceof Float)) {
                                if (!(FrostHunterLifecycleBlazeGammaElite2889 instanceof Double)) {
                                    equals = FrostHunterLifecycleBlazeGammaElite2889 instanceof String ? FrostHunterLifecycleBlazeGammaElite2889.equals("") : FrostHunterLifecycleBlazeGammaElite2889 instanceof FrostHunterManifestEclipseGammaTitanium1788 ? FrostHunterLifecycleBlazeGammaElite2889.equals(FrostHunterManifestEclipseGammaTitanium1788.FrostHunterAlertDialogAuroraDelta3200) : !(FrostHunterLifecycleBlazeGammaElite2889 instanceof FrostHunterStateNeoCyberShadow9514) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) FrostHunterSharedFlowTitaniumHeroAurora7367.FrostHunterLifecycleBlazeGammaElite2889(method5, frostHunterSharedFlowTitaniumHeroAurora7367, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, i, substring, FrostHunterLifecycleBlazeGammaElite2889);
                    }
                }
            }
            i2 = i3;
        }
        FrostHunterRotateDrawableCosmosHyper6619 frostHunterRotateDrawableCosmosHyper6619 = frostHunterSharedFlowTitaniumHeroAurora7367.unknownFields;
        if (frostHunterRotateDrawableCosmosHyper6619 != null) {
            for (int i5 = 0; i5 < frostHunterRotateDrawableCosmosHyper6619.FrostHunterAlphaAnimationNeoCosmos5761; i5++) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, i, String.valueOf(frostHunterRotateDrawableCosmosHyper6619.FrostHunterConstraintSetCloneMasterUltraRogue2633[i5] >>> 3), frostHunterRotateDrawableCosmosHyper6619.FrostHunterBundlePulseFusionHero2475[i5]);
            }
        }
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        FrostHunterAlphaAnimationNeoCosmos5761(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788 = FrostHunterManifestEclipseGammaTitanium1788.FrostHunterAlertDialogAuroraDelta3200;
            sb.append(FrostHunterLiveDataEpicNeoPrime2305.FrostHunterLifecycleBlazeGammaElite2889(new FrostHunterManifestEclipseGammaTitanium1788(((String) obj).getBytes(FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761))));
            sb.append('\"');
            return;
        }
        if (obj instanceof FrostHunterManifestEclipseGammaTitanium1788) {
            sb.append(": \"");
            sb.append(FrostHunterLiveDataEpicNeoPrime2305.FrostHunterLifecycleBlazeGammaElite2889((FrostHunterManifestEclipseGammaTitanium1788) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof FrostHunterSharedFlowTitaniumHeroAurora7367) {
            sb.append(" {");
            FrostHunterBundlePulseFusionHero2475((FrostHunterSharedFlowTitaniumHeroAurora7367) obj, sb, i + 2);
            sb.append("\n");
            FrostHunterAlphaAnimationNeoCosmos5761(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, i3, "key", entry.getKey());
        FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, i3, "value", entry.getValue());
        sb.append("\n");
        FrostHunterAlphaAnimationNeoCosmos5761(i, sb);
        sb.append("}");
    }
}
