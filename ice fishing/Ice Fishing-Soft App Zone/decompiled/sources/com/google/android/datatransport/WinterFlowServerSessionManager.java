package com.google.android.datatransport;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowServerSessionManager {
    public static final char[] WinterFlowRouterStructure;

    static {
        char[] cArr = new char[80];
        WinterFlowRouterStructure = cArr;
        Arrays.fill(cArr, ' ');
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
    public static void WinterFlowCacheManagerAgent(WinterFlowDecoratorResponse winterFlowDecoratorResponse, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = winterFlowDecoratorResponse.getClass().getDeclaredMethods();
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
                    WinterFlowHookDataSource(sb, i, substring.substring(0, substring.length() - 4), WinterFlowDecoratorResponse.WinterFlowVariableVersionControl(method2, winterFlowDecoratorResponse, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                WinterFlowHookDataSource(sb, i, substring.substring(0, substring.length() - 3), WinterFlowDecoratorResponse.WinterFlowVariableVersionControl(method, winterFlowDecoratorResponse, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object WinterFlowVariableVersionControl = WinterFlowDecoratorResponse.WinterFlowVariableVersionControl(method4, winterFlowDecoratorResponse, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (WinterFlowVariableVersionControl instanceof Boolean) {
                            equals = !((Boolean) WinterFlowVariableVersionControl).booleanValue();
                        } else if (!(WinterFlowVariableVersionControl instanceof Integer)) {
                            if (!(WinterFlowVariableVersionControl instanceof Float)) {
                                if (!(WinterFlowVariableVersionControl instanceof Double)) {
                                    equals = WinterFlowVariableVersionControl instanceof String ? WinterFlowVariableVersionControl.equals("") : WinterFlowVariableVersionControl instanceof WinterFlowMicroserviceCloud ? WinterFlowVariableVersionControl.equals(WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse) : !(WinterFlowVariableVersionControl instanceof WinterFlowHookBackend) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) WinterFlowDecoratorResponse.WinterFlowVariableVersionControl(method5, winterFlowDecoratorResponse, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        WinterFlowHookDataSource(sb, i, substring, WinterFlowVariableVersionControl);
                    }
                }
            }
            i2 = i3;
        }
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer = winterFlowDecoratorResponse.unknownFields;
        if (winterFlowFrameworkRenderer != null) {
            for (int i5 = 0; i5 < winterFlowFrameworkRenderer.WinterFlowRouterStructure; i5++) {
                WinterFlowHookDataSource(sb, i, String.valueOf(winterFlowFrameworkRenderer.WinterFlowHookDataSource[i5] >>> 3), winterFlowFrameworkRenderer.WinterFlowCacheManagerAgent[i5]);
            }
        }
    }

    public static void WinterFlowHookDataSource(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                WinterFlowHookDataSource(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                WinterFlowHookDataSource(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        WinterFlowRouterStructure(i, sb);
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
            WinterFlowMicroserviceCloud winterFlowMicroserviceCloud = WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse;
            sb.append(WinterFlowPackageProcess.WinterFlowVariableVersionControl(new WinterFlowMicroserviceCloud(((String) obj).getBytes(WinterFlowMapperConcurrency.WinterFlowRouterStructure))));
            sb.append('\"');
            return;
        }
        if (obj instanceof WinterFlowMicroserviceCloud) {
            sb.append(": \"");
            sb.append(WinterFlowPackageProcess.WinterFlowVariableVersionControl((WinterFlowMicroserviceCloud) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof WinterFlowDecoratorResponse) {
            sb.append(" {");
            WinterFlowCacheManagerAgent((WinterFlowDecoratorResponse) obj, sb, i + 2);
            sb.append("\n");
            WinterFlowRouterStructure(i, sb);
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
        WinterFlowHookDataSource(sb, i3, "key", entry.getKey());
        WinterFlowHookDataSource(sb, i3, "value", entry.getValue());
        sb.append("\n");
        WinterFlowRouterStructure(i, sb);
        sb.append("}");
    }

    public static void WinterFlowRouterStructure(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(WinterFlowRouterStructure, 0, i2);
            i -= i2;
        }
    }
}
