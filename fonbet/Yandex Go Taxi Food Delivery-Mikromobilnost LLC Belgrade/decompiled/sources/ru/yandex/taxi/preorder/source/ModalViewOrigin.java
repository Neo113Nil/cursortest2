package ru.yandex.taxi.preorder.source;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/preorder/source/ModalViewOrigin;", "", "HOME", "SUPERAPP_MAIN", "SUMMARY", "ON_ORDER", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModalViewOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalViewOrigin[] $VALUES;
    public static final ModalViewOrigin HOME;
    public static final ModalViewOrigin ON_ORDER;
    public static final ModalViewOrigin SUMMARY;
    public static final ModalViewOrigin SUPERAPP_MAIN;

    static {
        ModalViewOrigin modalViewOrigin = new ModalViewOrigin("HOME", 0);
        HOME = modalViewOrigin;
        ModalViewOrigin modalViewOrigin2 = new ModalViewOrigin("SUPERAPP_MAIN", 1);
        SUPERAPP_MAIN = modalViewOrigin2;
        ModalViewOrigin modalViewOrigin3 = new ModalViewOrigin("SUMMARY", 2);
        SUMMARY = modalViewOrigin3;
        ModalViewOrigin modalViewOrigin4 = new ModalViewOrigin("ON_ORDER", 3);
        ON_ORDER = modalViewOrigin4;
        ModalViewOrigin[] modalViewOriginArr = {modalViewOrigin, modalViewOrigin2, modalViewOrigin3, modalViewOrigin4};
        $VALUES = modalViewOriginArr;
        $ENTRIES = kotlin.enums.a.a(modalViewOriginArr);
    }

    public static ModalViewOrigin valueOf(String str) {
        return (ModalViewOrigin) Enum.valueOf(ModalViewOrigin.class, str);
    }

    public static ModalViewOrigin[] values() {
        return (ModalViewOrigin[]) $VALUES.clone();
    }
}
