package ru.yandex.taxi.delivery.addresscorrection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.address.models.Address;
import defpackage.amh;
import defpackage.avh;
import defpackage.bgq0;
import defpackage.bhh;
import defpackage.bmh;
import defpackage.bvh;
import defpackage.c230;
import defpackage.ce0;
import defpackage.cgq0;
import defpackage.cma1;
import defpackage.d6z;
import defpackage.d800;
import defpackage.deh0;
import defpackage.dke;
import defpackage.dvh;
import defpackage.evh;
import defpackage.ey60;
import defpackage.fvh;
import defpackage.hqh0;
import defpackage.j0g;
import defpackage.jqr;
import defpackage.kv8;
import defpackage.lu0;
import defpackage.nu0;
import defpackage.nvh;
import defpackage.ny61;
import defpackage.ovh;
import defpackage.pj;
import defpackage.qnh;
import defpackage.tfb0;
import defpackage.tqo;
import defpackage.w511;
import defpackage.wth;
import defpackage.wwf;
import defpackage.yr0;
import defpackage.yuh;
import defpackage.zc;
import defpackage.zch;
import defpackage.zgf;
import defpackage.zuh;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionView;
import ru.yandex.taxi.delivery.analytics.DeliveryAddressCorrectionAnalytics$FieldType;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TextChangedListener;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0018\u0010%\u001a\u00060$R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/yandex/taxi/delivery/addresscorrection/DeliveryAddressCorrectionView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lovh;", "Landroid/content/Context;", "context", "Lfvh;", "presenter", "Ley60;", "addressCorrectionExitListener", "<init>", "(Landroid/content/Context;Lfvh;Ley60;)V", "Lzy11;", "initViewListeners", "()V", "Lru/yandex/taxi/design/AnimatedListItemInputComponent;", "Lru/yandex/taxi/delivery/addresscorrection/DeliveryAddressCorrectionInputType;", "inputType", "initInputField", "(Lru/yandex/taxi/design/AnimatedListItemInputComponent;Lru/yandex/taxi/delivery/addresscorrection/DeliveryAddressCorrectionInputType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lovh;", "Lc230;", "insetsType", "()Lc230;", "onAttachedToWindow", "onDetachedFromWindow", "onBackPressed", "onTouchOutside", "onSlideOut", "onModalViewDisappear", "Lfvh;", "Ley60;", "Lnvh;", "mvpView", "Lnvh;", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryAddressCorrectionView extends SlideableBindingModalView<ovh> {
    private final ey60 addressCorrectionExitListener;
    private final nvh mvpView;
    private final fvh presenter;

    public DeliveryAddressCorrectionView(Context context, fvh fvhVar, ey60 ey60Var) {
        super(context);
        this.presenter = fvhVar;
        this.addressCorrectionExitListener = ey60Var;
        this.mvpView = new nvh(this);
        setDismissOnBackPressed(true);
        setArrowState(ArrowsView.State.GONE);
        initViewListeners();
    }

    private final void initInputField(AnimatedListItemInputComponent animatedListItemInputComponent, DeliveryAddressCorrectionInputType deliveryAddressCorrectionInputType) {
        animatedListItemInputComponent.setOnKeyboardClosed(new amh(5, this));
        animatedListItemInputComponent.setOnInputClicked(new bmh(3, this, deliveryAddressCorrectionInputType));
        animatedListItemInputComponent.addTextChangedListener(new TextChangedListener(new dke(19, this, deliveryAddressCorrectionInputType)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initInputField$lambda$0(DeliveryAddressCorrectionView deliveryAddressCorrectionView) {
        deliveryAddressCorrectionView.requestFocus();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initInputField$lambda$1(DeliveryAddressCorrectionView deliveryAddressCorrectionView, DeliveryAddressCorrectionInputType deliveryAddressCorrectionInputType) {
        DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType;
        zgf zgfVar = deliveryAddressCorrectionView.presenter.y;
        int i = evh.a[deliveryAddressCorrectionInputType.ordinal()];
        if (i == 1) {
            deliveryAddressCorrectionAnalytics$FieldType = DeliveryAddressCorrectionAnalytics$FieldType.APARTMENT;
        } else if (i == 2) {
            deliveryAddressCorrectionAnalytics$FieldType = DeliveryAddressCorrectionAnalytics$FieldType.ENTRANCE;
        } else if (i == 3) {
            deliveryAddressCorrectionAnalytics$FieldType = DeliveryAddressCorrectionAnalytics$FieldType.FLOOR;
        } else if (i == 4) {
            deliveryAddressCorrectionAnalytics$FieldType = DeliveryAddressCorrectionAnalytics$FieldType.DOORPHONE;
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            deliveryAddressCorrectionAnalytics$FieldType = DeliveryAddressCorrectionAnalytics$FieldType.COMMENT;
        }
        zgfVar.j(deliveryAddressCorrectionAnalytics$FieldType);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initInputField$lambda$2(DeliveryAddressCorrectionView deliveryAddressCorrectionView, DeliveryAddressCorrectionInputType deliveryAddressCorrectionInputType, String str) {
        Object value;
        Object value2;
        String str2;
        Object value3;
        String str3;
        Object value4;
        String str4;
        qnh qnhVar = deliveryAddressCorrectionView.presenter.A;
        int i = evh.a[deliveryAddressCorrectionInputType.ordinal()];
        if (i == 1) {
            r0 r0Var = (r0) qnhVar.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, yr0.a((yr0) value, str, null, null, null, null, null, HProv.PP_DELETE_KEYSET)));
        } else if (i == 2) {
            String str5 = str;
            r0 r0Var2 = (r0) qnhVar.a;
            do {
                value2 = r0Var2.getValue();
                str2 = str5;
                str5 = str2;
            } while (!r0Var2.k(value2, yr0.a((yr0) value2, null, str2, null, null, null, null, HProv.PP_PASSWD_TERM)));
        } else if (i == 3) {
            String str6 = str;
            r0 r0Var3 = (r0) qnhVar.a;
            do {
                value3 = r0Var3.getValue();
                str3 = str6;
                str6 = str3;
            } while (!r0Var3.k(value3, yr0.a((yr0) value3, null, null, str3, null, null, null, 119)));
        } else if (i == 4) {
            String str7 = str;
            r0 r0Var4 = (r0) qnhVar.a;
            do {
                value4 = r0Var4.getValue();
                str4 = str7;
                str7 = str4;
            } while (!r0Var4.k(value4, yr0.a((yr0) value4, null, null, null, str4, null, null, 111)));
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            r0 r0Var5 = (r0) qnhVar.a;
            while (true) {
                Object value5 = r0Var5.getValue();
                String str8 = str;
                if (r0Var5.k(value5, yr0.a((yr0) value5, null, null, null, null, str8, null, 95))) {
                    break;
                }
                str = str8;
            }
        }
        return zy11.a;
    }

    private final void initViewListeners() {
        final int i = 0;
        getBinding().i.setDebounceClickListener(new Runnable(this) { // from class: lvh
            public final /* synthetic */ DeliveryAddressCorrectionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                DeliveryAddressCorrectionView deliveryAddressCorrectionView = this.b;
                switch (i2) {
                    case 0:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$0(deliveryAddressCorrectionView);
                        break;
                    case 1:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$1(deliveryAddressCorrectionView);
                        break;
                    case 2:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$2(deliveryAddressCorrectionView);
                        break;
                    case 3:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$3(deliveryAddressCorrectionView);
                        break;
                    default:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$4(deliveryAddressCorrectionView);
                        break;
                }
            }
        });
        initInputField(getBinding().b, DeliveryAddressCorrectionInputType.APARTMENT);
        initInputField(getBinding().k, DeliveryAddressCorrectionInputType.PORCH);
        initInputField(getBinding().h, DeliveryAddressCorrectionInputType.FLOOR);
        initInputField(getBinding().g, DeliveryAddressCorrectionInputType.DOORPHONE);
        initInputField(getBinding().d, DeliveryAddressCorrectionInputType.COMMENT);
        final int i2 = 1;
        getBinding().e.setDebounceClickListener(new Runnable(this) { // from class: lvh
            public final /* synthetic */ DeliveryAddressCorrectionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                DeliveryAddressCorrectionView deliveryAddressCorrectionView = this.b;
                switch (i22) {
                    case 0:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$0(deliveryAddressCorrectionView);
                        break;
                    case 1:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$1(deliveryAddressCorrectionView);
                        break;
                    case 2:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$2(deliveryAddressCorrectionView);
                        break;
                    case 3:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$3(deliveryAddressCorrectionView);
                        break;
                    default:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$4(deliveryAddressCorrectionView);
                        break;
                }
            }
        });
        final int i3 = 2;
        getBinding().j.setDebounceClickListener(new Runnable(this) { // from class: lvh
            public final /* synthetic */ DeliveryAddressCorrectionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                DeliveryAddressCorrectionView deliveryAddressCorrectionView = this.b;
                switch (i22) {
                    case 0:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$0(deliveryAddressCorrectionView);
                        break;
                    case 1:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$1(deliveryAddressCorrectionView);
                        break;
                    case 2:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$2(deliveryAddressCorrectionView);
                        break;
                    case 3:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$3(deliveryAddressCorrectionView);
                        break;
                    default:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$4(deliveryAddressCorrectionView);
                        break;
                }
            }
        });
        final int i4 = 3;
        getBinding().f.setDebounceClickListener(new Runnable(this) { // from class: lvh
            public final /* synthetic */ DeliveryAddressCorrectionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i4;
                DeliveryAddressCorrectionView deliveryAddressCorrectionView = this.b;
                switch (i22) {
                    case 0:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$0(deliveryAddressCorrectionView);
                        break;
                    case 1:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$1(deliveryAddressCorrectionView);
                        break;
                    case 2:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$2(deliveryAddressCorrectionView);
                        break;
                    case 3:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$3(deliveryAddressCorrectionView);
                        break;
                    default:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$4(deliveryAddressCorrectionView);
                        break;
                }
            }
        });
        final int i5 = 4;
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: lvh
            public final /* synthetic */ DeliveryAddressCorrectionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i5;
                DeliveryAddressCorrectionView deliveryAddressCorrectionView = this.b;
                switch (i22) {
                    case 0:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$0(deliveryAddressCorrectionView);
                        break;
                    case 1:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$1(deliveryAddressCorrectionView);
                        break;
                    case 2:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$2(deliveryAddressCorrectionView);
                        break;
                    case 3:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$3(deliveryAddressCorrectionView);
                        break;
                    default:
                        DeliveryAddressCorrectionView.initViewListeners$lambda$4(deliveryAddressCorrectionView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewListeners$lambda$0(DeliveryAddressCorrectionView deliveryAddressCorrectionView) {
        deliveryAddressCorrectionView.presenter.y.j(DeliveryAddressCorrectionAnalytics$FieldType.STREET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewListeners$lambda$1(DeliveryAddressCorrectionView deliveryAddressCorrectionView) {
        String str;
        fvh fvhVar = deliveryAddressCorrectionView.presenter;
        fvhVar.y.j(DeliveryAddressCorrectionAnalytics$FieldType.RECIPIENT);
        dvh dvhVar = fvhVar.C;
        bgq0 bgq0Var = ((yr0) ((r0) fvhVar.A.a).getValue()).g;
        bhh bhhVar = new bhh(3, fvhVar);
        d800 d800Var = dvhVar.a;
        String str2 = ((tqo) ((r0) dvhVar.b.c).getValue()).m;
        String str3 = dvhVar.e.a.O.a;
        d800Var.a(new tfb0(str2, (str3 == null || (str = dvhVar.f.e(str3).h) == null) ? EmptyList.a : Collections.singletonList(new bgq0(str, ((h) dvhVar.d).Og(), (SelectedFrom) null, 12)), null, bgq0Var, false, null, null, 262132), new j0g(dvhVar, bhhVar), new kv8(4, dvhVar), cgq0.a);
        pj pjVar = (pj) dvhVar.c.b;
        pjVar.getClass();
        pjVar.a.a("CopypastApprovalCard.Contacts.Shown", new HashMap(), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewListeners$lambda$2(DeliveryAddressCorrectionView deliveryAddressCorrectionView) {
        Object value;
        tqo tqoVar;
        fvh fvhVar = deliveryAddressCorrectionView.presenter;
        pj pjVar = (pj) fvhVar.y.b;
        pjVar.getClass();
        pjVar.a.a("CopypastApprovalCard.ShowTextButtonTapped", new HashMap(), 1, new HashMap());
        wwf wwfVar = fvhVar.B;
        r0 r0Var = (r0) wwfVar.c;
        if (!((tqo) r0Var.getValue()).l) {
            String str = ((bvh) wwfVar.a).b;
            yuh a = ((zuh) wwfVar.b).a();
            String Y = d6z.Y(a, a.o);
            do {
                value = r0Var.getValue();
                tqoVar = (tqo) value;
            } while (!r0Var.k(value, new tqo(tqoVar.a, tqoVar.b, tqoVar.c, tqoVar.d, tqoVar.e, tqoVar.f, tqoVar.g, tqoVar.h, tqoVar.i, str, Y, tqoVar.m, true)));
        }
        ((avh) fvhVar.Dg()).X(((tqo) ((r0) wwfVar.c).getValue()).j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewListeners$lambda$3(DeliveryAddressCorrectionView deliveryAddressCorrectionView) {
        fvh fvhVar = deliveryAddressCorrectionView.presenter;
        pj pjVar = (pj) fvhVar.y.b;
        pjVar.getClass();
        pjVar.a.a("CopypastApprovalCard.ApproveButtonTapped", new HashMap(), 1, new HashMap());
        yr0 yr0Var = (yr0) ((r0) fvhVar.A.a).getValue();
        nu0 nu0Var = fvhVar.z;
        Address address = fvhVar.x.a;
        bgq0 bgq0Var = yr0Var.g;
        String str = yr0Var.d;
        String str2 = yr0Var.b;
        String str3 = yr0Var.e;
        String str4 = yr0Var.c;
        String str5 = yr0Var.f;
        nu0Var.getClass();
        nu0Var.a = new lu0(bgq0Var, address, str, str2, str3, str4, str5);
        ((avh) fvhVar.Dg()).hg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewListeners$lambda$4(DeliveryAddressCorrectionView deliveryAddressCorrectionView) {
        fvh fvhVar = deliveryAddressCorrectionView.presenter;
        pj pjVar = (pj) fvhVar.y.b;
        pjVar.getClass();
        pjVar.a.a("CopypastApprovalCard.CancelButtonTapped", new HashMap(), 1, new HashMap());
        ((avh) fvhVar.Dg()).close();
        fvhVar.z.a = null;
        ((zc) ((zch) deliveryAddressCorrectionView.addressCorrectionExitListener).a).r(new wth(2));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ovh bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View O2;
        View inflate = inflater.inflate(hqh0.delivery_address_correction_view, parent, false);
        int i = deh0.delivery_address_correction_apartment;
        AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, inflate);
        if (animatedListItemInputComponent != null) {
            i = deh0.delivery_address_correction_buttons_shadow;
            if (((ShadowScrollIndicator) cma1.O(i, inflate)) != null) {
                i = deh0.delivery_address_correction_cancel_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = deh0.delivery_address_correction_comment;
                    AnimatedListItemInputComponent animatedListItemInputComponent2 = (AnimatedListItemInputComponent) cma1.O(i, inflate);
                    if (animatedListItemInputComponent2 != null) {
                        i = deh0.delivery_address_correction_contact;
                        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                        if (listItemComponent != null) {
                            i = deh0.delivery_address_correction_done_button;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                            if (buttonComponent2 != null) {
                                i = deh0.delivery_address_correction_doorphone;
                                AnimatedListItemInputComponent animatedListItemInputComponent3 = (AnimatedListItemInputComponent) cma1.O(i, inflate);
                                if (animatedListItemInputComponent3 != null) {
                                    i = deh0.delivery_address_correction_floor;
                                    AnimatedListItemInputComponent animatedListItemInputComponent4 = (AnimatedListItemInputComponent) cma1.O(i, inflate);
                                    if (animatedListItemInputComponent4 != null) {
                                        i = deh0.delivery_address_correction_info_destination;
                                        ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                        if (listItemComponent2 != null) {
                                            i = deh0.delivery_address_correction_original_text;
                                            ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                                            if (listItemComponent3 != null) {
                                                i = deh0.delivery_address_correction_porch;
                                                AnimatedListItemInputComponent animatedListItemInputComponent5 = (AnimatedListItemInputComponent) cma1.O(i, inflate);
                                                if (animatedListItemInputComponent5 != null) {
                                                    i = deh0.delivery_address_correction_scroll;
                                                    if (((NestedScrollViewAdvanced) cma1.O(i, inflate)) != null) {
                                                        i = deh0.delivery_address_correction_view_bottom_container;
                                                        if (((LinearLayout) cma1.O(i, inflate)) != null && (O = cma1.O((i = deh0.delivery_address_correction_view_content_divider), inflate)) != null) {
                                                            i = deh0.delivery_address_correction_view_header;
                                                            ListItemComponent listItemComponent4 = (ListItemComponent) cma1.O(i, inflate);
                                                            if (listItemComponent4 != null) {
                                                                i = deh0.delivery_address_correction_view_top_container;
                                                                if (((ConstraintLayout) cma1.O(i, inflate)) != null && (O2 = cma1.O((i = deh0.divider_comment), inflate)) != null) {
                                                                    return new ovh((ConstraintLayout) inflate, animatedListItemInputComponent, buttonComponent, animatedListItemInputComponent2, listItemComponent, buttonComponent2, animatedListItemInputComponent3, animatedListItemInputComponent4, listItemComponent2, listItemComponent3, animatedListItemInputComponent5, O, listItemComponent4, O2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().a.requestFocus();
        post(new ce0(this, 15));
        fvh fvhVar = this.presenter;
        fvhVar.Bg(this.mvpView);
        pj pjVar = (pj) fvhVar.y.b;
        pjVar.getClass();
        pjVar.a.a("CopypastApprovalCard.Shown", new HashMap(), 1, new HashMap());
        e.H(fvhVar.Jg(), new jqr(e.t(new m0(e.d((r0) fvhVar.B.c), e.d((r0) fvhVar.A.a), new DeliveryAddressCorrectionPresenter$observeState$1(fvhVar, null))), new DeliveryAddressCorrectionPresenter$observeState$2(fvhVar, null), 3));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.Kg();
        ((zc) ((zch) this.addressCorrectionExitListener).a).r(new wth(2));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        post(new ce0(this, 15));
        super.onModalViewDisappear();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        super.onSlideOut();
        this.presenter.Kg();
        ((zc) ((zch) this.addressCorrectionExitListener).a).r(new wth(2));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.Kg();
        ((zc) ((zch) this.addressCorrectionExitListener).a).r(new wth(2));
    }
}
