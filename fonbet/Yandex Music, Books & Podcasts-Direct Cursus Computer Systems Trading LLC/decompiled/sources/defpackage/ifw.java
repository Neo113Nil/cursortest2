package defpackage;

import android.content.SharedPreferences;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ifw {
    public final /* synthetic */ qfw a;

    public ifw(qfw qfwVar) {
        this.a = qfwVar;
    }

    public final void a(u7g u7gVar) {
        qfw qfwVar = this.a;
        um6 um6Var = qfwVar.d;
        Continuation continuation = null;
        if (u7gVar.equals(aer.c)) {
            ssg.a(4, qfw.H, "restoreLocallySavedQueue on ConnectError", null);
            x97.y(um6Var, null, null, new hfw(0, qfwVar, continuation), 3);
            return;
        }
        if (u7gVar.equals(ber.c)) {
            ssg.a(4, qfw.H, "restoreLocallySavedQueue on Failure", null);
            x97.y(um6Var, null, null, new hfw(1, qfwVar, continuation), 3);
            qfwVar.E.l(null);
            ((ysw) qfwVar.z.getValue()).d((sqw) qfwVar.F.getValue());
            return;
        }
        if (u7gVar instanceof cer) {
            b(((cer) u7gVar).c, true);
        } else if (u7gVar instanceof der) {
            b(((der) u7gVar).c, false);
        } else {
            b6e.s();
        }
    }

    public final void b(orw orwVar, boolean z) {
        qfw qfwVar = this.a;
        qsw qswVar = (qsw) qfwVar.j.getValue();
        long p = orwVar.a.p();
        SharedPreferences sharedPreferences = (SharedPreferences) qswVar.e.getValue();
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("timestamp", p);
        edit.apply();
        rxk rxkVar = psw.b;
        SharedPreferences sharedPreferences2 = (SharedPreferences) qswVar.e.getValue();
        sharedPreferences2.getClass();
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.putString("actor", "ynison");
        edit2.apply();
        xdr xdrVar = qfwVar.E;
        xdrVar.getClass();
        xdrVar.m(null, orwVar);
        v3w.n(z, qfwVar.D, null);
    }
}
