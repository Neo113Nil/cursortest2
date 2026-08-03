package k9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b.d;
import b4.e;
import p.c;
import p.g;
import p.i;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends i {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String str, boolean z10, Context context) {
            j.e(str, "url");
            j.e(context, "context");
            this.url = str;
            this.openActivity = z10;
            this.context = context;
        }

        @Override // p.i
        public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            j.e(componentName, "componentName");
            j.e(cVar, "customTabsClient");
            d dVar = cVar.f5398a;
            try {
                ((b.b) dVar).d();
            } catch (RemoteException unused) {
            }
            p.j jVar = null;
            p.b bVar = new p.b(null);
            try {
                if (((b.b) dVar).c(bVar)) {
                    jVar = new p.j(dVar, bVar, cVar.f5399b);
                }
            } catch (RemoteException unused2) {
            }
            if (jVar == null) {
                return;
            }
            Uri parse = Uri.parse(this.url);
            Bundle bundle = new Bundle();
            try {
                ((b.b) jVar.f5402a).b(jVar.f5403b, parse, bundle);
            } catch (RemoteException unused3) {
            }
            if (this.openActivity) {
                g a6 = new e(jVar).a();
                Intent intent = a6.f5400a;
                intent.setData(parse);
                intent.addFlags(268435456);
                this.context.startActivity(intent, a6.f5401b);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            j.e(componentName, "name");
        }
    }

    private b() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String str, boolean z10, Context context) {
        j.e(str, "url");
        j.e(context, "context");
        if (!hasChromeTabLibrary()) {
            return false;
        }
        a aVar = new a(str, z10, context);
        aVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        return context.bindService(intent, aVar, 33);
    }
}
