package kotlin.text;

import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishPayPalGraphQL implements Map.Entry {
    public final Object CatchingFishDaggerWebsocket;
    public final Object CatchingFishReduxKtor;
    public CatchingFishPayPalGraphQL CatchingFishViewModelScope;
    public CatchingFishPayPalGraphQL CatchingFishWorkManager;

    public CatchingFishPayPalGraphQL(Object obj, Object obj2) {
        this.CatchingFishReduxKtor = obj;
        this.CatchingFishDaggerWebsocket = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishPayPalGraphQL)) {
            return false;
        }
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = (CatchingFishPayPalGraphQL) obj;
        return this.CatchingFishReduxKtor.equals(catchingFishPayPalGraphQL.CatchingFishReduxKtor) && this.CatchingFishDaggerWebsocket.equals(catchingFishPayPalGraphQL.CatchingFishDaggerWebsocket);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.CatchingFishReduxKtor;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode() ^ this.CatchingFishDaggerWebsocket.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.CatchingFishReduxKtor + "=" + this.CatchingFishDaggerWebsocket;
    }
}
