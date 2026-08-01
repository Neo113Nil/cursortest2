package com.anythink.core.common.n.b.a.e;

import com.anythink.core.common.n.b.a.e.d;
import com.anythink.core.common.n.c.w;
import com.anythink.core.common.n.c.x;
import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f15273a = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    final d.a f15274b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.c.e f15275c;

    /* renamed from: d, reason: collision with root package name */
    private final a f15276d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15277e;

    public static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        int f15278a;

        /* renamed from: b, reason: collision with root package name */
        byte f15279b;

        /* renamed from: c, reason: collision with root package name */
        int f15280c;

        /* renamed from: d, reason: collision with root package name */
        int f15281d;

        /* renamed from: e, reason: collision with root package name */
        short f15282e;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f15283f;

        public a(com.anythink.core.common.n.c.e eVar) {
            this.f15283f = eVar;
        }

        private void b() {
            int i = this.f15280c;
            int a9 = h.a(this.f15283f);
            this.f15281d = a9;
            this.f15278a = a9;
            byte k9 = (byte) (this.f15283f.k() & 255);
            this.f15279b = (byte) (this.f15283f.k() & 255);
            Logger logger = h.f15273a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(true, this.f15280c, this.f15278a, k9, this.f15279b));
            }
            int m4 = this.f15283f.m() & Integer.MAX_VALUE;
            this.f15280c = m4;
            if (k9 != 9) {
                throw e.b("%s != TYPE_CONTINUATION", Byte.valueOf(k9));
            }
            if (m4 != i) {
                throw e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return this.f15283f.a();
        }

        @Override // com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            int i;
            int m4;
            do {
                int i6 = this.f15281d;
                if (i6 != 0) {
                    long a_ = this.f15283f.a_(cVar, Math.min(j6, i6));
                    if (a_ == -1) {
                        return -1L;
                    }
                    this.f15281d = (int) (this.f15281d - a_);
                    return a_;
                }
                this.f15283f.i(this.f15282e);
                this.f15282e = (short) 0;
                if ((this.f15279b & 4) != 0) {
                    return -1L;
                }
                i = this.f15280c;
                int a9 = h.a(this.f15283f);
                this.f15281d = a9;
                this.f15278a = a9;
                byte k9 = (byte) (this.f15283f.k() & 255);
                this.f15279b = (byte) (this.f15283f.k() & 255);
                Logger logger = h.f15273a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.a(true, this.f15280c, this.f15278a, k9, this.f15279b));
                }
                m4 = this.f15283f.m() & Integer.MAX_VALUE;
                this.f15280c = m4;
                if (k9 != 9) {
                    throw e.b("%s != TYPE_CONTINUATION", Byte.valueOf(k9));
                }
            } while (m4 == i);
            throw e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public interface b {
        void a();

        void a(int i, long j6);

        void a(int i, com.anythink.core.common.n.b.a.e.b bVar);

        void a(int i, com.anythink.core.common.n.c.f fVar);

        void a(int i, List<c> list);

        void a(m mVar);

        void a(boolean z3, int i, int i6);

        void a(boolean z3, int i, com.anythink.core.common.n.c.e eVar, int i6);

        void a(boolean z3, int i, List<c> list);

        void b();

        void d();
    }

    public h(com.anythink.core.common.n.c.e eVar, boolean z3) {
        this.f15275c = eVar;
        this.f15277e = z3;
        a aVar = new a(eVar);
        this.f15276d = aVar;
        this.f15274b = new d.a(aVar, (byte) 0);
    }

    private void b(b bVar, int i, byte b9, int i6) {
        if (i6 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z3 = (b9 & 1) != 0;
        if ((b9 & 32) != 0) {
            throw e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short k9 = (b9 & 8) != 0 ? (short) (this.f15275c.k() & 255) : (short) 0;
        bVar.a(z3, i6, this.f15275c, a(i, b9, k9));
        this.f15275c.i(k9);
    }

    private void c(b bVar, int i, byte b9, int i6) {
        if (i6 != 0) {
            throw e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b9 & 1) != 0) {
            if (i != 0) {
                throw e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            return;
        }
        if (i % 6 != 0) {
            throw e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        m mVar = new m();
        for (int i9 = 0; i9 < i; i9 += 6) {
            int l9 = this.f15275c.l() & 65535;
            int m4 = this.f15275c.m();
            if (l9 != 2) {
                if (l9 == 3) {
                    l9 = 4;
                } else if (l9 == 4) {
                    if (m4 < 0) {
                        throw e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    }
                    l9 = 7;
                } else if (l9 == 5 && (m4 < 16384 || m4 > 16777215)) {
                    throw e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(m4));
                }
            } else if (m4 != 0 && m4 != 1) {
                throw e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
            mVar.a(l9, m4);
        }
        bVar.a(mVar);
    }

    private void d(b bVar, int i, byte b9, int i6) {
        if (i6 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short k9 = (b9 & 8) != 0 ? (short) (this.f15275c.k() & 255) : (short) 0;
        bVar.a(this.f15275c.m() & Integer.MAX_VALUE, a(a(i - 4, b9, k9), k9, b9, i6));
    }

    private void e(b bVar, int i, byte b9, int i6) {
        if (i != 8) {
            throw e.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i6 != 0) {
            throw e.b("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.a((b9 & 1) != 0, this.f15275c.m(), this.f15275c.m());
    }

    public final void a(b bVar) {
        if (this.f15277e) {
            if (!a(true, bVar)) {
                throw e.b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        com.anythink.core.common.n.c.e eVar = this.f15275c;
        com.anythink.core.common.n.c.f fVar = e.f15161a;
        com.anythink.core.common.n.c.f d2 = eVar.d(fVar.j());
        Logger logger = f15273a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(com.anythink.core.common.n.b.a.c.a("<< CONNECTION %s", d2.g()));
        }
        if (!fVar.equals(d2)) {
            throw e.b("Expected a connection header but was %s", d2.a());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15275c.close();
    }

    private void b(b bVar, int i, int i6) {
        if (i < 8) {
            throw e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i6 == 0) {
            int m4 = this.f15275c.m();
            int m9 = this.f15275c.m();
            int i9 = i - 8;
            if (com.anythink.core.common.n.b.a.e.b.a(m9) != null) {
                com.anythink.core.common.n.c.f fVar = com.anythink.core.common.n.c.f.f15858b;
                if (i9 > 0) {
                    fVar = this.f15275c.d(i9);
                }
                bVar.a(m4, fVar);
                return;
            }
            throw e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(m9));
        }
        throw e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(boolean z3, b bVar) {
        try {
            this.f15275c.a(9L);
            int a9 = a(this.f15275c);
            if (a9 >= 0 && a9 <= 16384) {
                byte k9 = (byte) (this.f15275c.k() & 255);
                if (z3 && k9 != 4) {
                    throw e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(k9));
                }
                byte k10 = (byte) (this.f15275c.k() & 255);
                int m4 = this.f15275c.m() & Integer.MAX_VALUE;
                Logger logger = f15273a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.a(true, m4, a9, k9, k10));
                }
                switch (k9) {
                    case 0:
                        if (m4 == 0) {
                            throw e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        }
                        boolean z6 = (k10 & 1) != 0;
                        if ((k10 & 32) == 0) {
                            short k11 = (k10 & 8) != 0 ? (short) (this.f15275c.k() & 255) : (short) 0;
                            bVar.a(z6, m4, this.f15275c, a(a9, k10, k11));
                            this.f15275c.i(k11);
                            return true;
                        }
                        throw e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    case 1:
                        if (m4 != 0) {
                            boolean z9 = (k10 & 1) != 0;
                            short k12 = (k10 & 8) != 0 ? (short) (this.f15275c.k() & 255) : (short) 0;
                            if ((k10 & 32) != 0) {
                                a();
                                a9 -= 5;
                            }
                            bVar.a(z9, m4, a(a(a9, k10, k12), k12, k10, m4));
                            return true;
                        }
                        throw e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    case 2:
                        if (a9 != 5) {
                            throw e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a9));
                        }
                        if (m4 != 0) {
                            a();
                            return true;
                        }
                        throw e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                    case 3:
                        if (a9 != 4) {
                            throw e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a9));
                        }
                        if (m4 != 0) {
                            int m9 = this.f15275c.m();
                            com.anythink.core.common.n.b.a.e.b a10 = com.anythink.core.common.n.b.a.e.b.a(m9);
                            if (a10 != null) {
                                bVar.a(m4, a10);
                                return true;
                            }
                            throw e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(m9));
                        }
                        throw e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    case 4:
                        if (m4 != 0) {
                            throw e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        }
                        if ((k10 & 1) != 0) {
                            if (a9 != 0) {
                                throw e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                        } else if (a9 % 6 == 0) {
                            m mVar = new m();
                            for (int i = 0; i < a9; i += 6) {
                                int l9 = this.f15275c.l() & 65535;
                                int m10 = this.f15275c.m();
                                if (l9 != 2) {
                                    if (l9 == 3) {
                                        l9 = 4;
                                    } else if (l9 == 4) {
                                        if (m10 < 0) {
                                            throw e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        }
                                        l9 = 7;
                                    } else if (l9 == 5 && (m10 < 16384 || m10 > 16777215)) {
                                        throw e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(m10));
                                    }
                                } else if (m10 != 0 && m10 != 1) {
                                    throw e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                                mVar.a(l9, m10);
                            }
                            bVar.a(mVar);
                        } else {
                            throw e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a9));
                        }
                        return true;
                    case 5:
                        if (m4 != 0) {
                            short k13 = (k10 & 8) != 0 ? (short) (this.f15275c.k() & 255) : (short) 0;
                            bVar.a(this.f15275c.m() & Integer.MAX_VALUE, a(a(a9 - 4, k10, k13), k13, k10, m4));
                            return true;
                        }
                        throw e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    case 6:
                        if (a9 != 8) {
                            throw e.b("TYPE_PING length != 8: %s", Integer.valueOf(a9));
                        }
                        if (m4 == 0) {
                            bVar.a((k10 & 1) != 0, this.f15275c.m(), this.f15275c.m());
                            return true;
                        }
                        throw e.b("TYPE_PING streamId != 0", new Object[0]);
                    case 7:
                        if (a9 < 8) {
                            throw e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a9));
                        }
                        if (m4 == 0) {
                            int m11 = this.f15275c.m();
                            int m12 = this.f15275c.m();
                            int i6 = a9 - 8;
                            if (com.anythink.core.common.n.b.a.e.b.a(m12) != null) {
                                com.anythink.core.common.n.c.f fVar = com.anythink.core.common.n.c.f.f15858b;
                                if (i6 > 0) {
                                    fVar = this.f15275c.d(i6);
                                }
                                bVar.a(m11, fVar);
                                return true;
                            }
                            throw e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(m12));
                        }
                        throw e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                    case 8:
                        if (a9 == 4) {
                            long m13 = this.f15275c.m() & 2147483647L;
                            if (m13 != 0) {
                                bVar.a(m4, m13);
                                return true;
                            }
                            throw e.b("windowSizeIncrement was 0", Long.valueOf(m13));
                        }
                        throw e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a9));
                    default:
                        this.f15275c.i(a9);
                        return true;
                }
            }
            throw e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a9));
        } catch (EOFException unused) {
            return false;
        }
    }

    private void c(b bVar, int i, int i6) {
        if (i == 4) {
            long m4 = this.f15275c.m() & 2147483647L;
            if (m4 != 0) {
                bVar.a(i6, m4);
                return;
            }
            throw e.b("windowSizeIncrement was 0", Long.valueOf(m4));
        }
        throw e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
    }

    private void a(b bVar, int i, byte b9, int i6) {
        if (i6 != 0) {
            boolean z3 = (b9 & 1) != 0;
            short k9 = (b9 & 8) != 0 ? (short) (this.f15275c.k() & 255) : (short) 0;
            if ((b9 & 32) != 0) {
                a();
                i -= 5;
            }
            bVar.a(z3, i6, a(a(i, b9, k9), k9, b9, i6));
            return;
        }
        throw e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    private List<c> a(int i, short s9, byte b9, int i6) {
        a aVar = this.f15276d;
        aVar.f15281d = i;
        aVar.f15278a = i;
        aVar.f15282e = s9;
        aVar.f15279b = b9;
        aVar.f15280c = i6;
        this.f15274b.a();
        return this.f15274b.b();
    }

    private void a(int i, int i6) {
        if (i != 5) {
            throw e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i6 != 0) {
            a();
            return;
        }
        throw e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
    }

    private void a() {
        this.f15275c.m();
        this.f15275c.k();
    }

    private void a(b bVar, int i, int i6) {
        if (i != 4) {
            throw e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i6 != 0) {
            int m4 = this.f15275c.m();
            com.anythink.core.common.n.b.a.e.b a9 = com.anythink.core.common.n.b.a.e.b.a(m4);
            if (a9 != null) {
                bVar.a(i6, a9);
                return;
            }
            throw e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(m4));
        }
        throw e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
    }

    public static int a(com.anythink.core.common.n.c.e eVar) {
        return (eVar.k() & 255) | ((eVar.k() & 255) << 16) | ((eVar.k() & 255) << 8);
    }

    private static int a(int i, byte b9, short s9) {
        if ((b9 & 8) != 0) {
            i--;
        }
        if (s9 <= i) {
            return (short) (i - s9);
        }
        throw e.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s9), Integer.valueOf(i));
    }
}
