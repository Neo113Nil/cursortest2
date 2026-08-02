package ru.yandex.taxi.widget.modalview;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/widget/modalview/ModalViewCoordinator$StackChangeType", "", "Lru/yandex/taxi/widget/modalview/ModalViewCoordinator$StackChangeType;", "", "isStackIncreased", "Z", "b", "()Z", "PUSH", "POLL", "CLEAN", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ModalViewCoordinator$StackChangeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalViewCoordinator$StackChangeType[] $VALUES;
    public static final ModalViewCoordinator$StackChangeType CLEAN;
    public static final ModalViewCoordinator$StackChangeType POLL;
    public static final ModalViewCoordinator$StackChangeType PUSH;
    private final boolean isStackIncreased;

    static {
        ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType = new ModalViewCoordinator$StackChangeType("PUSH", 0, true);
        PUSH = modalViewCoordinator$StackChangeType;
        ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType2 = new ModalViewCoordinator$StackChangeType("POLL", 1, false);
        POLL = modalViewCoordinator$StackChangeType2;
        ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType3 = new ModalViewCoordinator$StackChangeType("CLEAN", 2, false);
        CLEAN = modalViewCoordinator$StackChangeType3;
        ModalViewCoordinator$StackChangeType[] modalViewCoordinator$StackChangeTypeArr = {modalViewCoordinator$StackChangeType, modalViewCoordinator$StackChangeType2, modalViewCoordinator$StackChangeType3};
        $VALUES = modalViewCoordinator$StackChangeTypeArr;
        $ENTRIES = kotlin.enums.a.a(modalViewCoordinator$StackChangeTypeArr);
    }

    public ModalViewCoordinator$StackChangeType(String str, int i, boolean z) {
        this.isStackIncreased = z;
    }

    public static ModalViewCoordinator$StackChangeType valueOf(String str) {
        return (ModalViewCoordinator$StackChangeType) Enum.valueOf(ModalViewCoordinator$StackChangeType.class, str);
    }

    public static ModalViewCoordinator$StackChangeType[] values() {
        return (ModalViewCoordinator$StackChangeType[]) $VALUES.clone();
    }

    public final boolean a() {
        return !this.isStackIncreased;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsStackIncreased() {
        return this.isStackIncreased;
    }
}
