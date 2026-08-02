package com.fidesmo.sec.core.models;

import java.net.URI;
import java.security.PublicKey;
import java.util.List;
import javax.security.cert.X509Certificate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/fidesmo/sec/core/models/ServiceDescription;", "", "title", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "termsAndConditions", "Ljava/net/URI;", "description", "fieldsRequired", "", "Lcom/fidesmo/sec/core/models/RequiredField;", "requirements", "Lcom/fidesmo/sec/core/models/ServiceRequirements;", "certificate", "", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/net/URI;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/util/List;Lcom/fidesmo/sec/core/models/ServiceRequirements;[B)V", "getCertificate", "()[B", "getDescription", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getFieldsRequired", "()Ljava/util/List;", "publicKey", "Ljava/security/PublicKey;", "getPublicKey", "()Ljava/security/PublicKey;", "getRequirements", "()Lcom/fidesmo/sec/core/models/ServiceRequirements;", "getTermsAndConditions", "()Ljava/net/URI;", "getTitle", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServiceDescription {
    private final byte[] certificate;
    private final ParametrisedTranslation description;
    private final List<RequiredField> fieldsRequired;
    private final ServiceRequirements requirements;
    private final URI termsAndConditions;
    private final ParametrisedTranslation title;

    public /* synthetic */ ServiceDescription(ParametrisedTranslation parametrisedTranslation, URI uri, ParametrisedTranslation parametrisedTranslation2, List list, ServiceRequirements serviceRequirements, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : parametrisedTranslation, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : parametrisedTranslation2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : serviceRequirements, (i & 32) != 0 ? null : bArr);
    }

    public final byte[] getCertificate() {
        return this.certificate;
    }

    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    public final List<RequiredField> getFieldsRequired() {
        return this.fieldsRequired;
    }

    public final PublicKey getPublicKey() {
        byte[] bArr = this.certificate;
        if (bArr == null) {
            return null;
        }
        return X509Certificate.getInstance(bArr).getPublicKey();
    }

    public final ServiceRequirements getRequirements() {
        return this.requirements;
    }

    public final URI getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public final ParametrisedTranslation getTitle() {
        return this.title;
    }

    public ServiceDescription(ParametrisedTranslation parametrisedTranslation, URI uri, ParametrisedTranslation parametrisedTranslation2, List<RequiredField> list, ServiceRequirements serviceRequirements, byte[] bArr) {
        this.title = parametrisedTranslation;
        this.termsAndConditions = uri;
        this.description = parametrisedTranslation2;
        this.fieldsRequired = list;
        this.requirements = serviceRequirements;
        this.certificate = bArr;
    }

    public ServiceDescription() {
        this(null, null, null, null, null, null, 63, null);
    }
}
