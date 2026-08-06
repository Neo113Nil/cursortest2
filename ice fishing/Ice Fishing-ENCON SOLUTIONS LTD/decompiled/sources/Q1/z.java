package Q1;

import i1.AbstractC0251h;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1693f = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final W1.p f1694a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.g f1695b;

    /* renamed from: c, reason: collision with root package name */
    public int f1696c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1697d;

    /* renamed from: e, reason: collision with root package name */
    public final C0082e f1698e;

    public z(W1.p sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f1694a = sink;
        W1.g gVar = new W1.g();
        this.f1695b = gVar;
        this.f1696c = 16384;
        this.f1698e = new C0082e(gVar);
    }

    public final synchronized void a(D peerSettings) {
        try {
            kotlin.jvm.internal.i.e(peerSettings, "peerSettings");
            if (this.f1697d) {
                throw new IOException("closed");
            }
            int i2 = this.f1696c;
            int i3 = peerSettings.f1561a;
            if ((i3 & 32) != 0) {
                i2 = peerSettings.f1562b[5];
            }
            this.f1696c = i2;
            if (((i3 & 2) != 0 ? peerSettings.f1562b[1] : -1) != -1) {
                C0082e c0082e = this.f1698e;
                int i4 = (i3 & 2) != 0 ? peerSettings.f1562b[1] : -1;
                c0082e.getClass();
                int min = Math.min(i4, 16384);
                int i5 = c0082e.f1592e;
                if (i5 != min) {
                    if (min < i5) {
                        c0082e.f1590c = Math.min(c0082e.f1590c, min);
                    }
                    c0082e.f1591d = true;
                    c0082e.f1592e = min;
                    int i6 = c0082e.f1596i;
                    if (min < i6) {
                        if (min == 0) {
                            C0080c[] c0080cArr = c0082e.f1593f;
                            AbstractC0251h.P(c0080cArr, 0, c0080cArr.length);
                            c0082e.f1594g = c0082e.f1593f.length - 1;
                            c0082e.f1595h = 0;
                            c0082e.f1596i = 0;
                        } else {
                            c0082e.a(i6 - min);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f1694a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z2, int i2, W1.g gVar, int i3) {
        if (this.f1697d) {
            throw new IOException("closed");
        }
        c(i2, i3, 0, z2 ? 1 : 0);
        if (i3 > 0) {
            kotlin.jvm.internal.i.b(gVar);
            this.f1694a.h(gVar, i3);
        }
    }

    public final void c(int i2, int i3, int i4, int i5) {
        Level level = Level.FINE;
        Logger logger = f1693f;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i2, i3, i4, i5));
        }
        if (i3 > this.f1696c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1696c + ": " + i3).toString());
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(Integer.valueOf(i2), "reserved bit set: ").toString());
        }
        byte[] bArr = K1.b.f1051a;
        W1.p pVar = this.f1694a;
        kotlin.jvm.internal.i.e(pVar, "<this>");
        pVar.b((i3 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b((i3 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b(i5 & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.c(i2 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1697d = true;
        this.f1694a.close();
    }

    public final synchronized void flush() {
        if (this.f1697d) {
            throw new IOException("closed");
        }
        this.f1694a.flush();
    }

    public final synchronized void j(int i2, EnumC0079b enumC0079b, byte[] bArr) {
        if (this.f1697d) {
            throw new IOException("closed");
        }
        if (enumC0079b.f1571a == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        c(0, bArr.length + 8, 7, 0);
        this.f1694a.c(i2);
        this.f1694a.c(enumC0079b.f1571a);
        if (bArr.length != 0) {
            W1.p pVar = this.f1694a;
            if (pVar.f1894c) {
                throw new IllegalStateException("closed");
            }
            pVar.f1893b.s(bArr, 0, bArr.length);
            pVar.a();
        }
        this.f1694a.flush();
    }

    public final synchronized void k(boolean z2, int i2, ArrayList arrayList) {
        if (this.f1697d) {
            throw new IOException("closed");
        }
        this.f1698e.d(arrayList);
        long j2 = this.f1695b.f1875b;
        long min = Math.min(this.f1696c, j2);
        int i3 = j2 == min ? 4 : 0;
        if (z2) {
            i3 |= 1;
        }
        c(i2, (int) min, 1, i3);
        this.f1694a.h(this.f1695b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f1696c, j3);
                j3 -= min2;
                c(i2, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f1694a.h(this.f1695b, min2);
            }
        }
    }

    public final synchronized void l(int i2, int i3, boolean z2) {
        if (this.f1697d) {
            throw new IOException("closed");
        }
        c(0, 8, 6, z2 ? 1 : 0);
        this.f1694a.c(i2);
        this.f1694a.c(i3);
        this.f1694a.flush();
    }

    public final synchronized void m(int i2, EnumC0079b enumC0079b) {
        if (this.f1697d) {
            throw new IOException("closed");
        }
        if (enumC0079b.f1571a == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c(i2, 4, 3, 0);
        this.f1694a.c(enumC0079b.f1571a);
        this.f1694a.flush();
    }

    public final synchronized void n(int i2, long j2) {
        if (this.f1697d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(Long.valueOf(j2), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        c(i2, 4, 8, 0);
        this.f1694a.c((int) j2);
        this.f1694a.flush();
    }
}
