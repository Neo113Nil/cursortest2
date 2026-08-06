package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class ModuleAdRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f7370a;

    /* renamed from: b, reason: collision with root package name */
    private final Currency f7371b;

    /* renamed from: c, reason: collision with root package name */
    private final ModuleAdType f7372c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7373d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7374e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7375f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7376g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7377h;

    /* renamed from: i, reason: collision with root package name */
    private final String f7378i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f7379j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f7380k;

    public ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, boolean z2) {
        this.f7370a = bigDecimal;
        this.f7371b = currency;
        this.f7372c = moduleAdType;
        this.f7373d = str;
        this.f7374e = str2;
        this.f7375f = str3;
        this.f7376g = str4;
        this.f7377h = str5;
        this.f7378i = str6;
        this.f7379j = map;
        this.f7380k = z2;
    }

    public final String getAdNetwork() {
        return this.f7373d;
    }

    public final String getAdPlacementId() {
        return this.f7376g;
    }

    public final String getAdPlacementName() {
        return this.f7377h;
    }

    public final BigDecimal getAdRevenue() {
        return this.f7370a;
    }

    public final ModuleAdType getAdType() {
        return this.f7372c;
    }

    public final String getAdUnitId() {
        return this.f7374e;
    }

    public final String getAdUnitName() {
        return this.f7375f;
    }

    public final boolean getAutoCollected() {
        return this.f7380k;
    }

    public final Currency getCurrency() {
        return this.f7371b;
    }

    public final Map<String, String> getPayload() {
        return this.f7379j;
    }

    public final String getPrecision() {
        return this.f7378i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z2, int i2, e eVar) {
        this(bigDecimal, currency, (i2 & 4) != 0 ? null : moduleAdType, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : map, (i2 & 1024) != 0 ? true : z2);
    }
}
