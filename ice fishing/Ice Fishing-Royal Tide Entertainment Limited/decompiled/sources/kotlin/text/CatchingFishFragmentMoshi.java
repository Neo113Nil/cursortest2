package kotlin.text;

import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishFragmentMoshi implements Map.Entry, Comparable {
    public Object CatchingFishDaggerWebsocket;
    public final Comparable CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishDaggerHiltToast CatchingFishWorkManager;

    public CatchingFishFragmentMoshi(CatchingFishDaggerHiltToast catchingFishDaggerHiltToast, Comparable comparable, Object obj) {
        this.CatchingFishWorkManager = catchingFishDaggerHiltToast;
        this.CatchingFishReduxKtor = comparable;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.CatchingFishReduxKtor.compareTo(((CatchingFishFragmentMoshi) obj).CatchingFishReduxKtor);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.CatchingFishReduxKtor;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.CatchingFishDaggerWebsocket;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
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
        Comparable comparable = this.CatchingFishReduxKtor;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.CatchingFishDaggerWebsocket;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.CatchingFishWorkManager.CatchingFishSnackbar();
        Object obj2 = this.CatchingFishDaggerWebsocket;
        this.CatchingFishDaggerWebsocket = obj;
        return obj2;
    }

    public final String toString() {
        return this.CatchingFishReduxKtor + "=" + this.CatchingFishDaggerWebsocket;
    }
}
