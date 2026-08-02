package androidx.navigation;

import androidx.navigation.NavOptions;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.treehouse.appmetadata.AppMetadata;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class NavOptionsBuilderKt {
    public static List getAll() {
        return AppMetadata.all;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBenefitsBooklet.deepLinkSpecs;
    }

    public static final NavOptions navOptions(Function1 function1) {
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        function1.invoke(navOptionsBuilder);
        boolean z = navOptionsBuilder.launchSingleTop;
        NavOptions.Builder builder = navOptionsBuilder.builder;
        builder.singleTop = z;
        builder.restoreState = false;
        String str = navOptionsBuilder.popUpToRoute;
        if (str != null) {
            boolean z2 = navOptionsBuilder.inclusive;
            boolean z3 = navOptionsBuilder.saveState;
            builder.popUpToRoute = str;
            builder.popUpToId = -1;
            builder.popUpToInclusive = z2;
            builder.popUpToSaveState = z3;
        } else {
            int i = navOptionsBuilder.popUpToId;
            boolean z4 = navOptionsBuilder.inclusive;
            boolean z5 = navOptionsBuilder.saveState;
            builder.popUpToId = i;
            builder.popUpToRoute = null;
            builder.popUpToInclusive = z4;
            builder.popUpToSaveState = z5;
        }
        return builder.build();
    }
}
