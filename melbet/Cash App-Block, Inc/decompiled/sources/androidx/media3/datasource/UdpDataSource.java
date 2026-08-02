package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class UdpDataSource extends BaseDataSource {
    public InetAddress address;
    public MulticastSocket multicastSocket;
    public boolean opened;
    public final DatagramPacket packet;
    public final byte[] packetBuffer;
    public int packetRemaining;
    public DatagramSocket socket;
    public final int socketTimeoutMillis;
    public Uri uri;

    public final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource() {
        super(true);
        this.socketTimeoutMillis = 8000;
        byte[] bArr = new byte[2000];
        this.packetBuffer = bArr;
        this.packet = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.uri = null;
        MulticastSocket multicastSocket = this.multicastSocket;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.address;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.multicastSocket = null;
        }
        DatagramSocket datagramSocket = this.socket;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.socket = null;
        }
        this.address = null;
        this.packetRemaining = 0;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        Uri uri = dataSpec.uri;
        this.uri = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.uri.getPort();
        transferInitializing();
        try {
            this.address = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.address, port);
            if (this.address.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.multicastSocket = multicastSocket;
                multicastSocket.joinGroup(this.address);
                this.socket = this.multicastSocket;
            } else {
                this.socket = new DatagramSocket(inetSocketAddress);
            }
            this.socket.setSoTimeout(this.socketTimeoutMillis);
            this.opened = true;
            transferStarted(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(2001, e);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(2006, e2);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.packetRemaining;
        DatagramPacket datagramPacket = this.packet;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.socket;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.packetRemaining = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(2002, e);
            } catch (IOException e2) {
                throw new UdpDataSourceException(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.packetRemaining;
        int min = Math.min(i4, i2);
        System.arraycopy(this.packetBuffer, length2 - i4, bArr, i, min);
        this.packetRemaining -= min;
        return min;
    }
}
