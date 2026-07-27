package com.icefishing.icefishingliveapp;

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
import h.AbstractActivityC4553l;
import java.util.WeakHashMap;
import l4.C4691a;
import q7.C4942k;

/* loaded from: classes2.dex */
public class StartActivity extends AbstractActivityC4553l {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f37053z = 0;

    /* renamed from: n, reason: collision with root package name */
    public CardView f37054n;

    /* renamed from: u, reason: collision with root package name */
    public CardView f37055u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f37056v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f37057w;

    /* renamed from: x, reason: collision with root package name */
    public final StartActivity f37058x = this;

    /* renamed from: y, reason: collision with root package name */
    public Intent f37059y;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        Dialog dialog = new Dialog(this);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Window window = dialog.getWindow();
        window.setLayout(-1, -2);
        dialog.getWindow().getAttributes().windowAnimations = C5284R.style.AD_DialogAnimation;
        window.setFlags(1024, 1024);
        dialog.setContentView(dialog.getLayoutInflater().inflate(C5284R.layout.dialog_exit, (ViewGroup) null));
        dialog.getWindow().setLayout(-1, -2);
        try {
            k4.m.c(this.f37058x, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) dialog.findViewById(C5284R.id.native_ad_container));
        } catch (Exception unused) {
        }
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ((TextView) dialog.findViewById(C5284R.id.txtExitNo)).setOnClickListener(new G(this, dialog, 0));
        ((TextView) dialog.findViewById(C5284R.id.txtExitYes)).setOnClickListener(new G(this, dialog, 1));
        dialog.show();
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_start);
        C4942k c4942k = l4.g.f39053a;
        ((l4.c) c4942k.getValue()).initWithContext(this, "f2a35f4f-9ae4-41ac-b40d-ed960fc01377");
        e5.n notifications = ((l4.c) c4942k.getValue()).getNotifications();
        J6.g gVar = new J6.g(2);
        V7.e eVar = O7.F.f2551a;
        P7.e context = T7.o.f3162a;
        kotlin.jvm.internal.h.e(context, "context");
        notifications.requestPermission(true, new C4691a(context, gVar));
        View findViewById = findViewById(C5284R.id.main);
        com.anythink.core.common.n.b.A a9 = new com.anythink.core.common.n.b.A(6);
        WeakHashMap weakHashMap = X.f2240a;
        L.u(findViewById, a9);
        StartActivity startActivity = this.f37058x;
        k4.m.i(startActivity, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(startActivity, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        this.f37054n = (CardView) findViewById(C5284R.id.ivStart);
        this.f37057w = (CardView) findViewById(C5284R.id.ivShare);
        this.f37056v = (CardView) findViewById(C5284R.id.ivRate);
        this.f37055u = (CardView) findViewById(C5284R.id.ivPrivacy);
        this.f37054n.setOnClickListener(new F(this, 0));
        this.f37055u.setOnClickListener(new F(this, 1));
        this.f37056v.setOnClickListener(new F(this, 2));
        this.f37057w.setOnClickListener(new F(this, 3));
    }
}
