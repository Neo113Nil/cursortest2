package com.anythink.expressad.foundation.g.f.f;

import android.os.SystemClock;
import android.util.Log;
import com.anythink.expressad.foundation.g.f.h;
import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.m;
import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.SSLProtocolException;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes.dex */
public class a implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20099a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static final int f20100b = 3000;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.e.a f20101c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.c f20102d;

    public a(com.anythink.expressad.foundation.g.f.e.a aVar, com.anythink.expressad.foundation.g.f.c cVar) {
        this.f20101c = aVar;
        this.f20102d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    @Override // com.anythink.expressad.foundation.g.f.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c a(j<?> jVar) {
        String str;
        String str2;
        b bVar;
        byte[] bArr;
        int a9;
        long j6;
        b bVar2;
        byte[] bArr2;
        int a10;
        if (jVar == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m l9 = jVar.l();
        String str3 = "MalformedURLException ex= ";
        int i = 399;
        if ((l9 != null ? l9.a() : 0) > 0) {
            while (!jVar.f()) {
                try {
                    try {
                        try {
                            jVar.i();
                            try {
                                bVar = this.f20101c.a(jVar);
                                try {
                                    a9 = bVar.a();
                                    bArr = jVar.a(bVar, this.f20102d);
                                    try {
                                        str2 = str3;
                                    } catch (IOException e9) {
                                        e = e9;
                                        str2 = str3;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    str2 = str3;
                                    bArr = null;
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    a("IOException ex= " + e.getMessage(), elapsedRealtime2, jVar);
                                    if (bVar != null) {
                                        a(jVar, new com.anythink.expressad.foundation.g.f.a.a(14, null), elapsedRealtime2);
                                        str3 = str2;
                                    } else {
                                        int a11 = bVar.a();
                                        if (bArr != null) {
                                            c cVar = new c(a11, bArr, bVar.b());
                                            if (a11 >= 400 && a11 <= 499) {
                                                a(jVar, new com.anythink.expressad.foundation.g.f.a.a(6, null), elapsedRealtime2);
                                            } else {
                                                if (a11 >= 500 && a11 <= 599) {
                                                    throw new com.anythink.expressad.foundation.g.f.a.a(7, cVar);
                                                }
                                                a(jVar, new com.anythink.expressad.foundation.g.f.a.a(2, null), elapsedRealtime2);
                                            }
                                        } else {
                                            a(jVar, new com.anythink.expressad.foundation.g.f.a.a(15, null), elapsedRealtime2);
                                        }
                                        str3 = str2;
                                        i = 399;
                                    }
                                }
                            } catch (ConnectException e11) {
                                e = e11;
                                str2 = str3;
                            } catch (SocketTimeoutException e12) {
                                e = e12;
                                str2 = str3;
                            } catch (SSLProtocolException e13) {
                                e = e13;
                                str2 = str3;
                            } catch (ConnectTimeoutException e14) {
                                e = e14;
                                str2 = str3;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            str2 = str3;
                            bVar = null;
                        }
                    } catch (MalformedURLException e16) {
                        e = e16;
                        str2 = str3;
                    } catch (UnknownHostException e17) {
                        e = e17;
                        str2 = str3;
                    }
                } catch (ConnectException e18) {
                    e = e18;
                    str = str3;
                } catch (SocketTimeoutException e19) {
                    e = e19;
                    str = str3;
                } catch (SSLProtocolException e20) {
                    e = e20;
                    str = str3;
                } catch (ConnectTimeoutException e21) {
                    e = e21;
                    str = str3;
                }
                try {
                    a(SystemClock.elapsedRealtime() - elapsedRealtime, jVar, bArr, a9);
                    if (a9 < 200 || a9 > i) {
                        throw new IOException();
                    }
                    return new c(a9, bArr, bVar.b());
                } catch (ConnectException e22) {
                    e = e22;
                    str = str2;
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    a("ConnectException ex= " + e.getMessage(), elapsedRealtime3, jVar);
                    a(jVar, new com.anythink.expressad.foundation.g.f.a.a(12, null), elapsedRealtime3);
                    str3 = str;
                    i = 399;
                } catch (MalformedURLException e23) {
                    e = e23;
                    long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    str = str2;
                    a(str + e.getMessage(), elapsedRealtime4, jVar);
                    a(jVar, new com.anythink.expressad.foundation.g.f.a.a(4, null), elapsedRealtime4);
                    str3 = str;
                    i = 399;
                } catch (SocketTimeoutException e24) {
                    e = e24;
                    str = str2;
                    long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    a("SocketTimeoutException ex= " + e.getMessage(), elapsedRealtime5, jVar);
                    a(jVar, new com.anythink.expressad.foundation.g.f.a.a(10, null), elapsedRealtime5);
                    str3 = str;
                    i = 399;
                } catch (UnknownHostException e25) {
                    e = e25;
                    long elapsedRealtime6 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    a("UnknownHostException ex= " + e.getMessage(), elapsedRealtime6, jVar);
                    a(jVar, new com.anythink.expressad.foundation.g.f.a.a(9, null), elapsedRealtime6);
                    str3 = str2;
                    i = 399;
                } catch (SSLProtocolException e26) {
                    e = e26;
                    str = str2;
                    long elapsedRealtime7 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    a("SSLProtocolException ex= " + e.getMessage(), elapsedRealtime7, jVar);
                    a(jVar, new com.anythink.expressad.foundation.g.f.a.a(11, null), elapsedRealtime7);
                    str3 = str;
                    i = 399;
                } catch (ConnectTimeoutException e27) {
                    e = e27;
                    str = str2;
                    long elapsedRealtime8 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    a("ConnectTimeoutException ex= " + e.getMessage(), elapsedRealtime8, jVar);
                    a(jVar, new com.anythink.expressad.foundation.g.f.a.a(3, null), elapsedRealtime8);
                    str3 = str;
                    i = 399;
                } catch (IOException e28) {
                    e = e28;
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    a("IOException ex= " + e.getMessage(), elapsedRealtime22, jVar);
                    if (bVar != null) {
                    }
                }
            }
            jVar.c();
            this.f20102d.b(jVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(-2, null);
        }
        if (jVar.f()) {
            jVar.c();
            this.f20102d.b(jVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(-2, null);
        }
        try {
            try {
                jVar.i();
                bVar2 = this.f20101c.a(jVar);
                try {
                    a10 = bVar2.a();
                    bArr2 = jVar.a(bVar2, this.f20102d);
                    try {
                        j6 = elapsedRealtime;
                    } catch (IOException e29) {
                        e = e29;
                        j6 = elapsedRealtime;
                    }
                } catch (IOException e30) {
                    e = e30;
                    j6 = elapsedRealtime;
                    bArr2 = null;
                    a("IOException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - j6, jVar);
                    if (bVar2 != null) {
                        throw new com.anythink.expressad.foundation.g.f.a.a(14, null);
                    }
                    int a12 = bVar2.a();
                    if (bArr2 == null) {
                        throw new com.anythink.expressad.foundation.g.f.a.a(15, null);
                    }
                    c cVar2 = new c(a12, bArr2, bVar2.b());
                    if (a12 >= 400 && a12 <= 499) {
                        throw new com.anythink.expressad.foundation.g.f.a.a(6, cVar2);
                    }
                    if (a12 < 500 || a12 > 599) {
                        throw new com.anythink.expressad.foundation.g.f.a.a(2, cVar2);
                    }
                    throw new com.anythink.expressad.foundation.g.f.a.a(7, cVar2);
                }
            } catch (IOException e31) {
                e = e31;
                j6 = elapsedRealtime;
                bVar2 = null;
            }
        } catch (ConnectException e32) {
            e = e32;
            j6 = elapsedRealtime;
        } catch (MalformedURLException e33) {
            e = e33;
            j6 = elapsedRealtime;
        } catch (SocketTimeoutException e34) {
            e = e34;
            j6 = elapsedRealtime;
        } catch (UnknownHostException e35) {
            e = e35;
            j6 = elapsedRealtime;
        } catch (SSLProtocolException e36) {
            e = e36;
            j6 = elapsedRealtime;
        } catch (ConnectTimeoutException e37) {
            e = e37;
            j6 = elapsedRealtime;
        }
        try {
            a(SystemClock.elapsedRealtime() - j6, jVar, bArr2, a10);
            if (a10 < 200 || a10 > 399) {
                throw new IOException();
            }
            return new c(a10, bArr2, bVar2.b());
        } catch (ConnectException e38) {
            e = e38;
            a("ConnectException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - j6, jVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(12, null);
        } catch (MalformedURLException e39) {
            e = e39;
            a("MalformedURLException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - j6, jVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(4, null);
        } catch (SocketTimeoutException e40) {
            e = e40;
            a("SocketTimeoutException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - j6, jVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(10, null);
        } catch (UnknownHostException e41) {
            e = e41;
            a("UnknownHostException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - j6, jVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(9, null);
        } catch (SSLProtocolException e42) {
            e = e42;
            a("SSLProtocolException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - j6, jVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(11, null);
        } catch (ConnectTimeoutException e43) {
            e = e43;
            a("ConnectTimeoutException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - j6, jVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(3, null);
        } catch (IOException e44) {
            e = e44;
            a("IOException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - j6, jVar);
            if (bVar2 != null) {
            }
        }
    }

    private static void a(long j6, j<?> jVar, byte[] bArr, int i) {
        if (com.anythink.expressad.a.f18405a) {
            Object obj = "null";
            try {
                if (j6 > com.anythink.expressad.video.module.a.a.m.ai) {
                    String d9 = jVar.d();
                    Integer valueOf = Integer.valueOf(jVar.a());
                    Long valueOf2 = Long.valueOf(j6);
                    if (bArr != null) {
                        obj = Integer.valueOf(bArr.length);
                    }
                    String.format("Slow HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", d9, valueOf, valueOf2, obj, Integer.valueOf(i), Integer.valueOf(jVar.l().c()));
                    return;
                }
                String d10 = jVar.d();
                Integer valueOf3 = Integer.valueOf(jVar.a());
                Long valueOf4 = Long.valueOf(j6);
                if (bArr != null) {
                    obj = Integer.valueOf(bArr.length);
                }
                String.format("Normal HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", d10, valueOf3, valueOf4, obj, Integer.valueOf(i), Integer.valueOf(jVar.l().c()));
            } catch (Exception unused) {
            }
        }
    }

    private static void a(String str, long j6, j<?> jVar) {
        if (com.anythink.expressad.a.f18405a) {
            try {
                URL url = new URL(jVar.d());
                String str2 = f20099a;
                String str3 = url.getHost() + url.getPath();
                Long valueOf = Long.valueOf(j6);
                if (str == null) {
                    str = "null";
                }
                Log.i(str2, String.format("HTTP exception for request=<%s> [lifetime=%d], [exception=%s], [retryCount=%s-%s]", str3, valueOf, str, Integer.valueOf(jVar.l().c()), Integer.valueOf(jVar.l().a())));
            } catch (Exception unused) {
            }
        }
    }

    private void a(j<?> jVar, com.anythink.expressad.foundation.g.f.a.a aVar, long j6) {
        if (jVar != null) {
            try {
                m l9 = jVar.l();
                if (l9 != null) {
                    long h3 = l9.h();
                    if (!l9.d()) {
                        throw aVar;
                    }
                    if (j6 < h3) {
                        this.f20102d.e(jVar);
                        return;
                    }
                    throw aVar;
                }
                throw aVar;
            } catch (Exception unused) {
                throw aVar;
            }
        }
        throw new com.anythink.expressad.foundation.g.f.a.a(4, null);
    }
}
