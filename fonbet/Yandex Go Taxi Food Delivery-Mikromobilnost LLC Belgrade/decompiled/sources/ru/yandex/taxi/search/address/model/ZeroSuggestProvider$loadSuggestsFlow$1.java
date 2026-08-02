package ru.yandex.taxi.search.address.model;

import com.yandex.go.address.search.perf.c;
import com.yandex.go.suggest.DestinationSuggest;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rwp0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.repository.e;
import ru.yandex.taxi.persuggest.source.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lcom/yandex/go/suggest/DestinationSuggest;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.address.model.ZeroSuggestProvider$loadSuggestsFlow$1", f = "ZeroSuggestProvider.kt", l = {40, 43, 46, 47, 50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZeroSuggestProvider$loadSuggestsFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $clarified;
    final /* synthetic */ RoutePointType $pointType;
    final /* synthetic */ List<DestinationSuggest> $quickResponse;
    final /* synthetic */ rwp0 $searchSessionParams;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroSuggestProvider$loadSuggestsFlow$1(a aVar, rwp0 rwp0Var, List list, RoutePointType routePointType, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$searchSessionParams = rwp0Var;
        this.$quickResponse = list;
        this.$pointType = routePointType;
        this.$clarified = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZeroSuggestProvider$loadSuggestsFlow$1 zeroSuggestProvider$loadSuggestsFlow$1 = new ZeroSuggestProvider$loadSuggestsFlow$1(this.this$0, this.$searchSessionParams, this.$quickResponse, this.$pointType, this.$clarified, continuation);
        zeroSuggestProvider$loadSuggestsFlow$1.L$0 = obj;
        return zeroSuggestProvider$loadSuggestsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZeroSuggestProvider$loadSuggestsFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x014e, code lost:
    
        if (r0.emit(r12, r11) != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fb, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:19:0x0058, B:21:0x0068, B:22:0x00e1, B:23:0x00e4, B:26:0x0071, B:27:0x00ba, B:29:0x00c0, B:32:0x00cd, B:36:0x0075, B:37:0x008c, B:42:0x00a1, B:44:0x00a5, B:50:0x007c), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        a aVar;
        RoutePointType routePointType;
        Throwable th;
        boolean booleanValue;
        int i;
        List list;
        boolean z2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
        } catch (Throwable th2) {
            th = th2;
            List<DestinationSuggest> list2 = this.$quickResponse;
            if (list2 == null) {
                throw th;
            }
            a aVar2 = this.this$0;
            RoutePointType routePointType2 = this.$pointType;
            z = this.$clarified;
            this.L$0 = vprVar;
            this.L$1 = th;
            this.L$2 = aVar2;
            this.L$3 = routePointType2;
            this.L$4 = null;
            this.Z$0 = z;
            this.label = 5;
            if (vprVar.emit(list2, this) != coroutineSingletons) {
                aVar = aVar2;
                routePointType = routePointType2;
            }
        }
        switch (this.label) {
            case 0:
                b.b(obj);
                c cVar = this.this$0.e;
                this.L$0 = vprVar;
                this.label = 1;
                obj = cVar.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                i = this.$searchSessionParams.a != RoutePointType.POINT_B ? 1 : 0;
                if (booleanValue || i == 0 || this.$quickResponse != null) {
                    list = null;
                    if (list == null) {
                        m mVar = this.this$0.b;
                        RoutePointType routePointType3 = this.$pointType;
                        boolean z3 = this.$clarified;
                        boolean z4 = this.$quickResponse == null;
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.Z$0 = booleanValue;
                        this.I$0 = i;
                        this.label = 3;
                        obj = mVar.a(routePointType3, z3, z4, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z2 = booleanValue;
                        list = (List) obj;
                        booleanValue = z2;
                    }
                    ArrayList a = a.a(this.this$0, list);
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.Z$0 = booleanValue;
                    this.I$0 = i;
                    this.label = 4;
                    break;
                } else {
                    e eVar = this.this$0.d;
                    this.L$0 = vprVar;
                    this.Z$0 = booleanValue;
                    this.I$0 = i;
                    this.label = 2;
                    obj = eVar.d(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = (List) obj;
                    if (list == null) {
                    }
                    ArrayList a2 = a.a(this.this$0, list);
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.Z$0 = booleanValue;
                    this.I$0 = i;
                    this.label = 4;
                }
            case 1:
                b.b(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                if (this.$searchSessionParams.a != RoutePointType.POINT_B) {
                }
                if (booleanValue) {
                }
                list = null;
                if (list == null) {
                }
                ArrayList a22 = a.a(this.this$0, list);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.Z$0 = booleanValue;
                this.I$0 = i;
                this.label = 4;
                break;
            case 2:
                i = this.I$0;
                booleanValue = this.Z$0;
                b.b(obj);
                list = (List) obj;
                if (list == null) {
                }
                ArrayList a222 = a.a(this.this$0, list);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.Z$0 = booleanValue;
                this.I$0 = i;
                this.label = 4;
                break;
            case 3:
                i = this.I$0;
                z2 = this.Z$0;
                b.b(obj);
                list = (List) obj;
                booleanValue = z2;
                ArrayList a2222 = a.a(this.this$0, list);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.Z$0 = booleanValue;
                this.I$0 = i;
                this.label = 4;
                break;
            case 4:
                b.b(obj);
                return zy11.a;
            case 5:
                boolean z5 = this.Z$0;
                routePointType = (RoutePointType) this.L$3;
                a aVar3 = (a) this.L$2;
                Throwable th3 = (Throwable) this.L$1;
                b.b(obj);
                th = th3;
                z = z5;
                aVar = aVar3;
                m mVar2 = aVar.b;
                this.L$0 = vprVar;
                this.L$1 = th;
                this.L$2 = aVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 6;
                Serializable a3 = mVar2.a(routePointType, z, true, this);
                if (a3 != coroutineSingletons) {
                    th = th;
                    obj = a3;
                    ArrayList a4 = a.a(aVar, (List) obj);
                    this.L$0 = null;
                    this.L$1 = th;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 7;
                    break;
                }
                return coroutineSingletons;
            case 6:
                aVar = (a) this.L$2;
                th = (Throwable) this.L$1;
                b.b(obj);
                ArrayList a42 = a.a(aVar, (List) obj);
                this.L$0 = null;
                this.L$1 = th;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 7;
                break;
            case 7:
                b.b(obj);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
