package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ud0 {
    public static final char[] GWasM1elztuh;

    static {
        char[] cArr = new char[80];
        GWasM1elztuh = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void GWasM1elztuh(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(GWasM1elztuh, 0, i2);
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
    public static void X1lG3V04pd(ay ayVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = ayVar.getClass().getDeclaredMethods();
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
                    Yi7zF1RB1(sb, i, substring.substring(0, substring.length() - 4), ay.OOA6hdeuvCS(method2, ayVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                Yi7zF1RB1(sb, i, substring.substring(0, substring.length() - 3), ay.OOA6hdeuvCS(method, ayVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object OOA6hdeuvCS = ay.OOA6hdeuvCS(method4, ayVar, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (OOA6hdeuvCS instanceof Boolean) {
                            equals = !((Boolean) OOA6hdeuvCS).booleanValue();
                        } else if (!(OOA6hdeuvCS instanceof Integer)) {
                            if (!(OOA6hdeuvCS instanceof Float)) {
                                if (!(OOA6hdeuvCS instanceof Double)) {
                                    equals = OOA6hdeuvCS instanceof String ? OOA6hdeuvCS.equals("") : OOA6hdeuvCS instanceof c9 ? OOA6hdeuvCS.equals(c9.AvO7iQsrTN) : !(OOA6hdeuvCS instanceof WRKkgoJXwDn) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) ay.OOA6hdeuvCS(method5, ayVar, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        Yi7zF1RB1(sb, i, substring, OOA6hdeuvCS);
                    }
                }
            }
            i2 = i3;
        }
        lc1 lc1Var = ayVar.unknownFields;
        if (lc1Var != null) {
            for (int i5 = 0; i5 < lc1Var.GWasM1elztuh; i5++) {
                Yi7zF1RB1(sb, i, String.valueOf(lc1Var.Yi7zF1RB1[i5] >>> 3), lc1Var.X1lG3V04pd[i5]);
            }
        }
    }

    public static void Yi7zF1RB1(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Yi7zF1RB1(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                Yi7zF1RB1(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        GWasM1elztuh(i, sb);
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
            c9 c9Var = c9.AvO7iQsrTN;
            sb.append(b70.mE4lRynR(new c9(((String) obj).getBytes(i30.GWasM1elztuh))));
            sb.append('\"');
            return;
        }
        if (obj instanceof c9) {
            sb.append(": \"");
            sb.append(b70.mE4lRynR((c9) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ay) {
            sb.append(" {");
            X1lG3V04pd((ay) obj, sb, i + 2);
            sb.append("\n");
            GWasM1elztuh(i, sb);
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
        Yi7zF1RB1(sb, i3, "key", entry.getKey());
        Yi7zF1RB1(sb, i3, "value", entry.getValue());
        sb.append("\n");
        GWasM1elztuh(i, sb);
        sb.append("}");
    }
}
