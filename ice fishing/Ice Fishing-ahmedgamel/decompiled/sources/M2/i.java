package M2;

import B1.H;
import L3.F;
import L3.s;
import O2.B;
import Q7.q;
import a7.InterfaceC0446e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.cardview.widget.CardView;
import b2.InterfaceC0515b;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLSocket;
import k3.AbstractC4632a;
import l.x;
import m1.C4726a;
import r.C4942a;
import u1.w;
import w1.C5147e;

/* loaded from: classes.dex */
public final class i implements H, s1.k, s, O1.c, InterfaceC0515b, InterfaceC0446e, com.bumptech.glide.manager.g, com.bumptech.glide.manager.l, x, s1.f, t8.l, O1.a {

    /* renamed from: u, reason: collision with root package name */
    public static i f1848u;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1849n;

    public /* synthetic */ i(int i) {
        this.f1849n = i;
    }

    public static i o(Context context, int i) {
        F.d("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4632a.f38640m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        O3.b.m(context, obtainStyledAttributes, 4);
        O3.b.m(context, obtainStyledAttributes, 9);
        O3.b.m(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        E3.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new E3.a(0)).a();
        obtainStyledAttributes.recycle();
        i iVar = new i(17);
        F.e(rect.left);
        F.e(rect.top);
        F.e(rect.right);
        F.e(rect.bottom);
        return iVar;
    }

    public static C6.a q(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C6.a(1, httpURLConnection);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean s(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        c3.f fVar;
        SigningInfo signingInfo;
        c3.f fVar2;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        int i;
        if (packageInfo != null) {
            boolean z3 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & com.anythink.expressad.video.module.a.a.f21730T) == 0)) ? false : true;
            try {
                fVar = z3 ? o.f1862c : o.f1861b;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        c3.b bVar = c3.e.f5561u;
                        Object[] objArr = {bArr};
                        com.bumptech.glide.d.l(objArr, 1);
                        fVar2 = new c3.f(objArr, 1);
                    } else {
                        c3.b bVar2 = c3.e.f5561u;
                        fVar2 = c3.f.f5562x;
                    }
                } else {
                    if (i6 < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (!hasMultipleSigners) {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                c3.b bVar3 = c3.e.f5561u;
                                Object[] objArr2 = new Object[4];
                                signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                                int length = signingCertificateHistory2.length;
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < length) {
                                    byte[] byteArray = signingCertificateHistory2[i9].toByteArray();
                                    byteArray.getClass();
                                    int length2 = objArr2.length;
                                    int i11 = i10 + 1;
                                    if (i11 < 0) {
                                        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                                    }
                                    if (i11 <= length2) {
                                        i = length2;
                                    } else {
                                        i = (length2 >> 1) + length2 + 1;
                                        if (i < i11) {
                                            int highestOneBit = Integer.highestOneBit(i10);
                                            i = highestOneBit + highestOneBit;
                                        }
                                        if (i < 0) {
                                            i = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (i > length2) {
                                        objArr2 = Arrays.copyOf(objArr2, i);
                                    }
                                    objArr2[i10] = byteArray;
                                    i9++;
                                    i10 = i11;
                                }
                                fVar2 = i10 == 0 ? c3.f.f5562x : new c3.f(objArr2, i10);
                            }
                        }
                    }
                    c3.b bVar4 = c3.e.f5561u;
                    fVar2 = c3.f.f5562x;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z3 ? t(packageInfo, o.f1860a) : t(packageInfo, o.f1860a[0])) != null) {
                }
            }
            if (fVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            c3.e f3 = fVar2.f();
            int size = f3.size();
            int i12 = 0;
            while (i12 < size) {
                byte[] bArr2 = (byte[]) f3.get(i12);
                c3.b listIterator = fVar.listIterator(0);
                do {
                    int i13 = i12 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static m t(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mVarArr.length; i++) {
                if (mVarArr[i].equals(nVar)) {
                    return mVarArr[i];
                }
            }
        }
        return null;
    }

    @Override // t8.l
    public boolean a(SSLSocket sSLSocket) {
        return q.R(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    @Override // com.bumptech.glide.manager.g
    public void c(com.bumptech.glide.manager.h hVar) {
        hVar.onStart();
    }

    @Override // s1.InterfaceC4967b
    public boolean d(Object obj, File file, s1.h hVar) {
        try {
            N1.b.d(((F1.h) ((F1.c) ((u1.x) obj).get()).f914n.f664b).f931a.f40360d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e9) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e9);
            return false;
        }
    }

    @Override // L3.s
    public Object e(IBinder iBinder) {
        int i = K3.f.f1576u;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHsdpService");
        return queryLocalInterface instanceof K3.g ? (K3.g) queryLocalInterface : new K3.e(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService", 3);
    }

    @Override // O1.a
    public Object f() {
        switch (this.f1849n) {
            case 27:
                return new w();
            default:
                try {
                    return new C5147e(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e9) {
                    throw new RuntimeException(e9);
                }
        }
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        return new B(2, Executors.newSingleThreadExecutor());
    }

    @Override // B1.H
    public void i(MediaExtractor mediaExtractor, Object obj) {
        switch (this.f1849n) {
            case 1:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // l.x
    public boolean j(l.m mVar) {
        return false;
    }

    @Override // O1.c
    public void k(Object obj) {
        ((List) obj).clear();
    }

    @Override // t8.l
    public t8.n l(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new t8.e(cls2);
    }

    @Override // B1.H
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f1849n) {
            case 1:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // s1.k
    public int p(s1.h hVar) {
        return 1;
    }

    public void r(C4726a c4726a, float f3) {
        C4942a c4942a = (C4942a) ((Drawable) c4726a.f39272u);
        CardView cardView = (CardView) c4726a.f39273v;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f3 != c4942a.f40289e || c4942a.f40290f != useCompatPadding || c4942a.f40291g != preventCornerOverlap) {
            c4942a.f40289e = f3;
            c4942a.f40290f = useCompatPadding;
            c4942a.f40291g = preventCornerOverlap;
            c4942a.b(null);
            c4942a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c4726a.b(0, 0, 0, 0);
            return;
        }
        C4942a c4942a2 = (C4942a) ((Drawable) c4726a.f39272u);
        float f9 = c4942a2.f40289e;
        float f10 = c4942a2.f40285a;
        int ceil = (int) Math.ceil(r.b.a(f9, f10, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(r.b.b(f9, f10, cardView.getPreventCornerOverlap()));
        c4726a.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // com.bumptech.glide.manager.g
    public void g(com.bumptech.glide.manager.h hVar) {
    }

    @Override // l.x
    public void b(l.m mVar, boolean z3) {
    }

    @Override // s1.f
    public void h(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
