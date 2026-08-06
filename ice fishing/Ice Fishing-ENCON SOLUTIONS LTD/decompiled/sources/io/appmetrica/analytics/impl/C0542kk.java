package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542kk {

    /* renamed from: a, reason: collision with root package name */
    public final C0516jk f6399a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0920z9 f6400b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0920z9 f6401c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0920z9 f6402d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C0920z9 f6403e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0920z9 f6404f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C0920z9 f6405g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ExecutorC0490ik f6406h;

    public C0542kk() {
        this(new C0516jk());
    }

    public final IHandlerExecutor a() {
        if (this.f6405g == null) {
            synchronized (this) {
                try {
                    if (this.f6405g == null) {
                        this.f6399a.getClass();
                        HandlerThreadC0327cb a2 = C0920z9.a("IAA-SDE");
                        this.f6405g = new C0920z9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6405g;
    }

    public final IHandlerExecutor b() {
        if (this.f6402d == null) {
            synchronized (this) {
                try {
                    if (this.f6402d == null) {
                        this.f6399a.getClass();
                        HandlerThreadC0327cb a2 = C0920z9.a("IAA-SMH-1");
                        this.f6402d = new C0920z9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6402d;
    }

    public final IHandlerExecutor c() {
        if (this.f6403e == null) {
            synchronized (this) {
                try {
                    if (this.f6403e == null) {
                        this.f6399a.getClass();
                        HandlerThreadC0327cb a2 = C0920z9.a("IAA-SNTPE");
                        this.f6403e = new C0920z9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6403e;
    }

    public final IHandlerExecutor d() {
        if (this.f6401c == null) {
            synchronized (this) {
                try {
                    if (this.f6401c == null) {
                        this.f6399a.getClass();
                        HandlerThreadC0327cb a2 = C0920z9.a("IAA-STE");
                        this.f6401c = new C0920z9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6401c;
    }

    public C0542kk(C0516jk c0516jk) {
        new HashMap();
        this.f6399a = c0516jk;
    }
}
