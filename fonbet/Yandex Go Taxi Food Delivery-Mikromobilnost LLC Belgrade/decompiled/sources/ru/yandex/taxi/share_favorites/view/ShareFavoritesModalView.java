package ru.yandex.taxi.share_favorites.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import defpackage.aub;
import defpackage.bvv;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.epo0;
import defpackage.f28;
import defpackage.g8e;
import defpackage.ie0;
import defpackage.jqr0;
import defpackage.kp50;
import defpackage.ljr0;
import defpackage.m950;
import defpackage.mmp0;
import defpackage.njr0;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.og20;
import defpackage.osg0;
import defpackage.pjr0;
import defpackage.pkr0;
import defpackage.q5z;
import defpackage.qdb1;
import defpackage.rfh0;
import defpackage.rjr0;
import defpackage.sjr0;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tje;
import defpackage.trh0;
import defpackage.w2x;
import defpackage.we0;
import defpackage.xw31;
import defpackage.ykn0;
import defpackage.yvf0;
import defpackage.ze0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.Events$ShareScreen$Screen;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.share_favorites.presenter.a;
import ru.yandex.taxi.share_favorites.view.ShareFavoritesModalView;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010#\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J%\u0010)\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\fH\u0014¢\u0006\u0004\b-\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/yandex/taxi/share_favorites/view/ShareFavoritesModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ljqr0;", "Lsjr0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/share_favorites/presenter/a;", "presenter", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/share_favorites/presenter/a;)V", "Lzzs;", "sharingPoint", "Lzy11;", "shareLinkAndCloseDialog", "(Lzzs;)V", "", "text", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "headerComponent", "Lkotlin/Function0;", "noTextCallback", "setupDivider", "(Ljava/lang/String;Lru/yandex/taxi/design/ListGroupHeaderComponent;Lsls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljqr0;", "title", "sendLocationTitle", "sendLocationSubtitle", "saveLocationTitle", "saveLocationSubtitle", "dividerAddToFavoritesText", "showFields", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lw2x;", "items", "dividerFavoritesText", "showFavorites", "(Ljava/util/List;Ljava/lang/String;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/share_favorites/presenter/a;", "getPresenter", "()Lru/yandex/taxi/share_favorites/presenter/a;", "Lnjr0;", "adapter", "Lnjr0;", "share_favorites"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareFavoritesModalView extends SlideableBindingModalView<jqr0> implements sjr0 {
    private njr0 adapter;
    private final a presenter;

    public ShareFavoritesModalView(Context context, a aVar) {
        super(context);
        this.presenter = aVar;
    }

    private final void setupDivider(String text, ListGroupHeaderComponent headerComponent, sls noTextCallback) {
        if (text.length() == 0) {
            headerComponent.setVisibility(8);
            noTextCallback.invoke();
        } else {
            headerComponent.setVisibility(0);
            headerComponent.setTitle(text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareLinkAndCloseDialog(zzs sharingPoint) {
        ljr0 ljr0Var = this.presenter.x;
        String str = ljr0Var.d;
        if (str.length() == 0) {
            str = "https://u9xb.adj.st/route?end-lat=$END_LAT$&end-lon=$END_LON$&&adj_t=ki0yjo2_ns9zpoe&ref=ki0yjo2_ns9zpoe";
        }
        q5z.c0(g8e.p(d6z.Y(ljr0Var, ljr0Var.f), " ", cvu0.v(cvu0.v(str, "$END_LAT$", a.Lg(sharingPoint.a), true), "$END_LON$", a.Lg(sharingPoint.b), true)), null, getContext(), 0);
        dismiss();
    }

    public static void shareLinkAndCloseDialog$default(ShareFavoritesModalView shareFavoritesModalView, zzs zzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            zzsVar = shareFavoritesModalView.presenter.y;
        }
        shareFavoritesModalView.shareLinkAndCloseDialog(zzsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showFavorites$lambda$0$0(jqr0 jqr0Var) {
        jqr0Var.g.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showFavorites$lambda$0$1(jqr0 jqr0Var) {
        jqr0Var.f.setDividers(DividerPosition.TOP, DividerType.MARGIN);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFavorites$lambda$0$2(ShareFavoritesModalView shareFavoritesModalView, jqr0 jqr0Var) {
        int r = tje.r(osg0.sharing_favorites_top_padding, shareFavoritesModalView.getContext());
        if (jqr0Var.b.getHeight() > shareFavoritesModalView.getRootView().getHeight() - r) {
            shareFavoritesModalView.getBottomSheetBehavior().K(r, true);
            xw31.I(shareFavoritesModalView.getBinding().b, null, null, null, Integer.valueOf(tje.r(osg0.sharing_favorites_bottom_padding, shareFavoritesModalView.getContext()) + r));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFields$lambda$0$0$0(ShareFavoritesModalView shareFavoritesModalView, View view) {
        o7r0 o7r0Var = shareFavoritesModalView.presenter.B.a;
        o7r0Var.getClass();
        o7r0Var.a.a("ShareScreen.ShareLocationTapped", new HashMap(), 1, new HashMap());
        shareLinkAndCloseDialog$default(shareFavoritesModalView, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFields$lambda$0$1$0(ShareFavoritesModalView shareFavoritesModalView, View view) {
        a aVar = shareFavoritesModalView.presenter;
        ykn0 ykn0Var = aVar.A;
        bvv bvvVar = new bvv(aVar.y, null, we0.b, null, null, true, null, HProv.PP_AUTH_INFO);
        f28 f28Var = (f28) ykn0Var.b;
        f28Var.A((m950) ((yvf0) f28Var.I).get(), new ie0(bvvVar, (ze0) f28Var.F), sy60.Q2);
        o7r0 o7r0Var = shareFavoritesModalView.presenter.B.a;
        o7r0Var.getClass();
        o7r0Var.a.a("ShareScreen.AddToFavoritesTapped", new HashMap(), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showFields$lambda$0$2(jqr0 jqr0Var) {
        jqr0Var.f.setDividers(DividerPosition.TOP, DividerType.MARGIN);
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public jqr0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        if (parent == null) {
            ny61.t("parent");
            return null;
        }
        inflater.inflate(trh0.sharing_favorites_modal_view, parent);
        int i = rfh0.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, parent);
        if (constraintLayout != null) {
            i = rfh0.favorites_container;
            if (((FrameLayout) cma1.O(i, parent)) != null) {
                i = rfh0.favorites_list;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, parent);
                if (recyclerView != null) {
                    i = rfh0.header_add_to_favorites;
                    ListGroupHeaderComponent listGroupHeaderComponent = (ListGroupHeaderComponent) cma1.O(i, parent);
                    if (listGroupHeaderComponent != null) {
                        i = rfh0.header_choose_favorites;
                        ListGroupHeaderComponent listGroupHeaderComponent2 = (ListGroupHeaderComponent) cma1.O(i, parent);
                        if (listGroupHeaderComponent2 != null) {
                            i = rfh0.item_add_to_favorites;
                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, parent);
                            if (listItemComponent != null) {
                                i = rfh0.item_send_location;
                                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, parent);
                                if (listItemComponent2 != null) {
                                    i = rfh0.tv_sharing_favorites_title;
                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, parent);
                                    if (robotoTextView != null) {
                                        return new jqr0(parent, constraintLayout, recyclerView, listGroupHeaderComponent, listGroupHeaderComponent2, listItemComponent, listItemComponent2, robotoTextView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(parent.getResources().getResourceName(i)));
        return null;
    }

    public final a getPresenter() {
        return this.presenter;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setArrowState(ArrowsView.State.GONE);
        qdb1.c(this, new mmp0(11, this));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        a aVar = this.presenter;
        pkr0 pkr0Var = aVar.B;
        Events$ShareScreen$Screen events$ShareScreen$Screen = aVar.z;
        o7r0 o7r0Var = pkr0Var.a;
        String screenName = events$ShareScreen$Screen.getScreenName();
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        if (screenName != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, screenName);
        }
        o7r0Var.a.a("ShareScreen.Shown", hashMap, 1, new HashMap());
        a aVar2 = this.presenter;
        aVar2.Bg(this);
        ljr0 ljr0Var = aVar2.x;
        showFields(d6z.Y(ljr0Var, ljr0Var.e), d6z.Y(ljr0Var, ljr0Var.g), d6z.Y(ljr0Var, ljr0Var.i), d6z.Y(ljr0Var, ljr0Var.h), d6z.Y(ljr0Var, ljr0Var.j), d6z.Y(ljr0Var, ljr0Var.k));
        njr0 njr0Var = new njr0();
        njr0Var.b = new rjr0(this);
        this.adapter = njr0Var;
        getBinding().c.setAdapter(this.adapter);
        this.presenter.Mg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o7r0 o7r0Var = this.presenter.B.a;
        o7r0Var.getClass();
        o7r0Var.a.a("ShareScreen.Dismissed", new HashMap(), 1, new HashMap());
        this.presenter.Cg();
    }

    @Override // defpackage.sjr0
    public void showFavorites(List<? extends w2x> items, String dividerFavoritesText) {
        jqr0 binding = getBinding();
        List<? extends w2x> list = items;
        int i = 1;
        if (list.isEmpty()) {
            setupDivider("", binding.d, new pjr0(binding, i));
            binding.c.setVisibility(8);
            binding.e.setVisibility(8);
        } else {
            setupDivider(dividerFavoritesText, binding.e, new pjr0(binding, 0));
            binding.c.setVisibility(0);
            njr0 njr0Var = this.adapter;
            if (njr0Var != null) {
                ArrayList arrayList = njr0Var.a;
                i f = kp50.f(new og20(arrayList, items, new aub(17)), true);
                arrayList.clear();
                arrayList.addAll(list);
                f.b(njr0Var);
            }
        }
        binding.c.post(new epo0(18, this, binding));
    }

    @Override // defpackage.sjr0
    public void showFields(String title, String sendLocationTitle, String sendLocationSubtitle, String saveLocationTitle, String saveLocationSubtitle, String dividerAddToFavoritesText) {
        jqr0 binding = getBinding();
        binding.h.setText(title);
        ListItemComponent listItemComponent = binding.g;
        listItemComponent.setTitle(sendLocationTitle);
        listItemComponent.setSubtitle(sendLocationSubtitle);
        final int i = 0;
        listItemComponent.setOnClickListener(new View.OnClickListener(this) { // from class: qjr0
            public final /* synthetic */ ShareFavoritesModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ShareFavoritesModalView shareFavoritesModalView = this.b;
                switch (i2) {
                    case 0:
                        ShareFavoritesModalView.showFields$lambda$0$0$0(shareFavoritesModalView, view);
                        break;
                    default:
                        ShareFavoritesModalView.showFields$lambda$0$1$0(shareFavoritesModalView, view);
                        break;
                }
            }
        });
        ListItemComponent listItemComponent2 = binding.f;
        listItemComponent2.setTitle(saveLocationTitle);
        listItemComponent2.setSubtitle(saveLocationSubtitle);
        final int i2 = 1;
        listItemComponent2.setOnClickListener(new View.OnClickListener(this) { // from class: qjr0
            public final /* synthetic */ ShareFavoritesModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                ShareFavoritesModalView shareFavoritesModalView = this.b;
                switch (i22) {
                    case 0:
                        ShareFavoritesModalView.showFields$lambda$0$0$0(shareFavoritesModalView, view);
                        break;
                    default:
                        ShareFavoritesModalView.showFields$lambda$0$1$0(shareFavoritesModalView, view);
                        break;
                }
            }
        });
        setupDivider(dividerAddToFavoritesText, binding.d, new pjr0(binding, 2));
    }
}
