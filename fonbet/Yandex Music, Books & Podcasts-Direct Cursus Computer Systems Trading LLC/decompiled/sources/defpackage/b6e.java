package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.media.MediaCodecInfo;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.kinopoisk.sdk.easylogin.internal.K8;

/* loaded from: classes5.dex */
public final /* synthetic */ class b6e implements nae, arr, azo, bzo, ua6, pbh, rih, yjh {
    public static /* bridge */ /* synthetic */ ImageDecoder d(Object obj) {
        return (ImageDecoder) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable e(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void h() {
        throw new InterruptedException();
    }

    public static /* synthetic */ void i(double d, String str) {
        throw new IllegalArgumentException(str + d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(int i, String str, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void k(Object obj, Object obj2, String str) {
        throw new wp3(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void o(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void p(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void q(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* synthetic */ void s() {
        throw new x7j();
    }

    public static /* synthetic */ void t(Object obj, Object obj2, String str) {
        throw new wp3(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void v(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void x(Object obj, Object obj2, String str) {
        throw new lp0(str + obj + ((Object) " at path ") + obj2, null);
    }

    @Override // defpackage.nae
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.rih
    public List b(String str, boolean z, boolean z2) {
        return zjh.e(str, z, z2);
    }

    @Override // defpackage.pbh
    public int c(jx7 jx7Var, int i) {
        jx7Var.getClass();
        return eeh.b(0.33333334f * i);
    }

    @Override // defpackage.yjh
    public int g(Object obj) {
        String str = ((mih) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (dvt.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // defpackage.arr
    public Object get() {
        return new lcr(Integer.MAX_VALUE);
    }

    @Override // defpackage.azo
    public void onFound(vjp vjpVar) {
        K8.g.a.a(vjpVar);
    }

    @Override // defpackage.bzo
    public void onLost(vjp vjpVar) {
        K8.g.a.b(vjpVar);
    }
}
