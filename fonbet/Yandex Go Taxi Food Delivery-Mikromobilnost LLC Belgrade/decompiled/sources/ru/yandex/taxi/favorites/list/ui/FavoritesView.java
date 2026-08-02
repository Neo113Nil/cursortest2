package ru.yandex.taxi.favorites.list.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoView;
import defpackage.ad6;
import defpackage.bts0;
import defpackage.cma1;
import defpackage.dok0;
import defpackage.f0y;
import defpackage.fbv0;
import defpackage.g0c;
import defpackage.h28;
import defpackage.he7;
import defpackage.ho4;
import defpackage.iws;
import defpackage.jiu;
import defpackage.kyh0;
import defpackage.l0o;
import defpackage.l2x;
import defpackage.lgp;
import defpackage.lhj;
import defpackage.m2x;
import defpackage.md0;
import defpackage.mj1;
import defpackage.n2x;
import defpackage.ny61;
import defpackage.o1c;
import defpackage.o2x;
import defpackage.ojp;
import defpackage.omu0;
import defpackage.otv;
import defpackage.p0;
import defpackage.pgr0;
import defpackage.pjp;
import defpackage.q2x;
import defpackage.qjp;
import defpackage.qls0;
import defpackage.qoi0;
import defpackage.r2x;
import defpackage.rjp;
import defpackage.s2x;
import defpackage.scc;
import defpackage.sxo;
import defpackage.t1m0;
import defpackage.t2x;
import defpackage.tdh0;
import defpackage.tls;
import defpackage.txk;
import defpackage.tyo0;
import defpackage.u1m0;
import defpackage.u2x;
import defpackage.v2x;
import defpackage.vz1;
import defpackage.w2x;
import defpackage.w511;
import defpackage.w9u;
import defpackage.wk6;
import defpackage.x9u;
import defpackage.xph0;
import defpackage.zc6;
import defpackage.zhp;
import defpackage.zxs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0013¢\u0006\u0004\b&\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/yandex/taxi/favorites/list/ui/FavoritesView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lo1c;", "clickListener", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lbts0;", "slotItemViewFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILo1c;Lru/yandex/taxi/widget/utils/e;Lbts0;)V", "", "Lw2x;", "models", "Lzy11;", "updateItems", "(Ljava/util/List;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "showTooltipTitle", "Lrjp;", ClidProvider.STATE, "updateState", "(Lrjp;)V", "Ljava/lang/Runnable;", "onBackClicked", "onReloadClicked", "setupClickActions", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Landroid/view/ViewGroup;", "asViewGroup", "()Landroid/view/ViewGroup;", "clearAdapter", "Lru/yandex/taxi/widget/utils/e;", "getMediaInfoConverter", "()Lru/yandex/taxi/widget/utils/e;", "Lbts0;", "getSlotItemViewFactory", "()Lbts0;", "Lf0y;", "binding", "Lf0y;", "Lzhp;", "adapter", "Lzhp;", "Landroidx/recyclerview/widget/RecyclerView;", "favoritesList", "Landroidx/recyclerview/widget/RecyclerView;", "Lpgr0;", "shadowListener", "Lpgr0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoritesView extends FrameLayout {
    public static final int $stable = 8;
    private final zhp adapter;
    private final f0y binding;
    private final RecyclerView favoritesList;
    private final ru.yandex.taxi.widget.utils.e mediaInfoConverter;
    private pgr0 shadowListener;
    private final bts0 slotItemViewFactory;

    public FavoritesView(Context context, AttributeSet attributeSet, int i, final o1c o1cVar, ru.yandex.taxi.widget.utils.e eVar, bts0 bts0Var) {
        super(context, attributeSet, i);
        FavoritesView favoritesView;
        String str;
        View O;
        this.mediaInfoConverter = eVar;
        this.slotItemViewFactory = bts0Var;
        LayoutInflater.from(context).inflate(xph0.layout_favorites, this);
        int i2 = tdh0.error_view_include;
        View O2 = cma1.O(i2, this);
        if (O2 != null) {
            int i3 = tdh0.add_place_and_reload_container;
            if (((BottomEdgeButtonLayout) cma1.O(i3, O2)) != null) {
                LinearLayout linearLayout = (LinearLayout) O2;
                int i4 = tdh0.reload_favorites_list_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i4, O2);
                if (buttonComponent != null) {
                    ho4 ho4Var = new ho4((ViewGroup) linearLayout, (View) linearLayout, (RobotoTextView) buttonComponent, 5);
                    i2 = tdh0.favorites_list;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i2, this);
                    if (recyclerView != null && (O = cma1.O((i2 = tdh0.loading_state_favorites_include), this)) != null) {
                        int i5 = tdh0.divider;
                        View O3 = cma1.O(i5, O);
                        if (O3 == null) {
                            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i5)));
                            throw null;
                        }
                        LinearLayout linearLayout2 = (LinearLayout) O;
                        str = "Missing required view with ID: ";
                        ho4 ho4Var2 = new ho4(linearLayout2, O3, linearLayout2, 6);
                        i2 = tdh0.toolbar;
                        ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i2, this);
                        if (toolbarComponent != null) {
                            i2 = tdh0.top_shadow;
                            GoView goView = (GoView) cma1.O(i2, this);
                            if (goView != null) {
                                this.binding = new f0y(this, ho4Var, recyclerView, ho4Var2, toolbarComponent, goView);
                                final byte b = 0;
                                FavoritesView$adapter$1 favoritesView$adapter$1 = new FavoritesView$adapter$1(2, o1cVar, o1c.class, "rideActionHandler", "rideActionHandler(Lcom/yandex/go/slot/api/action/SlotItemAction;Lru/yandex/taxi/favorites/rides/model/RideData;)V", 0);
                                int i6 = md0.U;
                                g0c a = qoi0.a(l2x.class);
                                p0 p0Var = new p0(19);
                                tls tlsVar = new tls() { // from class: ld0
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                                        switch (b) {
                                            case 0:
                                                return new md0(listItemComponent, o1cVar);
                                            case 1:
                                                return new h28(listItemComponent, o1cVar, 0);
                                            default:
                                                return new h28(listItemComponent, o1cVar, 1);
                                        }
                                    }
                                };
                                Class a2 = a.a();
                                final int i7 = 1;
                                he7 he7Var = new he7(1, tlsVar);
                                EmptyList emptyList = EmptyList.a;
                                zxs zxsVar = new zxs(a2, 0, p0Var, emptyList, he7Var, null);
                                int i8 = h28.V;
                                zxs zxsVar2 = new zxs(qoi0.a(m2x.class).a(), 0, new wk6(24), emptyList, new he7(1, new tls() { // from class: ld0
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                                        switch (i7) {
                                            case 0:
                                                return new md0(listItemComponent, o1cVar);
                                            case 1:
                                                return new h28(listItemComponent, o1cVar, 0);
                                            default:
                                                return new h28(listItemComponent, o1cVar, 1);
                                        }
                                    }
                                }), null);
                                int i9 = ru.yandex.taxi.favorites.list.ui.adapter.holder.a.U;
                                final int i10 = 2;
                                zxs zxsVar3 = new zxs(qoi0.a(o2x.class).a(), 0, new l0o(25), emptyList, new he7(1, new sxo(i10, eVar, o1cVar)), null);
                                int i11 = h28.V;
                                zxs zxsVar4 = new zxs(qoi0.a(u2x.class).a(), 0, new omu0(13), emptyList, new he7(1, new tls() { // from class: ld0
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                                        switch (i10) {
                                            case 0:
                                                return new md0(listItemComponent, o1cVar);
                                            case 1:
                                                return new h28(listItemComponent, o1cVar, 0);
                                            default:
                                                return new h28(listItemComponent, o1cVar, 1);
                                        }
                                    }
                                }), null);
                                int i12 = x9u.S;
                                g0c a3 = qoi0.a(q2x.class);
                                zxs zxsVar5 = new zxs(a3.a(), 0, new iws(9), scc.g(new lgp(new txk(29), new w9u(0), 0), new lgp(new w9u(1), new w9u(2), 0)), new he7(1, new iws(10)), null);
                                int i13 = ad6.U;
                                zxs zxsVar6 = new zxs(qoi0.a(t2x.class).a(), 0, new tyo0(15), emptyList, new he7(1, new tyo0(16)), null);
                                int i14 = fbv0.T;
                                g0c a4 = qoi0.a(v2x.class);
                                zxs zxsVar7 = new zxs(a4.a(), 0, new vz1(bts0Var, 15), scc.g(new lgp(new qls0(20), new qls0(21), 0), new lgp(new qls0(22), new qls0(23), 0), new lgp(new qls0(24), new qls0(25), 0), new lgp(new qls0(26), new qls0(27), 0)), new he7(1, new mj1(favoritesView$adapter$1, 10)), null);
                                int i15 = u1m0.T;
                                g0c a5 = qoi0.a(s2x.class);
                                zxs zxsVar8 = new zxs(a5.a(), 0, new vz1(bts0Var, 13), scc.g(new lgp(new dok0(b, 29), new t1m0((byte) 0, 0), 0), new lgp(new t1m0((byte) 0, 1), new t1m0((byte) 0, 2), 0), new lgp(new t1m0((byte) 0, 3), new t1m0((byte) 0, 4), 0), new lgp(new t1m0((byte) 0, 5), new t1m0((byte) 0, 6), 0)), new he7(1, new mj1(favoritesView$adapter$1, 6)), null);
                                int i16 = otv.S;
                                g0c a6 = qoi0.a(r2x.class);
                                zxs zxsVar9 = new zxs(a6.a(), 0, new vz1(bts0Var, 3), scc.g(new lgp(new w9u(14), new w9u(15), 0), new lgp(new w9u(16), new w9u(17), 0), new lgp(new w9u(18), new w9u(19), 0)), new he7(1, new jiu(27)), null);
                                int i17 = zc6.S;
                                this.adapter = new zhp(scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, zxsVar5, zxsVar6, zxsVar7, zxsVar8, zxsVar9, new zxs(qoi0.a(n2x.class).a(), 0, new lhj(19), emptyList, new he7(1, new lhj(20)), null)));
                                this.favoritesList = recyclerView;
                                return;
                            }
                        }
                        favoritesView = this;
                        ny61.t(str.concat(favoritesView.getResources().getResourceName(i2)));
                        throw null;
                    }
                } else {
                    i3 = i4;
                }
            }
            ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i3)));
            throw null;
        }
        favoritesView = this;
        str = "Missing required view with ID: ";
        ny61.t(str.concat(favoritesView.getResources().getResourceName(i2)));
        throw null;
    }

    private final void updateItems(List<? extends w2x> models) {
        this.adapter.submitList(models, null);
    }

    public final ViewGroup asViewGroup() {
        return this;
    }

    public final void clearAdapter() {
        this.favoritesList.setAdapter(null);
    }

    public final ru.yandex.taxi.widget.utils.e getMediaInfoConverter() {
        return this.mediaInfoConverter;
    }

    public final bts0 getSlotItemViewFactory() {
        return this.slotItemViewFactory;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.favoritesList.setAdapter(this.adapter);
        pgr0 pgr0Var = new pgr0(this.binding.f, this.favoritesList);
        this.shadowListener = pgr0Var;
        this.favoritesList.addOnScrollListener(pgr0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        pgr0 pgr0Var = this.shadowListener;
        if (pgr0Var != null) {
            this.favoritesList.removeOnScrollListener(pgr0Var);
        }
        super.onDetachedFromWindow();
    }

    public final void setupClickActions(Runnable onBackClicked, Runnable onReloadClicked) {
        this.binding.e.setOnNavigationClickListener(onBackClicked);
        ((ButtonComponent) this.binding.b.b).setOnClickListener(onReloadClicked);
    }

    public final void showTooltipTitle() {
        this.binding.e.setTitle(getContext().getString(kyh0.favorites_list_header));
        this.binding.e.setTitleAlignment(1);
    }

    public final void updateState(rjp state) {
        if (state instanceof pjp) {
            this.binding.c.setVisibility(0);
            ((LinearLayout) this.binding.b.d).setVisibility(8);
            ((LinearLayout) this.binding.d.d).setVisibility(8);
            updateItems(((pjp) state).a);
            return;
        }
        if (state instanceof qjp) {
            this.binding.c.setVisibility(8);
            ((LinearLayout) this.binding.b.d).setVisibility(8);
            ((LinearLayout) this.binding.d.d).setVisibility(0);
        } else {
            if (!(state instanceof ojp)) {
                w511.b();
                return;
            }
            this.binding.c.setVisibility(8);
            ((LinearLayout) this.binding.b.d).setVisibility(0);
            ((LinearLayout) this.binding.d.d).setVisibility(8);
        }
    }

    public FavoritesView(Context context, AttributeSet attributeSet, o1c o1cVar, ru.yandex.taxi.widget.utils.e eVar, bts0 bts0Var) {
        this(context, attributeSet, 0, o1cVar, eVar, bts0Var, 4, null);
    }

    public FavoritesView(Context context, o1c o1cVar, ru.yandex.taxi.widget.utils.e eVar, bts0 bts0Var) {
        this(context, null, 0, o1cVar, eVar, bts0Var, 6, null);
    }

    public /* synthetic */ FavoritesView(Context context, AttributeSet attributeSet, int i, o1c o1cVar, ru.yandex.taxi.widget.utils.e eVar, bts0 bts0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, o1cVar, eVar, bts0Var);
    }
}
