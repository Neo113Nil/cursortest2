package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class nqw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nqw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((xdr) ((bqi) ((oqw) this.b).d.getValue())).l((iqw) obj);
                break;
            case 1:
                qsw qswVar = (qsw) this.b;
                rxk rxkVar = psw.b;
                SharedPreferences sharedPreferences = (SharedPreferences) qswVar.e.getValue();
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("actor", "user");
                edit.apply();
                break;
            default:
                rvh rvhVar = ((etw) this.b).b.a;
                rvhVar.c = (ltw) obj;
                rvhVar.a();
                break;
        }
        return Unit.a;
    }
}
