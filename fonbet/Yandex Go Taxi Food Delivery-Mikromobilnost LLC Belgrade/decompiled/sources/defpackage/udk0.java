package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardDriverSimpleSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPickupCodeView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.comment.RideCardCommentItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.question.FeedbackQuestionLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.question.FeedbackQuestionSelectorLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_reasons.RideCardRatingReasonsSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardCoherentRatingSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardRatingSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector.RideCardTipsSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector.RideCardTipsWishSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.RideCardProgressBarItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a0;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b0;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.f;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.l;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.m;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.n;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.o;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.s;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.t;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.u;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.v;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.w;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.z;
import ru.yandex.taxi.design.SliderButtonView;

/* loaded from: classes14.dex */
public final /* synthetic */ class udk0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9y0 b;
    public final /* synthetic */ g c;

    public /* synthetic */ udk0(g gVar, p9y0 p9y0Var) {
        this.a = 15;
        this.c = gVar;
        this.b = p9y0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        g gVar = this.c;
        p9y0 p9y0Var = this.b;
        switch (i) {
            case 0:
                return new f((RideCardCoherentRatingSelectorView) obj, p9y0Var, gVar);
            case 1:
                return new com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.g((RideCardCommentItemView) obj, p9y0Var, gVar);
            case 2:
                return new l((RideCardDriverSimpleSectionView) obj, p9y0Var, gVar);
            case 3:
                return new m(new fhk0((RideCardDriverSectionView) obj, p9y0Var), gVar);
            case 4:
                return new m(new dhk0((ComposeView) obj, p9y0Var), gVar);
            case 5:
                return new n((FeedbackQuestionSelectorLayout) obj, p9y0Var, gVar);
            case 6:
                return new o((FeedbackQuestionLayout) obj, p9y0Var, gVar);
            case 7:
                return new yik0(new djk0((yss0) ((View) obj), p9y0Var), gVar);
            case 8:
                return new yik0(new bjk0((ComposeView) obj, p9y0Var), gVar);
            case 9:
                return new s((RideCardPickupCodeView) obj, p9y0Var, gVar);
            case 10:
                return new t((RideCardProgressBarItemView) obj, p9y0Var, gVar);
            case 11:
                return new u((RideCardRatingReasonsSelectorView) obj, p9y0Var, gVar);
            case 12:
                return new v((RideCardRatingSelectorView) obj, p9y0Var, gVar);
            case 13:
                return new ymk0(new djk0((yss0) ((View) obj), p9y0Var), gVar);
            case 14:
                return new w((SliderButtonView) obj, p9y0Var, gVar);
            case 15:
                return new z((RideCardTimelineView) obj, gVar, p9y0Var);
            case 16:
                return new a0((RideCardTipsSelectorView) obj, p9y0Var, gVar);
            default:
                return new b0((RideCardTipsWishSelectorView) obj, p9y0Var, gVar);
        }
    }

    public /* synthetic */ udk0(p9y0 p9y0Var, g gVar, int i) {
        this.a = i;
        this.b = p9y0Var;
        this.c = gVar;
    }
}
