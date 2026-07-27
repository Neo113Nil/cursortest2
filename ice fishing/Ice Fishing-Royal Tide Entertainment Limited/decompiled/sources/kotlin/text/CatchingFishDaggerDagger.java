package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishDaggerDagger implements Iterator, CatchingFishCardViewFAB {
    public final CatchingFishMVVMMVIRoom CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 0;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishDaggerDagger(CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom, int i, int i2) {
        this.CatchingFishDaggerWebsocket = catchingFishMVVMMVIRoom;
        this.CatchingFishWorkManager = i2;
        this.CatchingFishViewModelScope = i;
        this.CatchingFishViewModelFAB = catchingFishMVVMMVIRoom.CatchingFishCloudMessaging;
        if (catchingFishMVVMMVIRoom.CatchingFishFragmentHandler) {
            CatchingFishMockkKtorGlide.CatchingFishWorkManager();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.CatchingFishViewModelScope < this.CatchingFishWorkManager;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom = this.CatchingFishDaggerWebsocket;
                int i = catchingFishMVVMMVIRoom.CatchingFishCloudMessaging;
                int i2 = this.CatchingFishViewModelFAB;
                if (i != i2) {
                    CatchingFishMockkKtorGlide.CatchingFishWorkManager();
                }
                int i3 = this.CatchingFishViewModelScope;
                this.CatchingFishViewModelScope = CatchingFishMockkKtorGlide.CatchingFishParcelableFAB(catchingFishMVVMMVIRoom.CatchingFishReduxKtor, i3) + i3;
                return new CatchingFishManifestGradle(catchingFishMVVMMVIRoom, i3, i2);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public CatchingFishDaggerDagger(CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom, int i, CatchingFishKtorHilt catchingFishKtorHilt, CatchingFishViewMVIMVVM catchingFishViewMVIMVVM) {
        this.CatchingFishDaggerWebsocket = catchingFishMVVMMVIRoom;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = catchingFishMVVMMVIRoom.CatchingFishCloudMessaging;
    }
}
