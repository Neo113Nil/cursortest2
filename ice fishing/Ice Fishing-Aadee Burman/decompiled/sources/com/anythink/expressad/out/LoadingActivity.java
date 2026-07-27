package com.anythink.expressad.out;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.ATImageView;

/* loaded from: classes.dex */
public class LoadingActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f20004b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f20005c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f20006d;

    /* renamed from: e, reason: collision with root package name */
    private a f20007e;

    /* renamed from: f, reason: collision with root package name */
    private String f20008f;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f20010h;
    private RelativeLayout i;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.d.c f20009g = new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.out.LoadingActivity.1
        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (LoadingActivity.this.f20005c == null || bitmap == null || bitmap.isRecycled() || !((String) LoadingActivity.this.f20005c.getTag()).equals(str)) {
                return;
            }
            LoadingActivity.this.f20005c.setImageBitmap(bitmap);
            LoadingActivity.this.f20006d = bitmap;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    BroadcastReceiver f20003a = new BroadcastReceiver() { // from class: com.anythink.expressad.out.LoadingActivity.2
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            LoadingActivity.this.finish();
        }
    };

    public interface a {
        void a();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("icon_url")) {
            this.f20008f = getIntent().getStringExtra("icon_url");
        }
        if (this.f20004b == null) {
            this.f20004b = new RelativeLayout(this);
            this.i = new RelativeLayout(this);
            int b9 = v.b(this, 15.0f);
            this.i.setPadding(b9, b9, b9, b9);
            this.i.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(this, "anythink_native_bg_loading_camera", com.anythink.expressad.foundation.h.k.f19632c));
            this.i.addView(new TextView(this), new RelativeLayout.LayoutParams(v.b(this, 140.0f), v.b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.f20005c = aTImageView;
            aTImageView.setId(v.a());
            this.f20005c.setTag(this.f20008f);
            if (!TextUtils.isEmpty(this.f20008f)) {
                com.anythink.expressad.foundation.g.d.b.a(getApplicationContext()).a(this.f20008f, this.f20009g);
            }
            int b10 = v.b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b10, b10);
            layoutParams.addRule(13, -1);
            this.i.addView(this.f20005c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.f20005c.getId());
            layoutParams2.addRule(14, -1);
            this.i.addView(textView, layoutParams2);
            this.f20004b.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
        }
        setContentView(this.f20004b);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f20003a != null) {
            com.anythink.core.common.d.n.a(this).a(this.f20003a);
        }
        ImageView imageView = this.f20005c;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f20005c = null;
        this.f20004b = null;
        this.f20009g = null;
        this.f20010h = null;
        RelativeLayout relativeLayout = this.i;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundDrawable(null);
        }
        this.i = null;
        Bitmap bitmap = this.f20006d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f20006d = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ExitApp");
        if (this.f20003a != null) {
            com.anythink.core.common.d.n.a(this).a(this.f20003a, intentFilter);
        }
    }

    private View a() {
        if (this.f20004b == null) {
            this.f20004b = new RelativeLayout(this);
            this.i = new RelativeLayout(this);
            int b9 = v.b(this, 15.0f);
            this.i.setPadding(b9, b9, b9, b9);
            this.i.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(this, "anythink_native_bg_loading_camera", com.anythink.expressad.foundation.h.k.f19632c));
            this.i.addView(new TextView(this), new RelativeLayout.LayoutParams(v.b(this, 140.0f), v.b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.f20005c = aTImageView;
            aTImageView.setId(v.a());
            this.f20005c.setTag(this.f20008f);
            if (!TextUtils.isEmpty(this.f20008f)) {
                com.anythink.expressad.foundation.g.d.b.a(getApplicationContext()).a(this.f20008f, this.f20009g);
            }
            int b10 = v.b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b10, b10);
            layoutParams.addRule(13, -1);
            this.i.addView(this.f20005c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.f20005c.getId());
            layoutParams2.addRule(14, -1);
            this.i.addView(textView, layoutParams2);
            this.f20004b.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
        }
        return this.f20004b;
    }
}
