package com.google.crypto.tink.shaded.protobuf;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import defpackage.cb0;
import defpackage.d8;
import defpackage.jn3;
import defpackage.kkt;
import defpackage.mn3;
import defpackage.tse;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public abstract class d {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            jn3 jn3Var = mn3.b;
            sb.append(cb0.v(new jn3(((String) obj).getBytes(tse.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof mn3) {
            sb.append(": \"");
            sb.append(cb0.v((mn3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof c) {
            sb.append(" {");
            c((c) obj, sb, i + 2);
            sb.append(StringUtil.LF);
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        b(sb, i4, PListParser.TAG_KEY, entry.getKey());
        b(sb, i4, Constants.KEY_VALUE, entry.getValue());
        sb.append(StringUtil.LF);
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a5, code lost:
    
        if (((java.lang.Integer) r4).intValue() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a7, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b9, code lost:
    
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cb, code lost:
    
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(c cVar, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : cVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, a(str2), c.h(method2, cVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, a(str3), c.h(method3, cVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object h = c.h(method4, cVar, new Object[0]);
                    if (method5 == null) {
                        if (h instanceof Boolean) {
                            equals = !((Boolean) h).booleanValue();
                        } else if (!(h instanceof Integer)) {
                            if (!(h instanceof Float)) {
                                if (!(h instanceof Double)) {
                                    equals = h instanceof String ? h.equals("") : h instanceof mn3 ? h.equals(mn3.b) : !(h instanceof d8) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) c.h(method5, cVar, new Object[0])).booleanValue();
                    }
                    if (z) {
                        b(sb, i, a(str4), h);
                    }
                }
            }
        }
        kkt kktVar = cVar.unknownFields;
        if (kktVar != null) {
            for (int i2 = 0; i2 < kktVar.a; i2++) {
                b(sb, i, String.valueOf(kktVar.b[i2] >>> 3), kktVar.c[i2]);
            }
        }
    }
}
