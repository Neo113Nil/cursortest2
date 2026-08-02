package defpackage;

import android.os.IBinder;
import android.os.Messenger;

/* loaded from: classes.dex */
public final class xhh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mka b;
    public final /* synthetic */ awc c;

    public /* synthetic */ xhh(awc awcVar, mka mkaVar, int i) {
        this.a = i;
        this.c = awcVar;
        this.b = mkaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jhh jhhVar = (jhh) ((nuh) this.c.a).e.remove(((Messenger) this.b.a).getBinder());
                if (jhhVar != null) {
                    mka mkaVar = jhhVar.e;
                    mkaVar.getClass();
                    ((Messenger) mkaVar.a).getBinder().unlinkToDeath(jhhVar, 0);
                    break;
                }
                break;
            default:
                IBinder binder = ((Messenger) this.b.a).getBinder();
                jhh jhhVar2 = (jhh) ((nuh) this.c.a).e.remove(binder);
                if (jhhVar2 != null) {
                    binder.unlinkToDeath(jhhVar2, 0);
                    break;
                }
                break;
        }
    }
}
