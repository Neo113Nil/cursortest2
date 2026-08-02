package com.squareup.cash.blockers.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealCartBuilderManager;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.RealOrderBuilder$Factory$Impl;
import app.cash.local.presenters.RealOrderBuilderStore;
import app.cash.local.presenters.brand.checkout.OpenTabCheckoutRouting;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1;
import com.squareup.cash.support.backend.api.activities.Amount;
import com.squareup.cash.support.backend.api.activities.AmountTreatment;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionMapper;
import com.squareup.cash.support.backend.real.RealSupportTransactionMapper;
import com.squareup.cash.support.backend.real.RealSupportTransactionService;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.android.StringsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import sqip.CardEntry;

/* loaded from: classes7.dex */
public final class FormBlockerPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $elementResults;
    public final /* synthetic */ int $r8$classId = 1;
    public Object $signedOut$delegate;
    public final /* synthetic */ Object $submissionState$delegate;
    public int I$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBlockerPresenter$models$3$1(LocalBrandLocationCartPresenter localBrandLocationCartPresenter, BuyerIntentScope buyerIntentScope, int i, CartBuilder cartBuilder, BrandSpotSyncTokens brandSpotSyncTokens, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localBrandLocationCartPresenter;
        this.$signedOut$delegate = buyerIntentScope;
        this.label = i;
        this.L$4 = cartBuilder;
        this.$elementResults = brandSpotSyncTokens;
        this.L$2 = state;
        this.L$3 = mutableState;
        this.$submissionState$delegate = mutableState2;
        this.L$5 = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$elementResults;
        Object obj3 = this.$submissionState$delegate;
        switch (i) {
            case 0:
                return new FormBlockerPresenter$models$3$1((FormBlockerPresenter) this.this$0, (State) this.$signedOut$delegate, (MutableState) obj3, (Map) obj2, continuation);
            case 1:
                return new FormBlockerPresenter$models$3$1((LocalBrandLocationCartPresenter) this.this$0, (BuyerIntentScope) this.$signedOut$delegate, this.label, (CartBuilder) this.L$4, (BrandSpotSyncTokens) obj2, (State) this.L$2, (MutableState) this.L$3, (MutableState) obj3, (MutableState) this.L$5, continuation);
            default:
                return new FormBlockerPresenter$models$3$1((List) obj3, (RealSupportTransactionService) this.L$4, (ZiplineHistoryDataJavaScripter) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FormBlockerPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x02a2, code lost:
    
        if (((app.cash.local.store.real.RealLocalInstalledStore) r1).m1288clearScheduledFulfillmentConfigurationNmdeRlM(r2, r5) == r13) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x023c, code lost:
    
        if (r0 == r13) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006a  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x00b4 -> B:10:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:199:0x03b2 -> B:192:0x03b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        FormBlockerPresenter formBlockerPresenter;
        Iterator it;
        State state;
        Map map;
        Object createCart;
        CreateCartResponse createCartResponse;
        LocalErrorResponse localErrorResponse;
        List list;
        RealSupportTransactionService realSupportTransactionService;
        ListBuilder createListBuilder;
        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter;
        Iterator it2;
        List list2;
        int i;
        Exception e;
        RealSupportTransactionService realSupportTransactionService2;
        RealSupportTransactionService realSupportTransactionService3;
        SupportTransaction supportTransaction;
        String str;
        Image image;
        String str2;
        String str3;
        String str4;
        Color color;
        Color.ModeVariant modeVariant;
        String str5;
        Integer safeParseColor;
        Image image2;
        Image image3;
        String str6;
        Color color2;
        Color.ModeVariant modeVariant2;
        String str7;
        FormBlockerPresenter$models$3$1 formBlockerPresenter$models$3$1 = this;
        int i2 = formBlockerPresenter$models$3$1.$r8$classId;
        Object obj2 = formBlockerPresenter$models$3$1.$submissionState$delegate;
        Object obj3 = formBlockerPresenter$models$3$1.$elementResults;
        final int i3 = 0;
        final int i4 = 1;
        switch (i2) {
            case 0:
                int i5 = 0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = formBlockerPresenter$models$3$1.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FormBlockerPresenter formBlockerPresenter2 = (FormBlockerPresenter) formBlockerPresenter$models$3$1.this$0;
                    List list3 = formBlockerPresenter2.args.onAppearActions;
                    State state2 = (State) formBlockerPresenter$models$3$1.$signedOut$delegate;
                    mutableState = (MutableState) obj2;
                    formBlockerPresenter = formBlockerPresenter2;
                    it = list3.iterator();
                    state = state2;
                    map = (Map) obj3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = formBlockerPresenter$models$3$1.I$0;
                    Iterator it3 = (Iterator) formBlockerPresenter$models$3$1.L$5;
                    Map map2 = (Map) formBlockerPresenter$models$3$1.L$4;
                    MutableState mutableState2 = (MutableState) formBlockerPresenter$models$3$1.L$3;
                    State state3 = (State) formBlockerPresenter$models$3$1.L$2;
                    FormBlockerPresenter formBlockerPresenter3 = (FormBlockerPresenter) formBlockerPresenter$models$3$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    it = it3;
                    map = map2;
                    mutableState = mutableState2;
                    state = state3;
                    formBlockerPresenter = formBlockerPresenter3;
                    formBlockerPresenter$models$3$1 = this;
                    if (it.hasNext()) {
                        BlockerAction blockerAction = (BlockerAction) it.next();
                        RealBlockersHelper realBlockersHelper = formBlockerPresenter.blockersHelper;
                        BlockersScreens.FormScreen formScreen = formBlockerPresenter.args;
                        FormBlockerPresenter$models$3$1$1$1 formBlockerPresenter$models$3$1$1$1 = new FormBlockerPresenter$models$3$1$1$1(formBlockerPresenter, state, mutableState, map, null);
                        MutableState mutableState3 = mutableState;
                        formBlockerPresenter$models$3$1.L$1 = formBlockerPresenter;
                        formBlockerPresenter$models$3$1.L$2 = state;
                        formBlockerPresenter$models$3$1.L$3 = mutableState3;
                        formBlockerPresenter$models$3$1.L$4 = map;
                        formBlockerPresenter$models$3$1.L$5 = it;
                        formBlockerPresenter$models$3$1.I$0 = i5;
                        formBlockerPresenter$models$3$1.label = 1;
                        int i7 = i5;
                        if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, formScreen, null, null, false, null, formBlockerPresenter$models$3$1$1$1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i5 = i7;
                        mutableState = mutableState3;
                        formBlockerPresenter$models$3$1 = this;
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            case 1:
                MutableState mutableState4 = (MutableState) formBlockerPresenter$models$3$1.L$3;
                MutableState mutableState5 = (MutableState) obj2;
                LocalBrandLocationCartPresenter localBrandLocationCartPresenter = (LocalBrandLocationCartPresenter) formBlockerPresenter$models$3$1.this$0;
                BetterNavigator.ScreenNavigator screenNavigator = localBrandLocationCartPresenter.navigator;
                LocalBrandLocationCartScreen localBrandLocationCartScreen = localBrandLocationCartPresenter.screen;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = formBlockerPresenter$models$3$1.I$0;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CartBuilderManager cartBuilderManager = localBrandLocationCartPresenter.cartManager;
                    BrandSpot brandSpot = localBrandLocationCartPresenter.brandSpot;
                    FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) ((State) formBlockerPresenter$models$3$1.L$2).getValue();
                    fulfillmentConfiguration.getClass();
                    BuyerIntentScope buyerIntentScope = (BuyerIntentScope) formBlockerPresenter$models$3$1.$signedOut$delegate;
                    formBlockerPresenter$models$3$1.I$0 = 1;
                    createCart = ((RealCartBuilderManager) cartBuilderManager).createCart(brandSpot, fulfillmentConfiguration, new AttributionKey(null), buyerIntentScope, formBlockerPresenter$models$3$1);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        createCartResponse = (CreateCartResponse) formBlockerPresenter$models$3$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        CreateCartResponse createCartResponse2 = createCartResponse;
                        RealOrderBuilderStore realOrderBuilderStore = localBrandLocationCartPresenter.orderStore;
                        RealOrderBuilder$Factory$Impl realOrderBuilder$Factory$Impl = localBrandLocationCartPresenter.orderBuilderFactory;
                        BrandSpot brandSpot2 = localBrandLocationCartScreen.brandSpot;
                        AttributionKey attributionKey = localBrandLocationCartScreen.attributionKey;
                        String str8 = ((RealCartBuilder) ((CartBuilder) formBlockerPresenter$models$3$1.L$4)).checkoutFlowToken;
                        RealOrderBuilder realOrderBuilder = realOrderBuilderStore.active;
                        RealOrderBuilder create = realOrderBuilder$Factory$Impl.create(brandSpot2, createCartResponse2, attributionKey, screenNavigator, str8, realOrderBuilder != null ? realOrderBuilder.payload() : null, localBrandLocationCartScreen.isProfileSheetInline, (BrandSpotSyncTokens) obj3, (BuyerIntentScope) formBlockerPresenter$models$3$1.$signedOut$delegate);
                        realOrderBuilderStore.active = create;
                        CardEntry.setCardNonceBackgroundHandler(create);
                        screenNavigator.goTo(BaseRepositoryKt.toCheckoutScreen$default(createCartResponse2, localBrandLocationCartPresenter.brandSpot, localBrandLocationCartScreen.attributionKey, localBrandLocationCartScreen.isProfileSheetInline, (BrandSpotSyncTokens) obj3, OpenTabCheckoutRouting.OPEN_TAB_WHEN_AVAILABLE));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    createCart = obj;
                }
                createCartResponse = (CreateCartResponse) createCart;
                if (createCartResponse != null) {
                    zzho zzhoVar = createCartResponse.response;
                    if (zzhoVar != null) {
                        CreateCartResponse$Response$ErrorResponse createCartResponse$Response$ErrorResponse = zzhoVar instanceof CreateCartResponse$Response$ErrorResponse ? (CreateCartResponse$Response$ErrorResponse) zzhoVar : null;
                        if (createCartResponse$Response$ErrorResponse != null) {
                            localErrorResponse = createCartResponse$Response$ErrorResponse.value;
                            if (localErrorResponse != null) {
                                mutableState5.setValue(Integer.valueOf(formBlockerPresenter$models$3$1.label));
                                LocalInstalledStore localInstalledStore = localBrandLocationCartPresenter.store;
                                String str9 = localBrandLocationCartPresenter.brandSpot.brandToken;
                                formBlockerPresenter$models$3$1.L$1 = createCartResponse;
                                formBlockerPresenter$models$3$1.I$0 = 2;
                                break;
                            } else {
                                mutableState4.setValue(Boolean.valueOf(false));
                                mutableState5.setValue(null);
                                MutableState mutableState6 = (MutableState) formBlockerPresenter$models$3$1.L$5;
                                if (zzhoVar != null) {
                                    CreateCartResponse$Response$ErrorResponse createCartResponse$Response$ErrorResponse2 = zzhoVar instanceof CreateCartResponse$Response$ErrorResponse ? (CreateCartResponse$Response$ErrorResponse) zzhoVar : null;
                                    LocalErrorResponse localErrorResponse2 = createCartResponse$Response$ErrorResponse2 != null ? createCartResponse$Response$ErrorResponse2.value : null;
                                    if (localErrorResponse2 != null) {
                                        list = localErrorResponse2.errors;
                                        if (list == null) {
                                            list = EmptyList.INSTANCE;
                                        }
                                        mutableState6.setValue(localBrandLocationCartPresenter.toCreateCartErrorViewModels(list));
                                    }
                                }
                                list = null;
                                if (list == null) {
                                }
                                mutableState6.setValue(localBrandLocationCartPresenter.toCreateCartErrorViewModels(list));
                            }
                        }
                    }
                    localErrorResponse = null;
                    if (localErrorResponse != null) {
                    }
                } else {
                    mutableState4.setValue(Boolean.valueOf(false));
                    mutableState5.setValue(null);
                    screenNavigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = formBlockerPresenter$models$3$1.label;
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    realSupportTransactionService = (RealSupportTransactionService) formBlockerPresenter$models$3$1.L$4;
                    createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj3;
                    it2 = ((List) obj2).iterator();
                    list2 = createListBuilder;
                    i = 0;
                    while (it2.hasNext()) {
                    }
                    return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                }
                if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = formBlockerPresenter$models$3$1.I$0;
                String str10 = (String) formBlockerPresenter$models$3$1.L$3;
                it2 = (Iterator) formBlockerPresenter$models$3$1.L$5;
                list2 = (List) formBlockerPresenter$models$3$1.$signedOut$delegate;
                List list4 = (List) formBlockerPresenter$models$3$1.L$2;
                ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) formBlockerPresenter$models$3$1.this$0;
                RealSupportTransactionService realSupportTransactionService4 = (RealSupportTransactionService) formBlockerPresenter$models$3$1.L$1;
                try {
                    SafeTrace.throwOnFailure(obj);
                    Object withContext = obj;
                    String str11 = str10;
                    createListBuilder = list4;
                    realSupportTransactionService = realSupportTransactionService4;
                    try {
                        PaymentHistoryData paymentHistoryData = (PaymentHistoryData) withContext;
                        final RealSupportTransactionMapper realSupportTransactionMapper = (RealSupportTransactionMapper) realSupportTransactionService.supportTransactionMapper;
                        if (paymentHistoryData != null || str11 == null) {
                            supportTransaction = null;
                        } else {
                            UiAvatar uiAvatar = paymentHistoryData.ui_avatar;
                            if (uiAvatar == null) {
                                Avatar avatar = paymentHistoryData.avatar;
                                uiAvatar = avatar != null ? StackedAvatarViewModelKt.toUiAvatar(avatar) : null;
                            }
                            Integer safeParseColor2 = (uiAvatar == null || (color2 = uiAvatar.background_color) == null || (modeVariant2 = color2.light) == null || (str7 = modeVariant2.srgb) == null) ? null : StringsKt.safeParseColor(str7, new Function1() { // from class: com.squareup.cash.support.backend.real.RealSupportTransactionMapper$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i10 = i3;
                                    ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy2 = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                    RealSupportTransactionMapper realSupportTransactionMapper2 = realSupportTransactionMapper;
                                    Exception exc = (Exception) obj4;
                                    switch (i10) {
                                        case 0:
                                            exc.getClass();
                                            realSupportTransactionMapper2.errorReporter.report(new SupportTransactionMapper.SupportInvalidColorFormatError(Recorder$$ExternalSyntheticOutline2.m("invalid accent_color ", exc.getMessage())), defaultSamplingStrategy2);
                                            break;
                                        default:
                                            exc.getClass();
                                            realSupportTransactionMapper2.errorReporter.report(new SupportTransactionMapper.SupportInvalidColorFormatError(Recorder$$ExternalSyntheticOutline2.m("invalid dark_theme_accent_color ", exc.getMessage())), defaultSamplingStrategy2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                            String str12 = (uiAvatar == null || (str6 = uiAvatar.monogram_text) == null) ? "" : str6;
                            boolean areEqual = uiAvatar != null ? Intrinsics.areEqual(uiAvatar.is_template_avatar, Boolean.TRUE) : false;
                            String str13 = (uiAvatar == null || (image3 = uiAvatar.image) == null) ? null : image3.light_url;
                            if (uiAvatar == null || (image2 = uiAvatar.image) == null || (str2 = image2.dark_url) == null) {
                                if (uiAvatar == null || (image = uiAvatar.image) == null) {
                                    str = null;
                                    com.squareup.cash.support.backend.api.activities.Avatar avatar2 = new com.squareup.cash.support.backend.api.activities.Avatar(str12, areEqual, str13, safeParseColor2, str, (uiAvatar != null || (color = uiAvatar.background_color) == null || (modeVariant = color.dark) == null || (str5 = modeVariant.srgb) == null || (safeParseColor = StringsKt.safeParseColor(str5, new Function1() { // from class: com.squareup.cash.support.backend.real.RealSupportTransactionMapper$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            int i10 = i4;
                                            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy2 = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                            RealSupportTransactionMapper realSupportTransactionMapper2 = realSupportTransactionMapper;
                                            Exception exc = (Exception) obj4;
                                            switch (i10) {
                                                case 0:
                                                    exc.getClass();
                                                    realSupportTransactionMapper2.errorReporter.report(new SupportTransactionMapper.SupportInvalidColorFormatError(Recorder$$ExternalSyntheticOutline2.m("invalid accent_color ", exc.getMessage())), defaultSamplingStrategy2);
                                                    break;
                                                default:
                                                    exc.getClass();
                                                    realSupportTransactionMapper2.errorReporter.report(new SupportTransactionMapper.SupportInvalidColorFormatError(Recorder$$ExternalSyntheticOutline2.m("invalid dark_theme_accent_color ", exc.getMessage())), defaultSamplingStrategy2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    })) == null) ? safeParseColor2 : safeParseColor);
                                    str3 = paymentHistoryData.amount_formatted_activity_list;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    PaymentHistoryData.AmountTreatment amountTreatment = paymentHistoryData.amount_treatment_activity_list;
                                    int i10 = amountTreatment != null ? -1 : RealSupportTransactionMapper.WhenMappings.$EnumSwitchMapping$0[amountTreatment.ordinal()];
                                    Amount amount = new Amount(str3, i10 == 1 ? AmountTreatment.FADED : i10 == 2 ? AmountTreatment.FADED_AND_STRIKE_THROUGH : i10 != 3 ? AmountTreatment.STANDARD : AmountTreatment.STANDARD);
                                    str4 = paymentHistoryData.primary_label;
                                    if (str4 == null && (str4 = paymentHistoryData.title) == null) {
                                        str4 = "";
                                    }
                                    String str14 = paymentHistoryData.secondary_label;
                                    String str15 = (str14 == null || (str14 = paymentHistoryData.subtitle) != null) ? str14 : "";
                                    String str16 = paymentHistoryData.tertiary_label;
                                    supportTransaction = new SupportTransaction(str11, str4, str15, str16 != null ? "" : str16, avatar2, amount);
                                } else {
                                    str2 = image.light_url;
                                }
                            }
                            str = str2;
                            com.squareup.cash.support.backend.api.activities.Avatar avatar22 = new com.squareup.cash.support.backend.api.activities.Avatar(str12, areEqual, str13, safeParseColor2, str, (uiAvatar != null || (color = uiAvatar.background_color) == null || (modeVariant = color.dark) == null || (str5 = modeVariant.srgb) == null || (safeParseColor = StringsKt.safeParseColor(str5, new Function1() { // from class: com.squareup.cash.support.backend.real.RealSupportTransactionMapper$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i102 = i4;
                                    ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy2 = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                    RealSupportTransactionMapper realSupportTransactionMapper2 = realSupportTransactionMapper;
                                    Exception exc = (Exception) obj4;
                                    switch (i102) {
                                        case 0:
                                            exc.getClass();
                                            realSupportTransactionMapper2.errorReporter.report(new SupportTransactionMapper.SupportInvalidColorFormatError(Recorder$$ExternalSyntheticOutline2.m("invalid accent_color ", exc.getMessage())), defaultSamplingStrategy2);
                                            break;
                                        default:
                                            exc.getClass();
                                            realSupportTransactionMapper2.errorReporter.report(new SupportTransactionMapper.SupportInvalidColorFormatError(Recorder$$ExternalSyntheticOutline2.m("invalid dark_theme_accent_color ", exc.getMessage())), defaultSamplingStrategy2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            })) == null) ? safeParseColor2 : safeParseColor);
                            str3 = paymentHistoryData.amount_formatted_activity_list;
                            if (str3 == null) {
                            }
                            PaymentHistoryData.AmountTreatment amountTreatment2 = paymentHistoryData.amount_treatment_activity_list;
                            if (amountTreatment2 != null) {
                            }
                            Amount amount2 = new Amount(str3, i10 == 1 ? AmountTreatment.FADED : i10 == 2 ? AmountTreatment.FADED_AND_STRIKE_THROUGH : i10 != 3 ? AmountTreatment.STANDARD : AmountTreatment.STANDARD);
                            str4 = paymentHistoryData.primary_label;
                            if (str4 == null) {
                                str4 = "";
                            }
                            String str142 = paymentHistoryData.secondary_label;
                            if (str142 == null) {
                            }
                            String str162 = paymentHistoryData.tertiary_label;
                            supportTransaction = new SupportTransaction(str11, str4, str15, str162 != null ? "" : str162, avatar22, amount2);
                        }
                        if (supportTransaction != null) {
                            list2.add(supportTransaction);
                        }
                        i3 = 0;
                        while (it2.hasNext()) {
                            PaymentHistoryInputsRow paymentHistoryInputsRow = (PaymentHistoryInputsRow) it2.next();
                            String str17 = paymentHistoryInputsRow.entity_id;
                            if (str17 == null) {
                                realSupportTransactionService.errorReporter.report(new RealSupportTransactionService.SupportTransactionLoadingError("Support transaction miss entity ID"), defaultSamplingStrategy);
                            } else {
                                try {
                                    try {
                                        try {
                                            CoroutineContext coroutineContext = realSupportTransactionService.jsDispatcher;
                                            RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1 realPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1 = new RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1(ziplineHistoryDataJavaScripter, paymentHistoryInputsRow, str17, null, 1);
                                            formBlockerPresenter$models$3$1.L$1 = realSupportTransactionService2;
                                            formBlockerPresenter$models$3$1.this$0 = ziplineHistoryDataJavaScripter;
                                            formBlockerPresenter$models$3$1.L$2 = createListBuilder;
                                            formBlockerPresenter$models$3$1.$signedOut$delegate = list2;
                                            formBlockerPresenter$models$3$1.L$5 = it2;
                                            formBlockerPresenter$models$3$1.L$3 = str17;
                                            formBlockerPresenter$models$3$1.I$0 = i;
                                            formBlockerPresenter$models$3$1.label = 1;
                                            withContext = JobKt.withContext(coroutineContext, realPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1, formBlockerPresenter$models$3$1);
                                            if (withContext == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            realSupportTransactionService = realSupportTransactionService2;
                                            str11 = str17;
                                            PaymentHistoryData paymentHistoryData2 = (PaymentHistoryData) withContext;
                                            final RealSupportTransactionMapper realSupportTransactionMapper2 = (RealSupportTransactionMapper) realSupportTransactionService.supportTransactionMapper;
                                            if (paymentHistoryData2 != null) {
                                            }
                                            supportTransaction = null;
                                            if (supportTransaction != null) {
                                            }
                                            i3 = 0;
                                            while (it2.hasNext()) {
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            realSupportTransactionService2 = realSupportTransactionService3;
                                        }
                                        realSupportTransactionService3 = realSupportTransactionService;
                                    } catch (Exception e3) {
                                        e = e3;
                                        list4 = createListBuilder;
                                        realSupportTransactionService4 = realSupportTransactionService2;
                                        realSupportTransactionService4.errorReporter.report(new RealSupportTransactionService.SupportTransactionLoadingError(Recorder$$ExternalSyntheticOutline2.m("Support transaction render error: ", e.getMessage())), defaultSamplingStrategy);
                                        list2.clear();
                                        createListBuilder = list4;
                                        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                                    }
                                    realSupportTransactionService2 = realSupportTransactionService3;
                                } catch (Exception e4) {
                                    e = e4;
                                    realSupportTransactionService2 = realSupportTransactionService;
                                }
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        realSupportTransactionService4 = realSupportTransactionService;
                        list4 = createListBuilder;
                        realSupportTransactionService4.errorReporter.report(new RealSupportTransactionService.SupportTransactionLoadingError(Recorder$$ExternalSyntheticOutline2.m("Support transaction render error: ", e.getMessage())), defaultSamplingStrategy);
                        list2.clear();
                        createListBuilder = list4;
                        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                    }
                } catch (Exception e6) {
                    e = e6;
                    realSupportTransactionService4.errorReporter.report(new RealSupportTransactionService.SupportTransactionLoadingError(Recorder$$ExternalSyntheticOutline2.m("Support transaction render error: ", e.getMessage())), defaultSamplingStrategy);
                    list2.clear();
                    createListBuilder = list4;
                    return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                }
                return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBlockerPresenter$models$3$1(FormBlockerPresenter formBlockerPresenter, State state, MutableState mutableState, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = formBlockerPresenter;
        this.$signedOut$delegate = state;
        this.$submissionState$delegate = mutableState;
        this.$elementResults = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBlockerPresenter$models$3$1(List list, RealSupportTransactionService realSupportTransactionService, ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, Continuation continuation) {
        super(2, continuation);
        this.$submissionState$delegate = list;
        this.L$4 = realSupportTransactionService;
        this.$elementResults = ziplineHistoryDataJavaScripter;
    }
}
