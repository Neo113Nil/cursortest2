package ru.yandex.taxi.order.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.go.taxi.order.feedback.domain.model.TitleShownStrategy;
import com.yandex.go.taxi.order.feedback.tag.TagRatingReasonsView;
import com.yandex.go.taxi.order.feedback.ui.AchievementsView;
import defpackage.fxx0;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.mg;
import defpackage.msq;
import defpackage.n0g;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.qmp;
import defpackage.r100;
import defpackage.r8i0;
import defpackage.rp31;
import defpackage.s8i0;
import defpackage.t8i0;
import defpackage.w511;
import defpackage.w7i0;
import defpackage.wm;
import defpackage.x8i0;
import defpackage.xng0;
import defpackage.zkh0;
import defpackage.zzf;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.view.FeedbackMvpView;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0014¢\u0006\u0004\b&\u0010%J\u001b\u0010*\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b,\u0010\u0010J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u000e2\u0006\u00102\u001a\u000201¢\u0006\u0004\b5\u00104J\u0017\u00107\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b7\u0010\u001aJ\r\u00108\u001a\u00020\u0017¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020:¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0006¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010G¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020:¢\u0006\u0004\bM\u0010=R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010SR\u0016\u0010Y\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0011\u0010g\u001a\u00020d8F¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006h"}, d2 = {"Lru/yandex/taxi/order/view/RatingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "type", "Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;", ClidProvider.STATE, "Lzy11;", "updateReasons", "(Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;)V", "Lru/yandex/taxi/order/feedback/b;", "getReasonsForType", "(Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;)Lru/yandex/taxi/order/feedback/b;", "currentReasons", "getAllRatingReasons", "(Lru/yandex/taxi/order/feedback/b;Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;)Lru/yandex/taxi/order/feedback/b;", "", "textHint", "setRatingTextHint", "(Ljava/lang/String;)V", "title", "Lcom/yandex/go/taxi/order/feedback/domain/model/TitleShownStrategy;", "shownStrategy", "setTitle", "(Ljava/lang/String;Lcom/yandex/go/taxi/order/feedback/domain/model/TitleShownStrategy;)V", "Lfxx0;", "component", "init", "(Lfxx0;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "Lr8i0;", "ratingReasons", "setTags", "(Ljava/util/List;)V", "setRatingReasonsType", "Lt8i0;", "uiState", "setUiState", "(Lt8i0;)V", "Lw7i0;", "listener", "addOnRatingBarChangeListener", "(Lw7i0;)V", "removeOnRatingBarChangeListener", "comment", "setComment", "getComment", "()Ljava/lang/String;", "", "isVisible", "setRatingReasonsVisible", "(Z)V", "isContentVisible", "()Z", "rating", "setRating", "(I)V", "Ls8i0;", "onClickListener", "setRatingReasonClickListener", "(Ls8i0;)V", "Landroid/view/View$OnClickListener;", "setOnCommentClickListener", "(Landroid/view/View$OnClickListener;)V", "updateReasonsState", "(Lru/yandex/taxi/order/view/FeedbackMvpView$RatingReasonsState;)V", "clickable", "setStarsClickable", "Lru/yandex/taxi/design/RatingBarComponent;", "ratingBar", "Lru/yandex/taxi/design/RatingBarComponent;", "Landroid/widget/TextView;", "ratingTextHintView", "Landroid/widget/TextView;", "commentView", "Lru/yandex/taxi/design/ListItemComponent;", "ratingTitleAboveReasons", "Lru/yandex/taxi/design/ListItemComponent;", "ratingTitleAboveComment", "reasonOnClickListener", "Ls8i0;", "Lru/yandex/taxi/order/feedback/b;", "Lmsq;", "feedbackDependencies", "Lmsq;", "Lwm;", "achievementsAdapter", "Lwm;", "ratingChangeListener", "Lw7i0;", "Landroid/view/View;", "getStarsView", "()Landroid/view/View;", "starsView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public class RatingView extends LinearLayout {
    public static final int $stable = 8;
    private wm achievementsAdapter;
    private final TextView commentView;
    private msq feedbackDependencies;
    private final RatingBarComponent ratingBar;
    private final w7i0 ratingChangeListener;
    private ru.yandex.taxi.order.feedback.b ratingReasons;
    private final TextView ratingTextHintView;
    private final TextView ratingTitleAboveComment;
    private final ListItemComponent ratingTitleAboveReasons;
    private s8i0 reasonOnClickListener;

    public RatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, zkh0.rating_view, true);
        int i2 = p8h0.rating_bar;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        RatingBarComponent ratingBarComponent = (RatingBarComponent) ((View) rp31.d(this, i2));
        this.ratingBar = ratingBarComponent;
        this.ratingTextHintView = (TextView) ((View) rp31.d(this, p8h0.rating_hint_text));
        TextView textView = (TextView) ((View) rp31.d(this, p8h0.comment));
        this.commentView = textView;
        this.ratingTitleAboveReasons = (ListItemComponent) ((View) rp31.d(this, p8h0.rating_title_above_reasons));
        this.ratingTitleAboveComment = (TextView) ((View) rp31.d(this, p8h0.rating_title_above_comment));
        this.reasonOnClickListener = new r100();
        setOrientation(1);
        ratingBarComponent.setStarScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ratingBarComponent.setSelectedStarColor(xng0.controlMain);
        ratingBarComponent.setStarColor(xng0.controlMinor);
        androidx.core.view.b.p(textView, new mg(28, this));
        this.ratingChangeListener = new x8i0(0, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.util.AttributeSet, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ru.yandex.taxi.order.feedback.b] */
    /* JADX WARN: Type inference failed for: r1v8 */
    private final ru.yandex.taxi.order.feedback.b getAllRatingReasons(ru.yandex.taxi.order.feedback.b currentReasons, FeedbackMvpView.RatingReasonsState state) {
        int i = state == null ? -1 : c.b[state.ordinal()];
        if (i == 1) {
            r1 = currentReasons instanceof AchievementsView ? (AchievementsView) currentReasons : 0;
            return r1 == 0 ? new AchievementsView(getContext(), this.achievementsAdapter) : r1;
        }
        int i2 = 2;
        if (i != 2) {
            AllRatingReasonsView allRatingReasonsView = currentReasons instanceof AllRatingReasonsView ? (AllRatingReasonsView) currentReasons : null;
            return allRatingReasonsView == null ? new AllRatingReasonsView(getContext(), r1, i2, r1) : allRatingReasonsView;
        }
        msq msqVar = this.feedbackDependencies;
        if (msqVar == null) {
            return new AllRatingReasonsView(getContext(), r1, i2, r1);
        }
        TagRatingReasonsView tagRatingReasonsView = currentReasons instanceof TagRatingReasonsView ? (TagRatingReasonsView) currentReasons : null;
        return tagRatingReasonsView == null ? new TagRatingReasonsView(getContext(), msqVar) : tagRatingReasonsView;
    }

    private final ru.yandex.taxi.order.feedback.b getReasonsForType(FeedbackStrategy.FeedbackType type, FeedbackMvpView.RatingReasonsState state) {
        ru.yandex.taxi.order.feedback.b bVar = this.ratingReasons;
        if (c.a[type.ordinal()] == 1) {
            return getAllRatingReasons(bVar, state);
        }
        if (bVar instanceof LowRatingReasonsView) {
            return bVar;
        }
        return new LowRatingReasonsView(getContext(), null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ratingChangeListener$lambda$0(RatingView ratingView, float f, boolean z) {
        if (z) {
            ratingView.ratingBar.startSelectionAnimation((int) f);
        }
    }

    private final void setRatingTextHint(String textHint) {
        if (textHint == null || textHint.length() == 0) {
            this.ratingTextHintView.setVisibility(8);
        } else {
            this.ratingTextHintView.setVisibility(0);
            this.ratingTextHintView.setText(textHint);
        }
    }

    private final void setTitle(String title, TitleShownStrategy shownStrategy) {
        int i = c.c[shownStrategy.ordinal()];
        if (i == 1) {
            this.ratingTitleAboveReasons.setVisibility(8);
            this.ratingTitleAboveComment.setVisibility(8);
            return;
        }
        if (i == 2) {
            this.ratingTitleAboveReasons.setVisibility(0);
            this.ratingTitleAboveReasons.setTitle(title);
            this.ratingTitleAboveComment.setVisibility(8);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            this.ratingTitleAboveReasons.setVisibility(8);
            this.ratingTitleAboveComment.setVisibility(0);
            this.ratingTitleAboveComment.setText(title);
        }
    }

    private final void updateReasons(FeedbackStrategy.FeedbackType type, FeedbackMvpView.RatingReasonsState state) {
        ru.yandex.taxi.order.feedback.b bVar = this.ratingReasons;
        ru.yandex.taxi.order.feedback.b reasonsForType = getReasonsForType(type, state);
        this.ratingReasons = reasonsForType;
        if (jl40.l(bVar, reasonsForType)) {
            return;
        }
        if (bVar != null) {
            removeView(bVar.getView());
            reasonsForType.animateFirstData();
        }
        addView(reasonsForType.getView(), indexOfChild(this.ratingTitleAboveReasons) + 1);
        reasonsForType.setOnReasonClickListener(this.reasonOnClickListener);
    }

    public final void addOnRatingBarChangeListener(w7i0 listener) {
        this.ratingBar.addOnRatingBarChangeListener(listener);
    }

    public final String getComment() {
        return this.commentView.getText().toString();
    }

    public final View getStarsView() {
        return this.ratingBar;
    }

    public final void init(fxx0 component) {
        zzf zzfVar = ((n0g) component).b;
        this.feedbackDependencies = new msq((pav) zzfVar.p3.get(), (k7x0) zzfVar.M3.get(), (qmp) zzfVar.D.get());
        this.achievementsAdapter = (wm) ((n0g) component).e.F0.get();
    }

    public final boolean isContentVisible() {
        View view;
        ru.yandex.taxi.order.feedback.b bVar = this.ratingReasons;
        return !(bVar == null || (view = bVar.getView()) == null || view.getVisibility() != 0) || this.commentView.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ratingBar.addOnRatingBarChangeListener(this.ratingChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ratingBar.removeOnRatingBarChangeListener(this.ratingChangeListener);
    }

    public final void removeOnRatingBarChangeListener(w7i0 listener) {
        this.ratingBar.removeOnRatingBarChangeListener(listener);
    }

    public final void setComment(String comment) {
        this.commentView.setText(comment);
    }

    public final void setOnCommentClickListener(View.OnClickListener listener) {
        this.commentView.setOnClickListener(listener);
    }

    public final void setRating(int rating) {
        this.ratingBar.setRating(rating);
    }

    public final void setRatingReasonClickListener(s8i0 onClickListener) {
        this.reasonOnClickListener = onClickListener;
    }

    public final void setRatingReasonsType(FeedbackStrategy.FeedbackType type, FeedbackMvpView.RatingReasonsState state) {
        ru.yandex.taxi.order.feedback.b bVar = this.ratingReasons;
        if (bVar == null || bVar.getRatingType() != type) {
            updateReasons(type, state);
        }
    }

    public final void setRatingReasonsVisible(boolean isVisible) {
        ru.yandex.taxi.order.feedback.b bVar = this.ratingReasons;
        if (bVar != null) {
            bVar.setVisibility(isVisible ? 0 : 8);
        }
    }

    public final void setStarsClickable(boolean clickable) {
        this.ratingBar.setStarsClickable(clickable);
    }

    public final void setTags(List<r8i0> ratingReasons) {
        ru.yandex.taxi.order.feedback.b bVar = this.ratingReasons;
        if (bVar != null) {
            bVar.setData(ratingReasons);
        }
    }

    public final void setUiState(t8i0 uiState) {
        setRatingTextHint(uiState.c);
        setTitle(uiState.a, uiState.b);
        this.commentView.setHint(uiState.e);
        this.commentView.setVisibility(uiState.d ? 0 : 8);
    }

    public final void updateReasonsState(FeedbackMvpView.RatingReasonsState state) {
        ru.yandex.taxi.order.feedback.b bVar = this.ratingReasons;
        if (bVar != null) {
            updateReasons(bVar.getRatingType(), state);
        }
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RatingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RatingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
