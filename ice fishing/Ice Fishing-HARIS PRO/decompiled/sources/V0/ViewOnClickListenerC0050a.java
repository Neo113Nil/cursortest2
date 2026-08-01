package V0;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.lumenpath.harispro.hrnavigator.R;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentChecklistDetailBinding;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentHomeBinding;
import com.lumenpath.harispro.hrnavigator.ui.builder.BuilderFragment;
import com.lumenpath.harispro.hrnavigator.ui.checklist.ChecklistDetailFragment;
import com.lumenpath.harispro.hrnavigator.ui.home.HomeFragment;
import com.lumenpath.harispro.hrnavigator.ui.knowledge.ArticleFragment;
import com.lumenpath.harispro.hrnavigator.ui.quiz.QuizFragment;
import com.lumenpath.harispro.hrnavigator.ui.roadmap.RoadmapDetailFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: V0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0050a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1262b;

    public /* synthetic */ ViewOnClickListenerC0050a(int i, Object obj) {
        this.f1261a = i;
        this.f1262b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1261a) {
            case 0:
                e eVar = (e) this.f1262b;
                EditText editText = eVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                eVar.q();
                return;
            case 1:
                ((k) this.f1262b).u();
                return;
            case 2:
                x xVar = (x) this.f1262b;
                EditText editText2 = xVar.f1362f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f1362f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f1362f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f1362f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f1362f.setSelection(selectionEnd);
                }
                xVar.q();
                return;
            case 3:
                BuilderFragment builderFragment = (BuilderFragment) this.f1262b;
                int i = builderFragment.f2781X;
                if (i < 5) {
                    builderFragment.f2781X = i + 1;
                    builderFragment.N();
                    return;
                }
                return;
            case 4:
                ((MaterialDatePicker) this.f1262b).R();
                throw null;
            case 5:
                Iterator it = ((ChecklistDetailFragment) this.f1262b).f2790X.iterator();
                while (it.hasNext()) {
                    ((F0.d) it.next()).setChecked(false);
                }
                return;
            case 6:
                HomeFragment homeFragment = (HomeFragment) this.f1262b;
                int i2 = homeFragment.f2803X + 1;
                List list = Z0.o.f1654a;
                homeFragment.f2803X = i2 % list.size();
                FragmentHomeBinding fragmentHomeBinding = homeFragment.f2802W;
                D1.i.b(fragmentHomeBinding);
                fragmentHomeBinding.tipText.setText((CharSequence) list.get(homeFragment.f2803X));
                return;
            case 7:
                h0.f.l((ArticleFragment) this.f1262b).n();
                return;
            case 8:
                QuizFragment quizFragment = (QuizFragment) this.f1262b;
                int i3 = quizFragment.f2816a0;
                a1.n nVar = quizFragment.f2813X;
                if (nVar == null) {
                    D1.i.i("quiz");
                    throw null;
                }
                ((a1.o) nVar.f1723d.get(quizFragment.f2814Y)).getClass();
                if (i3 == 2) {
                    quizFragment.f2815Z++;
                }
                int i4 = quizFragment.f2814Y + 1;
                quizFragment.f2814Y = i4;
                a1.n nVar2 = quizFragment.f2813X;
                if (nVar2 == null) {
                    D1.i.i("quiz");
                    throw null;
                }
                if (i4 < nVar2.f1723d.size()) {
                    quizFragment.M();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("quizScore", quizFragment.f2815Z);
                a1.n nVar3 = quizFragment.f2813X;
                if (nVar3 == null) {
                    D1.i.i("quiz");
                    throw null;
                }
                bundle.putInt("quizTotal", nVar3.f1723d.size());
                a1.n nVar4 = quizFragment.f2813X;
                if (nVar4 == null) {
                    D1.i.i("quiz");
                    throw null;
                }
                bundle.putString("quizTitle", nVar4.f1721b);
                h0.f.l(quizFragment).l(R.id.action_quiz_to_result, bundle);
                return;
            default:
                RoadmapDetailFragment roadmapDetailFragment = (RoadmapDetailFragment) this.f1262b;
                FragmentChecklistDetailBinding fragmentChecklistDetailBinding = roadmapDetailFragment.f2819W;
                D1.i.b(fragmentChecklistDetailBinding);
                int childCount = fragmentChecklistDetailBinding.checkboxContainer.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    FragmentChecklistDetailBinding fragmentChecklistDetailBinding2 = roadmapDetailFragment.f2819W;
                    D1.i.b(fragmentChecklistDetailBinding2);
                    View childAt = fragmentChecklistDetailBinding2.checkboxContainer.getChildAt(i5);
                    if (childAt instanceof F0.d) {
                        ((F0.d) childAt).setChecked(false);
                    }
                }
                return;
        }
    }
}
