package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lblq;", "Lmme;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class blq implements mme<Object> {
    public final /* synthetic */ oqi a;
    public final /* synthetic */ tqn b;
    public final /* synthetic */ xqn c;
    public final /* synthetic */ okq d;

    public blq(oqi oqiVar, tqn tqnVar, xqn xqnVar, okq okqVar) {
        this.a = oqiVar;
        this.b = tqnVar;
        this.c = xqnVar;
        this.d = okqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:27:0x004f, B:28:0x00ab, B:30:0x00b3), top: B:26:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x008f, B:42:0x0093, B:45:0x00d3, B:46:0x00da), top: B:39:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x008f, B:42:0x0093, B:45:0x00d3, B:46:0x00da), top: B:39:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, cg6 cg6Var) {
        alq alqVar;
        int i;
        oqi oqiVar;
        okq okqVar;
        tqn tqnVar;
        xqn xqnVar;
        oqi oqiVar2;
        oqi oqiVar3;
        okq okqVar2;
        Object obj;
        xqn xqnVar2;
        try {
            if (cg6Var instanceof alq) {
                alqVar = (alq) cg6Var;
                int i2 = alqVar.q;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    alqVar.q = i2 - Integer.MIN_VALUE;
                    Object obj2 = alqVar.o;
                    nm6 nm6Var = nm6.a;
                    i = alqVar.q;
                    if (i != 0) {
                        qgg.h0(obj2);
                        alqVar.j = function2;
                        oqiVar = this.a;
                        alqVar.k = oqiVar;
                        tqn tqnVar2 = this.b;
                        alqVar.l = tqnVar2;
                        xqn xqnVar3 = this.c;
                        alqVar.m = xqnVar3;
                        okqVar = this.d;
                        alqVar.n = okqVar;
                        alqVar.q = 1;
                        if (oqiVar.a(alqVar) != nm6Var) {
                            tqnVar = tqnVar2;
                            xqnVar = xqnVar3;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = alqVar.l;
                            xqnVar2 = (xqn) alqVar.k;
                            oqiVar2 = (oqi) alqVar.j;
                            try {
                                qgg.h0(obj2);
                                xqnVar2.a = obj;
                                xqnVar = xqnVar2;
                                Object obj3 = xqnVar.a;
                                oqiVar2.b(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar2.b(null);
                                throw th;
                            }
                        }
                        okqVar2 = (okq) alqVar.l;
                        xqnVar = (xqn) alqVar.k;
                        oqiVar3 = (oqi) alqVar.j;
                        try {
                            qgg.h0(obj2);
                            if (!Intrinsics.d(obj2, xqnVar.a)) {
                                oqiVar2 = oqiVar3;
                                Object obj32 = xqnVar.a;
                                oqiVar2.b(null);
                                return obj32;
                            }
                            alqVar.j = oqiVar3;
                            alqVar.k = xqnVar;
                            alqVar.l = obj2;
                            alqVar.q = 3;
                            if (okqVar2.j(obj2, alqVar) != nm6Var) {
                                obj = obj2;
                                xqnVar2 = xqnVar;
                                oqiVar2 = oqiVar3;
                                xqnVar2.a = obj;
                                xqnVar = xqnVar2;
                                Object obj322 = xqnVar.a;
                                oqiVar2.b(null);
                                return obj322;
                            }
                            return nm6Var;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar2 = oqiVar3;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    okq okqVar3 = alqVar.n;
                    xqnVar = alqVar.m;
                    tqnVar = (tqn) alqVar.l;
                    oqi oqiVar4 = (oqi) alqVar.k;
                    Function2 function22 = (Function2) alqVar.j;
                    qgg.h0(obj2);
                    okqVar = okqVar3;
                    function2 = function22;
                    oqiVar = oqiVar4;
                    if (!tqnVar.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = xqnVar.a;
                    alqVar.j = oqiVar;
                    alqVar.k = xqnVar;
                    alqVar.l = okqVar;
                    alqVar.m = null;
                    alqVar.n = null;
                    alqVar.q = 2;
                    Object invoke = function2.invoke(obj4, alqVar);
                    if (invoke != nm6Var) {
                        oqiVar3 = oqiVar;
                        obj2 = invoke;
                        okqVar2 = okqVar;
                        if (!Intrinsics.d(obj2, xqnVar.a)) {
                        }
                    }
                    return nm6Var;
                }
            }
            if (!tqnVar.a) {
            }
        } catch (Throwable th3) {
            th = th3;
            oqiVar2 = oqiVar;
            oqiVar2.b(null);
            throw th;
        }
        alqVar = new alq(this, cg6Var);
        Object obj22 = alqVar.o;
        nm6 nm6Var2 = nm6.a;
        i = alqVar.q;
        if (i != 0) {
        }
    }
}
