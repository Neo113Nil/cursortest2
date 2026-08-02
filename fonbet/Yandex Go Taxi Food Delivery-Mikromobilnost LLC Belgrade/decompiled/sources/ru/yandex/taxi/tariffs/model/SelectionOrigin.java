package ru.yandex.taxi.tariffs.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/tariffs/model/SelectionOrigin;", "", "Lru/yandex/taxi/tariffs/model/SelectionOrigin$Type;", "type", "Lru/yandex/taxi/tariffs/model/SelectionOrigin$Type;", "a", "()Lru/yandex/taxi/tariffs/model/SelectionOrigin$Type;", "Type", "PREORDER_CONTROLLER", "INVALIDATE", "FORCE_TARIFF_SWITCH_FOR_INTERCITY_ORDERS_EXPERIMENT", "FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD", "PERSONALSTATE", "SHORTCUT", "TRAP_ONLY_FALLBACK", "ACTION", "DEEPLINK", "REDIRECT", "DELIVERY_CANCEL", "UNSUPPORTED_REQUIREMENTS", "USER", "DUE_TIMETABLE", "MAIN", "PROMOTION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SelectionOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectionOrigin[] $VALUES;
    public static final SelectionOrigin ACTION;
    public static final SelectionOrigin DEEPLINK;
    public static final SelectionOrigin DELIVERY_CANCEL;
    public static final SelectionOrigin DUE_TIMETABLE;
    public static final SelectionOrigin FORCE_TARIFF_SWITCH_FOR_INTERCITY_ORDERS_EXPERIMENT;
    public static final SelectionOrigin FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD;
    public static final SelectionOrigin INVALIDATE;
    public static final SelectionOrigin MAIN;
    public static final SelectionOrigin PERSONALSTATE;
    public static final SelectionOrigin PREORDER_CONTROLLER;
    public static final SelectionOrigin PROMOTION;
    public static final SelectionOrigin REDIRECT;
    public static final SelectionOrigin SHORTCUT;
    public static final SelectionOrigin TRAP_ONLY_FALLBACK;
    public static final SelectionOrigin UNSUPPORTED_REQUIREMENTS;
    public static final SelectionOrigin USER;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/tariffs/model/SelectionOrigin$Type;", "", "USER", "SYSTEM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type SYSTEM;
        public static final Type USER;

        static {
            Type type = new Type("USER", 0);
            USER = type;
            Type type2 = new Type("SYSTEM", 1);
            SYSTEM = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        Type type = Type.SYSTEM;
        SelectionOrigin selectionOrigin = new SelectionOrigin("PREORDER_CONTROLLER", 0, type);
        PREORDER_CONTROLLER = selectionOrigin;
        SelectionOrigin selectionOrigin2 = new SelectionOrigin("INVALIDATE", 1, type);
        INVALIDATE = selectionOrigin2;
        SelectionOrigin selectionOrigin3 = new SelectionOrigin("FORCE_TARIFF_SWITCH_FOR_INTERCITY_ORDERS_EXPERIMENT", 2, type);
        FORCE_TARIFF_SWITCH_FOR_INTERCITY_ORDERS_EXPERIMENT = selectionOrigin3;
        SelectionOrigin selectionOrigin4 = new SelectionOrigin("FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD", 3, type);
        FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD = selectionOrigin4;
        SelectionOrigin selectionOrigin5 = new SelectionOrigin("PERSONALSTATE", 4, type);
        PERSONALSTATE = selectionOrigin5;
        SelectionOrigin selectionOrigin6 = new SelectionOrigin("SHORTCUT", 5, type);
        SHORTCUT = selectionOrigin6;
        SelectionOrigin selectionOrigin7 = new SelectionOrigin("TRAP_ONLY_FALLBACK", 6, type);
        TRAP_ONLY_FALLBACK = selectionOrigin7;
        Type type2 = Type.USER;
        SelectionOrigin selectionOrigin8 = new SelectionOrigin("ACTION", 7, type2);
        ACTION = selectionOrigin8;
        SelectionOrigin selectionOrigin9 = new SelectionOrigin("DEEPLINK", 8, type2);
        DEEPLINK = selectionOrigin9;
        SelectionOrigin selectionOrigin10 = new SelectionOrigin("REDIRECT", 9, type2);
        REDIRECT = selectionOrigin10;
        SelectionOrigin selectionOrigin11 = new SelectionOrigin("DELIVERY_CANCEL", 10, type2);
        DELIVERY_CANCEL = selectionOrigin11;
        SelectionOrigin selectionOrigin12 = new SelectionOrigin("UNSUPPORTED_REQUIREMENTS", 11, type2);
        UNSUPPORTED_REQUIREMENTS = selectionOrigin12;
        SelectionOrigin selectionOrigin13 = new SelectionOrigin("USER", 12, type2);
        USER = selectionOrigin13;
        SelectionOrigin selectionOrigin14 = new SelectionOrigin("DUE_TIMETABLE", 13, type2);
        DUE_TIMETABLE = selectionOrigin14;
        SelectionOrigin selectionOrigin15 = new SelectionOrigin("MAIN", 14, type);
        MAIN = selectionOrigin15;
        SelectionOrigin selectionOrigin16 = new SelectionOrigin("PROMOTION", 15, type2);
        PROMOTION = selectionOrigin16;
        SelectionOrigin[] selectionOriginArr = {selectionOrigin, selectionOrigin2, selectionOrigin3, selectionOrigin4, selectionOrigin5, selectionOrigin6, selectionOrigin7, selectionOrigin8, selectionOrigin9, selectionOrigin10, selectionOrigin11, selectionOrigin12, selectionOrigin13, selectionOrigin14, selectionOrigin15, selectionOrigin16};
        $VALUES = selectionOriginArr;
        $ENTRIES = kotlin.enums.a.a(selectionOriginArr);
    }

    public SelectionOrigin(String str, int i, Type type) {
        this.type = type;
    }

    public static SelectionOrigin valueOf(String str) {
        return (SelectionOrigin) Enum.valueOf(SelectionOrigin.class, str);
    }

    public static SelectionOrigin[] values() {
        return (SelectionOrigin[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
