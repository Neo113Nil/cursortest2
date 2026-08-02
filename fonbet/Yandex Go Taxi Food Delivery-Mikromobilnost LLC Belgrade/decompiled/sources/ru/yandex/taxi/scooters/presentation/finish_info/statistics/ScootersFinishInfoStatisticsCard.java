package ru.yandex.taxi.scooters.presentation.finish_info.statistics;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.apm0;
import defpackage.bvu0;
import defpackage.bys;
import defpackage.ca1;
import defpackage.ci91;
import defpackage.cma1;
import defpackage.ehn0;
import defpackage.evu0;
import defpackage.g0c;
import defpackage.he7;
import defpackage.l8p0;
import defpackage.lj1;
import defpackage.mnn0;
import defpackage.mrg0;
import defpackage.nnn0;
import defpackage.ny61;
import defpackage.onn0;
import defpackage.pfh0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.qrh0;
import defpackage.qw8;
import defpackage.tje;
import defpackage.x8t0;
import defpackage.xng0;
import defpackage.zxs;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.utils.e;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/scooters/presentation/finish_info/statistics/ScootersFinishInfoStatisticsCard;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lonn0;", "uiState", "Lzy11;", "bindHeader", "(Lonn0;)V", "bindStatisticsItems", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "bindMapImage", "(Lonn0;Lru/yandex/taxi/widget/utils/e;)V", "render", "Lmnn0;", "binding", "Lmnn0;", "statisticsItemWidthPx", CA20Status.STATUS_USER_I, "Lbys;", "Lnnn0;", "statisticsItemsAdapter", "Lbys;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersFinishInfoStatisticsCard extends GoLinearLayout {
    public static final int $stable = 8;
    private final mnn0 binding;
    private int statisticsItemWidthPx;
    private final bys statisticsItemsAdapter;

    public ScootersFinishInfoStatisticsCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(qrh0.scooters_finish_info_statistics_card, this);
        int i3 = pfh0.header_list_item_component;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, this);
        if (listItemComponent != null) {
            i3 = pfh0.map_image_view;
            GoImageView goImageView = (GoImageView) cma1.O(i3, this);
            if (goImageView != null) {
                i3 = pfh0.map_shimmering_bar;
                ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i3, this);
                if (shimmeringBar != null) {
                    i3 = pfh0.statistics_items_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i3, this);
                    if (recyclerView != null) {
                        this.binding = new mnn0(this, listItemComponent, goImageView, shimmeringBar, recyclerView);
                        final ehn0 ehn0Var = new ehn0(5, this);
                        c.D(recyclerView.getLayoutParams().width, tje.u(50, recyclerView.getContext()), recyclerView);
                        recyclerView.setImportantForAccessibility(2);
                        final Context context2 = recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(context2) { // from class: ru.yandex.taxi.scooters.presentation.finish_info.common.ScootersFinishInfoStatisticsItemsKt$setupStatisticsItemsRecyclerView$1
                            @Override // androidx.recyclerview.widget.RecyclerView.e
                            public final boolean K(RecyclerView.LayoutParams layoutParams) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).width = ((Number) ehn0.this.invoke()).intValue();
                                return true;
                            }
                        });
                        recyclerView.addItemDecoration(new l8p0(qje.t(xng0.line, recyclerView.getContext()), tje.v(recyclerView.getContext(), 0.5f), tje.u(16, recyclerView.getContext())));
                        Context context3 = recyclerView.getContext();
                        int i4 = ca1.g0;
                        g0c a = qoi0.a(nnn0.class);
                        lj1 lj1Var = new lj1(context3, 29);
                        x8t0 x8t0Var = new x8t0(8);
                        qw8 qw8Var = new qw8(Collections.singletonList(new zxs(a.a(), 0, lj1Var, EmptyList.a, new he7(1, x8t0Var), null)), 6);
                        recyclerView.setAdapter(qw8Var);
                        this.statisticsItemsAdapter = qw8Var;
                        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        setOrientation(1);
                        goImageView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(12, getContext())));
                        goImageView.setClipToOutline(true);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final void bindHeader(onn0 uiState) {
        ListItemComponent listItemComponent = this.binding.b;
        if (uiState.c.length() > 0) {
            listItemComponent.setSubtitle(uiState.c);
        } else {
            listItemComponent.setSubtitle((CharSequence) null);
        }
        new apm0(listItemComponent).Ug(listItemComponent.getContext(), uiState.b, uiState.a);
    }

    private final void bindMapImage(onn0 uiState, e mediaInfoConverter) {
        List W;
        Pair pair;
        String str = uiState.d;
        Integer valueOf = Integer.valueOf(SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND);
        String queryParameter = Uri.parse(str).getQueryParameter("size");
        if (queryParameter == null) {
            queryParameter = "";
        }
        W = evu0.W(queryParameter, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        if (W.size() != 2) {
            pair = new Pair(1500, valueOf);
        } else {
            Integer l = bvu0.l(10, (String) W.get(0));
            Integer l2 = bvu0.l(10, (String) W.get(1));
            pair = (l == null || l2 == null) ? new Pair(1500, valueOf) : new Pair(l, l2);
        }
        int width = ((getWidth() - (tje.r(mrg0.go_design_m_space, getContext()) * 2)) * ((Number) pair.getSecond()).intValue()) / ((Number) pair.getFirst()).intValue();
        ShimmeringBar shimmeringBar = this.binding.d;
        c.D(shimmeringBar.getLayoutParams().width, width, shimmeringBar);
        tje.N(ci91.c(this), null, null, new ScootersFinishInfoStatisticsCard$bindMapImage$1(mediaInfoConverter, uiState, this, width, null), 3);
    }

    private final void bindStatisticsItems(onn0 uiState) {
        List list = uiState.e;
        boolean isEmpty = list.isEmpty();
        mnn0 mnn0Var = this.binding;
        if (isEmpty) {
            mnn0Var.e.setVisibility(8);
            return;
        }
        mnn0Var.e.setVisibility(0);
        this.statisticsItemWidthPx = getWidth() / list.size();
        this.statisticsItemsAdapter.submitList(list, null);
    }

    public final void render(onn0 uiState, e mediaInfoConverter) {
        bindHeader(uiState);
        bindStatisticsItems(uiState);
        bindMapImage(uiState, mediaInfoConverter);
    }

    public ScootersFinishInfoStatisticsCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersFinishInfoStatisticsCard(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersFinishInfoStatisticsCard(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersFinishInfoStatisticsCard(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
