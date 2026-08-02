package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.yandex.pulse.MeasurementBroadcasterImpl;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final /* synthetic */ class e02 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e02(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [dra, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ump umpVar;
        switch (this.a) {
            case 0:
                ((jzi) ((g02) this.c).b).u(new IllegalArgumentException(hrg.p("messenger's backend error, code = ", this.b, ", body = ", (String) this.d)));
                return;
            case 1:
                fn5 fn5Var = (fn5) this.c;
                Object obj = ((th) this.d).a;
                String str = (String) fn5Var.a.get(Integer.valueOf(this.b));
                if (str == null) {
                    return;
                }
                ci ciVar = (ci) fn5Var.e.get(str);
                if ((ciVar != null ? ciVar.a : null) == null) {
                    fn5Var.g.remove(str);
                    fn5Var.f.put(str, obj);
                    return;
                }
                rh rhVar = ciVar.a;
                rhVar.getClass();
                if (fn5Var.d.remove(str)) {
                    rhVar.a(obj);
                    return;
                }
                return;
            case 2:
                ((fn5) this.c).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 3:
                ((wtm) ((d18) this.c).c).g(this.b, this.d);
                return;
            case 4:
                cra craVar = (cra) this.c;
                this.d.g(craVar.a, craVar.b, this.b);
                return;
            case 5:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                ycg ycgVar = (ycg) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    adg adgVar = (adg) it.next();
                    if (!adgVar.d) {
                        int i = this.b;
                        if (i != -1) {
                            adgVar.b.i(i);
                        }
                        adgVar.c = true;
                        ycgVar.invoke(adgVar.a);
                    }
                }
                return;
            case 6:
                MeasurementBroadcasterImpl.m16reportThreadCount$lambda3((MeasurementBroadcasterImpl) this.c, (String) this.d, this.b);
                return;
            case 7:
                ulh ulhVar = (ulh) this.c;
                lcg lcgVar = (lcg) this.d;
                int i2 = this.b;
                try {
                    umpVar = (ump) lcgVar.get();
                    vq1.y(umpVar, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    vq1.o0("MCImplBase", "Session operation failed", e);
                    umpVar = new ump(-1);
                } catch (CancellationException e2) {
                    vq1.o0("MCImplBase", "Session operation cancelled", e2);
                    umpVar = new ump(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    vq1.o0("MCImplBase", "Session operation failed", e);
                    umpVar = new ump(-1);
                }
                c9e c9eVar = ulhVar.C;
                if (c9eVar == null) {
                    return;
                }
                try {
                    c9eVar.U(ulhVar.c, i2, umpVar.b());
                    return;
                } catch (RemoteException unused) {
                    vq1.n0("MCImplBase", "Error in sending");
                    return;
                }
            case 8:
                kwh kwhVar = (kwh) this.c;
                Pair pair = (Pair) this.d;
                ((uj7) kwhVar.b.i).g(((Integer) pair.first).intValue(), (uvh) pair.second, this.b);
                return;
            case 9:
                vrj vrjVar = (vrj) this.c;
                int i3 = this.b;
                Parcel parcel = (Parcel) this.d;
                Logger logger = xrj.b;
                try {
                    try {
                        if (vrjVar.a.transact(i3, parcel, null, 1)) {
                            return;
                        }
                        logger.log(Level.FINEST, "A oneway transaction was not understood - ignoring");
                        return;
                    } finally {
                        parcel.recycle();
                    }
                } catch (Exception e4) {
                    logger.log(Level.FINEST, "A oneway transaction threw - ignoring", (Throwable) e4);
                    return;
                }
            default:
                ((n1n) this.d).invoke(y5g.n0((Context) this.c, this.b, 0));
                return;
        }
    }

    public /* synthetic */ e02(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
