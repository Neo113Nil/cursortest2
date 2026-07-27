package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* loaded from: classes.dex */
public class CatchingFishOkHttpService implements Map.Entry, CatchingFishCardViewFAB {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishOkHttpService(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && CatchingFishFirebaseDagger.CatchingFishOkHttp(entry.getKey(), this.CatchingFishDaggerWebsocket) && CatchingFishFirebaseDagger.CatchingFishOkHttp(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.CatchingFishReduxKtor) {
        }
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.CatchingFishReduxKtor) {
        }
        return this.CatchingFishWorkManager;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object obj = this.CatchingFishDaggerWebsocket;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder();
                sb.append(this.CatchingFishDaggerWebsocket);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
