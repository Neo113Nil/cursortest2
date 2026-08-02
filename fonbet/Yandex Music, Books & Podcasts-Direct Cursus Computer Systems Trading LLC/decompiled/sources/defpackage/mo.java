package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import j$.util.DesugarTimeZone;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
public final class mo extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ mo(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                try {
                    return (Cipher) t7b.e.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    wvs.m(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) t7b.e.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    wvs.m(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) t7b.e.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    wvs.m(e3);
                    return null;
                }
            case 3:
                try {
                    return (Cipher) t7b.e.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e4) {
                    wvs.m(e4);
                    return null;
                }
            case 4:
                try {
                    return (Cipher) t7b.e.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e5) {
                    wvs.m(e5);
                    return null;
                }
            case 5:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    bj0 bj0Var = new bj0(choreographer, ild.t(myLooper));
                    return bj0Var.plus(bj0Var.m);
                }
                xq0.q("no Looper on this thread");
                return null;
            case 6:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(cvt.e);
                return simpleDateFormat;
            case 7:
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                return simpleDateFormat2;
            case 8:
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", Locale.US);
            case 9:
                return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
            case 10:
                return new zx0();
            case 11:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 12:
                return new PathMeasure();
            case 13:
                return new Path();
            case 14:
                return new Path();
            case 15:
                return new float[4];
            case 16:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
