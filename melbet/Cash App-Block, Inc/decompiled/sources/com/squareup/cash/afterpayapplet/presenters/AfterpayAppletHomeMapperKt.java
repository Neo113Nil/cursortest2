package com.squareup.cash.afterpayapplet.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletFeatureError;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletProtoParsingError;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.CardThumbnailDisplayStyle;
import com.squareup.cash.afterpayapplet.viewmodels.RemoteImage;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.DismissTapAction;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.shop.rendering.api.ScrollToAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$DismissAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$OpenInfoSheetAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$ScrollToAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt__IterablesKt;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public abstract class AfterpayAppletHomeMapperKt {

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[Button.Prominence.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TransactionType.Companion companion = Button.Prominence.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TransactionType.Companion companion2 = Button.Prominence.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CreditLineType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Channel.Companion companion3 = CreditLineType.Companion;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Channel.Companion companion4 = CreditLineType.Companion;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Channel.Companion companion5 = CreditLineType.Companion;
                iArr2[2] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Channel.Companion companion6 = CreditLineType.Companion;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[ToggleEntryPointData.ToggleState.values().length];
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Error.Code.Companion companion7 = ToggleEntryPointData.ToggleState.Companion;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Error.Code.Companion companion8 = ToggleEntryPointData.ToggleState.Companion;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Channel.Companion companion9 = AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.Companion;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Channel.Companion companion10 = AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.Companion;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final CardThumbnailDisplayStyle access$toCardThumbnailDisplayStyle(AppletCardSection.CashCardRenderingConfiguration.DisplayStyle displayStyle) {
        int i = displayStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$3[displayStyle.ordinal()];
        if (i == 1) {
            return CardThumbnailDisplayStyle.STANDARD;
        }
        if (i != 2 && i == 3) {
            return CardThumbnailDisplayStyle.ROTATED_CLIPPED;
        }
        return CardThumbnailDisplayStyle.ROTATED;
    }

    public static final RemoteImage access$toRemoteImage(Image image) {
        String str = image.light_url;
        if (str != null) {
            String str2 = image.dark_url;
            return str2 != null ? new RemoteImage(new RemoteImage.ImageUrl(str, str2)) : new RemoteImage(new RemoteImage.ImageUrl(str, str));
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }

    public static final ArrayList toAnalyticTapEventSpec(TapAction tapAction) {
        if (tapAction == null) {
            return null;
        }
        List list = tapAction.analytics_tap_events;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec((AnalyticsEvent) it.next()));
        }
        return arrayList;
    }

    public static final AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType toAppletLineType(CreditLineType creditLineType) {
        creditLineType.getClass();
        int ordinal = creditLineType.ordinal();
        if (ordinal == 0) {
            return AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType.CREDIT_INN;
        }
        if (ordinal == 1) {
            return AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType.CREDIT_ONN;
        }
        if (ordinal == 2) {
            return AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType.CREDIT_ALL;
        }
        if (ordinal == 3) {
            return AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType.CREDIT_RETRO;
        }
        if (ordinal == 4) {
            throw new NotImplementedError(null, 1, null);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final ButtonProminence toProminence(Button.Prominence prominence) {
        int i = prominence == null ? -1 : WhenMappings.$EnumSwitchMapping$0[prominence.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? ButtonProminence.STANDARD : ButtonProminence.SUBTLE : ButtonProminence.PROMINENT : ButtonProminence.STANDARD;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Tap toTapViewModel(HasObservability hasObservability, TapAction tapAction) {
        UrlTapAction urlTapAction;
        DismissTapAction dismissTapAction;
        InfoSheet infoSheet;
        ScrollToAction scrollToAction;
        String str;
        String str2;
        hasObservability.getClass();
        tapAction.getClass();
        zzle zzleVar = tapAction.action;
        InfoSheet infoSheet2 = null;
        if (zzleVar != null) {
            TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
            if (tapAction$Action$UrlAction != null) {
                urlTapAction = tapAction$Action$UrlAction.value;
                if (urlTapAction == null) {
                    if (zzleVar != null) {
                        TapAction$Action$UrlAction tapAction$Action$UrlAction2 = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                        UrlTapAction urlTapAction2 = tapAction$Action$UrlAction2 != null ? tapAction$Action$UrlAction2.value : null;
                        if (urlTapAction2 != null) {
                            str2 = urlTapAction2.action_url;
                            if (str2 == null) {
                                return new Tap.Url(str2, toAnalyticTapEventSpec(tapAction));
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("TapAction Url must not be null");
                            return null;
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                } else {
                    if (zzleVar != null) {
                        TapAction$Action$DismissAction tapAction$Action$DismissAction = zzleVar instanceof TapAction$Action$DismissAction ? (TapAction$Action$DismissAction) zzleVar : null;
                        if (tapAction$Action$DismissAction != null) {
                            dismissTapAction = tapAction$Action$DismissAction.value;
                            if (dismissTapAction == null) {
                                return new Tap.Dismiss(toAnalyticTapEventSpec(tapAction));
                            }
                            if (zzleVar != null) {
                                TapAction$Action$OpenInfoSheetAction tapAction$Action$OpenInfoSheetAction = zzleVar instanceof TapAction$Action$OpenInfoSheetAction ? (TapAction$Action$OpenInfoSheetAction) zzleVar : null;
                                if (tapAction$Action$OpenInfoSheetAction != null) {
                                    infoSheet = tapAction$Action$OpenInfoSheetAction.value;
                                    if (infoSheet == null) {
                                        if (zzleVar != null) {
                                            TapAction$Action$OpenInfoSheetAction tapAction$Action$OpenInfoSheetAction2 = zzleVar instanceof TapAction$Action$OpenInfoSheetAction ? (TapAction$Action$OpenInfoSheetAction) zzleVar : null;
                                            if (tapAction$Action$OpenInfoSheetAction2 != null) {
                                                infoSheet2 = tapAction$Action$OpenInfoSheetAction2.value;
                                            }
                                        }
                                        infoSheet2.getClass();
                                        return new Tap.Info(infoSheet2, toAnalyticTapEventSpec(tapAction));
                                    }
                                    if (zzleVar != null) {
                                        TapAction$Action$ScrollToAction tapAction$Action$ScrollToAction = zzleVar instanceof TapAction$Action$ScrollToAction ? (TapAction$Action$ScrollToAction) zzleVar : null;
                                        if (tapAction$Action$ScrollToAction != null) {
                                            scrollToAction = tapAction$Action$ScrollToAction.value;
                                            if (scrollToAction != null) {
                                                hasObservability.getErrorReporter().report(new AfterpayAppletProtoParsingError("tap_action", null, "Unhandled tap action type", AfterpayAppletFeatureError.features, "AfterpayApplet"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                                return new Tap.Dismiss(toAnalyticTapEventSpec(tapAction));
                                            }
                                            if (zzleVar != null) {
                                                TapAction$Action$ScrollToAction tapAction$Action$ScrollToAction2 = zzleVar instanceof TapAction$Action$ScrollToAction ? (TapAction$Action$ScrollToAction) zzleVar : null;
                                                ScrollToAction scrollToAction2 = tapAction$Action$ScrollToAction2 != null ? tapAction$Action$ScrollToAction2.value : null;
                                                if (scrollToAction2 != null) {
                                                    str = scrollToAction2.target_id;
                                                    if (str == null) {
                                                        return new Tap.ScrollTo(str, toAnalyticTapEventSpec(tapAction));
                                                    }
                                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                    return null;
                                                }
                                            }
                                            str = null;
                                            if (str == null) {
                                            }
                                        }
                                    }
                                    scrollToAction = null;
                                    if (scrollToAction != null) {
                                    }
                                }
                            }
                            infoSheet = null;
                            if (infoSheet == null) {
                            }
                        }
                    }
                    dismissTapAction = null;
                    if (dismissTapAction == null) {
                    }
                }
            }
        }
        urlTapAction = null;
        if (urlTapAction == null) {
        }
    }
}
