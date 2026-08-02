package com.squareup.cash.account.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.settings.viewmodels.ProfileUpsellViewModel;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$OtpInfo$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.idv.ProfilePageUpsellComponentV2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.protos.franklin.ui.ProfileUpsellConfiguration;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class ProfileUpsellPresenter implements MoleculeCallbackPresenter {
    public final Analytics analytics;
    public final Screen parentScreen;
    public final RealRouter router;
    public final SyncValueReader syncValueReader;

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProfilePageUpsellComponentV2.Icon.values().length];
            try {
                zzb zzbVar = ProfilePageUpsellComponentV2.Icon.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzb zzbVar2 = ProfilePageUpsellComponentV2.Icon.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzb zzbVar3 = ProfilePageUpsellComponentV2.Icon.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzb zzbVar4 = ProfilePageUpsellComponentV2.Icon.Companion;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProfilePageUpsellComponentV2.IconV2.values().length];
            try {
                zzc zzcVar = ProfilePageUpsellComponentV2.IconV2.Companion;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzc zzcVar2 = ProfilePageUpsellComponentV2.IconV2.Companion;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zzc zzcVar3 = ProfilePageUpsellComponentV2.IconV2.Companion;
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zzc zzcVar4 = ProfilePageUpsellComponentV2.IconV2.Companion;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zzc zzcVar5 = ProfilePageUpsellComponentV2.IconV2.Companion;
                iArr2[5] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ProfileUpsellPresenter(Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, SyncValueReader syncValueReader, BetterNavigator.ScreenNavigator screenNavigator, Account account) {
        account.getClass();
        this.analytics = analytics;
        this.syncValueReader = syncValueReader;
        this.parentScreen = account;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-452554412);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            AndroidSyncValueSpecs$OtpInfo$1 androidSyncValueSpecs$OtpInfo$1 = AndroidSyncValueSpecs.ProfilePageUpsellComponentV2;
            SyncValueReader syncValueReader = this.syncValueReader;
            rememberedValue = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(StateFlowKt.combineState(syncValueReader.getAllValues(androidSyncValueSpecs$OtpInfo$1), syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.ProfileUpsellConfiguration, new ProfileUpsellConfiguration(EmptyList.INSTANCE, ByteString.EMPTY), new Matcher$$ExternalSyntheticLambda9(13)), new WorkApplet$applet$1(2, this, ProfileUpsellPresenter.class, "selectUpsellComponentToDisplay", "selectUpsellComponentToDisplay(Ljava/util/List;Lcom/squareup/protos/franklin/ui/ProfileUpsellConfiguration;)Lcom/squareup/cash/idv/ProfilePageUpsellComponentV2;", 0, 11)), 24), this, 4);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        ProfileUpsellViewModel profileUpsellViewModel = new ProfileUpsellViewModel(CollectionsKt__CollectionsKt.listOfNotNull((ProfileUpsellViewModel.ProfileUpsellRow) Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2).getValue()));
        boolean changed = gapComposer.changed(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new xg$$ExternalSyntheticLambda9(this, 26);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue2, profileUpsellViewModel);
        gapComposer.end(false);
        return uiCallbackModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider routerFactory;
        public final DoubleCheck syncValueReader;

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Factory factory) {
            this.analytics = doubleCheck;
            this.syncValueReader = doubleCheck2;
            this.routerFactory = factory;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Factory factory, DoubleCheck doubleCheck2) {
            this.analytics = doubleCheck;
            this.routerFactory = factory;
            this.syncValueReader = doubleCheck2;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
            this.routerFactory = instanceFactory;
            this.analytics = doubleCheck;
            this.syncValueReader = doubleCheck2;
        }
    }
}
