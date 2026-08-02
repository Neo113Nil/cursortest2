package com.yandex.passport.internal.core.auth;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.yandex.passport.R;
import com.yandex.passport.internal.core.accounts.u;
import com.yandex.passport.internal.core.announcing.b;
import com.yandex.passport.internal.database.d;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.report.reporters.x0;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.sloth.q;
import com.yandex.passport.internal.usecase.b2;
import com.yandex.passport.internal.usecase.v1;
import com.yandex.passport.internal.usecase.w1;
import defpackage.su4;
import defpackage.yd5;
import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a extends AbstractAccountAuthenticator {
    public final Context a;
    public final b2 b;
    public final d c;
    public final b d;
    public final com.yandex.passport.internal.account.b e;

    public a(Context context, b2 b2Var, d dVar, b bVar, com.yandex.passport.internal.account.b bVar2) {
        super(context);
        this.a = context;
        this.c = dVar;
        this.b = b2Var;
        this.d = bVar;
        this.e = bVar2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        StringBuilder sb = new StringBuilder("addAccount: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" accountType=");
        sb.append(str);
        sb.append(" authTokenType=");
        sb.append(str2);
        sb.append(" requiredFeatures.length=");
        sb.append(strArr != null ? Integer.valueOf(strArr.length) : null);
        sb.append(" options=");
        sb.append(bundle != null ? bundle.toString() : null);
        com.yandex.passport.legacy.a.e(3, sb.toString(), null);
        int i = GlobalRouterActivity.i;
        Intent a = com.yandex.passport.internal.ui.router.b.a(this.a, null, true, null, "com.yandex.passport.ACTION_SYSTEM_ADD_ACCOUNT");
        a.setAction("com.yandex.passport.ACTION_SYSTEM_ADD_ACCOUNT");
        a.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", a);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        StringBuilder sb = new StringBuilder("confirmCredentials: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" account=");
        sb.append(account);
        sb.append(" options=");
        sb.append(bundle != null ? bundle.toString() : null);
        com.yandex.passport.legacy.a.a(sb.toString());
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        com.yandex.passport.legacy.a.a("editProperties: response=" + accountAuthenticatorResponse + " accountType=" + str);
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        l lVar;
        boolean isEmpty = u.a.isEmpty();
        Continuation continuation = null;
        com.yandex.passport.legacy.a.e(3, "getAccountRemovalAllowed: response=" + accountAuthenticatorResponse + " account=" + account + " fromSystemSettings=" + isEmpty, null);
        if (isEmpty) {
            String str = account.name;
            d dVar = this.c;
            dVar.getClass();
            str.getClass();
            com.yandex.passport.internal.database.a aVar = dVar.d;
            aVar.getClass();
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) aVar.a.invoke();
            StringBuilder sb = new StringBuilder("SELECT ");
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                sb2.append(com.yandex.passport.internal.database.tables.a.b[i]);
                if (i != 9) {
                    sb2.append(", ");
                }
            }
            sb.append(sb2.toString());
            sb.append(" FROM accounts WHERE name = ?");
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), new String[]{str});
            try {
                Cursor cursor = rawQuery;
                if (cursor.moveToFirst()) {
                    l b = aVar.g.b(aVar.a(cursor, str));
                    yd5.q(rawQuery, null);
                    lVar = b;
                } else {
                    yd5.q(rawQuery, null);
                    lVar = null;
                }
                if (lVar == null) {
                    com.yandex.passport.legacy.a.d(new IllegalArgumentException(su4.o(new StringBuilder("Account with name "), account.name, " not found in db to revoke token")));
                } else {
                    this.d.c(lVar, true);
                    this.e.a(lVar.b);
                    v1 v1Var = new v1(lVar, lVar.d, new w1(account), lVar.b, x0.e, true);
                    b2 b2Var = this.b;
                    b2Var.getClass();
                    com.yandex.passport.internal.ui.a.z(new q(b2Var, v1Var, continuation, 17));
                }
            } finally {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", true);
        return bundle;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder("getAuthToken: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" account=");
        sb.append(account);
        sb.append(" authTokenType=");
        sb.append(str);
        sb.append(" options=");
        sb.append(bundle != null ? bundle.toString() : null);
        com.yandex.passport.legacy.a.a(sb.toString());
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final String getAuthTokenLabel(String str) {
        com.yandex.passport.legacy.a.a("getAuthTokenLabel: authTokenType=" + str);
        return this.a.getString(R.string.passport_auth_token_label);
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        StringBuilder sb = new StringBuilder("hasFeatures: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" account=");
        sb.append(account);
        sb.append(" paramArray=");
        sb.append(strArr != null ? Arrays.asList(strArr) : null);
        com.yandex.passport.legacy.a.e(3, sb.toString(), null);
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", false);
        return bundle;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder("updateCredentials: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" account=");
        sb.append(account);
        sb.append(" authTokenType=");
        sb.append(str);
        sb.append(" options=");
        sb.append(bundle != null ? bundle.toString() : null);
        com.yandex.passport.legacy.a.a(sb.toString());
        throw new UnsupportedOperationException();
    }
}
