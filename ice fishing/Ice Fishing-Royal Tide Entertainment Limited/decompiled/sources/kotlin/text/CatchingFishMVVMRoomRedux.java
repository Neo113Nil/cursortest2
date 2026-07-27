package kotlin.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMVVMRoomRedux implements Runnable {
    public final /* synthetic */ CatchingFishMVPGsonMockk CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVVMRoomRedux(CatchingFishMVPGsonMockk catchingFishMVPGsonMockk, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishMVPGsonMockk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                CatchingFishMVPGsonMockk catchingFishMVPGsonMockk = this.CatchingFishDaggerWebsocket;
                synchronized (catchingFishMVPGsonMockk) {
                    if (catchingFishMVPGsonMockk.CatchingFishParcelableFAB == 1) {
                        catchingFishMVPGsonMockk.CatchingFishParcelableFAB("Timed out while binding");
                    }
                }
                return;
            default:
                this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB("Service disconnected");
                return;
        }
        while (true) {
            CatchingFishMVPGsonMockk catchingFishMVPGsonMockk2 = this.CatchingFishDaggerWebsocket;
            synchronized (catchingFishMVPGsonMockk2) {
                try {
                    if (catchingFishMVPGsonMockk2.CatchingFishParcelableFAB != 2) {
                        return;
                    }
                    if (catchingFishMVPGsonMockk2.CatchingFishReduxKtor.isEmpty()) {
                        catchingFishMVPGsonMockk2.CatchingFishCoroutine();
                        return;
                    }
                    CatchingFishFluxKtor catchingFishFluxKtor = (CatchingFishFluxKtor) catchingFishMVPGsonMockk2.CatchingFishReduxKtor.poll();
                    catchingFishMVPGsonMockk2.CatchingFishDaggerWebsocket.put(catchingFishFluxKtor.CatchingFishParcelableFAB, catchingFishFluxKtor);
                    ((ScheduledExecutorService) catchingFishMVPGsonMockk2.CatchingFishWorkManager.CatchingFishCoroutine).schedule(new CatchingFishGsonRealmMoshi(10, catchingFishMVPGsonMockk2, catchingFishFluxKtor, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(catchingFishFluxKtor));
                    }
                    CatchingFishFluxFirebase catchingFishFluxFirebase = catchingFishMVPGsonMockk2.CatchingFishWorkManager;
                    Messenger messenger = catchingFishMVPGsonMockk2.CatchingFishSnackbar;
                    int i = catchingFishFluxKtor.CatchingFishCoroutine;
                    Context context = (Context) catchingFishFluxFirebase.CatchingFishSnackbar;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = catchingFishFluxKtor.CatchingFishParcelableFAB;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", catchingFishFluxKtor.CatchingFishParcelableFAB());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", catchingFishFluxKtor.CatchingFishReduxKtor);
                    obtain.setData(bundle);
                    try {
                        CatchingFishContextPicasso catchingFishContextPicasso = catchingFishMVPGsonMockk2.CatchingFishCoroutine;
                        Messenger messenger2 = (Messenger) catchingFishContextPicasso.CatchingFishReduxKtor;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            CatchingFishDaggerGraphQL catchingFishDaggerGraphQL = (CatchingFishDaggerGraphQL) catchingFishContextPicasso.CatchingFishDaggerWebsocket;
                            if (catchingFishDaggerGraphQL == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = catchingFishDaggerGraphQL.CatchingFishReduxKtor;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        catchingFishMVPGsonMockk2.CatchingFishParcelableFAB(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
