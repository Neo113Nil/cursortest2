package androidx.compose.foundation.lazy;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sqlite.db.SupportSQLiteProgram;
import coil3.Extras;
import coil3.memory.RealWeakMemoryCache;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsPaymentMethodView;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.composeUi.foundation.layout.OutlineClipperScopeImpl$ClipSpec;
import com.squareup.cash.fidesmo.views.haptic.WaveformHapticPattern;
import com.squareup.cash.investing.components.categories.InvestingSubFilterSelection;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsView;
import com.squareup.cash.work.views.shift.HeaderGroupingState;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.wire.GrpcMethod;
import com.stripe.android.uicore.FocusManagerKtKt;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import okhttp3.internal.http2.Huffman;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import papa.AppUpdateData;

/* loaded from: classes3.dex */
public final /* synthetic */ class LazyListState$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LazyListState$$ExternalSyntheticLambda3(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        AndroidPath androidPath;
        int dip;
        int m3813getXdipTENr5nQ;
        int i2 = this.$r8$classId;
        long j = 0;
        int i3 = this.f$1;
        Object obj2 = this.f$0;
        switch (i2) {
            case 0:
                LazyLayoutPrefetchState.NestedPrefetchScopeImpl nestedPrefetchScopeImpl = (LazyLayoutPrefetchState.NestedPrefetchScopeImpl) obj;
                DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = ((LazyListState) obj2).prefetchStrategy;
                Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                zzg.restoreNonObservable(currentThreadSnapshot, zzg.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
                defaultLazyListPrefetchStrategy.getClass();
                int i4 = nestedPrefetchScopeImpl.nestedPrefetchItemCount;
                i = i4 != -1 ? i4 : 2;
                while (r10 < i) {
                    nestedPrefetchScopeImpl.schedulePrecomposition(i3 + r10);
                    r10++;
                }
                return Unit.INSTANCE;
            case 1:
                LazyLayoutPrefetchState.NestedPrefetchScopeImpl nestedPrefetchScopeImpl2 = (LazyLayoutPrefetchState.NestedPrefetchScopeImpl) obj;
                DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy2 = ((LazyGridState) obj2).prefetchStrategy;
                Snapshot currentThreadSnapshot2 = zzg.getCurrentThreadSnapshot();
                zzg.restoreNonObservable(currentThreadSnapshot2, zzg.makeCurrentNonObservable(currentThreadSnapshot2), currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null);
                defaultLazyListPrefetchStrategy2.getClass();
                int i5 = nestedPrefetchScopeImpl2.nestedPrefetchItemCount;
                i = i5 != -1 ? i5 : 2;
                while (r10 < i) {
                    nestedPrefetchScopeImpl2.schedulePrecomposition(i3 + r10);
                    r10++;
                }
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj2;
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                TextRange textRange = textFieldBuffer.composition;
                if (textRange != null) {
                    long j2 = textRange.packedValue;
                    MathUtilsKt.imeReplace(textFieldBuffer, (int) (j2 >> 32), (int) (j2 & BodyPartID.bodyIdMax), str);
                } else {
                    MathUtilsKt.imeReplace(textFieldBuffer, TextRange.m990getMinimpl(textFieldBuffer.selectionInChars), TextRange.m989getMaximpl(textFieldBuffer.selectionInChars), str);
                }
                int m990getMinimpl = TextRange.m990getMinimpl(textFieldBuffer.selectionInChars);
                int coerceIn = RangesKt___RangesKt.coerceIn(i3 > 0 ? (m990getMinimpl + i3) - 1 : (m990getMinimpl + i3) - str.length(), 0, textFieldBuffer.buffer.length());
                textFieldBuffer.m379setSelection5zctL8(SizeKt.TextRange(coerceIn, coerceIn));
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf(((List) obj).addAll(i3, (Collection) obj2));
            case 4:
                byte[] bArr = (byte[]) obj2;
                SupportSQLiteProgram supportSQLiteProgram = (SupportSQLiteProgram) obj;
                supportSQLiteProgram.getClass();
                int i6 = i3 + 1;
                if (bArr == null) {
                    supportSQLiteProgram.bindNull(i6);
                } else {
                    supportSQLiteProgram.bindBlob(i6, bArr);
                }
                return Unit.INSTANCE;
            case 5:
                Boolean bool = (Boolean) obj2;
                SupportSQLiteProgram supportSQLiteProgram2 = (SupportSQLiteProgram) obj;
                supportSQLiteProgram2.getClass();
                if (bool == null) {
                    supportSQLiteProgram2.bindNull(i3 + 1);
                } else {
                    supportSQLiteProgram2.bindLong(i3 + 1, bool.booleanValue() ? 1L : 0L);
                }
                return Unit.INSTANCE;
            case 6:
                Double d = (Double) obj2;
                SupportSQLiteProgram supportSQLiteProgram3 = (SupportSQLiteProgram) obj;
                supportSQLiteProgram3.getClass();
                int i7 = i3 + 1;
                if (d == null) {
                    supportSQLiteProgram3.bindNull(i7);
                } else {
                    supportSQLiteProgram3.bindDouble(i7, d.doubleValue());
                }
                return Unit.INSTANCE;
            case 7:
                SignatureState signatureState = (SignatureState) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float f = -Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() >> 32));
                float f2 = -Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax));
                ((Extras.Key) drawScope.getDrawContext().path).translate(f, f2);
                try {
                    signatureState.getInvalidate$customizations();
                    Signature signature$customizations = signatureState.getSignature$customizations();
                    AndroidImageBitmap androidImageBitmap = signature$customizations != null ? new AndroidImageBitmap(signature$customizations.getBitmap()) : null;
                    if (androidImageBitmap != null) {
                        AndroidPath clipPath$customizations = signatureState.getClipPath$customizations();
                        GrpcMethod drawContext = drawScope.getDrawContext();
                        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            ((Extras.Key) drawContext.path).m1434clipPathmtrdDE(clipPath$customizations, 1);
                            long Color = ColorKt.Color(i3);
                            DrawScope.m740drawImagegbVJVH8$default(drawScope, androidImageBitmap, 0L, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(Color, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m693toAndroidBlendModes9anfk8(5))), 0, 46);
                            drawContext.getCanvas().restore();
                            drawContext.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
                        } catch (Throwable th) {
                            drawContext.getCanvas().restore();
                            drawContext.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
                            throw th;
                        }
                    }
                    ((Extras.Key) drawScope.getDrawContext().path).translate(-f, -f2);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    ((Extras.Key) drawScope.getDrawContext().path).translate(-f, -f2);
                    throw th2;
                }
            case 8:
                AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView = (AfterPayOrderDetailsPaymentMethodView) obj2;
                return new YInt((i3 * 2) + Math.max(afterPayOrderDetailsPaymentMethodView.m3815heightdBGyhoQ(afterPayOrderDetailsPaymentMethodView.cardIcon), afterPayOrderDetailsPaymentMethodView.m3815heightdBGyhoQ(afterPayOrderDetailsPaymentMethodView.paymentDetails) + afterPayOrderDetailsPaymentMethodView.m3815heightdBGyhoQ(afterPayOrderDetailsPaymentMethodView.paymentName)));
            case 9:
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                cacheDrawScope.getClass();
                LinkedHashMap linkedHashMap = ((RealWeakMemoryCache) obj2).cache;
                Object obj3 = linkedHashMap.get(Integer.valueOf(i3));
                obj3.getClass();
                OutlineClipperScopeImpl$ClipSpec outlineClipperScopeImpl$ClipSpec = (OutlineClipperScopeImpl$ClipSpec) obj3;
                AndroidPath Path = AndroidPath_androidKt.Path();
                int i8 = i3 + 1;
                int size = linkedHashMap.size();
                while (i8 < size) {
                    OutlineClipperScopeImpl$ClipSpec outlineClipperScopeImpl$ClipSpec2 = (OutlineClipperScopeImpl$ClipSpec) linkedHashMap.get(Integer.valueOf(i8));
                    if (outlineClipperScopeImpl$ClipSpec2 != null) {
                        LayoutCoordinates layoutCoordinates = outlineClipperScopeImpl$ClipSpec2.layoutCoordinates;
                        if (layoutCoordinates.isAttached()) {
                            float density = cacheDrawScope.getDensity() * outlineClipperScopeImpl$ClipSpec2.clipGap;
                            AndroidPath Path2 = AndroidPath_androidKt.Path();
                            long m625minusMKHz9U = Offset.m625minusMKHz9U(outlineClipperScopeImpl$ClipSpec.layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates, j), (Float.floatToRawIntBits(density) << 32) | (Float.floatToRawIntBits(density) & BodyPartID.bodyIdMax));
                            long mo838getSizeYbymL2g = layoutCoordinates.mo838getSizeYbymL2g();
                            float f3 = density * 2.0f;
                            ColorKt.addOutline(Path2, outlineClipperScopeImpl$ClipSpec2.clipShape.mo175createOutlinePq9zytI((Float.floatToRawIntBits(((int) (mo838getSizeYbymL2g & BodyPartID.bodyIdMax)) + f3) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(((int) (mo838getSizeYbymL2g >> 32)) + f3) << 32), LayoutDirection.Ltr, SizeKt.Density$default()));
                            Path2.m667translatek4lQ0M(m625minusMKHz9U);
                            androidPath = Path;
                            AndroidPath.m664addPathUv8p0NA$default(androidPath, Path2);
                            i8++;
                            Path = androidPath;
                            j = 0;
                        }
                    }
                    androidPath = Path;
                    i8++;
                    Path = androidPath;
                    j = 0;
                }
                return cacheDrawScope.onDrawWithContent(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(Path, 26));
            case 10:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                float floatValue = ((ParcelableSnapshotMutableFloatState) ((PagerState) obj2).scrollPosition.fieldSortOrder).getFloatValue() + (((ParcelableSnapshotMutableIntState) r0.scrollPosition.elementTypes).getIntValue() - i3);
                float f4 = RecyclerView.DECELERATION_RATE;
                r10 = floatValue < RecyclerView.DECELERATION_RATE ? 1 : 0;
                float transform = EasingKt.FastOutLinearInEasing.transform(Math.abs(floatValue));
                float f5 = r10 != 0 ? 90.0f : -90.0f;
                reusableGraphicsLayerScope.setRotationY(Math.min(transform * f5, Math.abs(f5)));
                if (r10 == 0) {
                    f4 = 1.0f;
                }
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(ColorKt.TransformOrigin(f4, 0.5f));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj).getClass();
                InputStream openRawResource = ((Context) obj2).getResources().openRawResource(i3);
                openRawResource.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), PKIFailureInfo.certRevoked);
                try {
                    String readText = AppUpdateData.readText(bufferedReader);
                    bufferedReader.close();
                    JSONObject jSONObject = new JSONObject(readText);
                    String string2 = jSONObject.getString("name");
                    JSONArray jSONArray = jSONObject.getJSONArray("timings");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("amplitudes");
                    int optInt = jSONObject.optInt("repeat", -1);
                    int length = jSONArray.length();
                    long[] jArr = new long[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        jArr[i9] = jSONArray.getLong(i9);
                    }
                    int length2 = jSONArray2.length();
                    int[] iArr = new int[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        iArr[i10] = RangesKt___RangesKt.coerceIn(jSONArray2.getInt(i10), 0, 255);
                    }
                    string2.getClass();
                    return new WaveformHapticPattern(string2, jArr, iArr, optInt);
                } finally {
                }
            case 12:
                InvestingSubFilterSelection investingSubFilterSelection = (InvestingSubFilterSelection) obj2;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                int i11 = InvestingSubFilterSelection.$r8$clinit;
                layoutSpec.getClass();
                if (i3 == 0) {
                    dip = layoutSpec.getParent().padding().left;
                } else {
                    View childAt = investingSubFilterSelection.getChildAt(i3);
                    childAt.getClass();
                    dip = investingSubFilterSelection.getDip(8) + investingSubFilterSelection.m3818rightTENr5nQ(childAt);
                }
                return new XInt(dip);
            case 13:
                InvestingGraphTabsView investingGraphTabsView = (InvestingGraphTabsView) obj2;
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                int i12 = InvestingGraphTabsView.$r8$clinit;
                layoutSpec2.getClass();
                if (i3 == 0) {
                    m3813getXdipTENr5nQ = (((int) (investingGraphTabsView.m3813getXdipTENr5nQ(100) / investingGraphTabsView.getContext().getResources().getConfiguration().fontScale)) / 2) + layoutSpec2.getParent().padding().left;
                } else {
                    View childAt2 = investingGraphTabsView.getChildAt(i3 - 1);
                    childAt2.getClass();
                    int m3818rightTENr5nQ = investingGraphTabsView.m3818rightTENr5nQ(childAt2);
                    int resolve = ((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve();
                    IntProgressionIterator it = RangesKt___RangesKt.until(0, investingGraphTabsView.getChildCount()).iterator();
                    while (it.hasNext) {
                        View childAt3 = investingGraphTabsView.getChildAt(it.nextInt());
                        childAt3.getClass();
                        r10 += investingGraphTabsView.m3820widthTENr5nQ(childAt3);
                    }
                    m3813getXdipTENr5nQ = (((resolve - r10) - ((int) (investingGraphTabsView.m3813getXdipTENr5nQ(100) / investingGraphTabsView.getContext().getResources().getConfiguration().fontScale))) / (investingGraphTabsView.getChildCount() - 1)) + m3818rightTENr5nQ;
                }
                return new XInt(m3813getXdipTENr5nQ);
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) ((HeaderGroupingState) obj2).headerTexts.get(i3));
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            default:
                ((KeyboardActionScope) obj).getClass();
                FocusManagerKtKt.m4065moveFocusSafelyMxy_nc0((FocusOwnerImpl) obj2, i3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LazyListState$$ExternalSyntheticLambda3(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
