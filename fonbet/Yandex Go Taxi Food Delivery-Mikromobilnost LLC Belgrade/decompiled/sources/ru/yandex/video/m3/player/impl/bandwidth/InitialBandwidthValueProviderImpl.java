package ru.yandex.video.m3.player.impl.bandwidth;

import android.content.Context;
import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import defpackage.gtq0;
import defpackage.scc;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.JCSP;
import ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider;
import ru.yandex.video.m3.player.utils.network.NetworkType;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u000bH\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0018\u001a\u00020\fH\u0002J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/impl/bandwidth/InitialBandwidthValueProviderImpl;", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "()V", "COUNTRY_GROUP_INDEX_2G", "", "COUNTRY_GROUP_INDEX_3G", "COUNTRY_GROUP_INDEX_4G", "COUNTRY_GROUP_INDEX_5G_NSA", "COUNTRY_GROUP_INDEX_5G_SA", "COUNTRY_GROUP_INDEX_WIFI", "DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS", "", "", "", "DEFAULT_INITIAL_BITRATE_ESTIMATE", "", "DEFAULT_INITIAL_BITRATE_ESTIMATES_2G", "DEFAULT_INITIAL_BITRATE_ESTIMATES_3G", "DEFAULT_INITIAL_BITRATE_ESTIMATES_4G", "DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA", "DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA", "DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI", "createInitialBitrateCountryGroupAssignment", "getCountryGroupIndices", "countryCode", "getInitialBitrateEstimate", "context", "Landroid/content/Context;", "networkType", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "getInitialBitrateEstimatesForCountry", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitialBandwidthValueProviderImpl implements InitialBandwidthValueProvider {
    public static final int $stable;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    private static final Map<String, List<Integer>> DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS;
    private static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    private static final List<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G;
    private static final List<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G;
    private static final List<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
    private static final List<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA;
    private static final List<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA;
    private static final List<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
    public static final InitialBandwidthValueProviderImpl INSTANCE;

    static {
        InitialBandwidthValueProviderImpl initialBandwidthValueProviderImpl = new InitialBandwidthValueProviderImpl();
        INSTANCE = initialBandwidthValueProviderImpl;
        DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS = initialBandwidthValueProviderImpl.createInitialBitrateCountryGroupAssignment();
        DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = scc.g(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = scc.g(248000L, 160000L, 142000L, 127000L, 113000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = scc.g(2200000L, 1300000L, 950000L, 760000L, 520000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = scc.g(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = scc.g(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = scc.g(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
        $stable = 8;
    }

    private InitialBandwidthValueProviderImpl() {
    }

    private final Map<String, List<Integer>> createInitialBitrateCountryGroupAssignment() {
        return b.i(gtq0.S("AD", scc.g(1, 2, 0, 0, 2, 2)), gtq0.S("AE", scc.g(1, 4, 4, 4, 2, 2)), gtq0.S("AF", scc.g(4, 4, 3, 4, 2, 2)), gtq0.S("AG", scc.g(4, 2, 1, 4, 2, 2)), gtq0.S("AI", scc.g(1, 2, 2, 2, 2, 2)), gtq0.S("AL", scc.g(1, 1, 1, 1, 2, 2)), gtq0.S("AM", scc.g(2, 2, 1, 3, 2, 2)), gtq0.S("AO", scc.g(3, 4, 3, 1, 2, 2)), gtq0.S("AR", scc.g(2, 4, 2, 1, 2, 2)), gtq0.S("AS", scc.g(2, 2, 3, 3, 2, 2)), gtq0.S("AT", scc.g(0, 1, 0, 0, 0, 2)), gtq0.S("AU", scc.g(0, 2, 0, 1, 1, 2)), gtq0.S("AW", scc.g(1, 2, 0, 4, 2, 2)), gtq0.S(AddCardInfo.PROVIDER_AMEX, scc.g(0, 2, 2, 2, 2, 2)), gtq0.S("AZ", scc.g(3, 3, 3, 4, 4, 2)), gtq0.S("BA", scc.g(1, 1, 0, 1, 2, 2)), gtq0.S("BB", scc.g(0, 2, 0, 0, 2, 2)), gtq0.S("BD", scc.g(2, 0, 3, 3, 2, 2)), gtq0.S("BE", scc.g(0, 0, 2, 3, 2, 2)), gtq0.S("BF", scc.g(4, 4, 4, 2, 2, 2)), gtq0.S("BG", scc.g(0, 1, 0, 0, 2, 2)), gtq0.S("BH", scc.g(1, 0, 2, 4, 2, 2)), gtq0.S("BI", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("BJ", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("BL", scc.g(1, 2, 2, 2, 2, 2)), gtq0.S("BM", scc.g(0, 2, 0, 0, 2, 2)), gtq0.S("BN", scc.g(3, 2, 1, 0, 2, 2)), gtq0.S("BO", scc.g(1, 2, 4, 2, 2, 2)), gtq0.S("BQ", scc.g(1, 2, 1, 2, 2, 2)), gtq0.S("BR", scc.g(2, 4, 3, 2, 2, 2)), gtq0.S("BS", scc.g(2, 2, 1, 3, 2, 2)), gtq0.S("BT", scc.g(3, 0, 3, 2, 2, 2)), gtq0.S("BW", scc.g(3, 4, 1, 1, 2, 2)), gtq0.S("BY", scc.g(1, 1, 1, 2, 2, 2)), gtq0.S("BZ", scc.g(2, 2, 2, 2, 2, 2)), gtq0.S(JCSP.CA_STORE_NAME, scc.g(0, 3, 1, 2, 4, 2)), gtq0.S("CD", scc.g(4, 2, 2, 1, 2, 2)), gtq0.S("CF", scc.g(4, 2, 3, 2, 2, 2)), gtq0.S("CG", scc.g(3, 4, 2, 2, 2, 2)), gtq0.S("CH", scc.g(0, 0, 0, 0, 1, 2)), gtq0.S("CI", scc.g(3, 3, 3, 3, 2, 2)), gtq0.S("CK", scc.g(2, 2, 3, 0, 2, 2)), gtq0.S("CL", scc.g(1, 1, 2, 2, 2, 2)), gtq0.S("CM", scc.g(3, 4, 3, 2, 2, 2)), gtq0.S("CN", scc.g(2, 2, 2, 1, 3, 2)), gtq0.S("CO", scc.g(2, 3, 4, 2, 2, 2)), gtq0.S("CR", scc.g(2, 3, 4, 4, 2, 2)), gtq0.S("CU", scc.g(4, 4, 2, 2, 2, 2)), gtq0.S("CV", scc.g(2, 3, 1, 0, 2, 2)), gtq0.S("CW", scc.g(1, 2, 0, 0, 2, 2)), gtq0.S("CY", scc.g(1, 1, 0, 0, 2, 2)), gtq0.S("CZ", scc.g(0, 1, 0, 0, 1, 2)), gtq0.S("DE", scc.g(0, 0, 1, 1, 0, 2)), gtq0.S("DJ", scc.g(4, 0, 4, 4, 2, 2)), gtq0.S("DK", scc.g(0, 0, 1, 0, 0, 2)), gtq0.S("DM", scc.g(1, 2, 2, 2, 2, 2)), gtq0.S("DO", scc.g(3, 4, 4, 4, 2, 2)), gtq0.S("DZ", scc.g(3, 3, 4, 4, 2, 4)), gtq0.S("EC", scc.g(2, 4, 3, 1, 2, 2)), gtq0.S("EE", scc.g(0, 1, 0, 0, 2, 2)), gtq0.S("EG", scc.g(3, 4, 3, 3, 2, 2)), gtq0.S("EH", scc.g(2, 2, 2, 2, 2, 2)), gtq0.S("ER", scc.g(4, 2, 2, 2, 2, 2)), gtq0.S("ES", scc.g(0, 1, 1, 1, 2, 2)), gtq0.S("ET", scc.g(4, 4, 4, 1, 2, 2)), gtq0.S("FI", scc.g(0, 0, 0, 0, 0, 2)), gtq0.S("FJ", scc.g(3, 0, 2, 3, 2, 2)), gtq0.S("FK", scc.g(4, 2, 2, 2, 2, 2)), gtq0.S("FM", scc.g(3, 2, 4, 4, 2, 2)), gtq0.S("FO", scc.g(1, 2, 0, 1, 2, 2)), gtq0.S("FR", scc.g(1, 1, 2, 0, 1, 2)), gtq0.S("GA", scc.g(3, 4, 1, 1, 2, 2)), gtq0.S("GB", scc.g(0, 0, 1, 1, 1, 2)), gtq0.S("GD", scc.g(1, 2, 2, 2, 2, 2)), gtq0.S("GE", scc.g(1, 1, 1, 2, 2, 2)), gtq0.S("GF", scc.g(2, 2, 2, 3, 2, 2)), gtq0.S("GG", scc.g(1, 2, 0, 0, 2, 2)), gtq0.S("GH", scc.g(3, 1, 3, 2, 2, 2)), gtq0.S(AddCardInfo.PROVIDER_GIFT, scc.g(0, 2, 0, 0, 2, 2)), gtq0.S("GL", scc.g(1, 2, 0, 0, 2, 2)), gtq0.S("GM", scc.g(4, 3, 2, 4, 2, 2)), gtq0.S("GN", scc.g(4, 3, 4, 2, 2, 2)), gtq0.S("GP", scc.g(2, 1, 2, 3, 2, 2)), gtq0.S("GQ", scc.g(4, 2, 2, 4, 2, 2)), gtq0.S("GR", scc.g(1, 2, 0, 0, 2, 2)), gtq0.S(AddCardInfo.PROVIDER_GEMALTO, scc.g(3, 2, 3, 1, 2, 2)), gtq0.S("GU", scc.g(1, 2, 3, 4, 2, 2)), gtq0.S("GW", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("GY", scc.g(3, 3, 3, 4, 2, 2)), gtq0.S("HK", scc.g(0, 1, 2, 3, 2, 0)), gtq0.S("HN", scc.g(3, 1, 3, 3, 2, 2)), gtq0.S("HR", scc.g(1, 1, 0, 0, 3, 2)), gtq0.S("HT", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("HU", scc.g(0, 0, 0, 0, 0, 2)), gtq0.S("ID", scc.g(3, 2, 3, 3, 2, 2)), gtq0.S("IE", scc.g(0, 0, 1, 1, 3, 2)), gtq0.S("IL", scc.g(1, 0, 2, 3, 4, 2)), gtq0.S("IM", scc.g(0, 2, 0, 1, 2, 2)), gtq0.S("IN", scc.g(2, 1, 3, 3, 2, 2)), gtq0.S("IO", scc.g(4, 2, 2, 4, 2, 2)), gtq0.S("IQ", scc.g(3, 3, 4, 4, 2, 2)), gtq0.S("IR", scc.g(3, 2, 3, 2, 2, 2)), gtq0.S("IS", scc.g(0, 2, 0, 0, 2, 2)), gtq0.S("IT", scc.g(0, 4, 0, 1, 2, 2)), gtq0.S("JE", scc.g(2, 2, 1, 2, 2, 2)), gtq0.S("JM", scc.g(3, 3, 4, 4, 2, 2)), gtq0.S("JO", scc.g(2, 2, 1, 1, 2, 2)), gtq0.S("JP", scc.g(0, 0, 0, 0, 2, 1)), gtq0.S("KE", scc.g(3, 4, 2, 2, 2, 2)), gtq0.S("KG", scc.g(2, 0, 1, 1, 2, 2)), gtq0.S("KH", scc.g(1, 0, 4, 3, 2, 2)), gtq0.S("KI", scc.g(4, 2, 4, 3, 2, 2)), gtq0.S("KM", scc.g(4, 3, 2, 3, 2, 2)), gtq0.S("KN", scc.g(1, 2, 2, 2, 2, 2)), gtq0.S("KP", scc.g(4, 2, 2, 2, 2, 2)), gtq0.S("KR", scc.g(0, 0, 1, 3, 1, 2)), gtq0.S("KW", scc.g(1, 3, 1, 1, 1, 2)), gtq0.S("KY", scc.g(1, 2, 0, 2, 2, 2)), gtq0.S("KZ", scc.g(2, 2, 2, 3, 2, 2)), gtq0.S("LA", scc.g(1, 2, 1, 1, 2, 2)), gtq0.S("LB", scc.g(3, 2, 0, 0, 2, 2)), gtq0.S("LC", scc.g(1, 2, 0, 0, 2, 2)), gtq0.S("LI", scc.g(0, 2, 2, 2, 2, 2)), gtq0.S("LK", scc.g(2, 0, 2, 3, 2, 2)), gtq0.S("LR", scc.g(3, 4, 4, 3, 2, 2)), gtq0.S("LS", scc.g(3, 3, 2, 3, 2, 2)), gtq0.S("LT", scc.g(0, 0, 0, 0, 2, 2)), gtq0.S("LU", scc.g(1, 0, 1, 1, 2, 2)), gtq0.S("LV", scc.g(0, 0, 0, 0, 2, 2)), gtq0.S("LY", scc.g(4, 2, 4, 3, 2, 2)), gtq0.S("MA", scc.g(3, 2, 2, 1, 2, 2)), gtq0.S(AddCardInfo.PROVIDER_MASTERCARD, scc.g(0, 2, 0, 0, 2, 2)), gtq0.S("MD", scc.g(1, 2, 0, 0, 2, 2)), gtq0.S("ME", scc.g(1, 2, 0, 1, 2, 2)), gtq0.S("MF", scc.g(2, 2, 1, 1, 2, 2)), gtq0.S("MG", scc.g(3, 4, 2, 2, 2, 2)), gtq0.S("MH", scc.g(4, 2, 2, 4, 2, 2)), gtq0.S("MK", scc.g(1, 1, 0, 0, 2, 2)), gtq0.S("ML", scc.g(4, 4, 2, 2, 2, 2)), gtq0.S("MM", scc.g(2, 3, 3, 3, 2, 2)), gtq0.S("MN", scc.g(2, 4, 2, 2, 2, 2)), gtq0.S("MO", scc.g(0, 2, 4, 4, 2, 2)), gtq0.S("MP", scc.g(0, 2, 2, 2, 2, 2)), gtq0.S("MQ", scc.g(2, 2, 2, 3, 2, 2)), gtq0.S("MR", scc.g(3, 0, 4, 3, 2, 2)), gtq0.S("MS", scc.g(1, 2, 2, 2, 2, 2)), gtq0.S("MT", scc.g(0, 2, 0, 0, 2, 2)), gtq0.S("MU", scc.g(2, 1, 1, 2, 2, 2)), gtq0.S("MV", scc.g(4, 3, 2, 4, 2, 2)), gtq0.S("MW", scc.g(4, 2, 1, 0, 2, 2)), gtq0.S("MX", scc.g(2, 4, 4, 4, 4, 2)), gtq0.S(JCSP.MY_STORE_NAME, scc.g(1, 0, 3, 2, 2, 2)), gtq0.S("MZ", scc.g(3, 3, 2, 1, 2, 2)), gtq0.S("NA", scc.g(4, 3, 3, 2, 2, 2)), gtq0.S("NC", scc.g(3, 0, 4, 4, 2, 2)), gtq0.S("NE", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("NF", scc.g(2, 2, 2, 2, 2, 2)), gtq0.S("NG", scc.g(3, 3, 2, 3, 2, 2)), gtq0.S("NI", scc.g(2, 1, 4, 4, 2, 2)), gtq0.S("NL", scc.g(0, 2, 3, 2, 0, 2)), gtq0.S("NO", scc.g(0, 1, 2, 0, 0, 2)), gtq0.S(AddCardInfo.PROVIDER_NAPAS, scc.g(2, 0, 4, 2, 2, 2)), gtq0.S("NR", scc.g(3, 2, 3, 1, 2, 2)), gtq0.S("NU", scc.g(4, 2, 2, 2, 2, 2)), gtq0.S("NZ", scc.g(0, 2, 1, 2, 4, 2)), gtq0.S("OM", scc.g(2, 2, 1, 3, 3, 2)), gtq0.S("PA", scc.g(1, 3, 3, 3, 2, 2)), gtq0.S("PE", scc.g(2, 3, 4, 4, 2, 2)), gtq0.S("PF", scc.g(2, 2, 2, 1, 2, 2)), gtq0.S("PG", scc.g(4, 4, 3, 2, 2, 2)), gtq0.S("PH", scc.g(2, 1, 3, 3, 3, 2)), gtq0.S("PK", scc.g(3, 2, 3, 3, 2, 2)), gtq0.S(AddCardInfo.PROVIDER_PLCC, scc.g(1, 0, 1, 2, 3, 2)), gtq0.S("PM", scc.g(0, 2, 2, 2, 2, 2)), gtq0.S("PR", scc.g(2, 1, 2, 2, 4, 3)), gtq0.S("PS", scc.g(3, 3, 2, 2, 2, 2)), gtq0.S("PT", scc.g(0, 1, 1, 0, 2, 2)), gtq0.S("PW", scc.g(1, 2, 4, 1, 2, 2)), gtq0.S("PY", scc.g(2, 0, 3, 2, 2, 2)), gtq0.S("QA", scc.g(2, 3, 1, 2, 3, 2)), gtq0.S("RE", scc.g(1, 0, 2, 2, 2, 2)), gtq0.S("RO", scc.g(0, 1, 0, 1, 0, 2)), gtq0.S("RS", scc.g(1, 2, 0, 0, 2, 2)), gtq0.S("RU", scc.g(0, 1, 0, 1, 4, 2)), gtq0.S("RW", scc.g(3, 3, 3, 1, 2, 2)), gtq0.S("SA", scc.g(2, 2, 2, 1, 1, 2)), gtq0.S("SB", scc.g(4, 2, 3, 2, 2, 2)), gtq0.S("SC", scc.g(4, 2, 1, 3, 2, 2)), gtq0.S("SD", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("SE", scc.g(0, 0, 0, 0, 0, 2)), gtq0.S("SG", scc.g(1, 0, 1, 2, 3, 2)), gtq0.S("SH", scc.g(4, 2, 2, 2, 2, 2)), gtq0.S("SI", scc.g(0, 0, 0, 0, 2, 2)), gtq0.S("SJ", scc.g(2, 2, 2, 2, 2, 2)), gtq0.S("SK", scc.g(0, 1, 0, 0, 2, 2)), gtq0.S("SL", scc.g(4, 3, 4, 0, 2, 2)), gtq0.S("SM", scc.g(0, 2, 2, 2, 2, 2)), gtq0.S("SN", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("SO", scc.g(3, 3, 3, 4, 2, 2)), gtq0.S("SR", scc.g(3, 2, 2, 2, 2, 2)), gtq0.S("SS", scc.g(4, 4, 3, 3, 2, 2)), gtq0.S("ST", scc.g(2, 2, 1, 2, 2, 2)), gtq0.S("SV", scc.g(2, 1, 4, 3, 2, 2)), gtq0.S("SX", scc.g(2, 2, 1, 0, 2, 2)), gtq0.S("SY", scc.g(4, 3, 3, 2, 2, 2)), gtq0.S("SZ", scc.g(3, 3, 2, 4, 2, 2)), gtq0.S("TC", scc.g(2, 2, 2, 0, 2, 2)), gtq0.S("TD", scc.g(4, 3, 4, 4, 2, 2)), gtq0.S("TG", scc.g(3, 2, 2, 4, 2, 2)), gtq0.S("TH", scc.g(0, 3, 2, 3, 2, 2)), gtq0.S("TJ", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("TL", scc.g(4, 0, 4, 4, 2, 2)), gtq0.S("TM", scc.g(4, 2, 4, 3, 2, 2)), gtq0.S("TN", scc.g(2, 1, 1, 2, 2, 2)), gtq0.S("TO", scc.g(3, 3, 4, 3, 2, 2)), gtq0.S("TR", scc.g(1, 2, 1, 1, 2, 2)), gtq0.S("TT", scc.g(1, 4, 0, 1, 2, 2)), gtq0.S("TV", scc.g(3, 2, 2, 4, 2, 2)), gtq0.S("TW", scc.g(0, 0, 0, 0, 1, 0)), gtq0.S("TZ", scc.g(3, 3, 3, 2, 2, 2)), gtq0.S("UA", scc.g(0, 3, 1, 1, 2, 2)), gtq0.S("UG", scc.g(3, 2, 3, 3, 2, 2)), gtq0.S("US", scc.g(1, 1, 2, 2, 4, 2)), gtq0.S("UY", scc.g(2, 2, 1, 1, 2, 2)), gtq0.S("UZ", scc.g(2, 1, 3, 4, 2, 2)), gtq0.S("VC", scc.g(1, 2, 2, 2, 2, 2)), gtq0.S("VE", scc.g(4, 4, 4, 4, 2, 2)), gtq0.S("VG", scc.g(2, 2, 1, 1, 2, 2)), gtq0.S(AddCardInfo.PROVIDER_VISA, scc.g(1, 2, 1, 2, 2, 2)), gtq0.S("VN", scc.g(0, 1, 3, 4, 2, 2)), gtq0.S("VU", scc.g(4, 0, 3, 1, 2, 2)), gtq0.S("WF", scc.g(4, 2, 2, 4, 2, 2)), gtq0.S("WS", scc.g(3, 1, 3, 1, 2, 2)), gtq0.S("XK", scc.g(0, 1, 1, 0, 2, 2)), gtq0.S("YE", scc.g(4, 4, 4, 3, 2, 2)), gtq0.S("YT", scc.g(4, 2, 2, 3, 2, 2)), gtq0.S("ZA", scc.g(3, 3, 2, 1, 2, 2)), gtq0.S("ZM", scc.g(3, 2, 3, 3, 2, 2)), gtq0.S("ZW", scc.g(3, 2, 4, 3, 2, 2)));
    }

    private final List<Integer> getCountryGroupIndices(String countryCode) {
        List<Integer> list = DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS.get(countryCode);
        return (list == null || list.isEmpty()) ? scc.g(2, 2, 2, 2, 2, 2) : list;
    }

    private final Map<NetworkType, Long> getInitialBitrateEstimatesForCountry(String countryCode) {
        List<Integer> countryGroupIndices = getCountryGroupIndices(countryCode);
        HashMap hashMap = new HashMap(8);
        hashMap.put(NetworkType.NETWORK_TYPE_UNKNOWN, Long.valueOf(DEFAULT_INITIAL_BITRATE_ESTIMATE));
        NetworkType networkType = NetworkType.NETWORK_TYPE_WIFI;
        List<Long> list = DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
        hashMap.put(networkType, list.get(countryGroupIndices.get(0).intValue()));
        hashMap.put(NetworkType.NETWORK_TYPE_2G, DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(countryGroupIndices.get(1).intValue()));
        hashMap.put(NetworkType.NETWORK_TYPE_3G, DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(countryGroupIndices.get(2).intValue()));
        hashMap.put(NetworkType.NETWORK_TYPE_4G, DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(countryGroupIndices.get(3).intValue()));
        hashMap.put(NetworkType.NETWORK_TYPE_5G_NSA, DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(countryGroupIndices.get(4).intValue()));
        hashMap.put(NetworkType.NETWORK_TYPE_5G_SA, DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(countryGroupIndices.get(5).intValue()));
        hashMap.put(NetworkType.NETWORK_TYPE_ETHERNET, list.get(countryGroupIndices.get(0).intValue()));
        return hashMap;
    }

    @Override // ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider
    public long getInitialBitrateEstimate(Context context, NetworkType networkType, String countryCode) {
        Map<NetworkType, Long> initialBitrateEstimatesForCountry = getInitialBitrateEstimatesForCountry(countryCode);
        Long l = initialBitrateEstimatesForCountry.get(networkType);
        if (l == null) {
            l = initialBitrateEstimatesForCountry.get(NetworkType.NETWORK_TYPE_UNKNOWN);
        }
        if (l == null) {
            l = Long.valueOf(DEFAULT_INITIAL_BITRATE_ESTIMATE);
        }
        return l.longValue();
    }
}
