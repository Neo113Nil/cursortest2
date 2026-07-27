package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishCameraXRetrofit extends CatchingFishGraphQLRealmFAB implements Map {
    public CatchingFishMVPAndroidX CatchingFishLayout;
    public CatchingFishLayoutFirebase CatchingFishViewModelFAB;
    public CatchingFishMVPGlideMVP CatchingFishViewModelScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishCameraXRetrofit(CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB) {
        super(0);
        int i = catchingFishGraphQLRealmFAB.CatchingFishWorkManager;
        CatchingFishSnackbar(this.CatchingFishWorkManager + i);
        if (this.CatchingFishWorkManager != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(catchingFishGraphQLRealmFAB.CatchingFishWorkManager(i2), catchingFishGraphQLRealmFAB.CatchingFishLayout(i2));
            }
        } else if (i > 0) {
            CatchingFishMVVMHilt.CatchingFishParcelable(0, 0, i, catchingFishGraphQLRealmFAB.CatchingFishReduxKtor, this.CatchingFishReduxKtor);
            CatchingFishMVVMHilt.CatchingFishAppCompat(catchingFishGraphQLRealmFAB.CatchingFishDaggerWebsocket, this.CatchingFishDaggerWebsocket, 0, 0, i << 1);
            this.CatchingFishWorkManager = i;
        }
    }

    public final boolean CatchingFishCloudMessaging(Collection collection) {
        int i = this.CatchingFishWorkManager;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.CatchingFishWorkManager;
    }

    public final boolean CatchingFishFragmentHandler(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        CatchingFishMVPGlideMVP catchingFishMVPGlideMVP = this.CatchingFishViewModelScope;
        if (catchingFishMVPGlideMVP != null) {
            return catchingFishMVPGlideMVP;
        }
        CatchingFishMVPGlideMVP catchingFishMVPGlideMVP2 = new CatchingFishMVPGlideMVP(this, 0);
        this.CatchingFishViewModelScope = catchingFishMVPGlideMVP2;
        return catchingFishMVPGlideMVP2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        CatchingFishLayoutFirebase catchingFishLayoutFirebase = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutFirebase != null) {
            return catchingFishLayoutFirebase;
        }
        CatchingFishLayoutFirebase catchingFishLayoutFirebase2 = new CatchingFishLayoutFirebase(this);
        this.CatchingFishViewModelFAB = catchingFishLayoutFirebase2;
        return catchingFishLayoutFirebase2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        CatchingFishSnackbar(map.size() + this.CatchingFishWorkManager);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        CatchingFishMVPAndroidX catchingFishMVPAndroidX = this.CatchingFishLayout;
        if (catchingFishMVPAndroidX != null) {
            return catchingFishMVPAndroidX;
        }
        CatchingFishMVPAndroidX catchingFishMVPAndroidX2 = new CatchingFishMVPAndroidX(this);
        this.CatchingFishLayout = catchingFishMVPAndroidX2;
        return catchingFishMVPAndroidX2;
    }
}
