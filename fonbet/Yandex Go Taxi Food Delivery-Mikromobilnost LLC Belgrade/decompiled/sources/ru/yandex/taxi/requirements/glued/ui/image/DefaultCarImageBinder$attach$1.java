package ru.yandex.taxi.requirements.glued.ui.image;

import android.graphics.Bitmap;
import defpackage.jl40;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.glued.ui.image.DefaultCarImageBinder$attach$1", f = "DefaultCarImageBinder.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DefaultCarImageBinder$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $carImageFlow;
    final /* synthetic */ tpr $optionImagesFlow;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00062\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "", "Landroid/graphics/Bitmap;", "<destruct>", "", "Lu58;", "Lkotlin/Triple;", "<anonymous>", "(Lkotlin/Pair;Lkotlin/Pair;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.requirements.glued.ui.image.DefaultCarImageBinder$attach$1$1", f = "DefaultCarImageBinder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.requirements.glued.ui.image.DefaultCarImageBinder$attach$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (Pair) obj;
            anonymousClass1.L$1 = (Pair) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            Pair pair2 = (Pair) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            String str = (String) pair.getFirst();
            Bitmap bitmap = (Bitmap) pair.getSecond();
            String str2 = (String) pair2.getFirst();
            List list = (List) pair2.getSecond();
            if (jl40.l(str, str2)) {
                return new Triple(str, bitmap, list);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCarImageBinder$attach$1(tpr tprVar, tpr tprVar2, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$carImageFlow = tprVar;
        this.$optionImagesFlow = tprVar2;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultCarImageBinder$attach$1(this.$carImageFlow, this.$optionImagesFlow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultCarImageBinder$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(new m0(this.$carImageFlow, this.$optionImagesFlow, new AnonymousClass1(3, null)), 6);
            this.this$0.b.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(mthVar, uyj.a);
            h hVar = new h(this.this$0);
            this.label = 1;
            if (F.collect(hVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
