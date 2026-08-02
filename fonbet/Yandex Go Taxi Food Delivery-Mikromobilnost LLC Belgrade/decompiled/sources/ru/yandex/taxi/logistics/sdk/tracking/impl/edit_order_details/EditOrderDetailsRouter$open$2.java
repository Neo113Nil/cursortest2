package ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details;

import defpackage.cc7;
import defpackage.e0l0;
import defpackage.enn;
import defpackage.f4l0;
import defpackage.jl40;
import defpackage.lkb0;
import defpackage.m6i;
import defpackage.mkb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv0;
import defpackage.s6i;
import defpackage.s9e;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.vu70;
import defpackage.wu70;
import defpackage.z77;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.EditOrderDetailsRouter$open$2", f = "EditOrderDetailsRouter.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EditOrderDetailsRouter$open$2 extends SuspendLambda implements tls {
    final /* synthetic */ e0l0 $routeBeforeEditing;
    final /* synthetic */ f4l0 $routeInfoProvider;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ enn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderDetailsRouter$open$2(enn ennVar, f4l0 f4l0Var, e0l0 e0l0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ennVar;
        this.$routeInfoProvider = f4l0Var;
        this.$routeBeforeEditing = e0l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new EditOrderDetailsRouter$open$2(this.this$0, this.$routeInfoProvider, this.$routeBeforeEditing, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((EditOrderDetailsRouter$open$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var;
        String str;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var2 = zy11.a;
        Throwable th = null;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var2;
        }
        kotlin.b.b(obj);
        this.this$0.c.x("DeliveryDetailsCard.SaveButton.Tapped", null);
        Map map = (Map) this.this$0.f.a.getValue();
        if (map.isEmpty()) {
            map = null;
        }
        e0l0 route = this.$routeInfoProvider.getRoute();
        String uuid = UUID.randomUUID().toString();
        if (jl40.l(this.$routeBeforeEditing, route)) {
            Map map2 = map;
            zy11Var = zy11Var2;
            if (map2 != null) {
                enn ennVar = this.this$0;
                ennVar.b.a(new s6i(ennVar.a.a, new wu70(EmptyList.a)), uuid, map2);
            }
        } else {
            enn ennVar2 = this.this$0;
            ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar = ennVar2.b;
            String str2 = ennVar2.a.a;
            List list = route.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            int i2 = 0;
            for (Object obj3 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    Throwable th2 = th;
                    scc.m();
                    throw th2;
                }
                qv0 qv0Var = (qv0) obj3;
                String str3 = qv0Var.i;
                if (str3 == null) {
                    str3 = String.valueOf(i2);
                }
                String str4 = str3;
                String str5 = qv0Var.b;
                String str6 = qv0Var.d;
                String str7 = qv0Var.c;
                String str8 = qv0Var.f;
                Throwable th3 = th;
                String str9 = qv0Var.e;
                Map map3 = map;
                s9e s9eVar = qv0Var.g;
                List<mkb0> list2 = qv0Var.h;
                ArrayList arrayList2 = new ArrayList();
                for (mkb0 mkb0Var : list2) {
                    zy11 zy11Var3 = zy11Var2;
                    String str10 = str8;
                    if (mkb0Var instanceof lkb0) {
                        lkb0 lkb0Var = (lkb0) mkb0Var;
                        str = str9;
                        obj2 = new m6i(lkb0Var.a(), lkb0Var.b());
                    } else {
                        str = str9;
                        obj2 = th3;
                    }
                    if (obj2 != null) {
                        arrayList2.add(obj2);
                    }
                    str8 = str10;
                    str9 = str;
                    zy11Var2 = zy11Var3;
                }
                arrayList.add(new z77(str4, str5, str6, str7, str8, str9, s9eVar, arrayList2));
                map = map3;
                i2 = i3;
                th = th3;
                zy11Var2 = zy11Var2;
            }
            zy11Var = zy11Var2;
            Throwable th4 = th;
            bVar.a(new s6i(str2, new vu70(arrayList)), uuid, map);
            enn ennVar3 = this.this$0;
            this.L$0 = th4;
            this.L$1 = th4;
            this.L$2 = th4;
            this.label = 1;
            Object y = e.y(new cc7(ennVar3.b.e, uuid, 6), this);
            if (y != CoroutineSingletons.COROUTINE_SUSPENDED) {
                y = zy11Var;
            }
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
