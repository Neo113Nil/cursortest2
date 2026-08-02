package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class vs6 {
    public static final os6 a = new os6();
    public static final Set b = xz0.Y(new Integer[]{7, 20});
    public static final int c = 1;

    public static final void a(CancellationSignal cancellationSignal, Function0 function0) {
        function0.getClass();
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (it6.a(cancellationSignal)) {
            return;
        }
        function0.invoke();
    }

    public static void b(ResultReceiver resultReceiver, Intent intent, String str) {
        resultReceiver.getClass();
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", c);
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(SQLiteDatabase.OPEN_FULLMUTEX);
    }

    public static boolean c(Bundle bundle, Function2 function2, Executor executor, ls6 ls6Var, CancellationSignal cancellationSignal) {
        bundle.getClass();
        executor.getClass();
        ls6Var.getClass();
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        a(cancellationSignal, new t03(6, executor, ls6Var, function2.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"))));
        return true;
    }
}
