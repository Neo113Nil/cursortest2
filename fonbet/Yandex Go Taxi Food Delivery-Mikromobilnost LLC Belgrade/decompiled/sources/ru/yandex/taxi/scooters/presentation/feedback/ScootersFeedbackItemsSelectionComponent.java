package ru.yandex.taxi.scooters.presentation.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aki0;
import defpackage.bdc;
import defpackage.bys;
import defpackage.f3x;
import defpackage.fln0;
import defpackage.gln0;
import defpackage.h73;
import defpackage.iln0;
import defpackage.j3x;
import defpackage.kln0;
import defpackage.lln0;
import defpackage.mln0;
import defpackage.mrg0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.v4r0;
import defpackage.vkn0;
import defpackage.wls;
import defpackage.wxs;
import defpackage.xng0;
import defpackage.ykn0;
import defpackage.yw01;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.scooters.presentation.common.ui.ScootersMultiSelectChipsComponent;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackItemsSelectionComponent;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\"\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u00160B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010$J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u00132\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u001b¢\u0006\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010,\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010:R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010;R&\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/ScootersFeedbackItemsSelectionComponent;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/widget/RobotoTextView;", "levelTitleView", "()Lru/yandex/taxi/widget/RobotoTextView;", "Lgln0;", "levelTitle", "Lzy11;", "bindLevelTitleItem", "(Lru/yandex/taxi/widget/RobotoTextView;Lgln0;)V", "Lru/yandex/taxi/scooters/presentation/common/ui/ScootersMultiSelectChipsComponent;", "Liln0;", "feedbackItemTreeNodeListView", "()Lru/yandex/taxi/scooters/presentation/common/ui/ScootersMultiSelectChipsComponent;", "Lkln0;", "itemsList", "bindFeedbackItemTreeNodeList", "(Lru/yandex/taxi/scooters/presentation/common/ui/ScootersMultiSelectChipsComponent;Lkln0;)V", "item", "", "selected", "onItemSelect", "(Liln0;Z)V", "parent", "level", "removeSelectedWithChildren", "(Liln0;I)V", "refreshData", "()V", "requiresSelectionInternal", "(Liln0;I)Z", "updateSelectedItems", "", "Lfln0;", "selectedItems", "()Ljava/util/List;", "rootItemNode", "levelTitles", "bindData", "(Liln0;Ljava/util/List;)V", "Llln0;", "listener", "setOnSelectionChangeListener", "(Llln0;)V", "requiresSelection", "()Z", "Lbys;", "", "adapter", "Lbys;", "Liln0;", "Ljava/util/List;", "", "", "selectedItemsByLevel", "Ljava/util/Map;", "selectionChangeListener", "Llln0;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersFeedbackItemsSelectionComponent extends RecyclerView {
    public static final int $stable = 8;
    private final bys adapter;
    private List<gln0> levelTitles;
    private iln0 rootItemNode;
    private final Map<Integer, Set<iln0>> selectedItemsByLevel;
    private lln0 selectionChangeListener;

    public ScootersFeedbackItemsSelectionComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j3x j3xVar = new j3x();
        adapter$lambda$0(this, j3xVar);
        RecyclerView.e eVar = j3xVar.b;
        setLayoutManager(eVar == null ? new LinearLayoutManager(getContext(), 1, false) : eVar);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        setAdapter(bysVar);
        this.adapter = bysVar;
        this.selectedItemsByLevel = new LinkedHashMap();
        setItemAnimator(null);
        int u = tje.u(12, getContext());
        setPadding(u, 0, u, u);
    }

    private static final zy11 adapter$lambda$0(final ScootersFeedbackItemsSelectionComponent scootersFeedbackItemsSelectionComponent, j3x j3xVar) {
        ScootersFeedbackItemsSelectionComponent$adapter$1$1 scootersFeedbackItemsSelectionComponent$adapter$1$1 = new ScootersFeedbackItemsSelectionComponent$adapter$1$1(0, scootersFeedbackItemsSelectionComponent, ScootersFeedbackItemsSelectionComponent.class, "levelTitleView", "levelTitleView()Lru/yandex/taxi/widget/RobotoTextView;", 0);
        j3xVar.getClass();
        final int i = 0;
        aki0.b(new f3x(gln0.class, j3xVar, scootersFeedbackItemsSelectionComponent$adapter$1$1), new wls(scootersFeedbackItemsSelectionComponent) { // from class: jln0
            public final /* synthetic */ ScootersFeedbackItemsSelectionComponent b;

            {
                this.b = scootersFeedbackItemsSelectionComponent;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 adapter$lambda$0$0;
                zy11 adapter$lambda$0$1;
                switch (i) {
                    case 0:
                        adapter$lambda$0$0 = ScootersFeedbackItemsSelectionComponent.adapter$lambda$0$0(this.b, (RobotoTextView) obj, (gln0) obj2);
                        return adapter$lambda$0$0;
                    default:
                        adapter$lambda$0$1 = ScootersFeedbackItemsSelectionComponent.adapter$lambda$0$1(this.b, (ScootersMultiSelectChipsComponent) obj, (kln0) obj2);
                        return adapter$lambda$0$1;
                }
            }
        });
        final int i2 = 1;
        aki0.b(new f3x(kln0.class, j3xVar, new ScootersFeedbackItemsSelectionComponent$adapter$1$3(0, scootersFeedbackItemsSelectionComponent, ScootersFeedbackItemsSelectionComponent.class, "feedbackItemTreeNodeListView", "feedbackItemTreeNodeListView()Lru/yandex/taxi/scooters/presentation/common/ui/ScootersMultiSelectChipsComponent;", 0)), new wls(scootersFeedbackItemsSelectionComponent) { // from class: jln0
            public final /* synthetic */ ScootersFeedbackItemsSelectionComponent b;

            {
                this.b = scootersFeedbackItemsSelectionComponent;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 adapter$lambda$0$0;
                zy11 adapter$lambda$0$1;
                switch (i2) {
                    case 0:
                        adapter$lambda$0$0 = ScootersFeedbackItemsSelectionComponent.adapter$lambda$0$0(this.b, (RobotoTextView) obj, (gln0) obj2);
                        return adapter$lambda$0$0;
                    default:
                        adapter$lambda$0$1 = ScootersFeedbackItemsSelectionComponent.adapter$lambda$0$1(this.b, (ScootersMultiSelectChipsComponent) obj, (kln0) obj2);
                        return adapter$lambda$0$1;
                }
            }
        });
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0$0(ScootersFeedbackItemsSelectionComponent scootersFeedbackItemsSelectionComponent, RobotoTextView robotoTextView, gln0 gln0Var) {
        scootersFeedbackItemsSelectionComponent.bindLevelTitleItem(robotoTextView, gln0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0$1(ScootersFeedbackItemsSelectionComponent scootersFeedbackItemsSelectionComponent, ScootersMultiSelectChipsComponent scootersMultiSelectChipsComponent, kln0 kln0Var) {
        scootersFeedbackItemsSelectionComponent.bindFeedbackItemTreeNodeList(scootersMultiSelectChipsComponent, kln0Var);
        return zy11.a;
    }

    private final void bindFeedbackItemTreeNodeList(ScootersMultiSelectChipsComponent<iln0> scootersMultiSelectChipsComponent, kln0 kln0Var) {
        scootersMultiSelectChipsComponent.bindData(kln0Var.b, new vkn0(6));
        Set<iln0> set = this.selectedItemsByLevel.get(Integer.valueOf(kln0Var.a));
        if (set != null) {
            scootersMultiSelectChipsComponent.selectItems(set);
        }
        scootersMultiSelectChipsComponent.setOnItemSelectListener(new mln0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence bindFeedbackItemTreeNodeList$lambda$0(iln0 iln0Var) {
        return iln0Var.a.a.b;
    }

    private final void bindLevelTitleItem(RobotoTextView robotoTextView, gln0 gln0Var) {
        robotoTextView.setText(gln0Var.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScootersMultiSelectChipsComponent<iln0> feedbackItemTreeNodeListView() {
        ScootersMultiSelectChipsComponent<iln0> scootersMultiSelectChipsComponent = new ScootersMultiSelectChipsComponent<>(getContext(), null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, tje.u(12, scootersMultiSelectChipsComponent.getContext()), 0, 0);
        scootersMultiSelectChipsComponent.setLayoutParams(marginLayoutParams);
        return scootersMultiSelectChipsComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RobotoTextView levelTitleView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        robotoTextView.setPadding(0, tje.u(12, robotoTextView.getContext()), 0, 0);
        robotoTextView.setTextAlignment(4);
        robotoTextView.setTextColor(new bdc(xng0.textMinor));
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_body, robotoTextView.getContext()));
        return robotoTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemSelect(iln0 item, boolean selected) {
        if (selected) {
            Set<iln0> set = this.selectedItemsByLevel.get(Integer.valueOf(item.b));
            if (set == null) {
                set = EmptySet.a;
            }
            this.selectedItemsByLevel.put(Integer.valueOf(item.b), v4r0.i(set, item));
        } else {
            removeSelectedWithChildren(item, item.b);
        }
        refreshData();
        updateSelectedItems();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        r5 = r9.levelTitles;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r5 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (r5.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        r7 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (((defpackage.gln0) r7).a != r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        r7 = (defpackage.gln0) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
    
        if (defpackage.evu0.J(r7.b) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        r0.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        r7 = r4 + 1;
        r0.add(new defpackage.kln0(r7, defpackage.tcc.o(r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f1, code lost:
    
        if (r4 == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void refreshData() {
        Integer valueOf;
        int i;
        if (this.rootItemNode == null) {
            this.adapter.submitList(EmptyList.a, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.selectedItemsByLevel.keySet().iterator();
        if (it.hasNext()) {
            valueOf = Integer.valueOf(((Number) it.next()).intValue());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((Number) it.next()).intValue());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        int i2 = 0;
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        if (intValue >= 0) {
            int i3 = 0;
            loop0: while (true) {
                Set<iln0> set = this.selectedItemsByLevel.get(Integer.valueOf(i3));
                Set<iln0> set2 = set;
                if (set2 == null || set2.isEmpty()) {
                    break;
                }
                Set<iln0> set3 = set;
                ArrayList arrayList2 = new ArrayList(tcc.n(set3, 10));
                Iterator<T> it2 = set3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((iln0) it2.next()).c);
                }
                if (arrayList2.isEmpty()) {
                    break;
                }
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break loop0;
                    } else if (!((List) it3.next()).isEmpty()) {
                        break;
                    }
                }
                i3 = i;
            }
        }
        this.adapter.submitList(arrayList, null);
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                i2 = -1;
                break;
            } else if (it4.next() instanceof kln0) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            this.adapter.notifyItemChanged(i2);
        }
    }

    private final void removeSelectedWithChildren(iln0 parent, int level) {
        Set<iln0> set = this.selectedItemsByLevel.get(Integer.valueOf(level));
        if (set != null && set.contains(parent)) {
            int size = set.size();
            Map<Integer, Set<iln0>> map = this.selectedItemsByLevel;
            if (size == 1) {
                map.remove(Integer.valueOf(level));
            } else {
                map.put(Integer.valueOf(level), v4r0.f(set, parent));
            }
            int i = level + 1;
            Iterator it = parent.c.iterator();
            while (it.hasNext()) {
                removeSelectedWithChildren((iln0) it.next(), i);
            }
        }
    }

    private final boolean requiresSelectionInternal(iln0 parent, int level) {
        Set<iln0> set;
        if (parent.c.isEmpty() || (set = this.selectedItemsByLevel.get(Integer.valueOf(level))) == null || !set.contains(parent)) {
            return false;
        }
        int i = level + 1;
        if (!parent.a.b) {
            return requiresSelectionInternal$requiresSelectionInternalForChildren(parent, this, i);
        }
        Set<iln0> set2 = this.selectedItemsByLevel.get(Integer.valueOf(i));
        if (set2 != null) {
            List list = parent.c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (set2.contains((iln0) it.next())) {
                        return requiresSelectionInternal$requiresSelectionInternalForChildren(parent, this, i);
                    }
                }
            }
        }
        return true;
    }

    private static final boolean requiresSelectionInternal$requiresSelectionInternalForChildren(iln0 iln0Var, ScootersFeedbackItemsSelectionComponent scootersFeedbackItemsSelectionComponent, int i) {
        Iterator it = iln0Var.c.iterator();
        while (it.hasNext()) {
            if (scootersFeedbackItemsSelectionComponent.requiresSelectionInternal((iln0) it.next(), i)) {
                return true;
            }
        }
        return false;
    }

    private final List<fln0> selectedItems() {
        return kotlin.sequences.b.s(new yw01(kotlin.sequences.a.c(new yw01(kotlin.sequences.b.g(new h73(1, this.selectedItemsByLevel.entrySet()), new vkn0(3)), new vkn0(4))), new vkn0(5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectedItems$lambda$0(Map.Entry entry) {
        return ((Number) entry.getKey()).intValue() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set selectedItems$lambda$1(Map.Entry entry) {
        return (Set) entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fln0 selectedItems$lambda$2(iln0 iln0Var) {
        return iln0Var.a.a;
    }

    private final void updateSelectedItems() {
        lln0 lln0Var = this.selectionChangeListener;
        if (lln0Var != null) {
            ScootersFeedbackCard.setupListeners$lambda$1((ScootersFeedbackCard) ((ykn0) lln0Var).b, selectedItems());
        }
    }

    public final void bindData(iln0 rootItemNode, List<gln0> levelTitles) {
        this.rootItemNode = rootItemNode;
        this.levelTitles = levelTitles;
        this.selectedItemsByLevel.clear();
        if (rootItemNode != null) {
            this.selectedItemsByLevel.put(0, Collections.singleton(rootItemNode));
        }
        refreshData();
    }

    public final boolean requiresSelection() {
        iln0 iln0Var = this.rootItemNode;
        if (iln0Var == null) {
            return false;
        }
        return requiresSelectionInternal(iln0Var, 0);
    }

    public final void setOnSelectionChangeListener(lln0 listener) {
        this.selectionChangeListener = listener;
    }

    public ScootersFeedbackItemsSelectionComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersFeedbackItemsSelectionComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScootersFeedbackItemsSelectionComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
