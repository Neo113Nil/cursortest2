package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class QuestionDialogG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    private TextView f10998d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f10999e;

    /* renamed from: f, reason: collision with root package name */
    private String f11000f;

    /* renamed from: g, reason: collision with root package name */
    private String f11001g;

    public QuestionDialogG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i6) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_question_dialog", "layout"), this);
        TextView textView = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_question_answer1", "id"));
        this.f10998d = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.QuestionDialogG2CV2View.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.a aVar = QuestionDialogG2CV2View.this.f10834c;
                if (aVar != null) {
                    aVar.a(11, 17);
                }
            }
        });
        TextView textView2 = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_question_answer2", "id"));
        this.f10999e = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.QuestionDialogG2CV2View.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.a aVar = QuestionDialogG2CV2View.this.f10834c;
                if (aVar != null) {
                    aVar.a(11, 17);
                }
            }
        });
        if (!TextUtils.isEmpty(this.f11000f)) {
            this.f10998d.setText(this.f11000f);
        }
        if (!TextUtils.isEmpty(this.f11001g)) {
            this.f10999e.setText(this.f11001g);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.QuestionDialogG2CV2View.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    public void setQuestionAnswer(String str, String str2) {
        this.f11000f = str;
        this.f11001g = str2;
    }
}
