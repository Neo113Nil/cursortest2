package defpackage;

import android.app.ActivityManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.emergency.EmergencyService;

/* loaded from: classes3.dex */
public final class wc5 implements e9r {
    public final /* synthetic */ int a;

    public wc5(z2b z2bVar) {
        this.a = 1;
    }

    public static final void b(wc5 wc5Var, Throwable th) {
        Iterator it = ghp.d(new brg(0), th).iterator();
        while (it.hasNext()) {
            String message = ((Throwable) it.next()).getMessage();
            if (message != null) {
                neg.j(1000, 1000);
                int length = message.length();
                int i = 0;
                ArrayList arrayList = new ArrayList((length / 1000) + (length % 1000 == 0 ? 0 : 1));
                while (i >= 0 && i < length) {
                    int i2 = i + 1000;
                    CharSequence subSequence = message.subSequence(i, (i2 < 0 || i2 > length) ? length : i2);
                    subSequence.getClass();
                    arrayList.add(subSequence.toString());
                    i = i2;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ssg.a(6, "Room", (String) it2.next(), null);
                }
            }
        }
    }

    public static final void c(wc5 wc5Var, Context context, SQLiteException sQLiteException) {
        context.getClass();
        Assertions.throwOrSkip$default(new FailedAssertionException("in production this method would wipe application data", sQLiteException), null, 2, null);
        int i = EmergencyService.b;
        Intent intent = new Intent(context, (Class<?>) EmergencyService.class);
        intent.putExtra("extraFatalException", sQLiteException);
        l18 l18Var = l18.b;
        bdt I = hag.I(le7.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        intent.putExtra("extraKeepFile", (Serializable) null);
        try {
            etn.h0(context, intent);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            Log.e("Emergency", "hard reset due to ForegroundServiceStartNotAllowedException", sQLiteException);
            ActivityManager b = l1b.b(context);
            if (b != null) {
                b.clearApplicationUserData();
            }
        }
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException unused2) {
        }
    }

    @Override // defpackage.e9r
    public final vsr a(anx anxVar) {
        switch (this.a) {
            case 0:
                return anxVar.B(new vc5((ssr) anxVar.c, 0));
            case 1:
                return new a3b(anxVar.B(new b3b(this, anxVar, (ssr) anxVar.c)), this, anxVar);
            case 2:
                return anxVar.B(new vc5(this, (ssr) anxVar.c));
            case 3:
                return anxVar.B(new vc5((ssr) anxVar.c, 2));
            default:
                return new crg(this, anxVar.B((ssr) anxVar.c));
        }
    }

    public /* synthetic */ wc5(int i) {
        this.a = i;
    }
}
