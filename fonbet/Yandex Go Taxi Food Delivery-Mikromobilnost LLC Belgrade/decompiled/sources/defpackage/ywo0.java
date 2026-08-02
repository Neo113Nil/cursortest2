package defpackage;

import com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class ywo0 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersSubscriptionJsApi b;

    public /* synthetic */ ywo0(ScootersSubscriptionJsApi scootersSubscriptionJsApi, int i) {
        this.a = i;
        this.b = scootersSubscriptionJsApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        ScootersSubscriptionJsApi scootersSubscriptionJsApi = this.b;
        switch (i) {
            case 0:
                scootersSubscriptionJsApi.forceUpdate(str, strArr);
                break;
            case 1:
                scootersSubscriptionJsApi.sendAnalyticsEvent(str, strArr);
                break;
            case 2:
                scootersSubscriptionJsApi.showStories(str, strArr);
                break;
            default:
                scootersSubscriptionJsApi.showPlus(str, strArr);
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
            case 2:
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
                return new FunctionReferenceImpl(2, this.b, ScootersSubscriptionJsApi.class, "forceUpdate", "forceUpdate(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, ScootersSubscriptionJsApi.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, ScootersSubscriptionJsApi.class, "showStories", "showStories(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, ScootersSubscriptionJsApi.class, "showPlus", "showPlus(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
