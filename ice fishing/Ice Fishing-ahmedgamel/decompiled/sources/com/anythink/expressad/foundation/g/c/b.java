package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19946a = "anythink_template/other";

    /* renamed from: c, reason: collision with root package name */
    private static final String f19947c = "anythink_template/";

    /* renamed from: d, reason: collision with root package name */
    private static final String f19948d = "anythink_template/res/Movies";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19949e = "anythink_template/res";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19950f = "anythink_template/res/.Anythink_VC";

    /* renamed from: g, reason: collision with root package name */
    private static final String f19951g = "anythink_template/res/.anythink700";

    /* renamed from: h, reason: collision with root package name */
    private static final String f19952h = "anythink_template/res/img";
    private static final String i = "anythink_template/crashinfo";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19953j = "anythink_template/res/xml";

    /* renamed from: k, reason: collision with root package name */
    private static final String f19954k = "anythink_template/anythink/config";

    /* renamed from: l, reason: collision with root package name */
    private static final String f19955l = "anythink_template/res/res";

    /* renamed from: m, reason: collision with root package name */
    private static final String f19956m = "anythink_template/res/html";

    public b(String str) {
        super(str);
    }

    @Override // com.anythink.expressad.foundation.g.c.f
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        f.a(arrayList, a.ANYTHINK_RES_MANAGER_DIR, f19949e);
        f.a(arrayList, a.AD_MOVIES, f19948d).a(a.ANYTHINK_VC, f19950f);
        e a9 = f.a(arrayList, a.AD_ANYTHINK_700, f19951g);
        a9.a(a.ANYTHINK_700_IMG, f19952h);
        a9.a(a.ANYTHINK_700_XML, f19953j);
        a9.a(a.ANYTHINK_700_CONFIG, f19954k);
        a9.a(a.ANYTHINK_700_RES, f19955l);
        a9.a(a.ANYTHINK_700_HTML, f19956m);
        a aVar = a.ANYTHINK_OTHER;
        f.a(arrayList, aVar, f19946a);
        f.a(arrayList, a.ANYTHINK_CRASH_INFO, i);
        f.a(arrayList, aVar, f19946a);
        return arrayList;
    }
}
