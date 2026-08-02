package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Base64OutputStream;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.media3.session.i;
import androidx.work.impl.WorkDatabase;
import io.appmetrica.analytics.impl.C0102a1;
import io.appmetrica.analytics.impl.U0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.JobResult;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r8(s8 s8Var, Function1 function1, ju7 ju7Var, Function1 function12) {
        this.a = 0;
        this.b = s8Var;
        this.e = (uif) function1;
        this.c = ju7Var;
        this.d = function12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0477, code lost:
    
        r4.d();
     */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f1  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r2v17, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        u8e u8eVar;
        int c;
        Bundle b;
        String str;
        String e;
        BufferedWriter bufferedWriter;
        xbu xbuVar;
        Object obj;
        xbu xbuVar2;
        Object obj2;
        switch (this.a) {
            case 0:
                s8 s8Var = (s8) this.b;
                ?? r2 = (uif) this.e;
                ju7 ju7Var = (ju7) this.c;
                Function1 function1 = (Function1) this.d;
                s8Var.getClass();
                g2o g2oVar = s8Var.d;
                if (g2oVar.isDone()) {
                    try {
                        ewm ewmVar = (ewm) g2oVar.get();
                        if (ewmVar instanceof dwm) {
                            mif mifVar = (mif) r2.invoke(((dwm) ewmVar).a);
                            m5 m5Var = new m5(1, ju7Var, ju7.class, "resolve", "resolve(Ljava/lang/Object;)V", 0, 1);
                            m5 m5Var2 = new m5(1, ju7Var, ju7.class, "reject", "reject(Lcom/yandex/xplat/common/YSError;)V", 0, 2);
                            mifVar.getClass();
                            mif.b(mifVar, m5Var, m5Var2, 1);
                        } else if (ewmVar instanceof cwm) {
                            if (function1 != null) {
                                mif mifVar2 = (mif) function1.invoke(((cwm) ewmVar).a);
                                m5 m5Var3 = new m5(1, ju7Var, ju7.class, "resolve", "resolve(Ljava/lang/Object;)V", 0, 3);
                                m5 m5Var4 = new m5(1, ju7Var, ju7.class, "reject", "reject(Lcom/yandex/xplat/common/YSError;)V", 0, 4);
                                mifVar2.getClass();
                                mif.b(mifVar2, m5Var3, m5Var4, 1);
                            } else {
                                ju7Var.a(((cwm) ewmVar).a);
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        ju7Var.a(zdg.q(th));
                        return;
                    }
                }
                return;
            case 1:
                s8 s8Var2 = (s8) this.b;
                ju7 ju7Var2 = (ju7) this.c;
                Function1 function12 = (Function1) this.d;
                Function1 function13 = (Function1) this.e;
                s8Var2.getClass();
                function12.getClass();
                g2o g2oVar2 = s8Var2.d;
                if (g2oVar2.isDone()) {
                    try {
                        ewm ewmVar2 = (ewm) g2oVar2.get();
                        if (ewmVar2 instanceof dwm) {
                            ju7Var2.b(function12.invoke(((dwm) ewmVar2).a));
                        } else if (ewmVar2 instanceof cwm) {
                            if (function13 != null) {
                                ju7Var2.b(function13.invoke(((cwm) ewmVar2).a));
                            } else {
                                ju7Var2.a(((cwm) ewmVar2).a);
                            }
                        }
                        return;
                    } catch (Throwable th2) {
                        ju7Var2.a(zdg.q(th2));
                        return;
                    }
                }
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.b;
                ly1 ly1Var = (ly1) this.e;
                Handler handler = (Handler) this.c;
                z9 z9Var = (z9) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (ly1Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new jt6(16, ly1Var, z9Var));
                    }
                    synchronized (gk7.j0) {
                        try {
                            int i = gk7.l0 - 1;
                            gk7.l0 = i;
                            if (i == 0) {
                                gk7.k0.shutdown();
                                gk7.k0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (ly1Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new jt6(16, ly1Var, z9Var));
                    }
                    synchronized (gk7.j0) {
                        try {
                            int i2 = gk7.l0 - 1;
                            gk7.l0 = i2;
                            if (i2 == 0) {
                                gk7.k0.shutdown();
                                gk7.k0 = null;
                            }
                            throw th3;
                        } finally {
                        }
                    }
                }
            case 3:
                eq7 eq7Var = (eq7) this.b;
                de2 de2Var = (de2) this.e;
                String str2 = de2Var.a;
                u9t u9tVar = (u9t) this.c;
                cd2 cd2Var = (cd2) this.d;
                eq7Var.getClass();
                Logger logger = eq7.f;
                try {
                    j9t a = eq7Var.c.a(str2);
                    if (a == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        u9tVar.a(new IllegalArgumentException(str3));
                    } else {
                        eq7Var.e.D(new u13(2, eq7Var, de2Var, ((p94) a).a(cd2Var)));
                        u9tVar.a(null);
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    u9tVar.a(e2);
                    return;
                }
            case 4:
                AtomicReference atomicReference = (AtomicReference) this.b;
                ?? r22 = (uif) this.e;
                AtomicReference atomicReference2 = (AtomicReference) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                try {
                    atomicReference.set(r22.invoke());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 5:
                ffc ffcVar = (ffc) this.b;
                long j = ((nkk) this.e).a;
                nkk nkkVar = (nkk) this.c;
                String str4 = (String) this.d;
                if (ffcVar.d) {
                    bai baiVar = ffcVar.a;
                    long j2 = nkkVar.a - j;
                    eai eaiVar = baiVar.b;
                    eaiVar.a("FirstInputDelay", j2, str4, eaiVar.n);
                    eaiVar.a.reportAdditionalMetric(eaiVar.r, "FirstInputTime", j - eaiVar.b().a, str4, eaiVar.q.a);
                    return;
                }
                return;
            case 6:
                m78 m78Var = (m78) this.b;
                AtomicInteger atomicInteger = (AtomicInteger) this.e;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                if (atomicInteger.incrementAndGet() == arrayList.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    while (i3 < arrayList2.size()) {
                        lcg lcgVar = (lcg) arrayList2.get(i3);
                        if (lcgVar != null) {
                            try {
                                bitmap = (Bitmap) leu.O(lcgVar);
                            } catch (CancellationException | ExecutionException e3) {
                                vq1.I("MediaSessionLegacyStub", "Failed to get bitmap", e3);
                            }
                            arrayList3.add(new ksh(null, rwf.g((onh) arrayList.get(i3), bitmap), i3 != -1 ? -1L : i3));
                            i3++;
                        }
                        bitmap = null;
                        arrayList3.add(new ksh(null, rwf.g((onh) arrayList.get(i3), bitmap), i3 != -1 ? -1L : i3));
                        i3++;
                    }
                    sth.j0(((sth) m78Var.e).l, arrayList3);
                    return;
                }
                return;
            case 7:
                nuh nuhVar = (nuh) this.b;
                AtomicReference atomicReference3 = (AtomicReference) this.e;
                wrh wrhVar = (wrh) this.c;
                n20 n20Var = (n20) this.d;
                atomicReference3.set(nuhVar.j.n(wrhVar));
                n20Var.h();
                return;
            case 8:
                gvh gvhVar = (gvh) this.b;
                wrh wrhVar2 = (wrh) this.e;
                i iVar = (i) this.c;
                u8e u8eVar2 = (u8e) this.d;
                g06 g06Var = gvhVar.i;
                boolean z = false;
                try {
                    gvhVar.j.remove(wrhVar2);
                    try {
                        if (!iVar.k()) {
                            cvh cvhVar = (cvh) wrhVar2.d;
                            vq1.B(cvhVar);
                            IBinder asBinder = cvhVar.a.asBinder();
                            urh n = iVar.n(wrhVar2);
                            if (g06Var.I(wrhVar2)) {
                                vq1.n0("MediaSessionStub", "Controller " + wrhVar2 + " has sent connection request multiple times");
                            }
                            g06Var.e(asBinder, wrhVar2, n.a, n.b);
                            ps1 E = g06Var.E(wrhVar2);
                            if (E == null) {
                                vq1.n0("MediaSessionStub", "Ignoring connection request from unknown controller info");
                            } else {
                                lrl lrlVar = iVar.t;
                                rdl p0 = gvhVar.p0(lrlVar.j1());
                                MediaSession.Token token = (MediaSession.Token) ((dsh) iVar.h.l.b).c.b;
                                PendingIntent pendingIntent = iVar.u;
                                yde ydeVar = n.c;
                                if (ydeVar == null) {
                                    ydeVar = iVar.B;
                                }
                                yde ydeVar2 = n.d;
                                if (ydeVar2 == null) {
                                    ydeVar2 = iVar.C;
                                }
                                try {
                                    p66 p66Var = new p66(1006001300, 4, gvhVar, pendingIntent, ydeVar, ydeVar2, iVar.r, n.a, n.b, lrlVar.f0(), iVar.j.a.getExtras(), iVar.D, p0, token);
                                    if (!iVar.k()) {
                                        try {
                                            c = E.c();
                                            u8eVar = u8eVar2;
                                        } catch (RemoteException unused) {
                                            u8eVar = u8eVar2;
                                        }
                                        try {
                                            try {
                                                if (u8eVar instanceof gmh) {
                                                    b = new Bundle();
                                                    b.putBinder(p66.B, new o66(p66Var));
                                                } else {
                                                    b = p66Var.b(wrhVar2.c);
                                                }
                                                u8eVar.k(c, b);
                                                z = true;
                                            } catch (RemoteException unused2) {
                                            }
                                            if (z && (!iVar.A || !i.l(wrhVar2))) {
                                                iVar.e.X(iVar.k, wrhVar2);
                                                break;
                                            }
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (!z) {
                                                try {
                                                    u8eVar.d();
                                                } catch (RemoteException unused3) {
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                    u8eVar2.d();
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    u8eVar = u8eVar2;
                                }
                            }
                        }
                        u8eVar2.d();
                        return;
                    } catch (RemoteException unused4) {
                        return;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    u8eVar = u8eVar2;
                }
                break;
            case 9:
                i iVar2 = (i) this.b;
                xop xopVar = (xop) this.e;
                ua6 ua6Var = (ua6) this.c;
                lcg lcgVar2 = (lcg) this.d;
                if (iVar2.k()) {
                    xopVar.l(null);
                    return;
                }
                try {
                    ua6Var.accept(lcgVar2);
                    xopVar.l(null);
                    return;
                } catch (Throwable th7) {
                    xopVar.m(th7);
                    return;
                }
            case 10:
                i iVar3 = (i) this.b;
                evh evhVar = (evh) this.e;
                wrh wrhVar3 = (wrh) this.c;
                List list = (List) this.d;
                if (iVar3.k()) {
                    return;
                }
                evhVar.b(iVar3.t, wrhVar3, list);
                return;
            case 11:
                l lVar = (l) this.b;
                JobResult jobResult = (JobResult) this.e;
                List list2 = (List) this.c;
                PreloadException preloadException = (PreloadException) this.d;
                vnm vnmVar = lVar.g;
                if (vnmVar != null) {
                    vnmVar.invoke(lVar, jobResult, list2, preloadException);
                    return;
                } else {
                    Intrinsics.j("onFinished");
                    throw null;
                }
            case 12:
                List list3 = (List) this.b;
                a4w a4wVar = (a4w) this.e;
                r46 r46Var = (r46) this.c;
                WorkDatabase workDatabase = (WorkDatabase) this.d;
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    ((kto) it.next()).b(a4wVar.a);
                }
                tto.b(r46Var, workDatabase, list3);
                return;
            case 13:
                String[] strArr = (String[]) this.b;
                jsr jsrVar = (jsr) this.e;
                hie hieVar = (hie) this.c;
                Function1 function14 = (Function1) this.d;
                ArrayList arrayList4 = new ArrayList(strArr.length);
                int length = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        qdc qdcVar = jsrVar.d;
                        k5r.t(qdcVar, qdcVar, "wm_send_support_logs");
                        jtc jtcVar = jsrVar.c;
                        t3f t3fVar = jsrVar.b;
                        t3fVar.getClass();
                        String X = CollectionsKt.X(arrayList4, ", ", null, null, new s3f(0), 30);
                        nnd nndVar = t3fVar.a;
                        String str5 = hieVar.d;
                        nndVar.getClass();
                        str5.getClass();
                        b0i b0iVar = b0i.Response;
                        JSONArray jSONArray = new JSONArray(new String[]{"#LOGS_MOCK"});
                        JSONObject H = nndVar.H(b0iVar, null, str5);
                        H.put("data", jSONArray);
                        jtc.v(jtcVar, c.r("\n            var blobFromBase64String = (base64String, mimeType) => {\n               const byteArray = Uint8Array.from(\n                  [...atob(base64String)].map(char => char.charCodeAt(0))\n               );\n\n              return new Blob([byteArray], { type: mimeType });\n            };\n\n            var message = " + H + ";\n            " + t3f.a(new String[]{Constants.KEY_MESSAGE, "androidMessengerChannel"}) + "\n            androidMessengerChannel.port1.postMessage(message);\n        ", "\"#LOGS_MOCK\"", X, false));
                        function14.invoke(null);
                        return;
                    }
                    String str6 = strArr[i4];
                    File file = new File(str6);
                    if (!file.exists()) {
                        function14.invoke(new IllegalArgumentException(hrg.q("file ", str6, " not exists")));
                        return;
                    }
                    jsrVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                vnj.u(fileInputStream, base64OutputStream);
                                fileInputStream.close();
                                base64OutputStream.close();
                                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                                byteArrayOutputStream.close();
                                byteArrayOutputStream2.getClass();
                                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str6);
                                if (fileExtensionFromUrl != null) {
                                    String str7 = StringsKt.U(fileExtensionFromUrl) ? null : fileExtensionFromUrl;
                                    if (str7 != null) {
                                        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str7);
                                        if (str == null) {
                                            xq0.x(f1d.g("incorrect extension of file ", str6));
                                            return;
                                        } else {
                                            arrayList4.add(new drg(byteArrayOutputStream2, str));
                                            i4++;
                                        }
                                    }
                                }
                                str = "text/plain";
                                arrayList4.add(new drg(byteArrayOutputStream2, str));
                                i4++;
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th8) {
                        try {
                            throw th8;
                        } catch (Throwable th9) {
                            yd5.q(byteArrayOutputStream, th8);
                            throw th9;
                        }
                    }
                }
            case 14:
                U0.a((U0) this.b, (String) this.e, (String) this.c, (String) this.d);
                return;
            case 15:
                rn5 rn5Var = (rn5) this.b;
                String str8 = (String) this.e;
                Map map = (Map) this.c;
                List list4 = (List) this.d;
                m0i m0iVar = (m0i) rn5Var.b;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) rn5Var.h;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    m0iVar.i(str8, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    m0iVar.h(str8, map, false);
                }
                if (list4.isEmpty()) {
                    return;
                }
                File k = m0iVar.a.k(str8, "rollouts-state");
                if (list4.isEmpty()) {
                    m0i.g(k, "Rollout state is empty for session: " + str8);
                    return;
                }
                BufferedWriter bufferedWriter2 = null;
                try {
                    try {
                        e = m0i.e(list4);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k), m0i.b));
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
                try {
                    bufferedWriter.write(e);
                    bufferedWriter.flush();
                    kg5.q(bufferedWriter, "Failed to close rollouts state file.");
                    return;
                } catch (Exception e5) {
                    e = e5;
                    bufferedWriter2 = bufferedWriter;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    m0i.f(k);
                    kg5.q(bufferedWriter2, "Failed to close rollouts state file.");
                    return;
                } catch (Throwable th11) {
                    th = th11;
                    bufferedWriter2 = bufferedWriter;
                    kg5.q(bufferedWriter2, "Failed to close rollouts state file.");
                    throw th;
                }
            case 16:
                Map map2 = (Map) this.b;
                jau jauVar = (jau) this.e;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
                Set keySet = map2.keySet();
                ConcurrentHashMap concurrentHashMap = jauVar.f;
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    concurrentHashMap.remove((String) it2.next());
                }
                if (!linkedHashMap.isEmpty() && (xbuVar2 = jauVar.e) != null) {
                    LinkedHashSet linkedHashSet = xbuVar2.o;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str9 = (String) entry.getKey();
                        VideoData videoData = (VideoData) entry.getValue();
                        Iterator it3 = linkedHashSet.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (Intrinsics.d(((imh) obj2).d, str9)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        imh imhVar = (imh) obj2;
                        if (imhVar != null) {
                            xbuVar2.m.put(imhVar, videoData);
                            linkedHashSet.remove(imhVar);
                        }
                    }
                    if (xbuVar2.r) {
                        xbuVar2.c(false);
                    }
                }
                if (linkedHashMap2.isEmpty() || (xbuVar = jauVar.e) == null) {
                    return;
                }
                LinkedHashSet linkedHashSet2 = xbuVar.o;
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str10 = (String) entry2.getKey();
                    xbuVar.c.M("VideoPreloadManager", "onError", f1d.g("preload ", str10), (PreloadException) entry2.getValue(), new Object[0]);
                    Iterator it4 = linkedHashSet2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj = it4.next();
                            if (Intrinsics.d(((imh) obj).d, str10)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    imh imhVar2 = (imh) obj;
                    if (imhVar2 != null) {
                        ecg ecgVar = xbuVar.i;
                        if (ecgVar != null) {
                            ecgVar.e(imhVar2);
                        }
                        linkedHashSet2.remove(imhVar2);
                    }
                }
                return;
            default:
                C0102a1.a((C0102a1) this.b, (String) this.e, (String) this.c, (PluginErrorDetails) this.d);
                return;
        }
    }

    public /* synthetic */ r8(s8 s8Var, ju7 ju7Var, Function1 function1, Function1 function12) {
        this.a = 1;
        this.b = s8Var;
        this.c = ju7Var;
        this.d = function1;
        this.e = function12;
    }

    public /* synthetic */ r8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r8(AtomicReference atomicReference, Function0 function0, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.a = 4;
        this.b = atomicReference;
        this.e = (uif) function0;
        this.c = atomicReference2;
        this.d = countDownLatch;
    }
}
