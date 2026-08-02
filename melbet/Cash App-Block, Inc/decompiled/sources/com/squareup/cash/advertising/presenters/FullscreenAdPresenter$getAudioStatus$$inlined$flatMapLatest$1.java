package com.squareup.cash.advertising.presenters;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.paging.PageFetcher$flow$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.db.QueryResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import com.squareup.cash.advertising.backend.api.FullscreenAd;
import com.squareup.cash.advertising.backend.api.Status$Complete;
import com.squareup.cash.advertising.backend.api.Status$Error;
import com.squareup.cash.advertising.backend.api.Status$Loading;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel;
import com.squareup.protos.cash.composer.app.Action;
import com.squareup.protos.cash.composer.app.Asset$AssetType$VideoAsset;
import com.squareup.protos.cash.composer.app.VideoAsset;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;
import retrofit2.DefaultMethodSupport;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ FullscreenAdPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1(int i, FullscreenAdPresenter fullscreenAdPresenter, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = fullscreenAdPresenter;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        FullscreenAdPresenter fullscreenAdPresenter = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1 fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1 = new FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1(0, fullscreenAdPresenter, continuation);
                fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1.L$0 = flowCollector;
                fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1.L$1 = obj2;
                return fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1 fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$12 = new FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1(1, fullscreenAdPresenter, continuation);
                fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$12.L$0 = flowCollector;
                fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$12.L$1 = obj2;
                return fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Flow appLockMonitor$special$$inlined$map$2;
        Flow flow;
        FlowCollector flowCollector2;
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22;
        DefaultMethodSupport defaultMethodSupport;
        int i = this.$r8$classId;
        FullscreenAdPresenter fullscreenAdPresenter = this.this$0;
        int i2 = 2;
        int i3 = 0;
        switch (i) {
            case 0:
                SharedFlowImpl sharedFlowImpl = fullscreenAdPresenter.hasAudioTrack;
                SharedFlowImpl sharedFlowImpl2 = fullscreenAdPresenter.isMuted;
                FlowCollector flowCollector3 = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FullscreenAd fullscreenAd = (FullscreenAd) obj2;
                    FullscreenAdViewModel.Content.AudioStatus audioStatus = FullscreenAdViewModel.Content.AudioStatus.MUTED_AND_DISABLED;
                    if (fullscreenAd == null) {
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(audioStatus, 19);
                        flowCollector = null;
                    } else {
                        int ordinal = fullscreenAd.config.audioPreference.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                flowCollector = null;
                                flow = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i2, false ? 1 : 0, i2), sharedFlowImpl2), new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i2, false ? 1 : 0, 3), sharedFlowImpl), FullscreenAdPresenter$getAudioStatus$1$5.INSTANCE, i3);
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                flowCollector = null;
                                flow = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new NetworkFetcher$doFetch$2(fullscreenAdPresenter, false ? 1 : 0, 27), sharedFlowImpl2), new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i2, false ? 1 : 0, 4), sharedFlowImpl), FullscreenAdPresenter$getAudioStatus$1$10.INSTANCE, i3);
                            }
                            appLockMonitor$special$$inlined$map$2 = flow;
                        } else {
                            flowCollector = null;
                            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(audioStatus, 19);
                        }
                    }
                    this.L$0 = flowCollector;
                    this.L$1 = flowCollector;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector3, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                FlowCollector flowCollector4 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair = (Pair) obj3;
                    FullscreenAd fullscreenAd2 = (FullscreenAd) pair.first;
                    FullscreenAdViewModel.Content.AudioStatus audioStatus2 = (FullscreenAdViewModel.Content.AudioStatus) pair.second;
                    Object obj4 = FullscreenAdViewModel.Error.INSTANCE;
                    if (fullscreenAd2 != null) {
                        Status$Complete status$Complete = fullscreenAd2.assetStatus;
                        FullscreenAd.Config config = fullscreenAd2.config;
                        if (!status$Complete.equals(Status$Error.INSTANCE)) {
                            QueryResult.DefaultImpls defaultImpls = config.asset.asset_type;
                            Asset$AssetType$VideoAsset asset$AssetType$VideoAsset = defaultImpls instanceof Asset$AssetType$VideoAsset ? (Asset$AssetType$VideoAsset) defaultImpls : null;
                            VideoAsset videoAsset = asset$AssetType$VideoAsset != null ? asset$AssetType$VideoAsset.value : null;
                            if (videoAsset != null) {
                                String str = videoAsset.accessibility_hint;
                                String str2 = videoAsset.fallback_image_url;
                                if (status$Complete.equals(Status$Loading.INSTANCE)) {
                                    obj4 = new FullscreenAdViewModel.Loading(str2);
                                } else {
                                    Uri uri = status$Complete.assetUri;
                                    if (uri != null) {
                                        Boolean bool = videoAsset.should_loop;
                                        defaultMethodSupport = new FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel(uri, str, str2, bool != null ? bool.booleanValue() : false);
                                    } else {
                                        defaultMethodSupport = new FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel(str2, str);
                                    }
                                }
                            } else {
                                defaultMethodSupport = null;
                            }
                            List list = config.actions;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (Object obj5 : list) {
                                int i6 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    throw null;
                                }
                                Action action = (Action) obj5;
                                String str3 = action.text;
                                str3.getClass();
                                String str4 = action.url_to_open;
                                arrayList.add(new FullscreenAdViewModel.Content.ActionViewModel(action.background_color, action.text_color, str3, str4, i3 != 0 ? i3 != 1 ? i3 != 2 ? "other" : "tertiary" : "secondary" : "primary"));
                                i3 = i6;
                            }
                            flowCollector2 = null;
                            obj4 = new FullscreenAdViewModel.Content(defaultMethodSupport, arrayList, audioStatus2);
                            appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(obj4, 19);
                        }
                        flowCollector2 = null;
                        appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(obj4, 19);
                    } else {
                        flowCollector2 = null;
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Failed to find full screen ad config for token=", fullscreenAdPresenter.args.token), new Object[0]);
                        appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(obj4, 19);
                    }
                    FlowCollector flowCollector5 = flowCollector2;
                    this.L$0 = flowCollector5;
                    this.L$1 = flowCollector5;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector4, appLockMonitor$special$$inlined$map$22, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
