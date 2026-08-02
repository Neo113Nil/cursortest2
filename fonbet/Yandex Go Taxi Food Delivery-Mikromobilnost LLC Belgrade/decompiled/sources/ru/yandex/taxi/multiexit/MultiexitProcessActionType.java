package ru.yandex.taxi.multiexit;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/multiexit/MultiexitProcessActionType;", "", "CONTINUE_TAXI_FLOW", "CONTINUE_TAXI_FLOW_WITH_NOTIFICATION", "FOCUS_MULTIEXIT_POINT", "FOCUS_MULTIEXIT_POINT_WITH_NOTIFICATION", "DEFAULT_SHOW_MULTIEXIT_MODAL_VIEW", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiexitProcessActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultiexitProcessActionType[] $VALUES;
    public static final MultiexitProcessActionType CONTINUE_TAXI_FLOW;
    public static final MultiexitProcessActionType CONTINUE_TAXI_FLOW_WITH_NOTIFICATION;
    public static final MultiexitProcessActionType DEFAULT_SHOW_MULTIEXIT_MODAL_VIEW;
    public static final MultiexitProcessActionType FOCUS_MULTIEXIT_POINT;
    public static final MultiexitProcessActionType FOCUS_MULTIEXIT_POINT_WITH_NOTIFICATION;

    static {
        MultiexitProcessActionType multiexitProcessActionType = new MultiexitProcessActionType("CONTINUE_TAXI_FLOW", 0);
        CONTINUE_TAXI_FLOW = multiexitProcessActionType;
        MultiexitProcessActionType multiexitProcessActionType2 = new MultiexitProcessActionType("CONTINUE_TAXI_FLOW_WITH_NOTIFICATION", 1);
        CONTINUE_TAXI_FLOW_WITH_NOTIFICATION = multiexitProcessActionType2;
        MultiexitProcessActionType multiexitProcessActionType3 = new MultiexitProcessActionType("FOCUS_MULTIEXIT_POINT", 2);
        FOCUS_MULTIEXIT_POINT = multiexitProcessActionType3;
        MultiexitProcessActionType multiexitProcessActionType4 = new MultiexitProcessActionType("FOCUS_MULTIEXIT_POINT_WITH_NOTIFICATION", 3);
        FOCUS_MULTIEXIT_POINT_WITH_NOTIFICATION = multiexitProcessActionType4;
        MultiexitProcessActionType multiexitProcessActionType5 = new MultiexitProcessActionType("DEFAULT_SHOW_MULTIEXIT_MODAL_VIEW", 4);
        DEFAULT_SHOW_MULTIEXIT_MODAL_VIEW = multiexitProcessActionType5;
        MultiexitProcessActionType[] multiexitProcessActionTypeArr = {multiexitProcessActionType, multiexitProcessActionType2, multiexitProcessActionType3, multiexitProcessActionType4, multiexitProcessActionType5};
        $VALUES = multiexitProcessActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(multiexitProcessActionTypeArr);
    }

    public static MultiexitProcessActionType valueOf(String str) {
        return (MultiexitProcessActionType) Enum.valueOf(MultiexitProcessActionType.class, str);
    }

    public static MultiexitProcessActionType[] values() {
        return (MultiexitProcessActionType[]) $VALUES.clone();
    }
}
