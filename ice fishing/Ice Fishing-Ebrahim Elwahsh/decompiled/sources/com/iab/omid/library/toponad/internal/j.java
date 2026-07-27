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
    private static j f36426d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f36427a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36428b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36429c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z8;
            boolean z9;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z8 = jVar.f36429c;
                z9 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z8 = jVar.f36429c;
                z9 = false;
            }
            jVar.a(z9, z8);
            j.this.f36428b = z9;
        }
    }

    public static j b() {
        return f36426d;
    }

    public void a() {
        Context context = this.f36427a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f36428b, isDeviceLocked);
        this.f36429c = isDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f36427a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z8, boolean z9) {
        if ((z9 || z8) == (this.f36429c || this.f36428b)) {
            return;
        }
        Iterator<com.iab.omid.library.toponad.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z9 || z8);
        }
    }
}
