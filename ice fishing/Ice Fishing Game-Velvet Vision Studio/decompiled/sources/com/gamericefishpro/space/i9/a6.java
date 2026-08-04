package com.gamericefishpro.space.i9;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a6 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            w4 w4Var = w4.i;
            sb.append(com.gamericefishpro.space.a.a.I(new w4(((String) obj).getBytes(n5.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof w4) {
            sb.append(": \"");
            sb.append(com.gamericefishpro.space.a.a.I((w4) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof g5) {
            sb.append(" {");
            b((g5) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
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
        a(sb, i3, "key", entry.getKey());
        a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0204  */
    public static void b(g5 g5Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = g5Var.getClass().getDeclaredMethods();
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
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), g5.n(method2, g5Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), g5.n(method, g5Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objN = g5.n(method4, g5Var, new Object[0]);
                    if (method5 == null) {
                        if (objN instanceof Boolean) {
                            if (((Boolean) objN).booleanValue()) {
                                a(sb, i, strSubstring, objN);
                            }
                        } else if (objN instanceof Integer) {
                            if (((Integer) objN).intValue() != 0) {
                                a(sb, i, strSubstring, objN);
                            }
                        } else if (objN instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objN).floatValue()) != 0) {
                                a(sb, i, strSubstring, objN);
                            }
                        } else if (!(objN instanceof Double)) {
                            if (objN instanceof String) {
                                zEquals = objN.equals("");
                            } else if (objN instanceof w4) {
                                zEquals = objN.equals(w4.i);
                            } else if (objN instanceof p4) {
                                if (objN != ((g5) ((g5) ((p4) objN)).o(6))) {
                                    a(sb, i, strSubstring, objN);
                                }
                            } else if (!(objN instanceof Enum) || ((Enum) objN).ordinal() != 0) {
                                a(sb, i, strSubstring, objN);
                            }
                            if (!zEquals) {
                                a(sb, i, strSubstring, objN);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objN).doubleValue()) != 0) {
                            a(sb, i, strSubstring, objN);
                        }
                    } else if (((Boolean) g5.n(method5, g5Var, new Object[0])).booleanValue()) {
                        a(sb, i, strSubstring, objN);
                    }
                }
            }
            i2 = i3;
        }
        o6 o6Var = g5Var.zzc;
        if (o6Var != null) {
            for (int i5 = 0; i5 < o6Var.a; i5++) {
                a(sb, i, String.valueOf(o6Var.b[i5] >>> 3), o6Var.c[i5]);
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }
}
