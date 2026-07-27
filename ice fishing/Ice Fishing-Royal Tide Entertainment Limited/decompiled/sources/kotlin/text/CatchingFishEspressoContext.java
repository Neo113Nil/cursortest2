package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishEspressoContext implements CatchingFishMVPKtorWidget, CatchingFishMoshiJUnitRoom, CatchingFishRoomToolbar, CatchingFishSpannableFAB {
    public final Executor CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final Object CatchingFishViewModelScope;
    public final Object CatchingFishWorkManager;

    public CatchingFishEspressoContext(Executor executor, CatchingFishSpannableFAB catchingFishSpannableFAB) {
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishWorkManager = new Object();
        this.CatchingFishDaggerWebsocket = executor;
        this.CatchingFishViewModelScope = catchingFishSpannableFAB;
    }

    @Override // kotlin.text.CatchingFishRoomToolbar
    public void CatchingFishCoroutine(Exception exc) {
        ((CatchingFishWorkManagerMVP) this.CatchingFishViewModelScope).CatchingFishCloudMessaging(exc);
    }

    @Override // kotlin.text.CatchingFishSpannableFAB
    public void CatchingFishParcelableFAB() {
        ((CatchingFishWorkManagerMVP) this.CatchingFishViewModelScope).CatchingFishEspressoTesting();
    }

    @Override // kotlin.text.CatchingFishMVPKtorWidget
    public final void CatchingFishReduxKtor(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (catchingFishWorkManagerMVP.CatchingFishReduxKtor) {
                    synchronized (this.CatchingFishWorkManager) {
                        try {
                            if (((CatchingFishSpannableFAB) this.CatchingFishViewModelScope) != null) {
                                this.CatchingFishDaggerWebsocket.execute(new CatchingFishGsonRealm(26, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.CatchingFishWorkManager) {
                }
                this.CatchingFishDaggerWebsocket.execute(new CatchingFishGsonRealmMoshi(6, this, catchingFishWorkManagerMVP));
                return;
            case 2:
                if (catchingFishWorkManagerMVP.CatchingFishViewModelFAB() || catchingFishWorkManagerMVP.CatchingFishReduxKtor) {
                    return;
                }
                synchronized (this.CatchingFishWorkManager) {
                    try {
                        if (((CatchingFishRoomToolbar) this.CatchingFishViewModelScope) != null) {
                            this.CatchingFishDaggerWebsocket.execute(new CatchingFishGsonRealmMoshi(8, this, catchingFishWorkManagerMVP));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                if (catchingFishWorkManagerMVP.CatchingFishViewModelFAB()) {
                    synchronized (this.CatchingFishWorkManager) {
                        try {
                            if (((CatchingFishMoshiJUnitRoom) this.CatchingFishViewModelScope) != null) {
                                this.CatchingFishDaggerWebsocket.execute(new CatchingFishGsonRealmMoshi(9, this, catchingFishWorkManagerMVP));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.CatchingFishDaggerWebsocket.execute(new CatchingFishGsonRealmMoshi(11, this, catchingFishWorkManagerMVP));
                return;
        }
    }

    @Override // kotlin.text.CatchingFishMoshiJUnitRoom
    public void CatchingFishSnackbar(Object obj) {
        ((CatchingFishWorkManagerMVP) this.CatchingFishViewModelScope).CatchingFishFragmentHandler(obj);
    }

    public CatchingFishEspressoContext(Executor executor, CatchingFishFragmentFAB catchingFishFragmentFAB) {
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishWorkManager = new Object();
        this.CatchingFishDaggerWebsocket = executor;
        this.CatchingFishViewModelScope = catchingFishFragmentFAB;
    }

    public CatchingFishEspressoContext(Executor executor, CatchingFishRoomToolbar catchingFishRoomToolbar) {
        this.CatchingFishReduxKtor = 2;
        this.CatchingFishWorkManager = new Object();
        this.CatchingFishDaggerWebsocket = executor;
        this.CatchingFishViewModelScope = catchingFishRoomToolbar;
    }

    public CatchingFishEspressoContext(Executor executor, CatchingFishMoshiJUnitRoom catchingFishMoshiJUnitRoom) {
        this.CatchingFishReduxKtor = 3;
        this.CatchingFishWorkManager = new Object();
        this.CatchingFishDaggerWebsocket = executor;
        this.CatchingFishViewModelScope = catchingFishMoshiJUnitRoom;
    }

    public CatchingFishEspressoContext(Executor executor, CatchingFishReduxIntent catchingFishReduxIntent, CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        this.CatchingFishReduxKtor = 4;
        this.CatchingFishDaggerWebsocket = executor;
        this.CatchingFishWorkManager = catchingFishReduxIntent;
        this.CatchingFishViewModelScope = catchingFishWorkManagerMVP;
    }
}
