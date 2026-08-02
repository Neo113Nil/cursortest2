package defpackage;

import com.yandex.go.vault.data.VaultStoreApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class s331 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ VaultStoreApi b;

    public /* synthetic */ s331(VaultStoreApi vaultStoreApi, int i) {
        this.a = i;
        this.b = vaultStoreApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        VaultStoreApi vaultStoreApi = this.b;
        switch (i) {
            case 0:
                vaultStoreApi.handleHideWebView(str, strArr);
                break;
            case 1:
                vaultStoreApi.handleSendAnalyticsEvent(str, strArr);
                break;
            default:
                vaultStoreApi.openExternal(str, strArr);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(2, this.b, VaultStoreApi.class, "handleHideWebView", "handleHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, VaultStoreApi.class, "handleSendAnalyticsEvent", "handleSendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, VaultStoreApi.class, "openExternal", "openExternal(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
