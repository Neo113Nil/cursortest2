package com.google.android.gms.ads;

import W2.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.icefishing.icefishingbigwin.C5275R;
import q2.C4876d;
import q2.C4896n;
import q2.C4900p;
import q2.InterfaceC4908t0;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4896n c4896n = C4900p.f40199g.f40201b;
        BinderC3464kd binderC3464kd = new BinderC3464kd();
        c4896n.getClass();
        InterfaceC4908t0 interfaceC4908t0 = (InterfaceC4908t0) new C4876d(c4896n, this, binderC3464kd).d(this, false);
        if (interfaceC4908t0 == null) {
            finish();
            return;
        }
        setContentView(C5275R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(C5275R.id.layout);
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
            interfaceC4908t0.U2(stringExtra, new b(this), new b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
