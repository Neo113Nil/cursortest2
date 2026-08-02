package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/widget/SeparateTitle$Align", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/SeparateTitle$Align;", "START", "CENTER", "END", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SeparateTitle$Align {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SeparateTitle$Align[] $VALUES;
    public static final SeparateTitle$Align CENTER;
    public static final SeparateTitle$Align END;
    public static final SeparateTitle$Align START;

    static {
        SeparateTitle$Align separateTitle$Align = new SeparateTitle$Align("START", 0);
        START = separateTitle$Align;
        SeparateTitle$Align separateTitle$Align2 = new SeparateTitle$Align("CENTER", 1);
        CENTER = separateTitle$Align2;
        SeparateTitle$Align separateTitle$Align3 = new SeparateTitle$Align("END", 2);
        END = separateTitle$Align3;
        SeparateTitle$Align[] separateTitle$AlignArr = {separateTitle$Align, separateTitle$Align2, separateTitle$Align3};
        $VALUES = separateTitle$AlignArr;
        $ENTRIES = a.a(separateTitle$AlignArr);
    }

    public static SeparateTitle$Align valueOf(String str) {
        return (SeparateTitle$Align) Enum.valueOf(SeparateTitle$Align.class, str);
    }

    public static SeparateTitle$Align[] values() {
        return (SeparateTitle$Align[]) $VALUES.clone();
    }
}
