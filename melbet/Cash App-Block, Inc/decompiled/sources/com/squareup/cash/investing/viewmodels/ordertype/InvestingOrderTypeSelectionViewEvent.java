package com.squareup.cash.investing.viewmodels.ordertype;

/* loaded from: classes6.dex */
public abstract class InvestingOrderTypeSelectionViewEvent {

    public final class CloseClick extends InvestingOrderTypeSelectionViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 1293362248;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class HelpClick extends InvestingOrderTypeSelectionViewEvent {
        public static final HelpClick INSTANCE = new HelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClick);
        }

        public final int hashCode() {
            return 1380358639;
        }

        public final String toString() {
            return "HelpClick";
        }
    }

    public final class OrderTypeClick extends InvestingOrderTypeSelectionViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final Type f1165type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type AUTO_INVEST;
            public static final Type CUSTOM_ORDER;

            static {
                Type type2 = new Type("AUTO_INVEST", 0);
                AUTO_INVEST = type2;
                Type type3 = new Type("CUSTOM_ORDER", 1);
                CUSTOM_ORDER = type3;
                $VALUES = new Type[]{type2, type3};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public OrderTypeClick(Type type2) {
            this.f1165type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderTypeClick) && this.f1165type == ((OrderTypeClick) obj).f1165type;
        }

        public final int hashCode() {
            return this.f1165type.hashCode();
        }

        public final String toString() {
            return "OrderTypeClick(type=" + this.f1165type + ")";
        }
    }
}
