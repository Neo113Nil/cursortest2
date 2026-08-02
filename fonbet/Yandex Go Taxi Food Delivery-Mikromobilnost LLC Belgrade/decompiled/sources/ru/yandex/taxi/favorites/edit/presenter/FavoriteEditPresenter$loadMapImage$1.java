package ru.yandex.taxi.favorites.edit.presenter;

import android.graphics.Bitmap;
import defpackage.aip;
import defpackage.cgp;
import defpackage.g16;
import defpackage.jj00;
import defpackage.mj00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qbv;
import defpackage.s6u0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.image.StaticMapImageConfig$MapType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.edit.presenter.FavoriteEditPresenter$loadMapImage$1", f = "FavoriteEditPresenter.kt", l = {173, 185}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteEditPresenter$loadMapImage$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteEditPresenter$loadMapImage$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoriteEditPresenter$loadMapImage$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteEditPresenter$loadMapImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r11 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            ru.yandex.taxi.map_common.image.a aVar = dVar.F;
            zzs B = dVar.M.a().B();
            s6u0 s6u0Var = new s6u0(500, 1000, 16, StaticMapImageConfig$MapType.MAP);
            this.label = 1;
            obj = aVar.c(B, s6u0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                d = ((Result) obj).getValue();
                d dVar2 = this.this$0;
                Throwable a = Result.a(d);
                if (a != null) {
                    aip aipVar = dVar2.K;
                    String localizedMessage = a.getLocalizedMessage();
                    aipVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (localizedMessage != null) {
                        hashMap.put("error", localizedMessage);
                    }
                    aipVar.a.a("Favorites.MapPreview.LoadingFailed", hashMap, 1, new HashMap());
                    ((cgp) dVar2.Dg()).renderMapImage(jj00.a);
                }
                d dVar3 = this.this$0;
                if (!(d instanceof Result.Failure)) {
                    aip aipVar2 = dVar3.K;
                    aipVar2.getClass();
                    aipVar2.a.a("Favorites.MapPreview.Loaded", new HashMap(), 1, new HashMap());
                    ((cgp) dVar3.Dg()).renderMapImage(new mj00((Bitmap) d));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        g16 i2 = this.this$0.L.b().i(new qbv((String) obj));
        this.L$0 = null;
        this.label = 2;
        d = ru.yandex.taxi.utils.a.d(i2, this);
    }
}
