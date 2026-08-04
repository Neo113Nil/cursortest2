package com.gamericefishpro.space.ei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends d implements com.gamericefishpro.space.ki.d {
    public final boolean z;

    public v() {
        this.z = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return f().equals(vVar.f()) && e().equals(vVar.e()) && g().equals(vVar.g()) && Intrinsics.a(this.e, vVar.e);
        }
        if (obj instanceof com.gamericefishpro.space.ki.d) {
            return obj.equals(h());
        }
        return false;
    }

    public final com.gamericefishpro.space.ki.a h() {
        if (this.z) {
            return this;
        }
        com.gamericefishpro.space.ki.a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        com.gamericefishpro.space.ki.a aVarD = d();
        this.d = aVarD;
        return aVarD;
    }

    public final int hashCode() {
        return g().hashCode() + ((e().hashCode() + (f().hashCode() * 31)) * 31);
    }

    public final com.gamericefishpro.space.ki.d i() {
        if (this.z) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        com.gamericefishpro.space.ki.a aVarH = h();
        if (aVarH != this) {
            return (com.gamericefishpro.space.ki.d) aVarH;
        }
        throw new com.gamericefishpro.space.ci.a();
    }

    public final String toString() {
        com.gamericefishpro.space.ki.a aVarH = h();
        if (aVarH != this) {
            return aVarH.toString();
        }
        return "property " + e() + " (Kotlin reflection is not available)";
    }

    public v(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.z = false;
    }
}
