package ru.yandex.taxi.logistics.sdk.ui.form.background.video;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.form.background.video.VideoBackgroundKt$VideoBackground$1$1", f = "VideoBackground.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VideoBackgroundKt$VideoBackground$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ oz40 $playerRenderedState;
    final /* synthetic */ oz40 $playerState;
    final /* synthetic */ m3u0 $visible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundKt$VideoBackground$1$1(Context context, oz40 oz40Var, oz40 oz40Var2, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
        this.$playerState = oz40Var;
        this.$playerRenderedState = oz40Var2;
        this.$visible$delegate = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoBackgroundKt$VideoBackground$1$1(this.$context, this.$playerState, this.$playerRenderedState, this.$visible$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VideoBackgroundKt$VideoBackground$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Context context = this.$context;
        boolean booleanValue = ((Boolean) this.$visible$delegate.getValue()).booleanValue();
        oz40 oz40Var = this.$playerState;
        oz40 oz40Var2 = this.$playerRenderedState;
        this.label = 1;
        if (booleanValue) {
            obj2 = a.c(context, oz40Var, oz40Var2, this);
        } else {
            if (booleanValue) {
                w511.b();
                return null;
            }
            ExoPlayer exoPlayer = (ExoPlayer) oz40Var.getValue();
            if (exoPlayer != null) {
                exoPlayer.pause();
            }
        }
        obj2 = zy11Var;
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
