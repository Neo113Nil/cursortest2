package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.featureflags.AmplitudeExperiments$MusicExpressionSender;
import com.squareup.cash.featureflags.AmplitudeExperiments$P2pExpressivePayments;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$UseActivityServiceExpressivePayments;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.payments.viewmodels.CanvasDetails;
import com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog;
import com.squareup.cash.payments.viewmodels.DevicePixelPosition;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.ExpressivePaymentDetailsModel;
import com.squareup.cash.payments.viewmodels.HeaderAvatar;
import com.squareup.cash.payments.viewmodels.ListProperty;
import com.squareup.cash.payments.viewmodels.LocalSticker;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentToolbarViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState;
import com.squareup.cash.payments.viewmodels.Position;
import com.squareup.cash.payments.viewmodels.Rotation;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.viewmodels.Zoom;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class PersonalizePaymentRecipientPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final PaymentScreens.PersonalizePaymentRecipient args;
    public final CoroutineContext ioDispatcher;
    public final boolean isMusicEnabled;
    public final MoneyFormatter moneyFormatter;
    public final RealMusicPlayer musicPlayer;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealPersonalizePaymentManager personalizePaymentManager;
    public final RealReactionManager reactionManager;
    public final boolean showExpressivePaymentsUi;
    public final AndroidStringManager stringManager;
    public final boolean useActivityService;

    public PersonalizePaymentRecipientPresenter(LocalizedMoneyFormatter.Factory factory, PaymentScreens.PersonalizePaymentRecipient personalizePaymentRecipient, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext, RealPersonalizePaymentManager realPersonalizePaymentManager, RealReactionManager realReactionManager, Analytics analytics, FeatureFlagManager featureFlagManager, AndroidStringManager androidStringManager, RealMusicPlayer realMusicPlayer) {
        personalizePaymentRecipient.getClass();
        this.args = personalizePaymentRecipient;
        this.navigator = screenNavigator;
        this.ioDispatcher = coroutineContext;
        this.personalizePaymentManager = realPersonalizePaymentManager;
        this.reactionManager = realReactionManager;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.musicPlayer = realMusicPlayer;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.showExpressivePaymentsUi = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$P2pExpressivePayments.INSTANCE)).enabled();
        this.useActivityService = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$UseActivityServiceExpressivePayments.INSTANCE)).enabled();
        this.isMusicEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$MusicExpressionSender.INSTANCE)).enabled();
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0220  */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.squareup.cash.mosaic.personalization.api.v1.Personalization$Element$Element$Text] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57, types: [com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState$Loaded] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.squareup.cash.mosaic.personalization.api.v1.Personalization$Text] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.squareup.cash.payments.viewmodels.PersonalizePaymentToolbarViewModel$SendButtonConfiguration, com.squareup.protos.common.CurrencyCode, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v5, types: [com.squareup.cash.payments.viewmodels.Text] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.squareup.cash.payments.viewmodels.Sticker] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.squareup.cash.mosaic.personalization.api.v1.Personalization$Sticker] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.squareup.cash.mosaic.personalization.api.v1.Personalization$Element$Element$Sticker] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Continuation continuation;
        Object obj;
        float f;
        float f2;
        float f3;
        ?? r0;
        Personalization.Element.AbstractC0063Element abstractC0063Element;
        ?? r3;
        float f4;
        float f5;
        Continuation continuation2;
        List list;
        Object obj2;
        Float f6;
        Float f7;
        Integer num;
        Float f8;
        Float f9;
        Integer num2;
        Integer num3;
        float abs;
        Integer num4;
        Collection collection;
        Iterator it;
        Recipient recipient;
        Object dotGridKt$DotGrid$3$1;
        MutableState mutableState;
        PersonalizedPaymentLoadingState personalizedPaymentLoadingState;
        MutableState mutableState2;
        MutableState mutableState3;
        Continuation continuation3;
        MutableState mutableState4;
        MutableState mutableState5;
        Continuation continuation4;
        boolean z;
        Object loading;
        ?? r8;
        Object obj3;
        String str;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-405258355);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation5 = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new InviteErrorPresenter$models$1$1(this, continuation5, 23);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(this.personalizePaymentManager.personalizationRepository.loadStickers(), 3);
            gapComposer.updateRememberedValue(cashQrScannerPresenter$special$$inlined$filter$1);
            rememberedValue2 = cashQrScannerPresenter$special$$inlined$filter$1;
        }
        Collection collection2 = EmptyList.INSTANCE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, collection2, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(PersonalizedPaymentLoadingState.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState6 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        float f10 = RecyclerView.DECELERATION_RATE;
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(new CanvasDetails(new Size(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), new DevicePixelPosition(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE)));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState7 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            rememberedValue5 = Updater.mutableStateOf$default(emptyMap);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState8 = (MutableState) rememberedValue5;
        boolean changed = gapComposer.changed((PersonalizedPaymentLoadingState) mutableState6.getValue()) | gapComposer.changed((CanvasDetails) mutableState7.getValue()) | gapComposer.changed((List) collectAsState.getValue());
        Object rememberedValue6 = gapComposer.rememberedValue();
        String str2 = "";
        if (changed || rememberedValue6 == neverEqualPolicy) {
            PersonalizedPaymentLoadingState personalizedPaymentLoadingState2 = (PersonalizedPaymentLoadingState) mutableState6.getValue();
            PersonalizedPaymentLoadingState.Loaded loaded = personalizedPaymentLoadingState2 instanceof PersonalizedPaymentLoadingState.Loaded ? (PersonalizedPaymentLoadingState.Loaded) personalizedPaymentLoadingState2 : null;
            if (loaded != null && (collection = loaded.elements) != null) {
                collection2 = collection;
            }
            Size size = ((CanvasDetails) mutableState7.getValue()).size;
            List list2 = (List) collectAsState.getValue();
            collection2.getClass();
            size.getClass();
            float f11 = size.height;
            float f12 = size.width;
            list2.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                Personalization.Element element = (Personalization.Element) it2.next();
                Personalization.Properties properties = element.properties;
                if (properties == null || (num4 = properties.x) == null) {
                    f2 = f10;
                } else {
                    float intValue = num4.intValue();
                    if (intValue > f10) {
                        float f13 = f12 / 2.0f;
                        f2 = (Math.abs(intValue / 100.0f) * f13) + f13;
                    } else {
                        float f14 = f12 / 2.0f;
                        f2 = f14 - (Math.abs(intValue / 100.0f) * f14);
                    }
                }
                Continuation continuation6 = continuation5;
                Personalization.Properties properties2 = element.properties;
                if (properties2 == null || (num3 = properties2.y) == null) {
                    f3 = f10;
                } else {
                    float intValue2 = num3.intValue();
                    if (intValue2 > f10) {
                        float f15 = f11 / 2.0f;
                        abs = f15 - (Math.abs(intValue2 / 100.0f) * f15);
                    } else {
                        float f16 = f11 / 2.0f;
                        abs = (Math.abs(intValue2 / 100.0f) * f16) + f16;
                    }
                    f3 = abs;
                }
                Personalization.Element.AbstractC0063Element abstractC0063Element2 = element.element;
                List list3 = list2;
                if (abstractC0063Element2 != null) {
                    ?? r02 = abstractC0063Element2 instanceof Personalization.Element.AbstractC0063Element.Text ? (Personalization.Element.AbstractC0063Element.Text) abstractC0063Element2 : continuation6;
                    if (r02 != 0) {
                        r0 = r02.getValue();
                        abstractC0063Element = element.element;
                        Iterator it3 = it2;
                        if (abstractC0063Element != null) {
                            ?? r32 = abstractC0063Element instanceof Personalization.Element.AbstractC0063Element.Sticker ? (Personalization.Element.AbstractC0063Element.Sticker) abstractC0063Element : continuation6;
                            if (r32 != 0) {
                                r3 = r32.getValue();
                                if (r0 != 0) {
                                    Personalization.Properties properties3 = element.properties;
                                    Position position = new Position(f2, f3, (properties3 == null || (num2 = properties3.z) == null) ? RecyclerView.DECELERATION_RATE : num2.intValue());
                                    Personalization.Properties properties4 = element.properties;
                                    Rotation rotation = new Rotation((properties4 == null || (f9 = properties4.rotation) == null) ? RecyclerView.DECELERATION_RATE : f9.floatValue());
                                    Personalization.Properties properties5 = element.properties;
                                    ListProperty listProperty = new ListProperty(position, rotation, new Zoom((properties5 == null || (f8 = properties5.scale_factor) == null) ? 1.0f : f8.floatValue()), (Size) null, 24);
                                    float max = (Math.max(f12, f11) / 2.0f) * 0.1f;
                                    String str3 = r0.text;
                                    ?? text = new Text(listProperty, max, false, false, str3 == null ? "" : str3, 25);
                                    f4 = f12;
                                    f5 = f11;
                                    continuation2 = text;
                                } else {
                                    if (r3 != 0) {
                                        List list4 = list3;
                                        Iterator it4 = list4.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                list = list4;
                                                f4 = f12;
                                                obj2 = continuation6;
                                                break;
                                            }
                                            obj2 = it4.next();
                                            list = list4;
                                            f4 = f12;
                                            if (((LocalSticker) obj2).id.equals(r3.sticker_id)) {
                                                break;
                                            }
                                            list4 = list;
                                            f12 = f4;
                                        }
                                        LocalSticker localSticker = (LocalSticker) obj2;
                                        if ((localSticker != null ? localSticker.mainUrl : continuation6) != null) {
                                            float min = Math.min(0.35f * f4, 0.35f * f11);
                                            float f17 = f2 - (min / 2.0f);
                                            float f18 = f3 - (min / 2.0f);
                                            Iterator it5 = list.iterator();
                                            while (it5.hasNext()) {
                                                LocalSticker localSticker2 = (LocalSticker) it5.next();
                                                Iterator it6 = it5;
                                                f5 = f11;
                                                if (localSticker2.id.equals(r3.sticker_id)) {
                                                    String str4 = localSticker2.mainUrl;
                                                    String str5 = localSticker2.previewUrl;
                                                    String str6 = r3.sticker_id;
                                                    String str7 = str6 == null ? "" : str6;
                                                    Personalization.Properties properties6 = element.properties;
                                                    Position position2 = new Position(f17, f18, (properties6 == null || (num = properties6.z) == null) ? RecyclerView.DECELERATION_RATE : num.intValue());
                                                    Personalization.Properties properties7 = element.properties;
                                                    Rotation rotation2 = new Rotation((properties7 == null || (f7 = properties7.rotation) == null) ? RecyclerView.DECELERATION_RATE : f7.floatValue());
                                                    Personalization.Properties properties8 = element.properties;
                                                    continuation2 = new Sticker(0, new ListProperty(position2, rotation2, new Zoom((properties8 == null || (f6 = properties8.scale_factor) == null) ? 1.0f : f6.floatValue()), new Size(min, min), 16), str4, str5, str7, null, 33);
                                                } else {
                                                    it5 = it6;
                                                    f11 = f5;
                                                }
                                            }
                                            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                            return null;
                                        }
                                    } else {
                                        f4 = f12;
                                    }
                                    f5 = f11;
                                    continuation2 = continuation6;
                                }
                                if (continuation2 != null) {
                                    arrayList.add(continuation2);
                                }
                                continuation5 = continuation6;
                                list2 = list3;
                                it2 = it3;
                                f11 = f5;
                                f12 = f4;
                                f10 = RecyclerView.DECELERATION_RATE;
                            }
                        }
                        r3 = continuation6;
                        if (r0 != 0) {
                        }
                        if (continuation2 != null) {
                        }
                        continuation5 = continuation6;
                        list2 = list3;
                        it2 = it3;
                        f11 = f5;
                        f12 = f4;
                        f10 = RecyclerView.DECELERATION_RATE;
                    }
                }
                r0 = continuation6;
                abstractC0063Element = element.element;
                Iterator it32 = it2;
                if (abstractC0063Element != null) {
                }
                r3 = continuation6;
                if (r0 != 0) {
                }
                if (continuation2 != null) {
                }
                continuation5 = continuation6;
                list2 = list3;
                it2 = it32;
                f11 = f5;
                f12 = f4;
                f10 = RecyclerView.DECELERATION_RATE;
            }
            continuation = continuation5;
            obj = null;
            f = 2.0f;
            rememberedValue6 = Updater.mutableStateOf$default(arrayList);
            gapComposer.updateRememberedValue(rememberedValue6);
        } else {
            continuation = null;
            obj = null;
            f = 2.0f;
        }
        MutableState mutableState9 = (MutableState) rememberedValue6;
        boolean changed2 = gapComposer.changed((List) mutableState9.getValue()) | gapComposer.changed((Map) mutableState8.getValue());
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue7 == neverEqualPolicy) {
            List list5 = (List) mutableState9.getValue();
            Map map = (Map) mutableState8.getValue();
            list5.getClass();
            map.getClass();
            List list6 = list5;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
            Iterator it7 = list6.iterator();
            while (it7.hasNext()) {
                Element element2 = (Element) it7.next();
                if (element2 instanceof Text) {
                    Text text2 = (Text) element2;
                    ListProperty listProperty2 = text2.properties;
                    int i2 = text2.id;
                    if (map.containsKey(Integer.valueOf(i2))) {
                        Position position3 = listProperty2.position;
                        Position position4 = listProperty2.position;
                        float f19 = position3.x;
                        Size size2 = (Size) map.get(Integer.valueOf(i2));
                        float f20 = f19 - ((size2 != null ? size2.width : RecyclerView.DECELERATION_RATE) / f);
                        float f21 = position4.y;
                        Size size3 = (Size) map.get(Integer.valueOf(i2));
                        it = it7;
                        element2 = text2.copy(ListProperty.copy$default(listProperty2, Position.copy$default(position4, f20, f21 - ((size3 != null ? size3.height : RecyclerView.DECELERATION_RATE) / f), RecyclerView.DECELERATION_RATE, 4), null, null, null, false, 30));
                        arrayList2.add(element2);
                        it7 = it;
                    }
                }
                it = it7;
                arrayList2.add(element2);
                it7 = it;
            }
            rememberedValue7 = Updater.mutableStateOf$default(arrayList2);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState10 = (MutableState) rememberedValue7;
        boolean changed3 = gapComposer.changed((PersonalizedPaymentLoadingState) mutableState6.getValue());
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue8 == neverEqualPolicy) {
            PersonalizedPaymentLoadingState personalizedPaymentLoadingState3 = (PersonalizedPaymentLoadingState) mutableState6.getValue();
            ?? r03 = personalizedPaymentLoadingState3 instanceof PersonalizedPaymentLoadingState.Loaded ? (PersonalizedPaymentLoadingState.Loaded) personalizedPaymentLoadingState3 : continuation;
            Object headerAvatar = (r03 == 0 || (recipient = r03.sender) == null) ? continuation : UtilsKt.toHeaderAvatar(recipient);
            rememberedValue8 = Updater.mutableStateOf$default(headerAvatar != null ? CollectionsKt__CollectionsJVMKt.listOf(headerAvatar) : EmptyList.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState11 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = Updater.mutableStateOf$default(PersonalizedPaymentsReactionsState.ReactionsDisabled.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState12 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = Updater.mutableStateOf$default(continuation);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState13 = (MutableState) rememberedValue10;
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = Updater.mutableStateOf$default(continuation);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState14 = (MutableState) rememberedValue11;
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue12 = gapComposer.rememberedValue();
        int i3 = 0;
        if (changedInstance2 || rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = new PersonalizePaymentRecipientPresenter$models$2$1(this, mutableState6, continuation, i3);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue12);
        PersonalizedPaymentLoadingState personalizedPaymentLoadingState4 = (PersonalizedPaymentLoadingState) mutableState6.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue13 == neverEqualPolicy) {
            mutableState = mutableState7;
            personalizedPaymentLoadingState = personalizedPaymentLoadingState4;
            dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) this, (Object) mutableState6, (Object) mutableState12, (Object) mutableState14, (Continuation) null, 22);
            mutableState2 = mutableState12;
            mutableState3 = mutableState14;
            gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
        } else {
            mutableState = mutableState7;
            personalizedPaymentLoadingState = personalizedPaymentLoadingState4;
            dotGridKt$DotGrid$3$1 = rememberedValue13;
            mutableState2 = mutableState12;
            mutableState3 = mutableState14;
        }
        Updater.LaunchedEffect(gapComposer, personalizedPaymentLoadingState, (Function2) dotGridKt$DotGrid$3$1);
        SelectedTrack selectedTrack = (SelectedTrack) mutableState3.getValue();
        boolean changedInstance4 = gapComposer.changedInstance(this);
        Object rememberedValue14 = gapComposer.rememberedValue();
        int i4 = 1;
        if (changedInstance4 || rememberedValue14 == neverEqualPolicy) {
            continuation3 = null;
            rememberedValue14 = new PersonalizePaymentRecipientPresenter$models$2$1(this, mutableState3, continuation3, i4);
            gapComposer.updateRememberedValue(rememberedValue14);
        } else {
            continuation3 = null;
        }
        Updater.LaunchedEffect(gapComposer, selectedTrack, (Function2) rememberedValue14);
        boolean changedInstance5 = gapComposer.changedInstance(this);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue15 == neverEqualPolicy) {
            rememberedValue15 = new UtilsKt$$ExternalSyntheticLambda0(this, 10);
            gapComposer.updateRememberedValue(rememberedValue15);
        }
        Updater.DisposableEffect(unit2, (Function1) rememberedValue15, gapComposer);
        PersonalizedPaymentLoadingState personalizedPaymentLoadingState5 = (PersonalizedPaymentLoadingState) mutableState6.getValue();
        boolean changedInstance6 = gapComposer.changedInstance(this);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (changedInstance6 || rememberedValue16 == neverEqualPolicy) {
            mutableState4 = mutableState3;
            mutableState5 = mutableState13;
            PersonalizePaymentRecipientPresenter$models$6$1 personalizePaymentRecipientPresenter$models$6$1 = new PersonalizePaymentRecipientPresenter$models$6$1(this, mutableState6, mutableState5, continuation3, 0);
            continuation4 = continuation3;
            gapComposer.updateRememberedValue(personalizePaymentRecipientPresenter$models$6$1);
            rememberedValue16 = personalizePaymentRecipientPresenter$models$6$1;
        } else {
            mutableState4 = mutableState3;
            continuation4 = continuation3;
            mutableState5 = mutableState13;
        }
        Updater.LaunchedEffect(gapComposer, personalizedPaymentLoadingState5, (Function2) rememberedValue16);
        MutableState mutableState15 = mutableState5;
        ?? r15 = continuation4;
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState15, mutableState6, mutableState2, mutableState, mutableState8, 24));
        PersonalizedPaymentLoadingState personalizedPaymentLoadingState6 = (PersonalizedPaymentLoadingState) mutableState6.getValue();
        boolean z2 = personalizedPaymentLoadingState6 instanceof PersonalizedPaymentLoadingState.Loading;
        PaymentScreens.PersonalizePaymentRecipient personalizePaymentRecipient = this.args;
        boolean z3 = this.showExpressivePaymentsUi;
        if (z2 || (personalizedPaymentLoadingState6 instanceof PersonalizedPaymentLoadingState.Error)) {
            z = false;
            loading = new PersonalizePaymentRecipientViewModel.Loading(new PersonalizePaymentToolbarViewModel((List) mutableState11.getValue(), r15, false, false), (ConfirmRetryResourceDialog) mutableState15.getValue(), z3, personalizePaymentRecipient.showReceiptButton);
        } else {
            if (!(personalizedPaymentLoadingState6 instanceof PersonalizedPaymentLoadingState.Loaded)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return obj;
            }
            PersonalizedPaymentLoadingState personalizedPaymentLoadingState7 = (PersonalizedPaymentLoadingState) mutableState6.getValue();
            personalizedPaymentLoadingState7.getClass();
            PersonalizedPaymentLoadingState.Loaded loaded2 = (PersonalizedPaymentLoadingState.Loaded) personalizedPaymentLoadingState7;
            Money money = loaded2.amount;
            if (money == null) {
                money = new Money((Long) 0L, (CurrencyCode) r15, 6);
            }
            String format2 = this.moneyFormatter.format(money);
            Background background = loaded2.background;
            List list7 = (List) mutableState11.getValue();
            if (z3) {
                Iterator it8 = ((List) mutableState10.getValue()).iterator();
                int i5 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    Element element3 = (Element) it8.next();
                    if ((element3 instanceof Text) && !StringsKt.isBlank(((Text) element3).value)) {
                        break;
                    }
                    i5++;
                }
                List list8 = (List) mutableState10.getValue();
                r8 = new ArrayList();
                int i6 = 0;
                for (Object obj4 : list8) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw r15;
                    }
                    if (i6 != i5) {
                        r8.add(obj4);
                    }
                    i6 = i7;
                }
            } else {
                r8 = (List) mutableState10.getValue();
            }
            List list9 = r8;
            PersonalizedPaymentsReactionsState personalizedPaymentsReactionsState = (PersonalizedPaymentsReactionsState) mutableState2.getValue();
            boolean z4 = loaded2.isCurrentCustomerSender;
            boolean z5 = personalizePaymentRecipient.showReceiptButton && !z4;
            ConfirmRetryResourceDialog confirmRetryResourceDialog = (ConfirmRetryResourceDialog) mutableState15.getValue();
            boolean z6 = loaded2.isCurrentCustomerSender;
            HeaderAvatar headerAvatar2 = (HeaderAvatar) CollectionsKt.firstOrNull((List) mutableState11.getValue());
            Iterator it9 = ((List) mutableState10.getValue()).iterator();
            while (true) {
                if (!it9.hasNext()) {
                    obj3 = r15;
                    break;
                }
                obj3 = it9.next();
                Element element4 = (Element) obj3;
                if ((element4 instanceof Text) && !StringsKt.isBlank(((Text) element4).value)) {
                    break;
                }
            }
            Element element5 = (Element) obj3;
            if (element5 == null || (str = ((Text) element5).value) == null) {
                String str8 = loaded2.note;
                if (str8 != null) {
                    str2 = str8;
                }
            } else {
                str2 = str;
            }
            loading = new PersonalizePaymentRecipientViewModel.Loaded(list7, format2, background, list9, personalizedPaymentsReactionsState, z4, this.showExpressivePaymentsUi, confirmRetryResourceDialog, new ExpressivePaymentDetailsModel(headerAvatar2, z6, str2), z5, (SelectedTrack) mutableState4.getValue());
            z = false;
        }
        gapComposer.end(z);
        return loading;
    }
}
