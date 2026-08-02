package ru.yandex.taxi.banners.model;

import defpackage.fb7;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$init$1", f = "BannersLoader.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersLoader$init$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/promotions/model/Promotion;", "Lru/yandex/taxi/communications/api/dto/Banner;", "banner", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/promotions/model/Promotion;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$init$1$1", f = "BannersLoader.kt", l = {HProv.ALG_SID_KECCAK_256, 90}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.banners.model.BannersLoader$init$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$init$1$1$1", f = "BannersLoader.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.banners.model.BannersLoader$init$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C01031 extends SuspendLambda implements wls {
            final /* synthetic */ Promotion $banner;
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01031(d dVar, Promotion promotion, Continuation continuation) {
                super(2, continuation);
                this.this$0 = dVar;
                this.$banner = promotion;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01031(this.this$0, this.$banner, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                C01031 c01031 = (C01031) create((tse) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                c01031.invokeSuspend(zy11Var);
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
                d dVar = this.this$0;
                fb7 fb7Var = dVar.r;
                LinkedHashSet a = dVar.l.a(this.$banner);
                fb7Var.getClass();
                fb7.a(a);
                b bVar = this.this$0.s;
                tje.N(bVar.e, null, null, new BannerMediaLoader$removeDownloads$1(bVar, this.$banner.getB(), null), 3);
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Promotion) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        
            if (defpackage.tje.k0(r7, r2, r6) == r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            if (r7.n(r2, r6) == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Promotion promotion = (Promotion) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar = this.this$0;
                String b = promotion.getB();
                this.L$0 = promotion;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.this$0.a.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            C01031 c01031 = new C01031(this.this$0, promotion, null);
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$init$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersLoader$init$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersLoader$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            e eVar = dVar.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar, null);
            this.label = 1;
            if (eVar.c(anonymousClass1, this) == coroutineSingletons) {
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
