package com.anythink.expressad.foundation.g.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.f;
import com.anythink.expressad.foundation.g.f.l;
import com.google.android.gms.internal.ads.Wv;
import java.io.File;

/* loaded from: classes.dex */
public final class d extends com.anythink.expressad.foundation.g.h.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20003a = "ImageWorker";

    /* renamed from: b, reason: collision with root package name */
    private String f20004b;

    /* renamed from: c, reason: collision with root package name */
    private String f20005c;

    /* renamed from: g, reason: collision with root package name */
    private String f20006g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20007h = false;
    private a i;

    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public d(String str, String str2, String str3) {
        this.f20004b = str;
        this.f20005c = str2;
        this.f20006g = str3;
    }

    private String h() {
        return this.f20004b;
    }

    private String i() {
        return this.f20005c;
    }

    private String j() {
        return this.f20006g;
    }

    private boolean k() {
        return this.f20007h;
    }

    private a l() {
        return this.i;
    }

    private static void m() {
    }

    private void n() {
        try {
            File file = new File(this.f20006g);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.anythink.expressad.foundation.g.f.h.a.a(file, this.f20005c, new f<Void>() { // from class: com.anythink.expressad.foundation.g.d.d.1
                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a() {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(long j6, long j9) {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(l lVar) {
                    String unused = d.this.f20006g;
                    d.this.d();
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
                    d dVar = d.this;
                    dVar.b(dVar.f20005c, "load image from http faild because http return code: " + aVar.f20015a + ".image url is " + d.this.f20005c);
                }
            });
        } catch (Exception e9) {
            b(this.f20005c, e9.getMessage());
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        } catch (OutOfMemoryError e10) {
            b(this.f20005c, e10.getMessage());
        }
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void b() {
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void c() {
    }

    public final void d() {
        if (new File(this.f20006g).length() <= 0) {
            b(this.f20005c, Wv.i(new StringBuilder("load image faild.because file["), this.f20006g, "] is not exist!"));
            return;
        }
        String str = this.f20005c;
        String str2 = this.f20006g;
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.b(str, str2);
        }
    }

    public final void a(boolean z6) {
        this.f20007h = z6;
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    private void a(String str, String str2) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void a() {
        if (!this.f20007h) {
            if (TextUtils.isEmpty(this.f20006g)) {
                b(this.f20005c, "save path is null.");
                return;
            }
            File file = new File(this.f20006g);
            if (file.exists() && file.length() > 0) {
                d();
                return;
            } else {
                n();
                return;
            }
        }
        n();
    }
}
