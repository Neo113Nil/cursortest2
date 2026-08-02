package defpackage;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f9b {
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;
    public final LinkedHashSet e;
    public final LinkedHashSet f;

    public /* synthetic */ f9b() {
        this(new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet());
    }

    public final f9b a(f9b f9bVar) {
        f9bVar.getClass();
        return new f9b(CollectionsKt.z0(wop.i(this.a, f9bVar.a)), CollectionsKt.z0(wop.i(this.b, f9bVar.b)), CollectionsKt.z0(wop.i(this.c, f9bVar.c)), CollectionsKt.z0(wop.i(this.d, f9bVar.d)), CollectionsKt.z0(wop.i(this.e, f9bVar.e)), CollectionsKt.z0(wop.i(this.f, f9bVar.f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9b)) {
            return false;
        }
        f9b f9bVar = (f9b) obj;
        return Intrinsics.d(this.a, f9bVar.a) && Intrinsics.d(this.b, f9bVar.b) && Intrinsics.d(this.c, f9bVar.c) && Intrinsics.d(this.d, f9bVar.d) && Intrinsics.d(this.e, f9bVar.e) && Intrinsics.d(this.f, f9bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Entities(trackIds=" + this.a + ", albumIds=" + this.b + ", artistIds=" + this.c + ", playlistIds=" + this.d + ", presavesIds=" + this.e + ", videoClipIds=" + this.f + ")";
    }

    public f9b(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, LinkedHashSet linkedHashSet5, LinkedHashSet linkedHashSet6) {
        this.a = linkedHashSet;
        this.b = linkedHashSet2;
        this.c = linkedHashSet3;
        this.d = linkedHashSet4;
        this.e = linkedHashSet5;
        this.f = linkedHashSet6;
    }
}
