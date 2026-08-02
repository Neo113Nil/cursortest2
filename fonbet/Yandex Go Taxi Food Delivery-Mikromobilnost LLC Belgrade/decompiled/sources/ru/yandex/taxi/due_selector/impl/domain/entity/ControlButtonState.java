package ru.yandex.taxi.due_selector.impl.domain.entity;

import defpackage.k4o;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/due_selector/impl/domain/entity/ControlButtonState;", "", "", "textColor", CA20Status.STATUS_USER_I, "b", "()I", "bgColor", "a", "", "isEnabled", "Z", "f", "()Z", "isAccent", "c", "ERROR", "LOADING", "ACTIVE_MAIN", "ACTIVE_MINOR", "INVALID_MAIN", "INVALID_MINOR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ControlButtonState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ControlButtonState[] $VALUES;
    public static final ControlButtonState ACTIVE_MAIN;
    public static final ControlButtonState ACTIVE_MINOR;
    public static final ControlButtonState ERROR;
    public static final ControlButtonState INVALID_MAIN;
    public static final ControlButtonState INVALID_MINOR;
    public static final ControlButtonState LOADING;
    private final int bgColor;
    private final boolean isAccent;
    private final boolean isEnabled;
    private final int textColor;

    static {
        int i = xng0.textOnControlMinor;
        int i2 = xng0.controlMinor;
        ControlButtonState controlButtonState = new ControlButtonState("ERROR", 0, i, i2, true, false);
        ERROR = controlButtonState;
        int i3 = xng0.textOnControl;
        int i4 = xng0.controlMain;
        ControlButtonState controlButtonState2 = new ControlButtonState("LOADING", 1, i3, i4, false, false);
        LOADING = controlButtonState2;
        ControlButtonState controlButtonState3 = new ControlButtonState("ACTIVE_MAIN", 2, i3, i4, true, true);
        ACTIVE_MAIN = controlButtonState3;
        ControlButtonState controlButtonState4 = new ControlButtonState("ACTIVE_MINOR", 3, i, i2, true, false);
        ACTIVE_MINOR = controlButtonState4;
        ControlButtonState controlButtonState5 = new ControlButtonState("INVALID_MAIN", 4, i3, i4, false, false);
        INVALID_MAIN = controlButtonState5;
        ControlButtonState controlButtonState6 = new ControlButtonState("INVALID_MINOR", 5, i, i2, false, false);
        INVALID_MINOR = controlButtonState6;
        ControlButtonState[] controlButtonStateArr = {controlButtonState, controlButtonState2, controlButtonState3, controlButtonState4, controlButtonState5, controlButtonState6};
        $VALUES = controlButtonStateArr;
        $ENTRIES = a.a(controlButtonStateArr);
    }

    public ControlButtonState(String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.textColor = i2;
        this.bgColor = i3;
        this.isEnabled = z;
        this.isAccent = z2;
    }

    public static ControlButtonState valueOf(String str) {
        return (ControlButtonState) Enum.valueOf(ControlButtonState.class, str);
    }

    public static ControlButtonState[] values() {
        return (ControlButtonState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getBgColor() {
        return this.bgColor;
    }

    /* renamed from: b, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsAccent() {
        return this.isAccent;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }
}
