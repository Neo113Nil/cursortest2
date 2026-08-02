package com.datadog.trace.core.util;

import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class GlobPattern {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static void m1917constructorimpl(String str) {
        str.getClass();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1918equalsimpl0(String str, String str2) {
        return str.equals(str2);
    }

    public static Pattern globToRegexPattern(String str) {
        StringBuilder sb = new StringBuilder(64);
        sb.append('^');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '$' && charAt != '.') {
                if (charAt != '?') {
                    switch (charAt) {
                        case '(':
                        case ')':
                            break;
                        case '*':
                            sb.append(".*");
                            continue;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                    break;
                                default:
                                    switch (charAt) {
                                        case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                                        case '}':
                                            break;
                                        default:
                                            sb.append(charAt);
                                            continue;
                                    }
                            }
                    }
                } else {
                    sb.append('.');
                }
            }
            sb.append("\\");
            sb.append(charAt);
        }
        sb.append('$');
        return Pattern.compile(sb.toString());
    }
}
