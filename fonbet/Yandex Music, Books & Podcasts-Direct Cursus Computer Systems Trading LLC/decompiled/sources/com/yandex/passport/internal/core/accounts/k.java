package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.core.auth.AuthenticationService;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.n6;
import com.yandex.passport.internal.report.reporters.c1;
import defpackage.bnh;
import defpackage.bz2;
import defpackage.dfi;
import defpackage.eta;
import defpackage.q5b;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.tah;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xy0;
import defpackage.z7o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k {
    public static final Object j = new Object();
    public final AccountManager a;
    public final q b;
    public final Context c;
    public final o0 d;
    public final c1 e;
    public final com.yandex.passport.internal.storage.m f;
    public final com.yandex.passport.data.network.core.s g;
    public final com.yandex.passport.internal.database.d h;
    public final com.yandex.passport.internal.report.reporters.r i;

    public k(AccountManager accountManager, q qVar, Context context, o0 o0Var, c1 c1Var, com.yandex.passport.internal.storage.m mVar, com.yandex.passport.common.a aVar, com.yandex.passport.data.network.core.s sVar, com.yandex.passport.internal.database.d dVar, com.yandex.passport.internal.report.reporters.r rVar) {
        accountManager.getClass();
        this.a = accountManager;
        this.b = qVar;
        this.c = context;
        this.d = o0Var;
        this.e = c1Var;
        this.f = mVar;
        this.g = sVar;
        this.h = dVar;
        this.i = rVar;
    }

    public static void h(g gVar) {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Remove account result false", 8);
        }
        gVar.d(new RuntimeException("Failed to remove account"));
    }

    public final bz2 a(com.yandex.passport.internal.b bVar) {
        bVar.getClass();
        e();
        Bundle bundle = new Bundle();
        String str = bVar.c;
        String str2 = bVar.f;
        if (str != null) {
            bundle.putString("uid", str);
        }
        String str3 = bVar.d;
        if (str3 != null) {
            bundle.putString("user_info_body", str3);
        }
        String str4 = bVar.e;
        if (str4 != null) {
            bundle.putString("user_info_meta", str4);
        }
        if (str2 != null) {
            bundle.putString("stash", str2);
        }
        bundle.putString("account_type", bVar.g);
        bundle.putString("affinity", bVar.h);
        bundle.putString("extra_data", bVar.i);
        String b = this.b.b(bVar.b);
        Account d = bVar.d();
        boolean addAccountExplicitly = this.a.addAccountExplicitly(d, b, bundle);
        this.e.u(str2 != null ? Integer.valueOf(str2.length()) : null, str);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "addAccount: account=" + d + " result=" + addAccountExplicitly + " bundle=" + bundle, 8);
        }
        return new bz2(d, addAccountExplicitly, 22);
    }

    public final ArrayList b() {
        Account[] accountArr;
        e();
        Account[] c = c();
        ArrayList arrayList = new ArrayList();
        int length = c.length;
        int i = 0;
        while (i < length) {
            Account account = c[i];
            String g = g(account);
            com.yandex.passport.internal.b bVar = null;
            if (g == null) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "System account '" + account + "' not found or it has no master token value", 8);
                }
                accountArr = c;
            } else {
                AccountManager accountManager = this.a;
                String userData = accountManager.getUserData(account, "uid");
                String userData2 = accountManager.getUserData(account, "user_info_body");
                String userData3 = accountManager.getUserData(account, "user_info_meta");
                String userData4 = accountManager.getUserData(account, "stash");
                String userData5 = accountManager.getUserData(account, "account_type");
                String userData6 = accountManager.getUserData(account, "affinity");
                accountArr = c;
                String userData7 = accountManager.getUserData(account, "extra_data");
                if (g(account) != null) {
                    String str = account.name;
                    str.getClass();
                    bVar = new com.yandex.passport.internal.b(str, g, userData, userData2, userData3, userData4, userData5, userData6, userData7);
                } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    bVar = null;
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "System account '" + account + "' not found or it has no master token value", 8);
                } else {
                    bVar = null;
                }
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i++;
            c = accountArr;
        }
        return arrayList;
    }

    public final Account[] c() {
        e();
        Account[] accountsByType = this.a.getAccountsByType(com.yandex.passport.internal.ui.a.a);
        accountsByType.getClass();
        return accountsByType;
    }

    public final LinkedHashMap d() {
        AuthenticatorDescription[] authenticatorTypes = this.a.getAuthenticatorTypes();
        authenticatorTypes.getClass();
        int a = tah.a(authenticatorTypes.length);
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (AuthenticatorDescription authenticatorDescription : authenticatorTypes) {
            linkedHashMap.put(authenticatorDescription.type, authenticatorDescription.packageName);
        }
        return linkedHashMap;
    }

    public final String e() {
        String str = (String) d().get(com.yandex.passport.internal.ui.a.a);
        if (str != null) {
            return str;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "performAuthenticatorFix", 8);
        }
        o0 o0Var = this.d;
        o0Var.a.b(com.yandex.passport.internal.analytics.l.f, new xy0(0));
        synchronized (j) {
            j();
            String str2 = (String) d().get(com.yandex.passport.internal.ui.a.a);
            o0 o0Var2 = this.d;
            if (str2 != null) {
                xy0 xy0Var = new xy0(0);
                xy0Var.put("try", String.valueOf(1));
                o0Var2.a.b(com.yandex.passport.internal.analytics.l.g, xy0Var);
                return str2;
            }
            xy0 xy0Var2 = new xy0(0);
            xy0Var2.put("try", String.valueOf(1));
            o0Var2.a.b(com.yandex.passport.internal.analytics.l.i, xy0Var2);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "call: timeout", e);
                }
            }
            String str3 = (String) d().get(com.yandex.passport.internal.ui.a.a);
            o0 o0Var3 = this.d;
            if (str3 != null) {
                xy0 xy0Var3 = new xy0(0);
                xy0Var3.put("try", String.valueOf(2));
                o0Var3.a.b(com.yandex.passport.internal.analytics.l.g, xy0Var3);
                return str3;
            }
            xy0 xy0Var4 = new xy0(0);
            xy0Var4.put("try", String.valueOf(2));
            o0Var3.a.b(com.yandex.passport.internal.analytics.l.i, xy0Var4);
            xq0.q("Authenticator package name is null");
            return null;
        }
    }

    public final Set f(Account account) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, dfi.c(i, "getNotVisiblePackagesForAccount requires API 26+, current=", ", skip"), 8);
            }
            return q5b.a;
        }
        e();
        Map<String, Integer> packagesAndVisibilityForAccount = this.a.getPackagesAndVisibilityForAccount(account);
        packagesAndVisibilityForAccount.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : packagesAndVisibilityForAccount.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == 3) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public final String g(Account account) {
        com.yandex.passport.common.network.n a = this.b.a(this.a.getPassword(account));
        Exception exc = (Exception) a.c;
        if (exc != null) {
            xy0 xy0Var = new xy0(0);
            xy0Var.put("error", Log.getStackTraceString(exc));
            this.d.a.b(com.yandex.passport.internal.analytics.l.r, xy0Var);
        }
        return (String) a.b;
    }

    public final void i(g gVar, String str) {
        Continuation continuation = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Remove account result true", 8);
        }
        gVar.onSuccess();
        x97.D(kotlin.coroutines.g.a, new rhw(this, str, continuation, 22));
    }

    public final void j() {
        com.yandex.passport.internal.storage.m mVar = this.f;
        mVar.e.setValue(mVar, com.yandex.passport.internal.storage.m.m[3], null);
        Context context = this.c;
        String packageName = context.getPackageName();
        String canonicalName = AuthenticationService.class.getCanonicalName();
        if (canonicalName == null) {
            xq0.q("AuthenticationService::class canonical name is missing");
            return;
        }
        ComponentName componentName = new ComponentName(packageName, canonicalName);
        context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 0);
    }

    public final void k(Account account, final String str, g gVar) {
        final g gVar2;
        account.getClass();
        e();
        final HandlerThread handlerThread = new HandlerThread("removeAccount callback handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        Set set = u.a;
        final String e = eta.e();
        u.a.add(e);
        try {
            gVar2 = gVar;
            try {
                AccountManagerCallback<Bundle> accountManagerCallback = new AccountManagerCallback() { // from class: com.yandex.passport.internal.core.accounts.j
                    @Override // android.accounts.AccountManagerCallback
                    public final void run(AccountManagerFuture accountManagerFuture) {
                        String str2 = e;
                        g gVar3 = gVar2;
                        String str3 = str;
                        HandlerThread handlerThread2 = handlerThread;
                        accountManagerFuture.getClass();
                        try {
                            try {
                                u.a(str2);
                                boolean z = ((Bundle) accountManagerFuture.getResult()).getBoolean("booleanResult");
                                k kVar = this;
                                if (z) {
                                    kVar.i(gVar3, str3);
                                } else {
                                    kVar.getClass();
                                    k.h(gVar3);
                                }
                                u.a.remove(str2);
                            } catch (Exception e2) {
                                if (!(e2 instanceof OperationCanceledException) && !(e2 instanceof IOException) && !(e2 instanceof AuthenticatorException)) {
                                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Failed remove account " + e2.getMessage(), e2);
                                    }
                                    throw e2;
                                }
                                com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error remove account", e2);
                                }
                                gVar3.d(e2);
                                u.a(str2);
                            }
                            handlerThread2.quitSafely();
                        } catch (Throwable th) {
                            u.a(str2);
                            handlerThread2.quitSafely();
                            throw th;
                        }
                    }
                };
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "accountManager::removeAccount started", 8);
                }
                this.a.removeAccount(account, null, accountManagerCallback, handler);
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "removeAccount in account manager is failed: " + exc.getMessage(), 8);
                }
                gVar2.d(exc);
                u.a.remove(e);
            }
        } catch (Exception e3) {
            e = e3;
            gVar2 = gVar;
        }
    }

    public final void l(Account account, String str, bnh bnhVar) {
        account.getClass();
        e();
        Set set = u.a;
        String e = eta.e();
        Set set2 = u.a;
        set2.add(e);
        try {
            try {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "accountManager::removeAccountExplicitly started", 8);
                }
                if (this.a.removeAccountExplicitly(account)) {
                    i(bnhVar, str);
                } else {
                    h(bnhVar);
                }
                set2.remove(e);
            } catch (Exception e2) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "removeAccountExplicitly in account manager is failed: " + e2.getMessage(), 8);
                }
                bnhVar.d(e2);
                u.a.remove(e);
            }
        } catch (Throwable th) {
            u.a.remove(e);
            throw th;
        }
    }

    public final boolean m(Account account, String str, boolean z) {
        str.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            if (!com.yandex.passport.common.logger.a.a.isEnabled()) {
                return false;
            }
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, dfi.c(i, "setAccountVisibility requires API 26+, current=", ", skip"), 8);
            return false;
        }
        e();
        boolean accountVisibility = this.a.setAccountVisibility(account, str, z ? 1 : 3);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "setAccountVisibility: account=" + account + " packageName=" + str + " visible=" + z + " result=" + accountVisibility, 8);
        }
        return accountVisibility;
    }

    public final void n(Account account, String str) {
        AccountManager accountManager = this.a;
        String password = accountManager.getPassword(account);
        q qVar = this.b;
        com.yandex.passport.common.network.n a = qVar.a(password);
        String b = qVar.b(str);
        xy0 xy0Var = new xy0(0);
        xy0Var.put("masked_old_encrypted", com.yandex.passport.internal.util.l.b(password));
        xy0Var.put("masked_old_decrypted", com.yandex.passport.internal.util.l.b((String) a.b));
        xy0Var.put("masked_new_encrypted", com.yandex.passport.internal.util.l.b(b));
        xy0Var.put("masked_new_decrypted", com.yandex.passport.internal.util.l.b(str));
        Exception exc = (Exception) a.c;
        if (exc != null) {
            xy0Var.put("old_decrypt_error", Log.getStackTraceString(exc));
        }
        this.d.a.b(com.yandex.passport.internal.analytics.l.q, xy0Var);
        com.yandex.passport.internal.ui.a.B(new rhw(this, a, (Continuation) null, 23));
        accountManager.setPassword(account, b);
    }

    public final void o(Account account, String str) {
        account.getClass();
        e();
        this.a.setUserData(account, "extra_data", str);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateLegacyExtraData: account=" + account + " legacyExtraDataBody=" + str, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(com.yandex.passport.internal.b bVar, String str) {
        com.yandex.passport.internal.b bVar2;
        Object t7oVar;
        Throwable a;
        e();
        Account d = bVar.d();
        String g = g(d);
        if (g != null && g.equals(str)) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateMasterToken: update isn't required for account=" + d, 8);
            }
            return false;
        }
        n(d, str);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateMasterToken: account=" + d + " masterTokenValue=" + str, 8);
        }
        try {
            r7o r7oVar = z7o.b;
            bVar2 = bVar;
        } catch (Throwable th) {
            th = th;
            bVar2 = bVar;
        }
        try {
            this.h.H(com.yandex.passport.internal.b.a(bVar2, str, null, null, null, 509));
            t7oVar = Unit.a;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th3);
            a = z7o.a(t7oVar);
            if (a != null) {
            }
            return true;
        }
        a = z7o.a(t7oVar);
        if (a != null) {
            this.i.n(n6.d, new com.yandex.passport.internal.report.c(String.valueOf(bVar2.c), 3), new ff(a));
        }
        return true;
    }
}
