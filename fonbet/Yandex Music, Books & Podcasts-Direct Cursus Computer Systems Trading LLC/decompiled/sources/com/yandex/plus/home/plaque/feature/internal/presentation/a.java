package com.yandex.plus.home.plaque.feature.internal.presentation;

import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import defpackage.msa;
import defpackage.nsa;

/* loaded from: classes5.dex */
public final class a {
    public final j0 a;
    public final long b;

    public a(j0 j0Var, long j) {
        this.a = j0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && nsa.e(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        msa msaVar = nsa.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "PlaqueUiState(model=" + this.a + ", animationDuration=" + ((Object) nsa.t(this.b)) + ')';
    }
}
