package ru.yandex.taxi.preorder.summary.requirements.options.wrapper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import com.yandex.go.zone.model.Zone;
import defpackage.b4m;
import defpackage.d6z;
import defpackage.d7h0;
import defpackage.iqj0;
import defpackage.ivh0;
import defpackage.jmw0;
import defpackage.l8x;
import defpackage.ljj0;
import defpackage.mjj0;
import defpackage.mrg0;
import defpackage.njj0;
import defpackage.oqj0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tse;
import defpackage.wnb1;
import defpackage.xmf0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.summary.requirements.DoneButtonDisplayDelegate$attachButton$$inlined$safeCollectIn$1;
import ru.yandex.taxi.requirements.interactor.w;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.requirements.ui.RequirementOptionDetailsView;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/yandex/taxi/preorder/summary/requirements/options/wrapper/RequirementOptionsHeaderWrappedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lmjj0;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Lru/yandex/taxi/requirements/ui/RequirementOptionDetailsView;", "optionDetailsView", "Lnjj0;", "innerPresenter", "Liqj0;", "backPressedDelegate", "Lru/yandex/taxi/requirements/interactor/x;", "requirementOptionSelectedInteractor", "Ljmw0;", "requirement", "<init>", "(Landroid/content/Context;Ltse;Lru/yandex/taxi/requirements/ui/RequirementOptionDetailsView;Lnjj0;Liqj0;Lru/yandex/taxi/requirements/interactor/x;Ljmw0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "title", "showToolbarTitle", "(Ljava/lang/String;)V", "Lnjj0;", "Lru/yandex/taxi/design/ButtonComponent;", "doneButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lb4m;", "doneButtonDisplay", "Lb4m;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Ll8x;", "refreshButtonStateJob", "Ll8x;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementOptionsHeaderWrappedView extends ConstraintLayout implements mjj0 {
    public static final int $stable = 8;
    private final ButtonComponent doneButton;
    private final b4m doneButtonDisplay;
    private final njj0 innerPresenter;
    private l8x refreshButtonStateJob;
    private final ToolbarComponent toolbar;

    public RequirementOptionsHeaderWrappedView(Context context, tse tseVar, RequirementOptionDetailsView requirementOptionDetailsView, njj0 njj0Var, iqj0 iqj0Var, x xVar, jmw0 jmw0Var) {
        super(context);
        this.innerPresenter = njj0Var;
        c.q(this, ivh0.requirement_options_header_wrapped_view, true);
        int i = d7h0.requirement_done_button;
        WeakHashMap weakHashMap = b.a;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, i));
        this.doneButton = buttonComponent;
        this.toolbar = (ToolbarComponent) ((View) rp31.d(this, d7h0.requirement_header_toolbar));
        this.doneButtonDisplay = new b4m(tseVar, xVar, jmw0Var);
        wnb1.d(getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius), this);
        ((ViewGroup) ((View) rp31.d(this, d7h0.requirement_content))).addView(requirementOptionDetailsView);
        buttonComponent.setDebounceClickListener(new xmf0(17, iqj0Var, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        njj0 njj0Var = this.innerPresenter;
        njj0Var.Bg(this);
        ljj0 ljj0Var = njj0Var.w;
        jmw0 jmw0Var = njj0Var.x;
        ljj0Var.getClass();
        String name = jmw0Var.getName();
        Zone c = ljj0Var.a.c();
        oqj0 oqj0Var = c != null ? (oqj0) c.d(oqj0.e) : oqj0.e;
        oqj0.b a = oqj0Var.a(name);
        String str = "";
        if (a != null) {
            String str2 = a.e;
            if (a.a && str2.length() > 0) {
                str = d6z.Y(oqj0Var, str2);
            }
        }
        if (str.length() <= 0) {
            str = jmw0Var.getLabel();
        }
        showToolbarTitle(str);
        b4m b4mVar = this.doneButtonDisplay;
        ButtonComponent buttonComponent = this.doneButton;
        x xVar = b4mVar.b;
        this.refreshButtonStateJob = tje.N(b4mVar.a, null, null, new DoneButtonDisplayDelegate$attachButton$$inlined$safeCollectIn$1(e.t(new w(xVar.b(), xVar, b4mVar.c)), null, buttonComponent), 3);
        this.toolbar.requestAccessibilityFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.refreshButtonStateJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.refreshButtonStateJob = null;
        this.innerPresenter.Cg();
    }

    @Override // defpackage.mjj0
    public void showToolbarTitle(String title) {
        this.toolbar.setTitle(title);
    }
}
