package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.push.settings.AutoTrackingConfiguration;
import io.appmetrica.analytics.push.settings.PassportUidProvider;

/* renamed from: io.appmetrica.analytics.push.impl.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1080v {
    public final Object a = new Object();
    public volatile C1081v0 b;
    public volatile C1084w0 c;
    public volatile C1049k1 d;
    public volatile O e;
    public volatile C1077u f;
    public volatile AutoTrackingConfiguration g;
    public volatile M1 h;
    public volatile X1 i;
    public volatile A1 j;
    public volatile C1056m1 k;
    public volatile C1041i1 l;
    public volatile R1 m;
    public volatile L1 n;
    public PassportUidProvider o;
    public final Context p;
    public final r q;

    public C1080v(Context context, r rVar) {
        this.p = context;
        this.q = rVar;
    }

    public final AutoTrackingConfiguration a() {
        if (this.g == null) {
            synchronized (this.a) {
                try {
                    if (this.g == null) {
                        this.g = AutoTrackingConfiguration.newBuilder().build();
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public final C1049k1 b() {
        if (this.d == null) {
            synchronized (this.a) {
                try {
                    if (this.d == null) {
                        this.d = new C1049k1();
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final M1 c() {
        if (this.h == null) {
            synchronized (this.a) {
                try {
                    if (this.h == null) {
                        this.h = new M1(this.p, ".STORAGE");
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public final U0 d() {
        if (this.f == null) {
            synchronized (this.a) {
                try {
                    if (this.f == null) {
                        this.f = new C1077u(c());
                    }
                } finally {
                }
            }
        }
        return this.f;
    }
}
