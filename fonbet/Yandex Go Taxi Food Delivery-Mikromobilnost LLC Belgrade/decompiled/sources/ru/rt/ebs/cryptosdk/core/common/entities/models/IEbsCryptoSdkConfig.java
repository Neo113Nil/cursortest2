package ru.rt.ebs.cryptosdk.core.common.entities.models;

import java.net.URI;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/rt/ebs/cryptosdk/core/common/entities/models/IEbsCryptoSdkConfig;", "", "kpmApiUri", "Ljava/net/URI;", "getKpmApiUri", "()Ljava/net/URI;", "kpmToken", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "getKpmToken", "()Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "instructionsApiUri", "getInstructionsApiUri", "allowedRedirectHosts", "", "", "getAllowedRedirectHosts", "()Ljava/util/Set;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IEbsCryptoSdkConfig {
    Set<String> getAllowedRedirectHosts();

    URI getInstructionsApiUri();

    URI getKpmApiUri();

    Token getKpmToken();
}
