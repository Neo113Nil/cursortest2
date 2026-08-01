package com.icefishing.icefishingbigwin.adscode;

import O.L;
import O.X;
import android.os.Bundle;
import android.view.View;
import com.icefishing.icefishingbigwin.C5275R;
import d4.f;
import h.AbstractActivityC4551k;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ApplinkActivity extends AbstractActivityC4551k {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f36901u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final String f36902n = "https://raw.githubusercontent.com/smtpatel9211/2026/refs/heads/main/com.icefishing.icefishingbigwin";

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_applink);
        View findViewById = findViewById(C5275R.id.main);
        f fVar = new f(14);
        WeakHashMap weakHashMap = X.f2054a;
        L.u(findViewById, fVar);
    }
}
