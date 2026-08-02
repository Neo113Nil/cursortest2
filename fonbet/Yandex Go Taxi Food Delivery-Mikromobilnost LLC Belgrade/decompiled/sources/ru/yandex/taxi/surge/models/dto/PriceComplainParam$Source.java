package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vye0;
import defpackage.yye0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/surge/models/dto/PriceComplainParam$Source", "", "Lru/yandex/taxi/surge/models/dto/PriceComplainParam$Source;", "Companion", "yye0", "FEEDBACK", "SUPPORT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PriceComplainParam$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PriceComplainParam$Source[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final yye0 Companion;
    public static final PriceComplainParam$Source FEEDBACK;
    public static final PriceComplainParam$Source SUPPORT;

    static {
        PriceComplainParam$Source priceComplainParam$Source = new PriceComplainParam$Source("FEEDBACK", 0);
        FEEDBACK = priceComplainParam$Source;
        PriceComplainParam$Source priceComplainParam$Source2 = new PriceComplainParam$Source("SUPPORT", 1);
        SUPPORT = priceComplainParam$Source2;
        PriceComplainParam$Source[] priceComplainParam$SourceArr = {priceComplainParam$Source, priceComplainParam$Source2};
        $VALUES = priceComplainParam$SourceArr;
        $ENTRIES = kotlin.enums.a.a(priceComplainParam$SourceArr);
        Companion = new yye0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(3));
    }

    public static PriceComplainParam$Source valueOf(String str) {
        return (PriceComplainParam$Source) Enum.valueOf(PriceComplainParam$Source.class, str);
    }

    public static PriceComplainParam$Source[] values() {
        return (PriceComplainParam$Source[]) $VALUES.clone();
    }
}
