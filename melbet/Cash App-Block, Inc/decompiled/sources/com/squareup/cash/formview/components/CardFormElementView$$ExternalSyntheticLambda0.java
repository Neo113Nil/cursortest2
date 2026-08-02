package com.squareup.cash.formview.components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.size.SizeKt;
import coil3.transform.RoundedCornersTransformation;
import coil3.transform.Transformation;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda21;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.android.Views;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardFormElementView$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ CardFormElementView$$ExternalSyntheticLambda0(int i, int i2, CardFormElementView cardFormElementView, RealImageLoader realImageLoader, Context context, FormBlocker.Element.CardElement cardElement) {
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = cardFormElementView;
        this.f$3 = realImageLoader;
        this.f$4 = context;
        this.f$5 = cardElement;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl composableLambdaImpl;
        int i = this.$r8$classId;
        final int i2 = this.f$1;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        final int i3 = this.f$0;
        final int i4 = 0;
        switch (i) {
            case 0:
                CardFormElementView cardFormElementView = (CardFormElementView) obj7;
                RealImageLoader realImageLoader = (RealImageLoader) obj6;
                Context context = (Context) obj5;
                FormBlocker.Element.CardElement cardElement = (FormBlocker.Element.CardElement) obj4;
                Integer num = (Integer) obj2;
                int intValue = num.intValue();
                ((Integer) obj3).getClass();
                ((View) obj).getClass();
                Pair pair = i3 < intValue ? new Pair(Integer.valueOf(i3), Integer.valueOf(i2)) : new Pair(num, Integer.valueOf(MathKt__MathJVMKt.roundToInt(intValue / (i3 / i2))));
                int intValue2 = ((Number) pair.first).intValue();
                int intValue3 = ((Number) pair.second).intValue();
                cardFormElementView.getLayoutParams().width = intValue2;
                cardFormElementView.getLayoutParams().height = intValue3;
                float dip = Views.dip(cardFormElementView, intValue3 / 32.0f);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dip);
                gradientDrawable.setColor(ThemeHelpersKt.themeInfo(cardFormElementView).colorPalette.green);
                cardFormElementView.post(new KnotView$$ExternalSyntheticLambda1(cardFormElementView, 25));
                ImageRequest.Builder builder = new ImageRequest.Builder(context);
                Image image = cardElement.image;
                image.getClass();
                builder.data = ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo(cardFormElementView));
                Transformation[] transformationArr = {new RoundedCornersTransformation(dip)};
                Extras.Key key = ImageRequestsKt.transformationsKey;
                ImageRequestsKt.transformations(builder, ArraysKt___ArraysKt.toList(transformationArr));
                ImageRequests_androidKt.placeholder(builder, gradientDrawable);
                ImageRequests_androidKt.error(builder, gradientDrawable);
                ImageRequests_androidKt.target(builder, cardFormElementView);
                realImageLoader.enqueue(builder.build());
                break;
            case 1:
                final String str = (String) obj7;
                String str2 = (String) obj6;
                final String str3 = (String) obj5;
                final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj4;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed = gapComposer.changed(str) | gapComposer.changed(i3);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Function1() { // from class: com.squareup.cash.profile.views.notifications.AdjustableThresholdViewKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i5 = i4;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                                int i6 = i3;
                                String str4 = str;
                                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj8;
                                switch (i5) {
                                    case 0:
                                        semanticsPropertyReceiver.getClass();
                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                                        SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                                        if (parcelableSnapshotMutableIntState2.getIntValue() <= i6) {
                                            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                        }
                                        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new WalletHomeViewKt$$ExternalSyntheticLambda21(6, parcelableSnapshotMutableIntState2));
                                        break;
                                    default:
                                        semanticsPropertyReceiver.getClass();
                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                                        SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                                        if (parcelableSnapshotMutableIntState2.getIntValue() >= i6) {
                                            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                        }
                                        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new WalletHomeViewKt$$ExternalSyntheticLambda21(5, parcelableSnapshotMutableIntState2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(horizontalWeight, (Function1) rememberedValue);
                    boolean z = parcelableSnapshotMutableIntState.getIntValue() > i3;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new WalletHomeViewKt$$ExternalSyntheticLambda21(7, parcelableSnapshotMutableIntState);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue2, clearAndSetSemantics, null, false, z, null, ChannelListViewKt.lambda$707346640, gapComposer, 1572870, 44);
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed2 = gapComposer.changed(str2);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new RealSandboxer$$ExternalSyntheticLambda1(str2, 2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(horizontalWeight2, (Function1) rememberedValue3);
                    String stringResource = Room.stringResource(R.string.adjustable_threshold_percentage, new Object[]{Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue())}, gapComposer);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3828, colors.semantic.text.prominent, (Composer) gapComposer, clearAndSetSemantics2, (TextStyle) null, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    Modifier horizontalWeight3 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed3 = gapComposer.changed(str3) | gapComposer.changed(i2);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        final int i5 = 1;
                        rememberedValue4 = new Function1() { // from class: com.squareup.cash.profile.views.notifications.AdjustableThresholdViewKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i52 = i5;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                                int i6 = i2;
                                String str4 = str3;
                                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj8;
                                switch (i52) {
                                    case 0:
                                        semanticsPropertyReceiver.getClass();
                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                                        SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                                        if (parcelableSnapshotMutableIntState2.getIntValue() <= i6) {
                                            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                        }
                                        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new WalletHomeViewKt$$ExternalSyntheticLambda21(6, parcelableSnapshotMutableIntState2));
                                        break;
                                    default:
                                        semanticsPropertyReceiver.getClass();
                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                                        SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                                        if (parcelableSnapshotMutableIntState2.getIntValue() >= i6) {
                                            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                        }
                                        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new WalletHomeViewKt$$ExternalSyntheticLambda21(5, parcelableSnapshotMutableIntState2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    Modifier clearAndSetSemantics3 = SemanticsModifierKt.clearAndSetSemantics(horizontalWeight3, (Function1) rememberedValue4);
                    boolean z2 = parcelableSnapshotMutableIntState.getIntValue() < i2;
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new WalletHomeViewKt$$ExternalSyntheticLambda21(8, parcelableSnapshotMutableIntState);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue5, clearAndSetSemantics3, null, false, z2, null, ChannelListViewKt.lambda$1966509241, gapComposer, 1572870, 44);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                String str4 = (String) obj7;
                Integer num2 = (Integer) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function02 = (Function0) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue5, (intValue5 & 17) != 16)) {
                    String stringResource2 = Room.stringResource(gapComposer2, i3);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-886370850, new BadgedAvatarKt$$ExternalSyntheticLambda4(function02, i2, 8), gapComposer2);
                    if (num2 == null || function0 == null) {
                        gapComposer2.startReplaceGroup(834188795);
                        gapComposer2.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer2.startReplaceGroup(834016467);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-675645566, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(9, function0, num2), gapComposer2);
                        gapComposer2.end(false);
                    }
                    ModalKt.Modal((Modifier) null, stringResource2, str4, rememberComposableLambda, composableLambdaImpl, (Function3) null, gapComposer2, 3072, 33);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardFormElementView$$ExternalSyntheticLambda0(int i, String str, Integer num, Function0 function0, Function0 function02, int i2) {
        this.f$0 = i;
        this.f$2 = str;
        this.f$3 = num;
        this.f$4 = function0;
        this.f$5 = function02;
        this.f$1 = i2;
    }

    public /* synthetic */ CardFormElementView$$ExternalSyntheticLambda0(String str, int i, String str2, String str3, int i2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.f$2 = str;
        this.f$0 = i;
        this.f$3 = str2;
        this.f$4 = str3;
        this.f$1 = i2;
        this.f$5 = parcelableSnapshotMutableIntState;
    }
}
