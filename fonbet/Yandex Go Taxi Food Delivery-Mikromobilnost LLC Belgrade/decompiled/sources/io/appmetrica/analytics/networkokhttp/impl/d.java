package io.appmetrica.analytics.networkokhttp.impl;

import defpackage.bgo;
import defpackage.d5j0;
import defpackage.o6u;
import defpackage.s4e;
import defpackage.yf7;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes7.dex */
public final class d extends bgo {
    public final TimeProvider a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public String k;
    public boolean l;

    public d(TimeProvider timeProvider) {
        this.a = timeProvider;
    }

    public static Long a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return null;
        }
        return Long.valueOf(j2 - j);
    }

    @Override // defpackage.bgo
    public final void callFailed(yf7 yf7Var, IOException iOException) {
        long currentTimeMillis = this.a.currentTimeMillis();
        if (this.b > 0 && this.c == 0) {
            this.c = currentTimeMillis;
        }
        if (this.d > 0 && this.e == 0) {
            this.e = currentTimeMillis;
        }
        if (this.f > 0 && this.g == 0) {
            this.g = currentTimeMillis;
        }
        if (this.i <= 0 || this.j != 0) {
            return;
        }
        this.j = currentTimeMillis;
    }

    @Override // defpackage.bgo
    public final void connectEnd(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        this.e = this.a.currentTimeMillis();
    }

    @Override // defpackage.bgo
    public final void connectStart(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.d = this.a.currentTimeMillis();
    }

    @Override // defpackage.bgo
    public final void connectionAcquired(yf7 yf7Var, s4e s4eVar) {
        this.l = this.d == 0;
        this.k = ((RealConnection) s4eVar).g.getProtocol();
    }

    @Override // defpackage.bgo
    public final void dnsEnd(yf7 yf7Var, String str, List list) {
        this.c = this.a.currentTimeMillis();
    }

    @Override // defpackage.bgo
    public final void dnsStart(yf7 yf7Var, String str) {
        this.b = this.a.currentTimeMillis();
    }

    @Override // defpackage.bgo
    public final void requestHeadersEnd(yf7 yf7Var, d5j0 d5j0Var) {
        this.h = this.a.currentTimeMillis();
    }

    @Override // defpackage.bgo
    public final void responseBodyEnd(yf7 yf7Var, long j) {
        this.j = this.a.currentTimeMillis();
    }

    @Override // defpackage.bgo
    public final void responseHeadersStart(yf7 yf7Var) {
        this.i = this.a.currentTimeMillis();
    }

    @Override // defpackage.bgo
    public final void secureConnectEnd(yf7 yf7Var, o6u o6uVar) {
        this.g = this.a.currentTimeMillis();
    }

    @Override // defpackage.bgo
    public final void secureConnectStart(yf7 yf7Var) {
        this.f = this.a.currentTimeMillis();
    }
}
