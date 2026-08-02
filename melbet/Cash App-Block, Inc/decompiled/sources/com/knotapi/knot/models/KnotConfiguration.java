package com.knotapi.knot.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.Knot;

/* loaded from: classes4.dex */
public class KnotConfiguration {
    private final String clientId;
    private final CustomerConfiguration customerConfiguration;
    private String[] domainUrls;
    private String entryPoint;
    private final Environment environment;
    private final int[] merchantIds;
    private final Knot.Product product;
    private final String sessionId;
    private Boolean useCategories;
    private Boolean useSearch;

    public KnotConfiguration(String str, String str2, Environment environment, Knot.Product product, int[] iArr, Boolean bool, Boolean bool2, String[] strArr, String str3, CustomerConfiguration customerConfiguration) {
        Boolean bool3 = Boolean.TRUE;
        this.useCategories = bool3;
        this.useSearch = bool3;
        this.domainUrls = null;
        this.entryPoint = null;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("sessionId must not be null");
            throw null;
        }
        if (str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("clientId must not be null");
            throw null;
        }
        if (environment == null) {
            a$$ExternalSyntheticBUOutline0.m$3("environment must not be null");
            throw null;
        }
        this.sessionId = str;
        this.clientId = str2;
        this.environment = environment;
        this.product = product;
        this.merchantIds = iArr;
        this.useCategories = bool;
        this.useSearch = bool2;
        this.domainUrls = strArr;
        this.entryPoint = str3;
        this.customerConfiguration = customerConfiguration;
    }

    public String getClientId() {
        return this.clientId;
    }

    public CustomerConfiguration getCustomerConfiguration() {
        return this.customerConfiguration;
    }

    public String[] getDomainUrls() {
        return this.domainUrls;
    }

    public String getEntryPoint() {
        return this.entryPoint;
    }

    public Environment getEnvironment() {
        return this.environment;
    }

    public int[] getMerchantIds() {
        return this.merchantIds;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public Boolean getUseCategories() {
        return this.useCategories;
    }

    public Boolean getUseSearch() {
        return this.useSearch;
    }

    public KnotConfiguration(String str, String str2, Environment environment, Knot.Product product, int[] iArr, Boolean bool, Boolean bool2, String[] strArr, String str3) {
        this(str, str2, environment, product, iArr, bool, bool2, strArr, str3, null);
    }

    public KnotConfiguration(String str, String str2, Environment environment, int[] iArr, Boolean bool, Boolean bool2, String[] strArr, String str3, CustomerConfiguration customerConfiguration) {
        this(str, str2, environment, null, iArr, bool, bool2, strArr, str3, customerConfiguration);
    }
}
