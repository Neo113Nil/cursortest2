package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.kn1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Pair;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.AiCameraStrategy$prepareImagesFromGallery$2", f = "AiCameraStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AiCameraStrategy$prepareImagesFromGallery$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiCameraStrategy$prepareImagesFromGallery$2(a aVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiCameraStrategy$prepareImagesFromGallery$2(this.this$0, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiCameraStrategy$prepareImagesFromGallery$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final kn1 kn1Var = this.this$0.b;
        final Uri uri = this.$uri;
        kn1Var.getClass();
        final int i = 1;
        sls slsVar = new sls() { // from class: in1
            @Override // defpackage.sls
            public final Object invoke() {
                switch (i) {
                }
                return ((Context) kn1Var.w).getContentResolver().openInputStream(uri);
            }
        };
        final int i2 = 0;
        Bitmap t = kn1Var.t(slsVar, false);
        final kn1 kn1Var2 = this.this$0.b;
        final Uri uri2 = this.$uri;
        kn1Var2.getClass();
        return new Pair(t, kn1Var2.t(new sls() { // from class: in1
            @Override // defpackage.sls
            public final Object invoke() {
                switch (i2) {
                }
                return ((Context) kn1Var2.w).getContentResolver().openInputStream(uri2);
            }
        }, true));
    }
}
