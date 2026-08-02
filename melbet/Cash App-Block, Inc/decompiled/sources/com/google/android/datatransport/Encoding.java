package com.google.android.datatransport;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class Encoding {
    public final String name;

    public Encoding(String str) {
        if (str != null) {
            this.name = str;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("name is null");
            throw null;
        }
    }

    public static Encoding of() {
        return new Encoding("proto");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.name.equals(((Encoding) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Encoding{name=\""), this.name, "\"}");
    }
}
