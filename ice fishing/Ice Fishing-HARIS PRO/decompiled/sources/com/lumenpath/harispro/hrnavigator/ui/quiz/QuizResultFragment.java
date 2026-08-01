package com.lumenpath.harispro.hrnavigator.ui.quiz;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.lumenpath.harispro.hrnavigator.R;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentQuizResultBinding;
import com.lumenpath.harispro.hrnavigator.ui.quiz.QuizResultFragment;
import f0.w;
import f0.z;
import h0.f;

/* loaded from: classes.dex */
public final class QuizResultFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentQuizResultBinding f2818W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("quizScore");
        int i2 = G().getInt("quizTotal");
        String string = G().getString("quizTitle");
        if (string == null) {
            string = "Test";
        }
        int i3 = i2 > 0 ? (i * 100) / i2 : 0;
        FragmentQuizResultBinding fragmentQuizResultBinding = this.f2818W;
        i.b(fragmentQuizResultBinding);
        fragmentQuizResultBinding.titleText.setText(string);
        FragmentQuizResultBinding fragmentQuizResultBinding2 = this.f2818W;
        i.b(fragmentQuizResultBinding2);
        fragmentQuizResultBinding2.scoreText.setText(i + " / " + i2);
        FragmentQuizResultBinding fragmentQuizResultBinding3 = this.f2818W;
        i.b(fragmentQuizResultBinding3);
        fragmentQuizResultBinding3.descriptionText.setText(i3 >= 80 ? "Excellent! Your organization shows strong maturity in this area." : i3 >= 50 ? "Good progress, but there are areas that need attention." : "Significant improvements are needed in this area.");
        FragmentQuizResultBinding fragmentQuizResultBinding4 = this.f2818W;
        i.b(fragmentQuizResultBinding4);
        final int i4 = 0;
        fragmentQuizResultBinding4.retryButton.setOnClickListener(new View.OnClickListener(this) { // from class: m1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QuizResultFragment f4106b;

            {
                this.f4106b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        f.l(this.f4106b).n();
                        break;
                    default:
                        z l2 = f.l(this.f4106b);
                        i.e(l2, "navController");
                        w f2 = l2.f();
                        if ((f2 == null || R.id.homeFragment != f2.f2994h) && !l2.o(R.id.homeFragment, false)) {
                            l2.l(R.id.homeFragment, null);
                            break;
                        }
                        break;
                }
            }
        });
        FragmentQuizResultBinding fragmentQuizResultBinding5 = this.f2818W;
        i.b(fragmentQuizResultBinding5);
        final int i5 = 1;
        fragmentQuizResultBinding5.homeButton.setOnClickListener(new View.OnClickListener(this) { // from class: m1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QuizResultFragment f4106b;

            {
                this.f4106b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        f.l(this.f4106b).n();
                        break;
                    default:
                        z l2 = f.l(this.f4106b);
                        i.e(l2, "navController");
                        w f2 = l2.f();
                        if ((f2 == null || R.id.homeFragment != f2.f2994h) && !l2.o(R.id.homeFragment, false)) {
                            l2.l(R.id.homeFragment, null);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentQuizResultBinding inflate = FragmentQuizResultBinding.inflate(layoutInflater, viewGroup, false);
        this.f2818W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2818W = null;
    }
}
