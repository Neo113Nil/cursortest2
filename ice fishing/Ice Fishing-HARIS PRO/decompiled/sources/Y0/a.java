package Y0;

import C1.l;
import D1.i;
import Z0.g;
import Z0.h;
import Z0.p;
import a1.C0083a;
import a1.d;
import a1.e;
import a1.j;
import a1.k;
import a1.m;
import a1.n;
import a1.r;
import a1.s;
import android.os.Bundle;
import com.lumenpath.harispro.hrnavigator.MainActivity;
import com.lumenpath.harispro.hrnavigator.R;
import com.lumenpath.harispro.hrnavigator.databinding.ActivityMainBinding;
import com.lumenpath.harispro.hrnavigator.ui.calculators.CalculatorListFragment;
import com.lumenpath.harispro.hrnavigator.ui.checklist.ChecklistListFragment;
import com.lumenpath.harispro.hrnavigator.ui.dictionary.DictionaryFragment;
import com.lumenpath.harispro.hrnavigator.ui.knowledge.KnowledgeFragment;
import com.lumenpath.harispro.hrnavigator.ui.metrics.MetricsListFragment;
import com.lumenpath.harispro.hrnavigator.ui.mistakes.MistakeListFragment;
import com.lumenpath.harispro.hrnavigator.ui.quiz.QuizListFragment;
import com.lumenpath.harispro.hrnavigator.ui.roadmap.RoadmapListFragment;
import com.lumenpath.harispro.hrnavigator.ui.structures.StructureListFragment;
import com.lumenpath.harispro.hrnavigator.ui.templates.TemplatesListFragment;
import com.lumenpath.harispro.hrnavigator.ui.tools.ToolsFragment;
import h0.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1399b;

    public /* synthetic */ a(int i, Object obj) {
        this.f1398a = i;
        this.f1399b = obj;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        Object obj2 = this.f1399b;
        switch (this.f1398a) {
            case 0:
                G.c cVar = (G.c) obj;
                int i = MainActivity.f2774B;
                i.e(cVar, "insets");
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.f2778z = cVar;
                ActivityMainBinding activityMainBinding = mainActivity.f2776x;
                if (activityMainBinding != null) {
                    mainActivity.u(activityMainBinding.bottomNavigation.getVisibility() == 0);
                    return t1.i.f4388c;
                }
                i.i("binding");
                throw null;
            case 1:
                int intValue = ((Integer) obj).intValue();
                Bundle bundle = new Bundle();
                bundle.putInt("calculatorId", ((d) p.f1656b.get(intValue)).f1680a);
                f.l((CalculatorListFragment) obj2).l(R.id.action_calculator_list_to_detail, bundle);
                return t1.i.f4388c;
            case 2:
                int intValue2 = ((Integer) obj).intValue();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("checklistId", ((e) Z0.c.f1642a.get(intValue2)).f1683a);
                f.l((ChecklistListFragment) obj2).l(R.id.action_checklist_list_to_detail, bundle2);
                return t1.i.f4388c;
            case 3:
                int intValue3 = ((Integer) obj).intValue();
                Bundle bundle3 = new Bundle();
                DictionaryFragment dictionaryFragment = (DictionaryFragment) obj2;
                bundle3.putInt("termId", ((r) dictionaryFragment.f2799X.get(intValue3)).f1734a);
                f.l(dictionaryFragment).l(R.id.action_dictionary_to_term, bundle3);
                return t1.i.f4388c;
            case 4:
                KnowledgeFragment knowledgeFragment = (KnowledgeFragment) obj2;
                C0083a c0083a = (C0083a) knowledgeFragment.f2806X.get(((Integer) obj).intValue());
                Bundle bundle4 = new Bundle();
                bundle4.putInt("articleId", c0083a.f1668a);
                f.l(knowledgeFragment).l(R.id.action_knowledge_to_article, bundle4);
                return t1.i.f4388c;
            case 5:
                int intValue4 = ((Integer) obj).intValue();
                Bundle bundle5 = new Bundle();
                bundle5.putInt("metricId", ((j) g.f1646a.get(intValue4)).f1700a);
                f.l((MetricsListFragment) obj2).l(R.id.action_metrics_to_detail, bundle5);
                return t1.i.f4388c;
            case 6:
                int intValue5 = ((Integer) obj).intValue();
                Bundle bundle6 = new Bundle();
                bundle6.putInt("mistakeId", ((a1.l) h.f1647a.get(intValue5)).f1709a);
                f.l((MistakeListFragment) obj2).l(R.id.action_mistake_list_to_detail, bundle6);
                return t1.i.f4388c;
            case 7:
                int intValue6 = ((Integer) obj).intValue();
                Bundle bundle7 = new Bundle();
                bundle7.putInt("quizId", ((n) Z0.i.f1648a.get(intValue6)).f1720a);
                f.l((QuizListFragment) obj2).l(R.id.action_quiz_list_to_quiz, bundle7);
                return t1.i.f4388c;
            case 8:
                int intValue7 = ((Integer) obj).intValue();
                Bundle bundle8 = new Bundle();
                bundle8.putInt("roadmapId", ((a1.p) Z0.j.f1649a.get(intValue7)).f1726a);
                f.l((RoadmapListFragment) obj2).l(R.id.action_roadmap_list_to_detail, bundle8);
                return t1.i.f4388c;
            case 9:
                int intValue8 = ((Integer) obj).intValue();
                Bundle bundle9 = new Bundle();
                bundle9.putInt("structureId", ((m) Z0.l.f1651a.get(intValue8)).f1714a);
                f.l((StructureListFragment) obj2).l(R.id.action_structure_list_to_detail, bundle9);
                return t1.i.f4388c;
            case 10:
                int intValue9 = ((Integer) obj).intValue();
                Bundle bundle10 = new Bundle();
                bundle10.putInt("templateId", ((k) Z0.m.f1652a.get(intValue9)).f1705a);
                f.l((TemplatesListFragment) obj2).l(R.id.action_templates_to_detail, bundle10);
                return t1.i.f4388c;
            default:
                f.l((ToolsFragment) obj2).l(((s) p.f1655a.get(((Integer) obj).intValue())).f1742d, null);
                return t1.i.f4388c;
        }
    }
}
