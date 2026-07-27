package com.icefishing.icefishingliveapp.adscode;

import O.L;
import O.X;
import android.os.Bundle;
import android.view.View;
import com.anythink.core.common.n.b.A;
import com.icefishing.icefishingliveapp.C5284R;
import h.AbstractActivityC4553l;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ApplinkActivity extends AbstractActivityC4553l {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f37062u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final String f37063n = "https://raw.githubusercontent.com/smtpatel9211/2026/refs/heads/main/com.icefishing.icefishingliveapp";

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_applink);
        View findViewById = findViewById(C5284R.id.main);
        A a9 = new A(14);
        WeakHashMap weakHashMap = X.f2240a;
        L.u(findViewById, a9);
    }
}
