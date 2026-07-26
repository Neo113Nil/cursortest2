package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterEventSolarGammaStrike6218 implements FrostHunterAdapterDelegateForceForce1151 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterEventSolarGammaStrike6218(int i, Object obj) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
    }

    @Override // android.content.Context.FrostHunterAdapterDelegateForceForce1151
    public final Object get() {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new FrostHunterViewModelPhoenixDragon1261("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new FrostHunterViewModelPhoenixDragon1261(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new FrostHunterViewModelPhoenixDragon1261(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new FrostHunterViewModelPhoenixDragon1261("Could not instantiate " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new FrostHunterViewModelPhoenixDragon1261("Could not instantiate " + str, e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new FrostHunterRunnableVortexElite1869((com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754) obj);
        }
    }
}
