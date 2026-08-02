package ru.yandex.taxi.scooters.presentation.feedback.comment;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.design.view.GoImageView;
import defpackage.g16;
import defpackage.kho0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppm0;
import defpackage.sfv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.comment.PhotoItemViewHolder$bind$1", f = "ScootersPhotoAdapter.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PhotoItemViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ ppm0 $data;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoItemViewHolder$bind$1(a aVar, ppm0 ppm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = ppm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotoItemViewHolder$bind$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotoItemViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GoImageView goImageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        BitmapDrawable bitmapDrawable = null;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            int i2 = a.W;
            GoImageView goImageView2 = ((kho0) ((zo31) aVar.R)).b;
            g16 e = aVar.S.b().b(this.$data.a.a.toString()).e(new sfv(1.5f, 0));
            a aVar2 = this.this$0;
            g16 g = e.g(aVar2.T, aVar2.U);
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
            a aVar3 = this.this$0;
            int i3 = a.W;
            bitmapDrawable = new BitmapDrawable(((kho0) ((zo31) aVar3.R)).a.getResources(), bitmap);
        }
        goImageView.setBackground(bitmapDrawable);
        this.this$0.c0(this.$data);
        return zy11.a;
    }
}
