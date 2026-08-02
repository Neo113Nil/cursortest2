package com.squareup.cash.card.onboarding.core.instancing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.internal.ViewUtils;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class InstancedCardBatch$setUniqueCards$8 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List $viewModels;
    public int label;
    public final /* synthetic */ InstancedCardBatch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstancedCardBatch$setUniqueCards$8(InstancedCardBatch instancedCardBatch, List list, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = instancedCardBatch;
        this.$viewModels = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        List list = this.$viewModels;
        InstancedCardBatch instancedCardBatch = this.this$0;
        switch (i) {
            case 0:
                return new InstancedCardBatch$setUniqueCards$8(instancedCardBatch, list, continuation, 0);
            case 1:
                return new InstancedCardBatch$setUniqueCards$8(instancedCardBatch, list, continuation, 1);
            case 2:
                return new InstancedCardBatch$setUniqueCards$8(instancedCardBatch, list, continuation, 2);
            case 3:
                return new InstancedCardBatch$setUniqueCards$8(instancedCardBatch, list, continuation, 3);
            case 4:
                return new InstancedCardBatch$setUniqueCards$8(instancedCardBatch, list, continuation, 4);
            default:
                return new InstancedCardBatch$setUniqueCards$8(instancedCardBatch, list, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((InstancedCardBatch$setUniqueCards$8) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        String format2;
        String format3;
        String format4;
        String format5;
        String format6;
        String format7;
        String format8;
        String format9;
        String format10;
        String format11;
        String format12;
        int i = this.$r8$classId;
        List list = this.$viewModels;
        InstancedCardBatch instancedCardBatch = this.this$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Context context = instancedCardBatch.context;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (instancedCardBatch.hasMoodCards && instancedCardBatch.heatMaskRenderer == null) {
                        HeatMaskRenderer heatMaskRenderer = new HeatMaskRenderer(null, new InstancedCardBatch$$ExternalSyntheticLambda0(instancedCardBatch, i2), new InvalidationTracker$$ExternalSyntheticLambda0(23), new HeatMaskRenderer.Config());
                        heatMaskRenderer.initialize();
                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.card_mood_hand_heat_map);
                        if (decodeResource != null) {
                            heatMaskRenderer.renderBitmapToHeatMask(decodeResource);
                            decodeResource.recycle();
                        }
                        instancedCardBatch.heatMaskRenderer = heatMaskRenderer;
                        Timber.Forest.d("Initialized HeatMaskRenderer for Mood cards", new Object[0]);
                    }
                    this.label = 1;
                    if (JobKt.yield(this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (instancedCardBatch.heatColorsTextureId == 0) {
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.temperature_map);
                    decodeResource2.getClass();
                    instancedCardBatch.heatColorsTextureId = instancedCardBatch.uploadTexture2D(decodeResource2);
                }
                if (instancedCardBatch.shimmerTextureId == 0) {
                    instancedCardBatch.shimmerTextureId = instancedCardBatch.uploadTexture2D(CardsKt.cardShimmerGradient$default(context));
                }
                if (instancedCardBatch.snakeSkinTextureId == 0) {
                    Bitmap decodeResource3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.snake_skin_texture);
                    decodeResource3.getClass();
                    instancedCardBatch.snakeSkinTextureId = instancedCardBatch.uploadTexture2D(decodeResource3);
                }
                if (instancedCardBatch.placeholderTextureId == 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    createBitmap.eraseColor(-16777216);
                    instancedCardBatch.placeholderTextureId = instancedCardBatch.uploadTexture2D(createBitmap);
                }
                StateFlowImpl stateFlowImpl = instancedCardBatch._texturesReady;
                Boolean bool = Boolean.TRUE;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool);
                instancedCardBatch.recomputeReady();
                instancedCardBatch._loadedCardIndices.setValue(CollectionsKt.toSet(CollectionsKt__CollectionsKt.getIndices(list)));
                ViewUtils.RelativePadding relativePadding = instancedCardBatch.albedoArray;
                long gpuMemoryBytes = relativePadding.getGpuMemoryBytes();
                ViewUtils.RelativePadding relativePadding2 = instancedCardBatch.normalArray;
                long gpuMemoryBytes2 = relativePadding2.getGpuMemoryBytes() + gpuMemoryBytes;
                ViewUtils.RelativePadding relativePadding3 = instancedCardBatch.inkMetalHeatArray;
                long gpuMemoryBytes3 = relativePadding3.getGpuMemoryBytes() + gpuMemoryBytes2;
                ViewUtils.RelativePadding relativePadding4 = instancedCardBatch.holoBaseArray;
                long gpuMemoryBytes4 = relativePadding4.getGpuMemoryBytes() + gpuMemoryBytes3;
                ViewUtils.RelativePadding relativePadding5 = instancedCardBatch.holoReflectArray;
                long gpuMemoryBytes5 = relativePadding5.getGpuMemoryBytes() + gpuMemoryBytes4;
                MeshGeometry meshGeometry = instancedCardBatch.sharedGeometry;
                if (meshGeometry != null) {
                    long j2 = meshGeometry.indexCount;
                    j = ((j2 / 6) * 56) + (4 * j2);
                } else {
                    j = 0;
                }
                long j3 = instancedCardBatch.heatMaskRenderer != null ? 778240L : 0L;
                long j4 = instancedCardBatch.sharedTextureMemoryBytes + gpuMemoryBytes5 + j + 24000 + j3;
                StringBuilder sb = new StringBuilder("=== InstancedCardBatch GPU Memory ===\n");
                format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(gpuMemoryBytes5 / 1048576.0d)}, 1));
                sb.append("  Texture arrays:    " + format2 + " MB");
                sb.append('\n');
                String description = relativePadding.getDescription();
                format3 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(relativePadding.getGpuMemoryBytes() / 1048576.0d)}, 1));
                sb.append(Boxes$$ExternalSyntheticOutline1.m("    albedo:          ", description, " (", format3, " MB)"));
                sb.append('\n');
                String description2 = relativePadding2.getDescription();
                format4 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(relativePadding2.getGpuMemoryBytes() / 1048576.0d)}, 1));
                sb.append(Boxes$$ExternalSyntheticOutline1.m("    normal:          ", description2, " (", format4, " MB)"));
                sb.append('\n');
                String description3 = relativePadding3.getDescription();
                format5 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(relativePadding3.getGpuMemoryBytes() / 1048576.0d)}, 1));
                sb.append(Boxes$$ExternalSyntheticOutline1.m("    inkMetalHeat:    ", description3, " (", format5, " MB)"));
                sb.append('\n');
                String description4 = relativePadding4.getDescription();
                format6 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(relativePadding4.getGpuMemoryBytes() / 1048576.0d)}, 1));
                sb.append(Boxes$$ExternalSyntheticOutline1.m("    holoBase:        ", description4, " (", format6, " MB)"));
                sb.append('\n');
                String description5 = relativePadding5.getDescription();
                format7 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(relativePadding5.getGpuMemoryBytes() / 1048576.0d)}, 1));
                sb.append(Boxes$$ExternalSyntheticOutline1.m("    holoReflect:     ", description5, " (", format7, " MB)"));
                sb.append('\n');
                format8 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(instancedCardBatch.sharedTextureMemoryBytes / 1048576.0d)}, 1));
                sb.append("  Shared textures:   " + format8 + " MB");
                sb.append('\n');
                format9 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
                sb.append("  Geometry (mesh):   " + format9 + " MB");
                sb.append('\n');
                format10 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(24000 / 1048576.0d)}, 1));
                sb.append("  Instance buffers:  " + format10 + " MB");
                sb.append('\n');
                format11 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j3 / 1048576.0d)}, 1));
                sb.append("  Heat mask:         " + format11 + " MB");
                sb.append("\n  ─────────────────────────\n");
                format12 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j4 / 1048576.0d)}, 1));
                sb.append("  TOTAL GPU:         " + format12 + " MB");
                Timber.Forest.d(sb.toString(), new Object[0]);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ViewUtils.RelativePadding relativePadding6 = instancedCardBatch.inkMetalHeatArray;
                    this.label = 1;
                    if (relativePadding6.uploadInternal(list, 33071, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ViewUtils.RelativePadding relativePadding7 = instancedCardBatch.holoBaseArray;
                    this.label = 1;
                    if (relativePadding7.uploadInternal(list, 33071, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ViewUtils.RelativePadding relativePadding8 = instancedCardBatch.holoReflectArray;
                    this.label = 1;
                    if (relativePadding8.uploadInternal(list, 10497, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ViewUtils.RelativePadding relativePadding9 = instancedCardBatch.albedoArray;
                    this.label = 1;
                    if (relativePadding9.uploadInternal(list, 33071, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ViewUtils.RelativePadding relativePadding10 = instancedCardBatch.normalArray;
                    this.label = 1;
                    if (relativePadding10.uploadInternal(list, 33071, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
