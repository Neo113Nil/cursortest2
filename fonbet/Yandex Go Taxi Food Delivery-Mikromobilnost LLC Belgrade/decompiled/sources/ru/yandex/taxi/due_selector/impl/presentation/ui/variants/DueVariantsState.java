package ru.yandex.taxi.due_selector.impl.presentation.ui.variants;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.a2i0;
import defpackage.aym;
import defpackage.bxl;
import defpackage.dwh0;
import defpackage.fym;
import defpackage.gym;
import defpackage.ivm;
import defpackage.kyh0;
import defpackage.n2n;
import defpackage.oxm;
import defpackage.p2n;
import defpackage.q2n;
import defpackage.qdh0;
import defpackage.r2n;
import defpackage.rp31;
import defpackage.rxm;
import defpackage.t7s;
import defpackage.uph0;
import defpackage.xvm;
import defpackage.xxm;
import defpackage.yxm;
import defpackage.zxm;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.due_selector.impl.domain.entity.ControlButtonState;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonType;
import ru.yandex.taxi.due_selector.impl.presentation.ui.DueSelectorView;
import ru.yandex.taxi.due_selector.impl.presentation.ui.a;
import ru.yandex.taxi.due_selector.impl.presentation.ui.variants.DueVariantsState;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010)\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/yandex/taxi/due_selector/impl/presentation/ui/variants/DueVariantsState;", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/due_selector/impl/presentation/ui/a;", "Lq2n;", "Landroid/content/Context;", "context", "Lr2n;", "presenter", "Livm;", "dueButtonsController", "<init>", "(Landroid/content/Context;Lr2n;Livm;)V", "Lzy11;", "initAttributes", "()V", "", "isVisible", "togglePickerOption", "(Z)V", "", "minutes", "", "selectedMinutes", "setMinutes", "([II)V", "Lru/yandex/taxi/due_selector/impl/presentation/ui/DueSelectorView$ViewState;", "getViewState", "()Lru/yandex/taxi/due_selector/impl/presentation/ui/DueSelectorView$ViewState;", "onAttachedToWindow", "onDetachedFromWindow", "doneButtonClicked", "retryButtonClicked", "Lp2n;", "stateInfo", "render", "(Lp2n;)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "Lr2n;", "Livm;", "timePickerTrigger", "Landroid/view/View;", "dueDivider", "Landroid/view/ViewGroup;", "fixedDueVariants", "Landroid/view/ViewGroup;", "Ln2n;", "itemsFactory", "Ln2n;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DueVariantsState extends LinearLayout implements a, q2n {
    private final ivm dueButtonsController;
    private final View dueDivider;
    private final ViewGroup fixedDueVariants;
    private final n2n itemsFactory;
    private final r2n presenter;
    private final View timePickerTrigger;

    public DueVariantsState(Context context, r2n r2nVar, ivm ivmVar) {
        super(context, null, a2i0.ModalContentHolder);
        this.presenter = r2nVar;
        this.dueButtonsController = ivmVar;
        c.q(this, uph0.due_selector_layout, true);
        int i = qdh0.time_picker_trigger;
        WeakHashMap weakHashMap = b.a;
        this.timePickerTrigger = (View) rp31.d(this, i);
        this.dueDivider = (View) rp31.d(this, qdh0.due_divider);
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, qdh0.fixed_due_variants));
        this.fixedDueVariants = viewGroup;
        initAttributes();
        this.itemsFactory = new n2n(viewGroup);
    }

    private final void initAttributes() {
        setClipToPadding(false);
        setBackground(null);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(DueVariantsState dueVariantsState) {
        rxm rxmVar;
        rxmVar = ((DueSelectorView) ((gym) dueVariantsState.presenter.x).a).presenter;
        ((oxm) rxmVar.Dg()).render(new zxm(rxmVar.y.e()));
        return zy11.a;
    }

    private final void setMinutes(int[] minutes, final int selectedMinutes) {
        this.fixedDueVariants.removeAllViews();
        int length = minutes.length;
        for (int i = 0; i < length; i++) {
            final int i2 = minutes[i];
            n2n n2nVar = this.itemsFactory;
            boolean z = selectedMinutes == i2;
            ViewGroup viewGroup = n2nVar.a;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(uph0.due_variant_item, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(qdh0.title);
            View findViewById = inflate.findViewById(qdh0.check_mark);
            textView.setText(t7s.i(viewGroup.getResources(), dwh0.due_additional, kyh0.due_additional_fallback, i2, Integer.valueOf(i2)));
            findViewById.setVisibility(z ? 0 : 8);
            inflate.setSelected(z);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: o2n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DueVariantsState.setMinutes$lambda$0(selectedMinutes, i2, this, view);
                }
            });
            this.fixedDueVariants.addView(inflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMinutes$lambda$0(int i, int i2, DueVariantsState dueVariantsState, View view) {
        if (i == i2) {
            r2n r2nVar = dueVariantsState.presenter;
            r2nVar.C = 0;
            r2nVar.Kg();
        } else {
            r2n r2nVar2 = dueVariantsState.presenter;
            r2nVar2.C = i2;
            r2nVar2.Kg();
        }
    }

    private final void togglePickerOption(boolean isVisible) {
        this.dueDivider.setVisibility(isVisible ? 0 : 8);
        this.timePickerTrigger.setVisibility(isVisible ? 0 : 8);
    }

    @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.a
    public View asView() {
        return this;
    }

    @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.a
    public void doneButtonClicked() {
        r2n r2nVar = this.presenter;
        r2nVar.A.d(r2nVar.C, r2nVar.y.d());
    }

    @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.a
    public DueSelectorView.ViewState getViewState() {
        return DueSelectorView.ViewState.VARIANTS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        r2n r2nVar = this.presenter;
        r2nVar.Bg(this);
        aym d = r2nVar.z.d();
        if (d instanceof xxm) {
            r2nVar.D = true;
        } else if (d instanceof yxm) {
            r2nVar.D = false;
        }
        r2nVar.C = r2nVar.A.a.a.S.d;
        r2nVar.Kg();
        c.z(new bxl(19, this), this.timePickerTrigger);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.timePickerTrigger.setOnClickListener(null);
    }

    @Override // defpackage.q2n
    public void render(p2n stateInfo) {
        togglePickerOption(stateInfo.a);
        int[] iArr = stateInfo.b;
        int i = stateInfo.c;
        setMinutes(iArr, i);
        ((fym) this.dueButtonsController).b(xvm.g, i > 0 ? new xvm(DuePickerButtonType.SCHEDULED_ORDER_BUTTON, null, kyh0.common_done, null, ControlButtonState.ACTIVE_MAIN, false, 42) : new xvm(DuePickerButtonType.CLOSE_BUTTON, null, kyh0.common_close, null, ControlButtonState.ACTIVE_MINOR, false, 42));
    }

    @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.a
    public void retryButtonClicked() {
    }
}
