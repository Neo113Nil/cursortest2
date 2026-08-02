package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.d140;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.w140;
import defpackage.x140;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopActionInteractor$handleRouteFromAction$2", f = "MtStopActionInteractor.kt", l = {159, HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopActionInteractor$handleRouteFromAction$2 extends SuspendLambda implements tls {
    final /* synthetic */ d140 $action;
    final /* synthetic */ w140 $navigator;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopActionInteractor$handleRouteFromAction$2(a aVar, d140 d140Var, w140 w140Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$action = d140Var;
        this.$navigator = w140Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MtStopActionInteractor$handleRouteFromAction$2(this.this$0, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MtStopActionInteractor$handleRouteFromAction$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (ru.yandex.taxi.masstransit.stop.interactor.a.a(r1, r7) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r8 == r0) goto L18;
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
            b bVar = this.this$0.b;
            d140 d140Var = this.$action;
            zzs zzsVar = d140Var.b;
            String str = d140Var.a;
            this.label = 1;
            bVar.g.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new MtStopAddressUpdateInteractor$prepareRouteFrom$2(bVar, zzsVar, str, null), this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            w140 w140Var = this.$navigator;
            ((x140) w140Var).a.V(PointType.DESTINATION);
        } else {
            a aVar = this.this$0;
            this.Z$0 = booleanValue;
            this.label = 2;
        }
        return zy11.a;
    }
}
