package com.squareup.cash.sharedElements;

/* loaded from: classes6.dex */
public final class DiscoverTabSharedKey$SearchIcon {
    public final DiscoverTabSharedKey$Origin origin;

    public DiscoverTabSharedKey$SearchIcon(DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin) {
        discoverTabSharedKey$Origin.getClass();
        this.origin = discoverTabSharedKey$Origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DiscoverTabSharedKey$SearchIcon) && this.origin == ((DiscoverTabSharedKey$SearchIcon) obj).origin;
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "SearchIcon(origin=" + this.origin + ")";
    }
}
