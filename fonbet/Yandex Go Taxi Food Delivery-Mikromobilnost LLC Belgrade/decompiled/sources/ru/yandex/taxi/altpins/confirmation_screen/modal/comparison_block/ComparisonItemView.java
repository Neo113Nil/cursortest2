package ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import defpackage.ax1;
import defpackage.bdh0;
import defpackage.cma1;
import defpackage.dv31;
import defpackage.gph0;
import defpackage.kvc;
import defpackage.l7b;
import defpackage.lvc;
import defpackage.mfb;
import defpackage.mrg0;
import defpackage.mvc;
import defpackage.ny61;
import defpackage.qg;
import defpackage.tje;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/yandex/taxi/altpins/confirmation_screen/modal/comparison_block/ComparisonItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkvc;", ClidProvider.STATE, "oldState", "Lzy11;", "renderTitle", "(Lkvc;Lkvc;)V", "renderPrice", "", "checked", "setChecked", "(Z)V", "setAccessibilityDescription", "(Lkvc;)V", "render", "Llvc;", "listener", "setOnCheckListener", "(Llvc;)V", "Lmvc;", "binding", "Lmvc;", "Lmfb;", "checkDrawableProvider", "Lmfb;", "Lqg;", "accessibilityDelegate", "Lqg;", "Ldv31;", "stateHolder", "Ldv31;", "onCheckListener", "Llvc;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComparisonItemView extends ConstraintLayout {
    private final qg accessibilityDelegate;
    private final mvc binding;
    private final mfb checkDrawableProvider;
    private lvc onCheckListener;
    private final dv31 stateHolder;

    public ComparisonItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(gph0.comparison_item_view, this);
        int i2 = bdh0.checkbox;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = bdh0.price;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView != null) {
                i2 = bdh0.subtitle;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView2 != null) {
                    i2 = bdh0.time;
                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, this);
                    if (robotoTextView3 != null) {
                        i2 = bdh0.title;
                        RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i2, this);
                        if (robotoTextView4 != null) {
                            this.binding = new mvc(this, imageView, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4);
                            this.checkDrawableProvider = new mfb(context, attributeSet, i);
                            qg qgVar = new qg();
                            this.accessibilityDelegate = qgVar;
                            this.stateHolder = new ax1(this, new kvc(0), this, 2);
                            int r = tje.r(mrg0.go_design_s_space, getContext());
                            int r2 = tje.r(mrg0.go_design_m_space, getContext());
                            setPadding(r2, r, r2, r);
                            b.p(this, qgVar);
                            c.z(new l7b(29, this), this);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(ComparisonItemView comparisonItemView) {
        lvc lvcVar = comparisonItemView.onCheckListener;
        if (lvcVar != null) {
            lvcVar.a(((kvc) comparisonItemView.stateHolder.d).f);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPrice(kvc state, kvc oldState) {
        mvc mvcVar = this.binding;
        mvcVar.c.setText(state.c);
        boolean z = state.e;
        if (z != oldState.e || oldState.equals(kvc.h)) {
            RobotoTextView robotoTextView = mvcVar.c;
            ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.bottomToBottom = z ? -1 : getId();
            robotoTextView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTitle(kvc state, kvc oldState) {
        mvc mvcVar = this.binding;
        mvcVar.f.setText(state.a);
        boolean z = state.e;
        if (z != oldState.e || oldState.equals(kvc.h)) {
            RobotoTextView robotoTextView = mvcVar.f;
            ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.bottomToBottom = z ? -1 : getId();
            robotoTextView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAccessibilityDescription(kvc state) {
        boolean z = state.e;
        String str = state.c;
        String str2 = state.a;
        setContentDescription(z ? String.format("%s, %s, %s, %s", Arrays.copyOf(new Object[]{str2, state.b, str, state.g}, 4)) : String.format("%s, %s", Arrays.copyOf(new Object[]{str2, str}, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChecked(boolean checked) {
        mvc mvcVar = this.binding;
        mfb mfbVar = this.checkDrawableProvider;
        mvcVar.b.setImageDrawable(checked ? mfbVar.a() : mfbVar.b());
        this.accessibilityDelegate.a = checked;
    }

    public final void render(kvc state) {
        this.stateHolder.g(state, false, false);
    }

    public final void setOnCheckListener(lvc listener) {
        this.onCheckListener = listener;
    }

    public ComparisonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComparisonItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ComparisonItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
