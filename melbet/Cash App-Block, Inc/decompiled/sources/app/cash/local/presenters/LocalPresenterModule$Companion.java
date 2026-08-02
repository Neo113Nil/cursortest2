package app.cash.local.presenters;

import android.app.Activity;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.protos.wire.roster.mds.Name;
import com.squareup.protos.wire.roster.mds.Names;
import com.squareup.protos.wire.roster.mds.Unit;
import java.util.LinkedHashSet;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class LocalPresenterModule$Companion {
    public static final boolean access$matchesLocationFilter(String str, LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return true;
        }
        return str != null && linkedHashSet.contains(str);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCardMerchantInfoFeedback.deepLinkSpecs;
    }

    public static final String getDisplayName(Location location) {
        Names names;
        Name name;
        String str;
        String str2;
        Unit protoModel = location.getProtoModel();
        if (protoModel != null && (str2 = protoModel.nickname) != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        Unit protoModel2 = location.getProtoModel();
        if (protoModel2 == null || (names = protoModel2.name) == null || (name = names.primary) == null || (str = name.value) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static ExoPlayerImplInternal$$ExternalSyntheticLambda2 provideInAppPaymentLauncher(Activity activity) {
        return new ExoPlayerImplInternal$$ExternalSyntheticLambda2(activity, 15);
    }

    public static LocalPresenterModule$Companion$$ExternalSyntheticLambda0 providesCardEntryActivityResultHandler() {
        return new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(0);
    }
}
