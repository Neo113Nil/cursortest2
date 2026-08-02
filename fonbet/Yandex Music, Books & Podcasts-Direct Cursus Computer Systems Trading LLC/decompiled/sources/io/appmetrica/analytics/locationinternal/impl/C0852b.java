package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.Parser;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0852b implements Parser {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r3.equals("FOREGROUND") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r3.equals("VISIBLE") == false) goto L21;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer parse(String str) {
        int i;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1825417917) {
                if (hashCode != -847101650) {
                    if (hashCode == 1184726098) {
                    }
                } else if (str.equals("BACKGROUND")) {
                    i = 0;
                }
            }
            return Integer.valueOf(i);
        }
        i = 3;
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
