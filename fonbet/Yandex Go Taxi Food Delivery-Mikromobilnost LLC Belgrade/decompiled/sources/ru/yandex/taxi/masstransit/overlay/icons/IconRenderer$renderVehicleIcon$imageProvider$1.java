package ru.yandex.taxi.masstransit.overlay.icons;

import android.graphics.Bitmap;
import com.yandex.runtime.image.ImageProvider;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lcom/yandex/runtime/image/ImageProvider;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Lcom/yandex/runtime/image/ImageProvider;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.icons.IconRenderer$renderVehicleIcon$imageProvider$1", f = "IconRenderer.kt", l = {282}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class IconRenderer$renderVehicleIcon$imageProvider$1 extends SuspendLambda implements wls {
    final /* synthetic */ c $state;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconRenderer$renderVehicleIcon$imageProvider$1(b bVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$state = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IconRenderer$renderVehicleIcon$imageProvider$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IconRenderer$renderVehicleIcon$imageProvider$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        g050 g050Var;
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bVar = this.this$0;
            kotlinx.coroutines.sync.a aVar = bVar.f;
            c cVar2 = this.$state;
            this.L$0 = aVar;
            this.L$1 = bVar;
            this.L$2 = cVar2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            cVar = cVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = (c) this.L$2;
            bVar = (b) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            bVar.h.render(cVar);
            Bitmap s = xw31.s(bVar.h);
            g050Var.d(null);
            return ImageProvider.fromBitmap(s);
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
