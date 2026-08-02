package app.cash.local.db;

import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SelectHowItWorks {
    public final GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks how_it_works;

    public SelectHowItWorks(GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks) {
        this.how_it_works = howItWorks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectHowItWorks) && Intrinsics.areEqual(this.how_it_works, ((SelectHowItWorks) obj).how_it_works);
    }

    public final int hashCode() {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = this.how_it_works;
        if (howItWorks == null) {
            return 0;
        }
        return howItWorks.hashCode();
    }

    public final String toString() {
        return "SelectHowItWorks(how_it_works=" + this.how_it_works + ")";
    }
}
