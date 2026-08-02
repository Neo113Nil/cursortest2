package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class gg7 implements ly1 {
    public final /* synthetic */ oxf a;

    public gg7(oxf oxfVar) {
        this.a = oxfVar;
    }

    @Override // defpackage.ly1
    public final void I(long j) {
        xiu xiuVar = this.a.r;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ey1(xiuVar, j));
        }
    }

    @Override // defpackage.ly1
    public final void Q(int i, long j, long j2) {
        xiu xiuVar = this.a.r;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new zx1(xiuVar, i, j, j2, 0));
        }
    }

    @Override // defpackage.ly1
    public final void W() {
        this.a.I = true;
    }

    @Override // defpackage.ly1
    public final void e(boolean z) {
        xiu xiuVar = this.a.r;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new dy1(xiuVar, z, 0));
        }
    }

    @Override // defpackage.ly1
    public final void f(Exception exc) {
        vq1.L("DecoderAudioRenderer", "Audio sink error", exc);
        xiu xiuVar = this.a.r;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new by1(xiuVar, exc, 0));
        }
    }

    @Override // defpackage.ly1
    public final void n() {
        this.a.Z = true;
    }

    @Override // defpackage.ly1
    public final void r(z9 z9Var) {
        xiu xiuVar = this.a.r;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ay1(xiuVar, z9Var, 0));
        }
    }

    @Override // defpackage.ly1
    public final void s(z9 z9Var) {
        xiu xiuVar = this.a.r;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ay1(xiuVar, z9Var, 1));
        }
    }
}
