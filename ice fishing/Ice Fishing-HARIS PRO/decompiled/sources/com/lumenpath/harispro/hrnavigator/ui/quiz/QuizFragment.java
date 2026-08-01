package com.lumenpath.harispro.hrnavigator.ui.quiz;

import D1.i;
import V0.ViewOnClickListenerC0050a;
import Z.AbstractComponentCallbacksC0070s;
import a1.n;
import a1.o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentQuizBinding;
import com.lumenpath.harispro.hrnavigator.ui.quiz.QuizFragment;
import java.util.NoSuchElementException;
import u1.h;

/* loaded from: classes.dex */
public final class QuizFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentQuizBinding f2812W;

    /* renamed from: X, reason: collision with root package name */
    public n f2813X;

    /* renamed from: Y, reason: collision with root package name */
    public int f2814Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2815Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2816a0 = -1;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("quizId");
        for (n nVar : Z0.i.f1648a) {
            if (nVar.f1720a == i) {
                this.f2813X = nVar;
                FragmentQuizBinding fragmentQuizBinding = this.f2812W;
                i.b(fragmentQuizBinding);
                ProgressBar progressBar = fragmentQuizBinding.progressBar;
                n nVar2 = this.f2813X;
                if (nVar2 == null) {
                    i.i("quiz");
                    throw null;
                }
                progressBar.setMax(nVar2.f1723d.size());
                M();
                FragmentQuizBinding fragmentQuizBinding2 = this.f2812W;
                i.b(fragmentQuizBinding2);
                fragmentQuizBinding2.nextButton.setOnClickListener(new ViewOnClickListenerC0050a(8, this));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void M() {
        n nVar = this.f2813X;
        if (nVar == null) {
            i.i("quiz");
            throw null;
        }
        o oVar = (o) nVar.f1723d.get(this.f2814Y);
        FragmentQuizBinding fragmentQuizBinding = this.f2812W;
        i.b(fragmentQuizBinding);
        fragmentQuizBinding.questionText.setText(oVar.f1724a);
        FragmentQuizBinding fragmentQuizBinding2 = this.f2812W;
        i.b(fragmentQuizBinding2);
        fragmentQuizBinding2.progressBar.setProgress(this.f2814Y + 1);
        FragmentQuizBinding fragmentQuizBinding3 = this.f2812W;
        i.b(fragmentQuizBinding3);
        fragmentQuizBinding3.optionsContainer.removeAllViews();
        this.f2816a0 = -1;
        FragmentQuizBinding fragmentQuizBinding4 = this.f2812W;
        i.b(fragmentQuizBinding4);
        final int i = 0;
        fragmentQuizBinding4.nextButton.setEnabled(false);
        for (Object obj : oVar.f1725b) {
            int i2 = i + 1;
            if (i < 0) {
                h.H();
                throw null;
            }
            MaterialButton materialButton = new MaterialButton(H(), null);
            materialButton.setText((String) obj);
            materialButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: m1.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuizFragment quizFragment = QuizFragment.this;
                    quizFragment.f2816a0 = i;
                    FragmentQuizBinding fragmentQuizBinding5 = quizFragment.f2812W;
                    i.b(fragmentQuizBinding5);
                    fragmentQuizBinding5.nextButton.setEnabled(true);
                }
            });
            FragmentQuizBinding fragmentQuizBinding5 = this.f2812W;
            i.b(fragmentQuizBinding5);
            fragmentQuizBinding5.optionsContainer.addView(materialButton);
            i = i2;
        }
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentQuizBinding inflate = FragmentQuizBinding.inflate(layoutInflater, viewGroup, false);
        this.f2812W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2812W = null;
    }
}
