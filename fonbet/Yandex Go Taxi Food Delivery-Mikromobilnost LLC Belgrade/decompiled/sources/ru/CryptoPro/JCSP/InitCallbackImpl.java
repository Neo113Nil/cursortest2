package ru.CryptoPro.JCSP;

import ru.CryptoPro.JCSP.state.ChangeWorkingDirectoryEvent;
import ru.CryptoPro.JCSP.state.CheckIntegrityEvent;
import ru.CryptoPro.JCSP.state.CheckLicenseEvent;
import ru.CryptoPro.JCSP.state.CreateInfrastructureEvent;
import ru.CryptoPro.JCSP.state.CreateResourcesEvent;
import ru.CryptoPro.JCSP.state.CreateSystemStoresEvent;
import ru.CryptoPro.JCSP.state.CreateTrustStoresEvent;
import ru.CryptoPro.JCSP.state.EditConfigEvent;
import ru.CryptoPro.JCSP.state.ErrorEvent;
import ru.CryptoPro.JCSP.state.LoadingNativeLibraryEvent;
import ru.CryptoPro.JCSP.state.ResolveNativeLibraryEvent;
import ru.CryptoPro.JCSP.state.ResultEvent;
import ru.CryptoPro.JCSP.state.StartEvent;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class InitCallbackImpl implements InitCallback, LogConstants {
    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onChangeWorkingDirectory(ChangeWorkingDirectoryEvent changeWorkingDirectoryEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public boolean onCheckIntegrity(CheckIntegrityEvent checkIntegrityEvent) {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public boolean onCheckLicense(CheckLicenseEvent checkLicenseEvent) {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onCreateInfrastructure(CreateInfrastructureEvent createInfrastructureEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onCreateResources(CreateResourcesEvent createResourcesEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onCreateSystemStores(CreateSystemStoresEvent createSystemStoresEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onCreateTrustStores(CreateTrustStoresEvent createTrustStoresEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onEditConfig(EditConfigEvent editConfigEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public boolean onError(ErrorEvent errorEvent) {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onLoadingNativeLibrary(LoadingNativeLibraryEvent loadingNativeLibraryEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onResolveNativeLibrary(ResolveNativeLibraryEvent resolveNativeLibraryEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onStart(StartEvent startEvent) {
    }

    @Override // ru.CryptoPro.JCSP.InitCallback
    public void onSuccess(ResultEvent resultEvent) {
    }
}
