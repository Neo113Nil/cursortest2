package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class bhh extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ ime a;

    public bhh(ime imeVar) {
        this.a = imeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [d9e] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        a9e a9eVar;
        ime imeVar = this.a;
        chh chhVar = (chh) imeVar.c;
        boolean z = false;
        boolean z2 = false;
        if (chhVar != null) {
            ahh ahhVar = chhVar.d;
            MediaBrowser mediaBrowser = chhVar.b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = chhVar.c;
                        pv9 pv9Var = new pv9(18, z);
                        Messenger messenger = new Messenger(binder);
                        pv9Var.b = messenger;
                        chhVar.f = pv9Var;
                        Messenger messenger2 = new Messenger(ahhVar);
                        chhVar.g = messenger2;
                        ahhVar.getClass();
                        ahhVar.c = new WeakReference(messenger2);
                        try {
                            Context context = chhVar.a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_package_name", context.getPackageName());
                            bundle2.putInt("data_calling_pid", Process.myPid());
                            bundle2.putBundle("data_root_hints", bundle);
                            Message obtain = Message.obtain();
                            obtain.what = 6;
                            obtain.arg1 = 1;
                            obtain.setData(bundle2);
                            obtain.replyTo = messenger2;
                            messenger.send(obtain);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i = csh.h;
                    if (binder2 == null) {
                        a9eVar = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof d9e)) {
                            a9e a9eVar2 = new a9e();
                            a9eVar2.a = binder2;
                            a9eVar = a9eVar2;
                        } else {
                            a9eVar = (d9e) queryLocalInterface;
                        }
                    }
                    if (a9eVar != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        vq1.A(sessionToken != null);
                        if (sessionToken == null) {
                            xq0.x("token is not a valid MediaSession.Token object");
                            return;
                        }
                        chhVar.h = new msh(sessionToken, a9eVar);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        bmh bmhVar = (bmh) imeVar.d;
        fhh fhhVar = bmhVar.j;
        if (fhhVar != null) {
            chh chhVar2 = fhhVar.a;
            if (chhVar2.h == null) {
                MediaSession.Token sessionToken2 = chhVar2.b.getSessionToken();
                vq1.A(sessionToken2 != null);
                if (sessionToken2 == null) {
                    xq0.x("token is not a valid MediaSession.Token object");
                    return;
                }
                chhVar2.h = new msh(sessionToken2, null);
            }
            msh mshVar = chhVar2.h;
            kkh kkhVar = bmhVar.b;
            kkhVar.j1(new juc(15, bmhVar, mshVar));
            kkhVar.e.post(new xlh(bmhVar, z2 ? 1 : 0));
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        ((bmh) this.a.d).b.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        ime imeVar = this.a;
        chh chhVar = (chh) imeVar.c;
        if (chhVar != null) {
            chhVar.f = null;
            chhVar.g = null;
            chhVar.h = null;
            ahh ahhVar = chhVar.d;
            ahhVar.getClass();
            ahhVar.c = new WeakReference(null);
        }
        ((bmh) imeVar.d).b.a();
    }
}
