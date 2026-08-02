package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.fragment.app.y;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.a;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.api.h;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.q;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.properties.v;
import com.yandex.plus.core.locale.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import ru.yandex.music.catalog.artist.ArtistItemsActivity;
import ru.yandex.music.profile.ProfileActivity;

/* loaded from: classes.dex */
public final class vx6 implements rct, oah, e14, z2o, txa, chm, ice, dne {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public vx6(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new gs4(27);
                this.c = ydr.a(null);
                l18 l18Var = l18.b;
                bdt I = hag.I(z66.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                this.d = (z66) qdcVar.C(I);
                break;
            case 16:
                this.b = oo6.a;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(oq7.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                this.c = (oq7) qdcVar2.C(I2);
                this.d = l18Var2.b(hag.I(e0j.class), true);
                break;
        }
    }

    public static mac A(String str) {
        File parentFile = new File(str).getParentFile();
        try {
            if (parentFile.exists()) {
                if (!parentFile.isDirectory()) {
                    String absolutePath = parentFile.getAbsolutePath();
                    absolutePath.getClass();
                    return new mac("Received unexpected error when accessing file item at path: '" + absolutePath + "'", (Throwable) null);
                }
            } else if (!parentFile.mkdirs()) {
                String absolutePath2 = parentFile.getAbsolutePath();
                absolutePath2.getClass();
                return new mac("Received unexpected error when accessing file item at path: '" + absolutePath2 + "'", (Throwable) null);
            }
            return null;
        } catch (Throwable th) {
            String absolutePath3 = parentFile.getAbsolutePath();
            absolutePath3.getClass();
            return new mac(hrg.q("Received unexpected error when accessing file item at path: '", absolutePath3, "'"), th);
        }
    }

    public static String v(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return ouj.o(str, "?", sb2);
        }
        if (!str.endsWith("&")) {
            sb2 = "&".concat(sb2);
        }
        return str.concat(sb2);
    }

    public static boolean x(Editable editable, KeyEvent keyEvent, boolean z) {
        kdt[] kdtVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (kdtVarArr = (kdt[]) editable.getSpans(selectionStart, selectionEnd, kdt.class)) != null && kdtVarArr.length > 0) {
                for (kdt kdtVar : kdtVarArr) {
                    int spanStart = editable.getSpanStart(kdtVar);
                    int spanEnd = editable.getSpanEnd(kdtVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tzb B() {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        String v;
        String concat;
        osh.y();
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            try {
                v = v((String) this.b, (HashMap) this.c);
                concat = "GET Request URL: ".concat(v);
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
            try {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", concat, null);
                }
                httpsURLConnection = (HttpsURLConnection) new URL(v).openConnection();
                try {
                    httpsURLConnection.setReadTimeout(10000);
                    httpsURLConnection.setConnectTimeout(10000);
                    httpsURLConnection.setRequestMethod(ServiceCommand.TYPE_GET);
                    for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                        httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    InputStream inputStream2 = httpsURLConnection.getInputStream();
                    if (inputStream2 != null) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                            char[] cArr = new char[RemoteCameraConfig.Notification.ID];
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                int read = bufferedReader.read(cArr);
                                if (read == -1) {
                                    break;
                                }
                                sb2.append(cArr, 0, read);
                            }
                            sb = sb2.toString();
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                            }
                            if (httpsURLConnection != null) {
                            }
                            throw th;
                        }
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    httpsURLConnection.disconnect();
                    tzb tzbVar = new tzb();
                    tzbVar.b = responseCode;
                    tzbVar.a = sb;
                    return tzbVar;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                th = th;
                httpsURLConnection = null;
                if (inputStream != null) {
                }
                if (httpsURLConnection != null) {
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public Map C() {
        ReentrantLock reentrantLock = (ReentrantLock) this.d;
        reentrantLock.lock();
        try {
            return ((g06) this.b).F();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean D(CharSequence charSequence, int i, int i2, jdt jdtVar) {
        if ((jdtVar.c & 3) == 0) {
            qm7 qm7Var = (qm7) this.d;
            z2i b = jdtVar.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.d).getShort(a + b.a);
            }
            qm7Var.getClass();
            ThreadLocal threadLocal = qm7.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = qm7Var.a;
            String sb2 = sb.toString();
            int i3 = u4k.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i4 = jdtVar.c & 4;
            jdtVar.c = hasGlyph ? i4 | 2 : i4 | 1;
        }
        return (jdtVar.c & 3) == 2;
    }

    public boolean E() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.d = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.b).readLine();
                this.d = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.d = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    public void F(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public String G() {
        if (!E()) {
            wvs.n();
            return null;
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    @Override // defpackage.rct
    public void H(qas qasVar) {
        wl9 wl9Var = (wl9) this.b;
        wl9Var.b.a(new el9((jl9) this.c, (e23) this.d, wl9Var, qasVar));
    }

    @Override // defpackage.ice
    public ImageHeaderParser$ImageType I() {
        switch (this.a) {
            case 25:
                return lxe.u((List) this.c, tm3.c((ByteBuffer) this.b));
            default:
                List list = (List) this.c;
                a aVar = (a) this.d;
                z98 z98Var = (z98) this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    rbe rbeVar = (rbe) list.get(i);
                    non nonVar = null;
                    try {
                        non nonVar2 = new non(new FileInputStream(aVar.c().getFileDescriptor()), z98Var);
                        try {
                            ImageHeaderParser$ImageType c = rbeVar.c(nonVar2);
                            nonVar2.b();
                            aVar.c();
                            if (c != ImageHeaderParser$ImageType.UNKNOWN) {
                                return c;
                            }
                        } catch (Throwable th) {
                            th = th;
                            nonVar = nonVar2;
                            if (nonVar != null) {
                                nonVar.b();
                            }
                            aVar.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public Object J(CharSequence charSequence, int i, int i2, int i3, boolean z, b4b b4bVar) {
        int i4;
        char c;
        d4b d4bVar = new d4b((f3i) ((xdh) this.c).c);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = ((f3i) d4bVar.e).a;
                f3i f3iVar = sparseArray == null ? null : (f3i) sparseArray.get(codePointAt);
                if (d4bVar.a == 2) {
                    if (f3iVar != null) {
                        d4bVar.e = f3iVar;
                        d4bVar.c++;
                    } else {
                        if (codePointAt == 65038) {
                            d4bVar.b();
                        } else if (codePointAt != 65039) {
                            f3i f3iVar2 = (f3i) d4bVar.e;
                            if (f3iVar2.b != null) {
                                if (d4bVar.c != 1) {
                                    d4bVar.f = f3iVar2;
                                    d4bVar.b();
                                } else if (d4bVar.c()) {
                                    d4bVar.f = (f3i) d4bVar.e;
                                    d4bVar.b();
                                } else {
                                    d4bVar.b();
                                }
                                c = 3;
                            } else {
                                d4bVar.b();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (f3iVar == null) {
                    d4bVar.b();
                    c = 1;
                } else {
                    d4bVar.a = 2;
                    d4bVar.e = f3iVar;
                    d4bVar.c = 1;
                    c = 2;
                }
                d4bVar.b = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !D(charSequence, i4, i6, ((f3i) d4bVar.f).b)) {
                        z2 = b4bVar.a(charSequence, i4, i6, ((f3i) d4bVar.f).b);
                        i5++;
                    }
                }
            }
        }
        if (d4bVar.a == 2 && ((f3i) d4bVar.e).b != null && ((d4bVar.c > 1 || d4bVar.c()) && i5 < i3 && z2 && (z || !D(charSequence, i4, i6, ((f3i) d4bVar.e).b)))) {
            b4bVar.a(charSequence, i4, i6, ((f3i) d4bVar.e).b);
        }
        return b4bVar.getResult();
    }

    @Override // defpackage.e14
    public void a(String str) {
        hn5 hn5Var = ((qnq) this.d).b;
        int i = ArtistItemsActivity.Y;
        u51 u51Var = ((zca) this.c).a;
        hn5Var.getClass();
        u51Var.getClass();
        hn5Var.startActivity(kg5.z(hn5Var, u51Var, zb1.c));
    }

    @Override // defpackage.txa
    public void b(String str) {
        str.getClass();
        ((pi5) this.c).d((String) this.b, str);
    }

    @Override // defpackage.chm
    public boolean c(Object obj) {
        if (obj instanceof r3c) {
            ((r3c) obj).b().a = true;
        }
        ((s3c) this.c).b(obj);
        return ((ehm) this.d).c(obj);
    }

    @Override // defpackage.rct
    public void d(Object obj) {
        ((wl9) this.b).u(((Long) obj) != null ? r4.longValue() : 0.0f, false, true);
    }

    @Override // defpackage.txa
    public void e() {
        nnk nnkVar = (nnk) this.d;
        ((ug5) ((wg5) nnkVar.a).a.getValue()).a(new vg5((xh5) nnkVar.b, 1));
    }

    @Override // defpackage.chm
    public Object f() {
        Object f = ((ehm) this.d).f();
        if (f == null) {
            f = ((q3c) this.b).f();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + f.getClass());
            }
        }
        if (f instanceof r3c) {
            ((r3c) f).b().a = false;
        }
        return f;
    }

    @Override // defpackage.txa
    public void g() {
        ((nnk) this.d).d();
    }

    @Override // defpackage.dne
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // defpackage.txa
    public void h() {
        ((pi5) this.c).e((String) this.b);
        ((nnk) this.d).F();
    }

    @Override // defpackage.dne
    public Object i() {
        return null;
    }

    @Override // defpackage.e14
    public void j(aab aabVar) {
        ((e14) this.b).j(aabVar);
    }

    @Override // defpackage.txa
    public void k() {
        Object value;
        Set set;
        rg5 rg5Var;
        nnk nnkVar = (nnk) this.d;
        ug5 ug5Var = (ug5) ((wg5) nnkVar.a).a.getValue();
        xh5 xh5Var = (xh5) nnkVar.b;
        xdr xdrVar = ug5Var.a;
        do {
            value = xdrVar.getValue();
            tg5 tg5Var = (tg5) value;
            tg5Var.getClass();
            boolean z = tg5Var instanceof rg5;
            rg5 rg5Var2 = z ? (rg5) tg5Var : null;
            if (rg5Var2 == null || (set = rg5Var2.a) == null) {
                set = q5b.a;
            }
            rg5Var = z ? (rg5) tg5Var : null;
        } while (!xdrVar.k(value, new rg5(set, wop.j(rg5Var != null ? rg5Var.b : q5b.a, xh5Var))));
    }

    @Override // defpackage.dne
    public Uri l() {
        return (Uri) this.b;
    }

    @Override // defpackage.oah
    public Object n(Map map, InputStream inputStream) {
        g8k m;
        u76 w = w1g.w((i5f) ((iwe) this.b).b);
        iwe iweVar = (iwe) this.b;
        t5a t5aVar = (t5a) this.c;
        String str = (String) this.d;
        synchronized (((ConcurrentLinkedDeque) w.a)) {
            w1g.w((i5f) iweVar.b).k(new rg(), new u5a(t5aVar), new y0o((String) map.get("x-market-req-id")), new grg(str));
            m = iweVar.m(inputStream);
        }
        return m;
    }

    @Override // defpackage.ice
    public Bitmap o(BitmapFactory.Options options) {
        switch (this.a) {
            case 25:
                return BitmapFactory.decodeStream(new sm3(tm3.c((ByteBuffer) this.b)), null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((a) this.d).c().getFileDescriptor(), null, options);
        }
    }

    @Override // defpackage.e14
    public void p(c24 c24Var) {
        c24Var.getClass();
        ((e14) this.b).p(c24Var);
    }

    @Override // defpackage.dne
    public Uri q() {
        return (Uri) this.d;
    }

    @Override // defpackage.ice
    public void r() {
        int i = this.a;
    }

    public void s() {
        osh oshVar = (osh) this.b;
        if (oshVar != null) {
            int i = ((yld) this.d).n.e;
            esh eshVar = (esh) oshVar.a;
            eshVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            eshVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    public d0c t(String str, jc8 jc8Var, zzb zzbVar, dfb dfbVar) {
        dp8 d = jc8Var.d();
        rxt rxtVar = new rxt(zzbVar.c.k, zzbVar.d);
        List z = d.z();
        g06 g06Var = (g06) zzbVar.e.a;
        cib cibVar = (cib) g06Var.c;
        List list = z;
        if (list != null && !list.isEmpty()) {
            ArrayList I = fgq.I(z);
            if (!I.isEmpty()) {
                cibVar = new cib(3, new yfx(27, new tob(I), cibVar));
            }
        }
        return u(d.i(), d.w(), rxtVar, (es6) g06Var.b, cibVar, (pv9) g06Var.d, str, zzbVar.c, dfbVar);
    }

    public d0c u(List list, List list2, rxt rxtVar, es6 es6Var, cib cibVar, pv9 pv9Var, String str, rjo rjoVar, dfb dfbVar) {
        qdc qdcVar;
        zzb zzbVar = new zzb(str, rjoVar, rxtVar, new h4b(new g06(rxtVar, es6Var, cibVar, pv9Var)), dfbVar, null);
        rdk rdkVar = null;
        if (list != null) {
            Iterator it = list.iterator();
            qdcVar = null;
            while (it.hasNext()) {
                zy9 zy9Var = (zy9) it.next();
                if ((zy9Var instanceof wy9) && qdcVar == null) {
                    qdcVar = new qdc(27, zzbVar, rjoVar.k);
                }
                try {
                    kxt k0 = bg3.k0(zy9Var, zzbVar, qdcVar != null ? qdcVar : dym.a, dfbVar);
                    if (k0 != null) {
                        rxtVar.l(k0);
                    }
                } catch (sxt e) {
                    dfbVar.d(e);
                }
            }
        } else {
            qdcVar = null;
        }
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            rdkVar = new rdk(zzbVar, dfbVar, (qg8) this.c);
            rdkVar.x(list2);
        }
        return new d0c(zzbVar, qdcVar, rdkVar);
    }

    @Override // defpackage.z2o
    public k2o w(k2o k2oVar, pwj pwjVar) {
        Drawable drawable = (Drawable) k2oVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((j4x) this.c).w(s33.b((r33) this.b, ((BitmapDrawable) drawable).getBitmap()), pwjVar);
        }
        if (drawable instanceof pcd) {
            return ((bs4) this.d).w(k2oVar, pwjVar);
        }
        return null;
    }

    @Override // defpackage.ice
    public int y() {
        switch (this.a) {
            case 25:
                List list = (List) this.c;
                ByteBuffer c = tm3.c((ByteBuffer) this.b);
                z98 z98Var = (z98) this.d;
                if (c == null) {
                    return -1;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int d = ((rbe) list.get(i)).d(c, z98Var);
                        if (d != -1) {
                            return d;
                        }
                    } finally {
                    }
                }
                return -1;
            default:
                List list2 = (List) this.c;
                a aVar = (a) this.d;
                z98 z98Var2 = (z98) this.b;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    rbe rbeVar = (rbe) list2.get(i2);
                    non nonVar = null;
                    try {
                        non nonVar2 = new non(new FileInputStream(aVar.c().getFileDescriptor()), z98Var2);
                        try {
                            int a = rbeVar.a(nonVar2, z98Var2);
                            nonVar2.b();
                            aVar.c();
                            if (a != -1) {
                                return a;
                            }
                        } catch (Throwable th) {
                            th = th;
                            nonVar = nonVar2;
                            if (nonVar != null) {
                                nonVar.b();
                            }
                            aVar.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(cg6 cg6Var) {
        tw7 tw7Var;
        int i;
        p pVar;
        q0 q0Var;
        h hVar;
        if (cg6Var instanceof tw7) {
            tw7Var = (tw7) cg6Var;
            int i2 = tw7Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tw7Var.o = i2 - Integer.MIN_VALUE;
                Object obj = tw7Var.m;
                nm6 nm6Var = nm6.a;
                i = tw7Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    q0 q0Var2 = (q0) this.c;
                    pVar = new p();
                    pVar.b = new v(new j2(), q2.a, n2.a, true);
                    pVar.c = y1.d;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    pVar.d = e5bVar;
                    pVar.c = pd.M() ? y1.b : y1.a;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(le7.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = r9k.PRODUCTION.a;
                    q qVar = h.b;
                    int parseInt = Integer.parseInt(str);
                    qVar.getClass();
                    h a = q.a(parseInt);
                    if (a == null) {
                        xq0.x("Required value was null.");
                        return null;
                    }
                    av0 av0Var = (av0) ((jyr) this.b).getValue();
                    tw7Var.j = q0Var2;
                    tw7Var.k = pVar;
                    tw7Var.l = a;
                    tw7Var.o = 1;
                    Object f = ((iv0) av0Var).a.f(tw7Var);
                    if (f == nm6Var) {
                        return nm6Var;
                    }
                    q0Var = q0Var2;
                    obj = f;
                    hVar = a;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hVar = tw7Var.l;
                    pVar = tw7Var.k;
                    q0Var = tw7Var.j;
                    qgg.h0(obj);
                }
                z1 d = b.d(hVar, Long.parseLong(((xxq) obj).a));
                pVar.getClass();
                pVar.a = d;
                q0Var.t.a(pVar);
                return Unit.a;
            }
        }
        tw7Var = new tw7(this, cg6Var);
        Object obj2 = tw7Var.m;
        nm6 nm6Var2 = nm6.a;
        i = tw7Var.o;
        if (i != 0) {
        }
        z1 d2 = b.d(hVar, Long.parseLong(((xxq) obj2).a));
        pVar.getClass();
        pVar.a = d2;
        q0Var.t.a(pVar);
        return Unit.a;
    }

    private final void K() {
    }

    private final void L() {
    }

    @Override // defpackage.dne
    public void m() {
    }

    public vx6(iwe iweVar, yfx yfxVar, q2a q2aVar, t5a t5aVar, String str) {
        this.a = 10;
        this.b = iweVar;
        this.c = t5aVar;
        this.d = str;
    }

    public /* synthetic */ vx6(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public vx6(String str, pi5 pi5Var, nnk nnkVar) {
        this.a = 13;
        str.getClass();
        pi5Var.getClass();
        this.b = str;
        this.c = pi5Var;
        this.d = nnkVar;
    }

    public vx6(g06 g06Var, fyb fybVar) {
        this.a = 17;
        g06Var.getClass();
        fybVar.getClass();
        this.b = g06Var;
        this.c = fybVar;
        this.d = new ReentrantLock();
    }

    public vx6(nsh nshVar) {
        this.a = 28;
        this.b = nshVar;
        xdr a = ydr.a(c5b.a);
        this.c = a;
        this.d = new fkn(a);
    }

    public vx6(Context context) {
        this.a = 3;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        absolutePath.getClass();
        this.b = absolutePath;
        context.getCacheDir().getAbsolutePath().getClass();
        this.c = new hg3(new f4s(zdg.r("com.yandex.infra.FileSystemExecutor"), 1), 0);
        this.d = new hg3();
    }

    public vx6(k0b k0bVar, frt frtVar, yza yzaVar) {
        this.a = 14;
        this.b = k0bVar;
        this.c = frtVar;
        this.d = yzaVar;
        x97.y(cmd.a, null, null, new g68(this, null, 10), 3);
    }

    public vx6(Context context, y yVar, s63 s63Var) {
        this.a = 27;
        context.getClass();
        yVar.getClass();
        s63Var.getClass();
        this.b = context;
        this.c = yVar;
        this.d = ((yge) s63Var.a).a;
    }

    public vx6(ProfileActivity profileActivity, qyf qyfVar) {
        this.a = 5;
        bdt I = hag.I(av0.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        q0 b = ((c9k) l18Var.b(hag.I(c9k.class), true).getValue()).b(profileActivity, qyfVar);
        this.c = b;
        this.d = new d64(b.k, 23);
    }

    public vx6(zca zcaVar, qnq qnqVar, s63 s63Var) {
        this.a = 11;
        this.c = zcaVar;
        this.d = qnqVar;
        this.b = zcaVar.b.a(qnqVar, s63Var);
    }

    public vx6(String str, HashMap hashMap) {
        this.a = 24;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public /* synthetic */ vx6(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public vx6(xdh xdhVar, wvo wvoVar, qm7 qm7Var, Set set) {
        this.a = 15;
        this.b = wvoVar;
        this.c = xdhVar;
        this.d = qm7Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            J(str, 0, str.length(), 1, true, new hpc(str, 1));
        }
    }

    public vx6(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, z98 z98Var) {
        this.a = 26;
        w1g.s(z98Var, "Argument must not be null");
        this.b = z98Var;
        w1g.s(arrayList, "Argument must not be null");
        this.c = arrayList;
        this.d = new a(parcelFileDescriptor);
    }

    public vx6(yld yldVar, osh oshVar) {
        this.a = 22;
        this.d = yldVar;
        this.b = oshVar;
    }

    public vx6(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 23;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public vx6(AudioTrack audioTrack, bw1 bw1Var) {
        this.a = 2;
        this.b = audioTrack;
        this.c = bw1Var;
        this.d = new AudioRouting.OnRoutingChangedListener() { // from class: bk7
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                vx6 vx6Var = vx6.this;
                if (((bk7) vx6Var.d) == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                ((bw1) vx6Var.c).t(routedDevice);
            }
        };
        audioTrack.addOnRoutingChangedListener((bk7) this.d, new Handler(Looper.myLooper()));
    }
}
