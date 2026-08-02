package ru.yandex.video.m3.ui.debug.compose;

import defpackage.imz;
import defpackage.iy40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import ru.yandex.video.m3.ui.debug.GraphData;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraphPreview$2$1", f = "LineGraph.kt", l = {351}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class LineGraphKt$LineGraphPreview$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $maxTsDelayMs;
    final /* synthetic */ long $maxValueOffset;
    final /* synthetic */ long $minTsDelayMs;
    final /* synthetic */ long $minValueOffset;
    final /* synthetic */ oz40 $points$delegate;
    final /* synthetic */ int $stopAddingDataThresholdSize;
    final /* synthetic */ iy40 $ts$delegate;
    final /* synthetic */ long $updateDataDelayMaxMs;
    final /* synthetic */ long $updateDataDelayMinMs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineGraphKt$LineGraphPreview$2$1(int i, long j, long j2, oz40 oz40Var, long j3, long j4, long j5, long j6, iy40 iy40Var, Continuation<? super LineGraphKt$LineGraphPreview$2$1> continuation) {
        super(2, continuation);
        this.$stopAddingDataThresholdSize = i;
        this.$updateDataDelayMinMs = j;
        this.$updateDataDelayMaxMs = j2;
        this.$points$delegate = oz40Var;
        this.$minTsDelayMs = j3;
        this.$maxTsDelayMs = j4;
        this.$minValueOffset = j5;
        this.$maxValueOffset = j6;
        this.$ts$delegate = iy40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new LineGraphKt$LineGraphPreview$2$1(this.$stopAddingDataThresholdSize, this.$updateDataDelayMinMs, this.$updateDataDelayMaxMs, this.$points$delegate, this.$minTsDelayMs, this.$maxTsDelayMs, this.$minValueOffset, this.$maxValueOffset, this.$ts$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((LineGraphKt$LineGraphPreview$2$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0040 -> B:5:0x0043). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List LineGraphPreview$lambda$27;
        List LineGraphPreview$lambda$272;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            LineGraphPreview$lambda$27 = LineGraphKt.LineGraphPreview$lambda$27(this.$points$delegate);
            if (LineGraphPreview$lambda$27.size() > this.$stopAddingDataThresholdSize) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            oz40 oz40Var = this.$points$delegate;
            LineGraphPreview$lambda$272 = LineGraphKt.LineGraphPreview$lambda$27(oz40Var);
            ArrayList arrayList = new ArrayList(LineGraphPreview$lambda$272);
            long j = this.$minTsDelayMs;
            long j2 = this.$maxTsDelayMs;
            long j3 = this.$minValueOffset;
            long j4 = this.$maxValueOffset;
            iy40 iy40Var = this.$ts$delegate;
            GraphData graphData = (GraphData) a.b0(arrayList);
            long timestamp = graphData == null ? graphData.getTimestamp() : iy40Var.getLongValue();
            imz imzVar = new imz(j, j2, false);
            Random.Default r4 = Random.a;
            arrayList.add(new GraphData(new Long(y6i0.k(new imz(j3, j4, false), r4)), timestamp - y6i0.k(imzVar, r4)));
            oz40Var.setValue(arrayList);
            LineGraphPreview$lambda$27 = LineGraphKt.LineGraphPreview$lambda$27(this.$points$delegate);
            if (LineGraphPreview$lambda$27.size() > this.$stopAddingDataThresholdSize) {
                return zy11.a;
            }
            long k = y6i0.k(new imz(this.$updateDataDelayMinMs, this.$updateDataDelayMaxMs, false), Random.a);
            this.label = 1;
            if (kotlinx.coroutines.a.i(k, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            oz40 oz40Var2 = this.$points$delegate;
            LineGraphPreview$lambda$272 = LineGraphKt.LineGraphPreview$lambda$27(oz40Var2);
            ArrayList arrayList2 = new ArrayList(LineGraphPreview$lambda$272);
            long j5 = this.$minTsDelayMs;
            long j22 = this.$maxTsDelayMs;
            long j32 = this.$minValueOffset;
            long j42 = this.$maxValueOffset;
            iy40 iy40Var2 = this.$ts$delegate;
            GraphData graphData2 = (GraphData) a.b0(arrayList2);
            if (graphData2 == null) {
            }
            imz imzVar2 = new imz(j5, j22, false);
            Random.Default r42 = Random.a;
            arrayList2.add(new GraphData(new Long(y6i0.k(new imz(j32, j42, false), r42)), timestamp - y6i0.k(imzVar2, r42)));
            oz40Var2.setValue(arrayList2);
            LineGraphPreview$lambda$27 = LineGraphKt.LineGraphPreview$lambda$27(this.$points$delegate);
            if (LineGraphPreview$lambda$27.size() > this.$stopAddingDataThresholdSize) {
            }
        }
    }
}
