package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.f;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class wc2 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ wc2(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    f fVar = new f(choreographer, Handler.createAsync(myLooper));
                    return fVar.plus(fVar.D);
                }
                ny61.r("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(bg61.a);
                return simpleDateFormat;
            case 2:
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat2.setLenient(false);
                simpleDateFormat2.setTimeZone(yuu.a);
                return simpleDateFormat2;
            case 3:
                try {
                    return (Cipher) s1o.b.a.n("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    ny61.o(e);
                    return null;
                }
            case 4:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 5:
                return new PathMeasure();
            case 6:
                return new Path();
            case 7:
                return new Path();
            case 8:
                return new float[4];
            default:
                return 0L;
        }
    }
}
