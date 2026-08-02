package coil3.compose;

import android.content.Context;
import android.os.Trace;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import coil3.BitmapImage;
import coil3.DrawableImage;
import coil3.Extras;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.AsyncImageState;
import coil3.compose.internal.ContentPainterElement;
import coil3.compose.internal.UtilsKt;
import coil3.compose.internal.UtilsKt$UseMinConstraintsMeasurePolicy$1;
import coil3.request.ImageRequest;
import coil3.size.SizeResolver;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class AsyncImageKt {
    public static final AsyncImagePainter_androidKt$FakeTransitionTarget$1 FakeTransitionTarget = new AsyncImagePainter_androidKt$FakeTransitionTarget$1();
    public static final Extras.Key preferEndFirstIntrinsicSizeKey;
    public static final Extras.Key useExistingImageAsPlaceholderKey;

    static {
        Boolean bool = Boolean.FALSE;
        useExistingImageAsPlaceholderKey = new Extras.Key(bool);
        preferEndFirstIntrinsicSizeKey = new Extras.Key(bool);
    }

    /* renamed from: AsyncImage-10Xjiaw, reason: not valid java name */
    public static final void m1438AsyncImage10Xjiaw(Object obj, String str, Modifier modifier, BiasAlignment biasAlignment, ContentScale contentScale, ColorFilter colorFilter, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion.$$INSTANCE;
        }
        GapComposer gapComposer = (GapComposer) composer;
        int i3 = i << 3;
        m1441AsyncImagesKDTAoQ(obj, str, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), modifier, (i2 & 32) != 0 ? Alignment.Companion.Center : biasAlignment, (i2 & 64) != 0 ? ContentScale.Companion.Fit : contentScale, (i2 & 256) != 0 ? null : colorFilter, gapComposer, (i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), (i >> 27) & 14, 0);
    }

    /* renamed from: AsyncImage-76YX9Dk, reason: not valid java name */
    public static final void m1439AsyncImage76YX9Dk(final AsyncImageState asyncImageState, final String str, final Modifier modifier, final Function1 function1, final Function1 function12, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter, final int i, final boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        String str2;
        Function1 function13;
        Function1 function14;
        Alignment alignment2;
        int i5;
        boolean z2;
        int i6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer.changed(asyncImageState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= gapComposer.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function13 = function1;
            i4 |= gapComposer.changedInstance(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i2 & 24576) == 0) {
            function14 = function12;
            i4 |= gapComposer.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function14 = function12;
        }
        if ((196608 & i2) == 0) {
            alignment2 = alignment;
            i4 |= gapComposer.changed(alignment2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            alignment2 = alignment;
        }
        if ((1572864 & i2) == 0) {
            i4 |= gapComposer.changed(contentScale) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i2) == 0) {
            i4 |= gapComposer.changed(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= gapComposer.changed(colorFilter) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 = i;
            i4 |= gapComposer.changed(i5) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            i5 = i;
        }
        if ((i3 & 6) == 0) {
            z2 = z;
            i6 = i3 | (gapComposer.changed(z2) ? 4 : 2);
        } else {
            z2 = z;
            i6 = i3;
        }
        if (gapComposer.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            ImageRequest requestOfWithSizeResolver = UtilsKt.requestOfWithSizeResolver(asyncImageState.model, contentScale, gapComposer, (i4 >> 15) & 112);
            UtilsKt.validateRequest(requestOfWithSizeResolver);
            Modifier then = modifier.then(new ContentPainterElement(requestOfWithSizeResolver, asyncImageState.imageLoader, asyncImageState.modelEqualityDelegate, function13, function14, i5, alignment2, contentScale, f, colorFilter, z2, UtilsKt.previewHandler(gapComposer), str2));
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, UtilsKt$UseMinConstraintsMeasurePolicy$1.INSTANCE, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(hashCode))) {
                Recorder$$ExternalSyntheticOutline1.m(hashCode, gapComposer, hashCode, composeUiNode$Companion$SetModifier$1);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: coil3.compose.AsyncImageKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i3);
                    AsyncImageKt.m1439AsyncImage76YX9Dk(AsyncImageState.this, str, modifier, function1, function12, alignment, contentScale, f, colorFilter, i, z, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: AsyncImage-nc27qi8, reason: not valid java name */
    public static final void m1440AsyncImagenc27qi8(Object obj, RealImageLoader realImageLoader, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1 function1, Function1 function12, ContentScale contentScale, Composer composer, int i, int i2, int i3) {
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        Painter painter4 = (i3 & 16) != 0 ? null : painter;
        Painter painter5 = (i3 & 32) != 0 ? null : painter2;
        Painter painter6 = (i3 & 64) != 0 ? painter5 : painter3;
        Function1 function13 = (i3 & 256) != 0 ? null : function1;
        Function1 function14 = (i3 & 512) != 0 ? null : function12;
        int i4 = i >> 3;
        ContentScale contentScale2 = (i3 & 2048) != 0 ? ContentScale.Companion.Fit : contentScale;
        GapComposer gapComposer = (GapComposer) composer;
        AsyncImageState asyncImageState = new AsyncImageState(obj, (AsyncImageModelEqualityDelegate$Companion$Default$1) gapComposer.consume(LocalAsyncImageModelEqualityDelegateKt.LocalAsyncImageModelEqualityDelegate), realImageLoader);
        int i5 = UtilsKt.$r8$clinit;
        int i6 = i2 << 15;
        m1439AsyncImage76YX9Dk(asyncImageState, null, modifier, (painter4 == null && painter5 == null && painter6 == null) ? AsyncImagePainter.DefaultTransform : new coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0(0, painter4, painter6, painter5), (function13 == null && function14 == null) ? null : new coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0(7, null, function13, function14), biasAlignment, contentScale2, 1.0f, null, 1, true, gapComposer, (i & 112) | (i4 & 896) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i2 >> 15) & 14);
    }

    /* renamed from: AsyncImage-sKDTAoQ, reason: not valid java name */
    public static final void m1441AsyncImagesKDTAoQ(Object obj, String str, RealImageLoader realImageLoader, Modifier modifier, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter, Composer composer, int i, int i2, int i3) {
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.Companion.$$INSTANCE : modifier;
        Alignment alignment2 = (i3 & 64) != 0 ? Alignment.Companion.Center : alignment;
        ContentScale contentScale2 = (i3 & 128) != 0 ? ContentScale.Companion.Fit : contentScale;
        ColorFilter colorFilter2 = (i3 & 512) != 0 ? null : colorFilter;
        int i4 = i >> 3;
        GapComposer gapComposer = (GapComposer) composer;
        m1439AsyncImage76YX9Dk(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate$Companion$Default$1) gapComposer.consume(LocalAsyncImageModelEqualityDelegateKt.LocalAsyncImageModelEqualityDelegate), realImageLoader), str, modifier2, AsyncImagePainter.DefaultTransform, null, alignment2, contentScale2, 1.0f, colorFilter2, 1, true, gapComposer, (i4 & 234881024) | (i & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | ((i2 << 27) & 1879048192), (i2 >> 3) & 14);
    }

    /* renamed from: AsyncImage-x1rPTaM, reason: not valid java name */
    public static final void m1442AsyncImagex1rPTaM(Object obj, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1 function1, ContentScale contentScale, Composer composer, int i, int i2, int i3) {
        Painter painter4 = (i3 & 8) != 0 ? null : painter;
        Painter painter5 = (i3 & 16) != 0 ? null : painter2;
        Painter painter6 = (i3 & 32) != 0 ? painter5 : painter3;
        Function1 function12 = (i3 & 128) != 0 ? null : function1;
        ContentScale contentScale2 = (i3 & 1024) != 0 ? ContentScale.Companion.Fit : contentScale;
        GapComposer gapComposer = (GapComposer) composer;
        RealImageLoader realImageLoader = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
        int i4 = i << 3;
        int i5 = (i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i4 & 7168);
        int i6 = Painter.$stable;
        m1440AsyncImagenc27qi8(obj, realImageLoader, modifier, painter4, painter5, painter6, function12, null, contentScale2, gapComposer, i5 | (i6 << 12) | (57344 & i4) | (i6 << 15) | (458752 & i4) | (i6 << 18) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), ((i >> 27) & 14) | ((i2 << 3) & 112), 0);
    }

    /* renamed from: SubcomposeAsyncImage-QgsmV_s, reason: not valid java name */
    public static final void m1443SubcomposeAsyncImageQgsmV_s(Object obj, String str, RealImageLoader realImageLoader, Modifier modifier, BiasAlignment biasAlignment, ContentScale contentScale, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        if ((i2 & 64) != 0) {
            biasAlignment = Alignment.Companion.Center;
        }
        BiasAlignment biasAlignment2 = biasAlignment;
        int i3 = i >> 3;
        GapComposer gapComposer = (GapComposer) composer;
        m1444SubcomposeAsyncImagegl8XCv8(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate$Companion$Default$1) gapComposer.consume(LocalAsyncImageModelEqualityDelegateKt.LocalAsyncImageModelEqualityDelegate), realImageLoader), str, modifier, biasAlignment2, (i2 & 128) != 0 ? ContentScale.Companion.Fit : contentScale, composableLambdaImpl, gapComposer, (i & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3), 48);
    }

    /* renamed from: SubcomposeAsyncImage-gl8XCv8, reason: not valid java name */
    public static final void m1444SubcomposeAsyncImagegl8XCv8(AsyncImageState asyncImageState, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        String str2;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-205779950);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(asyncImageState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= gapComposer.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(AsyncImagePainter.DefaultTransform) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changedInstance(null) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changed(alignment) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer.changed(contentScale) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer.changed(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer.changed((Object) null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= gapComposer.changed(1) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer.changed(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        int i5 = i4;
        if (gapComposer.shouldExecute(i3 & 1, ((306783379 & i3) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            ImageRequest requestOfWithSizeResolver = UtilsKt.requestOfWithSizeResolver(asyncImageState.model, contentScale, gapComposer, (i3 >> 15) & 112);
            int i6 = i3 >> 6;
            int i7 = i3 >> 12;
            AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI = m1448rememberAsyncImagePainter5jETZwI(requestOfWithSizeResolver, asyncImageState.imageLoader, contentScale, gapComposer, ((i3 >> 3) & 8064) | (i6 & 57344) | (i7 & 458752), 0);
            SizeResolver sizeResolver = requestOfWithSizeResolver.sizeResolver;
            if (sizeResolver instanceof ConstraintsSizeResolver) {
                gapComposer.startReplaceGroup(-1470570430);
                OffsetKt.BoxWithConstraints(modifier, alignment, true, Expect_jvmKt.rememberComposableLambda(-374957172, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(sizeResolver, composableLambdaImpl, m1448rememberAsyncImagePainter5jETZwI, str, alignment, contentScale, 0), gapComposer), gapComposer, (i6 & 14) | 3456 | (i7 & 112), 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1471259157);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, true);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(hashCode))) {
                    Recorder$$ExternalSyntheticOutline1.m(hashCode, gapComposer, hashCode, composeUiNode$Companion$SetModifier$1);
                }
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                composableLambdaImpl.invoke(new RealSubcomposeAsyncImageScope(BoxScopeInstance.INSTANCE, m1448rememberAsyncImagePainter5jETZwI, str2, alignment, contentScale), gapComposer, Integer.valueOf(i5 & 112));
                gapComposer.end(true);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(asyncImageState, str, modifier, alignment, contentScale, composableLambdaImpl, i, i2, 0);
        }
    }

    /* renamed from: asPainter-55t9-rM, reason: not valid java name */
    public static final Painter m1445asPainter55t9rM(Image image, Context context, int i) {
        return image instanceof BitmapImage ? BitmapPainterKt.m760BitmapPainterQZhYCtY$default(new AndroidImageBitmap(((BitmapImage) image).bitmap), i) : image instanceof DrawableImage ? new DrawablePainter(Image_androidKt.asDrawable(image, context.getResources()).mutate()) : new ImagePainter(image);
    }

    public static final AsyncImagePainter rememberAsyncImagePainter(PainterRequest painterRequest, Object obj, Composer composer, int i, int i2) {
        Function1 function1;
        painterRequest.getClass();
        if ((i2 & 1) != 0) {
            obj = painterRequest.url;
        }
        Object obj2 = obj;
        Function1 function12 = painterRequest.onError;
        if (function12 == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1492322480);
            gapComposer.end(false);
            function1 = null;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1492322481);
            boolean changed = gapComposer2.changed(function12);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(6, function12);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            gapComposer2.end(false);
        }
        GapComposer gapComposer3 = (GapComposer) composer;
        return m1447rememberAsyncImagePainter3HmZ8SU(obj2, (RealImageLoader) gapComposer3.consume(LocalImageLoaderKt.LocalImageLoader), null, null, function1, gapComposer3, (i >> 3) & 14, 892);
    }

    /* renamed from: rememberAsyncImagePainter-19ie5dc, reason: not valid java name */
    public static final AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc(int i, int i2, Composer composer, Object obj) {
        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = (i2 & 8) != 0 ? ContentScale.Companion.Fit : ContentScale.Companion.Crop;
        GapComposer gapComposer = (GapComposer) composer;
        int i3 = i & 14;
        int i4 = i << 3;
        return m1448rememberAsyncImagePainter5jETZwI(obj, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), contentScale$Companion$Fit$1, gapComposer, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
    }

    /* renamed from: rememberAsyncImagePainter-3HmZ8SU, reason: not valid java name */
    public static final AsyncImagePainter m1447rememberAsyncImagePainter3HmZ8SU(Object obj, RealImageLoader realImageLoader, Function1 function1, Function1 function12, Function1 function13, Composer composer, int i, int i2) {
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        if ((i2 & 64) != 0) {
            function12 = null;
        }
        GapComposer gapComposer = (GapComposer) composer;
        AsyncImageState asyncImageState = new AsyncImageState(obj, (AsyncImageModelEqualityDelegate$Companion$Default$1) gapComposer.consume(LocalAsyncImageModelEqualityDelegateKt.LocalAsyncImageModelEqualityDelegate), realImageLoader);
        int i3 = UtilsKt.$r8$clinit;
        return m1449rememberAsyncImagePainterGSdzBsE(asyncImageState, AsyncImagePainter.DefaultTransform, (function1 == null && function12 == null && function13 == null) ? null : new coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0(7, function1, function12, function13), ContentScale.Companion.Fit, 1, gapComposer);
    }

    /* renamed from: rememberAsyncImagePainter-5jETZwI, reason: not valid java name */
    public static final AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI(Object obj, RealImageLoader realImageLoader, ContentScale contentScale, Composer composer, int i, int i2) {
        if ((i2 & 16) != 0) {
            contentScale = ContentScale.Companion.Fit;
        }
        GapComposer gapComposer = (GapComposer) composer;
        return m1449rememberAsyncImagePainterGSdzBsE(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate$Companion$Default$1) gapComposer.consume(LocalAsyncImageModelEqualityDelegateKt.LocalAsyncImageModelEqualityDelegate), realImageLoader), AsyncImagePainter.DefaultTransform, null, contentScale, 1, gapComposer);
    }

    /* renamed from: rememberAsyncImagePainter-GSdzBsE, reason: not valid java name */
    public static final AsyncImagePainter m1449rememberAsyncImagePainterGSdzBsE(AsyncImageState asyncImageState, Function1 function1, Function1 function12, ContentScale contentScale, int i, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            ImageRequest requestOf = UtilsKt.requestOf(asyncImageState.model, gapComposer);
            UtilsKt.validateRequest(requestOf);
            AsyncImagePainter.Input input = new AsyncImagePainter.Input(asyncImageState.imageLoader, requestOf, asyncImageState.modelEqualityDelegate);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new AsyncImagePainter(input);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            asyncImagePainter.scope = (CoroutineScope) rememberedValue2;
            asyncImagePainter.transform = function1;
            asyncImagePainter.onState = function12;
            asyncImagePainter.contentScale = contentScale;
            asyncImagePainter.filterQuality = i;
            asyncImagePainter.previewHandler = UtilsKt.previewHandler(gapComposer);
            asyncImagePainter.set_input$coil_compose_core(input);
            gapComposer.end(false);
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: rememberAsyncImagePainter-MqR-F_0, reason: not valid java name */
    public static final AsyncImagePainter m1450rememberAsyncImagePainterMqRF_0(Object obj, Function1 function1, Function1 function12, Function1 function13, Composer composer, int i, int i2) {
        Function1 function14 = (i2 & 16) != 0 ? null : function1;
        Function1 function15 = (i2 & 32) != 0 ? null : function12;
        GapComposer gapComposer = (GapComposer) composer;
        RealImageLoader realImageLoader = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
        int i3 = Painter.$stable;
        int i4 = i << 3;
        return m1447rememberAsyncImagePainter3HmZ8SU(obj, realImageLoader, function14, function15, function13, gapComposer, (i & 14) | (i3 << 6) | (i4 & 896) | (i3 << 9) | (i4 & 7168) | (i3 << 12) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (1879048192 & i4), 0);
    }
}
