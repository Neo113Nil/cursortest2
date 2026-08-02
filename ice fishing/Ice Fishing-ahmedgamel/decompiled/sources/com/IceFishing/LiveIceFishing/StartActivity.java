package com.IceFishing.LiveIceFishing;

import O.L;
import O.X;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4555k;
import java.util.WeakHashMap;
import p4.C4837a;
import u7.C5085k;

/* loaded from: classes.dex */
public class StartActivity extends AbstractActivityC4555k {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f6381z = 0;

    /* renamed from: n, reason: collision with root package name */
    public CardView f6382n;

    /* renamed from: u, reason: collision with root package name */
    public CardView f6383u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f6384v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f6385w;

    /* renamed from: x, reason: collision with root package name */
    public final StartActivity f6386x = this;

    /* renamed from: y, reason: collision with root package name */
    public Intent f6387y;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        Dialog dialog = new Dialog(this);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Window window = dialog.getWindow();
        window.setLayout(-1, -2);
        dialog.getWindow().getAttributes().windowAnimations = C5248R.style.AD_DialogAnimation;
        window.setFlags(1024, 1024);
        dialog.setContentView(dialog.getLayoutInflater().inflate(C5248R.layout.dialog_exit, (ViewGroup) null));
        dialog.getWindow().setLayout(-1, -2);
        try {
            Y0.p.c(this.f6386x, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) dialog.findViewById(C5248R.id.native_ad_container));
        } catch (Exception unused) {
        }
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ((TextView) dialog.findViewById(C5248R.id.txtExitNo)).setOnClickListener(new H(this, dialog, 0));
        ((TextView) dialog.findViewById(C5248R.id.txtExitYes)).setOnClickListener(new H(this, dialog, 1));
        dialog.show();
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_start);
        C5085k c5085k = p4.g.f39820a;
        ((p4.c) c5085k.getValue()).initWithContext(this, "f2a35f4f-9ae4-41ac-b40d-ed960fc01377");
        i5.n notifications = ((p4.c) c5085k.getValue()).getNotifications();
        N6.g gVar = new N6.g(2);
        Z7.e eVar = S7.F.f2998a;
        T7.e context = X7.o.f3811a;
        kotlin.jvm.internal.h.e(context, "context");
        notifications.requestPermission(true, new C4837a(context, gVar));
        View findViewById = findViewById(C5248R.id.main);
        D0.n nVar = new D0.n(28);
        WeakHashMap weakHashMap = X.f2142a;
        L.u(findViewById, nVar);
        StartActivity startActivity = this.f6386x;
        Y0.p.i(startActivity, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(startActivity, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        this.f6382n = (CardView) findViewById(C5248R.id.ivStart);
        this.f6385w = (CardView) findViewById(C5248R.id.ivShare);
        this.f6384v = (CardView) findViewById(C5248R.id.ivRate);
        this.f6383u = (CardView) findViewById(C5248R.id.ivPrivacy);
        this.f6382n.setOnClickListener(new G(this, 0));
        this.f6383u.setOnClickListener(new G(this, 1));
        this.f6384v.setOnClickListener(new G(this, 2));
        this.f6385w.setOnClickListener(new G(this, 3));
    }
}
