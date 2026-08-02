package com.IceFishing.LiveIceFishing;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anythink.expressad.foundation.d.d;
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public class PlaygamesActivity extends AbstractActivityC4555k {

    /* renamed from: n, reason: collision with root package name */
    public ImageView f6368n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f6369u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f6370v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f6371w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f6372x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f6373y;

    /* renamed from: z, reason: collision with root package name */
    public PlaygamesActivity f6374z;

    public PlaygamesActivity() {
        new Intent();
        this.f6369u = new Intent();
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.playgames);
        this.f6374z = this;
        Y0.p.i(this, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(this.f6374z, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        this.f6368n = (ImageView) findViewById(C5248R.id.imageview_down);
        this.f6370v = (TextView) findViewById(C5248R.id.text_game_title);
        this.f6372x = (TextView) findViewById(C5248R.id.tv_description);
        this.f6373y = (TextView) findViewById(C5248R.id.textview_url);
        this.f6371w = (TextView) findViewById(C5248R.id.textview_back);
        ((CardView) findViewById(C5248R.id.accept)).setOnClickListener(new B(this, 1));
        this.f6370v.setSelected(true);
        this.f6370v.setSingleLine(true);
        ((com.bumptech.glide.n) com.bumptech.glide.c.c(getApplicationContext()).k(Uri.parse(getIntent().getStringExtra(d.c.f19422e))).o()).E(this.f6368n);
        this.f6370v.setText(getIntent().getStringExtra(com.anythink.basead.exoplayer.k.o.f9232c));
        this.f6373y.setText(getIntent().getStringExtra("url"));
        this.f6371w.setText(getIntent().getStringExtra("back"));
        this.f6372x.setText(getIntent().getStringExtra("des"));
        findViewById(C5248R.id.back).setOnClickListener(new B(this, 0));
    }
}
