package app.cash.local.presenters.internal;

import app.cash.local.backend.OpenTabCartOverride;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ActiveOpenTabCartResolution {
    public final LocalCart activeCart;
    public final OpenTabCartOverride overrideToClear;

    public ActiveOpenTabCartResolution(LocalCart localCart, OpenTabCartOverride openTabCartOverride) {
        this.activeCart = localCart;
        this.overrideToClear = openTabCartOverride;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveOpenTabCartResolution)) {
            return false;
        }
        ActiveOpenTabCartResolution activeOpenTabCartResolution = (ActiveOpenTabCartResolution) obj;
        return Intrinsics.areEqual(this.activeCart, activeOpenTabCartResolution.activeCart) && Intrinsics.areEqual(this.overrideToClear, activeOpenTabCartResolution.overrideToClear);
    }

    public final int hashCode() {
        LocalCart localCart = this.activeCart;
        int hashCode = (localCart == null ? 0 : localCart.hashCode()) * 31;
        OpenTabCartOverride openTabCartOverride = this.overrideToClear;
        return hashCode + (openTabCartOverride != null ? openTabCartOverride.hashCode() : 0);
    }

    public final String toString() {
        return "ActiveOpenTabCartResolution(activeCart=" + this.activeCart + ", overrideToClear=" + this.overrideToClear + ")";
    }
}
