package ru.yandex.taxi.preorder.suggested.selection;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aph0;
import defpackage.czo0;
import defpackage.d6v0;
import defpackage.ecv0;
import defpackage.ex4;
import defpackage.fcv0;
import defpackage.g7v0;
import defpackage.gcv0;
import defpackage.gw00;
import defpackage.gyc;
import defpackage.hbp0;
import defpackage.io9;
import defpackage.iw00;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.k8v0;
import defpackage.l8v0;
import defpackage.n4v0;
import defpackage.nwy0;
import defpackage.o5v0;
import defpackage.o8v0;
import defpackage.pav;
import defpackage.q91;
import defpackage.s4v0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.wch0;
import defpackage.x9v0;
import defpackage.xw31;
import defpackage.y60;
import defpackage.yn0;
import defpackage.yyg0;
import defpackage.zxf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0003K#LB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u000b2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lru/yandex/taxi/preorder/suggested/selection/SuggestsView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpav;", "imageLoader", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "Ld6v0;", "suggestMenuAvailabilityResolver", "initSuggestAdapter", "(Lpav;Lru/yandex/taxi/widget/c;Ld6v0;)V", "Landroidx/recyclerview/widget/RecyclerView$g;", "scrollListener", "addOnScrollListener", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "topPadding", "setTopPadding", "(I)V", "", "Lx9v0;", "suggestViewModelList", "changeDataSet", "(Ljava/util/List;)V", "Lfcv0;", "callback", "setPerformanceCallback", "(Lfcv0;)V", "Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$State;", "viewState", "changeViewState", "(Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$State;)V", "Lru/yandex/taxi/search/address/view/PointType;", "pointType", "changePointType", "(Lru/yandex/taxi/search/address/view/PointType;)V", "Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$a;", "setAdapterCallback", "(Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$a;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "Lo5v0;", "suggestItemContextMenuConfig", "updateSuggestItemContextMenuConfig", "(Lo5v0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerview", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/preorder/suggested/selection/b;", "adapter", "Lru/yandex/taxi/preorder/suggested/selection/b;", "Ln4v0;", "itemDecoration", "Ln4v0;", "performanceCallback", "Lfcv0;", "Lhbp0;", "mainScope", "Lhbp0;", "a", "State", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuggestsView extends LinearLayout implements nwy0 {
    private b adapter;
    private n4v0 itemDecoration;
    private final hbp0 mainScope;
    private fcv0 performanceCallback;
    private final RecyclerView recyclerview;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$State;", "", "", "subtitleVisibility", CA20Status.STATUS_USER_I, "b", "()I", "getSubtitleVisibility$annotations", "()V", "maxLines", "a", "FULL", "SHORT", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State FULL;
        public static final State SHORT;
        private final int maxLines;
        private final int subtitleVisibility;

        static {
            State state = new State("FULL", 0, 0, 12);
            FULL = state;
            State state2 = new State("SHORT", 1, 8, 2);
            SHORT = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public State(String str, int i, int i2, int i3) {
            this.subtitleVisibility = i2;
            this.maxLines = i3;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: b, reason: from getter */
        public final int getSubtitleVisibility() {
            return this.subtitleVisibility;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$a;", "Lzxf0;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void L6(x9v0 x9v0Var);

        void N0(int i);

        void T8();

        void Ue(yn0 yn0Var, String str, String str2, Events$Suggest$ZeroSuggestAdditionalTapArea events$Suggest$ZeroSuggestAdditionalTapArea);

        void W0(x9v0 x9v0Var);

        void Za(x9v0 x9v0Var);

        void Zd(String str, String str2);

        void bc(k8v0 k8v0Var);

        void s7(k8v0 k8v0Var);

        void w6();
    }

    public SuggestsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, aph0.suggestions_view, true);
        this.recyclerview = (RecyclerView) findViewById(wch0.suggest_recycler_view);
        this.mainScope = new hbp0(new czo0(14), "", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeDataSet$lambda$0(fcv0 fcv0Var) {
        q91 q91Var;
        ex4 ex4Var;
        CompositeAddressSearchView compositeAddressSearchView = (CompositeAddressSearchView) ((gyc) fcv0Var).a;
        q91Var = compositeAddressSearchView.addressesListPerfCallback;
        if (q91Var != null) {
            ((com.yandex.go.address.search.perf.b) q91Var).a();
        }
        ex4Var = compositeAddressSearchView.suggestsListener;
        if (ex4Var != null) {
            ((CompositeAddressSearchModalView) ((io9) ex4Var).a).reportModalViewLcpIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPerformanceCallback$lambda$0(fcv0 fcv0Var) {
        q91 q91Var;
        q91Var = ((CompositeAddressSearchView) ((gyc) fcv0Var).a).addressesListPerfCallback;
        if (q91Var != null) {
            ((com.yandex.go.address.search.perf.b) q91Var).c();
        }
    }

    public final void addOnScrollListener(RecyclerView.g scrollListener) {
        this.recyclerview.addOnScrollListener(scrollListener);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        RecyclerView recyclerView = this.recyclerview;
        b bVar = this.adapter;
        if (bVar == null) {
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
        Drawable y = tje.y(yyg0.bg_suggest_bottom_divider, getContext());
        n4v0 n4v0Var = this.itemDecoration;
        (n4v0Var == null ? null : n4v0Var).a = y;
        this.recyclerview.addItemDecoration(n4v0Var != null ? n4v0Var : null);
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void changeDataSet(List<? extends x9v0> suggestViewModelList) {
        int i;
        fcv0 fcv0Var;
        List<? extends x9v0> list = suggestViewModelList == null ? EmptyList.a : suggestViewModelList;
        b bVar = this.adapter;
        if (bVar == null) {
            bVar = null;
        }
        PointType pointType = bVar.D;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer num = ((x9v0) obj).x;
            Object obj2 = linkedHashMap.get(num);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(num, obj2);
            }
            ((List) obj2).add(obj);
        }
        TreeMap treeMap = new TreeMap(new y60(6));
        treeMap.putAll(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(treeMap.size()));
        for (Map.Entry entry : treeMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : iterable) {
                o8v0 o8v0Var = ((x9v0) obj3).w;
                Object obj4 = linkedHashMap3.get(o8v0Var);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap3.put(o8v0Var, obj4);
                }
                ((List) obj4).add(obj3);
            }
            TreeMap treeMap2 = new TreeMap(new g7v0());
            treeMap2.putAll(linkedHashMap3);
            linkedHashMap2.put(key, treeMap2);
        }
        List x = iw00.x(linkedHashMap2);
        ArrayList arrayList = new ArrayList(tcc.n(x, 10));
        Iterator it = x.iterator();
        while (it.hasNext()) {
            List x2 = iw00.x((Map) ((Pair) it.next()).f());
            ArrayList arrayList2 = new ArrayList(tcc.n(x2, 10));
            Iterator it2 = x2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((List) ((Pair) it2.next()).f());
            }
            arrayList.add(tcc.o(arrayList2));
        }
        ArrayList o = tcc.o(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = o.iterator();
        int i2 = 0;
        while (true) {
            i = 1;
            if (!it3.hasNext()) {
                break;
            }
            int i3 = i2 + 1;
            x9v0 x9v0Var = (x9v0) it3.next();
            x9v0 x9v0Var2 = (x9v0) kotlin.collections.a.S(i3, o);
            Integer num2 = x9v0Var.x;
            o8v0 o8v0Var2 = x9v0Var.w;
            if (!jl40.l(num2, x9v0Var2 != null ? x9v0Var2.x : null) && x9v0Var2 != null) {
                x9v0Var.N = true;
            }
            x9v0 x9v0Var3 = (x9v0) kotlin.collections.a.S(i2 - 1, o);
            if (jl40.l(x9v0Var.x, x9v0Var3 != null ? x9v0Var3.x : null)) {
                if (jl40.l(o8v0Var2, x9v0Var3 != null ? x9v0Var3.w : null)) {
                    arrayList3.add(x9v0Var);
                    i2 = i3;
                }
            }
            if (x9v0Var3 == null || !x9v0Var3.N) {
                String str = "";
                if (pointType == PointType.DESTINATION && (o8v0Var2 instanceof l8v0)) {
                    str = x9v0Var.v.a;
                }
                if (str.length() > 0) {
                    arrayList3.add(new s4v0(str));
                    if (x9v0Var3 != null) {
                        x9v0Var3.O = true;
                    }
                }
            }
            arrayList3.add(x9v0Var);
            i2 = i3;
        }
        bVar.x = arrayList3;
        bVar.A = !arrayList3.isEmpty();
        bVar.notifyDataSetChanged();
        this.recyclerview.scrollToPosition(0);
        if (list.isEmpty() || (fcv0Var = this.performanceCallback) == null) {
            return;
        }
        this.recyclerview.post(new ecv0(fcv0Var, i));
    }

    public final void changePointType(PointType pointType) {
        b bVar = this.adapter;
        if (bVar == null) {
            bVar = null;
        }
        bVar.D = pointType;
    }

    public final void changeViewState(State viewState) {
        b bVar = this.adapter;
        if (bVar == null) {
            bVar = null;
        }
        bVar.z = viewState;
        bVar.notifyItemRangeChanged(0, bVar.x.size(), bVar.z);
    }

    public final void initSuggestAdapter(pav imageLoader, ru.yandex.taxi.widget.c formattedTextConverter, d6v0 suggestMenuAvailabilityResolver) {
        b bVar = new b(this.mainScope, imageLoader, formattedTextConverter, suggestMenuAvailabilityResolver);
        this.adapter = bVar;
        this.recyclerview.setAdapter(bVar);
        Drawable y = tje.y(yyg0.bg_suggest_bottom_divider, getContext());
        n4v0 n4v0Var = new n4v0(getContext());
        this.itemDecoration = n4v0Var;
        n4v0Var.a = y;
        this.recyclerview.addItemDecoration(n4v0Var);
        this.recyclerview.addOnScrollListener(new gcv0(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mainScope.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainScope.b();
    }

    public final void setAdapterCallback(a callback) {
        b bVar = this.adapter;
        if (bVar == null) {
            bVar = null;
        }
        bVar.y.a(callback);
    }

    public final void setPerformanceCallback(fcv0 callback) {
        this.performanceCallback = callback;
        b bVar = this.adapter;
        if (bVar == null) {
            bVar = null;
        }
        bVar.B = callback != null ? new ecv0(callback, 0) : null;
    }

    public final void setTopPadding(int topPadding) {
        xw31.M(topPadding, this.recyclerview);
    }

    public final void updateSuggestItemContextMenuConfig(o5v0 suggestItemContextMenuConfig) {
        b bVar = this.adapter;
        if (bVar == null) {
            bVar = null;
        }
        if (suggestItemContextMenuConfig != bVar.C) {
            bVar.C = suggestItemContextMenuConfig;
            bVar.notifyItemRangeChanged(0, bVar.x.size(), suggestItemContextMenuConfig);
        }
    }

    public SuggestsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SuggestsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SuggestsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
