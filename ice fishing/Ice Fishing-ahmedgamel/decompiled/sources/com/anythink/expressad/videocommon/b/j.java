package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.videocommon.b.h;
import java.io.File;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22306a = 259200000;

    /* renamed from: b, reason: collision with root package name */
    private static final String f22307b = "HTMLResourceManager";

    /* renamed from: c, reason: collision with root package name */
    private String f22308c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static j f22310a = new j(0);

        private a() {
        }
    }

    public /* synthetic */ j(byte b9) {
        this();
    }

    private void c() {
        this.f22308c = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
    }

    public final void b() {
        try {
            if (TextUtils.isEmpty(this.f22308c)) {
                return;
            }
            h.a.f22293a.a(new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.videocommon.b.j.1
                @Override // com.anythink.expressad.foundation.g.h.a
                public final void a() {
                    com.anythink.expressad.foundation.h.p.c(j.this.f22308c);
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

    private j() {
        this.f22308c = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
    }

    public static j a() {
        return a.f22310a;
    }

    public final String c(String str) {
        try {
            File file = new File(this.f22308c + "/" + s.a(z.b(str)) + ".html");
            if (file.length() > 0) {
                return com.anythink.expressad.foundation.h.p.a(file);
            }
            return null;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f17618a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public final String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f22308c + "/" + s.a(z.b(str)) + ".html";
        }
        return "";
    }

    public final boolean a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22308c);
            sb.append("/");
            sb.append(s.a(z.b(str)));
            sb.append(".html");
            return new File(sb.toString()).exists();
        } catch (Exception e9) {
            if (!com.anythink.expressad.a.f17618a) {
                return false;
            }
            e9.printStackTrace();
            return false;
        }
    }

    public final String b(String str) {
        try {
            String str2 = this.f22308c + "/" + s.a(z.b(str)) + ".html";
            if (new File(str2).exists()) {
                return "file:////".concat(String.valueOf(str2));
            }
            return null;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f17618a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
