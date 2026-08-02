package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import defpackage.bp6;
import defpackage.gvt;
import defpackage.hrg;
import defpackage.ix6;
import defpackage.j3c;
import defpackage.kx6;
import defpackage.l83;
import defpackage.noe;
import defpackage.ouj;
import defpackage.phg;
import defpackage.qjp;
import defpackage.vx6;
import defpackage.xwi;
import defpackage.yfx;
import defpackage.z0j;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public class CustomTabMainActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public boolean a = true;
    public l83 b;

    public final void a(int i, Intent intent) {
        Bundle bundle;
        phg.a(this).d(this.b);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                bundle = gvt.J(parse.getQuery());
                bundle.putAll(gvt.J(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent e = xwi.e(getIntent(), bundle, null);
            if (e != null) {
                intent = e;
            }
            setResult(i, intent);
        } else {
            setResult(i, xwi.e(getIntent(), null, null));
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i;
        ix6 noeVar;
        Uri a;
        boolean z;
        super.onCreate(bundle);
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action");
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        String stringExtra3 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        int[] E = ouj.E(2);
        int length = E.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = 1;
                break;
            }
            i = E[i2];
            if (hrg.e(i).equals(stringExtra3)) {
                break;
            } else {
                i2++;
            }
        }
        if (ouj.D(i) != 1) {
            noeVar = new ix6(bundleExtra, stringExtra);
        } else {
            stringExtra.getClass();
            noeVar = new noe(bundleExtra, stringExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (stringExtra.equals("oauth")) {
                Collection collection = qjp.a;
                a = gvt.a(String.format("m.%s", Arrays.copyOf(new Object[]{j3c.o}, 1)), "oauth/authorize", bundleExtra);
            } else {
                Collection collection2 = qjp.a;
                a = gvt.a(String.format("m.%s", Arrays.copyOf(new Object[]{j3c.o}, 1)), j3c.e() + "/dialog/" + stringExtra, bundleExtra);
            }
            if (!bp6.a.contains(noeVar)) {
                try {
                    noeVar.b = a;
                } catch (Throwable th) {
                    bp6.a(noeVar, th);
                }
            }
        }
        if (!bp6.a.contains(noeVar)) {
            try {
                vx6 vx6Var = kx6.c;
                kx6.c = null;
                yfx w = new z0j(vx6Var).w();
                ((Intent) w.b).setPackage(stringExtra2);
                try {
                    w.p(this, (Uri) noeVar.b);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                }
            } catch (Throwable th2) {
                bp6.a(noeVar, th2);
            }
            this.a = false;
            if (z) {
                setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
                finish();
                return;
            } else {
                this.b = new l83(8, this);
                phg.a(this).b(this.b, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
                return;
            }
        }
        z = false;
        this.a = false;
        if (z) {
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            phg.a(this).c(new Intent("CustomTabActivity.action_destroy"));
            a(-1, intent);
        } else if ("CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.a) {
            a(0, null);
        }
        this.a = true;
    }
}
