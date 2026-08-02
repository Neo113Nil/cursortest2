package com.icefishingapp.icefishing;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anythink.expressad.foundation.d.d;
import h.AbstractActivityC4551k;

/* loaded from: classes2.dex */
public class PlaygamesActivity extends AbstractActivityC4551k {

    /* renamed from: n, reason: collision with root package name */
    public ImageView f36879n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f36880u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f36881v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f36882w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f36883x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f36884y;

    /* renamed from: z, reason: collision with root package name */
    public PlaygamesActivity f36885z;

    public PlaygamesActivity() {
        new Intent();
        this.f36880u = new Intent();
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.playgames);
        this.f36885z = this;
        o4.m.i(this, o4.m.f39626s, o4.m.f39618k, o4.m.f39599H, o4.m.f39602L, (ViewGroup) findViewById(C5275R.id.banner_container));
        o4.m.k(this.f36885z, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        this.f36879n = (ImageView) findViewById(C5275R.id.imageview_down);
        this.f36881v = (TextView) findViewById(C5275R.id.text_game_title);
        this.f36883x = (TextView) findViewById(C5275R.id.tv_description);
        this.f36884y = (TextView) findViewById(C5275R.id.textview_url);
        this.f36882w = (TextView) findViewById(C5275R.id.textview_back);
        ((CardView) findViewById(C5275R.id.accept)).setOnClickListener(new A(this, 1));
        this.f36881v.setSelected(true);
        this.f36881v.setSingleLine(true);
        ((com.bumptech.glide.n) com.bumptech.glide.c.c(getApplicationContext()).k(Uri.parse(getIntent().getStringExtra(d.c.f18635e))).o()).E(this.f36879n);
        this.f36881v.setText(getIntent().getStringExtra(com.anythink.basead.exoplayer.k.o.f8446c));
        this.f36884y.setText(getIntent().getStringExtra("url"));
        this.f36882w.setText(getIntent().getStringExtra("back"));
        this.f36883x.setText(getIntent().getStringExtra("des"));
        findViewById(C5275R.id.back).setOnClickListener(new A(this, 0));
    }
}
