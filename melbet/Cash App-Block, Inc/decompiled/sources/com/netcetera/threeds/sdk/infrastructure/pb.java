package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes5.dex */
public class pb {
    public static String ThreeDS2Service(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        get(str, sb);
        return sb.toString();
    }

    public static void ThreeDS2ServiceInstance(Object obj, Writer writer) {
        if (obj == null) {
            writer.write("null");
            return;
        }
        if (obj instanceof String) {
            writer.write(34);
            writer.write(ThreeDS2Service((String) obj));
            writer.write(34);
            return;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isInfinite() || d.isNaN()) {
                writer.write("null");
                return;
            } else {
                writer.write(obj.toString());
                return;
            }
        }
        if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isInfinite() || f.isNaN()) {
                writer.write("null");
                return;
            } else {
                writer.write(obj.toString());
                return;
            }
        }
        if (obj instanceof Number) {
            writer.write(obj.toString());
            return;
        }
        if (obj instanceof Boolean) {
            writer.write(obj.toString());
            return;
        }
        if (obj instanceof os) {
            ((os) obj).get(writer);
            return;
        }
        if (obj instanceof ot) {
            writer.write(((ot) obj).initialize());
            return;
        }
        if (obj instanceof Map) {
            ow.getWarnings((Map) obj, writer);
            return;
        }
        if (obj instanceof Collection) {
            ov.initialize((Collection) obj, writer);
            return;
        }
        if (obj instanceof byte[]) {
            ov.getWarnings((byte[]) obj, writer);
            return;
        }
        if (obj instanceof short[]) {
            ov.get((short[]) obj, writer);
            return;
        }
        if (obj instanceof int[]) {
            ov.get((int[]) obj, writer);
            return;
        }
        if (obj instanceof long[]) {
            ov.getWarnings((long[]) obj, writer);
            return;
        }
        if (obj instanceof float[]) {
            ov.ThreeDS2ServiceInstance((float[]) obj, writer);
            return;
        }
        if (obj instanceof double[]) {
            ov.getWarnings((double[]) obj, writer);
            return;
        }
        if (obj instanceof boolean[]) {
            ov.get((boolean[]) obj, writer);
            return;
        }
        if (obj instanceof char[]) {
            ov.get((char[]) obj, writer);
        } else if (obj instanceof Object[]) {
            ov.ThreeDS2Service((Object[]) obj, writer);
        } else {
            ThreeDS2ServiceInstance(obj.toString(), writer);
        }
    }

    public static void get(String str, StringBuilder sb) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                sb.append("\\f");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    default:
                        if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                            sb.append(charAt);
                            break;
                        } else {
                            String hexString = Integer.toHexString(charAt);
                            sb.append("\\u");
                            for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                sb.append('0');
                            }
                            sb.append(hexString.toUpperCase());
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
    }

    public static String initialize(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ThreeDS2ServiceInstance(obj, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
