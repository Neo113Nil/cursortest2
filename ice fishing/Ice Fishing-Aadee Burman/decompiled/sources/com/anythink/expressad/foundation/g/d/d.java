package com.anythink.expressad.foundation.g.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.f;
import com.anythink.expressad.foundation.g.f.l;
import java.io.File;
import u1.h;

/* loaded from: classes.dex */
public final class d extends com.anythink.expressad.foundation.g.h.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19216a = "ImageWorker";

    /* renamed from: b, reason: collision with root package name */
    private String f19217b;

    /* renamed from: c, reason: collision with root package name */
    private String f19218c;

    /* renamed from: g, reason: collision with root package name */
    private String f19219g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19220h = false;
    private a i;

    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public d(String str, String str2, String str3) {
        this.f19217b = str;
        this.f19218c = str2;
        this.f19219g = str3;
    }

    private String h() {
        return this.f19217b;
    }

    private String i() {
        return this.f19218c;
    }

    private String j() {
        return this.f19219g;
    }

    private boolean k() {
        return this.f19220h;
    }

    private a l() {
        return this.i;
    }

    private static void m() {
    }

    private void n() {
        try {
            File file = new File(this.f19219g);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.anythink.expressad.foundation.g.f.h.a.a(file, this.f19218c, new f<Void>() { // from class: com.anythink.expressad.foundation.g.d.d.1
                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a() {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(long j6, long j9) {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(l lVar) {
                    String unused = d.this.f19219g;
                    d.this.d();
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
                    d dVar = d.this;
                    dVar.b(dVar.f19218c, "load image from http faild because http return code: " + aVar.f19228a + ".image url is " + d.this.f19218c);
                }
            });
        } catch (Exception e9) {
            b(this.f19218c, e9.getMessage());
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        } catch (OutOfMemoryError e10) {
            b(this.f19218c, e10.getMessage());
        }
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void b() {
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void c() {
    }

    public final void d() {
        if (new File(this.f19219g).length() <= 0) {
            b(this.f19218c, h.g(new StringBuilder("load image faild.because file["), this.f19219g, "] is not exist!"));
            return;
        }
        String str = this.f19218c;
        String str2 = this.f19219g;
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

    public final void a(boolean z3) {
        this.f19220h = z3;
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
        if (!this.f19220h) {
            if (TextUtils.isEmpty(this.f19219g)) {
                b(this.f19218c, "save path is null.");
                return;
            }
            File file = new File(this.f19219g);
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
