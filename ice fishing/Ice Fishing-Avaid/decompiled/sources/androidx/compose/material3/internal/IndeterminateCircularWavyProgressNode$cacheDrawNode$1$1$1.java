package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CircularWavyProgressModifiers.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final /* synthetic */ class IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$1 extends FunctionReferenceImpl implements Function6<Float, Float, Float, Size, Boolean, Path, Path> {
    IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$1(Object obj) {
        super(6, obj, IndeterminateCircularWavyProgressNode.class, "progressPathProvider", "progressPathProvider-wzdHmys(FFFJZLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", 0);
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Path invoke(Float f, Float f2, Float f3, Size size, Boolean bool, Path path) {
        return m4795invokewzdHmys(f.floatValue(), f2.floatValue(), f3.floatValue(), size.m6593unboximpl(), bool.booleanValue(), path);
    }

    /* renamed from: invoke-wzdHmys, reason: not valid java name */
    public final Path m4795invokewzdHmys(float f, float f2, float f3, long j, boolean z, Path path) {
        return ((IndeterminateCircularWavyProgressNode) this.receiver).m4728progressPathProviderwzdHmys(f, f2, f3, j, z, path);
    }
}
