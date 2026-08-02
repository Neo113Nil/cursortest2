package ru.yandex.taxi.scooters.presentation.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eqb;
import defpackage.iln0;
import defpackage.j0o0;
import defpackage.k0o0;
import defpackage.mln0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.pzn0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001b\u001fB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ1\u0010\u0019\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/ScootersMultiSelectChipsComponent;", "T", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "refreshChips", "()V", "Leqb;", "chipInfo", "onItemSelect", "(Leqb;)V", "updateSelectedItems", "", "items", "Lkotlin/Function1;", "", "itemToTitle", "bindData", "(Ljava/util/Collection;Ltls;)V", "Lk0o0;", "listener", "setOnSelectionChangeListener", "(Lk0o0;)V", "Lj0o0;", "setOnItemSelectListener", "(Lj0o0;)V", "selectItems", "(Ljava/util/Collection;)V", "Landroidx/constraintlayout/helper/widget/Flow;", "flow", "Landroidx/constraintlayout/helper/widget/Flow;", "", "chips", "Ljava/util/List;", "", "Lru/yandex/taxi/scooters/presentation/common/ui/ChipView;", "chipViews", "selectionChangeListener", "Lk0o0;", "selectItemListener", "Lj0o0;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersMultiSelectChipsComponent<T> extends ConstraintLayout {
    public static final int $stable = 8;
    private final List<ChipView<T>> chipViews;
    private List<eqb> chips;
    private final Flow flow;
    private j0o0 selectItemListener;
    private k0o0 selectionChangeListener;

    public ScootersMultiSelectChipsComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Flow flow = new Flow(context);
        flow.setId(View.generateViewId());
        flow.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        flow.setOrientation(0);
        flow.setWrapMode(1);
        flow.setHorizontalAlign(2);
        flow.setVerticalAlign(0);
        flow.setHorizontalStyle(2);
        flow.setVerticalStyle(2);
        flow.setHorizontalGap(tje.u(6, flow.getContext()));
        flow.setVerticalGap(tje.r(mrg0.go_design_s_space, flow.getContext()));
        this.flow = flow;
        this.chips = EmptyList.a;
        this.chipViews = new ArrayList();
    }

    public static /* synthetic */ void bindData$default(ScootersMultiSelectChipsComponent scootersMultiSelectChipsComponent, Collection collection, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = new pzn0(6);
        }
        scootersMultiSelectChipsComponent.bindData(collection, tlsVar);
    }

    private final void onItemSelect(eqb chipInfo) {
        updateSelectedItems();
        j0o0 j0o0Var = this.selectItemListener;
        if (j0o0Var != null) {
            Object obj = chipInfo.a;
            boolean z = chipInfo.c;
            ((mln0) j0o0Var).a.onItemSelect((iln0) obj, z);
        }
    }

    private final void refreshChips() {
        this.chipViews.clear();
        removeAllViews();
        this.flow.setReferencedIds(new int[0]);
        addView(this.flow);
        for (eqb eqbVar : this.chips) {
            ChipView<T> chipView = new ChipView<>(getContext(), eqbVar, new tmm0(23, this, eqbVar));
            addView(chipView);
            this.flow.addView(chipView);
            this.chipViews.add(chipView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 refreshChips$lambda$0$0(ScootersMultiSelectChipsComponent scootersMultiSelectChipsComponent, eqb eqbVar) {
        scootersMultiSelectChipsComponent.onItemSelect(eqbVar);
        return zy11.a;
    }

    private final void updateSelectedItems() {
    }

    public final void bindData(Collection<? extends T> items, tls itemToTitle) {
        Collection<? extends T> collection = items;
        ArrayList arrayList = new ArrayList(tcc.n(collection, 10));
        for (T t : collection) {
            arrayList.add(new eqb(t, (CharSequence) itemToTitle.invoke(t)));
        }
        this.chips = arrayList;
        refreshChips();
    }

    public final void selectItems(Collection<? extends T> items) {
        if (items.isEmpty()) {
            ny61.g("List of items to select must not be empty");
            return;
        }
        for (eqb eqbVar : this.chips) {
            eqbVar.c = items.contains(eqbVar.a);
        }
        updateSelectedItems();
        Iterator<T> it = this.chipViews.iterator();
        while (it.hasNext()) {
            ((ChipView) it.next()).refreshState();
        }
    }

    public final void setOnItemSelectListener(j0o0 listener) {
        this.selectItemListener = listener;
    }

    public final void setOnSelectionChangeListener(k0o0 listener) {
    }

    public ScootersMultiSelectChipsComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersMultiSelectChipsComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersMultiSelectChipsComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersMultiSelectChipsComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
