package com.yandex.passport.internal.social;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.yandex.passport.R;
import defpackage.a8o;
import defpackage.au7;
import defpackage.b8o;
import defpackage.fo0;
import defpackage.h66;
import defpackage.hq0;
import defpackage.hzw;
import defpackage.i4w;
import defpackage.mz1;
import defpackage.nzw;
import defpackage.oyf;
import defpackage.po0;
import defpackage.smd;
import defpackage.t7e;
import defpackage.uww;
import defpackage.vnd;
import defpackage.xy0;
import defpackage.y1g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes4.dex */
public class GoogleNativeSocialAuthActivity extends hq0 {
    public static final Scope k = new Scope(1, "https://mail.google.com/");
    public String a;
    public boolean b;
    public String c;
    public uww d;
    public boolean e;
    public boolean f;
    public final a g = new smd() { // from class: com.yandex.passport.internal.social.a
        @Override // defpackage.smd
        public final void X(h66 h66Var) {
            Scope scope = GoogleNativeSocialAuthActivity.k;
            NativeSocialHelper.onFailure(GoogleNativeSocialAuthActivity.this, new Exception("GoogleApiClient connection failed(code=" + h66Var.b + ", message=" + h66Var.d + ")"));
        }
    };
    public final c h = new c(this);
    public final b i = new b8o() { // from class: com.yandex.passport.internal.social.b
        @Override // defpackage.b8o
        public final void a(a8o a8oVar) {
            GoogleNativeSocialAuthActivity googleNativeSocialAuthActivity = GoogleNativeSocialAuthActivity.this;
            if (googleNativeSocialAuthActivity.f) {
                googleNativeSocialAuthActivity.j();
            } else {
                googleNativeSocialAuthActivity.j = new androidx.core.app.a(4, googleNativeSocialAuthActivity);
            }
        }
    };
    public androidx.core.app.a j;

    public final void j() {
        this.e = true;
        uww uwwVar = this.d;
        mz1.b.getClass();
        Context context = uwwVar.f;
        fo0 fo0Var = (fo0) uwwVar.o.get(mz1.c);
        y1g.H(fo0Var, "Appropriate Api was not requested.");
        startActivityForResult(nzw.a(context, ((hzw) fo0Var).E), 200);
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        vnd vndVar;
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            mz1.b.getClass();
            t7e t7eVar = nzw.a;
            Status status = Status.g;
            if (intent == null) {
                vndVar = new vnd(null, status);
            } else {
                Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                if (googleSignInAccount == null) {
                    if (status2 != null) {
                        status = status2;
                    }
                    vndVar = new vnd(null, status);
                } else {
                    vndVar = new vnd(googleSignInAccount, Status.e);
                }
            }
            Status status3 = vndVar.a;
            int i3 = status3.a;
            if (status3.d()) {
                GoogleSignInAccount googleSignInAccount2 = vndVar.b;
                if (googleSignInAccount2 == null) {
                    NativeSocialHelper.onFailure(this, new Exception("GoogleSignInAccount null"));
                    return;
                }
                String str = googleSignInAccount2.g;
                if (str == null) {
                    NativeSocialHelper.onFailure(this, new Exception("server auth code null"));
                    return;
                } else {
                    NativeSocialHelper.onTokenReceived(this, str, this.a);
                    return;
                }
            }
            if (i3 == 16) {
                NativeSocialHelper.onCancel(this);
                return;
            }
            if (i3 == 12501) {
                NativeSocialHelper.onCancel(this);
                return;
            }
            if (i3 == 13) {
                NativeSocialHelper.onCancel(this);
            } else {
                if (i3 == 7) {
                    NativeSocialHelper.onFailure(this, new IOException("Google auth network error"));
                    return;
                }
                NativeSocialHelper.onFailure(this, new Exception("Google auth failed: " + i3));
            }
        }
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getString(R.string.passport_default_google_client_id);
        this.b = "com.yandex.passport.action.NATIVE_MAILISH_GOOGLE_AUTH".equals(getIntent().getAction());
        this.c = getIntent().getStringExtra("account-name");
        if (bundle != null) {
            this.e = bundle.getBoolean("authorization-started");
        }
        au7 au7Var = new au7(this);
        oyf oyfVar = new oyf(this);
        au7Var.a = 0;
        au7Var.j = this.g;
        au7Var.i = oyfVar;
        String str = this.c;
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.k;
        new HashSet();
        new HashMap();
        y1g.G(googleSignInOptions);
        HashSet hashSet = new HashSet(googleSignInOptions.b);
        boolean z = googleSignInOptions.d;
        String str2 = googleSignInOptions.g;
        Account account = googleSignInOptions.c;
        String str3 = googleSignInOptions.h;
        HashMap b = GoogleSignInOptions.b(googleSignInOptions.i);
        String str4 = googleSignInOptions.j;
        String str5 = this.a;
        boolean z2 = this.b;
        y1g.C(str5);
        y1g.y("two different server client ids provided", str2 == null || str2.equals(str5));
        hashSet.add(GoogleSignInOptions.m);
        hashSet.add(GoogleSignInOptions.l);
        if (!TextUtils.isEmpty(str)) {
            y1g.C(str);
            account = new Account(str, "com.google");
        }
        Account account2 = account;
        if (this.b) {
            hashSet.add(k);
            hashSet.addAll(Arrays.asList(new Scope[0]));
        }
        if (hashSet.contains(GoogleSignInOptions.p)) {
            Scope scope = GoogleSignInOptions.o;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (z && (account2 == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.n);
        }
        GoogleSignInOptions googleSignInOptions2 = new GoogleSignInOptions(3, new ArrayList(hashSet), account2, z, true, z2, str5, str3, b, str4);
        po0 po0Var = mz1.a;
        y1g.H(po0Var, "Api must not be null");
        ((xy0) au7Var.h).put(po0Var, googleSignInOptions2);
        i4w i4wVar = po0Var.a;
        y1g.H(i4wVar, "Base client builder must not be null");
        List I = i4wVar.I(googleSignInOptions2);
        ((HashSet) au7Var.c).addAll(I);
        ((HashSet) au7Var.b).addAll(I);
        c cVar = this.h;
        y1g.H(cVar, "Listener must not be null");
        ((ArrayList) au7Var.n).add(cVar);
        this.d = au7Var.d();
        if (!this.e) {
            if (com.yandex.passport.common.util.a.b(this)) {
                this.d.g();
            } else {
                NativeSocialHelper.onNativeNotSupported(this);
            }
        }
        com.yandex.passport.legacy.a.e(3, "onCreate: test for Logger.d() method in ':passport-social' module", null);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        this.d.a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        this.f = false;
        super.onPause();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f = true;
        androidx.core.app.a aVar = this.j;
        if (aVar != null) {
            aVar.run();
            this.j = null;
        }
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authorization-started", this.e);
    }
}
