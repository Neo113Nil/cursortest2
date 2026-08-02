package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;

/* loaded from: classes.dex */
public final class zhh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ mka b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i8o d;
    public final /* synthetic */ awc e;

    public zhh(awc awcVar, mka mkaVar, String str, i8o i8oVar) {
        this.e = awcVar;
        this.b = mkaVar;
        this.c = str;
        this.d = i8oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                IBinder binder = ((Messenger) this.b.a).getBinder();
                awc awcVar = this.e;
                jhh jhhVar = (jhh) ((nuh) awcVar.a).e.get(binder);
                if (jhhVar != null) {
                    nuh nuhVar = (nuh) awcVar.a;
                    nuhVar.f = jhhVar;
                    int i = 2 & 2;
                    i8o i8oVar = this.d;
                    if (i != 0) {
                        i8oVar.b(-1, null);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("media_item", null);
                        i8oVar.b(0, bundle);
                    }
                    nuhVar.f = null;
                    break;
                } else {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.c);
                    break;
                }
            default:
                IBinder binder2 = ((Messenger) this.b.a).getBinder();
                awc awcVar2 = this.e;
                jhh jhhVar2 = (jhh) ((nuh) awcVar2.a).e.get(binder2);
                if (jhhVar2 != null) {
                    nuh nuhVar2 = (nuh) awcVar2.a;
                    nuhVar2.f = jhhVar2;
                    this.d.b(-1, null);
                    nuhVar2.f = null;
                    break;
                } else {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.c);
                    break;
                }
        }
    }

    public zhh(awc awcVar, mka mkaVar, String str, Bundle bundle, i8o i8oVar) {
        this.e = awcVar;
        this.b = mkaVar;
        this.c = str;
        this.d = i8oVar;
    }
}
