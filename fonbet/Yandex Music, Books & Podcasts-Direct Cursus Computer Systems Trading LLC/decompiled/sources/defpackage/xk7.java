package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class xk7 implements db7 {
    public final Context a;
    public final ArrayList b;
    public final db7 c;
    public n9c d;
    public xq1 e;
    public yb6 f;
    public db7 g;
    public dft h;
    public qa7 i;
    public jjn j;
    public db7 k;

    public xk7(Context context, db7 db7Var) {
        this.a = context.getApplicationContext();
        db7Var.getClass();
        this.c = db7Var;
        this.b = new ArrayList();
    }

    public static void d(db7 db7Var, t6t t6tVar) {
        if (db7Var != null) {
            db7Var.q(t6tVar);
        }
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        vq1.A(this.k == null);
        Uri uri = nb7Var.a;
        String scheme = uri.getScheme();
        int i = dvt.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    n9c n9cVar = new n9c(false);
                    this.d = n9cVar;
                    c(n9cVar);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    xq1 xq1Var = new xq1(context);
                    this.e = xq1Var;
                    c(xq1Var);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                xq1 xq1Var2 = new xq1(context);
                this.e = xq1Var2;
                c(xq1Var2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                yb6 yb6Var = new yb6(context);
                this.f = yb6Var;
                c(yb6Var);
            }
            this.k = this.f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            db7 db7Var = this.c;
            if (equals) {
                if (this.g == null) {
                    try {
                        db7 db7Var2 = (db7) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = db7Var2;
                        c(db7Var2);
                    } catch (ClassNotFoundException unused) {
                        vq1.n0("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        kac.k("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.g == null) {
                        this.g = db7Var;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    dft dftVar = new dft(8000);
                    this.h = dftVar;
                    c(dftVar);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    qa7 qa7Var = new qa7(false);
                    this.i = qa7Var;
                    c(qa7Var);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    jjn jjnVar = new jjn(context);
                    this.j = jjnVar;
                    c(jjnVar);
                }
                this.k = this.j;
            } else {
                this.k = db7Var;
            }
        }
        return this.k.a(nb7Var);
    }

    @Override // defpackage.db7
    public final Map b() {
        db7 db7Var = this.k;
        return db7Var == null ? Collections.EMPTY_MAP : db7Var.b();
    }

    public final void c(db7 db7Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            db7Var.q((t6t) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.db7
    public final void close() {
        db7 db7Var = this.k;
        if (db7Var != null) {
            try {
                db7Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        db7 db7Var = this.k;
        if (db7Var == null) {
            return null;
        }
        return db7Var.getUri();
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.c.q(t6tVar);
        this.b.add(t6tVar);
        d(this.d, t6tVar);
        d(this.e, t6tVar);
        d(this.f, t6tVar);
        d(this.g, t6tVar);
        d(this.h, t6tVar);
        d(this.i, t6tVar);
        d(this.j, t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        db7 db7Var = this.k;
        db7Var.getClass();
        return db7Var.read(bArr, i, i2);
    }
}
