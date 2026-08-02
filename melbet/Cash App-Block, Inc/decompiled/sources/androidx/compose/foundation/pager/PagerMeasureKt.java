package androidx.compose.foundation.pager;

import android.content.SharedPreferences;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.Room;
import coil3.size.DimensionKt;
import com.squareup.cash.banking.backend.real.BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$1;
import com.squareup.cash.banking.backend.real.BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$2;
import com.squareup.cash.banking.backend.real.BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$3;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.preferences.SharedPreferencesKeyValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PagerMeasureKt {
    public static final Color forThemeComposable(ColorModel colorModel, ThemeInfo themeInfo, Composer composer) {
        colorModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(84436421);
        Integer forTheme = DimensionKt.forTheme(colorModel, themeInfo);
        if (forTheme == null) {
            gapComposer.end(false);
            return null;
        }
        long Color = ColorKt.Color(forTheme.intValue());
        gapComposer.end(false);
        return new Color(Color);
    }

    /* renamed from: getAndMeasure-G5IdpRk, reason: not valid java name */
    public static final MeasuredPage m331getAndMeasureG5IdpRk(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, int i, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, BiasAlignment.Vertical vertical, LayoutDirection layoutDirection, int i2, MutableIntObjectMap mutableIntObjectMap) {
        List list;
        Object key = pagerLazyLayoutItemProvider.getKey(i);
        List list2 = (List) mutableIntObjectMap.get(i);
        if (list2 != null) {
            list = list2;
        } else {
            List compose = lazyLayoutMeasureScopeImpl.compose(i);
            int size = compose.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((Measurable) compose.get(i3)).mo833measureBRTryo0(j));
            }
            mutableIntObjectMap.set(i, arrayList);
            list = arrayList;
        }
        return new MeasuredPage(i, i2, list, j2, key, orientation, horizontal, vertical, layoutDirection);
    }

    public static SharedPreferencesKeyValue provideConfirmCashOutVersionCodeKeyValue(SharedPreferences sharedPreferences) {
        return Room.SerDeKeyValue$default(sharedPreferences, "confirm-cash-out-version-code-key", BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$1.INSTANCE, BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$2.INSTANCE, BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$3.INSTANCE, 96);
    }

    public static SharedPreferencesKeyValue provideRecurringDepositsHasSeenFirstTimeUserExperience(SharedPreferences sharedPreferences) {
        return Room.BooleanKeyValue(sharedPreferences, "recurring-deposits-has-seen-first-time-user-experience-key", false, false);
    }
}
