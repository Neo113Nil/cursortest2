package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class il5 implements db7 {
    public final liq a;
    public final db7 b;
    public FileInputStream c;
    public Uri d;
    public int e;
    public int f;
    public String g;

    public il5(liq liqVar, db7 db7Var) {
        db7Var.getClass();
        this.a = liqVar;
        this.b = db7Var;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        Uri uri = nb7Var.a;
        if (Intrinsics.d(uri.getHost(), "ott-clear-key.ott.yandex.net")) {
            uri.getClass();
            String uri2 = uri.buildUpon().clearQuery().build().toString();
            uri2.getClass();
            long j = nb7Var.f;
            long j2 = nb7Var.g;
            liq liqVar = this.a;
            long h = liqVar.h(j, j2, uri2);
            long a = qc6.a(liqVar.a(uri2));
            if (a > 0 && a == h) {
                ssg.a(3, "CompatForOldCacheKeyFormatDataSource", "found shorter key " + uri2 + " for " + uri, null);
                jq3 g = liqVar.g(0L, h, uri2);
                if (g != null) {
                    File file = g.e;
                    file.getClass();
                    this.c = new FileInputStream(file);
                    this.d = uri;
                    this.f = (int) a;
                    this.g = uri2;
                    return h;
                }
            }
        }
        return this.b.a(nb7Var);
    }

    @Override // defpackage.db7
    public final void close() {
        String str = this.g;
        if (this.d != null && this.e == this.f && str != null) {
            this.a.k(str);
        }
        this.g = null;
        this.e = 0;
        this.f = 0;
        FileInputStream fileInputStream = this.c;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        this.c = null;
        this.d = null;
        this.b.close();
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        Uri uri = this.d;
        return uri == null ? this.b.getUri() : uri;
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.b.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        FileInputStream fileInputStream = this.c;
        int read = fileInputStream != null ? fileInputStream.read(bArr, i, i2) : this.b.read(bArr, i, i2);
        this.e += read;
        return read;
    }
}
