package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.Principal;
import javax.security.auth.Subject;
import javax.security.auth.login.LoginException;

/* loaded from: classes4.dex */
public final class cl_77 {
    public static final cl_79 a = (cl_79) AccessController.doPrivileged(new cl_78());

    public static String a(Object obj) {
        c();
        return a.a(obj);
    }

    public static Subject b(AccessControlContext accessControlContext) throws LoginException {
        c();
        return a.b(accessControlContext);
    }

    public static void c() {
        if (a != null) {
            return;
        }
        ny61.f("Kerberos should have been available");
    }

    public static String a(Principal principal) {
        c();
        return a.a(principal);
    }

    public static Permission a(String str, String str2) {
        c();
        return a.a(str, str2);
    }

    public static Object c(AccessControlContext accessControlContext) throws LoginException {
        c();
        return a.c(accessControlContext);
    }

    public static Subject a(AccessControlContext accessControlContext) throws LoginException {
        c();
        return a.a(accessControlContext);
    }

    public static boolean a() {
        return a != null;
    }

    public static boolean a(Subject subject, Principal principal) {
        c();
        return a.a(subject, principal);
    }
}
