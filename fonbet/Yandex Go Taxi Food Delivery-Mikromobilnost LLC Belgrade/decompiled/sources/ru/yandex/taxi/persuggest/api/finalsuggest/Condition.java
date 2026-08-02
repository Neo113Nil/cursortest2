package ru.yandex.taxi.persuggest.api.finalsuggest;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ixd;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.kpd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@jxi
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/persuggest/api/finalsuggest/Condition;", "", "Companion", "ixd", "TO_TAXI", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Condition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Condition[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ixd Companion;
    public static final Condition TO_TAXI;

    static {
        Condition condition = new Condition("TO_TAXI", 0);
        TO_TAXI = condition;
        Condition[] conditionArr = {condition};
        $VALUES = conditionArr;
        $ENTRIES = a.a(conditionArr);
        Companion = new ixd();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kpd(12));
    }

    public static Condition valueOf(String str) {
        return (Condition) Enum.valueOf(Condition.class, str);
    }

    public static Condition[] values() {
        return (Condition[]) $VALUES.clone();
    }
}
