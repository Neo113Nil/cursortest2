package com.google.android.libraries.places.internal;

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
public abstract class zzblb {
    public static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        byte[] bArr;
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
        if (obj instanceof String) {
            sb.append(": \"");
            String str2 = (String) obj;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char charAt2 = str2.charAt(i3);
                if (charAt2 < ' ' || charAt2 > '~') {
                    replace = zzie.zza(str2.getBytes(StandardCharsets.UTF_8));
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
            return;
        }
        if (obj instanceof zzbim) {
            sb.append(": \"");
            zzbim zzbimVar = (zzbim) obj;
            int zzb = zzbimVar.zzb();
            if (zzb == 0) {
                bArr = zzbkc.zza;
            } else {
                byte[] bArr2 = new byte[zzb];
                zzbimVar.zzd(zzb, bArr2);
                bArr = bArr2;
            }
            sb.append(zzie.zza(bArr));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzbjr) {
            sb.append(" {");
            zzc((zzbjr) obj, sb, i + 2);
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
        int i4 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i4, "key", entry.getKey());
        zzb(sb, i4, "value", entry.getValue());
        sb.append("\n");
        zzd(i, sb);
        sb.append("}");
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
    public static void zzc(zzbjr zzbjrVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzbjrVar.getClass().getDeclaredMethods();
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
                    zzb(sb, i, substring.substring(0, substring.length() - 4), zzbjr.zzbI(method2, zzbjrVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzbjr.zzbI(method, zzbjrVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzbI = zzbjr.zzbI(method4, zzbjrVar, new Object[0]);
                    if (method5 != null) {
                        booleanValue = ((Boolean) zzbjr.zzbI(method5, zzbjrVar, new Object[0])).booleanValue();
                    } else if (!(zzbI instanceof Boolean)) {
                        if (!(zzbI instanceof Integer)) {
                            if (!(zzbI instanceof Float)) {
                                if (!(zzbI instanceof Double)) {
                                    if (zzbI instanceof String) {
                                        equals = zzbI.equals("");
                                    } else if (zzbI instanceof zzbim) {
                                        equals = zzbI.equals(zzbim.zza);
                                    } else {
                                        booleanValue = !(zzbI instanceof zzbhz) ? true : true;
                                    }
                                }
                            }
                        }
                    }
                    if (booleanValue) {
                        zzb(sb, i, substring, zzbI);
                    }
                }
            }
            i2 = i3;
        }
        if (zzbjrVar instanceof zzbjo) {
            Iterator zzd = ((zzbjo) zzbjrVar).zzb.zzd();
            while (zzd.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzd.next();
                zzb(sb, i, "[525004180]", entry2.getValue());
            }
        }
        zzbma zzbmaVar = zzbjrVar.zzc;
        if (zzbmaVar != null) {
            for (int i5 = 0; i5 < zzbmaVar.zzb; i5++) {
                zzb(sb, i, String.valueOf(zzbmaVar.zzc[i5] >>> 3), zzbmaVar.zzd[i5]);
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
