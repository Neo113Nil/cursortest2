package coil3.compose.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageModelEqualityDelegate$Companion$Default$1;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePreviewHandler$Companion$Default$1;
import coil3.compose.ConstraintsSizeResolver;
import coil3.request.ImageRequest;
import coil3.size.SizeResolver;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcoil3/compose/internal/ContentPainterNode;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentPainterElement extends ModifierNodeElement {
    public final Alignment alignment;
    public final float alpha;
    public final boolean clipToBounds;
    public final ColorFilter colorFilter;
    public final String contentDescription;
    public final ContentScale contentScale;
    public final int filterQuality;
    public final RealImageLoader imageLoader;
    public final AsyncImageModelEqualityDelegate$Companion$Default$1 modelEqualityDelegate;
    public final Function1 onState;
    public final AsyncImagePreviewHandler$Companion$Default$1 previewHandler;
    public final ImageRequest request;
    public final Function1 transform;

    public ContentPainterElement(ImageRequest imageRequest, RealImageLoader realImageLoader, AsyncImageModelEqualityDelegate$Companion$Default$1 asyncImageModelEqualityDelegate$Companion$Default$1, Function1 function1, Function1 function12, int i, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1, String str) {
        this.request = imageRequest;
        this.imageLoader = realImageLoader;
        this.modelEqualityDelegate = asyncImageModelEqualityDelegate$Companion$Default$1;
        this.transform = function1;
        this.onState = function12;
        this.filterQuality = i;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
        this.clipToBounds = z;
        this.previewHandler = asyncImagePreviewHandler$Companion$Default$1;
        this.contentDescription = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        AsyncImageModelEqualityDelegate$Companion$Default$1 asyncImageModelEqualityDelegate$Companion$Default$1 = this.modelEqualityDelegate;
        RealImageLoader realImageLoader = this.imageLoader;
        ImageRequest imageRequest = this.request;
        AsyncImagePainter.Input input = new AsyncImagePainter.Input(realImageLoader, imageRequest, asyncImageModelEqualityDelegate$Companion$Default$1);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(input);
        asyncImagePainter.transform = this.transform;
        asyncImagePainter.onState = this.onState;
        asyncImagePainter.contentScale = this.contentScale;
        asyncImagePainter.filterQuality = this.filterQuality;
        asyncImagePainter.previewHandler = this.previewHandler;
        asyncImagePainter.set_input$coil_compose_core(input);
        SizeResolver sizeResolver = imageRequest.sizeResolver;
        return new ContentPainterNode(asyncImagePainter, this.alignment, this.contentScale, this.alpha, this.colorFilter, this.clipToBounds, this.contentDescription, sizeResolver instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) sizeResolver : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return this.request.equals(contentPainterElement.request) && Intrinsics.areEqual(this.imageLoader, contentPainterElement.imageLoader) && Intrinsics.areEqual(this.modelEqualityDelegate, contentPainterElement.modelEqualityDelegate) && Intrinsics.areEqual(this.transform, contentPainterElement.transform) && Intrinsics.areEqual(this.onState, contentPainterElement.onState) && this.filterQuality == contentPainterElement.filterQuality && Intrinsics.areEqual(this.alignment, contentPainterElement.alignment) && Intrinsics.areEqual(this.contentScale, contentPainterElement.contentScale) && Float.compare(this.alpha, contentPainterElement.alpha) == 0 && Intrinsics.areEqual(this.colorFilter, contentPainterElement.colorFilter) && this.clipToBounds == contentPainterElement.clipToBounds && Intrinsics.areEqual(this.previewHandler, contentPainterElement.previewHandler) && Intrinsics.areEqual(this.contentDescription, contentPainterElement.contentDescription);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline1.m((this.modelEqualityDelegate.hashCode() + ((this.imageLoader.hashCode() + (this.request.hashCode() * 31)) * 31)) * 31, 31, this.transform);
        Function1 function1 = this.onState;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.alpha, (this.contentScale.hashCode() + ((this.alignment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.filterQuality, (m + (function1 == null ? 0 : function1.hashCode())) * 31, 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.colorFilter;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31, 31, this.clipToBounds);
        AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1 = this.previewHandler;
        int hashCode = (m3 + (asyncImagePreviewHandler$Companion$Default$1 == null ? 0 : asyncImagePreviewHandler$Companion$Default$1.hashCode())) * 31;
        String str = this.contentDescription;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "content";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.request, "request");
        linesSequence.set(this.imageLoader, "imageLoader");
        linesSequence.set(this.modelEqualityDelegate, "modelEqualityDelegate");
        linesSequence.set(this.transform, "transform");
        linesSequence.set(this.onState, "onState");
        linesSequence.set(new FilterQuality(this.filterQuality), "filterQuality");
        linesSequence.set(this.alignment, "alignment");
        linesSequence.set(this.contentScale, "contentScale");
        linesSequence.set(Float.valueOf(this.alpha), "alpha");
        linesSequence.set(this.colorFilter, "colorFilter");
        linesSequence.set(Boolean.valueOf(this.clipToBounds), "clipToBounds");
        linesSequence.set(this.previewHandler, "previewHandler");
        linesSequence.set(this.contentDescription, "contentDescription");
    }

    public final String toString() {
        String m698toStringimpl = FilterQuality.m698toStringimpl(this.filterQuality);
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.request);
        sb.append(", imageLoader=");
        sb.append(this.imageLoader);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.modelEqualityDelegate);
        sb.append(", transform=");
        sb.append(this.transform);
        sb.append(", onState=");
        sb.append(this.onState);
        sb.append(", filterQuality=");
        sb.append(m698toStringimpl);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", contentScale=");
        sb.append(this.contentScale);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", colorFilter=");
        sb.append(this.colorFilter);
        sb.append(", clipToBounds=");
        sb.append(this.clipToBounds);
        sb.append(", previewHandler=");
        sb.append(this.previewHandler);
        sb.append(", contentDescription=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.contentDescription, ")");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ContentPainterNode contentPainterNode = (ContentPainterNode) node;
        long mo759getIntrinsicSizeNHjbRc = contentPainterNode.painter.mo759getIntrinsicSizeNHjbRc();
        ConstraintsSizeResolver constraintsSizeResolver = contentPainterNode.constraintSizeResolver;
        AsyncImageModelEqualityDelegate$Companion$Default$1 asyncImageModelEqualityDelegate$Companion$Default$1 = this.modelEqualityDelegate;
        RealImageLoader realImageLoader = this.imageLoader;
        ImageRequest imageRequest = this.request;
        AsyncImagePainter.Input input = new AsyncImagePainter.Input(realImageLoader, imageRequest, asyncImageModelEqualityDelegate$Companion$Default$1);
        AsyncImagePainter asyncImagePainter = contentPainterNode.painter;
        asyncImagePainter.transform = this.transform;
        asyncImagePainter.onState = this.onState;
        ContentScale contentScale = this.contentScale;
        asyncImagePainter.contentScale = contentScale;
        asyncImagePainter.filterQuality = this.filterQuality;
        asyncImagePainter.previewHandler = this.previewHandler;
        asyncImagePainter.set_input$coil_compose_core(input);
        boolean m639equalsimpl0 = Size.m639equalsimpl0(mo759getIntrinsicSizeNHjbRc, asyncImagePainter.mo759getIntrinsicSizeNHjbRc());
        contentPainterNode.alignment = this.alignment;
        SizeResolver sizeResolver = imageRequest.sizeResolver;
        contentPainterNode.constraintSizeResolver = sizeResolver instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) sizeResolver : null;
        contentPainterNode.contentScale = contentScale;
        contentPainterNode.alpha = this.alpha;
        contentPainterNode.colorFilter = this.colorFilter;
        contentPainterNode.clipToBounds = this.clipToBounds;
        String str = contentPainterNode.contentDescription;
        String str2 = this.contentDescription;
        if (!Intrinsics.areEqual(str, str2)) {
            contentPainterNode.contentDescription = str2;
            DepthSortedSetKt.requireLayoutNode(contentPainterNode).invalidateSemantics$ui();
        }
        boolean areEqual = Intrinsics.areEqual(constraintsSizeResolver, contentPainterNode.constraintSizeResolver);
        if (!m639equalsimpl0 || !areEqual) {
            DepthSortedSetKt.requireLayoutNode(contentPainterNode).invalidateMeasurements$ui();
        }
        DepthSortedSetKt.invalidateDraw(contentPainterNode);
    }
}
