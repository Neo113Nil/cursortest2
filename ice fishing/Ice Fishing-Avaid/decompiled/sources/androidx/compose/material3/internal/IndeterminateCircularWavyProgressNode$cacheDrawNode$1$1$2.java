package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CircularWavyProgressModifiers.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final /* synthetic */ class IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$2 extends FunctionReferenceImpl implements Function5<Float, Float, Float, Size, Path, Path> {
    IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$2(Object obj) {
        super(5, obj, IndeterminateCircularWavyProgressNode.class, "trackPathProvider", "trackPathProvider-yzxVdVo(FFFJLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", 0);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Path invoke(Float f, Float f2, Float f3, Size size, Path path) {
        return m4796invokeyzxVdVo(f.floatValue(), f2.floatValue(), f3.floatValue(), size.m6593unboximpl(), path);
    }

    /* renamed from: invoke-yzxVdVo, reason: not valid java name */
    public final Path m4796invokeyzxVdVo(float f, float f2, float f3, long j, Path path) {
        return ((IndeterminateCircularWavyProgressNode) this.receiver).m4734trackPathProvideryzxVdVo(f, f2, f3, j, path);
    }
}
