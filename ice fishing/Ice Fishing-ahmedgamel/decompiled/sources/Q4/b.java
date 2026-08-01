package Q4;

import S0.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0508b;
import b.InterfaceC0510d;
import com.bumptech.glide.manager.o;
import kotlin.jvm.internal.h;
import p.AbstractC4816f;
import p.AbstractServiceConnectionC4821k;
import p.BinderC4815e;

/* loaded from: classes2.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends AbstractServiceConnectionC4821k {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String url, boolean z3, Context context) {
            h.e(url, "url");
            h.e(context, "context");
            this.url = url;
            this.openActivity = z3;
            this.context = context;
        }

        @Override // p.AbstractServiceConnectionC4821k
        public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4816f customTabsClient) {
            h.e(componentName, "componentName");
            h.e(customTabsClient, "customTabsClient");
            try {
                ((C0508b) customTabsClient.f39689a).M0();
            } catch (RemoteException unused) {
            }
            i c9 = customTabsClient.c(null);
            if (c9 == null) {
                return;
            }
            Uri parse = Uri.parse(this.url);
            Bundle bundle = new Bundle();
            try {
                ((C0508b) ((InterfaceC0510d) c9.f2789v)).S((BinderC4815e) c9.f2790w, parse, bundle);
            } catch (RemoteException unused2) {
            }
            if (this.openActivity) {
                m8.i b9 = new o(c9).b();
                Intent intent = (Intent) b9.f39362n;
                intent.setData(parse);
                intent.addFlags(268435456);
                this.context.startActivity(intent, (Bundle) b9.f39363u);
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

    public final boolean open$com_onesignal_inAppMessages(String url, boolean z3, Context context) {
        h.e(url, "url");
        h.e(context, "context");
        if (hasChromeTabLibrary()) {
            return AbstractC4816f.a(context, "com.android.chrome", new a(url, z3, context));
        }
        return false;
    }
}
