package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j;
import com.google.gson.Strictness;
import com.squareup.moshi.Moshi;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.cartech.dynamic.domain.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.images.ImageManager$From;
import com.yandex.images.SourcePolicy;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.core.net.entities.directives.CallPhoneDirective;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.directives.OpenBotDirective;
import com.yandex.messaging.core.net.entities.directives.OpenIFrameDirective;
import com.yandex.messaging.core.net.entities.directives.OpenPaymentDirective;
import com.yandex.messaging.core.net.entities.directives.OpenUriDirective;
import com.yandex.messaging.core.net.entities.directives.SendBotRequestDirective;
import com.yandex.messaging.core.net.entities.directives.SendMessageDirective;
import com.yandex.messaging.core.net.entities.directives.TypeDirective;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.entities.TextMessageData;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verification.ebs.di.IEbsComponent;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes15.dex */
public final class w3i implements wni, IEbsComponent {
    public Object A;
    public Object B;
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public w3i(Context context, biv bivVar, vmr0 vmr0Var, File file) {
        this.a = 16;
        this.b = new ReentrantLock();
        this.x = new ArrayList(4);
        this.c = context.getApplicationContext();
        this.y = bivVar;
        this.w = new b2z(vmr0Var);
        this.z = file;
    }

    public void a(qkg qkgVar, String str, fid fidVar, int i) {
        qkg qkgVar2 = qkgVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1683538471);
        int i2 = i | (btsVar.k(qkgVar2) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.e(this) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            fwi fwiVar = (fwi) btsVar.m(j.h);
            k3r k3rVar = ljs0.b;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            float H = fwiVar.H(yx40Var.getIntValue());
            tgg tggVar = (tgg) this.y;
            kn50 f = zrb1.f(btsVar);
            c530 c530Var = c530.a;
            f530 o2 = an91.o(pw91.u(androidx.compose.ui.input.nestedscroll.b.a(c530Var, f, null), pw91.o(btsVar), 14), 0.0f, 0.0f, 0.0f, H, 7);
            boolean e = ((i2 & 112) == 32) | btsVar.e(this);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new mjf(11, this, str);
                btsVar.o0(Q2);
            }
            tggVar.a(qkgVar, o2, 6.0f, 0L, true, false, (wls) Q2, btsVar, (i2 & 14) | 16802176, 40);
            qkgVar2 = qkgVar;
            List list = qkgVar2.b;
            if (list.isEmpty()) {
                btsVar.e0(905399279);
                btsVar.t(false);
            } else {
                btsVar.e0(904908208);
                f530 a = cj6.a.a(c530Var, x4c.C);
                Object Q3 = btsVar.Q();
                if (Q3 == o430Var) {
                    Q3 = new dx2(yx40Var, 3);
                    btsVar.o0(Q3);
                }
                ngb1.c(0, btsVar, eja1.y(a, (tls) Q3), list);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(this, qkgVar2, str, i, 21);
        }
    }

    public t4j0 b() {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h("https://" + ((gsu) this.z).a() + "/rtc/call_feedback");
        t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, (String) this.x);
        t4j0Var.c.a("X-UUID", (String) this.B);
        String uuid = AppMetricaYandex.getUuid(((gm51) ((q6v) this.w)).a);
        if (uuid != null && uuid.length() != 0) {
            t4j0Var.a("X-METRICA-UUID", uuid);
        }
        return t4j0Var;
    }

    public jmw0 c(String str) {
        pex0 pex0Var;
        fnx0 n = ((k) ((wiq0) this.z)).n();
        Object obj = null;
        if (n == null || (pex0Var = n.c) == null) {
            return null;
        }
        ((yfx0) this.x).getClass();
        Iterator it = yfx0.a(pex0Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((jmw0) next).getName(), str)) {
                obj = next;
                break;
            }
        }
        return (jmw0) obj;
    }

    public ad7 d(xn50 xn50Var, boolean z) {
        String a;
        File g;
        z83.d(xn50Var, null);
        int i = xn50Var.h;
        SourcePolicy.Companion.getClass();
        if ((i & SourcePolicy.SKIP_CACHE.index) == 0 && (a = xn50Var.a()) != null) {
            a2z f = f(a);
            if (f != null) {
                return new ad7(f.a, null, f.b, ImageManager$From.MEMORY);
            }
            if (!z && (g = g(xn50Var)) != null) {
                return e(g, a);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ad7 e(File file, String str) {
        FileInputStream fileInputStream;
        Bitmap bitmap;
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        Closeable closeable = null;
        if (file.exists()) {
            boolean lastModified = file.setLastModified(System.currentTimeMillis());
            ?? r3 = lastModified;
            if (!lastModified) {
                qa2 qa2Var = ydz.a;
                qa2Var.a();
                r3 = qa2Var;
            }
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            bitmap = BitmapFactory.decodeStream(fileInputStream);
                        } catch (OutOfMemoryError e) {
                            ydz.c("[Y:ImageCache]", "Bitmap file wasn't decoded", e);
                            z83.j("Bitmap file wasn't decoded");
                            bitmap = null;
                        }
                    } catch (FileNotFoundException unused) {
                        ydz.b("[Y:ImageCache]", "Bitmap file wasn't found");
                        y2b1.a(fileInputStream);
                        if (ydz.a.a()) {
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable = r3;
                    y2b1.a(closeable);
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                y2b1.a(closeable);
                throw th;
            }
            if (bitmap != null) {
                Uri h = h(file);
                ad7 ad7Var = new ad7(bitmap, null, h, ImageManager$From.DISK);
                ((b2z) this.w).b(str, bitmap, h);
                if (ydz.a.a()) {
                    bitmap.getByteCount();
                    ydz.d();
                    bitmap.getByteCount();
                    ydz.d();
                    l();
                }
                y2b1.a(fileInputStream);
                return ad7Var;
            }
            reentrantLock.lock();
            try {
                ((ArrayList) this.x).add(str);
                y2b1.a(fileInputStream);
                if (ydz.a.a()) {
                    ydz.d();
                    l();
                }
            } finally {
                reentrantLock.unlock();
            }
        } else if (ydz.a.a()) {
            ydz.d();
            l();
            return null;
        }
        return null;
    }

    public a2z f(String str) {
        a2z a2zVar;
        b2z b2zVar = (b2z) this.w;
        synchronized (b2zVar) {
            try {
                z1z z1zVar = (z1z) b2zVar.b.get(str);
                Bitmap bitmap = z1zVar != null ? (Bitmap) z1zVar.a.get() : null;
                if (bitmap != null) {
                    b2zVar.d++;
                } else {
                    b2zVar.e++;
                }
                a2zVar = bitmap != null ? new a2z(bitmap, z1zVar.b) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a2zVar != null) {
            b2zVar.a.a.d(new Pair(b2zVar.c, str), a2zVar.a);
        }
        if (ydz.a.a()) {
            if (a2zVar == null) {
                ydz.d();
            } else {
                a2zVar.a.getByteCount();
                ydz.d();
            }
            l();
        }
        return a2zVar;
    }

    public File g(xn50 xn50Var) {
        String a;
        z83.d(xn50Var, null);
        z83.d(xn50Var, null);
        File file = (File) this.z;
        if (file != null) {
            qna1.c(file);
        } else {
            xn50Var.getClass();
            file = i();
        }
        if (file == null || (a = xn50Var.a()) == null) {
            return null;
        }
        return new File(file, a);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.di.IEbsComponent
    public IEbsController getEbsController() {
        boj0 boj0Var = (boj0) this.b;
        qwu j = boj0Var.j(d70.c);
        u3u u3uVar = (u3u) boj0Var.y;
        if (u3uVar == null) {
            v3u v3uVar = new v3u();
            Strictness strictness = Strictness.LENIENT;
            Objects.requireNonNull(strictness);
            v3uVar.k = strictness;
            u3u u3uVar2 = new u3u(v3uVar);
            boj0Var.y = u3uVar2;
            u3uVar = u3uVar2;
        }
        hwo0 hwo0Var = (hwo0) this.c;
        IFileManager fileManager = hwo0Var.getFileManager();
        IKeyStorage memoryKeyStorage = hwo0Var.memoryKeyStorage(((mpe) this.B).m);
        return new yin(new qjn(new xin(1, j), u3uVar, fileManager, memoryKeyStorage), ((ht10) this.w).getMetadataController(), ((q4g) this.x).getInstructionsController(), ((boj0) this.y).getAdapterController(), ((s421) this.A).getVerificationSessionController(), ((an8) this.z).getSdkDispatchers());
    }

    public Uri h(File file) {
        Uri.Builder buildUpon = Uri.fromFile(file).buildUpon();
        ((biv) this.y).getClass();
        return buildUpon.authority("com.yandex.images").scheme("content").build();
    }

    public File i() {
        File file;
        File file2 = (File) this.B;
        if (file2 != null) {
            return file2;
        }
        Context context = (Context) this.c;
        try {
            file = context.getExternalCacheDir();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
            file = null;
        }
        File c = qna1.c(new File((file == null || Environment.isExternalStorageRemovable() || !"mounted".equals(Environment.getExternalStorageState())) ? context.getCacheDir().getPath() : file.getPath(), "i_images"));
        this.B = c;
        return c;
    }

    public File j() {
        File file = (File) this.A;
        if (file != null) {
            return file;
        }
        File c = qna1.c(new File(((Context) this.c).getFilesDir(), "p_images"));
        this.A = c;
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(ChatRequest chatRequest, w7b w7bVar, Directive[] directiveArr, String str) {
        for (Directive directive : directiveArr) {
            if (directive instanceof OpenUriDirective) {
                ((b0x) ((x870) this.c).a).b(((OpenUriDirective) directive).uri);
            } else if (directive instanceof TypeDirective) {
                ((ddb) this.w).getClass();
                String str2 = ((TypeDirective) directive).text;
                l520 l520Var = l520.d;
                w7bVar.b.getClass();
                yw80 d = ax80.d(str2, false, null, null, l520Var, false, false, null, null, null);
                if (d != null) {
                    w7bVar.c.c(w7bVar.a, d);
                }
            } else if (directive instanceof CallPhoneDirective) {
                vr vrVar = (vr) this.x;
                vrVar.getClass();
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((CallPhoneDirective) directive).phone));
                intent.addFlags(SelfTester_JCP.IMITA);
                vrVar.a.startActivity(intent);
            } else if (directive instanceof OpenPaymentDirective) {
                at20 at20Var = (at20) this.y;
                ((b0x) ((sfl0) at20Var.a)).b(String.format(((MessengerEnvironment) at20Var.b).g(), Arrays.copyOf(new Object[]{((OpenPaymentDirective) directive).transactionId}, 1)));
            } else if (directive instanceof SendMessageDirective) {
                xoq0 xoq0Var = (xoq0) this.z;
                SendMessageDirective sendMessageDirective = (SendMessageDirective) directive;
                b00 b00Var = xoq0Var.a;
                ax80 ax80Var = xoq0Var.b;
                TextMessageData textMessageData = new TextMessageData(0, sendMessageDirective.text);
                l520 l520Var2 = l520.d;
                Object obj = sendMessageDirective.callbackData;
                ax80Var.getClass();
                b00Var.c(chatRequest, ax80.f(textMessageData, l520Var2, obj));
            } else if (directive instanceof SendBotRequestDirective) {
                ndl0 ndl0Var = (ndl0) this.A;
                Object obj2 = ((SendBotRequestDirective) directive).b;
                if (obj2 != null) {
                    b00 b00Var2 = (b00) ndl0Var.b;
                    ((Handler) b00Var2.a.get()).post(new kz(b00Var2, chatRequest, obj2, str, 0));
                } else {
                    ndl0Var.getClass();
                }
            } else if (directive instanceof OpenBotDirective) {
                sfl0.a(((sml) this.b).a, new q6b(l520.d, new PrivateChat(((OpenBotDirective) directive).botId, null, 2, 0 == true ? 1 : 0), 0 == true ? 1 : 0, null, null, 2097148), 6);
            } else if (directive instanceof OpenIFrameDirective) {
                ((b0x) ((sfl0) ((xl10) this.B).a)).b(((OpenIFrameDirective) directive).uri);
            }
        }
    }

    public void l() {
        int i = ((b2z) this.w).d;
        ydz.d();
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ComposeView composeView = new ComposeView(((y30) obj).a(), null, 0, 6, null);
                composeView.setContent(new a(-1326056175, new u3i(this, (v3i) uniVar, i2), true));
                return composeView;
            default:
                ComposeView composeView2 = new ComposeView(((y30) obj).a(), null, 0, 6, null);
                composeView2.setContent(new a(1262208417, new o030(this, i2), true));
                return composeView2;
        }
    }

    public void n(Bitmap bitmap, boolean z, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        b2z b2zVar = (b2z) this.w;
        z83.i();
        File file = null;
        b2zVar.b(str, bitmap, null);
        if (ydz.a.a()) {
            z83.i();
            bitmap.getByteCount();
            ydz.d();
            l();
        }
        if (z) {
            return;
        }
        File file2 = (File) this.z;
        if (file2 == null) {
            file2 = i();
        }
        if (file2 != null) {
            z83.i();
            file = new File(file2, str);
        }
        if (file == null) {
            z83.j("Failed to retrieve image file");
            return;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        reentrantLock.lock();
        try {
            z83.i();
            o(byteArray, file, str);
        } finally {
            reentrantLock.unlock();
            z83.i();
            b2zVar.b(str, bitmap, h(file));
        }
    }

    public void o(byte[] bArr, File file, String str) {
        FileOutputStream fileOutputStream;
        ArrayList arrayList = (ArrayList) this.x;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            if (file.setLastModified(System.currentTimeMillis())) {
                ydz.a.a();
            }
            y2b1.a(fileOutputStream);
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            ydz.c("[Y:ImageCache]", "Failed to open cache file", e);
            y2b1.a(fileOutputStream2);
            arrayList.remove(str);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            y2b1.a(fileOutputStream2);
            arrayList.remove(str);
            throw th;
        }
        arrayList.remove(str);
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        ((hwo0) this.c).removeStorage(((mpe) this.B).m);
    }

    public w3i(ojn ojnVar, boj0 boj0Var, hwo0 hwo0Var, ht10 ht10Var, q4g q4gVar, boj0 boj0Var2, an8 an8Var, s421 s421Var, mpe mpeVar) {
        this.a = 21;
        this.b = boj0Var;
        this.c = hwo0Var;
        this.w = ht10Var;
        this.x = q4gVar;
        this.y = boj0Var2;
        this.z = an8Var;
        this.A = s421Var;
        this.B = mpeVar;
    }

    public w3i(tgg tggVar, o5s o5sVar, u1n u1nVar, b4s b4sVar, t6s t6sVar, yfa yfaVar, oy60 oy60Var, le6 le6Var) {
        this.a = 28;
        this.y = tggVar;
        this.b = o5sVar;
        this.c = u1nVar;
        this.w = b4sVar;
        this.x = t6sVar;
        this.z = yfaVar;
        this.A = oy60Var;
        this.B = le6Var;
    }

    public w3i(Context context, qcp0 qcp0Var, hwy0 hwy0Var, l7x0 l7x0Var, dci dciVar, jwh jwhVar, qdc qdcVar, yuj0 yuj0Var) {
        this.a = 20;
        this.b = context;
        this.w = qcp0Var;
        this.x = hwy0Var;
        this.y = l7x0Var;
        this.c = dciVar;
        this.z = jwhVar;
        this.A = qdcVar;
        this.B = yuj0Var;
    }

    public w3i(jhu0 jhu0Var, com.yandex.go.cartech.dynamic.domain.d dVar, g gVar, vm7 vm7Var, com.yandex.go.cartech.dynamic.domain.a aVar, use useVar) {
        this.a = 7;
        j1h j1hVar = new j1h();
        cwy0 cwy0Var = new cwy0();
        this.b = jhu0Var;
        this.c = dVar;
        this.w = gVar;
        this.x = vm7Var;
        this.y = aVar;
        this.z = useVar;
        this.A = j1hVar;
        this.B = cwy0Var;
    }

    public w3i(xf7 xf7Var, bwu bwuVar, q6v q6vVar, String str, String str2, Moshi moshi, gsu gsuVar, SharedPreferences sharedPreferences) {
        this.a = 6;
        this.b = xf7Var;
        this.c = bwuVar;
        this.w = q6vVar;
        this.B = str;
        this.x = str2;
        this.y = moshi;
        this.z = gsuVar;
        this.A = sharedPreferences;
    }

    public w3i(y30 y30Var, hwy0 hwy0Var, tgg tggVar, p030 p030Var, dci dciVar, t6s t6sVar, oy60 oy60Var, le6 le6Var) {
        this.a = 27;
        this.b = y30Var;
        this.x = hwy0Var;
        this.y = tggVar;
        this.w = p030Var;
        this.c = dciVar;
        this.z = t6sVar;
        this.A = oy60Var;
        this.B = le6Var;
    }

    public w3i(y30 y30Var, dci dciVar, lhg lhgVar, hwy0 hwy0Var, tgg tggVar, ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.d dVar, rpb rpbVar) {
        this.a = 0;
        this.b = y30Var;
        this.c = dciVar;
        this.w = lhgVar;
        this.x = hwy0Var;
        this.y = tggVar;
        this.z = dVar;
        this.A = rpbVar;
        this.B = UUID.randomUUID().toString();
    }

    public w3i(tw4 tw4Var, Context context, ConsoleLoggingMode consoleLoggingMode, Merchant merchant, Payer payer, PaymentSdkEnvironment paymentSdkEnvironment, AdditionalSettings additionalSettings, String str) {
        this.a = 5;
        this.b = context;
        this.c = payer;
        this.B = str;
        this.w = merchant;
        this.x = additionalSettings;
        this.y = tw4Var;
        this.z = paymentSdkEnvironment;
        this.A = consoleLoggingMode;
    }

    public /* synthetic */ w3i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.A = obj7;
        this.B = obj8;
    }

    public w3i(PlainAddress plainAddress) {
        this.a = 22;
        this.b = plainAddress;
        this.B = "";
        this.c = "";
        this.w = "";
        this.x = "";
        this.y = "";
        this.z = "";
        this.A = "";
    }
}
