package ru.yandex.taxi.favorites.address.impl.domain;

import defpackage.mvg;
import defpackage.ndp;
import defpackage.ny61;
import defpackage.uep;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Luep;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.address.impl.domain.FavoriteSaveAddressInteractor$saveAddress$1", f = "FavoriteSaveAddressInteractor.kt", l = {38, 39, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteSaveAddressInteractor$saveAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ ndp $navigator;
    final /* synthetic */ uep $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteSaveAddressInteractor$saveAddress$1(uep uepVar, d dVar, ndp ndpVar, Continuation continuation) {
        super(2, continuation);
        this.$state = uepVar;
        this.this$0 = dVar;
        this.$navigator = ndpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FavoriteSaveAddressInteractor$saveAddress$1 favoriteSaveAddressInteractor$saveAddress$1 = new FavoriteSaveAddressInteractor$saveAddress$1(this.$state, this.this$0, this.$navigator, continuation);
        favoriteSaveAddressInteractor$saveAddress$1.L$0 = obj;
        return favoriteSaveAddressInteractor$saveAddress$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteSaveAddressInteractor$saveAddress$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (ru.yandex.taxi.favorites.address.impl.domain.d.a(r3, r7, r8, r17) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uep a = uep.a(this.$state, null, null, null, null, true, null, null, 447);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            uep a2 = uep.a(this.$state, null, null, null, null, false, null, null, 447);
            this.L$0 = null;
            this.label = 3;
        }
        d dVar = this.this$0;
        uep uepVar = this.$state;
        ndp ndpVar = this.$navigator;
        this.L$0 = vprVar;
        this.label = 2;
    }
}
