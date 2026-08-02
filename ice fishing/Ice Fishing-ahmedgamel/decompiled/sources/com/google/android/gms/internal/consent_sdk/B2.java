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
    public static final char[] f36260a;

    static {
        char[] cArr = new char[80];
        f36260a = cArr;
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
        if (obj instanceof String) {
            sb.append(": \"");
            C4350h2 c4350h2 = C4350h2.f36450v;
            sb.append(AbstractC4414y.b(new C4350h2(((String) obj).getBytes(AbstractC4393s2.f36513a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C4350h2) {
            sb.append(": \"");
            sb.append(AbstractC4414y.b((C4350h2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4378o2) {
            sb.append(" {");
            c((AbstractC4378o2) obj, sb, i + 2);
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
        int i6 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i6, "key", entry.getKey());
        a(sb, i6, "value", entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i4 = 80;
            if (i <= 80) {
                i4 = i;
            }
            sb.append(f36260a, 0, i4);
            i -= i4;
        }
    }

    public static void c(AbstractC4378o2 abstractC4378o2, StringBuilder sb, int i) {
        int i4;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC4378o2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i6 = 0;
        while (true) {
            i4 = 3;
            if (i6 >= length) {
                break;
            }
            Method method3 = declaredMethods[i6];
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
            i6++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i4);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i, substring.substring(0, substring.length() - 4), AbstractC4378o2.i(method2, abstractC4378o2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), AbstractC4378o2.i(method, abstractC4378o2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i9 = AbstractC4378o2.i(method4, abstractC4378o2, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) AbstractC4378o2.i(method5, abstractC4378o2, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, i9);
                    } else if (i9 instanceof Boolean) {
                        if (!((Boolean) i9).booleanValue()) {
                        }
                        a(sb, i, substring, i9);
                    } else if (i9 instanceof Integer) {
                        if (((Integer) i9).intValue() == 0) {
                        }
                        a(sb, i, substring, i9);
                    } else if (i9 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) i9).floatValue()) == 0) {
                        }
                        a(sb, i, substring, i9);
                    } else if (i9 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) i9).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, i9);
                    } else {
                        if (i9 instanceof String) {
                            equals = i9.equals("");
                        } else if (i9 instanceof C4350h2) {
                            equals = i9.equals(C4350h2.f36450v);
                        } else if (i9 instanceof AbstractC4330c2) {
                            if (i9 == ((AbstractC4378o2) ((AbstractC4378o2) ((AbstractC4330c2) i9)).f(6))) {
                            }
                            a(sb, i, substring, i9);
                        } else {
                            if ((i9 instanceof Enum) && ((Enum) i9).ordinal() == 0) {
                            }
                            a(sb, i, substring, i9);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, i9);
                    }
                }
            }
            i4 = 3;
        }
    }
}
