package com.anythink.core.common.n.c;

import android.os.Build;
import com.anythink.core.common.n.c.a.AnonymousClass1;
import com.anythink.core.common.n.c.a.AnonymousClass2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f16677a = Logger.getLogger(n.class.getName());

    private n() {
    }

    public static e a(w wVar) {
        return new r(wVar);
    }

    public static v b(File file) {
        if (file != null) {
            return a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static v c(File file) {
        if (file != null) {
            return a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static d a(v vVar) {
        return new q(vVar);
    }

    private static v a(OutputStream outputStream) {
        return a(outputStream, new x());
    }

    private static v b(Path path, OpenOption... openOptionArr) {
        OutputStream newOutputStream;
        if (path != null) {
            newOutputStream = Files.newOutputStream(path, openOptionArr);
            return a(newOutputStream);
        }
        throw new IllegalArgumentException("path == null");
    }

    private static a c(final Socket socket) {
        return new a() { // from class: com.anythink.core.common.n.c.n.4
            @Override // com.anythink.core.common.n.c.a
            public final IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.anythink.core.common.n.c.a
            public final void a() {
                try {
                    socket.close();
                } catch (AssertionError e9) {
                    if (n.a(e9)) {
                        n.f16677a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e9);
                        return;
                    }
                    throw e9;
                } catch (Exception e10) {
                    n.f16677a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
                }
            }
        };
    }

    private static v a(final OutputStream outputStream, final x xVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (xVar != null) {
            return new v() { // from class: com.anythink.core.common.n.c.n.1
                @Override // com.anythink.core.common.n.c.v
                public final void a(c cVar, long j6) {
                    y.a(cVar.f16634c, 0L, j6);
                    while (j6 > 0) {
                        x.this.g();
                        s sVar = cVar.f16633b;
                        int min = (int) Math.min(j6, sVar.f16703e - sVar.f16702d);
                        outputStream.write(sVar.f16701c, sVar.f16702d, min);
                        int i = sVar.f16702d + min;
                        sVar.f16702d = i;
                        long j9 = min;
                        j6 -= j9;
                        cVar.f16634c -= j9;
                        if (i == sVar.f16703e) {
                            cVar.f16633b = sVar.c();
                            t.a(sVar);
                        }
                    }
                }

                @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    outputStream.close();
                }

                @Override // com.anythink.core.common.n.c.v, java.io.Flushable
                public final void flush() {
                    outputStream.flush();
                }

                public final String toString() {
                    return "sink(" + outputStream + ")";
                }

                @Override // com.anythink.core.common.n.c.v
                public final x a() {
                    return x.this;
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static w b(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                a c9 = c(socket);
                return c9.new AnonymousClass2(a(socket.getInputStream(), c9));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static v a(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                a c9 = c(socket);
                return c9.new AnonymousClass1(a(socket.getOutputStream(), c9));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static w a(InputStream inputStream) {
        return a(inputStream, new x());
    }

    private static w a(final InputStream inputStream, final x xVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (xVar != null) {
            return new w() { // from class: com.anythink.core.common.n.c.n.2
                @Override // com.anythink.core.common.n.c.w
                public final x a() {
                    return x.this;
                }

                @Override // com.anythink.core.common.n.c.w
                public final long a_(c cVar, long j6) {
                    if (j6 < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
                    }
                    if (j6 == 0) {
                        return 0L;
                    }
                    try {
                        x.this.g();
                        s g9 = cVar.g(1);
                        int read = inputStream.read(g9.f16701c, g9.f16703e, (int) Math.min(j6, 8192 - g9.f16703e));
                        if (read == -1) {
                            return -1L;
                        }
                        g9.f16703e += read;
                        long j9 = read;
                        cVar.f16634c += j9;
                        return j9;
                    } catch (AssertionError e9) {
                        if (n.a(e9)) {
                            throw new IOException(e9);
                        }
                        throw e9;
                    }
                }

                @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    inputStream.close();
                }

                public final String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static w a(File file) {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    private static w a(Path path, OpenOption... openOptionArr) {
        File file;
        InputStream newInputStream;
        if (path != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                newInputStream = Files.newInputStream(path, openOptionArr);
                return a(newInputStream);
            }
            file = path.toFile();
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static v a() {
        return new v() { // from class: com.anythink.core.common.n.c.n.3
            @Override // com.anythink.core.common.n.c.v
            public final void a(c cVar, long j6) {
                cVar.i(j6);
            }

            @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // com.anythink.core.common.n.c.v, java.io.Flushable
            public final void flush() {
            }

            @Override // com.anythink.core.common.n.c.v
            public final x a() {
                return x.f16712c;
            }
        };
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
