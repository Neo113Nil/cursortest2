package com.yandex.plus.core.network.impl;

import defpackage.d0o;
import defpackage.es3;
import defpackage.fob;
import defpackage.l3o;
import defpackage.ps3;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class b implements es3 {
    public final es3 a;

    public b(es3 es3Var) {
        es3Var.getClass();
        this.a = es3Var;
    }

    @Override // defpackage.es3
    public final d0o a() {
        return this.a.a();
    }

    @Override // defpackage.es3
    public final void cancel() {
        this.a.cancel();
    }

    @Override // defpackage.es3
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final es3 m13clone() {
        return new b(this.a.m13clone());
    }

    @Override // defpackage.es3
    public final l3o execute() {
        return this.a.execute();
    }

    @Override // defpackage.es3
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.es3
    public final void z(ps3 ps3Var) {
        boolean z;
        Throwable th;
        IOException e;
        es3 es3Var = this.a;
        try {
            z = true;
        } catch (IOException e2) {
            z = false;
            e = e2;
        } catch (Throwable th2) {
            z = false;
            th = th2;
        }
        try {
            ps3Var.a(es3Var, es3Var.execute());
        } catch (IOException e3) {
            e = e3;
            if (z) {
                return;
            }
            ps3Var.d(es3Var, e);
        } catch (Throwable th3) {
            th = th3;
            es3Var.cancel();
            if (z) {
                return;
            }
            IOException iOException = new IOException("canceled due to " + th);
            fob.a(iOException, th);
            ps3Var.d(es3Var, iOException);
        }
    }
}
