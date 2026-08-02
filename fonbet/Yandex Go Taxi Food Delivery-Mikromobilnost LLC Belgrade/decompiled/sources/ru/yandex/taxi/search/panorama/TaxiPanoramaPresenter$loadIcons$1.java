package ru.yandex.taxi.search.panorama;

import android.graphics.drawable.BitmapDrawable;
import defpackage.g6u;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.r8y0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.y8y0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.panorama.TaxiPanoramaPresenter$loadIcons$1", f = "TaxiPanoramaPresenter.kt", l = {198, 201}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiPanoramaPresenter$loadIcons$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $acceptPickupPointDescIconTag;
    Object L$0;
    int label;
    final /* synthetic */ y8y0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.search.panorama.TaxiPanoramaPresenter$loadIcons$1$1", f = "TaxiPanoramaPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.search.panorama.TaxiPanoramaPresenter$loadIcons$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ BitmapDrawable $drawable;
        int label;
        final /* synthetic */ y8y0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BitmapDrawable bitmapDrawable, y8y0 y8y0Var, Continuation continuation) {
            super(2, continuation);
            this.$drawable = bitmapDrawable;
            this.this$0 = y8y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$drawable, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            BitmapDrawable bitmapDrawable = this.$drawable;
            if (bitmapDrawable != null) {
                ((r8y0) this.this$0.Dg()).Qf(bitmapDrawable);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPanoramaPresenter$loadIcons$1(y8y0 y8y0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y8y0Var;
        this.$acceptPickupPointDescIconTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiPanoramaPresenter$loadIcons$1(this.this$0, this.$acceptPickupPointDescIconTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiPanoramaPresenter$loadIcons$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (defpackage.tje.k0(r1, r3, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.B.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            TaxiPanoramaPresenter$loadIcons$1$drawable$1 taxiPanoramaPresenter$loadIcons$1$drawable$1 = new TaxiPanoramaPresenter$loadIcons$1$drawable$1(this.this$0, this.$acceptPickupPointDescIconTag, null);
            this.label = 1;
            obj = tje.k0(mdhVar, taxiPanoramaPresenter$loadIcons$1$drawable$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        this.this$0.B.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((BitmapDrawable) obj, this.this$0, null);
        this.L$0 = null;
        this.label = 2;
    }
}
