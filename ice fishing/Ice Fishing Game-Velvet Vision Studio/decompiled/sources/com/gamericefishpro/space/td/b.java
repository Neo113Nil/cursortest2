package com.gamericefishpro.space.td;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.gamericefishpro.space.a8.c;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.q.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends d {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String url, boolean z, Context context) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(context, "context");
            this.url = url;
            this.openActivity = z;
            this.context = context;
        }

        @Override // com.gamericefishpro.space.q.d
        public void onCustomTabsServiceConnected(ComponentName componentName, com.gamericefishpro.space.q.b customTabsClient) {
            c cVar;
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(customTabsClient, "customTabsClient");
            customTabsClient.getClass();
            com.gamericefishpro.space.b.c cVar2 = customTabsClient.a;
            try {
                ((com.gamericefishpro.space.b.a) cVar2).G();
            } catch (RemoteException unused) {
            }
            com.gamericefishpro.space.q.a aVar = new com.gamericefishpro.space.q.a();
            aVar.attachInterface(aVar, "android.support.customtabs.ICustomTabsCallback");
            new Handler(Looper.getMainLooper());
            try {
                cVar = !((com.gamericefishpro.space.b.a) cVar2).F(aVar) ? null : new c(cVar2, aVar, customTabsClient.b, 26);
            } catch (RemoteException unused2) {
            }
            if (cVar == null) {
                return;
            }
            com.gamericefishpro.space.q.a aVar2 = (com.gamericefishpro.space.q.a) cVar.i;
            Uri uri = Uri.parse(this.url);
            try {
                ((com.gamericefishpro.space.b.a) ((com.gamericefishpro.space.b.c) cVar.e)).E(aVar2, uri, new Bundle());
            } catch (RemoteException unused3) {
            }
            if (this.openActivity) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(((ComponentName) cVar.v).getPackageName());
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", aVar2);
                intent.putExtras(bundle);
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle2);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent.putExtras(new Bundle());
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                Intrinsics.checkNotNullExpressionValue(new a0(21), "build(...)");
                intent.setData(uri);
                intent.addFlags(268435456);
                this.context.startActivity(intent, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    private b() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String url, boolean z, Context context) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!hasChromeTabLibrary()) {
            return false;
        }
        a aVar = new a(url, z, context);
        aVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        return context.bindService(intent, aVar, 33);
    }
}
