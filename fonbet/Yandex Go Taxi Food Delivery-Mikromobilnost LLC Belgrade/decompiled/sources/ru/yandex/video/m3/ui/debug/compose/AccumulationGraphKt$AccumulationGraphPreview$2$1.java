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
@mvg(c = "ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraphPreview$2$1", f = "AccumulationGraph.kt", l = {473}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class AccumulationGraphKt$AccumulationGraphPreview$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $maxTsDelayMs;
    final /* synthetic */ long $maxValueOffset;
    final /* synthetic */ long $minTsDelayMs;
    final /* synthetic */ long $minValueOffset;
    final /* synthetic */ int $numOfGraph;
    final /* synthetic */ oz40 $pointsGroup$delegate;
    final /* synthetic */ int $stopAddingDataThresholdSize;
    final /* synthetic */ iy40 $ts$delegate;
    final /* synthetic */ long $updateDataDelayMaxMs;
    final /* synthetic */ long $updateDataDelayMinMs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccumulationGraphKt$AccumulationGraphPreview$2$1(int i, long j, long j2, long j3, long j4, int i2, oz40 oz40Var, iy40 iy40Var, long j5, long j6, Continuation<? super AccumulationGraphKt$AccumulationGraphPreview$2$1> continuation) {
        super(2, continuation);
        this.$stopAddingDataThresholdSize = i;
        this.$updateDataDelayMinMs = j;
        this.$updateDataDelayMaxMs = j2;
        this.$minTsDelayMs = j3;
        this.$maxTsDelayMs = j4;
        this.$numOfGraph = i2;
        this.$pointsGroup$delegate = oz40Var;
        this.$ts$delegate = iy40Var;
        this.$minValueOffset = j5;
        this.$maxValueOffset = j6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new AccumulationGraphKt$AccumulationGraphPreview$2$1(this.$stopAddingDataThresholdSize, this.$updateDataDelayMinMs, this.$updateDataDelayMaxMs, this.$minTsDelayMs, this.$maxTsDelayMs, this.$numOfGraph, this.$pointsGroup$delegate, this.$ts$delegate, this.$minValueOffset, this.$maxValueOffset, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((AccumulationGraphKt$AccumulationGraphPreview$2$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x004b -> B:5:0x004e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List AccumulationGraphPreview$lambda$38;
        List list;
        List AccumulationGraphPreview$lambda$382;
        List AccumulationGraphPreview$lambda$383;
        GraphData graphData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            AccumulationGraphPreview$lambda$38 = AccumulationGraphKt.AccumulationGraphPreview$lambda$38(this.$pointsGroup$delegate);
            list = (List) a.R(AccumulationGraphPreview$lambda$38);
            if ((list != null ? list.size() : this.$stopAddingDataThresholdSize) >= this.$stopAddingDataThresholdSize) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            ArrayList arrayList = new ArrayList();
            AccumulationGraphPreview$lambda$382 = AccumulationGraphKt.AccumulationGraphPreview$lambda$38(this.$pointsGroup$delegate);
            List list2 = (List) a.R(AccumulationGraphPreview$lambda$382);
            long longValue = ((list2 != null || (graphData = (GraphData) a.b0(list2)) == null) ? this.$ts$delegate.getLongValue() : graphData.getTimestamp()) - y6i0.k(new imz(this.$minTsDelayMs, this.$maxTsDelayMs, false), Random.a);
            int i3 = this.$numOfGraph;
            oz40 oz40Var = this.$pointsGroup$delegate;
            long j = this.$minValueOffset;
            long j2 = this.$maxValueOffset;
            int i4 = 0;
            while (i4 < i3) {
                AccumulationGraphPreview$lambda$383 = AccumulationGraphKt.AccumulationGraphPreview$lambda$38(oz40Var);
                List list3 = (List) a.S(i4, AccumulationGraphPreview$lambda$383);
                ArrayList arrayList2 = list3 != null ? new ArrayList(list3) : new ArrayList();
                long j3 = longValue;
                arrayList2.add(new GraphData(new Long(y6i0.k(new imz(j, j2, false), Random.a)), j3));
                arrayList.add(a.J0(arrayList2));
                i4++;
                longValue = j3;
            }
            this.$pointsGroup$delegate.setValue(a.J0(arrayList));
            i2 = 1;
            AccumulationGraphPreview$lambda$38 = AccumulationGraphKt.AccumulationGraphPreview$lambda$38(this.$pointsGroup$delegate);
            list = (List) a.R(AccumulationGraphPreview$lambda$38);
            if ((list != null ? list.size() : this.$stopAddingDataThresholdSize) >= this.$stopAddingDataThresholdSize) {
                return zy11.a;
            }
            long k = y6i0.k(new imz(this.$updateDataDelayMinMs, this.$updateDataDelayMaxMs, false), Random.a);
            this.label = i2;
            if (kotlinx.coroutines.a.i(k, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ArrayList arrayList3 = new ArrayList();
            AccumulationGraphPreview$lambda$382 = AccumulationGraphKt.AccumulationGraphPreview$lambda$38(this.$pointsGroup$delegate);
            List list22 = (List) a.R(AccumulationGraphPreview$lambda$382);
            long longValue2 = ((list22 != null || (graphData = (GraphData) a.b0(list22)) == null) ? this.$ts$delegate.getLongValue() : graphData.getTimestamp()) - y6i0.k(new imz(this.$minTsDelayMs, this.$maxTsDelayMs, false), Random.a);
            int i32 = this.$numOfGraph;
            oz40 oz40Var2 = this.$pointsGroup$delegate;
            long j4 = this.$minValueOffset;
            long j22 = this.$maxValueOffset;
            int i42 = 0;
            while (i42 < i32) {
            }
            this.$pointsGroup$delegate.setValue(a.J0(arrayList3));
            i2 = 1;
            AccumulationGraphPreview$lambda$38 = AccumulationGraphKt.AccumulationGraphPreview$lambda$38(this.$pointsGroup$delegate);
            list = (List) a.R(AccumulationGraphPreview$lambda$38);
            if ((list != null ? list.size() : this.$stopAddingDataThresholdSize) >= this.$stopAddingDataThresholdSize) {
            }
        }
    }
}
