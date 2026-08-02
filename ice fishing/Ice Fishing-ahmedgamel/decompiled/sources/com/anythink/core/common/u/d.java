package com.anythink.core.common.u;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.m.d.d;
import com.anythink.core.common.m.q;
import com.anythink.core.common.v.af;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f17248b;

    /* renamed from: h, reason: collision with root package name */
    private Context f17255h;
    private File i;

    /* renamed from: j, reason: collision with root package name */
    private AtomicInteger f17256j;

    /* renamed from: a, reason: collision with root package name */
    private final String f17249a = "Agent";

    /* renamed from: c, reason: collision with root package name */
    private int f17250c = 5;

    /* renamed from: d, reason: collision with root package name */
    private int f17251d = 10;

    /* renamed from: e, reason: collision with root package name */
    private long f17252e = 1800000;

    /* renamed from: f, reason: collision with root package name */
    private String f17253f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f17254g = "";

    /* renamed from: k, reason: collision with root package name */
    private boolean f17257k = false;

    /* renamed from: l, reason: collision with root package name */
    private String f17258l = "";

    /* renamed from: m, reason: collision with root package name */
    private q f17259m = new q() { // from class: com.anythink.core.common.u.d.1
        @Override // com.anythink.core.common.m.q
        public final void onLoadCanceled(int i) {
            d.a(d.this);
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadError(int i, String str, AdError adError) {
            d.a(d.this);
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadFinish(int i, Object obj) {
            try {
                d.this.a(((Integer) obj).intValue());
                d.a(d.this);
                af.a(d.this.f17255h, u.b.f13633a, "LOG_SEND_TIME", System.currentTimeMillis());
            } catch (Throwable unused) {
                d.a(d.this);
            }
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadStart(int i) {
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private d.a f17260n = new d.a() { // from class: com.anythink.core.common.u.d.2
        @Override // com.anythink.core.common.m.d.d.a
        public final void a(Object obj) {
            if (obj instanceof com.anythink.core.common.m.d.a) {
                d.this.a(((com.anythink.core.common.m.d.a) obj).b());
                d.a(d.this);
                af.a(d.this.f17255h, u.b.f13633a, "LOG_SEND_TIME", System.currentTimeMillis());
            }
        }

        @Override // com.anythink.core.common.m.d.d.a
        public final void a(Throwable th) {
            d.a(d.this);
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private Object f17261o = new Object();

    private d() {
    }

    public static /* synthetic */ boolean a(d dVar) {
        dVar.f17257k = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        BufferedReader bufferedReader;
        String readLine;
        JSONObject jSONObject;
        int i;
        boolean z6;
        long parseLong;
        this.f17257k = true;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(this.i));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Error unused) {
        } catch (Exception unused2) {
        } catch (OutOfMemoryError | StackOverflowError unused3) {
        }
        try {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = 0;
                while (i4 < this.f17251d && (readLine = bufferedReader.readLine()) != null) {
                    try {
                        jSONObject = new JSONObject(readLine);
                        try {
                            i = jSONObject.optInt(com.anythink.core.common.h.u.f14835a, 0);
                            try {
                                parseLong = Long.parseLong(jSONObject.optString(com.anythink.expressad.foundation.d.d.f19383u));
                            } catch (Throwable unused4) {
                            }
                        } catch (Throwable unused5) {
                            i = 0;
                        }
                    } catch (Throwable unused6) {
                    }
                    if (parseLong > 0 && System.currentTimeMillis() - parseLong > com.anythink.core.d.h.f18077f) {
                        z6 = true;
                        if (i <= 5 || z6) {
                            arrayList2.add(jSONObject.toString());
                        } else {
                            jSONObject.put(com.anythink.core.common.h.u.f14835a, i + 1);
                            arrayList.add(jSONObject.toString());
                        }
                        i4++;
                    }
                    z6 = false;
                    if (i <= 5) {
                    }
                    arrayList2.add(jSONObject.toString());
                    i4++;
                }
                bufferedReader.close();
                if (i4 == 0) {
                    this.f17257k = false;
                    try {
                        bufferedReader.close();
                        return;
                    } catch (Exception unused7) {
                        return;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    a(arrayList2.size());
                    c();
                    try {
                        bufferedReader.close();
                        return;
                    } catch (Exception unused8) {
                        return;
                    }
                }
                a(arrayList);
                com.anythink.core.d.b b9 = com.anythink.core.d.d.a(t.b().g()).b(t.b().p());
                if (b9 == null) {
                    new com.anythink.core.common.m.d(this.f17255h, 0, arrayList).a(0, this.f17259m);
                } else if (b9.G() != 1) {
                    new com.anythink.core.common.m.d(this.f17255h, b9.G(), arrayList).a(0, this.f17259m);
                } else {
                    com.anythink.core.common.m.d.a aVar = new com.anythink.core.common.m.d.a(arrayList);
                    aVar.a(1, b9.F());
                    aVar.a(this.f17260n);
                }
                try {
                    bufferedReader.close();
                } catch (Exception unused9) {
                }
            } catch (OutOfMemoryError | StackOverflowError unused10) {
                bufferedReader2 = bufferedReader;
                this.f17257k = false;
                System.gc();
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused11) {
                    }
                }
            }
        } catch (Error unused12) {
            bufferedReader2 = bufferedReader;
            this.f17257k = false;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (Exception unused13) {
                }
            }
        } catch (Exception unused14) {
            bufferedReader2 = bufferedReader;
            this.f17257k = false;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (Exception unused15) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (Exception unused16) {
                }
            }
            throw th;
        }
    }

    public final void b() {
        if (this.f17255h != null && t.b().a() && com.anythink.core.common.v.q.a(this.f17255h)) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.u.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (d.this.f17255h == null) {
                            return;
                        }
                        if ((System.currentTimeMillis() - af.b(d.this.f17255h, u.b.f13633a, "LOG_SEND_TIME", 0L) > d.this.f17252e || (d.this.f17256j != null && d.this.f17256j.get() >= d.this.f17250c)) && !d.this.f17257k && d.this.f17256j != null && d.this.f17256j.get() > 0) {
                            d.this.c();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }, 13);
        }
    }

    public static d a() {
        if (f17248b == null) {
            synchronized (d.class) {
                try {
                    if (f17248b == null) {
                        f17248b = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17248b;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:12:0x001c, B:14:0x007a, B:16:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:31:0x00eb, B:31:0x00eb, B:33:0x00ef, B:33:0x00ef, B:34:0x00f6, B:34:0x00f6, B:36:0x0108, B:36:0x0108, B:37:0x010f, B:37:0x010f, B:39:0x011f, B:39:0x011f, B:40:0x0126, B:40:0x0126, B:48:0x0124, B:48:0x0124, B:49:0x010d, B:49:0x010d, B:59:0x00e2, B:59:0x00e2, B:60:0x00e5, B:60:0x00e5, B:54:0x00e8, B:54:0x00e8), top: B:11:0x001c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108 A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:12:0x001c, B:14:0x007a, B:16:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:31:0x00eb, B:31:0x00eb, B:33:0x00ef, B:33:0x00ef, B:34:0x00f6, B:34:0x00f6, B:36:0x0108, B:36:0x0108, B:37:0x010f, B:37:0x010f, B:39:0x011f, B:39:0x011f, B:40:0x0126, B:40:0x0126, B:48:0x0124, B:48:0x0124, B:49:0x010d, B:49:0x010d, B:59:0x00e2, B:59:0x00e2, B:60:0x00e5, B:60:0x00e5, B:54:0x00e8, B:54:0x00e8), top: B:11:0x001c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:12:0x001c, B:14:0x007a, B:16:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:31:0x00eb, B:31:0x00eb, B:33:0x00ef, B:33:0x00ef, B:34:0x00f6, B:34:0x00f6, B:36:0x0108, B:36:0x0108, B:37:0x010f, B:37:0x010f, B:39:0x011f, B:39:0x011f, B:40:0x0126, B:40:0x0126, B:48:0x0124, B:48:0x0124, B:49:0x010d, B:49:0x010d, B:59:0x00e2, B:59:0x00e2, B:60:0x00e5, B:60:0x00e5, B:54:0x00e8, B:54:0x00e8), top: B:11:0x001c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f A[Catch: all -> 0x0137, TryCatch #5 {all -> 0x0137, blocks: (B:4:0x0003, B:8:0x000b, B:41:0x012b, B:43:0x012f, B:44:0x0134, B:45:0x0166, B:82:0x0150, B:84:0x0154, B:85:0x015b, B:74:0x0139, B:76:0x013d, B:71:0x0146, B:73:0x014a, B:77:0x015c, B:79:0x0160, B:86:0x0168, B:12:0x001c, B:14:0x007a, B:16:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:31:0x00eb, B:33:0x00ef, B:34:0x00f6, B:36:0x0108, B:37:0x010f, B:39:0x011f, B:40:0x0126, B:48:0x0124, B:49:0x010d, B:59:0x00e2, B:60:0x00e5, B:54:0x00e8, B:70:0x0143), top: B:3:0x0003, inners: #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124 A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:12:0x001c, B:14:0x007a, B:16:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:31:0x00eb, B:31:0x00eb, B:33:0x00ef, B:33:0x00ef, B:34:0x00f6, B:34:0x00f6, B:36:0x0108, B:36:0x0108, B:37:0x010f, B:37:0x010f, B:39:0x011f, B:39:0x011f, B:40:0x0126, B:40:0x0126, B:48:0x0124, B:48:0x0124, B:49:0x010d, B:49:0x010d, B:59:0x00e2, B:59:0x00e2, B:60:0x00e5, B:60:0x00e5, B:54:0x00e8, B:54:0x00e8), top: B:11:0x001c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:12:0x001c, B:14:0x007a, B:16:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:31:0x00eb, B:31:0x00eb, B:33:0x00ef, B:33:0x00ef, B:34:0x00f6, B:34:0x00f6, B:36:0x0108, B:36:0x0108, B:37:0x010f, B:37:0x010f, B:39:0x011f, B:39:0x011f, B:40:0x0126, B:40:0x0126, B:48:0x0124, B:48:0x0124, B:49:0x010d, B:49:0x010d, B:59:0x00e2, B:59:0x00e2, B:60:0x00e5, B:60:0x00e5, B:54:0x00e8, B:54:0x00e8), top: B:11:0x001c, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context) {
        AtomicInteger atomicInteger;
        LineNumberReader lineNumberReader;
        Throwable th;
        synchronized (this.f17261o) {
            try {
                if (this.f17255h == null && context != null) {
                    this.f17258l = t.b().p();
                    this.f17255h = context.getApplicationContext();
                    try {
                        try {
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.f17255h.getApplicationContext().getFilesDir().getAbsolutePath());
                                String str = File.separator;
                                sb.append(str);
                                sb.append("log");
                                sb.append(str);
                                sb.append("anythink_agent_log");
                                this.f17253f = sb.toString();
                                this.f17254g = this.f17255h.getApplicationContext().getFilesDir().getAbsolutePath() + str + "log" + str + "anythink_temp_log";
                                if (this.i == null) {
                                    File file = new File(this.f17253f);
                                    this.i = file;
                                    if (!file.getParentFile().exists()) {
                                        this.i.getParentFile().mkdirs();
                                    }
                                    if (!this.i.exists()) {
                                        this.i.createNewFile();
                                    }
                                }
                                LineNumberReader lineNumberReader2 = null;
                                try {
                                    try {
                                        lineNumberReader = new LineNumberReader(new FileReader(this.i));
                                    } catch (IOException unused) {
                                    }
                                    try {
                                        lineNumberReader.skip(Long.MAX_VALUE);
                                        int lineNumber = lineNumberReader.getLineNumber();
                                        if (this.f17256j == null) {
                                            this.f17256j = new AtomicInteger(lineNumber);
                                        }
                                        lineNumberReader.close();
                                        this.f17256j.get();
                                        lineNumberReader.close();
                                    } catch (Exception unused2) {
                                        lineNumberReader2 = lineNumberReader;
                                        if (lineNumberReader2 != null) {
                                            lineNumberReader2.close();
                                        }
                                        if (this.f17256j == null) {
                                        }
                                        com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f17255h).b(this.f17258l);
                                        if (b9.as() == 0) {
                                        }
                                        this.f17250c = r2;
                                        this.f17251d = r2 * 2;
                                        this.f17252e = b9.au() == 0 ? b9.au() : this.f17252e;
                                        b();
                                        if (this.f17256j == null) {
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (lineNumberReader != null) {
                                            try {
                                                lineNumberReader.close();
                                                throw th;
                                            } catch (IOException unused3) {
                                                throw th;
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused4) {
                                } catch (Throwable th3) {
                                    lineNumberReader = null;
                                    th = th3;
                                }
                                if (this.f17256j == null) {
                                    this.f17256j = new AtomicInteger(0);
                                }
                                com.anythink.core.d.b b92 = com.anythink.core.d.d.a(this.f17255h).b(this.f17258l);
                                int as = b92.as() == 0 ? b92.as() : this.f17250c;
                                this.f17250c = as;
                                this.f17251d = as * 2;
                                this.f17252e = b92.au() == 0 ? b92.au() : this.f17252e;
                                b();
                            } catch (OutOfMemoryError | StackOverflowError unused5) {
                                System.gc();
                                if (this.f17256j == null) {
                                    atomicInteger = new AtomicInteger(0);
                                }
                            }
                        } catch (Error unused6) {
                            if (this.f17256j == null) {
                                atomicInteger = new AtomicInteger(0);
                            }
                        } catch (Exception unused7) {
                            if (this.f17256j == null) {
                                atomicInteger = new AtomicInteger(0);
                            }
                        }
                        if (this.f17256j == null) {
                            atomicInteger = new AtomicInteger(0);
                            this.f17256j = atomicInteger;
                        }
                    } catch (Throwable th4) {
                        if (this.f17256j == null) {
                            this.f17256j = new AtomicInteger(0);
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x000a, TryCatch #7 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0018, B:10:0x001c, B:13:0x0022, B:15:0x0030, B:17:0x0036, B:18:0x003d, B:19:0x003b, B:27:0x006d, B:31:0x0091, B:51:0x008a, B:49:0x008d, B:40:0x007e, B:62:0x000d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(com.anythink.core.common.h.u uVar, boolean z6) {
        com.anythink.core.d.b b9;
        FileWriter fileWriter;
        try {
            if (this.i != null) {
                if (this.f17256j == null) {
                }
                if (this.i != null && this.f17256j != null) {
                    b9 = com.anythink.core.d.d.a(this.f17255h).b(this.f17258l);
                    if (b9 != null) {
                        int as = b9.as() != 0 ? b9.as() : this.f17250c;
                        this.f17250c = as;
                        this.f17251d = as * 2;
                        this.f17252e = b9.au();
                    }
                    FileWriter fileWriter2 = null;
                    try {
                        try {
                            try {
                                String jSONObject = uVar.a().toString();
                                fileWriter = new FileWriter(this.i, true);
                            } catch (IOException unused) {
                            }
                        } catch (Exception unused2) {
                        } catch (OutOfMemoryError | StackOverflowError unused3) {
                        } catch (Error unused4) {
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        fileWriter.append((CharSequence) jSONObject);
                        fileWriter.append((CharSequence) "\n");
                        fileWriter.flush();
                        fileWriter.close();
                        this.f17256j.incrementAndGet();
                        fileWriter.close();
                    } catch (OutOfMemoryError | StackOverflowError unused5) {
                        fileWriter2 = fileWriter;
                        System.gc();
                    } catch (Error unused6) {
                        fileWriter2 = fileWriter;
                    } catch (Exception unused7) {
                        fileWriter2 = fileWriter;
                        if (fileWriter2 != null) {
                            fileWriter2.close();
                        }
                        a(z6);
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter2 = fileWriter;
                        if (fileWriter2 != null) {
                            try {
                                fileWriter2.close();
                            } catch (IOException unused8) {
                            }
                        }
                        throw th;
                    }
                    a(z6);
                }
            }
            a(t.b().g());
            if (this.i != null) {
                b9 = com.anythink.core.d.d.a(this.f17255h).b(this.f17258l);
                if (b9 != null) {
                }
                FileWriter fileWriter22 = null;
                String jSONObject2 = uVar.a().toString();
                fileWriter = new FileWriter(this.i, true);
                fileWriter.append((CharSequence) jSONObject2);
                fileWriter.append((CharSequence) "\n");
                fileWriter.flush();
                fileWriter.close();
                this.f17256j.incrementAndGet();
                fileWriter.close();
                a(z6);
            }
        } finally {
        }
    }

    private synchronized void a(boolean z6) {
        String readLine;
        AtomicInteger atomicInteger;
        try {
            if (this.f17255h == null) {
                return;
            }
            if (!t.b().a()) {
                return;
            }
            if (this.f17257k || (!z6 && ((atomicInteger = this.f17256j) == null || atomicInteger.get() < this.f17250c))) {
                return;
            }
            this.f17257k = true;
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.i));
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < this.f17251d && (readLine = bufferedReader2.readLine()) != null; i++) {
                            arrayList.add(readLine);
                        }
                        com.anythink.core.d.b b9 = com.anythink.core.d.d.a(t.b().g()).b(t.b().p());
                        if (b9 != null) {
                            if (b9.G() != 1) {
                                new com.anythink.core.common.m.d(this.f17255h, b9.G(), arrayList).a(0, this.f17259m);
                            } else {
                                com.anythink.core.common.m.d.a aVar = new com.anythink.core.common.m.d.a(arrayList);
                                aVar.a(1, b9.F());
                                aVar.a(this.f17260n);
                            }
                        } else {
                            new com.anythink.core.common.m.d(this.f17255h, 0, arrayList).a(0, this.f17259m);
                        }
                        try {
                            bufferedReader2.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        bufferedReader = bufferedReader2;
                        this.f17257k = false;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (OutOfMemoryError | StackOverflowError unused4) {
                        bufferedReader = bufferedReader2;
                        this.f17257k = false;
                        System.gc();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused5) {
                            }
                        }
                    } catch (Throwable unused6) {
                        bufferedReader = bufferedReader2;
                        this.f17257k = false;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused7) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused8) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused9) {
            } catch (OutOfMemoryError | StackOverflowError unused10) {
            } catch (Throwable unused11) {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i) {
        BufferedReader bufferedReader = null;
        try {
            File file = new File(this.f17254g);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.i));
            try {
                FileWriter fileWriter = new FileWriter(file);
                int i4 = 0;
                int i6 = 0;
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    i6++;
                    if (i6 > i) {
                        fileWriter.append((CharSequence) readLine);
                        fileWriter.append((CharSequence) "\n");
                    }
                }
                fileWriter.flush();
                fileWriter.close();
                bufferedReader2.close();
                AtomicInteger atomicInteger = this.f17256j;
                if (atomicInteger.get() - i >= 0) {
                    i4 = this.f17256j.get() - i;
                }
                atomicInteger.set(i4);
                this.i.delete();
                file.renameTo(this.i);
                try {
                    bufferedReader2.close();
                } catch (IOException unused) {
                }
            } catch (Error unused2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Exception unused4) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused5) {
                    }
                }
            } catch (OutOfMemoryError | StackOverflowError unused6) {
                bufferedReader = bufferedReader2;
                try {
                    System.gc();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused7) {
                        }
                    }
                } catch (Throwable th) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused8) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable unused9) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused10) {
                    }
                }
            }
        } catch (Exception unused11) {
        } catch (OutOfMemoryError | StackOverflowError unused12) {
        } catch (Error unused13) {
        } catch (Throwable unused14) {
        }
    }

    private synchronized void a(List<String> list) {
        BufferedWriter bufferedWriter;
        if (this.i != null && !list.isEmpty()) {
            int size = list.size();
            list.size();
            BufferedReader bufferedReader = null;
            try {
                File file = new File(this.f17254g);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.i));
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                    for (int i = 0; i < size; i++) {
                        try {
                            if (bufferedReader2.readLine() == null) {
                                break;
                            }
                        } catch (Throwable unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                            return;
                        }
                    }
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        bufferedWriter.write(it.next());
                        bufferedWriter.newLine();
                    }
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            bufferedWriter.write(readLine);
                            bufferedWriter.newLine();
                        } else {
                            try {
                                break;
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                    bufferedReader2.close();
                    bufferedWriter.close();
                    this.i.delete();
                    file.renameTo(this.i);
                    try {
                        bufferedReader2.close();
                        bufferedWriter.close();
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    bufferedWriter = null;
                }
            } catch (Throwable unused6) {
                bufferedWriter = null;
            }
        }
    }
}
