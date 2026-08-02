package ru.yandex.taxi.design.utils;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import defpackage.h1c0;
import defpackage.hgr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lh1c0;", "<anonymous>", "(Ltse;)Lh1c0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.design.utils.ShadowBgRepository$pinV2Shadows$2", f = "ShadowBgRepository.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ShadowBgRepository$pinV2Shadows$2 extends SuspendLambda implements wls {
    final /* synthetic */ RotateDrawable $pointer;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowBgRepository$pinV2Shadows$2(b bVar, RotateDrawable rotateDrawable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$pointer = rotateDrawable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShadowBgRepository$pinV2Shadows$2(this.this$0, this.$pointer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShadowBgRepository$pinV2Shadows$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Drawable drawable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = (a) this.this$0.c.get();
            RotateDrawable rotateDrawable = this.$pointer;
            hgr0 hgr0Var = this.this$0.d;
            aVar.getClass();
            BitmapDrawable e = aVar.e(rotateDrawable, hgr0Var.a, hgr0Var.b, hgr0Var.c, hgr0Var.d, false);
            RotateDrawable rotateDrawable2 = this.$pointer;
            rotateDrawable2.setBounds((-rotateDrawable2.getIntrinsicWidth()) / 2, 0, rotateDrawable2.getIntrinsicWidth() / 2, rotateDrawable2.getIntrinsicHeight());
            RotateDrawable rotateDrawable3 = this.$pointer;
            b bVar = this.this$0;
            int intrinsicHeight = (int) (((rotateDrawable3.getIntrinsicHeight() - e.getIntrinsicHeight()) / 2.0f) + bVar.d.b);
            int i2 = (int) (((-e.getIntrinsicWidth()) / 2.0f) + bVar.d.a);
            e.setBounds(i2, intrinsicHeight, e.getIntrinsicWidth() + i2, e.getIntrinsicHeight() + intrinsicHeight);
            b bVar2 = this.this$0;
            this.L$0 = e;
            this.label = 1;
            Object b = bVar2.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            drawable = e;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = (Drawable) this.L$0;
            kotlin.b.b(obj);
        }
        return new h1c0((List) obj, this.$pointer, drawable);
    }
}
