package X0;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import j1.AbstractC4599c;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: X0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0418e implements y {
    @Override // X0.y
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C0418e c0418e = LottieAnimationView.J;
        Matrix matrix = j1.j.f38350a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        AbstractC4599c.c("Unable to load composition.", th);
    }
}
