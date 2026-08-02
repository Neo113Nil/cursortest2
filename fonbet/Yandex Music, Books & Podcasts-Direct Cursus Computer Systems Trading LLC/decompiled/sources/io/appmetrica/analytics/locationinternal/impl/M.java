package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.Parser;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class M implements Parser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer parse(String str) {
        int i;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -217417826) {
                if (hashCode != 2082) {
                    if (hashCode != 84324) {
                        if (hashCode == 2402104 && str.equals("NONE")) {
                            i = 0;
                        }
                    } else if (str.equals("USB")) {
                        i = 1;
                    }
                } else if (str.equals("AC")) {
                    i = 3;
                }
            } else if (str.equals("WIRELESS")) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        i = 4;
        return Integer.valueOf(i);
    }

    public final Integer b(String str) {
        return (Integer) Parser.DefaultImpls.parseOrNull(this, str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(Object obj) {
        return (Integer) Parser.DefaultImpls.parseOrNull(this, (String) obj);
    }
}
