package com.yandex.passport.internal.authsdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.passport.R;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.n;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.entities.k;
import com.yandex.passport.internal.entities.s;
import com.yandex.passport.internal.filter.l;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.jj4;
import defpackage.ouj;
import defpackage.wzv;
import defpackage.x97;
import defpackage.xq0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.g;

/* loaded from: classes4.dex */
public class AuthSdkProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        boolean z;
        boolean z2;
        try {
            if (str == null) {
                jj4.j("Name is null");
            } else if (!str.equals("GetAccounts")) {
                xq0.x("No enum constant com.yandex.passport.internal.authsdk.AuthSdkProviderHelper.Method.".concat(str));
            }
            Context context = getContext();
            context.getClass();
            str = context.getPackageManager().getNameForUid(Binder.getCallingUid());
            a loginSdkProviderHelper = com.yandex.passport.internal.di.a.a().getLoginSdkProviderHelper();
            if (str != null) {
                Context context2 = getContext();
                loginSdkProviderHelper.getClass();
                String[] stringArray = context2.getResources().getStringArray(R.array.passport_trusted_application_fingerprints);
                int length = stringArray.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    String[] split = stringArray[i].split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (TextUtils.equals(split[0], str)) {
                        PackageManager packageManager = context2.getPackageManager();
                        String str3 = split[1];
                        try {
                            byte[] bArr = s.c;
                            z2 = com.yandex.plus.core.network.api.utils.a.q(packageManager, str).a(str3);
                        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
                            z2 = false;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
                if (z) {
                    if (ouj.D(1) != 0) {
                        xq0.q("Unknown method");
                        return null;
                    }
                    l lVar = loginSdkProviderHelper.b;
                    ArrayList g = loginSdkProviderHelper.a.a().g();
                    b bVar = b.c;
                    j jVar = new j();
                    jVar.O(bVar);
                    jVar.y(n.CHILDISH);
                    k l = jVar.l();
                    lVar.getClass();
                    List list = (List) x97.D(g.a, new wzv(lVar, g, l, null, 21));
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("com.yandex.auth.ACCOUNTS_COUNT", list.size());
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) list.get(i2);
                        bundle2.putLong(dfi.c(i2, "account-", "-com.yandex.auth.UID_VALUE"), lVar2.b.b);
                        bundle2.putString(f1d.i(new StringBuilder("account-"), i2, "-com.yandex.auth.PRIMARY_DISPLAY_NAME"), lVar2.i());
                        bundle2.putString("account-" + i2 + "-com.yandex.auth.SECONDARY_DISPLAY_NAME", lVar2.j());
                        bundle2.putBoolean("account-" + i2 + "-com.yandex.auth.IS_AVATAR_EMPTY", lVar2.e.k);
                        String str4 = "account-" + i2 + "-com.yandex.auth.AVATAR_URL";
                        String g2 = lVar2.g();
                        if (g2 == null) {
                            g2 = null;
                        }
                        bundle2.putString(str4, g2);
                    }
                    return bundle2;
                }
            }
            throw new SecurityException("Untrusted application");
        } catch (IllegalArgumentException unused2) {
            return com.yandex.plus.pay.ui.core.b.v(new t(hrg.q("Unknown provider method '", str, "'")));
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
