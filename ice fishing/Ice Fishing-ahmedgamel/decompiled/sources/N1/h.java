package N1;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.AbstractC2837We;
import com.google.android.gms.internal.ads.AbstractC3171f5;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2819Vc;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C3064d5;
import com.google.android.gms.internal.ads.C3279h5;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.C3948tc;
import com.google.android.gms.internal.ads.C4002uc;
import com.google.android.gms.internal.ads.C4164xc;
import com.google.android.gms.internal.ads.C4218yc;
import com.google.android.gms.internal.ads.InterfaceC2903a5;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.RunnableC3111e;
import com.google.android.gms.internal.ads.W8;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p2.C4835j;
import q2.r;
import t0.C4988C;
import u2.z;
import w1.InterfaceC5143a;

/* loaded from: classes.dex */
public final class h implements i, InterfaceC2903a5 {

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f1918n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1919u;

    public /* synthetic */ h(Object obj) {
        this.f1919u = obj;
    }

    public InterfaceC5143a a() {
        if (((InterfaceC5143a) this.f1918n) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC5143a) this.f1918n) == null) {
                        File cacheDir = ((com.bumptech.glide.manager.m) ((C4988C) this.f1919u).f40535u).f23461u.getCacheDir();
                        C2819Vc c2819Vc = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c2819Vc = new C2819Vc(file);
                        }
                        this.f1918n = c2819Vc;
                    }
                    if (((InterfaceC5143a) this.f1918n) == null) {
                        this.f1918n = new E3.e();
                    }
                } finally {
                }
            }
        }
        return (InterfaceC5143a) this.f1918n;
    }

    @Override // N1.i
    public Object get() {
        if (this.f1918n == null) {
            synchronized (this) {
                try {
                    if (this.f1918n == null) {
                        Object obj = ((i) this.f1919u).get();
                        g.c(obj, "Argument must not be null");
                        this.f1918n = obj;
                    }
                } finally {
                }
            }
        }
        return this.f1918n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2903a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3064d5 h(AbstractC3171f5 abstractC3171f5) {
        C4002uc c4002uc;
        C4002uc c4002uc2;
        Map e9 = abstractC3171f5.e();
        int size = e9.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : e9.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        C3948tc c3948tc = new C3948tc(abstractC3171f5.f30044v, strArr, strArr2);
        C4835j c4835j = C4835j.f39733C;
        c4835j.f39745k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C3467kg c3467kg = new C3467kg();
            C2991bm c2991bm = new C2991bm(this, c3467kg);
            C4218yc c4218yc = new C4218yc(this, c3467kg);
            Context context = (Context) this.f1919u;
            Looper b9 = c4835j.f39754t.b();
            int i6 = AbstractC2837We.f28362a;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f1918n = new W8(context, b9, 166, c2991bm, c4218yc);
            ((W8) this.f1918n).o();
            C4164xc c4164xc = new C4164xc(this, c3948tc);
            C3360ig c3360ig = AbstractC3413jg.f31268a;
            N3.a s9 = QC.s(QC.t(c3467kg, c4164xc, c3360ig), ((Integer) r.f40207e.f40210c.a(AbstractC3569ma.f32356r5)).intValue(), TimeUnit.MILLISECONDS, AbstractC3413jg.f31271d);
            s9.a(new RunnableC3111e(this), c3360ig);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) s9.get();
            c4835j.f39745k.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            z.k(sb.toString());
            Parcelable.Creator<C4002uc> creator = C4002uc.CREATOR;
            if (parcelFileDescriptor != null) {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    try {
                        int readInt = dataInputStream.readInt();
                        byte[] bArr = new byte[readInt];
                        dataInputStream.readFully(bArr, 0, readInt);
                        T2.b.c(dataInputStream);
                        Parcel obtain = Parcel.obtain();
                        try {
                            obtain.unmarshall(bArr, 0, readInt);
                            obtain.setDataPosition(0);
                            C4002uc createFromParcel = creator.createFromParcel(obtain);
                            obtain.recycle();
                            c4002uc = createFromParcel;
                        } catch (Throwable th) {
                            obtain.recycle();
                            throw th;
                        }
                    } catch (IOException e10) {
                        int i9 = z.f41322b;
                        v2.i.d("Could not read from parcel file descriptor", e10);
                        T2.b.c(dataInputStream);
                    }
                    c4002uc2 = c4002uc;
                    if (c4002uc2 != null) {
                        return null;
                    }
                    if (c4002uc2.f34548n) {
                        throw new C3279h5(c4002uc2.f34549u);
                    }
                    String[] strArr3 = c4002uc2.f34552x;
                    String[] strArr4 = c4002uc2.f34553y;
                    if (strArr3.length != strArr4.length) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    for (int i10 = 0; i10 < strArr3.length; i10++) {
                        hashMap.put(strArr3[i10], strArr4[i10]);
                    }
                    return new C3064d5(c4002uc2.f34550v, c4002uc2.f34551w, hashMap, C3064d5.a(hashMap), c4002uc2.f34554z);
                } catch (Throwable th2) {
                    T2.b.c(dataInputStream);
                    throw th2;
                }
            }
            v2.i.c("File descriptor is empty, returning null.");
            c4002uc = null;
            c4002uc2 = c4002uc;
            if (c4002uc2 != null) {
            }
        } catch (InterruptedException | ExecutionException unused) {
            C4835j.f39733C.f39745k.getClass();
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            z.k(sb2.toString());
            return null;
        } catch (Throwable th3) {
            C4835j.f39733C.f39745k.getClass();
            long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4);
            sb3.append("ms");
            z.k(sb3.toString());
            throw th3;
        }
    }
}
