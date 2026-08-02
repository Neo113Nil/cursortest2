package com.yandex.passport.common.browser;

import defpackage.rdb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final /* synthetic */ b[] j;
    public static final /* synthetic */ rdb k;
    public final String a;

    static {
        b bVar = new b("YA_BRO", 0, "com.yandex.browser");
        b = bVar;
        b bVar2 = new b("YA_BRO_BETA", 1, "com.yandex.browser.beta");
        b bVar3 = new b("YA_BRO_ALPHA", 2, "com.yandex.browser.alpha");
        b bVar4 = new b("YA_SEARCHAPP", 3, "com.yandex.searchapp");
        c = bVar4;
        b bVar5 = new b("YA_SEARCHAPP_BETA", 4, "com.yandex.searchapp.beta");
        b bVar6 = new b("YA_START", 5, "ru.yandex.searchplugin");
        b bVar7 = new b("YA_START_BETA", 6, "ru.yandex.searchplugin.beta");
        b bVar8 = new b("CHROME", 7, "com.android.chrome");
        d = bVar8;
        b bVar9 = new b("CHROME_BETA", 8, "com.android.chrome.beta");
        b bVar10 = new b("CHROME_DEV", 9, "com.android.chrome.dev");
        b bVar11 = new b("FIREFOX", 10, "org.mozilla.firefox");
        e = bVar11;
        b bVar12 = new b("HUAWEI", 11, "com.huawei.browser");
        f = bVar12;
        b bVar13 = new b("XIAOMI", 12, "com.mi.globalbrowser");
        g = bVar13;
        b bVar14 = new b("OPERA", 13, "com.opera.browser");
        h = bVar14;
        b bVar15 = new b("SAMSUNG", 14, "com.sec.android.app.sbrowser");
        i = bVar15;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        j = bVarArr;
        k = new rdb(bVarArr);
    }

    public b(String str, int i2, String str2) {
        this.a = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) j.clone();
    }
}
