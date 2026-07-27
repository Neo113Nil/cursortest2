package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class CatchingFishMVPGlideMVP extends AbstractSet {
    public final /* synthetic */ Map CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVPGlideMVP(Map map, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((CatchingFishDaggerHiltToast) this.CatchingFishDaggerWebsocket).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                ((CatchingFishDaggerHiltToast) this.CatchingFishDaggerWebsocket).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((CatchingFishDaggerHiltToast) this.CatchingFishDaggerWebsocket).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishAndroidXIntent((CatchingFishCameraXRetrofit) this.CatchingFishDaggerWebsocket);
            default:
                return new CatchingFishWorkManagerMVI((CatchingFishDaggerHiltToast) this.CatchingFishDaggerWebsocket);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((CatchingFishDaggerHiltToast) this.CatchingFishDaggerWebsocket).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((CatchingFishCameraXRetrofit) this.CatchingFishDaggerWebsocket).CatchingFishWorkManager;
            default:
                return ((CatchingFishDaggerHiltToast) this.CatchingFishDaggerWebsocket).size();
        }
    }
}
