package com.datadog.trace.core.propagation.ptags;

/* loaded from: classes4.dex */
public abstract class TagElement implements CharSequence {

    public enum Encoding {
        DATADOG("_dd.p."),
        W3C("t.");

        public static final Encoding[] cachedValues;
        public static final int numValues;
        public final String prefix;

        static {
            Encoding[] values = values();
            cachedValues = values;
            numValues = values.length;
        }

        Encoding(String str) {
            this.prefix = str;
        }
    }

    public abstract CharSequence forType(Encoding encoding2);
}
