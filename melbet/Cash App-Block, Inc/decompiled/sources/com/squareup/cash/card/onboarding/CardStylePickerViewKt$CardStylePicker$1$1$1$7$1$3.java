package com.squareup.cash.card.onboarding;

import android.os.SystemClock;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStylePickerViewEvent;
import com.stripe.android.hcaptcha.DefaultHCaptchaService;
import com.stripe.android.hcaptcha.DefaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1;
import com.stripe.android.hcaptcha.HCaptchaService$Result;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3 implements FlowCollector {
    public final /* synthetic */ int $firstSectionStartingIndex;
    public final /* synthetic */ Object $hasScrolled;
    public final /* synthetic */ Object $listIndices;
    public final /* synthetic */ Object $model;
    public final /* synthetic */ Object $onEvent;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $viewedThemes;

    public CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3(MutableState mutableState, int i, ListIndices listIndices, Set set, CardStylePickerViewModel cardStylePickerViewModel, Function1 function1) {
        this.$hasScrolled = mutableState;
        this.$firstSectionStartingIndex = i;
        this.$listIndices = listIndices;
        this.$viewedThemes = set;
        this.$model = cardStylePickerViewModel;
        this.$onEvent = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        String str2;
        DefaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1 defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1;
        int i;
        HCaptchaService$Result failure;
        FlowCollector flowCollector;
        HCaptchaService$Result hCaptchaService$Result;
        int i2 = this.$r8$classId;
        int i3 = this.$firstSectionStartingIndex;
        Object obj2 = this.$hasScrolled;
        int i4 = 0;
        Object obj3 = this.$listIndices;
        Object obj4 = this.$viewedThemes;
        Object obj5 = this.$model;
        Object obj6 = this.$onEvent;
        switch (i2) {
            case 0:
                List list = (List) obj;
                ListIndices listIndices = (ListIndices) obj3;
                Set set = (Set) obj4;
                if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (intValue >= i3 && (str = (String) listIndices.cardTokens.get(new Integer(intValue))) != null && !set.contains(str)) {
                            set.add(str);
                            ArrayList arrayList = ((CardStylePickerViewModel) obj5).sections;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                CollectionsKt__MutableCollectionsKt.addAll(((CardStyleSectionViewModel) it2.next()).cards, arrayList2);
                            }
                            Iterator it3 = arrayList2.iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i5 = -1;
                                } else if (!Intrinsics.areEqual(((CardStyleItemViewModel) it3.next()).card.theme.token, str)) {
                                    i5++;
                                }
                            }
                            ((Function1) obj6).invoke(new CardStylePickerViewEvent.OnScrollToTheme(str, i5));
                        }
                    }
                } else {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        int intValue2 = ((Number) it4.next()).intValue();
                        if (intValue2 >= i3 && (str2 = (String) listIndices.cardTokens.get(new Integer(intValue2))) != null) {
                            set.add(str2);
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                FragmentActivity fragmentActivity = (FragmentActivity) obj4;
                DefaultHCaptchaService defaultHCaptchaService = (DefaultHCaptchaService) obj3;
                if (continuation instanceof DefaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1) {
                    defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1 = (DefaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1) continuation;
                    int i6 = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj7 = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            FlowCollector flowCollector2 = (FlowCollector) obj2;
                            DefaultHCaptchaService.CachedResult cachedResult = (DefaultHCaptchaService.CachedResult) obj;
                            if (Intrinsics.areEqual(cachedResult, DefaultHCaptchaService.CachedResult.Idle.INSTANCE)) {
                                defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.L$3 = flowCollector2;
                                defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.I$0 = 0;
                                defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.label = 1;
                                int i7 = DefaultHCaptchaService.$r8$clinit;
                                Object performPassiveHCaptchaHelper = defaultHCaptchaService.performPassiveHCaptchaHelper(fragmentActivity, str4, str3, defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1);
                                if (performPassiveHCaptchaHelper == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                flowCollector = flowCollector2;
                                obj7 = performPassiveHCaptchaHelper;
                                hCaptchaService$Result = (HCaptchaService$Result) obj7;
                            } else if (Intrinsics.areEqual(cachedResult, DefaultHCaptchaService.CachedResult.Loading.INSTANCE)) {
                                flowCollector = flowCollector2;
                                hCaptchaService$Result = null;
                            } else {
                                if (cachedResult instanceof DefaultHCaptchaService.CachedResult.Success) {
                                    DefaultHCaptchaService.CachedResult.Success success = (DefaultHCaptchaService.CachedResult.Success) cachedResult;
                                    if ((SystemClock.elapsedRealtime() - success.createdAt) / 1000 >= i3) {
                                        defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.L$3 = flowCollector2;
                                        defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.I$0 = 0;
                                        defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.label = 2;
                                        int i8 = DefaultHCaptchaService.$r8$clinit;
                                        Object performPassiveHCaptchaHelper2 = defaultHCaptchaService.performPassiveHCaptchaHelper(fragmentActivity, str4, str3, defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1);
                                        if (performPassiveHCaptchaHelper2 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        flowCollector = flowCollector2;
                                        obj7 = performPassiveHCaptchaHelper2;
                                        hCaptchaService$Result = (HCaptchaService$Result) obj7;
                                    } else {
                                        failure = new HCaptchaService$Result.Success(success.token);
                                    }
                                } else {
                                    if (!(cachedResult instanceof DefaultHCaptchaService.CachedResult.Failure)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    failure = new HCaptchaService$Result.Failure(((DefaultHCaptchaService.CachedResult.Failure) cachedResult).error);
                                }
                                HCaptchaService$Result hCaptchaService$Result2 = failure;
                                flowCollector = flowCollector2;
                                hCaptchaService$Result = hCaptchaService$Result2;
                            }
                        } else if (i == 1) {
                            i4 = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.I$0;
                            flowCollector = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.L$3;
                            SafeTrace.throwOnFailure(obj7);
                            hCaptchaService$Result = (HCaptchaService$Result) obj7;
                        } else {
                            if (i != 2) {
                                if (i == 3) {
                                    SafeTrace.throwOnFailure(obj7);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.I$0;
                            flowCollector = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.L$3;
                            SafeTrace.throwOnFailure(obj7);
                            hCaptchaService$Result = (HCaptchaService$Result) obj7;
                        }
                        if (hCaptchaService$Result != null) {
                            defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.L$3 = null;
                            defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.I$0 = i4;
                            defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.label = 3;
                            if (flowCollector.emit(hCaptchaService$Result, defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1 = new DefaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj72 = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                }
                if (hCaptchaService$Result != null) {
                }
                return Unit.INSTANCE;
        }
    }

    public CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3(FlowCollector flowCollector, DefaultHCaptchaService defaultHCaptchaService, FragmentActivity fragmentActivity, String str, String str2, int i) {
        this.$hasScrolled = flowCollector;
        this.$listIndices = defaultHCaptchaService;
        this.$viewedThemes = fragmentActivity;
        this.$model = str;
        this.$onEvent = str2;
        this.$firstSectionStartingIndex = i;
    }
}
