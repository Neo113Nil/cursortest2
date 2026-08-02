package ru.rt.ebs.cryptosdk.core.di;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.initialization.di.IInitializationComponent;
import ru.rt.ebs.cryptosdk.core.instructions.di.IInstructionsComponent;
import ru.rt.ebs.cryptosdk.core.metadata.di.IMetadataComponent;
import ru.rt.ebs.cryptosdk.core.networkClient.di.INetworkClientComponent;
import ru.rt.ebs.cryptosdk.core.registration.di.IRegistrationComponent;
import ru.rt.ebs.cryptosdk.core.security.di.ISecurityComponent;
import ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent;
import ru.rt.ebs.cryptosdk.core.verification.adapter.di.IAdapterComponent;
import ru.rt.ebs.cryptosdk.core.verification.consumer.di.IConsumerComponent;
import ru.rt.ebs.cryptosdk.core.verification.ebs.di.IEbsComponent;
import ru.rt.ebs.cryptosdk.core.verification.esia.di.IEsiaComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationFlowComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationSessionComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lru/rt/ebs/cryptosdk/core/di/ICoreComponent;", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IComponent;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$FZ115;", "request", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;", "router", "Lzy11;", "initVerificationFZ115", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$FZ115;Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;)V", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$WithoutEsia;", "initVerificationWithoutEsia", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$WithoutEsia;Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;)V", "releaseVerification", "()V", "Lru/rt/ebs/cryptosdk/core/common/di/ICommonComponent;", "getCommonComponent", "()Lru/rt/ebs/cryptosdk/core/common/di/ICommonComponent;", "commonComponent", "Lru/rt/ebs/cryptosdk/core/metadata/di/IMetadataComponent;", "getMetadataComponent", "()Lru/rt/ebs/cryptosdk/core/metadata/di/IMetadataComponent;", "metadataComponent", "Lru/rt/ebs/cryptosdk/core/storage/di/IStorageComponent;", "getStorageComponent", "()Lru/rt/ebs/cryptosdk/core/storage/di/IStorageComponent;", "storageComponent", "Lru/rt/ebs/cryptosdk/core/registration/di/IRegistrationComponent;", "getRegistrationComponent", "()Lru/rt/ebs/cryptosdk/core/registration/di/IRegistrationComponent;", "registrationComponent", "Lru/rt/ebs/cryptosdk/core/security/di/ISecurityComponent;", "getSecurityComponent", "()Lru/rt/ebs/cryptosdk/core/security/di/ISecurityComponent;", "securityComponent", "Lru/rt/ebs/cryptosdk/core/initialization/di/IInitializationComponent;", "getInitializationComponent", "()Lru/rt/ebs/cryptosdk/core/initialization/di/IInitializationComponent;", "initializationComponent", "Lru/rt/ebs/cryptosdk/core/verification/adapter/di/IAdapterComponent;", "getAdapterComponent", "()Lru/rt/ebs/cryptosdk/core/verification/adapter/di/IAdapterComponent;", "adapterComponent", "Lru/rt/ebs/cryptosdk/core/verification/esia/di/IEsiaComponent;", "getEsiaComponent", "()Lru/rt/ebs/cryptosdk/core/verification/esia/di/IEsiaComponent;", "esiaComponent", "Lru/rt/ebs/cryptosdk/core/verification/ebs/di/IEbsComponent;", "getEbsComponent", "()Lru/rt/ebs/cryptosdk/core/verification/ebs/di/IEbsComponent;", "ebsComponent", "Lru/rt/ebs/cryptosdk/core/verification/consumer/di/IConsumerComponent;", "getConsumerComponent", "()Lru/rt/ebs/cryptosdk/core/verification/consumer/di/IConsumerComponent;", "consumerComponent", "Lru/rt/ebs/cryptosdk/core/verificationFlow/di/IVerificationSessionComponent;", "getVerificationSessionComponent", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/di/IVerificationSessionComponent;", "verificationSessionComponent", "Lru/rt/ebs/cryptosdk/core/verificationFlow/di/IVerificationFlowComponent;", "getVerificationFlowComponent", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/di/IVerificationFlowComponent;", "verificationFlowComponent", "Lru/rt/ebs/cryptosdk/core/instructions/di/IInstructionsComponent;", "getInstructionsComponent", "()Lru/rt/ebs/cryptosdk/core/instructions/di/IInstructionsComponent;", "instructionsComponent", "Lru/rt/ebs/cryptosdk/core/di/IVerificationFlowBridge;", "getVerificationFlowBridge", "()Lru/rt/ebs/cryptosdk/core/di/IVerificationFlowBridge;", "verificationFlowBridge", "Lru/rt/ebs/cryptosdk/core/networkClient/di/INetworkClientComponent;", "getNetworkClientComponent", "()Lru/rt/ebs/cryptosdk/core/networkClient/di/INetworkClientComponent;", "networkClientComponent", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ICoreComponent extends IComponent {
    IAdapterComponent getAdapterComponent();

    ICommonComponent getCommonComponent();

    IConsumerComponent getConsumerComponent();

    IEbsComponent getEbsComponent();

    IEsiaComponent getEsiaComponent();

    IInitializationComponent getInitializationComponent();

    IInstructionsComponent getInstructionsComponent();

    IMetadataComponent getMetadataComponent();

    INetworkClientComponent getNetworkClientComponent();

    IRegistrationComponent getRegistrationComponent();

    ISecurityComponent getSecurityComponent();

    IStorageComponent getStorageComponent();

    IVerificationFlowBridge getVerificationFlowBridge();

    IVerificationFlowComponent getVerificationFlowComponent();

    IVerificationSessionComponent getVerificationSessionComponent();

    void initVerificationFZ115(VerificationRequestScheme.FZ115 request, IVerificationRouter router);

    void initVerificationWithoutEsia(VerificationRequestScheme.WithoutEsia request, IVerificationRouter router);

    void releaseVerification();
}
