package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportMainAnalytics$ModalState", "", "Lru/yandex/taxi/masstransit/analytic/TransportMainAnalytics$ModalState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Expanded", "Collapsed", "Default", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportMainAnalytics$ModalState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportMainAnalytics$ModalState[] $VALUES;
    public static final TransportMainAnalytics$ModalState Collapsed;
    public static final TransportMainAnalytics$ModalState Default;
    public static final TransportMainAnalytics$ModalState Expanded;
    private final String eventValue;

    static {
        TransportMainAnalytics$ModalState transportMainAnalytics$ModalState = new TransportMainAnalytics$ModalState("Expanded", 0, "expanded");
        Expanded = transportMainAnalytics$ModalState;
        TransportMainAnalytics$ModalState transportMainAnalytics$ModalState2 = new TransportMainAnalytics$ModalState("Collapsed", 1, "collapsed");
        Collapsed = transportMainAnalytics$ModalState2;
        TransportMainAnalytics$ModalState transportMainAnalytics$ModalState3 = new TransportMainAnalytics$ModalState("Default", 2, "default");
        Default = transportMainAnalytics$ModalState3;
        TransportMainAnalytics$ModalState[] transportMainAnalytics$ModalStateArr = {transportMainAnalytics$ModalState, transportMainAnalytics$ModalState2, transportMainAnalytics$ModalState3};
        $VALUES = transportMainAnalytics$ModalStateArr;
        $ENTRIES = a.a(transportMainAnalytics$ModalStateArr);
    }

    public TransportMainAnalytics$ModalState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportMainAnalytics$ModalState valueOf(String str) {
        return (TransportMainAnalytics$ModalState) Enum.valueOf(TransportMainAnalytics$ModalState.class, str);
    }

    public static TransportMainAnalytics$ModalState[] values() {
        return (TransportMainAnalytics$ModalState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
