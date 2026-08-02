package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.eo71;
import defpackage.fu71;
import defpackage.g8e;
import defpackage.gy61;
import defpackage.lz71;
import defpackage.n571;
import defpackage.ny61;
import defpackage.o171;
import defpackage.og81;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.u471;
import defpackage.xt81;
import defpackage.zo81;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class fs1 extends gy61 implements Handler.Callback {
    public final o171 n;
    public final gn0 o;
    public final Handler p;
    public final u471 q;
    public eo71 r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public cs1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs1(gn0 gn0Var, Looper looper) {
        super(5);
        Handler handler;
        o171 o171Var = o171.a;
        this.o = gn0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = rf71.a;
            handler = new Handler(looper, this);
        }
        this.p = handler;
        this.n = o171Var;
        this.q = new u471();
        this.v = -9223372036854775807L;
    }

    public final void a(cs1 cs1Var, ArrayList arrayList) {
        String str;
        eo71 zo81Var;
        int i = 0;
        while (true) {
            bs1[] bs1VarArr = cs1Var.b;
            if (i >= bs1VarArr.length) {
                return;
            }
            qd81 a = bs1VarArr[i].a();
            if (a != null) {
                str = a.E;
                this.n.getClass();
                if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
                    this.n.getClass();
                    if (str != null) {
                        switch (str) {
                            case "application/vnd.dvb.ait":
                                zo81Var = new zo81();
                                break;
                            case "application/x-icy":
                                zo81Var = new xt81();
                                break;
                            case "application/id3":
                                zo81Var = new n571();
                                break;
                            case "application/x-emsg":
                                zo81Var = new lz71();
                                break;
                            case "application/x-scte35":
                                zo81Var = new fu71();
                                break;
                        }
                        byte[] b = cs1Var.b[i].b();
                        b.getClass();
                        this.q.e();
                        this.q.g(b.length);
                        this.q.c.put(b);
                        this.q.f();
                        cs1 a2 = zo81Var.a(this.q);
                        if (a2 != null) {
                            a(a2, arrayList);
                        }
                        i++;
                    }
                }
            }
            arrayList.add(cs1Var.b[i]);
            i++;
        }
        ny61.g(g8e.o("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // defpackage.gy61
    public final String c() {
        return "MetadataRenderer";
    }

    @Override // defpackage.gy61
    public final boolean e() {
        return this.t;
    }

    @Override // defpackage.gy61
    public final boolean f() {
        return true;
    }

    @Override // defpackage.gy61
    public final void g() {
        this.w = null;
        this.v = -9223372036854775807L;
        this.r = null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            ny61.k();
            return false;
        }
        this.o.a((cs1) message.obj);
        return true;
    }

    @Override // defpackage.gy61
    public final int a(qd81 qd81Var) {
        this.n.getClass();
        String str = qd81Var.E;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return gy61.a(0, 0, 0);
        }
        return gy61.a(qd81Var.Z == 0 ? 4 : 2, 0, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r1.equals("application/vnd.dvb.ait") == false) goto L6;
     */
    @Override // defpackage.gy61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(qd81[] qd81VarArr, long j, long j2) {
        eo71 zo81Var;
        o171 o171Var = this.n;
        char c = 0;
        qd81 qd81Var = qd81VarArr[0];
        o171Var.getClass();
        String str = qd81Var.E;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 4;
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
                    zo81Var = new zo81();
                    break;
                case 1:
                    zo81Var = new xt81();
                    break;
                case 2:
                    zo81Var = new n571();
                    break;
                case 3:
                    zo81Var = new lz71();
                    break;
                case 4:
                    zo81Var = new fu71();
                    break;
            }
            this.r = zo81Var;
            return;
        }
        ny61.g(g8e.o("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // defpackage.gy61
    public final void a(long j, boolean z) {
        this.w = null;
        this.v = -9223372036854775807L;
        this.s = false;
        this.t = false;
    }

    @Override // defpackage.gy61
    public final void a(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.s && this.w == null) {
                this.q.e();
                og81 og81Var = this.c;
                og81Var.a = null;
                og81Var.b = null;
                int a = a(og81Var, this.q, 0);
                if (a == -4) {
                    if (this.q.c(4)) {
                        this.s = true;
                    } else {
                        u471 u471Var = this.q;
                        u471Var.A = this.u;
                        u471Var.f();
                        eo71 eo71Var = this.r;
                        int i = rf71.a;
                        cs1 a2 = eo71Var.a(this.q);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.b.length);
                            a(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.w = new cs1(arrayList);
                                this.v = this.q.x;
                            }
                        }
                    }
                } else if (a == -5) {
                    qd81 qd81Var = og81Var.b;
                    qd81Var.getClass();
                    this.u = qd81Var.I;
                }
            }
            cs1 cs1Var = this.w;
            if (cs1Var == null || this.v > j) {
                z = false;
            } else {
                Handler handler = this.p;
                if (handler != null) {
                    handler.obtainMessage(0, cs1Var).sendToTarget();
                } else {
                    this.o.a(cs1Var);
                }
                this.w = null;
                this.v = -9223372036854775807L;
                z = true;
            }
            if (this.s && this.w == null) {
                this.t = true;
            }
        }
    }
}
