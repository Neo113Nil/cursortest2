package com.squareup.cash.maps.views;

import android.content.Context;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.Extras;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.size.RealSizeResolver;
import coil3.size.Scale;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ClusterItemKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ClusterItemKt$$ExternalSyntheticLambda1(int i, String str) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        String str = this.f$0;
        int i2 = this.f$1;
        switch (i) {
            case 0:
                BoxScope boxScope = (BoxScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                boxScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier align = boxScope.align(ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 40.0f), RoundedCornerShapeKt.CircleShape), Alignment.Companion.TopCenter);
                    ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
                    Boolean bool = (Boolean) ClusterItemKt.supportsHardware$delegate.getValue();
                    bool.booleanValue();
                    Extras.Key key = ImageRequests_androidKt.transitionFactoryKey;
                    builder.getExtras().set(ImageRequests_androidKt.allowHardwareKey, bool);
                    builder.data = str;
                    ImageRequest build = builder.build();
                    Painter painterResource = Countries.painterResource(i2, 0, gapComposer);
                    Painter painterResource2 = Countries.painterResource(i2, 0, gapComposer);
                    int i3 = Painter.$stable;
                    AsyncImageKt.m1442AsyncImagex1rPTaM(build, align, painterResource, painterResource2, null, null, null, gapComposer, (i3 << 9) | 48 | (i3 << 12), 0, 32736);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue2 = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(-1699955231);
                ImageRequest.Builder builder2 = new ImageRequest.Builder((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext));
                builder2.data = str;
                builder2.sizeResolver = new RealSizeResolver(coil3.size.SizeKt.Size(i2, i2));
                builder2.scale = Scale.FILL;
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, builder2.build(), gapComposer2, intValue2 & 14, 0);
                gapComposer2.end(false);
                return rememberAsyncImagePainter;
            default:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer2 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer2).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, animateItem$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (i2 == 0) {
                        gapComposer3.startReplaceGroup(-389599738);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-389537242);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                        gapComposer3.end(false);
                    }
                    ViewfinderDefaults.SectionHeader(this.f$0, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer3, 0, 30);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ClusterItemKt$$ExternalSyntheticLambda1(String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = i;
    }
}
