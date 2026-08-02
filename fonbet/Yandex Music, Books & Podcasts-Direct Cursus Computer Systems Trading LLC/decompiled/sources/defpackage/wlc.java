package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class wlc implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ xqn c;

    public /* synthetic */ wlc(Function2 function2, xqn xqnVar, int i) {
        this.a = i;
        this.b = function2;
        this.c = xqnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        vlc vlcVar;
        Object obj2;
        int i;
        wlc wlcVar;
        zlc zlcVar;
        Object obj3;
        int i2;
        wlc wlcVar2;
        switch (this.a) {
            case 0:
                if (continuation instanceof vlc) {
                    vlcVar = (vlc) continuation;
                    int i3 = vlcVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vlcVar.l = i3 - Integer.MIN_VALUE;
                        obj2 = vlcVar.k;
                        nm6 nm6Var = nm6.a;
                        i = vlcVar.l;
                        if (i != 0) {
                            qgg.h0(obj2);
                            vlcVar.j = this;
                            vlcVar.n = obj;
                            vlcVar.l = 1;
                            obj2 = this.b.invoke(obj, vlcVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            wlcVar = this;
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = vlcVar.n;
                            wlcVar = vlcVar.j;
                            qgg.h0(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return Unit.a;
                        }
                        wlcVar.c.a = obj;
                        throw new p2(wlcVar);
                    }
                }
                vlcVar = new vlc(this, continuation);
                obj2 = vlcVar.k;
                nm6 nm6Var2 = nm6.a;
                i = vlcVar.l;
                if (i != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                if (continuation instanceof zlc) {
                    zlcVar = (zlc) continuation;
                    int i4 = zlcVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        zlcVar.l = i4 - Integer.MIN_VALUE;
                        obj3 = zlcVar.k;
                        nm6 nm6Var3 = nm6.a;
                        i2 = zlcVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            zlcVar.j = this;
                            zlcVar.n = obj;
                            zlcVar.l = 1;
                            obj3 = this.b.invoke(obj, zlcVar);
                            if (obj3 == nm6Var3) {
                                return nm6Var3;
                            }
                            wlcVar2 = this;
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = zlcVar.n;
                            wlcVar2 = zlcVar.j;
                            qgg.h0(obj3);
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return Unit.a;
                        }
                        wlcVar2.c.a = obj;
                        throw new p2(wlcVar2);
                    }
                }
                zlcVar = new zlc(this, continuation);
                obj3 = zlcVar.k;
                nm6 nm6Var32 = nm6.a;
                i2 = zlcVar.l;
                if (i2 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
        }
    }
}
