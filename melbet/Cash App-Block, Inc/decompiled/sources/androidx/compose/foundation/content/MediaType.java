package androidx.compose.foundation.content;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class MediaType {
    public final String representation;
    public static final MediaType Text = new MediaType("text/*");
    public static final MediaType All = new MediaType("*/*");

    public MediaType(String str) {
        this.representation = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        return this.representation.equals(((MediaType) obj).representation);
    }

    public final String getRepresentation() {
        return this.representation;
    }

    public final int hashCode() {
        return this.representation.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("MediaType(representation='"), this.representation, "')");
    }
}
