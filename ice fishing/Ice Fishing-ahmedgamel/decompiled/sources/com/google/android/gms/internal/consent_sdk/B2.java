package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class B2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f35491a;

    static {
        char[] cArr = new char[80];
        f35491a = cArr;
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
        b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i6 = 1; i6 < str.length(); i6++) {
                char charAt = str.charAt(i6);
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
            C4327h2 c4327h2 = C4327h2.f35681v;
            sb.append(AbstractC4391y.b(new C4327h2(((String) obj).getBytes(AbstractC4370s2.f35744a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C4327h2) {
            sb.append(": \"");
            sb.append(AbstractC4391y.b((C4327h2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4355o2) {
            sb.append(" {");
            c((AbstractC4355o2) obj, sb, i + 2);
            sb.append("\n");
            b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i9 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i9, "key", entry.getKey());
        a(sb, i9, "value", entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i6 = 80;
            if (i <= 80) {
                i6 = i;
            }
            sb.append(f35491a, 0, i6);
            i -= i6;
        }
    }

    public static void c(AbstractC4355o2 abstractC4355o2, StringBuilder sb, int i) {
        int i6;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC4355o2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i6 = 3;
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
            String substring = ((String) entry.getKey()).substring(i6);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i, substring.substring(0, substring.length() - 4), AbstractC4355o2.i(method2, abstractC4355o2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), AbstractC4355o2.i(method, abstractC4355o2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i10 = AbstractC4355o2.i(method4, abstractC4355o2, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) AbstractC4355o2.i(method5, abstractC4355o2, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, i10);
                    } else if (i10 instanceof Boolean) {
                        if (!((Boolean) i10).booleanValue()) {
                        }
                        a(sb, i, substring, i10);
                    } else if (i10 instanceof Integer) {
                        if (((Integer) i10).intValue() == 0) {
                        }
                        a(sb, i, substring, i10);
                    } else if (i10 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) i10).floatValue()) == 0) {
                        }
                        a(sb, i, substring, i10);
                    } else if (i10 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) i10).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, i10);
                    } else {
                        if (i10 instanceof String) {
                            equals = i10.equals("");
                        } else if (i10 instanceof C4327h2) {
                            equals = i10.equals(C4327h2.f35681v);
                        } else if (i10 instanceof AbstractC4307c2) {
                            if (i10 == ((AbstractC4355o2) ((AbstractC4355o2) ((AbstractC4307c2) i10)).f(6))) {
                            }
                            a(sb, i, substring, i10);
                        } else {
                            if ((i10 instanceof Enum) && ((Enum) i10).ordinal() == 0) {
                            }
                            a(sb, i, substring, i10);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, i10);
                    }
                }
            }
            i6 = 3;
        }
    }
}
