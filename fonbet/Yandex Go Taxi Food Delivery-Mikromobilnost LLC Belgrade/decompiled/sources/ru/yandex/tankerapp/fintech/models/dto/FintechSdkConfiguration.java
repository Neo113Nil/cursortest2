package ru.yandex.tankerapp.fintech.models.dto;

import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003Jf\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\n\u0010\u001aR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019¨\u0006/"}, d2 = {"Lru/yandex/tankerapp/fintech/models/dto/FintechSdkConfiguration;", "Ljava/io/Serializable;", "regionId", "", "fintechSdkSettings", "Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings;", "fintechSdkEnvironment", "Lru/yandex/tankerapp/fintech/models/dto/FintechSdkEnvironment;", "redirectURLForSbpTokenBinding", "", "isDarkTheme", "", "showFailureScreen", "showSuccessScreen", "currency", "<init>", "(Ljava/lang/Integer;Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings;Lru/yandex/tankerapp/fintech/models/dto/FintechSdkEnvironment;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/String;)V", "getRegionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFintechSdkSettings", "()Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings;", "getFintechSdkEnvironment", "()Lru/yandex/tankerapp/fintech/models/dto/FintechSdkEnvironment;", "getRedirectURLForSbpTokenBinding", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowFailureScreen", "()Z", "getShowSuccessScreen", "getCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings;Lru/yandex/tankerapp/fintech/models/dto/FintechSdkEnvironment;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/String;)Lru/yandex/tankerapp/fintech/models/dto/FintechSdkConfiguration;", "equals", "other", "", "hashCode", "toString", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FintechSdkConfiguration implements Serializable {

    @ysq0("currency")
    private final String currency;

    @ysq0("fintechSdkEnvironment")
    private final FintechSdkEnvironment fintechSdkEnvironment;

    @ysq0("fintechSdkSettings")
    private final FintechSdkSettings fintechSdkSettings;

    @ysq0("isDarkTheme")
    private final Boolean isDarkTheme;

    @ysq0("redirectURLForSbpTokenBinding")
    private final String redirectURLForSbpTokenBinding;

    @ysq0("regionId")
    private final Integer regionId;

    @ysq0("showFailureScreen")
    private final boolean showFailureScreen;

    @ysq0("showSuccessScreen")
    private final boolean showSuccessScreen;

    public FintechSdkConfiguration(Integer num, FintechSdkSettings fintechSdkSettings, FintechSdkEnvironment fintechSdkEnvironment, String str, Boolean bool, boolean z, boolean z2, String str2) {
        this.regionId = num;
        this.fintechSdkSettings = fintechSdkSettings;
        this.fintechSdkEnvironment = fintechSdkEnvironment;
        this.redirectURLForSbpTokenBinding = str;
        this.isDarkTheme = bool;
        this.showFailureScreen = z;
        this.showSuccessScreen = z2;
        this.currency = str2;
    }

    public static /* synthetic */ FintechSdkConfiguration copy$default(FintechSdkConfiguration fintechSdkConfiguration, Integer num, FintechSdkSettings fintechSdkSettings, FintechSdkEnvironment fintechSdkEnvironment, String str, Boolean bool, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = fintechSdkConfiguration.regionId;
        }
        if ((i & 2) != 0) {
            fintechSdkSettings = fintechSdkConfiguration.fintechSdkSettings;
        }
        if ((i & 4) != 0) {
            fintechSdkEnvironment = fintechSdkConfiguration.fintechSdkEnvironment;
        }
        if ((i & 8) != 0) {
            str = fintechSdkConfiguration.redirectURLForSbpTokenBinding;
        }
        if ((i & 16) != 0) {
            bool = fintechSdkConfiguration.isDarkTheme;
        }
        if ((i & 32) != 0) {
            z = fintechSdkConfiguration.showFailureScreen;
        }
        if ((i & 64) != 0) {
            z2 = fintechSdkConfiguration.showSuccessScreen;
        }
        if ((i & 128) != 0) {
            str2 = fintechSdkConfiguration.currency;
        }
        boolean z3 = z2;
        String str3 = str2;
        Boolean bool2 = bool;
        boolean z4 = z;
        return fintechSdkConfiguration.copy(num, fintechSdkSettings, fintechSdkEnvironment, str, bool2, z4, z3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getRegionId() {
        return this.regionId;
    }

    /* renamed from: component2, reason: from getter */
    public final FintechSdkSettings getFintechSdkSettings() {
        return this.fintechSdkSettings;
    }

    /* renamed from: component3, reason: from getter */
    public final FintechSdkEnvironment getFintechSdkEnvironment() {
        return this.fintechSdkEnvironment;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRedirectURLForSbpTokenBinding() {
        return this.redirectURLForSbpTokenBinding;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsDarkTheme() {
        return this.isDarkTheme;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowFailureScreen() {
        return this.showFailureScreen;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowSuccessScreen() {
        return this.showSuccessScreen;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final FintechSdkConfiguration copy(Integer regionId, FintechSdkSettings fintechSdkSettings, FintechSdkEnvironment fintechSdkEnvironment, String redirectURLForSbpTokenBinding, Boolean isDarkTheme, boolean showFailureScreen, boolean showSuccessScreen, String currency) {
        return new FintechSdkConfiguration(regionId, fintechSdkSettings, fintechSdkEnvironment, redirectURLForSbpTokenBinding, isDarkTheme, showFailureScreen, showSuccessScreen, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FintechSdkConfiguration)) {
            return false;
        }
        FintechSdkConfiguration fintechSdkConfiguration = (FintechSdkConfiguration) other;
        return jl40.l(this.regionId, fintechSdkConfiguration.regionId) && jl40.l(this.fintechSdkSettings, fintechSdkConfiguration.fintechSdkSettings) && this.fintechSdkEnvironment == fintechSdkConfiguration.fintechSdkEnvironment && jl40.l(this.redirectURLForSbpTokenBinding, fintechSdkConfiguration.redirectURLForSbpTokenBinding) && jl40.l(this.isDarkTheme, fintechSdkConfiguration.isDarkTheme) && this.showFailureScreen == fintechSdkConfiguration.showFailureScreen && this.showSuccessScreen == fintechSdkConfiguration.showSuccessScreen && jl40.l(this.currency, fintechSdkConfiguration.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final FintechSdkEnvironment getFintechSdkEnvironment() {
        return this.fintechSdkEnvironment;
    }

    public final FintechSdkSettings getFintechSdkSettings() {
        return this.fintechSdkSettings;
    }

    public final String getRedirectURLForSbpTokenBinding() {
        return this.redirectURLForSbpTokenBinding;
    }

    public final Integer getRegionId() {
        return this.regionId;
    }

    public final boolean getShowFailureScreen() {
        return this.showFailureScreen;
    }

    public final boolean getShowSuccessScreen() {
        return this.showSuccessScreen;
    }

    public int hashCode() {
        Integer num = this.regionId;
        int hashCode = (this.fintechSdkEnvironment.hashCode() + ((this.fintechSdkSettings.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31)) * 31;
        String str = this.redirectURLForSbpTokenBinding;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDarkTheme;
        int e = unr0.e(unr0.e((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.showFailureScreen), 31, this.showSuccessScreen);
        String str2 = this.currency;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean isDarkTheme() {
        return this.isDarkTheme;
    }

    public String toString() {
        Integer num = this.regionId;
        FintechSdkSettings fintechSdkSettings = this.fintechSdkSettings;
        FintechSdkEnvironment fintechSdkEnvironment = this.fintechSdkEnvironment;
        String str = this.redirectURLForSbpTokenBinding;
        Boolean bool = this.isDarkTheme;
        boolean z = this.showFailureScreen;
        boolean z2 = this.showSuccessScreen;
        String str2 = this.currency;
        StringBuilder sb = new StringBuilder("FintechSdkConfiguration(regionId=");
        sb.append(num);
        sb.append(", fintechSdkSettings=");
        sb.append(fintechSdkSettings);
        sb.append(", fintechSdkEnvironment=");
        sb.append(fintechSdkEnvironment);
        sb.append(", redirectURLForSbpTokenBinding=");
        sb.append(str);
        sb.append(", isDarkTheme=");
        sb.append(bool);
        sb.append(", showFailureScreen=");
        sb.append(z);
        sb.append(", showSuccessScreen=");
        return n.m(", currency=", str2, Extension.C_BRAKE, sb, z2);
    }
}
