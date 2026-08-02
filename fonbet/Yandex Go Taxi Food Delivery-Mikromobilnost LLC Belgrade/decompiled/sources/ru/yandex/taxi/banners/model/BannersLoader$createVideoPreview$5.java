package ru.yandex.taxi.banners.model;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import defpackage.iux0;
import defpackage.mvg;
import defpackage.n9y0;
import defpackage.ny61;
import defpackage.shs;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$createVideoPreview$5", f = "BannersLoader.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersLoader$createVideoPreview$5 extends SuspendLambda implements wls {
    final /* synthetic */ shs $banner;
    final /* synthetic */ String $videoFilePath;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$createVideoPreview$5(String str, d dVar, shs shsVar, Continuation continuation) {
        super(2, continuation);
        this.$videoFilePath = str;
        this.this$0 = dVar;
        this.$banner = shsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BannersLoader$createVideoPreview$5 bannersLoader$createVideoPreview$5 = new BannersLoader$createVideoPreview$5(this.$videoFilePath, this.this$0, this.$banner, continuation);
        bannersLoader$createVideoPreview$5.L$0 = obj;
        return bannersLoader$createVideoPreview$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersLoader$createVideoPreview$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.$videoFilePath);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L);
            if (frameAtTime == null) {
                d dVar = this.this$0;
                shs shsVar = this.$banner;
                n9y0 n9y0Var = (n9y0) dVar.f;
                n9y0Var.getClass();
                n9y0Var.b("FIRST_FRAME_ERROR", shsVar, true).m();
                frameAtTime = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                frameAtTime.eraseColor(0);
            }
            mediaMetadataRetriever.release();
            File b = this.this$0.r.b();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(b);
                try {
                    frameAtTime.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                } finally {
                }
            } catch (IOException e) {
                iux0 iux0Var = (iux0) this.this$0.h;
                iux0Var.getClass();
                iux0Var.c("Error closing output stream", e, "Error closing output stream", "WTF");
            }
            return b.getAbsolutePath();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
