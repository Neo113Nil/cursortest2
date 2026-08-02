package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.airplay.PListParser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes3.dex */
public final class gp6 {
    public static final cp6 r = new cp6(1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final v97 b;
    public final nnk c;
    public final rn5 d;
    public final osh e;
    public final uae f;
    public final jac g;
    public final xs0 h;
    public final yfx i;
    public final op6 j;
    public final a80 k;
    public final dp6 l;
    public final jac m;
    public uq6 n;
    public final i8s o = new i8s();
    public final i8s p = new i8s();
    public final i8s q = new i8s();

    public gp6(Context context, uae uaeVar, v97 v97Var, jac jacVar, nnk nnkVar, xs0 xs0Var, rn5 rn5Var, yfx yfxVar, jac jacVar2, op6 op6Var, a80 a80Var, dp6 dp6Var, osh oshVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = uaeVar;
        this.b = v97Var;
        this.g = jacVar;
        this.c = nnkVar;
        this.h = xs0Var;
        this.d = rn5Var;
        this.i = yfxVar;
        this.j = op6Var;
        this.k = a80Var;
        this.l = dp6Var;
        this.m = jacVar2;
        this.e = oshVar;
    }

    public static onx a(gp6 gp6Var) {
        onx p;
        gp6Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : jac.r(((File) gp6Var.g.c).listFiles(r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    p = ywf.w(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    p = ywf.p(new ScheduledThreadPoolExecutor(1), new fp6(gp6Var, parseLong));
                }
                arrayList.add(p);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return ywf.O(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [int] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z, hgp hgpVar, boolean z2) {
        ArrayList arrayList;
        int i;
        int i2;
        String str;
        boolean z3;
        String str2;
        String substring;
        qb2 a;
        nq6 nq6Var;
        JsonReader jsonReader;
        boolean z4;
        String[] list;
        ?? r10;
        List list2;
        ApplicationExitInfo applicationExitInfo;
        String str3;
        String processName;
        int i3;
        List list3;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        osh.x();
        ArrayList arrayList2 = new ArrayList(((tq6) this.m.b).c());
        if (arrayList2.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str4 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && hgpVar.l().b.b) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    jac jacVar = this.g;
                    yfx yfxVar = new yfx(jacVar);
                    yfxVar.c = yfx.e;
                    if (str4 != null) {
                        yfxVar.c = new g9n(jacVar.k(str4, "userlog"));
                    }
                    jac jacVar2 = this.g;
                    osh oshVar = this.e;
                    m0i m0iVar = new m0i(jacVar2);
                    i = 4;
                    rn5 rn5Var = new rn5(str4, jacVar2, oshVar);
                    i2 = 8;
                    ((jcf) ((AtomicMarkableReference) ((z0j) rn5Var.e).c).getReference()).c(m0iVar.c(str4, false));
                    ((jcf) ((AtomicMarkableReference) ((z0j) rn5Var.f).c).getReference()).c(m0iVar.c(str4, true));
                    ((AtomicMarkableReference) rn5Var.h).set(m0iVar.d(str4), false);
                    c11 c11Var = (c11) rn5Var.g;
                    File k = jacVar2.k(str4, "rollouts-state");
                    if (!k.exists() || k.length() == 0) {
                        m0i.g(k, "The file has a length of zero for session: " + str4);
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(k);
                            try {
                                try {
                                    list2 = m0i.b(kg5.L(fileInputStream2));
                                    String str5 = "Loaded rollouts state:\n" + list2 + "\nfor session " + str4;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str5, null);
                                    }
                                    kg5.q(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    m0i.f(k);
                                    kg5.q(fileInputStream2, "Failed to close rollouts state file.");
                                    list2 = Collections.EMPTY_LIST;
                                    synchronized (c11Var) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                kg5.q(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            kg5.q(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (c11Var) {
                        c11Var.a.clear();
                        if (list2.size() > c11Var.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + c11Var.b, null);
                            c11Var.a.addAll(list2.subList(0, c11Var.b));
                        } else {
                            c11Var.a.addAll(list2);
                        }
                    }
                    jac jacVar3 = this.m;
                    tq6 tq6Var = (tq6) jacVar3.b;
                    long lastModified = tq6Var.b.k(str4, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                        applicationExitInfo = it.next();
                        if (applicationExitInfo.getTimestamp() < lastModified) {
                            break;
                        }
                        if (applicationExitInfo.getReason() == 6) {
                            break;
                        }
                    }
                    applicationExitInfo = null;
                    if (applicationExitInfo == null) {
                        String g = f1d.g("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", g, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        pq6 pq6Var = (pq6) jacVar3.a;
                        try {
                            traceInputStream = applicationExitInfo.getTraceInputStream();
                        } catch (IOException e3) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e3, null);
                        }
                        if (traceInputStream != null) {
                            str3 = jac.e(traceInputStream);
                            sb2 sb2Var = new sb2();
                            sb2Var.d = applicationExitInfo.getImportance();
                            sb2Var.j = (byte) (sb2Var.j | 4);
                            processName = applicationExitInfo.getProcessName();
                            if (processName != null) {
                                jj4.j("Null processName");
                                return;
                            }
                            sb2Var.b = processName;
                            sb2Var.c = applicationExitInfo.getReason();
                            sb2Var.j = (byte) (sb2Var.j | 2);
                            sb2Var.g = applicationExitInfo.getTimestamp();
                            sb2Var.j = (byte) (sb2Var.j | 32);
                            sb2Var.a = applicationExitInfo.getPid();
                            sb2Var.j = (byte) (sb2Var.j | 1);
                            sb2Var.e = applicationExitInfo.getPss();
                            sb2Var.j = (byte) (sb2Var.j | 8);
                            sb2Var.f = applicationExitInfo.getRss();
                            sb2Var.j = (byte) (sb2Var.j | 16);
                            sb2Var.h = str3;
                            tb2 a2 = sb2Var.a();
                            int i5 = pq6Var.a.getResources().getConfiguration().orientation;
                            ec2 ec2Var = new ec2();
                            ec2Var.b = "anr";
                            long j = a2.g;
                            ec2Var.a = j;
                            ec2Var.g = (byte) (ec2Var.g | 1);
                            xs0 xs0Var = pq6Var.c;
                            if (!pq6Var.e.l().b.c || xs0Var.c.size() <= 0) {
                                arrayList = arrayList2;
                                i3 = i5;
                                list3 = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = xs0Var.c.iterator();
                                while (it2.hasNext()) {
                                    oj3 oj3Var = (oj3) it2.next();
                                    int i6 = i5;
                                    String str6 = oj3Var.a;
                                    if (str6 == null) {
                                        jj4.j("Null libraryName");
                                        return;
                                    }
                                    Iterator it3 = it2;
                                    String str7 = oj3Var.b;
                                    if (str7 == null) {
                                        jj4.j("Null arch");
                                        return;
                                    }
                                    String str8 = oj3Var.c;
                                    if (str8 == null) {
                                        jj4.j("Null buildId");
                                        return;
                                    }
                                    arrayList3.add(new ub2(str7, str6, str8));
                                    it2 = it3;
                                    i5 = i6;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                i3 = i5;
                                list3 = Collections.unmodifiableList(arrayList3);
                            }
                            sb2 sb2Var2 = new sb2();
                            sb2Var2.d = a2.d;
                            byte b = (byte) (sb2Var2.j | 4);
                            sb2Var2.j = b;
                            String str9 = a2.b;
                            if (str9 == null) {
                                jj4.j("Null processName");
                                return;
                            }
                            sb2Var2.b = str9;
                            sb2Var2.c = a2.c;
                            sb2Var2.g = j;
                            sb2Var2.a = a2.a;
                            sb2Var2.e = a2.e;
                            sb2Var2.f = a2.f;
                            sb2Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                            sb2Var2.h = a2.h;
                            sb2Var2.i = list3;
                            tb2 a3 = sb2Var2.a();
                            int i7 = a3.d;
                            Boolean valueOf = Boolean.valueOf(i7 != 100);
                            String str10 = a3.b;
                            int i8 = a3.a;
                            str10.getClass();
                            oc2 oc2Var = new oc2();
                            oc2Var.a = str10;
                            oc2Var.b = i8;
                            byte b2 = (byte) (oc2Var.e | 1);
                            oc2Var.c = i7;
                            oc2Var.d = false;
                            oc2Var.e = (byte) (((byte) (b2 | 2)) | 4);
                            pc2 a4 = oc2Var.a();
                            byte b3 = (byte) 1;
                            kc2 e4 = pq6.e();
                            List a5 = pq6Var.a();
                            if (a5 == null) {
                                jj4.j("Null binaries");
                                return;
                            }
                            hc2 hc2Var = new hc2(null, null, a3, e4, a5);
                            if (b3 != 1) {
                                StringBuilder sb = new StringBuilder();
                                if (b3 == 0) {
                                    sb.append(" uiOrientation");
                                }
                                xq0.q(su4.n("Missing required properties:", sb));
                                return;
                            }
                            ec2Var.c = new gc2(hc2Var, null, null, valueOf, a4, null, i3);
                            ec2Var.d = pq6Var.b(i3);
                            fc2 a6 = ec2Var.a();
                            String g2 = f1d.g("Persisting anr for session ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", g2, null);
                            }
                            tq6Var.d(jac.b(jac.a(a6, yfxVar, rn5Var, Collections.EMPTY_MAP), rn5Var), str4, true);
                        }
                        str3 = null;
                        sb2 sb2Var3 = new sb2();
                        sb2Var3.d = applicationExitInfo.getImportance();
                        sb2Var3.j = (byte) (sb2Var3.j | 4);
                        processName = applicationExitInfo.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i = 4;
                    i2 = 8;
                    String g3 = f1d.g("No ApplicationExitInfo available. Session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", g3, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i = 4;
                i2 = 8;
                String i9 = k5r.i(i4, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", i9, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i = 4;
            i2 = 8;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z2 && this.j.c()) {
            String g4 = f1d.g("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                r10 = 0;
                Log.v("FirebaseCrashlytics", g4, null);
            } else {
                r10 = 0;
            }
            this.j.a().getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str4, r10);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str4, r10);
            Log.w("FirebaseCrashlytics", "No native core present", r10);
            str = r10;
        } else {
            str = null;
        }
        if (z != 0) {
            z3 = false;
            str2 = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.l.a(str);
            str2 = null;
        }
        jac jacVar4 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        tq6 tq6Var2 = (tq6) jacVar4.b;
        jac jacVar5 = tq6Var2.b;
        jacVar5.d(".com.google.firebase.crashlytics");
        jacVar5.d(".com.google.firebase.crashlytics-ndk");
        if (!((String) jacVar5.a).isEmpty()) {
            jacVar5.d(".com.google.firebase.crashlytics.files.v1");
            final String str11 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) jacVar5.b;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: iac
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str12) {
                    return str12.startsWith(str11);
                }
            })) != null) {
                int length = list.length;
                for (?? r11 = z3; r11 < length; r11++) {
                    jacVar5.d(list[r11]);
                }
            }
        }
        NavigableSet<String> c = tq6Var2.c();
        if (str2 != null) {
            c.remove(str2);
        }
        int i10 = i2;
        if (c.size() > i10) {
            while (c.size() > i10) {
                String str12 = (String) c.last();
                String g5 = f1d.g("Removing session over cap: ", str12);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", g5, null);
                }
                jac.q(new File((File) jacVar5.d, str12));
                c.remove(str12);
            }
        }
        for (String str13 : c) {
            String g6 = f1d.g("Finalizing report for session ", str13);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", g6, null);
            }
            sq6 sq6Var = tq6.g;
            cp6 cp6Var = tq6.i;
            File file2 = new File((File) jacVar5.d, str13);
            file2.mkdirs();
            List<File> r2 = jac.r(file2.listFiles(cp6Var));
            if (r2.isEmpty()) {
                String q = hrg.q("Session ", str13, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", q, null);
                }
            } else {
                Collections.sort(r2);
                ArrayList arrayList4 = new ArrayList();
                boolean z5 = z3;
                for (File file3 : r2) {
                    try {
                        String e5 = tq6.e(file3);
                        sq6Var.getClass();
                        try {
                            jsonReader = new JsonReader(new StringReader(e5));
                        } catch (IllegalStateException e6) {
                            throw new IOException(e6);
                        }
                    } catch (IOException e7) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e7);
                    }
                    try {
                        fc2 e8 = sq6.e(jsonReader);
                        jsonReader.close();
                        arrayList4.add(e8);
                        if (!z5) {
                            String name = file3.getName();
                            if (!name.startsWith(NetcastTVService.UDAP_API_EVENT) || !name.endsWith("_")) {
                                z4 = false;
                                z5 = z4;
                            }
                        }
                        z4 = true;
                        z5 = z4;
                    } finally {
                    }
                }
                if (arrayList4.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str13, null);
                } else {
                    String d = new m0i(jacVar5).d(str13);
                    nsh nshVar = tq6Var2.d.b;
                    synchronized (nshVar) {
                        if (Objects.equals((String) nshVar.c, str13)) {
                            substring = (String) nshVar.d;
                        } else {
                            jac jacVar6 = (jac) nshVar.b;
                            cp6 cp6Var2 = nsh.h;
                            File file4 = new File((File) jacVar6.d, str13);
                            file4.mkdirs();
                            List r3 = jac.r(file4.listFiles(cp6Var2));
                            if (r3.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                substring = null;
                            } else {
                                substring = ((File) Collections.min(r3, nsh.i)).getName().substring(i);
                            }
                        }
                    }
                    File k2 = jacVar5.k(str13, "report");
                    try {
                        String e9 = tq6.e(k2);
                        sq6Var.getClass();
                        qb2 i11 = sq6.i(e9);
                        pb2 a7 = i11.a();
                        nq6 nq6Var2 = i11.k;
                        if (nq6Var2 != null) {
                            try {
                                yb2 a8 = nq6Var2.a();
                                a8.e = Long.valueOf(currentTimeMillis);
                                a8.f = z5;
                                try {
                                    a8.m = (byte) (a8.m | 2);
                                    if (d != null) {
                                        a8.h = new zc2(d);
                                    }
                                    a7.j = a8.a();
                                } catch (IOException e10) {
                                    e = e10;
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + k2, e);
                                    jac.q(new File((File) jacVar5.d, str13));
                                    z3 = false;
                                    i = 4;
                                }
                            } catch (IOException e11) {
                                e = e11;
                            }
                        }
                        qb2 a9 = a7.a();
                        pb2 a10 = a9.a();
                        a10.g = substring;
                        nq6 nq6Var3 = a9.k;
                        if (nq6Var3 != null) {
                            yb2 a11 = nq6Var3.a();
                            a11.c = substring;
                            a10.j = a11.a();
                        }
                        a = a10.a();
                        nq6Var = a.k;
                    } catch (IOException e12) {
                        e = e12;
                    }
                    if (nq6Var == null) {
                        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                    }
                    pb2 a12 = a.a();
                    yb2 a13 = nq6Var.a();
                    a13.k = arrayList4;
                    a12.j = a13.a();
                    qb2 a14 = a12.a();
                    nq6 nq6Var4 = a14.k;
                    if (nq6Var4 != null) {
                        String str14 = "appQualitySessionId: " + substring;
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                try {
                                    Log.d("FirebaseCrashlytics", str14, null);
                                } catch (IOException e13) {
                                    e = e13;
                                }
                            }
                            tq6.f(z5 ? new File((File) jacVar5.f, ((zb2) nq6Var4).b) : new File((File) jacVar5.e, ((zb2) nq6Var4).b), sq6.a.n(a14));
                        } catch (IOException e14) {
                            e = e14;
                            Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + k2, e);
                            jac.q(new File((File) jacVar5.d, str13));
                            z3 = false;
                            i = 4;
                        }
                    }
                    jac.q(new File((File) jacVar5.d, str13));
                    z3 = false;
                    i = 4;
                    e = e13;
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + k2, e);
                    jac.q(new File((File) jacVar5.d, str13));
                    z3 = false;
                    i = 4;
                }
            }
            jac.q(new File((File) jacVar5.d, str13));
            z3 = false;
            i = 4;
        }
        jsg jsgVar = tq6Var2.c.l().a;
        ArrayList b4 = tq6Var2.b();
        int size = b4.size();
        if (size <= 4) {
            return;
        }
        Iterator it4 = b4.subList(4, size).iterator();
        while (it4.hasNext()) {
            ((File) it4.next()).delete();
        }
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer num;
        Map unmodifiableMap;
        List unmodifiableList;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String g = f1d.g("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", g, null);
        }
        Locale locale = Locale.US;
        uae uaeVar = this.f;
        xs0 xs0Var = this.h;
        zd2 zd2Var = new zd2(uaeVar.c, xs0Var.f, xs0Var.g, uaeVar.c().a, su4.c(xs0Var.d != null ? 4 : 1), xs0Var.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        be2 be2Var = new be2(kg5.C());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        jg5 jg5Var = jg5.a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            jg5 jg5Var2 = (jg5) jg5.b.get(str8.toLowerCase(locale));
            if (jg5Var2 != null) {
                jg5Var = jg5Var2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = jg5Var.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long o = kg5.o(context);
        boolean A = kg5.A();
        int v = kg5.v();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new yd2(zd2Var, be2Var, new ae2(ordinal, availableProcessors, o, blockCount, A, v)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            rn5 rn5Var = this.d;
            synchronized (((String) rn5Var.d)) {
                rn5Var.d = str;
                jcf jcfVar = (jcf) ((AtomicMarkableReference) ((z0j) rn5Var.e).c).getReference();
                synchronized (jcfVar) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(jcfVar.a));
                }
                c11 c11Var = (c11) rn5Var.g;
                synchronized (c11Var) {
                    unmodifiableList = Collections.unmodifiableList(new ArrayList(c11Var.a));
                }
                str3 = str10;
                str5 = str9;
                str2 = str7;
                str4 = str11;
                i = 4;
                ((vq6) ((osh) rn5Var.c).b).d(new r8(rn5Var, str, unmodifiableMap, unmodifiableList, 15));
            }
        }
        yfx yfxVar = this.i;
        ((eac) yfxVar.c).b();
        yfxVar.c = yfx.e;
        if (str != null) {
            yfxVar.c = new g9n(((jac) yfxVar.b).k(str, "userlog"));
        }
        this.l.a(str);
        jac jacVar = this.m;
        pq6 pq6Var = (pq6) jacVar.a;
        Charset charset = oq6.a;
        pb2 pb2Var = new pb2();
        pb2Var.a = "19.4.4";
        xs0 xs0Var2 = pq6Var.c;
        String str12 = xs0Var2.a;
        if (str12 == null) {
            jj4.j("Null gmpAppId");
            return;
        }
        pb2Var.b = str12;
        uae uaeVar2 = pq6Var.b;
        String str13 = uaeVar2.c().a;
        if (str13 == null) {
            jj4.j("Null installationUuid");
            return;
        }
        pb2Var.d = str13;
        pb2Var.e = uaeVar2.c().b;
        pb2Var.f = uaeVar2.c().c;
        String str14 = xs0Var2.f;
        if (str14 == null) {
            jj4.j("Null buildVersion");
            return;
        }
        pb2Var.h = str14;
        String str15 = xs0Var2.g;
        if (str15 == null) {
            jj4.j("Null displayVersion");
            return;
        }
        pb2Var.i = str15;
        pb2Var.c = i;
        pb2Var.m = (byte) (pb2Var.m | 1);
        yb2 yb2Var = new yb2();
        yb2Var.f = false;
        byte b = (byte) (yb2Var.m | 2);
        yb2Var.d = currentTimeMillis;
        yb2Var.m = (byte) (b | 1);
        if (str == null) {
            jj4.j("Null identifier");
            return;
        }
        yb2Var.b = str;
        String str16 = pq6.g;
        if (str16 == null) {
            jj4.j("Null generator");
            return;
        }
        yb2Var.a = str16;
        String str17 = uaeVar2.c;
        if (str17 == null) {
            jj4.j("Null identifier");
            return;
        }
        String str18 = uaeVar2.c().a;
        pt0 pt0Var = xs0Var2.h;
        if (((qz7) pt0Var.b) == null) {
            pt0Var.b = new qz7(pt0Var);
        }
        qz7 qz7Var = (qz7) pt0Var.b;
        String str19 = qz7Var.a;
        if (qz7Var == null) {
            pt0Var.b = new qz7(pt0Var);
        }
        yb2Var.g = new ac2(str17, str14, str15, str18, str19, ((qz7) pt0Var.b).b);
        xc2 xc2Var = new xc2();
        xc2Var.a = 3;
        xc2Var.e = (byte) (xc2Var.e | 1);
        if (str6 == null) {
            jj4.j("Null version");
            return;
        }
        xc2Var.b = str6;
        if (str2 == null) {
            jj4.j("Null buildVersion");
            return;
        }
        xc2Var.c = str2;
        xc2Var.d = kg5.C();
        xc2Var.e = (byte) (xc2Var.e | 2);
        yb2Var.i = xc2Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) pq6.f.get(str8.toLowerCase(locale))) != null) {
            i2 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long o2 = kg5.o(pq6Var.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean A2 = kg5.A();
        int v2 = kg5.v();
        cc2 cc2Var = new cc2();
        cc2Var.a = i2;
        byte b2 = (byte) (cc2Var.j | 1);
        cc2Var.j = b2;
        if (str5 == null) {
            jj4.j("Null model");
            return;
        }
        cc2Var.b = str5;
        cc2Var.c = availableProcessors2;
        cc2Var.d = o2;
        cc2Var.e = blockCount2;
        cc2Var.f = A2;
        cc2Var.g = v2;
        cc2Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            jj4.j("Null manufacturer");
            return;
        }
        cc2Var.h = str20;
        String str21 = str4;
        if (str21 == null) {
            jj4.j("Null modelClass");
            return;
        }
        cc2Var.i = str21;
        yb2Var.j = cc2Var.a();
        yb2Var.l = 3;
        yb2Var.m = (byte) (yb2Var.m | 4);
        pb2Var.j = yb2Var.a();
        qb2 a = pb2Var.a();
        jac jacVar2 = ((tq6) jacVar.b).b;
        nq6 nq6Var = a.k;
        if (nq6Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((zb2) nq6Var).b;
        try {
            tq6.g.getClass();
            tq6.f(jacVar2.k(str22, "report"), sq6.a.n(a));
            File k = jacVar2.k(str22, "start-time");
            long j = ((zb2) nq6Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(k), tq6.e);
            try {
                outputStreamWriter.write("");
                k.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String g2 = f1d.g("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", g2, e);
            }
        }
    }

    public final boolean d(hgp hgpVar) {
        osh.x();
        uq6 uq6Var = this.n;
        if (uq6Var != null && uq6Var.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, hgpVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet c = ((tq6) this.m.b).c();
        if (c.isEmpty()) {
            return null;
        }
        return (String) c.first();
    }

    public final String f() {
        InputStream resourceAsStream;
        Context context = this.a;
        int w = kg5.w(context, "com.google.firebase.crashlytics.version_control_info", PListParser.TAG_STRING);
        String string = w == 0 ? null : context.getResources().getString(w);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = gp6.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() {
        try {
            String f = f();
            if (f != null) {
                try {
                    ((z0j) this.d.f).h0("com.crashlytics.version-control-info", f);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void h(onx onxVar) {
        onx onxVar2;
        onx F;
        i8s i8sVar = this.o;
        jac jacVar = ((tq6) this.m.b).b;
        if (jac.r(((File) jacVar.e).listFiles()).isEmpty() && jac.r(((File) jacVar.f).listFiles()).isEmpty() && jac.r(((File) jacVar.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            i8sVar.d(Boolean.FALSE);
            return;
        }
        mvt mvtVar = mvt.h;
        mvtVar.F("Crash reports are available to be sent.");
        v97 v97Var = this.b;
        if (v97Var.h()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            i8sVar.d(Boolean.FALSE);
            F = ywf.w(Boolean.TRUE);
        } else {
            mvtVar.v("Automatic data collection is disabled.");
            mvtVar.F("Notifying that unsent reports are available.");
            i8sVar.d(Boolean.TRUE);
            synchronized (v97Var.f) {
                onxVar2 = ((i8s) v97Var.g).a;
            }
            bs4 bs4Var = new bs4(19);
            onxVar2.getClass();
            lno lnoVar = j8s.a;
            onx onxVar3 = new onx();
            onxVar2.b.C(new tbx(lnoVar, bs4Var, onxVar3));
            onxVar2.u();
            mvtVar.v("Waiting for send/deleteUnsentReports to be called.");
            F = y2x.F(onxVar3, this.p.a);
        }
        F.m((vq6) this.e.a, new qne(this, onxVar, false));
    }
}
