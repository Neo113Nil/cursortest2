package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class o0b implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ List c;

    public /* synthetic */ o0b(rjc rjcVar, List list, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        n0b n0bVar;
        int i;
        ole oleVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof n0b) {
                    n0bVar = (n0b) continuation;
                    int i3 = n0bVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        n0bVar.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = n0bVar.j;
                        nm6 nm6Var = nm6.a;
                        i = n0bVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            List e0 = CollectionsKt.e0((List) obj, CollectionsKt.A0(this.c));
                            n0bVar.k = 1;
                            if (this.b.emit(e0, n0bVar) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                n0bVar = new n0b(this, continuation);
                Object obj22 = n0bVar.j;
                nm6 nm6Var2 = nm6.a;
                i = n0bVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof ole) {
                    oleVar = (ole) continuation;
                    int i4 = oleVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        oleVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = oleVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = oleVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            oleVar.k = 1;
                            if (this.b.emit(this.c, oleVar) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                oleVar = new ole(this, continuation);
                Object obj32 = oleVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = oleVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
