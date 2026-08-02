package ru.yandex.taxi.map_common.map.intersection;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lru/yandex/taxi/map_common/map/intersection/Participant;", "", "", "defaultId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PIN", "ONLY_STEM_OF_PIN", "SPACE_WITHOUT_BUTTONS", "MASS_TRANSIT_BUBBLE", "DRIVE_CARS_COLLECTION", "DRIVE_BUBBLES_COLLECTION", "PICKUP_POINT_DOTS_COLLECTION", "PICKUP_POINT_LABELS_COLLECTION", "PICKUP_POINT_LAST_LABEL", "PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION", "PICKUP_POINT_BUBBLES_COLLECTION", "CLARIFY_POINT_BUBBLE", "PROMO_DOTS_COLLECTION", "PROMO_BUBBLES_COLLECTION", "ORDER_STYLED_BUBBLES_COLLECTION", "SOURCE_POINT_PIN", "DESTINATION_POINT_PIN", "CHECK_IN_POINT_PIN", "COMPANIONS_IN_SEARCH_COLLECTION", "CAR_ICON", "LABELS", "BODIES", "BUBBLES", "OVERLAYS", "IMAGE_OVERLAYS", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Participant {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Participant[] $VALUES;
    public static final Participant BODIES;
    public static final Participant BUBBLES;
    public static final Participant CAR_ICON;
    public static final Participant CHECK_IN_POINT_PIN;
    public static final Participant CLARIFY_POINT_BUBBLE;
    public static final Participant COMPANIONS_IN_SEARCH_COLLECTION;
    public static final Participant DESTINATION_POINT_PIN;
    public static final Participant DRIVE_BUBBLES_COLLECTION;
    public static final Participant DRIVE_CARS_COLLECTION;
    public static final Participant IMAGE_OVERLAYS;
    public static final Participant LABELS;
    public static final Participant MASS_TRANSIT_BUBBLE;
    public static final Participant NONE;
    public static final Participant ONLY_STEM_OF_PIN;
    public static final Participant ORDER_STYLED_BUBBLES_COLLECTION;
    public static final Participant OVERLAYS;
    public static final Participant PICKUP_POINT_BUBBLES_COLLECTION;
    public static final Participant PICKUP_POINT_DOTS_COLLECTION;
    public static final Participant PICKUP_POINT_LABELS_COLLECTION;
    public static final Participant PICKUP_POINT_LAST_LABEL;
    public static final Participant PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION;
    public static final Participant PIN;
    public static final Participant PROMO_BUBBLES_COLLECTION;
    public static final Participant PROMO_DOTS_COLLECTION;
    public static final Participant SOURCE_POINT_PIN;
    public static final Participant SPACE_WITHOUT_BUTTONS;
    private final String defaultId;

    static {
        Participant participant = new Participant("PIN", 0, "PIN");
        PIN = participant;
        Participant participant2 = new Participant("ONLY_STEM_OF_PIN", 1, "ONLY_STEM_OF_PIN");
        ONLY_STEM_OF_PIN = participant2;
        Participant participant3 = new Participant("SPACE_WITHOUT_BUTTONS", 2, "SPACE_WITHOUT_BUTTONS");
        SPACE_WITHOUT_BUTTONS = participant3;
        Participant participant4 = new Participant("MASS_TRANSIT_BUBBLE", 3, "MASS_TRANSIT_BUBBLE");
        MASS_TRANSIT_BUBBLE = participant4;
        Participant participant5 = new Participant("DRIVE_CARS_COLLECTION", 4, "DRIVE_CARS_COLLECTION");
        DRIVE_CARS_COLLECTION = participant5;
        Participant participant6 = new Participant("DRIVE_BUBBLES_COLLECTION", 5, "DRIVE_BUBBLES_COLLECTION");
        DRIVE_BUBBLES_COLLECTION = participant6;
        Participant participant7 = new Participant("PICKUP_POINT_DOTS_COLLECTION", 6, "PICKUP_POINT_DOTS_COLLECTION");
        PICKUP_POINT_DOTS_COLLECTION = participant7;
        Participant participant8 = new Participant("PICKUP_POINT_LABELS_COLLECTION", 7, "PICKUP_POINT_LABELS_COLLECTION");
        PICKUP_POINT_LABELS_COLLECTION = participant8;
        Participant participant9 = new Participant("PICKUP_POINT_LAST_LABEL", 8, "PICKUP_POINT_LAST_LABEL");
        PICKUP_POINT_LAST_LABEL = participant9;
        Participant participant10 = new Participant("PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION", 9, "PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION");
        PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION = participant10;
        Participant participant11 = new Participant("PICKUP_POINT_BUBBLES_COLLECTION", 10, "PICKUP_POINT_BUBBLES_COLLECTION");
        PICKUP_POINT_BUBBLES_COLLECTION = participant11;
        Participant participant12 = new Participant("CLARIFY_POINT_BUBBLE", 11, "CLARIFY_POINT_BUBBLE");
        CLARIFY_POINT_BUBBLE = participant12;
        Participant participant13 = new Participant("PROMO_DOTS_COLLECTION", 12, "PROMO_DOTS_COLLECTION");
        PROMO_DOTS_COLLECTION = participant13;
        Participant participant14 = new Participant("PROMO_BUBBLES_COLLECTION", 13, "PROMO_BUBBLES_COLLECTION");
        PROMO_BUBBLES_COLLECTION = participant14;
        Participant participant15 = new Participant("ORDER_STYLED_BUBBLES_COLLECTION", 14, "ORDER_STYLED_BUBBLES_COLLECTION");
        ORDER_STYLED_BUBBLES_COLLECTION = participant15;
        Participant participant16 = new Participant("SOURCE_POINT_PIN", 15, "SOURCE_POINT_PIN");
        SOURCE_POINT_PIN = participant16;
        Participant participant17 = new Participant("DESTINATION_POINT_PIN", 16, "DESTINATION_POINT_PIN");
        DESTINATION_POINT_PIN = participant17;
        Participant participant18 = new Participant("CHECK_IN_POINT_PIN", 17, "CHECK_IN_POINT_PIN");
        CHECK_IN_POINT_PIN = participant18;
        Participant participant19 = new Participant("COMPANIONS_IN_SEARCH_COLLECTION", 18, "COMPANIONS_IN_SEARCH_COLLECTION");
        COMPANIONS_IN_SEARCH_COLLECTION = participant19;
        Participant participant20 = new Participant("CAR_ICON", 19, "CAR_ICON");
        CAR_ICON = participant20;
        Participant participant21 = new Participant("LABELS", 20, "LABELS");
        LABELS = participant21;
        Participant participant22 = new Participant("BODIES", 21, "BODIES");
        BODIES = participant22;
        Participant participant23 = new Participant("BUBBLES", 22, "BUBBLES");
        BUBBLES = participant23;
        Participant participant24 = new Participant("OVERLAYS", 23, "OVERLAYS");
        OVERLAYS = participant24;
        Participant participant25 = new Participant("IMAGE_OVERLAYS", 24, "IMAGE_OVERLAYS");
        IMAGE_OVERLAYS = participant25;
        Participant participant26 = new Participant(JCP.RAW_PREFIX, 25, JCP.RAW_PREFIX);
        NONE = participant26;
        Participant[] participantArr = {participant, participant2, participant3, participant4, participant5, participant6, participant7, participant8, participant9, participant10, participant11, participant12, participant13, participant14, participant15, participant16, participant17, participant18, participant19, participant20, participant21, participant22, participant23, participant24, participant25, participant26};
        $VALUES = participantArr;
        $ENTRIES = kotlin.enums.a.a(participantArr);
    }

    public Participant(String str, int i, String str2) {
        this.defaultId = str2;
    }

    public static Participant valueOf(String str) {
        return (Participant) Enum.valueOf(Participant.class, str);
    }

    public static Participant[] values() {
        return (Participant[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getDefaultId() {
        return this.defaultId;
    }
}
