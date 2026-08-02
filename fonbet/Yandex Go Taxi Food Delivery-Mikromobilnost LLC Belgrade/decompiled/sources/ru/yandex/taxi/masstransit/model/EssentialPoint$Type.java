package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/masstransit/model/EssentialPoint$Type", "", "Lru/yandex/taxi/masstransit/model/EssentialPoint$Type;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "SOURCE", "DESTINATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EssentialPoint$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EssentialPoint$Type[] $VALUES;
    public static final EssentialPoint$Type DESTINATION;
    public static final EssentialPoint$Type SOURCE;
    private final String id;

    static {
        EssentialPoint$Type essentialPoint$Type = new EssentialPoint$Type("SOURCE", 0, "source");
        SOURCE = essentialPoint$Type;
        EssentialPoint$Type essentialPoint$Type2 = new EssentialPoint$Type("DESTINATION", 1, "destination");
        DESTINATION = essentialPoint$Type2;
        EssentialPoint$Type[] essentialPoint$TypeArr = {essentialPoint$Type, essentialPoint$Type2};
        $VALUES = essentialPoint$TypeArr;
        $ENTRIES = kotlin.enums.a.a(essentialPoint$TypeArr);
    }

    public EssentialPoint$Type(String str, int i, String str2) {
        this.id = str2;
    }

    public static EssentialPoint$Type valueOf(String str) {
        return (EssentialPoint$Type) Enum.valueOf(EssentialPoint$Type.class, str);
    }

    public static EssentialPoint$Type[] values() {
        return (EssentialPoint$Type[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
