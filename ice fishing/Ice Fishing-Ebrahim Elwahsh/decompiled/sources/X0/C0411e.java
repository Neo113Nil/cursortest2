package X0;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import j1.AbstractC4591d;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: X0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0411e implements y {
    @Override // X0.y
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C0411e c0411e = LottieAnimationView.J;
        Matrix matrix = j1.j.f38533a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        AbstractC4591d.c("Unable to load composition.", th);
    }
}
