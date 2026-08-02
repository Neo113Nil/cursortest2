package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes5.dex */
public abstract class Vf implements InterfaceC0532or, W2 {
    public final String a;
    public final int b;
    public final Cr c;
    public final AbstractC0796y3 d;
    public PublicLogger e = PublicLogger.getAnonymousInstance();

    public Vf(int i, String str, Cr cr, AbstractC0796y3 abstractC0796y3) {
        this.b = i;
        this.a = str;
        this.c = cr;
        this.d = abstractC0796y3;
    }

    @NonNull
    public final C0561pr a() {
        C0561pr c0561pr = new C0561pr();
        c0561pr.b = this.b;
        c0561pr.a = this.a.getBytes();
        c0561pr.d = new C0618rr();
        c0561pr.c = new C0590qr();
        return c0561pr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0532or
    public abstract /* synthetic */ void a(@NonNull C0503nr c0503nr);

    @NonNull
    public final AbstractC0796y3 b() {
        return this.d;
    }

    @NonNull
    public final String c() {
        return this.a;
    }

    @NonNull
    public final Cr d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        Ar a = this.c.a(this.a);
        if (a.a) {
            return true;
        }
        this.e.warning("Attribute " + this.a + " of type " + ((String) Tq.a.get(this.b)) + " is skipped because " + a.b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0532or
    public final void a(@NonNull PublicLogger publicLogger) {
        this.e = publicLogger;
    }
}
