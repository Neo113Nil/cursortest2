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
    s f10899a;

    /* renamed from: b, reason: collision with root package name */
    TextView f10900b;

    /* renamed from: c, reason: collision with root package name */
    TextView f10901c;

    /* renamed from: d, reason: collision with root package name */
    TextView f10902d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f10903e;

    /* renamed from: f, reason: collision with root package name */
    ImageView f10904f;

    /* renamed from: g, reason: collision with root package name */
    ImageView f10905g;

    /* renamed from: h, reason: collision with root package name */
    final long f10906h;
    final long i;

    /* renamed from: j, reason: collision with root package name */
    private a f10907j;

    public interface a {
        void a();

        void b();
    }

    public GTCV2InnerCountDownView(Context context) {
        super(context);
        this.f10906h = 120000L;
        this.i = 500L;
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_inner_count_down_view", "layout"), this);
        this.f10903e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        this.f10904f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_gift_icon", "id"));
        this.f10905g = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_ribbon", "id"));
        this.f10900b = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_ct_min", "id"));
        this.f10901c = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_ct_sec", "id"));
        this.f10902d = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_ct_cta", "id"));
        String a9 = g.a().a(b.d.f12122g);
        if (!TextUtils.isEmpty(a9)) {
            y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    ImageView imageView = GTCV2InnerCountDownView.this.f10904f;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            });
        }
        String a10 = g.a().a(b.d.f12123h);
        if (TextUtils.isEmpty(a10)) {
            return;
        }
        y.f().a(new e(3, a10), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.2
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                ImageView imageView = GTCV2InnerCountDownView.this.f10905g;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
            }
        });
    }

    public void initSetting(final a aVar) {
        this.f10907j = aVar;
        s sVar = new s() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(120000L);
            }

            @Override // com.anythink.core.common.v.s
            public final void a(long j6) {
                long j9 = j6 / 1000;
                int i = (int) (j9 / 60);
                int i6 = (int) (j9 % 60);
                TextView textView = GTCV2InnerCountDownView.this.f10900b;
                if (textView != null) {
                    textView.setText(String.format("%02d", Integer.valueOf(i)));
                }
                TextView textView2 = GTCV2InnerCountDownView.this.f10901c;
                if (textView2 != null) {
                    textView2.setText(String.format("%02d", Integer.valueOf(i6)));
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
        this.f10899a = sVar;
        sVar.b();
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        this.f10902d.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        });
        this.f10903e.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.6
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
        s sVar = this.f10899a;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void onResume() {
        s sVar = this.f10899a;
        if (sVar != null) {
            sVar.e();
        }
    }

    public final void release() {
        s sVar = this.f10899a;
        if (sVar != null) {
            sVar.c();
        }
    }

    public GTCV2InnerCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10906h = 120000L;
        this.i = 500L;
        a();
    }

    public GTCV2InnerCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10906h = 120000L;
        this.i = 500L;
        a();
    }
}
