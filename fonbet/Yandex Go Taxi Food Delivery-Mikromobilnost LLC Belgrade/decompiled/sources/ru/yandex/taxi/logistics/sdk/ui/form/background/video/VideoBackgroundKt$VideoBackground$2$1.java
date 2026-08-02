package ru.yandex.taxi.logistics.sdk.ui.form.background.video;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.fe10;
import defpackage.m3u0;
import defpackage.mhe;
import defpackage.mvg;
import defpackage.nhe;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.td10;
import defpackage.tse;
import defpackage.vg4;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.form.background.video.VideoBackgroundKt$VideoBackground$2$1", f = "VideoBackground.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VideoBackgroundKt$VideoBackground$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $playerRenderedState;
    final /* synthetic */ oz40 $playerState;
    final /* synthetic */ vg4 $state;
    final /* synthetic */ m3u0 $visible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundKt$VideoBackground$2$1(vg4 vg4Var, oz40 oz40Var, oz40 oz40Var2, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$state = vg4Var;
        this.$playerState = oz40Var;
        this.$playerRenderedState = oz40Var2;
        this.$visible$delegate = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoBackgroundKt$VideoBackground$2$1(this.$state, this.$playerState, this.$playerRenderedState, this.$visible$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VideoBackgroundKt$VideoBackground$2$1 videoBackgroundKt$VideoBackground$2$1 = (VideoBackgroundKt$VideoBackground$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        videoBackgroundKt$VideoBackground$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vg4 vg4Var = this.$state;
        boolean booleanValue = ((Boolean) this.$visible$delegate.getValue()).booleanValue();
        ExoPlayer exoPlayer = (ExoPlayer) this.$playerState.getValue();
        oz40 oz40Var = this.$playerRenderedState;
        if (exoPlayer != null) {
            String str = vg4Var.a;
            int i = fe10.g;
            td10 td10Var = new td10();
            td10Var.b(str);
            exoPlayer.setMediaItem(td10Var.a());
            nhe nheVar = vg4Var.b;
            exoPlayer.setVideoScalingMode((nheVar.equals(mhe.a) || nheVar.equals(mhe.c) || nheVar.equals(mhe.d)) ? 2 : 1);
            exoPlayer.setRepeatMode(!vg4Var.c ? 0 : 2);
            exoPlayer.setVolume(vg4Var.d ? 0.0f : 1.0f);
            oz40Var.setValue(Boolean.FALSE);
            exoPlayer.prepare();
            if (booleanValue) {
                exoPlayer.play();
            }
        }
        return zy11.a;
    }
}
