package com.anythink.basead.l;

import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.x;
import com.anythink.core.common.m.q;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.p;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f9304b = "User-Agent";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f9305c = "Accept-Language";

    /* renamed from: d, reason: collision with root package name */
    protected static final String f9306d = "Accept";

    /* renamed from: e, reason: collision with root package name */
    protected static final String f9307e = "application/x-www-form-urlencoded,application/json,text/plain,text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";

    /* renamed from: f, reason: collision with root package name */
    protected static final String f9308f = "Content-Type";

    /* renamed from: g, reason: collision with root package name */
    protected static final String f9309g = "application/json";

    /* renamed from: h, reason: collision with root package name */
    public static final int f9310h = 5;
    protected boolean i;

    /* renamed from: j, reason: collision with root package name */
    protected String f9312j;

    /* renamed from: k, reason: collision with root package name */
    protected q f9313k;

    /* renamed from: m, reason: collision with root package name */
    private x f9315m;

    /* renamed from: a, reason: collision with root package name */
    final String f9311a = "a";

    /* renamed from: l, reason: collision with root package name */
    int f9314l = 0;

    public a(x xVar) {
        this.f9315m = xVar;
    }

    public final void a(final String str, q qVar) {
        this.f9313k = qVar;
        com.anythink.core.common.v.b.b.a().a(new com.anythink.core.common.v.b.d() { // from class: com.anythink.basead.l.a.1

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f9316a = 9999;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:101:0x031f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x02d0 A[Catch: all -> 0x01c9, TryCatch #31 {all -> 0x01c9, blocks: (B:59:0x0159, B:293:0x0256, B:295:0x0263, B:296:0x0267, B:136:0x028b, B:138:0x029b, B:139:0x029f, B:111:0x02c3, B:113:0x02d0, B:114:0x02d4, B:86:0x02f8, B:88:0x0305, B:89:0x0309, B:271:0x032d, B:205:0x0349, B:183:0x036f, B:249:0x0395, B:161:0x03bb, B:227:0x03e1), top: B:2:0x0003 }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x02f4  */
            /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:126:0x02ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x02e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:138:0x029b A[Catch: all -> 0x01c9, TryCatch #31 {all -> 0x01c9, blocks: (B:59:0x0159, B:293:0x0256, B:295:0x0263, B:296:0x0267, B:136:0x028b, B:138:0x029b, B:139:0x029f, B:111:0x02c3, B:113:0x02d0, B:114:0x02d4, B:86:0x02f8, B:88:0x0305, B:89:0x0309, B:271:0x032d, B:205:0x0349, B:183:0x036f, B:249:0x0395, B:161:0x03bb, B:227:0x03e1), top: B:2:0x0003 }] */
            /* JADX WARN: Removed duplicated region for block: B:144:0x02bf  */
            /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:147:0x02ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:151:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:155:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:166:0x03dd  */
            /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:169:0x03d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:173:0x03d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:177:0x03ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:188:0x0391  */
            /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:191:0x038c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:195:0x0387 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:199:0x0382 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:210:0x036b  */
            /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:213:0x0366 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:217:0x0361 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:221:0x035c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:232:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:235:0x03fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:239:0x03f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:243:0x03f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:254:0x03b7  */
            /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:257:0x03b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:261:0x03ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:265:0x03a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:276:0x0345  */
            /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:279:0x0340 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:283:0x033b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:287:0x0336 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:295:0x0263 A[Catch: all -> 0x01c9, TryCatch #31 {all -> 0x01c9, blocks: (B:59:0x0159, B:293:0x0256, B:295:0x0263, B:296:0x0267, B:136:0x028b, B:138:0x029b, B:139:0x029f, B:111:0x02c3, B:113:0x02d0, B:114:0x02d4, B:86:0x02f8, B:88:0x0305, B:89:0x0309, B:271:0x032d, B:205:0x0349, B:183:0x036f, B:249:0x0395, B:161:0x03bb, B:227:0x03e1), top: B:2:0x0003 }] */
            /* JADX WARN: Removed duplicated region for block: B:301:0x0287  */
            /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:304:0x0282 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:308:0x027d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:312:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:322:0x0418  */
            /* JADX WARN: Removed duplicated region for block: B:324:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:325:0x0413 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:329:0x040e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:333:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0305 A[Catch: all -> 0x01c9, TryCatch #31 {all -> 0x01c9, blocks: (B:59:0x0159, B:293:0x0256, B:295:0x0263, B:296:0x0267, B:136:0x028b, B:138:0x029b, B:139:0x029f, B:111:0x02c3, B:113:0x02d0, B:114:0x02d4, B:86:0x02f8, B:88:0x0305, B:89:0x0309, B:271:0x032d, B:205:0x0349, B:183:0x036f, B:249:0x0395, B:161:0x03bb, B:227:0x03e1), top: B:2:0x0003 }] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0329  */
            /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0324 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r11v1 */
            /* JADX WARN: Type inference failed for: r11v10 */
            /* JADX WARN: Type inference failed for: r11v11 */
            /* JADX WARN: Type inference failed for: r11v12 */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v14 */
            /* JADX WARN: Type inference failed for: r11v15 */
            /* JADX WARN: Type inference failed for: r11v16 */
            /* JADX WARN: Type inference failed for: r11v17 */
            /* JADX WARN: Type inference failed for: r11v18 */
            /* JADX WARN: Type inference failed for: r11v19 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v20 */
            /* JADX WARN: Type inference failed for: r11v21 */
            /* JADX WARN: Type inference failed for: r11v22 */
            /* JADX WARN: Type inference failed for: r11v23, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v24, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v25, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v26, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v27, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v28, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v29, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v3 */
            /* JADX WARN: Type inference failed for: r11v30, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v31, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v32, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v33, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r11v35, types: [java.net.HttpURLConnection, java.net.URLConnection] */
            /* JADX WARN: Type inference failed for: r11v36 */
            /* JADX WARN: Type inference failed for: r11v37 */
            /* JADX WARN: Type inference failed for: r11v38 */
            /* JADX WARN: Type inference failed for: r11v39 */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v40 */
            /* JADX WARN: Type inference failed for: r11v41 */
            /* JADX WARN: Type inference failed for: r11v42 */
            /* JADX WARN: Type inference failed for: r11v43 */
            /* JADX WARN: Type inference failed for: r11v44 */
            /* JADX WARN: Type inference failed for: r11v45 */
            /* JADX WARN: Type inference failed for: r11v46 */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r11v7 */
            /* JADX WARN: Type inference failed for: r11v8 */
            /* JADX WARN: Type inference failed for: r11v9 */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v12 */
            /* JADX WARN: Type inference failed for: r3v13 */
            /* JADX WARN: Type inference failed for: r3v14 */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r3v16 */
            /* JADX WARN: Type inference failed for: r3v17 */
            /* JADX WARN: Type inference failed for: r3v18 */
            /* JADX WARN: Type inference failed for: r3v19 */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v20, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v21, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v22, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v23, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v26, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v28, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.io.InputStreamReader] */
            /* JADX WARN: Type inference failed for: r3v31 */
            /* JADX WARN: Type inference failed for: r3v32 */
            /* JADX WARN: Type inference failed for: r3v33 */
            /* JADX WARN: Type inference failed for: r3v34 */
            /* JADX WARN: Type inference failed for: r3v35 */
            /* JADX WARN: Type inference failed for: r3v36 */
            /* JADX WARN: Type inference failed for: r3v37 */
            /* JADX WARN: Type inference failed for: r3v38 */
            /* JADX WARN: Type inference failed for: r3v39 */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v45 */
            /* JADX WARN: Type inference failed for: r3v47 */
            /* JADX WARN: Type inference failed for: r3v48 */
            /* JADX WARN: Type inference failed for: r3v5 */
            /* JADX WARN: Type inference failed for: r3v50 */
            /* JADX WARN: Type inference failed for: r3v52 */
            /* JADX WARN: Type inference failed for: r3v54 */
            /* JADX WARN: Type inference failed for: r3v56 */
            /* JADX WARN: Type inference failed for: r3v58 */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v60 */
            /* JADX WARN: Type inference failed for: r3v62 */
            /* JADX WARN: Type inference failed for: r3v64 */
            /* JADX WARN: Type inference failed for: r3v65, types: [java.io.InputStreamReader, java.io.Reader] */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v78 */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r3v9 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private void b(String str2) {
                InputStream inputStream;
                ?? r32;
                ?? r33;
                Exception e6;
                SSLException e9;
                UnknownHostException e10;
                SocketTimeoutException e11;
                SocketException e12;
                ConnectException e13;
                Error e14;
                StackOverflowError e15;
                OutOfMemoryError e16;
                BufferedReader bufferedReader;
                BufferedReader bufferedReader2 = null;
                try {
                    try {
                        a.this.f9312j = str2;
                        str2 = (HttpURLConnection) new URL(str2).openConnection();
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        str2.setInstanceFollowRedirects(false);
                        Map<String, String> a9 = a.a();
                        if (a9.size() > 0) {
                            for (String str3 : a9.keySet()) {
                                str2.addRequestProperty(str3, a9.get(str3));
                            }
                        }
                        a aVar = a.this;
                        if (aVar.i) {
                            aVar.a(this.f9316a);
                            str2.disconnect();
                            return;
                        }
                        if (t.b().c("ua")) {
                            str2.addRequestProperty(a.f9304b, p.a());
                        }
                        str2.setConnectTimeout(60000);
                        str2.setReadTimeout(60000);
                        str2.connect();
                        int responseCode = str2.getResponseCode();
                        if (responseCode != 200) {
                            if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                                a.this.a(this.f9316a, "Http respond status code is ".concat(String.valueOf(responseCode)), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(responseCode), str2.getResponseMessage()));
                                str2.disconnect();
                                return;
                            }
                            a aVar2 = a.this;
                            if (aVar2.i) {
                                aVar2.a(this.f9316a);
                            } else {
                                int i = aVar2.f9314l;
                                if (i >= 5) {
                                    aVar2.a(this.f9316a, "Http respond status code is ".concat(String.valueOf(responseCode)), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(responseCode), "over 5 MAX_REDIRECTS_COUNT," + str2.getResponseMessage()));
                                    str2.disconnect();
                                    return;
                                }
                                aVar2.f9314l = i + 1;
                                String headerField = str2.getHeaderField("Location");
                                if (headerField != null && headerField.toLowerCase().startsWith("http")) {
                                    b(headerField);
                                }
                            }
                            str2.disconnect();
                            return;
                        }
                        a aVar3 = a.this;
                        if (aVar3.i) {
                            aVar3.a(this.f9316a);
                            str2.disconnect();
                            return;
                        }
                        inputStream = a.a((HttpURLConnection) str2);
                        try {
                            r32 = new InputStreamReader(inputStream);
                            try {
                                bufferedReader = new BufferedReader(r32);
                            } catch (OutOfMemoryError e17) {
                                e16 = e17;
                            } catch (StackOverflowError e18) {
                                e15 = e18;
                            } catch (Error e19) {
                                e14 = e19;
                            } catch (ConnectException e20) {
                                e13 = e20;
                            } catch (SocketException e21) {
                                e12 = e21;
                            } catch (SocketTimeoutException e22) {
                                e11 = e22;
                            } catch (UnknownHostException e23) {
                                e10 = e23;
                            } catch (SSLException e24) {
                                e9 = e24;
                            } catch (ConnectTimeoutException e25) {
                                e = e25;
                            } catch (Exception e26) {
                                e6 = e26;
                            }
                        } catch (OutOfMemoryError e27) {
                            e16 = e27;
                            r32 = 0;
                        } catch (StackOverflowError e28) {
                            e15 = e28;
                            r32 = 0;
                        } catch (Error e29) {
                            e14 = e29;
                            r32 = 0;
                        } catch (ConnectException e30) {
                            e13 = e30;
                            r32 = 0;
                        } catch (SocketException e31) {
                            e12 = e31;
                            r32 = 0;
                        } catch (SocketTimeoutException e32) {
                            e11 = e32;
                            r32 = 0;
                        } catch (UnknownHostException e33) {
                            e10 = e33;
                            r32 = 0;
                        } catch (SSLException e34) {
                            e9 = e34;
                            r32 = 0;
                        } catch (ConnectTimeoutException e35) {
                            e = e35;
                            r32 = 0;
                        } catch (Exception e36) {
                            e6 = e36;
                            r32 = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            r33 = 0;
                        }
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    sb.append(readLine);
                                }
                            }
                            a.this.a(this.f9316a, sb.toString().trim());
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            try {
                                r32.close();
                            } catch (Throwable unused2) {
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            str2.disconnect();
                        } catch (OutOfMemoryError e37) {
                            e16 = e37;
                            bufferedReader2 = bufferedReader;
                            System.gc();
                            String message = e16.getMessage();
                            if (e16.getMessage() != null) {
                            }
                            a.this.a(this.f9316a, message, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e16.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (StackOverflowError e38) {
                            e15 = e38;
                            bufferedReader2 = bufferedReader;
                            System.gc();
                            String message2 = e15.getMessage();
                            if (e15.getMessage() != null) {
                            }
                            a.this.a(this.f9316a, message2, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e15.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (Error e39) {
                            e14 = e39;
                            bufferedReader2 = bufferedReader;
                            e14.getMessage();
                            System.gc();
                            String message3 = e14.getMessage();
                            if (e14.getMessage() != null) {
                            }
                            a.this.a(this.f9316a, message3, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e14.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (ConnectException e40) {
                            e13 = e40;
                            bufferedReader2 = bufferedReader;
                            a.this.a(this.f9316a, "Connect error.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e13.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (SocketException e41) {
                            e12 = e41;
                            bufferedReader2 = bufferedReader;
                            a.this.a(this.f9316a, "connect socket failed.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e12.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (SocketTimeoutException e42) {
                            e11 = e42;
                            bufferedReader2 = bufferedReader;
                            a.this.a(this.f9316a, "Connect timeout.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e11.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (UnknownHostException e43) {
                            e10 = e43;
                            bufferedReader2 = bufferedReader;
                            a.this.a(this.f9316a, "UnknownHostException", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e10.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (SSLException e44) {
                            e9 = e44;
                            bufferedReader2 = bufferedReader;
                            a.this.a(this.f9316a, "connect ssl failed.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e9.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (ConnectTimeoutException e45) {
                            e = e45;
                            bufferedReader2 = bufferedReader;
                            a.this.a(this.f9316a, e);
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (Exception e46) {
                            e6 = e46;
                            bufferedReader2 = bufferedReader;
                            e6.getMessage();
                            String message4 = e6.getMessage();
                            if (e6.getMessage() != null) {
                            }
                            a.this.a(this.f9316a, message4, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e6.getMessage()));
                            if (bufferedReader2 != null) {
                            }
                            if (r32 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 == 0) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader;
                            r33 = r32;
                            if (bufferedReader2 != null) {
                            }
                            if (r33 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            if (str2 != 0) {
                            }
                        }
                    } catch (OutOfMemoryError e47) {
                        e = e47;
                        r32 = 0;
                        str2 = str2;
                        e16 = e;
                        inputStream = r32;
                        System.gc();
                        String message5 = e16.getMessage();
                        if (e16.getMessage() != null) {
                            message5 = e16.getMessage();
                        }
                        a.this.a(this.f9316a, message5, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e16.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused4) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused5) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused6) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (StackOverflowError e48) {
                        e = e48;
                        r32 = 0;
                        str2 = str2;
                        e15 = e;
                        inputStream = r32;
                        System.gc();
                        String message22 = e15.getMessage();
                        if (e15.getMessage() != null) {
                            message22 = e15.getMessage();
                        }
                        a.this.a(this.f9316a, message22, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e15.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused7) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused8) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused9) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (Error e49) {
                        e = e49;
                        r32 = 0;
                        str2 = str2;
                        e14 = e;
                        inputStream = r32;
                        e14.getMessage();
                        System.gc();
                        String message32 = e14.getMessage();
                        if (e14.getMessage() != null) {
                            message32 = e14.getMessage();
                        }
                        a.this.a(this.f9316a, message32, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e14.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused10) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused11) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused12) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (ConnectException e50) {
                        e = e50;
                        r32 = 0;
                        str2 = str2;
                        e13 = e;
                        inputStream = r32;
                        a.this.a(this.f9316a, "Connect error.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e13.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused13) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused14) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused15) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (SocketException e51) {
                        e = e51;
                        r32 = 0;
                        str2 = str2;
                        e12 = e;
                        inputStream = r32;
                        a.this.a(this.f9316a, "connect socket failed.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e12.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused16) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused17) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused18) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (SocketTimeoutException e52) {
                        e = e52;
                        r32 = 0;
                        str2 = str2;
                        e11 = e;
                        inputStream = r32;
                        a.this.a(this.f9316a, "Connect timeout.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e11.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused19) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused20) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused21) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (UnknownHostException e53) {
                        e = e53;
                        r32 = 0;
                        str2 = str2;
                        e10 = e;
                        inputStream = r32;
                        a.this.a(this.f9316a, "UnknownHostException", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e10.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused22) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused23) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused24) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (SSLException e54) {
                        e = e54;
                        r32 = 0;
                        str2 = str2;
                        e9 = e;
                        inputStream = r32;
                        a.this.a(this.f9316a, "connect ssl failed.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e9.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused25) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused26) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused27) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (ConnectTimeoutException e55) {
                        e = e55;
                        inputStream = null;
                        str2 = str2;
                        r32 = inputStream;
                        a.this.a(this.f9316a, e);
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused28) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused29) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused30) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (Exception e56) {
                        e = e56;
                        r32 = 0;
                        str2 = str2;
                        e6 = e;
                        inputStream = r32;
                        e6.getMessage();
                        String message42 = e6.getMessage();
                        if (e6.getMessage() != null) {
                            message42 = e6.getMessage();
                        }
                        a.this.a(this.f9316a, message42, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e6.getMessage()));
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused31) {
                            }
                        }
                        if (r32 != 0) {
                            try {
                                r32.close();
                            } catch (Throwable unused32) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused33) {
                            }
                        }
                        if (str2 == 0) {
                            str2.disconnect();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        str2 = str2;
                        r33 = inputStream;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable unused34) {
                            }
                        }
                        if (r33 != 0) {
                            try {
                                r33.close();
                            } catch (Throwable unused35) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused36) {
                            }
                        }
                        if (str2 != 0) {
                            throw th;
                        }
                        str2.disconnect();
                        throw th;
                    }
                } catch (OutOfMemoryError e57) {
                    e = e57;
                    str2 = 0;
                    r32 = 0;
                } catch (StackOverflowError e58) {
                    e = e58;
                    str2 = 0;
                    r32 = 0;
                } catch (Error e59) {
                    e = e59;
                    str2 = 0;
                    r32 = 0;
                } catch (ConnectException e60) {
                    e = e60;
                    str2 = 0;
                    r32 = 0;
                } catch (SocketException e61) {
                    e = e61;
                    str2 = 0;
                    r32 = 0;
                } catch (SocketTimeoutException e62) {
                    e = e62;
                    str2 = 0;
                    r32 = 0;
                } catch (UnknownHostException e63) {
                    e = e63;
                    str2 = 0;
                    r32 = 0;
                } catch (SSLException e64) {
                    e = e64;
                    str2 = 0;
                    r32 = 0;
                } catch (ConnectTimeoutException e65) {
                    e = e65;
                    str2 = 0;
                    inputStream = null;
                } catch (Exception e66) {
                    e = e66;
                    str2 = 0;
                    r32 = 0;
                } catch (Throwable th5) {
                    th = th5;
                    str2 = 0;
                    inputStream = null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
            @Override // com.anythink.core.common.v.b.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a() {
                q qVar2;
                try {
                    q qVar3 = a.this.f9313k;
                    if (qVar3 != null) {
                        qVar3.onLoadStart(this.f9316a);
                    }
                    b(str);
                } catch (Exception e6) {
                    String message = e6.getMessage();
                    if (e6.getMessage() != null) {
                        message = e6.getMessage();
                    }
                    q qVar4 = a.this.f9313k;
                    if (qVar4 != null) {
                        qVar4.onLoadError(this.f9316a, message, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e6.getMessage()));
                    }
                } catch (OutOfMemoryError e9) {
                    e = e9;
                    System.gc();
                    String message2 = e.getMessage();
                    if (e.getMessage() != null) {
                        message2 = e.getMessage();
                    }
                    qVar2 = a.this.f9313k;
                    if (qVar2 == null) {
                        qVar2.onLoadError(this.f9316a, message2, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    }
                } catch (StackOverflowError e10) {
                    e = e10;
                    System.gc();
                    String message22 = e.getMessage();
                    if (e.getMessage() != null) {
                    }
                    qVar2 = a.this.f9313k;
                    if (qVar2 == null) {
                    }
                }
            }
        }, 10);
    }

    public final void b() {
        this.i = true;
    }

    public static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
        hashMap.put(f9304b, m.h());
        hashMap.put(f9305c, Locale.getDefault().toString());
        hashMap.put(f9306d, f9307e);
        hashMap.put("Content-Type", "application/json");
        return hashMap;
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!com.anythink.expressad.foundation.g.f.g.b.f19499d.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int read = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (read == -1 || (((bArr[1] & 255) << 8) | (bArr[0] & 255)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }

    public final void a(int i, Object obj) {
        q qVar = this.f9313k;
        if (qVar != null) {
            qVar.onLoadFinish(i, obj);
        }
    }

    public final void a(int i) {
        q qVar = this.f9313k;
        if (qVar != null) {
            qVar.onLoadCanceled(i);
        }
    }

    public final void a(int i, String str, AdError adError) {
        q qVar = this.f9313k;
        if (qVar != null) {
            qVar.onLoadError(i, str, adError);
        }
    }

    public final void a(int i, ConnectTimeoutException connectTimeoutException) {
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, connectTimeoutException.getMessage());
        q qVar = this.f9313k;
        if (qVar != null) {
            qVar.onLoadError(i, "Connect timeout.", errorCode);
        }
    }
}
