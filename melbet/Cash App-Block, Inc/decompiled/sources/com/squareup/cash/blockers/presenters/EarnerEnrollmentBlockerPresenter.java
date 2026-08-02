package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.actions.presenters.BlockerActionUtilKt;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$EarnerCategoryResult;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes4.dex */
public final class EarnerEnrollmentBlockerPresenter implements MoleculePresenter {
    public final AppService appService;
    public final BlockersScreens.EarnerEnrollmentBlockerScreenArgs args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final EarnerOnboardingAnalytics earnerOnboardingAnalytics;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final AndroidStringManager stringManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Step {
        public static final /* synthetic */ Step[] $VALUES;
        public static final Step CATEGORY_SELECTION;
        public static final Step FORM;

        static {
            Step step = new Step("FORM", 0);
            FORM = step;
            Step step2 = new Step("CATEGORY_SELECTION", 1);
            CATEGORY_SELECTION = step2;
            $VALUES = new Step[]{step, step2};
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }
    }

    public EarnerEnrollmentBlockerPresenter(BlockersDataNavigator blockersDataNavigator, AppService appService, AndroidStringManager androidStringManager, EarnerOnboardingAnalytics earnerOnboardingAnalytics, RealRouter$Factory$Impl realRouter$Factory$Impl, BlockersScreens.EarnerEnrollmentBlockerScreenArgs earnerEnrollmentBlockerScreenArgs, BetterNavigator.ScreenNavigator screenNavigator) {
        this.blockersDataNavigator = blockersDataNavigator;
        this.appService = appService;
        this.stringManager = androidStringManager;
        this.earnerOnboardingAnalytics = earnerOnboardingAnalytics;
        this.args = earnerEnrollmentBlockerScreenArgs;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$progressToNextScreen(EarnerEnrollmentBlockerPresenter earnerEnrollmentBlockerPresenter, EarnerCategory earnerCategory, ContinuationImpl continuationImpl) {
        EarnerEnrollmentBlockerPresenter$progressToNextScreen$1 earnerEnrollmentBlockerPresenter$progressToNextScreen$1;
        int i;
        BlockersScreens.EarnerEnrollmentBlockerScreenArgs earnerEnrollmentBlockerScreenArgs = earnerEnrollmentBlockerPresenter.args;
        if (continuationImpl instanceof EarnerEnrollmentBlockerPresenter$progressToNextScreen$1) {
            earnerEnrollmentBlockerPresenter$progressToNextScreen$1 = (EarnerEnrollmentBlockerPresenter$progressToNextScreen$1) continuationImpl;
            int i2 = earnerEnrollmentBlockerPresenter$progressToNextScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                earnerEnrollmentBlockerPresenter$progressToNextScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = earnerEnrollmentBlockerPresenter$progressToNextScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = earnerEnrollmentBlockerPresenter$progressToNextScreen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = earnerEnrollmentBlockerPresenter.appService;
                    ClientScenario clientScenario = earnerEnrollmentBlockerScreenArgs.getBlockersData().clientScenario;
                    clientScenario.getClass();
                    String str = earnerEnrollmentBlockerScreenArgs.getBlockersData().flowToken;
                    SubmitFormRequest submitFormRequest = new SubmitFormRequest(earnerEnrollmentBlockerScreenArgs.getBlockersData().requestContext, earnerEnrollmentBlockerScreenArgs.getBlockersData().requestContext.blocker_descriptor_id, CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(earnerEnrollmentBlockerScreenArgs.getBlockersData().requestContext.blocker_descriptor_id, new SubmitFormRequest$ElementResult$Result$EarnerCategoryResult(new SubmitFormRequest.ElementResult.EarnerCategoryResult(earnerCategory, ByteString.EMPTY)), 4)), 8);
                    earnerEnrollmentBlockerPresenter$progressToNextScreen$1.label = 1;
                    obj = appService.submitForm(clientScenario, str, submitFormRequest, earnerEnrollmentBlockerPresenter$progressToNextScreen$1);
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
                BlockerActionUtilKt.handleSubmitFormResponse((ApiResult) obj, earnerEnrollmentBlockerScreenArgs, earnerEnrollmentBlockerScreenArgs.getBlockersData(), earnerEnrollmentBlockerPresenter.navigator, earnerEnrollmentBlockerPresenter.blockersDataNavigator);
                return Unit.INSTANCE;
            }
        }
        earnerEnrollmentBlockerPresenter$progressToNextScreen$1 = new EarnerEnrollmentBlockerPresenter$progressToNextScreen$1(earnerEnrollmentBlockerPresenter, continuationImpl);
        Object obj2 = earnerEnrollmentBlockerPresenter$progressToNextScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = earnerEnrollmentBlockerPresenter$progressToNextScreen$1.label;
        if (i != 0) {
        }
        BlockerActionUtilKt.handleSubmitFormResponse((ApiResult) obj2, earnerEnrollmentBlockerScreenArgs, earnerEnrollmentBlockerScreenArgs.getBlockersData(), earnerEnrollmentBlockerPresenter.navigator, earnerEnrollmentBlockerPresenter.blockersDataNavigator);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
    
        if (r13 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0178, code lost:
    
        if (r13 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017a, code lost:
    
        r17 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
    
        r17 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ba  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        Object setNameViewKt$SetName$2$1;
        String str2;
        Object obj;
        String str3;
        String str4;
        Object form;
        Object obj2;
        EarnerCategory earnerCategory;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1734294851);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Step.FORM);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        BlockersScreens.EarnerEnrollmentBlockerScreenArgs earnerEnrollmentBlockerScreenArgs = this.args;
        Continuation continuation = null;
        if (rememberedValue4 == neverEqualPolicy) {
            EarnerEnrollmentBlocker blocker = earnerEnrollmentBlockerScreenArgs.getBlocker();
            EarnerEnrollmentBlocker.Category category = blocker.default_category;
            if (category == null || (earnerCategory = category.category) == null) {
                Iterator<T> it = blocker.categories.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        earnerCategory = null;
                        break;
                    }
                    earnerCategory = ((EarnerEnrollmentBlocker.Category) it.next()).category;
                    if (earnerCategory != null) {
                        break;
                    }
                }
            }
            rememberedValue4 = Updater.mutableStateOf$default(earnerCategory);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState4 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default((EarnerCategory) mutableState4.getValue());
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState5 = (MutableState) rememberedValue5;
        String str5 = earnerEnrollmentBlockerScreenArgs.getBlockersData().flowToken;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(str5);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue6 == neverEqualPolicy) {
            str = str5;
            setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(this, str, mutableState4, continuation, 14);
            str2 = null;
            gapComposer.updateRememberedValue(setNameViewKt$SetName$2$1);
        } else {
            str = str5;
            setNameViewKt$SetName$2$1 = rememberedValue6;
            str2 = null;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) setNameViewKt$SetName$2$1);
        Updater.LaunchedEffect(gapComposer, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, this, str, mutableState3, mutableState4, mutableState5, mutableState, mutableState2));
        int ordinal = ((Step) mutableState3.getValue()).ordinal();
        AndroidStringManager androidStringManager = this.stringManager;
        if (ordinal == 0) {
            EarnerCategory earnerCategory2 = (EarnerCategory) mutableState4.getValue();
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
            String str6 = earnerEnrollmentBlockerScreenArgs.getBlocker().title;
            String str7 = str6 == null ? "" : str6;
            EarnerEnrollmentBlocker blocker2 = earnerEnrollmentBlockerScreenArgs.getBlocker();
            if (earnerCategory2 == null) {
                EarnerEnrollmentBlocker.Category category2 = blocker2.default_category;
                if (category2 != null) {
                    str2 = category2.display_name;
                }
            } else {
                Iterator<T> it2 = blocker2.categories.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = str2;
                        break;
                    }
                    obj = it2.next();
                    if (((EarnerEnrollmentBlocker.Category) obj).category == earnerCategory2) {
                        break;
                    }
                }
                EarnerEnrollmentBlocker.Category category3 = (EarnerEnrollmentBlocker.Category) obj;
                if (category3 == null || (str3 = category3.display_name) == null) {
                    EarnerEnrollmentBlocker.Category category4 = blocker2.default_category;
                    if (category4 != null) {
                        EarnerEnrollmentBlocker.Category category5 = category4.category == earnerCategory2 ? category4 : str2;
                        if (category5 != 0) {
                            str3 = category5.display_name;
                            if (str3 == null) {
                                if (category4 != null) {
                                    str2 = category4.display_name;
                                }
                            }
                        }
                    }
                    str3 = str2;
                    if (str3 == null) {
                    }
                }
                str4 = str3;
            }
            String str8 = (String) CollectionsKt.getOrNull(0, earnerEnrollmentBlockerScreenArgs.getBlocker().legal_texts);
            String str9 = str8 == null ? "" : str8;
            String str10 = (String) CollectionsKt.getOrNull(1, earnerEnrollmentBlockerScreenArgs.getBlocker().legal_texts);
            form = new EarnerEnrollmentBlockerViewModel.Form(str7, earnerCategory2, str4, str9, str10 == null ? "" : str10, androidStringManager.get(R.string.blockers_continue), booleanValue, booleanValue2);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            EarnerCategory earnerCategory3 = (EarnerCategory) mutableState5.getValue();
            String str11 = earnerEnrollmentBlockerScreenArgs.getBlocker().title;
            if (str11 == null) {
                str11 = "";
            }
            List<EarnerEnrollmentBlocker.Category> list = earnerEnrollmentBlockerScreenArgs.getBlocker().categories;
            ArrayList arrayList = new ArrayList();
            for (EarnerEnrollmentBlocker.Category category6 : list) {
                EarnerCategory earnerCategory4 = category6.category;
                if (earnerCategory4 != null) {
                    String str12 = category6.display_name;
                    if (str12 == null) {
                        str12 = "";
                    }
                    obj2 = new EarnerEnrollmentBlockerViewModel.CategorySelection.Category(earnerCategory4, str12, category6.arcade_icon_id);
                } else {
                    obj2 = str2;
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            form = new EarnerEnrollmentBlockerViewModel.CategorySelection(str11, arrayList, earnerCategory3, androidStringManager.get(R.string.blockers_continue));
        }
        gapComposer.end(false);
        return form;
    }
}
