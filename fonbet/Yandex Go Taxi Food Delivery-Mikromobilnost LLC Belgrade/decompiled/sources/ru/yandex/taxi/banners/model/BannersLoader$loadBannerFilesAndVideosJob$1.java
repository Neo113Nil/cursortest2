package ru.yandex.taxi.banners.model;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.shs;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$loadBannerFilesAndVideosJob$1", f = "BannersLoader.kt", l = {322, 324}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersLoader$loadBannerFilesAndVideosJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ Promotion $banner;
    final /* synthetic */ boolean $intoMemory;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$loadBannerFilesAndVideosJob$1(d dVar, Promotion promotion, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$banner = promotion;
        this.$intoMemory = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BannersLoader$loadBannerFilesAndVideosJob$1 bannersLoader$loadBannerFilesAndVideosJob$1 = new BannersLoader$loadBannerFilesAndVideosJob$1(this.this$0, this.$banner, this.$intoMemory, continuation);
        bannersLoader$loadBannerFilesAndVideosJob$1.L$0 = obj;
        return bannersLoader$loadBannerFilesAndVideosJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersLoader$loadBannerFilesAndVideosJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        if (r14.d(r0, r13) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (kotlinx.coroutines.a.b(r14, r13) == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Promotion promotion = this.$banner;
            d dVar = this.this$0;
            boolean z = this.$intoMemory;
            ListBuilder a = rcc.a();
            Iterator it = promotion.h().iterator();
            while (it.hasNext()) {
                a.add(tje.h(tseVar, null, null, new BannersLoader$loadBannerFilesAndVideosJob$1$1$1$1(dVar, (String) it.next(), promotion, z, null), 3));
            }
            Iterator it2 = promotion.d().iterator();
            while (it2.hasNext()) {
                a.add(tje.h(tseVar, null, null, new BannersLoader$loadBannerFilesAndVideosJob$1$1$2$1(dVar, (String) it2.next(), null), 3));
            }
            if (promotion instanceof shs) {
                a.add(tje.h(tseVar, null, null, new BannersLoader$loadBannerFilesAndVideosJob$1$1$3(dVar, promotion, null), 3));
            }
            ListBuilder j = a.j();
            this.L$0 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.c(this.$banner);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        e eVar = this.this$0.b;
        Promotion promotion2 = this.$banner;
        this.L$0 = null;
        this.label = 2;
    }
}
