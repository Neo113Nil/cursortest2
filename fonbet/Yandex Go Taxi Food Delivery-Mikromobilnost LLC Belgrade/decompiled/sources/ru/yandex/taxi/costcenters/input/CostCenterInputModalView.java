package ru.yandex.taxi.costcenters.input;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.agh0;
import defpackage.b1;
import defpackage.ce0;
import defpackage.czo0;
import defpackage.ff2;
import defpackage.hbp0;
import defpackage.ldh0;
import defpackage.mrg0;
import defpackage.np31;
import defpackage.qph0;
import defpackage.rp31;
import defpackage.rwe;
import defpackage.swe;
import defpackage.tje;
import defpackage.tse0;
import defpackage.uwe;
import defpackage.v4a;
import defpackage.wnb1;
import defpackage.xe6;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.costcenters.base.CostCenterBaseModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/taxi/costcenters/input/CostCenterInputModalView;", "Lru/yandex/taxi/costcenters/base/CostCenterBaseModalView;", "Lrwe;", "Landroid/content/Context;", "context", "Lswe;", "presenter", "<init>", "(Landroid/content/Context;Lswe;)V", "Lzy11;", "dismiss", "()V", "Lru/yandex/taxi/design/ButtonComponent;", "doneButton", "()Lru/yandex/taxi/design/ButtonComponent;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", "contentTop", "onModalViewAppear", "(I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "title", "setTitle", "(Ljava/lang/String;)V", "value", "setInputValue", "closeKeyboard", "Lswe;", "Lhbp0;", "mainScope", "Lhbp0;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbarView", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListItemInputComponent;", "input", "Lru/yandex/taxi/design/ListItemInputComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CostCenterInputModalView extends CostCenterBaseModalView implements rwe {
    private final ViewGroup content;
    private final ButtonComponent doneButton;
    private final ListItemInputComponent input;
    private final hbp0 mainScope;
    private final swe presenter;
    private final ToolbarComponent toolbarView;

    public CostCenterInputModalView(Context context, swe sweVar) {
        super(context);
        this.presenter = sweVar;
        this.mainScope = new hbp0(new czo0(14), "", null);
        c.q(this, qph0.cost_center_input_modal_view, true);
        int i = ldh0.cost_center_toolbar;
        WeakHashMap weakHashMap = b.a;
        this.toolbarView = (ToolbarComponent) ((View) rp31.d(this, i));
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(this, ldh0.cost_center_input));
        this.input = listItemInputComponent;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, ldh0.confirm));
        this.doneButton = buttonComponent;
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, agh0.content));
        this.content = viewGroup;
        listItemInputComponent.setImeOptions(6);
        listItemInputComponent.setOnKeyboardCloseListener(new v4a(27, this));
        listItemInputComponent.setOnEditorActionListener(new ff2(4, this));
        listItemInputComponent.setAnimateDividerToHighlight(true);
        buttonComponent.setDebounceClickListener(new v4a(28, sweVar));
        wnb1.d(viewGroup.getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius), viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(CostCenterInputModalView costCenterInputModalView, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return true;
        }
        costCenterInputModalView.presenter.Lg();
        return true;
    }

    public void closeKeyboard() {
        ListItemInputComponent listItemInputComponent = this.input;
        if (listItemInputComponent != null) {
            listItemInputComponent.post(new ce0(listItemInputComponent, 15));
        }
        this.input.clearFocus();
        requestFocus();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        xe6 xe6Var = this.presenter.z;
        b1 b1Var = (b1) xe6Var.d;
        int i = xe6Var.b;
        boolean z = xe6Var.c;
        String str = (String) xe6Var.e;
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("is_required", Boolean.valueOf(z));
        b1Var.a.a("CostCenterCard.FieldText.Closed", hashMap, 1, tse0.r("title", hashMap, str));
        super.dismiss();
    }

    @Override // ru.yandex.taxi.costcenters.base.CostCenterBaseModalView
    /* renamed from: doneButton, reason: from getter */
    public ButtonComponent getDoneButton() {
        return this.doneButton;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mainScope.a();
        swe sweVar = this.presenter;
        sweVar.Kg(this);
        xe6 xe6Var = sweVar.z;
        b1 b1Var = (b1) xe6Var.d;
        int i = xe6Var.b;
        boolean z = xe6Var.c;
        String str = (String) xe6Var.e;
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("is_required", Boolean.valueOf(z));
        b1Var.a.a("CostCenterCard.FieldText.Opened", hashMap, 1, tse0.r("title", hashMap, str));
        uwe uweVar = sweVar.x;
        sweVar.A = uweVar.b.b(uweVar.c.a);
        ((rwe) sweVar.Dg()).setInputValue(sweVar.A);
        tje.N(this.mainScope, null, null, new CostCenterInputModalView$onAttachedToWindow$$inlined$safeCollectIn$1(this.input.textValueFlow(), null, this), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.mainScope.b();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.input.requestFocus();
        WeakHashMap weakHashMap = b.a;
        np31.c(this);
    }

    @Override // defpackage.rwe
    public void setInputValue(String value) {
        ListItemInputComponent listItemInputComponent = this.input;
        if (value == null) {
            value = "";
        }
        listItemInputComponent.setText(value);
    }

    @Override // ru.yandex.taxi.costcenters.base.CostCenterBaseModalView, defpackage.ewe
    public void setTitle(String title) {
        this.toolbarView.setTitle(title);
    }
}
