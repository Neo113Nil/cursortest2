package androidx.compose.foundation;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Density;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollFactory {
    public final Context context;
    public final Density density;
    public final long glowColor;
    public final PaddingValues glowDrawPadding;

    public AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j, PaddingValues paddingValues) {
        this.context = context;
        this.density = density;
        this.glowColor = j;
        this.glowDrawPadding = paddingValues;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidEdgeEffectOverscrollFactory.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) obj;
        return Intrinsics.areEqual(this.context, androidEdgeEffectOverscrollFactory.context) && Intrinsics.areEqual(this.density, androidEdgeEffectOverscrollFactory.density) && Color.m676equalsimpl0(this.glowColor, androidEdgeEffectOverscrollFactory.glowColor) && Intrinsics.areEqual(this.glowDrawPadding, androidEdgeEffectOverscrollFactory.glowDrawPadding);
    }

    public final int hashCode() {
        int hashCode = (this.density.hashCode() + (this.context.hashCode() * 31)) * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return this.glowDrawPadding.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.glowColor);
    }
}
