package ru.yandex.taxi.design;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.dhv;
import defpackage.lr1;
import defpackage.mrg0;
import defpackage.ny6;
import defpackage.scc;
import defpackage.tje;
import defpackage.tls;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0014\u001a\u00020\r\"\u0004\b\u0000\u0010\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/design/ListButtonComponent;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "index", "Lkotlin/Function1;", "Lru/yandex/taxi/design/ButtonComponent;", "Lzy11;", "action", "createButtonComponent", "(ILtls;)V", "", "Lny6;", "buttons", "addButtons", "(Ljava/util/List;)V", "T", "Lkotlin/Function3;", "onEach", "(Ljava/util/List;Lzls;)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ListButtonComponent extends LinearLayout {

    public static final class a implements tls {
        public static final a a = new a();

        @Override // defpackage.tls
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return zy11.a;
        }
    }

    public /* synthetic */ ListButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addButtons$lambda$0(List list, ButtonComponent buttonComponent, int i, ny6 ny6Var) {
        buttonComponent.setButtonSize(0);
        buttonComponent.setTextSize(13.0f);
        buttonComponent.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int r = i == 0 ? tje.r(mrg0.go_design_s_space, buttonComponent.getContext()) : 0;
        int r2 = i == scc.f(list) ? tje.r(mrg0.go_design_m_space, buttonComponent.getContext()) : tje.u(4, buttonComponent.getContext());
        if (i <= scc.f(list)) {
            layoutParams.setMargins(r, 0, r2, 0);
        }
        buttonComponent.setLayoutParams(layoutParams);
        buttonComponent.setText(ny6Var.b);
        buttonComponent.setButtonBackground(ny6Var.a);
        buttonComponent.setButtonTitleColor(ny6Var.c);
        buttonComponent.setDebounceClickListener(new dhv(26, ny6Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addButtons$lambda$0$0(ny6 ny6Var) {
        ny6Var.d.invoke();
    }

    private final void createButtonComponent(int index, tls action) {
        View childAt = getChildAt(index);
        ButtonComponent buttonComponent = childAt instanceof ButtonComponent ? (ButtonComponent) childAt : null;
        if (buttonComponent == null) {
            ButtonComponent buttonComponent2 = new ButtonComponent(getContext(), null, 0, 6, null);
            addView(buttonComponent2);
            buttonComponent = buttonComponent2;
        }
        action.invoke(buttonComponent);
    }

    public static /* synthetic */ void createButtonComponent$default(ListButtonComponent listButtonComponent, int i, tls tlsVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            tlsVar = a.a;
        }
        View childAt = listButtonComponent.getChildAt(i);
        ButtonComponent buttonComponent = childAt instanceof ButtonComponent ? (ButtonComponent) childAt : null;
        if (buttonComponent == null) {
            ButtonComponent buttonComponent2 = new ButtonComponent(listButtonComponent.getContext(), null, 0, 6, null);
            listButtonComponent.addView(buttonComponent2);
            buttonComponent = buttonComponent2;
        }
        tlsVar.invoke(buttonComponent);
    }

    public final <T> void addButtons(List<? extends T> buttons, zls onEach) {
        int i = 0;
        for (T t : buttons) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            View childAt = getChildAt(i);
            ButtonComponent buttonComponent = childAt instanceof ButtonComponent ? (ButtonComponent) childAt : null;
            if (buttonComponent == null) {
                ButtonComponent buttonComponent2 = new ButtonComponent(getContext(), null, 0, 6, null);
                addView(buttonComponent2);
                buttonComponent = buttonComponent2;
            }
            onEach.invoke(buttonComponent, Integer.valueOf(i), t);
            i = i2;
        }
        if (buttons.size() < getChildCount()) {
            removeViews(buttons.size(), getChildCount() - buttons.size());
        }
    }

    public ListButtonComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        setGravity(17);
    }

    public ListButtonComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void addButtons(List<ny6> buttons) {
        addButtons(buttons, new lr1(buttons, 1));
    }
}
