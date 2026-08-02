package com.IceFishing.LiveIceFishing.adscode;

import D0.n;
import O.L;
import O.X;
import android.os.Bundle;
import android.view.View;
import com.IceFishing.LiveIceFishing.C5248R;
import h.AbstractActivityC4555k;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ApplinkActivity extends AbstractActivityC4555k {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f6390u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final String f6391n = "https://raw.githubusercontent.com/smtpatel9211/2026/refs/heads/main/com.IceFishing.LiveIceFishing";

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_applink);
        View findViewById = findViewById(C5248R.id.main);
        n nVar = new n(22);
        WeakHashMap weakHashMap = X.f2142a;
        L.u(findViewById, nVar);
    }
}
