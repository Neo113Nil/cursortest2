package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.cdf.crypto.CryptoStackStart;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ScaleKt {
    public static final ArrayList getFeatureNames(FeatureError featureError) {
        featureError.getClass();
        Set features = featureError.getFeatures();
        ArrayList arrayList = new ArrayList();
        Iterator it = features.iterator();
        while (it.hasNext()) {
            arrayList.add(((ErrorFeature) it.next()).getName());
        }
        return arrayList;
    }

    public static final Modifier scale(Modifier modifier, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? modifier : ColorKt.m687graphicsLayer_6ThJ44$default(modifier, f, f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 524284);
    }

    public static final void trackStackingToolStartEvent(Analytics analytics, BitcoinStackingToolsInfoScreen.Type type2, CryptoStackStart.EntryPoint entryPoint, Boolean bool) {
        CryptoStackStart.StackingContentType stackingContentType;
        analytics.getClass();
        entryPoint.getClass();
        int ordinal = type2.ordinal();
        if (ordinal == 0) {
            stackingContentType = CryptoStackStart.StackingContentType.ROUND_UPS;
        } else if (ordinal == 1) {
            stackingContentType = CryptoStackStart.StackingContentType.PAID_IN_BITCOIN;
        } else if (ordinal == 2) {
            stackingContentType = CryptoStackStart.StackingContentType.AUTO_INVEST;
        } else if (ordinal == 3) {
            stackingContentType = CryptoStackStart.StackingContentType.LEARN_MORE;
        } else {
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            stackingContentType = CryptoStackStart.StackingContentType.RECEIVE_P2P_AS_BTC;
        }
        analytics.track(new CryptoStackStart(stackingContentType, entryPoint, bool), null);
    }
}
