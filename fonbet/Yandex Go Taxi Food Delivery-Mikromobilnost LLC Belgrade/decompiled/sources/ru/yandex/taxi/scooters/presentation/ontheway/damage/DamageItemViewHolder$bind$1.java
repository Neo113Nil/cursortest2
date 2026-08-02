package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.design.view.GoImageView;
import defpackage.g16;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppm0;
import defpackage.sfv;
import defpackage.tse;
import defpackage.wls;
import defpackage.xbn0;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.damage.DamageItemViewHolder$bind$1", f = "ScootersDamageAdapter.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DamageItemViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ ppm0 $data;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DamageItemViewHolder$bind$1(b bVar, ppm0 ppm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$data = ppm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DamageItemViewHolder$bind$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DamageItemViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GoImageView goImageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        BitmapDrawable bitmapDrawable = null;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            int i2 = b.a0;
            GoImageView goImageView2 = ((xbn0) ((zo31) bVar.R)).b;
            g16 e = bVar.S.b().b(this.$data.a.a.toString()).e(new sfv(1.5f, ((xbn0) ((zo31) this.this$0.R)).b.getContext().getColor(mqg0.component_fog_dark)));
            b bVar2 = this.this$0;
            g16 g = e.g(bVar2.V, bVar2.W);
            this.L$0 = goImageView2;
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(g, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            goImageView = goImageView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            goImageView = (GoImageView) this.L$0;
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            b bVar3 = this.this$0;
            int i3 = b.a0;
            bitmapDrawable = new BitmapDrawable(((xbn0) ((zo31) bVar3.R)).b.getResources(), bitmap);
        }
        goImageView.setBackground(bitmapDrawable);
        b bVar4 = this.this$0;
        int i4 = b.a0;
        ((xbn0) ((zo31) bVar4.R)).c.setVisibility((!this.$data.a() || this.this$0.T) ? 0 : 4);
        return zy11.a;
    }
}
