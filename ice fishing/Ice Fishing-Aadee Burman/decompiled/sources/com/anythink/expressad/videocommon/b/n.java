package com.anythink.expressad.videocommon.b;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.videocommon.b.h;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22317a = "foldername";

    /* renamed from: b, reason: collision with root package name */
    public static final String f22318b = "md5filename";

    /* renamed from: c, reason: collision with root package name */
    public static final String f22319c = "nc";

    /* renamed from: d, reason: collision with root package name */
    public static final int f22320d = 259200000;

    /* renamed from: e, reason: collision with root package name */
    private static String f22321e = "ResourceManager";

    /* renamed from: f, reason: collision with root package name */
    private String f22322f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static n f22324a = new n(0);

        private a() {
        }
    }

    public /* synthetic */ n(byte b9) {
        this();
    }

    private void c() {
        this.f22322f = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_RES);
    }

    public final void b() {
        try {
            if (TextUtils.isEmpty(this.f22322f)) {
                return;
            }
            h.a.f22293a.a(new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.videocommon.b.n.1
                @Override // com.anythink.expressad.foundation.g.h.a
                public final void a() {
                    com.anythink.expressad.foundation.h.p.c(n.this.f22322f);
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void c() {
                }
            });
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    private n() {
        this.f22322f = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_RES);
    }

    public static n a() {
        return a.f22324a;
    }

    public final String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return this.f22322f + "/" + s.a(z.b(str)) + ".zip";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public final synchronized String a(String str, String str2) {
        String str3;
        str3 = "unknow exception ";
        try {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File file = new File(str2);
                    if (file.exists()) {
                        Uri parse = Uri.parse(str);
                        List<String> queryParameters = parse.getQueryParameters(f22319c);
                        if (queryParameters != null && queryParameters.size() != 0) {
                            str3 = a(str, str2, file);
                        }
                        List<String> queryParameters2 = parse.getQueryParameters(f22318b);
                        if (queryParameters2 != null && queryParameters2.size() > 0) {
                            String str4 = queryParameters2.get(0);
                            if (!TextUtils.isEmpty(str4) && str4.equals(com.anythink.expressad.foundation.h.o.a(file))) {
                                str3 = a(str, str2, file);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        com.anythink.expressad.foundation.h.p.b(file);
                    }
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17618a) {
                    e9.printStackTrace();
                }
                str3 = e9.getMessage();
            }
        } catch (Throwable th) {
            throw th;
        }
        return str3;
    }

    public final String b(String str) {
        String str2;
        try {
            String str3 = this.f22322f + "/" + s.a(z.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters("foldername");
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + "/" + str4 + "/" + str4 + ".html";
            if (!com.anythink.expressad.foundation.h.p.a(str5)) {
                return null;
            }
            try {
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = "";
            }
            return "file://" + str5 + (TextUtils.isEmpty(str2) ? "" : "?".concat(String.valueOf(str2)));
        } catch (Exception e9) {
            if (!com.anythink.expressad.a.f17618a) {
                return null;
            }
            e9.printStackTrace();
            return null;
        }
    }

    private String a(String str, String str2, File file) {
        String a9 = com.anythink.expressad.foundation.h.p.a(str2, this.f22322f + "/" + s.a(z.b(str)));
        return TextUtils.isEmpty(a9) ? com.anythink.expressad.foundation.h.p.b(file) : a9;
    }
}
