package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.WindowManager;
import android.widget.ImageButton;
import androidx.camera.core.e;
import androidx.camera.core.impl.utils.InterruptedRuntimeException;
import androidx.concurrent.futures.b;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.resource.bitmap.h;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RuntimeOperatorException;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.logistics.sdk.mission_details.ui.confetti.xml.ConfettiView;

/* loaded from: classes15.dex */
public final class r1s implements fss, el7, she, yie, iqs {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;

    public r1s(Activity activity, ConfettiView confettiView) {
        this.a = 2;
        this.b = confettiView;
        this.c = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.flags = 280;
        layoutParams.format = -3;
        this.w = layoutParams;
    }

    public static void h(long j, i iVar, String str) {
        if (j <= 0) {
            return;
        }
        iVar.c(j, str);
    }

    private final void t() {
    }

    private final void u() {
    }

    public nou a() {
        va90 va90Var;
        u77 a;
        tou touVar = (tou) this.b;
        if (touVar == null || (va90Var = (va90) this.c) == null) {
            kbs.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (touVar.a != ((u77) va90Var.a).a.length) {
            kbs.v("Key size mismatch");
            return null;
        }
        bg1 bg1Var = touVar.c;
        bg1 bg1Var2 = bg1.G;
        if (bg1Var != bg1Var2 && ((Integer) this.w) == null) {
            kbs.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (bg1Var == bg1Var2 && ((Integer) this.w) != null) {
            kbs.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (bg1Var == bg1Var2) {
            a = u77.a(new byte[0]);
        } else if (bg1Var == bg1.F || bg1Var == bg1.E) {
            a = u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.w).intValue()).array());
        } else {
            if (bg1Var != bg1.D) {
                yci0.t(((tou) this.b).c, "Unknown HmacParameters.Variant: ");
                return null;
            }
            a = u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.w).intValue()).array());
        }
        return new nou((tou) this.b, a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        return new defpackage.kzv(r6, r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
    
        if (r9 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rzv b(v2u v2uVar, az60 az60Var, zic zicVar, wzv wzvVar, LinkedHashMap linkedHashMap) {
        y2u y2uVar = (y2u) zicVar.a.get(v2uVar);
        vzv vzvVar = wzvVar instanceof vzv ? (vzv) wzvVar : null;
        boolean z = false;
        boolean z2 = vzvVar != null ? vzvVar.c : false;
        boolean l = jl40.l(v2uVar, vzvVar != null ? vzvVar.a : null);
        if (y2uVar == null) {
            return nzv.a;
        }
        if (y2uVar.d) {
            return pzv.a;
        }
        if (y2uVar.c) {
            return mzv.a;
        }
        if (y2uVar.e) {
            return ozv.a;
        }
        sue0 sue0Var = (sue0) this.w;
        k7z k7zVar = y2uVar.a;
        if (l && z2) {
            z = true;
        }
        gz60 gz60Var = az60Var.d;
        int i = gni0.a[gz60Var.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                if (l) {
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!jl40.l(qke.q(((y2u) entry.getValue()).a), qke.q(k7zVar))) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return new kzv(v2uVar, k7zVar, z);
        }
        fz60 fz60Var = gz60Var.a;
        TimestampSelector timestampSelector = (TimestampSelector) sue0Var.b;
        if (!linkedHashMap2.isEmpty()) {
            Iterator it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                if (yga1.c(fz60Var, ((y2u) ((Map.Entry) it.next()).getValue()).a, k7zVar, timestampSelector)) {
                    return new kzv(v2uVar, k7zVar, true);
                }
            }
        }
        return new lzv();
    }

    public Bitmap c(BitmapFactory.Options options) {
        switch (this.a) {
            case 12:
                return BitmapFactory.decodeStream(new f77(g77.c((ByteBuffer) this.b)), null, options);
            case 13:
                h hVar = (h) ((h2t) this.b).a;
                hVar.reset();
                return BitmapFactory.decodeStream(hVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((a) this.w).a().getFileDescriptor(), null, options);
        }
    }

    public ImageHeaderParser$ImageType d() {
        switch (this.a) {
            case 12:
                return k4b1.p((List) this.c, g77.c((ByteBuffer) this.b));
            case 13:
                List list = (List) this.w;
                h hVar = (h) ((h2t) this.b).a;
                hVar.reset();
                return k4b1.o(list, hVar, (g63) this.c);
            default:
                List list2 = (List) this.c;
                a aVar = (a) this.w;
                g63 g63Var = (g63) this.b;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    aav aavVar = (aav) list2.get(i);
                    h hVar2 = null;
                    try {
                        h hVar3 = new h(new FileInputStream(aVar.a().getFileDescriptor()), g63Var);
                        try {
                            ImageHeaderParser$ImageType b = aavVar.b(hVar3);
                            hVar3.c();
                            aVar.a();
                            if (b != ImageHeaderParser$ImageType.UNKNOWN) {
                                return b;
                            }
                        } catch (Throwable th) {
                            th = th;
                            hVar2 = hVar3;
                            if (hVar2 != null) {
                                hVar2.c();
                            }
                            aVar.a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public void e() {
        ((AnimatedVectorDrawableCompat) this.c).stop();
        ((ImageButton) this.b).setVisibility(8);
    }

    public zbu f(zau zauVar, boolean z, boolean z2) {
        boolean z3;
        ra90 ra90Var;
        lrb1 lrb1Var;
        xk4 xk4Var = (xk4) this.c;
        pau pauVar = zauVar.a;
        wsy0 a = xk4Var.a(pauVar.a, z);
        rry0 rry0Var = pauVar.b;
        ome omeVar = null;
        wsy0 a2 = rry0Var != null ? xk4Var.a(rry0Var, z) : null;
        w4v w4vVar = pauVar.c;
        if (w4vVar != null) {
            z3 = z;
            ra90Var = oh4.b((oh4) this.b, w4vVar, null, null, z3, 6);
        } else {
            z3 = z;
            ra90Var = null;
        }
        ocu ocuVar = zauVar.b;
        if (ocuVar != null && (lrb1Var = ocuVar.a) != null) {
            omeVar = ((v920) this.w).i(lrb1Var, z3, z2);
        }
        return new zbu(a, a2, ra90Var, omeVar, zauVar.c, z2);
    }

    public void g(String str) {
        sh5 stateManager;
        sh5 stateManager2;
        zrm zrmVar = (zrm) this.b;
        FlexAdapter flexAdapter = (FlexAdapter) zrmVar.b;
        Serializable i = bia1.i(qcx.m(sbx.d.d(str)));
        if (i == null) {
            i = "";
        }
        String b = ((bvt) zrmVar.c).b();
        String str2 = b != null ? b : "";
        EmptyList emptyList = EmptyList.a;
        if (flexAdapter != null && (stateManager2 = flexAdapter.getStateManager()) != null) {
            stateManager2.update(gw00.e(new Pair("GooglePayState", gw00.e(new Pair("googlePayResponse", i)))), emptyList);
        }
        if (flexAdapter != null && (stateManager = flexAdapter.getStateManager()) != null) {
            stateManager.update(gw00.e(new Pair("GooglePayState", g8e.z("merchantId", str2))), emptyList);
        }
        ((jh5) this.w).a.dispatch(((qut) this.c).c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yie
    public xie get(xr1 xr1Var) {
        X509Certificate x509Certificate = (X509Certificate) this.c;
        boolean q = xr1Var.a.q(si20.d);
        yc70 yc70Var = ((y7x) this.w).a;
        Signature signature = null;
        if (!q) {
            try {
                Signature c = yc70Var.c(xr1Var);
                c.initVerify(x509Certificate.getPublicKey());
                PublicKey publicKey = x509Certificate.getPublicKey();
                try {
                    Signature b = yc70Var.b(xr1Var);
                    if (b != null) {
                        b.initVerify(publicKey);
                    }
                    signature = b;
                } catch (Exception unused) {
                }
                if (signature == null) {
                    return new hdu(c);
                }
                x7x x7xVar = new x7x(c);
                x7xVar.c = signature;
                return x7xVar;
            } catch (GeneralSecurityException e) {
                throw new OperatorCreationException("exception on setup: " + e, e);
            }
        }
        PublicKey publicKey2 = x509Certificate.getPublicKey();
        i3 z = i3.z(xr1Var.b);
        int size = z.size();
        Signature[] signatureArr = new Signature[size];
        int i = 0;
        Object[] objArr = 0;
        for (int i2 = 0; i2 != z.size(); i2++) {
            try {
                try {
                    Signature c2 = yc70Var.c(xr1.m(z.A(i2)));
                    c2.initVerify(publicKey2);
                    signatureArr[i2] = c2;
                } catch (GeneralSecurityException e2) {
                    throw new OperatorCreationException("exception on setup: " + e2, e2);
                }
            } catch (Exception unused2) {
                signatureArr[i2] = null;
            }
        }
        c9v c9vVar = new c9v((byte) (objArr == true ? 1 : 0), 5);
        c9vVar.b = signatureArr;
        while (i < size && signatureArr[i] == null) {
            i++;
        }
        if (i == size) {
            throw new OperatorCreationException("no matching signature found in composite");
        }
        Signature signature2 = signatureArr[i];
        int i3 = 2;
        xp6 xp6Var = new xp6(i3);
        xp6Var.b = signature2;
        c9vVar.c = xp6Var;
        while (true) {
            i++;
            if (i == size) {
                return c9vVar;
            }
            if (signatureArr[i] != null) {
                OutputStream outputStream = (OutputStream) c9vVar.c;
                Signature signature3 = signatureArr[i];
                xp6 xp6Var2 = new xp6(i3);
                xp6Var2.b = signature3;
                c9vVar.c = new qcy0(outputStream, xp6Var2);
            }
        }
    }

    @Override // defpackage.she
    public xr1 getAlgorithmIdentifier() {
        return (xr1) this.w;
    }

    @Override // defpackage.yie
    public X509CertificateHolder getAssociatedCertificate() {
        return (JcaX509CertificateHolder) this.b;
    }

    @Override // defpackage.she
    public OutputStream getOutputStream() {
        return (xp6) this.b;
    }

    @Override // defpackage.she
    public byte[] getSignature() {
        try {
            return ((Signature) this.c).sign();
        } catch (SignatureException e) {
            throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
        }
    }

    @Override // defpackage.yie
    public boolean hasAssociatedCertificate() {
        return true;
    }

    public hww i() {
        naz0 naz0Var = (naz0) this.w;
        o1b0 o1b0Var = naz0Var.a;
        z83.h(null, (o1b0Var.d || o1b0Var.e) ? false : true);
        h3t0 takeSnapshot = ((at2) this.b).takeSnapshot();
        String d = naz0Var.d();
        String a = naz0Var.a();
        if (d != null) {
            return new hww(takeSnapshot, ((p150) this.c).h(), d, a);
        }
        return null;
    }

    @Override // defpackage.el7
    public Object j(b bVar) {
        bVar.a(new i8m(18, this), geb1.b());
        ((j6u) this.w).a.set(bVar);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    public void k() {
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            t9x t9xVar = (t9x) this.w;
            u9x u9xVar = (u9x) ((ArrayList) this.c).get(i);
            ((hab) t9xVar).getClass();
            qp3 qp3Var = ((ccz0) u9xVar).b;
            kgx kgxVar = ccz0.c[0];
            qp3Var.b(null);
        }
        ((ArrayList) this.c).clear();
    }

    public void l(String str, ffs ffsVar) {
        String d = ((com.yandex.go.performance_class.a) ((nbj) this.w)).d();
        i d2 = ((j) ((lx4) this.b)).d("Perf.AverageFrameRender");
        long[] jArr = ffsVar.c;
        long j = jArr[8];
        long j2 = jArr[13];
        h(jArr[0], d2, "unknown_delay_duration");
        int i = 1;
        h(jArr[1], d2, "input_handling_duration");
        h(jArr[2], d2, "animation_duration");
        h(jArr[3], d2, "layout_measure_duration");
        h(jArr[4], d2, "draw_duration");
        h(jArr[5], d2, "sync_duration");
        h(jArr[6], d2, "command_issue_duration");
        h(jArr[7], d2, "swap_buffers_duration");
        h(j, d2, "total_duration");
        h(jArr[9], d2, "first_draw_frame");
        h(jArr[10], d2, "intended_vsync_timestamp");
        h(jArr[11], d2, "vsync_timestamp");
        h(jArr[12], d2, "gpu_duration");
        h(j2, d2, "deadline");
        long[] jArr2 = ffsVar.d;
        if (jArr2.length == 0) {
            ny61.p();
            return;
        }
        long j3 = jArr2[0];
        int length = jArr2.length - 1;
        if (1 <= length) {
            while (true) {
                long j4 = jArr2[i];
                if (j3 < j4) {
                    j3 = j4;
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        d2.c(j3, "total_frame_count");
        d2.c(ffsVar.e, "deadline_exceed_frame_count");
        d2.d("performance_class", d);
        d2.d("launch_type", ((ru.yandex.taxi.perf.b) this.c).b().getAnalyticsName());
        d2.d("consumer", str);
        d2.m();
    }

    public void m() {
        z83.h(null, ((ArrayList) this.c).isEmpty());
        ArrayList arrayList = (ArrayList) this.b;
        this.b = (ArrayList) this.c;
        this.c = arrayList;
    }

    public void n(Integer num) {
        this.w = num;
    }

    @Override // defpackage.fss
    public void o(int i) {
        ((dsa) this.b).invoke(Integer.valueOf(i));
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        rdy rdyVar = (rdy) this.b;
        dhv dhvVar = new dhv(19, rdyVar);
        if (tob1.d()) {
            dhvVar.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            d6z.y("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new y7x0(23, dhvVar, countDownLatch)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new InterruptedRuntimeException(e);
            }
        }
        e eVar = rdyVar.e;
        euy b = eVar != null ? eVar.b() : hiv.c;
        synchronized (rdyVar.a) {
            rdyVar.b = null;
            rdyVar.c = b;
            rdyVar.g.clear();
            rdyVar.h.clear();
        }
        rdyVar.e = null;
        rdyVar.f = null;
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        rdy rdyVar = (rdy) this.b;
        rdyVar.e = (e) this.c;
        rdyVar.f = grb1.b((Context) this.w);
    }

    public void p(va90 va90Var) {
        this.c = va90Var;
    }

    @Override // defpackage.fss
    public void q(int i) {
        ((dsa) this.w).invoke(Integer.valueOf(i));
    }

    public void r(tou touVar) {
        this.b = touVar;
    }

    public void s() {
        ImageButton imageButton = (ImageButton) this.b;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) this.c;
        if (animatedVectorDrawableCompat.isRunning()) {
            return;
        }
        animatedVectorDrawableCompat.start();
        imageButton.setImageDrawable(animatedVectorDrawableCompat);
        imageButton.setVisibility(0);
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "OutputFileOptions{mFile=" + ((File) this.b) + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=" + ((OutputStream) this.c) + ", mMetadata=" + ((s8v) this.w) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fss
    public void v(int i) {
        ((dsa) this.c).invoke(Integer.valueOf(i));
    }

    public /* synthetic */ r1s(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public r1s(Signature signature, xr1 xr1Var) {
        this.a = 20;
        this.c = signature;
        this.w = xr1Var;
        xp6 xp6Var = new xp6(2);
        xp6Var.b = signature;
        this.b = xp6Var;
    }

    public /* synthetic */ r1s(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public r1s(ah00 ah00Var) {
        this.a = 26;
        this.b = ah00Var;
        this.c = bvf0.c(Float.valueOf(1.0f));
        this.w = new b01(10, this);
    }

    public r1s(u5x u5xVar, c5x c5xVar) {
        this.a = 19;
        this.b = u5xVar;
        this.c = c5xVar;
        this.w = new uje();
    }

    public r1s(t9x t9xVar) {
        this.a = 22;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.w = t9xVar;
    }

    public r1s(ImageButton imageButton) {
        this.a = 15;
        Context context = imageButton.getContext();
        Resources resources = context.getResources();
        this.b = imageButton;
        this.c = AnimatedVectorDrawableCompat.create(context, wwg0.msg_anim_loading);
        this.w = VectorDrawableCompat.create(resources, wwg0.msg_ic_retry_image, context.getTheme());
    }

    public r1s() {
        this.a = 10;
        this.b = null;
        this.c = null;
        this.w = null;
    }

    public r1s(mw00 mw00Var, ArrayList arrayList, g63 g63Var) {
        this.a = 13;
        z2a1.e(g63Var, "Argument must not be null");
        this.c = g63Var;
        z2a1.e(arrayList, "Argument must not be null");
        this.w = arrayList;
        this.b = new h2t(mw00Var, g63Var);
    }

    public r1s(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, g63 g63Var) {
        this.a = 14;
        z2a1.e(g63Var, "Argument must not be null");
        this.b = g63Var;
        z2a1.e(arrayList, "Argument must not be null");
        this.c = arrayList;
        this.w = new a(parcelFileDescriptor);
    }

    public r1s(File file, OutputStream outputStream, s8v s8vVar) {
        this.a = 11;
        this.b = file;
        this.c = outputStream;
        this.w = s8vVar == null ? new s8v() : s8vVar;
    }
}
