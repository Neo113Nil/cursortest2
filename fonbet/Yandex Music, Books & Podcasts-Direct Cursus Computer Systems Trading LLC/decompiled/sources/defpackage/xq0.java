package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.media.AudioFocusRequest;
import android.view.autofill.AutofillId;
import android.window.OnBackInvokedDispatcher;
import com.connectsdk.service.webos.lgcast.remotecamera.capture.CameraCapture;
import java.io.EOFException;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final /* synthetic */ class xq0 implements a2s, myc, vp3, CameraCapture.ErrorCallback {
    public static Bitmap a(int i, byte[] bArr) {
        try {
            return qld.x(bArr, i, -1);
        } catch (r7k e) {
            throw new obe("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new obe(e2);
        }
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source d(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest e(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId g(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher h(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void i() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void j(int i, int i2, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj + i2);
    }

    public static /* synthetic */ void k(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void l(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void o(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new SSLPeerUnverifiedException(str + obj);
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void s(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void t(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }

    public static /* synthetic */ void v() {
        throw new EOFException();
    }

    public static /* synthetic */ void w(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void x(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        r2c r2cVar = (r2c) obj;
        r2cVar.getClass();
        return r2cVar.getClass().getSimpleName();
    }

    @Override // defpackage.vp3
    public String f(nb7 nb7Var) {
        String str = nb7Var.h;
        return str != null ? str : nb7Var.a.toString();
    }

    @Override // com.connectsdk.service.webos.lgcast.remotecamera.capture.CameraCapture.ErrorCallback
    public void onError(String str) {
        CameraCapture.lambda$new$0(str);
    }
}
