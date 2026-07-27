package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class CatchingFishXMLLayoutBundle implements CatchingFishMVVMDataStore, Serializable {
    public final Object CatchingFishDaggerWebsocket;
    public final boolean CatchingFishLayout;
    public transient CatchingFishMVVMDataStore CatchingFishReduxKtor;
    public final String CatchingFishViewModelFAB;
    public final String CatchingFishViewModelScope;
    public final Class CatchingFishWorkManager;

    public CatchingFishXMLLayoutBundle(Object obj, Class cls, String str, String str2, boolean z) {
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = cls;
        this.CatchingFishViewModelScope = str;
        this.CatchingFishViewModelFAB = str2;
        this.CatchingFishLayout = z;
    }

    public final CatchingFishViewPicasso CatchingFishViewModelScope() {
        boolean z = this.CatchingFishLayout;
        Class cls = this.CatchingFishWorkManager;
        if (!z) {
            return CatchingFishContextFlux.CatchingFishParcelableFAB(cls);
        }
        CatchingFishContextFlux.CatchingFishParcelableFAB.getClass();
        return new CatchingFishGraphQLService(cls);
    }

    public abstract CatchingFishMVVMDataStore CatchingFishWorkManager();
}
