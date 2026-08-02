package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.stripe.android.uicore.elements.H6TextKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public abstract class zzfo {
    public static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
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
        zzc(i, sb);
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
            sb.append(H6TextKt.zza(new zzde(((String) obj).getBytes(zzep.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzdf) {
            sb.append(": \"");
            sb.append(H6TextKt.zza((zzdf) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzeh) {
            sb.append(" {");
            zzd((zzeh) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
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
        zzc(i, sb);
        sb.append("}");
    }

    public static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    public static void zzd(zzeh zzehVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzehVar.getClass().getDeclaredMethods();
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
                    zzb(sb, i, substring.substring(0, substring.length() - 4), zzeh.zzR(method2, zzehVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzeh.zzR(method, zzehVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzR = zzeh.zzR(method4, zzehVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzeh.zzR(method5, zzehVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzR);
                    } else if (zzR instanceof Boolean) {
                        if (!((Boolean) zzR).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzR);
                    } else if (zzR instanceof Integer) {
                        if (((Integer) zzR).intValue() == 0) {
                        }
                        zzb(sb, i, substring, zzR);
                    } else if (zzR instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzR).floatValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzR);
                    } else if (zzR instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzR).doubleValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzR);
                    } else {
                        if (zzR instanceof String) {
                            equals = zzR.equals("");
                        } else if (zzR instanceof zzdf) {
                            equals = zzR.equals(zzdf.zzb);
                        } else if (zzR instanceof zzcq) {
                            if (zzR == ((zzeh) ((zzeh) ((zzcq) zzR)).zzg(6, null))) {
                            }
                            zzb(sb, i, substring, zzR);
                        } else {
                            if ((zzR instanceof Enum) && ((Enum) zzR).ordinal() == 0) {
                            }
                            zzb(sb, i, substring, zzR);
                        }
                        if (equals) {
                        }
                        zzb(sb, i, substring, zzR);
                    }
                }
            }
            i2 = i3;
        }
        if (zzehVar instanceof zzed) {
            Iterator zzf = ((zzed) zzehVar).zzb.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                ((zzee) entry2.getKey()).getClass();
                zzb(sb, i, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, "[", "]"), entry2.getValue());
            }
        }
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != null) {
            for (int i5 = 0; i5 < zzgtVar.zzb; i5++) {
                zzb(sb, i, String.valueOf(zzgtVar.zzc[i5] >>> 3), zzgtVar.zzd[i5]);
            }
        }
    }
}
