package ru.yandex.taxi.logistics.sdk.promotions.impl.ui;

import defpackage.bpc;
import defpackage.doe;
import defpackage.dpc;
import defpackage.fpc;
import defpackage.jgz;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vbp0;
import defpackage.w511;
import defpackage.xbp0;
import defpackage.zls;
import defpackage.zrf0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldoe;", "coordinates", "Lxbp0;", MetaDataField.SCREEN_FIELD, "Lzrf0;", "<anonymous>", "(Ldoe;Lxbp0;)Lzrf0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.promotions.impl.ui.BannersProviderImpl$loadBanners$3", f = "BannersProvider.kt", l = {MSException.ERROR_INVALID_PARAMETER, 100}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersProviderImpl$loadBanners$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersProviderImpl$loadBanners$3(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BannersProviderImpl$loadBanners$3 bannersProviderImpl$loadBanners$3 = new BannersProviderImpl$loadBanners$3(this.this$0, (Continuation) obj3);
        bannersProviderImpl$loadBanners$3.L$0 = (doe) obj;
        bannersProviderImpl$loadBanners$3.L$1 = (xbp0) obj2;
        return bannersProviderImpl$loadBanners$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r9 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r9 == r2) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zrf0 zrf0Var;
        doe doeVar = (doe) this.L$0;
        xbp0 xbp0Var = (xbp0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if ((xbp0Var instanceof vbp0) && !((vbp0) xbp0Var).d) {
                return zrf0.c;
            }
            b bVar = this.this$0;
            jse jseVar = bVar.a.b;
            BannersProviderImpl$loadBanners$3$banners$1 bannersProviderImpl$loadBanners$3$banners$1 = new BannersProviderImpl$loadBanners$3$banners$1(bVar, doeVar, xbp0Var, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = tje.k0(jseVar, bannersProviderImpl$loadBanners$3$banners$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zrf0Var = (zrf0) this.L$4;
                kotlin.b.b(obj);
                return new zrf0((List) obj, zrf0Var.b);
            }
            kotlin.b.b(obj);
        }
        fpc fpcVar = (fpc) obj;
        if (fpcVar instanceof bpc) {
            jgz.a.h("PromotionsBannersWidget");
            jgz.b("Failure while loading promotions", new Object[0]);
            return zrf0.c;
        }
        if (!(fpcVar instanceof dpc)) {
            w511.b();
            return null;
        }
        zrf0Var = (zrf0) ((dpc) fpcVar).a;
        ru.yandex.taxi.logistics.sdk.promotions.impl.domain.a aVar = this.this$0.c;
        List list = zrf0Var.a;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = zrf0Var;
        this.label = 2;
        obj = aVar.a(list, this);
    }
}
