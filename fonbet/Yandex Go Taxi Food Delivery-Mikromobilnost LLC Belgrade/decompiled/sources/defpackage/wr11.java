package defpackage;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource;
import com.google.common.primitives.a;
import java.net.DatagramSocket;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class wr11 implements jil0 {
    public final UdpDataSource a = new UdpDataSource(a.b(8000));
    public wr11 b;

    @Override // defpackage.jil0
    public final String D() {
        int localPort = getLocalPort();
        d6z.x(localPort != -1);
        int i = tw21.a;
        Locale locale = Locale.US;
        return oyr.h(localPort, localPort + 1, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // defpackage.jil0
    public final boolean K() {
        return true;
    }

    @Override // defpackage.jil0
    public final ws01 M() {
        return null;
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        this.a.addTransferListener(cj01Var);
    }

    @Override // defpackage.kpg
    public final void close() {
        this.a.close();
        wr11 wr11Var = this.b;
        if (wr11Var != null) {
            wr11Var.close();
        }
    }

    @Override // defpackage.jil0
    public final int getLocalPort() {
        DatagramSocket datagramSocket = this.a.x;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        return this.a.w;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        this.a.open(npgVar);
        return -1L;
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.a.read(bArr, i, i2);
        } catch (UdpDataSource.UdpDataSourceException e) {
            if (e.reason == 2002) {
                return -1;
            }
            throw e;
        }
    }
}
