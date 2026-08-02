package app.cash.local.backend.real;

import app.cash.local.backend.real.CalculateLineItemsManager;
import app.cash.local.primitives.FulfillmentConfiguration;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import java.util.List;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class CalculateLineItemsManager$observeMutations$3 extends AdaptedFunctionReference implements Function5 {
    public static final CalculateLineItemsManager$observeMutations$3 INSTANCE = new CalculateLineItemsManager$observeMutations$3(5, CalculateLineItemsManager.Combination.class, "<init>", "<init>(Lcom/squareup/cash/featureflags/FeatureFlag$EnabledDisabledFeatureFlag$Options;Ljava/util/List;Ljava/util/List;Lapp/cash/local/primitives/FulfillmentConfiguration;)V", 4);

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = CalculateLineItemsManager.$r8$clinit;
        return new CalculateLineItemsManager.Combination((FeatureFlag$EnabledDisabledFeatureFlag$Options) obj, (List) obj2, (List) obj3, (FulfillmentConfiguration) obj4);
    }
}
