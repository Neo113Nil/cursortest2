package defpackage;

import android.net.Uri;
import com.yandex.music.shared.player.download2.exo.ConnectivityCheckHttpDataSource$NetworkNotAllowedException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b76 implements k6e {
    public final k6e a;
    public final z66 b;
    public nb7 c;

    public b76(k6e k6eVar, z66 z66Var) {
        k6eVar.getClass();
        z66Var.getClass();
        this.a = k6eVar;
        this.b = z66Var;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        this.c = nb7Var;
        if (this.b.h()) {
            throw new ConnectivityCheckHttpDataSource$NetworkNotAllowedException(nb7Var, 1);
        }
        return this.a.a(nb7Var);
    }

    @Override // defpackage.k6e, defpackage.db7
    public final Map b() {
        Map b = this.a.b();
        b.getClass();
        return b;
    }

    @Override // defpackage.db7
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.a.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.b.h()) {
            return this.a.read(bArr, i, i2);
        }
        nb7 nb7Var = this.c;
        if (nb7Var != null) {
            throw new ConnectivityCheckHttpDataSource$NetworkNotAllowedException(nb7Var, 2);
        }
        Intrinsics.j("dataSpec");
        throw null;
    }
}
