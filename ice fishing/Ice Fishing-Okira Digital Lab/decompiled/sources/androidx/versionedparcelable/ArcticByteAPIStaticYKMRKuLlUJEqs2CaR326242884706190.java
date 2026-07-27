package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class ArcticByteAPIStaticYKMRKuLlUJEqs2CaR326242884706190 implements NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 {
    public final /* synthetic */ Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ ArcticByteAPIStaticYKMRKuLlUJEqs2CaR326242884706190(int i, Object obj) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = obj;
    }

    @Override // androidx.versionedparcelable.NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158
    public final Object get() {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        Object obj = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new GoldenVectorContextCoordinatorU5vF3xkwvwr7V0MPzH85040588531452("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new GoldenVectorContextCoordinatorU5vF3xkwvwr7V0MPzH85040588531452("Could not instantiate " + str + ".", e);
                } catch (InstantiationException e2) {
                    throw new GoldenVectorContextCoordinatorU5vF3xkwvwr7V0MPzH85040588531452("Could not instantiate " + str + ".", e2);
                } catch (NoSuchMethodException e3) {
                    throw new GoldenVectorContextCoordinatorU5vF3xkwvwr7V0MPzH85040588531452("Could not instantiate " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new GoldenVectorContextCoordinatorU5vF3xkwvwr7V0MPzH85040588531452("Could not instantiate " + str, e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new DragonRouteVariableSingletonYCiXZSlSzF26YWeqTf58275413587173((com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) obj);
        }
    }
}
