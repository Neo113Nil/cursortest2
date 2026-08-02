package com.squareup.cash.savings.backend.api.model;

import com.squareup.cash.savings.backend.api.model.SavingsAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsApplet {
    public final SavingsAction action;
    public final CustomerActiveState activeState;
    public final String subtitle;
    public final String title;
    public final boolean visible;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class CustomerActiveState {
        public static final /* synthetic */ CustomerActiveState[] $VALUES;
        public static final CustomerActiveState ADOPTED;
        public static final CustomerActiveState UNADOPTED;
        public static final CustomerActiveState UNSPECIFIED;

        static {
            CustomerActiveState customerActiveState = new CustomerActiveState("UNSPECIFIED", 0);
            UNSPECIFIED = customerActiveState;
            CustomerActiveState customerActiveState2 = new CustomerActiveState("ADOPTED", 1);
            ADOPTED = customerActiveState2;
            CustomerActiveState customerActiveState3 = new CustomerActiveState("UNADOPTED", 2);
            UNADOPTED = customerActiveState3;
            $VALUES = new CustomerActiveState[]{customerActiveState, customerActiveState2, customerActiveState3};
        }

        public static CustomerActiveState valueOf(String str) {
            return (CustomerActiveState) Enum.valueOf(CustomerActiveState.class, str);
        }

        public static CustomerActiveState[] values() {
            return (CustomerActiveState[]) $VALUES.clone();
        }
    }

    public SavingsApplet(boolean z, CustomerActiveState customerActiveState, SavingsAction.ClientRoute clientRoute, String str, String str2) {
        this.visible = z;
        this.activeState = customerActiveState;
        this.action = clientRoute;
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsApplet)) {
            return false;
        }
        SavingsApplet savingsApplet = (SavingsApplet) obj;
        return this.visible == savingsApplet.visible && this.activeState == savingsApplet.activeState && Intrinsics.areEqual(this.action, savingsApplet.action) && this.title.equals(savingsApplet.title) && this.subtitle.equals(savingsApplet.subtitle);
    }

    public final int hashCode() {
        int hashCode = (this.activeState.hashCode() + (Boolean.hashCode(this.visible) * 31)) * 31;
        SavingsAction savingsAction = this.action;
        return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (savingsAction == null ? 0 : savingsAction.hashCode())) * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingsApplet(visible=");
        sb.append(this.visible);
        sb.append(", activeState=");
        sb.append(this.activeState);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ")");
    }
}
