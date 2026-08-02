package defpackage;

import android.view.View;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class nwb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fvf l;
    public final /* synthetic */ pcu m;
    public final /* synthetic */ aqi n;
    public final /* synthetic */ sdr o;
    public final /* synthetic */ jub p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nwb(fvf fvfVar, pcu pcuVar, aqi aqiVar, sdr sdrVar, jub jubVar, View view, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fvfVar;
        this.m = pcuVar;
        this.n = aqiVar;
        this.o = sdrVar;
        this.p = jubVar;
        this.q = view;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nwb(this.l, this.m, this.n, this.o, this.p, this.q, continuation, 0);
            default:
                return new nwb(this.l, this.m, this.n, this.o, this.p, this.q, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nwb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    final int i2 = 0;
                    final fvf fvfVar = this.l;
                    final pcu pcuVar = this.m;
                    final aqi aqiVar = this.n;
                    final sdr sdrVar = this.o;
                    eno s0 = szf.s0(new Function0() { // from class: lwb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    fvf fvfVar2 = fvfVar;
                                    boolean z = false;
                                    boolean z2 = fvfVar2.h() == 0 && fvfVar2.i() == 0;
                                    boolean z3 = pcuVar.b() == kcu.b;
                                    if (((u7l) aqiVar.getValue()).a && z2 && (z3 || gut.S((f4h) sdrVar.getValue()))) {
                                        z = true;
                                    }
                                    return new Pair(Boolean.valueOf(z2), Boolean.valueOf(z));
                                default:
                                    fvf fvfVar3 = fvfVar;
                                    boolean z4 = false;
                                    boolean z5 = fvfVar3.h() == 0 && fvfVar3.i() == 0;
                                    boolean z6 = pcuVar.b() == kcu.b;
                                    if (((u7l) aqiVar.getValue()).a && z5 && (z6 || gut.S((f4h) sdrVar.getValue()))) {
                                        z4 = true;
                                    }
                                    return new Pair(Boolean.valueOf(z5), Boolean.valueOf(z4));
                            }
                        }
                    });
                    mwb mwbVar = new mwb(this.p, this.q, 0);
                    this.k = 1;
                    if (s0.collect(mwbVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    final int i4 = 1;
                    final fvf fvfVar2 = this.l;
                    final pcu pcuVar2 = this.m;
                    final aqi aqiVar2 = this.n;
                    final sdr sdrVar2 = this.o;
                    eno s02 = szf.s0(new Function0() { // from class: lwb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    fvf fvfVar22 = fvfVar2;
                                    boolean z = false;
                                    boolean z2 = fvfVar22.h() == 0 && fvfVar22.i() == 0;
                                    boolean z3 = pcuVar2.b() == kcu.b;
                                    if (((u7l) aqiVar2.getValue()).a && z2 && (z3 || gut.S((f4h) sdrVar2.getValue()))) {
                                        z = true;
                                    }
                                    return new Pair(Boolean.valueOf(z2), Boolean.valueOf(z));
                                default:
                                    fvf fvfVar3 = fvfVar2;
                                    boolean z4 = false;
                                    boolean z5 = fvfVar3.h() == 0 && fvfVar3.i() == 0;
                                    boolean z6 = pcuVar2.b() == kcu.b;
                                    if (((u7l) aqiVar2.getValue()).a && z5 && (z6 || gut.S((f4h) sdrVar2.getValue()))) {
                                        z4 = true;
                                    }
                                    return new Pair(Boolean.valueOf(z5), Boolean.valueOf(z4));
                            }
                        }
                    });
                    mwb mwbVar2 = new mwb(this.p, this.q, 1);
                    this.k = 1;
                    if (s02.collect(mwbVar2, this) == nm6Var2) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
