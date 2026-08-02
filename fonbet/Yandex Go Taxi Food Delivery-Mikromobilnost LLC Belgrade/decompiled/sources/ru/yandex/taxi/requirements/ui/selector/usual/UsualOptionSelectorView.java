package ru.yandex.taxi.requirements.ui.selector.usual;

import android.content.Context;
import androidx.recyclerview.widget.i;
import defpackage.af70;
import defpackage.aub;
import defpackage.ejj0;
import defpackage.ijj0;
import defpackage.ixe;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.kcz0;
import defpackage.kp50;
import defpackage.mr21;
import defpackage.mrg0;
import defpackage.og20;
import defpackage.qv21;
import defpackage.rv21;
import defpackage.scc;
import defpackage.sv21;
import defpackage.tf70;
import defpackage.tje;
import defpackage.w511;
import defpackage.xw31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.h;
import ru.yandex.taxi.widget.NumberSpinner;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001.B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0019H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0019H\u0014¢\u0006\u0004\b,\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0018\u0010/\u001a\u00060.R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/yandex/taxi/requirements/ui/selector/usual/UsualOptionSelectorView;", "Lru/yandex/taxi/design/AutoDividerComponentList;", "Landroid/content/Context;", "context", "Lqv21;", "presenter", "<init>", "(Landroid/content/Context;Lqv21;)V", "", "Ltf70;", "oldItems", "newItems", "Landroidx/recyclerview/widget/i;", "calculateDiff", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/i;", "item", "Lru/yandex/taxi/design/ListItemComponent;", "createView", "(Ltf70;)Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/ListItemCheckComponent$Mode;", "mode", "Lru/yandex/taxi/design/ListItemCheckComponent;", "createSimpleItem", "(Lru/yandex/taxi/design/ListItemCheckComponent$Mode;)Lru/yandex/taxi/design/ListItemCheckComponent;", "view", "Lzy11;", "bindItem", "(Lru/yandex/taxi/design/ListItemComponent;Ltf70;)V", "bindSelection", "(Ltf70;Lru/yandex/taxi/design/ListItemComponent;)Lzy11;", "Ljmw0;", "requirement", "updateRequirement", "(Ljmw0;)V", "Laf70;", "listener", "setListener", "(Laf70;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lqv21;", "Lrv21;", "mvp", "Lrv21;", "Lru/yandex/taxi/utils/h;", "listDelegate", "Lru/yandex/taxi/utils/h;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UsualOptionSelectorView extends AutoDividerComponentList {
    private final h listDelegate;
    private final rv21 mvp;
    private final qv21 presenter;

    public UsualOptionSelectorView(Context context, qv21 qv21Var) {
        super(context, null, 0, 6, null);
        this.presenter = qv21Var;
        setMiddleDividers(DividerType.MARGIN);
        this.mvp = new rv21(this);
        this.listDelegate = new h(this, new UsualOptionSelectorView$listDelegate$1(2, this, UsualOptionSelectorView.class, "calculateDiff", "calculateDiff(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;", 0), new UsualOptionSelectorView$listDelegate$2(1, this, UsualOptionSelectorView.class, "createView", "createView(Lru/yandex/taxi/requirements/ui/selector/usual/OptionViewModel;)Lru/yandex/taxi/design/ListItemComponent;", 0), new UsualOptionSelectorView$listDelegate$3(2, this, UsualOptionSelectorView.class, "bindItem", "bindItem(Lru/yandex/taxi/design/ListItemComponent;Lru/yandex/taxi/requirements/ui/selector/usual/OptionViewModel;)V", 0), new mr21(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindItem(ListItemComponent view, tf70 item) {
        view.setTitle(item.b);
        view.setSubtitle(item.c);
        bindSelection(item, view);
    }

    private final zy11 bindSelection(tf70 item, ListItemComponent view) {
        OptionViewType optionViewType = item.d;
        int i = item.e;
        int i2 = sv21.a[optionViewType.ordinal()];
        zy11 zy11Var = zy11.a;
        if (i2 == 1 || i2 == 2) {
            ((ListItemCheckComponent) view).setChecked(i > 0);
            return zy11Var;
        }
        if (i2 != 3) {
            w511.b();
            return null;
        }
        NumberSpinner numberSpinner = (NumberSpinner) view.getTrailViewAs(NumberSpinner.class);
        if (numberSpinner == null) {
            return null;
        }
        numberSpinner.setMaxValue(item.f);
        numberSpinner.setValue(i);
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i calculateDiff(List<tf70> oldItems, List<tf70> newItems) {
        return kp50.f(new og20(oldItems, newItems, new aub(21)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean calculateDiff$lambda$0(tf70 tf70Var, tf70 tf70Var2) {
        return Boolean.valueOf(tf70Var.d == tf70Var2.d && jl40.l(tf70Var.a, tf70Var2.a));
    }

    private final ListItemCheckComponent createSimpleItem(ListItemCheckComponent.Mode mode) {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(getContext(), null, 0, 6, null);
        listItemCheckComponent.setMode(mode);
        listItemCheckComponent.setCheckedChangeListener(new ixe(2, this, listItemCheckComponent));
        return listItemCheckComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSimpleItem$lambda$0$0(UsualOptionSelectorView usualOptionSelectorView, ListItemCheckComponent listItemCheckComponent, boolean z) {
        tf70 tf70Var;
        String str;
        int i;
        qv21 qv21Var = usualOptionSelectorView.presenter;
        int indexOfChild = usualOptionSelectorView.indexOfChild(listItemCheckComponent);
        x xVar = qv21Var.z;
        qv21Var.Kg(indexOfChild, !z);
        jmw0 jmw0Var = (jmw0) qv21Var.D.getValue();
        if (jmw0Var == null || (tf70Var = (tf70) kotlin.collections.a.S(indexOfChild, qv21Var.E)) == null || (str = tf70Var.a) == null || jmw0Var.p(str) == null) {
            return;
        }
        List c = xVar.c(jmw0Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ejj0 ejj0Var = (ejj0) it.next();
            String str2 = jl40.l(ejj0Var.a, str) ? null : ejj0Var.a;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        c.size();
        arrayList2.size();
        if (z) {
            arrayList2.add(str);
        }
        qv21Var.y.getClass();
        ArrayList c2 = ijj0.c(arrayList2, jmw0Var, false);
        xVar.a(jmw0Var, c2);
        if (c2.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = c2.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (jl40.l(((ejj0) it2.next()).a, str) && (i = i + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        String name = jmw0Var.getName();
        af70 af70Var = qv21Var.F;
        if (af70Var == null) {
            return;
        }
        af70Var.e(name, str, i > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListItemComponent createView(tf70 item) {
        int i = sv21.a[item.d.ordinal()];
        if (i == 1) {
            return createSimpleItem(ListItemCheckComponent.Mode.SINGLE);
        }
        if (i == 2) {
            return createSimpleItem(ListItemCheckComponent.Mode.MULTIPLE);
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        NumberSpinner numberSpinner = new NumberSpinner(getContext(), null, 0, 6, null);
        listItemComponent.setTrailView(numberSpinner);
        xw31.A(tje.r(mrg0.go_design_m_space, getContext()), numberSpinner);
        numberSpinner.setOnValueChangedListener(new kcz0(this, listItemComponent));
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 listDelegate$lambda$0(ListItemComponent listItemComponent) {
        return zy11.a;
    }

    @Override // ru.yandex.taxi.design.AutoDividerComponentList, com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.listDelegate.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qv21 qv21Var = this.presenter;
        rv21 rv21Var = this.mvp;
        qv21Var.Bg(rv21Var);
        tje.N(qv21Var.Jg(), null, null, new UsualOptionSelectorPresenter$attachView$1(qv21Var, rv21Var, null), 3);
        tje.N(qv21Var.Jg(), null, null, new UsualOptionSelectorPresenter$attachView$2(qv21Var, rv21Var, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    public final void setListener(af70 listener) {
        this.presenter.F = listener;
    }

    public final void updateRequirement(jmw0 requirement) {
        this.presenter.D.l(requirement);
    }
}
