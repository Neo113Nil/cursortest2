package com.gamericefishpro.space.i2;

import android.os.Trace;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ t e;

    public /* synthetic */ j(t tVar, int i) {
        this.d = i;
        this.e = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        t tVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!tVar.A.isEmpty()) {
                    try {
                        ((Function0) tVar.A.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Unit unit = Unit.a;
                Trace.endSection();
                return;
            default:
                tVar.U0 = false;
                MotionEvent motionEvent = tVar.M0;
                Intrinsics.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                tVar.I(motionEvent);
                return;
        }
    }
}
