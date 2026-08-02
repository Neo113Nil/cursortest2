package ru.yandex.taxi.logistics.sdk.dashboard.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/model/common/HorizontalAlignmentModel;", "", "BEGIN", "CENTER", "END", "base"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HorizontalAlignmentModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HorizontalAlignmentModel[] $VALUES;
    public static final HorizontalAlignmentModel BEGIN;
    public static final HorizontalAlignmentModel CENTER;
    public static final HorizontalAlignmentModel END;

    static {
        HorizontalAlignmentModel horizontalAlignmentModel = new HorizontalAlignmentModel("BEGIN", 0);
        BEGIN = horizontalAlignmentModel;
        HorizontalAlignmentModel horizontalAlignmentModel2 = new HorizontalAlignmentModel("CENTER", 1);
        CENTER = horizontalAlignmentModel2;
        HorizontalAlignmentModel horizontalAlignmentModel3 = new HorizontalAlignmentModel("END", 2);
        END = horizontalAlignmentModel3;
        HorizontalAlignmentModel[] horizontalAlignmentModelArr = {horizontalAlignmentModel, horizontalAlignmentModel2, horizontalAlignmentModel3};
        $VALUES = horizontalAlignmentModelArr;
        $ENTRIES = a.a(horizontalAlignmentModelArr);
    }

    public static HorizontalAlignmentModel valueOf(String str) {
        return (HorizontalAlignmentModel) Enum.valueOf(HorizontalAlignmentModel.class, str);
    }

    public static HorizontalAlignmentModel[] values() {
        return (HorizontalAlignmentModel[]) $VALUES.clone();
    }
}
