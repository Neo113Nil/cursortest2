package defpackage;

import com.yandex.go.settings.mvp.SettingsModalView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class war0 implements w550, jms {
    public final /* synthetic */ SettingsModalView a;

    public war0(SettingsModalView settingsModalView) {
        this.a = settingsModalView;
    }

    @Override // defpackage.w550
    public final void a() {
        this.a.onBackPressed();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w550) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, SettingsModalView.class, "onBackPressed", "onBackPressed()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
