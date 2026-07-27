package com.anythink.nativead.a;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.common.d.c;
import com.anythink.core.common.f;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.n;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.r;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22894a = "a";

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, a> f22895e = new ConcurrentHashMap(3);

    /* renamed from: b, reason: collision with root package name */
    private Context f22896b;

    /* renamed from: c, reason: collision with root package name */
    private String f22897c;

    /* renamed from: d, reason: collision with root package name */
    private f f22898d;

    private a(Context context, String str) {
        this.f22896b = context.getApplicationContext();
        this.f22897c = str;
        this.f22898d = f.a(context, str, "0");
    }

    public static a a(Context context, String str) {
        a aVar = f22895e.get(str);
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            if (aVar == null) {
                try {
                    aVar = new a(context, str);
                    f22895e.put(str, aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aVar;
    }

    private ae a(Map<String, Object> map) {
        ae aeVar = new ae();
        aeVar.a(map);
        f fVar = this.f22898d;
        if (fVar != null) {
            aeVar.a(fVar.i());
        }
        return aeVar;
    }

    public final void a(Context context, com.anythink.core.common.d.a aVar, c cVar, ATAdMultipleLoadedListener aTAdMultipleLoadedListener, Map<String, Object> map, ATAdRequest aTAdRequest) {
        ar arVar = new ar();
        arVar.a(context);
        arVar.a(aTAdRequest);
        arVar.f13705d = cVar;
        arVar.f13707f = aTAdMultipleLoadedListener;
        arVar.f13704c = 0;
        if (map != null) {
            try {
                arVar.f13708g = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        if (aTAdRequest != null) {
            arVar.f13712l = aTAdRequest.getATAdxBidFloorInfo();
        }
        this.f22898d.b(this.f22896b, "0", this.f22897c, arVar, aVar);
    }

    public final List<ATAdInfo> a(Context context) {
        return this.f22898d.a(context);
    }

    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        return this.f22898d.a(context, map);
    }

    public final com.anythink.core.common.h.c a(ATShowConfig aTShowConfig, Map<String, Object> map) {
        String str;
        String str2;
        ae aeVar = new ae();
        aeVar.a(map);
        f fVar = this.f22898d;
        if (fVar != null) {
            aeVar.a(fVar.i());
        }
        final com.anythink.core.common.h.c b9 = this.f22898d.b(this.f22896b, false, true, aeVar);
        if (b9 == null || b9.f() == null || !(b9.e() instanceof CustomNativeAdapter)) {
            return null;
        }
        n detail = b9.f().getDetail();
        if (aTShowConfig != null) {
            str = aTShowConfig.getScenarioId();
            str2 = aTShowConfig.getShowCustomExt();
            r.a(aTShowConfig.getATCustomContentResult(), detail);
        } else {
            str = "";
            str2 = "";
        }
        detail.f14168F = str;
        detail.z(str2);
        b9.a(b9.c() + 1);
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.nativead.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.a.a().a(b9);
            }
        });
        aj.a(map, detail);
        aj.a(this.f22897c, detail);
        return b9;
    }
}
