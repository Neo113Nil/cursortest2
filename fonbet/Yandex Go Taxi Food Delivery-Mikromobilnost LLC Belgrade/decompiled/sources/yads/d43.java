package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.bf71;
import defpackage.cj81;
import defpackage.dr81;
import defpackage.du81;
import defpackage.g681;
import defpackage.g8e;
import defpackage.gy61;
import defpackage.gz61;
import defpackage.l381;
import defpackage.ml61;
import defpackage.nba1;
import defpackage.ni61;
import defpackage.ny61;
import defpackage.og81;
import defpackage.pk81;
import defpackage.py61;
import defpackage.qd81;
import defpackage.qz71;
import defpackage.rf71;
import defpackage.rw81;
import defpackage.ve81;
import defpackage.wa81;
import defpackage.wv81;
import defpackage.yk81;
import java.util.Collections;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public final class d43 extends gy61 implements Handler.Callback {
    public int A;
    public long B;
    public final Handler n;
    public final gn0 o;
    public final dr81 p;
    public final og81 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public qd81 v;
    public pk81 w;
    public du81 x;
    public rw81 y;
    public rw81 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d43(gn0 gn0Var, Looper looper) {
        super(3);
        Handler handler;
        dr81 dr81Var = dr81.a;
        this.o = gn0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = rf71.a;
            handler = new Handler(looper, this);
        }
        this.n = handler;
        this.p = dr81Var;
        this.q = new og81();
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.gy61
    public final void a(long j, long j2) {
        boolean z;
        if (this.l) {
            long j3 = this.B;
            if (j3 != -9223372036854775807L && j >= j3) {
                n();
                this.s = true;
            }
        }
        if (this.s) {
            return;
        }
        if (this.z == null) {
            pk81 pk81Var = this.w;
            pk81Var.getClass();
            pk81Var.a(j);
            try {
                pk81 pk81Var2 = this.w;
                pk81Var2.getClass();
                this.z = pk81Var2.a();
            } catch (w23 e) {
                nba1.c("TextRenderer", nba1.b("Subtitle decoding failed. streamFormat=" + this.v, e));
                List list = Collections.EMPTY_LIST;
                Handler handler = this.n;
                if (handler != null) {
                    handler.obtainMessage(0, list).sendToTarget();
                } else {
                    this.o.a(list);
                    this.o.a(new bf71(list));
                }
                o();
                m();
                return;
            }
        }
        if (this.g != 2) {
            return;
        }
        if (this.y != null) {
            long l = l();
            z = false;
            while (l <= j) {
                this.A++;
                l = l();
                z = true;
            }
        } else {
            z = false;
        }
        rw81 rw81Var = this.z;
        if (rw81Var != null) {
            if (rw81Var.c(4)) {
                if (!z && l() == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                    if (this.u == 2) {
                        o();
                        m();
                    } else {
                        n();
                        this.s = true;
                    }
                }
            } else if (rw81Var.b <= j) {
                rw81 rw81Var2 = this.y;
                if (rw81Var2 != null) {
                    rw81Var2.e();
                }
                this.A = rw81Var.a(j);
                this.y = rw81Var;
                this.z = null;
                z = true;
            }
        }
        if (z) {
            this.y.getClass();
            List d = this.y.d(j);
            Handler handler2 = this.n;
            if (handler2 != null) {
                handler2.obtainMessage(0, d).sendToTarget();
            } else {
                this.o.a(d);
                this.o.a(new bf71(d));
            }
        }
        if (this.u == 2) {
            return;
        }
        while (!this.r) {
            try {
                du81 du81Var = this.x;
                if (du81Var == null) {
                    pk81 pk81Var3 = this.w;
                    pk81Var3.getClass();
                    du81Var = (du81) pk81Var3.b();
                    if (du81Var == null) {
                        return;
                    } else {
                        this.x = du81Var;
                    }
                }
                if (this.u == 1) {
                    du81Var.a = 4;
                    pk81 pk81Var4 = this.w;
                    pk81Var4.getClass();
                    pk81Var4.b(du81Var);
                    this.x = null;
                    this.u = 2;
                    return;
                }
                int a = a(this.q, du81Var, 0);
                if (a == -4) {
                    if (du81Var.c(4)) {
                        this.r = true;
                        this.t = false;
                    } else {
                        qd81 qd81Var = this.q.b;
                        if (qd81Var == null) {
                            return;
                        }
                        du81Var.A = qd81Var.I;
                        du81Var.f();
                        this.t &= !du81Var.c(1);
                    }
                    if (!this.t) {
                        pk81 pk81Var5 = this.w;
                        pk81Var5.getClass();
                        pk81Var5.b(du81Var);
                        this.x = null;
                    }
                } else if (a == -3) {
                    return;
                }
            } catch (w23 e2) {
                nba1.c("TextRenderer", nba1.b("Subtitle decoding failed. streamFormat=" + this.v, e2));
                List list2 = Collections.EMPTY_LIST;
                Handler handler3 = this.n;
                if (handler3 != null) {
                    handler3.obtainMessage(0, list2).sendToTarget();
                } else {
                    this.o.a(list2);
                    this.o.a(new bf71(list2));
                }
                o();
                m();
                return;
            }
        }
    }

    @Override // defpackage.gy61
    public final String c() {
        return "TextRenderer";
    }

    @Override // defpackage.gy61
    public final boolean e() {
        return this.s;
    }

    @Override // defpackage.gy61
    public final boolean f() {
        return true;
    }

    @Override // defpackage.gy61
    public final void g() {
        this.v = null;
        this.B = -9223372036854775807L;
        List list = Collections.EMPTY_LIST;
        Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.o.a(list);
            this.o.a(new bf71(list));
        }
        o();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            ny61.k();
            return false;
        }
        List list = (List) message.obj;
        this.o.a(list);
        this.o.a(new bf71(list));
        return true;
    }

    public final long l() {
        if (this.A == -1) {
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        this.y.getClass();
        return this.A >= this.y.a() ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : this.y.b(this.A);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
    
        if (r1.equals("application/pgs") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        pk81 ni61Var;
        char c = 1;
        this.t = true;
        dr81 dr81Var = this.p;
        qd81 qd81Var = this.v;
        qd81Var.getClass();
        int i = qd81Var.W;
        List list = qd81Var.G;
        dr81Var.getClass();
        String str = qd81Var.E;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    ni61Var = new ni61(list);
                    break;
                case 1:
                    ni61Var = new ve81();
                    break;
                case 2:
                    ni61Var = new l381();
                    break;
                case 3:
                    ni61Var = new cj81();
                    break;
                case 4:
                    ni61Var = new ml61(list);
                    break;
                case 5:
                    ni61Var = new gz61(list);
                    break;
                case 6:
                case '\b':
                    ni61Var = new wv81(str, i);
                    break;
                case 7:
                    ni61Var = new qz71();
                    break;
                case '\t':
                    ni61Var = new py61(i, list);
                    break;
                case '\n':
                    ni61Var = new wa81();
                    break;
                case 11:
                    ni61Var = new yk81();
                    break;
            }
            this.w = ni61Var;
            return;
        }
        ny61.g(g8e.o("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final void n() {
        this.x = null;
        this.A = -1;
        rw81 rw81Var = this.y;
        if (rw81Var != null) {
            rw81Var.e();
            this.y = null;
        }
        rw81 rw81Var2 = this.z;
        if (rw81Var2 != null) {
            rw81Var2.e();
            this.z = null;
        }
    }

    public final void o() {
        n();
        pk81 pk81Var = this.w;
        pk81Var.getClass();
        pk81Var.release();
        this.w = null;
        this.u = 0;
    }

    @Override // defpackage.gy61
    public final int a(qd81 qd81Var) {
        this.p.getClass();
        String str = qd81Var.E;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            if (g681.f(qd81Var.E)) {
                return gy61.a(1, 0, 0);
            }
            return gy61.a(0, 0, 0);
        }
        return gy61.a(qd81Var.Z == 0 ? 4 : 2, 0, 0);
    }

    @Override // defpackage.gy61
    public final void a(qd81[] qd81VarArr, long j, long j2) {
        this.v = qd81VarArr[0];
        if (this.w != null) {
            this.u = 1;
        } else {
            m();
        }
    }

    @Override // defpackage.gy61
    public final void a(long j, boolean z) {
        List list = Collections.EMPTY_LIST;
        Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.o.a(list);
            this.o.a(new bf71(list));
        }
        this.r = false;
        this.s = false;
        this.B = -9223372036854775807L;
        if (this.u != 0) {
            o();
            m();
        } else {
            n();
            pk81 pk81Var = this.w;
            pk81Var.getClass();
            pk81Var.flush();
        }
    }
}
