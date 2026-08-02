package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class cdd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ odd l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cdd(odd oddVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = oddVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new cdd(this.l, continuation, 0);
            case 1:
                return new cdd(this.l, continuation, 1);
            default:
                return new cdd(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((cdd) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object e = this.l.e(null, true, true, false, false, this);
                    if (e != nm6Var) {
                        e = Unit.a;
                    }
                    if (e == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(30000L, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                odd oddVar = this.l;
                ced cedVar = oddVar.l;
                if (cedVar != null) {
                    cedVar.a(new dhd(2, true));
                }
                rar rarVar = oddVar.h;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(30000L, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                odd oddVar2 = this.l;
                oddVar2.b.a(false, false);
                ked kedVar = oddVar2.c;
                ced cedVar2 = oddVar2.l;
                Continuation continuation = null;
                String deviceId = cedVar2 != null ? cedVar2.b.getDeviceId() : null;
                kedVar.h = true;
                x97.y(kedVar.b, null, null, new d57(kedVar, new zya(9, kedVar, new String[]{deviceId}), continuation, 15), 3);
                break;
        }
        return Unit.a;
    }
}
