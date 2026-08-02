package com.anythink.basead.ui.improveclick.incentivetask;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class QAIncentiveTaskView extends BaseIncentiveTaskView {

    /* renamed from: c, reason: collision with root package name */
    long f12012c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f12013d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f12014e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f12015f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f12016g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f12017h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f12018j;

    public QAIncentiveTaskView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void initSetting(w wVar, y yVar, long j6, BaseIncentiveTaskView.a aVar) {
        super.initSetting(wVar, yVar, j6, aVar);
        long bt = yVar.bt();
        long o4 = yVar.o();
        long min = (j6 > 0 ? Math.min(o4, j6) : o4) - yVar.bs();
        if (bt > min) {
            bt = min;
        }
        if (bt == 0) {
            BaseIncentiveTaskView.a aVar2 = this.f11993b;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        this.f12012c = (j6 < o4 ? o4 - j6 : 0L) + bt;
        double d9 = bt / 1000.0d;
        String format = String.format(getContext().getString(q.a(getContext(), "myoffer_inctask_qa_title", k.f20423g)), Integer.valueOf((int) Math.ceil(d9)));
        String format2 = String.format(getContext().getString(q.a(getContext(), "myoffer_inctask_qa_subtitle", k.f20423g)), Integer.valueOf((int) Math.ceil(d9)));
        TextView textView = this.f12013d;
        if (textView != null) {
            textView.setText(format);
        }
        TextView textView2 = this.f12014e;
        if (textView2 != null) {
            textView2.setText(format2);
        }
        if (this.f12016g != null) {
            String x9 = !TextUtils.isEmpty(wVar.x()) ? wVar.x() : !TextUtils.isEmpty(wVar.y()) ? wVar.y() : "";
            if (!TextUtils.isEmpty(x9)) {
                this.f12016g.setText(x9);
            }
            this.f12016g.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QAIncentiveTaskView.this.f11993b.a(1);
                    if (QAIncentiveTaskView.this.f12018j != null) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
                        alphaAnimation.setDuration(1000L);
                        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.2.1
                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                QAIncentiveTaskView qAIncentiveTaskView = QAIncentiveTaskView.this;
                                qAIncentiveTaskView.f11993b.a(qAIncentiveTaskView.f12012c);
                                QAIncentiveTaskView.this.f11993b.a();
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationStart(Animation animation) {
                            }
                        });
                        if (QAIncentiveTaskView.this.f12015f != null) {
                            QAIncentiveTaskView.this.f12015f.setVisibility(8);
                        }
                        if (QAIncentiveTaskView.this.f12016g != null) {
                            QAIncentiveTaskView.this.f12016g.setVisibility(8);
                        }
                        if (QAIncentiveTaskView.this.f12017h != null) {
                            QAIncentiveTaskView.this.f12017h.setVisibility(8);
                        }
                        QAIncentiveTaskView.this.f12018j.setVisibility(0);
                        QAIncentiveTaskView.this.f12018j.startAnimation(alphaAnimation);
                        QAIncentiveTaskView.this.b();
                    }
                }
            });
        }
        if (this.f12017h != null) {
            if (!TextUtils.isEmpty(yVar.ax())) {
                this.f12017h.setText(yVar.ax());
            }
            this.f12017h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Toast.makeText(QAIncentiveTaskView.this.getContext().getApplicationContext(), q.a(QAIncentiveTaskView.this.getContext(), "myoffer_inctask_qa_toast_wrong", k.f20423g), 1).show();
                    BaseIncentiveTaskView.a aVar3 = QAIncentiveTaskView.this.f11993b;
                    if (aVar3 != null) {
                        aVar3.a(2);
                        QAIncentiveTaskView.this.f11993b.a();
                    }
                }
            });
        }
        View view = this.i;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseIncentiveTaskView.a aVar3 = QAIncentiveTaskView.this.f11993b;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                }
            });
        }
    }

    public QAIncentiveTaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_inctask_qa", "layout"), this);
        this.f12013d = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_title", "id"));
        this.f12014e = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_subtitle", "id"));
        this.f12015f = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_answer_hint", "id"));
        this.f12016g = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_answer_right", "id"));
        this.f12017h = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_answer_wrong", "id"));
        this.i = findViewById(q.a(getContext(), "myoffer_inctask_close_view", "id"));
        ImageView imageView = (ImageView) findViewById(q.a(getContext(), "myoffer_inctask_right_hint", "id"));
        this.f12018j = imageView;
        if (imageView != null) {
            String a9 = q.b() ? g.a().a(b.d.f12915o) : g.a().a(b.d.f12914n);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            com.IceFishing.LiveIceFishing.k.j().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (QAIncentiveTaskView.this.f12018j != null) {
                        QAIncentiveTaskView.this.f12018j.setImageBitmap(bitmap);
                    }
                }
            });
        }
    }

    public QAIncentiveTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
