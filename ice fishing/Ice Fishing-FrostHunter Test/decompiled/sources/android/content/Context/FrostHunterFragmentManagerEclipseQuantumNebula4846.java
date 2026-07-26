package android.content.Context;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFragmentManagerEclipseQuantumNebula4846 implements ServiceConnection {
    public Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterFragmentManagerEclipseQuantumNebula4846(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface iInterface;
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = FrostHunterFocusMeteringActionPulseAlphaMega4981.FrostHunterBundlePulseFusionHero2475;
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = null;
        if (iBinder == null) {
            iInterface = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(FrostHunterPagingInfernoNova1945.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof FrostHunterPagingInfernoNova1945)) {
                FrostHunterActivityInfoNovaTitaniumOmega7444 frostHunterActivityInfoNovaTitaniumOmega7444 = new FrostHunterActivityInfoNovaTitaniumOmega7444();
                frostHunterActivityInfoNovaTitaniumOmega7444.FrostHunterBundlePulseFusionHero2475 = iBinder;
                iInterface = frostHunterActivityInfoNovaTitaniumOmega7444;
            } else {
                iInterface = (FrostHunterPagingInfernoNova1945) queryLocalInterface;
            }
        }
        componentName.getClass();
        try {
            ((FrostHunterActivityInfoNovaTitaniumOmega7444) iInterface).FrostHunterBundlePulseFusionHero2475();
        } catch (RemoteException unused) {
        }
        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterRoomDatabasePhantomSpark4438 frostHunterRoomDatabasePhantomSpark4438 = new FrostHunterRoomDatabasePhantomSpark4438(new FrostHunterSQLiteMasterUltra9956(12, frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849));
        try {
            if (((FrostHunterActivityInfoNovaTitaniumOmega7444) iInterface).FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterRoomDatabasePhantomSpark4438)) {
                frostHunterTraceHyperionAuroraNebula9947 = new FrostHunterTraceHyperionAuroraNebula9947(iInterface, frostHunterRoomDatabasePhantomSpark4438, componentName, 12);
            }
        } catch (RemoteException unused2) {
        }
        frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200 = frostHunterTraceHyperionAuroraNebula9947;
        if (frostHunterTraceHyperionAuroraNebula9947 != null) {
            try {
                ((FrostHunterActivityInfoNovaTitaniumOmega7444) ((FrostHunterPagingInfernoNova1945) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809)).FrostHunterAlphaAnimationNeoCosmos5761((FrostHunterRoomDatabasePhantomSpark4438) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200, Uri.parse("https://pay.google.com"), new Bundle());
            } catch (RemoteException unused3) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlertDialogAuroraDelta3200 = null;
    }
}
