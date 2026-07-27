package q0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.h;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4862b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f39970a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4862b(List topics) {
        h.e(topics, "topics");
        this.f39970a = (AbstractCollection) topics;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4862b)) {
            return false;
        }
        ?? r02 = this.f39970a;
        C4862b c4862b = (C4862b) obj;
        if (r02.size() != c4862b.f39970a.size()) {
            return false;
        }
        return new HashSet((Collection) r02).equals(new HashSet(c4862b.f39970a));
    }

    public final int hashCode() {
        return Objects.hash(this.f39970a);
    }

    public final String toString() {
        return "Topics=" + this.f39970a;
    }
}
