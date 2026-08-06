package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class R3 {

    /* renamed from: a, reason: collision with root package name */
    public final Q3 f4979a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0920z9 f4980b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0920z9 f4981c;

    public R3() {
        this(new Q3());
    }

    public final IHandlerExecutor a() {
        if (this.f4980b == null) {
            synchronized (this) {
                try {
                    if (this.f4980b == null) {
                        this.f4979a.getClass();
                        HandlerThreadC0327cb a2 = C0920z9.a("IAA-CDE");
                        this.f4980b = new C0920z9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4980b;
    }

    public final ICommonExecutor b() {
        if (this.f4981c == null) {
            synchronized (this) {
                try {
                    if (this.f4981c == null) {
                        this.f4979a.getClass();
                        HandlerThreadC0327cb a2 = C0920z9.a("IAA-CRS");
                        this.f4981c = new C0920z9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4981c;
    }

    public R3(Q3 q3) {
        this.f4979a = q3;
    }
}
