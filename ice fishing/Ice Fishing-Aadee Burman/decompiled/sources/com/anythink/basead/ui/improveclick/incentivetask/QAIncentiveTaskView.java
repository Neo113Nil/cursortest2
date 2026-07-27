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
    long f11226c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f11227d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f11228e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f11229f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f11230g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f11231h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f11232j;

    public QAIncentiveTaskView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void initSetting(w wVar, y yVar, long j6, BaseIncentiveTaskView.a aVar) {
        super.initSetting(wVar, yVar, j6, aVar);
        long bt = yVar.bt();
        long o6 = yVar.o();
        long min = (j6 > 0 ? Math.min(o6, j6) : o6) - yVar.bs();
        if (bt > min) {
            bt = min;
        }
        if (bt == 0) {
            BaseIncentiveTaskView.a aVar2 = this.f11207b;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        this.f11226c = (j6 < o6 ? o6 - j6 : 0L) + bt;
        double d2 = bt / 1000.0d;
        String format = String.format(getContext().getString(q.a(getContext(), "myoffer_inctask_qa_title", k.f19636g)), Integer.valueOf((int) Math.ceil(d2)));
        String format2 = String.format(getContext().getString(q.a(getContext(), "myoffer_inctask_qa_subtitle", k.f19636g)), Integer.valueOf((int) Math.ceil(d2)));
        TextView textView = this.f11227d;
        if (textView != null) {
            textView.setText(format);
        }
        TextView textView2 = this.f11228e;
        if (textView2 != null) {
            textView2.setText(format2);
        }
        if (this.f11230g != null) {
            String x9 = !TextUtils.isEmpty(wVar.x()) ? wVar.x() : !TextUtils.isEmpty(wVar.y()) ? wVar.y() : "";
            if (!TextUtils.isEmpty(x9)) {
                this.f11230g.setText(x9);
            }
            this.f11230g.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QAIncentiveTaskView.this.f11207b.a(1);
                    if (QAIncentiveTaskView.this.f11232j != null) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
                        alphaAnimation.setDuration(1000L);
                        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.2.1
                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                QAIncentiveTaskView qAIncentiveTaskView = QAIncentiveTaskView.this;
                                qAIncentiveTaskView.f11207b.a(qAIncentiveTaskView.f11226c);
                                QAIncentiveTaskView.this.f11207b.a();
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationStart(Animation animation) {
                            }
                        });
                        if (QAIncentiveTaskView.this.f11229f != null) {
                            QAIncentiveTaskView.this.f11229f.setVisibility(8);
                        }
                        if (QAIncentiveTaskView.this.f11230g != null) {
                            QAIncentiveTaskView.this.f11230g.setVisibility(8);
                        }
                        if (QAIncentiveTaskView.this.f11231h != null) {
                            QAIncentiveTaskView.this.f11231h.setVisibility(8);
                        }
                        QAIncentiveTaskView.this.f11232j.setVisibility(0);
                        QAIncentiveTaskView.this.f11232j.startAnimation(alphaAnimation);
                        QAIncentiveTaskView.this.b();
                    }
                }
            });
        }
        if (this.f11231h != null) {
            if (!TextUtils.isEmpty(yVar.ax())) {
                this.f11231h.setText(yVar.ax());
            }
            this.f11231h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Toast.makeText(QAIncentiveTaskView.this.getContext().getApplicationContext(), q.a(QAIncentiveTaskView.this.getContext(), "myoffer_inctask_qa_toast_wrong", k.f19636g), 1).show();
                    BaseIncentiveTaskView.a aVar3 = QAIncentiveTaskView.this.f11207b;
                    if (aVar3 != null) {
                        aVar3.a(2);
                        QAIncentiveTaskView.this.f11207b.a();
                    }
                }
            });
        }
        View view = this.i;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseIncentiveTaskView.a aVar3 = QAIncentiveTaskView.this.f11207b;
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
        this.f11227d = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_title", "id"));
        this.f11228e = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_subtitle", "id"));
        this.f11229f = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_answer_hint", "id"));
        this.f11230g = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_answer_right", "id"));
        this.f11231h = (TextView) findViewById(q.a(getContext(), "myoffer_inctask_answer_wrong", "id"));
        this.i = findViewById(q.a(getContext(), "myoffer_inctask_close_view", "id"));
        ImageView imageView = (ImageView) findViewById(q.a(getContext(), "myoffer_inctask_right_hint", "id"));
        this.f11232j = imageView;
        if (imageView != null) {
            String a9 = q.b() ? g.a().a(b.d.f12129o) : g.a().a(b.d.f12128n);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            D.y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (QAIncentiveTaskView.this.f11232j != null) {
                        QAIncentiveTaskView.this.f11232j.setImageBitmap(bitmap);
                    }
                }
            });
        }
    }

    public QAIncentiveTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
