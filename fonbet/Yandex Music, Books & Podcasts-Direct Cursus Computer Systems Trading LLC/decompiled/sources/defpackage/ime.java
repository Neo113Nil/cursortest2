package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.Adler32;
import javax.net.ssl.SSLSocket;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes5.dex */
public class ime implements u1o, y1r, x7o, yxk, tgl, wpd {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public ime(q5i q5iVar, q0u q0uVar, o5i o5iVar) {
        fci fciVar;
        int i;
        int i2;
        this.a = 11;
        this.d = q5iVar;
        this.b = new ArrayList();
        o5i o5iVar2 = o5iVar;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            fciVar = fci.ECI;
            if (o5iVar2 == null) {
                break;
            }
            int i5 = o5iVar2.c;
            int i6 = i3 + o5iVar2.d;
            o5i o5iVar3 = o5iVar2.e;
            int i7 = i4;
            fci fciVar2 = o5iVar2.a;
            boolean z = (fciVar2 == fci.BYTE && o5iVar3 == null && i5 != 0) || !(o5iVar3 == null || i5 == o5iVar3.c);
            i = z ? 1 : i7;
            if (o5iVar3 == null || o5iVar3.a != fciVar2 || z) {
                ((ArrayList) this.b).add(0, new p5i(this, fciVar2, o5iVar2.b, i5, i6));
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (z) {
                ((ArrayList) this.b).add(0, new p5i(this, fciVar, o5iVar2.b, o5iVar2.c, 0));
            }
            i4 = i;
            o5iVar2 = o5iVar3;
            i3 = i2;
        }
        int i8 = i4;
        boolean z2 = q5iVar.a;
        int i9 = q5iVar.b;
        if (z2) {
            p5i p5iVar = (p5i) ((ArrayList) this.b).get(0);
            if (p5iVar != null && p5iVar.a != fciVar && i8 != 0) {
                ((ArrayList) this.b).add(0, new p5i(this, fciVar, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((p5i) ((ArrayList) this.b).get(0)).a == fciVar ? 1 : 0, new p5i(this, fci.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i10 = q0uVar.a;
        int i11 = 26;
        int D = ouj.D(i10 <= 9 ? 1 : i10 <= 26 ? 2 : 3);
        if (D == 0) {
            i11 = 9;
        } else if (D != 1) {
            i = 27;
            i11 = 40;
        } else {
            i = 10;
        }
        int w = w(q0uVar);
        while (i10 < i11 && !k6b.c(w, q0u.a(i10), i9)) {
            i10++;
        }
        while (i10 > i && k6b.c(w, q0u.a(i10 - 1), i9)) {
            i10--;
        }
        this.c = q0u.a(i10);
    }

    public static t1f C() {
        t1f t1fVar = new t1f(3, false);
        t1fVar.c = xu1.b;
        t1fVar.d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return t1fVar;
    }

    public static fis H() {
        gis.a.getClass();
        rdi.a.getClass();
        return new fis(rdi.a());
    }

    public static Object I(ime imeVar, z77 z77Var, String str, cg6 cg6Var) {
        tpi tpiVar = vso.b;
        tpiVar.getClass();
        Object obj = imeVar.b;
        Object j0 = x97.p((tf6) imeVar.c, (a) imeVar.d, null, new rfg(z77Var, str, tpiVar, imeVar, null, 9), 2).j0(cg6Var);
        return j0 == nm6.a ? j0 : Unit.a;
    }

    public static Object P(String str, boolean z, aur aurVar) {
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        ihf ihfVar = new ihf(0, z);
        l18 l18Var = l18.b;
        bdt I = hag.I(g0p.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Serializable a = ihfVar.a(g0p.a(), str, aurVar);
        return a == nm6.a ? a : (List) a;
    }

    public static pkb a0(m80 m80Var) {
        int ordinal = m80Var.ordinal();
        if (ordinal == 0) {
            return pkb.Album;
        }
        if (ordinal == 1) {
            return pkb.Artist;
        }
        if (ordinal == 2) {
            return pkb.Playlist;
        }
        if (ordinal == 3) {
            return pkb.Wave;
        }
        if (ordinal == 4) {
            return pkb.Wave;
        }
        if (ordinal == 5) {
            return pkb.Track;
        }
        b6e.s();
        return null;
    }

    public static final Object b(ime imeVar, String str, boolean z, aur aurVar) {
        imeVar.getClass();
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        zn1 zn1Var = new zn1(z);
        l18 l18Var = l18.b;
        bdt I = hag.I(g0p.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Serializable a = zn1Var.a(g0p.a(), str, aurVar);
        return a == nm6.a ? a : (List) a;
    }

    public static final Object d(ime imeVar, String str, boolean z, aur aurVar) {
        imeVar.getClass();
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        jo1 jo1Var = new jo1(z);
        l18 l18Var = l18.b;
        bdt I = hag.I(g0p.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Serializable a = jo1Var.a(g0p.a(), str, aurVar);
        return a == nm6.a ? a : (List) a;
    }

    public static final Object e(ime imeVar, String str, boolean z, aur aurVar) {
        imeVar.getClass();
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        fff fffVar = new fff(z);
        l18 l18Var = l18.b;
        bdt I = hag.I(g0p.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Serializable a = fffVar.a(g0p.a(), str, aurVar);
        return a == nm6.a ? a : (List) a;
    }

    public static final Object f(ime imeVar, String str, paj pajVar, boolean z, Continuation continuation) {
        imeVar.getClass();
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        z0j z0jVar = new z0j(z, pajVar);
        l18 l18Var = l18.b;
        bdt I = hag.I(g0p.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Serializable a0 = z0jVar.a0(g0p.a(), str, continuation);
        return a0 == nm6.a ? a0 : (List) a0;
    }

    public static final Object m(ime imeVar, String str, boolean z, aur aurVar) {
        imeVar.getClass();
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        x4m x4mVar = new x4m((frt) imeVar.b, z);
        l18 l18Var = l18.b;
        bdt I = hag.I(g0p.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Serializable a = x4mVar.a(g0p.a(), str, aurVar);
        return a == nm6.a ? a : (List) a;
    }

    public static final Object n(ime imeVar, String str, boolean z, aur aurVar) {
        imeVar.getClass();
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        ihf ihfVar = new ihf(1, z);
        l18 l18Var = l18.b;
        bdt I = hag.I(g0p.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Serializable a = ihfVar.a(g0p.a(), str, aurVar);
        return a == nm6.a ? a : (List) a;
    }

    public static final ipg o(ime imeVar, oq oqVar) {
        imeVar.getClass();
        oqVar.getClass();
        return u2x.I(oqVar) ? new epg(oqVar) : new bpg(oqVar);
    }

    public static final ipg p(ime imeVar, mqs mqsVar) {
        imeVar.getClass();
        return a4g.G(mqsVar) ? new fpg(mqsVar) : new gpg(mqsVar);
    }

    public static Method v(Class cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return v(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    public Object A(SSLSocket sSLSocket, Object... objArr) {
        try {
            return y(sSLSocket, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean B() {
        Object obj;
        Iterator it = ((ArrayList) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((acg) ((rue) obj)).z.c) {
                break;
            }
        }
        return true ^ (((rue) obj) != null);
    }

    @Override // defpackage.wpd
    public void D(Object obj) {
        cvl cvlVar = (cvl) obj;
        cvlVar.getClass();
        rmb.j((rmb) this.b, wjb.BottomsheetScreen, (thj) this.c, null, 12);
        cxl cxlVar = ((qzl) this.d).b;
        lwg G = g0g.G(cvlVar);
        y supportFragmentManager = cxlVar.a.getSupportFragmentManager();
        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), d.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void E(List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gli gliVar = (gli) it.next();
            if (!(gliVar instanceof rji) && !(gliVar instanceof yki) && !(gliVar instanceof qki) && !(gliVar instanceof vki) && !(gliVar instanceof jki) && !(gliVar instanceof mki)) {
                if ((gliVar instanceof yji) || (gliVar instanceof bli)) {
                    break;
                }
                f80 f80Var = null;
                if (gliVar instanceof fki) {
                    v70 V = ot0.V((fki) gliVar);
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((f80) next).a.equals(V)) {
                            f80Var = next;
                            break;
                        }
                    }
                    if (f80Var == null) {
                        arrayList.add(new f80(V, 0));
                    }
                } else {
                    if (!(gliVar instanceof eli)) {
                        b6e.s();
                        return;
                    }
                    eli eliVar = (eli) gliVar;
                    v70 U = ot0.U((zii) eliVar.b().c, eliVar.a());
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it3.next();
                            if (((f80) obj).a.equals(U)) {
                                break;
                            }
                        }
                    }
                    f80 f80Var2 = (f80) obj;
                    if (f80Var2 != null) {
                        arrayList.remove(f80Var2);
                        f80Var = f80Var2;
                    }
                    arrayList.add(new f80(U, f80Var != null ? 1 + f80Var.b : 1));
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            f80 f80Var3 = (f80) it4.next();
            nmb nmbVar = (nmb) this.d;
            String G = ((fnb) this.b).G();
            wjb wjbVar = wjb.MusicHistoryScreen;
            String b = f80Var3.a.c.a.b();
            v70 v70Var = f80Var3.a;
            w70 w70Var = v70Var.c;
            nmb.m(nmbVar, G, wjbVar, null, null, null, null, null, b, w70Var.b, false, v70Var.a.a, v70Var.b, 1, w70Var.c, f80Var3.b, null, null, null, 0, 492156);
        }
    }

    public void F(j80 j80Var) {
        wjb wjbVar;
        nmb nmbVar = (nmb) this.d;
        k80 k80Var = j80Var.c;
        v70 v70Var = j80Var.a;
        w70 w70Var = v70Var.c;
        l80 l80Var = j80Var.b;
        int ordinal = k80Var.ordinal();
        if (ordinal == 0) {
            wjbVar = wjb.BottomsheetScreen;
        } else if (ordinal == 1) {
            wjbVar = wjb.ArtistScreen;
        } else if (ordinal == 2) {
            wjbVar = wjb.AlbumScreen;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return;
            }
            wjbVar = wjb.PlaylistScreen;
        }
        wjb wjbVar2 = wjb.MusicHistoryScreen;
        pkb a0 = a0(l80Var.a);
        String str = l80Var.b;
        int i = l80Var.c;
        String G = ((fnb) this.b).G();
        String b = w70Var.a.b();
        int i2 = w70Var.b;
        String str2 = v70Var.a.a;
        String str3 = v70Var.b;
        int i3 = w70Var.c;
        nmbVar.n(wjbVar2, wjbVar, G, wjbVar2, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, a0, str, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : i, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : b, (r60 & 16384) != 0 ? 0 : i2, (32768 & r60) != 0 ? false : false, str2, str3, 1, (524288 & r60) != 0 ? 1 : i3, (1048576 & r60) != 0 ? 0 : 0, (2097152 & r60) != 0 ? "" : null, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, "", ((cvo) this.c).a(), "", (r60 & 268435456) != 0 ? "" : null);
    }

    public void G(fki fkiVar) {
        k80 k80Var;
        fkiVar.getClass();
        if (fkiVar instanceof zji) {
            k80Var = k80.c;
        } else if (fkiVar instanceof aki) {
            k80Var = k80.b;
        } else {
            if (!(fkiVar instanceof cki)) {
                if ((fkiVar instanceof eki) || (fkiVar instanceof bki) || (fkiVar instanceof dki)) {
                    return;
                }
                b6e.s();
                return;
            }
            k80Var = k80.d;
        }
        F(new j80(ot0.V(fkiVar), ot0.W(fkiVar), k80Var));
    }

    @Override // defpackage.wpd
    public void J(Object obj) {
        cvl cvlVar = (cvl) obj;
        cvlVar.getClass();
        rmb.j((rmb) this.b, wjb.PlaylistScreen, (thj) this.c, null, 12);
        cxl cxlVar = ((qzl) this.d).b;
        PlaylistScreenActivity playlistScreenActivity = cxlVar.a;
        y7g.O(playlistScreenActivity, ixf.E(playlistScreenActivity, cvlVar, cxlVar.c));
    }

    public void K(de2 de2Var, int i, boolean z) {
        vd2 vd2Var = (vd2) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = de2Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        lsm lsmVar = de2Var.c;
        adler32.update(allocate.putInt(qsm.a(lsmVar)).array());
        byte[] bArr = de2Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        tyf.q("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", de2Var);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((bko) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(qsm.a(lsmVar))});
        try {
            Cursor cursor = rawQuery;
            Long valueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(vd2Var.a(lsmVar, longValue, i));
            Set set = ((wd2) vd2Var.b.get(lsmVar)).c;
            if (set.contains(lto.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(lto.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(lto.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", qsm.a(lsmVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {de2Var, Integer.valueOf(value), Long.valueOf(vd2Var.a(lsmVar, longValue, i)), valueOf, Integer.valueOf(i)};
            String z2 = tyf.z("JobInfoScheduler");
            if (Log.isLoggable(z2, 3)) {
                Log.d(z2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[LOOP:0: B:11:0x008d->B:13:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable L(String str, xdh xdhVar, cg6 cg6Var) {
        kog kogVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof kog) {
            kogVar = (kog) cg6Var;
            int i2 = kogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = kogVar.l;
                nm6 nm6Var = nm6.a;
                i = kogVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    i30 i30Var = new i30(gut.h1((z66) this.c), null);
                    kogVar.j = xdhVar;
                    kogVar.k = H;
                    kogVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object a = i30Var.a(g0p.a(), str, kogVar);
                    if (a != nm6Var) {
                        a = (List) a;
                    }
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = kogVar.k;
                    xdhVar = kogVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((oq) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        kogVar = new kog(this, cg6Var);
        Object obj2 = kogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = kogVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092 A[LOOP:0: B:11:0x008c->B:13:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable M(String str, xdh xdhVar, cg6 cg6Var) {
        log logVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof log) {
            logVar = (log) cg6Var;
            int i2 = logVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logVar.n = i2 - Integer.MIN_VALUE;
                Object obj = logVar.l;
                nm6 nm6Var = nm6.a;
                i = logVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    jo1 jo1Var = new jo1(gut.h1((z66) this.c));
                    logVar.j = xdhVar;
                    logVar.k = H;
                    logVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object a = jo1Var.a(g0p.a(), str, logVar);
                    if (a != nm6Var) {
                        a = (List) a;
                    }
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = logVar.k;
                    xdhVar = logVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((c01) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        logVar = new log(this, cg6Var);
        Object obj2 = logVar.l;
        nm6 nm6Var2 = nm6.a;
        i = logVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092 A[LOOP:0: B:11:0x008c->B:13:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable N(String str, xdh xdhVar, cg6 cg6Var) {
        uog uogVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof uog) {
            uogVar = (uog) cg6Var;
            int i2 = uogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = uogVar.l;
                nm6 nm6Var = nm6.a;
                i = uogVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    fff fffVar = new fff(gut.h1((z66) this.c));
                    uogVar.j = xdhVar;
                    uogVar.k = H;
                    uogVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object a = fffVar.a(g0p.a(), str, uogVar);
                    if (a != nm6Var) {
                        a = (List) a;
                    }
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = uogVar.k;
                    xdhVar = uogVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((cvl) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        uogVar = new uog(this, cg6Var);
        Object obj2 = uogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = uogVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[LOOP:0: B:11:0x008d->B:13:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable O(String str, xdh xdhVar, cg6 cg6Var) {
        vog vogVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof vog) {
            vogVar = (vog) cg6Var;
            int i2 = vogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = vogVar.l;
                nm6 nm6Var = nm6.a;
                i = vogVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    ihf ihfVar = new ihf(0, gut.h1((z66) this.c));
                    vogVar.j = xdhVar;
                    vogVar.k = H;
                    vogVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object a = ihfVar.a(g0p.a(), str, vogVar);
                    if (a != nm6Var) {
                        a = (List) a;
                    }
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = vogVar.k;
                    xdhVar = vogVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((mqs) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        vogVar = new vog(this, cg6Var);
        Object obj2 = vogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = vogVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a A[LOOP:0: B:11:0x0084->B:13:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable Q(String str, xdh xdhVar, cg6 cg6Var) {
        wog wogVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof wog) {
            wogVar = (wog) cg6Var;
            int i2 = wogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = wogVar.l;
                nm6 nm6Var = nm6.a;
                i = wogVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    g60 g60Var = new g60();
                    wogVar.j = xdhVar;
                    wogVar.k = H;
                    wogVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object a = g60Var.a(g0p.a(), str, wogVar);
                    if (a != nm6Var) {
                        a = (List) a;
                    }
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = wogVar.k;
                    xdhVar = wogVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((mqs) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        wogVar = new wog(this, cg6Var);
        Object obj2 = wogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = wogVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092 A[LOOP:0: B:11:0x008c->B:13:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable R(String str, paj pajVar, xdh xdhVar, cg6 cg6Var) {
        xog xogVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof xog) {
            xogVar = (xog) cg6Var;
            int i2 = xogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = xogVar.l;
                nm6 nm6Var = nm6.a;
                i = xogVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    z0j z0jVar = new z0j(gut.h1((z66) this.c), pajVar);
                    xogVar.j = xdhVar;
                    xogVar.k = H;
                    xogVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object a0 = z0jVar.a0(g0p.a(), str, xogVar);
                    if (a0 != nm6Var) {
                        a0 = (List) a0;
                    }
                    if (a0 == nm6Var) {
                        return nm6Var;
                    }
                    obj = a0;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = xogVar.k;
                    xdhVar = xogVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((oq) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        xogVar = new xog(this, cg6Var);
        Object obj2 = xogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = xogVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092 A[LOOP:0: B:11:0x008c->B:13:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable S(String str, xdh xdhVar, zdj zdjVar, boolean z, cg6 cg6Var) {
        yog yogVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof yog) {
            yogVar = (yog) cg6Var;
            int i2 = yogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = yogVar.l;
                nm6 nm6Var = nm6.a;
                i = yogVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    kj3 kj3Var = new kj3(zdjVar, gut.h1((z66) this.c), z);
                    yogVar.j = xdhVar;
                    yogVar.k = H;
                    yogVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object b = kj3Var.b(g0p.a(), str, yogVar);
                    if (b != nm6Var) {
                        b = (List) b;
                    }
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    obj = b;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = yogVar.k;
                    xdhVar = yogVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((mqs) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        yogVar = new yog(this, cg6Var);
        Object obj2 = yogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = yogVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096 A[LOOP:0: B:11:0x0090->B:13:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable T(String str, xdh xdhVar, cg6 cg6Var) {
        zog zogVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof zog) {
            zogVar = (zog) cg6Var;
            int i2 = zogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = zogVar.l;
                nm6 nm6Var = nm6.a;
                i = zogVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    x4m x4mVar = new x4m((frt) this.b, gut.h1((z66) this.c));
                    zogVar.j = xdhVar;
                    zogVar.k = H;
                    zogVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object a = x4mVar.a(g0p.a(), str, zogVar);
                    if (a != nm6Var) {
                        a = (List) a;
                    }
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = zogVar.k;
                    xdhVar = zogVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((cvl) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        zogVar = new zog(this, cg6Var);
        Object obj2 = zogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = zogVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[LOOP:0: B:11:0x008d->B:13:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable U(String str, xdh xdhVar, cg6 cg6Var) {
        apg apgVar;
        int i;
        fis fisVar;
        Iterator it;
        if (cg6Var instanceof apg) {
            apgVar = (apg) cg6Var;
            int i2 = apgVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                apgVar.n = i2 - Integer.MIN_VALUE;
                Object obj = apgVar.l;
                nm6 nm6Var = nm6.a;
                i = apgVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    fis H = H();
                    ihf ihfVar = new ihf(1, gut.h1((z66) this.c));
                    apgVar.j = xdhVar;
                    apgVar.k = H;
                    apgVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Object a = ihfVar.a(g0p.a(), str, apgVar);
                    if (a != nm6Var) {
                        a = (List) a;
                    }
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    fisVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fisVar = apgVar.k;
                    xdhVar = apgVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((x1u) ((Pair) it.next()).b);
                }
                ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
                return arrayList;
            }
        }
        apgVar = new apg(this, cg6Var);
        Object obj2 = apgVar.l;
        nm6 nm6Var2 = nm6.a;
        i = apgVar.n;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ((h6i) this.d).g(wdg.X(xdhVar, fisVar));
        return arrayList2;
    }

    public void V(ofg ofgVar) {
        ofgVar.getClass();
        this.b = ofgVar.a;
        this.d = ofgVar.c;
        this.c = ofgVar.b;
    }

    public void W(pfg pfgVar, qu2 qu2Var) {
        pfgVar.getClass();
        int ordinal = pfgVar.ordinal();
        if (ordinal == 0) {
            this.b = qu2Var;
            return;
        }
        if (ordinal == 1) {
            this.c = qu2Var;
        } else if (ordinal == 2) {
            this.d = qu2Var;
        } else {
            b6e.s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        r1 = new defpackage.mx1(r11.getProductName().toString(), defpackage.kx1.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f3, code lost:
    
        r1 = new defpackage.mx1(r10.getProductName().toString(), defpackage.kx1.c);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X(jvk jvkVar) {
        String str;
        AudioDeviceInfo audioDeviceInfo;
        AudioDeviceInfo audioDeviceInfo2;
        AudioDeviceInfo audioDeviceInfo3;
        AudioDeviceInfo audioDeviceInfo4;
        mx1 mx1Var;
        CharSequence productName;
        String str2;
        dn9 dn9Var = (dn9) this.c;
        String str3 = (String) ((d1j) dn9Var.e).invoke();
        if (str3 != null) {
            jvkVar.l = "googlecast";
            jvkVar.m = str3;
            jvkVar.n = "none";
            return;
        }
        AudioDeviceInfo[] devices = ((AudioManager) ((rx1) dn9Var.f).b.getValue()).getDevices(2);
        devices.getClass();
        int length = devices.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= length) {
                audioDeviceInfo = null;
                break;
            }
            audioDeviceInfo = devices[i2];
            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 23 || audioDeviceInfo.getType() == 27 || (Build.VERSION.SDK_INT >= 31 && audioDeviceInfo.getType() == 26)) {
                break;
            } else {
                i2++;
            }
        }
        if (audioDeviceInfo != null) {
            mx1Var = new mx1(audioDeviceInfo.getProductName().toString(), kx1.a);
        } else {
            int length2 = devices.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    audioDeviceInfo2 = null;
                    break;
                }
                audioDeviceInfo2 = devices[i3];
                if (audioDeviceInfo2.getType() == 9 || audioDeviceInfo2.getType() == 10 || (Build.VERSION.SDK_INT >= 31 && audioDeviceInfo2.getType() == 29)) {
                    break;
                } else {
                    i3++;
                }
            }
            int length3 = devices.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    audioDeviceInfo3 = null;
                    break;
                }
                audioDeviceInfo3 = devices[i4];
                if (audioDeviceInfo3.getType() == 3 || audioDeviceInfo3.getType() == 4 || audioDeviceInfo3.getType() == 11 || audioDeviceInfo3.getType() == 22 || audioDeviceInfo3.getType() == 12 || audioDeviceInfo3.getType() == 19) {
                    break;
                } else {
                    i4++;
                }
            }
            int length4 = devices.length;
            while (true) {
                if (i >= length4) {
                    audioDeviceInfo4 = null;
                    break;
                }
                audioDeviceInfo4 = devices[i];
                if (audioDeviceInfo4.getType() == 2) {
                    break;
                } else {
                    i++;
                }
            }
            if (audioDeviceInfo4 != null) {
                mx1Var = new mx1(audioDeviceInfo4.getProductName().toString(), kx1.d);
            } else {
                AudioDeviceInfo audioDeviceInfo5 = (AudioDeviceInfo) xz0.z(devices);
                if (audioDeviceInfo5 != null && (productName = audioDeviceInfo5.getProductName()) != null) {
                    str = productName.toString();
                }
                mx1Var = new mx1(str, kx1.e);
            }
        }
        boolean d = Intrinsics.d(((dv3) dn9Var.c).c.a.getValue(), yu3.a);
        int ordinal = mx1Var.b.ordinal();
        if (ordinal == 0) {
            str2 = "BLUETOOTH";
        } else if (ordinal == 1) {
            str2 = "TV";
        } else if (ordinal == 2) {
            str2 = "WIRED";
        } else if (ordinal == 3) {
            str2 = "SPEAKER";
        } else {
            if (ordinal != 4) {
                b6e.s();
                return;
            }
            str2 = "OTHER";
        }
        jvkVar.l = str2;
        jvkVar.m = mx1Var.a;
        jvkVar.n = d ? "androidauto" : "none";
    }

    public void Y(twh twhVar) {
        twhVar.getClass();
        if (Intrinsics.d(twhVar.b, "multipart")) {
            this.c = twhVar;
        } else {
            l1j.p(twhVar, "multipart != ");
        }
    }

    public ofg Z() {
        return new ofg((qu2) this.b, (qu2) this.c, (qu2) this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (((defpackage.pxk) r5).d != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0129, code lost:
    
        r30 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013c, code lost:
    
        if (((defpackage.sxk) r5).i != null) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    @Override // defpackage.tgl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yil a(vil vilVar, cvo cvoVar) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        vilVar.getClass();
        cvoVar.getClass();
        lnl lnlVar = ((thl) this.b).b;
        iil iilVar = (iil) this.c;
        n7q n7qVar = (n7q) this.d;
        lnlVar.getClass();
        n7qVar.getClass();
        gs4 gs4Var = vilVar.a;
        cml cmlVar = iilVar.a.b;
        wxk wxkVar = (wxk) cmlVar.a;
        eml emlVar = cmlVar.b;
        l9n l9nVar = iilVar.c;
        h5l h5lVar = iilVar.b;
        nyn nynVar = (nyn) wdg.A(n7qVar, bcn.a);
        yml ymlVar = (yml) wdg.A(n7qVar, ccn.a);
        boolean z5 = ((cvoVar.b == hlb.Fullscreen && !rzf.A(wxkVar)) || (str = wxkVar.b().b) == null || StringsKt.U(str)) ? false : true;
        boolean z6 = (l9nVar.a == null && l9nVar.b == null) ? false : true;
        c94 c94Var = l9nVar.c;
        if (c94Var instanceof z84) {
            z = true;
        } else {
            if (!c94Var.equals(b94.a)) {
                b6e.s();
                return null;
            }
            z = false;
        }
        k9n k9nVar = l9nVar.d;
        k9nVar.getClass();
        if (k9nVar instanceof i9n) {
            z2 = true;
        } else {
            if (!k9nVar.equals(j9n.a)) {
                b6e.s();
                return null;
            }
            z2 = false;
        }
        boolean z7 = !StringsKt.U(wxkVar.getTitle());
        CharSequence subtitle = wxkVar.getSubtitle();
        boolean z8 = !(subtitle == null || StringsKt.U(subtitle));
        boolean D = rzf.D(wxkVar);
        boolean C = rzf.C(wxkVar);
        boolean z9 = emlVar.c;
        boolean z10 = emlVar.b;
        int ordinal = h5lVar.b.ordinal();
        if (ordinal == 0) {
            z3 = false;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                b6e.s();
                return null;
            }
            z3 = true;
        }
        int ordinal2 = h5lVar.c.ordinal();
        if (ordinal2 == 0) {
            z4 = false;
        } else {
            if (ordinal2 != 1 && ordinal2 != 2) {
                b6e.s();
                return null;
            }
            z4 = true;
        }
        j1g j1gVar = emlVar.a;
        boolean z11 = j1gVar == j1g.a;
        boolean z12 = j1gVar == j1g.c;
        boolean booleanValue = ((Boolean) ((t8q) ((jyr) gs4Var.b).getValue()).d.getValue()).booleanValue();
        if (!(wxkVar instanceof uxk) && !(wxkVar instanceof txk)) {
            if (!(wxkVar instanceof pxk)) {
                if (!(wxkVar instanceof oxk)) {
                    if (!(wxkVar instanceof sxk)) {
                        b6e.s();
                        return null;
                    }
                }
            }
            boolean booleanValue2 = ((Boolean) ((z1h) ((jyr) gs4Var.a).getValue()).g.getValue()).booleanValue();
            mqs a = n7qVar.b().a();
            return new yil(z6, z, z2, z5, z7, z8, D, C, z9, z10, z3, z4, true, z11, z12, booleanValue, r30, booleanValue2, (a == null ? hdg.L(a) : null) == null, nynVar != nyn.b, nynVar != nyn.c, ymlVar != yml.a);
        }
        boolean z13 = false;
        boolean booleanValue22 = ((Boolean) ((z1h) ((jyr) gs4Var.a).getValue()).g.getValue()).booleanValue();
        mqs a2 = n7qVar.b().a();
        return new yil(z6, z, z2, z5, z7, z8, D, C, z9, z10, z3, z4, true, z11, z12, booleanValue, z13, booleanValue22, (a2 == null ? hdg.L(a2) : null) == null, nynVar != nyn.b, nynVar != nyn.c, ymlVar != yml.a);
    }

    @Override // defpackage.yxk
    public Object c(foc focVar) {
        focVar.getClass();
        return ((Function0) this.c).invoke();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.yxk
    public Object g(faq faqVar) {
        Function0 function0 = (Function0) this.c;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            naq naqVar = (naq) faqVar;
            uow uowVar = naqVar.d;
            return z8l.a[uowVar.b.ordinal()] == 1 ? ((Function2) this.b).invoke(naqVar.e, q7g.I(uowVar)) : function0.invoke();
        }
        if (faqVar instanceof saq) {
            return ((ezc) this.d).invoke(((saq) faqVar).e);
        }
        if (faqVar instanceof daq) {
            return function0.invoke();
        }
        if (faqVar instanceof qaq) {
            return function0.invoke();
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.yxk
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return ((Function2) this.b).invoke(jzsVar.a, jzsVar.g);
    }

    @Override // defpackage.yxk
    public Object i(m1q m1qVar) {
        Function0 function0 = (Function0) this.c;
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            Function2 function2 = (Function2) this.b;
            mqs mqsVar = ((c2q) m1qVar).d;
            return function2.invoke(mqsVar, y5g.B0(mqsVar, ryt.a));
        }
        if (m1qVar instanceof j1q) {
            return function0.invoke();
        }
        if (m1qVar instanceof e2q) {
            return function0.invoke();
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.yxk
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return ((ezc) this.d).invoke(i5uVar.a);
    }

    @Override // defpackage.yxk
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return ((Function0) this.c).invoke();
    }

    @Override // defpackage.y1r
    public float l(float f) {
        o3k o3kVar = (o3k) this.b;
        z1r z1rVar = o3kVar.l().n;
        List list = o3kVar.l().a;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            nfh nfhVar = (nfh) list.get(i);
            y2k l = o3kVar.l();
            int g = (int) (l.e == bxj.a ? l.g() & 4294967295L : l.g() >> 32);
            int i2 = -o3kVar.l().f;
            int i3 = o3kVar.l().d;
            int i4 = o3kVar.l().b;
            int i5 = nfhVar.l;
            o3kVar.n();
            float a = i5 - z1rVar.a(g, i4, i2, i3);
            if (a <= 0.0f && a > f3) {
                f3 = a;
            }
            if (a >= 0.0f && a < f2) {
                f2 = a;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!o3kVar.d()) {
            if (ywf.A(o3kVar, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!o3kVar.c()) {
            f3 = 0.0f;
            if (!ywf.A(o3kVar, f)) {
                f2 = 0.0f;
            }
        }
        Float valueOf = Float.valueOf(f3);
        Float valueOf2 = Float.valueOf(f2);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        float floatValue3 = ((Number) ((yl0) this.c).invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
        if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != 0.0f) {
            vme.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
        }
        if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return floatValue3;
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        ((Unit) obj).getClass();
        tdk tdkVar = (tdk) this.b;
        rdk rdkVar = (rdk) this.c;
        tdkVar.g = rdkVar;
        ((x7o) this.d).onSuccess(rdkVar.H());
    }

    public vdr q(mwk mwkVar, n7q n7qVar) {
        co6 co6Var = (co6) dag.p(mwkVar, new h1b(n7qVar));
        wnh wnhVar = (wnh) this.b;
        wnhVar.getClass();
        co6Var.getClass();
        return ((qnh) wnhVar.g.a(co6Var)).b;
    }

    @Override // defpackage.y1r
    public float r(float f, float f2) {
        o3k o3kVar = (o3k) this.b;
        int o = o3kVar.o();
        x6k x6kVar = o3kVar.p;
        int i = ((y2k) x6kVar.getValue()).c + o;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = o3kVar.e;
        if (f < 0.0f) {
            i2++;
        }
        int d = yhn.d(((int) (f2 / i)) + i2, 0, o3kVar.n());
        e3k e3kVar = (e3k) this.d;
        o3kVar.o();
        int i3 = ((y2k) x6kVar.getValue()).c;
        int abs = Math.abs((yhn.d(e3kVar.d(i2, f, d), 0, o3kVar.n()) - i2) * i) - i;
        int i4 = abs >= 0 ? abs : 0;
        if (i4 == 0) {
            return i4;
        }
        return Math.signum(f) * i4;
    }

    @Override // defpackage.u1o
    public void reset() {
        this.c = null;
        this.d = null;
    }

    public qu2 s(pfg pfgVar) {
        pfgVar.getClass();
        int ordinal = pfgVar.ordinal();
        if (ordinal == 0) {
            return (qu2) this.b;
        }
        if (ordinal == 1) {
            return (qu2) this.c;
        }
        if (ordinal == 2) {
            return (qu2) this.d;
        }
        b6e.s();
        return null;
    }

    public Method t(Class cls) {
        Class cls2;
        Method v = v(cls, (String) this.b, (Class[]) this.d);
        if (v == null || (cls2 = (Class) this.c) == null || cls2.isAssignableFrom(v.getReturnType())) {
            return v;
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                z0j Y = ezf.Y(this);
                Y.q((List) this.b, "addrs");
                Y.q((xu1) this.c, "attrs");
                Y.q(Arrays.deepToString((Object[][]) this.d), "customOptions");
                return Y.toString();
            case 11:
                StringBuilder sb = new StringBuilder();
                Iterator it = ((ArrayList) this.b).iterator();
                p5i p5iVar = null;
                while (it.hasNext()) {
                    p5i p5iVar2 = (p5i) it.next();
                    if (p5iVar != null) {
                        sb.append(StringUtils.COMMA);
                    }
                    sb.append(p5iVar2.toString());
                    p5iVar = p5iVar2;
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Object u() {
        Object[][] objArr = (Object[][]) this.d;
        for (int i = 0; i < objArr.length; i++) {
            if (ceg.d.equals(objArr[i][0])) {
                return objArr[i][1];
            }
        }
        return null;
    }

    public int w(q0u q0uVar) {
        Iterator it = ((ArrayList) this.b).iterator();
        int i = 0;
        while (it.hasNext()) {
            p5i p5iVar = (p5i) it.next();
            int i2 = p5iVar.d;
            fci fciVar = p5iVar.a;
            int a = fciVar.a(q0uVar);
            int i3 = a + 4;
            int ordinal = fciVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i3 = hrg.B(i2, 2, 11, i3) + (i2 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i3 += p5iVar.a() * 8;
                } else if (ordinal == 5) {
                    i3 = a + 12;
                } else if (ordinal == 6) {
                    i3 += i2 * 13;
                }
            } else {
                int B = hrg.B(i2, 3, 10, i3);
                int i4 = i2 % 3;
                i3 = B + (i4 != 1 ? i4 == 2 ? 7 : 0 : 4);
            }
            i += i3;
        }
        return i;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((tdk) this.b).g = null;
        ((x7o) this.d).x(bfkVar);
    }

    public Object y(SSLSocket sSLSocket, Object... objArr) {
        Method t = t(sSLSocket.getClass());
        if (t == null) {
            throw new AssertionError("Method " + ((String) this.b) + " not supported for object " + sSLSocket);
        }
        try {
            return t.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + t);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public void z(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method t = t(sSLSocket.getClass());
            if (t == null) {
                return;
            }
            try {
                t.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public ime(int i) {
        this.a = i;
        switch (i) {
            case 6:
                l18 l18Var = l18.b;
                this.b = (frt) l18Var.c(hag.I(frt.class));
                this.c = (z66) l18Var.c(hag.I(z66.class));
                this.d = h6i.b;
                break;
            case 12:
                break;
            case 13:
                String e = eta.e();
                pn3 pn3Var = pn3.d;
                this.b = ovn.C(e);
                this.c = bhi.e;
                this.d = new ArrayList();
                break;
            case 15:
                nfg nfgVar = nfg.c;
                this.b = nfgVar;
                this.c = nfgVar;
                this.d = nfgVar;
                break;
            case 27:
                l18 l18Var2 = l18.b;
                bdt I = hag.I(frt.class);
                qdc qdcVar = l18Var2.a;
                qdcVar.getClass();
                this.b = (frt) qdcVar.C(I);
                this.c = l18Var2.b(hag.I(e15.class), true);
                this.d = l18Var2.b(hag.I(v55.class), true);
                break;
            default:
                this.b = new ArrayList();
                this.c = new yjj();
                this.d = new q9g(this);
                break;
        }
    }

    public ime(fnb fnbVar, cvo cvoVar) {
        this.a = 14;
        fnbVar.getClass();
        cvoVar.getClass();
        this.b = fnbVar;
        this.c = cvoVar;
        this.d = qld.m();
    }

    public ime(z5l z5lVar, Context context) {
        this.a = 17;
        this.b = z5lVar;
        this.c = context;
        this.d = hyf.b();
    }

    public ime(e5m e5mVar, tf6 tf6Var, a aVar) {
        this.a = 7;
        aVar.getClass();
        this.b = e5mVar;
        this.c = tf6Var;
        this.d = aVar;
    }

    public ime(wnh wnhVar) {
        this.a = 10;
        wnhVar.getClass();
        this.b = wnhVar;
    }

    public ime(z66 z66Var) {
        this.a = 16;
        tf6 e = gld.e(e.c(a4g.n(), dm6.b));
        x0q b = y0q.b(0, 0, oi3.a, 3);
        this.b = b;
        this.c = new mj(23);
        this.d = new dkn(b);
        ox6.B(zsd.d0(ox6.R(z66Var.d(), new zzi(true, yzi.c, -1)), 1), e, new fmi(4, this));
    }

    public ime(k1l k1lVar, cq4 cq4Var) {
        this.a = 24;
        this.b = k1lVar;
        this.c = cq4Var;
        this.d = y0q.b(0, 0, null, 7);
        x97.y(cq4Var, null, null, new g2l(this, null, 0), 3);
    }

    public ime(Context context, s63 s63Var) {
        this.a = 29;
        context.getClass();
        this.b = context;
        this.c = s63Var;
        this.d = l18.b.b(hag.I(frt.class), true);
    }

    public ime(mqs mqsVar, awc awcVar, qe3 qe3Var, sai saiVar) {
        this.a = 18;
        mqsVar.getClass();
        this.b = mqsVar;
        this.c = awcVar;
        this.d = qe3Var;
    }

    public ime(List list) {
        this.a = 8;
        this.d = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.b).add(new oup(((qbh) list.get(i)).b.b));
            ((ArrayList) this.c).add(((qbh) list.get(i)).c.a());
        }
    }

    public ime(jfu jfuVar) {
        this.a = 3;
        jfuVar.getClass();
        this.b = new ybf(ern.a(zqj.class), new r71(jfuVar, 7), new pva(28, new bff(7)));
        bdt I = hag.I(oq7.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        this.d = l18Var.b(hag.I(t3g.class), true);
    }

    public ime(dn9 dn9Var) {
        this.a = 23;
        this.c = dn9Var;
        this.b = "PlayAudio2:".concat("PlayAudioMetaHelper");
        this.d = new ovk();
    }

    public ime(Class cls, String str, Class[] clsArr) {
        this.a = 19;
        this.c = cls;
        this.b = str;
        this.d = clsArr;
    }

    public ime(View view) {
        this.a = 1;
        this.b = view;
        this.c = btf.a(bwf.c, new ypb(8, this));
        this.d = new knn(view);
    }

    public ime(ekk ekkVar) {
        this.a = 22;
        this.d = ekkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ime(Function2 function2, Function0 function0, Function1 function1) {
        this.a = 25;
        this.b = function2;
        this.c = function0;
        this.d = (ezc) function1;
    }

    public /* synthetic */ ime(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ime(bmh bmhVar) {
        this.a = 9;
        this.d = bmhVar;
        this.b = new bhh(this);
    }

    public ime(List list, xu1 xu1Var, Object[][] objArr) {
        this.a = 5;
        o2g.O(list, "addresses are not set");
        this.b = list;
        o2g.O(xu1Var, "attrs");
        this.c = xu1Var;
        o2g.O(objArr, "customOptions");
        this.d = objArr;
    }
}
