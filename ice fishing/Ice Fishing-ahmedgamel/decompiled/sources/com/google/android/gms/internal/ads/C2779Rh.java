package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.Rh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2779Rh extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public Activity f28000a;

    /* renamed from: b, reason: collision with root package name */
    public Context f28001b;

    /* renamed from: c, reason: collision with root package name */
    public Context f28002c;

    public final void a(Intent intent) {
        if (this.f28000a == null) {
            intent.setFlags(268435456);
            this.f28001b.startActivity(intent);
            return;
        }
        String valueOf = String.valueOf(intent.getData());
        StringBuilder sb = new StringBuilder(valueOf.length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(valueOf);
        sb.append(" and requestCode: 236");
        w2.z.k(sb.toString());
        this.f28000a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f28002c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f28001b = applicationContext;
        this.f28000a = context instanceof Activity ? (Activity) context : null;
        this.f28002c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f28000a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f28001b.startActivity(intent);
        }
    }
}
