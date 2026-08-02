package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import defpackage.Size$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public abstract class ColorsKt {
    public static final StaticProvidableCompositionLocal LocalColors = new StaticProvidableCompositionLocal(new Size$$ExternalSyntheticLambda0(28));

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m487contentColorFor4WTKRHQ(Colors colors, long j) {
        long m485getPrimary0d7_KjU = colors.m485getPrimary0d7_KjU();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = colors.onSecondary$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = colors.onPrimary$delegate;
        if (!Color.m676equalsimpl0(j, m485getPrimary0d7_KjU) && !Color.m676equalsimpl0(j, ((Color) colors.primaryVariant$delegate.getValue()).value)) {
            if (!Color.m676equalsimpl0(j, ((Color) colors.secondary$delegate.getValue()).value) && !Color.m676equalsimpl0(j, ((Color) colors.secondaryVariant$delegate.getValue()).value)) {
                return Color.m676equalsimpl0(j, colors.m482getBackground0d7_KjU()) ? ((Color) colors.onBackground$delegate.getValue()).value : Color.m676equalsimpl0(j, colors.m486getSurface0d7_KjU()) ? colors.m484getOnSurface0d7_KjU() : Color.m676equalsimpl0(j, colors.m483getError0d7_KjU()) ? ((Color) colors.onError$delegate.getValue()).value : Color.Unspecified;
            }
            return ((Color) parcelableSnapshotMutableState.getValue()).value;
        }
        return ((Color) parcelableSnapshotMutableState2.getValue()).value;
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m488contentColorForek8zF_U(long j, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-583917585);
        long m487contentColorFor4WTKRHQ = m487contentColorFor4WTKRHQ((Colors) gapComposer.consume(LocalColors), j);
        if (m487contentColorFor4WTKRHQ == 16) {
            m487contentColorFor4WTKRHQ = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
        }
        gapComposer.end(false);
        return m487contentColorFor4WTKRHQ;
    }

    /* renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static Colors m489lightColors2qZNXz8$default(long j, long j2, long j3, long j4, int i) {
        long Color = (i & 1) != 0 ? ColorKt.Color(4284612846L) : j;
        long Color2 = ColorKt.Color(4281794739L);
        long Color3 = ColorKt.Color(4278442694L);
        long Color4 = ColorKt.Color(4278290310L);
        long j5 = Color.White;
        long j6 = (i & 32) != 0 ? j5 : j2;
        long Color5 = (i & 64) != 0 ? ColorKt.Color(4289724448L) : j3;
        long j7 = Color.Black;
        return new Colors(Color, Color2, Color3, Color4, j5, j6, Color5, j5, j7, j7, (i & 1024) != 0 ? j7 : j4, j5, true);
    }
}
