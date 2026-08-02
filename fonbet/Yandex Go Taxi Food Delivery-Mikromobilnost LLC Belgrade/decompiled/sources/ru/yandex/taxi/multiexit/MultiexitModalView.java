package ru.yandex.taxi.multiexit;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.b;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aph0;
import defpackage.br40;
import defpackage.cr40;
import defpackage.erg0;
import defpackage.jr40;
import defpackage.mq40;
import defpackage.mqg0;
import defpackage.pq40;
import defpackage.qdb1;
import defpackage.rp31;
import defpackage.tje;
import defpackage.uhx;
import defpackage.wch0;
import defpackage.wq40;
import defpackage.xw31;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.wheel.PickerView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\t*\u00019\u0018\u00002\u00020\u0001:\u0001@B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010\u0010J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0014R\u0014\u0010?\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0014¨\u0006A"}, d2 = {"Lru/yandex/taxi/multiexit/MultiexitModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/preorder/source/ModalViewOrigin;", "modalViewOrigin", "Lru/yandex/taxi/multiexit/a;", "presenter", "Lpq40;", "router", "Ljava/lang/Runnable;", "multiExitAutoLocationAction", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/preorder/source/ModalViewOrigin;Lru/yandex/taxi/multiexit/a;Lpq40;Ljava/lang/Runnable;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lmq40;", "airport", "setAirport", "(Lmq40;)V", "Ljr40;", "terminal", "Lwq40;", "exit", "selectEntrance", "(Ljr40;Lwq40;)V", "disable", "enable", "Lru/yandex/taxi/multiexit/a;", "Ljava/lang/Runnable;", "Landroid/view/View;", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "subtitle", "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "done", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/widget/wheel/PickerView;", "picker", "Lru/yandex/taxi/widget/wheel/PickerView;", "cardCornerRadius", CA20Status.STATUS_USER_I, "cr40", "onBackPressedCallback", "Lcr40;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "br40", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiexitModalView extends SlideableModalView {
    private final int cardCornerRadius;
    private final View content;
    private final ButtonComponent done;
    private final Runnable multiExitAutoLocationAction;
    private final cr40 onBackPressedCallback;
    private final PickerView picker;
    private final a presenter;
    private final ListTextComponent subtitle;
    private final ListTitleComponent title;

    public MultiexitModalView(Context context, ModalViewOrigin modalViewOrigin, a aVar, pq40 pq40Var, Runnable runnable) {
        super(context);
        this.presenter = aVar;
        this.multiExitAutoLocationAction = runnable;
        int i = wch0.multi_exit_modal_view_content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        ListTitleComponent listTitleComponent = (ListTitleComponent) ((View) rp31.d(this, wch0.multi_exit_modal_view_title));
        this.title = listTitleComponent;
        this.subtitle = (ListTextComponent) ((View) rp31.d(this, wch0.multi_exit_modal_view_subtitle));
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, wch0.multi_exit_modal_view_done));
        this.done = buttonComponent;
        PickerView pickerView = (PickerView) ((View) rp31.d(this, wch0.multi_exit_modal_view_picker));
        this.picker = pickerView;
        this.cardCornerRadius = tje.r(erg0.multi_exit_modal_view_corner_radius, getContext());
        this.onBackPressedCallback = new cr40(this);
        aVar.B = pq40Var;
        aVar.C = modalViewOrigin;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setId(wch0.multiexitarea_picker_modal_view);
        final int i2 = 1;
        b.q(listTitleComponent, true);
        pickerView.setOnOptionsSelectListener(new uhx(23, this));
        final int i3 = 0;
        xw31.c(pickerView, new Runnable(this) { // from class: ar40
            public final /* synthetic */ MultiexitModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                MultiexitModalView multiexitModalView = this.b;
                switch (i4) {
                    case 0:
                        MultiexitModalView._init_$lambda$1(multiexitModalView);
                        break;
                    default:
                        MultiexitModalView._init_$lambda$2(multiexitModalView);
                        break;
                }
            }
        });
        buttonComponent.setAccent(true);
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: ar40
            public final /* synthetic */ MultiexitModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i2;
                MultiexitModalView multiexitModalView = this.b;
                switch (i4) {
                    case 0:
                        MultiexitModalView._init_$lambda$1(multiexitModalView);
                        break;
                    default:
                        MultiexitModalView._init_$lambda$2(multiexitModalView);
                        break;
                }
            }
        });
        setDismissOnTouchOutside(false);
        setElevation(tje.r(erg0.summary_elevation, getContext()));
        qdb1.d(this, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MultiexitModalView multiexitModalView, int i, int i2, int i3, boolean z) {
        a aVar = multiexitModalView.presenter;
        aVar.getClass();
        if (i < 0 || i2 < 0) {
            return;
        }
        aVar.B.R9((jr40) aVar.A.a(i), (wq40) aVar.A.b(i).a(i2), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(MultiexitModalView multiexitModalView) {
        Context context = multiexitModalView.getContext();
        Rect rect = xw31.a;
        multiexitModalView.picker.setSafeLineSpacing(((float) multiexitModalView.content.getHeight()) > ((float) context.getResources().getDisplayMetrics().heightPixels) * 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MultiexitModalView multiexitModalView) {
        a aVar = multiexitModalView.presenter;
        aVar.B.C2(aVar.C);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    public final void disable() {
        this.done.setEnabled(false);
        this.picker.setEnabled(false);
    }

    public final void enable() {
        this.done.setEnabled(true);
        this.picker.setEnabled(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return aph0.airport_modal_view;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius, reason: from getter */
    public int getCardCornerRadius() {
        return this.cardCornerRadius;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        br40 br40Var = new br40(this);
        aVar.Bg(br40Var);
        aVar.Kg(aVar.z);
        br40Var.b7(aVar.A);
        aVar.y.a(a.D);
        tje.a0(getContext(), this.onBackPressedCallback);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.onBackPressedCallback.g();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    public final void selectEntrance(jr40 terminal, wq40 exit) {
        this.picker.selectItem(terminal, exit);
    }

    public final void setAirport(final mq40 airport) {
        WeakHashMap weakHashMap = b.a;
        if (isAttachedToWindow()) {
            this.presenter.Kg(airport);
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.multiexit.MultiexitModalView$setAirport$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    this.presenter.Kg(airport);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
    }
}
