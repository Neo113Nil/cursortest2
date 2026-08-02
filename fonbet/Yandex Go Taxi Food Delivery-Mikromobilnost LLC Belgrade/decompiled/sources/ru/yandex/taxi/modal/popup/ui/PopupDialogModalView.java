package ru.yandex.taxi.modal.popup.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a8e0;
import defpackage.aq80;
import defpackage.b8e0;
import defpackage.c1p0;
import defpackage.c8e0;
import defpackage.d8e0;
import defpackage.f9e0;
import defpackage.g0c;
import defpackage.jt6;
import defpackage.kt6;
import defpackage.mps0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.q8e0;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.s7e0;
import defpackage.scc;
import defpackage.sls;
import defpackage.t7e0;
import defpackage.tn1;
import defpackage.txc;
import defpackage.u57;
import defpackage.v7e0;
import defpackage.wnb0;
import defpackage.xz3;
import defpackage.zrh0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/yandex/taxi/modal/popup/ui/PopupDialogModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lq8e0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "Lzy11;", "setupRecyclerView", "()V", "", "Ld8e0;", "items", "Lf9e0;", "eventDelegate", "", "dismissOnTouchOutside", "isSliderAutoAnimated", "prepare", "(Ljava/util/List;Lf9e0;ZZ)V", "onAttachedToWindow", "onDetachedFromWindow", "onBackPressed", "onAppearAnimationComplete", "onTouchOutside", "onSlideOut", "isArrowsPermanentlyHidden", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lq8e0;", "Lpav;", "Lf9e0;", "Ls7e0;", "adapter", "Ls7e0;", "Lkotlin/Function0;", "sliderBounceAnimationCallback", "Lsls;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopupDialogModalView extends SlideableBindingModalView<q8e0> {
    public static final int $stable = 8;
    private s7e0 adapter;
    private f9e0 eventDelegate;
    private final pav imageLoader;
    private sls sliderBounceAnimationCallback;

    public PopupDialogModalView(Context context, pav pavVar) {
        super(context);
        this.imageLoader = pavVar;
        qdb1.c(this, new wnb0(21, this));
    }

    public static /* synthetic */ void prepare$default(PopupDialogModalView popupDialogModalView, List list, f9e0 f9e0Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        popupDialogModalView.prepare(list, f9e0Var, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 prepare$lambda$0(PopupDialogModalView popupDialogModalView, boolean z, sls slsVar) {
        if (!z) {
            slsVar = null;
        }
        popupDialogModalView.sliderBounceAnimationCallback = slsVar;
        return zy11.a;
    }

    private final void setupRecyclerView() {
        RecyclerView recyclerView = getBinding().b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.adapter);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public q8e0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zrh0.popup_dialog_modal_view_layout, parent, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            return new q8e0(recyclerView, recyclerView);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        sls slsVar = this.sliderBounceAnimationCallback;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f9e0 f9e0Var = this.eventDelegate;
        if (f9e0Var != null) {
            f9e0Var.onAttachedToWindow();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        f9e0 f9e0Var = this.eventDelegate;
        if (f9e0Var != null) {
            f9e0Var.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f9e0 f9e0Var = this.eventDelegate;
        if (f9e0Var != null) {
            f9e0Var.onDetachedFromWindow();
        }
        this.eventDelegate = null;
        this.adapter = null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        f9e0 f9e0Var = this.eventDelegate;
        if (f9e0Var != null) {
            f9e0Var.e();
        }
        super.onSlideOut();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        f9e0 f9e0Var = this.eventDelegate;
        if (f9e0Var != null) {
            f9e0Var.g();
        }
    }

    public final void prepare(List<? extends d8e0> items, f9e0 eventDelegate, boolean dismissOnTouchOutside, boolean isSliderAutoAnimated) {
        setDismissOnTouchOutside(dismissOnTouchOutside);
        this.eventDelegate = eventDelegate;
        int i = 5;
        txc txcVar = new txc(i, eventDelegate);
        aq80 aq80Var = new aq80(eventDelegate);
        xz3 xz3Var = new xz3(this, isSliderAutoAnimated, 13);
        pav pavVar = this.imageLoader;
        int i2 = kt6.V;
        g0c a = qoi0.a(a8e0.class);
        jt6 jt6Var = new jt6(pavVar, i);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, jt6Var);
        int i3 = kt6.V;
        g0c a3 = qoi0.a(b8e0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, null, emptyList, null, new jt6(pavVar, 9));
        int i4 = kt6.V;
        g0c a4 = qoi0.a(t7e0.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, null, emptyList, null, new jt6(pavVar, 0));
        int i5 = mps0.V;
        g0c a5 = qoi0.a(c8e0.class);
        zxs zxsVar4 = new zxs(a5.a(), 0, null, emptyList, null, new c1p0(12, aq80Var, xz3Var));
        int i6 = u57.V;
        g0c a6 = qoi0.a(v7e0.class);
        this.adapter = new s7e0(txcVar, scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, new zxs(a6.a(), 0, null, emptyList, null, new tn1(27, txcVar))));
        setupRecyclerView();
        s7e0 s7e0Var = this.adapter;
        if (s7e0Var != null) {
            s7e0Var.submitList(items, null);
        }
    }
}
