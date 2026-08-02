package com.squareup.cardcustomizations.signature;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.paging.PagingSource;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.paging3.OffsetQueryPagingSource;
import coil3.Extras;
import com.squareup.cash.mooncake.compose_ui.components.LoadableContentKt$$ExternalSyntheticLambda4;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class SignaturesKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ SignaturesKt$$ExternalSyntheticLambda1(int i, int i2, RecurringReloadConfigurationViewModel.SelectDay selectDay, Function1 function1) {
        this.$r8$classId = 2;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$0 = selectDay;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i;
        int i2 = this.$r8$classId;
        int i3 = 1;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        int i4 = this.f$3;
        int i5 = this.f$2;
        switch (i2) {
            case 0:
                SignatureState signatureState = (SignatureState) obj3;
                MutableState mutableState = (MutableState) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float f = -Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() >> 32));
                float f2 = -Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax));
                ((Extras.Key) drawScope.getDrawContext().path).translate(f, f2);
                try {
                    signatureState.getInvalidate$customizations();
                    for (Pair pair : CollectionsKt.toList((List) mutableState.getValue())) {
                        float coerceIn = RangesKt___RangesKt.coerceIn((SystemClock.uptimeMillis() - ((Number) pair.second).longValue()) / 200.0f, RecyclerView.DECELERATION_RATE, 1.0f);
                        Object obj4 = pair.first;
                        if (coerceIn >= 1.0f) {
                            ((Bitmap) obj4).recycle();
                            mutableState.setValue(CollectionsKt.minus((List) mutableState.getValue(), pair));
                            i = i3;
                        } else {
                            AndroidImageBitmap androidImageBitmap = new AndroidImageBitmap((Bitmap) obj4);
                            long Color = ColorKt.Color(i5);
                            i = i3;
                            DrawScope.m740drawImagegbVJVH8$default(drawScope, androidImageBitmap, 0L, 1.0f - coerceIn, new BlendModeColorFilter(Color, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m693toAndroidBlendModes9anfk8(5))), 0, 42);
                        }
                        i3 = i;
                    }
                    int i6 = i3;
                    if (!((List) mutableState.getValue()).isEmpty()) {
                        signatureState.setInvalidate$customizations(signatureState.getInvalidate$customizations() + 1);
                    }
                    Signature signature$customizations = signatureState.getSignature$customizations();
                    AndroidImageBitmap androidImageBitmap2 = signature$customizations != null ? new AndroidImageBitmap(signature$customizations.getBitmap()) : null;
                    if (androidImageBitmap2 != null) {
                        long Color2 = ColorKt.Color(i5);
                        DrawScope.m740drawImagegbVJVH8$default(drawScope, androidImageBitmap2, 0L, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(Color2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color2), ColorKt.m693toAndroidBlendModes9anfk8(5))), 0, 46);
                        AndroidPath clipPath$customizations = signatureState.getClipPath$customizations();
                        GrpcMethod drawContext = drawScope.getDrawContext();
                        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            ((Extras.Key) drawContext.path).m1434clipPathmtrdDE(clipPath$customizations, i6);
                            long Color3 = ColorKt.Color(i4);
                            BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(Color3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                            j = m3999getSizeNHjbRc;
                            try {
                                DrawScope.m740drawImagegbVJVH8$default(drawScope, androidImageBitmap2, 0L, RecyclerView.DECELERATION_RATE, blendModeColorFilter, 0, 46);
                                drawContext.getCanvas().restore();
                                drawContext.m4000setSizeuvyYCjk(j);
                            } catch (Throwable th) {
                                th = th;
                                drawContext.getCanvas().restore();
                                drawContext.m4000setSizeuvyYCjk(j);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = m3999getSizeNHjbRc;
                        }
                    }
                    ((Extras.Key) drawScope.getDrawContext().path).translate(-f, -f2);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    ((Extras.Key) drawScope.getDrawContext().path).translate(-f, -f2);
                    throw th3;
                }
            case 1:
                OffsetQueryPagingSource offsetQueryPagingSource = (OffsetQueryPagingSource) obj3;
                PagingSource.LoadParams loadParams = (PagingSource.LoadParams) obj2;
                int intValue = ((Number) offsetQueryPagingSource.countQuery.executeAsOne()).intValue();
                if (loadParams instanceof PagingSource.LoadParams.Prepend) {
                    i5 = Math.max(0, i5 - ((PagingSource.LoadParams.Prepend) loadParams).loadSize);
                } else if (!(loadParams instanceof PagingSource.LoadParams.Append)) {
                    if (!(loadParams instanceof PagingSource.LoadParams.Refresh)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int i7 = intValue - ((PagingSource.LoadParams.Refresh) loadParams).loadSize;
                    if (i5 >= i7) {
                        i5 = Math.max(0, i7);
                    }
                }
                int i8 = i5;
                Query query = (Query) offsetQueryPagingSource.queryProvider.invoke(Integer.valueOf(i4), Integer.valueOf(i8));
                offsetQueryPagingSource.currentQuery$delegate.setValue(offsetQueryPagingSource, OffsetQueryPagingSource.$$delegatedProperties[0], query);
                List executeAsList = query.executeAsList();
                int size = executeAsList.size() + i8;
                return new PagingSource.LoadResult.Page(executeAsList, (i8 <= 0 || executeAsList.isEmpty()) ? null : Integer.valueOf(i8), (executeAsList.isEmpty() || executeAsList.size() < i4 || size >= intValue) ? null : Integer.valueOf(size), i8, Math.max(0, intValue - size));
            default:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.items$default(lazyListScope, i5, null, new ComposableLambdaImpl(new LoadableContentKt$$ExternalSyntheticLambda4(i4, (RecurringReloadConfigurationViewModel.SelectDay) obj3, (Function1) obj2), true, -557926636), 6);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SignaturesKt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = i2;
    }
}
