package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19159a = "anythink_template/other";

    /* renamed from: c, reason: collision with root package name */
    private static final String f19160c = "anythink_template/";

    /* renamed from: d, reason: collision with root package name */
    private static final String f19161d = "anythink_template/res/Movies";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19162e = "anythink_template/res";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19163f = "anythink_template/res/.Anythink_VC";

    /* renamed from: g, reason: collision with root package name */
    private static final String f19164g = "anythink_template/res/.anythink700";

    /* renamed from: h, reason: collision with root package name */
    private static final String f19165h = "anythink_template/res/img";
    private static final String i = "anythink_template/crashinfo";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19166j = "anythink_template/res/xml";

    /* renamed from: k, reason: collision with root package name */
    private static final String f19167k = "anythink_template/anythink/config";

    /* renamed from: l, reason: collision with root package name */
    private static final String f19168l = "anythink_template/res/res";

    /* renamed from: m, reason: collision with root package name */
    private static final String f19169m = "anythink_template/res/html";

    public b(String str) {
        super(str);
    }

    @Override // com.anythink.expressad.foundation.g.c.f
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        f.a(arrayList, a.ANYTHINK_RES_MANAGER_DIR, f19162e);
        f.a(arrayList, a.AD_MOVIES, f19161d).a(a.ANYTHINK_VC, f19163f);
        e a9 = f.a(arrayList, a.AD_ANYTHINK_700, f19164g);
        a9.a(a.ANYTHINK_700_IMG, f19165h);
        a9.a(a.ANYTHINK_700_XML, f19166j);
        a9.a(a.ANYTHINK_700_CONFIG, f19167k);
        a9.a(a.ANYTHINK_700_RES, f19168l);
        a9.a(a.ANYTHINK_700_HTML, f19169m);
        a aVar = a.ANYTHINK_OTHER;
        f.a(arrayList, aVar, f19159a);
        f.a(arrayList, a.ANYTHINK_CRASH_INFO, i);
        f.a(arrayList, aVar, f19159a);
        return arrayList;
    }
}
