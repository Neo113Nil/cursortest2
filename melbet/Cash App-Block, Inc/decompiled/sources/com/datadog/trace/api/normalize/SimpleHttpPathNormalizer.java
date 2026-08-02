package com.datadog.trace.api.normalize;

import com.datadog.trace.api.Config;
import com.stripe.android.core.utils.CreationExtrasKtxKt;

/* loaded from: classes4.dex */
public final class SimpleHttpPathNormalizer extends CreationExtrasKtxKt {
    public final String normalize(String str) {
        if (str == null || str.isEmpty()) {
            return "/";
        }
        boolean z = Config.INSTANCE.httpServerDecodedResourcePreserveSpaces;
        StringBuilder sb = null;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf(47, i);
            if (indexOf != i) {
                int length = indexOf == -1 ? str.length() : indexOf;
                int i3 = length - i;
                if (i3 > 3 || i3 <= 1 || (str.charAt(i) | ' ') != 118) {
                    int length2 = sb != null ? sb.length() : i;
                    boolean z2 = false;
                    while (i < length && !z2) {
                        char charAt = str.charAt(i);
                        i2--;
                        boolean z3 = i2 < 0 && charAt <= '9' && charAt >= '0';
                        if (!z3) {
                            if (Character.isWhitespace(charAt)) {
                                if (sb == null) {
                                    sb = new StringBuilder();
                                    sb.append((CharSequence) str, 0, i);
                                }
                                if (z && sb.length() > 0) {
                                    sb.append(charAt);
                                }
                            } else if (sb != null) {
                                sb.append(charAt);
                            }
                        }
                        i++;
                        z2 = z3;
                    }
                    if (z2) {
                        if (sb == null) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, length2);
                        }
                        sb.setLength(length2);
                        sb.append('?');
                    }
                } else {
                    boolean z4 = true;
                    for (int i4 = i + 1; i4 < length; i4++) {
                        char charAt2 = str.charAt(i4);
                        z4 &= charAt2 <= '9' && charAt2 >= '0';
                    }
                    if (!z4) {
                        if (sb == null) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i);
                        }
                        sb.append('?');
                    } else if (sb != null) {
                        sb.append((CharSequence) str, i, length);
                    }
                }
                i = length + 1;
            } else {
                i++;
            }
            if (indexOf != -1 && sb != null) {
                sb.append('/');
            }
        }
        return sb == null ? str : sb.length() == 0 ? "/" : sb.toString();
    }
}
