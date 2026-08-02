package defpackage;

import android.net.Uri;
import com.yandex.music.video.NoConnectionDataSourceException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v66 implements db7 {
    public final db7 a;
    public final z66 b;
    public nb7 c;

    public v66(db7 db7Var, z66 z66Var) {
        db7Var.getClass();
        this.a = db7Var;
        this.b = z66Var;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        this.c = nb7Var;
        z66 z66Var = this.b;
        if (z66Var.g()) {
            return this.a.a(nb7Var);
        }
        throw new lgg(new NoConnectionDataSourceException("No internet connection " + z66Var.a(), nb7Var, 2000, 1));
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
        z66 z66Var = this.b;
        if (z66Var.g()) {
            return this.a.read(bArr, i, i2);
        }
        String str = "No internet connection " + z66Var.a();
        nb7 nb7Var = this.c;
        if (nb7Var != null) {
            throw new lgg(new NoConnectionDataSourceException(str, nb7Var, 2000, 2));
        }
        Intrinsics.j("dataSpec");
        throw null;
    }
}
