package com.squareup.cash.sharedElements;

/* loaded from: classes6.dex */
public final class DiscoverTabSharedKey$SearchBounds {
    public final DiscoverTabSharedKey$Origin origin;

    public DiscoverTabSharedKey$SearchBounds(DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin) {
        discoverTabSharedKey$Origin.getClass();
        this.origin = discoverTabSharedKey$Origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DiscoverTabSharedKey$SearchBounds) && this.origin == ((DiscoverTabSharedKey$SearchBounds) obj).origin;
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "SearchBounds(origin=" + this.origin + ")";
    }
}
