package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class rcw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ ldw c;

    public /* synthetic */ rcw(rjc rjcVar, ldw ldwVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = ldwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        qcw qcwVar;
        int i;
        tcw tcwVar;
        int i2;
        ucw ucwVar;
        int i3;
        vcw vcwVar;
        int i4;
        wcw wcwVar;
        int i5;
        switch (this.a) {
            case 0:
                if (continuation instanceof qcw) {
                    qcwVar = (qcw) continuation;
                    int i6 = qcwVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        qcwVar.k = i6 - Integer.MIN_VALUE;
                        Object obj2 = qcwVar.j;
                        nm6 nm6Var = nm6.a;
                        i = qcwVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            if (!ldw.a(this.c)) {
                                qcwVar.k = 1;
                                if (this.b.emit(obj, qcwVar) == nm6Var) {
                                }
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
                qcwVar = new qcw(this, continuation);
                Object obj22 = qcwVar.j;
                nm6 nm6Var2 = nm6.a;
                i = qcwVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof tcw) {
                    tcwVar = (tcw) continuation;
                    int i7 = tcwVar.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        tcwVar.k = i7 - Integer.MIN_VALUE;
                        Object obj3 = tcwVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = tcwVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            if (!ldw.a(this.c)) {
                                tcwVar.k = 1;
                                if (this.b.emit(obj, tcwVar) == nm6Var3) {
                                }
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
                tcwVar = new tcw(this, continuation);
                Object obj32 = tcwVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = tcwVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof ucw) {
                    ucwVar = (ucw) continuation;
                    int i8 = ucwVar.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ucwVar.k = i8 - Integer.MIN_VALUE;
                        Object obj4 = ucwVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = ucwVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            if (!ldw.a(this.c)) {
                                ucwVar.k = 1;
                                if (this.b.emit(obj, ucwVar) == nm6Var4) {
                                }
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                ucwVar = new ucw(this, continuation);
                Object obj42 = ucwVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = ucwVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof vcw) {
                    vcwVar = (vcw) continuation;
                    int i9 = vcwVar.k;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vcwVar.k = i9 - Integer.MIN_VALUE;
                        Object obj5 = vcwVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = vcwVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            if (!ldw.a(this.c)) {
                                vcwVar.k = 1;
                                if (this.b.emit(obj, vcwVar) == nm6Var5) {
                                }
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                        }
                        break;
                    }
                }
                vcwVar = new vcw(this, continuation);
                Object obj52 = vcwVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = vcwVar.k;
                if (i4 != 0) {
                }
                break;
            default:
                if (continuation instanceof wcw) {
                    wcwVar = (wcw) continuation;
                    int i10 = wcwVar.k;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        wcwVar.k = i10 - Integer.MIN_VALUE;
                        Object obj6 = wcwVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = wcwVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            if (!ldw.a(this.c)) {
                                wcwVar.k = 1;
                                if (this.b.emit(obj, wcwVar) == nm6Var6) {
                                }
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                        }
                        break;
                    }
                }
                wcwVar = new wcw(this, continuation);
                Object obj62 = wcwVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = wcwVar.k;
                if (i5 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
