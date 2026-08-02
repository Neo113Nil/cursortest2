package ru.CryptoPro.JCP.tools;

import ru.CryptoPro.JCP.ProviderParameters;

/* loaded from: classes4.dex */
public class JarVersionHolder implements ProviderParameters {
    private final Double a;
    private final String b;
    private final String c;
    private final String d;

    public JarVersionHolder(Class cls) {
        String fromManifest = JarTools.getFromManifest(cls, ProviderParameters.PRODUCT_VER_ATTR, ProviderParameters.DEFAULT_PRODUCT_VER);
        this.b = fromManifest;
        this.a = Double.valueOf(Double.parseDouble(fromManifest));
        this.c = JarTools.getFromManifest(cls, ProviderParameters.PRODUCT_RELEASE_ATTR, "0.0.0");
        this.d = JarTools.getFromManifest(cls, ProviderParameters.PRODUCT_BUILD_ATTR, "0.0.0");
    }

    public String getProductBuild() {
        return this.d;
    }

    public String getProductRelease() {
        return this.c;
    }

    public Double getProductVersion() {
        return this.a;
    }

    public String getProductVersionString() {
        return this.b;
    }
}
