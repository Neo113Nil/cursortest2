package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes7.dex */
public final class so81 implements u871 {
    public d371 A;
    public o271 B;
    public c771 C;
    public u871 D;
    public final Context a;
    public final ArrayList b;
    public final u871 c;
    public qk71 w;
    public qs81 x;
    public e271 y;
    public u871 z;

    public so81(Context context, u871 u871Var) {
        this.a = context.getApplicationContext();
        u871Var.getClass();
        this.c = u871Var;
        this.b = new ArrayList();
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        if (this.D != null) {
            ny61.k();
            return 0L;
        }
        Uri uri = no71Var.a;
        String scheme = uri.getScheme();
        int i = rf71.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.w == null) {
                    qk71 qk71Var = new qk71();
                    this.w = qk71Var;
                    a(qk71Var);
                }
                this.D = this.w;
            } else {
                if (this.x == null) {
                    qs81 qs81Var = new qs81(context);
                    this.x = qs81Var;
                    a(qs81Var);
                }
                this.D = this.x;
            }
        } else if ("asset".equals(scheme)) {
            if (this.x == null) {
                qs81 qs81Var2 = new qs81(context);
                this.x = qs81Var2;
                a(qs81Var2);
            }
            this.D = this.x;
        } else if ("content".equals(scheme)) {
            if (this.y == null) {
                e271 e271Var = new e271(context);
                this.y = e271Var;
                a(e271Var);
            }
            this.D = this.y;
        } else {
            boolean equals = "rtmp".equals(scheme);
            u871 u871Var = this.c;
            if (equals) {
                if (this.z == null) {
                    try {
                        u871 u871Var2 = (u871) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.z = u871Var2;
                        a(u871Var2);
                    } catch (ClassNotFoundException unused) {
                        nba1.e();
                    } catch (Exception e) {
                        ny61.n("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.z == null) {
                        this.z = u871Var;
                    }
                }
                this.D = this.z;
            } else if ("udp".equals(scheme)) {
                if (this.A == null) {
                    d371 d371Var = new d371();
                    this.A = d371Var;
                    a(d371Var);
                }
                this.D = this.A;
            } else if (Constants.KEY_DATA.equals(scheme)) {
                if (this.B == null) {
                    o271 o271Var = new o271();
                    this.B = o271Var;
                    a(o271Var);
                }
                this.D = this.B;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.C == null) {
                    c771 c771Var = new c771(context);
                    this.C = c771Var;
                    a(c771Var);
                }
                this.D = this.C;
            } else {
                this.D = u871Var;
            }
        }
        return this.D.Q(no71Var);
    }

    @Override // defpackage.u871
    public final void S(mr81 mr81Var) {
        mr81Var.getClass();
        this.c.S(mr81Var);
        this.b.add(mr81Var);
        qk71 qk71Var = this.w;
        if (qk71Var != null) {
            qk71Var.S(mr81Var);
        }
        qs81 qs81Var = this.x;
        if (qs81Var != null) {
            qs81Var.S(mr81Var);
        }
        e271 e271Var = this.y;
        if (e271Var != null) {
            e271Var.S(mr81Var);
        }
        u871 u871Var = this.z;
        if (u871Var != null) {
            u871Var.S(mr81Var);
        }
        d371 d371Var = this.A;
        if (d371Var != null) {
            d371Var.S(mr81Var);
        }
        o271 o271Var = this.B;
        if (o271Var != null) {
            o271Var.S(mr81Var);
        }
        c771 c771Var = this.C;
        if (c771Var != null) {
            c771Var.S(mr81Var);
        }
    }

    public final void a(u871 u871Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            u871Var.S((mr81) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.u871
    public final Map b() {
        u871 u871Var = this.D;
        return u871Var == null ? Collections.EMPTY_MAP : u871Var.b();
    }

    @Override // defpackage.u871
    public final void close() {
        u871 u871Var = this.D;
        if (u871Var != null) {
            try {
                u871Var.close();
            } finally {
                this.D = null;
            }
        }
    }

    @Override // defpackage.u871
    public final Uri d() {
        u871 u871Var = this.D;
        if (u871Var == null) {
            return null;
        }
        return u871Var.d();
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        u871 u871Var = this.D;
        u871Var.getClass();
        return u871Var.v(i, i2, bArr);
    }
}
