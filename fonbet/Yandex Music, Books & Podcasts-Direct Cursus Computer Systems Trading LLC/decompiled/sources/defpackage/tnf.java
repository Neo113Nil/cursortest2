package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class tnf extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnf(Function0 function0, Function0 function02, boolean z, Function0 function03, Continuation continuation) {
        super(2, continuation);
        this.j = 4;
        this.l = function0;
        this.m = function02;
        this.k = z;
        this.n = function03;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new tnf(0, (ewq) this.l, (zsq) this.m, (hwq) this.n, continuation, this.k);
            case 1:
                return new tnf(1, (Function1) this.l, (o3k) this.m, (aqi) this.n, continuation, this.k);
            case 2:
                tnf tnfVar = new tnf((aqi) this.l, (aqi) this.m, (aqi) this.n, continuation, 2);
                tnfVar.k = ((Boolean) obj).booleanValue();
                return tnfVar;
            case 3:
                return new tnf(3, (jlf) this.l, (aqi) this.m, (aqi) this.n, continuation, this.k);
            case 4:
                return new tnf((Function0) this.l, (Function0) this.m, this.k, (Function0) this.n, continuation);
            default:
                tnf tnfVar2 = new tnf((paw) this.l, (hgl) this.m, (rdk) this.n, continuation, 5);
                tnfVar2.k = ((Boolean) obj).booleanValue();
                return tnfVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((tnf) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((tnf) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((tnf) create(bool, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((tnf) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((tnf) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((tnf) create(bool2, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        Object obj3 = this.l;
        Object obj4 = this.m;
        switch (i) {
            case 0:
                zsq zsqVar = (zsq) obj4;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (this.k) {
                    ((ewq) obj3).a(zsqVar);
                    ((hwq) obj2).a(zsqVar);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (this.k && ((Boolean) ((aqi) obj2).getValue()).booleanValue()) {
                    ((Function1) obj3).invoke(new Integer(((o3k) obj4).j()));
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                boolean z = this.k;
                float f = uvr.a;
                if (((Boolean) ((aqi) obj3).getValue()).booleanValue() != z) {
                    Function1 function1 = (Function1) ((aqi) obj4).getValue();
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(z));
                    }
                    ((aqi) obj2).setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                boolean z2 = this.k;
                ((aqi) obj4).setValue(Boolean.valueOf(z2));
                if (z2) {
                    ((aqi) obj2).setValue((jlf) obj3);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ((Function0) obj3).invoke();
                ((Function0) obj4).invoke();
                if (this.k) {
                    ((Function0) obj2).invoke();
                }
                break;
            default:
                hgl hglVar = (hgl) obj4;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                if (this.k) {
                    ((paw) obj3).F(hglVar);
                    ((CopyOnWriteArraySet) ((rdk) obj2).e).remove(hglVar);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnf(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnf(int i, Object obj, Object obj2, Object obj3, Continuation continuation, boolean z) {
        super(2, continuation);
        this.j = i;
        this.k = z;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }
}
