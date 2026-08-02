package coil3.compose.internal;

import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.lifecycle.Lifecycle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePreviewHandler$Companion$Default$1;
import coil3.compose.ConstraintsSizeResolver;
import coil3.compose.LocalAsyncImagePreviewHandlerKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.size.SizeResolver;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long ZeroConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5);

    public static final AsyncImagePreviewHandler$Companion$Default$1 previewHandler(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        if (!((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
            gapComposer.startReplaceGroup(2019088453);
            gapComposer.end(false);
            return null;
        }
        gapComposer.startReplaceGroup(2019030948);
        AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1 = (AsyncImagePreviewHandler$Companion$Default$1) gapComposer.consume(LocalAsyncImagePreviewHandlerKt.LocalAsyncImagePreviewHandler);
        gapComposer.end(false);
        return asyncImagePreviewHandler$Companion$Default$1;
    }

    public static final SizeResolver rememberSizeResolver(ContentScale contentScale, Composer composer) {
        Object obj;
        boolean areEqual = Intrinsics.areEqual(contentScale, ContentScale.Companion.None);
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(areEqual);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            if (areEqual) {
                obj = SizeResolver.ORIGINAL;
            } else {
                ConstraintsSizeResolver constraintsSizeResolver = new ConstraintsSizeResolver();
                constraintsSizeResolver.latestConstraints = ZeroConstraints;
                constraintsSizeResolver.continuations = new ArrayList();
                obj = constraintsSizeResolver;
            }
            rememberedValue = obj;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (SizeResolver) rememberedValue;
    }

    public static final ImageRequest requestOf(Object obj, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1319639034);
        if (obj instanceof ImageRequest) {
            gapComposer.startReplaceGroup(1530875884);
            ImageRequest imageRequest = (ImageRequest) obj;
            gapComposer.end(false);
            gapComposer.end(false);
            return imageRequest;
        }
        gapComposer.startReplaceGroup(1530915130);
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        boolean changed = gapComposer.changed(context) | gapComposer.changed(obj);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            ImageRequest.Builder builder = new ImageRequest.Builder(context);
            builder.data = obj;
            rememberedValue = builder.build();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        ImageRequest imageRequest2 = (ImageRequest) rememberedValue;
        gapComposer.end(false);
        gapComposer.end(false);
        return imageRequest2;
    }

    public static final ImageRequest requestOfWithSizeResolver(Object obj, ContentScale contentScale, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-329318062);
        boolean z = obj instanceof ImageRequest;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (!z) {
            gapComposer.startReplaceGroup(-1008595950);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            SizeResolver rememberSizeResolver = rememberSizeResolver(contentScale, gapComposer);
            boolean changed = gapComposer.changed(context) | gapComposer.changed(obj) | gapComposer.changed(rememberSizeResolver);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == neverEqualPolicy) {
                ImageRequest.Builder builder = new ImageRequest.Builder(context);
                builder.data = obj;
                builder.sizeResolver = rememberSizeResolver;
                rememberedValue = builder.build();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ImageRequest imageRequest = (ImageRequest) rememberedValue;
            gapComposer.end(false);
            gapComposer.end(false);
            return imageRequest;
        }
        gapComposer.startReplaceGroup(-1008942344);
        ImageRequest imageRequest2 = (ImageRequest) obj;
        if (imageRequest2.defined.sizeResolver != null) {
            gapComposer.startReplaceGroup(-1008902292);
            gapComposer.end(false);
            gapComposer.end(false);
            gapComposer.end(false);
            return imageRequest2;
        }
        gapComposer.startReplaceGroup(-1008854118);
        SizeResolver rememberSizeResolver2 = rememberSizeResolver(contentScale, gapComposer);
        boolean changed2 = gapComposer.changed(obj) | gapComposer.changed(rememberSizeResolver2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            ImageRequest.Builder newBuilder$default = ImageRequest.newBuilder$default(imageRequest2);
            newBuilder$default.sizeResolver = rememberSizeResolver2;
            rememberedValue2 = newBuilder$default.build();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        ImageRequest imageRequest3 = (ImageRequest) rememberedValue2;
        Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, false, false);
        return imageRequest3;
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m1454toIntSizeuvyYCjk(long j) {
        return (MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static void unsupportedData$default(String str) {
        throw new IllegalArgumentException(CameraSelector$$ExternalSyntheticOutline0.m("Unsupported type: ", str, ". ", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void validateRequest(ImageRequest imageRequest) {
        Object obj = imageRequest.data;
        if (obj instanceof ImageRequest.Builder) {
            a$$ExternalSyntheticBUOutline0.m$3("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof AndroidImageBitmap) {
            unsupportedData$default("ImageBitmap");
            throw null;
        }
        if (obj instanceof ImageVector) {
            unsupportedData$default("ImageVector");
            throw null;
        }
        if (obj instanceof Painter) {
            unsupportedData$default("Painter");
            throw null;
        }
        if (imageRequest.target != null) {
            a$$ExternalSyntheticBUOutline0.m$3("request.target must be null.");
        } else {
            if (((Lifecycle) ExtrasKt.getExtra(imageRequest, ImageRequests_androidKt.lifecycleKey)) == null) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("request.lifecycle must be null.");
        }
    }
}
