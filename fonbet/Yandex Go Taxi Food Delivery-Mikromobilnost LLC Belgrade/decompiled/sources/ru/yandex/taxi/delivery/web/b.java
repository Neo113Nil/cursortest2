package ru.yandex.taxi.delivery.web;

import defpackage.amh;
import defpackage.bhh;
import defpackage.gf41;
import defpackage.h55;
import defpackage.i3y;
import defpackage.jst;
import defpackage.nwh;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.tje;
import defpackage.tls;
import defpackage.wvi;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.n;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes5.dex */
public final class b extends h55 {
    public final nwh D;
    public final pwy0 E;
    public final gf41 F;
    public final i3y G;

    public b(nwh nwhVar, pwy0 pwy0Var, gf41 gf41Var) {
        super(null);
        this.D = nwhVar;
        this.E = pwy0Var;
        this.F = gf41Var;
        this.G = kotlin.a.a(new amh(16, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(15:5|6|(1:(4:9|10|11|12)(2:39|40))(16:41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|(1:57)(1:58))|13|14|15|(1:17)(1:32)|18|(1:20)(1:31)|21|(1:23)|24|(1:26)(1:30)|27|28))|71|6|(0)(0)|13|14|15|(0)(0)|18|(0)(0)|21|(0)|24|(0)(0)|27|28|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r8v10, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, String str, boolean z, boolean z2, boolean z3, bhh bhhVar, ContinuationImpl continuationImpl) {
        DeliveryWebViewRouter$getUiConfig$1 deliveryWebViewRouter$getUiConfig$1;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        bhh bhhVar2;
        Object a;
        boolean z7;
        String str2;
        String str3 = str;
        nwh nwhVar = bVar.D;
        if (continuationImpl instanceof DeliveryWebViewRouter$getUiConfig$1) {
            deliveryWebViewRouter$getUiConfig$1 = (DeliveryWebViewRouter$getUiConfig$1) continuationImpl;
            int i2 = deliveryWebViewRouter$getUiConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryWebViewRouter$getUiConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryWebViewRouter$getUiConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryWebViewRouter$getUiConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        deliveryWebViewRouter$getUiConfig$1.L$0 = str3;
                        bhhVar2 = bhhVar;
                        try {
                            deliveryWebViewRouter$getUiConfig$1.L$1 = bhhVar2;
                            z4 = z;
                            try {
                                deliveryWebViewRouter$getUiConfig$1.Z$0 = z4;
                                z5 = z2;
                                try {
                                    deliveryWebViewRouter$getUiConfig$1.Z$1 = z5;
                                    z6 = z3;
                                } catch (IllegalStateException unused) {
                                    z6 = z3;
                                    jst.e.getClass();
                                    str2 = str3;
                                    z7 = z5;
                                    if (bVar.E.getThemeType() == ThemeType.DARK) {
                                    }
                                    CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                                    aVar.h = true;
                                    aVar.i = true;
                                    aVar.j = true;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(nwhVar.b.a());
                                    linkedHashMap.put("sec-ch-prefers-color-scheme", r0 ? "dark" : "light");
                                    aVar.d = linkedHashMap;
                                    aVar.b = str2;
                                    aVar.m = new a(bhhVar2);
                                    if (z7) {
                                    }
                                    UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                                    uiWebViewConfig.setShouldShowToolbar(z6);
                                    uiWebViewConfig.setShouldShowCloseButton(z6);
                                    uiWebViewConfig.setModalViewMode(z4 ? UiWebViewConfig.Fullscreen.INSTANCE : new UiWebViewConfig.Slideable(true, null, false, false, 14, null));
                                    uiWebViewConfig.setBackStackAware(!z6);
                                    return uiWebViewConfig;
                                }
                                try {
                                    deliveryWebViewRouter$getUiConfig$1.Z$2 = z6;
                                    deliveryWebViewRouter$getUiConfig$1.label = 1;
                                    a = n.a(nwhVar.c, str3, deliveryWebViewRouter$getUiConfig$1);
                                    if (a == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    z7 = z5;
                                } catch (IllegalStateException unused2) {
                                    jst.e.getClass();
                                    str2 = str3;
                                    z7 = z5;
                                    if (bVar.E.getThemeType() == ThemeType.DARK) {
                                    }
                                    CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
                                    aVar2.h = true;
                                    aVar2.i = true;
                                    aVar2.j = true;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(nwhVar.b.a());
                                    linkedHashMap2.put("sec-ch-prefers-color-scheme", r0 ? "dark" : "light");
                                    aVar2.d = linkedHashMap2;
                                    aVar2.b = str2;
                                    aVar2.m = new a(bhhVar2);
                                    if (z7) {
                                    }
                                    UiWebViewConfig uiWebViewConfig2 = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                                    uiWebViewConfig2.setShouldShowToolbar(z6);
                                    uiWebViewConfig2.setShouldShowCloseButton(z6);
                                    uiWebViewConfig2.setModalViewMode(z4 ? UiWebViewConfig.Fullscreen.INSTANCE : new UiWebViewConfig.Slideable(true, null, false, false, 14, null));
                                    uiWebViewConfig2.setBackStackAware(!z6);
                                    return uiWebViewConfig2;
                                }
                            } catch (IllegalStateException unused3) {
                                z5 = z2;
                                z6 = z3;
                                jst.e.getClass();
                                str2 = str3;
                                z7 = z5;
                                if (bVar.E.getThemeType() == ThemeType.DARK) {
                                }
                                CoreWebViewConfig.a aVar22 = new CoreWebViewConfig.a();
                                aVar22.h = true;
                                aVar22.i = true;
                                aVar22.j = true;
                                LinkedHashMap linkedHashMap22 = new LinkedHashMap(nwhVar.b.a());
                                linkedHashMap22.put("sec-ch-prefers-color-scheme", r0 ? "dark" : "light");
                                aVar22.d = linkedHashMap22;
                                aVar22.b = str2;
                                aVar22.m = new a(bhhVar2);
                                if (z7) {
                                }
                                UiWebViewConfig uiWebViewConfig22 = new UiWebViewConfig(aVar22.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                                uiWebViewConfig22.setShouldShowToolbar(z6);
                                uiWebViewConfig22.setShouldShowCloseButton(z6);
                                uiWebViewConfig22.setModalViewMode(z4 ? UiWebViewConfig.Fullscreen.INSTANCE : new UiWebViewConfig.Slideable(true, null, false, false, 14, null));
                                uiWebViewConfig22.setBackStackAware(!z6);
                                return uiWebViewConfig22;
                            }
                        } catch (IllegalStateException unused4) {
                            z4 = z;
                        }
                    } catch (IllegalStateException unused5) {
                        z4 = z;
                        z5 = z2;
                        z6 = z3;
                        bhhVar2 = bhhVar;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z8 = deliveryWebViewRouter$getUiConfig$1.Z$2;
                    z7 = deliveryWebViewRouter$getUiConfig$1.Z$1;
                    z4 = deliveryWebViewRouter$getUiConfig$1.Z$0;
                    ?? r8 = (tls) deliveryWebViewRouter$getUiConfig$1.L$1;
                    String str4 = (String) deliveryWebViewRouter$getUiConfig$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        z6 = z8;
                        str3 = str4;
                        a = obj;
                        bhhVar2 = r8;
                    } catch (IllegalStateException unused6) {
                        z6 = z8;
                        str3 = str4;
                        bhhVar2 = r8;
                        z5 = z7;
                        jst.e.getClass();
                        str2 = str3;
                        z7 = z5;
                        if (bVar.E.getThemeType() == ThemeType.DARK) {
                        }
                        CoreWebViewConfig.a aVar222 = new CoreWebViewConfig.a();
                        aVar222.h = true;
                        aVar222.i = true;
                        aVar222.j = true;
                        LinkedHashMap linkedHashMap222 = new LinkedHashMap(nwhVar.b.a());
                        linkedHashMap222.put("sec-ch-prefers-color-scheme", r0 ? "dark" : "light");
                        aVar222.d = linkedHashMap222;
                        aVar222.b = str2;
                        aVar222.m = new a(bhhVar2);
                        if (z7) {
                        }
                        UiWebViewConfig uiWebViewConfig222 = new UiWebViewConfig(aVar222.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                        uiWebViewConfig222.setShouldShowToolbar(z6);
                        uiWebViewConfig222.setShouldShowCloseButton(z6);
                        uiWebViewConfig222.setModalViewMode(z4 ? UiWebViewConfig.Fullscreen.INSTANCE : new UiWebViewConfig.Slideable(true, null, false, false, 14, null));
                        uiWebViewConfig222.setBackStackAware(!z6);
                        return uiWebViewConfig222;
                    }
                }
                str2 = (String) a;
                boolean z9 = bVar.E.getThemeType() == ThemeType.DARK;
                CoreWebViewConfig.a aVar2222 = new CoreWebViewConfig.a();
                aVar2222.h = true;
                aVar2222.i = true;
                aVar2222.j = true;
                LinkedHashMap linkedHashMap2222 = new LinkedHashMap(nwhVar.b.a());
                linkedHashMap2222.put("sec-ch-prefers-color-scheme", z9 ? "dark" : "light");
                aVar2222.d = linkedHashMap2222;
                aVar2222.b = str2;
                aVar2222.m = new a(bhhVar2);
                if (z7) {
                    aVar2222.c = nwhVar.a.c();
                }
                UiWebViewConfig uiWebViewConfig2222 = new UiWebViewConfig(aVar2222.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig2222.setShouldShowToolbar(z6);
                uiWebViewConfig2222.setShouldShowCloseButton(z6);
                uiWebViewConfig2222.setModalViewMode(z4 ? UiWebViewConfig.Fullscreen.INSTANCE : new UiWebViewConfig.Slideable(true, null, false, false, 14, null));
                uiWebViewConfig2222.setBackStackAware(!z6);
                return uiWebViewConfig2222;
            }
        }
        deliveryWebViewRouter$getUiConfig$1 = new DeliveryWebViewRouter$getUiConfig$1(bVar, continuationImpl);
        Object obj2 = deliveryWebViewRouter$getUiConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryWebViewRouter$getUiConfig$1.label;
        if (i != 0) {
        }
        str2 = (String) a;
        if (bVar.E.getThemeType() == ThemeType.DARK) {
        }
        CoreWebViewConfig.a aVar22222 = new CoreWebViewConfig.a();
        aVar22222.h = true;
        aVar22222.i = true;
        aVar22222.j = true;
        LinkedHashMap linkedHashMap22222 = new LinkedHashMap(nwhVar.b.a());
        linkedHashMap22222.put("sec-ch-prefers-color-scheme", z9 ? "dark" : "light");
        aVar22222.d = linkedHashMap22222;
        aVar22222.b = str2;
        aVar22222.m = new a(bhhVar2);
        if (z7) {
        }
        UiWebViewConfig uiWebViewConfig22222 = new UiWebViewConfig(aVar22222.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig22222.setShouldShowToolbar(z6);
        uiWebViewConfig22222.setShouldShowCloseButton(z6);
        uiWebViewConfig22222.setModalViewMode(z4 ? UiWebViewConfig.Fullscreen.INSTANCE : new UiWebViewConfig.Slideable(true, null, false, false, 14, null));
        uiWebViewConfig22222.setBackStackAware(!z6);
        return uiWebViewConfig22222;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new DeliveryWebViewRouter$onLaunch$1((wvi) obj, this, null), 3);
    }
}
