package ru.yandex.taxi.view;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ae0;
import defpackage.aub;
import defpackage.bdc;
import defpackage.c230;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.co40;
import defpackage.czo0;
import defpackage.d4;
import defpackage.de0;
import defpackage.dip;
import defpackage.eip;
import defpackage.evu0;
import defpackage.ge0;
import defpackage.h60;
import defpackage.hbp0;
import defpackage.hc;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.mdh;
import defpackage.mqg0;
import defpackage.mrj;
import defpackage.ny61;
import defpackage.og20;
import defpackage.pzt0;
import defpackage.qd0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.sjh;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.ud0;
import defpackage.uw4;
import defpackage.uyj;
import defpackage.vch0;
import defpackage.x4e;
import defpackage.x770;
import defpackage.xd2;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xyg0;
import defpackage.ze0;
import defpackage.zoh0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.model.FavoritesCategoryModel$Category;
import ru.yandex.taxi.view.AddFavoritesModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B1\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0014¢\u0006\u0004\b,\u0010\u0016J\u000f\u0010-\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010\u0016J\u000f\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0019H\u0016¢\u0006\u0004\b2\u0010+J\u000f\u00103\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010\u0016J)\u00108\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000106H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\"\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lru/yandex/taxi/view/AddFavoritesModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lde0;", "Lae0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/view/c;", "presenter", "Lkotlin/Function1;", "Lcom/yandex/go/address/models/FavoriteAddress;", "Lzy11;", "dismissModalViewAction", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/view/c;Ltls;)V", "Lc230;", "insetsType", "()Lc230;", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "onAttachedToWindow", "()V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lde0;", "favorite", "dismissModalView", "(Lcom/yandex/go/address/models/FavoriteAddress;)V", "Lge0;", "addFavoritesModalViewState", "updateAddFavoritesModalViewState", "(Lge0;)V", "isShimmering", "setShimmeringSaveButton", "(Z)V", "onBackPressed", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "isEnabled", "changeButtonEnabled", "closeKeyboardListener", "Landroid/view/View;", "view", "Lkotlin/Function0;", "endAction", "showView", "(Landroid/view/View;Lsls;)V", "hideView", "(Landroid/view/View;)V", "Leip;", "favoriteCategoriesModel", "onCategorySelected", "(Leip;)V", "Lru/yandex/taxi/view/c;", "Ltls;", "Ldip;", "categoriesBubblesAdapter", "Ldip;", "blockUpdateView", "Z", "Lhbp0;", "main", "Lhbp0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddFavoritesModalView extends SlideableBindingModalView<de0> implements ae0 {
    private boolean blockUpdateView;
    private final dip categoriesBubblesAdapter;
    private final tls dismissModalViewAction;
    private final hbp0 main;
    private final c presenter;

    public AddFavoritesModalView(Context context, c cVar, tls tlsVar) {
        super(context);
        this.presenter = cVar;
        this.dismissModalViewAction = tlsVar;
        final int i = 1;
        dip dipVar = new dip(new AddFavoritesModalView$categoriesBubblesAdapter$1(1, this, AddFavoritesModalView.class, "onCategorySelected", "onCategorySelected(Lru/yandex/taxi/model/FavoritesCategoryModel;)V", 0));
        this.categoriesBubblesAdapter = dipVar;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        this.main = hbp0Var;
        final int i2 = 0;
        qdb1.b(this, new Runnable(this) { // from class: be0
            public final /* synthetic */ AddFavoritesModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                AddFavoritesModalView addFavoritesModalView = this.b;
                switch (i3) {
                    case 0:
                        addFavoritesModalView.onBackPressed();
                        break;
                    case 1:
                        addFavoritesModalView.dismissModalView(null);
                        break;
                    default:
                        addFavoritesModalView.closeKeyboardListener();
                        break;
                }
            }
        });
        setOnBackPressedListener(new Runnable(this) { // from class: be0
            public final /* synthetic */ AddFavoritesModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                AddFavoritesModalView addFavoritesModalView = this.b;
                switch (i3) {
                    case 0:
                        addFavoritesModalView.onBackPressed();
                        break;
                    case 1:
                        addFavoritesModalView.dismissModalView(null);
                        break;
                    default:
                        addFavoritesModalView.closeKeyboardListener();
                        break;
                }
            }
        });
        setDismissOnBackPressed(false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        AddressInputComponent addressInputComponent = getBinding().b;
        addressInputComponent.setLeadImage(xyg0.ic_lead_image_for_address_component);
        addressInputComponent.setBackground(null);
        addressInputComponent.setAddressHintColor(qje.t(xng0.textMain, addressInputComponent.getContext()));
        RecyclerView recyclerView = getBinding().c;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(dipVar);
        ListItemInputComponent listItemInputComponent = getBinding().f;
        final int i3 = 2;
        listItemInputComponent.setOnKeyboardCloseListener(new Runnable(this) { // from class: be0
            public final /* synthetic */ AddFavoritesModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                AddFavoritesModalView addFavoritesModalView = this.b;
                switch (i32) {
                    case 0:
                        addFavoritesModalView.onBackPressed();
                        break;
                    case 1:
                        addFavoritesModalView.dismissModalView(null);
                        break;
                    default:
                        addFavoritesModalView.closeKeyboardListener();
                        break;
                }
            }
        });
        listItemInputComponent.setShowUnderLine(false);
        listItemInputComponent.setAnimateDividerToHighlight(true);
        hbp0.e(hbp0Var, null, null, new AddFavoritesModalView$5$2(listItemInputComponent, this, null), 3);
        getBinding().g.setDebounceClickListener(new hc(4, this, listItemInputComponent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeKeyboardListener() {
        ListItemInputComponent listItemInputComponent = getBinding().f;
        listItemInputComponent.post(new ce0(listItemInputComponent, 15));
        getBinding().f.clearFocus();
        requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissModalView$lambda$0(AddFavoritesModalView addFavoritesModalView, FavoriteAddress favoriteAddress) {
        addFavoritesModalView.dismissModalViewAction.invoke(favoriteAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideView(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
            view.animate().alpha(0.0f).scaleY(0.0f).setListener(new AnimUtils$AnimationEndListener(new ce0(view, 0))).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$0(AddFavoritesModalView addFavoritesModalView, ListItemInputComponent listItemInputComponent) {
        Object obj;
        c cVar = addFavoritesModalView.presenter;
        Editable text = listItemInputComponent.getText();
        String obj2 = text != null ? text.toString() : null;
        String str = obj2 == null ? "" : obj2;
        ze0 ze0Var = cVar.C;
        mrj mrjVar = cVar.H;
        Address address = cVar.L;
        String uri = address != null ? address.getUri() : null;
        ((co40) mrjVar.c).a.a("TapSaveFromFavoritesOffer", x4e.p(LaunchBrowserActivity.KEY_URI, uri != null ? uri : ""), 1, new HashMap());
        Iterator it = ((ge0) cVar.J.getValue()).h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((eip) obj).d) {
                    break;
                }
            }
        }
        eip eipVar = (eip) obj;
        if (eipVar == null) {
            cVar.Lg(((uw4) ze0Var).e());
            return;
        }
        if (eipVar.a == FavoritesCategoryModel$Category.NEW && evu0.k0(str).toString().length() == 0) {
            cVar.Lg(((uw4) ze0Var).e());
            return;
        }
        Address address2 = cVar.L;
        if (address2 == null) {
            cVar.Lg(null);
            return;
        }
        ((ae0) cVar.Dg()).setShimmeringSaveButton(true);
        tse Jg = cVar.Jg();
        cVar.I.getClass();
        sjh sjhVar = uyj.a;
        tje.N(Jg, mdh.b, null, new AddFavoritesModalViewPresenter$clickSaveButton$1(cVar, str, eipVar, address2, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCategorySelected(eip favoriteCategoriesModel) {
        if (this.blockUpdateView) {
            return;
        }
        c cVar = this.presenter;
        tje.N(cVar.Jg(), null, null, new AddFavoritesModalViewPresenter$updateCategory$1(cVar, favoriteCategoriesModel, null), 3);
    }

    private final void showView(View view, sls endAction) {
        if (view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.setScaleY(0.0f);
        view.animate().alpha(1.0f).scaleY(1.0f).setListener(new AnimUtils$AnimationEndListener(new h60(1, endAction))).start();
    }

    public static /* synthetic */ void showView$default(AddFavoritesModalView addFavoritesModalView, View view, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = null;
        }
        addFavoritesModalView.showView(view, slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showView$lambda$0(sls slsVar) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateAddFavoritesModalViewState$lambda$0$0(de0 de0Var) {
        de0Var.f.requestFocus();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public de0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        if (parent == null) {
            ny61.t("parent");
            return null;
        }
        inflater.inflate(zoh0.add_favorites_modal_view, parent);
        int i = vch0.address_component;
        AddressInputComponent addressInputComponent = (AddressInputComponent) cma1.O(i, parent);
        if (addressInputComponent != null) {
            i = vch0.bubbles_container;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, parent);
            if (recyclerView != null) {
                i = vch0.error_message;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, parent);
                if (robotoTextView != null) {
                    i = vch0.favorite_container;
                    LinearLayout linearLayout = (LinearLayout) cma1.O(i, parent);
                    if (linearLayout != null) {
                        i = vch0.new_categories_edit;
                        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, parent);
                        if (listItemInputComponent != null) {
                            i = vch0.save_button;
                            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, parent);
                            if (buttonComponent != null) {
                                i = vch0.shimmer;
                                ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, parent);
                                if (shimmeringBar != null) {
                                    i = vch0.title_component;
                                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, parent);
                                    if (listTitleComponent != null) {
                                        return new de0(parent, addressInputComponent, recyclerView, robotoTextView, linearLayout, listItemInputComponent, buttonComponent, shimmeringBar, listTitleComponent);
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

    @Override // defpackage.ae0
    public void changeButtonEnabled(boolean isEnabled) {
        getBinding().g.setEnabled(isEnabled);
    }

    @Override // defpackage.ae0
    public void dismissModalView(FavoriteAddress favorite) {
        dismissWithAction(new hc(5, this, favorite));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.presenter;
        cVar.Bg(this);
        tje.N(cVar.Jg(), null, null, new AddFavoritesModalViewPresenter$attachView$1(cVar, this, null), 3);
        tje.N(cVar.Jg(), null, null, new AddFavoritesModalViewPresenter$attachView$2(cVar, null), 3);
        tje.N(cVar.Jg(), null, null, new AddFavoritesModalViewPresenter$attachView$3(cVar, this, null), 3);
        pzt0 pzt0Var = cVar.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cVar.M = tje.N(cVar.Jg(), null, null, new AddFavoritesModalViewPresenter$initData$1(cVar, null), 3);
        this.main.a();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        c cVar = this.presenter;
        r0 r0Var = cVar.J;
        if (((ge0) r0Var.getValue()).j) {
            tje.N(cVar.Jg(), null, null, new AddFavoritesModalViewPresenter$onBackPressure$1(cVar, null), 3);
        }
        boolean z = ((ge0) r0Var.getValue()).j;
        if (!z) {
            mrj mrjVar = cVar.H;
            Address address = cVar.L;
            String uri = address != null ? address.getUri() : null;
            if (uri == null) {
                uri = "";
            }
            ((x770) mrjVar.w).a.a("TapBackFromFavoritesOffer", x4e.p(LaunchBrowserActivity.KEY_URI, uri), 1, new HashMap());
        }
        if (z) {
            return;
        }
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.main.b();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        c cVar = this.presenter;
        tje.N(cVar.Jg(), null, null, new AddFavoritesModalViewPresenter$setKeyBoardState$1(cVar, insets.f, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        uw4 uw4Var = (uw4) this.presenter.C;
        ud0 ud0Var = uw4Var.a;
        qd0.a c = ud0Var.a().c(uw4Var.b());
        if (c != null) {
            return c.i;
        }
        return true;
    }

    @Override // defpackage.ae0
    public void setShimmeringSaveButton(boolean isShimmering) {
        de0 binding = getBinding();
        binding.f.setEnabled(!isShimmering);
        this.blockUpdateView = isShimmering;
        ButtonComponent buttonComponent = binding.g;
        if (isShimmering) {
            buttonComponent.setTextColor(new bdc(xng0.textOnControlMinor));
            buttonComponent.startAnimation();
        } else {
            buttonComponent.setTextColor(new bdc(xng0.textOnControl));
            buttonComponent.stopAnimation();
        }
    }

    @Override // defpackage.ae0
    public void updateAddFavoritesModalViewState(ge0 addFavoritesModalViewState) {
        de0 de0Var = (de0) getBinding();
        if (jl40.l(addFavoritesModalViewState, ge0.m)) {
            de0Var.h.setVisibility(0);
            return;
        }
        ShimmeringBar shimmeringBar = de0Var.h;
        RobotoTextView robotoTextView = de0Var.d;
        AddressInputComponent addressInputComponent = de0Var.b;
        ListTitleComponent listTitleComponent = de0Var.i;
        ListItemInputComponent listItemInputComponent = de0Var.f;
        shimmeringBar.setVisibility(8);
        de0Var.e.setVisibility(0);
        String str = addFavoritesModalViewState.a;
        boolean z = addFavoritesModalViewState.j;
        String str2 = addFavoritesModalViewState.l;
        listTitleComponent.setTitle(str);
        listTitleComponent.setSubtitle(addFavoritesModalViewState.b);
        addressInputComponent.setTitle(addFavoritesModalViewState.c);
        addressInputComponent.setSubtitle(addFavoritesModalViewState.d);
        de0Var.g.setText(addFavoritesModalViewState.e);
        listItemInputComponent.setHint(addFavoritesModalViewState.g);
        if (str2.length() > 0) {
            showView$default(this, robotoTextView, null, 2, null);
            robotoTextView.setText(str2);
        } else {
            hideView(robotoTextView);
        }
        if (addFavoritesModalViewState.i) {
            showView(listItemInputComponent, new d4(12, de0Var));
        } else {
            hideView(listItemInputComponent);
        }
        boolean z2 = addFavoritesModalViewState.k;
        RecyclerView recyclerView = de0Var.c;
        if (z2) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(z ? 8 : 0);
        }
        if (z) {
            listTitleComponent.hideSubtitle();
            listItemInputComponent.post(new xd2(listItemInputComponent, 1));
        } else {
            listTitleComponent.showSubtitle();
            listItemInputComponent.post(new ce0(listItemInputComponent, 15));
        }
        dip dipVar = this.categoriesBubblesAdapter;
        List list = addFavoritesModalViewState.h;
        ArrayList arrayList = dipVar.b;
        i f = kp50.f(new og20(arrayList, list, new aub(9)), true);
        arrayList.clear();
        arrayList.addAll(list);
        f.b(dipVar);
    }
}
