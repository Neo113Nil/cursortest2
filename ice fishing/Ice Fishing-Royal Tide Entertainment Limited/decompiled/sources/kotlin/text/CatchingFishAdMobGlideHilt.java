package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAdMobGlideHilt extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishViewModelFAB;
    public final float CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    public CatchingFishAdMobGlideHilt(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
        this.CatchingFishDaggerWebsocket = f3;
        this.CatchingFishWorkManager = f4;
        this.CatchingFishViewModelScope = f5;
        this.CatchingFishViewModelFAB = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishAdMobGlideHilt)) {
            return false;
        }
        CatchingFishAdMobGlideHilt catchingFishAdMobGlideHilt = (CatchingFishAdMobGlideHilt) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishAdMobGlideHilt.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishAdMobGlideHilt.CatchingFishReduxKtor) == 0 && Float.compare(this.CatchingFishDaggerWebsocket, catchingFishAdMobGlideHilt.CatchingFishDaggerWebsocket) == 0 && Float.compare(this.CatchingFishWorkManager, catchingFishAdMobGlideHilt.CatchingFishWorkManager) == 0 && Float.compare(this.CatchingFishViewModelScope, catchingFishAdMobGlideHilt.CatchingFishViewModelScope) == 0 && Float.compare(this.CatchingFishViewModelFAB, catchingFishAdMobGlideHilt.CatchingFishViewModelFAB) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishViewModelFAB) + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishViewModelScope, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishWorkManager, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishReduxKtor, Float.hashCode(this.CatchingFishCoroutine) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", dy1=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", dx2=");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append(", dy2=");
        sb.append(this.CatchingFishWorkManager);
        sb.append(", dx3=");
        sb.append(this.CatchingFishViewModelScope);
        sb.append(", dy3=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishViewModelFAB, ')');
    }
}
