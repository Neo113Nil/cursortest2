package androidx.compose.foundation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.zipline.loader.ZiplineCache;
import app.cash.zipline.loader.internal.cache.FileState;
import app.cash.zipline.loader.internal.cache.Files;
import app.cash.zipline.loader.internal.cache.FilesQueries;
import app.cash.zipline.loader.internal.cache.FilesQueries$$ExternalSyntheticLambda4;
import app.cash.zipline.loader.internal.cache.FilesQueries$getById$2;
import app.cash.zipline.loader.internal.cache.ziplineloader.DatabaseImpl;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.arcade.components.timeline.RenderedRow;
import com.squareup.cash.arcade.components.timeline.RowDrawCache;
import com.squareup.cash.arcade.components.timeline.ShowMoreCache;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.VisibleItemDrawCache;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class BorderKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ BorderKt$$ExternalSyntheticLambda0(long j, long j2, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 4;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$0 = mutableState;
        this.f$3 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        RowDrawCache.Line line;
        RenderedRow renderedRow;
        Offset offset;
        Iterator it;
        State state;
        long j;
        RowDrawCache.Line line2;
        RowDrawCache showMoreCache;
        float f2;
        RowDrawCache.Line line3;
        int i = this.$r8$classId;
        float f3 = 2.0f;
        Object obj2 = this.f$3;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                DrawStyle drawStyle = (DrawStyle) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.drawContent();
                DrawScope.m746drawRectAsUm42w$default(layoutNodeDrawScope, (Brush) obj3, this.f$1, this.f$2, RecyclerView.DECELERATION_RATE, drawStyle, null, 0, 104);
                return Unit.INSTANCE;
            case 1:
                Files files = (Files) obj2;
                ((TransactionWrapper) obj).getClass();
                long j2 = files.id;
                DatabaseImpl databaseImpl = ((ZiplineCache) obj3).database;
                FilesQueries filesQueries = databaseImpl.filesQueries;
                filesQueries.getClass();
                FilesQueries$getById$2 filesQueries$getById$2 = FilesQueries$getById$2.INSTANCE;
                Files files2 = (Files) new OffersHomeQueries$ForIdQuery(filesQueries, j2, new FilesQueries$$ExternalSyntheticLambda4(filesQueries, 4), 1).executeAsOneOrNull();
                if ((files2 != null ? files2.file_state : null) == FileState.DIRTY) {
                    databaseImpl.filesQueries.update(FileState.READY, this.f$1, this.f$2, files.id);
                    return Unit.INSTANCE;
                }
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[fileName=", files.sha256_hex, "] can not be set to READY, it is not DIRTY. Could multiple processes be sharing a cache?"));
                return null;
            case 2:
                AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar = (AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar) obj3;
                Animatable animatable = (Animatable) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(8.0f);
                float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                drawScope.mo729drawLineNGM6Ib0(this.f$1, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : mo236toPx0680j_4, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                if ((progressBar.isMoneyBarAnimationEnabled ? ((Number) animatable.getValue()).floatValue() : progressBar.progress) > RecyclerView.DECELERATION_RATE) {
                    drawScope.mo729drawLineNGM6Ib0(this.f$2, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(r2 * intBitsToFloat) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : mo236toPx0680j_4, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            case 3:
                State state2 = (State) obj2;
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                cacheDrawScope.getClass();
                final float density = cacheDrawScope.getDensity() * 12.0f;
                float f4 = density / 2.0f;
                float density2 = cacheDrawScope.getDensity() * 24.0f;
                final float density3 = cacheDrawScope.getDensity() * 2.0f;
                final float f5 = density - density3;
                float m = Recorder$$ExternalSyntheticOutline2.m(density, f5, 2.0f, density2);
                final float density4 = cacheDrawScope.getDensity() * 2.0f;
                float f6 = density2 + f4;
                float density5 = cacheDrawScope.getDensity() * 4.0f;
                final float density6 = cacheDrawScope.getDensity() * 4.0f;
                float f7 = density6 / 2.0f;
                float density7 = cacheDrawScope.getDensity() * 4.0f;
                List list = (List) ((State) obj3).getValue();
                final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                int i2 = 0;
                Float f8 = null;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    RenderedRow renderedRow2 = (RenderedRow) next;
                    float f9 = f3;
                    Float f10 = (Float) ((Map) state2.getValue()).get(Integer.valueOf(i2));
                    float floatValue = f10 != null ? f10.floatValue() : RecyclerView.DECELERATION_RATE;
                    if (f8 != null) {
                        float floatValue2 = f8.floatValue() + density5;
                        line = null;
                        f = floatValue;
                        offset = new Offset((Float.floatToRawIntBits(floatValue2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f6) << 32));
                        renderedRow = renderedRow2;
                    } else {
                        f = floatValue;
                        line = null;
                        renderedRow = renderedRow2;
                        offset = null;
                    }
                    if (renderedRow instanceof RenderedRow.VisibleItem) {
                        float f11 = f - f4;
                        if (offset != null) {
                            state = state2;
                            it = it2;
                            line3 = new RowDrawCache.Line(offset.packedValue, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f11 - density5) & BodyPartID.bodyIdMax));
                        } else {
                            it = it2;
                            state = state2;
                            line3 = line;
                        }
                        f2 = f + f4;
                        showMoreCache = new VisibleItemDrawCache(((RenderedRow.VisibleItem) renderedRow).item.state, (Float.floatToRawIntBits(density2) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(m) << 32) | (Float.floatToRawIntBits((density3 / f9) + f11) & BodyPartID.bodyIdMax), line3);
                    } else {
                        it = it2;
                        state = state2;
                        if (!(renderedRow instanceof RenderedRow.Collapsed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return line;
                        }
                        long floatToRawIntBits = (Float.floatToRawIntBits(f6 - f7) << 32) | (Float.floatToRawIntBits(f - f7) & BodyPartID.bodyIdMax);
                        int i4 = (int) (floatToRawIntBits & BodyPartID.bodyIdMax);
                        long m620copydBAh8RU$default = Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, (Float.intBitsToFloat(i4) - density6) - density7, 1, floatToRawIntBits);
                        long m620copydBAh8RU$default2 = Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat(i4) + density6 + density7, 1, floatToRawIntBits);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (m620copydBAh8RU$default2 & BodyPartID.bodyIdMax)) + density6;
                        if (offset != null) {
                            j = floatToRawIntBits;
                            line2 = new RowDrawCache.Line(offset.packedValue, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (m620copydBAh8RU$default & BodyPartID.bodyIdMax)) - density5) & BodyPartID.bodyIdMax));
                        } else {
                            j = floatToRawIntBits;
                            line2 = line;
                        }
                        showMoreCache = new ShowMoreCache(line2, m620copydBAh8RU$default, j, m620copydBAh8RU$default2);
                        f2 = intBitsToFloat2;
                    }
                    RowDrawCache rowDrawCache = showMoreCache;
                    Float valueOf = Float.valueOf(f2);
                    arrayList.add(rowDrawCache);
                    f8 = valueOf;
                    i2 = i3;
                    f3 = f9;
                    state2 = state;
                    it2 = it;
                }
                final long j3 = this.f$1;
                final long j4 = this.f$2;
                return cacheDrawScope.onDrawWithContent(new CacheDrawScope$onDrawBehind$1(0, new Function1() { // from class: com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        Object obj5;
                        long j5;
                        VisibleItemDrawCache visibleItemDrawCache;
                        TimelineItem.State state3;
                        long j6;
                        TimelineItem.State state4;
                        long j7;
                        DrawScope drawScope2 = (DrawScope) obj4;
                        drawScope2.getClass();
                        Object obj6 = null;
                        TimelineItem.State state5 = null;
                        for (RowDrawCache rowDrawCache2 : arrayList) {
                            boolean z = rowDrawCache2 instanceof VisibleItemDrawCache;
                            long j8 = j3;
                            long j9 = j4;
                            float f12 = density4;
                            if (z) {
                                VisibleItemDrawCache visibleItemDrawCache2 = (VisibleItemDrawCache) rowDrawCache2;
                                TimelineItem.State state6 = visibleItemDrawCache2.state;
                                int ordinal = state6.ordinal();
                                float f13 = density;
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        j7 = j8;
                                        obj5 = obj6;
                                        visibleItemDrawCache = visibleItemDrawCache2;
                                        state3 = state6;
                                        DrawScope.m743drawOvalnJ9OG0$default(drawScope2, j9, visibleItemDrawCache.strokeTopLeft, (Float.floatToRawIntBits(r4) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f5) << 32), new Stroke(density3, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 104);
                                    } else {
                                        if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return obj6;
                                        }
                                        long floatToRawIntBits2 = Float.floatToRawIntBits(f13);
                                        j7 = j8;
                                        obj5 = obj6;
                                        visibleItemDrawCache = visibleItemDrawCache2;
                                        state3 = state6;
                                        DrawScope.m743drawOvalnJ9OG0$default(drawScope2, j9, visibleItemDrawCache2.fillTopLeft, (Float.floatToRawIntBits(f13) & BodyPartID.bodyIdMax) | (floatToRawIntBits2 << 32), null, 120);
                                    }
                                    j5 = j9;
                                    j6 = j7;
                                } else {
                                    j5 = j9;
                                    obj5 = obj6;
                                    visibleItemDrawCache = visibleItemDrawCache2;
                                    state3 = state6;
                                    j6 = j8;
                                    DrawScope.m743drawOvalnJ9OG0$default(drawScope2, j6, visibleItemDrawCache.fillTopLeft, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & BodyPartID.bodyIdMax), null, 120);
                                }
                                RowDrawCache.Line line4 = visibleItemDrawCache.line;
                                if (line4 != null) {
                                    TimelineItem.State state7 = TimelineItem.State.NotStarted;
                                    if (state5 != state7 && state3 != state7) {
                                        j6 = j5;
                                    }
                                    state4 = state3;
                                    drawScope2.mo729drawLineNGM6Ib0(j6, line4.start, line4.end, (r23 & 8) != 0 ? 0.0f : f12, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                } else {
                                    state4 = state3;
                                }
                                state5 = state4;
                            } else {
                                long j10 = j8;
                                obj5 = obj6;
                                if (!(rowDrawCache2 instanceof ShowMoreCache)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj5;
                                }
                                if (state5 != TimelineItem.State.NotStarted) {
                                    j10 = j9;
                                }
                                ShowMoreCache showMoreCache2 = (ShowMoreCache) rowDrawCache2;
                                RowDrawCache.Line line5 = showMoreCache2.line;
                                if (line5 != null) {
                                    drawScope2.mo729drawLineNGM6Ib0(j10, line5.start, line5.end, (r23 & 8) != 0 ? 0.0f : f12, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                }
                                long j11 = showMoreCache2.dot1;
                                float f14 = density6;
                                DrawScope.m743drawOvalnJ9OG0$default(drawScope2, j10, j11, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & BodyPartID.bodyIdMax), null, 120);
                                DrawScope.m743drawOvalnJ9OG0$default(drawScope2, j10, showMoreCache2.dot2, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & BodyPartID.bodyIdMax), null, 120);
                                DrawScope.m743drawOvalnJ9OG0$default(drawScope2, j10, showMoreCache2.dot3, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & BodyPartID.bodyIdMax), null, 120);
                            }
                            obj6 = obj5;
                        }
                        return Unit.INSTANCE;
                    }
                }));
            default:
                MutableState mutableState = (MutableState) obj2;
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope2, this.f$1, drawScope2.mo236toPx0680j_4(31.0f), 0L, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                if (!((Boolean) ((MutableState) obj3).getValue()).booleanValue() && ((Boolean) mutableState.getValue()).booleanValue()) {
                    DrawScope.m738drawCircleVaOC9Bg$default(drawScope2, this.f$2, RecyclerView.DECELERATION_RATE, 0L, new Stroke(drawScope2.mo236toPx0680j_4(2.0f), RecyclerView.DECELERATION_RATE, 1, 0, null, 26), 0, 110);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BorderKt$$ExternalSyntheticLambda0(long j, AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar, Animatable animatable, long j2) {
        this.$r8$classId = 2;
        this.f$1 = j;
        this.f$0 = progressBar;
        this.f$3 = animatable;
        this.f$2 = j2;
    }

    public /* synthetic */ BorderKt$$ExternalSyntheticLambda0(Brush brush, long j, long j2, DrawStyle drawStyle) {
        this.$r8$classId = 0;
        this.f$0 = brush;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = drawStyle;
    }

    public /* synthetic */ BorderKt$$ExternalSyntheticLambda0(Object obj, Object obj2, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$1 = j;
        this.f$2 = j2;
    }
}
