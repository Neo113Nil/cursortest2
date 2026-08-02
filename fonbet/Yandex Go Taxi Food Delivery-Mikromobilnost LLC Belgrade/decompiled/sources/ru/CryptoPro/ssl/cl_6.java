package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLSocket;
import ru.CryptoPro.JCP.Util.GetProperty;

/* loaded from: classes4.dex */
abstract class cl_6 extends SSLSocket {
    public static final boolean c = GetProperty.getBooleanProperty("com.sun.net.ssl.requireCloseNotify", false);
    public final Socket a;
    public final InputStream b;

    public cl_6() {
        this.a = this;
        this.b = null;
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
        if (this.a == this) {
            super.bind(socketAddress);
        } else {
            ny61.v("Underlying socket should already be connected");
        }
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            Socket socket = this.a;
            if (socket == this) {
                super.close();
            } else {
                socket.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
        connect(socketAddress, 0);
    }

    public final void finalize() {
        try {
            try {
                try {
                    close();
                } catch (IOException unused) {
                    if (this.a == this) {
                        super.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } finally {
            super.finalize();
        }
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        Socket socket = this.a;
        return socket == this ? super.getChannel() : socket.getChannel();
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        Socket socket = this.a;
        return socket == this ? super.getInetAddress() : socket.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        Socket socket = this.a;
        if (socket == this) {
            return super.getInputStream();
        }
        InputStream inputStream = this.b;
        return inputStream != null ? new SequenceInputStream(inputStream, socket.getInputStream()) : socket.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() throws SocketException {
        Socket socket = this.a;
        return socket == this ? super.getKeepAlive() : socket.getKeepAlive();
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        Socket socket = this.a;
        return socket == this ? super.getLocalAddress() : socket.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        Socket socket = this.a;
        return socket == this ? super.getLocalPort() : socket.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        Socket socket = this.a;
        return socket == this ? super.getLocalSocketAddress() : socket.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() throws SocketException {
        throw new SocketException("This method is ineffective, since sending urgent data is not supported by SSLSockets");
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        Socket socket = this.a;
        return socket == this ? super.getOutputStream() : socket.getOutputStream();
    }

    @Override // java.net.Socket
    public final int getPort() {
        Socket socket = this.a;
        return socket == this ? super.getPort() : socket.getPort();
    }

    @Override // java.net.Socket
    public final int getReceiveBufferSize() throws SocketException {
        Socket socket = this.a;
        return socket == this ? super.getReceiveBufferSize() : socket.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        Socket socket = this.a;
        return socket == this ? super.getRemoteSocketAddress() : socket.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() throws SocketException {
        Socket socket = this.a;
        return socket == this ? super.getReuseAddress() : socket.getReuseAddress();
    }

    @Override // java.net.Socket
    public final int getSendBufferSize() throws SocketException {
        Socket socket = this.a;
        return socket == this ? super.getSendBufferSize() : socket.getSendBufferSize();
    }

    @Override // java.net.Socket
    public final int getSoLinger() throws SocketException {
        Socket socket = this.a;
        return socket == this ? super.getSoLinger() : socket.getSoLinger();
    }

    @Override // java.net.Socket
    public final int getSoTimeout() throws SocketException {
        Socket socket = this.a;
        return socket == this ? super.getSoTimeout() : socket.getSoTimeout();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() throws SocketException {
        Socket socket = this.a;
        return socket == this ? super.getTcpNoDelay() : socket.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() throws SocketException {
        Socket socket = this.a;
        return socket == this ? super.getTrafficClass() : socket.getTrafficClass();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        Socket socket = this.a;
        return socket == this ? super.isBound() : socket.isBound();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        Socket socket = this.a;
        return socket == this ? super.isConnected() : socket.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        Socket socket = this.a;
        return socket == this ? super.isInputShutdown() : socket.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        Socket socket = this.a;
        return socket == this ? super.isOutputShutdown() : socket.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) throws SocketException {
        throw new SocketException("This method is not supported by SSLSockets");
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) throws SocketException {
        Socket socket = this.a;
        if (socket == this) {
            super.setKeepAlive(z);
        } else {
            socket.setKeepAlive(z);
        }
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) throws SocketException {
        throw new SocketException("This method is ineffective, since sending urgent data is not supported by SSLSockets");
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
        Socket socket = this.a;
        if (socket == this) {
            super.setPerformancePreferences(i, i2, i3);
        } else {
            socket.setPerformancePreferences(i, i2, i3);
        }
    }

    @Override // java.net.Socket
    public final void setReceiveBufferSize(int i) throws SocketException {
        Socket socket = this.a;
        if (socket == this) {
            super.setReceiveBufferSize(i);
        } else {
            socket.setReceiveBufferSize(i);
        }
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) throws SocketException {
        Socket socket = this.a;
        if (socket == this) {
            super.setReuseAddress(z);
        } else {
            socket.setReuseAddress(z);
        }
    }

    @Override // java.net.Socket
    public final void setSendBufferSize(int i) throws SocketException {
        Socket socket = this.a;
        if (socket == this) {
            super.setSendBufferSize(i);
        } else {
            socket.setSendBufferSize(i);
        }
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) throws SocketException {
        Socket socket = this.a;
        if (socket == this) {
            super.setSoLinger(z, i);
        } else {
            socket.setSoLinger(z, i);
        }
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i) throws SocketException {
        try {
            Socket socket = this.a;
            if (socket == this) {
                super.setSoTimeout(i);
            } else {
                socket.setSoTimeout(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) throws SocketException {
        Socket socket = this.a;
        if (socket == this) {
            super.setTcpNoDelay(z);
        } else {
            socket.setTcpNoDelay(z);
        }
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) throws SocketException {
        Socket socket = this.a;
        if (socket == this) {
            super.setTrafficClass(i);
        } else {
            socket.setTrafficClass(i);
        }
    }

    @Override // java.net.Socket
    public final void shutdownInput() throws IOException {
        throw new UnsupportedOperationException("The method shutdownInput() is not supported in SSLSocket");
    }

    @Override // java.net.Socket
    public final void shutdownOutput() throws IOException {
        throw new UnsupportedOperationException("The method shutdownOutput() is not supported in SSLSocket");
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public String toString() {
        Socket socket = this.a;
        return socket == this ? super.toString() : socket.toString();
    }

    public cl_6(Socket socket) {
        this.a = socket;
        this.b = null;
    }

    public cl_6(Socket socket, InputStream inputStream) {
        this.a = socket;
        this.b = inputStream;
    }
}
