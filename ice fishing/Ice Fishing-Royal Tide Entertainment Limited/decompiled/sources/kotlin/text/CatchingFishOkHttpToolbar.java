package kotlin.text;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpToolbar extends CatchingFishSpannable implements CatchingFishMVPHiltFAB {
    public static final CatchingFishOkHttpToolbar CatchingFishViewModelScope;
    public final Object CatchingFishDaggerWebsocket;
    public final Object CatchingFishReduxKtor;
    public final CatchingFishLayoutViewAdMob CatchingFishWorkManager;

    static {
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = CatchingFishMVPExoPlayer.CatchingFishViewModelScope;
        CatchingFishViewModelScope = new CatchingFishOkHttpToolbar(catchingFishMVPExoPlayer, catchingFishMVPExoPlayer, CatchingFishLayoutViewAdMob.CatchingFishWorkManager);
    }

    public CatchingFishOkHttpToolbar(Object obj, Object obj2, CatchingFishLayoutViewAdMob catchingFishLayoutViewAdMob) {
        this.CatchingFishReduxKtor = obj;
        this.CatchingFishDaggerWebsocket = obj2;
        this.CatchingFishWorkManager = catchingFishLayoutViewAdMob;
    }

    @Override // kotlin.text.CatchingFishFirebase
    public final int CatchingFishParcelableFAB() {
        CatchingFishLayoutViewAdMob catchingFishLayoutViewAdMob = this.CatchingFishWorkManager;
        catchingFishLayoutViewAdMob.getClass();
        return catchingFishLayoutViewAdMob.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishFirebase, java.util.Collection
    public final boolean contains(Object obj) {
        return this.CatchingFishWorkManager.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new CatchingFishRetrofitLayout(this.CatchingFishReduxKtor, this.CatchingFishWorkManager);
    }
}
