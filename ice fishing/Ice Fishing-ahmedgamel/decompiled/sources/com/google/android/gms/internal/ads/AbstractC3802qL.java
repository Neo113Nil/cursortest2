package com.google.android.gms.internal.ads;

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

/* renamed from: com.google.android.gms.internal.ads.qL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3802qL {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f34019a;

    static {
        char[] cArr = new char[80];
        f34019a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        String replace;
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
            for (int i4 = 1; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof JK) {
                sb.append(": \"");
                sb.append(AbstractC3364iD.b(((JK) obj).a()));
                sb.append('\"');
                return;
            }
            if (obj instanceof VK) {
                sb.append(" {");
                b((VK) obj, sb, i + 2);
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
            int i6 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i6, "key", entry.getKey());
            a(sb, i6, "value", entry.getValue());
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String str2 = (String) obj;
        boolean z6 = false;
        boolean z9 = false;
        boolean z10 = false;
        for (int i9 = 0; i9 < str2.length(); i9++) {
            char charAt2 = str2.charAt(i9);
            if (charAt2 < ' ' || charAt2 > '~') {
                replace = AbstractC3364iD.b(str2.getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (charAt2 == '\"') {
                z10 = true;
            } else if (charAt2 == '\'') {
                z9 = true;
            } else if (charAt2 == '\\') {
                z6 = true;
            }
        }
        if (z6) {
            str2 = str2.replace("\\", "\\\\");
        }
        replace = z9 ? str2.replace("'", "\\'") : str2;
        if (z10) {
            replace = replace.replace("\"", "\\\"");
        }
        sb.append(replace);
        sb.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0184, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0192, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a4, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ba, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d2, code lost:
    
        if (r13 != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(VK vk, StringBuilder sb, int i) {
        int i4;
        int i6;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = vk.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i4 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
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
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i4);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i6 = i4;
            } else {
                i6 = i4;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), VK.j(method2, vk, new Object[0]));
                    i4 = i6;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), VK.j(method, vk, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object j6 = VK.j(method4, vk, new Object[0]);
                    if (method5 != null) {
                        booleanValue = ((Boolean) VK.j(method5, vk, new Object[0])).booleanValue();
                    } else if (!(j6 instanceof Boolean)) {
                        if (!(j6 instanceof Integer)) {
                            if (!(j6 instanceof Float)) {
                                if (!(j6 instanceof Double)) {
                                    if (j6 instanceof String) {
                                        equals = j6.equals("");
                                    } else if (j6 instanceof JK) {
                                        equals = j6.equals(JK.f26428u);
                                    } else {
                                        booleanValue = !(j6 instanceof AbstractC4286zK) ? true : true;
                                    }
                                }
                            }
                        }
                    }
                    if (booleanValue) {
                        a(sb, i, substring, j6);
                    }
                }
            }
            i4 = i6;
        }
        LL ll = vk.zzt;
        if (ll != null) {
            for (int i10 = 0; i10 < ll.f26907a; i10++) {
                a(sb, i, String.valueOf(ll.f26908b[i10] >>> 3), ll.f26909c[i10]);
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i4 = 80;
            if (i <= 80) {
                i4 = i;
            }
            sb.append(f34019a, 0, i4);
            i -= i4;
        }
    }
}
