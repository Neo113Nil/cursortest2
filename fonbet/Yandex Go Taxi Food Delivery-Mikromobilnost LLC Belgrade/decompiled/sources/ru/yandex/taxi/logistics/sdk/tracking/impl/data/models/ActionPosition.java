package ru.yandex.taxi.logistics.sdk.tracking.impl.data.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/impl/data/models/ActionPosition;", "", "PRIMARY", "SECONDARY", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionPosition[] $VALUES;
    public static final ActionPosition PRIMARY;
    public static final ActionPosition SECONDARY;

    static {
        ActionPosition actionPosition = new ActionPosition("PRIMARY", 0);
        PRIMARY = actionPosition;
        ActionPosition actionPosition2 = new ActionPosition("SECONDARY", 1);
        SECONDARY = actionPosition2;
        ActionPosition[] actionPositionArr = {actionPosition, actionPosition2};
        $VALUES = actionPositionArr;
        $ENTRIES = a.a(actionPositionArr);
    }

    public static ActionPosition valueOf(String str) {
        return (ActionPosition) Enum.valueOf(ActionPosition.class, str);
    }

    public static ActionPosition[] values() {
        return (ActionPosition[]) $VALUES.clone();
    }
}
