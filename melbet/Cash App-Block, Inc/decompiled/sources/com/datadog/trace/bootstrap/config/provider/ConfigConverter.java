package com.datadog.trace.bootstrap.config.provider;

import com.datadog.trace.util.Strings;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ConfigConverter {
    public static final ConfigProvider INSTANCE = new ConfigProvider(new ConfigProvider[0]);

    final class BadFormatException extends Exception {
    }

    public static void loadMap(String str, HashMap hashMap) {
        int i = 0;
        try {
            int indexOf = str.indexOf(58, 0);
            while (indexOf != -1) {
                int i2 = indexOf + 1;
                int indexOf2 = str.indexOf(58, i2);
                int indexOf3 = str.indexOf(44, i2);
                if (indexOf3 == -1) {
                    indexOf3 = str.length();
                }
                int indexOf4 = str.indexOf(32, i2);
                if (indexOf4 == -1) {
                    indexOf4 = str.length();
                }
                int i3 = indexOf3 < str.length() ? indexOf3 : indexOf4;
                while (indexOf2 != -1 && indexOf2 < i3) {
                    indexOf2 = str.indexOf(58, indexOf2 + 1);
                }
                if (indexOf2 == -1) {
                    if (indexOf3 < str.length() - 1) {
                        throw new BadFormatException("Non white space characters after trailing ','");
                    }
                } else if (indexOf3 >= str.length()) {
                    if (indexOf4 >= str.length()) {
                        throw new BadFormatException("Illegal position of split character ':'");
                    }
                    indexOf3 = indexOf4;
                }
                String trim = str.substring(i, indexOf).trim();
                if (trim.indexOf(44) != -1) {
                    throw new BadFormatException("Illegal ',' character in key '" + trim + "'");
                }
                String trim2 = str.substring(i2, indexOf3).trim();
                if (trim2.indexOf(32) != -1) {
                    throw new BadFormatException("Illegal ' ' character in value for key '" + trim + "'");
                }
                if (!trim.isEmpty() && !trim2.isEmpty()) {
                    hashMap.put(trim, trim2);
                }
                i = indexOf3 + 1;
                indexOf = indexOf2;
            }
        } catch (Throwable th) {
            if (th instanceof BadFormatException) {
                th.getMessage();
            }
            hashMap.clear();
        }
    }

    public static BitSet parseIntegerRangeSet(String str) {
        String replaceAll = str.replaceAll("\\s", "");
        if (!replaceAll.matches("\\d{1,3}(?:-\\d{1,3})?(?:,\\d{1,3}(?:-\\d{1,3})?)*")) {
            throw new NumberFormatException();
        }
        BitSet bitSet = new BitSet(Integer.parseInt(replaceAll.substring(Math.max(replaceAll.lastIndexOf(44), replaceAll.lastIndexOf(45)) + 1)));
        for (String str2 : replaceAll.split(",", -1)) {
            int indexOf = str2.indexOf(45);
            if (indexOf == -1) {
                bitSet.set(Integer.parseInt(str2));
            } else if (indexOf > 0) {
                int parseInt = Integer.parseInt(str2.substring(0, indexOf));
                int parseInt2 = Integer.parseInt(str2.substring(indexOf + 1));
                bitSet.set(Math.min(parseInt, parseInt2), Math.max(parseInt, parseInt2) + 1);
            }
        }
        return bitSet;
    }

    public static List parseList(String str, String str2) {
        String trim = Strings.trim(str);
        if (trim.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] split = trim.split(str2, -1);
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        return Collections.unmodifiableList(Arrays.asList(split));
    }

    public static String trimmedHeader(int i, int i2, String str, boolean z) {
        if (i >= i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        int i3 = -1;
        int i4 = -1;
        for (int i5 = i; i5 < i2; i5++) {
            char charAt = str.charAt(i5);
            if (z) {
                charAt = Character.toLowerCase(charAt);
            }
            if (Character.isWhitespace(charAt)) {
                sb.append(' ');
            } else {
                if (i3 == -1) {
                    i3 = i5;
                }
                sb.append(charAt);
                i4 = i5;
            }
        }
        return i3 == -1 ? "" : sb.substring(i3 - i, (i4 - i) + 1);
    }

    public static Object valueOf(Class cls, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            if (cls == Boolean.class) {
                return Boolean.valueOf(str);
            }
            if (cls == Integer.class) {
                return Integer.valueOf(str);
            }
            if (cls == Long.class) {
                return Long.valueOf(str);
            }
            if (cls == Double.class) {
                return Double.valueOf(str);
            }
            if (cls == Float.class) {
                return Float.valueOf(str);
            }
            return null;
        } catch (NumberFormatException e) {
            throw e;
        } catch (Throwable th) {
            throw new NumberFormatException(th.toString());
        }
    }
}
