package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class r9 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ vpr b;

    public /* synthetic */ r9(vpr vprVar, int i) {
        this.a = i;
        this.b = vprVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object emit;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vpr vprVar = this.b;
        switch (i) {
            case 0:
                Object emit2 = vprVar.emit(obj, continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : zy11Var;
            case 1:
                Object emit3 = vprVar.emit(Boolean.valueOf(!((Boolean) obj).booleanValue()), continuation);
                return emit3 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit3 : zy11Var;
            case 2:
                return vprVar.emit((vta) obj, continuation);
            case 3:
                Object emit4 = vprVar.emit(Boolean.valueOf(((Number) obj).intValue() == 9), continuation);
                return emit4 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit4 : zy11Var;
            case 4:
                return (((Boolean) obj).booleanValue() && (emit = vprVar.emit(null, continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? emit : zy11Var;
            case 5:
                return vprVar.emit((m3j) obj, continuation);
            default:
                return vprVar.emit((k7z) obj, continuation);
        }
    }
}
