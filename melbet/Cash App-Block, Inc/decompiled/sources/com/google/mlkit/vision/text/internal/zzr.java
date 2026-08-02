package com.google.mlkit.vision.text.internal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.dynamicanimation.animation.DynamicAnimation$1;
import androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.glance.layout.BoxKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Image_androidKt;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.fillr.e;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchViewAnimationHelper;
import com.google.android.play.core.appupdate.internal.zzaf;
import com.google.android.play.core.appupdate.zzi;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.crypto.tink.aead.internal.AesGcmJceUtil;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import com.google.mlkit.vision.common.zzb;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityTabItemEventDecorator$decorate$1;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.arcade.treehouse.KeypadScaffoldBinding;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.kyb.KybRestrictionModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewModel;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.HeatMaskProvider;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.cashapplite.cashin.CashInAccountInfo;
import com.squareup.cash.cashapplite.cashin.CashInRow;
import com.squareup.cash.cashapplite.cashin.CashInRowAction;
import com.squareup.cash.cashapplite.cashin.LiteCashInResult;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$WhenMappings;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$getCashInAccount$1;
import com.squareup.cash.cdf.app.AppNavigateSelectVersionUpdateOption;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.earningstracker.presenters.RealGetCustomerProfileScreen$invoke$1;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.initialscreenloader.backend.AppUpgradeAnalytics$Option;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.InstalledAppletSortOrder;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotRenderContextProvider$DisplayDp;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Expired;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$FailedPin;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Invalid;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Pending;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Rejected;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Unknown;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Verified;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationResult;
import com.squareup.cash.support.backend.real.RealPhoneVerificationService$getPhoneVerificationAttempt$1;
import com.squareup.cash.support.backend.real.RealPhoneVerificationService$rejectPhoneVerificationAttempt$1;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashliteflow.api.v1.CashLiteFlowClientService;
import com.squareup.protos.cash.cashliteflow.api.v1.GetCashInAccountRequest;
import com.squareup.protos.cash.cashliteflow.api.v1.GetCashInAccountResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.cashvoice.verification.app.v1.GetPhoneVerificationAttemptRequest;
import com.squareup.protos.cash.cashvoice.verification.app.v1.GetPhoneVerificationAttemptResponse;
import com.squareup.protos.cash.cashvoice.verification.app.v1.PhoneVerificationAttemptState;
import com.squareup.protos.cash.cashvoice.verification.app.v1.RejectPhoneVerificationAttemptRequest;
import com.squareup.protos.cash.cashvoice.verification.app.v1.RejectPhoneVerificationAttemptResponse;
import com.squareup.protos.cash.cashvoice.verification.app.v1.VerificationAppService;
import com.squareup.protos.cash.kgoose.api.v3.RenderContext;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzr implements AccessibilityViewCommand, SearchViewAnimationHelper.AnimationDelegate, zzaf, BarcodeSource, OnSuccessListener, ActivityItemEventDecorator, ImageRequest.Listener, KeypadAmount.OnAmountChangedListener, BitcoinHomeWidgetPresenter, HeatMaskProvider {
    public static Method isInstantAppMethod;
    public final /* synthetic */ int $r8$classId;
    public Object zza;

    public zzr(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 20:
                this.zza = new e();
                break;
            case 27:
                this.zza = MessageDigest.getInstance("SHA-256");
                break;
        }
    }

    public static ValueAnimator getAlphaValueAnimator(boolean z) {
        return z ? ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f) : ValueAnimator.ofFloat(1.0f, RecyclerView.DECELERATION_RATE);
    }

    public static int installedSectionSortValue(AppletId appletId) {
        appletId.getClass();
        switch (appletId.ordinal()) {
            case 0:
                InstalledAppletSortOrder[] installedAppletSortOrderArr = InstalledAppletSortOrder.$VALUES;
                return 12;
            case 1:
                InstalledAppletSortOrder[] installedAppletSortOrderArr2 = InstalledAppletSortOrder.$VALUES;
                return 1;
            case 2:
                InstalledAppletSortOrder[] installedAppletSortOrderArr3 = InstalledAppletSortOrder.$VALUES;
                return 5;
            case 3:
                InstalledAppletSortOrder[] installedAppletSortOrderArr4 = InstalledAppletSortOrder.$VALUES;
                return 6;
            case 4:
                InstalledAppletSortOrder[] installedAppletSortOrderArr5 = InstalledAppletSortOrder.$VALUES;
                return 8;
            case 5:
                InstalledAppletSortOrder[] installedAppletSortOrderArr6 = InstalledAppletSortOrder.$VALUES;
                return 7;
            case 6:
                InstalledAppletSortOrder[] installedAppletSortOrderArr7 = InstalledAppletSortOrder.$VALUES;
                return 10;
            case 7:
                InstalledAppletSortOrder[] installedAppletSortOrderArr8 = InstalledAppletSortOrder.$VALUES;
                return 11;
            case 8:
                InstalledAppletSortOrder[] installedAppletSortOrderArr9 = InstalledAppletSortOrder.$VALUES;
                return 13;
            case 9:
                InstalledAppletSortOrder[] installedAppletSortOrderArr10 = InstalledAppletSortOrder.$VALUES;
                return 14;
            case 10:
                InstalledAppletSortOrder[] installedAppletSortOrderArr11 = InstalledAppletSortOrder.$VALUES;
                return 16;
            case 11:
                InstalledAppletSortOrder[] installedAppletSortOrderArr12 = InstalledAppletSortOrder.$VALUES;
                return 17;
            case 12:
                InstalledAppletSortOrder[] installedAppletSortOrderArr13 = InstalledAppletSortOrder.$VALUES;
                return 25;
            case 13:
                InstalledAppletSortOrder[] installedAppletSortOrderArr14 = InstalledAppletSortOrder.$VALUES;
                return 18;
            case 14:
                InstalledAppletSortOrder[] installedAppletSortOrderArr15 = InstalledAppletSortOrder.$VALUES;
                return 5;
            case 15:
                InstalledAppletSortOrder[] installedAppletSortOrderArr16 = InstalledAppletSortOrder.$VALUES;
                return 0;
            case 16:
                InstalledAppletSortOrder[] installedAppletSortOrderArr17 = InstalledAppletSortOrder.$VALUES;
                return 0;
            case 17:
                InstalledAppletSortOrder[] installedAppletSortOrderArr18 = InstalledAppletSortOrder.$VALUES;
                return 16;
            case 18:
                InstalledAppletSortOrder[] installedAppletSortOrderArr19 = InstalledAppletSortOrder.$VALUES;
                return 0;
            case 19:
                InstalledAppletSortOrder[] installedAppletSortOrderArr20 = InstalledAppletSortOrder.$VALUES;
                return 15;
            case 20:
                InstalledAppletSortOrder[] installedAppletSortOrderArr21 = InstalledAppletSortOrder.$VALUES;
                return 9;
            case 21:
                InstalledAppletSortOrder[] installedAppletSortOrderArr22 = InstalledAppletSortOrder.$VALUES;
                return 19;
            case 22:
                InstalledAppletSortOrder[] installedAppletSortOrderArr23 = InstalledAppletSortOrder.$VALUES;
                return 22;
            case 23:
                InstalledAppletSortOrder[] installedAppletSortOrderArr24 = InstalledAppletSortOrder.$VALUES;
                return 20;
            case 24:
                InstalledAppletSortOrder[] installedAppletSortOrderArr25 = InstalledAppletSortOrder.$VALUES;
                return 21;
            case 25:
                InstalledAppletSortOrder[] installedAppletSortOrderArr26 = InstalledAppletSortOrder.$VALUES;
                return 23;
            case 26:
                InstalledAppletSortOrder[] installedAppletSortOrderArr27 = InstalledAppletSortOrder.$VALUES;
                return 24;
            case 27:
                InstalledAppletSortOrder[] installedAppletSortOrderArr28 = InstalledAppletSortOrder.$VALUES;
                return 2;
            case 28:
                InstalledAppletSortOrder[] installedAppletSortOrderArr29 = InstalledAppletSortOrder.$VALUES;
                return 3;
            case 29:
                InstalledAppletSortOrder[] installedAppletSortOrderArr30 = InstalledAppletSortOrder.$VALUES;
                return 4;
            case 30:
                return Integer.MAX_VALUE;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    private final void onError$com$squareup$cash$appmessages$views$RealAppMessageImageLoader$load$lambda$0$$inlined$listener$default$1(ImageRequest imageRequest, ErrorResult errorResult) {
    }

    public static BoxKt toVerificationState(PhoneVerificationAttemptState phoneVerificationAttemptState, String str, String str2) {
        switch (phoneVerificationAttemptState.ordinal()) {
            case 0:
                return PhoneVerificationService$PhoneVerificationAttemptState$Unknown.INSTANCE;
            case 1:
                return new PhoneVerificationService$PhoneVerificationAttemptState$Pending(str, str2);
            case 2:
                return PhoneVerificationService$PhoneVerificationAttemptState$Verified.INSTANCE;
            case 3:
                return PhoneVerificationService$PhoneVerificationAttemptState$Invalid.INSTANCE;
            case 4:
                return PhoneVerificationService$PhoneVerificationAttemptState$Rejected.INSTANCE;
            case 5:
                return PhoneVerificationService$PhoneVerificationAttemptState$Expired.INSTANCE;
            case 6:
                return PhoneVerificationService$PhoneVerificationAttemptState$FailedPin.INSTANCE;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static final int zzc(AssetManager assetManager, File file) {
        int intValue = ((Integer) zzbk.zzd(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        CameraState$Type$EnumUnboxingLocalUtility.m(intValue, "addAssetPath completed with ", "SplitCompat");
        return intValue;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemEventHandler.getClass();
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem), new ActivityTabItemEventDecorator$decorate$1(activityItem, activityItemViewModel, this, null), 3);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public Rect getBoundingBox() {
        Point[] pointArr = ((zzyb) this.zza).zze;
        if (pointArr == null) {
            return null;
        }
        int i = PKIFailureInfo.systemUnavail;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (Point point : pointArr) {
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i2, i3, i, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCashInAccount(ContinuationImpl continuationImpl) {
        RealLiteCashInRepo$getCashInAccount$1 realLiteCashInRepo$getCashInAccount$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLiteCashInRepo$getCashInAccount$1) {
            realLiteCashInRepo$getCashInAccount$1 = (RealLiteCashInRepo$getCashInAccount$1) continuationImpl;
            int i2 = realLiteCashInRepo$getCashInAccount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLiteCashInRepo$getCashInAccount$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLiteCashInRepo$getCashInAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLiteCashInRepo$getCashInAccount$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashLiteFlowClientService cashLiteFlowClientService = (CashLiteFlowClientService) this.zza;
                    GetCashInAccountRequest getCashInAccountRequest = new GetCashInAccountRequest(null, ByteString.EMPTY);
                    realLiteCashInRepo$getCashInAccount$1.label = 1;
                    obj = cashLiteFlowClientService.getCashInAccount(getCashInAccountRequest, realLiteCashInRepo$getCashInAccount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new LiteCashInResult.Error();
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetCashInAccountResponse getCashInAccountResponse = (GetCashInAccountResponse) ((ApiResult.Success) apiResult).response;
                List list = getCashInAccountResponse.account_info_rows;
                ResponseContext responseContext = getCashInAccountResponse.response_context;
                if (list.isEmpty() && responseContext != null) {
                    return new LiteCashInResult.NeedsRedirect(responseContext);
                }
                List<Row> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (Row row : list2) {
                    String str = row.title;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = row.subtitle;
                    String str3 = str2 != null ? str2 : "";
                    Row.RowAction rowAction = row.action;
                    arrayList.add(new CashInRow(str, str3, (rowAction == null ? -1 : RealLiteCashInRepo$WhenMappings.$EnumSwitchMapping$0[rowAction.ordinal()]) == 1 ? CashInRowAction.COPY : CashInRowAction.NONE));
                }
                return new LiteCashInResult.Success(new CashInAccountInfo(arrayList));
            }
        }
        realLiteCashInRepo$getCashInAccount$1 = new RealLiteCashInRepo$getCashInAccount$1(this, continuationImpl);
        Object obj2 = realLiteCashInRepo$getCashInAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLiteCashInRepo$getCashInAccount$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public Point[] getCornerPoints() {
        return ((zzyb) this.zza).zze;
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public AnimatorSet getExpandCollapseAnimatorSet(boolean z) {
        Animator animator;
        Animator animator2;
        char c;
        View navigationIconButton;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator alphaValueAnimator = getAlphaValueAnimator(z);
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.zza;
        TextView textView = searchViewAnimationHelper.editText;
        int i = searchViewAnimationHelper.durationShort1;
        TimeInterpolator timeInterpolator = searchViewAnimationHelper.standardAccelerateInterpolator;
        TimeInterpolator timeInterpolator2 = searchViewAnimationHelper.standardDecelerateInterpolator;
        int i2 = searchViewAnimationHelper.durationShort2;
        alphaValueAnimator.setDuration(i2);
        alphaValueAnimator.setStartDelay(z ? 0L : i);
        alphaValueAnimator.setInterpolator(z ? timeInterpolator2 : timeInterpolator);
        final int i3 = 1;
        alphaValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.search.SearchViewAnimationHelper$ContainedAnimationDelegate$$ExternalSyntheticLambda1
            public final /* synthetic */ zzr f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                zzr zzrVar = this.f$0;
                switch (i4) {
                    case 0:
                        ((SearchViewAnimationHelper) zzrVar.zza).toolbar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        ((SearchViewAnimationHelper) zzrVar.zza).backgroundView.getBackground().mutate().setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                        break;
                    default:
                        TextView textView2 = ((SearchViewAnimationHelper) zzrVar.zza).dummyTextView;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        layoutParams.width = intValue;
                        textView2.setLayoutParams(layoutParams);
                        break;
                }
            }
        });
        ValueAnimator alphaValueAnimator2 = getAlphaValueAnimator(z);
        alphaValueAnimator2.setDuration(i2);
        alphaValueAnimator2.setStartDelay(z ? i : 0L);
        alphaValueAnimator2.setInterpolator(z ? timeInterpolator : timeInterpolator2);
        final int i4 = 0;
        alphaValueAnimator2.addUpdateListener(MultiViewUpdateListener.alphaListener(searchViewAnimationHelper.contentContainer));
        ValueAnimator alphaValueAnimator3 = getAlphaValueAnimator(z);
        alphaValueAnimator3.setDuration(i2);
        alphaValueAnimator3.setInterpolator(z ? timeInterpolator2 : timeInterpolator);
        alphaValueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.search.SearchViewAnimationHelper$ContainedAnimationDelegate$$ExternalSyntheticLambda1
            public final /* synthetic */ zzr f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i42 = i4;
                zzr zzrVar = this.f$0;
                switch (i42) {
                    case 0:
                        ((SearchViewAnimationHelper) zzrVar.zza).toolbar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        ((SearchViewAnimationHelper) zzrVar.zza).backgroundView.getBackground().mutate().setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                        break;
                    default:
                        TextView textView2 = ((SearchViewAnimationHelper) zzrVar.zza).dummyTextView;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        layoutParams.width = intValue;
                        textView2.setLayoutParams(layoutParams);
                        break;
                }
            }
        });
        TextView textView2 = z ? searchViewAnimationHelper.searchBar.textView : textView;
        if (!z) {
            textView = searchViewAnimationHelper.searchBar.textView;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(textView2.getWidth(), textView.getWidth());
        ofInt.setDuration(i2);
        if (z) {
            timeInterpolator = timeInterpolator2;
        }
        ofInt.setInterpolator(timeInterpolator);
        final int i5 = 2;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.search.SearchViewAnimationHelper$ContainedAnimationDelegate$$ExternalSyntheticLambda1
            public final /* synthetic */ zzr f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i42 = i5;
                zzr zzrVar = this.f$0;
                switch (i42) {
                    case 0:
                        ((SearchViewAnimationHelper) zzrVar.zza).toolbar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        ((SearchViewAnimationHelper) zzrVar.zza).backgroundView.getBackground().mutate().setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                        break;
                    default:
                        TextView textView22 = ((SearchViewAnimationHelper) zzrVar.zza).dummyTextView;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = textView22.getLayoutParams();
                        layoutParams.width = intValue;
                        textView22.setLayoutParams(layoutParams);
                        break;
                }
            }
        });
        Animator access$900 = SearchViewAnimationHelper.access$900(searchViewAnimationHelper, z);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AppBarLayout appBarLayoutParentIfExists = searchViewAnimationHelper.searchBar.getAppBarLayoutParentIfExists();
        SearchBar searchBar = searchViewAnimationHelper.searchBar;
        if (searchBar == null || appBarLayoutParentIfExists == null) {
            animator = access$900;
            animator2 = alphaValueAnimator;
            c = 0;
        } else {
            int i6 = searchBar.startSiblingViewId;
            View view = null;
            c = 0;
            if (i6 != -1) {
                navigationIconButton = appBarLayoutParentIfExists.findViewById(i6);
            } else {
                ViewParent parent = searchBar.getParent();
                navigationIconButton = !(parent instanceof Toolbar) ? null : ViewUtils.getNavigationIconButton((Toolbar) parent);
            }
            SearchBar searchBar2 = searchViewAnimationHelper.searchBar;
            int i7 = searchBar2.endSiblingViewId;
            if (i7 != -1) {
                view = appBarLayoutParentIfExists.findViewById(i7);
            } else {
                ViewParent parent2 = searchBar2.getParent();
                if (parent2 instanceof Toolbar) {
                    view = ViewUtils.getActionMenuView((Toolbar) parent2);
                }
            }
            View view2 = view;
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(searchViewAnimationHelper.searchBar);
            int width = appBarLayoutParentIfExists.getWidth();
            if (navigationIconButton != null) {
                Rect calculateOffsetRectFromBounds = ViewUtils.calculateOffsetRectFromBounds(appBarLayoutParentIfExists, navigationIconButton);
                float f = isLayoutRtl ? width - calculateOffsetRectFromBounds.left : -calculateOffsetRectFromBounds.right;
                float f2 = z ? RecyclerView.DECELERATION_RATE : f;
                if (!z) {
                    f = RecyclerView.DECELERATION_RATE;
                }
                animator = access$900;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                animator2 = alphaValueAnimator;
                ofFloat.addUpdateListener(new MultiViewUpdateListener(new AesGcmSiv$$ExternalSyntheticLambda0(2), new View[]{navigationIconButton}));
                animatorSet2.playTogether(ofFloat);
                ValueAnimator alphaValueAnimator4 = getAlphaValueAnimator(!z);
                alphaValueAnimator4.addUpdateListener(MultiViewUpdateListener.alphaListener(navigationIconButton));
                animatorSet2.playTogether(alphaValueAnimator4);
            } else {
                animator = access$900;
                animator2 = alphaValueAnimator;
            }
            if (view2 != null) {
                Rect calculateOffsetRectFromBounds2 = ViewUtils.calculateOffsetRectFromBounds(appBarLayoutParentIfExists, view2);
                float f3 = isLayoutRtl ? -calculateOffsetRectFromBounds2.right : width - calculateOffsetRectFromBounds2.left;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(z ? RecyclerView.DECELERATION_RATE : f3, z ? f3 : RecyclerView.DECELERATION_RATE);
                ofFloat2.addUpdateListener(new MultiViewUpdateListener(new AesGcmSiv$$ExternalSyntheticLambda0(2), new View[]{view2}));
                animatorSet2.playTogether(ofFloat2);
                ValueAnimator alphaValueAnimator5 = getAlphaValueAnimator(!z);
                alphaValueAnimator5.addUpdateListener(MultiViewUpdateListener.alphaListener(view2));
                animatorSet2.playTogether(alphaValueAnimator5);
            }
            animatorSet2.setDuration(i2);
            animatorSet2.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        }
        Animator[] animatorArr = new Animator[6];
        animatorArr[c] = animator2;
        animatorArr[1] = alphaValueAnimator2;
        animatorArr[2] = alphaValueAnimator3;
        animatorArr[3] = ofInt;
        animatorArr[4] = animator;
        animatorArr[5] = animatorSet2;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public List getExpandCollapseSpringAnimations(boolean z) {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.zza;
        Toolbar toolbar = searchViewAnimationHelper.dummyToolbar;
        MaterialToolbar materialToolbar = searchViewAnimationHelper.toolbar;
        SpringAnimation toolbarWidthSpringAnimation = getToolbarWidthSpringAnimation(materialToolbar, z);
        int toolbarTranslationX = getToolbarTranslationX(materialToolbar);
        int i = z ? toolbarTranslationX : 0;
        if (z) {
            toolbarTranslationX = 0;
        }
        DynamicAnimation$1 dynamicAnimation$1 = SpringAnimation.TRANSLATION_X;
        SpringAnimation springAnimation = getSpringAnimation(materialToolbar, dynamicAnimation$1, i, toolbarTranslationX);
        int i2 = 0;
        SpringAnimation toolbarWidthSpringAnimation2 = getToolbarWidthSpringAnimation(toolbar, z);
        int toolbarTranslationX2 = getToolbarTranslationX(toolbar);
        int i3 = z ? toolbarTranslationX2 : 0;
        if (z) {
            toolbarTranslationX2 = 0;
        }
        SpringAnimation springAnimation2 = getSpringAnimation(toolbar, dynamicAnimation$1, i3, toolbarTranslationX2);
        int access$2000 = SearchViewAnimationHelper.access$2000(searchViewAnimationHelper, searchViewAnimationHelper.searchBar) - SearchViewAnimationHelper.access$2000(searchViewAnimationHelper, materialToolbar);
        int i4 = z ? access$2000 : 0;
        if (!z) {
            i2 = access$2000;
        }
        return Arrays.asList(toolbarWidthSpringAnimation, springAnimation, toolbarWidthSpringAnimation2, springAnimation2, getSpringAnimation(searchViewAnimationHelper.toolbarContainer, SpringAnimation.TRANSLATION_Y, i4, i2), getTextTranslationXSpringAnimation(searchViewAnimationHelper.editText, z), getTextTranslationXSpringAnimation(searchViewAnimationHelper.dummyTextView, z));
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public int getFormat() {
        return ((zzyb) this.zza).zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPhoneVerificationAttempt(String str, ContinuationImpl continuationImpl) {
        RealPhoneVerificationService$getPhoneVerificationAttempt$1 realPhoneVerificationService$getPhoneVerificationAttempt$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealPhoneVerificationService$getPhoneVerificationAttempt$1) {
            realPhoneVerificationService$getPhoneVerificationAttempt$1 = (RealPhoneVerificationService$getPhoneVerificationAttempt$1) continuationImpl;
            int i2 = realPhoneVerificationService$getPhoneVerificationAttempt$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPhoneVerificationService$getPhoneVerificationAttempt$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPhoneVerificationService$getPhoneVerificationAttempt$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPhoneVerificationService$getPhoneVerificationAttempt$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    VerificationAppService verificationAppService = (VerificationAppService) this.zza;
                    GetPhoneVerificationAttemptRequest getPhoneVerificationAttemptRequest = new GetPhoneVerificationAttemptRequest(null, str, ByteString.EMPTY);
                    realPhoneVerificationService$getPhoneVerificationAttempt$1.label = 1;
                    obj = verificationAppService.getPhoneVerificationAttempt(getPhoneVerificationAttemptRequest, realPhoneVerificationService$getPhoneVerificationAttempt$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new PhoneVerificationService$PhoneVerificationResult.Failure((ApiResult.Failure) apiResult);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetPhoneVerificationAttemptResponse getPhoneVerificationAttemptResponse = (GetPhoneVerificationAttemptResponse) ((ApiResult.Success) apiResult).response;
                PhoneVerificationAttemptState phoneVerificationAttemptState = getPhoneVerificationAttemptResponse.verification_state;
                BoxKt verificationState = phoneVerificationAttemptState != null ? toVerificationState(phoneVerificationAttemptState, getPhoneVerificationAttemptResponse.accept_button_title, getPhoneVerificationAttemptResponse.reject_button_title) : PhoneVerificationService$PhoneVerificationAttemptState$Invalid.INSTANCE;
                String str2 = getPhoneVerificationAttemptResponse.title;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = getPhoneVerificationAttemptResponse.message;
                return new PhoneVerificationService$PhoneVerificationResult.Success(verificationState, str2, str3 != null ? str3 : "", null);
            }
        }
        realPhoneVerificationService$getPhoneVerificationAttempt$1 = new RealPhoneVerificationService$getPhoneVerificationAttempt$1(this, continuationImpl);
        Object obj2 = realPhoneVerificationService$getPhoneVerificationAttempt$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPhoneVerificationService$getPhoneVerificationAttempt$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public String getRawValue() {
        return ((zzyb) this.zza).zzc;
    }

    public RenderContext getRenderContext() {
        RealMoneybotRenderContextProvider$DisplayDp realMoneybotRenderContextProvider$DisplayDp = (RealMoneybotRenderContextProvider$DisplayDp) ((CameraX$$ExternalSyntheticLambda0) this.zza).invoke();
        int i = realMoneybotRenderContextProvider$DisplayDp.screenWidthDp;
        Integer valueOf = Integer.valueOf(i);
        if (i <= 0) {
            valueOf = null;
        }
        int i2 = realMoneybotRenderContextProvider$DisplayDp.screenHeightDp;
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 <= 0) {
            valueOf2 = null;
        }
        if (valueOf == null && valueOf2 == null) {
            return null;
        }
        return new RenderContext(valueOf, valueOf2, ByteString.EMPTY);
    }

    public SpringAnimation getSpringAnimation(View view, PlatformKt platformKt, float f, float f2) {
        SpringAnimation springAnimation = new SpringAnimation(view, platformKt);
        springAnimation.mSpring = MotionUtils.resolveThemeSpringForce(((SearchViewAnimationHelper) this.zza).context, R.style.Motion_Material3_Spring_Standard_Default_Spatial);
        springAnimation.setStartValue(f);
        springAnimation.mSpring.mFinalPosition = f2;
        return springAnimation;
    }

    public SpringAnimation getTextTranslationXSpringAnimation(View view, boolean z) {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.zza;
        TextView textView = searchViewAnimationHelper.searchBar.placeholderTextView;
        if (TextUtils.isEmpty(textView.getText()) || z) {
            textView = searchViewAnimationHelper.searchBar.textView;
        }
        float access$2100 = SearchViewAnimationHelper.access$2100(searchViewAnimationHelper, textView, view) - getToolbarTranslationX(searchViewAnimationHelper.toolbar);
        if (ViewUtils.isLayoutRtl(searchViewAnimationHelper.searchBar)) {
            access$2100 += textView.getWidth() - view.getWidth();
        }
        float f = z ? access$2100 : 0.0f;
        if (z) {
            access$2100 = 0.0f;
        }
        return getSpringAnimation(view, SpringAnimation.TRANSLATION_X, f, access$2100);
    }

    @Override // com.squareup.cash.card.onboarding.core.HeatMaskProvider
    public int getTextureId() {
        HeatMaskRenderer heatMaskRenderer = ((CardScene) this.zza).heatMaskRenderer;
        if (heatMaskRenderer != null) {
            return heatMaskRenderer.getTextureId();
        }
        a$$ExternalSyntheticBUOutline0.m$1("getTextureId() called but heatMaskRenderer is null");
        return 0;
    }

    public int getToolbarTranslationX(Toolbar toolbar) {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.zza;
        int viewLeftFromSearchViewParent = searchViewAnimationHelper.getViewLeftFromSearchViewParent(searchViewAnimationHelper.searchBar);
        FrameLayout frameLayout = searchViewAnimationHelper.toolbarContainer;
        int paddingStart = frameLayout.getPaddingStart();
        int marginStart = ((ViewGroup.MarginLayoutParams) toolbar.getLayoutParams()).getMarginStart();
        return ViewUtils.isLayoutRtl(searchViewAnimationHelper.searchBar) ? (searchViewAnimationHelper.searchBar.getWidth() + viewLeftFromSearchViewParent) - ((frameLayout.getWidth() - paddingStart) - marginStart) : (viewLeftFromSearchViewParent - paddingStart) - marginStart;
    }

    public SpringAnimation getToolbarWidthSpringAnimation(final Toolbar toolbar, final boolean z) {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.zza;
        int width = searchViewAnimationHelper.searchBar.getWidth();
        FrameLayout frameLayout = searchViewAnimationHelper.toolbarContainer;
        int width2 = frameLayout.getWidth();
        int paddingEnd = frameLayout.getPaddingEnd() + frameLayout.getPaddingStart();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchViewAnimationHelper.toolbar.getLayoutParams();
        int marginEnd = (width2 - paddingEnd) - (marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart());
        int i = z ? width : marginEnd;
        if (z) {
            width = marginEnd;
        }
        SpringAnimation springAnimation = getSpringAnimation(toolbar, new MaterialButton.AnonymousClass1(this), i, width);
        springAnimation.addEndListener(new DynamicAnimation$OnAnimationEndListener(this) { // from class: com.google.android.material.search.SearchViewAnimationHelper$ContainedAnimationDelegate$$ExternalSyntheticLambda0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener
            public final void onAnimationEnd(SpringAnimation springAnimation2, boolean z2, float f, float f2) {
                if (z) {
                    Toolbar toolbar2 = toolbar;
                    ViewGroup.LayoutParams layoutParams = toolbar2.getLayoutParams();
                    layoutParams.width = -1;
                    toolbar2.setLayoutParams(layoutParams);
                }
            }
        });
        return springAnimation;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public Obfuscator getUrl() {
        zzxz zzxzVar = ((zzyb) this.zza).zzk;
        if (zzxzVar != null) {
            return new Obfuscator(zzxzVar.zzb, 3);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public int getValueType() {
        return ((zzyb) this.zza).zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(EarningsTrackerScreen earningsTrackerScreen, String str, ContinuationImpl continuationImpl) {
        RealGetCustomerProfileScreen$invoke$1 realGetCustomerProfileScreen$invoke$1;
        int i;
        EarningsTrackerScreen earningsTrackerScreen2;
        Recipient recipient;
        Screen profileFor;
        if (continuationImpl instanceof RealGetCustomerProfileScreen$invoke$1) {
            realGetCustomerProfileScreen$invoke$1 = (RealGetCustomerProfileScreen$invoke$1) continuationImpl;
            int i2 = realGetCustomerProfileScreen$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGetCustomerProfileScreen$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGetCustomerProfileScreen$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGetCustomerProfileScreen$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow customerForId = ((RealCustomerStore) this.zza).getCustomerForId(str);
                    realGetCustomerProfileScreen$invoke$1.L$0 = earningsTrackerScreen;
                    realGetCustomerProfileScreen$invoke$1.label = 1;
                    Object first = FlowKt.first(customerForId, realGetCustomerProfileScreen$invoke$1);
                    if (first == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    earningsTrackerScreen2 = earningsTrackerScreen;
                    obj = first;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    EarningsTrackerScreen earningsTrackerScreen3 = realGetCustomerProfileScreen$invoke$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    earningsTrackerScreen2 = earningsTrackerScreen3;
                }
                recipient = (Recipient) obj;
                if (recipient != null) {
                    return null;
                }
                String str2 = recipient.customerId;
                str2.getClass();
                RedactedString redactedString = new RedactedString(str2);
                boolean z = recipient.isBusiness;
                String str3 = recipient.displayName;
                str3.getClass();
                RedactedString redactedString2 = new RedactedString(str3);
                String str4 = recipient.cashtag;
                RedactedString redactedString3 = str4 != null ? new RedactedString(str4) : null;
                String str5 = recipient.email;
                RedactedString redactedString4 = str5 != null ? new RedactedString(str5) : null;
                String str6 = recipient.sms;
                ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = new ProfileScreens.ProfileScreen.Customer.CashCustomer(redactedString, new ProfileScreens.ProfileScreen.Customer.CashCustomer.CashCustomerData(redactedString2, redactedString3, redactedString4, str6 != null ? new RedactedString(str6) : null, recipient.photo, recipient.themedAccentColor, recipient.region, true, recipient.isBusiness, recipient.isVerified, new Long(recipient.creditCardFee), recipient.blockState, recipient.category, recipient.canAcceptPayments), z, 8);
                LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                profileFor = ProfileLauncher.profileFor(cashCustomer, new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.BACK, RealUuidGenerator.generate(), GetProfileDetailsContext.UNKNOWN, CustomerProfileViewOpen.EntryPoint.C4B_EARNINGS_TRACKER, earningsTrackerScreen2, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                return profileFor;
            }
        }
        realGetCustomerProfileScreen$invoke$1 = new RealGetCustomerProfileScreen$invoke$1(this, continuationImpl);
        Object obj2 = realGetCustomerProfileScreen$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGetCustomerProfileScreen$invoke$1.label;
        if (i != 0) {
        }
        recipient = (Recipient) obj2;
        if (recipient != null) {
        }
    }

    @Override // com.squareup.cash.card.onboarding.core.HeatMaskProvider
    public boolean isReady() {
        HeatMaskRenderer heatMaskRenderer = ((CardScene) this.zza).heatMaskRenderer;
        return heatMaskRenderer != null && heatMaskRenderer.isReady();
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        gapComposer.startReplaceGroup(-1975090463);
        boolean changed = gapComposer.changed(screenNavigator);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = ((KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl) this.zza).create(screenNavigator, new KybRestrictionBannerScreen(new BitcoinHome(null, null, null, null, 15), KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_BTC));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        UiCallbackModel models = ((MoleculeCallbackPresenter) rememberedValue).models(gapComposer);
        KybRestrictionModel kybRestrictionModel = ((KybRestrictionBannerViewModel) models.model) != null ? new KybRestrictionModel(models) : null;
        gapComposer.end(false);
        return kybRestrictionModel;
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public void onAnimationEnd(boolean z) {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.zza;
        TouchObserverFrameLayout touchObserverFrameLayout = searchViewAnimationHelper.contentContainer;
        if (z) {
            searchViewAnimationHelper.backgroundView.getBackground().mutate().setAlpha((int) (1.0f * 255.0f));
            touchObserverFrameLayout.setAlpha(1.0f);
        } else {
            searchViewAnimationHelper.backgroundView.getBackground().mutate().setAlpha((int) (RecyclerView.DECELERATION_RATE * 255.0f));
            touchObserverFrameLayout.setAlpha(RecyclerView.DECELERATION_RATE);
            searchViewAnimationHelper.searchBar.setVisibility(0);
        }
        searchViewAnimationHelper.dummyToolbar.setVisibility(4);
        TextView textView = searchViewAnimationHelper.dummyTextView;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = -2;
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public void onAnimationStart(boolean z) {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.zza;
        TouchObserverFrameLayout touchObserverFrameLayout = searchViewAnimationHelper.contentContainer;
        if (z) {
            searchViewAnimationHelper.backgroundView.getBackground().mutate().setAlpha((int) (RecyclerView.DECELERATION_RATE * 255.0f));
            searchViewAnimationHelper.toolbar.setAlpha(RecyclerView.DECELERATION_RATE);
            touchObserverFrameLayout.setAlpha(RecyclerView.DECELERATION_RATE);
            searchViewAnimationHelper.searchBar.setVisibility(4);
        } else {
            searchViewAnimationHelper.backgroundView.getBackground().mutate().setAlpha((int) (1.0f * 255.0f));
            touchObserverFrameLayout.setAlpha(1.0f);
        }
        searchViewAnimationHelper.dummyToolbar.setVisibility(0);
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onCharacterAdded(KeypadAmount keypadAmount, char c) {
        KeypadScaffoldBinding.access$stateChanged((KeypadScaffoldBinding) this.zza, keypadAmount);
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onCharacterRemoved(KeypadAmount keypadAmount) {
        KeypadScaffoldBinding.access$stateChanged((KeypadScaffoldBinding) this.zza, keypadAmount);
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        switch (this.$r8$classId) {
            case 15:
                break;
            default:
                Timber.Forest.e(errorResult.throwable);
                break;
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onInvalidChange() {
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onReset() {
        KeypadScaffoldBinding keypadScaffoldBinding = (KeypadScaffoldBinding) this.zza;
        KeypadScaffoldBinding.access$stateChanged(keypadScaffoldBinding, keypadScaffoldBinding.keypadAmount);
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(SuccessResult successResult) {
        Bitmap bitmap;
        Bitmap bitmap2;
        switch (this.$r8$classId) {
            case 15:
                BadgeQueries$$ExternalSyntheticLambda0 badgeQueries$$ExternalSyntheticLambda0 = (BadgeQueries$$ExternalSyntheticLambda0) this.zza;
                bitmap = Image_androidKt.toBitmap(r2, r2.getWidth(), successResult.image.getHeight());
                badgeQueries$$ExternalSyntheticLambda0.invoke(bitmap);
                break;
            default:
                RecipientQueries$$ExternalSyntheticLambda0 recipientQueries$$ExternalSyntheticLambda0 = (RecipientQueries$$ExternalSyntheticLambda0) this.zza;
                bitmap2 = Image_androidKt.toBitmap(r2, r2.getWidth(), successResult.image.getHeight());
                recipientQueries$$ExternalSyntheticLambda0.invoke(bitmap2);
                break;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.zza;
        if (!swipeDismissBehavior.canSwipeDismissView(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.swipeDirection;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        view.offsetLeftAndRight(width);
        view.setAlpha(RecyclerView.DECELERATION_RATE);
        zzb zzbVar = swipeDismissBehavior.listener;
        if (zzbVar != null) {
            zzbVar.onDismiss(view);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rejectPhoneVerificationAttempt(String str, ContinuationImpl continuationImpl) {
        RealPhoneVerificationService$rejectPhoneVerificationAttempt$1 realPhoneVerificationService$rejectPhoneVerificationAttempt$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealPhoneVerificationService$rejectPhoneVerificationAttempt$1) {
            realPhoneVerificationService$rejectPhoneVerificationAttempt$1 = (RealPhoneVerificationService$rejectPhoneVerificationAttempt$1) continuationImpl;
            int i2 = realPhoneVerificationService$rejectPhoneVerificationAttempt$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPhoneVerificationService$rejectPhoneVerificationAttempt$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPhoneVerificationService$rejectPhoneVerificationAttempt$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPhoneVerificationService$rejectPhoneVerificationAttempt$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    VerificationAppService verificationAppService = (VerificationAppService) this.zza;
                    RejectPhoneVerificationAttemptRequest rejectPhoneVerificationAttemptRequest = new RejectPhoneVerificationAttemptRequest(null, str, ByteString.EMPTY);
                    realPhoneVerificationService$rejectPhoneVerificationAttempt$1.label = 1;
                    obj = verificationAppService.rejectPhoneVerificationAttempt(rejectPhoneVerificationAttemptRequest, realPhoneVerificationService$rejectPhoneVerificationAttempt$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new PhoneVerificationService$PhoneVerificationResult.Failure((ApiResult.Failure) apiResult);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RejectPhoneVerificationAttemptResponse rejectPhoneVerificationAttemptResponse = (RejectPhoneVerificationAttemptResponse) ((ApiResult.Success) apiResult).response;
                PhoneVerificationAttemptState phoneVerificationAttemptState = rejectPhoneVerificationAttemptResponse.verification_state;
                if (phoneVerificationAttemptState == null) {
                    phoneVerificationAttemptState = PhoneVerificationAttemptState.INVALID;
                }
                BoxKt verificationState = toVerificationState(phoneVerificationAttemptState, null, null);
                String str2 = rejectPhoneVerificationAttemptResponse.title;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = rejectPhoneVerificationAttemptResponse.message;
                return new PhoneVerificationService$PhoneVerificationResult.Success(verificationState, str2, str3 != null ? str3 : "", rejectPhoneVerificationAttemptResponse.article_token);
            }
        }
        realPhoneVerificationService$rejectPhoneVerificationAttempt$1 = new RealPhoneVerificationService$rejectPhoneVerificationAttempt$1(this, continuationImpl);
        Object obj2 = realPhoneVerificationService$rejectPhoneVerificationAttempt$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPhoneVerificationService$rejectPhoneVerificationAttempt$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public void setUpDummyToolbarIfNeeded() {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.zza;
        Toolbar toolbar = searchViewAnimationHelper.dummyToolbar;
        TextView textView = searchViewAnimationHelper.searchBar.textView;
        TextView textView2 = searchViewAnimationHelper.dummyTextView;
        textView2.setText(textView.getText());
        textView2.setHint(textView.getHint());
        textView2.setVisibility(0);
        if (searchViewAnimationHelper.searchBar.getBackground() != null && searchViewAnimationHelper.searchBar.getBackground().getConstantState() != null) {
            toolbar.setBackground(searchViewAnimationHelper.searchBar.getBackground().getConstantState().newDrawable());
        }
        MenuBuilder menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (SearchViewAnimationHelper.access$500(searchViewAnimationHelper)) {
            toolbar.inflateMenu(searchViewAnimationHelper.searchBar.menuResId);
            SearchViewAnimationHelper.access$700(searchViewAnimationHelper, toolbar);
        }
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public void startButtonsTranslationAnimation() {
    }

    public void trackAppUpgrade(boolean z, AppUpgradeAnalytics$Option appUpgradeAnalytics$Option) {
        AppNavigateSelectVersionUpdateOption.Option option;
        Analytics analytics = (Analytics) this.zza;
        AppNavigateSelectVersionUpdateOption.UpdateType updateType = z ? AppNavigateSelectVersionUpdateOption.UpdateType.FORCED : AppNavigateSelectVersionUpdateOption.UpdateType.SUGGESTED;
        int ordinal = appUpgradeAnalytics$Option.ordinal();
        if (ordinal == 0) {
            option = AppNavigateSelectVersionUpdateOption.Option.VISIT_APP_STORE;
        } else if (ordinal == 1) {
            option = AppNavigateSelectVersionUpdateOption.Option.DISMISS;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            option = AppNavigateSelectVersionUpdateOption.Option.OPEN_WEB_VERSION;
        }
        analytics.track(new AppNavigateSelectVersionUpdateOption(updateType, option), null);
    }

    public synchronized void zza(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            zzc(assets, (File) it.next());
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onReset(KeypadAmount keypadAmount) {
        KeypadScaffoldBinding.access$stateChanged((KeypadScaffoldBinding) this.zza, keypadAmount);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public Object zza() {
        return ((zzi) this.zza).zza;
    }

    public /* synthetic */ zzr(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    public zzr(SharedPreferences sharedPreferences) {
        this.$r8$classId = 12;
        sharedPreferences.getClass();
        this.zza = sharedPreferences;
    }

    public zzr(Context context) {
        this.$r8$classId = 26;
        this.zza = new CameraX$$ExternalSyntheticLambda0(context, 9);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        ((Function1) this.zza).invoke(obj);
    }

    public zzr(RealCustomerStore realCustomerStore, RealUuidGenerator realUuidGenerator) {
        this.$r8$classId = 22;
        this.zza = realCustomerStore;
    }

    public zzr(byte[] bArr) {
        this.$r8$classId = 10;
        if (re$$ExternalSyntheticOutline0._isCompatible$1(2)) {
            this.zza = AesGcmJceUtil.getSecretKey(bArr);
        } else {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }
}
