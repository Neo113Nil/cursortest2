package com.anythink.basead.b.b;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    w f6575a;

    /* renamed from: b, reason: collision with root package name */
    x f6576b;

    /* renamed from: c, reason: collision with root package name */
    String f6577c;

    /* renamed from: d, reason: collision with root package name */
    com.anythink.basead.d.a f6578d;

    /* renamed from: e, reason: collision with root package name */
    private List<Boolean> f6579e = new ArrayList();

    public f(w wVar, x xVar, String str, com.anythink.basead.d.a aVar) {
        this.f6575a = wVar;
        this.f6576b = xVar;
        this.f6577c = str;
        this.f6578d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b() {
        String scheme;
        if (!TextUtils.isEmpty(this.f6577c)) {
            try {
                scheme = Uri.parse(this.f6577c).getScheme();
            } catch (Throwable unused) {
            }
            String str = scheme;
            com.anythink.basead.d.a aVar = this.f6578d;
            com.anythink.core.common.u.e.a(this.f6575a, this.f6576b, this.f6577c, str, this.f6579e, aVar == null ? aVar.f6906n : -1, com.anythink.basead.c.a().h());
        }
        scheme = "";
        String str2 = scheme;
        com.anythink.basead.d.a aVar2 = this.f6578d;
        com.anythink.core.common.u.e.a(this.f6575a, this.f6576b, this.f6577c, str2, this.f6579e, aVar2 == null ? aVar2.f6906n : -1, com.anythink.basead.c.a().h());
    }

    public final void a() {
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.basead.b.b.f.1
            @Override // java.lang.Runnable
            public final void run() {
                f.this.f6579e.add(Boolean.valueOf(com.anythink.basead.c.a().e()));
                if (f.this.f6579e.size() < 5) {
                    f.this.a();
                } else {
                    f.b(f.this);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(f fVar) {
        String scheme;
        if (!TextUtils.isEmpty(fVar.f6577c)) {
            try {
                scheme = Uri.parse(fVar.f6577c).getScheme();
            } catch (Throwable unused) {
            }
            String str = scheme;
            com.anythink.basead.d.a aVar = fVar.f6578d;
            com.anythink.core.common.u.e.a(fVar.f6575a, fVar.f6576b, fVar.f6577c, str, fVar.f6579e, aVar == null ? aVar.f6906n : -1, com.anythink.basead.c.a().h());
        }
        scheme = "";
        String str2 = scheme;
        com.anythink.basead.d.a aVar2 = fVar.f6578d;
        com.anythink.core.common.u.e.a(fVar.f6575a, fVar.f6576b, fVar.f6577c, str2, fVar.f6579e, aVar2 == null ? aVar2.f6906n : -1, com.anythink.basead.c.a().h());
    }
}
