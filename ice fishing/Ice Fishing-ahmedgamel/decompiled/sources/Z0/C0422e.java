package Z0;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import l1.AbstractC4668c;

/* renamed from: Z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0422e implements y {
    @Override // Z0.y
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C0422e c0422e = LottieAnimationView.J;
        Matrix matrix = l1.i.f38862a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        AbstractC4668c.c("Unable to load composition.", th);
    }
}
