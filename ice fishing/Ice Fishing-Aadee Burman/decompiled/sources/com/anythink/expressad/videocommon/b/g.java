package com.anythink.expressad.videocommon.b;

import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.videocommon.b.h;
import com.anythink.expressad.videocommon.b.i;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22285a = "<anythinkloadend></anythinkloadend>";

    /* renamed from: b, reason: collision with root package name */
    private static final String f22286b = "DownLoadUtils";

    /* renamed from: c, reason: collision with root package name */
    private static final int f22287c = 20000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f22288d = 30000;

    public static void a(final String str, final String str2, final i.c cVar) {
        try {
            if (!y.a(str) && URLUtil.isNetworkUrl(str)) {
                h.a.f22293a.a(new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.videocommon.b.g.1
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:24:0x0095, B:26:0x0099, B:29:0x00a3, B:31:0x00a7), top: B:23:0x0095 }] */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:24:0x0095, B:26:0x0099, B:29:0x00a3, B:31:0x00a7), top: B:23:0x0095 }] */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x008c A[Catch: all -> 0x0071, TRY_ENTER, TryCatch #1 {all -> 0x0071, blocks: (B:19:0x006d, B:21:0x0075, B:55:0x008c, B:57:0x0091), top: B:2:0x0002 }] */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #1 {all -> 0x0071, blocks: (B:19:0x006d, B:21:0x0075, B:55:0x008c, B:57:0x0091), top: B:2:0x0002 }] */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7 A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #4 {all -> 0x00d3, blocks: (B:71:0x00cf, B:64:0x00d7), top: B:70:0x00cf }] */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // com.anythink.expressad.foundation.g.h.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void a() {
                        InputStream inputStream;
                        FileOutputStream fileOutputStream;
                        String message;
                        Throwable th;
                        Exception e9;
                        boolean z3;
                        FileOutputStream fileOutputStream2 = null;
                        boolean z6 = false;
                        try {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setConnectTimeout(g.f22287c);
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode == 200) {
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        fileOutputStream = new FileOutputStream(str2);
                                        try {
                                            try {
                                                byte[] bArr = new byte[2048];
                                                while (true) {
                                                    int read = inputStream.read(bArr);
                                                    if (read == -1) {
                                                        break;
                                                    } else {
                                                        fileOutputStream.write(bArr, 0, read);
                                                    }
                                                }
                                                fileOutputStream.close();
                                                z3 = true;
                                                message = "";
                                                fileOutputStream2 = fileOutputStream;
                                            } catch (Exception e10) {
                                                e9 = e10;
                                                String message2 = e9.getMessage();
                                                e9.getLocalizedMessage();
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                message = message2;
                                                String str3 = str2;
                                                if (z6) {
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th3) {
                                                    th3.printStackTrace();
                                                    th3.getMessage();
                                                    throw th;
                                                }
                                            }
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        fileOutputStream = fileOutputStream2;
                                        e9 = e;
                                        String message22 = e9.getMessage();
                                        e9.getLocalizedMessage();
                                        if (fileOutputStream != null) {
                                        }
                                        if (inputStream != null) {
                                        }
                                        message = message22;
                                        String str32 = str2;
                                        if (z6) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileOutputStream = fileOutputStream2;
                                        th = th;
                                        if (fileOutputStream != null) {
                                        }
                                        if (inputStream != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    z3 = false;
                                    message = "responseCode is ".concat(String.valueOf(responseCode));
                                    inputStream = null;
                                }
                                httpURLConnection.disconnect();
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                z6 = z3;
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                                message = th5.getMessage();
                            }
                        } catch (Exception e12) {
                            e = e12;
                            inputStream = null;
                            fileOutputStream = null;
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream = null;
                            fileOutputStream = null;
                        }
                        try {
                            String str322 = str2;
                            if (z6) {
                                i.c.this.a(str322, str);
                                return;
                            }
                            i.c cVar2 = i.c.this;
                            if (cVar2 != null) {
                                cVar2.a("content write failed:".concat(String.valueOf(message)));
                            }
                        } catch (Throwable th7) {
                            if (com.anythink.expressad.a.f17618a) {
                                th7.printStackTrace();
                            }
                            i.c cVar3 = i.c.this;
                            if (cVar3 != null) {
                                try {
                                    cVar3.a(th7.getMessage());
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                }
                            }
                        }
                    }

                    @Override // com.anythink.expressad.foundation.g.h.a
                    public final void b() {
                    }

                    @Override // com.anythink.expressad.foundation.g.h.a
                    public final void c() {
                    }
                });
                return;
            }
            cVar.a("url is error");
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f17618a) {
                th.printStackTrace();
            }
        }
    }
}
