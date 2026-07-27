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
    SimpleGuideToClickView f11367c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f11368d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f11369e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f11370f;

    /* renamed from: g, reason: collision with root package name */
    private RoundImageView f11371g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f11372h;
    private s i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11373j;

    public CountDownSkipIncentiveTaskView(Context context) {
        super(context);
        this.f11373j = false;
    }

    public static /* synthetic */ boolean c(CountDownSkipIncentiveTaskView countDownSkipIncentiveTaskView) {
        countDownSkipIncentiveTaskView.f11373j = true;
        return true;
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void initSetting(w wVar, y yVar, long j9, BaseIncentiveTaskView.a aVar) {
        TextView textView;
        RoundImageView roundImageView;
        super.initSetting(wVar, yVar, j9, aVar);
        long j10 = j9;
        if (j10 <= 0 || j10 >= yVar.o()) {
            j10 = yVar.o();
        }
        long bs = j10 - yVar.bs();
        long bt = yVar.bt();
        if (bt < bs) {
            String format = String.format(getContext().getString(q.a(getContext(), "myoffer_inctask_cts_hint", k.f19794g)), Integer.valueOf((int) Math.ceil(bt / 1000.0d)));
            TextView textView2 = this.f11368d;
            if (textView2 != null) {
                textView2.setText(format);
            }
            this.i = new s(bt) { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.1
                @Override // com.anythink.core.common.v.s
                public final void a(long j11) {
                    if (CountDownSkipIncentiveTaskView.this.f11370f != null) {
                        CountDownSkipIncentiveTaskView.this.f11370f.setText(String.format(CountDownSkipIncentiveTaskView.this.getContext().getString(q.a(CountDownSkipIncentiveTaskView.this.getContext(), "myoffer_inctask_cts_time", k.f19794g)), Integer.valueOf((int) Math.ceil(j11 / 1000.0d))));
                    }
                }

                @Override // com.anythink.core.common.v.s
                public final void a() {
                    if (CountDownSkipIncentiveTaskView.this.f11373j) {
                        CountDownSkipIncentiveTaskView.this.c();
                    } else {
                        CountDownSkipIncentiveTaskView.c(CountDownSkipIncentiveTaskView.this);
                    }
                }
            };
        } else {
            String string = getContext().getString(q.a(getContext(), "myoffer_inctask_cts_hint2", k.f19794g));
            TextView textView3 = this.f11368d;
            if (textView3 != null) {
                textView3.setText(string);
            }
        }
        final String z8 = wVar.z();
        if (!TextUtils.isEmpty(z8) && (roundImageView = this.f11371g) != null) {
            roundImageView.setNeedRadiu(true);
            this.f11371g.setRadiusInDip(20);
            b.a(getContext()).a(new e(1, z8), new b.a() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, z8) || CountDownSkipIncentiveTaskView.this.f11371g == null) {
                        return;
                    }
                    CountDownSkipIncentiveTaskView.this.f11371g.setImageBitmap(bitmap);
                }
            });
        }
        if (!TextUtils.isEmpty(wVar.x()) && (textView = this.f11369e) != null) {
            textView.setText(wVar.x());
            this.f11369e.setVisibility(0);
        }
        TextView textView4 = this.f11370f;
        if (textView4 != null) {
            textView4.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    view.setOnClickListener(null);
                    CountDownSkipIncentiveTaskView.this.b();
                    BaseIncentiveTaskView.a aVar2 = CountDownSkipIncentiveTaskView.this.f11364b;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    CountDownSkipIncentiveTaskView.c(CountDownSkipIncentiveTaskView.this);
                    if (CountDownSkipIncentiveTaskView.this.i != null) {
                        CountDownSkipIncentiveTaskView.this.i.b();
                    } else {
                        CountDownSkipIncentiveTaskView.this.c();
                    }
                    SimpleGuideToClickView simpleGuideToClickView = CountDownSkipIncentiveTaskView.this.f11367c;
                    if (simpleGuideToClickView != null) {
                        simpleGuideToClickView.setVisibility(8);
                    }
                }
            });
        }
        ImageView imageView = this.f11372h;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseIncentiveTaskView.a aVar2 = CountDownSkipIncentiveTaskView.this.f11364b;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }
            });
        }
        SimpleGuideToClickView simpleGuideToClickView = this.f11367c;
        if (simpleGuideToClickView != null) {
            simpleGuideToClickView.init(q.a(getContext(), "myoffer_simple_guide_to_click_s", "layout"), q.a(getContext(), 4.0f), q.a(getContext(), 6.0f), q.a(getContext(), 8.0f), q.a(getContext(), 12.0f));
            final ImageView imageView2 = (ImageView) this.f11367c.findViewById(q.a(getContext(), "myoffer_guide_to_click_finger", "id"));
            if (imageView2 != null) {
                String a9 = g.a().a(b.d.f12282k);
                if (TextUtils.isEmpty(a9)) {
                    return;
                }
                D.y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.5
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
        this.f11373j = false;
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void onResume() {
        super.onResume();
        if (this.f11373j) {
            c();
        } else {
            this.f11373j = true;
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
        TextView textView = this.f11368d;
        if (textView != null) {
            textView.setText(getContext().getString(q.a(getContext(), "myoffer_inctask_cts_completed", k.f19794g)));
        }
        TextView textView2 = this.f11370f;
        if (textView2 != null) {
            textView2.setText(getContext().getString(q.a(getContext(), "myoffer_inctask_cts_completed_cta", k.f19794g)));
            this.f11370f.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseIncentiveTaskView.a aVar = CountDownSkipIncentiveTaskView.this.f11364b;
                    if (aVar != null) {
                        aVar.a(-1L);
                        CountDownSkipIncentiveTaskView.this.f11364b.a();
                    }
                }
            });
        }
        ImageView imageView = this.f11372h;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseIncentiveTaskView.a aVar = CountDownSkipIncentiveTaskView.this.f11364b;
                    if (aVar != null) {
                        aVar.a(-1L);
                        CountDownSkipIncentiveTaskView.this.f11364b.a();
                    }
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_inctask_count_down_skip", "layout"), this);
        this.f11368d = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_title", "id"));
        this.f11369e = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_desc", "id"));
        this.f11370f = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_cta", "id"));
        this.f11371g = (RoundImageView) findViewById(q.a(getContext(), "myoffer_inctask_icon", "id"));
        this.f11372h = (ImageView) findViewById(q.a(getContext(), "myoffer_inctask_close_view", "id"));
        this.f11367c = (SimpleGuideToClickView) findViewById(q.a(getContext(), "myoffer_g2c_item_g2c_fingerview", "id"));
    }

    public CountDownSkipIncentiveTaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11373j = false;
    }

    public CountDownSkipIncentiveTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11373j = false;
    }
}
