package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {
    Object awaitRelease(Continuation<? super Unit> continuation);

    Object tryAwaitRelease(Continuation<? super Boolean> continuation);

    /* compiled from: TapGestureDetector.kt */
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m688roundToPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return Density.CC.m9696$default$roundToPxR2X_6o(pressGestureScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m689roundToPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return Density.CC.m9697$default$roundToPx0680j_4(pressGestureScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m690toDpGaN1DYA(PressGestureScope pressGestureScope, long j) {
            return FontScaling.CC.m9841$default$toDpGaN1DYA(pressGestureScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m691toDpu2uoSUM(PressGestureScope pressGestureScope, float f) {
            return Density.CC.m9698$default$toDpu2uoSUM(pressGestureScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m692toDpu2uoSUM(PressGestureScope pressGestureScope, int i) {
            return Density.CC.m9699$default$toDpu2uoSUM((Density) pressGestureScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m693toDpSizekrfVVM(PressGestureScope pressGestureScope, long j) {
            return Density.CC.m9700$default$toDpSizekrfVVM(pressGestureScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m694toPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return Density.CC.m9701$default$toPxR2X_6o(pressGestureScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m695toPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return Density.CC.m9702$default$toPx0680j_4(pressGestureScope, f);
        }

        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            return Density.CC.$default$toRect(pressGestureScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m696toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j) {
            return Density.CC.m9703$default$toSizeXkaWNTQ(pressGestureScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m697toSp0xMU5do(PressGestureScope pressGestureScope, float f) {
            return FontScaling.CC.m9842$default$toSp0xMU5do(pressGestureScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m698toSpkPz2Gy4(PressGestureScope pressGestureScope, float f) {
            return Density.CC.m9704$default$toSpkPz2Gy4(pressGestureScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m699toSpkPz2Gy4(PressGestureScope pressGestureScope, int i) {
            return Density.CC.m9705$default$toSpkPz2Gy4((Density) pressGestureScope, i);
        }
    }
}
