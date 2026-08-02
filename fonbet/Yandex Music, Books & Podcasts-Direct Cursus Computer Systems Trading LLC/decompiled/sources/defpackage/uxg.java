package defpackage;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final /* synthetic */ class uxg implements izg {
    @Override // defpackage.izg
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        int i = LottieAnimationView.a;
        Matrix matrix = rvt.a;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            psg.c("Unable to load composition.", th);
        } else {
            b6e.o("Unable to parse composition", th);
        }
    }
}
