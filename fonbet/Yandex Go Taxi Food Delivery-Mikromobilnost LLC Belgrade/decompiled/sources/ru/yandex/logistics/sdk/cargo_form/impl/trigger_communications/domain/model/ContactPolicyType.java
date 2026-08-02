package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/trigger_communications/domain/model/ContactPolicyType;", "", "MINUTES", "HOURS", "DAYS", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContactPolicyType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContactPolicyType[] $VALUES;
    public static final ContactPolicyType DAYS;
    public static final ContactPolicyType HOURS;
    public static final ContactPolicyType MINUTES;

    static {
        ContactPolicyType contactPolicyType = new ContactPolicyType("MINUTES", 0);
        MINUTES = contactPolicyType;
        ContactPolicyType contactPolicyType2 = new ContactPolicyType("HOURS", 1);
        HOURS = contactPolicyType2;
        ContactPolicyType contactPolicyType3 = new ContactPolicyType("DAYS", 2);
        DAYS = contactPolicyType3;
        ContactPolicyType[] contactPolicyTypeArr = {contactPolicyType, contactPolicyType2, contactPolicyType3};
        $VALUES = contactPolicyTypeArr;
        $ENTRIES = a.a(contactPolicyTypeArr);
    }

    public static ContactPolicyType valueOf(String str) {
        return (ContactPolicyType) Enum.valueOf(ContactPolicyType.class, str);
    }

    public static ContactPolicyType[] values() {
        return (ContactPolicyType[]) $VALUES.clone();
    }
}
