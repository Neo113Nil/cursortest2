package ru.yandex.yx_platform_api;

import android.app.KeyguardManager;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.da20;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/yx_platform_api/KeyguardDismissCallback;", "Landroid/app/KeyguardManager$KeyguardDismissCallback;", "Lda20;", TarifficatorScenarioActivity.RESULT_KEY, "<init>", "(Lda20;)V", "", "dismissResult", "Lzy11;", "onDismissResult", "(I)V", "onDismissError", "()V", "onDismissSucceeded", "onDismissCancelled", "Lda20;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class KeyguardDismissCallback extends KeyguardManager.KeyguardDismissCallback {
    private final da20 result;

    public KeyguardDismissCallback(da20 da20Var) {
        this.result = da20Var;
    }

    private final void onDismissResult(int dismissResult) {
        this.result.success(Integer.valueOf(dismissResult));
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public void onDismissCancelled() {
        onDismissResult(1);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public void onDismissError() {
        onDismissResult(0);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public void onDismissSucceeded() {
        onDismissResult(2);
    }
}
