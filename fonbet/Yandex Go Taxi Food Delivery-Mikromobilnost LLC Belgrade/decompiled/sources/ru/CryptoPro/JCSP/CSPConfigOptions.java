package ru.CryptoPro.JCSP;

/* loaded from: classes4.dex */
public class CSPConfigOptions implements ConfigOptions {
    public static final ConfigOptions DEFAULT = new CSPConfigOptions();
    boolean enableSSPITlsProvider = false;

    @Override // ru.CryptoPro.JCSP.ConfigOptions
    public ConfigOptions disableSSPITlsProvider() {
        this.enableSSPITlsProvider = false;
        return this;
    }

    @Override // ru.CryptoPro.JCSP.ConfigOptions
    public ConfigOptions enableSSPITlsProvider() {
        this.enableSSPITlsProvider = true;
        return this;
    }

    @Override // ru.CryptoPro.JCSP.ConfigOptions
    public boolean isEnabledSSPITlsProvider() {
        return this.enableSSPITlsProvider;
    }
}
