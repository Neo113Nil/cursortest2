package ru.yandex.taxi.order.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.taxi.order.feedback.ui.FeedbackQuestionView;
import com.yandex.go.taxi.order.feedback.ui.FeedbackSelectorQuestionView;
import com.yandex.go.taxi.order.feedback.ui.k;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.tips.ui.TipsView;
import defpackage.bgz0;
import defpackage.biz0;
import defpackage.ci70;
import defpackage.dm21;
import defpackage.f0g;
import defpackage.fxx0;
import defpackage.hvq;
import defpackage.iey;
import defpackage.isq;
import defpackage.jl40;
import defpackage.jln;
import defpackage.l0g;
import defpackage.mum;
import defpackage.n0g;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.on2;
import defpackage.orq;
import defpackage.p8h0;
import defpackage.pwf0;
import defpackage.q5z;
import defpackage.qke;
import defpackage.qvq;
import defpackage.r8i0;
import defpackage.rp31;
import defpackage.s8i0;
import defpackage.sb2;
import defpackage.sho;
import defpackage.t8i0;
import defpackage.vb3;
import defpackage.vtq;
import defpackage.w511;
import defpackage.w7i0;
import defpackage.wtq;
import defpackage.wuz;
import defpackage.xtq;
import defpackage.yh70;
import defpackage.za80;
import defpackage.zkh0;
import defpackage.zuj0;
import defpackage.zxf0;
import defpackage.zzf;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.view.FeedbackMvpView;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001wB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b)\u0010'J\u0017\u0010+\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\r2\u0006\u00107\u001a\u000200H\u0016¢\u0006\u0004\b8\u00103J\u0017\u0010;\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\r2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\r2\u0006\u0010:\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u000200¢\u0006\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010U\u001a\u00020T8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010>\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010rR\u0011\u0010v\u001a\u00020s8F¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006x"}, d2 = {"Lru/yandex/taxi/order/view/FeedbackView;", "Landroid/widget/FrameLayout;", "Lru/yandex/taxi/order/view/FeedbackMvpView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lfxx0;", "component", "Lzy11;", "init", "(Lfxx0;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "Lr8i0;", IssuingDistributionPointExtension.REASONS, "showRatingReasons", "(Ljava/util/List;)V", "Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;", ClidProvider.STATE, "setRatingReasonsState", "(Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;)V", "Lt8i0;", "ratingReasonsUiState", "showRatingReasonsUiState", "(Lt8i0;)V", "Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "type", "setRatingReasonsType", "(Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;)V", "", "comment", "showComment", "(Ljava/lang/String;)V", "value", "showTipsInput", "Lbiz0;", "updateTips", "(Lbiz0;)V", "Lxtq;", "updateFeedbackQuestion", "(Lxtq;)V", "", "starsClickable", "setStarsClickable", "(Z)V", "rating", "showRating", "(I)V", "isVisible", "setRatingVisibility", "Landroid/view/View$OnClickListener;", "onClickListener", "setOnCommentClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/yandex/taxi/order/view/FeedbackView$a;", "ratingChangeListener", "setRatingBarChangeListener", "(Lru/yandex/taxi/order/view/FeedbackView$a;)V", "Ls8i0;", "setOnRatingReasonClickListener", "(Ls8i0;)V", "isExpanded", "()Z", "Lcom/yandex/go/taxi/order/feedback/ui/k;", "presenter", "Lcom/yandex/go/taxi/order/feedback/ui/k;", "getPresenter", "()Lcom/yandex/go/taxi/order/feedback/ui/k;", "setPresenter", "(Lcom/yandex/go/taxi/order/feedback/ui/k;)V", "Lney;", "lifecycleObservable", "Lney;", "getLifecycleObservable", "()Lney;", "setLifecycleObservable", "(Lney;)V", "Lza80;", "orderViewUiListener", "Lza80;", "getOrderViewUiListener", "()Lza80;", "setOrderViewUiListener", "(Lza80;)V", "Lcom/yandex/go/tips/ui/TipsView;", "tipsView", "Lcom/yandex/go/tips/ui/TipsView;", "Lru/yandex/taxi/order/view/RatingView;", "ratingView", "Lru/yandex/taxi/order/view/RatingView;", "Lcom/yandex/go/taxi/order/feedback/ui/FeedbackQuestionView;", "feedbackQuestionView", "Lcom/yandex/go/taxi/order/feedback/ui/FeedbackQuestionView;", "Lcom/yandex/go/taxi/order/feedback/ui/FeedbackSelectorQuestionView;", "feedbackSelectorQuestionView", "Lcom/yandex/go/taxi/order/feedback/ui/FeedbackSelectorQuestionView;", "ratingReasonsState", "Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;", "Liey;", "lifecycleObserver", "Liey;", "ratingBarChangeListener", "Lru/yandex/taxi/order/view/FeedbackView$a;", "Lwtq;", "feedbackQuestionListener", "Lwtq;", "Lw7i0;", "Lw7i0;", "Landroid/view/View;", "getStarsView", "()Landroid/view/View;", "starsView", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeedbackView extends FrameLayout implements FeedbackMvpView {
    public static final int $stable = 8;
    private final wtq feedbackQuestionListener;
    private final FeedbackQuestionView feedbackQuestionView;
    private final FeedbackSelectorQuestionView feedbackSelectorQuestionView;
    public ney lifecycleObservable;
    private final iey lifecycleObserver;
    public za80 orderViewUiListener;
    public k presenter;
    private a ratingBarChangeListener;
    private final w7i0 ratingChangeListener;
    private FeedbackMvpView.RatingReasonsState ratingReasonsState;
    private final RatingView ratingView;
    private final TipsView tipsView;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/order/view/FeedbackView$a;", "Lw7i0;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends w7i0, zxf0 {
    }

    public FeedbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, zkh0.feedback_view, true);
        int i2 = p8h0.tips_rating;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.tipsView = (TipsView) ((View) rp31.d(this, i2));
        this.ratingView = (RatingView) ((View) rp31.d(this, p8h0.rating));
        this.feedbackQuestionView = (FeedbackQuestionView) ((View) rp31.d(this, p8h0.feedback_question));
        this.feedbackSelectorQuestionView = (FeedbackSelectorQuestionView) ((View) rp31.d(this, p8h0.feedback_selector_question));
        this.lifecycleObserver = new vb3(5, this);
        this.ratingBarChangeListener = (a) ((zxf0) pwf0.c(a.class));
        this.feedbackQuestionListener = new jln(17, this);
        this.ratingChangeListener = new qvq(0, context, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ratingChangeListener$lambda$0(Context context, FeedbackView feedbackView, float f, boolean z) {
        if (z) {
            qke.v(context);
        }
        k presenter = feedbackView.getPresenter();
        int i = (int) f;
        TaxiOrder taxiOrder = presenter.J;
        if (z) {
            orq orqVar = presenter.C;
            String str = taxiOrder.a;
            yh70 yh70Var = orqVar.d;
            String b = ((ci70) orqVar.c).b(str);
            String valueOf = String.valueOf(i);
            yh70Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(MetaDataField.SCREEN_FIELD, b);
            hashMap.put("rating", valueOf);
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            yh70Var.a.a(sb2.q("${screen}.DidChangeRating", hashMap), hashMap, 1, hashMap2);
            wuz wuzVar = presenter.G;
            isq isqVar = presenter.K;
            int i2 = isqVar.j;
            wuzVar.getClass();
            wuz.a(taxiOrder, isqVar, i2, i);
            presenter.K.j = i;
            presenter.Ng();
            presenter.Og();
        }
        feedbackView.ratingBarChangeListener.h(f, z);
    }

    public final ney getLifecycleObservable() {
        ney neyVar = this.lifecycleObservable;
        if (neyVar != null) {
            return neyVar;
        }
        return null;
    }

    public final za80 getOrderViewUiListener() {
        za80 za80Var = this.orderViewUiListener;
        if (za80Var != null) {
            return za80Var;
        }
        return null;
    }

    public final k getPresenter() {
        k kVar = this.presenter;
        if (kVar != null) {
            return kVar;
        }
        return null;
    }

    public final View getStarsView() {
        return this.ratingView.getStarsView();
    }

    public final void init(fxx0 component) {
        n0g n0gVar = (n0g) component;
        zzf zzfVar = n0gVar.b;
        dm21 dm21Var = (dm21) zzfVar.D7.get();
        com.yandex.go.taxi.order.repositories.c cVar = (com.yandex.go.taxi.order.repositories.c) zzfVar.bb.get();
        vtq vtqVar = (vtq) zzfVar.yr.get();
        l0g l0gVar = n0gVar.f;
        o2y0 o2y0Var = l0gVar.a.a;
        q5z.i(o2y0Var);
        hvq hvqVar = (hvq) zzfVar.B7.get();
        f0g f0gVar = n0gVar.e;
        this.presenter = new k(dm21Var, cVar, vtqVar, o2y0Var, hvqVar, f0gVar.Z(), (bgz0) l0gVar.n.get(), new com.yandex.go.taxi.order.feedback.domain.a((on2) f0gVar.w.w0.get()), (zuj0) zzfVar.W.get(), new wuz());
        this.lifecycleObservable = (ney) n0gVar.c.E0.get();
        this.orderViewUiListener = n0gVar.a.a;
        this.ratingView.init(component);
    }

    public final boolean isExpanded() {
        return this.ratingView.getVisibility() == 0 || this.tipsView.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        getLifecycleObservable().a(this.lifecycleObserver, this);
        getPresenter().Kg(this);
        this.ratingView.addOnRatingBarChangeListener(this.ratingChangeListener);
        this.tipsView.setButtonToggledListener(new mum(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLifecycleObservable().d(this);
        getPresenter().Cg();
        this.ratingView.removeOnRatingBarChangeListener(this.ratingChangeListener);
        this.tipsView.setButtonToggledListener(null);
        this.feedbackQuestionView.setAnswerListener(null);
    }

    public final void setLifecycleObservable(ney neyVar) {
        this.lifecycleObservable = neyVar;
    }

    public final void setOnCommentClickListener(View.OnClickListener onClickListener) {
        this.ratingView.setOnCommentClickListener(onClickListener);
    }

    public final void setOnRatingReasonClickListener(s8i0 onClickListener) {
        this.ratingView.setRatingReasonClickListener(onClickListener);
    }

    public final void setOrderViewUiListener(za80 za80Var) {
        this.orderViewUiListener = za80Var;
    }

    public final void setPresenter(k kVar) {
        this.presenter = kVar;
    }

    public final void setRatingBarChangeListener(a ratingChangeListener) {
        this.ratingBarChangeListener = ratingChangeListener;
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void setRatingReasonsState(FeedbackMvpView.RatingReasonsState state) {
        if (this.ratingReasonsState != state) {
            this.ratingReasonsState = state;
            this.ratingView.updateReasonsState(state);
            FeedbackMvpView.RatingReasonsState ratingReasonsState = this.ratingReasonsState;
            int i = ratingReasonsState == null ? -1 : ru.yandex.taxi.order.view.a.a[ratingReasonsState.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2 || i == 3) {
                    this.ratingView.setRatingReasonsVisible(true);
                } else if (i == 4) {
                    this.ratingView.setRatingReasonsVisible(false);
                } else {
                    w511.b();
                }
            }
        }
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void setRatingReasonsType(FeedbackStrategy.FeedbackType type, FeedbackMvpView.RatingReasonsState state) {
        this.ratingView.setRatingReasonsType(type, state);
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void setRatingVisibility(boolean isVisible) {
        this.ratingView.setVisibility(isVisible ? 0 : 8);
    }

    public final void setStarsClickable(boolean starsClickable) {
        this.ratingView.setStarsClickable(starsClickable);
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void showComment(String comment) {
        if (jl40.l(comment, this.ratingView.getComment())) {
            return;
        }
        this.ratingView.setComment(comment);
        k presenter = getPresenter();
        presenter.K.k = comment;
        presenter.Ng();
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void showRating(int rating) {
        this.ratingView.setRating(rating);
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void showRatingReasons(List<r8i0> reasons) {
        this.ratingView.setTags(reasons);
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void showRatingReasonsUiState(t8i0 ratingReasonsUiState) {
        this.ratingView.setUiState(ratingReasonsUiState);
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void showTipsInput(String value) {
        getOrderViewUiListener().Le(value);
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void updateFeedbackQuestion(xtq state) {
        this.feedbackQuestionView.setVisibility(8);
        this.feedbackSelectorQuestionView.setVisibility(8);
        if (jl40.l(state, xtq.f)) {
            this.feedbackSelectorQuestionView.setAnswerListener(null);
            this.feedbackQuestionView.setAnswerListener(null);
            return;
        }
        boolean z = state.e;
        String str = state.b;
        if (z) {
            getPresenter().Lg(str);
            this.feedbackSelectorQuestionView.setVisibility(0);
            this.feedbackSelectorQuestionView.update(state);
            this.feedbackSelectorQuestionView.setAnswerListener(this.feedbackQuestionListener);
            return;
        }
        getPresenter().Lg(str);
        this.feedbackQuestionView.setVisibility(0);
        this.feedbackQuestionView.update(state);
        this.feedbackQuestionView.setAnswerListener(this.feedbackQuestionListener);
    }

    @Override // ru.yandex.taxi.order.view.FeedbackMvpView
    public void updateTips(biz0 state) {
        boolean z = state.b;
        TipsView tipsView = this.tipsView;
        if (!z) {
            tipsView.setVisibility(8);
        } else {
            tipsView.setModelsGroup(state.a);
            this.tipsView.setVisibility(0);
        }
    }

    public FeedbackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FeedbackView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FeedbackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
