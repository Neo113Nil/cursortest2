package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.b;
import java.util.ArrayList;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class yio extends js2 {
    public final aio h;
    public final String i = "AndroidXMedia3/1.6.1";
    public final Uri j;
    public final SocketFactory k;
    public long l;
    public boolean m;
    public boolean n;
    public boolean o;
    public onh p;

    static {
        ynh.a("media3.exoplayer.rtsp");
    }

    public yio(onh onhVar, aio aioVar, SocketFactory socketFactory) {
        this.p = onhVar;
        this.h = aioVar;
        gnh gnhVar = onhVar.b;
        gnhVar.getClass();
        this.j = A(gnhVar.a);
        this.k = socketFactory;
        this.l = -9223372036854775807L;
        this.o = true;
    }

    public static Uri A(Uri uri) {
        String scheme = uri.getScheme();
        return (scheme == null || !ltg.C("rtspt", scheme)) ? uri : Uri.parse("rtsp".concat(uri.toString().substring(5)));
    }

    public final void B() {
        sis bVar = new b(this.l, this.m, this.n, f());
        if (this.o) {
            bVar = new vvm(bVar, 1);
        }
        y(bVar);
    }

    @Override // defpackage.wvh
    public final boolean a(onh onhVar) {
        gnh gnhVar = onhVar.b;
        return gnhVar != null && A(gnhVar.a).equals(this.j);
    }

    @Override // defpackage.wvh
    public final synchronized onh f() {
        return this.p;
    }

    @Override // defpackage.wvh
    public final synchronized void i(onh onhVar) {
        this.p = onhVar;
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        return new wio(zi7Var, this.h, this.j, new kpm(5, this), this.i, this.k);
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        wio wioVar = (wio) wohVar;
        ArrayList arrayList = wioVar.e;
        for (int i = 0; i < arrayList.size(); i++) {
            vio vioVar = (vio) arrayList.get(i);
            if (!vioVar.e) {
                vioVar.b.P(null);
                vioVar.c.z();
                vioVar.e = true;
            }
        }
        dvt.g(wioVar.d);
        wioVar.r = true;
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        B();
    }

    @Override // defpackage.wvh
    public final void p() {
    }

    @Override // defpackage.js2
    public final void z() {
    }
}
