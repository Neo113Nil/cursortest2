package ru.yandex.taxi.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/domain/ContactSelectionStrategy;", "", "FROM_ORDER", "FROM_PICKER", "address"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContactSelectionStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContactSelectionStrategy[] $VALUES;
    public static final ContactSelectionStrategy FROM_ORDER;
    public static final ContactSelectionStrategy FROM_PICKER;

    static {
        ContactSelectionStrategy contactSelectionStrategy = new ContactSelectionStrategy("FROM_ORDER", 0);
        FROM_ORDER = contactSelectionStrategy;
        ContactSelectionStrategy contactSelectionStrategy2 = new ContactSelectionStrategy("FROM_PICKER", 1);
        FROM_PICKER = contactSelectionStrategy2;
        ContactSelectionStrategy[] contactSelectionStrategyArr = {contactSelectionStrategy, contactSelectionStrategy2};
        $VALUES = contactSelectionStrategyArr;
        $ENTRIES = kotlin.enums.a.a(contactSelectionStrategyArr);
    }

    public static ContactSelectionStrategy valueOf(String str) {
        return (ContactSelectionStrategy) Enum.valueOf(ContactSelectionStrategy.class, str);
    }

    public static ContactSelectionStrategy[] values() {
        return (ContactSelectionStrategy[]) $VALUES.clone();
    }
}
