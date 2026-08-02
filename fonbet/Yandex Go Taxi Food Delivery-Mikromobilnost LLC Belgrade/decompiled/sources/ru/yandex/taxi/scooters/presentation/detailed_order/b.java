package ru.yandex.taxi.scooters.presentation.detailed_order;

import defpackage.epb;
import defpackage.f28;
import defpackage.m950;
import defpackage.ny61;
import defpackage.ogn0;
import defpackage.p1j0;
import defpackage.pm00;
import defpackage.r0o0;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.map_object.k0;

/* loaded from: classes6.dex */
public final class b implements xsd0 {
    public final zuo0 a;
    public final /* synthetic */ e b;

    public b(e eVar, zuo0 zuo0Var) {
        this.b = eVar;
        this.a = zuo0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        if (r11 == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // defpackage.xsd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        ScootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1 scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1;
        Object obj;
        int i;
        if (continuation instanceof ScootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1) {
            scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1 = (ScootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1) continuation;
            int i2 = scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1.label = i2 - Integer.MIN_VALUE;
                ScootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1 scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12 = scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1;
                obj = scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12.label;
                e eVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12.L$0 = wsd0Var;
                    scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12.label = 1;
                    obj = eVar.S(scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    wsd0Var = (wsd0) scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
                f28 f28Var = eVar.U;
                if (f28Var != null) {
                    eVar.U = null;
                    eVar.j(new epb(f28Var));
                }
                Object obj2 = eVar.Q.get();
                eVar.U = (f28) obj2;
                m950 m950Var = (m950) obj2;
                String m = this.a.m();
                pm00 pm00Var = wsd0Var instanceof pm00 ? (pm00) wsd0Var : null;
                r0o0 r0o0Var = new r0o0(m, pm00Var != null ? pm00Var.b : null, wsd0Var.getPosition(), (k0) wsd0Var.getAction());
                ogn0 ogn0Var = new ogn0(eVar, this);
                scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12.L$0 = null;
                scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12.label = 2;
                Object a = com.yandex.go.navigation.base.a.a(eVar, m950Var, r0o0Var, ogn0Var, p1j0.a, scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$12);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1 = new ScootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1(this, (ContinuationImpl) continuation);
        ScootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1 scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$122 = scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$1;
        obj = scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderRouter$ShowNavigationPointActionRouter$launch$122.label;
        e eVar2 = this.b;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
