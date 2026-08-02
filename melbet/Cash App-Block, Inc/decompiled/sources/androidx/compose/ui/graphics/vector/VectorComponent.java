package androidx.compose.ui.graphics.vector;

import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public final DrawCache cacheDrawScope;
    public final AnonymousClass1 drawVectorBlock;
    public final ParcelableSnapshotMutableState intrinsicColorFilter$delegate;
    public Function0 invalidateCallback;
    public boolean isDirty;
    public String name;
    public long previousDrawSize;
    public final GroupComponent root;
    public float rootScaleX;
    public float rootScaleY;
    public BlendModeColorFilter tintFilter;
    public final ParcelableSnapshotMutableState viewportSize$delegate;

    /* renamed from: androidx.compose.ui.graphics.vector.VectorComponent$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ VectorComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(VectorComponent vectorComponent, int i) {
            super(1);
            this.$r8$classId = i;
            this.this$0 = vectorComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            VectorComponent vectorComponent = this.this$0;
            switch (i) {
                case 0:
                    vectorComponent.isDirty = true;
                    vectorComponent.invalidateCallback.invoke();
                    return Unit.INSTANCE;
                default:
                    DrawScope drawScope = (DrawScope) obj;
                    GroupComponent groupComponent = vectorComponent.root;
                    float f = vectorComponent.rootScaleX;
                    float f2 = vectorComponent.rootScaleY;
                    GrpcMethod drawContext = drawScope.getDrawContext();
                    long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        ((Extras.Key) drawContext.path).m1437scale0AR0LA0(f, f2, 0L);
                        groupComponent.draw(drawScope);
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                        throw th;
                    }
            }
        }
    }

    public VectorComponent(GroupComponent groupComponent) {
        this.root = groupComponent;
        groupComponent.invalidateListener = new AnonymousClass1(this, 0);
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = PathComponent$pathMeasure$2.INSTANCE$1;
        this.intrinsicColorFilter$delegate = Updater.mutableStateOf$default(null);
        this.viewportSize$delegate = Updater.mutableStateOf$default(new Size(0L));
        this.previousDrawSize = 9205357640488583168L;
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new AnonymousClass1(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r3 != (r8 == null ? r8.m655getConfig_sVssgQ() : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011c, code lost:
    
        if (r9.config == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(DrawScope drawScope, float f, ColorFilter colorFilter) {
        int i;
        boolean z;
        DrawCache drawCache;
        BlendModeColorFilter blendModeColorFilter;
        AndroidImageBitmap androidImageBitmap;
        char c;
        long j;
        ColorFilter colorFilter2;
        AndroidImageBitmap androidImageBitmap2;
        int i2;
        int i3;
        GroupComponent groupComponent = this.root;
        boolean z2 = groupComponent.isTintable;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.intrinsicColorFilter$delegate;
        if (z2 && groupComponent.tintColor != 16) {
            ColorFilter colorFilter3 = (ColorFilter) parcelableSnapshotMutableState.getValue();
            EmptyList emptyList = VectorKt.EmptyPath;
            if (!(colorFilter3 instanceof BlendModeColorFilter) ? colorFilter3 == null : !((i3 = ((BlendModeColorFilter) colorFilter3).blendMode) != 5 && i3 != 3)) {
                if (!(colorFilter instanceof BlendModeColorFilter) ? colorFilter == null : !((i2 = ((BlendModeColorFilter) colorFilter).blendMode) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.isDirty;
                    drawCache = this.cacheDrawScope;
                    if (!z && Size.m639equalsimpl0(this.previousDrawSize, drawScope.mo753getSizeNHjbRc())) {
                        AndroidImageBitmap androidImageBitmap3 = drawCache.mCachedImage;
                    }
                    if (i != 1) {
                        long j2 = groupComponent.tintColor;
                        EmptyList emptyList2 = VectorKt.EmptyPath;
                        if (Color.m677getAlphaimpl(j2) != 1.0f) {
                            j2 = Color.m675copywmQWz5c$default(1.0f, j2, 14);
                        }
                        blendModeColorFilter = new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                    } else {
                        blendModeColorFilter = null;
                    }
                    this.tintFilter = blendModeColorFilter;
                    float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.viewportSize$delegate;
                    this.rootScaleX = intBitsToFloat / Float.intBitsToFloat((int) (((Size) parcelableSnapshotMutableState2.getValue()).packedValue >> 32));
                    this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (((Size) parcelableSnapshotMutableState2.getValue()).packedValue & BodyPartID.bodyIdMax));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax);
                    LayoutDirection layoutDirection = drawScope.getLayoutDirection();
                    androidImageBitmap = drawCache.mCachedImage;
                    AndroidCanvas androidCanvas = drawCache.cachedCanvas;
                    if (androidImageBitmap != null || androidCanvas == null) {
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        int i4 = (int) (ceil >> 32);
                        Bitmap bitmap = androidImageBitmap.bitmap;
                        c = ' ';
                        j = 4294967295L;
                        if (i4 <= bitmap.getWidth()) {
                            if (((int) (ceil & BodyPartID.bodyIdMax)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    androidImageBitmap = ColorKt.m683ImageBitmapx__hDU$default((int) (ceil >> c), (int) (ceil & j), i);
                    androidCanvas = ColorKt.Canvas(androidImageBitmap);
                    drawCache.mCachedImage = androidImageBitmap;
                    drawCache.cachedCanvas = androidCanvas;
                    drawCache.config = i;
                    drawCache.size = ceil;
                    CanvasDrawScope canvasDrawScope = drawCache.cacheScope;
                    long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(ceil);
                    CanvasDrawScope.DrawParams drawParams = canvasDrawScope.drawParams;
                    Density density = drawParams.density;
                    LayoutDirection layoutDirection2 = drawParams.layoutDirection;
                    Canvas canvas = drawParams.canvas;
                    AndroidCanvas androidCanvas2 = androidCanvas;
                    long j3 = drawParams.size;
                    drawParams.density = drawScope;
                    drawParams.layoutDirection = layoutDirection;
                    drawParams.canvas = androidCanvas2;
                    drawParams.size = m3991toSizeozmzZPI;
                    androidCanvas2.save();
                    DrawScope.m747drawRectnJ9OG0$default(canvasDrawScope, Color.Black, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, 62);
                    this.drawVectorBlock.invoke(canvasDrawScope);
                    androidCanvas2.restore();
                    CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.drawParams;
                    drawParams2.density = density;
                    drawParams2.layoutDirection = layoutDirection2;
                    drawParams2.canvas = canvas;
                    drawParams2.size = j3;
                    androidImageBitmap.bitmap.prepareToDraw();
                    this.isDirty = false;
                    this.previousDrawSize = drawScope.mo753getSizeNHjbRc();
                    if (colorFilter == null) {
                        colorFilter2 = colorFilter;
                    } else {
                        colorFilter2 = ((ColorFilter) parcelableSnapshotMutableState.getValue()) != null ? (ColorFilter) parcelableSnapshotMutableState.getValue() : this.tintFilter;
                    }
                    androidImageBitmap2 = drawCache.mCachedImage;
                    if (androidImageBitmap2 == null) {
                        InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    DrawScope.m739drawImageAZ2fEMs$default(drawScope, androidImageBitmap2, drawCache.size, 0L, 0L, f, colorFilter2, 0, 0, 858);
                }
            }
        }
        i = 0;
        z = this.isDirty;
        drawCache = this.cacheDrawScope;
        if (!z) {
            AndroidImageBitmap androidImageBitmap32 = drawCache.mCachedImage;
        }
        if (i != 1) {
        }
        this.tintFilter = blendModeColorFilter;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
        ParcelableSnapshotMutableState parcelableSnapshotMutableState22 = this.viewportSize$delegate;
        this.rootScaleX = intBitsToFloat2 / Float.intBitsToFloat((int) (((Size) parcelableSnapshotMutableState22.getValue()).packedValue >> 32));
        this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (((Size) parcelableSnapshotMutableState22.getValue()).packedValue & BodyPartID.bodyIdMax));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax);
        LayoutDirection layoutDirection3 = drawScope.getLayoutDirection();
        androidImageBitmap = drawCache.mCachedImage;
        AndroidCanvas androidCanvas3 = drawCache.cachedCanvas;
        if (androidImageBitmap != null) {
        }
        c = ' ';
        j = 4294967295L;
        androidImageBitmap = ColorKt.m683ImageBitmapx__hDU$default((int) (ceil2 >> c), (int) (ceil2 & j), i);
        androidCanvas3 = ColorKt.Canvas(androidImageBitmap);
        drawCache.mCachedImage = androidImageBitmap;
        drawCache.cachedCanvas = androidCanvas3;
        drawCache.config = i;
        drawCache.size = ceil2;
        CanvasDrawScope canvasDrawScope2 = drawCache.cacheScope;
        long m3991toSizeozmzZPI2 = Countries.m3991toSizeozmzZPI(ceil2);
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.drawParams;
        Density density2 = drawParams3.density;
        LayoutDirection layoutDirection22 = drawParams3.layoutDirection;
        Canvas canvas2 = drawParams3.canvas;
        AndroidCanvas androidCanvas22 = androidCanvas3;
        long j32 = drawParams3.size;
        drawParams3.density = drawScope;
        drawParams3.layoutDirection = layoutDirection3;
        drawParams3.canvas = androidCanvas22;
        drawParams3.size = m3991toSizeozmzZPI2;
        androidCanvas22.save();
        DrawScope.m747drawRectnJ9OG0$default(canvasDrawScope2, Color.Black, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, 62);
        this.drawVectorBlock.invoke(canvasDrawScope2);
        androidCanvas22.restore();
        CanvasDrawScope.DrawParams drawParams22 = canvasDrawScope2.drawParams;
        drawParams22.density = density2;
        drawParams22.layoutDirection = layoutDirection22;
        drawParams22.canvas = canvas2;
        drawParams22.size = j32;
        androidImageBitmap.bitmap.prepareToDraw();
        this.isDirty = false;
        this.previousDrawSize = drawScope.mo753getSizeNHjbRc();
        if (colorFilter == null) {
        }
        androidImageBitmap2 = drawCache.mCachedImage;
        if (androidImageBitmap2 == null) {
        }
        DrawScope.m739drawImageAZ2fEMs$default(drawScope, androidImageBitmap2, drawCache.size, 0L, 0L, f, colorFilter2, 0, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.name);
        sb.append("\n\tviewportWidth: ");
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.viewportSize$delegate;
        sb.append(Float.intBitsToFloat((int) (((Size) parcelableSnapshotMutableState.getValue()).packedValue >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((Size) parcelableSnapshotMutableState.getValue()).packedValue & BodyPartID.bodyIdMax)));
        sb.append("\n");
        return sb.toString();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
