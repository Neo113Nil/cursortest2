package app.cash.local.views.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalViewsKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalImage f$0;

    public /* synthetic */ LocalViewsKt$$ExternalSyntheticLambda2(LocalImage localImage) {
        this.$r8$classId = 2;
        this.f$0 = localImage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Color m;
        long j;
        int i = this.$r8$classId;
        LocalImage localImage = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                LocalViewsKt.preload(localImage, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.ComboSlotOptionImage(localImage, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), 40.0f, 48.0f);
                    LocalColor localColor = localImage.placeholder_color;
                    if (localColor == null) {
                        gapComposer.startReplaceGroup(-1973094808);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        gapComposer.startReplaceGroup(629088441);
                        m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
                    }
                    if (m == null) {
                        gapComposer.startReplaceGroup(629091023);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.background.subtle;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(629087737);
                        gapComposer.end(false);
                        j = m.value;
                    }
                    Modifier m2 = Request$Priority$EnumUnboxingLocalUtility.m(12.0f, m287sizeVpY3zN4, j, 6.0f);
                    Float ratio = LocalViewsKt.getRatio(localImage);
                    if (ratio != null) {
                        modifier = OffsetKt.aspectRatio(ratio.floatValue(), modifier, false);
                    }
                    LocalMapKt.LocalAsyncImage(m2, modifier, LocalViewsKt.getThemedUrl(localImage, gapComposer), ContentScale.Companion.Fit, Alignment.Companion.Center, null, null, gapComposer, 27648, 96);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                LocalBrandLocationCartViewKt.SelectionImage(localImage, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                LocalViewsKt.preload(localImage, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalViewsKt$$ExternalSyntheticLambda2(LocalImage localImage, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = localImage;
    }
}
