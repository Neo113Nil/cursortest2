package androidx.room.coroutines;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil__DBUtilKt;
import coil3.svg.internal.AndroidSvg;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKt$AmountDisplay$1$1;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.amount.AmountLayoutAnimator;
import com.squareup.cash.ui.widget.amount.AmountModel;
import com.squareup.cash.ui.widget.amount.ComputedLayout;
import com.squareup.cash.ui.widget.amount.Digit;
import com.squareup.cash.ui.widget.amount.RawDigitLayout;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.common.CurrencyCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public abstract class ConnectionPoolKt {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ae  */
    /* renamed from: AmountDisplay-kNX22eY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1177AmountDisplaykNX22eY(final AmountDisplayState amountDisplayState, final Modifier modifier, final long j, long j2, int i, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        long j3;
        long j4;
        int i6;
        final long j5;
        final int i7;
        final int i8;
        RecomposeScopeImpl endRestartGroup;
        long sp;
        int i9;
        int i10;
        AmountModel amountModel;
        TextPaint textPaint;
        MutableFloatState mutableFloatState;
        int i11;
        Object obj;
        int i12;
        int i13;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1309250383);
        if ((i3 & 6) == 0) {
            i5 = (gapComposer.changed(amountDisplayState) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            j3 = j;
            i5 |= gapComposer.changed(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        int i14 = i4 & 8;
        if (i14 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            j4 = j2;
            i5 |= gapComposer.changed(j4) ? 2048 : 1024;
            if ((i3 & 24576) == 0) {
                i5 |= PKIFailureInfo.certRevoked;
            }
            if ((i3 & 196608) != 0) {
                if ((i4 & 32) == 0) {
                    i6 = i2;
                    if (gapComposer.changed(i6)) {
                        i13 = PKIFailureInfo.unsupportedVersion;
                        i5 |= i13;
                    }
                } else {
                    i6 = i2;
                }
                i13 = 65536;
                i5 |= i13;
            } else {
                i6 = i2;
            }
            if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) == 74898)) {
                gapComposer.skipToGroupEnd();
                j5 = j4;
                i7 = i6;
                i8 = i;
            } else {
                gapComposer.startDefaults();
                if ((i3 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    sp = i14 != 0 ? Room.getSp(96) : j4;
                    i9 = i5 & (-57345);
                    if ((i4 & 32) != 0) {
                        i6 = 3;
                        i9 = i5 & (-516097);
                    }
                    i10 = R.font.cashsans_medium;
                } else {
                    gapComposer.skipToGroupEnd();
                    int i15 = i5 & (-57345);
                    if ((i4 & 32) != 0) {
                        i15 = i5 & (-516097);
                    }
                    i9 = i15;
                    sp = j4;
                    i10 = i;
                }
                gapComposer.endDefaults();
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(j3);
                float mo235toPxR2X_6o = density.mo235toPxR2X_6o(sp);
                boolean changed = gapComposer.changed(i10);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                Object obj2 = rememberedValue;
                if (changed || rememberedValue == neverEqualPolicy) {
                    Typeface font = ResourcesCompat.getFont(context, i10);
                    gapComposer.updateRememberedValue(font);
                    obj2 = font;
                }
                Typeface typeface = (Typeface) obj2;
                boolean changed2 = gapComposer.changed(mo235toPxR2X_6o) | gapComposer.changed(typeface);
                int i16 = i10;
                Object rememberedValue2 = gapComposer.rememberedValue();
                Object obj3 = rememberedValue2;
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    TextPaint textPaint2 = new TextPaint(1);
                    textPaint2.setTextSize(mo235toPxR2X_6o);
                    textPaint2.setTypeface(typeface);
                    gapComposer.updateRememberedValue(textPaint2);
                    obj3 = textPaint2;
                }
                TextPaint textPaint3 = (TextPaint) obj3;
                boolean changed3 = gapComposer.changed(textPaint3);
                Object rememberedValue3 = gapComposer.rememberedValue();
                Object obj4 = rememberedValue3;
                if (changed3 || rememberedValue3 == neverEqualPolicy) {
                    Paint.FontMetrics fontMetrics = textPaint3.getFontMetrics();
                    Dp dp = new Dp(density.mo232toDpu2uoSUM(fontMetrics.descent - fontMetrics.ascent));
                    gapComposer.updateRememberedValue(dp);
                    obj4 = dp;
                }
                float f = ((Dp) obj4).value;
                boolean changed4 = gapComposer.changed(textPaint3);
                Object rememberedValue4 = gapComposer.rememberedValue();
                Object obj5 = rememberedValue4;
                if (changed4 || rememberedValue4 == neverEqualPolicy) {
                    TextPaint textPaint4 = new TextPaint(textPaint3);
                    gapComposer.updateRememberedValue(textPaint4);
                    obj5 = textPaint4;
                }
                TextPaint textPaint5 = (TextPaint) obj5;
                textPaint5.setColor(m694toArgb8_81llA);
                Object rememberedValue5 = gapComposer.rememberedValue();
                Object obj6 = rememberedValue5;
                if (rememberedValue5 == neverEqualPolicy) {
                    CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(createCompositionCoroutineScope);
                    obj6 = createCompositionCoroutineScope;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                Object rememberedValue6 = gapComposer.rememberedValue();
                Object obj7 = rememberedValue6;
                if (rememberedValue6 == neverEqualPolicy) {
                    AmountLayoutAnimator amountLayoutAnimator = new AmountLayoutAnimator();
                    gapComposer.updateRememberedValue(amountLayoutAnimator);
                    obj7 = amountLayoutAnimator;
                }
                AmountLayoutAnimator amountLayoutAnimator2 = (AmountLayoutAnimator) obj7;
                Object rememberedValue7 = gapComposer.rememberedValue();
                Object obj8 = rememberedValue7;
                if (rememberedValue7 == neverEqualPolicy) {
                    obj8 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
                }
                MutableFloatState mutableFloatState2 = (MutableFloatState) obj8;
                AmountModel model = amountDisplayState.getModel();
                String displayString = DBUtil__DBUtilKt.toDisplayString(model.numberDigits, model.config.contentLabelBuilder$amountview());
                Float valueOf = Float.valueOf(((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue());
                boolean changedInstance = gapComposer.changedInstance(model) | gapComposer.changedInstance(textPaint3) | gapComposer.changedInstance(coroutineScope);
                int i17 = (i9 & 458752) ^ 196608;
                long j6 = sp;
                boolean z = ((i17 > 131072 && gapComposer.changed(i6)) || (i9 & 196608) == 131072) | changedInstance;
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (z || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new AmountDisplayKt$AmountDisplay$1$1(amountLayoutAnimator2, model, textPaint3, coroutineScope, i6, mutableFloatState2, (Continuation) null);
                    amountModel = model;
                    textPaint = textPaint3;
                    mutableFloatState = mutableFloatState2;
                    gapComposer.updateRememberedValue(rememberedValue8);
                } else {
                    amountModel = model;
                    textPaint = textPaint3;
                    mutableFloatState = mutableFloatState2;
                }
                Updater.LaunchedEffect(amountModel, valueOf, (Function2) rememberedValue8, gapComposer);
                Modifier m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, f, 1);
                Object rememberedValue9 = gapComposer.rememberedValue();
                Object obj9 = rememberedValue9;
                if (rememberedValue9 == neverEqualPolicy) {
                    HeroCardViewKt$$ExternalSyntheticLambda33 heroCardViewKt$$ExternalSyntheticLambda33 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState, 22);
                    gapComposer.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda33);
                    obj9 = heroCardViewKt$$ExternalSyntheticLambda33;
                }
                Modifier onSizeChanged = RulerKt.onSizeChanged(m276defaultMinSizeVpY3zN4$default, (Function1) obj9);
                boolean changed5 = gapComposer.changed(displayString);
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (changed5 || rememberedValue10 == neverEqualPolicy) {
                    i11 = 1;
                    StateBindingsKt$$ExternalSyntheticLambda0 stateBindingsKt$$ExternalSyntheticLambda0 = new StateBindingsKt$$ExternalSyntheticLambda0(displayString, i11);
                    gapComposer.updateRememberedValue(stateBindingsKt$$ExternalSyntheticLambda0);
                    obj = stateBindingsKt$$ExternalSyntheticLambda0;
                } else {
                    i11 = 1;
                    obj = rememberedValue10;
                }
                Modifier semantics = SemanticsModifierKt.semantics(onSizeChanged, false, (Function1) obj);
                int i18 = (gapComposer.changedInstance(amountModel) ? 1 : 0) | (gapComposer.changedInstance(textPaint) ? 1 : 0) | (((i17 <= 131072 || !gapComposer.changed(i6)) && (i9 & 196608) != 131072) ? 0 : i11) | (gapComposer.changedInstance(textPaint5) ? 1 : 0);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (i18 != 0 || rememberedValue11 == neverEqualPolicy) {
                    int i19 = i6;
                    rememberedValue11 = new DatePickerKt$$ExternalSyntheticLambda6(amountLayoutAnimator2, amountModel, textPaint, i19, textPaint5, 4);
                    i12 = i19;
                    gapComposer.updateRememberedValue(rememberedValue11);
                } else {
                    i12 = i6;
                }
                CanvasKt.Canvas(0, gapComposer, semantics, (Function1) rememberedValue11);
                i8 = i16;
                j5 = j6;
                i7 = i12;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.ui.widget.amount.AmountDisplayKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj10, Object obj11) {
                        ((Integer) obj11).getClass();
                        ConnectionPoolKt.m1177AmountDisplaykNX22eY(AmountDisplayState.this, modifier, j, j5, i8, i7, (Composer) obj10, Updater.updateChangedFlags(i3 | 1), i4);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        j4 = j2;
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) != 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: computeLayout-hyTVY88, reason: not valid java name */
    public static final ComputedLayout m1178computeLayouthyTVY88(List list, Paint paint, float f, TextPaint textPaint, int i) {
        list.getClass();
        paint.getClass();
        textPaint.set(paint);
        float textSize = textPaint.getTextSize();
        String displayString = DBUtil__DBUtilKt.toDisplayString(list, new Lazy(22));
        float f2 = RecyclerView.DECELERATION_RATE;
        float f3 = 0.0f;
        float f4 = 1.0f;
        while (f4 > 0.25f) {
            textPaint.setTextSize(textSize * f4);
            f3 = textPaint.measureText(displayString);
            if (f3 <= f) {
                break;
            }
            f4 *= 0.9f;
        }
        int i2 = 0;
        StaticLayout build = StaticLayout.Builder.obtain(displayString, 0, displayString.length(), textPaint, (int) f3).build();
        build.getClass();
        if (i != 5 && i != 1) {
            f2 = (i == 6 || i == 2) ? f - f3 : (f - f3) / 2.0f;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Digit digit = (Digit) obj;
            float primaryHorizontal = build.getPrimaryHorizontal(i2) + f2;
            arrayList.add(new Pair(digit, new RawDigitLayout(primaryHorizontal, (build.getPrimaryHorizontal(i3) + f2) - primaryHorizontal, digit instanceof Digit.EmptyZero ? 0.5f : 1.0f)));
            i2 = i3;
        }
        return new ComputedLayout(arrayList, f4);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinDeposit.deepLinkSpecs;
    }

    public static final ConnectionPoolImpl newConnectionPool(AndroidSvg androidSvg, String str, int i) {
        str.getClass();
        return new ConnectionPoolImpl(androidSvg, str, i);
    }

    public static final ConnectionPoolImpl newSingleConnectionPool(AndroidSvg androidSvg) {
        return new ConnectionPoolImpl(androidSvg);
    }

    public static final AmountDisplayState rememberAmountDisplayState(AmountConfig amountConfig, String str, Function1 function1, Composer composer, int i) {
        if ((i & 1) != 0) {
            amountConfig = new AmountConfig.MoneyConfig(CurrencyCode.USD, null, false, 0, 14);
        }
        if ((i & 2) != 0) {
            str = "0";
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new AmountDisplayState(amountConfig, str);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        AmountDisplayState amountDisplayState = (AmountDisplayState) rememberedValue;
        amountDisplayState.onEvent = function1;
        return amountDisplayState;
    }
}
