package defpackage;

import android.content.ActivityNotFoundException;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import com.yandex.music.shared.utils.file.SharedFileProvider;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.cover.upload.UploadCoverService;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public final class iz7 {
    public Object a = new vgo();
    public Object b = new vgo();
    public Object c = new vgo();
    public Object d = new vgo();
    public Object e = new h5(0.0f);
    public Object f = new h5(0.0f);
    public Object g = new h5(0.0f);
    public Object h = new h5(0.0f);
    public Object i = new h1b();
    public Object j = new h1b();
    public Object k = new h1b();
    public Object l = new h1b();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(iz7 iz7Var, ned nedVar, med[] medVarArr, long j, cg6 cg6Var) {
        sed sedVar;
        int i;
        med[] medVarArr2;
        Pair pair;
        tlb tlbVar;
        iz7Var.getClass();
        if (cg6Var instanceof sed) {
            sedVar = (sed) cg6Var;
            int i2 = sedVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sedVar.m = i2 - Integer.MIN_VALUE;
                sed sedVar2 = sedVar;
                Object obj = sedVar2.k;
                nm6 nm6Var = nm6.a;
                i = sedVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!nedVar.b || !p6g.C((e6l) ((oq7) ((jyr) iz7Var.g).getValue()).a.c.getValue())) {
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ked.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        ((ked) qdcVar.C(I)).h = false;
                        sedVar2.j = medVarArr;
                        sedVar2.m = 1;
                        obj = x97.V(dm6.b, new f84(j, iz7Var, medVarArr, (Continuation) null, 2), sedVar2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        medVarArr2 = medVarArr;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                medVarArr2 = sedVar2.j;
                qgg.h0(obj);
                pair = (Pair) obj;
                if (pair == null) {
                    ggd ggdVar = (ggd) pair.a;
                    med medVar = (med) pair.b;
                    akd akdVar = (akd) ((jyr) iz7Var.i).getValue();
                    String a = ggdVar.a();
                    akdVar.getClass();
                    a.getClass();
                    if (!akdVar.c.b().getBoolean(a, true)) {
                        return Unit.a;
                    }
                    nmb nmbVar = j74.a;
                    okb okbVar = okb.Station;
                    slb slbVar = slb.Other;
                    int i3 = medVar == null ? -1 : i74.a[medVar.ordinal()];
                    if (i3 == -1) {
                        tlbVar = tlb.Ondemand;
                    } else if (i3 == 1) {
                        tlbVar = tlb.Holding;
                    } else {
                        if (i3 != 2) {
                            b6e.s();
                            return null;
                        }
                        tlbVar = tlb.Autoconnect;
                    }
                    j74.a(okbVar, slbVar, tlbVar);
                    odd oddVar = (odd) iz7Var.a;
                    String a2 = ggdVar.a();
                    a2.getClass();
                    x97.y(oddVar.f, null, null, new akc(oddVar, a2, new gx4(oddVar, false, null, a2, null, null), null, 11), 3);
                } else if (xz0.u(medVarArr2, med.a)) {
                    SharedPreferences.Editor edit = ((agd) ((jyr) iz7Var.e).getValue()).b().edit();
                    edit.putBoolean("LAST_KNOWN_STATION_HOLDING_ENABLED", false);
                    edit.apply();
                }
                return Unit.a;
            }
        }
        sedVar = new sed(iz7Var, cg6Var);
        sed sedVar22 = sedVar;
        Object obj2 = sedVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = sedVar22.m;
        if (i != 0) {
        }
        pair = (Pair) obj2;
        if (pair == null) {
        }
        return Unit.a;
    }

    public static final Object b(iz7 iz7Var, boolean z, String str, String str2, z77 z77Var, String str3, r32 r32Var) {
        Object[] objArr = {Boolean.valueOf(z), null, null, null, null, str, str2, z77Var, str3};
        gpi gpiVar = new gpi(9);
        int i = gpiVar.b + 9;
        Object[] objArr2 = gpiVar.a;
        if (objArr2.length < i) {
            gpiVar.k(i, objArr2);
        }
        uz0.i(objArr, gpiVar.a, gpiVar.b, 0, 0, 12);
        gpiVar.b += 9;
        String gpiVar2 = gpiVar.toString();
        return ((t1f) iz7Var.l).Z(gpiVar2, new l9m(iz7Var, z, str, str2, z77Var, str3, gpiVar2, null), r32Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ca, code lost:
    
        if (r14 != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x006a, code lost:
    
        if (r14 == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(iz7 iz7Var, boolean z, String str, String str2, z77 z77Var, String str3, cg6 cg6Var) {
        m9m m9mVar;
        int i;
        Object t7oVar;
        b6o b6oVar;
        String name;
        amg amgVar;
        i5f i5fVar = (i5f) iz7Var.e;
        z0i z0iVar = (z0i) iz7Var.f;
        if (cg6Var instanceof m9m) {
            m9mVar = (m9m) cg6Var;
            int i2 = m9mVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m9mVar.p = i2 - Integer.MIN_VALUE;
                Object obj = m9mVar.n;
                nm6 nm6Var = nm6.a;
                i = m9mVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    m9mVar.k = str;
                    m9mVar.l = z77Var;
                    m9mVar.m = str3;
                    m9mVar.j = z;
                    m9mVar.p = 1;
                    b5m b5mVar = (b5m) iz7Var.g;
                    if (str2 != null) {
                        Object invoke = b5mVar.invoke(new yz1(z77Var, str2), m9mVar);
                        if (invoke != nm6Var) {
                            invoke = (String) invoke;
                        }
                        obj = invoke;
                    } else {
                        obj = null;
                    }
                } else if (i == 1) {
                    z = m9mVar.j;
                    str3 = m9mVar.m;
                    z77Var = m9mVar.l;
                    str = m9mVar.k;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj.getClass();
                    InputStream inputStream = ((i7e) obj).c;
                    if (inputStream == null) {
                        xq0.q("bodyInputStream is null");
                        return null;
                    }
                    try {
                        c6o c6oVar = (c6o) i4w.C(i5fVar, c6o.Companion.serializer(), inputStream);
                        inputStream.close();
                        c6oVar.getClass();
                        try {
                            r7o r7oVar = z7o.b;
                            b6oVar = c6oVar.a;
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th);
                        }
                        if (b6oVar == null) {
                            throw new IllegalStateException("data is null");
                        }
                        w5o w5oVar = b6oVar.a;
                        if (w5oVar == null) {
                            throw new IllegalStateException("balance is null");
                        }
                        String str4 = w5oVar.a;
                        if (str4 == null) {
                            throw new IllegalStateException("amount is null");
                        }
                        v5o v5oVar = w5oVar.b;
                        if (v5oVar == null || (name = v5oVar.name()) == null) {
                            throw new IllegalStateException("currency is null");
                        }
                        a6o a6oVar = b6oVar.b;
                        int i3 = a6oVar == null ? -1 : cmg.a[a6oVar.ordinal()];
                        if (i3 == -1) {
                            throw new IllegalStateException("plusSubscriptionStatus is null");
                        }
                        if (i3 == 1) {
                            amgVar = amg.a;
                        } else if (i3 == 2) {
                            amgVar = amg.b;
                        } else {
                            if (i3 != 3) {
                                throw new x7j();
                            }
                            amgVar = amg.c;
                        }
                        t7oVar = new bmg(str4, name, amgVar);
                        qgg.h0(t7oVar);
                        return t7oVar;
                    } finally {
                    }
                }
                String str5 = (String) obj;
                y3e y3eVar = (y3e) iz7Var.d;
                if (str == null) {
                    str = (String) iz7Var.a;
                }
                LinkedHashMap b = y3eVar.b(str5, str, str3);
                r5o r5oVar = new r5o(null, null, null);
                String concat = (!z ? ((ujl) iz7Var.c).c(z77Var) : ((tjl) iz7Var.b).i(z77Var)).concat("/v1/plus-state");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                i4w.D(i5fVar, r5o.Companion.serializer(), r5oVar, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                g7e g7eVar = new g7e(concat, b, new ByteArrayInputStream(byteArray));
                m9mVar.k = null;
                m9mVar.l = null;
                m9mVar.m = null;
                m9mVar.j = z;
                m9mVar.p = 2;
                obj = z0iVar.invoke(g7eVar, m9mVar);
            }
        }
        m9mVar = new m9m(iz7Var, cg6Var);
        Object obj2 = m9mVar.n;
        nm6 nm6Var2 = nm6.a;
        i = m9mVar.p;
        if (i != 0) {
        }
        String str52 = (String) obj2;
        y3e y3eVar2 = (y3e) iz7Var.d;
        if (str == null) {
        }
        LinkedHashMap b2 = y3eVar2.b(str52, str, str3);
        r5o r5oVar2 = new r5o(null, null, null);
        String concat2 = (!z ? ((ujl) iz7Var.c).c(z77Var) : ((tjl) iz7Var.b).i(z77Var)).concat("/v1/plus-state");
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        i4w.D(i5fVar, r5o.Companion.serializer(), r5oVar2, byteArrayOutputStream2);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        byteArray2.getClass();
        g7e g7eVar2 = new g7e(concat2, b2, new ByteArrayInputStream(byteArray2));
        m9mVar.k = null;
        m9mVar.l = null;
        m9mVar.m = null;
        m9mVar.j = z;
        m9mVar.p = 2;
        obj2 = z0iVar.invoke(g7eVar2, m9mVar);
    }

    public static final void d(iz7 iz7Var, cvl cvlVar) {
        iz7Var.getClass();
        co6 c = op7.c(cvlVar);
        CoverPath coverPath = c.a;
        ixc ixcVar = (ixc) iz7Var.d;
        if (ixcVar == null) {
            Intrinsics.j("data");
            throw null;
        }
        if (Intrinsics.d(coverPath, ixcVar.c)) {
            tn6 tn6Var = cvlVar.p;
            ixc ixcVar2 = (ixc) iz7Var.d;
            if (ixcVar2 == null) {
                Intrinsics.j("data");
                throw null;
            }
            if (Intrinsics.d(tn6Var, ixcVar2.e)) {
                return;
            }
        }
        ixc ixcVar3 = (ixc) iz7Var.d;
        if (ixcVar3 == null) {
            Intrinsics.j("data");
            throw null;
        }
        CoverPath coverPath2 = c.a;
        qo6 qo6Var = c.b;
        tn6 tn6Var2 = cvlVar.p;
        String str = ixcVar3.a;
        String str2 = ixcVar3.b;
        String str3 = ixcVar3.f;
        String str4 = ixcVar3.g;
        String str5 = ixcVar3.h;
        String str6 = ixcVar3.i;
        str2.getClass();
        coverPath2.getClass();
        qo6Var.getClass();
        ixc ixcVar4 = new ixc(str, str2, coverPath2, qo6Var, tn6Var2, str3, str4, str5, str6);
        iz7Var.d = ixcVar4;
        rxc rxcVar = (rxc) iz7Var.c;
        if (rxcVar != null) {
            rxcVar.b(ixcVar4);
        }
        n7b n7bVar = (n7b) iz7Var.b;
        if (n7bVar != null) {
            ixc ixcVar5 = (ixc) iz7Var.d;
            if (ixcVar5 != null) {
                ((FullInfoActivity) n7bVar.a).c = ixcVar5;
            } else {
                Intrinsics.j("data");
                throw null;
            }
        }
    }

    public static void l(iz7 iz7Var, ned nedVar, med[] medVarArr) {
        if (((odd) iz7Var.a).d().a) {
            return;
        }
        Continuation continuation = null;
        ssg.a(3, null, hrg.q("try recovery: [", xz0.J(medVarArr, null, h01.m, 31), "]"), null);
        ReentrantLock reentrantLock = (ReentrantLock) iz7Var.c;
        reentrantLock.lock();
        try {
            rar rarVar = (rar) iz7Var.d;
            if (rarVar != null) {
                rarVar.g(null);
            }
            iz7Var.d = x97.y((mm6) iz7Var.b, null, null, new akc(iz7Var, nedVar, medVarArr, continuation, 12), 3);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public eup e() {
        eup eupVar = new eup();
        eupVar.a = (ff7) this.a;
        eupVar.b = (ff7) this.b;
        eupVar.c = (ff7) this.c;
        eupVar.d = (ff7) this.d;
        eupVar.e = (zl6) this.e;
        eupVar.f = (zl6) this.f;
        eupVar.g = (zl6) this.g;
        eupVar.h = (zl6) this.h;
        eupVar.i = (h1b) this.i;
        eupVar.j = (h1b) this.j;
        eupVar.k = (h1b) this.k;
        eupVar.l = (h1b) this.l;
        return eupVar;
    }

    public void f() {
        n7b n7bVar = (n7b) this.b;
        if (n7bVar == null) {
            return;
        }
        try {
            zh zhVar = ((FullInfoActivity) n7bVar.a).f;
            if (zhVar != null) {
                xh xhVar = xh.a;
                wh whVar = wh.a;
                rb.s();
                rb.s();
                esk eskVar = new esk();
                eskVar.a = whVar;
                rb.s();
                eskVar.a = xhVar;
                zhVar.a(eskVar);
            }
        } catch (ActivityNotFoundException unused) {
            hag.x((FullInfoActivity) n7bVar.a, R.string.playlist_upload_cover_error_message, 0);
        }
    }

    public void g() {
        ixc ixcVar = (ixc) this.d;
        if (ixcVar == null) {
            Intrinsics.j("data");
            throw null;
        }
        String str = ixcVar.a;
        if (str == null) {
            dfi.r("Can't change album cover", "FullInfoPresenter");
            return;
        }
        int i = UploadCoverService.f;
        FullInfoActivity fullInfoActivity = (FullInfoActivity) this.a;
        String str2 = ixcVar.b;
        str2.getClass();
        cb0.F(fullInfoActivity, str, str2, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(boolean z, String str, String str2, z77 z77Var, String str3, cg6 cg6Var) {
        k9m k9mVar;
        int i;
        if (cg6Var instanceof k9m) {
            k9mVar = (k9m) cg6Var;
            int i2 = k9mVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k9mVar.l = i2 - Integer.MIN_VALUE;
                Object obj = k9mVar.j;
                nm6 nm6Var = nm6.a;
                i = k9mVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ou7 p = x97.p((tf6) this.h, (a) this.i, null, new r32(this, z, str, str2, z77Var, str3, (Continuation) null), 2);
                    k9mVar.l = 1;
                    obj = p.s(k9mVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        k9mVar = new k9m(this, cg6Var);
        Object obj2 = k9mVar.j;
        nm6 nm6Var2 = nm6.a;
        i = k9mVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    public ffc i() {
        if (((ffc) this.d) == null) {
            this.d = (ffc) ((bai) this.j).get();
        }
        return (ffc) this.d;
    }

    public ResponsivenessTracker j() {
        zqr zqrVar = (zqr) this.k;
        if (zqrVar == null) {
            return null;
        }
        if (((ResponsivenessTracker) this.e) == null) {
            this.e = (ResponsivenessTracker) zqrVar.get();
        }
        return (ResponsivenessTracker) this.e;
    }

    public TimeToInteractiveTracker k() {
        if (((TimeToInteractiveTracker) this.b) == null) {
            this.b = (TimeToInteractiveTracker) ((qj7) this.h).get();
        }
        return (TimeToInteractiveTracker) this.b;
    }

    public void m(float f) {
        this.e = new h5(f);
        this.f = new h5(f);
        this.g = new h5(f);
        this.h = new h5(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n() {
        l2j l2jVar;
        paw pawVar = (paw) this.e;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (pawVar != null) {
            pawVar.F((kr5) this.j);
            jr5 jr5Var = (jr5) this.k;
            jr5Var.f.b = new rn3();
            lg7 lg7Var = jr5Var.c;
            int i = 31;
            lg7Var.b = new jg7(str, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, i);
            lg7Var.c = new jg7(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i);
            jr5Var.e.b = 0;
            pawVar.q(jr5Var);
        }
        zkp zkpVar = (zkp) this.i;
        if (zkpVar != null) {
            paw pawVar2 = (paw) this.e;
            if (pawVar2 != null) {
                pawVar2.F(zkpVar);
            }
            paw pawVar3 = (paw) this.e;
            if (pawVar3 != null) {
                pawVar3.q(zkpVar);
            }
        }
        rar rarVar = (rar) this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.f = null;
        taw tawVar = (taw) this.g;
        if (tawVar != null && (l2jVar = (l2j) this.h) != null) {
            l2jVar.a.e(tawVar);
        }
        this.g = null;
        this.h = null;
        this.i = null;
        this.e = null;
    }

    public void o() {
        n7b n7bVar = (n7b) this.b;
        if (n7bVar != null) {
            File file = (File) this.l;
            if (file != null) {
                file.delete();
            }
            Continuation continuation = null;
            this.l = null;
            int i = SharedFileProvider.g;
            File F = c9g.F((FullInfoActivity) this.a, null);
            if (F != null) {
                this.l = F;
                this.k = x97.y(gld.e(dm6.b()), null, null, new akc(n7bVar, this, F, continuation, 7), 3);
            }
        }
    }

    public void p(boolean z) {
        File file = (File) this.l;
        if (!z) {
            if (file != null) {
                file.delete();
            }
            this.l = null;
            return;
        }
        this.l = null;
        if (file == null) {
            n7b n7bVar = (n7b) this.b;
            if (n7bVar != null) {
                hag.x((FullInfoActivity) n7bVar.a, R.string.playlist_upload_cover_error_message, 0);
                return;
            }
            return;
        }
        ixc ixcVar = (ixc) this.d;
        if (ixcVar == null) {
            Intrinsics.j("data");
            throw null;
        }
        String str = ixcVar.a;
        if (str == null) {
            dfi.r("Can't change album cover", "FullInfoPresenter");
            return;
        }
        int i = UploadCoverService.f;
        FullInfoActivity fullInfoActivity = (FullInfoActivity) this.a;
        String str2 = ixcVar.b;
        str2.getClass();
        cb0.F(fullInfoActivity, str, str2, null, file);
    }

    public void q(boolean z, boolean z2) {
        rxc rxcVar = (rxc) this.c;
        if (rxcVar != null) {
            wxf.K((Button) rxcVar.e.a(rxc.i[3]), !z && z2);
        }
        rxc rxcVar2 = (rxc) this.c;
        if (rxcVar2 != null) {
            wxf.K((View) rxcVar2.f.a(rxc.i[4]), z);
        }
    }
}
