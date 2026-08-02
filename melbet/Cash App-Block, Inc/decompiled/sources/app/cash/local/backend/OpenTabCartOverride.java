package app.cash.local.backend;

import com.squareup.protos.cash.local.client.v1.LocalCart;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OpenTabCartOverride {
    public final LocalCart cart;
    public final String staleBuyerInfoCartVersion;
    public final String submittedCartVersion;

    public OpenTabCartOverride(LocalCart localCart, String str, String str2) {
        localCart.getClass();
        this.cart = localCart;
        this.staleBuyerInfoCartVersion = str;
        this.submittedCartVersion = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenTabCartOverride)) {
            return false;
        }
        OpenTabCartOverride openTabCartOverride = (OpenTabCartOverride) obj;
        return Intrinsics.areEqual(this.cart, openTabCartOverride.cart) && Intrinsics.areEqual(this.staleBuyerInfoCartVersion, openTabCartOverride.staleBuyerInfoCartVersion) && Intrinsics.areEqual(this.submittedCartVersion, openTabCartOverride.submittedCartVersion);
    }

    public final int hashCode() {
        int hashCode = this.cart.hashCode() * 31;
        String str = this.staleBuyerInfoCartVersion;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.submittedCartVersion;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenTabCartOverride(cart=");
        sb.append(this.cart);
        sb.append(", staleBuyerInfoCartVersion=");
        sb.append(this.staleBuyerInfoCartVersion);
        sb.append(", submittedCartVersion=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.submittedCartVersion, ")");
    }
}
