package defpackage;

import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.ContactsDownloadParam;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class s7m {
    public final gui0 a;
    public final to3 b;
    public final k020 c;
    public final x22 d;
    public final String e;
    public lyc f;
    public int g;
    public long h;
    public long i;
    public Long j;
    public String k;
    public xo3 l;
    public final AtomicBoolean m = new AtomicBoolean();

    public s7m(gui0 gui0Var, to3 to3Var, k020 k020Var, x22 x22Var, String str, lyc lycVar) {
        this.a = gui0Var;
        this.b = to3Var;
        this.c = k020Var;
        this.d = x22Var;
        this.e = str;
        this.f = lycVar;
    }

    public final void a(int i, int i2) {
        lyc lycVar;
        z83.b(null, Integer.valueOf(this.g), Integer.valueOf(i));
        boolean z = false;
        if (i == 0 ? i2 == 1 || i2 == 2 : i == 1 && (i2 == 3 || i2 == 2)) {
            z = true;
        }
        z83.h(null, z);
        this.g = i2;
        if ((i2 == 2 || i2 == 3) && (lycVar = this.f) != null) {
            lycVar.invoke();
        }
    }

    public final void b(String str) {
        aqb1.d(this.d, "sync_download_failed", b.i(new Pair("uuid", this.e), new Pair("version", Long.valueOf(this.h)), new Pair(CRLReasonCodeExtension.REASON, str)));
    }

    public final void c() {
        a(0, 1);
        this.h = this.c.f();
        this.j = null;
        this.k = null;
        SystemClock.elapsedRealtime();
        d();
    }

    public final void d() {
        long j = this.h;
        ContactsDownloadParam contactsDownloadParam = new ContactsDownloadParam(j, this.j, this.k, j == 0, 0L, 16, null);
        yzh yzhVar = new yzh(this);
        to3 to3Var = this.b;
        this.l = to3Var.a.a(new io3(3, to3Var, contactsDownloadParam, yzhVar));
    }
}
