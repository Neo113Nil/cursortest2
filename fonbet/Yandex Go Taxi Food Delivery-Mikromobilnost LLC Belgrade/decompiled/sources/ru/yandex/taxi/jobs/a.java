package ru.yandex.taxi.jobs;

import defpackage.ny61;
import defpackage.qoh;
import java.util.UUID;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final UUID a;
    public final qoh b;

    public a(UUID uuid, qoh qohVar) {
        this.a = uuid;
        this.b = qohVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        JobInfo$scheduleStatus$1 jobInfo$scheduleStatus$1;
        int i;
        if (continuationImpl instanceof JobInfo$scheduleStatus$1) {
            jobInfo$scheduleStatus$1 = (JobInfo$scheduleStatus$1) continuationImpl;
            int i2 = jobInfo$scheduleStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jobInfo$scheduleStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jobInfo$scheduleStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jobInfo$scheduleStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jobInfo$scheduleStatus$1.label = 1;
                    obj = this.b.s(jobInfo$scheduleStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        jobInfo$scheduleStatus$1 = new JobInfo$scheduleStatus$1(this, continuationImpl);
        Object obj2 = jobInfo$scheduleStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jobInfo$scheduleStatus$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
