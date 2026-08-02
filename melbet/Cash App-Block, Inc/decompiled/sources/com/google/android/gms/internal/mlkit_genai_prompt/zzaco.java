package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.window.DialogProperties;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaco;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.HighlightedLink;
import com.squareup.cash.composeUi.foundation.text.LinkTapDetectorState;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.presenters.AliasFormatter;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class zzaco {
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0248  */
    /* renamed from: ClickableText-JZIOrgw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2013ClickableTextJZIOrgw(final AnnotatedString annotatedString, final Modifier modifier, final TextStyle textStyle, long j, Function1 function1, int i, int i2, Map map, final Function1 function12, Composer composer, final int i3, final int i4, final int i5) {
        long j2;
        int i6;
        Function1 function13;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        GapComposer gapComposer;
        final long j3;
        final int i12;
        final Function1 function14;
        final int i13;
        final Map map2;
        RecomposeScopeImpl endRestartGroup;
        long j4;
        Function1 function15;
        int i14;
        Map map3;
        int i15;
        int i16;
        annotatedString.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(98844102);
        int i17 = i3 | (gapComposer2.changed(annotatedString) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | (gapComposer2.changed(textStyle) ? 256 : 128);
        int i18 = i5 & 8;
        if (i18 != 0) {
            i6 = i17 | 3072;
            j2 = j;
        } else {
            j2 = j;
            i6 = i17 | (gapComposer2.changed(j2) ? 2048 : 1024);
        }
        int i19 = i5 & 16;
        if (i19 != 0) {
            i7 = i6 | 24576;
            function13 = function1;
        } else {
            function13 = function1;
            i7 = i6 | (gapComposer2.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i20 = i5 & 32;
        if (i20 != 0) {
            i9 = i7 | 196608;
            i8 = i;
        } else {
            i8 = i;
            i9 = i7 | (gapComposer2.changed(i8) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i21 = i9 | 46661632;
        int i22 = i5 & 512;
        if (i22 != 0) {
            i10 = i9 | 851968000;
        } else {
            i10 = i21 | (gapComposer2.changedInstance(map) ? PKIFailureInfo.duplicateCertReq : 268435456);
        }
        if ((i4 & 6) == 0) {
            i11 = i4 | (gapComposer2.changedInstance(function12) ? 4 : 2);
        } else {
            i11 = i4;
        }
        if ((i10 & 306783379) == 306783378 && (i11 & 3) == 2) {
            z = false;
            if (gapComposer2.shouldExecute(i10 & 1, z)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                j3 = j2;
                i12 = i8;
                function14 = function13;
                i13 = i2;
                map2 = map;
            } else {
                gapComposer2.startDefaults();
                int i23 = i3 & 1;
                Object obj = Composer.Companion.Empty;
                if (i23 == 0 || gapComposer2.getDefaultsInvalid()) {
                    j4 = i18 != 0 ? Color.Unspecified : j2;
                    if (i19 != 0) {
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == obj) {
                            rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(12);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        function15 = (Function1) rememberedValue;
                    } else {
                        function15 = function13;
                    }
                    int i24 = i20 != 0 ? Integer.MAX_VALUE : i8;
                    i14 = i10 & (-238551041);
                    if (i22 != 0) {
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        map3 = emptyMap;
                    } else {
                        map3 = map;
                    }
                    i15 = i24;
                    i16 = 2;
                } else {
                    gapComposer2.skipToGroupEnd();
                    map3 = map;
                    i14 = i10 & (-238551041);
                    j4 = j2;
                    i15 = i8;
                    function15 = function13;
                    i16 = i2;
                }
                gapComposer2.endDefaults();
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new LinkTapDetectorState();
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                LinkTapDetectorState linkTapDetectorState = (LinkTapDetectorState) rememberedValue2;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(function12, gapComposer2);
                int i25 = (i14 & 14) | 48;
                linkTapDetectorState.getClass();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = linkTapDetectorState.highlightedLink$delegate;
                linkTapDetectorState.text$delegate.setValue(annotatedString);
                long j5 = j4;
                boolean changed = gapComposer2.changed((HighlightedLink) parcelableSnapshotMutableState.getValue()) | ((((i25 & 14) ^ 6) > 4 && gapComposer2.changed(annotatedString)) || (i25 & 6) == 4);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed || rememberedValue3 == obj) {
                    HighlightedLink highlightedLink = (HighlightedLink) parcelableSnapshotMutableState.getValue();
                    if (highlightedLink == null) {
                        rememberedValue3 = annotatedString;
                    } else {
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        builder.append(annotatedString);
                        SpanStyle spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, highlightedLink.color, (TextDecoration) null, (Shadow) null, 63487);
                        AnnotatedString.Range range = highlightedLink.link;
                        builder.addStyle(spanStyle, range.start, range.end);
                        rememberedValue3 = builder.toAnnotatedString();
                    }
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                AnnotatedString annotatedString2 = (AnnotatedString) rememberedValue3;
                boolean changed2 = gapComposer2.changed(rememberUpdatedState);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue4 == obj) {
                    rememberedValue4 = new CashCardKt$$ExternalSyntheticLambda0(3, rememberUpdatedState);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                Function1 function16 = (Function1) rememberedValue4;
                modifier.getClass();
                function16.getClass();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new LocalViewFactory$createUi$view$3$1$1$1(8, linkTapDetectorState, function16));
                boolean z2 = (57344 & i14) == 16384;
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue5 == obj) {
                    rememberedValue5 = new BadgeQueries$$ExternalSyntheticLambda0(9, linkTapDetectorState, function15);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                gapComposer = gapComposer2;
                Room.m1164Text25TpFw(i16, i15, 0, 0, (i14 & 8064) | ((i14 << 3) & 3670016), 6 | ((i14 >> 24) & 112), 640, j5, (Composer) gapComposer, pointerInput, annotatedString2, textStyle, (TextLineBalancing) null, map3, (Function1) rememberedValue5, false);
                function14 = function15;
                i13 = i16;
                i12 = i15;
                j3 = j5;
                map2 = map3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2(modifier, textStyle, j3, function14, i12, i13, map2, function12, i3, i4, i5) { // from class: com.squareup.cash.arcade.components.text.ClickableTextKt$$ExternalSyntheticLambda3
                    public final /* synthetic */ Modifier f$1;
                    public final /* synthetic */ Function1 f$10;
                    public final /* synthetic */ int f$12;
                    public final /* synthetic */ int f$13;
                    public final /* synthetic */ TextStyle f$2;
                    public final /* synthetic */ long f$3;
                    public final /* synthetic */ Function1 f$4;
                    public final /* synthetic */ int f$5;
                    public final /* synthetic */ int f$8;
                    public final /* synthetic */ Map f$9;

                    {
                        this.f$12 = i4;
                        this.f$13 = i5;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(1);
                        int updateChangedFlags2 = Updater.updateChangedFlags(this.f$12);
                        zzaco.m2013ClickableTextJZIOrgw(AnnotatedString.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$8, this.f$9, this.f$10, (Composer) obj2, updateChangedFlags, updateChangedFlags2, this.f$13);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        z = true;
        if (gapComposer2.shouldExecute(i10 & 1, z)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void FullscreenImageViewer(int i, Composer composer, String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1868554307);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            AliasFormatter.Dialog(function0, new DialogProperties(3), Expect_jvmKt.rememberComposableLambda(959637638, new ToViewKt$$ExternalSyntheticLambda0(function0, str), gapComposer), gapComposer, 438);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda0(str, function0, i, 6);
        }
    }

    public static final float dragGestureDelta(PagerState pagerState) {
        return pagerState.getLayoutInfo().orientation == Orientation.Horizontal ? Float.intBitsToFloat((int) (pagerState.m333getUpDownDifferenceF1C5BW0$foundation() >> 32)) : Float.intBitsToFloat((int) (pagerState.m333getUpDownDifferenceF1C5BW0$foundation() & BodyPartID.bodyIdMax));
    }

    public static final boolean isScrollingForward(PagerState pagerState, float f) {
        pagerState.getLayoutInfo().getClass();
        return !(((pagerState.isNotGestureAction$foundation() ? -f : dragGestureDelta(pagerState)) > RecyclerView.DECELERATION_RATE ? 1 : ((pagerState.isNotGestureAction$foundation() ? -f : dragGestureDelta(pagerState)) == RecyclerView.DECELERATION_RATE ? 0 : -1)) > 0);
    }
}
