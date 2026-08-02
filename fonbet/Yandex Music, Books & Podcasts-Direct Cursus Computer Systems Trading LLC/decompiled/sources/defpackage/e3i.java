package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e3i extends at2 implements Handler.Callback {
    public long A;
    public final fs7 r;
    public final c3i s;
    public final Handler t;
    public final y2i u;
    public wyf v;
    public boolean w;
    public boolean x;
    public long y;
    public u2i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3i(c3i c3iVar, Looper looper) {
        super(5);
        Handler handler;
        fs7 fs7Var = fs7.f;
        this.s = c3iVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = dvt.a;
            handler = new Handler(looper, this);
        }
        this.t = handler;
        this.r = fs7Var;
        this.u = new y2i(1);
        this.A = -9223372036854775807L;
    }

    @Override // defpackage.at2
    public final void C(dsc[] dscVarArr, long j, long j2, uvh uvhVar) {
        this.v = this.r.k(dscVarArr[0]);
        u2i u2iVar = this.z;
        if (u2iVar != null) {
            long j3 = u2iVar.b;
            long j4 = (this.A + j3) - j2;
            if (j3 != j4) {
                u2iVar = new u2i(j4, u2iVar.a);
            }
            this.z = u2iVar;
        }
        this.A = j2;
    }

    @Override // defpackage.at2
    public final void E(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.w && this.z == null) {
                y2i y2iVar = this.u;
                y2iVar.z();
                qdc qdcVar = this.c;
                qdcVar.s();
                int D = D(qdcVar, y2iVar, 0);
                if (D == -4) {
                    if (y2iVar.f(4)) {
                        this.w = true;
                    } else if (y2iVar.k >= this.l) {
                        y2iVar.n = this.y;
                        y2iVar.C();
                        wyf wyfVar = this.v;
                        int i = dvt.a;
                        u2i A = wyfVar.A(y2iVar);
                        if (A != null) {
                            ArrayList arrayList = new ArrayList(A.a.length);
                            K(A, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.z = new u2i(L(y2iVar.k), (n2i[]) arrayList.toArray(new n2i[0]));
                            }
                        }
                    }
                } else if (D == -5) {
                    dsc dscVar = (dsc) qdcVar.c;
                    dscVar.getClass();
                    this.y = dscVar.s;
                }
            }
            u2i u2iVar = this.z;
            if (u2iVar == null || u2iVar.b > L(j)) {
                z = false;
            } else {
                u2i u2iVar2 = this.z;
                Handler handler = this.t;
                if (handler != null) {
                    handler.obtainMessage(1, u2iVar2).sendToTarget();
                } else {
                    this.s.h(u2iVar2);
                }
                this.z = null;
                z = true;
            }
            if (this.w && this.z == null) {
                this.x = true;
            }
        }
    }

    @Override // defpackage.at2
    public final int I(dsc dscVar) {
        if (this.r.D(dscVar)) {
            return at2.e(dscVar.M == 0 ? 4 : 2, 0, 0, 0);
        }
        return at2.e(0, 0, 0, 0);
    }

    public final void K(u2i u2iVar, ArrayList arrayList) {
        int i = 0;
        while (true) {
            n2i[] n2iVarArr = u2iVar.a;
            if (i >= n2iVarArr.length) {
                return;
            }
            dsc wrappedMetadataFormat = n2iVarArr[i].getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null) {
                fs7 fs7Var = this.r;
                if (fs7Var.D(wrappedMetadataFormat)) {
                    wyf k = fs7Var.k(wrappedMetadataFormat);
                    byte[] wrappedMetadataBytes = n2iVarArr[i].getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    y2i y2iVar = this.u;
                    y2iVar.z();
                    y2iVar.B(wrappedMetadataBytes.length);
                    y2iVar.i.put(wrappedMetadataBytes);
                    y2iVar.C();
                    u2i A = k.A(y2iVar);
                    if (A != null) {
                        K(A, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(n2iVarArr[i]);
            i++;
        }
    }

    public final long L(long j) {
        vq1.A(j != -9223372036854775807L);
        vq1.A(this.A != -9223372036854775807L);
        return j - this.A;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            e7o.n();
            return false;
        }
        this.s.h((u2i) message.obj);
        return true;
    }

    @Override // defpackage.at2
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // defpackage.at2
    public final boolean n() {
        return this.x;
    }

    @Override // defpackage.at2
    public final boolean p() {
        return true;
    }

    @Override // defpackage.at2
    public final void u() {
        this.z = null;
        this.v = null;
        this.A = -9223372036854775807L;
    }

    @Override // defpackage.at2
    public final void w(long j, boolean z) {
        this.z = null;
        this.w = false;
        this.x = false;
    }
}
