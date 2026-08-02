package com.squareup.cash.maps.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MapMarkerPropertiesKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ MapMarkerPropertiesKt$$ExternalSyntheticLambda1(int i, int i2, long j) {
        this.$r8$classId = i2;
        this.f$0 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        long j = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                MapMarkerPropertiesKt.m3595MapMarkerAnchor9KIMszo(j, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, this.f$0, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_check_in_unlink), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.BankLinked16, (String) null, (Modifier) null, this.f$0, gapComposer2, 54, 4);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                LazyDslKt.m303BulletRPmYEkk(j, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 4:
                ((Integer) obj2).getClass();
                OnUndeliveredElementKt.m4201AccentCircleRPmYEkk(j, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 5:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ImageKt.Image(Countries.painterResource(R.drawable.contactless_symbol, 0, gapComposer3), "tap to pay", SizeKt.m285size3ABfNKs(companion, 88.0f), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 432, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_chevron_down, 0, gapComposer4), null, SizeKt.m277height3ABfNKs(companion, 24.0f), this.f$0, gapComposer4, Painter.$stable | 432, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MapMarkerPropertiesKt$$ExternalSyntheticLambda1(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }
}
