package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.glance.appwidget.protobuf.a;
import com.connectsdk.service.config.AirPlayServiceConfig;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.SupportInfoProvider;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.h;
import ru.yandex.video.m3.data.DecoderData;

/* loaded from: classes.dex */
public class jzi implements pm5, rs1, wa4, nwu, ls6, x5j, x7o, arr, wa6, wpd {
    public static final jzi b = new jzi();
    public static final ovk c = new ovk();
    public Object a;

    public jzi(int i) {
        switch (i) {
            case 4:
                if (Build.VERSION.SDK_INT < 26) {
                    this.a = new wb(this);
                    break;
                } else {
                    this.a = new xb(this);
                    break;
                }
            default:
                hnx hnxVar = hnx.c;
                c5p c5pVar = new c5p(22, new ymx[]{fs7.m, c});
                Charset charset = smx.a;
                this.a = c5pVar;
                break;
        }
    }

    public static final fwu j(jzi jziVar, au7 au7Var, eu7 eu7Var, gyn gynVar, q4q q4qVar, tfo tfoVar, b3l b3lVar, ixu ixuVar) {
        v80 v80Var;
        boolean z;
        c6v c6vVar;
        List list;
        boolean z2 = q4qVar instanceof u4q;
        if (z2) {
            v80Var = ((u4q) q4qVar).b.f;
        } else {
            if (!(q4qVar instanceof s4q)) {
                b6e.s();
                return null;
            }
            v80Var = ((s4q) q4qVar).b.e;
        }
        if (z2) {
            z = ((u4q) q4qVar).b.d;
        } else {
            if (!(q4qVar instanceof s4q)) {
                b6e.s();
                return null;
            }
            z = false;
        }
        int ordinal = ixuVar.ordinal();
        if (ordinal == 0) {
            c6vVar = c6v.a;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                b6e.s();
                return null;
            }
            c6vVar = c6v.b;
        }
        ArrayList D = sj2.D(tfoVar, v80Var, new d6v(q4qVar, c6vVar), z);
        if (ixuVar == ixu.c) {
            eu7 x = i4w.x(eu7Var, 0);
            int size = x.a.a.getElements().size();
            x.b.getClass();
            eu7Var = eu7.a(x, null, new du7(size, size), 1);
        } else if (((cvu) au7Var.j).d()) {
            int ordinal2 = ixuVar.ordinal();
            if (ordinal2 == 0) {
                eu7Var.getClass();
                cu7 cu7Var = eu7Var.a;
                if (!cu7Var.b.isEmpty()) {
                    List list2 = cu7Var.b;
                    if (!list2.isEmpty()) {
                        ListIterator listIterator = list2.listIterator(list2.size());
                        while (listIterator.hasPrevious()) {
                            if (!swf.R(((jzs) listIterator.previous()).g)) {
                                list = CollectionsKt.q0(list2, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list = c5b.a;
                    eu7Var = eu7.a(eu7Var, cu7.a(cu7Var, null, list, 1), null, 2);
                }
            } else if (ordinal2 != 1 && ordinal2 != 2) {
                b6e.s();
                return null;
            }
        }
        return au7Var.f(i4w.a0(eu7Var, D, hdg.W(q4qVar) == o4q.a), gynVar, q4qVar, false, b3lVar);
    }

    public static String p(String str, t9c t9cVar, boolean z) {
        String str2 = t9cVar.a;
        if (z) {
            str2 = ".temp".concat(str2);
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return hrg.q("lottie_cache_", replaceAll, str2);
    }

    public void A(String str, boolean z) {
        List W = ((j66) this.a).W(str);
        IllegalArgumentException illegalArgumentException = W.isEmpty() ? new IllegalArgumentException(hrg.q("There are no items with id '", str, "'.")) : W.size() > 1 ? new IllegalArgumentException(hrg.q("There are several items with id '", str, "'.")) : null;
        if (illegalArgumentException == null) {
            B(((Number) CollectionsKt.Q(W)).intValue(), z);
        } else {
            kac.k("Failed to scroll to item with id.", illegalArgumentException);
        }
    }

    public void B(int i, boolean z) {
        j66 j66Var = (j66) this.a;
        if (z) {
            j66Var.q0(i);
        } else {
            j66Var.r0(i);
        }
    }

    public synchronized void C() {
        SharedPreferences.Editor edit = ((SharedPreferences) this.a).edit();
        edit.putBoolean("AESTHETE_CAPPING", true);
        edit.apply();
    }

    @Override // defpackage.wpd
    public void D(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        xha xhaVar = (xha) this.a;
        xhaVar.getClass();
        mha mhaVar = xhaVar.b;
        mhaVar.getClass();
        lwg C = g0g.C(oqVar, null);
        y supportFragmentManager = mhaVar.a.getSupportFragmentManager();
        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), d.m());
    }

    public void E(qxu qxuVar) {
        boolean z;
        cvu cvuVar = (cvu) ((au7) this.a).j;
        if (qxuVar instanceof pxu) {
            cvuVar.h(((pxu) qxuVar).c);
            return;
        }
        if (!(qxuVar instanceof oxu)) {
            if ((qxuVar instanceof mxu) || (qxuVar instanceof nxu)) {
                return;
            }
            b6e.s();
            return;
        }
        int ordinal = ((oxu) qxuVar).c.ordinal();
        if (ordinal != 0) {
            z = true;
            if (ordinal != 1 && ordinal != 2) {
                b6e.s();
                return;
            }
        } else {
            z = false;
        }
        cvuVar.h(z);
    }

    public xvu G(xvu xvuVar, qxu qxuVar) {
        if (!(xvuVar instanceof bwu)) {
            if (!(xvuVar instanceof fwu)) {
                b6e.s();
                return null;
            }
            fwu fwuVar = (fwu) xvuVar;
            tyu tyuVar = fwuVar.a;
            return i(qxuVar, tyuVar.a, tyuVar.b, fwuVar.b);
        }
        bwu bwuVar = (bwu) xvuVar;
        e5q e5qVar = bwuVar.b;
        tyu tyuVar2 = bwuVar.a;
        gyn gynVar = tyuVar2.b;
        fwu i = i(qxuVar, tyuVar2.a, gynVar, e5qVar);
        if (i != null) {
            return i;
        }
        int ordinal = hdg.W(e5qVar).ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        eu7 eu7Var = tyuVar2.a;
        awu awuVar = awu.a;
        return ((au7) this.a).e(eu7Var, gynVar, e5qVar, bwuVar.d, awuVar);
    }

    @Override // defpackage.rs1
    public void I(Exception exc, ss1 ss1Var) {
        ((m56) this.a).g(exc, ss1Var);
    }

    @Override // defpackage.wpd
    public void J(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        xha xhaVar = (xha) this.a;
        xhaVar.getClass();
        mha mhaVar = xhaVar.b;
        mhaVar.getClass();
        h m = d.m();
        t tVar = mhaVar.a;
        tVar.startActivity(quj.U(tVar, new uq(oqVar, m.b(oqVar).a(), null, qq.a, 92), m));
    }

    public void K(int i, Object obj, xto xtoVar) {
        xr4 xr4Var = (xr4) this.a;
        xr4Var.y(i, 3);
        xtoVar.h((a) obj, xr4Var.a);
        xr4Var.y(i, 4);
    }

    public File L(String str, InputStream inputStream, t9c t9cVar) {
        File file = new File(w(), p(str, t9cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // defpackage.wa6
    public void accept(Object obj) {
        sg7 sg7Var = (sg7) obj;
        sg7Var.getClass();
        this.a = sg7Var;
    }

    public void b(qxu qxuVar) {
        mmo mmoVar = (mmo) ((au7) this.a).c;
        if (!(qxuVar instanceof pxu)) {
            if ((qxuVar instanceof oxu) || (qxuVar instanceof nxu) || (qxuVar instanceof mxu)) {
                return;
            }
            b6e.s();
            return;
        }
        q4q q4qVar = ((pxu) qxuVar).b;
        if (q4qVar instanceof u4q) {
            mmoVar.w0(szf.r0(q4qVar), ((u4q) q4qVar).b.e);
        } else if (!(q4qVar instanceof s4q)) {
            b6e.s();
        } else {
            mmoVar.w0(szf.r0(q4qVar), ((s4q) q4qVar).b.d);
        }
    }

    @Override // defpackage.wa4
    public void c() {
        qdq.A(new k5(13, this));
    }

    @Override // defpackage.nwu
    public void d() {
        String e = eta.e();
        l75 l75Var = (l75) this.a;
        p75 p75Var = (p75) l75Var.d.getValue();
        mmu mmuVar = p75Var instanceof n75 ? ((n75) p75Var).a : null;
        if (mmuVar != null) {
            weo.H(l75Var.b, bfg.k(mmuVar.d, 0), true, e, null);
        }
    }

    public void e(int i, String str, boolean z) {
        int w;
        ceg l = l(str);
        if (i > 0) {
            w = l.s(i);
        } else if (i >= 0) {
            return;
        } else {
            w = l.w(-i);
        }
        B(w, z);
    }

    @Override // defpackage.ls6
    public void f(Object obj) {
        m7d m7dVar = (m7d) obj;
        m7dVar.getClass();
        zt3 zt3Var = (zt3) this.a;
        if (zt3Var.w()) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(m7dVar));
        }
    }

    @Override // defpackage.arr
    public Object get() {
        sg7 sg7Var = (sg7) this.a;
        return new DecoderData(sg7Var.e(), sg7Var.a());
    }

    @Override // defpackage.x5j
    public g0c getEventReporter() {
        return ((z07) this.a).l;
    }

    public vb h(int i) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fwu i(qxu qxuVar, eu7 eu7Var, gyn gynVar, e5q e5qVar) {
        d5q d5qVar;
        d5q d5qVar2;
        boolean z;
        fwu f;
        Unit unit;
        au7 au7Var = (au7) this.a;
        if (qxuVar instanceof pxu) {
            pxu pxuVar = (pxu) qxuVar;
            f = j(this, au7Var, eu7Var, gynVar, pxuVar.b, pxuVar.a, z2l.a, pxuVar.c ? ixu.b : ixu.a);
        } else {
            boolean z2 = qxuVar instanceof oxu;
            b3l b3lVar = a3l.a;
            if (!z2) {
                if (!(qxuVar instanceof nxu)) {
                    if (qxuVar instanceof mxu) {
                        ssg.a(6, "DefaultWavePlayback", "prolongation failed", ((mxu) qxuVar).a());
                        return null;
                    }
                    b6e.s();
                    return null;
                }
                nxu nxuVar = (nxu) qxuVar;
                if (e5qVar instanceof b5q) {
                    d5qVar2 = (d5q) e5qVar;
                } else {
                    if (!(e5qVar instanceof y4q)) {
                        if (!(e5qVar instanceof z4q)) {
                            b6e.s();
                            return null;
                        }
                        dfi.r("Session is already started so couldn't be prolonged locally. This is an internal error. Current entity: " + e5qVar, "DefaultWavePlayback");
                        d5qVar = null;
                        if (d5qVar != null) {
                            v80 v80Var = nxuVar.c;
                            b6v b6vVar = new b6v(nxuVar.b);
                            v80Var.getClass();
                            List<mqs> list = nxuVar.a;
                            ArrayList arrayList = new ArrayList(v75.o(list, 10));
                            for (mqs mqsVar : list) {
                                mqsVar.getClass();
                                arrayList.add(new jzs(mqsVar, v80Var, null, "user-queue-" + mqsVar.d().e() + "-" + new Date(System.currentTimeMillis()).getTime(), null, Boolean.FALSE, b6vVar, false));
                            }
                            int size = eu7Var.a.a.getElements().size();
                            int ordinal = hdg.W(e5qVar).ordinal();
                            if (ordinal == 0) {
                                z = true;
                            } else {
                                if (ordinal != 1) {
                                    b6e.s();
                                    return null;
                                }
                                z = false;
                            }
                            f = au7Var.f(leu.d0(eu7Var, arrayList, size, size, z), gynVar, d5qVar, false, b3lVar);
                        }
                        return null;
                    }
                    d5qVar2 = (d5q) e5qVar;
                }
                d5qVar = d5qVar2;
                if (d5qVar != null) {
                }
                return null;
            }
            q4q q4qVar = e5qVar instanceof q4q ? (q4q) e5qVar : null;
            if (q4qVar == null) {
                dfi.r("Session should be active, otherwise it cannot be prolonged. This is an internal error. Current entity: " + e5qVar, "DefaultWavePlayback");
                return null;
            }
            oxu oxuVar = (oxu) qxuVar;
            ixu ixuVar = oxuVar.c;
            boolean z3 = ixuVar == ixu.c;
            if (z3) {
                b3lVar = u2l.a;
            } else if (z3) {
                b6e.s();
                return null;
            }
            f = j(this, au7Var, eu7Var, gynVar, q4qVar, oxuVar.a, b3lVar, ixuVar);
        }
        if (f.a.a.f()) {
            unit = Unit.a;
        } else {
            su4.s(2, null, "Pointer should have current element after new recommended tracks are loaded", null);
            unit = null;
        }
        if (unit == null) {
            return null;
        }
        return f;
    }

    @Override // defpackage.wa4
    public void k(iek iekVar) {
        iekVar.getClass();
    }

    public ceg l(String str) {
        j66 j66Var = (j66) this.a;
        int U = j66Var.U();
        int X = j66Var.X();
        int c0 = j66Var.c0();
        int b0 = j66Var.b0();
        DisplayMetrics Y = j66Var.Y();
        return str == null ? true : str.equals("clamp") ? new azj(U, X, c0, b0, Y, 0) : Intrinsics.d(str, "ring") ? new azj(U, X, c0, b0, Y, 1) : new azj(U, X, c0, b0, Y, 0);
    }

    @Override // defpackage.wa4
    public void m(ft7 ft7Var) {
        ft7Var.getClass();
        qdq.A(new ha0(17, this, ft7Var));
    }

    public void n(ViewGroup viewGroup) {
        Context context;
        jn5 jn5Var = (jn5) this.a;
        if (jn5Var != null) {
            Context applicationContext = (viewGroup == null || (context = viewGroup.getContext()) == null) ? null : context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).unregisterComponentCallbacks(jn5Var);
            }
            this.a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #1 {all -> 0x009c, blocks: (B:14:0x0161, B:16:0x016c, B:18:0x0172, B:30:0x006d, B:33:0x0081, B:35:0x0085, B:37:0x0089, B:40:0x008f, B:42:0x0093, B:45:0x00a0, B:46:0x00a5, B:47:0x0107, B:49:0x010b, B:52:0x0111, B:54:0x011d, B:57:0x0123, B:59:0x012a, B:65:0x0139, B:69:0x0141, B:70:0x0146, B:74:0x0144, B:75:0x00a6, B:77:0x00aa, B:79:0x00ae, B:81:0x00b2, B:84:0x00b7, B:86:0x00bb, B:88:0x00c8, B:91:0x00d1, B:95:0x00e3, B:96:0x00e8, B:97:0x00e9, B:100:0x00f2, B:101:0x00f7, B:102:0x00f8, B:104:0x00fc, B:107:0x0101, B:108:0x0106), top: B:29:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #1 {all -> 0x009c, blocks: (B:14:0x0161, B:16:0x016c, B:18:0x0172, B:30:0x006d, B:33:0x0081, B:35:0x0085, B:37:0x0089, B:40:0x008f, B:42:0x0093, B:45:0x00a0, B:46:0x00a5, B:47:0x0107, B:49:0x010b, B:52:0x0111, B:54:0x011d, B:57:0x0123, B:59:0x012a, B:65:0x0139, B:69:0x0141, B:70:0x0146, B:74:0x0144, B:75:0x00a6, B:77:0x00aa, B:79:0x00ae, B:81:0x00b2, B:84:0x00b7, B:86:0x00bb, B:88:0x00c8, B:91:0x00d1, B:95:0x00e3, B:96:0x00e8, B:97:0x00e9, B:100:0x00f2, B:101:0x00f7, B:102:0x00f8, B:104:0x00fc, B:107:0x0101, B:108:0x0106), top: B:29:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111 A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #1 {all -> 0x009c, blocks: (B:14:0x0161, B:16:0x016c, B:18:0x0172, B:30:0x006d, B:33:0x0081, B:35:0x0085, B:37:0x0089, B:40:0x008f, B:42:0x0093, B:45:0x00a0, B:46:0x00a5, B:47:0x0107, B:49:0x010b, B:52:0x0111, B:54:0x011d, B:57:0x0123, B:59:0x012a, B:65:0x0139, B:69:0x0141, B:70:0x0146, B:74:0x0144, B:75:0x00a6, B:77:0x00aa, B:79:0x00ae, B:81:0x00b2, B:84:0x00b7, B:86:0x00bb, B:88:0x00c8, B:91:0x00d1, B:95:0x00e3, B:96:0x00e8, B:97:0x00e9, B:100:0x00f2, B:101:0x00f7, B:102:0x00f8, B:104:0x00fc, B:107:0x0101, B:108:0x0106), top: B:29:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a6 A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:14:0x0161, B:16:0x016c, B:18:0x0172, B:30:0x006d, B:33:0x0081, B:35:0x0085, B:37:0x0089, B:40:0x008f, B:42:0x0093, B:45:0x00a0, B:46:0x00a5, B:47:0x0107, B:49:0x010b, B:52:0x0111, B:54:0x011d, B:57:0x0123, B:59:0x012a, B:65:0x0139, B:69:0x0141, B:70:0x0146, B:74:0x0144, B:75:0x00a6, B:77:0x00aa, B:79:0x00ae, B:81:0x00b2, B:84:0x00b7, B:86:0x00bb, B:88:0x00c8, B:91:0x00d1, B:95:0x00e3, B:96:0x00e8, B:97:0x00e9, B:100:0x00f2, B:101:0x00f7, B:102:0x00f8, B:104:0x00fc, B:107:0x0101, B:108:0x0106), top: B:29:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(qxu qxuVar, cg6 cg6Var) {
        qt7 qt7Var;
        int i;
        oqi oqiVar;
        au7 au7Var;
        int i2;
        oqi oqiVar2;
        mwu mwuVar;
        boolean d;
        xvu G;
        qxu qxuVar2;
        au7 au7Var2;
        xvu xvuVar;
        rdg rdgVar;
        try {
            if (cg6Var instanceof qt7) {
                qt7Var = (qt7) cg6Var;
                int i3 = qt7Var.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    qt7Var.q = i3 - Integer.MIN_VALUE;
                    Object obj = qt7Var.o;
                    nm6 nm6Var = nm6.a;
                    i = qt7Var.q;
                    boolean z = false;
                    if (i != 0) {
                        qgg.h0(obj);
                        au7 au7Var3 = (au7) this.a;
                        qqi qqiVar = (qqi) au7Var3.m;
                        qt7Var.j = qxuVar;
                        qt7Var.k = qqiVar;
                        qt7Var.l = au7Var3;
                        qt7Var.n = 0;
                        qt7Var.q = 1;
                        if (qqiVar.a(qt7Var) != nm6Var) {
                            oqiVar = qqiVar;
                            au7Var = au7Var3;
                            i2 = 0;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xvuVar = qt7Var.m;
                        au7Var2 = qt7Var.l;
                        oqiVar2 = qt7Var.k;
                        qxuVar2 = qt7Var.j;
                        try {
                            qgg.h0(obj);
                            G = xvuVar;
                            qxuVar = qxuVar2;
                            oqiVar = oqiVar2;
                            au7Var = au7Var2;
                            ((xdr) au7Var.o).l(G);
                            if ((qxuVar instanceof oxu) && (rdgVar = ((oxu) qxuVar).b) != null) {
                                rdgVar.a();
                            }
                            oqiVar.b(null);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    int i4 = qt7Var.n;
                    au7Var = qt7Var.l;
                    oqiVar = qt7Var.k;
                    qxu qxuVar3 = qt7Var.j;
                    qgg.h0(obj);
                    i2 = i4;
                    qxuVar = qxuVar3;
                    mwuVar = (mwu) ((xdr) au7Var.o).getValue();
                    d = Intrinsics.d(mwuVar, yvu.a);
                    ecn ecnVar = ecn.a;
                    if (d) {
                        if (mwuVar instanceof bwu) {
                            if (!(qxuVar instanceof pxu) && !(qxuVar instanceof oxu) && !(qxuVar instanceof nxu)) {
                                if (!(qxuVar instanceof mxu)) {
                                    throw new x7j();
                                }
                                if (((bwu) mwuVar).a.a.a.f == 0) {
                                    au7Var.l(ecnVar);
                                    Unit unit = Unit.a;
                                    oqiVar.b(null);
                                    return unit;
                                }
                                int ordinal = hdg.W(((bwu) mwuVar).b).ordinal();
                                if (ordinal == 0) {
                                    au7Var.l(ecnVar);
                                    Unit unit2 = Unit.a;
                                    oqiVar.b(null);
                                    return unit2;
                                }
                                if (ordinal != 1) {
                                    throw new x7j();
                                }
                            }
                        } else if (!(mwuVar instanceof fwu) && !(mwuVar instanceof gwu)) {
                            throw new x7j();
                        }
                    } else if (!(qxuVar instanceof pxu) && !(qxuVar instanceof oxu) && !(qxuVar instanceof nxu)) {
                        if (!(qxuVar instanceof mxu)) {
                            throw new x7j();
                        }
                        au7Var.l(ecnVar);
                        Unit unit3 = Unit.a;
                        oqiVar.b(null);
                        return unit3;
                    }
                    if (mwuVar instanceof xvu) {
                        Unit unit4 = Unit.a;
                        oqiVar.b(null);
                        return unit4;
                    }
                    E(qxuVar);
                    G = G((xvu) mwuVar, qxuVar);
                    if (G == null) {
                        Unit unit5 = Unit.a;
                        oqiVar.b(null);
                        return unit5;
                    }
                    b(qxuVar);
                    if (qxuVar instanceof oxu) {
                        if (((oxu) qxuVar).c == ixu.c) {
                            z = true;
                        }
                    }
                    if ((mwuVar instanceof bwu) || z) {
                        v5j v5jVar = z ? v5j.c : v5j.d;
                        qt7Var.j = qxuVar;
                        qt7Var.k = oqiVar;
                        qt7Var.l = au7Var;
                        qt7Var.m = G;
                        qt7Var.n = i2;
                        qt7Var.q = 2;
                        if (au7.a(au7Var, mwuVar, G, v5jVar, qt7Var) != nm6Var) {
                            qxuVar2 = qxuVar;
                            au7Var2 = au7Var;
                            oqiVar2 = oqiVar;
                            xvuVar = G;
                            G = xvuVar;
                            qxuVar = qxuVar2;
                            oqiVar = oqiVar2;
                            au7Var = au7Var2;
                        }
                        return nm6Var;
                    }
                    ((xdr) au7Var.o).l(G);
                    if (qxuVar instanceof oxu) {
                        rdgVar.a();
                    }
                    oqiVar.b(null);
                    return Unit.a;
                }
            }
            mwuVar = (mwu) ((xdr) au7Var.o).getValue();
            d = Intrinsics.d(mwuVar, yvu.a);
            ecn ecnVar2 = ecn.a;
            if (d) {
            }
            if (mwuVar instanceof xvu) {
            }
        } catch (Throwable th2) {
            th = th2;
            oqiVar2 = oqiVar;
            oqiVar2.b(null);
            throw th;
        }
        qt7Var = new qt7(this, cg6Var);
        Object obj2 = qt7Var.o;
        nm6 nm6Var2 = nm6.a;
        i = qt7Var.q;
        boolean z2 = false;
        if (i != 0) {
        }
    }

    @Override // defpackage.ls6
    public void onResult(Object obj) {
        o7d o7dVar = (o7d) obj;
        o7dVar.getClass();
        zt3 zt3Var = (zt3) this.a;
        if (zt3Var.w()) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(o7dVar);
        }
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        mgk mgkVar = (mgk) obj;
        mgkVar.getClass();
        e57 e57Var = (e57) this.a;
        x97.y(ot0.F(e57Var), null, null, new bv6(e57Var, mgkVar, null, 11), 3);
    }

    public vb q(int i) {
        return null;
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        gw0 gw0Var = (gw0) this.a;
        z0j z0jVar = gw0Var.l;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) z0jVar.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            z0jVar.c = null;
        }
        z0jVar.b = false;
        gw0Var.j = null;
        gw0Var.e = false;
        kkp kkpVar = gw0Var.d;
        kkpVar.b = null;
        ((HashMap) kkpVar.c).clear();
        if (gw0Var.k) {
            gw0Var.k = false;
        }
    }

    public File s(String str) {
        File file = new File(w(), p(str, t9c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(w(), p(str, t9c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(w(), p(str, t9c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public synchronized boolean t() {
        return ((SharedPreferences) this.a).getBoolean("AESTHETE_CAPPING", false);
    }

    public void u(Throwable th) {
        uh4 uh4Var = (uh4) this.a;
        fi4 fi4Var = uh4Var.a;
        qdc qdcVar = fi4Var.h;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        qdcVar.sendEvent("wm_auth_error", tah.b(new Pair(Constants.KEY_MESSAGE, message)));
        uh4Var.c = false;
        uh4Var.d = false;
        g5r g5rVar = fi4Var.d.j;
        if (g5rVar != null) {
            g5rVar.invoke(th);
        }
        fi4Var.getClass();
        fi4Var.j(new zh4(th));
        fi4Var.P.c();
    }

    public void v(String str) {
        uh4 uh4Var = (uh4) this.a;
        final fi4 fi4Var = uh4Var.a;
        qdc qdcVar = fi4Var.h;
        k5r.t(qdcVar, qdcVar, "wm_auth_successful");
        qdc qdcVar2 = fi4Var.h;
        v3f v3fVar = fi4Var.N;
        SupportInfoProvider supportInfoProvider = fi4Var.f;
        t3f e = fi4Var.e();
        jtc jtcVar = fi4Var.B;
        if (jtcVar == null) {
            Intrinsics.j("jsExecutor");
            throw null;
        }
        m8d m8dVar = new m8d(supportInfoProvider, e, jtcVar, qdcVar2);
        v3fVar.getClass();
        HashSet hashSet = v3fVar.h;
        hashSet.add(m8dVar);
        hashSet.add(new i9d((jsr) fi4Var.I.getValue(), qdcVar2));
        String C = hld.C();
        mcv mcvVar = new mcv() { // from class: xh4
            @Override // defpackage.mcv
            public final void a(hie hieVar) {
                k0j k0jVar;
                JSONObject B;
                JSONObject B2;
                JSONObject B3;
                String F;
                fi4 fi4Var2 = fi4.this;
                qdc qdcVar3 = fi4Var2.h;
                v3f v3fVar2 = fi4Var2.N;
                JSONObject jSONObject = hieVar.c;
                if (jSONObject != null && (B = vnj.B("data", jSONObject)) != null && (B2 = vnj.B("payload", B)) != null && (B3 = vnj.B("hosts", B2)) != null && (F = vnj.F("filesHost", B3)) != null) {
                    fi4Var2.K = F;
                }
                ndv ndvVar = new ndv("*");
                fi4Var2.l(fi4Var2.j.s(ndvVar));
                fi4Var2.w = ndvVar;
                ei4 ei4Var = new ei4(fi4Var2, 0);
                v3fVar2.getClass();
                HashSet hashSet2 = v3fVar2.h;
                hashSet2.add(ei4Var);
                hashSet2.add(new ei4(fi4Var2, 1));
                dzd dzdVar = fi4Var2.v;
                if (dzdVar != null) {
                    wh4 wh4Var = new wh4(fi4Var2, 2);
                    ((ArrayList) dzdVar.f).add(wh4Var);
                    wh4Var.invoke(Boolean.valueOf(dzdVar.a));
                    k0jVar = new k0j(1, dzdVar, wh4Var);
                } else {
                    k0jVar = null;
                }
                fi4Var2.y.setValue(fi4Var2, fi4.Q[3], k0jVar);
                qdcVar3.getClass();
                dwt.b(new zya(18, qdcVar3, "wm_web_ready_for_chat"));
                t1f t1fVar = fi4Var2.q;
                t1fVar.getClass();
                b2k b2kVar = (b2k) t1fVar.d;
                if (b2kVar != null) {
                    b2kVar.e = Long.valueOf(SystemClock.elapsedRealtime());
                }
                fi4Var2.t = true;
                fi4Var2.h();
                imf imfVar = fi4Var2.l;
                t3f e2 = fi4Var2.e();
                jtc jtcVar2 = fi4Var2.B;
                if (jtcVar2 == null) {
                    Intrinsics.j("jsExecutor");
                    throw null;
                }
                e2.getClass();
                jtcVar2.getClass();
                v3fVar2.getClass();
                qdcVar3.getClass();
                eps epsVar = new eps();
                epsVar.a = new LinkedHashMap();
                epsVar.c = e2;
                epsVar.d = jtcVar2;
                epsVar.e = v3fVar2;
                epsVar.f = qdcVar3;
                epsVar.g = new LinkedHashMap();
                imfVar.getClass();
                for (ChatRequest chatRequest : imfVar.a.keySet()) {
                    chatRequest.getClass();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) epsVar.a;
                    if (((String) linkedHashMap.get(chatRequest)) == null) {
                        rbv rbvVar = new rbv(epsVar, chatRequest);
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) epsVar.g;
                        String str2 = rbvVar.a;
                        linkedHashMap2.put(str2, rbvVar);
                        qdc qdcVar4 = (qdc) epsVar.f;
                        qdcVar4.getClass();
                        dwt.b(new zya(18, qdcVar4, "wm_web_observe " + str2 + " for " + chatRequest));
                        linkedHashMap.put(chatRequest, str2);
                    }
                }
                imfVar.b.add(epsVar);
                epsVar.b = imfVar;
                fi4Var2.M.setValue(fi4Var2, fi4.Q[4], new c02(2, epsVar, imfVar));
            }
        };
        C.getClass();
        v3fVar.f.put(C, mcvVar);
        jtc jtcVar2 = fi4Var.B;
        if (jtcVar2 == null) {
            Intrinsics.j("jsExecutor");
            throw null;
        }
        t3f e2 = fi4Var.e();
        e2.getClass();
        nnd nndVar = e2.a;
        nndVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String c2 = ((n) nndVar.b).c();
        if (c2 != null) {
            jSONObject2.put(AirPlayServiceConfig.KEY_AUTH_TOKEN, c2);
        }
        jSONObject.put("widgetTransport", jSONObject2);
        JSONObject J = nnd.J(nndVar, b0i.Registration, jSONObject, C);
        String a = t3f.a(new String[]{"'sent ping'", "sentPing"});
        String a2 = t3f.a(new String[]{"'received incoming ping'"});
        String a3 = t3f.a(new String[]{"'received pong'"});
        String a4 = t3f.a(new String[]{"'received my ping'"});
        String a5 = t3f.a(new String[]{"'received unknown ping'", "JSON.stringify(event)", "event.data"});
        String a6 = t3f.a(new String[]{"'received unknown pong'", "JSON.stringify(event)", "event.data"});
        String a7 = t3f.a(new String[]{"'received undefined message'", "JSON.stringify(event)", "event.data"});
        String a8 = t3f.a(new String[]{"'Channel ready:'", "androidMessengerChannel"});
        String a9 = t3f.a(new String[]{"'Message received:'", "e"});
        StringBuilder m = f1d.m("\n            var androidMessengerChannel;\n            let timeoutId = -1;\n            let debug = false;\n            let sentPing = '@@@@ping_", C, "';\n            let receivedPong = '@@@@pong_", C, "';\n            let webSentPing = '@@@@ping';\n            let webReceivedPong = '@@@@pong';\n            window.opener = window;\n            if (document.readyState == \"complete\") {\n                onLoad();\n            } else {\n                window.addEventListener(\"load\", function() {\n                    onLoad();\n                });\n            }\n            function onLoad() {\n                window.addEventListener('message', handleMessage);\n                ping();\n            }\n            function ping() {\n                window.postMessage(sentPing, '*');\n                ");
        su4.v(m, a, "\n                timeoutId = setTimeout(ping, 10);\n            }\n            function handleMessage(event) {\n                if (event.data === webSentPing) {\n                    ", a2, "\n                    window.postMessage(webReceivedPong, '*');\n                    openPort();\n                    return;\n                }\n                if (event.data === receivedPong) {\n                    ");
        su4.v(m, a3, "\n                    openPort();\n                    return;\n                }\n                if (!debug) return\n                if (event.data === sentPing) {\n                    ", a4, "\n                    return;\n                }\n                if (event.data.startsWith('@@@@ping')) {\n                    ");
        su4.v(m, a5, "\n                    return;\n                }\n                if (event.data.startsWith('@@@@pong')) {\n                    ", a6, "\n                    return;\n                }\n                ");
        su4.v(m, a7, "\n            }\n            function openPort() {\n                clearTimeout(timeoutId);\n                window.removeEventListener('message', handleMessage);\n                openPortInternal();\n            }\n            function openPortInternal() {\n                androidMessengerChannel = new MessageChannel();\n                ", a8, "\n\n                androidMessengerChannel.port1.onmessage = function(e) {\n                    ");
        m.append(a9);
        m.append("\n                    androidListener.receiveMessage(JSON.stringify(e.data));\n                };\n                androidMessengerChannel.port1.start();\n                window.postMessage(");
        m.append(J);
        m.append(", '*', [androidMessengerChannel.port2]);\n            }\n        ");
        jtc.v(jtcVar2, m.toString());
        fi4Var.A = true;
        t1f t1fVar = fi4Var.q;
        t1fVar.getClass();
        b2k b2kVar = (b2k) t1fVar.d;
        if (b2kVar != null) {
            b2kVar.d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        uh4Var.c = false;
        fi4Var.P.b();
        h02 h02Var = fi4Var.d;
        th4 th4Var = new th4(uh4Var);
        h02Var.getClass();
        qdc qdcVar3 = h02Var.c;
        k5r.t(qdcVar3, qdcVar3, "wm_auth_subscribe_on_next_token_changes");
        h02Var.i.add(th4Var);
        fi4Var.r.setValue(fi4Var, fi4.Q[1], new c02(0, h02Var, th4Var));
    }

    public File w() {
        File file = new File(((oif) this.a).a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        xdr xdrVar = ((e57) this.a).F;
        tcp tcpVar = new tcp(bfkVar);
        xdrVar.getClass();
        xdrVar.m(null, tcpVar);
    }

    public boolean y(int i, int i2, Bundle bundle) {
        return false;
    }

    public void z(int i, String str, boolean z) {
        if (i == 0) {
            return;
        }
        ((j66) this.a).o0(l(str).v(i), jk9.PX, z);
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
    }

    public /* synthetic */ jzi(Object obj) {
        this.a = obj;
    }

    public jzi(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    public void a(int i, vb vbVar, String str, Bundle bundle) {
    }
}
