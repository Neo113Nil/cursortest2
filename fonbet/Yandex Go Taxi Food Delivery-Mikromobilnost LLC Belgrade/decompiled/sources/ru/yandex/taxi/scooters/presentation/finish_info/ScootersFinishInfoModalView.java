package ru.yandex.taxi.scooters.presentation.finish_info;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.scooters.analytics.ScootersRideFeedbackAnalytics$Button;
import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import defpackage.ajl0;
import defpackage.apm0;
import defpackage.boo0;
import defpackage.cma1;
import defpackage.e230;
import defpackage.fva0;
import defpackage.g18;
import defpackage.g4b1;
import defpackage.gzr0;
import defpackage.hmn0;
import defpackage.i3y;
import defpackage.imn0;
import defpackage.is8;
import defpackage.kgx;
import defpackage.kmn0;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pfh0;
import defpackage.qdx;
import defpackage.qmn0;
import defpackage.qrh0;
import defpackage.qwo0;
import defpackage.rln0;
import defpackage.rmn0;
import defpackage.rnn0;
import defpackage.scc;
import defpackage.sln0;
import defpackage.sls;
import defpackage.smn0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.tmn0;
import defpackage.uln0;
import defpackage.uqs;
import defpackage.uyj;
import defpackage.v3n0;
import defpackage.w130;
import defpackage.w511;
import defpackage.wls;
import defpackage.wmn0;
import defpackage.y1o0;
import defpackage.zmn0;
import defpackage.zno0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.domain.ScootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$start$1;
import ru.yandex.taxi.scooters.domain.j;
import ru.yandex.taxi.scooters.experiments.FinishCard;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;
import ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.scooters.presentation.finish_info.statistics.ScootersFinishInfoStatisticsCard;
import ru.yandex.taxi.scooters.presentation.personal_goals.promo_plate.ScootersPersonalGoalsPromoPlateView;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001oBÓ\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0014\b\u0001\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016\u0012\u001a\b\u0001\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0019\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0001\u0010#\u001a\u00020\"\u0012\u0014\b\u0001\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0014¢\u0006\u0004\b6\u00102J\u000f\u00107\u001a\u00020\u0012H\u0002¢\u0006\u0004\b7\u00102J\u000f\u00108\u001a\u00020\u0012H\u0002¢\u0006\u0004\b8\u00102J\u000f\u00109\u001a\u00020\u0012H\u0002¢\u0006\u0004\b9\u00102J\u000f\u0010:\u001a\u00020\u0012H\u0002¢\u0006\u0004\b:\u00102J\u000f\u0010;\u001a\u00020\u0012H\u0002¢\u0006\u0004\b;\u00102J\u000f\u0010<\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u00102J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0012H\u0002¢\u0006\u0004\bA\u00102J#\u0010F\u001a\u00020\u0012*\u00020B2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u001eH\u0002¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010JR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010MR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010NR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010OR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010PR&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010QR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010RR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010SR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010TR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010UR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010PR\u001e\u0010W\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010V\u0018\u00010=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010XR\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\\R\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010\\R\u0016\u0010m\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010\\R\u0016\u0010n\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010\\¨\u0006p"}, d2 = {"Lru/yandex/taxi/scooters/presentation/finish_info/ScootersFinishInfoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lrnn0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lfva0;", "performanceAnalytics", "Lzno0;", "scootersPromotionsAnalytics", "Lkmn0;", "scootersFinishInfoAnalytics", "Lru/yandex/taxi/scooters/presentation/feedback/data/model/FeedbackSettingsParams$Screen;", MetaDataField.SCREEN_FIELD, "Lkotlin/Function0;", "Lzy11;", "onSupport", "Lgzr0;", "shortcutGridView", "Lkotlin/Function1;", "", "showErrorDialog", "Lkotlin/Function2;", "", "openCharity", "Lru/yandex/taxi/scooters/experiments/g0;", "scootersExperiment", "Limn0;", "scootersFinishInfo", "Ly1o0;", "newbieProgressInfo", "Lru/yandex/taxi/scooters/presentation/finish_info/d;", "scootersFinishInfoPresenter", "Ls7n0;", "showFinishItemDialog", "<init>", "(Landroid/content/Context;Lpav;Lru/yandex/taxi/widget/utils/e;Lfva0;Lzno0;Lkmn0;Lru/yandex/taxi/scooters/presentation/feedback/data/model/FeedbackSettingsParams$Screen;Lsls;Lgzr0;Ltls;Lwls;Lru/yandex/taxi/scooters/experiments/g0;Limn0;Ly1o0;Lru/yandex/taxi/scooters/presentation/finish_info/d;Ltls;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lrnn0;", "onAttachedToWindow", "()V", "", "getTopPadding", "()I", "onDetachedFromWindow", "performanceAnalyticsFinishLoading", "updateScrollViewBottomPadding", "expandToFullHeight", "initDoneButton", "initFeedbackCard", "initInfoMessage", "", "Landroid/view/View;", "getSectionViews", "()Ljava/util/List;", "setupSectionViewsLayoutParams", "Lru/yandex/taxi/design/ListItemComponent;", "", "infoCardRedesign", "finishInfo", "bindFinishInfoTitle", "(Lru/yandex/taxi/design/ListItemComponent;ZLimn0;)V", "Lpav;", "Lru/yandex/taxi/widget/utils/e;", "Lfva0;", "Lzno0;", "Lkmn0;", "Lru/yandex/taxi/scooters/presentation/feedback/data/model/FeedbackSettingsParams$Screen;", "Lsls;", "Lgzr0;", "Ltls;", "Lwls;", "Lru/yandex/taxi/scooters/experiments/g0;", "Limn0;", "Ly1o0;", "Lru/yandex/taxi/scooters/presentation/finish_info/d;", "Lru/yandex/taxi/scooters/experiments/FinishCard$Section;", "sectionsOrder", "Ljava/util/List;", "damagePhotoLimit", CA20Status.STATUS_USER_I, "isStatisticsCardVisible", "Z", "isCommentVisibleByExperiment", "sectionViews", "Lrln0;", "roundSectionsHandler", "Lrln0;", "expanded", "Lg18;", "promoPlateImageLoadCancellable", "Lg18;", "Lru/yandex/taxi/scooters/presentation/personal_goals/promo_plate/ScootersPersonalGoalsPromoPlateView;", "sharingPersonalGoalsPromoPlateView$delegate", "Li3y;", "getSharingPersonalGoalsPromoPlateView", "()Lru/yandex/taxi/scooters/presentation/personal_goals/promo_plate/ScootersPersonalGoalsPromoPlateView;", "sharingPersonalGoalsPromoPlateView", "isShortcutsLoadedOrNotExists", "isShowFinishInfoListInvokes", "isSetFeedbackCardContentInvokes", "ru/yandex/taxi/scooters/presentation/finish_info/a", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersFinishInfoModalView extends SlideableBindingModalView<rnn0> {
    public static final int $stable = 8;
    private final int damagePhotoLimit;
    private boolean expanded;
    private final pav imageLoader;
    private final boolean isCommentVisibleByExperiment;
    private boolean isSetFeedbackCardContentInvokes;
    private boolean isShortcutsLoadedOrNotExists;
    private boolean isShowFinishInfoListInvokes;
    private final boolean isStatisticsCardVisible;
    private final ru.yandex.taxi.widget.utils.e mediaInfoConverter;
    private final y1o0 newbieProgressInfo;
    private final sls onSupport;
    private final wls openCharity;
    private final fva0 performanceAnalytics;
    private g18 promoPlateImageLoadCancellable;
    private final rln0 roundSectionsHandler;
    private final g0 scootersExperiment;
    private final imn0 scootersFinishInfo;
    private final kmn0 scootersFinishInfoAnalytics;
    private final d scootersFinishInfoPresenter;
    private final zno0 scootersPromotionsAnalytics;
    private final FeedbackSettingsParams$Screen screen;
    private final List<View> sectionViews;
    private final List<FinishCard.Section> sectionsOrder;

    /* renamed from: sharingPersonalGoalsPromoPlateView$delegate, reason: from kotlin metadata */
    private final i3y sharingPersonalGoalsPromoPlateView;
    private final gzr0 shortcutGridView;
    private final tls showErrorDialog;
    private final tls showFinishItemDialog;

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScootersFinishInfoModalView(Context context, pav pavVar, ru.yandex.taxi.widget.utils.e eVar, fva0 fva0Var, zno0 zno0Var, kmn0 kmn0Var, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, sls slsVar, gzr0 gzr0Var, tls tlsVar, wls wlsVar, g0 g0Var, imn0 imn0Var, y1o0 y1o0Var, d dVar, tls tlsVar2) {
        super(context);
        boolean z;
        FinishCard.Statistics statistics;
        FinishCard finishCard;
        this.imageLoader = pavVar;
        this.mediaInfoConverter = eVar;
        this.performanceAnalytics = fva0Var;
        this.scootersPromotionsAnalytics = zno0Var;
        this.scootersFinishInfoAnalytics = kmn0Var;
        this.screen = feedbackSettingsParams$Screen;
        this.onSupport = slsVar;
        this.shortcutGridView = gzr0Var;
        this.showErrorDialog = tlsVar;
        this.openCharity = wlsVar;
        this.scootersExperiment = g0Var;
        this.scootersFinishInfo = imn0Var;
        this.newbieProgressInfo = y1o0Var;
        this.scootersFinishInfoPresenter = dVar;
        this.showFinishItemDialog = tlsVar2;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen2 = FeedbackSettingsParams$Screen.FINISH_CARD;
        this.sectionsOrder = (feedbackSettingsParams$Screen != feedbackSettingsParams$Screen2 || (finishCard = g0Var.h) == null) ? null : finishCard.b;
        Integer num = g0Var.f;
        FinishCard finishCard2 = g0Var.h;
        this.damagePhotoLimit = num != null ? num.intValue() : 8;
        if (feedbackSettingsParams$Screen == feedbackSettingsParams$Screen2) {
            hmn0 hmn0Var = imn0Var.i;
            String str = hmn0Var != null ? hmn0Var.c : null;
            if (str != null && str.length() != 0 && finishCard2 != null && (statistics = finishCard2.c) != null && statistics.a && y1o0Var == null) {
                z = true;
                this.isStatisticsCardVisible = z;
                this.isCommentVisibleByExperiment = finishCard2 == null && finishCard2.e;
                List<View> sectionViews = getSectionViews();
                this.sectionViews = sectionViews;
                this.roundSectionsHandler = new rln0(context, sectionViews);
                this.sharingPersonalGoalsPromoPlateView = kotlin.a.b(LazyThreadSafetyMode.NONE, new tmm0(18, context, this));
                if (gzr0Var == null) {
                    getBinding().n.addView(gzr0Var.getView());
                    getBinding().n.setVisibility(0);
                    gzr0Var.setDataLoadedCallback(new v3n0(13, this));
                } else {
                    getBinding().n.setVisibility(8);
                    if (!this.isShortcutsLoadedOrNotExists) {
                        this.isShortcutsLoadedOrNotExists = true;
                        performanceAnalyticsFinishLoading();
                    }
                }
                setupSectionViewsLayoutParams();
                getBinding().o.setVisibility(z ? 0 : 8);
            }
        }
        z = false;
        this.isStatisticsCardVisible = z;
        this.isCommentVisibleByExperiment = finishCard2 == null && finishCard2.e;
        List<View> sectionViews2 = getSectionViews();
        this.sectionViews = sectionViews2;
        this.roundSectionsHandler = new rln0(context, sectionViews2);
        this.sharingPersonalGoalsPromoPlateView = kotlin.a.b(LazyThreadSafetyMode.NONE, new tmm0(18, context, this));
        if (gzr0Var == null) {
        }
        setupSectionViewsLayoutParams();
        getBinding().o.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ScootersFinishInfoModalView scootersFinishInfoModalView) {
        if (scootersFinishInfoModalView.shortcutGridView.isEmpty()) {
            scootersFinishInfoModalView.getBinding().n.removeAllViews();
            scootersFinishInfoModalView.getBinding().n.setVisibility(8);
            scootersFinishInfoModalView.roundSectionsHandler.b();
        }
        if (!scootersFinishInfoModalView.isShortcutsLoadedOrNotExists) {
            scootersFinishInfoModalView.isShortcutsLoadedOrNotExists = true;
            scootersFinishInfoModalView.performanceAnalyticsFinishLoading();
        }
        scootersFinishInfoModalView.updateScrollViewBottomPadding();
    }

    public static final /* synthetic */ rnn0 access$getBinding(ScootersFinishInfoModalView scootersFinishInfoModalView) {
        return scootersFinishInfoModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindFinishInfoTitle(ListItemComponent listItemComponent, boolean z, imn0 imn0Var) {
        if (z) {
            listItemComponent.setTitle(imn0Var.f == FeedbackSettingsParams$Screen.FINISH_CARD ? kyh0.scooters_ride_ended_simple : kyh0.scooters_ride_cancelled_simple);
        } else {
            FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = imn0Var.f;
            String str = imn0Var.e;
            listItemComponent.setTitle(ru.yandex.taxi.design.utils.c.H(listItemComponent, feedbackSettingsParams$Screen == FeedbackSettingsParams$Screen.FINISH_CARD ? kyh0.scooters_ride_ended : kyh0.scooters_ride_cancelled, imn0Var.d));
            if (str.length() > 0) {
                listItemComponent.setSubtitle(ru.yandex.taxi.design.utils.c.H(listItemComponent, kyh0.scooters_ride_finish_discount, str));
            }
        }
        new apm0(listItemComponent).Ug(listItemComponent.getContext(), imn0Var.c, imn0Var.b);
    }

    private final void expandToFullHeight() {
        if (this.expanded) {
            return;
        }
        this.expanded = true;
        getBottomSheetBehavior().P(6, false, false);
        GoFrameLayout goFrameLayout = getBinding().a;
        ViewGroup.LayoutParams layoutParams = getBinding().a.getLayoutParams();
        layoutParams.height = (getContent().getHeight() - getCurrentInsets().g) - getCurrentInsets().b;
        goFrameLayout.setLayoutParams(layoutParams);
        getBottomSheetBehavior().I(0, true, getRootView().getHeight() - Math.min(getCardContentContainer().getHeight(), getHeight()));
    }

    private final List<View> getSectionViews() {
        List<FinishCard.Section> g;
        if (this.newbieProgressInfo != null) {
            g = scc.g(FinishCard.Section.FEEDBACK, FinishCard.Section.SHORTCUTS, FinishCard.Section.INFO);
        } else {
            List<FinishCard.Section> list = this.sectionsOrder;
            g = (list == null || list.isEmpty()) ? this.isStatisticsCardVisible ? scc.g(FinishCard.Section.STATISTICS, FinishCard.Section.FEEDBACK, FinishCard.Section.SHORTCUTS, FinishCard.Section.INFO) : scc.g(FinishCard.Section.FEEDBACK, FinishCard.Section.SHORTCUTS, FinishCard.Section.INFO) : this.sectionsOrder;
        }
        List<FinishCard.Section> I = kotlin.collections.a.I(g);
        ArrayList arrayList = new ArrayList();
        for (FinishCard.Section section : I) {
            int i = section == null ? -1 : tmn0.a[section.ordinal()];
            ViewParent viewParent = null;
            if (i != -1) {
                if (i == 1) {
                    viewParent = getBinding().f;
                } else if (i == 2) {
                    viewParent = getBinding().g;
                } else if (i == 3) {
                    viewParent = getBinding().n;
                } else {
                    if (i != 4) {
                        w511.b();
                        return null;
                    }
                    viewParent = getBinding().o;
                }
            }
            if (viewParent != null) {
                arrayList.add(viewParent);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (Object obj : scc.g(getBinding().o, getBinding().f, getBinding().n, getBinding().g, getBinding().i, getBinding().b)) {
            if (!arrayList2.contains(obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScootersPersonalGoalsPromoPlateView getSharingPersonalGoalsPromoPlateView() {
        return (ScootersPersonalGoalsPromoPlateView) this.sharingPersonalGoalsPromoPlateView.getValue();
    }

    private final void initDoneButton() {
        ButtonComponent buttonComponent = getBinding().e;
        buttonComponent.setAccent(true);
        buttonComponent.setText(kyh0.scooters_done);
        buttonComponent.setDebounceClickListener(new ajl0(23, this, buttonComponent));
        g4b1.c(getBinding().c, getBinding().l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDoneButton$lambda$0$0(ScootersFinishInfoModalView scootersFinishInfoModalView, ButtonComponent buttonComponent) {
        kmn0 kmn0Var = scootersFinishInfoModalView.scootersFinishInfoAnalytics;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = scootersFinishInfoModalView.screen;
        ScootersRideFeedbackAnalytics$Button scootersRideFeedbackAnalytics$Button = ScootersRideFeedbackAnalytics$Button.Done;
        y1o0 y1o0Var = scootersFinishInfoModalView.newbieProgressInfo;
        kmn0Var.a(feedbackSettingsParams$Screen, scootersRideFeedbackAnalytics$Button, y1o0Var != null ? Integer.valueOf(y1o0Var.a) : null, null);
        buttonComponent.setEnabled(false);
        buttonComponent.startAnimation();
        d dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
        tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$completed$1(dVar, scootersFinishInfoModalView.getBinding().f.rating(), scootersFinishInfoModalView.getBinding().f.comment(), null), 3);
        tje.N(dVar.x, null, null, new ScootersFinishInfoPresenter$completed$2(dVar, null), 3);
    }

    private final void initFeedbackCard() {
        getBinding().f.setScootersPhotoAdapter(new ru.yandex.taxi.scooters.presentation.feedback.comment.b(this.imageLoader, new ScootersFinishInfoModalView$initFeedbackCard$scootersPhotoAdapter$1(1, this.scootersFinishInfoPresenter, d.class, "removePhoto", "removePhoto(Lru/yandex/taxi/scooters/domain/model/ScooterPhotoWithStatus;)V", 0)));
        int i = 0;
        int i2 = 1;
        getBinding().f.setListeners(new qmn0(this, i), new qmn0(this, i2), new qmn0(this, 2), new rmn0(this, i), new smn0(this, i), new rmn0(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initFeedbackCard$lambda$0(ScootersFinishInfoModalView scootersFinishInfoModalView) {
        d dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
        tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$uploadPhotos$1(dVar, null), 3);
        dVar.Lg();
        scootersFinishInfoModalView.expandToFullHeight();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initFeedbackCard$lambda$1(ScootersFinishInfoModalView scootersFinishInfoModalView) {
        final d dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
        dVar.K.invoke(new sls() { // from class: ru.yandex.taxi.scooters.presentation.finish_info.c
            @Override // defpackage.sls
            public final Object invoke() {
                d dVar2 = d.this;
                tje.N(dVar2.Jg(), null, null, new ScootersFinishInfoPresenter$uploadPhotos$1(dVar2, null), 3);
                dVar2.Lg();
                ((wmn0) dVar2.Dg()).I1();
                return zy11.a;
            }
        });
        dVar.Lg();
        scootersFinishInfoModalView.expandToFullHeight();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initFeedbackCard$lambda$2(ScootersFinishInfoModalView scootersFinishInfoModalView) {
        scootersFinishInfoModalView.onSupport.invoke();
        scootersFinishInfoModalView.expandToFullHeight();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initFeedbackCard$lambda$3(ScootersFinishInfoModalView scootersFinishInfoModalView, int i) {
        d dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
        ru.yandex.taxi.scooters.presentation.feedback.domain.c cVar = dVar.O;
        r0 r0Var = (r0) cVar.e.x;
        r0Var.m(null, uln0.a((uln0) r0Var.getValue(), null, false, i, null, null, 27));
        cVar.a(i);
        dVar.Lg();
        scootersFinishInfoModalView.expandToFullHeight();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initFeedbackCard$lambda$4(ScootersFinishInfoModalView scootersFinishInfoModalView, List list, boolean z) {
        d dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
        r0 r0Var = (r0) dVar.O.e.x;
        r0Var.m(null, uln0.a((uln0) r0Var.getValue(), list, z, 0, null, null, 28));
        dVar.Lg();
        scootersFinishInfoModalView.expandToFullHeight();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initFeedbackCard$lambda$5(ScootersFinishInfoModalView scootersFinishInfoModalView, String str) {
        d dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
        dVar.N.invoke(str, new ScootersFinishInfoPresenter$onCommentClick$1(1, dVar, d.class, "onCommentChange", "onCommentChange(Ljava/lang/CharSequence;)V", 0));
        scootersFinishInfoModalView.expandToFullHeight();
        return zy11.a;
    }

    private final void initInfoMessage() {
        getBinding().i.setVisibility(this.scootersFinishInfo.g != null ? 0 : 8);
        getBinding().h.setVisibility(this.scootersFinishInfo.g != null ? 0 : 8);
        getBinding().h.setText(this.scootersFinishInfo.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersFinishInfoModalView scootersFinishInfoModalView, int i, t1w t1wVar) {
        boolean z = t1wVar.f;
        zy11 zy11Var = zy11.a;
        if (z) {
            return zy11Var;
        }
        scootersFinishInfoModalView.setTopSystemWindowInset(t1wVar.b);
        GoConstraintLayout goConstraintLayout = scootersFinishInfoModalView.getBinding().c;
        goConstraintLayout.setPadding(goConstraintLayout.getPaddingLeft(), goConstraintLayout.getPaddingTop(), goConstraintLayout.getPaddingRight(), t1wVar.g + i);
        scootersFinishInfoModalView.updateScrollViewBottomPadding();
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performanceAnalyticsFinishLoading() {
        if (this.isShortcutsLoadedOrNotExists && this.isShowFinishInfoListInvokes && this.isSetFeedbackCardContentInvokes) {
            fva0.b(this.performanceAnalytics, this.scootersFinishInfo.f == FeedbackSettingsParams$Screen.FINISH_CARD ? "ScootersFeedbackFinishCard" : "ScootersFeedbackCancelCard", PerformanceAnalytics$Type.Loading, null, 4);
        }
    }

    private final void setupSectionViewsLayoutParams() {
        if (this.sectionViews.size() < 2) {
            return;
        }
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        int id = ((View) kotlin.collections.a.P(this.sectionViews)).getId();
        eVar.l(id, -1);
        eVar.k(id, -2);
        eVar.i(id, 7, 0, 7);
        eVar.i(id, 6, 0, 6);
        eVar.i(id, 3, 0, 3);
        Iterator it = kotlin.collections.a.K(kotlin.collections.a.J(scc.e(this.sectionViews), 1)).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int id2 = this.sectionViews.get(intValue - 1).getId();
            int id3 = this.sectionViews.get(intValue).getId();
            eVar.l(id3, -1);
            eVar.k(id3, -2);
            eVar.i(id3, 7, 0, 7);
            eVar.i(id3, 6, 0, 6);
            eVar.i(id3, 3, id2, 4);
        }
        List<View> list = this.sectionViews;
        int id4 = list.get(scc.f(list) - 1).getId();
        int id5 = ((View) kotlin.collections.a.Z(this.sectionViews)).getId();
        eVar.l(id5, -1);
        eVar.k(id5, 0);
        eVar.i(id5, 4, 0, 4);
        eVar.i(id5, 7, 0, 7);
        eVar.i(id5, 6, 0, 6);
        eVar.i(id5, 3, id4, 4);
        eVar.o(id5).e.d0 = tje.u(80, getContext());
        eVar.b(getBinding().d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScootersPersonalGoalsPromoPlateView sharingPersonalGoalsPromoPlateView_delegate$lambda$0(Context context, ScootersFinishInfoModalView scootersFinishInfoModalView) {
        ScootersPersonalGoalsPromoPlateView scootersPersonalGoalsPromoPlateView = new ScootersPersonalGoalsPromoPlateView(context, scootersFinishInfoModalView.imageLoader);
        scootersFinishInfoModalView.getBinding().m.addView(scootersPersonalGoalsPromoPlateView, new FrameLayout.LayoutParams(-1, -2));
        return scootersPersonalGoalsPromoPlateView;
    }

    private final void updateScrollViewBottomPadding() {
        if (getBinding().c.getHeight() <= 0) {
            GoConstraintLayout goConstraintLayout = getBinding().c;
            OneShotPreDrawListener.add(goConstraintLayout, new uqs(13, goConstraintLayout, this));
        } else {
            NestedScrollView nestedScrollView = getBinding().l;
            nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), nestedScrollView.getPaddingTop(), nestedScrollView.getPaddingRight(), getBinding().c.getHeight());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public rnn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qrh0.scooters_finish_modal_view, parent, false);
        int i = pfh0.bottom_edge_button_layout;
        if (((BottomEdgeButtonLayout) cma1.O(i, inflate)) != null) {
            i = pfh0.bottom_fill_view;
            GoView goView = (GoView) cma1.O(i, inflate);
            if (goView != null) {
                i = pfh0.button_container;
                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
                if (goConstraintLayout != null) {
                    i = pfh0.content_constraint_layout;
                    GoConstraintLayout goConstraintLayout2 = (GoConstraintLayout) cma1.O(i, inflate);
                    if (goConstraintLayout2 != null) {
                        i = pfh0.done_button;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent != null) {
                            i = pfh0.feedback_card;
                            ScootersFeedbackCard scootersFeedbackCard = (ScootersFeedbackCard) cma1.O(i, inflate);
                            if (scootersFeedbackCard != null) {
                                i = pfh0.info_card;
                                ScootersFinishInfoCard scootersFinishInfoCard = (ScootersFinishInfoCard) cma1.O(i, inflate);
                                if (scootersFinishInfoCard != null) {
                                    i = pfh0.info_message;
                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView != null) {
                                        i = pfh0.info_message_layout;
                                        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                                        if (goLinearLayout != null) {
                                            i = pfh0.newbie_help_item_component;
                                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                                            if (listItemComponent != null) {
                                                i = pfh0.promo_plate;
                                                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                                if (listItemComponent2 != null) {
                                                    i = pfh0.scroll_view;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
                                                    if (nestedScrollView != null) {
                                                        i = pfh0.sharing_personal_goals_promo_plate_container;
                                                        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                                                        if (goFrameLayout != null) {
                                                            i = pfh0.shortcuts_container;
                                                            GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                                                            if (goFrameLayout2 != null) {
                                                                i = pfh0.statistics_card;
                                                                ScootersFinishInfoStatisticsCard scootersFinishInfoStatisticsCard = (ScootersFinishInfoStatisticsCard) cma1.O(i, inflate);
                                                                if (scootersFinishInfoStatisticsCard != null) {
                                                                    return new rnn0((GoFrameLayout) inflate, goView, goConstraintLayout, goConstraintLayout2, buttonComponent, scootersFeedbackCard, scootersFinishInfoCard, robotoTextView, goLinearLayout, listItemComponent, listItemComponent2, nestedScrollView, goFrameLayout, goFrameLayout2, scootersFinishInfoStatisticsCard);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new is8(this, getBinding().c.getPaddingBottom(), 11));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ScootersPromotionsScreen scootersPromotionsScreen;
        super.onAttachedToWindow();
        this.roundSectionsHandler.b();
        initInfoMessage();
        initDoneButton();
        initFeedbackCard();
        d dVar = this.scootersFinishInfoPresenter;
        a aVar = new a(this);
        dVar.Bg(aVar);
        tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$attachView$1(dVar, aVar, null), 3);
        tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1(dVar, null), 3);
        ru.yandex.taxi.scooters.presentation.feedback.domain.c cVar = dVar.O;
        imn0 imn0Var = dVar.L;
        String str = imn0Var.a;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = imn0Var.f;
        tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$listenPhotos$$inlined$collectLatestIn$1(cVar.f(str), null, (wmn0) dVar.Dg()), 3);
        tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$listenInputStateValidity$$inlined$collectLatestIn$1(cVar.e(), null, (wmn0) dVar.Dg()), 3);
        if (((sln0) cVar.e.c).a) {
            ScootersFeedbackCard.changeRatingBarTitleVisibility$default(access$getBinding(this).f, true, false, 2, null);
        }
        tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$attachView$2(dVar, aVar, null), 3);
        int i = zmn0.a[feedbackSettingsParams$Screen.ordinal()];
        if (i == 1) {
            scootersPromotionsScreen = ScootersPromotionsScreen.SCOOTERS_FEEDBACK_FINISH;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            scootersPromotionsScreen = ScootersPromotionsScreen.SCOOTERS_FEEDBACK_CANCEL;
        }
        tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$attachView$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new j(((com.yandex.go.scooters.promotions.domain.a) dVar.C.b).a(scootersPromotionsScreen)), new ScootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$start$1(null, null))), null, aVar), 3);
        y1o0 y1o0Var = dVar.M;
        if (y1o0Var != null) {
            ru.yandex.taxi.scooters.presentation.feedback.newbie.a aVar2 = dVar.E;
            qwo0 qwo0Var = aVar2.h;
            int c = qwo0Var.c() + 1;
            qdx qdxVar = qwo0Var.z;
            kgx[] kgxVarArr = qwo0.B;
            qdxVar.setValue(qwo0Var, kgxVarArr[24], Integer.valueOf(c));
            int c2 = qwo0Var.c();
            if (c2 == 3) {
                qwo0Var.A.setValue(qwo0Var, kgxVarArr[25], Boolean.TRUE);
            }
            g X = kotlinx.coroutines.flow.e.X(aVar2.f.a(), new ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1(null, aVar2, y1o0Var, c2));
            aVar2.d.getClass();
            tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$attachView$$inlined$collectIn$2(com.yandex.go.coroutines.b.c(kotlinx.coroutines.flow.e.F(X, uyj.a), new ScootersFinishInfoPresenter$attachView$4(dVar, null)), null, aVar), 3);
        } else {
            dVar.y.b(imn0Var.a, feedbackSettingsParams$Screen, null, null);
        }
        if (feedbackSettingsParams$Screen == FeedbackSettingsParams$Screen.FINISH_CARD) {
            tje.N(dVar.Jg(), null, null, new ScootersFinishInfoPresenter$attachView$6(dVar, null), 3);
        }
        Iterator it = ((boo0) this.scootersPromotionsAnalytics).b.values().iterator();
        while (it.hasNext()) {
            ((Set) it.next()).clear();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.promoPlateImageLoadCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.promoPlateImageLoadCancellable = null;
        this.scootersFinishInfoPresenter.Cg();
    }
}
