package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.ddi;
import defpackage.li50;
import defpackage.mi50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi50;
import defpackage.sls;
import defpackage.uc4;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lddi$a;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lddi$a;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.router.NddAddressMapPickerInteractor$attachView$5", f = "NddAddressMapPickerInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddAddressMapPickerInteractor$attachView$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.logistics.ndd_map.router.NddAddressMapPickerInteractor$attachView$5$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            Object value;
            e eVar = (e) this.receiver;
            eVar.j();
            eVar.k.a();
            r0 r0Var = eVar.R;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, null));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddAddressMapPickerInteractor$attachView$5(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NddAddressMapPickerInteractor$attachView$5 nddAddressMapPickerInteractor$attachView$5 = new NddAddressMapPickerInteractor$attachView$5(this.this$0, continuation);
        nddAddressMapPickerInteractor$attachView$5.L$0 = obj;
        return nddAddressMapPickerInteractor$attachView$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NddAddressMapPickerInteractor$attachView$5 nddAddressMapPickerInteractor$attachView$5 = (NddAddressMapPickerInteractor$attachView$5) create((ddi.a) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nddAddressMapPickerInteractor$attachView$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        ddi.a aVar = (ddi.a) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        li50 li50Var = this.this$0.h;
        Set set = aVar.a;
        uc4 uc4Var = aVar.b;
        boolean z = aVar.c;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, this.this$0, e.class, "clearMapSelection", "clearMapSelection()V", 0);
        mi50 mi50Var = li50Var.b;
        pi50 pi50Var = li50Var.d;
        if (uc4Var != null) {
            boolean z2 = mi50Var.a() != null;
            if (z && z2) {
                li50Var.b(null, null);
                r0 r0Var = pi50Var.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, pi50.a.a((pi50.a) value, null, false, null, false, 11)));
                pi50Var.a(false);
                anonymousClass1.invoke();
            } else {
                pi50.a aVar2 = (pi50.a) pi50Var.b.a.getValue();
                zzs zzsVar = aVar2.a;
                if (zzsVar != null && mi50Var.b() && !aVar2.b) {
                    zzs zzsVar2 = uc4Var.a;
                    Point point = new Point(zzsVar2.a, zzsVar2.b);
                    zzs zzsVar3 = uc4Var.b;
                    BoundingBox boundingBox = new BoundingBox(point, new Point(zzsVar3.a, zzsVar3.b));
                    Point point2 = new Point(zzsVar.a, zzsVar.b);
                    Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                    if (ru.yandex.taxi.map.utils.a.r(boundingBox, point2.getLatitude(), point2.getLongitude())) {
                        if (!set.contains(zzsVar)) {
                            r0 r0Var2 = pi50Var.a;
                            while (true) {
                                Object value2 = r0Var2.getValue();
                                zzs zzsVar4 = zzsVar;
                                if (r0Var2.k(value2, pi50.a.a((pi50.a) value2, null, false, zzsVar4, false, 11))) {
                                    break;
                                }
                                zzsVar = zzsVar4;
                            }
                            pi50Var.a(true);
                        }
                    } else if (!aVar2.d) {
                        li50Var.b(null, null);
                        anonymousClass1.invoke();
                    }
                }
            }
        }
        return zy11.a;
    }
}
