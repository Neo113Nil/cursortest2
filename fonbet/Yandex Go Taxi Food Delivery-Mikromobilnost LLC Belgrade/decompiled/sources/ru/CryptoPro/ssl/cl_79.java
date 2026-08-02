package ru.CryptoPro.ssl;

import java.security.AccessControlContext;
import java.security.Permission;
import java.security.Principal;
import javax.security.auth.Subject;
import javax.security.auth.login.LoginException;

/* loaded from: classes4.dex */
public interface cl_79 {
    String a(Object obj);

    String a(Principal principal);

    Permission a(String str, String str2);

    Subject a(AccessControlContext accessControlContext) throws LoginException;

    boolean a(Subject subject, Principal principal);

    Subject b(AccessControlContext accessControlContext) throws LoginException;

    Object c(AccessControlContext accessControlContext) throws LoginException;
}
