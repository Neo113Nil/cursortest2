package ru.yandex.taxi.eats_commons;

import defpackage.ezg0;
import defpackage.fgn;
import defpackage.ggn;
import defpackage.gsq0;
import defpackage.h1p;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xng0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/eats_commons/EatsService;", "Lh1p;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "", "logoId", CA20Status.STATUS_USER_I, "b", "()I", "logoColorId", "a", "Companion", "ggn", "EATS", "GROCERY", "PHARMACY", "SHOP", "CORP_FOOD", "MARKET", "MARKET_VIEWER", "eats_orders"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EatsService implements h1p {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsService[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final EatsService CORP_FOOD;
    public static final ggn Companion;
    public static final EatsService EATS;
    public static final EatsService GROCERY;
    public static final EatsService MARKET;
    public static final EatsService MARKET_VIEWER;
    public static final EatsService PHARMACY;
    public static final EatsService SHOP;
    private final int logoColorId;
    private final int logoId;
    private final String value;

    static {
        int i = ezg0.ic_eats_logo_eats;
        int i2 = xng0.textMain;
        EatsService eatsService = new EatsService("EATS", 0, "eats", i, i2);
        EATS = eatsService;
        EatsService eatsService2 = new EatsService("GROCERY", 1, "grocery", ezg0.ic_eats_logo_grocery, i2);
        GROCERY = eatsService2;
        EatsService eatsService3 = new EatsService("PHARMACY", 2, "pharmacy", ezg0.ic_eats_logo_pharmacy, i2);
        PHARMACY = eatsService3;
        EatsService eatsService4 = new EatsService("SHOP", 3, "shop", ezg0.ic_eats_logo_shop, i2);
        SHOP = eatsService4;
        EatsService eatsService5 = new EatsService("CORP_FOOD", 4, "corp_food", ezg0.ic_eats_logo_lunch_card, i2);
        CORP_FOOD = eatsService5;
        int i3 = ezg0.ic_eats_logo_market;
        EatsService eatsService6 = new EatsService("MARKET", 5, "market", i3, i2);
        MARKET = eatsService6;
        EatsService eatsService7 = new EatsService("MARKET_VIEWER", 6, "market_viewer", i3, i2);
        MARKET_VIEWER = eatsService7;
        EatsService[] eatsServiceArr = {eatsService, eatsService2, eatsService3, eatsService4, eatsService5, eatsService6, eatsService7};
        $VALUES = eatsServiceArr;
        $ENTRIES = a.a(eatsServiceArr);
        Companion = new ggn();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(0));
    }

    public EatsService(String str, int i, String str2, int i2, int i3) {
        this.value = str2;
        this.logoId = i2;
        this.logoColorId = i3;
    }

    public static k4o f() {
        return $ENTRIES;
    }

    public static EatsService valueOf(String str) {
        return (EatsService) Enum.valueOf(EatsService.class, str);
    }

    public static EatsService[] values() {
        return (EatsService[]) $VALUES.clone();
    }

    @Override // defpackage.h1p
    /* renamed from: a, reason: from getter */
    public final int getLogoColorId() {
        return this.logoColorId;
    }

    @Override // defpackage.h1p
    /* renamed from: b, reason: from getter */
    public final int getLogoId() {
        return this.logoId;
    }

    @Override // defpackage.h1p
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
