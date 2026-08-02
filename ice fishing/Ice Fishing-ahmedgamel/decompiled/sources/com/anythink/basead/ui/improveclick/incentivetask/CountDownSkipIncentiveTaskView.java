package com.anythink.basead.ui.improveclick.incentivetask;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.ui.SimpleGuideToClickView;
import com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.s;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class CountDownSkipIncentiveTaskView extends BaseIncentiveTaskView {

    /* renamed from: c, reason: collision with root package name */
    SimpleGuideToClickView f11996c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f11997d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f11998e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f11999f;

    /* renamed from: g, reason: collision with root package name */
    private RoundImageView f12000g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f12001h;
    private s i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12002j;

    public CountDownSkipIncentiveTaskView(Context context) {
        super(context);
        this.f12002j = false;
    }

    public static /* synthetic */ boolean c(CountDownSkipIncentiveTaskView countDownSkipIncentiveTaskView) {
        countDownSkipIncentiveTaskView.f12002j = true;
        return true;
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void initSetting(w wVar, y yVar, long j6, BaseIncentiveTaskView.a aVar) {
        TextView textView;
        RoundImageView roundImageView;
        super.initSetting(wVar, yVar, j6, aVar);
        long j9 = j6;
        if (j9 <= 0 || j9 >= yVar.o()) {
            j9 = yVar.o();
        }
        long bs = j9 - yVar.bs();
        long bt = yVar.bt();
        if (bt < bs) {
            String format = String.format(getContext().getString(q.a(getContext(), "myoffer_inctask_cts_hint", k.f20423g)), Integer.valueOf((int) Math.ceil(bt / 1000.0d)));
            TextView textView2 = this.f11997d;
            if (textView2 != null) {
                textView2.setText(format);
            }
            this.i = new s(bt) { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.1
                @Override // com.anythink.core.common.v.s
                public final void a(long j10) {
                    if (CountDownSkipIncentiveTaskView.this.f11999f != null) {
                        CountDownSkipIncentiveTaskView.this.f11999f.setText(String.format(CountDownSkipIncentiveTaskView.this.getContext().getString(q.a(CountDownSkipIncentiveTaskView.this.getContext(), "myoffer_inctask_cts_time", k.f20423g)), Integer.valueOf((int) Math.ceil(j10 / 1000.0d))));
                    }
                }

                @Override // com.anythink.core.common.v.s
                public final void a() {
                    if (CountDownSkipIncentiveTaskView.this.f12002j) {
                        CountDownSkipIncentiveTaskView.this.c();
                    } else {
                        CountDownSkipIncentiveTaskView.c(CountDownSkipIncentiveTaskView.this);
                    }
                }
            };
        } else {
            String string = getContext().getString(q.a(getContext(), "myoffer_inctask_cts_hint2", k.f20423g));
            TextView textView3 = this.f11997d;
            if (textView3 != null) {
                textView3.setText(string);
            }
        }
        final String z6 = wVar.z();
        if (!TextUtils.isEmpty(z6) && (roundImageView = this.f12000g) != null) {
            roundImageView.setNeedRadiu(true);
            this.f12000g.setRadiusInDip(20);
            b.a(getContext()).a(new e(1, z6), new b.a() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, z6) || CountDownSkipIncentiveTaskView.this.f12000g == null) {
                        return;
                    }
                    CountDownSkipIncentiveTaskView.this.f12000g.setImageBitmap(bitmap);
                }
            });
        }
        if (!TextUtils.isEmpty(wVar.x()) && (textView = this.f11998e) != null) {
            textView.setText(wVar.x());
            this.f11998e.setVisibility(0);
        }
        TextView textView4 = this.f11999f;
        if (textView4 != null) {
            textView4.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    view.setOnClickListener(null);
                    CountDownSkipIncentiveTaskView.this.b();
                    BaseIncentiveTaskView.a aVar2 = CountDownSkipIncentiveTaskView.this.f11993b;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    CountDownSkipIncentiveTaskView.c(CountDownSkipIncentiveTaskView.this);
                    if (CountDownSkipIncentiveTaskView.this.i != null) {
                        CountDownSkipIncentiveTaskView.this.i.b();
                    } else {
                        CountDownSkipIncentiveTaskView.this.c();
                    }
                    SimpleGuideToClickView simpleGuideToClickView = CountDownSkipIncentiveTaskView.this.f11996c;
                    if (simpleGuideToClickView != null) {
                        simpleGuideToClickView.setVisibility(8);
                    }
                }
            });
        }
        ImageView imageView = this.f12001h;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseIncentiveTaskView.a aVar2 = CountDownSkipIncentiveTaskView.this.f11993b;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }
            });
        }
        SimpleGuideToClickView simpleGuideToClickView = this.f11996c;
        if (simpleGuideToClickView != null) {
            simpleGuideToClickView.init(q.a(getContext(), "myoffer_simple_guide_to_click_s", "layout"), q.a(getContext(), 4.0f), q.a(getContext(), 6.0f), q.a(getContext(), 8.0f), q.a(getContext(), 12.0f));
            final ImageView imageView2 = (ImageView) this.f11996c.findViewById(q.a(getContext(), "myoffer_guide_to_click_finger", "id"));
            if (imageView2 != null) {
                String a9 = g.a().a(b.d.f12911k);
                if (TextUtils.isEmpty(a9)) {
                    return;
                }
                com.IceFishing.LiveIceFishing.k.j().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.5
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

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void onPause() {
        super.onPause();
        this.f12002j = false;
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void onResume() {
        super.onResume();
        if (this.f12002j) {
            c();
        } else {
            this.f12002j = true;
        }
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void release() {
        super.release();
        s sVar = this.i;
        if (sVar != null) {
            sVar.c();
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        TextView textView = this.f11997d;
        if (textView != null) {
            textView.setText(getContext().getString(q.a(getContext(), "myoffer_inctask_cts_completed", k.f20423g)));
        }
        TextView textView2 = this.f11999f;
        if (textView2 != null) {
            textView2.setText(getContext().getString(q.a(getContext(), "myoffer_inctask_cts_completed_cta", k.f20423g)));
            this.f11999f.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseIncentiveTaskView.a aVar = CountDownSkipIncentiveTaskView.this.f11993b;
                    if (aVar != null) {
                        aVar.a(-1L);
                        CountDownSkipIncentiveTaskView.this.f11993b.a();
                    }
                }
            });
        }
        ImageView imageView = this.f12001h;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseIncentiveTaskView.a aVar = CountDownSkipIncentiveTaskView.this.f11993b;
                    if (aVar != null) {
                        aVar.a(-1L);
                        CountDownSkipIncentiveTaskView.this.f11993b.a();
                    }
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_inctask_count_down_skip", "layout"), this);
        this.f11997d = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_title", "id"));
        this.f11998e = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_desc", "id"));
        this.f11999f = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_cta", "id"));
        this.f12000g = (RoundImageView) findViewById(q.a(getContext(), "myoffer_inctask_icon", "id"));
        this.f12001h = (ImageView) findViewById(q.a(getContext(), "myoffer_inctask_close_view", "id"));
        this.f11996c = (SimpleGuideToClickView) findViewById(q.a(getContext(), "myoffer_g2c_item_g2c_fingerview", "id"));
    }

    public CountDownSkipIncentiveTaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12002j = false;
    }

    public CountDownSkipIncentiveTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12002j = false;
    }
}
