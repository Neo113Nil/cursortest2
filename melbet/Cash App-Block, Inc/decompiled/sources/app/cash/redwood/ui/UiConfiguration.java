package app.cash.redwood.ui;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.b$$ExternalSyntheticLambda3;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class UiConfiguration {
    public final boolean darkMode;
    public final double density;
    public final LayoutDirection layoutDirection;
    public final Margin safeAreaInsets;
    public final Margin viewInsets;
    public final Size viewportSize;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(10))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/ui/UiConfiguration$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/ui/UiConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-runtime_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return UiConfiguration$$serializer.INSTANCE;
        }
    }

    public UiConfiguration(int i, boolean z, Margin margin, Margin margin2, Size size, double d, LayoutDirection layoutDirection) {
        this.darkMode = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            Margin.Companion.getClass();
            this.safeAreaInsets = Margin.Zero;
        } else {
            this.safeAreaInsets = margin;
        }
        if ((i & 4) == 0) {
            Margin.Companion.getClass();
            this.viewInsets = Margin.Zero;
        } else {
            this.viewInsets = margin2;
        }
        if ((i & 8) == 0) {
            this.viewportSize = null;
        } else {
            this.viewportSize = size;
        }
        if ((i & 16) == 0) {
            this.density = 1.0d;
        } else {
            this.density = d;
        }
        if ((i & 32) == 0) {
            this.layoutDirection = LayoutDirection.Ltr;
        } else {
            this.layoutDirection = layoutDirection;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiConfiguration)) {
            return false;
        }
        UiConfiguration uiConfiguration = (UiConfiguration) obj;
        return this.darkMode == uiConfiguration.darkMode && Intrinsics.areEqual(this.safeAreaInsets, uiConfiguration.safeAreaInsets) && Intrinsics.areEqual(this.viewInsets, uiConfiguration.viewInsets) && Intrinsics.areEqual(this.viewportSize, uiConfiguration.viewportSize) && Double.compare(this.density, uiConfiguration.density) == 0 && this.layoutDirection == uiConfiguration.layoutDirection;
    }

    public final int hashCode() {
        int hashCode = (this.viewInsets.hashCode() + ((this.safeAreaInsets.hashCode() + (Boolean.hashCode(this.darkMode) * 31)) * 31)) * 31;
        Size size = this.viewportSize;
        return this.layoutDirection.hashCode() + Fragment$5$$ExternalSyntheticOutline0.m(this.density, (hashCode + (size == null ? 0 : size.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "UiConfiguration(darkMode=" + this.darkMode + ", safeAreaInsets=" + this.safeAreaInsets + ", viewInsets=" + this.viewInsets + ", viewportSize=" + this.viewportSize + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ")";
    }

    public UiConfiguration(boolean z, Margin margin, Margin margin2, Size size, double d, LayoutDirection layoutDirection) {
        margin.getClass();
        margin2.getClass();
        this.darkMode = z;
        this.safeAreaInsets = margin;
        this.viewInsets = margin2;
        this.viewportSize = size;
        this.density = d;
        this.layoutDirection = layoutDirection;
    }
}
