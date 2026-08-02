package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.security.InvalidParameterException;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import ru.yandex.music.R;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class zr6 extends AsyncTask {
    public final yr6 a;
    public final /* synthetic */ rn5 b;

    public zr6(rn5 rn5Var, yr6 yr6Var) {
        this.b = rn5Var;
        this.a = yr6Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        List list;
        rn5 rn5Var = this.b;
        btl btlVar = (btl) rn5Var.b;
        cvl cvlVar = ((cvl[]) objArr)[0];
        btlVar.getClass();
        cvlVar.getClass();
        cvl cvlVar2 = (cvl) x97.D(g.a, new b5l(btlVar, cvlVar, (Continuation) null, 17));
        Context context = (Context) rn5Var.c;
        if (cvlVar2 == null || (list = (List) rn5Var.f) == null || list.isEmpty()) {
            return cvlVar2;
        }
        int size = ((List) rn5Var.f).size();
        if (context == null) {
            throw new InvalidParameterException("Context cannot be null!");
        }
        if (cvlVar2.g + size > 10000) {
            hag.y(context, g3o.c(R.string.cant_add_more_2000_tracks_to_playlist, 10000));
            return cvlVar2;
        }
        hag.y(context, g3o.c(((List) rn5Var.f).size() > 1 ? R.string.tracks_added_to_playlist : R.string.track_added_to_playlist, cvlVar2.b));
        try {
            b46.a.execute(new qf0(22, rn5Var, cvlVar2));
            return cvlVar2;
        } catch (Throwable th) {
            Timber.e(th, "runInBackground - %s", th.getMessage());
            return cvlVar2;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        cvl cvlVar = (cvl) obj;
        neg.A(dyr.e, cvlVar.g().d());
        qxr.a();
        yr6 yr6Var = this.a;
        if (yr6Var != null) {
            yr6Var.d(cvlVar);
        }
    }
}
