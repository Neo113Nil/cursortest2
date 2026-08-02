package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.camera.core.impl.utils.Exif;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzae;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class BasePendingResult<R extends Result> {
    public static final Exif.AnonymousClass1 zaa = new Exif.AnonymousClass1(7);
    public final WeakReference zac;
    public Result zaj;
    public Status zak;
    public volatile boolean zal;
    public boolean zam;
    public boolean zan;
    public final Object zae = new Object();
    public final CountDownLatch zaf = new CountDownLatch(1);
    public final ArrayList zag = new ArrayList();
    public final AtomicReference zai = new AtomicReference();
    public boolean zaq = false;

    public final class CallbackHandler extends com.google.android.gms.internal.base.zao {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("BasePendingResult", Boxes$$ExternalSyntheticOutline1.m(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            if (pair.first != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            try {
                throw null;
            } catch (RuntimeException e) {
                Exif.AnonymousClass1 anonymousClass1 = BasePendingResult.zaa;
                throw e;
            }
        }
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        new CallbackHandler(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper(), 0);
        this.zac = new WeakReference(googleApiClient);
    }

    public final void addStatusListener(PendingResult$StatusListener pendingResult$StatusListener) {
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    pendingResult$StatusListener.onComplete(this.zak);
                } else {
                    this.zag.add(pendingResult$StatusListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    this.zam = true;
                    zab(createFailedResult(Status.RESULT_CANCELED));
                }
            } finally {
            }
        }
    }

    public abstract Result createFailedResult(Status status);

    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setResult(Result result) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    return;
                }
                isReady();
                zzae.checkState("Results have already been set", !isReady());
                zzae.checkState("Result has already been consumed", !this.zal);
                zab(result);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zab(Result result) {
        this.zaj = result;
        this.zak = result.getStatus();
        this.zaf.countDown();
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((PendingResult$StatusListener) arrayList.get(i)).onComplete(this.zak);
        }
        arrayList.clear();
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }
}
