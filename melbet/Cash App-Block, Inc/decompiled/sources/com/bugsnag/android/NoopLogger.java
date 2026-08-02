package com.bugsnag.android;

import android.util.Log;

/* loaded from: classes.dex */
public final class NoopLogger implements Logger {
    public final /* synthetic */ int $r8$classId;
    public static final NoopLogger INSTANCE$1 = new NoopLogger(1);
    public static final NoopLogger INSTANCE = new NoopLogger(0);

    public /* synthetic */ NoopLogger(int i) {
        this.$r8$classId = i;
    }

    private final void d$com$bugsnag$android$NoopLogger(String str) {
    }

    private final void d$com$bugsnag$android$NoopLogger(String str, Throwable th) {
    }

    private final void e$com$bugsnag$android$NoopLogger(String str) {
    }

    private final void e$com$bugsnag$android$NoopLogger(String str, Throwable th) {
    }

    private final void i$com$bugsnag$android$NoopLogger(String str) {
    }

    private final void w$com$bugsnag$android$NoopLogger(String str) {
    }

    private final void w$com$bugsnag$android$NoopLogger(String str, Throwable th) {
    }

    @Override // com.bugsnag.android.Logger
    public void d(String str) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.d("Bugsnag", str);
                break;
        }
    }

    @Override // com.bugsnag.android.Logger
    public void e(String str) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.e("Bugsnag", str);
                break;
        }
    }

    @Override // com.bugsnag.android.Logger
    public void i(String str) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.i("Bugsnag", str);
                break;
        }
    }

    @Override // com.bugsnag.android.Logger
    public void w(String str) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.w("Bugsnag", str);
                break;
        }
    }

    @Override // com.bugsnag.android.Logger
    public void d(String str, Throwable th) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.d("Bugsnag", str, th);
                break;
        }
    }

    @Override // com.bugsnag.android.Logger
    public void e(String str, Throwable th) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.e("Bugsnag", str, th);
                break;
        }
    }

    @Override // com.bugsnag.android.Logger
    public void w(String str, Throwable th) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.w("Bugsnag", str, th);
                break;
        }
    }
}
