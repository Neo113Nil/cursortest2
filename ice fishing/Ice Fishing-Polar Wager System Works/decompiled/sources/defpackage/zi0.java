package defpackage;

/* loaded from: classes.dex */
public abstract class zi0 {
    public static final char[] IHQe1A4L2xu;

    static {
        char[] cArr = new char[80];
        IHQe1A4L2xu = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    public static void IHQe1A4L2xu(int i, java.lang.StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(IHQe1A4L2xu, 0, i2);
            i -= i2;
        }
    }

    public static void oh6vYeIP(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                oh6vYeIP(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                oh6vYeIP(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        IHQe1A4L2xu(i, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (java.lang.Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            defpackage.ra raVar = defpackage.ra.AARZUJiTa;
            sb.append(defpackage.c80.kd6TUFXn(new defpackage.ra(((java.lang.String) obj).getBytes(defpackage.q70.IHQe1A4L2xu))));
            sb.append('\"');
            return;
        }
        if (obj instanceof defpackage.ra) {
            sb.append(": \"");
            sb.append(defpackage.c80.kd6TUFXn((defpackage.ra) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof defpackage.e20) {
            sb.append(" {");
            r1MBDhnF((defpackage.e20) obj, sb, i + 2);
            sb.append("\n");
            IHQe1A4L2xu(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i3 = i + 2;
        oh6vYeIP(sb, i3, "key", entry.getKey());
        oh6vYeIP(sb, i3, "value", entry.getValue());
        sb.append("\n");
        IHQe1A4L2xu(i, sb);
        sb.append("}");
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
    public static void r1MBDhnF(defpackage.e20 e20Var, java.lang.StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = e20Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i4];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String substring = ((java.lang.String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (java.lang.reflect.Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(java.util.List.class)) {
                    oh6vYeIP(sb, i, substring.substring(0, substring.length() - 4), defpackage.e20.adDC3e2L(method2, e20Var, new java.lang.Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                oh6vYeIP(sb, i, substring.substring(0, substring.length() - 3), defpackage.e20.adDC3e2L(method, e20Var, new java.lang.Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    java.lang.Object adDC3e2L = defpackage.e20.adDC3e2L(method4, e20Var, new java.lang.Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (adDC3e2L instanceof java.lang.Boolean) {
                            equals = !((java.lang.Boolean) adDC3e2L).booleanValue();
                        } else if (!(adDC3e2L instanceof java.lang.Integer)) {
                            if (!(adDC3e2L instanceof java.lang.Float)) {
                                if (!(adDC3e2L instanceof java.lang.Double)) {
                                    equals = adDC3e2L instanceof java.lang.String ? adDC3e2L.equals("") : adDC3e2L instanceof defpackage.ra ? adDC3e2L.equals(defpackage.ra.AARZUJiTa) : !(adDC3e2L instanceof defpackage.QQUzIjv3iOC5) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((java.lang.Boolean) defpackage.e20.adDC3e2L(method5, e20Var, new java.lang.Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        oh6vYeIP(sb, i, substring, adDC3e2L);
                    }
                }
            }
            i2 = i3;
        }
        defpackage.pk1 pk1Var = e20Var.unknownFields;
        if (pk1Var != null) {
            for (int i5 = 0; i5 < pk1Var.IHQe1A4L2xu; i5++) {
                oh6vYeIP(sb, i, java.lang.String.valueOf(pk1Var.oh6vYeIP[i5] >>> 3), pk1Var.r1MBDhnF[i5]);
            }
        }
    }
}
