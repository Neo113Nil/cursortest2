package ru.yandex.taxi.combo.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.hdh0;
import defpackage.iqg0;
import defpackage.lbm;
import defpackage.lph0;
import defpackage.mqg0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pta0;
import defpackage.qje;
import defpackage.rb;
import defpackage.rjc;
import defpackage.tb;
import defpackage.tje;
import defpackage.u8w;
import defpackage.vb;
import defpackage.wb;
import defpackage.x4e;
import defpackage.xb;
import defpackage.xng0;
import defpackage.zb;
import java.util.HashMap;
import java.util.function.Consumer;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.combo.ui.AcceptComboOrderModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SegmentedComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u000fH\u0014¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u000fH\u0014¢\u0006\u0004\b&\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/yandex/taxi/combo/ui/AcceptComboOrderModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lwb;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lpta0;", "peopleComboAnalytics", "Lxb;", "model", "Lzb;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Lpta0;Lxb;Lzb;)V", "Lzy11;", "initSelector", "(Lxb;)V", "", "text", "Lru/yandex/taxi/design/ListItemComponent;", "prepareTab", "(Ljava/lang/String;)Lru/yandex/taxi/design/ListItemComponent;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lvb;", "callback", "withCallback", "(Lvb;)Lru/yandex/taxi/combo/ui/AcceptComboOrderModalView;", "onTouchOutside", "onBackPressed", "onDismissManually", "dismiss", "close", "onModalViewDisappear", "Lpta0;", "Lzb;", "Lrb;", "binding", "Lrb;", "Lvb;", "", "tabsPadding", CA20Status.STATUS_USER_I, "combo"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AcceptComboOrderModalView extends ModalView implements wb {
    private final rb binding;
    private vb callback;
    private final pta0 peopleComboAnalytics;
    private final zb presenter;
    private final int tabsPadding;

    public AcceptComboOrderModalView(Context context, pav pavVar, pta0 pta0Var, xb xbVar, zb zbVar) {
        super(context);
        this.peopleComboAnalytics = pta0Var;
        this.presenter = zbVar;
        LayoutInflater.from(context).inflate(lph0.accept_combo_options_modal_view, this);
        int i = hdh0.combo_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, this);
        if (constraintLayout != null) {
            i = hdh0.combo_options_cancel;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
            if (buttonComponent != null) {
                i = hdh0.combo_options_icon;
                ImageView imageView = (ImageView) cma1.O(i, this);
                if (imageView != null) {
                    i = hdh0.combo_options_lower_text;
                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
                    if (listItemComponent != null) {
                        i = hdh0.combo_options_main_text;
                        ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, this);
                        if (listItemComponent2 != null) {
                            i = hdh0.combo_options_next;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, this);
                            if (buttonComponent2 != null) {
                                i = hdh0.combo_options_passengers_number_picker;
                                SegmentedComponent segmentedComponent = (SegmentedComponent) cma1.O(i, this);
                                if (segmentedComponent != null) {
                                    i = hdh0.combo_options_title;
                                    ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, this);
                                    if (listItemComponent3 != null) {
                                        i = hdh0.error_too_many_passengers_text;
                                        TextView textView = (TextView) cma1.O(i, this);
                                        if (textView != null) {
                                            this.binding = new rb(this, constraintLayout, buttonComponent, imageView, listItemComponent, listItemComponent2, buttonComponent2, segmentedComponent, listItemComponent3, textView);
                                            lbm a = pavVar.a(imageView);
                                            String str = xbVar.a;
                                            int i2 = xbVar.h;
                                            String str2 = xbVar.c;
                                            String str3 = xbVar.e;
                                            ((nac) a).c(str);
                                            listItemComponent3.setTitle(xbVar.b);
                                            final int i3 = 0;
                                            if (str3 == null || evu0.J(str3)) {
                                                listItemComponent.setVisibility(8);
                                            } else {
                                                listItemComponent.setVisibility(0);
                                                listItemComponent.setTitle(str3);
                                            }
                                            if (str2 == null || evu0.J(str2)) {
                                                listItemComponent2.setVisibility(8);
                                            } else {
                                                listItemComponent2.setVisibility(0);
                                                listItemComponent2.setTitle(str2);
                                                listItemComponent2.setSubtitle(xbVar.d);
                                            }
                                            buttonComponent2.setText(xbVar.g);
                                            buttonComponent2.setDebounceClickListener(new Runnable(this) { // from class: ub
                                                public final /* synthetic */ AcceptComboOrderModalView b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i4 = i3;
                                                    AcceptComboOrderModalView acceptComboOrderModalView = this.b;
                                                    switch (i4) {
                                                        case 0:
                                                            AcceptComboOrderModalView.lambda$0$0(acceptComboOrderModalView);
                                                            break;
                                                        default:
                                                            AcceptComboOrderModalView.lambda$1$0(acceptComboOrderModalView);
                                                            break;
                                                    }
                                                }
                                            });
                                            buttonComponent.setText(xbVar.f);
                                            final int i4 = 1;
                                            buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: ub
                                                public final /* synthetic */ AcceptComboOrderModalView b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i42 = i4;
                                                    AcceptComboOrderModalView acceptComboOrderModalView = this.b;
                                                    switch (i42) {
                                                        case 0:
                                                            AcceptComboOrderModalView.lambda$0$0(acceptComboOrderModalView);
                                                            break;
                                                        default:
                                                            AcceptComboOrderModalView.lambda$1$0(acceptComboOrderModalView);
                                                            break;
                                                    }
                                                }
                                            });
                                            if (i2 > 1) {
                                                initSelector(xbVar);
                                            }
                                            u8w u8wVar = pta0Var.b;
                                            u8wVar.getClass();
                                            HashMap hashMap = new HashMap();
                                            u8wVar.a.a("PeopleCombo.SeatsBooking.Shown", hashMap, 1, x4e.n(i2, hashMap, "value"));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void initSelector(xb model) {
        final int i = 0;
        Consumer consumer = new Consumer(this) { // from class: sb
            public final /* synthetic */ AcceptComboOrderModalView b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                AcceptComboOrderModalView acceptComboOrderModalView = this.b;
                ListItemComponent listItemComponent = (ListItemComponent) obj;
                switch (i2) {
                    case 0:
                        AcceptComboOrderModalView.initSelector$lambda$0(acceptComboOrderModalView, listItemComponent);
                        break;
                    default:
                        AcceptComboOrderModalView.initSelector$lambda$1(acceptComboOrderModalView, listItemComponent);
                        break;
                }
            }
        };
        final int i2 = 1;
        Consumer consumer2 = new Consumer(this) { // from class: sb
            public final /* synthetic */ AcceptComboOrderModalView b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i2;
                AcceptComboOrderModalView acceptComboOrderModalView = this.b;
                ListItemComponent listItemComponent = (ListItemComponent) obj;
                switch (i22) {
                    case 0:
                        AcceptComboOrderModalView.initSelector$lambda$0(acceptComboOrderModalView, listItemComponent);
                        break;
                    default:
                        AcceptComboOrderModalView.initSelector$lambda$1(acceptComboOrderModalView, listItemComponent);
                        break;
                }
            }
        };
        this.binding.d.setVisibility(0);
        int i3 = model.h;
        if (1 <= i3) {
            while (true) {
                this.binding.d.addCustomViewTab(prepareTab(String.valueOf(i2)), consumer, consumer2);
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.binding.d.setTabsPadding(this.tabsPadding);
        this.binding.d.setUserSelectionChangeListener(new tb(i, model, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelector$lambda$0(AcceptComboOrderModalView acceptComboOrderModalView, ListItemComponent listItemComponent) {
        listItemComponent.setRoundedBackground(c.c(xng0.bgMain, acceptComboOrderModalView));
        listItemComponent.setTitleColorAttr(xng0.textMain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelector$lambda$1(AcceptComboOrderModalView acceptComboOrderModalView, ListItemComponent listItemComponent) {
        listItemComponent.setRoundedBackground(c.a(mqg0.transparent, acceptComboOrderModalView));
        listItemComponent.setTitleColorAttr(xng0.textMinor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelector$lambda$2(xb xbVar, AcceptComboOrderModalView acceptComboOrderModalView, Integer num) {
        int intValue = num.intValue() + 1;
        if (num.intValue() >= xbVar.i) {
            acceptComboOrderModalView.binding.e.setVisibility(0);
            acceptComboOrderModalView.binding.e.setText(xbVar.j);
            acceptComboOrderModalView.binding.e.setTextColor(acceptComboOrderModalView.getContext().getColor(mqg0.component_red_normal));
            acceptComboOrderModalView.binding.d.setBackgroundWithOutline(acceptComboOrderModalView.getContext().getColor(iqg0.component_red_normal_opacity_10), acceptComboOrderModalView.getContext().getColor(mqg0.component_red_normal));
            acceptComboOrderModalView.binding.c.setEnabled(false);
            u8w u8wVar = acceptComboOrderModalView.peopleComboAnalytics.b;
            u8wVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(CRLReasonCodeExtension.REASON, "not_enough_seats");
            u8wVar.a.a("PeopleCombo.SeatsBooking.AlertShown", hashMap, 1, x4e.n(intValue, hashMap, "value"));
        } else {
            acceptComboOrderModalView.binding.e.setVisibility(8);
            acceptComboOrderModalView.binding.d.setBackgroundWithOutline(qje.t(xng0.bgMinor, acceptComboOrderModalView.getContext()), qje.t(xng0.bgMinor, acceptComboOrderModalView.getContext()));
            acceptComboOrderModalView.binding.c.setEnabled(true);
        }
        u8w u8wVar2 = acceptComboOrderModalView.peopleComboAnalytics.b;
        u8wVar2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("switch_name", "number_of_seats");
        u8wVar2.a.a("PeopleCombo.SeatsBooking.Switched", hashMap2, 1, x4e.n(intValue, hashMap2, "value"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(AcceptComboOrderModalView acceptComboOrderModalView) {
        i d = ((j) acceptComboOrderModalView.peopleComboAnalytics.a).d("PeopleCombo.SeatsBooking.Tapped");
        d.a.put("button_name", "order");
        d.m();
        vb vbVar = acceptComboOrderModalView.callback;
        if (vbVar != null) {
            ((rjc) vbVar).a.n();
        }
        acceptComboOrderModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$0(AcceptComboOrderModalView acceptComboOrderModalView) {
        i d = ((j) acceptComboOrderModalView.peopleComboAnalytics.a).d("PeopleCombo.SeatsBooking.Tapped");
        d.a.put("button_name", "back");
        d.m();
        vb vbVar = acceptComboOrderModalView.callback;
        if (vbVar != null) {
            ((rjc) vbVar).a.o();
        }
        acceptComboOrderModalView.dismiss();
    }

    private final ListItemComponent prepareTab(String text) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitle(text);
        listItemComponent.setTitleAlignment(1);
        listItemComponent.setRoundedBackground(qje.t(xng0.bgMain, listItemComponent.getContext()));
        this.binding.d.setBackgroundWithOutline(qje.t(xng0.bgMinor, listItemComponent.getContext()), qje.t(xng0.bgMinor, listItemComponent.getContext()));
        return listItemComponent;
    }

    @Override // defpackage.wb
    public void close() {
        vb vbVar = this.callback;
        if (vbVar != null) {
            ((rjc) vbVar).a.o();
        }
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContentView() {
        return this.binding.b;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
        u8w u8wVar = this.peopleComboAnalytics.b;
        u8wVar.getClass();
        u8wVar.a.a("PeopleCombo.SeatsBooking.Closed", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zb zbVar = this.presenter;
        zbVar.Bg(this);
        tje.N(zbVar.Jg(), null, null, new AcceptComboOrderPresenter$attachView$1(zbVar, this, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        vb vbVar = this.callback;
        if (vbVar != null) {
            ((rjc) vbVar).a.o();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        vb vbVar = this.callback;
        if (vbVar != null) {
            ((rjc) vbVar).a.o();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.callback = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        vb vbVar = this.callback;
        if (vbVar != null) {
            ((rjc) vbVar).a.o();
        }
    }

    public final AcceptComboOrderModalView withCallback(vb callback) {
        this.callback = callback;
        return this;
    }
}
