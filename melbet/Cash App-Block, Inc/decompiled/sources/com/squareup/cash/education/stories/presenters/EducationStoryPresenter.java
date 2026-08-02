package com.squareup.cash.education.stories.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.crypto.CryptoLearnComplete;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.DeepLinkParserKt;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.education.stories.backend.api.EducationStory;
import com.squareup.cash.education.stories.backend.api.SceneBackground;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.presenter.CashMapPresenter$$ExternalSyntheticLambda4;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import okhttp3.HttpUrl;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class EducationStoryPresenter implements MoleculeCallbackPresenter {
    public final Analytics analytics;
    public final EducationStoryScreen args;
    public final AndroidClock clock;
    public final RealDeepLinkParser deepLinkParser;
    public final ErrorReporter errorReporter;
    public final ParcelableSnapshotMutableState exitSource$delegate;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final RealEducationStoryRepository storyRepository;
    public final AndroidStringManager stringManager;

    public EducationStoryPresenter(Analytics analytics, AndroidStringManager androidStringManager, RealDeepLinkParser realDeepLinkParser, RealEducationStoryRepository realEducationStoryRepository, AndroidClock androidClock, ErrorReporter errorReporter, RealRouter$Factory$Impl realRouter$Factory$Impl, EducationStoryScreen educationStoryScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        educationStoryScreen.getClass();
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.deepLinkParser = realDeepLinkParser;
        this.storyRepository = realEducationStoryRepository;
        this.clock = androidClock;
        this.errorReporter = errorReporter;
        this.args = educationStoryScreen;
        this.navigator = screenNavigator;
        this.exitSource$delegate = Updater.mutableStateOf$default(CryptoLearnComplete.LearnExitSource.DISMISS);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.squareup.cash.education.stories.presenters.EducationStoryPresenter] */
    /* JADX WARN: Type inference failed for: r3v8, types: [app.cash.broadway.screen.Screen] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleNewUrl(EducationStoryPresenter educationStoryPresenter, String str, int i, ContinuationImpl continuationImpl) {
        EducationStoryPresenter$handleNewUrl$1 educationStoryPresenter$handleNewUrl$1;
        int i2;
        HttpUrl httpUrl;
        BetterNavigator.ScreenNavigator screenNavigator;
        String str2;
        EducationStoryScreen educationStoryScreen = educationStoryPresenter.args;
        if (continuationImpl instanceof EducationStoryPresenter$handleNewUrl$1) {
            educationStoryPresenter$handleNewUrl$1 = (EducationStoryPresenter$handleNewUrl$1) continuationImpl;
            int i3 = educationStoryPresenter$handleNewUrl$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                educationStoryPresenter$handleNewUrl$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = educationStoryPresenter$handleNewUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = educationStoryPresenter$handleNewUrl$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str == null) {
                        return Unit.INSTANCE;
                    }
                    ClientRoute tryParse = DeepLinkParserKt.tryParse(educationStoryPresenter.deepLinkParser, str);
                    if (tryParse != null) {
                        String str3 = educationStoryScreen.storyUrl;
                        List list = educationStoryScreen.backgroundColors;
                        Screen screen = educationStoryScreen.clientRouteExitScreen;
                        ColorModel colorModel = educationStoryScreen.accentColor;
                        str3.getClass();
                        list.getClass();
                        EducationStoryScreen educationStoryScreen2 = new EducationStoryScreen(str3, list, i, screen, colorModel);
                        RealRouter realRouter = educationStoryPresenter.router;
                        ?? r3 = educationStoryScreen.clientRouteExitScreen;
                        RoutingParams routingParams = new RoutingParams(educationStoryScreen2, null, r3 == 0 ? educationStoryScreen2 : r3, null, null, null, HttpStatusCode.BAD_GATEWAY_502);
                        realRouter.getClass();
                        realRouter.clientRouteRouter.route(tryParse, routingParams);
                        educationStoryPresenter.exitSource$delegate.setValue(CryptoLearnComplete.LearnExitSource.CTA);
                    } else {
                        try {
                            HttpUrl.Builder builder = new HttpUrl.Builder();
                            builder.parse$okhttp(null, str);
                            httpUrl = builder.build();
                        } catch (IllegalArgumentException unused) {
                            httpUrl = null;
                        }
                        if (httpUrl == null) {
                            Timber.Forest.e(new IllegalArgumentException("Attempted to load invalid url: ".concat(str)));
                            return Unit.INSTANCE;
                        }
                        String str4 = httpUrl.host;
                        String str5 = educationStoryScreen.storyUrl;
                        str5.getClass();
                        HttpUrl.Builder builder2 = new HttpUrl.Builder();
                        builder2.parse$okhttp(null, str5);
                        if (Intrinsics.areEqual(str4, builder2.build().host)) {
                            screenNavigator = educationStoryPresenter.navigator;
                            String str6 = httpUrl.url;
                            educationStoryPresenter$handleNewUrl$1.L$3 = screenNavigator;
                            educationStoryPresenter$handleNewUrl$1.L$4 = str6;
                            educationStoryPresenter$handleNewUrl$1.label = 1;
                            obj = educationStoryPresenter.getStoryBackgroundColor(httpUrl, educationStoryPresenter$handleNewUrl$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                            str2 = str6;
                        } else {
                            Timber.Forest.e(new IllegalArgumentException("Attempted to load cross-origin url: ".concat(str)));
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = educationStoryPresenter$handleNewUrl$1.L$4;
                screenNavigator = educationStoryPresenter$handleNewUrl$1.L$3;
                SafeTrace.throwOnFailure(obj);
                screenNavigator.goTo(new EducationStoryScreen(str2, (List) obj, new BitcoinHome(AppNavigateOpenSpace.SourceTab.BITCOIN, AppNavigateOpenSpace.Source.CLIENT_ROUTE, null, null, 12), 20));
                return Unit.INSTANCE;
            }
        }
        educationStoryPresenter$handleNewUrl$1 = new EducationStoryPresenter$handleNewUrl$1(educationStoryPresenter, continuationImpl);
        Object obj3 = educationStoryPresenter$handleNewUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = educationStoryPresenter$handleNewUrl$1.label;
        if (i2 != 0) {
        }
        screenNavigator.goTo(new EducationStoryScreen(str2, (List) obj3, new BitcoinHome(AppNavigateOpenSpace.SourceTab.BITCOIN, AppNavigateOpenSpace.Source.CLIENT_ROUTE, null, null, 12), 20));
        return Unit.INSTANCE;
    }

    public static String getSlug(HttpUrl httpUrl) {
        Object obj;
        ArrayList arrayList = httpUrl.pathSegments;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (!StringsKt.isBlank((String) obj)) {
                break;
            }
        }
        return (String) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable getStoryBackgroundColor(HttpUrl httpUrl, ContinuationImpl continuationImpl) {
        EducationStoryPresenter$getStoryBackgroundColor$1 educationStoryPresenter$getStoryBackgroundColor$1;
        int i;
        EducationStory educationStory;
        int i2;
        if (continuationImpl instanceof EducationStoryPresenter$getStoryBackgroundColor$1) {
            educationStoryPresenter$getStoryBackgroundColor$1 = (EducationStoryPresenter$getStoryBackgroundColor$1) continuationImpl;
            int i3 = educationStoryPresenter$getStoryBackgroundColor$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                educationStoryPresenter$getStoryBackgroundColor$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = educationStoryPresenter$getStoryBackgroundColor$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = educationStoryPresenter$getStoryBackgroundColor$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String slug = getSlug(httpUrl);
                    if (slug == null) {
                        return EmptyList.INSTANCE;
                    }
                    educationStoryPresenter$getStoryBackgroundColor$1.label = 1;
                    RealEducationStoryRepository realEducationStoryRepository = this.storyRepository;
                    obj = JobKt.withContext(realEducationStoryRepository.ioDispatcher, new RealAppConfigManager$update$2$2(realEducationStoryRepository, slug, continuation, 24), educationStoryPresenter$getStoryBackgroundColor$1);
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
                educationStory = (EducationStory) obj;
                if (educationStory != null) {
                    return EmptyList.INSTANCE;
                }
                ArrayList<SceneBackground> arrayList = educationStory.sceneBackgrounds;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (SceneBackground sceneBackground : arrayList) {
                    if (sceneBackground instanceof SceneBackground.None) {
                        i2 = -16777216;
                    } else {
                        if (!(sceneBackground instanceof SceneBackground.Color)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i2 = ((SceneBackground.Color) sceneBackground).color;
                    }
                    arrayList2.add(new Integer(i2));
                }
                return arrayList2;
            }
        }
        educationStoryPresenter$getStoryBackgroundColor$1 = new EducationStoryPresenter$getStoryBackgroundColor$1(this, continuationImpl);
        Object obj2 = educationStoryPresenter$getStoryBackgroundColor$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = educationStoryPresenter$getStoryBackgroundColor$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        educationStory = (EducationStory) obj2;
        if (educationStory != null) {
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        Object ready;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1551089758);
        Object rememberedValue = gapComposer.rememberedValue();
        EducationStoryScreen educationStoryScreen = this.args;
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(educationStoryScreen.initialSceneIndex, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        boolean changed = gapComposer.changed(parcelableSnapshotMutableIntState.getIntValue());
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == obj) {
            List list = educationStoryScreen.backgroundColors;
            int intValue = parcelableSnapshotMutableIntState.getIntValue();
            rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(((Number) ((intValue < 0 || intValue >= list.size()) ? -16777216 : list.get(intValue))).intValue(), gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue2;
        boolean changed2 = gapComposer.changed(parcelableSnapshotMutableIntState.getIntValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == obj) {
            String str = educationStoryScreen.storyUrl;
            str.getClass();
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.parse$okhttp(null, str);
            HttpUrl.Builder newBuilder = builder.build().newBuilder();
            String valueOf = String.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            newBuilder.encodedFragment = valueOf != null ? _UrlKt.canonicalize$default(0, 0, 59, valueOf, "", false) : null;
            newBuilder.addEncodedQueryParameter("opts", "remove:share-grid,fb:1,web-view:1");
            newBuilder.addEncodedQueryParameter("guide", "0");
            rememberedValue3 = newBuilder.build();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        HttpUrl httpUrl = (HttpUrl) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState2 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState3 = (MutableState) rememberedValue6;
        StableCoroutineScope rememberStableCoroutineScope = zzsc.rememberStableCoroutineScope(gapComposer);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(httpUrl);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue7 == obj) {
            rememberedValue7 = new GpsConfigQueries$$ExternalSyntheticLambda3(5, this, httpUrl, parcelableSnapshotMutableIntState);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Updater.DisposableEffect(unit, (Function1) rememberedValue7, gapComposer);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState4 = (MutableState) rememberedValue8;
        if (!((Boolean) mutableState2.getValue()).booleanValue()) {
            ready = new EducationStoryViewModel.NotReady(parcelableSnapshotMutableIntState2.getIntValue());
        } else if (((Boolean) mutableState.getValue()).booleanValue()) {
            int intValue2 = parcelableSnapshotMutableIntState2.getIntValue();
            AndroidStringManager androidStringManager = this.stringManager;
            ready = new EducationStoryViewModel.Error(intValue2, androidStringManager.get(R.string.education_story_error_title), androidStringManager.get(R.string.education_story_error_subtitle), androidStringManager.get(R.string.education_story_error_refresh_label));
        } else {
            ready = new EducationStoryViewModel.Ready(parcelableSnapshotMutableIntState2.getIntValue(), parcelableSnapshotMutableIntState.getIntValue(), httpUrl.url, !((Boolean) mutableState3.getValue()).booleanValue());
        }
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj) {
            Object cashMapPresenter$$ExternalSyntheticLambda4 = new CashMapPresenter$$ExternalSyntheticLambda4(this, rememberStableCoroutineScope, mutableState, parcelableSnapshotMutableIntState, mutableState2, mutableState4, httpUrl, mutableState3);
            gapComposer.updateRememberedValue(cashMapPresenter$$ExternalSyntheticLambda4);
            rememberedValue9 = cashMapPresenter$$ExternalSyntheticLambda4;
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue9, ready);
        gapComposer.end(false);
        return uiCallbackModel;
    }
}
