package com.anythink.basead.ui.guidetoclickv2;

import D.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.anythink.basead.ui.SimpleGuideToClickView;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class LuckyBagG2CV2View extends BaseLifecycleG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    SimpleGuideToClickView f10952d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f10953e;

    /* renamed from: f, reason: collision with root package name */
    ImageView f10954f;

    /* renamed from: g, reason: collision with root package name */
    View f10955g;

    public LuckyBagG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i6) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_lucky_bag", "layout"), this);
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f10954f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        this.f10955g = findViewById(q.a(getContext(), "myoffer_g2c_item_container", "id"));
        this.f10952d = (SimpleGuideToClickView) findViewById(q.a(getContext(), "myoffer_g2c_item_g2c_fingerview", "id"));
        ImageView imageView = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_lucky_bag_icon", "id"));
        this.f10953e = imageView;
        if (imageView != null) {
            String a9 = g.a().a(b.d.f12127m);
            if (!TextUtils.isEmpty(a9)) {
                y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.LuckyBagG2CV2View.1
                    @Override // com.anythink.core.common.res.b.a
                    public final void onFail(String str, String str2) {
                    }

                    @Override // com.anythink.core.common.res.b.a
                    public final void onSuccess(String str, Bitmap bitmap) {
                        ImageView imageView2 = LuckyBagG2CV2View.this.f10953e;
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(bitmap);
                        }
                    }
                });
            }
        }
        SimpleGuideToClickView simpleGuideToClickView = this.f10952d;
        if (simpleGuideToClickView != null) {
            simpleGuideToClickView.init(q.a(getContext(), "myoffer_simple_guide_to_click", "layout"), q.a(getContext(), 4.0f), q.a(getContext(), 6.0f), q.a(getContext(), 8.0f), q.a(getContext(), 12.0f));
            final ImageView imageView2 = (ImageView) this.f10952d.findViewById(q.a(getContext(), "myoffer_guide_to_click_finger", "id"));
            if (imageView2 != null) {
                String a10 = g.a().a(b.d.f12125k);
                if (!TextUtils.isEmpty(a10)) {
                    y.f().a(new e(3, a10), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.LuckyBagG2CV2View.2
                        @Override // com.anythink.core.common.res.b.a
                        public final void onFail(String str, String str2) {
                        }

                        @Override // com.anythink.core.common.res.b.a
                        public final void onSuccess(String str, Bitmap bitmap) {
                            ImageView imageView3 = imageView2;
                            if (imageView3 != null) {
                                imageView3.setImageBitmap(bitmap);
                            }
                        }
                    });
                }
            }
        }
        this.f10955g.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.LuckyBagG2CV2View.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LuckyBagG2CV2View.this.removeAllViews();
                LuckyBagG2CV2View.this.d();
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.LuckyBagG2CV2View.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        ImageView imageView3 = this.f10954f;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.LuckyBagG2CV2View.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LuckyBagG2CV2View.this.c();
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View
    public final int e() {
        return 43;
    }
}
