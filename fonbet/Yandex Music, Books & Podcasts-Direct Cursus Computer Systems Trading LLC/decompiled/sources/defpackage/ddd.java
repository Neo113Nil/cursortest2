package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ddd extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ odd l;
    public final /* synthetic */ ced m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddd(odd oddVar, ced cedVar, boolean z, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.l = oddVar;
        this.m = cedVar;
        this.n = z;
        this.o = z2;
        this.p = z3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ddd dddVar = new ddd(this.l, this.m, this.n, this.o, this.p, continuation);
        dddVar.k = obj;
        return dddVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ddd) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        boolean z = true;
        if (i == 0) {
            qgg.h0(obj);
            odd oddVar = this.l;
            ced cedVar = oddVar.l;
            ced cedVar2 = this.m;
            boolean d = Intrinsics.d(cedVar, cedVar2);
            boolean z2 = str == null || str.equals(cedVar2.b.getDeviceId());
            Continuation continuation = null;
            if (d && z2) {
                this.k = null;
                this.j = 1;
                if (oddVar.e(null, false, this.n, this.o, this.p, this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                ked kedVar = oddVar.c;
                String deviceId = cedVar2.b.getDeviceId();
                deviceId.getClass();
                x97.y(kedVar.b, null, null, new d57(kedVar, new zya(10, kedVar, deviceId), continuation, 15), 3);
                z = false;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Boolean.valueOf(z);
    }
}
