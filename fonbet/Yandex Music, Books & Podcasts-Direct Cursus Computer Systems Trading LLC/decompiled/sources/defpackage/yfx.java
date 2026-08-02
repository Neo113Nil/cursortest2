package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.fragment.app.t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import retrofit2.Call;
import retrofit2.Response;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.kids.KidsCatalogActivity;
import ru.yandex.music.landing.skeleton.SkeletonScreenActivity;
import ru.yandex.music.novelties.podcasts.catalog.PodcastsCatalogActivity;
import ru.yandex.music.url.ui.UrlActivity;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class yfx implements cb7, ymn, os3, upt, kag, czc {
    public static yfx d;
    public static final hs4 e = new hs4(27);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public yfx(oc9 oc9Var, int i, float f, rxi rxiVar, cc9 cc9Var, boolean z, hb9 hb9Var) {
        boolean z2;
        this.a = 26;
        this.b = oc9Var;
        this.c = hb9Var;
        if (rxiVar.s() == 0.0f) {
            return;
        }
        ViewPager2 viewPager = oc9Var.getViewPager();
        float s = i / (rxiVar.s() + f);
        RecyclerView recyclerView = oc9Var.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize(((int) Math.ceil(s)) + 2);
        }
        switch (rxiVar.d) {
            case 0:
                z2 = rxiVar.g;
                break;
            default:
                z2 = rxiVar.g;
                break;
        }
        if (z2) {
            viewPager.setOffscreenPageLimit(Math.max((int) Math.ceil(s - 1), 1));
            return;
        }
        float t = rxiVar.t();
        if (t > f) {
            viewPager.setOffscreenPageLimit(1);
            return;
        }
        if (z || (cc9Var.g >= t && cc9Var.h >= t)) {
            viewPager.setOffscreenPageLimit(-1);
            return;
        }
        kma kmaVar = new kma(9, this);
        kmaVar.invoke(Integer.valueOf(viewPager.getCurrentItem()));
        oc9Var.setChangePageCallbackForOffScreenPages$div_release(new dgc(0, kmaVar));
    }

    public static final SharedPreferences B(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void E(Context context) {
        if (B(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new hfx("Failed to store the app set ID last used time.");
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        ((mk7) this.c).a.execute(new cy1(12, this, (os3) this.b, th));
    }

    @Override // defpackage.cb7
    public /* bridge */ /* synthetic */ Object C(Object obj, wa7 wa7Var) {
        return o((xin) obj);
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        ((mk7) this.c).a.execute(new cy1(11, this, (os3) this.b, response));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:19|20))(5:21|22|(1:24)(1:29)|25|(1:27)(1:28))|12|(1:14)(2:16|17)))|31|6|7|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f A[Catch: IOException -> 0x0094, TRY_LEAVE, TryCatch #0 {IOException -> 0x0094, blocks: (B:11:0x0030, B:12:0x0076, B:16:0x007f, B:22:0x003e, B:24:0x0056, B:25:0x005c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.cb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object M(cg6 cg6Var) {
        lg0 lg0Var;
        Object obj;
        int i;
        File file;
        yfx yfxVar;
        File file2;
        win winVar;
        String str = (String) this.b;
        if (cg6Var instanceof lg0) {
            lg0Var = (lg0) cg6Var;
            int i2 = lg0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lg0Var.p = i2 - Integer.MIN_VALUE;
                obj = lg0Var.n;
                nm6 nm6Var = nm6.a;
                i = lg0Var.p;
                if (i != 0) {
                    qgg.h0(obj);
                    file = new File(str, "loglist.json");
                    File file3 = new File(str, "loglist.sig");
                    win winVar2 = new win(zac.c(file), file3.exists() ? zac.c(file3) : null);
                    lg0Var.j = this;
                    lg0Var.k = file;
                    lg0Var.l = file3;
                    lg0Var.m = winVar2;
                    lg0Var.p = 1;
                    Object o = o(winVar2);
                    if (o == nm6Var) {
                        return nm6Var;
                    }
                    yfxVar = this;
                    file2 = file3;
                    obj = o;
                    winVar = winVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winVar = lg0Var.m;
                    file2 = lg0Var.l;
                    file = lg0Var.k;
                    yfxVar = lg0Var.j;
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return winVar;
                }
                ((SharedPreferences) yfxVar.c).edit().clear().apply();
                file.delete();
                file2.delete();
                return null;
            }
        }
        lg0Var = new lg0(this, cg6Var);
        obj = lg0Var.n;
        nm6 nm6Var2 = nm6.a;
        i = lg0Var.p;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.cb7
    public Object N(Object obj, cg6 cg6Var) {
        xin xinVar = (xin) obj;
        String str = (String) this.b;
        if (xinVar instanceof win) {
            try {
                new File(str).mkdirs();
                zac.e(new File(str, "loglist.json"), ((win) xinVar).a);
                byte[] bArr = ((win) xinVar).b;
                if (bArr != null) {
                    zac.e(new File(str, "loglist.sig"), bArr);
                }
                ((SharedPreferences) this.c).edit().putLong("last_write", System.currentTimeMillis()).apply();
            } catch (IOException unused) {
            }
        }
        return Unit.a;
    }

    @Override // defpackage.cb7
    public ya7 S(qec qecVar) {
        return new ya7(this, qecVar);
    }

    @Override // defpackage.ymn
    public gye b(xmn xmnVar, Object obj) {
        gye gyeVar;
        wr5 wr5Var = (wr5) this.b;
        if (wr5Var == null) {
            wr5Var = null;
        }
        if (wr5Var == null || (gyeVar = wr5Var.b(xmnVar, obj)) == null) {
            gyeVar = gye.a;
        }
        if (gyeVar != gye.a) {
            return gyeVar;
        }
        mfi mfiVar = (mfi) this.c;
        mfiVar.f = CollectionsKt.h0(mfiVar.f, new Pair(xmnVar, obj));
        return gye.b;
    }

    @Override // defpackage.upt
    public String c(String str) {
        str.getClass();
        return e(str);
    }

    @Override // defpackage.kag
    public void d(int i, int i2) {
        k1a k1aVar;
        int i3 = i + i2;
        ArrayList arrayList = (ArrayList) this.b;
        int size = i3 > arrayList.size() ? arrayList.size() - i2 : i;
        lr8 lr8Var = (lr8) this.c;
        List subList = arrayList.subList(size, i2 + size);
        lr8Var.d.addAll(i, subList);
        ArrayList arrayList2 = lr8Var.f;
        List list = subList;
        ArrayList arrayList3 = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k1aVar = k1a.VISIBLE;
            boolean z = false;
            if (!hasNext) {
                break;
            }
            k79 k79Var = (k79) it.next();
            if (((k1a) k79Var.a.d().getVisibility().a(k79Var.b)) == k1aVar) {
                z = true;
            }
            arrayList3.add(Boolean.valueOf(z));
        }
        arrayList2.addAll(i, arrayList3);
        lr8Var.g = false;
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                u75.n();
                throw null;
            }
            k79 k79Var2 = (k79) obj;
            if (((k1a) k79Var2.a.d().getVisibility().a(k79Var2.b)) == k1aVar) {
                int i6 = i4 + i;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                        i7++;
                    }
                }
                lr8Var.v(i7);
            }
            i4 = i5;
        }
    }

    @Override // defpackage.upt
    public String e(String str) {
        str.getClass();
        String str2 = (String) this.b;
        ybr ybrVar = (ybr) this.c;
        str2.getClass();
        try {
            Uri parse = Uri.parse(str);
            parse.getClass();
            return vpt.d(parse, str2, ybrVar);
        } catch (Exception e2) {
            Timber.INSTANCE.e(e2);
            return str;
        }
    }

    public boolean g() {
        synchronized (this) {
            if (((AtomicBoolean) this.c).get()) {
                return false;
            }
            ((AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    public xu1 h() {
        if (((IdentityHashMap) this.c) != null) {
            for (Map.Entry entry : ((xu1) this.b).a.entrySet()) {
                if (!((IdentityHashMap) this.c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.c).put((wu1) entry.getKey(), entry.getValue());
                }
            }
            this.b = new xu1((IdentityHashMap) this.c);
            this.c = null;
        }
        return (xu1) this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00bb, code lost:
    
        r11 = defpackage.fxf.B(defpackage.xz6.B(r11.a).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00cd, code lost:
    
        if (r11.startsWith("http://") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00d5, code lost:
    
        if (r11.startsWith("https://") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00da, code lost:
    
        r6.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00e0, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00e1, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00e9, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00e5, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00e6, code lost:
    
        r7.addSuppressed(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00d8, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00ea, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00f2, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ee, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ef, code lost:
    
        r7.addSuppressed(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f3, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r6 = new java.util.ArrayList();
        r7 = r2.getExtensionValue("1.3.6.1.5.5.7.1.1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r7 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0077, code lost:
    
        r8 = new defpackage.i0(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x007c, code lost:
    
        r9 = new defpackage.i0(((defpackage.o0) r8.z()).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0089, code lost:
    
        r7 = defpackage.t02.t(r9.z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0091, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0094, code lost:
    
        if (r7 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0096, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x009a, code lost:
    
        r7 = r7.a;
        r9 = r7.length;
        r10 = new defpackage.ca[r9];
        java.lang.System.arraycopy(r7, 0, r10, 0, r7.length);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a4, code lost:
    
        if (r7 >= r9) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a6, code lost:
    
        r11 = r10[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b0, code lost:
    
        if (defpackage.ca.c.x(r11.a) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00dd, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b3, code lost:
    
        r11 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00b8, code lost:
    
        if (r11.b == 6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2 A[LOOP:1: B:10:0x0028->B:54:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9 A[EDGE_INSN: B:55:0x01b9->B:23:0x01b9 BREAK  A[LOOP:1: B:10:0x0028->B:54:0x01b2], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X509Certificate[] i(X509Certificate[] x509CertificateArr) {
        ArrayList arrayList;
        long nanoTime;
        int i;
        X509Certificate x509Certificate;
        ArrayList arrayList2;
        X509Certificate x509Certificate2;
        String str;
        List<X509Certificate> list;
        osg osgVar = (osg) this.c;
        if (x509CertificateArr.length == 0) {
            return x509CertificateArr;
        }
        arrayList = new ArrayList(x509CertificateArr.length + 2);
        for (X509Certificate x509Certificate3 : x509CertificateArr) {
            arrayList.add(x509Certificate3);
        }
        nanoTime = System.nanoTime() + 30000000000L;
        i = 0;
        loop1: while (true) {
            if (i >= 5) {
                break;
            }
            x509Certificate = (X509Certificate) vz1.m(arrayList, 1);
            if (x509Certificate.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                X509Certificate x509Certificate4 = (X509Certificate) it.next();
                if (x509Certificate4.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                    try {
                        x509Certificate.verify(x509Certificate4.getPublicKey());
                        break loop1;
                    } catch (GeneralSecurityException unused) {
                        continue;
                    }
                }
            }
            arrayList.add(x509Certificate2);
            i++;
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
        for (X509Certificate x509Certificate5 : list) {
            if (x509Certificate5.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                try {
                    x509Certificate.verify(x509Certificate5.getPublicKey());
                    x509Certificate2 = x509Certificate5;
                    if (x509Certificate2 != null) {
                        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
                    }
                    arrayList.add(x509Certificate2);
                    i++;
                } catch (GeneralSecurityException unused2) {
                    continue;
                }
            }
        }
        StringBuilder sb = new StringBuilder("No certificate from ");
        sb.append(str);
        sb.append(" issues the current top certificate");
        osgVar.getClass();
        if (arrayList2.isEmpty()) {
            osgVar.getClass();
            break;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            x509Certificate2 = null;
            if (!it2.hasNext()) {
                break;
            }
            str = (String) it2.next();
            if (System.nanoTime() >= nanoTime) {
                osgVar.getClass();
                break;
            }
            g8c g8cVar = (g8c) this.b;
            g8cVar.getClass();
            try {
                byte[] f = g8cVar.f(str, 3, nanoTime);
                if (f == null) {
                    list = Collections.EMPTY_LIST;
                } else {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    ArrayList arrayList3 = new ArrayList();
                    for (Certificate certificate : certificateFactory.generateCertificates(new ByteArrayInputStream(f))) {
                        if (certificate instanceof X509Certificate) {
                            arrayList3.add((X509Certificate) certificate);
                        }
                    }
                    list = arrayList3;
                }
            } catch (IOException | RuntimeException | CertificateException unused3) {
                osg osgVar2 = (osg) g8cVar.a;
                new StringBuilder("Failed to download issuer certificate from ").append(str);
                osgVar2.getClass();
                list = Collections.EMPTY_LIST;
            }
            while (r8.hasNext()) {
            }
            StringBuilder sb2 = new StringBuilder("No certificate from ");
            sb2.append(str);
            sb2.append(" issues the current top certificate");
            osgVar.getClass();
        }
        if (x509Certificate2 != null) {
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
        while (r8.hasNext()) {
        }
        StringBuilder sb22 = new StringBuilder("No certificate from ");
        sb22.append(str);
        sb22.append(" issues the current top certificate");
        osgVar.getClass();
    }

    @Override // defpackage.kag
    public void j(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            lr8 lr8Var = (lr8) this.c;
            lr8Var.d.remove(i);
            ArrayList arrayList = lr8Var.f;
            boolean booleanValue = ((Boolean) arrayList.remove(i)).booleanValue();
            lr8Var.g = false;
            if (booleanValue) {
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    if (((Boolean) arrayList.get(i5)).booleanValue()) {
                        i4++;
                    }
                }
                lr8Var.w(i4);
            }
        }
    }

    @Override // defpackage.kag
    public void l(int i, int i2) {
        j(i, 1);
        d(i2, 1);
    }

    public void m(ArrayList arrayList) {
        xdr xdrVar = saa.a;
        String str = ((frt) this.c).c().a;
        str.getClass();
        ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "delete by ids " + arrayList + " for user " + str, null);
        ((w62) this.b).b(str, arrayList);
    }

    public KeyListener n(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((xiu) ((qxp) this.c).a).getClass();
        if (keyListener instanceof a4b) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new a4b(keyListener);
    }

    public Object o(xin xinVar) {
        boolean z;
        if (xinVar instanceof win) {
            Date date = new Date(((SharedPreferences) this.c).getLong("last_write", System.currentTimeMillis()));
            Date date2 = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(5, 30);
            if (!date2.after(calendar.getTime())) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public void p(Context context, Uri uri) {
        Intent intent = (Intent) this.b;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.c);
    }

    public void q(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, ken.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            x(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.czc
    public oyc r(String str, ArrayList arrayList) {
        try {
            return ((tob) this.b).r(str, arrayList);
        } catch (a6i unused) {
            return ((czc) ((cib) this.c).b).r(str, arrayList);
        }
    }

    @Override // defpackage.czc
    public oyc s(String str, ArrayList arrayList) {
        try {
            return ((tob) this.b).s(str, arrayList);
        } catch (a6i unused) {
            return ((czc) ((cib) this.c).b).s(str, arrayList);
        }
    }

    public void t() {
        String str = (String) this.b;
        if (((FileChannel) this.c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.c = null;
            b6e.o(hrg.q("Unable to lock file: '", str, "'."), th);
        }
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public void u(String str, String str2) {
        Object obj;
        Object obj2;
        Intent l;
        Context context = (Context) this.b;
        str.getClass();
        str2.getClass();
        ypt a = fqt.a(str, true, false);
        if (!(a instanceof wqq)) {
            int i = UrlActivity.C;
            if (a == null) {
                return;
            }
            context.startActivity(zfm.a(context, a, (PlaybackScope) this.c, cxb.K(new Pair("extra.anchor.id", str2)), true));
            return;
        }
        wqq wqqVar = (wqq) a;
        String a2 = wqqVar.a(1);
        if (a2 == null) {
            return;
        }
        String Q = wqqVar.Q("tab");
        String Q2 = wqqVar.Q("block");
        Iterator it = xd.c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((xd) obj2).a.equals(a2)) {
                    break;
                }
            }
        }
        xd xdVar = (xd) obj2;
        int i2 = xdVar == null ? -1 : yd.a[xdVar.ordinal()];
        if (i2 == -1) {
            int i3 = SkeletonScreenActivity.Z;
            l = itk.l(context, a2, 16, Q, Q2);
        } else if (i2 == 1) {
            jyr jyrVar = KidsCatalogActivity.Y;
            l = xv.N(context, Q, Q2);
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            jyr jyrVar2 = PodcastsCatalogActivity.Y;
            kjn kjnVar = fbj.b;
            String str3 = xdVar.a;
            kjnVar.getClass();
            Iterator it2 = fbj.e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((fbj) next).a.equals(str3)) {
                    obj = next;
                    break;
                }
            }
            fbj fbjVar = (fbj) obj;
            if (fbjVar == null) {
                fbjVar = fbj.c;
            }
            l = neg.v(context, fbjVar, Q, Q2);
        } else if (i2 != 5) {
            b6e.s();
            return;
        } else {
            int i4 = SkeletonScreenActivity.Z;
            l = itk.f(context, xdVar.a, Q, Q2, c0p.d);
        }
        Intent putExtra = l.putExtra("extra.anchor.id", str2);
        putExtra.getClass();
        context.startActivity(putExtra);
    }

    public x3b v(InputConnection inputConnection, EditorInfo editorInfo) {
        qxp qxpVar = (qxp) this.c;
        if (inputConnection == null) {
            qxpVar.getClass();
            inputConnection = null;
        } else {
            xiu xiuVar = (xiu) qxpVar.a;
            xiuVar.getClass();
            if (!(inputConnection instanceof x3b)) {
                inputConnection = new x3b(editorInfo, inputConnection, (EditText) xiuVar.b);
            }
        }
        return (x3b) inputConnection;
    }

    public void w(wu1 wu1Var, Object obj) {
        if (((IdentityHashMap) this.c) == null) {
            this.c = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.c).put(wu1Var, obj);
    }

    public void x(boolean z) {
        j4b j4bVar = (j4b) ((xiu) ((qxp) this.c).a).c;
        if (j4bVar.c != z) {
            if (j4bVar.b != null) {
                r3b a = r3b.a();
                i4b i4bVar = j4bVar.b;
                a.getClass();
                o5g.w(i4bVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(i4bVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            j4bVar.c = z;
            if (z) {
                j4b.a(j4bVar.a, r3b.a().c());
            }
        }
    }

    public void y() {
        synchronized (this) {
            ((AtomicInteger) this.b).decrementAndGet();
            if (((AtomicInteger) this.b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr, X509TrustManager x509TrustManager) {
        X509Certificate[] x509CertificateArr2;
        yfx yfxVar = (yfx) this.c;
        osg osgVar = (osg) this.b;
        if (x509CertificateArr.length == 0) {
            osgVar.F("Empty certificate chain");
            return 3;
        }
        if (!x509CertificateArr[0].equals(x509Certificate)) {
            osgVar.F("Found a mismatch between the leaf certificate in the chain and the certificate from the original SSLError.");
            return 3;
        }
        try {
            x509TrustManager.checkServerTrusted(x509CertificateArr, "RSA");
            return 1;
        } catch (CertificateException unused) {
            osgVar.H("Server chain failed -> trying AIA fallback");
            yfxVar.getClass();
            osg osgVar2 = (osg) yfxVar.c;
            try {
                x509CertificateArr2 = yfxVar.i(x509CertificateArr);
            } catch (RuntimeException e2) {
                osgVar2.D("Failed to complete certificate chain via AIA", e2);
                x509CertificateArr2 = x509CertificateArr;
            }
            if (x509CertificateArr2.length != x509CertificateArr.length) {
                try {
                    x509TrustManager.checkServerTrusted(x509CertificateArr2, "RSA");
                    return 1;
                } catch (CertificateException unused2) {
                    if (x509CertificateArr.length > 1) {
                        X509Certificate[] x509CertificateArr3 = {x509CertificateArr[0]};
                        try {
                            x509CertificateArr3 = yfxVar.i(x509CertificateArr3);
                        } catch (RuntimeException e3) {
                            osgVar2.D("Failed to complete certificate chain via AIA", e3);
                        }
                        if (x509CertificateArr3.length > 1) {
                            try {
                                x509TrustManager.checkServerTrusted(x509CertificateArr3, "RSA");
                                return 1;
                            } catch (CertificateException unused3) {
                                if (x509CertificateArr2.length != 0) {
                                }
                                return 3;
                            }
                        }
                    }
                    if (x509CertificateArr2.length != 0) {
                        X509Certificate x509Certificate2 = x509CertificateArr2[x509CertificateArr2.length - 1];
                        if (x509Certificate2.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
                            for (X509Certificate x509Certificate3 : x509TrustManager.getAcceptedIssuers()) {
                                if (!x509Certificate3.equals(x509Certificate2)) {
                                }
                            }
                            return 2;
                        }
                    }
                    return 3;
                }
            }
            if (x509CertificateArr.length > 1) {
            }
            if (x509CertificateArr2.length != 0) {
            }
            return 3;
        }
    }

    @Override // defpackage.ymn
    public void a() {
    }

    @Override // defpackage.ymn
    public void f(Object obj) {
    }

    @Override // defpackage.kag
    public void k(int i, int i2, Object obj) {
    }

    public /* synthetic */ yfx(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ yfx(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public yfx(Context context) {
        this.a = 0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.c = Executors.newSingleThreadExecutor();
        this.b = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new yyo(25, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public yfx(int i, rdk rdkVar) {
        String str;
        this.a = 14;
        rdkVar.getClass();
        this.b = rdkVar;
        if (i == 0) {
            str = "SYNCHRONOUS";
        } else if (i == 1) {
            str = "ASYNCHRONOUS";
        } else if (i != 2) {
            str = i != 3 ? "?" : "ASYNCHRONOUS_RECOVERABLE";
        } else {
            str = "SYNCHRONOUS_RECOVERABLE";
        }
        this.c = str;
    }

    public yfx(View view) {
        this.a = 29;
        view.getClass();
        this.b = view;
    }

    public /* synthetic */ yfx() {
        this.a = 9;
    }

    public yfx(t tVar, vya vyaVar) {
        this.a = 22;
        tVar.getClass();
        this.b = vyaVar;
        this.c = new jp0(new dda(0, vyaVar, w0b.class, "onClose", "onClose()V", 0, 20), ff7.i(tVar));
    }

    public yfx(m mVar) {
        this.a = 21;
        this.b = mVar;
        this.c = btf.b(new yg6(16, this));
    }

    public yfx(Context context, PlaybackScope playbackScope) {
        this.a = 2;
        context.getClass();
        this.b = context;
        this.c = playbackScope;
    }

    public yfx(oq7 oq7Var, j0q j0qVar) {
        this.a = 10;
        oq7Var.getClass();
        j0qVar.getClass();
        this.b = zsd.b0(new cz(oq7Var.b.f, this, 16));
        Continuation continuation = null;
        this.c = zsd.M0(new clc(new ez(j0qVar, 23), new z21(2, 5, continuation)), new l1(continuation, this, 9));
    }

    public yfx(ijl ijlVar) {
        this.a = 24;
        this.b = ijlVar;
        this.c = new wn5(new tt5(14, this), 608185339, true);
    }

    public yfx(String str) {
        this.a = 25;
        this.b = str.concat(".lck");
    }

    public yfx(jac jacVar) {
        this.a = 1;
        this.b = jacVar;
        this.c = e;
    }

    public yfx(Context context, o6c o6cVar) {
        this.a = 4;
        context.getClass();
        this.b = context.getCacheDir().getPath() + "/certificate-transparency-android";
        this.c = context.getApplicationContext().getSharedPreferences("certificate-transparency", 0);
    }

    public yfx(r9n r9nVar) {
        this.a = 12;
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
    }

    public yfx(EditText editText) {
        this.a = 5;
        this.b = editText;
        qxp qxpVar = new qxp();
        qxpVar.a = new xiu(editText);
        this.c = qxpVar;
    }

    public yfx(osg osgVar, int i) {
        this.a = i;
        switch (i) {
            case 11:
                yfx yfxVar = new yfx(osgVar, 3);
                this.b = osgVar;
                this.c = yfxVar;
                break;
            default:
                this.b = new g8c(osgVar);
                this.c = osgVar;
                break;
        }
    }

    public yfx(String str, String str2) {
        this.a = 16;
        str.getClass();
        this.b = str;
        this.c = str2;
        if (str.length() > 0) {
            return;
        }
        xq0.x("userId should not be empty");
        throw null;
    }

    public yfx(xu1 xu1Var) {
        this.a = 7;
        this.b = xu1Var;
    }

    public yfx(String str, ybr ybrVar) {
        this.a = 19;
        str.getClass();
        this.b = str;
        this.c = ybrVar;
    }

    public yfx(String str, g gVar) {
        this.a = 15;
        Logger logger = we6.d;
        this.b = str;
        this.c = gVar;
    }
}
