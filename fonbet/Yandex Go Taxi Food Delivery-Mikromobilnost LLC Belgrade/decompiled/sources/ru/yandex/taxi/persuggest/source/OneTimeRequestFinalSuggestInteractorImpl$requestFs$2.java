package ru.yandex.taxi.persuggest.source;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o270;
import defpackage.o9j0;
import defpackage.q0t;
import defpackage.q6r;
import defpackage.tse;
import defpackage.udq0;
import defpackage.v03;
import defpackage.wls;
import defpackage.xv21;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.LocationProvider;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lu6r;", "<anonymous>", "(Ltse;)Lu6r;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.OneTimeRequestFinalSuggestInteractorImpl$requestFs$2", f = "OneTimeRequestFinalSuggestInteractorImpl.kt", l = {33, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OneTimeRequestFinalSuggestInteractorImpl$requestFs$2 extends SuspendLambda implements wls {
    final /* synthetic */ Action $action;
    final /* synthetic */ o9j0 $requestedPointInfo;
    final /* synthetic */ Float $zoom;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ o270 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeRequestFinalSuggestInteractorImpl$requestFs$2(o270 o270Var, o9j0 o9j0Var, Float f, Action action, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o270Var;
        this.$requestedPointInfo = o9j0Var;
        this.$zoom = f;
        this.$action = action;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OneTimeRequestFinalSuggestInteractorImpl$requestFs$2(this.this$0, this.$requestedPointInfo, this.$zoom, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OneTimeRequestFinalSuggestInteractorImpl$requestFs$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r0 == r11) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        boolean z;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o270 o270Var = this.this$0;
            a aVar = o270Var.e;
            String str3 = this.$requestedPointInfo.h;
            Float f = this.$zoom;
            Action action = this.$action;
            LinkedHashMap a = o270Var.f.a();
            f fVar = (f) this.this$0.g;
            if (fVar.b) {
                fVar.b = false;
                str = FinalSuggestScreen.DEEPLINK.getValue();
            } else {
                str = fVar.a;
            }
            o9j0 o9j0Var = this.$requestedPointInfo;
            String str4 = str;
            List list = o9j0Var.k;
            if (o9j0Var.a == RoutePointType.POINT_A) {
                str2 = str3;
                z = true;
            } else {
                str2 = str3;
                z = false;
            }
            this.label = 1;
            b = a.b(aVar, str2, f, action, a, str4, list, null, z, this, 64);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        v03 v03Var = (v03) b;
        Action action2 = this.$action;
        zzs zzsVar = this.$requestedPointInfo.b;
        Long l = zzsVar.e;
        String a2 = l != null ? xv21.a(new Date(l.longValue())) : null;
        String str5 = this.$requestedPointInfo.b.d;
        LocationProvider G = str5 != null ? udq0.G(str5) : null;
        o9j0 o9j0Var2 = this.$requestedPointInfo;
        PositionInitAction positionInitAction = o9j0Var2.j;
        String str6 = o9j0Var2.c;
        String str7 = (String) this.this$0.c.a.get(o9j0Var2.a.getType());
        o9j0 o9j0Var3 = this.$requestedPointInfo;
        boolean z2 = o9j0Var3.d;
        String type = o9j0Var3.a.getType();
        o9j0 o9j0Var4 = this.$requestedPointInfo;
        q6r q6rVar = new q6r(action2, zzsVar, a2, G, positionInitAction, v03Var, str6, str7, z2, type, o9j0Var4.f, o9j0Var4.e, null);
        o270 o270Var2 = this.this$0;
        ru.yandex.taxi.persuggest.api.a aVar2 = o270Var2.a;
        String a3 = o270Var2.b.a();
        q0t q0tVar = new q0t(0);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object c = aVar2.c(a3, q6rVar, q0tVar, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
