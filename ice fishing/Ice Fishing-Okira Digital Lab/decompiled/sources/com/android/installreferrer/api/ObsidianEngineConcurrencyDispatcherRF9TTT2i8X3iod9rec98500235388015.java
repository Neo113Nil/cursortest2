package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.versionedparcelable.DragonRouteJITStaticO8M5YdfAKMnqMbM5uX39121778490932;
import androidx.versionedparcelable.KryptonFlowServiceBuilderGaemjjwLmyYM9Yg39Y41939808996401;
import androidx.versionedparcelable.PhotonFrameWorkerStateXbSNv3Zsnfpoq1ghqh77205496198678;
import com.android.installreferrer.commons.InstallReferrerCommons;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 implements ServiceConnection {
    public final /* synthetic */ IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final InstallReferrerStateListener ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015(IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 ironMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119, InstallReferrerStateListener installReferrerStateListener) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = ironMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        PhotonFrameWorkerStateXbSNv3Zsnfpoq1ghqh77205496198678 dragonRouteJITStaticO8M5YdfAKMnqMbM5uX39121778490932;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = KryptonFlowServiceBuilderGaemjjwLmyYM9Yg39Y41939808996401.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (iBinder == null) {
            dragonRouteJITStaticO8M5YdfAKMnqMbM5uX39121778490932 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            dragonRouteJITStaticO8M5YdfAKMnqMbM5uX39121778490932 = queryLocalInterface instanceof PhotonFrameWorkerStateXbSNv3Zsnfpoq1ghqh77205496198678 ? (PhotonFrameWorkerStateXbSNv3Zsnfpoq1ghqh77205496198678) queryLocalInterface : new DragonRouteJITStaticO8M5YdfAKMnqMbM5uX39121778490932(iBinder);
        }
        IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 ironMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        ironMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = dragonRouteJITStaticO8M5YdfAKMnqMbM5uX39121778490932;
        ironMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 2;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 ironMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        ironMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
        ironMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.onInstallReferrerServiceDisconnected();
    }
}
