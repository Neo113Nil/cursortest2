package com.anythink.core.common.r;

import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16851a = "e";

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Integer> f16852b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, f> f16853c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private Handler f16854d;

    public final void a(h hVar, Handler handler, a aVar) {
        try {
            this.f16854d = handler;
            g gVar = hVar != null ? hVar.f16876j : null;
            if (gVar == null) {
                return;
            }
            if (!gVar.a(16)) {
                String str = hVar.f16869b;
                return;
            }
            String str2 = hVar.f16869b;
            Integer num = this.f16852b.get(str2);
            Integer valueOf = num != null ? Integer.valueOf(num.intValue() + 1) : 1;
            hVar.i = valueOf.intValue();
            this.f16852b.put(str2, valueOf);
            if (valueOf.intValue() > gVar.g()) {
                return;
            }
            long h3 = gVar.h() * valueOf.intValue();
            f fVar = new f(hVar, aVar);
            this.f16853c.put(str2, fVar);
            handler.postDelayed(fVar, h3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void a(h hVar) {
        f remove;
        if (hVar == null) {
            return;
        }
        String str = hVar.f16869b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hVar.i = 0;
            this.f16852b.remove(str);
            if (this.f16854d == null || (remove = this.f16853c.remove(str)) == null) {
                return;
            }
            this.f16854d.removeCallbacks(remove);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
