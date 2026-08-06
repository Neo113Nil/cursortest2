package io.appmetrica.analytics.coreapi.internal.data;

import R1.l;
import h1.C0235e;

/* loaded from: classes.dex */
public interface Parser<IN, OUT> {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <IN, OUT> OUT parseOrNull(Parser<? super IN, ? extends OUT> parser, IN in) {
            OUT out;
            try {
                out = parser.parse(in);
            } catch (Throwable th) {
                out = (OUT) l.h(th);
            }
            if (out instanceof C0235e) {
                return null;
            }
            return out;
        }
    }

    OUT parse(IN in);

    OUT parseOrNull(IN in);
}
