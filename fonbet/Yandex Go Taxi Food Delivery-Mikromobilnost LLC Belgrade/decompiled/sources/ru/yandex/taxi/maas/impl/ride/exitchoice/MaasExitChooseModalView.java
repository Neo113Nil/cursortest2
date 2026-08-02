package ru.yandex.taxi.maas.impl.ride.exitchoice;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a100;
import defpackage.a3v;
import defpackage.c100;
import defpackage.e100;
import defpackage.f100;
import defpackage.ieh0;
import defpackage.j7u0;
import defpackage.jl40;
import defpackage.khb1;
import defpackage.lmo;
import defpackage.mqg0;
import defpackage.nqh0;
import defpackage.ny61;
import defpackage.o6;
import defpackage.ptw;
import defpackage.qdb1;
import defpackage.r1s;
import defpackage.rp31;
import defpackage.sgu0;
import defpackage.srg0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ugu0;
import defpackage.x000;
import defpackage.xw31;
import defpackage.yn40;
import defpackage.zn40;
import defpackage.zxf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseExitCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseExitCardAnalytics$TransportTypeV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$CloseReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$TransportTypeV2;
import ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView;
import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickModalView;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003EFGBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0016H\u0014¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\u0016H\u0014¢\u0006\u0004\b%\u0010\u0018J\u0017\u0010(\u001a\u00020 2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001cH\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0018\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010+¨\u0006H"}, d2 = {"Lru/yandex/taxi/maas/impl/ride/exitchoice/MaasExitChooseModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lsgu0;", "stopPointProvider", "La3v;", "focusCoordinator", "", "titleText", "doneButtonText", "Lj7u0;", "station", "Lru/yandex/taxi/maas/impl/ride/exitchoice/MaasExitChooseModalView$a;", "listener", "Lf100;", "presenter", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;", "Lru/yandex/taxi/maas/api/analytics/OpenReason;", "openReason", "<init>", "(Landroid/content/Context;Lsgu0;La3v;Ljava/lang/String;Ljava/lang/String;Lj7u0;Lru/yandex/taxi/maas/impl/ride/exitchoice/MaasExitChooseModalView$a;Lf100;Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;)V", "Lzy11;", "updateDoneFramePosition", "()V", "updateFocusRect", "onSlideOut", "onAttachedToWindow", "", "contentTop", "onModalViewAppear", "(I)V", "", "settle", "updateAnchoredHeight", "(Z)V", "onModalViewDisappear", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "La3v;", "Ljava/lang/String;", "Lj7u0;", "Lru/yandex/taxi/maas/impl/ride/exitchoice/MaasExitChooseModalView$a;", "Lf100;", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Landroidx/recyclerview/widget/RecyclerView;", "items", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/design/ButtonComponent;", "done", "Lru/yandex/taxi/design/ButtonComponent;", "Landroid/widget/ImageView;", "scrollIndicator", "Landroid/widget/ImageView;", "Lx000;", "adapter", "Lx000;", "maxHeightPx", CA20Status.STATUS_USER_I, "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "ru/yandex/taxi/maas/impl/ride/exitchoice/c", "a", "ru/yandex/taxi/maas/impl/ride/exitchoice/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MaasExitChooseModalView extends SlideableModalView {
    private final x000 adapter;
    private final ButtonComponent done;
    private final String doneButtonText;
    private final a3v focusCoordinator;
    private final RecyclerView items;
    private final a listener;
    private final int maxHeightPx;
    private final MultiTransportChooseStationCardAnalytics$OpenReasonV2 openReason;
    private final f100 presenter;
    private final ImageView scrollIndicator;
    private final j7u0 station;
    private final ListTitleComponent title;
    private final String titleText;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/maas/impl/ride/exitchoice/MaasExitChooseModalView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void onBackClick();

        void q0();

        void s(lmo lmoVar);
    }

    public MaasExitChooseModalView(Context context, sgu0 sgu0Var, a3v a3vVar, String str, String str2, j7u0 j7u0Var, a aVar, f100 f100Var, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2) {
        super(context, 6);
        this.focusCoordinator = a3vVar;
        this.titleText = str;
        this.doneButtonText = str2;
        this.station = j7u0Var;
        this.listener = aVar;
        this.presenter = f100Var;
        this.openReason = multiTransportChooseStationCardAnalytics$OpenReasonV2;
        int i = ieh0.title;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.title = (ListTitleComponent) ((View) rp31.d(this, i));
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, ieh0.items));
        this.items = recyclerView;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, ieh0.done));
        this.done = buttonComponent;
        this.scrollIndicator = (ImageView) ((View) rp31.d(this, ieh0.items_shadow));
        x000 x000Var = new x000(((ugu0) sgu0Var).a(-1), new ptw(27, this));
        this.adapter = x000Var;
        this.maxHeightPx = tje.r(srg0.items_max_height, getContext());
        final int i2 = 0;
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        getBottomSheetBehavior().a0 = false;
        setOnBackPressedListener(new Runnable(this) { // from class: b100
            public final /* synthetic */ MaasExitChooseModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                MaasExitChooseModalView maasExitChooseModalView = this.b;
                switch (i3) {
                    case 0:
                        MaasExitChooseModalView._init_$lambda$0(maasExitChooseModalView);
                        break;
                    case 1:
                        MaasExitChooseModalView._init_$lambda$1(maasExitChooseModalView);
                        break;
                    default:
                        MaasExitChooseModalView._init_$lambda$2(maasExitChooseModalView);
                        break;
                }
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(x000Var);
        final int i3 = 1;
        recyclerView.setHasFixedSize(true);
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: b100
            public final /* synthetic */ MaasExitChooseModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                MaasExitChooseModalView maasExitChooseModalView = this.b;
                switch (i32) {
                    case 0:
                        MaasExitChooseModalView._init_$lambda$0(maasExitChooseModalView);
                        break;
                    case 1:
                        MaasExitChooseModalView._init_$lambda$1(maasExitChooseModalView);
                        break;
                    default:
                        MaasExitChooseModalView._init_$lambda$2(maasExitChooseModalView);
                        break;
                }
            }
        });
        final int i4 = 2;
        qdb1.b(this, new Runnable(this) { // from class: b100
            public final /* synthetic */ MaasExitChooseModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                MaasExitChooseModalView maasExitChooseModalView = this.b;
                switch (i32) {
                    case 0:
                        MaasExitChooseModalView._init_$lambda$0(maasExitChooseModalView);
                        break;
                    case 1:
                        MaasExitChooseModalView._init_$lambda$1(maasExitChooseModalView);
                        break;
                    default:
                        MaasExitChooseModalView._init_$lambda$2(maasExitChooseModalView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MaasExitChooseModalView maasExitChooseModalView) {
        f100 f100Var = maasExitChooseModalView.presenter;
        f100Var.x.e(MultiTransportChooseStationCardAnalytics$CloseReasonV2.AndroidBackButton);
        ((c100) f100Var.Dg()).close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(MaasExitChooseModalView maasExitChooseModalView) {
        f100 f100Var = maasExitChooseModalView.presenter;
        e100 e100Var = f100Var.x;
        zn40 zn40Var = (zn40) ((r1s) e100Var.b).b;
        f100 f100Var2 = (f100) e100Var.w;
        MultiTransportChooseExitCardAnalytics$OpenReasonV2 g = khb1.g(((c100) f100Var2.Dg()).j());
        MultiTransportChooseExitCardAnalytics$TransportTypeV2 h = khb1.h((MultiTransportChooseStationCardAnalytics$TransportTypeV2) e100Var.c);
        List pe = ((c100) f100Var2.Dg()).pe();
        ArrayList arrayList = new ArrayList(tcc.n(pe, 10));
        Iterator it = pe.iterator();
        while (it.hasNext()) {
            arrayList.add(khb1.e((lmo) it.next()));
        }
        lmo lmoVar = f100Var2.y;
        if (lmoVar == null) {
            ny61.r("Cannot send analytics before select exit!");
            return;
        }
        yn40 e = khb1.e(lmoVar);
        zn40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", g.getEventValue());
        hashMap.put("type", h.getEventValue());
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((yn40) it2.next()).c);
        }
        hashMap.put("available_points", arrayList2);
        hashMap.put("selected_station", e.c);
        zn40Var.a.a("MultiTransportChooseExitCard.Tapped", hashMap, 2, new HashMap());
        e100Var.e(MultiTransportChooseStationCardAnalytics$CloseReasonV2.Button);
        ((c100) f100Var.Dg()).Sf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MaasExitChooseModalView maasExitChooseModalView) {
        f100 f100Var = maasExitChooseModalView.presenter;
        f100Var.x.e(MultiTransportChooseStationCardAnalytics$CloseReasonV2.BackButton);
        ((c100) f100Var.Dg()).close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(MaasExitChooseModalView maasExitChooseModalView, lmo lmoVar) {
        f100 f100Var = maasExitChooseModalView.presenter;
        lmo lmoVar2 = f100Var.y;
        f100Var.y = lmoVar;
        e100 e100Var = f100Var.x;
        if (lmoVar2 != null) {
            zn40 zn40Var = (zn40) ((r1s) e100Var.b).b;
            yn40 e = khb1.e(lmoVar2);
            yn40 e2 = khb1.e(lmoVar);
            zn40Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("from", e.c);
            hashMap.put("to", e2.c);
            zn40Var.a.a("MultiTransportChooseExitCard.Changed", hashMap, 2, new HashMap());
        } else {
            r1s r1sVar = (r1s) e100Var.b;
            f100 f100Var2 = (f100) e100Var.w;
            zn40 zn40Var2 = (zn40) r1sVar.b;
            MultiTransportChooseExitCardAnalytics$OpenReasonV2 g = khb1.g(((c100) f100Var2.Dg()).j());
            MultiTransportChooseExitCardAnalytics$TransportTypeV2 h = khb1.h((MultiTransportChooseStationCardAnalytics$TransportTypeV2) e100Var.c);
            List pe = ((c100) f100Var2.Dg()).pe();
            ArrayList arrayList = new ArrayList(tcc.n(pe, 10));
            Iterator it = pe.iterator();
            while (it.hasNext()) {
                arrayList.add(khb1.e((lmo) it.next()));
            }
            lmo lmoVar3 = f100Var2.y;
            if (lmoVar3 == null) {
                ny61.r("Cannot send analytics before select exit!");
                return null;
            }
            yn40 e3 = khb1.e(lmoVar3);
            zn40Var2.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("open_reason", g.getEventValue());
            hashMap2.put("type", h.getEventValue());
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((yn40) it2.next()).c);
            }
            hashMap2.put("available_points", arrayList2);
            hashMap2.put("selected_station", e3.c);
            zn40Var2.a.a("MultiTransportChooseExitCard.Shown", hashMap2, 2, new HashMap());
        }
        ((c100) f100Var.Dg()).s(lmoVar);
        maasExitChooseModalView.done.setEnabled(true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(MaasExitChooseModalView maasExitChooseModalView) {
        if (maasExitChooseModalView.maxHeightPx < maasExitChooseModalView.items.getHeight()) {
            maasExitChooseModalView.items.getLayoutParams().height = maasExitChooseModalView.maxHeightPx;
            maasExitChooseModalView.items.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDoneFramePosition() {
        this.scrollIndicator.setVisibility(this.items.canScrollVertically(1) ? 0 : 8);
    }

    private final void updateFocusRect() {
        this.focusCoordinator.Td(Math.min(getMaxAnchoredHeight(), getContentHeight()), MaasMetroPickModalView.class);
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

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setArrowState(ArrowsView.State.GONE);
        this.presenter.Bg(new c(this, this.openReason, this.station.a));
        this.items.getViewTreeObserver().addOnDrawListener(new a100(this, 1));
        this.items.getViewTreeObserver().addOnGlobalLayoutListener(new o6(8, this));
        this.title.setTitle(this.titleText);
        this.done.setText(this.doneButtonText);
        x000 x000Var = this.adapter;
        x000Var.c = this.station.a;
        x000Var.f(x000Var.w);
        x000Var.notifyDataSetChanged();
        x000 x000Var2 = this.adapter;
        lmo lmoVar = (lmo) kotlin.collections.a.R(this.station.a);
        if (jl40.l(x000Var2.w, lmoVar)) {
            return;
        }
        x000Var2.w = lmoVar;
        x000Var2.f(lmoVar);
        if (lmoVar != null) {
            x000Var2.b.invoke(lmoVar);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.items.getViewTreeObserver().removeOnDrawListener(new a100(this, 0));
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
        f100 f100Var = this.presenter;
        f100Var.x.e(MultiTransportChooseStationCardAnalytics$CloseReasonV2.RollOff);
        ((c100) f100Var.Dg()).close();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateAnchoredHeight(boolean settle) {
        super.updateAnchoredHeight(settle);
        updateFocusRect();
    }
}
