package ru.yandex.taxi.design.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PaintDrawable;
import defpackage.d6z;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.design.utils.ShadowBgRepository$roundRectRaw$2", f = "ShadowBgRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ShadowBgRepository$roundRectRaw$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $color;
    final /* synthetic */ hgr0 $config;
    final /* synthetic */ int $radius;
    final /* synthetic */ boolean $withOriginal;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowBgRepository$roundRectRaw$2(b bVar, int i, hgr0 hgr0Var, boolean z, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$radius = i;
        this.$config = hgr0Var;
        this.$withOriginal = z;
        this.$color = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShadowBgRepository$roundRectRaw$2(this.this$0, this.$radius, this.$config, this.$withOriginal, this.$color, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShadowBgRepository$roundRectRaw$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = (a) this.this$0.c.get();
        Context context = this.this$0.a;
        int i = this.$radius;
        hgr0 hgr0Var = this.$config;
        boolean z = this.$withOriginal;
        PaintDrawable W = d6z.W(this.$color, i);
        NinePatchDrawable w = gtq0.w(aVar, context, W, hgr0Var, false, true);
        return z ? new LayerDrawable(new Drawable[]{w, W}) : w;
    }
}
