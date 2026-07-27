package N1;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.AbstractC2789Te;
import com.google.android.gms.internal.ads.AbstractC3074d5;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2736Qc;
import com.google.android.gms.internal.ads.C2881Yl;
import com.google.android.gms.internal.ads.C2965b5;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3183f5;
import com.google.android.gms.internal.ads.C3320hg;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.C3692oc;
import com.google.android.gms.internal.ads.C3746pc;
import com.google.android.gms.internal.ads.C3907sc;
import com.google.android.gms.internal.ads.C3961tc;
import com.google.android.gms.internal.ads.RunnableC3068d;
import com.google.android.gms.internal.ads.T8;
import com.google.android.gms.internal.ads.Y4;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import q2.r;
import t2.C;
import t2.w;
import w1.InterfaceC5148a;

/* loaded from: classes.dex */
public final class h implements i, Y4 {

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f1962n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1963u;

    public /* synthetic */ h(Object obj) {
        this.f1963u = obj;
    }

    public InterfaceC5148a a() {
        if (((InterfaceC5148a) this.f1962n) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC5148a) this.f1962n) == null) {
                        File cacheDir = ((U2.b) ((w) this.f1963u).f40939u).f3280n.getCacheDir();
                        C2736Qc c2736Qc = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c2736Qc = new C2736Qc(file);
                        }
                        this.f1962n = c2736Qc;
                    }
                    if (((InterfaceC5148a) this.f1962n) == null) {
                        this.f1962n = new L2.i(29);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC5148a) this.f1962n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    @Override // com.google.android.gms.internal.ads.Y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2965b5 b(AbstractC3074d5 abstractC3074d5) {
        C3746pc c3746pc;
        C3746pc c3746pc2;
        Map e6 = abstractC3074d5.e();
        int size = e6.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : e6.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        C3692oc c3692oc = new C3692oc(abstractC3074d5.f29795v, strArr, strArr2);
        p2.j jVar = p2.j.f39798C;
        jVar.f39810k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C3320hg c3320hg = new C3320hg();
            C2881Yl c2881Yl = new C2881Yl(this, c3320hg);
            C3961tc c3961tc = new C3961tc(this, c3320hg);
            Context context = (Context) this.f1963u;
            Looper b9 = jVar.f39819t.b();
            int i4 = AbstractC2789Te.f27792a;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f1962n = new T8(context, b9, 166, c2881Yl, c3961tc);
            ((T8) this.f1962n).o();
            C3907sc c3907sc = new C3907sc(this, c3692oc);
            C3157eg c3157eg = AbstractC3212fg.f30738a;
            J3.a w9 = C3686oN.w(C3686oN.y(c3320hg, c3907sc, c3157eg), ((Integer) r.f40116e.f40119c.a(AbstractC3368ia.f31775r5)).intValue(), TimeUnit.MILLISECONDS, AbstractC3212fg.f30741d);
            w9.c(new RunnableC3068d(this), c3157eg);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) w9.get();
            jVar.f39810k.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            C.k(sb.toString());
            Parcelable.Creator<C3746pc> creator = C3746pc.CREATOR;
            if (parcelFileDescriptor != null) {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    try {
                        int readInt = dataInputStream.readInt();
                        byte[] bArr = new byte[readInt];
                        dataInputStream.readFully(bArr, 0, readInt);
                        S2.b.c(dataInputStream);
                        Parcel obtain = Parcel.obtain();
                        try {
                            obtain.unmarshall(bArr, 0, readInt);
                            obtain.setDataPosition(0);
                            C3746pc createFromParcel = creator.createFromParcel(obtain);
                            obtain.recycle();
                            c3746pc = createFromParcel;
                        } catch (Throwable th) {
                            obtain.recycle();
                            throw th;
                        }
                    } catch (IOException e9) {
                        int i9 = C.f40822b;
                        u2.i.d("Could not read from parcel file descriptor", e9);
                        S2.b.c(dataInputStream);
                    }
                    c3746pc2 = c3746pc;
                    if (c3746pc2 != null) {
                        return null;
                    }
                    if (c3746pc2.f33411n) {
                        throw new C3183f5(c3746pc2.f33412u);
                    }
                    String[] strArr3 = c3746pc2.f33415x;
                    String[] strArr4 = c3746pc2.f33416y;
                    if (strArr3.length != strArr4.length) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    for (int i10 = 0; i10 < strArr3.length; i10++) {
                        hashMap.put(strArr3[i10], strArr4[i10]);
                    }
                    return new C2965b5(c3746pc2.f33413v, c3746pc2.f33414w, hashMap, C2965b5.a(hashMap), c3746pc2.f33417z);
                } catch (Throwable th2) {
                    S2.b.c(dataInputStream);
                    throw th2;
                }
            }
            u2.i.c("File descriptor is empty, returning null.");
            c3746pc = null;
            c3746pc2 = c3746pc;
            if (c3746pc2 != null) {
            }
        } catch (InterruptedException | ExecutionException unused) {
            p2.j.f39798C.f39810k.getClass();
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            C.k(sb2.toString());
            return null;
        } catch (Throwable th3) {
            p2.j.f39798C.f39810k.getClass();
            long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4);
            sb3.append("ms");
            C.k(sb3.toString());
            throw th3;
        }
    }

    @Override // N1.i
    public Object get() {
        if (this.f1962n == null) {
            synchronized (this) {
                try {
                    if (this.f1962n == null) {
                        Object obj = ((i) this.f1963u).get();
                        g.c(obj, "Argument must not be null");
                        this.f1962n = obj;
                    }
                } finally {
                }
            }
        }
        return this.f1962n;
    }
}
