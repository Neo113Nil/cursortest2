package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class whh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public whh(n7b n7bVar, h4b h4bVar, String str, int i, int i2, Bundle bundle) {
        this.a = 0;
        this.f = n7bVar;
        this.b = h4bVar;
        this.d = str;
        this.c = i;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        khh khhVar;
        jhh jhhVar;
        switch (this.a) {
            case 0:
                h4b h4bVar = (h4b) this.b;
                IBinder binder = ((Messenger) h4bVar.a).getBinder();
                n7b n7bVar = (n7b) this.f;
                ((bih) n7bVar.a).d.remove(binder);
                bih bihVar = (bih) n7bVar.a;
                int i = this.c;
                int i2 = this.e;
                String str = this.d;
                khh khhVar2 = new khh(bihVar, str, i, i2, h4bVar);
                nnd b = bihVar.b(this.e, str);
                khhVar2.f = b;
                if (b == null) {
                    StringBuilder u = ouj.u("No root for client ", str, " from service ");
                    u.append(whh.class.getName());
                    Log.i("MBServiceCompat", u.toString());
                    try {
                        h4bVar.X(2, null);
                        break;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                        return;
                    }
                } else {
                    try {
                        bihVar.d.put(binder, khhVar2);
                        binder.linkToDeath(khhVar2, 0);
                        MediaSessionCompat$Token mediaSessionCompat$Token = bihVar.f;
                        if (mediaSessionCompat$Token != null) {
                            nnd nndVar = khhVar2.f;
                            String str2 = (String) nndVar.b;
                            Bundle bundle = (Bundle) nndVar.c;
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putInt("extra_service_version", 2);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_media_item_id", str2);
                            bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                            bundle2.putBundle("data_root_hints", bundle);
                            h4bVar.X(1, bundle2);
                            break;
                        }
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
                        bihVar.d.remove(binder);
                        return;
                    }
                }
                break;
            case 1:
                h4b h4bVar2 = (h4b) this.b;
                IBinder binder2 = ((Messenger) h4bVar2.a).getBinder();
                n7b n7bVar2 = (n7b) this.f;
                ((bih) n7bVar2.a).d.remove(binder2);
                bih bihVar2 = (bih) n7bVar2.a;
                Iterator it = bihVar2.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        khh khhVar3 = (khh) it.next();
                        if (khhVar3.c == this.c) {
                            khhVar = (TextUtils.isEmpty(this.d) || this.e <= 0) ? new khh(bihVar2, khhVar3.a, khhVar3.b, khhVar3.c, h4bVar2) : null;
                            it.remove();
                        }
                    }
                }
                if (khhVar == null) {
                    khhVar = new khh(bihVar2, this.d, this.e, this.c, h4bVar2);
                }
                bihVar2.d.put(binder2, khhVar);
                try {
                    binder2.linkToDeath(khhVar, 0);
                    break;
                } catch (RemoteException unused3) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                    return;
                }
            default:
                mka mkaVar = (mka) this.b;
                IBinder binder3 = ((Messenger) mkaVar.a).getBinder();
                awc awcVar = (awc) this.f;
                ((nuh) awcVar.a).e.remove(binder3);
                nuh nuhVar = (nuh) awcVar.a;
                Iterator it2 = nuhVar.d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        jhh jhhVar2 = (jhh) it2.next();
                        if (jhhVar2.c == this.c) {
                            jhhVar = (TextUtils.isEmpty(this.d) || this.e <= 0) ? new jhh(nuhVar, jhhVar2.a, jhhVar2.b, jhhVar2.c, mkaVar) : null;
                            it2.remove();
                        }
                    }
                }
                if (jhhVar == null) {
                    jhhVar = new jhh(nuhVar, this.d, this.e, this.c, mkaVar);
                }
                nuhVar.e.put(binder3, jhhVar);
                try {
                    binder3.linkToDeath(jhhVar, 0);
                    break;
                } catch (RemoteException unused4) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
                break;
        }
    }

    public /* synthetic */ whh(Object obj, Object obj2, int i, String str, int i2, Bundle bundle, int i3) {
        this.a = i3;
        this.f = obj;
        this.b = obj2;
        this.c = i;
        this.d = str;
        this.e = i2;
    }
}
