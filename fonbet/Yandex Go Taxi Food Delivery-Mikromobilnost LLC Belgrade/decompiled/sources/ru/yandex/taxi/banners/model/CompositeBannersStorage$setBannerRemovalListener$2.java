package ru.yandex.taxi.banners.model;

import defpackage.ctf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/promotions/model/Promotion;", "Lru/yandex/taxi/communications/api/dto/Banner;", "banner", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/promotions/model/Promotion;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.CompositeBannersStorage$setBannerRemovalListener$2", f = "CompositeBannersStorage.kt", l = {38, 38, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class CompositeBannersStorage$setBannerRemovalListener$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $listener;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeBannersStorage$setBannerRemovalListener$2(e eVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$listener = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CompositeBannersStorage$setBannerRemovalListener$2 compositeBannersStorage$setBannerRemovalListener$2 = new CompositeBannersStorage$setBannerRemovalListener$2(this.this$0, this.$listener, continuation);
        compositeBannersStorage$setBannerRemovalListener$2.L$0 = obj;
        return compositeBannersStorage$setBannerRemovalListener$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompositeBannersStorage$setBannerRemovalListener$2) create((Promotion) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        if (r9.invoke(r0, r8) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0042, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:13:0x007d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Promotion promotion = (Promotion) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.coroutines.h hVar = this.this$0.d;
            this.L$0 = promotion;
            this.label = 1;
            obj = hVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$2;
                kotlin.b.b(obj);
                if (obj != null) {
                    z = false;
                    if (z) {
                        wls wlsVar = this.$listener;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                    }
                    return zy11.a;
                }
                if (it.hasNext()) {
                    ctf0 ctf0Var = (ctf0) it.next();
                    String b = promotion.getB();
                    this.L$0 = promotion;
                    this.L$1 = null;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    obj = ctf0Var.g(b, this);
                }
                if (z) {
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        Iterable iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            it = iterable.iterator();
            if (it.hasNext()) {
            }
        }
        if (z) {
        }
        return zy11.a;
    }
}
