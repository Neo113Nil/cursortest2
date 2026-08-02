package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ell implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ na0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ sdr d;

    public /* synthetic */ ell(na0 na0Var, Function0 function0, sdr sdrVar, int i) {
        this.a = i;
        this.b = na0Var;
        this.c = function0;
        this.d = sdrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(lf3 lf3Var, Continuation continuation) {
        dll dllVar;
        int i;
        aml amlVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof dll) {
                    dllVar = (dll) continuation;
                    int i3 = dllVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dllVar.l = i3 - Integer.MIN_VALUE;
                        Object obj = dllVar.j;
                        nm6 nm6Var = nm6.a;
                        i = dllVar.l;
                        if (i != 0) {
                            qgg.h0(obj);
                            if (((Boolean) this.d.getValue()).booleanValue() && lf3Var == lf3.b) {
                                ja0 ja0Var = this.b.e;
                                lf3 lf3Var2 = lf3.a;
                                dllVar.l = 1;
                                if (a.i(ja0Var, lf3Var2, dllVar) == nm6Var) {
                                }
                            }
                            break;
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj);
                        }
                        this.c.invoke();
                    }
                }
                dllVar = new dll(this, continuation);
                Object obj2 = dllVar.j;
                nm6 nm6Var2 = nm6.a;
                i = dllVar.l;
                if (i != 0) {
                }
                this.c.invoke();
                break;
            default:
                if (continuation instanceof aml) {
                    amlVar = (aml) continuation;
                    int i4 = amlVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        amlVar.l = i4 - Integer.MIN_VALUE;
                        Object obj3 = amlVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = amlVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            if (((Boolean) this.d.getValue()).booleanValue() && lf3Var == lf3.b) {
                                ja0 ja0Var2 = this.b.e;
                                lf3 lf3Var3 = lf3.a;
                                amlVar.l = 1;
                                if (a.i(ja0Var2, lf3Var3, amlVar) == nm6Var3) {
                                }
                            }
                            break;
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        this.c.invoke();
                    }
                }
                amlVar = new aml(this, continuation);
                Object obj32 = amlVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = amlVar.l;
                if (i2 != 0) {
                }
                this.c.invoke();
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
        }
        return b((lf3) obj, continuation);
    }
}
