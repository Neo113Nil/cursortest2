package com.anythink.core.common.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import j0.C4605b;

/* loaded from: classes.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    private static volatile n f13498b;

    /* renamed from: a, reason: collision with root package name */
    Context f13499a;

    private n(Context context) {
        this.f13499a = context;
    }

    public static n a(Context context) {
        if (f13498b == null) {
            synchronized (n.class) {
                try {
                    if (f13498b == null) {
                        f13498b = new n(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13498b;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            try {
                C4605b.a(this.f13499a).b(broadcastReceiver, intentFilter);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            C4605b.a(this.f13499a).b(broadcastReceiver, intentFilter);
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        try {
            try {
                C4605b.a(this.f13499a).d(broadcastReceiver);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            C4605b.a(this.f13499a).d(broadcastReceiver);
        }
    }

    public final void a(Intent intent) {
        try {
            try {
                C4605b.a(this.f13499a).c(intent);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            C4605b.a(this.f13499a).c(intent);
        }
    }
}
