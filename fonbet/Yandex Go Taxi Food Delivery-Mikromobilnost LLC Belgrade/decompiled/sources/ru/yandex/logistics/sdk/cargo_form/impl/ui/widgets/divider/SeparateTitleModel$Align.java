package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/ui/widgets/divider/SeparateTitleModel$Align", "", "Lru/yandex/logistics/sdk/cargo_form/impl/ui/widgets/divider/SeparateTitleModel$Align;", "START", "CENTER", "END", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SeparateTitleModel$Align {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SeparateTitleModel$Align[] $VALUES;
    public static final SeparateTitleModel$Align CENTER;
    public static final SeparateTitleModel$Align END;
    public static final SeparateTitleModel$Align START;

    static {
        SeparateTitleModel$Align separateTitleModel$Align = new SeparateTitleModel$Align("START", 0);
        START = separateTitleModel$Align;
        SeparateTitleModel$Align separateTitleModel$Align2 = new SeparateTitleModel$Align("CENTER", 1);
        CENTER = separateTitleModel$Align2;
        SeparateTitleModel$Align separateTitleModel$Align3 = new SeparateTitleModel$Align("END", 2);
        END = separateTitleModel$Align3;
        SeparateTitleModel$Align[] separateTitleModel$AlignArr = {separateTitleModel$Align, separateTitleModel$Align2, separateTitleModel$Align3};
        $VALUES = separateTitleModel$AlignArr;
        $ENTRIES = kotlin.enums.a.a(separateTitleModel$AlignArr);
    }

    public static SeparateTitleModel$Align valueOf(String str) {
        return (SeparateTitleModel$Align) Enum.valueOf(SeparateTitleModel$Align.class, str);
    }

    public static SeparateTitleModel$Align[] values() {
        return (SeparateTitleModel$Align[]) $VALUES.clone();
    }
}
