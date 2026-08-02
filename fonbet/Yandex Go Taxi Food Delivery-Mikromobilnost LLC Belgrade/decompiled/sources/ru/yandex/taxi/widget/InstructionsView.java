package ru.yandex.taxi.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.a4w;
import defpackage.aub;
import defpackage.dzg0;
import defpackage.h4w;
import defpackage.h8;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.kp50;
import defpackage.mgu;
import defpackage.nac;
import defpackage.nf5;
import defpackage.obv;
import defpackage.og20;
import defpackage.pav;
import defpackage.qje;
import defpackage.qty;
import defpackage.r7v;
import defpackage.scc;
import defpackage.tls;
import defpackage.v3w;
import defpackage.xng0;
import defpackage.zrh0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\rJ\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010.J\u001f\u00102\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010.J)\u00105\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u001b\u00109\u001a\u00020\u000b2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001007¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010;\u001a\u00020\u0007¢\u0006\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010DR0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR0\u0010M\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u000b\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010K¨\u0006P"}, d2 = {"Lru/yandex/taxi/widget/InstructionsView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Lqty;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateDividers", "()V", "Lru/yandex/taxi/design/ListItemComponent;", "child", "Lh4w;", "item", "bindItem", "(Lru/yandex/taxi/design/ListItemComponent;Lh4w;)V", "setIcon", "Landroid/graphics/drawable/Drawable;", "drawable", "model", "setTintIfActionAbsent", "(Landroid/graphics/drawable/Drawable;Lh4w;)V", "Lv3w;", "button", "bindButton", "(Lru/yandex/taxi/design/ListItemComponent;Lv3w;)V", "La4w;", "action", "bindAction", "(Lru/yandex/taxi/design/ListItemComponent;La4w;)V", "setupLayoutTransition", "Lpav;", "imageLoader", "init", "(Lpav;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "position", "count", "onInserted", "(II)V", "onRemoved", "fromPosition", "toPosition", "onMoved", "", "payload", "onChanged", "(IILjava/lang/Object;)V", "", "items", "setInstructions", "(Ljava/util/List;)V", "maxChildCount", "Landroid/view/View;", "getBottommostChild", "(I)Landroid/view/View;", "callbacks", "Lqty;", "", "instructions", "Ljava/util/List;", "Lpav;", "Lkotlin/Function1;", "onItemClickListener", "Ltls;", "getOnItemClickListener", "()Ltls;", "setOnItemClickListener", "(Ltls;)V", "Lw3w;", "onButtonClickListener", "getOnButtonClickListener", "setOnButtonClickListener", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstructionsView extends GoLinearLayout implements qty {
    public static final int $stable = 8;
    private final qty callbacks;
    private pav imageLoader;
    private final List<h4w> instructions;
    private tls onButtonClickListener;
    private tls onItemClickListener;

    public InstructionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        this.callbacks = new nf5(this);
        this.instructions = new ArrayList();
        setOrientation(1);
        setupLayoutTransition();
    }

    private final void bindAction(ListItemComponent child, a4w action) {
        child.setTrailMode(2);
        child.setBackgroundResource(dzg0.bg_transparent_ripple);
        child.setDebounceClickListener(new r7v(3, this, action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAction$lambda$0(InstructionsView instructionsView, a4w a4wVar) {
        tls tlsVar = instructionsView.onItemClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(a4wVar);
        }
    }

    private final void bindButton(ListItemComponent child, v3w button) {
        ButtonComponent buttonComponent = (ButtonComponent) child.getTrailViewAs(ButtonComponent.class);
        if (buttonComponent == null) {
            buttonComponent = (ButtonComponent) child.inflateTrailView(zrh0.instruction_item_button);
        }
        buttonComponent.setText(button.a);
        buttonComponent.setDebounceClickListener(new r7v(4, this, button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindButton$lambda$0(InstructionsView instructionsView, v3w v3wVar) {
        tls tlsVar = instructionsView.onButtonClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(v3wVar.b);
        }
    }

    private final void bindItem(ListItemComponent child, h4w item) {
        child.setTitle(Html.fromHtml(item.a, 0));
        String str = item.b;
        if (str == null || str.length() == 0) {
            child.setSubtitle((CharSequence) null);
        } else {
            if (str == null) {
                str = "";
            }
            child.setSubtitle(Html.fromHtml(str, 0));
        }
        child.setBackgroundColor((kdc) null);
        setIcon(child, item);
        v3w v3wVar = item.f;
        a4w a4wVar = item.e;
        if (v3wVar != null) {
            bindButton(child, v3wVar);
        } else if (a4wVar != null) {
            bindAction(child, a4wVar);
        } else {
            child.clearTrailView();
        }
    }

    private final void setIcon(ListItemComponent child, h4w item) {
        String str = item.c;
        int i = item.d;
        if (str.length() == 0) {
            child.getLeadImageView().setImageResource(i);
            return;
        }
        pav pavVar = this.imageLoader;
        if (pavVar == null) {
            pavVar = null;
        }
        nac nacVar = (nac) pavVar.a(child.getLeadImageView());
        nacVar.e(i);
        nacVar.h = new mgu(10, this, item);
        nacVar.b(new obv(str, null, 6, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setIcon$lambda$0(InstructionsView instructionsView, h4w h4wVar, Drawable drawable) {
        instructionsView.setTintIfActionAbsent(drawable, h4wVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean setInstructions$lambda$0(h4w h4wVar, h4w h4wVar2) {
        return Boolean.valueOf(jl40.l(h4wVar.a, h4wVar2.a));
    }

    private final void setTintIfActionAbsent(Drawable drawable, h4w model) {
        if (model.e == null) {
            drawable.setTint(qje.t(xng0.textMain, getContext()));
        }
    }

    private final void setupLayoutTransition() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(0, 0L);
        layoutTransition.setDuration(1, 0L);
        layoutTransition.setDuration(3, 0L);
        layoutTransition.setDuration(2, 0L);
        layoutTransition.setDuration(4, 0L);
        setLayoutTransition(layoutTransition);
    }

    private final void updateDividers() {
        int size = this.instructions.size();
        for (int i = 0; i < size; i++) {
            View childAt = getChildAt(i);
            ListItemComponent listItemComponent = childAt instanceof ListItemComponent ? (ListItemComponent) childAt : null;
            if (listItemComponent != null) {
                if (i == 0) {
                    listItemComponent.setDividers(DividerPosition.TOP, DividerType.NONE);
                } else {
                    listItemComponent.setDividers(DividerPosition.TOP, DividerType.ICON_MARGIN);
                }
                bindItem(listItemComponent, this.instructions.get(i));
            }
        }
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        h8 h8Var = new h8(3, this);
        int i = 0;
        while (h8Var.hasNext()) {
            Object next = h8Var.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            setIcon((ListItemComponent) ((View) next), this.instructions.get(i));
            i = i2;
        }
    }

    public final View getBottommostChild(int maxChildCount) {
        if (getVisibility() != 0 || getChildCount() == 0 || maxChildCount < 1) {
            return null;
        }
        return getChildCount() >= maxChildCount ? getChildAt(maxChildCount - 1) : getChildAt(getChildCount() - 1);
    }

    public final tls getOnButtonClickListener() {
        return this.onButtonClickListener;
    }

    public final tls getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final void init(pav imageLoader) {
        this.imageLoader = imageLoader;
    }

    @Override // defpackage.qty
    public void onChanged(int position, int count, Object payload) {
        for (int i = 0; i < count; i++) {
            int i2 = position + i;
            bindItem((ListItemComponent) getChildAt(i2), this.instructions.get(i2));
        }
    }

    @Override // defpackage.qty
    public void onInserted(int position, int count) {
        for (int i = 0; i < count; i++) {
            addView(new ListItemComponent(getContext(), null, 0, 6, null), position + i, new ViewGroup.LayoutParams(-1, -2));
        }
        updateDividers();
    }

    @Override // defpackage.qty
    public void onMoved(int fromPosition, int toPosition) {
        ListItemComponent listItemComponent = (ListItemComponent) getChildAt(fromPosition);
        removeViewAt(fromPosition);
        addView(listItemComponent, toPosition);
        updateDividers();
    }

    @Override // defpackage.qty
    public void onRemoved(int position, int count) {
        removeViews(position, count);
        updateDividers();
    }

    public final void setInstructions(List<h4w> items) {
        if (items.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        androidx.recyclerview.widget.i f = kp50.f(new og20(this.instructions, items, new aub(10)), true);
        this.instructions.clear();
        this.instructions.addAll(items);
        f.a(this.callbacks);
    }

    public final void setOnButtonClickListener(tls tlsVar) {
        this.onButtonClickListener = tlsVar;
    }

    public final void setOnItemClickListener(tls tlsVar) {
        this.onItemClickListener = tlsVar;
    }

    public InstructionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public InstructionsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ InstructionsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
