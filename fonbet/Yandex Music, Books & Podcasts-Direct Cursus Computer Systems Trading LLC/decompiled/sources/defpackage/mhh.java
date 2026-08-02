package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class mhh extends MediaBrowserService {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public mhh(dn9 dn9Var, Context context) {
        this.c = dn9Var;
        this.b = dn9Var;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        g8c g8cVar;
        int i2;
        Bundle bundle3;
        nnd nndVar;
        switch (this.a) {
            case 0:
                nsh.g(bundle);
                gs4 gs4Var = (gs4) this.b;
                nuh nuhVar = (nuh) gs4Var.d;
                Bundle bundle4 = bundle == null ? null : new Bundle(bundle);
                int i3 = -1;
                if (bundle4 == null || bundle4.getInt("extra_client_version", 0) == 0) {
                    bundle2 = null;
                } else {
                    bundle4.remove("extra_client_version");
                    gs4Var.c = new Messenger(nuhVar.g);
                    bundle2 = new Bundle();
                    bundle2.putInt("extra_service_version", 2);
                    bundle2.putBinder("extra_messenger", ((Messenger) gs4Var.c).getBinder());
                    msh mshVar = nuhVar.h;
                    if (mshVar != null) {
                        d9e d = mshVar.d();
                        bundle2.putBinder("extra_session_binder", d == null ? null : d.asBinder());
                    } else {
                        ((ArrayList) gs4Var.a).add(bundle2);
                    }
                    i3 = bundle4.getInt("extra_calling_pid", -1);
                    bundle4.remove("extra_calling_pid");
                }
                jhh jhhVar = new jhh(nuhVar, str, i3, i, null);
                nuhVar.f = jhhVar;
                g8c b = nuhVar.b(bundle4);
                nuhVar.f = null;
                if (b == null) {
                    g8cVar = null;
                } else {
                    if (((Messenger) gs4Var.c) != null) {
                        nuhVar.d.add(jhhVar);
                    }
                    Bundle bundle5 = (Bundle) b.a;
                    if (bundle2 == null) {
                        bundle2 = bundle5;
                    } else if (bundle5 != null) {
                        bundle2.putAll(bundle5);
                    }
                    g8cVar = new g8c(bundle2);
                }
                if (g8cVar == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot("androidx.media3.session.MediaLibraryService", (Bundle) g8cVar.a);
            default:
                osh.C(bundle);
                dn9 dn9Var = (dn9) this.b;
                bih bihVar = (bih) dn9Var.e;
                Bundle bundle6 = bundle == null ? null : new Bundle(bundle);
                if (bundle6 == null || bundle6.getInt("extra_client_version", 0) == 0) {
                    i2 = -1;
                    bundle3 = null;
                } else {
                    bundle6.remove("extra_client_version");
                    dn9Var.d = new Messenger(bihVar.e);
                    Bundle bundle7 = new Bundle();
                    bundle7.putInt("extra_service_version", 2);
                    bundle7.putBinder("extra_messenger", ((Messenger) dn9Var.d).getBinder());
                    MediaSessionCompat$Token mediaSessionCompat$Token = bihVar.f;
                    if (mediaSessionCompat$Token != null) {
                        e9e d2 = mediaSessionCompat$Token.d();
                        bundle7.putBinder("extra_session_binder", d2 == null ? null : d2.asBinder());
                    } else {
                        ((ArrayList) dn9Var.b).add(bundle7);
                    }
                    int i4 = bundle6.getInt("extra_calling_pid", -1);
                    bundle6.remove("extra_calling_pid");
                    i2 = i4;
                    bundle3 = bundle7;
                }
                khh khhVar = new khh(bihVar, str, i2, i, null);
                nnd b2 = bihVar.b(i, str);
                if (b2 == null) {
                    nndVar = null;
                } else {
                    if (((Messenger) dn9Var.d) != null) {
                        bihVar.c.add(khhVar);
                    }
                    Bundle bundle8 = (Bundle) b2.c;
                    if (bundle3 == null) {
                        bundle3 = bundle8;
                    } else if (bundle8 != null) {
                        bundle3.putAll(bundle8);
                    }
                    nndVar = new nnd(8, (String) b2.b, bundle3);
                }
                if (nndVar == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot((String) nndVar.b, (Bundle) nndVar.c);
        }
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        switch (this.a) {
            case 0:
                gs4 gs4Var = (gs4) this.b;
                qzc qzcVar = new qzc(12, result);
                nuh nuhVar = (nuh) gs4Var.d;
                nuhVar.f = nuhVar.c;
                qzcVar.C(null);
                nuhVar.f = null;
                break;
            default:
                dn9 dn9Var = (dn9) this.b;
                ((bih) dn9Var.e).c(str, new lhh(str, new oxa(14, result), 0));
                break;
        }
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        switch (this.a) {
            case 0:
                gs4 gs4Var = (gs4) this.c;
                qzc qzcVar = new qzc(12, result);
                nuh nuhVar = (nuh) gs4Var.e;
                nuhVar.f = nuhVar.c;
                qzcVar.C(null);
                nuhVar.f = null;
                break;
            default:
                dn9 dn9Var = (dn9) this.c;
                ((bih) dn9Var.f).d(str, new lhh(str, new oxa(14, result), 1));
                break;
        }
    }

    public mhh(gs4 gs4Var, Context context) {
        this.c = gs4Var;
        this.b = gs4Var;
        attachBaseContext(context);
    }
}
