package com.gamericefishpro.space.t7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.b7.a {
    public final boolean a;
    public final com.gamericefishpro.space.h7.a b;
    public final boolean c;

    public c(boolean z, com.gamericefishpro.space.h7.a aVar, boolean z2) {
        this.a = z;
        this.b = aVar;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && Intrinsics.a(this.b, cVar.b) && this.c == cVar.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        com.gamericefishpro.space.h7.a aVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        return "SplashUiState(isLoading=" + this.a + ", startupParams=" + this.b + ", isOnboarded=" + this.c + ")";
    }
}
