package ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import defpackage.c90;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.e9i;
import defpackage.eeh0;
import defpackage.f9i;
import defpackage.g9i;
import defpackage.gl;
import defpackage.hxx;
import defpackage.i9i;
import defpackage.iqh0;
import defpackage.j9i;
import defpackage.jqr;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.oex0;
import defpackage.pep0;
import defpackage.r8i;
import defpackage.tje;
import defpackage.uxh;
import defpackage.w511;
import defpackage.w8i;
import defpackage.wyo0;
import defpackage.x7i;
import defpackage.xng0;
import defpackage.xvy0;
import defpackage.xw31;
import defpackage.z8i;
import defpackage.zch;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.DeliveryExplicitCommentCourierFlowType;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0012\u001bB\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0018\u0010\u0013\u001a\u00060\u0012R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u00060\u0018R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/requirement/common/DeliveryExplicitCommentRequirementBaseView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Le9i;", "presenter", "<init>", "(Landroid/content/Context;Le9i;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Le9i;", "Lf9i;", "mvpView", "Lf9i;", "Lg9i;", "binding", "Lg9i;", "Lru/yandex/taxi/logistics/explicit_comment_courier/requirement/common/DeliveryExplicitCommentRequirementBaseView$DrawListener;", "drawListener", "Lru/yandex/taxi/logistics/explicit_comment_courier/requirement/common/DeliveryExplicitCommentRequirementBaseView$DrawListener;", "DrawListener", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DeliveryExplicitCommentRequirementBaseView extends FrameLayout implements nwy0 {
    private final g9i binding;
    private final DrawListener drawListener;
    private final f9i mvpView;
    private final e9i presenter;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/requirement/common/DeliveryExplicitCommentRequirementBaseView$DrawListener;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "<init>", "(Lru/yandex/taxi/logistics/explicit_comment_courier/requirement/common/DeliveryExplicitCommentRequirementBaseView;)V", "Lzy11;", "onDraw", "()V", "", "wasSeen", "Z", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class DrawListener implements ViewTreeObserver.OnDrawListener {
        private boolean wasSeen;

        public DrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            boolean z = DeliveryExplicitCommentRequirementBaseView.this.isShown() && xw31.i(DeliveryExplicitCommentRequirementBaseView.this);
            if (!this.wasSeen && z) {
                e9i e9iVar = DeliveryExplicitCommentRequirementBaseView.this.presenter;
                tje.N(e9iVar.Jg(), null, null, new DeliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1(e9iVar, null), 3);
                this.wasSeen = true;
            }
            if (!this.wasSeen || z) {
                return;
            }
            this.wasSeen = false;
        }
    }

    public DeliveryExplicitCommentRequirementBaseView(Context context, e9i e9iVar) {
        super(context);
        this.presenter = e9iVar;
        this.mvpView = new f9i(this);
        View inflate = LayoutInflater.from(context).inflate(iqh0.delivery_explicit_comment_requirement, (ViewGroup) this, false);
        addView(inflate);
        AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) inflate;
        int i = eeh0.explicit_comment_list_item_component;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            throw null;
        }
        this.binding = new g9i(autoDividerComponentList, autoDividerComponentList, listItemComponent);
        this.drawListener = new DrawListener();
        listItemComponent.setClickable(true);
        listItemComponent.setDebounceClickListener(new uxh(7, this));
        listItemComponent.setTitleMaxLines(1);
        listItemComponent.setTrailMode(2);
        listItemComponent.setTitleColorAttr(xng0.textMain);
        listItemComponent.setBackgroundResource(dzg0.bg_transparent_ripple);
        listItemComponent.setSubtitleSingleLine(true);
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyTheme$lambda$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(DeliveryExplicitCommentRequirementBaseView deliveryExplicitCommentRequirementBaseView) {
        w8i w8iVar = (w8i) deliveryExplicitCommentRequirementBaseView.presenter;
        gl Kg = w8iVar.Kg();
        int i = 1;
        if (Kg != null) {
            zch zchVar = w8iVar.z;
            zchVar.getClass();
            if (x7i.a[((DeliveryCommentRequirementType) Kg.x).ordinal()] != 1) {
                w511.b();
                return;
            }
            zchVar.n("Summary.SummaryCard.CommentToCourierButton.Tapped", Kg);
        }
        String str = ((oex0) w8iVar.D.getValue()).a;
        if (str != null) {
            z8i z8iVar = (z8i) w8iVar.E.get();
            ((pep0) z8iVar.E.l).f(new wyo0(i, z8iVar), new r8i(str, DeliveryExplicitCommentCourierFlowType.REGULAR, null), hxx.a);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        xvy0.b(this.binding.b, themeType, false, new c90(2));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e9i e9iVar = this.presenter;
        e9iVar.Bg(this.mvpView);
        int i = 3;
        e.H(e9iVar.Jg(), new jqr(e9iVar.y.a(), new DeliveryExplicitCommentRequirementBasePresenter$observeTheme$1(e9iVar, null), i));
        r0 r0Var = e9iVar.D;
        j9i j9iVar = e9iVar.x;
        DeliveryCommentRequirementType deliveryCommentRequirementType = DeliveryCommentRequirementType.COURIER;
        j9iVar.getClass();
        if (i9i.a[deliveryCommentRequirementType.ordinal()] != 1) {
            w511.b();
            return;
        }
        e.H(e9iVar.Jg(), new jqr(new m0(r0Var, e.t(new b(j9iVar.b.b, deliveryCommentRequirementType)), new DeliveryExplicitCommentRequirementBasePresenter$observeState$1(e9iVar, null)), new DeliveryExplicitCommentRequirementBasePresenter$observeState$2(e9iVar, null), i));
        getViewTreeObserver().addOnDrawListener(this.drawListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        getViewTreeObserver().removeOnDrawListener(this.drawListener);
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
