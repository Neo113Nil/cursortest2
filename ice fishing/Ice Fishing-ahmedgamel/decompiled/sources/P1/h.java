package P1;

import A1.r;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.AbstractC2860We;
import com.google.android.gms.internal.ads.AbstractC3194f5;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2842Vc;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.C3087d5;
import com.google.android.gms.internal.ads.C3302h5;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.C3971tc;
import com.google.android.gms.internal.ads.C4025uc;
import com.google.android.gms.internal.ads.C4187xc;
import com.google.android.gms.internal.ads.C4241yc;
import com.google.android.gms.internal.ads.InterfaceC2926a5;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.RunnableC3134e;
import com.google.android.gms.internal.ads.W8;
import h.C4543G;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import r2.C4906k;
import w2.z;
import x.C5175n;
import y1.InterfaceC5200a;

/* loaded from: classes.dex */
public final class h implements i, InterfaceC2926a5 {

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f2362n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2363u;

    public /* synthetic */ h(Object obj) {
        this.f2363u = obj;
    }

    public InterfaceC5200a a() {
        if (((InterfaceC5200a) this.f2362n) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC5200a) this.f2362n) == null) {
                        File cacheDir = ((r) ((C4543G) this.f2363u).f37843n).f81u.getCacheDir();
                        C2842Vc c2842Vc = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c2842Vc = new C2842Vc(file);
                        }
                        this.f2362n = c2842Vc;
                    }
                    if (((InterfaceC5200a) this.f2362n) == null) {
                        this.f2362n = new C5175n();
                    }
                } finally {
                }
            }
        }
        return (InterfaceC5200a) this.f2362n;
    }

    @Override // P1.i
    public Object get() {
        if (this.f2362n == null) {
            synchronized (this) {
                try {
                    if (this.f2362n == null) {
                        Object obj = ((i) this.f2363u).get();
                        g.c(obj, "Argument must not be null");
                        this.f2362n = obj;
                    }
                } finally {
                }
            }
        }
        return this.f2362n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2926a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3087d5 k(AbstractC3194f5 abstractC3194f5) {
        C4025uc c4025uc;
        C4025uc c4025uc2;
        Map e9 = abstractC3194f5.e();
        int size = e9.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : e9.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        C3971tc c3971tc = new C3971tc(abstractC3194f5.f30831v, strArr, strArr2);
        C4906k c4906k = C4906k.f40186C;
        c4906k.f40198k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C3490kg c3490kg = new C3490kg();
            C3067cm c3067cm = new C3067cm(this, c3490kg);
            C4241yc c4241yc = new C4241yc(this, c3490kg);
            Context context = (Context) this.f2363u;
            Looper b9 = c4906k.f40207t.b();
            int i4 = AbstractC2860We.f29161a;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f2362n = new W8(context, b9, 166, c3067cm, c4241yc);
            ((W8) this.f2362n).o();
            C4187xc c4187xc = new C4187xc(this, c3971tc);
            C3383ig c3383ig = AbstractC3436jg.f32055a;
            P3.a s9 = QC.s(QC.t(c3490kg, c4187xc, c3383ig), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33135r5)).intValue(), TimeUnit.MILLISECONDS, AbstractC3436jg.f32058d);
            s9.a(new RunnableC3134e(this), c3383ig);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) s9.get();
            c4906k.f40198k.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            z.k(sb.toString());
            Parcelable.Creator<C4025uc> creator = C4025uc.CREATOR;
            if (parcelFileDescriptor != null) {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    try {
                        int readInt = dataInputStream.readInt();
                        byte[] bArr = new byte[readInt];
                        dataInputStream.readFully(bArr, 0, readInt);
                        V2.b.c(dataInputStream);
                        Parcel obtain = Parcel.obtain();
                        try {
                            obtain.unmarshall(bArr, 0, readInt);
                            obtain.setDataPosition(0);
                            C4025uc createFromParcel = creator.createFromParcel(obtain);
                            obtain.recycle();
                            c4025uc = createFromParcel;
                        } catch (Throwable th) {
                            obtain.recycle();
                            throw th;
                        }
                    } catch (IOException e10) {
                        int i6 = z.f41712b;
                        x2.i.d("Could not read from parcel file descriptor", e10);
                        V2.b.c(dataInputStream);
                    }
                    c4025uc2 = c4025uc;
                    if (c4025uc2 != null) {
                        return null;
                    }
                    if (c4025uc2.f35320n) {
                        throw new C3302h5(c4025uc2.f35321u);
                    }
                    String[] strArr3 = c4025uc2.f35324x;
                    String[] strArr4 = c4025uc2.f35325y;
                    if (strArr3.length != strArr4.length) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    for (int i9 = 0; i9 < strArr3.length; i9++) {
                        hashMap.put(strArr3[i9], strArr4[i9]);
                    }
                    return new C3087d5(c4025uc2.f35322v, c4025uc2.f35323w, hashMap, C3087d5.a(hashMap), c4025uc2.f35326z);
                } catch (Throwable th2) {
                    V2.b.c(dataInputStream);
                    throw th2;
                }
            }
            x2.i.c("File descriptor is empty, returning null.");
            c4025uc = null;
            c4025uc2 = c4025uc;
            if (c4025uc2 != null) {
            }
        } catch (InterruptedException | ExecutionException unused) {
            C4906k.f40186C.f40198k.getClass();
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            z.k(sb2.toString());
            return null;
        } catch (Throwable th3) {
            C4906k.f40186C.f40198k.getClass();
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
