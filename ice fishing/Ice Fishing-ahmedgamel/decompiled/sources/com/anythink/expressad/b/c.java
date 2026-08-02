package com.anythink.expressad.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.expressad.foundation.g.h.a;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class c extends d {
    private static final boolean i = true;

    /* renamed from: a, reason: collision with root package name */
    com.anythink.expressad.b.a.b f18971a;

    /* renamed from: j, reason: collision with root package name */
    private int f18972j;

    /* renamed from: k, reason: collision with root package name */
    private String f18973k;

    /* renamed from: l, reason: collision with root package name */
    private int f18974l;

    /* renamed from: m, reason: collision with root package name */
    private e f18975m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18976n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.h.c f18977o;

    /* renamed from: p, reason: collision with root package name */
    private m f18978p;

    /* renamed from: q, reason: collision with root package name */
    private Handler f18979q;

    /* renamed from: com.anythink.expressad.b.c$1, reason: invalid class name */
    public class AnonymousClass1 implements a.InterfaceC0124a {
        private AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.h.a.InterfaceC0124a
        public final void a(a.b bVar) {
            if (bVar == a.b.FINISH && c.this.f18976n) {
                c.this.f18979q.post(new Runnable() { // from class: com.anythink.expressad.b.c.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (c.this.f18975m != null) {
                            if (c.this.f18971a.g()) {
                                e unused = c.this.f18975m;
                            } else {
                                e unused2 = c.this.f18975m;
                                c.this.f18971a.h();
                            }
                        }
                    }
                });
            }
        }
    }

    public class a extends com.anythink.expressad.foundation.g.h.a {
        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:9:0x001f, B:21:0x0079, B:31:0x00c7, B:33:0x00cd, B:35:0x00d5, B:38:0x00de, B:39:0x00ed, B:58:0x00e6, B:59:0x00f5, B:60:0x00fd, B:76:0x0103, B:62:0x010b, B:74:0x0117, B:64:0x0124, B:66:0x0135, B:71:0x0146, B:87:0x00ad, B:82:0x00b4, B:96:0x014c, B:97:0x014f, B:40:0x0150, B:42:0x0162, B:45:0x0175, B:47:0x0185, B:48:0x01dd, B:51:0x019f, B:53:0x01a7, B:55:0x01b8, B:56:0x01b1, B:57:0x01c4), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0162 A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:9:0x001f, B:21:0x0079, B:31:0x00c7, B:33:0x00cd, B:35:0x00d5, B:38:0x00de, B:39:0x00ed, B:58:0x00e6, B:59:0x00f5, B:60:0x00fd, B:76:0x0103, B:62:0x010b, B:74:0x0117, B:64:0x0124, B:66:0x0135, B:71:0x0146, B:87:0x00ad, B:82:0x00b4, B:96:0x014c, B:97:0x014f, B:40:0x0150, B:42:0x0162, B:45:0x0175, B:47:0x0185, B:48:0x01dd, B:51:0x019f, B:53:0x01a7, B:55:0x01b8, B:56:0x01b1, B:57:0x01c4), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0185 A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:9:0x001f, B:21:0x0079, B:31:0x00c7, B:33:0x00cd, B:35:0x00d5, B:38:0x00de, B:39:0x00ed, B:58:0x00e6, B:59:0x00f5, B:60:0x00fd, B:76:0x0103, B:62:0x010b, B:74:0x0117, B:64:0x0124, B:66:0x0135, B:71:0x0146, B:87:0x00ad, B:82:0x00b4, B:96:0x014c, B:97:0x014f, B:40:0x0150, B:42:0x0162, B:45:0x0175, B:47:0x0185, B:48:0x01dd, B:51:0x019f, B:53:0x01a7, B:55:0x01b8, B:56:0x01b1, B:57:0x01c4), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x019f A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:9:0x001f, B:21:0x0079, B:31:0x00c7, B:33:0x00cd, B:35:0x00d5, B:38:0x00de, B:39:0x00ed, B:58:0x00e6, B:59:0x00f5, B:60:0x00fd, B:76:0x0103, B:62:0x010b, B:74:0x0117, B:64:0x0124, B:66:0x0135, B:71:0x0146, B:87:0x00ad, B:82:0x00b4, B:96:0x014c, B:97:0x014f, B:40:0x0150, B:42:0x0162, B:45:0x0175, B:47:0x0185, B:48:0x01dd, B:51:0x019f, B:53:0x01a7, B:55:0x01b8, B:56:0x01b1, B:57:0x01c4), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00f5 A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:9:0x001f, B:21:0x0079, B:31:0x00c7, B:33:0x00cd, B:35:0x00d5, B:38:0x00de, B:39:0x00ed, B:58:0x00e6, B:59:0x00f5, B:60:0x00fd, B:76:0x0103, B:62:0x010b, B:74:0x0117, B:64:0x0124, B:66:0x0135, B:71:0x0146, B:87:0x00ad, B:82:0x00b4, B:96:0x014c, B:97:0x014f, B:40:0x0150, B:42:0x0162, B:45:0x0175, B:47:0x0185, B:48:0x01dd, B:51:0x019f, B:53:0x01a7, B:55:0x01b8, B:56:0x01b1, B:57:0x01c4), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x010b A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:9:0x001f, B:21:0x0079, B:31:0x00c7, B:33:0x00cd, B:35:0x00d5, B:38:0x00de, B:39:0x00ed, B:58:0x00e6, B:59:0x00f5, B:60:0x00fd, B:76:0x0103, B:62:0x010b, B:74:0x0117, B:64:0x0124, B:66:0x0135, B:71:0x0146, B:87:0x00ad, B:82:0x00b4, B:96:0x014c, B:97:0x014f, B:40:0x0150, B:42:0x0162, B:45:0x0175, B:47:0x0185, B:48:0x01dd, B:51:0x019f, B:53:0x01a7, B:55:0x01b8, B:56:0x01b1, B:57:0x01c4), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0103 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0099 A[EDGE_INSN: B:84:0x0099->B:85:0x0099 BREAK  A[LOOP:0: B:5:0x000b->B:71:0x0146], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x014c A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:9:0x001f, B:21:0x0079, B:31:0x00c7, B:33:0x00cd, B:35:0x00d5, B:38:0x00de, B:39:0x00ed, B:58:0x00e6, B:59:0x00f5, B:60:0x00fd, B:76:0x0103, B:62:0x010b, B:74:0x0117, B:64:0x0124, B:66:0x0135, B:71:0x0146, B:87:0x00ad, B:82:0x00b4, B:96:0x014c, B:97:0x014f, B:40:0x0150, B:42:0x0162, B:45:0x0175, B:47:0x0185, B:48:0x01dd, B:51:0x019f, B:53:0x01a7, B:55:0x01b8, B:56:0x01b1, B:57:0x01c4), top: B:2:0x0001 }] */
        @Override // com.anythink.expressad.foundation.g.h.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            HttpURLConnection httpURLConnection;
            String str;
            int i;
            String str2;
            try {
                c.this.f18971a = new com.anythink.expressad.b.a.b();
                int i4 = 0;
                while (true) {
                    HttpURLConnection httpURLConnection2 = null;
                    if (i4 < 10) {
                        if (!c.this.f18976n) {
                            return;
                        }
                        c.d(c.this);
                        try {
                            c cVar = c.this;
                            cVar.f18973k = cVar.f18973k.replace(" ", "%20");
                            String unused = c.this.f18973k;
                            httpURLConnection = (HttpURLConnection) new URL(c.this.f18973k).openConnection();
                            try {
                                try {
                                    httpURLConnection.setRequestMethod("GET");
                                    httpURLConnection.setRequestProperty("User-Agent", com.anythink.core.common.v.m.h());
                                    httpURLConnection.setConnectTimeout(com.anythink.basead.exoplayer.d.f7548a);
                                    httpURLConnection.setReadTimeout(com.anythink.basead.exoplayer.d.f7548a);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    httpURLConnection.connect();
                                    i = httpURLConnection.getResponseCode();
                                    try {
                                        str = httpURLConnection.getHeaderField("Location");
                                    } catch (Exception e9) {
                                        e = e9;
                                        str = null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    httpURLConnection2 = httpURLConnection;
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                str = null;
                                i = 200;
                                e.printStackTrace();
                                if (i4 != 0) {
                                    c.this.f18971a.a(false);
                                    c.this.f18971a.d(e.getLocalizedMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                        return;
                                    }
                                    return;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                str2 = null;
                                if (i != 301) {
                                    if (i != 200) {
                                    }
                                    if (!c.this.f18973k.toLowerCase().startsWith("market:/")) {
                                        if (c.this.f18973k.toLowerCase().endsWith(".apk")) {
                                        }
                                        c.this.f18971a.d(null);
                                        c.this.f18971a.a(true);
                                    }
                                    c.this.f18971a.c(1);
                                    c cVar2 = c.this;
                                    cVar2.f18971a.e(cVar2.f18973k);
                                    c.this.f18971a.b(true);
                                    c.this.f18971a.d(null);
                                    c.this.f18971a.a(true);
                                }
                                if (!TextUtils.isEmpty(str)) {
                                }
                                if (!c.this.f18973k.toLowerCase().startsWith("market:/")) {
                                }
                                c.this.f18971a.c(1);
                                c cVar22 = c.this;
                                cVar22.f18971a.e(cVar22.f18973k);
                                c.this.f18971a.b(true);
                                c.this.f18971a.d(null);
                                c.this.f18971a.a(true);
                            }
                            try {
                                str2 = httpURLConnection.getHeaderField("Content-type");
                                httpURLConnection.disconnect();
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                                if (i4 != 0) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            httpURLConnection = null;
                            str = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (httpURLConnection2 != null) {
                            }
                            throw th;
                        }
                        if (i != 301 && i != 302 && i != 307) {
                            if (i != 200) {
                                if (!TextUtils.isEmpty(str2) && str2.indexOf(com.onesignal.inAppMessages.internal.d.HTML) < 0 && str2.indexOf(o.f9232c) < 0) {
                                    c.this.f18971a.c(3);
                                    c.this.f18971a.b(true);
                                }
                                c.this.f18971a.c(2);
                                c.this.f18971a.b(true);
                            } else {
                                c.this.f18971a.b(false);
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            c.this.f18971a.b(true);
                            break;
                        }
                        if (!str.toLowerCase().startsWith("http")) {
                            c.this.f18973k = str;
                            c.this.f18971a.b(true);
                            break;
                        } else {
                            c.this.f18973k = str;
                            if (!TextUtils.isEmpty(c.this.f18973k) && c.this.f18973k.toLowerCase().endsWith(".apk")) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    } else {
                        break;
                    }
                }
                if (!c.this.f18973k.toLowerCase().startsWith("market:/") && c.this.f18973k.toLowerCase().indexOf("play.google.com") <= 0) {
                    if (c.this.f18973k.toLowerCase().endsWith(".apk")) {
                        if (c.this.f18972j >= 10 || !c.this.f18971a.j()) {
                            c.this.f18971a.c(2);
                        }
                        c cVar3 = c.this;
                        cVar3.f18971a.e(cVar3.f18973k);
                    } else {
                        c.this.f18971a.c(3);
                        c cVar4 = c.this;
                        cVar4.f18971a.e(cVar4.f18973k);
                        c.this.f18971a.b(true);
                    }
                    c.this.f18971a.d(null);
                    c.this.f18971a.a(true);
                }
                c.this.f18971a.c(1);
                c cVar222 = c.this;
                cVar222.f18971a.e(cVar222.f18973k);
                c.this.f18971a.b(true);
                c.this.f18971a.d(null);
                c.this.f18971a.a(true);
            } catch (Exception e13) {
                c cVar5 = c.this;
                cVar5.f18971a.e(cVar5.f18973k);
                c.this.f18971a.a(false);
                c.this.f18971a.d(e13.getLocalizedMessage());
                e13.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void c() {
        }

        private /* synthetic */ a(c cVar, byte b9) {
            this();
        }
    }

    public c(Context context) {
        this(context, (byte) 0);
    }

    public static /* synthetic */ int d(c cVar) {
        int i4 = cVar.f18972j;
        cVar.f18972j = i4 + 1;
        return i4;
    }

    private c(Context context, byte b9) {
        this.f18972j = 0;
        this.f18973k = null;
        this.f18971a = null;
        this.f18975m = null;
        this.f18976n = true;
        this.f18979q = new Handler(Looper.getMainLooper());
        this.f18977o = new com.anythink.expressad.foundation.g.h.c(context);
        this.f18978p = new m(context);
    }

    @Override // com.anythink.expressad.b.d
    public final void b() {
        this.f18976n = false;
    }

    public final boolean a() {
        return this.f18976n;
    }

    public final void a(String str, com.anythink.expressad.foundation.d.d dVar, e eVar, String str2, boolean z6, boolean z9, int i4) {
        String str3;
        this.f18973k = str2;
        this.f18975m = eVar;
        this.f18971a = null;
        this.f18974l = i4;
        if (dVar != null) {
            r0 = "5".equals(dVar.ad()) || "6".equals(dVar.ad());
            str3 = dVar.bh();
        } else {
            str3 = "";
        }
        this.f18978p.a(str2, eVar, r0, str3, str, dVar, z6, z9, i4);
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar, e eVar) {
        this.f18973k = new String(dVar.af());
        this.f18975m = eVar;
        this.f18971a = null;
        this.f18978p.a(dVar.af(), eVar, "5".equals(dVar.ad()) || "6".equals(dVar.ad()), dVar.bh(), str, dVar, true, false, com.anythink.expressad.b.b.a.f18946l);
    }
}
