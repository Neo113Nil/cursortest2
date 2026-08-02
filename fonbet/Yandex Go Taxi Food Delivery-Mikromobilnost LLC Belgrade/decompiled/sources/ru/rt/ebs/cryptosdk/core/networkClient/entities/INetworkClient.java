package ru.rt.ebs.cryptosdk.core.networkClient.entities;

import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/rt/ebs/cryptosdk/core/networkClient/entities/INetworkClient;", "", "", "", "hosts", "Lzy11;", "setAllowedHosts", "(Ljava/util/Set;)V", "T", "Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientRequest;", "request", "Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientResponse;", "execute", "(Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientRequest;)Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientResponse;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface INetworkClient {
    <T> NetworkClientResponse execute(NetworkClientRequest<T> request);

    void setAllowedHosts(Set<String> hosts);
}
