package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.widget.EditText;
import androidx.core.app.q;
import com.yandex.passport.internal.ui.base.m;
import com.yandex.passport.internal.ui.domik.base.a;
import com.yandex.passport.internal.ui.domik.f;
import com.yandex.passport.internal.ui.l;
import com.yandex.passport.internal.util.d;
import com.yandex.passport.internal.util.i;
import com.yandex.passport.legacy.lx.e;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import ru.yandex.music.R;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class xr6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xr6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                rn5 rn5Var = (rn5) obj2;
                yr6 yr6Var = (yr6) obj;
                String trim = ((EditText) rn5Var.d).getText().toString().trim();
                if (!y7g.G(trim)) {
                    cvl cvlVar = new cvl("FAKE_ID_" + System.currentTimeMillis() + UUID.randomUUID(), trim, v3g.E((frt) rn5Var.g).a, 0, -1, true, 0, -1, -1, -1L, -1L, wxr.b, -1L, null, null, null, null, "private", 0, null, null, null, false, null, false, null, null);
                    zr6 zr6Var = new zr6(rn5Var, yr6Var);
                    cvl[] cvlVarArr = {cvlVar};
                    ExecutorService executorService = b46.a;
                    try {
                        zr6Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, cvlVarArr);
                    } catch (Throwable th) {
                        Timber.e(th, "execute - %s", th.getMessage());
                    }
                    p30 p30Var = (p30) rn5Var.e;
                    if (p30Var != null) {
                        p30Var.dismiss();
                        rn5Var.e = null;
                        break;
                    }
                } else {
                    hag.x((Context) rn5Var.c, R.string.need_to_set_playlist_name, 0);
                    break;
                }
                break;
            case 1:
                f fVar = ((a) obj2).p;
                fVar.D = (com.yandex.passport.internal.ui.f) obj;
                fVar.q.m(new m(null, "pop_back", false, 1));
                break;
            default:
                i iVar = (i) obj2;
                d dVar = iVar.a;
                Objects.requireNonNull(dVar);
                iVar.b = new e(new com.yandex.passport.legacy.lx.i(new tn3(13, dVar))).h(new l(7, iVar, (Context) obj), new q(19));
                break;
        }
    }
}
