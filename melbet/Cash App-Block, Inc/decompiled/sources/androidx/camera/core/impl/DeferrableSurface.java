package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.room.util.DBUtil;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class DeferrableSurface {
    public static final boolean DEBUG;
    public static final AtomicInteger TOTAL_COUNT;
    public static final AtomicInteger USED_COUNT;
    public CallbackToFutureAdapter$Completer mCloseCompleter;
    public final CallbackToFutureAdapter$SafeFuture mCloseFuture;
    public Class mContainerClass;
    public final Size mPrescribedSize;
    public final int mPrescribedStreamFormat;
    public CallbackToFutureAdapter$Completer mTerminationCompleter;
    public final CallbackToFutureAdapter$SafeFuture mTerminationFuture;
    public final Object mLock = new Object();
    public int mUseCount = 0;
    public boolean mClosed = false;

    public final class SurfaceClosedException extends Exception {
        public final DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }
    }

    public final class SurfaceUnavailableException extends Exception {
    }

    static {
        new Size(0, 0);
        DEBUG = StringUtilsKt.isLogLevelEnabled(3, "DeferrableSurface");
        USED_COUNT = new AtomicInteger(0);
        TOTAL_COUNT = new AtomicInteger(0);
    }

    public DeferrableSurface(int i, Size size) {
        final int i2 = 0;
        this.mPrescribedSize = size;
        this.mPrescribedStreamFormat = i;
        CallbackToFutureAdapter$SafeFuture future = DBUtil.getFuture(new CallbackToFutureAdapter$Resolver(this) { // from class: androidx.camera.core.impl.DeferrableSurface$$ExternalSyntheticLambda0
            public final /* synthetic */ DeferrableSurface f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
                int i3 = i2;
                DeferrableSurface deferrableSurface = this.f$0;
                switch (i3) {
                    case 0:
                        synchronized (deferrableSurface.mLock) {
                            deferrableSurface.mTerminationCompleter = callbackToFutureAdapter$Completer;
                        }
                        return "DeferrableSurface-termination(" + deferrableSurface + ")";
                    default:
                        synchronized (deferrableSurface.mLock) {
                            deferrableSurface.mCloseCompleter = callbackToFutureAdapter$Completer;
                        }
                        return "DeferrableSurface-close(" + deferrableSurface + ")";
                }
            }
        });
        this.mTerminationFuture = future;
        final int i3 = 1;
        this.mCloseFuture = DBUtil.getFuture(new CallbackToFutureAdapter$Resolver(this) { // from class: androidx.camera.core.impl.DeferrableSurface$$ExternalSyntheticLambda0
            public final /* synthetic */ DeferrableSurface f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
                int i32 = i3;
                DeferrableSurface deferrableSurface = this.f$0;
                switch (i32) {
                    case 0:
                        synchronized (deferrableSurface.mLock) {
                            deferrableSurface.mTerminationCompleter = callbackToFutureAdapter$Completer;
                        }
                        return "DeferrableSurface-termination(" + deferrableSurface + ")";
                    default:
                        synchronized (deferrableSurface.mLock) {
                            deferrableSurface.mCloseCompleter = callbackToFutureAdapter$Completer;
                        }
                        return "DeferrableSurface-close(" + deferrableSurface + ")";
                }
            }
        });
        if (StringUtilsKt.isLogLevelEnabled(3, "DeferrableSurface")) {
            printGlobalDebugCounts(TOTAL_COUNT.incrementAndGet(), USED_COUNT.get(), "Surface created");
            future.delegate.addListener(new CameraX$$ExternalSyntheticLambda2(24, this, Log.getStackTraceString(new Exception())), zzabp.directExecutor());
        }
    }

    public void close() {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    callbackToFutureAdapter$Completer = null;
                } else {
                    this.mClosed = true;
                    this.mCloseCompleter.set(null);
                    if (this.mUseCount == 0) {
                        callbackToFutureAdapter$Completer = this.mTerminationCompleter;
                        this.mTerminationCompleter = null;
                    } else {
                        callbackToFutureAdapter$Completer = null;
                    }
                    if (StringUtilsKt.isLogLevelEnabled(3, "DeferrableSurface")) {
                        StringUtilsKt.d("DeferrableSurface", "surface closed,  useCount=" + this.mUseCount + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (callbackToFutureAdapter$Completer != null) {
            callbackToFutureAdapter$Completer.set(null);
        }
    }

    public final void decrementUseCount() {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer;
        synchronized (this.mLock) {
            try {
                int i = this.mUseCount;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.mUseCount = i2;
                if (i2 == 0 && this.mClosed) {
                    callbackToFutureAdapter$Completer = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                } else {
                    callbackToFutureAdapter$Completer = null;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "DeferrableSurface")) {
                    StringUtilsKt.d("DeferrableSurface", "use count-1,  useCount=" + this.mUseCount + " closed=" + this.mClosed + " " + this);
                    if (this.mUseCount == 0) {
                        printGlobalDebugCounts(TOTAL_COUNT.get(), USED_COUNT.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (callbackToFutureAdapter$Completer != null) {
            callbackToFutureAdapter$Completer.set(null);
        }
    }

    public final ListenableFuture getSurface() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return new ImmediateFuture$ImmediateFailedFuture(new SurfaceClosedException("DeferrableSurface already closed.", this), 0);
                }
                return provideSurface();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void incrementUseCount() {
        synchronized (this.mLock) {
            try {
                int i = this.mUseCount;
                if (i == 0 && this.mClosed) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.mUseCount = i + 1;
                if (StringUtilsKt.isLogLevelEnabled(3, "DeferrableSurface")) {
                    if (this.mUseCount == 1) {
                        printGlobalDebugCounts(TOTAL_COUNT.get(), USED_COUNT.incrementAndGet(), "New surface in use");
                    }
                    StringUtilsKt.d("DeferrableSurface", "use count+1, useCount=" + this.mUseCount + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void printGlobalDebugCounts(int i, int i2, String str) {
        if (!DEBUG && StringUtilsKt.isLogLevelEnabled(3, "DeferrableSurface")) {
            StringUtilsKt.d("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        StringUtilsKt.d("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract ListenableFuture provideSurface();
}
