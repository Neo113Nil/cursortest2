package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lrjc;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class ukq implements rjc {
    public final /* synthetic */ rjc a;

    public ukq(rjc rjcVar) {
        this.a = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        tkq tkqVar;
        int i;
        if (continuation instanceof tkq) {
            tkqVar = (tkq) continuation;
            int i2 = tkqVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tkqVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = tkqVar.j;
                nm6 nm6Var = nm6.a;
                i = tkqVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    odr odrVar = (odr) obj;
                    if (odrVar instanceof qjn) {
                        throw ((qjn) odrVar).a;
                    }
                    if (odrVar instanceof pdc) {
                        throw ((pdc) odrVar).a;
                    }
                    if (!(odrVar instanceof r97)) {
                        if (odrVar instanceof zht) {
                            xq0.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        b6e.s();
                        return null;
                    }
                    Object obj3 = ((r97) odrVar).a;
                    tkqVar.k = 1;
                    if (this.a.emit(obj3, tkqVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        tkqVar = new tkq(this, continuation);
        Object obj22 = tkqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = tkqVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }
}
