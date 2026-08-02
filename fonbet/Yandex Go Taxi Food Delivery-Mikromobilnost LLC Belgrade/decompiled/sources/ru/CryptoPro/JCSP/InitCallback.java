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

/* loaded from: classes4.dex */
public interface InitCallback {
    void onChangeWorkingDirectory(ChangeWorkingDirectoryEvent changeWorkingDirectoryEvent);

    boolean onCheckIntegrity(CheckIntegrityEvent checkIntegrityEvent);

    boolean onCheckLicense(CheckLicenseEvent checkLicenseEvent);

    void onCreateInfrastructure(CreateInfrastructureEvent createInfrastructureEvent);

    void onCreateResources(CreateResourcesEvent createResourcesEvent);

    void onCreateSystemStores(CreateSystemStoresEvent createSystemStoresEvent);

    void onCreateTrustStores(CreateTrustStoresEvent createTrustStoresEvent);

    void onEditConfig(EditConfigEvent editConfigEvent);

    boolean onError(ErrorEvent errorEvent);

    void onLoadingNativeLibrary(LoadingNativeLibraryEvent loadingNativeLibraryEvent);

    void onResolveNativeLibrary(ResolveNativeLibraryEvent resolveNativeLibraryEvent);

    void onStart(StartEvent startEvent);

    void onSuccess(ResultEvent resultEvent);
}
