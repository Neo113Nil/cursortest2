package com.google.android.gms.ads;

import Y2.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.BinderC3487kd;
import s2.C4925d;
import s2.C4945n;
import s2.C4949p;
import s2.InterfaceC4957t0;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4945n c4945n = C4949p.f40498g.f40500b;
        BinderC3487kd binderC3487kd = new BinderC3487kd();
        c4945n.getClass();
        InterfaceC4957t0 interfaceC4957t0 = (InterfaceC4957t0) new C4925d(c4945n, this, binderC3487kd).d(this, false);
        if (interfaceC4957t0 == null) {
            finish();
            return;
        }
        setContentView(C5248R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(C5248R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            interfaceC4957t0.E1(stringExtra, new b(this), new b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
