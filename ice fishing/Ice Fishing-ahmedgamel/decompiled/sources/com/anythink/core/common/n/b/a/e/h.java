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
    static final Logger f16060a = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    final d.a f16061b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.c.e f16062c;

    /* renamed from: d, reason: collision with root package name */
    private final a f16063d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16064e;

    public static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        int f16065a;

        /* renamed from: b, reason: collision with root package name */
        byte f16066b;

        /* renamed from: c, reason: collision with root package name */
        int f16067c;

        /* renamed from: d, reason: collision with root package name */
        int f16068d;

        /* renamed from: e, reason: collision with root package name */
        short f16069e;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f16070f;

        public a(com.anythink.core.common.n.c.e eVar) {
            this.f16070f = eVar;
        }

        private void b() {
            int i = this.f16067c;
            int a9 = h.a(this.f16070f);
            this.f16068d = a9;
            this.f16065a = a9;
            byte k9 = (byte) (this.f16070f.k() & 255);
            this.f16066b = (byte) (this.f16070f.k() & 255);
            Logger logger = h.f16060a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(true, this.f16067c, this.f16065a, k9, this.f16066b));
            }
            int m9 = this.f16070f.m() & Integer.MAX_VALUE;
            this.f16067c = m9;
            if (k9 != 9) {
                throw e.b("%s != TYPE_CONTINUATION", Byte.valueOf(k9));
            }
            if (m9 != i) {
                throw e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return this.f16070f.a();
        }

        @Override // com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            int i;
            int m9;
            do {
                int i4 = this.f16068d;
                if (i4 != 0) {
                    long a_ = this.f16070f.a_(cVar, Math.min(j6, i4));
                    if (a_ == -1) {
                        return -1L;
                    }
                    this.f16068d = (int) (this.f16068d - a_);
                    return a_;
                }
                this.f16070f.i(this.f16069e);
                this.f16069e = (short) 0;
                if ((this.f16066b & 4) != 0) {
                    return -1L;
                }
                i = this.f16067c;
                int a9 = h.a(this.f16070f);
                this.f16068d = a9;
                this.f16065a = a9;
                byte k9 = (byte) (this.f16070f.k() & 255);
                this.f16066b = (byte) (this.f16070f.k() & 255);
                Logger logger = h.f16060a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.a(true, this.f16067c, this.f16065a, k9, this.f16066b));
                }
                m9 = this.f16070f.m() & Integer.MAX_VALUE;
                this.f16067c = m9;
                if (k9 != 9) {
                    throw e.b("%s != TYPE_CONTINUATION", Byte.valueOf(k9));
                }
            } while (m9 == i);
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

        void a(boolean z6, int i, int i4);

        void a(boolean z6, int i, com.anythink.core.common.n.c.e eVar, int i4);

        void a(boolean z6, int i, List<c> list);

        void b();

        void d();
    }

    public h(com.anythink.core.common.n.c.e eVar, boolean z6) {
        this.f16062c = eVar;
        this.f16064e = z6;
        a aVar = new a(eVar);
        this.f16063d = aVar;
        this.f16061b = new d.a(aVar, (byte) 0);
    }

    private void b(b bVar, int i, byte b9, int i4) {
        if (i4 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z6 = (b9 & 1) != 0;
        if ((b9 & 32) != 0) {
            throw e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short k9 = (b9 & 8) != 0 ? (short) (this.f16062c.k() & 255) : (short) 0;
        bVar.a(z6, i4, this.f16062c, a(i, b9, k9));
        this.f16062c.i(k9);
    }

    private void c(b bVar, int i, byte b9, int i4) {
        if (i4 != 0) {
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
        for (int i6 = 0; i6 < i; i6 += 6) {
            int l9 = this.f16062c.l() & 65535;
            int m9 = this.f16062c.m();
            if (l9 != 2) {
                if (l9 == 3) {
                    l9 = 4;
                } else if (l9 == 4) {
                    if (m9 < 0) {
                        throw e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    }
                    l9 = 7;
                } else if (l9 == 5 && (m9 < 16384 || m9 > 16777215)) {
                    throw e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(m9));
                }
            } else if (m9 != 0 && m9 != 1) {
                throw e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
            mVar.a(l9, m9);
        }
        bVar.a(mVar);
    }

    private void d(b bVar, int i, byte b9, int i4) {
        if (i4 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short k9 = (b9 & 8) != 0 ? (short) (this.f16062c.k() & 255) : (short) 0;
        bVar.a(this.f16062c.m() & Integer.MAX_VALUE, a(a(i - 4, b9, k9), k9, b9, i4));
    }

    private void e(b bVar, int i, byte b9, int i4) {
        if (i != 8) {
            throw e.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i4 != 0) {
            throw e.b("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.a((b9 & 1) != 0, this.f16062c.m(), this.f16062c.m());
    }

    public final void a(b bVar) {
        if (this.f16064e) {
            if (!a(true, bVar)) {
                throw e.b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        com.anythink.core.common.n.c.e eVar = this.f16062c;
        com.anythink.core.common.n.c.f fVar = e.f15948a;
        com.anythink.core.common.n.c.f d9 = eVar.d(fVar.j());
        Logger logger = f16060a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(com.anythink.core.common.n.b.a.c.a("<< CONNECTION %s", d9.g()));
        }
        if (!fVar.equals(d9)) {
            throw e.b("Expected a connection header but was %s", d9.a());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16062c.close();
    }

    private void b(b bVar, int i, int i4) {
        if (i < 8) {
            throw e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i4 == 0) {
            int m9 = this.f16062c.m();
            int m10 = this.f16062c.m();
            int i6 = i - 8;
            if (com.anythink.core.common.n.b.a.e.b.a(m10) != null) {
                com.anythink.core.common.n.c.f fVar = com.anythink.core.common.n.c.f.f16645b;
                if (i6 > 0) {
                    fVar = this.f16062c.d(i6);
                }
                bVar.a(m9, fVar);
                return;
            }
            throw e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(m10));
        }
        throw e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(boolean z6, b bVar) {
        try {
            this.f16062c.a(9L);
            int a9 = a(this.f16062c);
            if (a9 >= 0 && a9 <= 16384) {
                byte k9 = (byte) (this.f16062c.k() & 255);
                if (z6 && k9 != 4) {
                    throw e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(k9));
                }
                byte k10 = (byte) (this.f16062c.k() & 255);
                int m9 = this.f16062c.m() & Integer.MAX_VALUE;
                Logger logger = f16060a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.a(true, m9, a9, k9, k10));
                }
                switch (k9) {
                    case 0:
                        if (m9 == 0) {
                            throw e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        }
                        boolean z9 = (k10 & 1) != 0;
                        if ((k10 & 32) == 0) {
                            short k11 = (k10 & 8) != 0 ? (short) (this.f16062c.k() & 255) : (short) 0;
                            bVar.a(z9, m9, this.f16062c, a(a9, k10, k11));
                            this.f16062c.i(k11);
                            return true;
                        }
                        throw e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    case 1:
                        if (m9 != 0) {
                            boolean z10 = (k10 & 1) != 0;
                            short k12 = (k10 & 8) != 0 ? (short) (this.f16062c.k() & 255) : (short) 0;
                            if ((k10 & 32) != 0) {
                                a();
                                a9 -= 5;
                            }
                            bVar.a(z10, m9, a(a(a9, k10, k12), k12, k10, m9));
                            return true;
                        }
                        throw e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    case 2:
                        if (a9 != 5) {
                            throw e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a9));
                        }
                        if (m9 != 0) {
                            a();
                            return true;
                        }
                        throw e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                    case 3:
                        if (a9 != 4) {
                            throw e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a9));
                        }
                        if (m9 != 0) {
                            int m10 = this.f16062c.m();
                            com.anythink.core.common.n.b.a.e.b a10 = com.anythink.core.common.n.b.a.e.b.a(m10);
                            if (a10 != null) {
                                bVar.a(m9, a10);
                                return true;
                            }
                            throw e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(m10));
                        }
                        throw e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    case 4:
                        if (m9 != 0) {
                            throw e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        }
                        if ((k10 & 1) != 0) {
                            if (a9 != 0) {
                                throw e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                        } else if (a9 % 6 == 0) {
                            m mVar = new m();
                            for (int i = 0; i < a9; i += 6) {
                                int l9 = this.f16062c.l() & 65535;
                                int m11 = this.f16062c.m();
                                if (l9 != 2) {
                                    if (l9 == 3) {
                                        l9 = 4;
                                    } else if (l9 == 4) {
                                        if (m11 < 0) {
                                            throw e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        }
                                        l9 = 7;
                                    } else if (l9 == 5 && (m11 < 16384 || m11 > 16777215)) {
                                        throw e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(m11));
                                    }
                                } else if (m11 != 0 && m11 != 1) {
                                    throw e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                                mVar.a(l9, m11);
                            }
                            bVar.a(mVar);
                        } else {
                            throw e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a9));
                        }
                        return true;
                    case 5:
                        if (m9 != 0) {
                            short k13 = (k10 & 8) != 0 ? (short) (this.f16062c.k() & 255) : (short) 0;
                            bVar.a(this.f16062c.m() & Integer.MAX_VALUE, a(a(a9 - 4, k10, k13), k13, k10, m9));
                            return true;
                        }
                        throw e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    case 6:
                        if (a9 != 8) {
                            throw e.b("TYPE_PING length != 8: %s", Integer.valueOf(a9));
                        }
                        if (m9 == 0) {
                            bVar.a((k10 & 1) != 0, this.f16062c.m(), this.f16062c.m());
                            return true;
                        }
                        throw e.b("TYPE_PING streamId != 0", new Object[0]);
                    case 7:
                        if (a9 < 8) {
                            throw e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a9));
                        }
                        if (m9 == 0) {
                            int m12 = this.f16062c.m();
                            int m13 = this.f16062c.m();
                            int i4 = a9 - 8;
                            if (com.anythink.core.common.n.b.a.e.b.a(m13) != null) {
                                com.anythink.core.common.n.c.f fVar = com.anythink.core.common.n.c.f.f16645b;
                                if (i4 > 0) {
                                    fVar = this.f16062c.d(i4);
                                }
                                bVar.a(m12, fVar);
                                return true;
                            }
                            throw e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(m13));
                        }
                        throw e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                    case 8:
                        if (a9 == 4) {
                            long m14 = this.f16062c.m() & 2147483647L;
                            if (m14 != 0) {
                                bVar.a(m9, m14);
                                return true;
                            }
                            throw e.b("windowSizeIncrement was 0", Long.valueOf(m14));
                        }
                        throw e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a9));
                    default:
                        this.f16062c.i(a9);
                        return true;
                }
            }
            throw e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a9));
        } catch (EOFException unused) {
            return false;
        }
    }

    private void c(b bVar, int i, int i4) {
        if (i == 4) {
            long m9 = this.f16062c.m() & 2147483647L;
            if (m9 != 0) {
                bVar.a(i4, m9);
                return;
            }
            throw e.b("windowSizeIncrement was 0", Long.valueOf(m9));
        }
        throw e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
    }

    private void a(b bVar, int i, byte b9, int i4) {
        if (i4 != 0) {
            boolean z6 = (b9 & 1) != 0;
            short k9 = (b9 & 8) != 0 ? (short) (this.f16062c.k() & 255) : (short) 0;
            if ((b9 & 32) != 0) {
                a();
                i -= 5;
            }
            bVar.a(z6, i4, a(a(i, b9, k9), k9, b9, i4));
            return;
        }
        throw e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    private List<c> a(int i, short s9, byte b9, int i4) {
        a aVar = this.f16063d;
        aVar.f16068d = i;
        aVar.f16065a = i;
        aVar.f16069e = s9;
        aVar.f16066b = b9;
        aVar.f16067c = i4;
        this.f16061b.a();
        return this.f16061b.b();
    }

    private void a(int i, int i4) {
        if (i != 5) {
            throw e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i4 != 0) {
            a();
            return;
        }
        throw e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
    }

    private void a() {
        this.f16062c.m();
        this.f16062c.k();
    }

    private void a(b bVar, int i, int i4) {
        if (i != 4) {
            throw e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i4 != 0) {
            int m9 = this.f16062c.m();
            com.anythink.core.common.n.b.a.e.b a9 = com.anythink.core.common.n.b.a.e.b.a(m9);
            if (a9 != null) {
                bVar.a(i4, a9);
                return;
            }
            throw e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(m9));
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
