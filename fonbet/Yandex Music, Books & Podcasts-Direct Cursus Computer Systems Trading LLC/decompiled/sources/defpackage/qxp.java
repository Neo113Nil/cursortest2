package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLException;
import kotlin.coroutines.g;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class qxp implements u0f, jpj, lci, er1, pm5, hv3, ra7, vzn, x7o, lgk, wa4 {
    public static liq b;
    public static final Object c = new Object();
    public Object a;

    public qxp(Context context) {
        liq liqVar;
        ip3 ip3Var = new ip3();
        synchronized (c) {
            liqVar = b;
            if (liqVar == null) {
                liq liqVar2 = new liq(new File(context.getExternalCacheDir(), "divKit_video_cache"), new gwf(94371840L), new kc7(context), false);
                b = liqVar2;
                liqVar = liqVar2;
            }
        }
        ip3Var.a = liqVar;
        ip3Var.f = new hl5(context);
        ip3Var.i = 2;
        this.a = ip3Var;
    }

    public static int l(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int n(int i, boolean z) {
        return l(i) + (z ? 1 : 0) + i;
    }

    public static int o(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public void A(int i, boolean z) {
        if (z) {
            q(i);
        }
    }

    public void B(s0 s0Var) {
        s0Var.u(this, true);
    }

    public void C(s0[] s0VarArr) {
        for (s0 s0Var : s0VarArr) {
            s0Var.u(this, true);
        }
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        AppBarLayout appBarLayout = (AppBarLayout) this.a;
        kqv kqvVar2 = appBarLayout.getFitsSystemWindows() ? kqvVar : null;
        if (!Objects.equals(appBarLayout.g, kqvVar2)) {
            appBarLayout.g = kqvVar2;
            appBarLayout.setWillNotDraw(!(appBarLayout.x != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return kqvVar;
    }

    @Override // defpackage.er1
    public ca7 K(AssetManager assetManager, String str) {
        return new p9c(assetManager, str, 1);
    }

    public dja a(List list, yia yiaVar, long j) {
        int i;
        int i2;
        int s = wct.s();
        skr skrVar = (skr) this.a;
        int ordinal = yiaVar.ordinal();
        if (ordinal == 0) {
            i = R.string.downloaded_playlists_block;
        } else if (ordinal == 1) {
            i = R.string.downloaded_albums_block;
        } else if (ordinal == 2) {
            i = R.string.downloaded_audiobooks_hyphenated_block;
        } else if (ordinal == 3) {
            i = R.string.downloaded_podcasts_block;
        } else {
            if (ordinal != 4) {
                b6e.s();
                return null;
            }
            i = R.string.downloaded_kids_block;
        }
        String c2 = skrVar.c(i);
        int ordinal2 = yiaVar.ordinal();
        if (ordinal2 == 0) {
            i2 = R.drawable.ic_playlist_24;
        } else if (ordinal2 == 1) {
            i2 = R.drawable.ic_album_24;
        } else if (ordinal2 == 2) {
            i2 = R.drawable.ic_book_24;
        } else if (ordinal2 == 3) {
            i2 = R.drawable.ic_podcast_24;
        } else {
            if (ordinal2 != 4) {
                b6e.s();
                return null;
            }
            i2 = R.drawable.ic_kid_24;
        }
        int i3 = i2;
        String M = saf.M(j);
        List<hia> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((hia) it.next()).a);
        }
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        for (hia hiaVar : list2) {
            String pathForSize = hiaVar.b.a.getPathForSize(s);
            pathForSize.getClass();
            qo6 qo6Var = hiaVar.c;
            Integer num = hiaVar.d;
            arrayList2.add(num == null ? new sgs(qo6Var, pathForSize) : new tgs(pathForSize, qo6Var, c3x.f(num.intValue())));
        }
        return new dja(yiaVar, kwl.b(c2, i3, arrayList, arrayList2, M, 3));
    }

    @Override // defpackage.lgk
    public void b(oxa oxaVar) {
        ((mgk) this.a).e(jfk.a, null, oxaVar);
    }

    @Override // defpackage.wa4
    public void c() {
        v7g.C(new rs6(18, this));
    }

    @Override // defpackage.hv3
    public void d(Context context, hxo hxoVar) {
        context.getClass();
        hxoVar.invoke(new mi7(context, ((BindCardActivity) this.a).l().c()));
    }

    @Override // defpackage.ra7
    public ta7 e() {
        so3 so3Var = (so3) this.a;
        so3Var.getClass();
        return new hp3(so3Var, 5242880L);
    }

    @Override // defpackage.u0f
    public List e0() {
        rj6 rj6Var = (rj6) x97.D(g.a, new hl(this, null, 3));
        if (rj6Var instanceof qj6) {
            return ((oq) ((qj6) rj6Var).a).F;
        }
        if (rj6Var instanceof nj6) {
            return c5b.a;
        }
        if (rj6Var instanceof pj6) {
            throw ((pj6) rj6Var).a();
        }
        b6e.s();
        return null;
    }

    public b07 f() {
        return new b07((ByteArrayOutputStream) this.a);
    }

    public e67 g() {
        return new e67((ByteArrayOutputStream) this.a);
    }

    @Override // defpackage.vzn
    public void h(String str, long j, int i, long j2, long j3) {
        str.getClass();
        vzn[] vznVarArr = (vzn[]) this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            vznVarArr[i2].h(str, j, i, j2, j3);
        }
    }

    @Override // defpackage.vzn
    public void i(String str, float f) {
        vzn[] vznVarArr = (vzn[]) this.a;
        for (int i = 0; i < 2; i++) {
            vznVarArr[i].i(str, f);
        }
    }

    public sdr j() {
        r3b a = r3b.a();
        if (a.c() == 1) {
            return new ode(true);
        }
        x6k g0 = szf.g0(Boolean.FALSE);
        a.h(new kn7(g0, this));
        return g0;
    }

    @Override // defpackage.wa4
    public void k(iek iekVar) {
        iekVar.getClass();
        v7g.C(new qs6(9, this, iekVar));
    }

    @Override // defpackage.wa4
    public void m(ft7 ft7Var) {
        ft7Var.getClass();
        v7g.C(new qs6(8, this, ft7Var));
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        ggk ggkVar = (ggk) obj;
        ggkVar.getClass();
        eg6 eg6Var = ((ki6) this.a).k;
        int i = ji6.a[ggkVar.ordinal()];
        eg6Var.a.L(R.string.paymentsdk_success_title);
    }

    public void p() {
        long j;
        n97 n97Var = (n97) this.a;
        synchronized (i4w.u) {
            try {
                j = i4w.v ? i4w.w : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        n97Var.L = j;
        n97Var.E(true);
    }

    public void q(int i) {
        ((ByteArrayOutputStream) this.a).write(i);
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        rs1 rs1Var = (rs1) this.a;
        if (exc != null) {
            rs1Var.I(exc, null);
        } else {
            rs1Var.I(new SSLException("socket closed during handshake"), null);
        }
    }

    public void s(byte[] bArr, int i, int i2) {
        ((ByteArrayOutputStream) this.a).write(bArr, i, i2);
    }

    public void t(int i) {
        if (i < 128) {
            q(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                s(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void u(d0[] d0VarArr) {
        for (d0 d0Var : d0VarArr) {
            d0Var.n().u(this, true);
        }
    }

    public void v(int i, boolean z, byte[] bArr) {
        A(i, z);
        t(bArr.length);
        s(bArr, 0, bArr.length);
    }

    public void w(int i, boolean z, d0[] d0VarArr) {
        A(i, z);
        q(128);
        u(d0VarArr);
        q(0);
        q(0);
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        eg6 eg6Var = ((ki6) this.a).k;
        eg6Var.getClass();
        eg6Var.a.B(bfkVar);
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new fr1(0, (AssetManager) this.a, this);
    }

    public void z(int i, int i2) {
        if (i2 < 31) {
            q(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        s(bArr, i4, 6 - i4);
    }

    public /* synthetic */ qxp(Object obj) {
        this.a = obj;
    }

    public qxp(oq oqVar) {
        oqVar.getClass();
        this.a = oqVar;
    }
}
