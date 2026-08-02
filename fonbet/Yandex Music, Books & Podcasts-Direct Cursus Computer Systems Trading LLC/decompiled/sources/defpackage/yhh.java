package defpackage;

import android.os.IBinder;
import android.os.Messenger;

/* loaded from: classes.dex */
public final class yhh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4b b;
    public final /* synthetic */ n7b c;

    public /* synthetic */ yhh(n7b n7bVar, h4b h4bVar, int i) {
        this.a = i;
        this.c = n7bVar;
        this.b = h4bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                khh khhVar = (khh) ((bih) this.c.a).d.remove(((Messenger) this.b.a).getBinder());
                if (khhVar != null) {
                    ((Messenger) khhVar.d.a).getBinder().unlinkToDeath(khhVar, 0);
                    break;
                }
                break;
            default:
                IBinder binder = ((Messenger) this.b.a).getBinder();
                khh khhVar2 = (khh) ((bih) this.c.a).d.remove(binder);
                if (khhVar2 != null) {
                    binder.unlinkToDeath(khhVar2, 0);
                    break;
                }
                break;
        }
    }
}
