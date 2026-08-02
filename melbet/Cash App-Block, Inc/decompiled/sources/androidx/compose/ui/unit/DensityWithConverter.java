package androidx.compose.ui.unit;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class DensityWithConverter implements Density {
    public final FontScaleConverter converter;
    public final float density;
    public final float fontScale;

    public DensityWithConverter(float f, float f2, FontScaleConverter fontScaleConverter) {
        this.density = f;
        this.fontScale = f2;
        this.converter = fontScaleConverter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && this.converter.equals(densityWithConverter.converter);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.fontScale;
    }

    public final int hashCode() {
        return this.converter.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.fontScale, Float.hashCode(this.density) * 31, 31);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public final float mo231toDpGaN1DYA(long j) {
        if (TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j), 4294967296L)) {
            return this.converter.convertSpToDp(TextUnit.m1059getValueimpl(j));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Only Sp can convert to Px");
        return RecyclerView.DECELERATION_RATE;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public final long mo238toSp0xMU5do(float f) {
        return Room.pack(4294967296L, this.converter.convertDpToSp(f));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
