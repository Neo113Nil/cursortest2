package androidx.datastore.preferences.protobuf;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfl;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class MessageLiteToString {
    public static final char[] INDENT_BUFFER;

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void indent(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(INDENT_BUFFER, 0, i2);
            i -= i2;
        }
    }

    public static void printField(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i, sb);
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
            ByteString$LiteralByteString byteString$LiteralByteString = ByteString$LiteralByteString.EMPTY;
            sb.append(zzfl.escapeBytes(new ByteString$LiteralByteString(((String) obj).getBytes(Internal.UTF_8))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString$LiteralByteString) {
            sb.append(": \"");
            sb.append(zzfl.escapeBytes((ByteString$LiteralByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            indent(i, sb);
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
        printField(sb, i3, "key", entry.getKey());
        printField(sb, i3, "value", entry.getValue());
        sb.append("\n");
        indent(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019a, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b0, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void reflectivePrintWithIndent(GeneratedMessageLite generatedMessageLite, StringBuilder sb, int i) {
        int i2;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = generatedMessageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                printField(sb, i, Boxes$$ExternalSyntheticOutline1.m1148m(4, 0, substring), GeneratedMessageLite.invokeOrDie(method2, generatedMessageLite, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                printField(sb, i, Boxes$$ExternalSyntheticOutline1.m1148m(3, 0, substring), GeneratedMessageLite.invokeOrDie(method, generatedMessageLite, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object invokeOrDie = GeneratedMessageLite.invokeOrDie(method4, generatedMessageLite, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (invokeOrDie instanceof Boolean) {
                            equals = !((Boolean) invokeOrDie).booleanValue();
                        } else if (!(invokeOrDie instanceof Integer)) {
                            if (!(invokeOrDie instanceof Float)) {
                                if (!(invokeOrDie instanceof Double)) {
                                    equals = invokeOrDie instanceof String ? invokeOrDie.equals("") : invokeOrDie instanceof ByteString$LiteralByteString ? invokeOrDie.equals(ByteString$LiteralByteString.EMPTY) : !(invokeOrDie instanceof AbstractMessageLite) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method5, generatedMessageLite, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        printField(sb, i, substring, invokeOrDie);
                    }
                }
            }
            i2 = 3;
        }
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != null) {
            for (int i4 = 0; i4 < unknownFieldSetLite.count; i4++) {
                printField(sb, i, String.valueOf(unknownFieldSetLite.tags[i4] >>> 3), unknownFieldSetLite.objects[i4]);
            }
        }
    }

    public static String toString(GeneratedMessageLite generatedMessageLite, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        reflectivePrintWithIndent(generatedMessageLite, sb, 0);
        return sb.toString();
    }
}
