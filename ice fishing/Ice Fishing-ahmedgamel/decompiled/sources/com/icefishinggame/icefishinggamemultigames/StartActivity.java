package com.icefishinggame.icefishinggamemultigames;

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
import h.AbstractActivityC4551k;
import java.util.WeakHashMap;
import p4.C4837a;
import u7.C5093k;

/* loaded from: classes2.dex */
public class StartActivity extends AbstractActivityC4551k {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f36892z = 0;

    /* renamed from: n, reason: collision with root package name */
    public CardView f36893n;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36894u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36895v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36896w;

    /* renamed from: x, reason: collision with root package name */
    public final StartActivity f36897x = this;

    /* renamed from: y, reason: collision with root package name */
    public Intent f36898y;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        Dialog dialog = new Dialog(this);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Window window = dialog.getWindow();
        window.setLayout(-1, -2);
        dialog.getWindow().getAttributes().windowAnimations = C5275R.style.AD_DialogAnimation;
        window.setFlags(1024, 1024);
        dialog.setContentView(dialog.getLayoutInflater().inflate(C5275R.layout.dialog_exit, (ViewGroup) null));
        dialog.getWindow().setLayout(-1, -2);
        try {
            o4.m.c(this.f36897x, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) dialog.findViewById(C5275R.id.native_ad_container));
        } catch (Exception unused) {
        }
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ((TextView) dialog.findViewById(C5275R.id.txtExitNo)).setOnClickListener(new H(this, dialog, 0));
        ((TextView) dialog.findViewById(C5275R.id.txtExitYes)).setOnClickListener(new H(this, dialog, 1));
        dialog.show();
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_start);
        C5093k c5093k = p4.g.f39773a;
        ((p4.c) c5093k.getValue()).initWithContext(this, "f2a35f4f-9ae4-41ac-b40d-ed960fc01377");
        i5.n notifications = ((p4.c) c5093k.getValue()).getNotifications();
        N6.g gVar = new N6.g(2);
        Z7.e eVar = S7.F.f2915a;
        T7.e context = X7.o.f3856a;
        kotlin.jvm.internal.h.e(context, "context");
        notifications.requestPermission(true, new C4837a(context, gVar));
        View findViewById = findViewById(C5275R.id.main);
        B1.x xVar = new B1.x(29);
        WeakHashMap weakHashMap = X.f2054a;
        L.u(findViewById, xVar);
        StartActivity startActivity = this.f36897x;
        o4.m.i(startActivity, o4.m.f39626s, o4.m.f39618k, o4.m.f39599H, o4.m.f39602L, (ViewGroup) findViewById(C5275R.id.banner_container));
        o4.m.k(startActivity, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        this.f36893n = (CardView) findViewById(C5275R.id.ivStart);
        this.f36896w = (CardView) findViewById(C5275R.id.ivShare);
        this.f36895v = (CardView) findViewById(C5275R.id.ivRate);
        this.f36894u = (CardView) findViewById(C5275R.id.ivPrivacy);
        this.f36893n.setOnClickListener(new G(this, 0));
        this.f36894u.setOnClickListener(new G(this, 1));
        this.f36895v.setOnClickListener(new G(this, 2));
        this.f36896w.setOnClickListener(new G(this, 3));
    }
}
