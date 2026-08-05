package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ek implements ok {
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ ek(int i) {
        this.NCTxEWno = i;
    }

    @Override // defpackage.ok
    public final Object qoPGr6Ce() {
        Class<?> returnType;
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        switch (i) {
            case 0:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                try {
                    Method method = (Method) fk.wxUZMvaN.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 2:
            case 3:
                return xe0Var;
            case 4:
                return new t50();
            case 5:
                vm vmVar = new vm(0);
                vmVar.qoPGr6Ce(m20.qoPGr6Ce(vt.class), new tKaxLBvG(8));
                return vmVar.NCTxEWno();
            default:
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ ek(hn hnVar, int i) {
        this.NCTxEWno = i;
    }
}
