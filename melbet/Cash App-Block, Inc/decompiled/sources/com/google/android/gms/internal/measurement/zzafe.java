package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public abstract class zzafe {
    public static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzadu zzaduVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzaduVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        String replace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzd(i, sb);
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
        if (!(obj instanceof String)) {
            if (obj instanceof zzacr) {
                sb.append(": \"");
                sb.append(zzh.zza(((zzacr) obj).zzm()));
                sb.append('\"');
                return;
            }
            if (obj instanceof zzadu) {
                sb.append(" {");
                zzc((zzadu) obj, sb, i + 2);
                sb.append("\n");
                zzd(i, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i3 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            zzb(sb, i3, "key", entry.getKey());
            zzb(sb, i3, "value", entry.getValue());
            sb.append("\n");
            zzd(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String str2 = (String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < str2.length(); i4++) {
            char charAt2 = str2.charAt(i4);
            if (charAt2 < ' ' || charAt2 > '~') {
                replace = zzh.zza(str2.getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (charAt2 == '\"') {
                z3 = true;
            } else if (charAt2 == '\'') {
                z2 = true;
            } else if (charAt2 == '\\') {
                z = true;
            }
        }
        if (z) {
            str2 = str2.replace("\\", "\\\\");
        }
        replace = z2 ? str2.replace("'", "\\'") : str2;
        if (z3) {
            replace = replace.replace("\"", "\\\"");
        }
        sb.append(replace);
        sb.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017f, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0181, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a1, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b7, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cf, code lost:
    
        if (r13 != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzc(zzadu zzaduVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzaduVar.getClass().getDeclaredMethods();
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
                    zzb(sb, i, substring.substring(0, substring.length() - 4), zzadu.zzcu(method2, zzaduVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzadu.zzcu(method, zzaduVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzcu = zzadu.zzcu(method4, zzaduVar, new Object[0]);
                    if (method5 != null) {
                        booleanValue = ((Boolean) zzadu.zzcu(method5, zzaduVar, new Object[0])).booleanValue();
                    } else if (!(zzcu instanceof Boolean)) {
                        if (!(zzcu instanceof Integer)) {
                            if (!(zzcu instanceof Float)) {
                                if (!(zzcu instanceof Double)) {
                                    if (zzcu instanceof String) {
                                        equals = zzcu.equals("");
                                    } else if (zzcu instanceof zzacr) {
                                        equals = zzcu.equals(zzacr.zza);
                                    } else {
                                        booleanValue = !(zzcu instanceof zzacb) ? true : true;
                                    }
                                }
                            }
                        }
                    }
                    if (booleanValue) {
                        zzb(sb, i, substring, zzcu);
                    }
                }
            }
            i2 = i3;
        }
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != null) {
            for (int i5 = 0; i5 < zzagaVar.zzb; i5++) {
                zzb(sb, i, String.valueOf(zzagaVar.zzc[i5] >>> 3), zzagaVar.zzd[i5]);
            }
        }
    }

    public static void zzd(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }
}
