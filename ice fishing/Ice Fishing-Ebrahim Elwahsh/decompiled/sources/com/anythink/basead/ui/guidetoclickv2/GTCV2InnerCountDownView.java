package com.anythink.basead.ui.guidetoclickv2;

import D.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.s;

/* loaded from: classes.dex */
public class GTCV2InnerCountDownView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    s f11056a;

    /* renamed from: b, reason: collision with root package name */
    TextView f11057b;

    /* renamed from: c, reason: collision with root package name */
    TextView f11058c;

    /* renamed from: d, reason: collision with root package name */
    TextView f11059d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f11060e;

    /* renamed from: f, reason: collision with root package name */
    ImageView f11061f;

    /* renamed from: g, reason: collision with root package name */
    ImageView f11062g;

    /* renamed from: h, reason: collision with root package name */
    final long f11063h;
    final long i;

    /* renamed from: j, reason: collision with root package name */
    private a f11064j;

    public interface a {
        void a();

        void b();
    }

    public GTCV2InnerCountDownView(Context context) {
        super(context);
        this.f11063h = 120000L;
        this.i = 500L;
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_inner_count_down_view", "layout"), this);
        this.f11060e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        this.f11061f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_gift_icon", "id"));
        this.f11062g = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_ribbon", "id"));
        this.f11057b = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_ct_min", "id"));
        this.f11058c = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_ct_sec", "id"));
        this.f11059d = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_ct_cta", "id"));
        String a9 = g.a().a(b.d.f12279g);
        if (!TextUtils.isEmpty(a9)) {
            y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    ImageView imageView = GTCV2InnerCountDownView.this.f11061f;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            });
        }
        String a10 = g.a().a(b.d.f12280h);
        if (TextUtils.isEmpty(a10)) {
            return;
        }
        y.f().a(new e(3, a10), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.2
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                ImageView imageView = GTCV2InnerCountDownView.this.f11062g;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
            }
        });
    }

    public void initSetting(final a aVar) {
        this.f11064j = aVar;
        s sVar = new s() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(120000L);
            }

            @Override // com.anythink.core.common.v.s
            public final void a(long j9) {
                long j10 = j9 / 1000;
                int i = (int) (j10 / 60);
                int i4 = (int) (j10 % 60);
                TextView textView = GTCV2InnerCountDownView.this.f11057b;
                if (textView != null) {
                    textView.setText(String.format("%02d", Integer.valueOf(i)));
                }
                TextView textView2 = GTCV2InnerCountDownView.this.f11058c;
                if (textView2 != null) {
                    textView2.setText(String.format("%02d", Integer.valueOf(i4)));
                }
            }

            @Override // com.anythink.core.common.v.s
            public final void a() {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
        };
        this.f11056a = sVar;
        sVar.b();
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        this.f11059d.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        });
        this.f11060e.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public final void onPause() {
        s sVar = this.f11056a;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void onResume() {
        s sVar = this.f11056a;
        if (sVar != null) {
            sVar.e();
        }
    }

    public final void release() {
        s sVar = this.f11056a;
        if (sVar != null) {
            sVar.c();
        }
    }

    public GTCV2InnerCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11063h = 120000L;
        this.i = 500L;
        a();
    }

    public GTCV2InnerCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11063h = 120000L;
        this.i = 500L;
        a();
    }
}
