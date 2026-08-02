package ru.yandex.taxi.models;

import defpackage.bgc;
import defpackage.bpe;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/models/CopySource;", "", "", "alias", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "bpe", "LIST_ITEM", "DETAILS", "ORDER_INFO", "LOGISTICS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CopySource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CopySource[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final bpe Companion;
    public static final CopySource DETAILS;
    public static final CopySource LIST_ITEM;
    public static final CopySource LOGISTICS;
    public static final CopySource ORDER_INFO;
    private final String alias;

    static {
        CopySource copySource = new CopySource("LIST_ITEM", 0, "mini_card");
        LIST_ITEM = copySource;
        CopySource copySource2 = new CopySource("DETAILS", 1, "order_details");
        DETAILS = copySource2;
        CopySource copySource3 = new CopySource("ORDER_INFO", 2, "order_info");
        ORDER_INFO = copySource3;
        CopySource copySource4 = new CopySource("LOGISTICS", 3, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        LOGISTICS = copySource4;
        CopySource[] copySourceArr = {copySource, copySource2, copySource3, copySource4};
        $VALUES = copySourceArr;
        $ENTRIES = a.a(copySourceArr);
        Companion = new bpe();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(25));
    }

    public CopySource(String str, int i, String str2) {
        this.alias = str2;
    }

    public static CopySource valueOf(String str) {
        return (CopySource) Enum.valueOf(CopySource.class, str);
    }

    public static CopySource[] values() {
        return (CopySource[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }
}
