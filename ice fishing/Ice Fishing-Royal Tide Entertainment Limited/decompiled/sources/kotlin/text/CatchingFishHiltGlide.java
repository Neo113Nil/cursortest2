package kotlin.text;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class CatchingFishHiltGlide {
    public static final char[] CatchingFishParcelableFAB;

    static {
        char[] cArr = new char[80];
        CatchingFishParcelableFAB = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishCoroutine(CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = catchingFishJUnitSharedFlow.getClass().getDeclaredMethods();
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
                    CatchingFishSnackbar(sb, i, substring.substring(0, substring.length() - 4), CatchingFishJUnitSharedFlow.CatchingFishDaggerWebsocket(method2, catchingFishJUnitSharedFlow, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                CatchingFishSnackbar(sb, i, substring.substring(0, substring.length() - 3), CatchingFishJUnitSharedFlow.CatchingFishDaggerWebsocket(method, catchingFishJUnitSharedFlow, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object CatchingFishDaggerWebsocket = CatchingFishJUnitSharedFlow.CatchingFishDaggerWebsocket(method4, catchingFishJUnitSharedFlow, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (CatchingFishDaggerWebsocket instanceof Boolean) {
                            equals = !((Boolean) CatchingFishDaggerWebsocket).booleanValue();
                        } else if (!(CatchingFishDaggerWebsocket instanceof Integer)) {
                            if (!(CatchingFishDaggerWebsocket instanceof Float)) {
                                if (!(CatchingFishDaggerWebsocket instanceof Double)) {
                                    equals = CatchingFishDaggerWebsocket instanceof String ? CatchingFishDaggerWebsocket.equals("") : CatchingFishDaggerWebsocket instanceof CatchingFishCameraXRealm ? CatchingFishDaggerWebsocket.equals(CatchingFishCameraXRealm.CatchingFishWorkManager) : !(CatchingFishDaggerWebsocket instanceof CatchingFishGlideWebsocket) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) CatchingFishJUnitSharedFlow.CatchingFishDaggerWebsocket(method5, catchingFishJUnitSharedFlow, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        CatchingFishSnackbar(sb, i, substring, CatchingFishDaggerWebsocket);
                    }
                }
            }
            i2 = i3;
        }
        CatchingFishToastDaggerHilt catchingFishToastDaggerHilt = catchingFishJUnitSharedFlow.unknownFields;
        if (catchingFishToastDaggerHilt != null) {
            for (int i5 = 0; i5 < catchingFishToastDaggerHilt.CatchingFishParcelableFAB; i5++) {
                CatchingFishSnackbar(sb, i, String.valueOf(catchingFishToastDaggerHilt.CatchingFishSnackbar[i5] >>> 3), catchingFishToastDaggerHilt.CatchingFishCoroutine[i5]);
            }
        }
    }

    public static void CatchingFishParcelableFAB(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(CatchingFishParcelableFAB, 0, i2);
            i -= i2;
        }
    }

    public static void CatchingFishSnackbar(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                CatchingFishSnackbar(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                CatchingFishSnackbar(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        CatchingFishParcelableFAB(i, sb);
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
            CatchingFishCameraXRealm catchingFishCameraXRealm = CatchingFishCameraXRealm.CatchingFishWorkManager;
            sb.append(CatchingFishKtorViewModel.CatchingFishCloudMessaging(new CatchingFishCameraXRealm(((String) obj).getBytes(CatchingFishFirebaseBundle.CatchingFishParcelableFAB))));
            sb.append('\"');
            return;
        }
        if (obj instanceof CatchingFishCameraXRealm) {
            sb.append(": \"");
            sb.append(CatchingFishKtorViewModel.CatchingFishCloudMessaging((CatchingFishCameraXRealm) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof CatchingFishJUnitSharedFlow) {
            sb.append(" {");
            CatchingFishCoroutine((CatchingFishJUnitSharedFlow) obj, sb, i + 2);
            sb.append("\n");
            CatchingFishParcelableFAB(i, sb);
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
        CatchingFishSnackbar(sb, i3, "key", entry.getKey());
        CatchingFishSnackbar(sb, i3, "value", entry.getValue());
        sb.append("\n");
        CatchingFishParcelableFAB(i, sb);
        sb.append("}");
    }
}
