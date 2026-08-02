package ru.yandex.quasar.glagol.impl;

import androidx.annotation.NonNull;
import defpackage.i08;
import defpackage.shd;
import defpackage.v68;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
import ru.yandex.quasar.glagol.StereoPairRole;

/* loaded from: classes6.dex */
class DiscoveryResultItemImpl implements v68 {
    private final boolean accessible;
    private final String certificate;
    private final String host;
    private final i08 id;
    private final String name;
    private final int port;
    private final String serviceName;
    private final StereoPairRole spRole;
    private final URI uri;

    public DiscoveryResultItemImpl(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, int i, @NonNull String str5, StereoPairRole stereoPairRole, boolean z, String str6) throws shd {
        this.name = str2;
        this.host = str4;
        this.port = i;
        this.serviceName = str;
        this.id = new i08(str3, str5);
        this.accessible = z;
        this.spRole = stereoPairRole;
        try {
            this.uri = new URI("wss", "", str4, i, "/", "", "");
            this.certificate = str6;
        } catch (URISyntaxException e) {
            throw new shd("Failed to construct URI", e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DiscoveryResultItemImpl discoveryResultItemImpl = (DiscoveryResultItemImpl) obj;
            if (this.port == discoveryResultItemImpl.port && Objects.equals(this.host, discoveryResultItemImpl.host) && this.id.equals(discoveryResultItemImpl.id)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v68
    public String getCertificate() {
        return this.certificate;
    }

    @Override // defpackage.v68
    @NonNull
    public String getDeviceId() {
        return this.id.a;
    }

    @Override // defpackage.v68
    @NonNull
    public i08 getId() {
        return this.id;
    }

    @Override // defpackage.v68
    @NonNull
    public String getName() {
        return this.name;
    }

    @Override // defpackage.v68
    @NonNull
    public String getPlatform() {
        return this.id.b;
    }

    @Override // defpackage.v68
    @NonNull
    public String getServiceName() {
        return this.serviceName;
    }

    public StereoPairRole getStereoPairRole() {
        return this.spRole;
    }

    @Override // defpackage.v68
    @NonNull
    public URI getURI() {
        return this.uri;
    }

    public int hashCode() {
        return Objects.hash(this.host, Integer.valueOf(this.port));
    }

    @Override // defpackage.v68
    public boolean isAccessible() {
        return this.accessible && !StereoPairRole.FOLLOWER.equals(this.spRole);
    }

    @NonNull
    public String toString() {
        return "DiscoveryResultItem{name='" + this.name + "', id=" + this.id + "', sp=" + this.spRole + "}";
    }
}
