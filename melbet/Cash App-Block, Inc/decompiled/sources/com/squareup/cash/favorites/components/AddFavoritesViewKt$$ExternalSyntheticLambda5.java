package com.squareup.cash.favorites.components;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.Strings;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class AddFavoritesViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Region f$2;

    public /* synthetic */ AddFavoritesViewKt$$ExternalSyntheticLambda5(Modifier modifier, Region region, String str, int i) {
        this.f$0 = modifier;
        this.f$2 = region;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Painter painterResource;
        int i = this.$r8$classId;
        String str = this.f$1;
        Region region = this.f$2;
        Modifier modifier = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(horizontal);
                    boolean z = Strings.getColors(gapComposer).isLight;
                    if (z) {
                        gapComposer.startReplaceGroup(160838541);
                        painterResource = Countries.painterResource(R.drawable.arcade_telescope_light, 0, gapComposer);
                        gapComposer.end(false);
                    } else {
                        if (z) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 160836503, false);
                        }
                        gapComposer.startReplaceGroup(160842412);
                        painterResource = Countries.painterResource(R.drawable.arcade_telescope_dark, 0, gapComposer);
                        gapComposer.end(false);
                    }
                    ImageKt.Image(painterResource, null, horizontalAlignElement, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, 120);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.empty_view_title), (Map) null, (Function1) null, false);
                    if (str == null) {
                        gapComposer.startReplaceGroup(160857677);
                        str = new MessageFormat(Room.stringResource(gapComposer, R.string.empty_view_message)).format(zzel$EnumUnboxingLocalUtility.m(1, "cashtag_symbol", Moneys.symbol(Cashtags.guessCashtagCurrency(region))));
                        str.getClass();
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(160856902);
                        gapComposer.end(false);
                    }
                    Room.m1164Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, new AnnotatedString(str), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.NoResults(modifier, region, str, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AddFavoritesViewKt$$ExternalSyntheticLambda5(Modifier modifier, String str, Region region) {
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = region;
    }
}
