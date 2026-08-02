package com.squareup.cash.music.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.mosaic.resources.api.v2.GetMusicStreamingUrlRequest;
import com.squareup.cash.mosaic.resources.api.v2.GetMusicStreamingUrlResponse;
import com.squareup.cash.mosaic.resources.api.v2.MusicService;
import com.squareup.cash.mosaic.resources.api.v2.SearchMusicResourcesRequest;
import com.squareup.cash.mosaic.resources.api.v2.SearchMusicResourcesResponse;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealMusicRepository$searchMusic$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $query;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ToolbarTuckTargets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealMusicRepository$searchMusic$2(ToolbarTuckTargets toolbarTuckTargets, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = toolbarTuckTargets;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$query;
        ToolbarTuckTargets toolbarTuckTargets = this.this$0;
        switch (i) {
            case 0:
                return new RealMusicRepository$searchMusic$2(toolbarTuckTargets, str, continuation, 0);
            default:
                return new RealMusicRepository$searchMusic$2(toolbarTuckTargets, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealMusicRepository$searchMusic$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$query;
        ToolbarTuckTargets toolbarTuckTargets = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicService musicService = (MusicService) toolbarTuckTargets.startCornerCenterX$delegate;
                    SearchMusicResourcesRequest searchMusicResourcesRequest = new SearchMusicResourcesRequest(str, null, ByteString.EMPTY);
                    this.label = 1;
                    obj = musicService.searchMusicResources(searchMusicResourcesRequest, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    return ((SearchMusicResourcesResponse) ((ApiResult.Success) apiResult).response).musics;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicService musicService2 = (MusicService) toolbarTuckTargets.startCornerCenterX$delegate;
                    GetMusicStreamingUrlRequest getMusicStreamingUrlRequest = new GetMusicStreamingUrlRequest(str, ByteString.EMPTY);
                    this.label = 1;
                    obj = musicService2.getMusicStreamingUrl(getMusicStreamingUrlRequest, this);
                    if (obj == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult2 = (ApiResult) obj;
                if (apiResult2 instanceof ApiResult.Success) {
                    return ((GetMusicStreamingUrlResponse) ((ApiResult.Success) apiResult2).response).music;
                }
                return null;
        }
    }
}
