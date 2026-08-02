package ru.CryptoPro.ssl;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

/* loaded from: classes4.dex */
class cl_65 implements Runnable {
    public final PrivilegedExceptionAction a;
    public final /* synthetic */ cl_63 b;

    public cl_65(cl_63 cl_63Var, PrivilegedExceptionAction privilegedExceptionAction) {
        this.b = cl_63Var;
        this.a = privilegedExceptionAction;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl_63 cl_63Var;
        Exception e;
        synchronized (this.b.y) {
            try {
                try {
                    AccessController.doPrivileged(this.a, this.b.y.p);
                } catch (RuntimeException e2) {
                    e = e2;
                    cl_63Var = this.b;
                    cl_63Var.V = e;
                    this.b.U = null;
                    this.b.T = false;
                }
            } catch (PrivilegedActionException e3) {
                cl_63Var = this.b;
                e = e3.getException();
                cl_63Var.V = e;
                this.b.U = null;
                this.b.T = false;
            }
            this.b.U = null;
            this.b.T = false;
        }
    }
}
