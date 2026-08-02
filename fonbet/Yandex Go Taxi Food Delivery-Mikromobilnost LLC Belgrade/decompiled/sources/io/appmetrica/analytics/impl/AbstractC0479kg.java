package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0479kg implements Hr, W2 {
    public final String a;
    public final int b;
    public final Vr c;
    public final AbstractC0871y3 d;
    public PublicLogger e = PublicLogger.getAnonymousInstance();

    public AbstractC0479kg(int i, String str, Vr vr, AbstractC0871y3 abstractC0871y3) {
        this.b = i;
        this.a = str;
        this.c = vr;
        this.d = abstractC0871y3;
    }

    public final Ir a() {
        Ir ir = new Ir();
        ir.b = this.b;
        ir.a = this.a.getBytes();
        ir.d = new Kr();
        ir.c = new Jr();
        return ir;
    }

    @Override // io.appmetrica.analytics.impl.Hr
    public abstract /* synthetic */ void a(Gr gr);

    public final AbstractC0871y3 b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final Vr d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        Tr a = this.c.a(this.a);
        if (a.a) {
            return true;
        }
        this.e.warning("Attribute " + this.a + " of type " + ((String) AbstractC0548mr.a.get(this.b)) + " is skipped because " + a.b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Hr
    public final void a(PublicLogger publicLogger) {
        this.e = publicLogger;
    }
}
