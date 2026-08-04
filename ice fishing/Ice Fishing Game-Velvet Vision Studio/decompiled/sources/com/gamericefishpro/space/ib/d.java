package com.gamericefishpro.space.ib;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.gb.f;
import com.gamericefishpro.space.gb.g;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.hb.a {
    public static final b f;
    public static final b g;
    public final HashMap a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a(0);
    public static final c h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [com.gamericefishpro.space.ib.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.gamericefishpro.space.ib.b] */
    static {
        final int i = 0;
        f = new f() { // from class: com.gamericefishpro.space.ib.b
            @Override // com.gamericefishpro.space.gb.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new f() { // from class: com.gamericefishpro.space.ib.b
            @Override // com.gamericefishpro.space.gb.a
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final com.gamericefishpro.space.hb.a a(Class cls, com.gamericefishpro.space.gb.d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
