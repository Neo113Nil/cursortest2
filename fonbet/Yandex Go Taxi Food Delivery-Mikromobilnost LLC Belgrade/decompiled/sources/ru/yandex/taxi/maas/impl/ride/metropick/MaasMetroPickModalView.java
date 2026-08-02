package ru.yandex.taxi.maas.impl.ride.metropick;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.ao40;
import defpackage.bo40;
import defpackage.i100;
import defpackage.i3y;
import defpackage.ieh0;
import defpackage.j100;
import defpackage.j7u0;
import defpackage.k100;
import defpackage.k7x0;
import defpackage.khb1;
import defpackage.l100;
import defpackage.mqg0;
import defpackage.n100;
import defpackage.n5;
import defpackage.nqh0;
import defpackage.ny61;
import defpackage.o100;
import defpackage.o6;
import defpackage.pav;
import defpackage.ptw;
import defpackage.pzt0;
import defpackage.qdb1;
import defpackage.qk50;
import defpackage.r1s;
import defpackage.rp31;
import defpackage.srg0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.wjm;
import defpackage.wtg0;
import defpackage.xyz;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$CloseReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$TransportTypeV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportErrorAnalytics$ErrorButton;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\\\r]BU\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\f\b\u0001\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0014¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u0019H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0015H\u0002¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010*\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R\u0014\u00100\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010N\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010 R\u0014\u0010R\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010$R\u0018\u00103\u001a\u000202*\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0018\u0010X\u001a\u00020U*\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0018\u0010[\u001a\u000208*\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006^"}, d2 = {"Lru/yandex/taxi/maas/impl/ride/metropick/MaasMetroPickModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lk7x0;", "tagUrlFormatter", "Lpav;", "imageLoader", "Lzzs;", "pinPoint", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;", "Lru/yandex/taxi/maas/api/analytics/OpenReason;", "openReason", "Lk100;", "listener", "Lru/yandex/taxi/maas/impl/ride/metropick/a;", "presenter", "La3v;", "focusCoordinator", "<init>", "(Landroid/content/Context;Lk7x0;Lpav;Lzzs;Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;Lk100;Lru/yandex/taxi/maas/impl/ride/metropick/a;La3v;)V", "Lzy11;", "onSlideOut", "()V", "onAttachedToWindow", "", "contentTop", "onModalViewAppear", "(I)V", "", "settle", "updateAnchoredHeight", "(Z)V", "onModalViewDisappear", "onDetachedFromWindow", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/View;", "view", "changeView", "(Landroid/view/View;)V", "updateDoneFramePosition", "updateFocusRect", "Lzzs;", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;", "Lk100;", "Lru/yandex/taxi/maas/impl/ride/metropick/a;", "La3v;", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Landroidx/recyclerview/widget/RecyclerView;", "items", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/design/ButtonComponent;", "done", "Lru/yandex/taxi/design/ButtonComponent;", "Landroid/widget/ImageView;", "scrollIndicator", "Landroid/widget/ImageView;", "errorView$delegate", "Li3y;", "getErrorView", "()Landroid/view/View;", "errorView", "Landroid/widget/FrameLayout;", "loadingView$delegate", "getLoadingView", "()Landroid/widget/FrameLayout;", "loadingView", "Lqk50;", "adapter", "Lqk50;", "maxHeightPx", CA20Status.STATUS_USER_I, "value", "isDoneEnabled", "()Z", "setDoneEnabled", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "getTitle", "(Landroid/view/View;)Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "getSubtitle", "(Landroid/view/View;)Lru/yandex/taxi/design/ListTextComponent;", "subtitle", "getTryAgain", "(Landroid/view/View;)Lru/yandex/taxi/design/ButtonComponent;", "tryAgain", "l100", "m100", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MaasMetroPickModalView extends SlideableModalView {
    private final qk50 adapter;
    private final View content;
    private final ButtonComponent done;

    /* renamed from: errorView$delegate, reason: from kotlin metadata */
    private final i3y errorView;
    private final a3v focusCoordinator;
    private final RecyclerView items;
    private final k100 listener;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final i3y loadingView;
    private final int maxHeightPx;
    private final MultiTransportChooseStationCardAnalytics$OpenReasonV2 openReason;
    private final zzs pinPoint;
    private final a presenter;
    private final ImageView scrollIndicator;
    private final ListTitleComponent title;

    public MaasMetroPickModalView(Context context, k7x0 k7x0Var, pav pavVar, zzs zzsVar, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2, k100 k100Var, a aVar, a3v a3vVar) {
        super(context, 6);
        this.pinPoint = zzsVar;
        this.openReason = multiTransportChooseStationCardAnalytics$OpenReasonV2;
        this.listener = k100Var;
        this.presenter = aVar;
        this.focusCoordinator = a3vVar;
        View childAt = getCardContentContainer().getChildAt(0);
        if (childAt == null) {
            ny61.r("Content is not specified!");
            throw null;
        }
        this.content = childAt;
        int i = ieh0.title;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.title = (ListTitleComponent) ((View) rp31.d(this, i));
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, ieh0.items));
        this.items = recyclerView;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, ieh0.done));
        this.done = buttonComponent;
        this.scrollIndicator = (ImageView) ((View) rp31.d(this, ieh0.items_shadow));
        this.errorView = kotlin.a.a(new xyz(1, this));
        this.loadingView = kotlin.a.a(new n5(context, 24));
        qk50 qk50Var = new qk50(k7x0Var, pavVar, new ptw(29, this));
        this.adapter = qk50Var;
        this.maxHeightPx = tje.r(srg0.items_max_height, getContext());
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setOnBackPressedListener(new i100(this, 2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(qk50Var);
        recyclerView.setHasFixedSize(true);
        buttonComponent.setDebounceClickListener(new i100(this, 3));
        qdb1.b(this, new i100(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MaasMetroPickModalView maasMetroPickModalView) {
        maasMetroPickModalView.presenter.Lg(MultiTransportChooseStationCardAnalytics$CloseReasonV2.AndroidBackButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(MaasMetroPickModalView maasMetroPickModalView) {
        a aVar = maasMetroPickModalView.presenter;
        wjm wjmVar = aVar.G;
        bo40 bo40Var = (bo40) ((r1s) wjmVar.b).c;
        a aVar2 = (a) wjmVar.x;
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 j = ((n100) aVar2.Dg()).j();
        MultiTransportChooseStationCardAnalytics$TransportTypeV2 multiTransportChooseStationCardAnalytics$TransportTypeV2 = (MultiTransportChooseStationCardAnalytics$TransportTypeV2) wjmVar.w;
        List list = aVar2.J.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(khb1.f((j7u0) it.next()));
        }
        j7u0 j7u0Var = (j7u0) wjmVar.c;
        ao40 ao40Var = j7u0Var != null ? new ao40(j7u0Var.c, j7u0Var.b) : null;
        bo40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", j.getEventValue());
        hashMap.put("type", multiTransportChooseStationCardAnalytics$TransportTypeV2.getEventValue());
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ao40) it2.next()).c);
        }
        hashMap.put("available_stations", arrayList2);
        if (ao40Var != null) {
            hashMap.put("selected_station", ao40Var.c);
        }
        bo40Var.a.a("MultiTransportChooseStationCard.Tapped", hashMap, 2, new HashMap());
        wjmVar.t(MultiTransportChooseStationCardAnalytics$CloseReasonV2.Button);
        ((n100) aVar.Dg()).bd(aVar.K, aVar.J.c);
        pzt0 pzt0Var = aVar.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MaasMetroPickModalView maasMetroPickModalView) {
        maasMetroPickModalView.presenter.Lg(MultiTransportChooseStationCardAnalytics$CloseReasonV2.BackButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(MaasMetroPickModalView maasMetroPickModalView, j7u0 j7u0Var) {
        a aVar = maasMetroPickModalView.presenter;
        aVar.K = j7u0Var;
        wjm wjmVar = aVar.G;
        if (j7u0Var != null) {
            j7u0 j7u0Var2 = (j7u0) wjmVar.c;
            bo40 bo40Var = (bo40) ((r1s) wjmVar.b).c;
            ao40 ao40Var = j7u0Var2 != null ? new ao40(j7u0Var2.c, j7u0Var2.b) : null;
            String str = j7u0Var.c;
            String str2 = j7u0Var.b;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("station_name", str);
            mapBuilder.put("time_to_station", str2);
            mapBuilder.put("is_available", Boolean.TRUE);
            MapBuilder j = mapBuilder.j();
            bo40Var.getClass();
            HashMap hashMap = new HashMap();
            if (ao40Var != null) {
                hashMap.put("from", ao40Var.c);
            }
            hashMap.put("to", j);
            bo40Var.a.a("MultiTransportChooseStationCard.Changed", hashMap, 2, new HashMap());
        }
        wjmVar.c = j7u0Var;
        pzt0 pzt0Var = aVar.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.L = tje.N(aVar.Jg(), null, null, new MaasMetroPickPresenter$onStationSelected$1(aVar, j7u0Var, null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeView(View view) {
        getCardContentContainer().removeAllViews();
        getCardContentContainer().addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View errorView_delegate$lambda$0(MaasMetroPickModalView maasMetroPickModalView) {
        View q = ru.yandex.taxi.design.utils.c.q(maasMetroPickModalView.getCardContentContainer(), nqh0.view_maas_error, false);
        maasMetroPickModalView.getTryAgain(q).setDebounceClickListener(new i100(maasMetroPickModalView, 0));
        ((ButtonComponent) q.findViewById(ieh0.close)).setDebounceClickListener(new i100(maasMetroPickModalView, 1));
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void errorView_delegate$lambda$0$0$0(MaasMetroPickModalView maasMetroPickModalView) {
        a aVar = maasMetroPickModalView.presenter;
        aVar.H.r(MultiTransportErrorAnalytics$ErrorButton.TryAgain, ((o100) aVar.I).a);
        aVar.Mg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void errorView_delegate$lambda$0$0$1(MaasMetroPickModalView maasMetroPickModalView) {
        maasMetroPickModalView.presenter.Lg(MultiTransportChooseStationCardAnalytics$CloseReasonV2.CloseButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getErrorView() {
        return (View) this.errorView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getLoadingView() {
        return (FrameLayout) this.loadingView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListTextComponent getSubtitle(View view) {
        return (ListTextComponent) view.findViewById(ieh0.subtitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListTitleComponent getTitle(View view) {
        return (ListTitleComponent) view.findViewById(ieh0.title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonComponent getTryAgain(View view) {
        return (ButtonComponent) view.findViewById(ieh0.try_again);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout loadingView_delegate$lambda$0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, tje.r(srg0.maas_modal_secondary_view_height, frameLayout.getContext())));
        CircularProgressBar circularProgressBar = new CircularProgressBar(context, null, 0, 6, null);
        circularProgressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(circularProgressBar);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(MaasMetroPickModalView maasMetroPickModalView) {
        if (maasMetroPickModalView.maxHeightPx < maasMetroPickModalView.items.getHeight()) {
            maasMetroPickModalView.items.getLayoutParams().height = maasMetroPickModalView.maxHeightPx;
            maasMetroPickModalView.items.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDoneFramePosition() {
        this.scrollIndicator.setVisibility(this.items.canScrollVertically(1) ? 0 : 8);
    }

    private final void updateFocusRect() {
        this.focusCoordinator.q3(MaasMetroPickModalView.class, 0, tje.r(wtg0.pin_width, getContext()), 0, Math.min(getMaxAnchoredHeight(), getContentHeight()));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return nqh0.view_modal_maas;
    }

    public final boolean isDoneEnabled() {
        return this.done.isEnabled();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setArrowState(ArrowsView.State.GONE);
        a aVar = this.presenter;
        aVar.Bg(new l100(this, this.pinPoint, this.openReason));
        aVar.B.b();
        aVar.Mg();
        this.items.getViewTreeObserver().addOnDrawListener(new j100(this, 1));
        this.items.getViewTreeObserver().addOnGlobalLayoutListener(new o6(9, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.items.getViewTreeObserver().removeOnDrawListener(new j100(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        updateFocusRect();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.focusCoordinator.Lc(MaasMetroPickModalView.class, null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.presenter.Lg(MultiTransportChooseStationCardAnalytics$CloseReasonV2.RollOff);
    }

    public final void setDoneEnabled(boolean z) {
        this.done.setEnabled(z);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateAnchoredHeight(boolean settle) {
        super.updateAnchoredHeight(settle);
        updateFocusRect();
    }
}
