package defpackage;

/* loaded from: classes3.dex */
public final class ga implements ha {
    public static final ga a = new ga();
    public static final IllegalStateException b = new IllegalStateException("Access restricted: this content is marked as explicit. Verify age restrictions or account settings");

    @Override // defpackage.ha
    public final Throwable a() {
        return b;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ga);
    }

    public final int hashCode() {
        return -429340733;
    }

    public final String toString() {
        return "Explicit";
    }
}
