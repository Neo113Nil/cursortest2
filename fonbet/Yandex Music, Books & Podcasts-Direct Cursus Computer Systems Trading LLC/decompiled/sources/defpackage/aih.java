package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;

/* loaded from: classes.dex */
public final class aih implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ h4b b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i8o d;
    public final /* synthetic */ n7b e;

    public aih(n7b n7bVar, h4b h4bVar, String str, i8o i8oVar) {
        this.e = n7bVar;
        this.b = h4bVar;
        this.c = str;
        this.d = i8oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                IBinder binder = ((Messenger) this.b.a).getBinder();
                n7b n7bVar = this.e;
                khh khhVar = (khh) ((bih) n7bVar.a).d.get(binder);
                String str = this.c;
                if (khhVar != null) {
                    bih bihVar = (bih) n7bVar.a;
                    ihh ihhVar = new ihh(str, this.d, 0);
                    bihVar.d(str, ihhVar);
                    if (!ihhVar.b()) {
                        xq0.q(f1d.g("onLoadItem must call detach() or sendResult() before returning for id=", str));
                        break;
                    }
                } else {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str);
                    break;
                }
                break;
            default:
                khh khhVar2 = (khh) ((bih) this.e.a).d.get(((Messenger) this.b.a).getBinder());
                String str2 = this.c;
                if (khhVar2 != null) {
                    ihh ihhVar2 = new ihh(str2, this.d, 1);
                    ihhVar2.d = 4;
                    ihhVar2.d(null);
                    if (!ihhVar2.b()) {
                        xq0.q(f1d.g("onSearch must call detach() or sendResult() before returning for query=", str2));
                        break;
                    }
                } else {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str2);
                    break;
                }
                break;
        }
    }

    public aih(n7b n7bVar, h4b h4bVar, String str, Bundle bundle, i8o i8oVar) {
        this.e = n7bVar;
        this.b = h4bVar;
        this.c = str;
        this.d = i8oVar;
    }
}
