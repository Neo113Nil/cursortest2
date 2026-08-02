package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.graphics.Color;

/* loaded from: classes3.dex */
public final class Colors {
    public final ParcelableSnapshotMutableState background$delegate;
    public final ParcelableSnapshotMutableState error$delegate;
    public final ParcelableSnapshotMutableState isLight$delegate;
    public final ParcelableSnapshotMutableState onBackground$delegate;
    public final ParcelableSnapshotMutableState onError$delegate;
    public final ParcelableSnapshotMutableState onPrimary$delegate;
    public final ParcelableSnapshotMutableState onSecondary$delegate;
    public final ParcelableSnapshotMutableState onSurface$delegate;
    public final ParcelableSnapshotMutableState primary$delegate;
    public final ParcelableSnapshotMutableState primaryVariant$delegate;
    public final ParcelableSnapshotMutableState secondary$delegate;
    public final ParcelableSnapshotMutableState secondaryVariant$delegate;
    public final ParcelableSnapshotMutableState surface$delegate;

    public Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        Color color = new Color(j);
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE$3;
        this.primary$delegate = new ParcelableSnapshotMutableState(color, neverEqualPolicy);
        this.primaryVariant$delegate = new ParcelableSnapshotMutableState(new Color(j2), neverEqualPolicy);
        this.secondary$delegate = new ParcelableSnapshotMutableState(new Color(j3), neverEqualPolicy);
        this.secondaryVariant$delegate = new ParcelableSnapshotMutableState(new Color(j4), neverEqualPolicy);
        this.background$delegate = new ParcelableSnapshotMutableState(new Color(j5), neverEqualPolicy);
        this.surface$delegate = new ParcelableSnapshotMutableState(new Color(j6), neverEqualPolicy);
        this.error$delegate = new ParcelableSnapshotMutableState(new Color(j7), neverEqualPolicy);
        this.onPrimary$delegate = new ParcelableSnapshotMutableState(new Color(j8), neverEqualPolicy);
        this.onSecondary$delegate = new ParcelableSnapshotMutableState(new Color(j9), neverEqualPolicy);
        this.onBackground$delegate = new ParcelableSnapshotMutableState(new Color(j10), neverEqualPolicy);
        this.onSurface$delegate = new ParcelableSnapshotMutableState(new Color(j11), neverEqualPolicy);
        this.onError$delegate = new ParcelableSnapshotMutableState(new Color(j12), neverEqualPolicy);
        this.isLight$delegate = new ParcelableSnapshotMutableState(Boolean.valueOf(z), neverEqualPolicy);
    }

    /* renamed from: copy-pvPzIIM$default, reason: not valid java name */
    public static Colors m481copypvPzIIM$default(Colors colors, long j, long j2, int i) {
        long m485getPrimary0d7_KjU = (i & 1) != 0 ? colors.m485getPrimary0d7_KjU() : j;
        long j3 = ((Color) colors.primaryVariant$delegate.getValue()).value;
        long j4 = ((Color) colors.secondary$delegate.getValue()).value;
        long j5 = ((Color) colors.secondaryVariant$delegate.getValue()).value;
        long m482getBackground0d7_KjU = colors.m482getBackground0d7_KjU();
        long m486getSurface0d7_KjU = colors.m486getSurface0d7_KjU();
        long m483getError0d7_KjU = (i & 64) != 0 ? colors.m483getError0d7_KjU() : j2;
        long j6 = ((Color) colors.onPrimary$delegate.getValue()).value;
        long j7 = ((Color) colors.onSecondary$delegate.getValue()).value;
        long j8 = ((Color) colors.onBackground$delegate.getValue()).value;
        long m484getOnSurface0d7_KjU = colors.m484getOnSurface0d7_KjU();
        long j9 = ((Color) colors.onError$delegate.getValue()).value;
        boolean isLight = colors.isLight();
        colors.getClass();
        return new Colors(m485getPrimary0d7_KjU, j3, j4, j5, m482getBackground0d7_KjU, m486getSurface0d7_KjU, m483getError0d7_KjU, j6, j7, j8, m484getOnSurface0d7_KjU, j9, isLight);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m482getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).value;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m483getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).value;
    }

    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m484getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).value;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m485getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).value;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m486getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).value;
    }

    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        sb.append((Object) Color.m682toStringimpl(m485getPrimary0d7_KjU()));
        sb.append(", primaryVariant=");
        Recorder$$ExternalSyntheticOutline1.m(((Color) this.primaryVariant$delegate.getValue()).value, ", secondary=", sb);
        Recorder$$ExternalSyntheticOutline1.m(((Color) this.secondary$delegate.getValue()).value, ", secondaryVariant=", sb);
        sb.append((Object) Color.m682toStringimpl(((Color) this.secondaryVariant$delegate.getValue()).value));
        sb.append(", background=");
        sb.append((Object) Color.m682toStringimpl(m482getBackground0d7_KjU()));
        sb.append(", surface=");
        sb.append((Object) Color.m682toStringimpl(m486getSurface0d7_KjU()));
        sb.append(", error=");
        sb.append((Object) Color.m682toStringimpl(m483getError0d7_KjU()));
        sb.append(", onPrimary=");
        Recorder$$ExternalSyntheticOutline1.m(((Color) this.onPrimary$delegate.getValue()).value, ", onSecondary=", sb);
        Recorder$$ExternalSyntheticOutline1.m(((Color) this.onSecondary$delegate.getValue()).value, ", onBackground=", sb);
        sb.append((Object) Color.m682toStringimpl(((Color) this.onBackground$delegate.getValue()).value));
        sb.append(", onSurface=");
        sb.append((Object) Color.m682toStringimpl(m484getOnSurface0d7_KjU()));
        sb.append(", onError=");
        sb.append((Object) Color.m682toStringimpl(((Color) this.onError$delegate.getValue()).value));
        sb.append(", isLight=");
        sb.append(isLight());
        sb.append(')');
        return sb.toString();
    }
}
