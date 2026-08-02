package com.iab.omid.library.toponad.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static j f37031d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f37032a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37033b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37034c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z6;
            boolean z9;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z6 = jVar.f37034c;
                z9 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z6 = jVar.f37034c;
                z9 = false;
            }
            jVar.a(z9, z6);
            j.this.f37033b = z9;
        }
    }

    public static j b() {
        return f37031d;
    }

    public void a() {
        Context context = this.f37032a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f37033b, isDeviceLocked);
        this.f37034c = isDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f37032a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z6, boolean z9) {
        if ((z9 || z6) == (this.f37034c || this.f37033b)) {
            return;
        }
        Iterator<com.iab.omid.library.toponad.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z9 || z6);
        }
    }
}
