package com.datadog.android.core.internal.persistence;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.viewmodels.ToastType;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class AsyncEventWriteScope implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final Object executor;
    public final Object featureName;
    public final Object featureWriteLock;
    public final Object internalLogger;
    public final Object writer;

    public AsyncEventWriteScope(BackPressureExecutorService backPressureExecutorService, EventBatchWriter eventBatchWriter, Object obj, String str, InternalLogger internalLogger) {
        this.$r8$classId = 0;
        backPressureExecutorService.getClass();
        obj.getClass();
        str.getClass();
        internalLogger.getClass();
        this.executor = backPressureExecutorService;
        this.writer = eventBatchWriter;
        this.featureWriteLock = obj;
        this.featureName = str;
        this.internalLogger = internalLogger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.featureWriteLock;
        Object obj3 = this.writer;
        Object obj4 = this.executor;
        Object obj5 = this.internalLogger;
        Object obj6 = this.featureName;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                zzho.executeSafe((Executor) obj4, Recorder$$ExternalSyntheticOutline2.m("eventWriteScopeInvoke-", (String) obj6), (InternalLogger) obj5, new q4$$ExternalSyntheticLambda0(18, this, function1));
                break;
            case 1:
                ClockInOverlayViewModel.Loaded.ClockedOutSummary clockedOutSummary = (ClockInOverlayViewModel.Loaded.ClockedOutSummary) obj;
                clockedOutSummary.getClass();
                ((MutableState) obj3).setValue(clockedOutSummary);
                ((MutableState) obj2).setValue(null);
                ((MutableState) obj6).setValue(null);
                ((MutableState) obj5).setValue(new ToastState(((AndroidStringManager) ((CardLockPresenter) obj4).stringManager).get(R.string.work_shift_clocked_out), Long.valueOf(System.currentTimeMillis()), ToastType.Success));
                break;
            default:
                ClockInOverlayViewModel.Loaded.ClockedOutSummary clockedOutSummary2 = (ClockInOverlayViewModel.Loaded.ClockedOutSummary) obj;
                clockedOutSummary2.getClass();
                ((MutableState) obj3).setValue(clockedOutSummary2);
                ((MutableState) obj2).setValue(null);
                ((MutableState) obj6).setValue(null);
                ((MutableState) obj5).setValue(new ToastState(((AndroidStringManager) ((CardLockPresenter) obj4).stringManager).get(R.string.work_shift_clocked_out), Long.valueOf(System.currentTimeMillis()), ToastType.Success));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AsyncEventWriteScope(CardLockPresenter cardLockPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i) {
        this.$r8$classId = i;
        this.executor = cardLockPresenter;
        this.writer = mutableState;
        this.featureWriteLock = mutableState2;
        this.featureName = mutableState3;
        this.internalLogger = mutableState4;
    }
}
