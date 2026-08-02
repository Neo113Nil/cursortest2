package com.squareup.cash.investing.components;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeBordersKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ ArcadeBordersKt$$ExternalSyntheticLambda0(int i, boolean z, boolean z2) {
        this.$r8$classId = 1;
        this.f$1 = z;
        this.f$2 = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = this.f$2;
        boolean z2 = this.f$1;
        int i2 = 2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1911031550, new ArcadeBordersKt$$ExternalSyntheticLambda0(z2, z, i2, r6 ? (byte) 1 : (byte) 0), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.OptionalOrRequiredText(z2, z, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    final long j = colors.semantic.border.subtle;
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj3 = DefaultSizes.border.annotationsMap;
                    final float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(1.0f, gapComposer2);
                    final float f = m3477toPx8Feqmps / 2.0f;
                    final float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(16.0f, gapComposer2) - f;
                    final boolean z3 = this.f$1;
                    boolean changed = gapComposer2.changed(z3) | gapComposer2.changed(f) | gapComposer2.changed(m3477toPx8Feqmps2);
                    final boolean z4 = this.f$2;
                    boolean changed2 = gapComposer2.changed(z4) | changed | gapComposer2.changed(j) | gapComposer2.changed(m3477toPx8Feqmps);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue == Composer.Companion.Empty) {
                        Function1 function1 = new Function1() { // from class: com.squareup.cash.investing.components.ArcadeBordersKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                DrawScope drawScope = (DrawScope) obj4;
                                drawScope.getClass();
                                AndroidPath Path = AndroidPath_androidKt.Path();
                                boolean z5 = z3;
                                float f2 = f;
                                float f3 = m3477toPx8Feqmps2;
                                if (z5) {
                                    Path.moveTo(f2, f2 + f3);
                                    Path.arcTo(DBUtil.m1179Rect3MmeM6k((Float.floatToRawIntBits(r11) << 32) | (Float.floatToRawIntBits(r11) & BodyPartID.bodyIdMax), f3), 180.0f, 90.0f);
                                    Path.lineTo((Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2) - f3, f2);
                                    Path.arcTo(DBUtil.m1179Rect3MmeM6k((Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2) - f3) << 32) | (Float.floatToRawIntBits(r11) & BodyPartID.bodyIdMax), f3), 270.0f, 90.0f);
                                }
                                float f4 = RecyclerView.DECELERATION_RATE;
                                Path.moveTo(f2, z5 ? f2 + f3 : 0.0f);
                                float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                boolean z6 = z4;
                                Path.lineTo(f2, intBitsToFloat - (z6 ? f2 + f3 : 0.0f));
                                Path.moveTo(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2, z5 ? f2 + f3 : 0.0f);
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2;
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                if (z6) {
                                    f4 = f2 + f3;
                                }
                                Path.lineTo(intBitsToFloat2, intBitsToFloat3 - f4);
                                if (z6) {
                                    Path.moveTo(f2, (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f2) - f3);
                                    Path.arcTo(DBUtil.m1179Rect3MmeM6k((Float.floatToRawIntBits(f2 + f3) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f2) - f3) & BodyPartID.bodyIdMax), f3), 180.0f, -90.0f);
                                    Path.lineTo((Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2) - f3, Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f2);
                                    Path.arcTo(DBUtil.m1179Rect3MmeM6k((Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2) - f3) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f2) - f3)), f3), 90.0f, -90.0f);
                                }
                                DrawScope.m745drawPathLG529CI$default(drawScope, Path, j, RecyclerView.DECELERATION_RATE, new Stroke(m3477toPx8Feqmps, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 52);
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(function1);
                        rememberedValue = function1;
                    }
                    CanvasKt.Canvas(6, gapComposer2, Modifier.Companion.$$INSTANCE, (Function1) rememberedValue);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, z2 ? R.string.pools_more_options_manage_people_subtitle : z ? R.string.pools_more_options_view_people_closed_subtitle : R.string.pools_more_options_view_people_subtitle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, z2 ? z ? R.string.pools_more_options_close_pool_with_balance_subtitle : R.string.pools_more_options_close_pool_subtitle : R.string.pools_more_options_leave_pool_subtitle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeBordersKt$$ExternalSyntheticLambda0(boolean z, boolean z2, int i, byte b) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$2 = z2;
    }
}
