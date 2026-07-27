package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Hw implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25465a;

    public Hw(int i) {
        this.f25465a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Hw) && this.f25465a == ((Hw) obj).f25465a;
    }

    public final int hashCode() {
        return this.f25465a;
    }

    public final String toString() {
        int i = this.f25465a;
        return D.y.j(i, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i).length() + 19));
    }
}
