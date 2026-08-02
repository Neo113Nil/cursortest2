package com.squareup.cash.banking.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.protos.franklin.common.BalanceData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BalanceHomeViewEvent {

    public final class BankingDetailsClicked implements BalanceHomeViewEvent {
        public final BalanceData.Button button;

        public BankingDetailsClicked(BalanceData.Button button) {
            button.getClass();
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BankingDetailsClicked) && Intrinsics.areEqual(this.button, ((BankingDetailsClicked) obj).button);
        }

        public final int hashCode() {
            return this.button.hashCode();
        }

        public final String toString() {
            return "BankingDetailsClicked(button=" + this.button + ")";
        }
    }

    public final class CallToActionClicked implements BalanceHomeViewEvent {
        public final String route;

        public CallToActionClicked(String str) {
            str.getClass();
            this.route = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallToActionClicked) && Intrinsics.areEqual(this.route, ((CallToActionClicked) obj).route);
        }

        public final int hashCode() {
            return this.route.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CallToActionClicked(route=", this.route, ")");
        }
    }

    public final class Close implements BalanceHomeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -119845527;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CopyNumber implements BalanceHomeViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final Type f1051type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type ACCOUNT;
            public static final Type ROUTING;

            static {
                Type type2 = new Type("ROUTING", 0);
                ROUTING = type2;
                Type type3 = new Type("ACCOUNT", 1);
                ACCOUNT = type3;
                $VALUES = new Type[]{type2, type3};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public CopyNumber(Type type2) {
            this.f1051type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CopyNumber) && this.f1051type == ((CopyNumber) obj).f1051type;
        }

        public final int hashCode() {
            return this.f1051type.hashCode();
        }

        public final String toString() {
            return "CopyNumber(type=" + this.f1051type + ")";
        }
    }

    public final class DisclosureUrlClicked implements BalanceHomeViewEvent {
        public final String url;

        public DisclosureUrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureUrlClicked) && Intrinsics.areEqual(this.url, ((DisclosureUrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureUrlClicked(url=", this.url, ")");
        }
    }

    public final class Help implements BalanceHomeViewEvent {
        public static final Help INSTANCE = new Help();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Help);
        }

        public final int hashCode() {
            return -3723856;
        }

        public final String toString() {
            return "Help";
        }
    }

    public final class OverdraftClicked implements BalanceHomeViewEvent {
        public static final OverdraftClicked INSTANCE = new OverdraftClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OverdraftClicked);
        }

        public final int hashCode() {
            return -52128247;
        }

        public final String toString() {
            return "OverdraftClicked";
        }
    }

    public final class OverdraftManageClicked implements BalanceHomeViewEvent {
        public static final OverdraftManageClicked INSTANCE = new OverdraftManageClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OverdraftManageClicked);
        }

        public final int hashCode() {
            return 479671140;
        }

        public final String toString() {
            return "OverdraftManageClicked";
        }
    }

    public final class OverdraftUpsellClicked implements BalanceHomeViewEvent {
        public static final OverdraftUpsellClicked INSTANCE = new OverdraftUpsellClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OverdraftUpsellClicked);
        }

        public final int hashCode() {
            return 2050211676;
        }

        public final String toString() {
            return "OverdraftUpsellClicked";
        }
    }

    public final class RestrictedBalanceClicked implements BalanceHomeViewEvent {
        public static final RestrictedBalanceClicked INSTANCE = new RestrictedBalanceClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RestrictedBalanceClicked);
        }

        public final int hashCode() {
            return -367529003;
        }

        public final String toString() {
            return "RestrictedBalanceClicked";
        }
    }

    public final class SetupDirectDeposit implements BalanceHomeViewEvent {
        public static final SetupDirectDeposit INSTANCE = new SetupDirectDeposit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetupDirectDeposit);
        }

        public final int hashCode() {
            return 453845799;
        }

        public final String toString() {
            return "SetupDirectDeposit";
        }
    }
}
