package ru.yandex.taxi.plus.api.dto;

import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/plus/api/dto/AvailableFields;", "", "", "fieldName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MENU", "STATE", "PLAQUE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AvailableFields {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AvailableFields[] $VALUES;
    public static final AvailableFields MENU;
    public static final AvailableFields PLAQUE;
    public static final AvailableFields STATE;
    private final String fieldName;

    static {
        AvailableFields availableFields = new AvailableFields("MENU", 0, "menu");
        MENU = availableFields;
        AvailableFields availableFields2 = new AvailableFields("STATE", 1, ClidProvider.STATE);
        STATE = availableFields2;
        AvailableFields availableFields3 = new AvailableFields("PLAQUE", 2, "plaque");
        PLAQUE = availableFields3;
        AvailableFields[] availableFieldsArr = {availableFields, availableFields2, availableFields3};
        $VALUES = availableFieldsArr;
        $ENTRIES = kotlin.enums.a.a(availableFieldsArr);
    }

    public AvailableFields(String str, int i, String str2) {
        this.fieldName = str2;
    }

    public static AvailableFields valueOf(String str) {
        return (AvailableFields) Enum.valueOf(AvailableFields.class, str);
    }

    public static AvailableFields[] values() {
        return (AvailableFields[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }
}
