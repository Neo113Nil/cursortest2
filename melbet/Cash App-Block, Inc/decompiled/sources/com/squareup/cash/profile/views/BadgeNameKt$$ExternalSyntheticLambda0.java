package com.squareup.cash.profile.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.data.profile.Badge;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class BadgeNameKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Badge f$1;

    public /* synthetic */ BadgeNameKt$$ExternalSyntheticLambda0(Badge badge, int i) {
        this.$r8$classId = i;
        this.f$1 = badge;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Icons icons;
        long j;
        Icons icons2;
        long j2;
        int i = this.$r8$classId;
        int i2 = R.string.verified_badge;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Badge badge = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    badge.getClass();
                    int ordinal = badge.ordinal();
                    if (ordinal == 0) {
                        icons = Icons.AccountVerified24;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        icons = Icons.Business24;
                    }
                    Icons icons3 = icons;
                    int ordinal2 = badge.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i2 = R.string.business_badge;
                    }
                    String stringResource = Room.stringResource(gapComposer, i2);
                    int ordinal3 = badge.ordinal();
                    if (ordinal3 == 0) {
                        gapComposer.startReplaceGroup(-1828618930);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.icon.info;
                        gapComposer.end(false);
                    } else {
                        if (ordinal3 != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1828620824, false);
                        }
                        gapComposer.startReplaceGroup(-1828617201);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors2.semantic.icon.brand;
                        gapComposer.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons3, stringResource, m302paddingqDBjuR0$default, j, gapComposer, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    int ordinal4 = badge.ordinal();
                    if (ordinal4 == 0) {
                        icons2 = Icons.AccountVerified24;
                    } else {
                        if (ordinal4 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        icons2 = Icons.Business24;
                    }
                    Icons icons4 = icons2;
                    int ordinal5 = badge.ordinal();
                    if (ordinal5 != 0) {
                        if (ordinal5 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i2 = R.string.business_badge;
                    }
                    String stringResource2 = Room.stringResource(gapComposer2, i2);
                    int ordinal6 = badge.ordinal();
                    if (ordinal6 == 0) {
                        gapComposer2.startReplaceGroup(-659387656);
                        Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j2 = colors3.semantic.icon.info;
                        gapComposer2.end(false);
                    } else {
                        if (ordinal6 != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -659389550, false);
                        }
                        gapComposer2.startReplaceGroup(-659385927);
                        Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j2 = colors4.semantic.icon.brand;
                        gapComposer2.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons4, stringResource2, m302paddingqDBjuR0$default2, j2, gapComposer2, 0, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
