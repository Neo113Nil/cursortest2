package ru.yandex.taxi.requirements.models.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/models/domain/PreorderBubbleAvailability;", "", "AVAILABLE", "UNAVAILABLE_IN_TARIFF", "UNAVAILABLE_SELECTED_TIME", "HIDDEN", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreorderBubbleAvailability {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PreorderBubbleAvailability[] $VALUES;
    public static final PreorderBubbleAvailability AVAILABLE;
    public static final PreorderBubbleAvailability HIDDEN;
    public static final PreorderBubbleAvailability UNAVAILABLE_IN_TARIFF;
    public static final PreorderBubbleAvailability UNAVAILABLE_SELECTED_TIME;

    static {
        PreorderBubbleAvailability preorderBubbleAvailability = new PreorderBubbleAvailability("AVAILABLE", 0);
        AVAILABLE = preorderBubbleAvailability;
        PreorderBubbleAvailability preorderBubbleAvailability2 = new PreorderBubbleAvailability("UNAVAILABLE_IN_TARIFF", 1);
        UNAVAILABLE_IN_TARIFF = preorderBubbleAvailability2;
        PreorderBubbleAvailability preorderBubbleAvailability3 = new PreorderBubbleAvailability("UNAVAILABLE_SELECTED_TIME", 2);
        UNAVAILABLE_SELECTED_TIME = preorderBubbleAvailability3;
        PreorderBubbleAvailability preorderBubbleAvailability4 = new PreorderBubbleAvailability("HIDDEN", 3);
        HIDDEN = preorderBubbleAvailability4;
        PreorderBubbleAvailability[] preorderBubbleAvailabilityArr = {preorderBubbleAvailability, preorderBubbleAvailability2, preorderBubbleAvailability3, preorderBubbleAvailability4};
        $VALUES = preorderBubbleAvailabilityArr;
        $ENTRIES = a.a(preorderBubbleAvailabilityArr);
    }

    public static PreorderBubbleAvailability valueOf(String str) {
        return (PreorderBubbleAvailability) Enum.valueOf(PreorderBubbleAvailability.class, str);
    }

    public static PreorderBubbleAvailability[] values() {
        return (PreorderBubbleAvailability[]) $VALUES.clone();
    }
}
