package com.squareup.cash.formview.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.views.LocalViewFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.blockers.actions.util.BlockerActionUriDecoder;
import com.squareup.cash.blockers.actions.util.RealBlockerActionUriDecoder;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewevents.real.RealFormAnalytics;
import com.squareup.cash.formview.viewmodels.ButtonIcon;
import com.squareup.cash.formview.viewmodels.ButtonIcon$DrawableResource$GooglePay;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.formview.viewmodels.FormViewModel$OnDisplayEffect$Animation;
import com.squareup.cash.formview.viewmodels.FormViewModel$OnDisplayEffect$Confetti;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.cash.google.pay.payments.real.ReleaseGooglePayPaymentsModule$ProvideGooglePaymentMerchantIdMetroFactory;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneybot.backend.real.managers.RealExtensionManager$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.stripe.attestation.TaskExtensionsKt;
import com.withpersona.sdk2.camera.BitmapUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class FormPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BlockersScreens.FormScreen args;
    public final BlockerActionUriDecoder blockerActionUriDecoder;
    public final RealBlockersHelper blockersHelper;
    public final AndroidClock clock;
    public final BlockerAction dismissAction;
    public final RealFormAnalytics formAnalytics;
    public final BlockerAction helpAction;
    public final BlockerAction primaryAction;
    public final BlockerAction retreatAction;
    public final BlockerAction secondaryAction;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.OnDisplayEffect.values().length];
            try {
                iArr[FormBlocker.OnDisplayEffect.CONFETTI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.OnDisplayEffect.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FormPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.FormScreen formScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealFormAnalytics realFormAnalytics, BlockerActionUriDecoder blockerActionUriDecoder, AndroidClock androidClock) {
        this.args = formScreen;
        this.analytics = analytics;
        this.formAnalytics = realFormAnalytics;
        this.blockerActionUriDecoder = blockerActionUriDecoder;
        this.clock = androidClock;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.primaryAction = formScreen.primary_action;
        this.secondaryAction = formScreen.secondary_action;
        this.helpAction = formScreen.help_action;
        this.dismissAction = formScreen.dismissAction;
        this.retreatAction = formScreen.retreatAction;
    }

    public final FormViewEvent mapNavigationEventToAction(FormViewEvent formViewEvent) {
        formViewEvent.getClass();
        boolean z = formViewEvent instanceof FormViewEvent.GoBack;
        BlockersScreens.FormScreen formScreen = this.args;
        return (!z || formScreen.retreatAction == null) ? !(formViewEvent instanceof FormViewEvent.Close) ? formViewEvent : formScreen.dismissAction != null ? FormViewEvent.Dismiss.INSTANCE : FormViewEvent.EndFlow.INSTANCE : FormViewEvent.Retreat.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.withpersona.sdk2.camera.CameraPropertiesKt] */
    /* JADX WARN: Type inference failed for: r21v2 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FormViewModel models(Flow flow, Composer composer, int i) {
        ButtonIcon buttonIcon;
        ?? r21;
        Color color;
        BlockerAction.SubmitAction value;
        ButtonIcon buttonIcon2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2145834232);
        BlockersScreens.FormScreen formScreen = this.args;
        BlockerAction blockerAction = formScreen.primary_action;
        BlockersData blockersData = formScreen.blockersData;
        String str = blockersData.blockerId;
        Unit unit = Unit.INSTANCE;
        boolean changed = gapComposer.changed(str) | gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new CheckStatusPresenter.AnonymousClass1.C00611(str, this, continuation, 16);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Continuation continuation2 = null;
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation2, str, this, 25));
        List list = formScreen.elements;
        boolean z = formScreen.dismissButtonEnabled;
        String str2 = blockerAction != null ? blockerAction.text : null;
        FormBlocker.Icon icon = formScreen.primary_action_icon;
        if (icon != null) {
            FormBlocker.Icon.Source source = icon.source;
            if (source instanceof FormBlocker.Icon.Source.ArcadeIcon) {
                String str3 = ((FormBlocker.Icon.Source.ArcadeIcon) source).getValue().arcade_id;
                if (str3 != null) {
                    buttonIcon2 = new ButtonIcon.ArcadeIcon(str3);
                    buttonIcon = buttonIcon2;
                }
                buttonIcon2 = null;
                buttonIcon = buttonIcon2;
            } else {
                if (source instanceof FormBlocker.Icon.Source.Image) {
                    FormBlocker.Icon.Image.Type type2 = ((FormBlocker.Icon.Source.Image) source).getValue().type;
                    int i2 = type2 == null ? -1 : FormPresenterKt$WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            buttonIcon2 = ButtonIcon$DrawableResource$GooglePay.INSTANCE;
                            buttonIcon = buttonIcon2;
                        } else if (i2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                } else if (source != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                buttonIcon2 = null;
                buttonIcon = buttonIcon2;
            }
        } else {
            buttonIcon = null;
        }
        BlockerAction blockerAction2 = formScreen.secondary_action;
        String str4 = blockerAction2 != null ? blockerAction2.text : null;
        String str5 = formScreen.disclaimer_text;
        boolean z2 = formScreen.help_action != null;
        BlockerAction.Action action = blockerAction != null ? blockerAction.action : null;
        BlockerAction.Action.SubmitAction submitAction = action instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action : null;
        String str6 = (submitAction == null || (value = submitAction.getValue()) == null) ? null : value.id;
        Color color2 = blockersData.serverAccentColor;
        ColorModel accented = color2 != null ? new ColorModel.Accented(color2) : blockersData.accentColor;
        FormBlocker.Element element = (FormBlocker.Element) CollectionsKt.firstOrNull(formScreen.elements);
        ColorModel.Accented accented2 = (!((element != null ? element.element : null) instanceof FormBlocker.Element.AbstractC0072Element.RemoteImageElement) || (color = blockersData.fullBleedBackgroundColor) == null) ? null : new ColorModel.Accented(color);
        boolean z3 = formScreen.requiresFullScroll;
        FormBlocker.OnDisplayEffect onDisplayEffect = formScreen.onDisplayEffect;
        if (onDisplayEffect != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[onDisplayEffect.ordinal()];
            if (i3 == 1) {
                r21 = FormViewModel$OnDisplayEffect$Confetti.INSTANCE;
                FormViewModel formViewModel = new FormViewModel(list, z, str2, buttonIcon, str4, str5, z2, str6, accented, z3, r21, formScreen.primary_action_type, formScreen.primary_action_style, formScreen.secondary_action_style, accented2, null, BitmapUtils.toClientScenarioAndFlowToken(formScreen), TaskExtensionsKt.toBlockerIdentifiers(formScreen), formScreen.retreatAction == null, formScreen.titleBarAccessoryText, 32768);
                gapComposer.end(false);
                return formViewModel;
            }
            if (i3 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        FormBlocker.RemoteOnDisplayEffect remoteOnDisplayEffect = formScreen.remoteOnDisplayEffect;
        Object obj = continuation2;
        if (remoteOnDisplayEffect != null) {
            Animation animation = remoteOnDisplayEffect.animation;
            obj = continuation2;
            if (animation != null) {
                obj = new FormViewModel$OnDisplayEffect$Animation(animation);
            }
        }
        r21 = obj;
        FormViewModel formViewModel2 = new FormViewModel(list, z, str2, buttonIcon, str4, str5, z2, str6, accented, z3, r21, formScreen.primary_action_type, formScreen.primary_action_style, formScreen.secondary_action_style, accented2, null, BitmapUtils.toClientScenarioAndFlowToken(formScreen), TaskExtensionsKt.toBlockerIdentifiers(formScreen), formScreen.retreatAction == null, formScreen.titleBarAccessoryText, 32768);
        gapComposer.end(false);
        return formViewModel2;
    }

    public final BlockerAction toBlockerAction(FormViewEvent formViewEvent) {
        formViewEvent.getClass();
        if (formViewEvent instanceof FormViewEvent.BlockerActionViewEvent) {
            return ((FormViewEvent.BlockerActionViewEvent) formViewEvent).getAction();
        }
        if (formViewEvent instanceof FormViewEvent.FormUrlClicked) {
            FormViewEvent.FormUrlClicked formUrlClicked = (FormViewEvent.FormUrlClicked) formViewEvent;
            BlockerAction decode = ((RealBlockerActionUriDecoder) this.blockerActionUriDecoder).decode(formUrlClicked.url);
            return decode == null ? new BlockerAction(null, new BlockerAction.Action.OpenUrlAction(new BlockerAction.OpenURLAction(formUrlClicked.url, null, null, null, 14, null)), 23) : decode;
        }
        if (formViewEvent instanceof FormViewEvent.SubmitTextInputKeyPressed) {
            return new BlockerAction(null, new BlockerAction.Action.SubmitAction(new BlockerAction.SubmitAction(((FormViewEvent.SubmitTextInputKeyPressed) formViewEvent).submitActionId, null, null, null, 14, null)), 23);
        }
        if (formViewEvent instanceof FormViewEvent.EndFlow) {
            return new BlockerAction(null, new BlockerAction.Action.EndFlowAction(new BlockerAction.EndFlowAction(BlockerAction.EndFlowAction.Result.CANCELLED, null, null, 6, null)), 23);
        }
        if (formViewEvent instanceof FormViewEvent.PrimaryActionSelected) {
            BlockerAction blockerAction = this.primaryAction;
            if (blockerAction != null) {
                return blockerAction;
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Primary action is missing a view event");
            return null;
        }
        if (formViewEvent instanceof FormViewEvent.SecondaryActionSelected) {
            BlockerAction blockerAction2 = this.secondaryAction;
            if (blockerAction2 != null) {
                return blockerAction2;
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Secondary action is missing a view event");
            return null;
        }
        if (formViewEvent instanceof FormViewEvent.HelpActionSelected) {
            BlockerAction blockerAction3 = this.helpAction;
            if (blockerAction3 != null) {
                return blockerAction3;
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Help action is missing a view event");
            return null;
        }
        if (formViewEvent instanceof FormViewEvent.Dismiss) {
            BlockerAction blockerAction4 = this.dismissAction;
            if (blockerAction4 != null) {
                return blockerAction4;
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Dismiss action is missing a view event");
            return null;
        }
        if (formViewEvent instanceof FormViewEvent.Retreat) {
            BlockerAction blockerAction5 = this.retreatAction;
            if (blockerAction5 != null) {
                return blockerAction5;
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Retreat action is missing a view event");
        }
        return null;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider blockerActionUriDecoder;
        public final Provider blockersHelperFactory;
        public final LambdaProvider clock;
        public final Provider formAnalytics;

        public MetroFactory(RealGooglePayPaymentsClient.MetroFactory metroFactory, RealBrazeManager.MetroFactory metroFactory2, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, ReleaseGooglePayPaymentsModule$ProvideGooglePaymentMerchantIdMetroFactory releaseGooglePayPaymentsModule$ProvideGooglePaymentMerchantIdMetroFactory) {
            this.blockersHelperFactory = metroFactory;
            this.formAnalytics = metroFactory2;
            this.analytics = doubleCheck;
            this.clock = lambdaProvider;
            this.blockerActionUriDecoder = releaseGooglePayPaymentsModule$ProvideGooglePaymentMerchantIdMetroFactory;
        }

        public MetroFactory(LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory, TemporaryStorage.MetroFactory metroFactory2, DoubleCheck doubleCheck, LocalViewFactory.MetroFactory metroFactory3) {
            this.clock = lambdaProvider;
            this.blockersHelperFactory = metroFactory;
            this.formAnalytics = metroFactory2;
            this.analytics = doubleCheck;
            this.blockerActionUriDecoder = metroFactory3;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory2) {
            this.clock = lambdaProvider;
            this.analytics = doubleCheck;
            this.blockersHelperFactory = metroFactory;
            this.formAnalytics = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.blockerActionUriDecoder = arcadeModule$ProvideHapticVibratorMetroFactory2;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealGlobalConfigDataSource.MetroFactory metroFactory, RealBrazeManager.MetroFactory metroFactory2, InstanceFactory instanceFactory, LambdaProvider lambdaProvider) {
            this.analytics = doubleCheck;
            this.blockersHelperFactory = metroFactory;
            this.formAnalytics = metroFactory2;
            this.blockerActionUriDecoder = instanceFactory;
            this.clock = lambdaProvider;
        }

        public MetroFactory(DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, LambdaProvider lambdaProvider, TreehouseFlows.MetroFactory metroFactory2, TreehouseFlows.MetroFactory metroFactory3) {
            this.analytics = doubleCheck;
            this.blockersHelperFactory = metroFactory;
            this.clock = lambdaProvider;
            this.formAnalytics = metroFactory2;
            this.blockerActionUriDecoder = metroFactory3;
        }

        public /* synthetic */ MetroFactory(Factory factory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, Factory factory2, InstanceFactory instanceFactory) {
            this.blockersHelperFactory = factory;
            this.analytics = doubleCheck;
            this.clock = lambdaProvider;
            this.formAnalytics = factory2;
            this.blockerActionUriDecoder = instanceFactory;
        }

        public MetroFactory(InstanceFactory instanceFactory, LambdaProvider lambdaProvider, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory2) {
            this.blockersHelperFactory = instanceFactory;
            this.clock = lambdaProvider;
            this.formAnalytics = attestedKeyMetrics$MetroFactory;
            this.analytics = doubleCheck;
            this.blockerActionUriDecoder = instanceFactory2;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, RealMarketAttributesProvider.MetroFactory metroFactory, RealExtensionManager$MetroFactory realExtensionManager$MetroFactory, LambdaProvider lambdaProvider) {
            this.blockersHelperFactory = instanceFactory;
            this.analytics = doubleCheck;
            this.formAnalytics = metroFactory;
            this.blockerActionUriDecoder = realExtensionManager$MetroFactory;
            this.clock = lambdaProvider;
        }
    }
}
