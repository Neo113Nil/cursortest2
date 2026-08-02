package com.datadog.trace.api;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.datadog.android.trace.internal.compat.function.Function;
import com.datadog.trace.core.DDSpan;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public abstract class Functions {
    public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 UTF8_ENCODE = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(26);

    public final class LowerCase implements EndpointCheckpointer, Function {
        public static final LowerCase NO_OP = new LowerCase();
        public static final LowerCase INSTANCE = new LowerCase();

        @Override // com.datadog.android.trace.internal.compat.function.Function
        public Object apply(Object obj) {
            return ((String) obj).toLowerCase(Locale.ROOT);
        }

        @Override // com.datadog.trace.api.EndpointCheckpointer
        public void onRootSpanFinished(DDSpan dDSpan) {
        }

        @Override // com.datadog.trace.api.EndpointCheckpointer
        public void onRootSpanStarted(DDSpan dDSpan) {
        }
    }

    public static boolean hasIllegalCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '*' || charAt == '[' || charAt == ']' || charAt == ',') {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0109, code lost:
    
        r15.substring(r2, r6);
        r0 = java.util.Collections.EMPTY_MAP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        r15.substring(r2, r6);
        r0 = java.util.Collections.EMPTY_MAP;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map parse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        Map hashMap = new HashMap();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int indexOf = str.indexOf(59, i2);
            int length = indexOf == -1 ? str.length() : indexOf;
            if (length > i2) {
                int indexOf2 = str.indexOf(91, i);
                if (indexOf2 != -1) {
                    if (indexOf2 < length) {
                        int indexOf3 = str.indexOf(93, indexOf2);
                        if (indexOf3 != -1 && indexOf3 <= length) {
                            if (indexOf3 < length && !str.substring(indexOf3 + 1, length).trim().isEmpty()) {
                                str.substring(i, length);
                                hashMap = Collections.EMPTY_MAP;
                                break;
                            }
                            String trim = str.substring(i, indexOf2).trim();
                            if (!trim.isEmpty() && !hasIllegalCharacters(trim)) {
                                Set set = (Set) hashMap.get(trim);
                                if (set == null) {
                                    set = new HashSet();
                                    hashMap.put(trim, set);
                                }
                                int i3 = indexOf2 + 1;
                                int i4 = 0;
                                int i5 = 0;
                                boolean z = false;
                                while (i3 < indexOf3) {
                                    int indexOf4 = str.indexOf(44, i3);
                                    if (indexOf4 == -1 || indexOf4 >= indexOf3) {
                                        indexOf4 = indexOf3;
                                    }
                                    String trim2 = str.substring(i3, indexOf4).trim();
                                    if (trim2.equals(Marker.ANY_MARKER) || !hasIllegalCharacters(trim2)) {
                                        if (!trim2.isEmpty()) {
                                            i4++;
                                            if (i5 > 0) {
                                                str.substring(i, length);
                                                hashMap = Collections.EMPTY_MAP;
                                            } else {
                                                z |= trim2.indexOf(42) != -1;
                                                if (!z || i4 <= 1) {
                                                    set.add(trim2);
                                                } else {
                                                    str.substring(i, length);
                                                    hashMap = Collections.EMPTY_MAP;
                                                }
                                            }
                                            indexOf = -1;
                                            break;
                                        }
                                        i5++;
                                        if (i5 > 1) {
                                            str.substring(i, length);
                                            hashMap = Collections.EMPTY_MAP;
                                        }
                                        i3 = indexOf4 + 1;
                                    } else {
                                        str.substring(i, length);
                                        hashMap = Collections.EMPTY_MAP;
                                    }
                                    i4++;
                                    indexOf = -1;
                                    break;
                                }
                                if (i4 == 0) {
                                    str.substring(i, length);
                                    hashMap = Collections.EMPTY_MAP;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        str.substring(i, length);
                        hashMap = Collections.EMPTY_MAP;
                        break;
                    }
                } else if (!str.substring(i).trim().isEmpty()) {
                    str.substring(i, length);
                    hashMap = Collections.EMPTY_MAP;
                }
            }
            i = indexOf + 1;
            if (i == 0) {
                break;
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
