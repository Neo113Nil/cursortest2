package ru.yandex.taxi.orderforanother.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.q9s;
import defpackage.v5r;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/orderforanother/model/FormedFrom;", "", "Companion", "q9s", "DIALOG", "REQUIREMENTS", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FormedFrom {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormedFrom[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final q9s Companion;
    public static final FormedFrom DIALOG;
    public static final FormedFrom REQUIREMENTS;
    public static final FormedFrom UNKNOWN;

    static {
        FormedFrom formedFrom = new FormedFrom("DIALOG", 0);
        DIALOG = formedFrom;
        FormedFrom formedFrom2 = new FormedFrom("REQUIREMENTS", 1);
        REQUIREMENTS = formedFrom2;
        FormedFrom formedFrom3 = new FormedFrom("UNKNOWN", 2);
        UNKNOWN = formedFrom3;
        FormedFrom[] formedFromArr = {formedFrom, formedFrom2, formedFrom3};
        $VALUES = formedFromArr;
        $ENTRIES = a.a(formedFromArr);
        Companion = new q9s();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(18));
    }

    public static FormedFrom valueOf(String str) {
        return (FormedFrom) Enum.valueOf(FormedFrom.class, str);
    }

    public static FormedFrom[] values() {
        return (FormedFrom[]) $VALUES.clone();
    }
}
