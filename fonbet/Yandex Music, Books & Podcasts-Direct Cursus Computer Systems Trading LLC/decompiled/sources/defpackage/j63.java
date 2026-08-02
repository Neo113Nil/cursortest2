package defpackage;

import java.util.HashSet;

/* loaded from: classes4.dex */
public final class j63 implements k63 {
    public final HashSet a;

    public j63(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j63) && this.a.equals(((j63) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PreSavesBlockLocalData(presaveIds=" + this.a + ")";
    }
}
