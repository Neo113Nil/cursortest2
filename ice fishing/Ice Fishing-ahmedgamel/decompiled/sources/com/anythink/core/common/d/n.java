package com.anythink.core.common.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import j0.C4596b;

/* loaded from: classes.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    private static volatile n f12712b;

    /* renamed from: a, reason: collision with root package name */
    Context f12713a;

    private n(Context context) {
        this.f12713a = context;
    }

    public static n a(Context context) {
        if (f12712b == null) {
            synchronized (n.class) {
                try {
                    if (f12712b == null) {
                        f12712b = new n(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12712b;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            try {
                C4596b.a(this.f12713a).b(broadcastReceiver, intentFilter);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            C4596b.a(this.f12713a).b(broadcastReceiver, intentFilter);
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        try {
            try {
                C4596b.a(this.f12713a).d(broadcastReceiver);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            C4596b.a(this.f12713a).d(broadcastReceiver);
        }
    }

    public final void a(Intent intent) {
        try {
            try {
                C4596b.a(this.f12713a).c(intent);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            C4596b.a(this.f12713a).c(intent);
        }
    }
}
