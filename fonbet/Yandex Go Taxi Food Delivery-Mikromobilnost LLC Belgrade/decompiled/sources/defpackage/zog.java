package defpackage;

import android.content.Context;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.messaging.internal.displayname.AvatarType;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class zog {
    public final zq60 a;
    public final sq60 b;
    public final Context c;
    public final xog d;
    public final db4 e;
    public final pnt0 f;
    public e1k g;
    public h3t0 h;
    public czj i;

    public zog(Context context, xog xogVar, db4 db4Var) {
        zq60 zq60Var = new zq60();
        this.a = zq60Var;
        this.b = new sq60(zq60Var);
        this.f = new pnt0();
        this.h = h3t0.a;
        this.c = context;
        this.d = xogVar;
        this.e = db4Var;
    }

    public final void a(zyj zyjVar) {
        if (this.g == null) {
            this.g = this.d.g(this.h, this);
        }
        czj czjVar = this.i;
        gb4 c = czjVar != null ? c(czjVar, zyjVar.a) : null;
        this.a.b(zyjVar);
        if (c != null) {
            zyjVar.a(czjVar, c);
            return;
        }
        switch (zyjVar.b) {
            case 0:
                j5b j5bVar = (j5b) zyjVar.x;
                int i = zyjVar.w;
                ((x6f0) j5bVar.a).d(new d2b(new EmptyDrawable(i, i), "", false));
                break;
            default:
                nl21 nl21Var = (nl21) zyjVar.x;
                if (nl21Var != null) {
                    int i2 = zyjVar.w;
                    nl21Var.B(new o0k("", new EmptyDrawable(i2, i2), AvatarType.EMPTY));
                    break;
                }
                break;
        }
    }

    public final void b(h3t0 h3t0Var, czj czjVar) {
        tje.e();
        this.h = h3t0Var;
        if (Objects.equals(this.i, czjVar)) {
            return;
        }
        this.i = czjVar;
        int i = 0;
        while (true) {
            pnt0 pnt0Var = this.f;
            if (i >= pnt0Var.e()) {
                break;
            }
            fb4 fb4Var = (fb4) pnt0Var.f(i);
            yn50 yn50Var = fb4Var.f;
            if (yn50Var != null) {
                yn50Var.a();
                fb4Var.f = null;
            }
            fb4Var.g = null;
            i++;
        }
        if (this.g == null) {
            return;
        }
        sq60 sq60Var = this.b;
        z83.c(null, sq60Var.hasNext());
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            zyj zyjVar = (zyj) sq60Var.next();
            zyjVar.a(czjVar, c(czjVar, zyjVar.a));
        }
    }

    public final gb4 c(czj czjVar, int i) {
        if (i == 0) {
            return bei.I;
        }
        pnt0 pnt0Var = this.f;
        fb4 fb4Var = (fb4) pnt0Var.b(i);
        if (fb4Var == null) {
            fb4Var = new fb4(this.c, this.e, this, i);
            pnt0Var.d(i, fb4Var);
        }
        fb4 fb4Var2 = fb4Var;
        String str = czjVar.a;
        String str2 = czjVar.b;
        String str3 = czjVar.c;
        Boolean bool = czjVar.d;
        kb4 kb4Var = fb4Var2.e;
        if (fb4Var2.g == null) {
            if (str3 != null) {
                z83.f(fb4Var2.f, null);
                db4 db4Var = fb4Var2.b;
                int i2 = kb4Var.a;
                yn50 yn50Var = (yn50) ((xav) db4Var.b.get()).load(str3);
                xn50 xn50Var = yn50Var.b;
                xn50Var.i = i2;
                xn50Var.j = i2;
                int i3 = 2;
                yn50Var.b.m = bool.booleanValue() ? new pgk0(i3, kb4Var) : new dn60(kb4Var.a, i3, (byte) 0);
                yn50Var.b(null, fb4Var2);
                if (fb4Var2.g == null) {
                    fb4Var2.f = yn50Var;
                }
            }
            if (fb4Var2.g == null) {
                fb4Var2.g = new m2v(fb4Var2, bool, str2, str.isEmpty() ? "" : w2b1.a(str), false);
            }
        }
        return fb4Var2.g;
    }
}
