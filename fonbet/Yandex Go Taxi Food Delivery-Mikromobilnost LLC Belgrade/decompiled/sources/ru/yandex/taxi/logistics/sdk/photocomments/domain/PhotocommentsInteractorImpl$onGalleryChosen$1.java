package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import android.content.Intent;
import android.net.Uri;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.okb0;
import defpackage.s40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.photocomment.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsInteractorImpl$onGalleryChosen$1", f = "PhotocommentsInteractorImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 64}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PhotocommentsInteractorImpl$onGalleryChosen$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ okb0 $position;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotocommentsInteractorImpl$onGalleryChosen$1(a aVar, okb0 okb0Var, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$position = okb0Var;
        this.$maxHeight = i;
        this.$maxWidth = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotocommentsInteractorImpl$onGalleryChosen$1(this.this$0, this.$position, this.$maxHeight, this.$maxWidth, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotocommentsInteractorImpl$onGalleryChosen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r12 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Intent intent;
        Uri data;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.a;
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("image/*");
            this.label = 1;
            obj = cVar.a(intent2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        s40 s40Var = (s40) obj;
        a aVar = this.this$0;
        okb0 okb0Var = this.$position;
        int i2 = this.$maxHeight;
        int i3 = this.$maxWidth;
        this.L$0 = null;
        this.label = 2;
        aVar.getClass();
        if (s40Var.a != -1 || (intent = s40Var.b) == null || (data = intent.getData()) == null || (obj2 = aVar.d.e(okb0Var, data, i2, i3, this)) != coroutineSingletons) {
            obj2 = zy11Var;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
