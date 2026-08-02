package ru.yandex.taxi.requirements.ui.selector.compound;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.aub;
import defpackage.ejj0;
import defpackage.fnx0;
import defpackage.gdj0;
import defpackage.gmw0;
import defpackage.hxx;
import defpackage.idj0;
import defpackage.ivd;
import defpackage.jst;
import defpackage.kdc;
import defpackage.kp50;
import defpackage.kvd;
import defpackage.m950;
import defpackage.mi31;
import defpackage.mqg0;
import defpackage.nac;
import defpackage.og20;
import defpackage.pav;
import defpackage.pdc;
import defpackage.pep0;
import defpackage.pud;
import defpackage.s8o;
import defpackage.tje;
import defpackage.ufu;
import defpackage.wud;
import defpackage.xby;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.requirements.ui.selector.compound.CompoundOptionSelectorView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.h;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00010B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u0018*\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0018*\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0015\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0018H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0014¢\u0006\u0004\b,\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u00101\u001a\u000600R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/yandex/taxi/requirements/ui/selector/compound/CompoundOptionSelectorView;", "Lru/yandex/taxi/design/AutoDividerComponentList;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lpdc;", "colorConverter", "Livd;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Lpdc;Livd;)V", "", "Lpud;", "oldItems", "newItems", "Landroidx/recyclerview/widget/i;", "calculateDiff", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/i;", "item", "Lru/yandex/taxi/design/ListItemComponent;", "createView", "(Lpud;)Lru/yandex/taxi/design/ListItemComponent;", "view", "Lzy11;", "bindItem", "(Lru/yandex/taxi/design/ListItemComponent;Lpud;)V", "removeView", "(Lru/yandex/taxi/design/ListItemComponent;)V", "Lidj0;", "badge", "showBadge", "(Lru/yandex/taxi/design/ListItemComponent;Lidj0;)V", "hideBadge", "Lgmw0;", "requirement", "updateRequirement", "(Lgmw0;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpav;", "Lpdc;", "Livd;", "Lkvd;", "mvpImpl", "Lkvd;", "Lru/yandex/taxi/utils/h;", "listDelegate", "Lru/yandex/taxi/utils/h;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompoundOptionSelectorView extends AutoDividerComponentList {
    private final pdc colorConverter;
    private final pav imageLoader;
    private final h listDelegate;
    private final kvd mvpImpl;
    private final ivd presenter;

    public CompoundOptionSelectorView(Context context, pav pavVar, pdc pdcVar, ivd ivdVar) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        this.colorConverter = pdcVar;
        this.presenter = ivdVar;
        setMiddleDividers(DividerType.ICON_MARGIN);
        this.mvpImpl = new kvd(this);
        this.listDelegate = new h(this, new CompoundOptionSelectorView$listDelegate$1(2, this, CompoundOptionSelectorView.class, "calculateDiff", "calculateDiff(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;", 0), new CompoundOptionSelectorView$listDelegate$2(1, this, CompoundOptionSelectorView.class, "createView", "createView(Lru/yandex/taxi/requirements/ui/selector/compound/CompoundOptionItem;)Lru/yandex/taxi/design/ListItemComponent;", 0), new CompoundOptionSelectorView$listDelegate$3(2, this, CompoundOptionSelectorView.class, "bindItem", "bindItem(Lru/yandex/taxi/design/ListItemComponent;Lru/yandex/taxi/requirements/ui/selector/compound/CompoundOptionItem;)V", 0), new CompoundOptionSelectorView$listDelegate$4(1, this, CompoundOptionSelectorView.class, "removeView", "removeView(Lru/yandex/taxi/design/ListItemComponent;)V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindItem(ListItemComponent view, pud item) {
        this.imageLoader.c(view.getLeadImageView());
        if (item.b != null) {
            ((nac) this.imageLoader.a(view.getLeadImageView())).c(item.b);
        } else {
            view.clearLeadView();
        }
        view.setTitle(item.c);
        view.setSubtitle(item.d);
        CompoundOptionTrailView compoundOptionTrailView = (CompoundOptionTrailView) view.getTrailViewAs(CompoundOptionTrailView.class);
        if (compoundOptionTrailView != null) {
            compoundOptionTrailView.updateState(item.e);
        }
        idj0 idj0Var = item.g;
        if (idj0Var == null || !this.presenter.Kg(item)) {
            return;
        }
        showBadge(view, idj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i calculateDiff(List<pud> oldItems, List<pud> newItems) {
        return kp50.f(new og20(oldItems, newItems, new aub(5)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean calculateDiff$lambda$0(pud pudVar, pud pudVar2) {
        return Boolean.valueOf(pudVar.a == pudVar2.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListItemComponent createView(final pud item) {
        final ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        final int i = 0;
        listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: jvd
            public final /* synthetic */ CompoundOptionSelectorView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ListItemComponent listItemComponent2 = listItemComponent;
                pud pudVar = item;
                CompoundOptionSelectorView compoundOptionSelectorView = this.b;
                switch (i2) {
                    case 0:
                        CompoundOptionSelectorView.createView$lambda$0$0(compoundOptionSelectorView, pudVar, listItemComponent2);
                        break;
                    default:
                        CompoundOptionSelectorView.createView$lambda$0$1(compoundOptionSelectorView, pudVar, listItemComponent2);
                        break;
                }
            }
        });
        CompoundOptionTrailView compoundOptionTrailView = new CompoundOptionTrailView(getContext());
        final int i2 = 1;
        compoundOptionTrailView.setRemoveListener(new Runnable(this) { // from class: jvd
            public final /* synthetic */ CompoundOptionSelectorView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ListItemComponent listItemComponent2 = listItemComponent;
                pud pudVar = item;
                CompoundOptionSelectorView compoundOptionSelectorView = this.b;
                switch (i22) {
                    case 0:
                        CompoundOptionSelectorView.createView$lambda$0$0(compoundOptionSelectorView, pudVar, listItemComponent2);
                        break;
                    default:
                        CompoundOptionSelectorView.createView$lambda$0$1(compoundOptionSelectorView, pudVar, listItemComponent2);
                        break;
                }
            }
        });
        listItemComponent.setTrailView(compoundOptionTrailView);
        compoundOptionTrailView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createView$lambda$0$0(CompoundOptionSelectorView compoundOptionSelectorView, pud pudVar, ListItemComponent listItemComponent) {
        ivd ivdVar = compoundOptionSelectorView.presenter;
        ivdVar.getClass();
        ivdVar.E.a(pudVar.f);
        int i = pudVar.a;
        gmw0 gmw0Var = (gmw0) ivdVar.H.getValue();
        if (gmw0Var != null) {
            List c = ivdVar.A.c(gmw0Var);
            fnx0 n = ((k) ivdVar.F).n();
            mi31 mi31Var = n != null ? n.a : null;
            if (mi31Var == null) {
                xby.l(jst.e, "Summary:Requirement:OptionSelection:Modal:Show", null, null, "Selected tariff is null", 6);
            } else {
                ivdVar.Lg(c, pudVar, gmw0Var, mi31Var);
                ((pep0) ivdVar.z).f((m950) ivdVar.y.get(), new wud(mi31Var, gmw0Var, c, i), hxx.a);
            }
        }
        if (compoundOptionSelectorView.presenter.Kg(pudVar)) {
            return;
        }
        compoundOptionSelectorView.hideBadge(listItemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createView$lambda$0$1(CompoundOptionSelectorView compoundOptionSelectorView, pud pudVar, ListItemComponent listItemComponent) {
        ivd ivdVar = compoundOptionSelectorView.presenter;
        x xVar = ivdVar.A;
        ivdVar.E.a(pudVar.f);
        int i = pudVar.a;
        gmw0 gmw0Var = (gmw0) ivdVar.H.getValue();
        if (gmw0Var != null) {
            ArrayList arrayList = new ArrayList(xVar.c(gmw0Var));
            fnx0 n = ((k) ivdVar.F).n();
            ivdVar.Lg(arrayList, pudVar, gmw0Var, n != null ? n.a : null);
            if (((ejj0) a.S(i, arrayList)) != null) {
                ejj0 ejj0Var = (ejj0) arrayList.remove(i);
                xVar.a(gmw0Var, arrayList);
                ivdVar.D.e(gmw0Var.c, Collections.singletonList(ejj0Var.a), RequirementRemoveSource.LIST, null);
            }
        }
        if (compoundOptionSelectorView.presenter.Kg(pudVar)) {
            return;
        }
        compoundOptionSelectorView.hideBadge(listItemComponent);
    }

    private final void hideBadge(ListItemComponent listItemComponent) {
        CompoundOptionTrailView compoundOptionTrailView = (CompoundOptionTrailView) listItemComponent.getTrailViewAs(CompoundOptionTrailView.class);
        if (compoundOptionTrailView != null) {
            compoundOptionTrailView.hideBadge();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeView(ListItemComponent view) {
        this.imageLoader.c(view.getLeadImageView());
    }

    private final void showBadge(ListItemComponent listItemComponent, idj0 idj0Var) {
        kdc b = ((ufu) this.colorConverter).b(idj0Var.a.b.b);
        pdc pdcVar = this.colorConverter;
        gdj0 gdj0Var = idj0Var.a.b;
        kdc i = ((ufu) pdcVar).i(gdj0Var.c);
        int m = b != null ? s8o.m(b, listItemComponent.getContext()) : c.a(mqg0.transparent, listItemComponent);
        int c = (b == null || i == null) ? c.c(xng0.textMain, listItemComponent) : s8o.m(i, listItemComponent.getContext());
        CompoundOptionTrailView compoundOptionTrailView = (CompoundOptionTrailView) listItemComponent.getTrailViewAs(CompoundOptionTrailView.class);
        if (compoundOptionTrailView != null) {
            compoundOptionTrailView.showBadge(gdj0Var.a, m, c);
        }
    }

    @Override // ru.yandex.taxi.design.AutoDividerComponentList, com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.listDelegate.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ivd ivdVar = this.presenter;
        kvd kvdVar = this.mvpImpl;
        ivdVar.Bg(kvdVar);
        tje.N(ivdVar.Jg(), null, null, new CompoundOptionSelectorPresenter$attachView$1(ivdVar, kvdVar, null), 3);
        tje.N(ivdVar.Jg(), null, null, new CompoundOptionSelectorPresenter$attachView$2(ivdVar, kvdVar, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.listDelegate.c(EmptyList.a);
    }

    public final void updateRequirement(gmw0 requirement) {
        this.presenter.H.l(requirement);
    }
}
