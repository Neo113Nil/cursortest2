package com.squareup.cash.arcade.treehouse;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.values.keypad.KeypadTextState;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes5.dex */
public final /* synthetic */ class NavBarBinding$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NavBarBinding$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int i = NavBarBinding.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 1:
                ((AvatarImage.State) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                ((AvatarImage.State) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                Object obj4 = list.get(2);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                obj3.getClass();
                return new TimelineState.CollapseRange((String) obj4, new IntRange(intValue, ((Integer) obj3).intValue(), 1));
            case 18:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj).intValue();
                int i2 = ArcadeTimeline2Binding.$r8$clinit;
                return Unit.INSTANCE;
            case 21:
                int i3 = KeypadScaffoldBinding.$r8$clinit;
                ((KeypadTextState) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((Long) obj).longValue();
                int i4 = LegacyAmountPickerBinding.$r8$clinit;
                return Unit.INSTANCE;
            case 23:
                ((Long) obj).longValue();
                int i5 = LegacyAmountPickerBinding.$r8$clinit;
                return Unit.INSTANCE;
            case 24:
                int i6 = LegacyPasscodeInputBinding.$r8$clinit;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                int i7 = LegacyPasscodeInputBinding.$r8$clinit;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                int i8 = NavBarBinding.$r8$clinit;
                layoutSpec.getClass();
                return new YInt(((Huffman.Node) layoutSpec.getParent().lastAppBecameInvisibleRealtimeMillis).resolve());
            case 27:
                int i9 = NavBarBinding.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 28:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                int i10 = NavBarBinding.$r8$clinit;
                layoutSpec2.getClass();
                return new YInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve());
            default:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig.durationMillis = 400;
                Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
                keyframesSpecConfig.at(valueOf, 0);
                Float valueOf2 = Float.valueOf(-40.0f);
                keyframesSpecConfig.at(valueOf2, 50);
                keyframesSpecConfig.at(Float.valueOf(40.0f), 150);
                keyframesSpecConfig.at(valueOf2, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                keyframesSpecConfig.at(Float.valueOf(24.0f), EnumC0170g.SDK_ASSET_ICON_REPORT_VALUE);
                keyframesSpecConfig.at(valueOf, 400);
                return Unit.INSTANCE;
        }
    }
}
