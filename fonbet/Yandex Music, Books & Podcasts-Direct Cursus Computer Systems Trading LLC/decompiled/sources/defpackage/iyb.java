package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class iyb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mmo b;

    public /* synthetic */ iyb(mmo mmoVar, int i) {
        this.a = i;
        this.b = mmoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 14;
        Continuation continuation = null;
        cmd cmdVar = cmd.a;
        mmo mmoVar = this.b;
        switch (i) {
            case 0:
                msa msaVar = nsa.b;
                x97.y(cmdVar, (a) mmoVar.c, null, new f84(yd5.M(3, ssa.HOURS), new iyb(mmoVar, 1), (Continuation) null), 2);
                return Unit.a;
            case 1:
                rhp rhpVar = (rhp) mmoVar.g;
                rar y = x97.y(cmdVar, (a) mmoVar.c, null, new g68(mmoVar, continuation, i2), 2);
                rhpVar.getClass();
                rhpVar.c(y);
                return Unit.a;
            case 2:
                jyr jyrVar = (jyr) mmoVar.f;
                x3n x3nVar = ((byb) jyrVar.getValue()).l;
                ReentrantLock reentrantLock = (ReentrantLock) x3nVar.a;
                reentrantLock.lock();
                try {
                    HashMap hashMap = (HashMap) x3nVar.b;
                    reentrantLock.unlock();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(hashMap.size()));
                    for (Map.Entry entry : hashMap.entrySet()) {
                        linkedHashMap.put(entry.getKey(), byb.g((byb) jyrVar.getValue(), ((gxb) entry.getValue()).c));
                    }
                    return linkedHashMap;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                rhp rhpVar2 = (rhp) mmoVar.g;
                rar y2 = x97.y(cmdVar, (a) mmoVar.c, null, new g68(mmoVar, continuation, i2), 2);
                rhpVar2.getClass();
                rhpVar2.c(y2);
                return Unit.a;
        }
    }
}
