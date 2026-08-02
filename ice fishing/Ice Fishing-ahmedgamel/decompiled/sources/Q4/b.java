package Q4;

import S0.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0512b;
import b.InterfaceC0514d;
import com.bumptech.glide.manager.n;
import com.google.android.gms.internal.ads.LP;
import kotlin.jvm.internal.h;
import p.AbstractC4820f;
import p.AbstractServiceConnectionC4825k;
import p.BinderC4819e;

/* loaded from: classes2.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends AbstractServiceConnectionC4825k {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String url, boolean z6, Context context) {
            h.e(url, "url");
            h.e(context, "context");
            this.url = url;
            this.openActivity = z6;
            this.context = context;
        }

        @Override // p.AbstractServiceConnectionC4825k
        public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4820f customTabsClient) {
            h.e(componentName, "componentName");
            h.e(customTabsClient, "customTabsClient");
            try {
                ((C0512b) customTabsClient.f39797a).K0();
            } catch (RemoteException unused) {
            }
            i c9 = customTabsClient.c(null);
            if (c9 == null) {
                return;
            }
            Uri parse = Uri.parse(this.url);
            Bundle bundle = new Bundle();
            try {
                ((C0512b) ((InterfaceC0514d) c9.f2918v)).S((BinderC4819e) c9.f2919w, parse, bundle);
            } catch (RemoteException unused2) {
            }
            if (this.openActivity) {
                LP b9 = new n(c9).b();
                Intent intent = (Intent) b9.f26916u;
                intent.setData(parse);
                intent.addFlags(268435456);
                this.context.startActivity(intent, (Bundle) b9.f26917v);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            h.e(name, "name");
        }
    }

    private b() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String url, boolean z6, Context context) {
        h.e(url, "url");
        h.e(context, "context");
        if (hasChromeTabLibrary()) {
            return AbstractC4820f.a(context, "com.android.chrome", new a(url, z6, context));
        }
        return false;
    }
}
