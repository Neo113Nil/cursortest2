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
    private static j f36264d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f36265a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36266b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36267c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z3;
            boolean z6;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z3 = jVar.f36267c;
                z6 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z3 = jVar.f36267c;
                z6 = false;
            }
            jVar.a(z6, z3);
            j.this.f36266b = z6;
        }
    }

    public static j b() {
        return f36264d;
    }

    public void a() {
        Context context = this.f36265a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f36266b, isDeviceLocked);
        this.f36267c = isDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f36265a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z3, boolean z6) {
        if ((z6 || z3) == (this.f36267c || this.f36266b)) {
            return;
        }
        Iterator<com.iab.omid.library.toponad.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z6 || z3);
        }
    }
}
