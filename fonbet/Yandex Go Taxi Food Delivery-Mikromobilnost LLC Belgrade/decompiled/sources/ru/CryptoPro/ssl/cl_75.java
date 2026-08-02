package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.io.IOException;
import java.io.PrintStream;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Principal;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class cl_75 extends cl_47 {
    public static final Class c = (Class) AccessController.doPrivileged(new cl_76());
    public final cl_75 b;

    public cl_75(String str, AccessControlContext accessControlContext, cl_84 cl_84Var, SecureRandom secureRandom) throws IOException {
        cl_75 h = h();
        this.b = h;
        if (h != null) {
            a(str, accessControlContext, cl_84Var, secureRandom);
        } else {
            ny61.r("Kerberos is unavailable");
            throw null;
        }
    }

    public void a(String str, AccessControlContext accessControlContext, cl_84 cl_84Var, SecureRandom secureRandom) throws IOException {
        cl_75 cl_75Var = this.b;
        if (cl_75Var != null) {
            cl_75Var.a(str, accessControlContext, cl_84Var, secureRandom);
        }
    }

    public byte[] b() {
        return this.b.b();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public int c() {
        return this.b.c();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        return "";
    }

    public Principal e() {
        return this.b.e();
    }

    public Principal g() {
        return this.b.g();
    }

    public final cl_75 h() {
        Class cls = c;
        if (cls != null && getClass() == cl_75.class) {
            try {
                return (cl_75) cls.newInstance();
            } catch (IllegalAccessException e) {
                ny61.f(e);
                return null;
            } catch (InstantiationException e2) {
                ny61.f(e2);
            }
        }
        return null;
    }

    public void a(PrintStream printStream) throws IOException {
        this.b.a(printStream);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 16;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public void a(cl_62 cl_62Var) throws IOException {
        this.b.a(cl_62Var);
    }

    public void a(cl_84 cl_84Var, cl_84 cl_84Var2, SecureRandom secureRandom, cl_46 cl_46Var, AccessControlContext accessControlContext, Object obj) throws IOException {
        cl_75 cl_75Var = this.b;
        if (cl_75Var != null) {
            cl_75Var.a(cl_84Var, cl_84Var2, secureRandom, cl_46Var, accessControlContext, obj);
        }
    }

    public cl_75(cl_84 cl_84Var, cl_84 cl_84Var2, SecureRandom secureRandom, cl_46 cl_46Var, AccessControlContext accessControlContext, Object obj) throws IOException {
        cl_75 h = h();
        this.b = h;
        if (h != null) {
            a(cl_84Var, cl_84Var2, secureRandom, cl_46Var, accessControlContext, obj);
        } else {
            ny61.r("Kerberos is unavailable");
            throw null;
        }
    }
}
