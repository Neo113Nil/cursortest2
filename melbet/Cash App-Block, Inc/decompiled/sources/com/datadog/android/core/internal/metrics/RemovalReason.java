package com.datadog.android.core.internal.metrics;

import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class RemovalReason {

    /* loaded from: classes4.dex */
    public final class IntakeCode extends RemovalReason {
        public final int responseCode;

        public IntakeCode(int i) {
            this.responseCode = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntakeCode) && this.responseCode == ((IntakeCode) obj).responseCode;
        }

        public final int hashCode() {
            return Integer.hashCode(this.responseCode);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.responseCode, "intake-code-");
        }
    }

    /* loaded from: classes4.dex */
    public final class Purged extends RemovalReason {
        public final /* synthetic */ int $r8$classId;
        public static final Purged INSTANCE$1 = new Purged(1);
        public static final Purged INSTANCE$2 = new Purged(2);
        public static final Purged INSTANCE = new Purged(0);

        public /* synthetic */ Purged(int i) {
            this.$r8$classId = i;
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "purged";
                case 1:
                    return "invalid";
                default:
                    return "obsolete";
            }
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalBrandProfile.deepLinkSpecs;
    }
}
