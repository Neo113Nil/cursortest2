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
    w f5789a;

    /* renamed from: b, reason: collision with root package name */
    x f5790b;

    /* renamed from: c, reason: collision with root package name */
    String f5791c;

    /* renamed from: d, reason: collision with root package name */
    com.anythink.basead.d.a f5792d;

    /* renamed from: e, reason: collision with root package name */
    private List<Boolean> f5793e = new ArrayList();

    public f(w wVar, x xVar, String str, com.anythink.basead.d.a aVar) {
        this.f5789a = wVar;
        this.f5790b = xVar;
        this.f5791c = str;
        this.f5792d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b() {
        String scheme;
        if (!TextUtils.isEmpty(this.f5791c)) {
            try {
                scheme = Uri.parse(this.f5791c).getScheme();
            } catch (Throwable unused) {
            }
            String str = scheme;
            com.anythink.basead.d.a aVar = this.f5792d;
            com.anythink.core.common.u.e.a(this.f5789a, this.f5790b, this.f5791c, str, this.f5793e, aVar == null ? aVar.f6120n : -1, com.anythink.basead.c.a().h());
        }
        scheme = "";
        String str2 = scheme;
        com.anythink.basead.d.a aVar2 = this.f5792d;
        com.anythink.core.common.u.e.a(this.f5789a, this.f5790b, this.f5791c, str2, this.f5793e, aVar2 == null ? aVar2.f6120n : -1, com.anythink.basead.c.a().h());
    }

    public final void a() {
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.basead.b.b.f.1
            @Override // java.lang.Runnable
            public final void run() {
                f.this.f5793e.add(Boolean.valueOf(com.anythink.basead.c.a().e()));
                if (f.this.f5793e.size() < 5) {
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
        if (!TextUtils.isEmpty(fVar.f5791c)) {
            try {
                scheme = Uri.parse(fVar.f5791c).getScheme();
            } catch (Throwable unused) {
            }
            String str = scheme;
            com.anythink.basead.d.a aVar = fVar.f5792d;
            com.anythink.core.common.u.e.a(fVar.f5789a, fVar.f5790b, fVar.f5791c, str, fVar.f5793e, aVar == null ? aVar.f6120n : -1, com.anythink.basead.c.a().h());
        }
        scheme = "";
        String str2 = scheme;
        com.anythink.basead.d.a aVar2 = fVar.f5792d;
        com.anythink.core.common.u.e.a(fVar.f5789a, fVar.f5790b, fVar.f5791c, str2, fVar.f5793e, aVar2 == null ? aVar2.f6120n : -1, com.anythink.basead.c.a().h());
    }
}
