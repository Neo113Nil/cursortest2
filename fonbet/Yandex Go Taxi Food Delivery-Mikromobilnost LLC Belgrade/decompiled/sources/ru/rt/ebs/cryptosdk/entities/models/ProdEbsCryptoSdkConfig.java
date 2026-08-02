package ru.rt.ebs.cryptosdk.entities.models;

import defpackage.j73;
import java.net.URI;
import java.util.Set;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IProdEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/ProdEbsCryptoSdkConfig;", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IProdEbsCryptoSdkConfig;", "kpmToken", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "<init>", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;)V", "getKpmToken", "()Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "kpmApiUri", "Ljava/net/URI;", "getKpmApiUri", "()Ljava/net/URI;", "instructionsApiUri", "getInstructionsApiUri", "allowedRedirectHosts", "", "", "getAllowedRedirectHosts", "()Ljava/util/Set;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProdEbsCryptoSdkConfig implements IProdEbsCryptoSdkConfig {
    private final Token kpmToken;
    private final URI kpmApiUri = new URI("https://cryptosdk.ebs.ru/");
    private final URI instructionsApiUri = new URI("https://cryptosdk.ebs.ru/");
    private final Set<String> allowedRedirectHosts = j73.f0(new String[]{"gosuslugi.ru", "ebs.ru"});

    public ProdEbsCryptoSdkConfig(Token token) {
        this.kpmToken = token;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig
    public Set<String> getAllowedRedirectHosts() {
        return this.allowedRedirectHosts;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig
    public URI getInstructionsApiUri() {
        return this.instructionsApiUri;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig
    public URI getKpmApiUri() {
        return this.kpmApiUri;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig
    public Token getKpmToken() {
        return this.kpmToken;
    }
}
