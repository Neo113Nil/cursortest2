package defpackage;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
public abstract class gy6 {
    private static final String GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private static final int OPCODE_BINARY = 2;
    private static final int OPCODE_CLOSE = 8;
    private static final int OPCODE_CONTINUATION = 0;
    private static final int OPCODE_ERROR_CLOSE = 15;
    private static final int OPCODE_PING = 9;
    private static final int OPCODE_PONG = 10;
    private static final int OPCODE_TEXT = 1;
    private int connectionCreateTryLimit;
    private int connectionRetryCounter;
    private int connectionRetryLimit;
    private volatile Thread reconnectionThread;
    private SSLSocketFactory socketFactory;
    private final URI uri;
    private volatile boolean wasPrimaryConnectionSuccessful = false;
    private final Object globalLock = new Object();
    private final SecureRandom secureRandom = new SecureRandom();
    private int connectTimeout = 0;
    private int readTimeout = 0;
    private boolean automaticReconnection = false;
    private long waitTimeBeforeReconnection = 0;
    private volatile boolean isRunning = false;
    private final Map<String, String> headers = new HashMap();
    private volatile fy6 webSocketConnection = new fy6(this);

    public gy6(URI uri) {
        this.uri = uri;
    }

    public static void a(gy6 gy6Var) {
        try {
            Thread.sleep(gy6Var.waitTimeBeforeReconnection);
            synchronized (gy6Var.globalLock) {
                try {
                    if (gy6Var.isRunning) {
                        gy6Var.webSocketConnection = new fy6(gy6Var);
                        new Thread(new ey6(gy6Var, 0)).start();
                    }
                } finally {
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    public static /* synthetic */ void b(gy6 gy6Var) {
        synchronized (gy6Var.globalLock) {
            try {
                gy6Var.isRunning = false;
                if (gy6Var.reconnectionThread != null) {
                    gy6Var.reconnectionThread.interrupt();
                }
                gy6Var.webSocketConnection.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(gy6 gy6Var) {
        try {
            if (fy6.a(gy6Var.webSocketConnection)) {
                fy6.c(gy6Var.webSocketConnection);
            }
        } catch (Exception e) {
            synchronized (gy6Var.globalLock) {
                try {
                    if (gy6Var.isRunning) {
                        gy6Var.webSocketConnection.d();
                        gy6Var.onException(e);
                        if ((e instanceof IOException) && gy6Var.automaticReconnection) {
                            int i = gy6Var.wasPrimaryConnectionSuccessful ? gy6Var.connectionRetryLimit : gy6Var.connectionCreateTryLimit;
                            int i2 = gy6Var.connectionRetryCounter;
                            if (i2 < i) {
                                gy6Var.connectionRetryCounter = i2 + 1;
                                gy6Var.onReconnection();
                                gy6Var.reconnectionThread = new Thread(new ey6(gy6Var, 2));
                                gy6Var.reconnectionThread.start();
                            } else {
                                gy6Var.r(15, "RECONNECTION_LIMIT_REACHED");
                            }
                        } else {
                            gy6Var.r(15, "NO_RECONNECTION");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void l(gy6 gy6Var, byte[] bArr) {
        synchronized (gy6Var.globalLock) {
            try {
                if (gy6Var.isRunning) {
                    gy6Var.onBinaryReceived(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m(gy6 gy6Var, wp3 wp3Var) {
        synchronized (gy6Var.globalLock) {
            try {
                if (gy6Var.isRunning) {
                    gy6Var.onException(wp3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void n(gy6 gy6Var) {
        synchronized (gy6Var.globalLock) {
            try {
                if (gy6Var.isRunning) {
                    gy6Var.onOpen();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o(gy6 gy6Var, byte[] bArr) {
        synchronized (gy6Var.globalLock) {
            try {
                if (gy6Var.isRunning) {
                    gy6Var.onPingReceived(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(gy6 gy6Var, byte[] bArr) {
        synchronized (gy6Var.globalLock) {
            try {
                if (gy6Var.isRunning) {
                    gy6Var.onPongReceived(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void q(gy6 gy6Var, String str) {
        synchronized (gy6Var.globalLock) {
            try {
                if (gy6Var.isRunning) {
                    gy6Var.onTextReceived(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addHeader(String str, String str2) {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    throw new IllegalStateException("Cannot add header while WebSocketClient is running");
                }
                this.headers.put(str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        new Thread(new ey6(this, 1)).start();
    }

    public void connect() {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    throw new IllegalStateException("WebSocketClient is not reusable");
                }
                this.isRunning = true;
                new Thread(new ey6(this, 0)).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void disableAutomaticReconnection() {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    throw new IllegalStateException("Cannot disable automatic reconnection while WebSocketClient is running");
                }
                this.automaticReconnection = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void enableAutomaticReconnection(long j) {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    throw new IllegalStateException("Cannot enable automatic reconnection while WebSocketClient is running");
                }
                if (j < 0) {
                    throw new IllegalStateException("Wait time between reconnections must be greater or equal than zero");
                }
                this.automaticReconnection = true;
                this.waitTimeBeforeReconnection = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void onBinaryReceived(byte[] bArr);

    public abstract void onCloseReceived(int i, String str);

    public abstract void onException(Exception exc);

    public abstract void onOpen();

    public abstract void onPingReceived(byte[] bArr);

    public abstract void onPongReceived(byte[] bArr);

    public abstract void onReconnection();

    public abstract void onTextReceived(String str);

    public final void r(int i, String str) {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    onCloseReceived(i, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void send(String str) {
        fy6.b(this.webSocketConnection, new ldk(1, str.getBytes(StandardCharsets.UTF_8)));
    }

    public void sendPing(byte[] bArr) {
        fy6.b(this.webSocketConnection, new ldk(9, bArr));
    }

    public void sendPong(byte[] bArr) {
        fy6.b(this.webSocketConnection, new ldk(10, bArr));
    }

    public void setConnectTimeout(int i) {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    throw new IllegalStateException("Cannot set connect timeout while WebSocketClient is running");
                }
                if (i < 0) {
                    throw new IllegalStateException("Connect timeout must be greater or equal than zero");
                }
                this.connectTimeout = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setConnectionCreateTries(int i) {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    throw new IllegalStateException("Cannot set connection tries when WebSocketClient is running");
                }
                if (i < 0) {
                    throw new IllegalStateException("Connection create try count must be greater or equal than zero");
                }
                this.connectionCreateTryLimit = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setConnectionRetries(int i) {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    throw new IllegalStateException("Cannot set connection retries while WebSocketClient is running");
                }
                if (i < 0) {
                    throw new IllegalStateException("Connection retry count must be greater or equal than zero");
                }
                this.connectionRetryLimit = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setReadTimeout(int i) {
        synchronized (this.globalLock) {
            try {
                if (this.isRunning) {
                    throw new IllegalStateException("Cannot set read timeout while WebSocketClient is running");
                }
                if (i < 0) {
                    throw new IllegalStateException("Read timeout must be greater or equal than zero");
                }
                this.readTimeout = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.socketFactory = sSLSocketFactory;
    }

    public void send(byte[] bArr) {
        fy6.b(this.webSocketConnection, new ldk(2, bArr));
    }
}
