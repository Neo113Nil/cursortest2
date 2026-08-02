package app.cash.local.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.work.Data$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.arcade.viewmodels.AvatarViewModel$$ExternalSyntheticLambda0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.internal.LocalResponseContextHandler$Factory$Impl;
import app.cash.local.primitives.BrandToken;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.protos.cash.local.client.app.v1.BrandTile;
import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class LocalAddBrandsPresenter implements MoleculePresenter {
    public static final WorkLauncherImpl brandTokenListSaver = ListSaverKt.listSaver(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 12), new Data$$ExternalSyntheticLambda0(18));
    public final Analytics analytics;
    public final RealLocalLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SVG responseContextHandler;
    public final LocalService service;
    public final LocalInstalledStore store;

    public LocalAddBrandsPresenter(LocalService localService, RealLocalLauncher realLocalLauncher, Analytics analytics, LocalResponseContextHandler$Factory$Impl localResponseContextHandler$Factory$Impl, LocalInstalledStore localInstalledStore, BetterNavigator.ScreenNavigator screenNavigator) {
        this.service = localService;
        this.launcher = realLocalLauncher;
        this.analytics = analytics;
        this.store = localInstalledStore;
        this.navigator = screenNavigator;
        this.responseContextHandler = localResponseContextHandler$Factory$Impl.create(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2097479016);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new DiskLruCache$launchCleanup$1(this, continuation, 15);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Object rememberedValue4 = gapComposer.rememberedValue();
        LocalInstalledStore localInstalledStore = this.store;
        if (rememberedValue4 == neverEqualPolicy) {
            RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).screens, 21);
            gapComposer.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
            rememberedValue4 = realLocalInstalledStore$hideBrands$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, new MarketTilesScreen(null, EmptyList.INSTANCE, ByteString.EMPTY), null, gapComposer, 0, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$12 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalCard), 5);
            gapComposer.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$12);
            rememberedValue5 = realLocalInstalledStore$hideBrands$$inlined$map$12;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue5, EmptySet.INSTANCE, null, gapComposer, 48, 2);
        Object[] objArr = new Object[0];
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new AvatarViewModel$$ExternalSyntheticLambda0(10);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        WorkLauncherImpl workLauncherImpl = brandTokenListSaver;
        SnapshotStateList snapshotStateList = (SnapshotStateList) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue6, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
        Object[] objArr2 = new Object[0];
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = new AvatarViewModel$$ExternalSyntheticLambda0(11);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        SnapshotStateList snapshotStateList2 = (SnapshotStateList) SaverKt.m581rememberSaveable(objArr2, (Saver) workLauncherImpl, (Function0) rememberedValue7, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
        Set minus = SetsKt___SetsKt.minus((Set) SetsKt___SetsKt.plus((Set) collectAsState2.getValue(), (Iterable) snapshotStateList), (Iterable) snapshotStateList2);
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, snapshotStateList2, snapshotStateList, mutableState, collectAsState2, mutableState2, 3));
        String str = ((MarketTilesScreen) collectAsState.getValue()).title;
        List list = ((MarketTilesScreen) collectAsState.getValue()).brand_tiles;
        String str2 = (String) mutableState2.getValue();
        if (str2 != null && !StringsKt.isBlank(str2)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.contains((CharSequence) ((BrandTile) obj).name, (CharSequence) str2, true)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        List<BrandTile> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (BrandTile brandTile : list2) {
            String str3 = brandTile.brand_token;
            str3.getClass();
            arrayList2.add(new LocalAddBrandsViewModel.BrandCard(str3, brandTile.name, brandTile.artwork_image, brandTile.foreground_color, brandTile.background_color, brandTile.brand_tile_client_route, minus.contains(new BrandToken(str3))));
        }
        LocalAddBrandsViewModel localAddBrandsViewModel = new LocalAddBrandsViewModel(str, arrayList2, ((Boolean) mutableState.getValue()).booleanValue());
        gapComposer.end(false);
        return localAddBrandsViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider launcher;
        public final Provider responseContextHandlerFactory;
        public final DoubleCheck service;
        public final Provider store;

        public MetroFactory(DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, RealSessionFlags.MetroFactory metroFactory2) {
            this.service = doubleCheck;
            this.launcher = metroFactory;
            this.analytics = doubleCheck2;
            this.responseContextHandlerFactory = instanceFactory;
            this.store = metroFactory2;
        }

        public MetroFactory(InstanceFactory instanceFactory, TreehouseFlows.MetroFactory metroFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
            this.launcher = instanceFactory;
            this.responseContextHandlerFactory = metroFactory;
            this.store = instanceFactory2;
            this.service = doubleCheck;
            this.analytics = doubleCheck2;
        }
    }
}
