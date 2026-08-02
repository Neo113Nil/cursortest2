package defpackage;

import com.yandex.plus.core.graphql.type.ActionType;
import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class y6e0 {
    public final ActionType a;
    public final boolean b;
    public final SubscriptionButtonType c;
    public final SubscriptionPaymentMethod d;
    public final ArrayList e;
    public final SubscriptionWidgetType f;
    public final x6e0 g;

    public y6e0(ActionType actionType, boolean z, SubscriptionButtonType subscriptionButtonType, SubscriptionPaymentMethod subscriptionPaymentMethod, ArrayList arrayList, SubscriptionWidgetType subscriptionWidgetType, x6e0 x6e0Var) {
        this.a = actionType;
        this.b = z;
        this.c = subscriptionButtonType;
        this.d = subscriptionPaymentMethod;
        this.e = arrayList;
        this.f = subscriptionWidgetType;
        this.g = x6e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6e0)) {
            return false;
        }
        y6e0 y6e0Var = (y6e0) obj;
        return this.a == y6e0Var.a && this.b == y6e0Var.b && this.c == y6e0Var.c && this.d == y6e0Var.d && this.e.equals(y6e0Var.e) && this.f == y6e0Var.f && jl40.l(this.g, y6e0Var.g);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        SubscriptionButtonType subscriptionButtonType = this.c;
        int hashCode = (e + (subscriptionButtonType == null ? 0 : subscriptionButtonType.hashCode())) * 31;
        SubscriptionPaymentMethod subscriptionPaymentMethod = this.d;
        int b = ly3.b((hashCode + (subscriptionPaymentMethod == null ? 0 : subscriptionPaymentMethod.hashCode())) * 31, 31, this.e);
        SubscriptionWidgetType subscriptionWidgetType = this.f;
        int hashCode2 = (b + (subscriptionWidgetType == null ? 0 : subscriptionWidgetType.hashCode())) * 31;
        x6e0 x6e0Var = this.g;
        return hashCode2 + (x6e0Var != null ? x6e0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Action(actionType=" + this.a + ", silent=" + this.b + ", subscriptionButtonType=" + this.c + ", subscriptionPaymentMethod=" + this.d + ", subscriptionProductFeatures=" + this.e + ", subscriptionWidgetType=" + this.f + ", acquisitionPlatformSubscriptionProperties=" + this.g + ')';
    }
}
