package kotlin.text;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CatchingFishGlideAdMobMVI {
    public static final Pattern CatchingFishFragmentHandler = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public static PendingIntent CatchingFishLayout;
    public static int CatchingFishViewModelFAB;
    public final CatchingFishMVIContext CatchingFishCoroutine;
    public final ScheduledThreadPoolExecutor CatchingFishReduxKtor;
    public final Context CatchingFishSnackbar;
    public CatchingFishDaggerGraphQL CatchingFishViewModelScope;
    public Messenger CatchingFishWorkManager;
    public final CatchingFishGraphQLRealmFAB CatchingFishParcelableFAB = new CatchingFishGraphQLRealmFAB(0);
    public final Messenger CatchingFishDaggerWebsocket = new Messenger(new CatchingFishFABGlideDagger(this, Looper.getMainLooper()));

    public CatchingFishGlideAdMobMVI(Context context) {
        this.CatchingFishSnackbar = context;
        this.CatchingFishCoroutine = new CatchingFishMVIContext(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.CatchingFishReduxKtor = scheduledThreadPoolExecutor;
    }

    public final CatchingFishWorkManagerMVP CatchingFishParcelableFAB(Bundle bundle) {
        String num;
        synchronized (CatchingFishGlideAdMobMVI.class) {
            int i = CatchingFishViewModelFAB;
            CatchingFishViewModelFAB = i + 1;
            num = Integer.toString(i);
        }
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = new CatchingFishAndroidXPayPal();
        synchronized (this.CatchingFishParcelableFAB) {
            this.CatchingFishParcelableFAB.put(num, catchingFishAndroidXPayPal);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.CatchingFishCoroutine.CatchingFishReduxKtor() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.CatchingFishSnackbar;
        synchronized (CatchingFishGlideAdMobMVI.class) {
            try {
                if (CatchingFishLayout == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    CatchingFishLayout = PendingIntent.getBroadcast(context, 0, intent2, CatchingFishJUnitRoomToast.CatchingFishParcelableFAB);
                }
                intent.putExtra("app", CatchingFishLayout);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.CatchingFishDaggerWebsocket);
        if (this.CatchingFishWorkManager != null || this.CatchingFishViewModelScope != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.CatchingFishWorkManager;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.CatchingFishViewModelScope.CatchingFishReduxKtor;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
            }
            catchingFishAndroidXPayPal.CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishToastGraphQLMVP.CatchingFishWorkManager, new CatchingFishAsyncTaskDagger(this, num, this.CatchingFishReduxKtor.schedule(new CatchingFishGsonRealm(25, catchingFishAndroidXPayPal), 30L, TimeUnit.SECONDS), 28));
            return catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
        }
        if (this.CatchingFishCoroutine.CatchingFishReduxKtor() == 2) {
            this.CatchingFishSnackbar.sendBroadcast(intent);
        } else {
            this.CatchingFishSnackbar.startService(intent);
        }
        catchingFishAndroidXPayPal.CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishToastGraphQLMVP.CatchingFishWorkManager, new CatchingFishAsyncTaskDagger(this, num, this.CatchingFishReduxKtor.schedule(new CatchingFishGsonRealm(25, catchingFishAndroidXPayPal), 30L, TimeUnit.SECONDS), 28));
        return catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
    }

    public final void CatchingFishSnackbar(String str, Bundle bundle) {
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = (CatchingFishAndroidXPayPal) this.CatchingFishParcelableFAB.remove(str);
                if (catchingFishAndroidXPayPal == null) {
                    return;
                }
                catchingFishAndroidXPayPal.CatchingFishParcelableFAB(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
