package ru.yandex.taxi.requirements.models.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/requirements/models/domain/BubbleAvailability;", "", "AVAILABLE", "UNAVAILABLE", "HIDDEN", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BubbleAvailability {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubbleAvailability[] $VALUES;
    public static final BubbleAvailability AVAILABLE;
    public static final BubbleAvailability HIDDEN;
    public static final BubbleAvailability UNAVAILABLE;

    static {
        BubbleAvailability bubbleAvailability = new BubbleAvailability("AVAILABLE", 0);
        AVAILABLE = bubbleAvailability;
        BubbleAvailability bubbleAvailability2 = new BubbleAvailability("UNAVAILABLE", 1);
        UNAVAILABLE = bubbleAvailability2;
        BubbleAvailability bubbleAvailability3 = new BubbleAvailability("HIDDEN", 2);
        HIDDEN = bubbleAvailability3;
        BubbleAvailability[] bubbleAvailabilityArr = {bubbleAvailability, bubbleAvailability2, bubbleAvailability3};
        $VALUES = bubbleAvailabilityArr;
        $ENTRIES = a.a(bubbleAvailabilityArr);
    }

    public static BubbleAvailability valueOf(String str) {
        return (BubbleAvailability) Enum.valueOf(BubbleAvailability.class, str);
    }

    public static BubbleAvailability[] values() {
        return (BubbleAvailability[]) $VALUES.clone();
    }
}
