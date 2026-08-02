package defpackage;

import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import com.yandex.go.sdk_registry.api.exceptions.SdkRegistrationException;
import com.yandex.go.sdk_registry.runtime.a;
import com.yandex.go.sdk_registry.wrappers.mob.b;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final /* synthetic */ class tnp0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ lnp0 b;
    public final /* synthetic */ b c;

    public /* synthetic */ tnp0(lnp0 lnp0Var, b bVar, int i) {
        this.a = i;
        this.b = lnp0Var;
        this.c = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((unp0) obj).a.add(new tnp0(this.b, this.c, 1));
                return zy11.a;
            default:
                lnp0 lnp0Var = this.b;
                b bVar = this.c;
                com.yandex.go.sdk_registry.runtime.b bVar2 = (com.yandex.go.sdk_registry.runtime.b) obj;
                bVar2.getClass();
                SdkLifecycleStage sdkLifecycleStage = lnp0Var.d;
                if (sdkLifecycleStage != null && sdkLifecycleStage.compareTo(lnp0Var.c) > 0) {
                    throw new SdkRegistrationException(new IllegalArgumentException("SDK component lightweight initialization stage must not be later than full initialization stage"), lnp0Var.a.a);
                }
                synchronized (bVar2.f) {
                    if (bVar2.e.containsKey(new vnp0(lnp0Var.a.a))) {
                        throw new SdkRegistrationException(new IllegalStateException("SDK component is already registered"), lnp0Var.a.a);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(bVar2.e);
                    String str = lnp0Var.a.a;
                    vnp0 vnp0Var = new vnp0(str);
                    fwf0 fwf0Var = bVar2.a;
                    ike ikeVar = bVar2.b;
                    d7g0 d7g0Var = bVar2.c;
                    j0g j0gVar = bVar2.d;
                    linkedHashMap.put(vnp0Var, new a(lnp0Var, bVar, fwf0Var, ikeVar, d7g0Var, new com.yandex.go.sdk_registry.runtime.metrics.a(str, (ike) j0gVar.b, (h33) ((fwf0) j0gVar.a).a(qpp0.a))));
                    bVar2.e = linkedHashMap;
                }
                return zy11.a;
        }
    }
}
