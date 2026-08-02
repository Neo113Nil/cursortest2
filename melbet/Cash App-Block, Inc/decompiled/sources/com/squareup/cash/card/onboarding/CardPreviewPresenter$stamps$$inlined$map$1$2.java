package com.squareup.cash.card.onboarding;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardPreviewPresenter;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.util.Quadruple;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardPreviewPresenter$stamps$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ CardPreviewPresenter this$0;

    /* renamed from: com.squareup.cash.card.onboarding.CardPreviewPresenter$stamps$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return CardPreviewPresenter$stamps$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ CardPreviewPresenter$stamps$$inlined$map$1$2(FlowCollector flowCollector, CardPreviewPresenter cardPreviewPresenter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = cardPreviewPresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019d  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        CardPreviewPresenter$initialModel$$inlined$map$1$2$1 cardPreviewPresenter$initialModel$$inlined$map$1$2$1;
        int i2;
        boolean z;
        int i3 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        CardPreviewPresenter cardPreviewPresenter = this.this$0;
        CardPreviewSheet cardPreviewSheet = null;
        switch (i3) {
            case 0:
                CardPreviewScreen cardPreviewScreen = cardPreviewPresenter.args;
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            List list = ((StampsConfig) obj).stamps;
                            list.getClass();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                Stamp stamp = (Stamp) obj3;
                                if (!cardPreviewScreen.availableStamps.isEmpty()) {
                                    List list2 = cardPreviewScreen.availableStamps;
                                    String str = stamp.name;
                                    str.getClass();
                                    if (list2.contains(str)) {
                                    }
                                }
                                arrayList.add(obj3);
                            }
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                String str2 = ((Stamp) next).name;
                                str2.getClass();
                                linkedHashMap.put(str2, next);
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            default:
                AndroidStringManager androidStringManager = cardPreviewPresenter.stringManager;
                CardPreviewScreen cardPreviewScreen2 = cardPreviewPresenter.args;
                if (continuation instanceof CardPreviewPresenter$initialModel$$inlined$map$1$2$1) {
                    cardPreviewPresenter$initialModel$$inlined$map$1$2$1 = (CardPreviewPresenter$initialModel$$inlined$map$1$2$1) continuation;
                    int i5 = cardPreviewPresenter$initialModel$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        cardPreviewPresenter$initialModel$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj4 = cardPreviewPresenter$initialModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = cardPreviewPresenter$initialModel$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            Quadruple quadruple = (Quadruple) obj;
                            CardStudio cardStudio = (CardStudio) quadruple.first;
                            String str3 = (String) quadruple.second;
                            Map map = (Map) quadruple.third;
                            CardPresentationStyle cardPresentationStyle = (CardPresentationStyle) quadruple.fourth;
                            TouchData touchData = cardStudio.touch_data;
                            CardTheme cardTheme = cardStudio.card_theme;
                            boolean z2 = cardStudio.cashtag_enabled;
                            CustomizationDetails customizationDetails = touchData != null ? StyledCardViewModelKt.toCustomizationDetails(touchData, map) : null;
                            cardPreviewPresenter.hasCustomization = !(customizationDetails == null || (customizationDetails.strokes.isEmpty() && customizationDetails.stamps.isEmpty())) || (cardPreviewScreen2.cashtagDisplay == CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL && !z2);
                            int i6 = CardPreviewPresenter.WhenMappings.$EnumSwitchMapping$0[cardPreviewScreen2.cashtagDisplay.ordinal()];
                            if (i6 == 1) {
                                z = false;
                            } else if (i6 == 2) {
                                z = z2;
                            } else if (i6 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                z = true;
                            }
                            String str4 = cardPreviewScreen2.sheetTitle;
                            if (str4 != null) {
                                String str5 = cardPreviewScreen2.sheetDescription;
                                str5.getClass();
                                CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage localSheetImage = cardPreviewScreen2.sheetImage;
                                localSheetImage.getClass();
                                cardPreviewSheet = new CardPreviewSheet(str4, str5, localSheetImage);
                            } else {
                                cardTheme.getClass();
                                if (cardTheme.id == CardTheme.Identifier.PINK_ID) {
                                    cardPreviewSheet = new CardPreviewSheet(androidStringManager.get(R.string.pink_theme_info_title), androidStringManager.get(R.string.pink_theme_info_description), CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.PINK_THEME_UPSELL);
                                }
                            }
                            CardPreviewSheet cardPreviewSheet2 = cardPreviewSheet;
                            String str6 = cardPreviewScreen2.title;
                            String str7 = cardPreviewScreen2.appThemeInformation;
                            Color color = cardPreviewScreen2.appThemeInformationColor;
                            String str8 = cardPreviewScreen2.description;
                            String str9 = cardPreviewPresenter.hasCustomization ? cardPreviewScreen2.editPersonalization : cardPreviewScreen2.personalize;
                            boolean z3 = cardPreviewScreen2.cashtagDisplay == CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL || cardPreviewScreen2.customizationEligible;
                            String str10 = cardPreviewScreen2.order;
                            cardTheme.getClass();
                            boolean z4 = cardPreviewScreen2.customizationEligible;
                            if (customizationDetails == null) {
                                customizationDetails = new CustomizationDetails();
                            }
                            boolean z5 = z3;
                            StyledCardViewModel styledCardViewModel = new StyledCardViewModel(str3, z, cardTheme, z4, customizationDetails, null, false, cardPreviewScreen2.paymentMethod, null, null, null, null, null, 64480);
                            boolean z6 = cardPreviewScreen2.available;
                            Color color2 = cardPreviewScreen2.blockersData.serverAccentColor;
                            CardPreviewViewModel.Preview preview = new CardPreviewViewModel.Preview(str6, str7, color, str8, str9, z5, str10, styledCardViewModel, z6, color2 != null ? new ColorModel.Accented(color2) : ColorModel.CashGreen.INSTANCE, cardPresentationStyle, cardPreviewPresenter.isFilamentDisabled, cardPreviewSheet2);
                            cardPreviewPresenter$initialModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(preview, cardPreviewPresenter$initialModel$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                cardPreviewPresenter$initialModel$$inlined$map$1$2$1 = new CardPreviewPresenter$initialModel$$inlined$map$1$2$1(this, continuation);
                Object obj42 = cardPreviewPresenter$initialModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cardPreviewPresenter$initialModel$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
