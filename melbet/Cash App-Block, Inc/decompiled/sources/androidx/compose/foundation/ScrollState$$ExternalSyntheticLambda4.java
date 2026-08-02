package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class ScrollState$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ScrollState$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return new ScrollState(((Integer) obj).intValue());
            case 1:
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 2:
                ((SeekableTransitionState) obj).onTotalDurationChanged$animation_core();
                return Unit.INSTANCE;
            case 3:
                return new AnimationVector1D(((Float) obj).floatValue());
            case 4:
                return new AnimationVector1D(((Integer) obj).intValue());
            case 5:
                return Integer.valueOf((int) ((AnimationVector1D) obj).value);
            case 6:
                return new AnimationVector1D(((Dp) obj).value);
            case 7:
                return new Dp(((AnimationVector1D) obj).value);
            case 8:
                DpOffset dpOffset = (DpOffset) obj;
                return new AnimationVector2D(DpOffset.m1039getXD9Ej5fM(dpOffset.packedValue), DpOffset.m1040getYD9Ej5fM(dpOffset.packedValue));
            case 9:
                AnimationVector2D animationVector2D = (AnimationVector2D) obj;
                return new DpOffset((Float.floatToRawIntBits(animationVector2D.v2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(animationVector2D.v1) << 32));
            case 10:
                Size size = (Size) obj;
                return new AnimationVector2D(Float.intBitsToFloat((int) (size.packedValue >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & size.packedValue)));
            case 11:
                AnimationVector2D animationVector2D2 = (AnimationVector2D) obj;
                return new Size((Float.floatToRawIntBits(animationVector2D2.v2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(animationVector2D2.v1) << 32));
            case 12:
                Offset offset = (Offset) obj;
                return new AnimationVector2D(Float.intBitsToFloat((int) (offset.packedValue >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & offset.packedValue)));
            case 13:
                AnimationVector2D animationVector2D3 = (AnimationVector2D) obj;
                return new Offset((Float.floatToRawIntBits(animationVector2D3.v2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(animationVector2D3.v1) << 32));
            case 14:
                long j = ((IntOffset) obj).packedValue;
                return new AnimationVector2D((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
            case 15:
                AnimationVector2D animationVector2D4 = (AnimationVector2D) obj;
                return new IntOffset((Math.round(animationVector2D4.v2) & BodyPartID.bodyIdMax) | (Math.round(animationVector2D4.v1) << 32));
            case 16:
                long j2 = ((IntSize) obj).packedValue;
                return new AnimationVector2D((int) (j2 >> 32), (int) (j2 & BodyPartID.bodyIdMax));
            case 17:
                AnimationVector2D animationVector2D5 = (AnimationVector2D) obj;
                int round = Math.round(animationVector2D5.v1);
                if (round < 0) {
                    round = 0;
                }
                return new IntSize((round << 32) | ((Math.round(animationVector2D5.v2) >= 0 ? r9 : 0) & BodyPartID.bodyIdMax));
            case 18:
                Rect rect = (Rect) obj;
                return new AnimationVector4D(rect.left, rect.top, rect.right, rect.bottom);
            case 19:
                AnimationVector4D animationVector4D = (AnimationVector4D) obj;
                return new Rect(animationVector4D.v1, animationVector4D.v2, animationVector4D.v3, animationVector4D.v4);
            case 20:
                return Float.valueOf(((AnimationVector1D) obj).value);
            case 21:
                return Unit.INSTANCE;
            case 22:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 23:
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) obj;
                int i = AndroidOverscroll_androidKt.$r8$clinit;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
                persistentCompositionLocalHashMap.getClass();
                Context context = (Context) Updater.read(persistentCompositionLocalHashMap, staticProvidableCompositionLocal);
                Density density = (Density) Updater.read(persistentCompositionLocalHashMap, CompositionLocalsKt.LocalDensity);
                OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) Updater.read(persistentCompositionLocalHashMap, OverscrollConfiguration_androidKt.LocalOverscrollConfiguration);
                if (overscrollConfiguration == null) {
                    return null;
                }
                return new AndroidEdgeEffectOverscrollFactory(context, density, overscrollConfiguration.glowColor, overscrollConfiguration.drawPadding);
            case 24:
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap2 = (PersistentCompositionLocalHashMap) obj;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = AndroidCompositionLocals_androidKt.LocalContext;
                persistentCompositionLocalHashMap2.getClass();
                if (((Context) Updater.read(persistentCompositionLocalHashMap2, staticProvidableCompositionLocal2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return BringIntoViewSpec_androidKt.PivotBringIntoViewSpec;
                }
                BringIntoViewSpec.Companion.getClass();
                return BringIntoViewSpec.Companion.DefaultBringIntoViewSpec;
            case 25:
                return Boolean.valueOf(!(((PointerType) obj) != null ? PointerType.m828equalsimpl0(r9.m830unboximpl(), 2) : false));
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                return Unit.INSTANCE;
            default:
                return ((WindowInsetsHolder) obj).systemBars;
        }
    }
}
