package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gmp extends Handler {
    public boolean a;
    public long b;
    public final ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmp(Looper looper) {
        super(looper);
        looper.getClass();
        this.c = new ArrayList();
    }

    public final void a() {
        Log.d("SessionLifecycleService", "Broadcasting new session");
        zlp zlpVar = (zlp) ((t77) ((tec) aec.d().b(tec.class))).k.get();
        plp plpVar = ((amp) ((t77) ((tec) aec.d().b(tec.class))).m.get()).e;
        if (plpVar == null) {
            Intrinsics.j("currentSession");
            throw null;
        }
        zlpVar.getClass();
        x97.y(gld.e(zlpVar.e), null, null, new f44(zlpVar, plpVar, (Continuation) null), 3);
        Iterator it = new ArrayList(this.c).iterator();
        while (it.hasNext()) {
            Messenger messenger = (Messenger) it.next();
            messenger.getClass();
            b(messenger);
        }
    }

    public final void b(Messenger messenger) {
        try {
            if (this.a) {
                plp plpVar = ((amp) ((t77) ((tec) aec.d().b(tec.class))).m.get()).e;
                if (plpVar != null) {
                    d(messenger, plpVar.a);
                    return;
                } else {
                    Intrinsics.j("currentSession");
                    throw null;
                }
            }
            vec vecVar = (vec) ((llp) ((flp) ((t77) ((tec) aec.d().b(tec.class))).j.get())).c.get();
            String str = vecVar != null ? vecVar.a : null;
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (str != null) {
                d(messenger, str);
            }
        } catch (IllegalStateException e) {
            Log.w("SessionLifecycleService", "Failed to send session to client.", e);
        }
    }

    public final void c() {
        try {
            amp ampVar = (amp) ((t77) ((tec) aec.d().b(tec.class))).m.get();
            int i = ampVar.d + 1;
            ampVar.d = i;
            String a = i == 0 ? ampVar.c : ampVar.a();
            String str = ampVar.c;
            int i2 = ampVar.d;
            ampVar.a.getClass();
            ampVar.e = new plp(i2, a, str, System.currentTimeMillis() * 1000);
            Log.d("SessionLifecycleService", "Generated new session.");
            a();
            flp flpVar = (flp) ((t77) ((tec) aec.d().b(tec.class))).j.get();
            plp plpVar = ((amp) ((t77) ((tec) aec.d().b(tec.class))).m.get()).e;
            Continuation continuation = null;
            if (plpVar == null) {
                Intrinsics.j("currentSession");
                throw null;
            }
            String str2 = plpVar.a;
            llp llpVar = (llp) flpVar;
            llpVar.getClass();
            str2.getClass();
            x97.y(gld.e(llpVar.a), null, null, new v5p(llpVar, str2, continuation, 4), 3);
        } catch (IllegalStateException e) {
            Log.w("SessionLifecycleService", "Failed to generate new session.", e);
        }
    }

    public final void d(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0103, code lost:
    
        if (defpackage.nsa.l(r4) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011a, code lost:
    
        if (defpackage.nsa.l(r4) == false) goto L36;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        long M;
        message.getClass();
        if (this.b > message.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.b + '.');
            return;
        }
        int i = message.what;
        if (i == 1) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (this.a) {
                long when = message.getWhen() - this.b;
                lnp lnpVar = (lnp) ((t77) ((tec) aec.d().b(tec.class))).h.get();
                nsa b = lnpVar.a.b();
                if (b != null) {
                    M = b.a;
                    if (nsa.m(M)) {
                    }
                }
                nsa b2 = lnpVar.b.b();
                if (b2 != null) {
                    M = b2.a;
                    if (nsa.m(M)) {
                    }
                }
                msa msaVar = nsa.b;
                M = yd5.M(30, ssa.MINUTES);
                if (when > nsa.f(M)) {
                    Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                    c();
                }
            } else {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.a = true;
                c();
            }
            this.b = message.getWhen();
            return;
        }
        if (i == 2) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.b = message.getWhen();
            return;
        }
        if (i != 4) {
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
            super.handleMessage(message);
            return;
        }
        Messenger messenger = message.replyTo;
        ArrayList arrayList = this.c;
        arrayList.add(messenger);
        Messenger messenger2 = message.replyTo;
        messenger2.getClass();
        b(messenger2);
        Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + arrayList.size());
    }
}
