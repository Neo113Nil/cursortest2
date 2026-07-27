package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitRetrofit {
    public int CatchingFishDaggerWebsocket;
    public CatchingFishWebsocket[] CatchingFishReduxKtor;
    public CatchingFishRoomPayPalKtor CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public final CatchingFishWebsocket CatchingFishParcelableFAB() {
        CatchingFishWebsocket catchingFishWebsocket;
        CatchingFishRoomPayPalKtor catchingFishRoomPayPalKtor;
        synchronized (this) {
            try {
                CatchingFishWebsocket[] catchingFishWebsocketArr = this.CatchingFishReduxKtor;
                if (catchingFishWebsocketArr == null) {
                    catchingFishWebsocketArr = CatchingFishReduxKtor();
                    this.CatchingFishReduxKtor = catchingFishWebsocketArr;
                } else if (this.CatchingFishDaggerWebsocket >= catchingFishWebsocketArr.length) {
                    Object[] copyOf = Arrays.copyOf(catchingFishWebsocketArr, catchingFishWebsocketArr.length * 2);
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
                    this.CatchingFishReduxKtor = (CatchingFishWebsocket[]) copyOf;
                    catchingFishWebsocketArr = (CatchingFishWebsocket[]) copyOf;
                }
                int i = this.CatchingFishWorkManager;
                do {
                    catchingFishWebsocket = catchingFishWebsocketArr[i];
                    if (catchingFishWebsocket == null) {
                        catchingFishWebsocket = CatchingFishSnackbar();
                        catchingFishWebsocketArr[i] = catchingFishWebsocket;
                    }
                    i++;
                    if (i >= catchingFishWebsocketArr.length) {
                        i = 0;
                    }
                } while (!catchingFishWebsocket.CatchingFishParcelableFAB(this));
                this.CatchingFishWorkManager = i;
                this.CatchingFishDaggerWebsocket++;
                catchingFishRoomPayPalKtor = this.CatchingFishViewModelScope;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (catchingFishRoomPayPalKtor != null) {
            catchingFishRoomPayPalKtor.CatchingFishRoomDatabase(1);
        }
        return catchingFishWebsocket;
    }

    public abstract CatchingFishWebsocket[] CatchingFishReduxKtor();

    public abstract CatchingFishWebsocket CatchingFishSnackbar();

    public final CatchingFishRoomPayPalKtor CatchingFishViewModelScope() {
        CatchingFishRoomPayPalKtor catchingFishRoomPayPalKtor;
        synchronized (this) {
            catchingFishRoomPayPalKtor = this.CatchingFishViewModelScope;
            if (catchingFishRoomPayPalKtor == null) {
                catchingFishRoomPayPalKtor = new CatchingFishRoomPayPalKtor(this.CatchingFishDaggerWebsocket);
                this.CatchingFishViewModelScope = catchingFishRoomPayPalKtor;
            }
        }
        return catchingFishRoomPayPalKtor;
    }

    public final void CatchingFishWorkManager(CatchingFishWebsocket catchingFishWebsocket) {
        CatchingFishRoomPayPalKtor catchingFishRoomPayPalKtor;
        int i;
        CatchingFishWebsocketGradle[] CatchingFishSnackbar;
        synchronized (this) {
            try {
                int i2 = this.CatchingFishDaggerWebsocket - 1;
                this.CatchingFishDaggerWebsocket = i2;
                catchingFishRoomPayPalKtor = this.CatchingFishViewModelScope;
                if (i2 == 0) {
                    this.CatchingFishWorkManager = 0;
                }
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishWebsocket, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                CatchingFishSnackbar = catchingFishWebsocket.CatchingFishSnackbar(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (CatchingFishWebsocketGradle catchingFishWebsocketGradle : CatchingFishSnackbar) {
            if (catchingFishWebsocketGradle != null) {
                catchingFishWebsocketGradle.CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
            }
        }
        if (catchingFishRoomPayPalKtor != null) {
            catchingFishRoomPayPalKtor.CatchingFishRoomDatabase(-1);
        }
    }
}
