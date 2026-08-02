package okhttp3.logging;

import defpackage.d5j0;
import defpackage.k4o;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.lvu;
import defpackage.ly3;
import defpackage.m5j0;
import defpackage.m8w;
import defpackage.meu;
import defpackage.oyr;
import defpackage.p8w;
import defpackage.q66;
import defpackage.qq6;
import defpackage.qvu;
import defpackage.r4u;
import defpackage.rvj0;
import defpackage.unr0;
import defpackage.uza;
import defpackage.v9b1;
import defpackage.wg10;
import defpackage.yp6;
import defpackage.zci0;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.enums.a;
import kotlin.text.Regex;
import okhttp3.internal.connection.RealConnection;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.network.Request;

/* loaded from: classes15.dex */
public final class HttpLoggingInterceptor implements p8w {
    public final qvu a;
    public volatile EmptySet b;
    public volatile EmptySet c;
    public volatile Level d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", JCP.RAW_PREFIX, "BASIC", "HEADERS", "BODY", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level BASIC;
        public static final Level BODY;
        public static final Level HEADERS;
        public static final Level NONE;

        static {
            Level level = new Level(JCP.RAW_PREFIX, 0);
            NONE = level;
            Level level2 = new Level("BASIC", 1);
            BASIC = level2;
            Level level3 = new Level("HEADERS", 2);
            HEADERS = level3;
            Level level4 = new Level("BODY", 3);
            BODY = level4;
            Level[] levelArr = {level, level2, level3, level4};
            $VALUES = levelArr;
            $ENTRIES = a.a(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    public HttpLoggingInterceptor(qvu qvuVar) {
        this.a = qvuVar;
        EmptySet emptySet = EmptySet.a;
        this.b = emptySet;
        this.c = emptySet;
        this.d = Level.NONE;
    }

    public final void a(int i, meu meuVar) {
        EmptySet emptySet = this.b;
        meuVar.b(i);
        emptySet.getClass();
        String f = meuVar.f(i);
        this.a.a(meuVar.b(i) + Extension.COLON_SPACE + f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x019a, code lost:
    
        if (r8 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a8, code lost:
    
        if (r3 == null) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd A[LOOP:0: B:38:0x00fb->B:39:0x00fd, LOOP_END] */
    @Override // defpackage.p8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kvj0 intercept(m8w m8wVar) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        Long l;
        Charset charset;
        r4u r4uVar;
        String str4;
        int size;
        int i;
        Long l2;
        Charset charset2;
        Level level = this.d;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        if (level == Level.NONE) {
            return zci0Var.b(d5j0Var);
        }
        boolean z3 = true;
        boolean z4 = level == Level.BODY;
        if (!z4 && level != Level.HEADERS) {
            z3 = false;
        }
        m5j0 m5j0Var = d5j0Var.d;
        q66 q66Var = zci0Var.d;
        RealConnection e = q66Var != null ? q66Var.e() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(d5j0Var.b);
        sb.append(HexString.CHAR_SPACE);
        kwu kwuVar = d5j0Var.a;
        this.c.getClass();
        sb.append(kwuVar.i);
        sb.append(e != null ? " " + e.g : "");
        String sb2 = sb.toString();
        if (!z3 && m5j0Var != null) {
            StringBuilder v = oyr.v(sb2, Extension.O_BRAKE_SPACE);
            v.append(m5j0Var.a());
            v.append("-byte body)");
            sb2 = v.toString();
        }
        this.a.a(sb2);
        if (z3) {
            meu meuVar = d5j0Var.c;
            if (m5j0Var != null) {
                wg10 b = m5j0Var.b();
                z = z4;
                if (b == null || meuVar.a("Content-Type") != null) {
                    z2 = z3;
                    str2 = " ";
                } else {
                    z2 = z3;
                    str2 = " ";
                    this.a.a("Content-Type: " + b);
                }
                if (m5j0Var.a() != -1 && meuVar.a("Content-Length") == null) {
                    qvu qvuVar = this.a;
                    StringBuilder sb3 = new StringBuilder("Content-Length: ");
                    str4 = "-byte body)";
                    sb3.append(m5j0Var.a());
                    qvuVar.a(sb3.toString());
                    size = meuVar.size();
                    for (i = 0; i < size; i++) {
                        a(i, meuVar);
                    }
                    if (z || m5j0Var == null) {
                        str = "";
                        this.a.a("--> END " + d5j0Var.b);
                    } else {
                        String a = d5j0Var.c.a("Content-Encoding");
                        if (a != null && !a.equalsIgnoreCase(ClidProvider.IDENTITY) && !a.equalsIgnoreCase(Request.PARAM_GZIP)) {
                            this.a.a("--> END " + d5j0Var.b + " (encoded body omitted)");
                        } else if (m5j0Var.c()) {
                            this.a.a("--> END " + d5j0Var.b + " (one-shot body omitted)");
                        } else {
                            yp6 yp6Var = new yp6();
                            m5j0Var.d(yp6Var);
                            if (Request.PARAM_GZIP.equalsIgnoreCase(meuVar.a("Content-Encoding"))) {
                                l2 = Long.valueOf(yp6Var.b);
                                r4uVar = new r4u(yp6Var);
                                try {
                                    yp6Var = new yp6();
                                    yp6Var.N1(r4uVar);
                                    r4uVar.close();
                                } finally {
                                }
                            } else {
                                l2 = null;
                            }
                            wg10 b2 = m5j0Var.b();
                            if (b2 != null) {
                                Regex regex = wg10.e;
                                charset2 = b2.a(null);
                            }
                            charset2 = uza.a;
                            this.a.a("");
                            boolean b3 = v9b1.b(yp6Var);
                            qvu qvuVar2 = this.a;
                            if (!b3) {
                                qvuVar2.a("--> END " + d5j0Var.b + " (binary " + m5j0Var.a() + "-byte body omitted)");
                            } else if (l2 != null) {
                                qvuVar2.a("--> END " + d5j0Var.b + Extension.O_BRAKE_SPACE + yp6Var.b + "-byte, " + l2.longValue() + "-gzipped-byte body)");
                            } else {
                                str = "";
                                qvuVar2.a(yp6Var.T(yp6Var.b, charset2));
                                this.a.a("--> END " + d5j0Var.b + Extension.O_BRAKE_SPACE + m5j0Var.a() + str4);
                            }
                        }
                        str = "";
                    }
                }
            } else {
                z = z4;
                z2 = z3;
                str2 = " ";
            }
            str4 = "-byte body)";
            size = meuVar.size();
            while (i < size) {
            }
            if (z) {
            }
            str = "";
            this.a.a("--> END " + d5j0Var.b);
        } else {
            z = z4;
            z2 = z3;
            str = "";
            str2 = " ";
        }
        long nanoTime = System.nanoTime();
        try {
            kvj0 b4 = zci0Var.b(d5j0Var);
            long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
            rvj0 rvj0Var = b4.z;
            long contentLength = rvj0Var.contentLength();
            String str5 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            String str6 = str;
            qvu qvuVar3 = this.a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- " + b4.w);
            if (b4.c.length() > 0) {
                str3 = str2;
                sb4.append(str3 + b4.c);
            } else {
                str3 = str2;
            }
            StringBuilder sb5 = new StringBuilder(str3);
            kwu kwuVar2 = b4.a.a;
            this.c.getClass();
            ly3.y(nanoTime2, kwuVar2.i, Extension.O_BRAKE_SPACE, sb5);
            sb5.append("ms");
            sb4.append(sb5.toString());
            if (!z2) {
                sb4.append(Extension.FIX_SPACE + str5 + " body");
            }
            sb4.append(Extension.C_BRAKE);
            qvuVar3.a(sb4.toString());
            if (z2) {
                meu meuVar2 = b4.y;
                int size2 = meuVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    a(i2, meuVar2);
                }
                if (z && lvu.a(b4)) {
                    String a2 = b4.y.a("Content-Encoding");
                    if (a2 != null && !a2.equalsIgnoreCase(ClidProvider.IDENTITY) && !a2.equalsIgnoreCase(Request.PARAM_GZIP)) {
                        this.a.a("<-- END HTTP (encoded body omitted)");
                        return b4;
                    }
                    wg10 contentType = b4.z.contentType();
                    if (contentType != null && contentType.b.equals("text") && contentType.c.equals("event-stream")) {
                        this.a.a("<-- END HTTP (streaming)");
                        return b4;
                    }
                    qq6 source = rvj0Var.source();
                    source.S(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                    long nanoTime3 = (System.nanoTime() - nanoTime) / 1000000;
                    yp6 h = source.h();
                    if (Request.PARAM_GZIP.equalsIgnoreCase(meuVar2.a("Content-Encoding"))) {
                        l = Long.valueOf(h.b);
                        r4uVar = new r4u(h.c());
                        try {
                            h = new yp6();
                            h.N1(r4uVar);
                            r4uVar.close();
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        l = null;
                    }
                    wg10 contentType2 = rvj0Var.contentType();
                    if (contentType2 != null) {
                        Regex regex2 = wg10.e;
                        charset = contentType2.a(null);
                    }
                    charset = uza.a;
                    if (!v9b1.b(h)) {
                        this.a.a(str6);
                        qvu qvuVar4 = this.a;
                        StringBuilder w = unr0.w(nanoTime3, "<-- END HTTP (", "ms, binary ");
                        w.append(h.b);
                        w.append("-byte body omitted)");
                        qvuVar4.a(w.toString());
                        return b4;
                    }
                    if (contentLength != 0) {
                        this.a.a(str6);
                        qvu qvuVar5 = this.a;
                        yp6 c = h.c();
                        qvuVar5.a(c.T(c.b, charset));
                    }
                    qvu qvuVar6 = this.a;
                    StringBuilder sb6 = new StringBuilder();
                    StringBuilder w2 = unr0.w(nanoTime3, "<-- END HTTP (", "ms, ");
                    w2.append(h.b);
                    w2.append("-byte");
                    sb6.append(w2.toString());
                    if (l != null) {
                        sb6.append(Extension.FIX_SPACE + l.longValue() + "-gzipped-byte");
                    }
                    sb6.append(" body)");
                    qvuVar6.a(sb6.toString());
                    return b4;
                }
                this.a.a("<-- END HTTP");
            }
            return b4;
        } catch (Exception e2) {
            long nanoTime4 = (System.nanoTime() - nanoTime) / 1000000;
            StringBuilder sb7 = new StringBuilder(str2);
            kwu kwuVar3 = d5j0Var.a;
            this.c.getClass();
            ly3.y(nanoTime4, kwuVar3.i, Extension.O_BRAKE_SPACE, sb7);
            sb7.append("ms)");
            this.a.a(("<-- HTTP FAILED: " + e2 + '.').concat(sb7.toString()));
            throw e2;
        }
    }

    public HttpLoggingInterceptor() {
        this(0);
    }

    public /* synthetic */ HttpLoggingInterceptor(int i) {
        this(qvu.a);
    }
}
