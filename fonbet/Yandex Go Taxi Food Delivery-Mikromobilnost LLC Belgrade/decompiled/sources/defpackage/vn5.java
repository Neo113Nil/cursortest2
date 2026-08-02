package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.benefits_center.benefits.data.experiment.BenefitsCenterTitleExperiment;
import com.yandex.go.benefits_center.benefits.sdk.scaffold.BenefitsCenterPreviewScaffoldController$applyInsets$$inlined$doOnAttach$1;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.tje;
import defpackage.vn5;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class vn5 extends pjm0 {
    public final tse a;
    public final wgr b;
    public final co5 c;
    public ho4 w;

    public vn5(tse tseVar, wgr wgrVar, co5 co5Var) {
        this.a = tseVar;
        this.b = wgrVar;
        this.c = co5Var;
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        return (GoFrameLayout) b().b;
    }

    public final ho4 b() {
        ho4 ho4Var = this.w;
        if (ho4Var != null) {
            return ho4Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        GoLinearLayout goLinearLayout;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(rrh0.benefits_center_scaffold_preview, viewGroup, false);
        int i = ghh0.contentContainer;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
        String str = null;
        if (goFrameLayout != null) {
            GoLinearLayout goLinearLayout2 = (GoLinearLayout) inflate;
            int i2 = ghh0.top_view;
            View O = cma1.O(i2, inflate);
            if (O != null) {
                this.w = new ho4(goLinearLayout2, goFrameLayout, do5.o(O), 2);
                ((do5) b().d).c.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.go.benefits_center.benefits.sdk.scaffold.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vn5 vn5Var = vn5.this;
                        tje.N(vn5Var.a, null, null, new BenefitsCenterPreviewScaffoldController$onCreateView$1$1(vn5Var, null), 3);
                    }
                });
                BenefitsCenterTitleExperiment benefitsCenterTitleExperiment = (BenefitsCenterTitleExperiment) this.c.c();
                String str2 = benefitsCenterTitleExperiment.d;
                if (str2 != null && (str = (String) benefitsCenterTitleExperiment.b.get(str2)) == null) {
                    str = str2;
                }
                if (str != null) {
                    ((do5) b().d).d.setText(str);
                }
                tje.k(48, (GoLinearLayout) b().c);
                ho4 ho4Var = this.w;
                if (ho4Var != null && (goLinearLayout = (GoLinearLayout) ho4Var.c) != null) {
                    WeakHashMap weakHashMap = b.a;
                    if (goLinearLayout.isAttachedToWindow()) {
                        goLinearLayout.requestApplyInsets();
                    } else {
                        goLinearLayout.addOnAttachStateChangeListener(new BenefitsCenterPreviewScaffoldController$applyInsets$$inlined$doOnAttach$1(goLinearLayout));
                    }
                }
                return (GoLinearLayout) b().c;
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.w = null;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        GoLinearLayout goLinearLayout;
        ho4 ho4Var = this.w;
        if (ho4Var == null || (goLinearLayout = (GoLinearLayout) ho4Var.c) == null) {
            return;
        }
        WeakHashMap weakHashMap = b.a;
        if (goLinearLayout.isAttachedToWindow()) {
            goLinearLayout.requestApplyInsets();
        } else {
            goLinearLayout.addOnAttachStateChangeListener(new BenefitsCenterPreviewScaffoldController$applyInsets$$inlined$doOnAttach$1(goLinearLayout));
        }
    }
}
