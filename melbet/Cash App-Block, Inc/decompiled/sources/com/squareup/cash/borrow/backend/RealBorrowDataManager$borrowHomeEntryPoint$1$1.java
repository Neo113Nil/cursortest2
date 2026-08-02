package com.squareup.cash.borrow.backend;

import androidx.webkit.internal.AssetHelper;
import com.google.android.gms.internal.mlkit_vision_face.zzjj;
import com.squareup.cash.borrow.backend.BorrowError;
import com.squareup.cash.clientsync.PayloadWithMetadata;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.cash.clients.Version;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBorrowDataManager$borrowHomeEntryPoint$1$1 extends SuspendLambda implements Function4 {
    public /* synthetic */ PayloadWithMetadata L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ boolean Z$0;
    public final /* synthetic */ RealBorrowDataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBorrowDataManager$borrowHomeEntryPoint$1$1(RealBorrowDataManager realBorrowDataManager, Continuation continuation) {
        super(4, continuation);
        this.this$0 = realBorrowDataManager;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        RealBorrowDataManager$borrowHomeEntryPoint$1$1 realBorrowDataManager$borrowHomeEntryPoint$1$1 = new RealBorrowDataManager$borrowHomeEntryPoint$1$1(this.this$0, (Continuation) obj4);
        realBorrowDataManager$borrowHomeEntryPoint$1$1.L$0 = (PayloadWithMetadata) obj;
        realBorrowDataManager$borrowHomeEntryPoint$1$1.L$1 = (List) obj2;
        realBorrowDataManager$borrowHomeEntryPoint$1$1.Z$0 = booleanValue;
        return realBorrowDataManager$borrowHomeEntryPoint$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RealBorrowDataManager realBorrowDataManager = this.this$0;
        ErrorReporter errorReporter = realBorrowDataManager.errorReporter;
        PayloadWithMetadata payloadWithMetadata = this.L$0;
        List list = this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (!z) {
            return RealBorrowDataManager.LocalHiddenEntryPointData;
        }
        Version version = realBorrowDataManager.appVersion;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (AssetHelper.matchesAny(version, ((BorrowData.AppletData.EntryPointData) obj2).app_supports)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() >= 2) {
            Path$$ExternalSyntheticBUOutline0.m$3(arrayList, "Multiple matching entry points: ");
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BorrowData.AppletData.EntryPointData entryPointData = (BorrowData.AppletData.EntryPointData) it.next();
            zzjj zzjjVar = entryPointData.entry_point_v2;
            boolean z2 = zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2;
            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
            if (!z2 && !(zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2)) {
                errorReporter.report(new BorrowError.MissingEntryPointV2(), defaultSamplingStrategy);
            }
            if ((entryPointData.entry_point_v2 instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2) && payloadWithMetadata != null) {
                errorReporter.report(new BorrowError.UnexpectedLegacyRowEntryPoint(payloadWithMetadata), defaultSamplingStrategy);
            }
        }
        BorrowData.AppletData.EntryPointData entryPointData2 = (BorrowData.AppletData.EntryPointData) CollectionsKt.firstOrNull((List) arrayList);
        return entryPointData2 == null ? RealBorrowDataManager.LocalHiddenEntryPointData : entryPointData2;
    }
}
