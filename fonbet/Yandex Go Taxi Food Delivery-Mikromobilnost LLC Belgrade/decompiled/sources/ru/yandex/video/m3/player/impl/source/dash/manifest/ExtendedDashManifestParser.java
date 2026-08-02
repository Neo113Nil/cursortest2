package ru.yandex.video.m3.player.impl.source.dash.manifest;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import defpackage.a70;
import defpackage.a8q0;
import defpackage.b87;
import defpackage.b8q0;
import defpackage.c8q0;
import defpackage.d6z;
import defpackage.egg;
import defpackage.eh20;
import defpackage.eyi;
import defpackage.f7s;
import defpackage.f9h;
import defpackage.fgg;
import defpackage.ggg;
import defpackage.hq91;
import defpackage.ic5;
import defpackage.kqx;
import defpackage.kvq0;
import defpackage.kw21;
import defpackage.lhf0;
import defpackage.m4m0;
import defpackage.npg;
import defpackage.pb7;
import defpackage.pxa0;
import defpackage.ra7;
import defpackage.s4j0;
import defpackage.tw21;
import defpackage.unr0;
import defpackage.w6i0;
import defpackage.w820;
import defpackage.xh21;
import defpackage.y7q0;
import defpackage.z7q0;
import java.io.IOException;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.player.MediaSourceListener;
import ru.yandex.video.m3.player.impl.source.dash.ParsedBaseUrlsHolder;
import ru.yandex.video.m3.player.impl.source.dash.ParsedSegmentBaseHolder;
import ru.yandex.video.m3.player.impl.source.dash.manifest.util.ManifestLanguageHolder;
import ru.yandex.video.m3.player.impl.tracking.UriQueryParameters;
import ru.yandex.video.m3.player.impl.utils.UrlModifierHelper;

/* loaded from: classes7.dex */
public class ExtendedDashManifestParser extends ggg {
    private static final String KEY_TIMESTAMP = "timestamp";
    private static final long START_NUMBER_UNSET = -1;
    private static final String TAG = "ExtendedDashManifestParser";
    private static final String UTC_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String UTC_ZONE_ID = "UTC";
    private int baseUrlPriority;
    private ra7 cache;
    private pb7 cacheKeyFactory;
    private final boolean isPreloadLiveDashEnabled;
    private long manifestPreloadTs;
    private String manifestUrl;
    private final MediaSourceListener mediaSourceListener;
    private long minTotalAvailabilityTimeOffsetUs;
    private long newStartNumber;
    private final String originalPlayerSourceIndex;
    private final String originalPlayerVsid;
    private final ParsedBaseUrlsHolder parsedBaseUrlsHolder;
    private final ParsedSegmentBaseHolder parsedSegmentBaseHolder;
    private PreloadedLiveDashState preloadedLiveDashState;
    private long segmentLengthForLive;
    private long startNumber;
    private final SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener;
    private final ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener;
    private kw21 utcTiming;

    public enum PreloadedLiveDashState {
        INIT,
        IS_MANIFEST_EXISTS_IN_CACHE,
        IS_MANIFEST_WAS_TAKEN_FROM_CACHE,
        IS_MANIFEST_WAS_TAKEN_FROM_NETWORK,
        DEFAULT_PLAYBACK
    }

    public ExtendedDashManifestParser(ParsedBaseUrlsHolder parsedBaseUrlsHolder, ParsedSegmentBaseHolder parsedSegmentBaseHolder, SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener, ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener, String str, String str2, MediaSourceListener mediaSourceListener, ra7 ra7Var, pb7 pb7Var, boolean z) {
        this.preloadedLiveDashState = PreloadedLiveDashState.INIT;
        this.manifestPreloadTs = -9223372036854775807L;
        this.newStartNumber = -1L;
        this.manifestUrl = "";
        this.baseUrlPriority = 0;
        this.parsedSegmentBaseHolder = parsedSegmentBaseHolder;
        this.parsedBaseUrlsHolder = parsedBaseUrlsHolder;
        this.supplementalPropertiesInPeriodParseListener = supplementalPropertiesInPeriodParseListener;
        this.thumbnailsEssentialPropertiesParseListener = thumbnailsEssentialPropertiesParseListener;
        this.originalPlayerVsid = str;
        this.originalPlayerSourceIndex = str2;
        this.mediaSourceListener = mediaSourceListener;
        this.cache = ra7Var;
        this.cacheKeyFactory = pb7Var;
        this.isPreloadLiveDashEnabled = z;
    }

    private long addSegmentTimelineElementsToList(List<a8q0> list, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = tw21.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    private long calculateNewSegmentNumber(long j) {
        long j2;
        long j3 = this.segmentLengthForLive;
        if (j3 <= 0 || this.utcTiming == null) {
            Locale locale = Locale.US;
            kw21 kw21Var = this.utcTiming;
            StringBuilder sb = new StringBuilder("calculateNewSegmentNumber: segmentLengthForLive = ");
            sb.append(j3);
            sb.append(", utcTiming = ");
            sb.append(kw21Var);
            return j;
        }
        this.manifestPreloadTs = getLastSystemTimestampFromCacheMetadata();
        try {
            long epochMilli = Instant.parse(this.utcTiming.b).toEpochMilli();
            long epochMilli2 = Instant.now().toEpochMilli();
            long j4 = this.manifestPreloadTs;
            if (j4 != -9223372036854775807L) {
                epochMilli = j4;
            }
            j2 = ((epochMilli2 - epochMilli) / this.segmentLengthForLive) + j;
        } catch (DateTimeParseException e) {
            Log.e(TAG, "Error parsing utcTiming", e);
            j2 = j;
        }
        Locale locale2 = Locale.US;
        StringBuilder w = unr0.w(j, "calculateNewSegmentNumber: oldStartNumber = ", ", newStartNumber = ");
        w.append(j2);
        Log.i(TAG, w.toString());
        return j2;
    }

    private kw21 calculateNewUtcTimingElement() {
        kw21 kw21Var = this.utcTiming;
        if (kw21Var == null) {
            return null;
        }
        long epochMilli = Instant.parse(kw21Var.b).toEpochMilli();
        long j = this.manifestPreloadTs;
        if (j != -9223372036854775807L) {
            epochMilli = (j - epochMilli) + j;
        }
        return new kw21(this.utcTiming.a, DateTimeFormatter.ofPattern(UTC_PATTERN).withZone(ZoneOffset.UTC).format(Instant.ofEpochMilli(((this.newStartNumber - this.startNumber) * this.segmentLengthForLive) + epochMilli)));
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        d6z.x(i == i2);
        return i;
    }

    private static String checkLanguageConsistency(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        d6z.x(str.equals(str2));
        return str;
    }

    private int getBaseUrlsPriority() {
        int i = this.baseUrlPriority;
        this.baseUrlPriority = i + 1;
        return i;
    }

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            return -9223372036854775807L;
        }
        return j;
    }

    private long getLastSystemTimestampFromCacheMetadata() {
        pb7 pb7Var;
        if (this.cache != null && (pb7Var = this.cacheKeyFactory) != null) {
            try {
                return ((f9h) this.cache.getContentMetadata(pb7Var.buildCacheKey(new npg(Uri.parse(this.manifestUrl))))).d(-9223372036854775807L, "timestamp");
            } catch (Throwable th) {
                Log.e(TAG, "Error parsing manifestUrl", th);
            }
        }
        return -9223372036854775807L;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    private boolean isPreloadedLiveDashManifestExistsInCache() {
        return this.isPreloadLiveDashEnabled && this.preloadedLiveDashState == PreloadedLiveDashState.IS_MANIFEST_EXISTS_IN_CACHE;
    }

    private void updatePreloadedLiveDashState(Uri uri, boolean z) {
        if (this.preloadedLiveDashState == PreloadedLiveDashState.IS_MANIFEST_WAS_TAKEN_FROM_CACHE) {
            this.preloadedLiveDashState = PreloadedLiveDashState.IS_MANIFEST_WAS_TAKEN_FROM_NETWORK;
        }
        PreloadedLiveDashState preloadedLiveDashState = PreloadedLiveDashState.DEFAULT_PLAYBACK;
        if (this.preloadedLiveDashState == PreloadedLiveDashState.INIT && z && this.cache != null && this.cacheKeyFactory != null) {
            if (this.cache.getKeys().contains(this.cacheKeyFactory.buildCacheKey(new npg(uri)))) {
                preloadedLiveDashState = PreloadedLiveDashState.IS_MANIFEST_EXISTS_IN_CACHE;
            }
        }
        this.preloadedLiveDashState = preloadedLiveDashState;
    }

    @Override // defpackage.ggg
    public a buildFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<eyi> list, List<eyi> list2, String str4, String str5, String str6, List<eyi> list3, List<eyi> list4) {
        a buildFormat = super.buildFormat(str, str2, i, i2, f, i3, i4, i5, str3, list, list2, str4, str5, str6, list3, list4);
        if (str3 == null) {
            return buildFormat;
        }
        w820 w820Var = buildFormat.l;
        w820 a = w820Var != null ? w820Var.a(new ManifestLanguageHolder(str3)) : new w820(new ManifestLanguageHolder(str3));
        f7s a2 = buildFormat.a();
        a2.k = a;
        return new a(a2);
    }

    @Override // defpackage.ggg
    public YandexDashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lhf0 lhf0Var, kw21 kw21Var, kvq0 kvq0Var, Uri uri, List<pxa0> list) {
        long j8 = this.minTotalAvailabilityTimeOffsetUs;
        if (j8 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            j8 = 0;
        }
        UUID uuid = b87.a;
        return new YandexDashManifest(j, j2, j3, z, j4, j5, j6, j7, lhf0Var, kw21Var, kvq0Var, uri, list, tw21.l0(j8), this.manifestUrl);
    }

    @Override // defpackage.ggg
    public s4j0 buildRepresentation(fgg fggVar, String str, List<kqx> list, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<eyi> arrayList2) {
        ParsedSegmentBaseHolder parsedSegmentBaseHolder = this.parsedSegmentBaseHolder;
        if (parsedSegmentBaseHolder != null) {
            parsedSegmentBaseHolder.onNewSegmentBaseParsed(fggVar.a, fggVar.c);
        }
        return super.buildRepresentation(fggVar, str, list, str2, arrayList, arrayList2);
    }

    @Override // defpackage.ggg
    public y7q0 buildSegmentList(w6i0 w6i0Var, long j, long j2, long j3, long j4, List<a8q0> list, long j5, List<w6i0> list2, long j6, long j7) {
        long j8;
        w6i0 w6i0Var2;
        long j9;
        long j10;
        long j11;
        List<a8q0> list3;
        long j12;
        List<w6i0> list4;
        long j13;
        long j14;
        if (isPreloadedLiveDashManifestExistsInCache()) {
            j8 = this.newStartNumber;
            j10 = j2;
            j11 = j4;
            list3 = list;
            j12 = j5;
            list4 = list2;
            j13 = j6;
            j14 = j7;
            w6i0Var2 = w6i0Var;
            j9 = j;
        } else {
            j8 = j3;
            w6i0Var2 = w6i0Var;
            j9 = j;
            j10 = j2;
            j11 = j4;
            list3 = list;
            j12 = j5;
            list4 = list2;
            j13 = j6;
            j14 = j7;
        }
        return super.buildSegmentList(w6i0Var2, j9, j10, j8, j11, list3, j12, list4, j13, j14);
    }

    @Override // defpackage.ggg
    public z7q0 buildSegmentTemplate(w6i0 w6i0Var, long j, long j2, long j3, long j4, long j5, List<a8q0> list, long j6, xh21 xh21Var, xh21 xh21Var2, long j7, long j8) {
        long j9;
        w6i0 w6i0Var2;
        long j10;
        long j11;
        long j12;
        long j13;
        List<a8q0> list2;
        long j14;
        xh21 xh21Var3;
        xh21 xh21Var4;
        long j15;
        long j16;
        if (isPreloadedLiveDashManifestExistsInCache()) {
            j9 = this.newStartNumber;
            j11 = j2;
            j12 = j4;
            j13 = j5;
            list2 = list;
            j14 = j6;
            xh21Var3 = xh21Var;
            xh21Var4 = xh21Var2;
            j15 = j7;
            j16 = j8;
            w6i0Var2 = w6i0Var;
            j10 = j;
        } else {
            j9 = j3;
            w6i0Var2 = w6i0Var;
            j10 = j;
            j11 = j2;
            j12 = j4;
            j13 = j5;
            list2 = list;
            j14 = j6;
            xh21Var3 = xh21Var;
            xh21Var4 = xh21Var2;
            j15 = j7;
            j16 = j8;
        }
        return super.buildSegmentTemplate(w6i0Var2, j10, j11, j9, j12, j13, list2, j14, xh21Var3, xh21Var4, j15, j16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x03ce A[LOOP:0: B:2:0x009b->B:11:0x03ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0382 A[EDGE_INSN: B:12:0x0382->B:13:0x0382 BREAK  A[LOOP:0: B:2:0x009b->B:11:0x03ce], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r45v0, types: [ggg, ru.yandex.video.m3.player.impl.source.dash.manifest.ExtendedDashManifestParser] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a70 parseAdaptationSet(XmlPullParser xmlPullParser, List<ic5> list, c8q0 c8q0Var, long j, long j2, long j3, long j4, long j5, String str, boolean z) throws XmlPullParserException, IOException {
        String str2;
        int i;
        long j6;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        String str3;
        c8q0 c8q0Var2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List<ic5> list2;
        int i4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        float f;
        String str4;
        long j7;
        int i5;
        ArrayList arrayList8;
        String str5;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        List<ic5> list3;
        List<ic5> list4;
        boolean z2;
        ExtendedDashManifestParser extendedDashManifestParser = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long parseLong = ggg.parseLong(xmlPullParser2, "id", -1L);
        int parseContentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
        int parseInt = ggg.parseInt(xmlPullParser2, "width", -1);
        int parseInt2 = ggg.parseInt(xmlPullParser2, "height", -1);
        float parseFrameRate = ggg.parseFrameRate(xmlPullParser2, -1.0f);
        int parseInt3 = ggg.parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str6 = "lang";
        String attributeValue5 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue6 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = arrayList12;
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = arrayList14;
        ArrayList arrayList20 = new ArrayList();
        String str7 = attributeValue;
        ArrayList arrayList21 = new ArrayList();
        String str8 = attributeValue3;
        long j8 = j2;
        long j9 = j3;
        int i6 = parseContentType;
        String str9 = attributeValue5;
        boolean z3 = false;
        String str10 = null;
        c8q0 c8q0Var3 = c8q0Var;
        int i7 = parseInt2;
        float f2 = parseFrameRate;
        int i8 = -1;
        ?? r3 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (hq91.e(xmlPullParser2, "BaseURL")) {
                if (z3) {
                    str2 = attributeValue4;
                    i = parseInt;
                    list4 = list;
                    z2 = z;
                } else {
                    extendedDashManifestParser.baseUrlPriority = 0;
                    str2 = attributeValue4;
                    j8 = extendedDashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser2, j8);
                    z3 = true;
                    list4 = list;
                    z2 = z;
                    i = parseInt;
                }
                r3.addAll(extendedDashManifestParser.parseBaseUrl(xmlPullParser2, list4, z2));
                ArrayList arrayList22 = arrayList15;
                arrayList6 = arrayList17;
                arrayList9 = arrayList22;
                String str11 = str9;
                arrayList8 = arrayList21;
                str4 = str11;
                str5 = attributeValue2;
                i3 = parseInt3;
                str3 = str6;
                j6 = j8;
                i2 = i6;
                i4 = 0;
                list2 = r3;
                arrayList2 = arrayList13;
                c8q0Var2 = c8q0Var3;
                arrayList10 = arrayList20;
            } else {
                str2 = attributeValue4;
                i = parseInt;
                j6 = j8;
                if (hq91.e(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                    arrayList = r3;
                    Object obj = parseContentProtection.first;
                    if (obj != null) {
                        str10 = (String) obj;
                    }
                    Object obj2 = parseContentProtection.second;
                    if (obj2 != null) {
                        arrayList13.add((DrmInitData.SchemeData) obj2);
                    }
                    ArrayList arrayList23 = arrayList15;
                    arrayList6 = arrayList17;
                    arrayList9 = arrayList23;
                    String str12 = str9;
                    arrayList8 = arrayList21;
                    str4 = str12;
                    arrayList10 = arrayList20;
                    arrayList2 = arrayList13;
                    str5 = attributeValue2;
                    i3 = parseInt3;
                    str3 = str6;
                    c8q0Var2 = c8q0Var3;
                    arrayList11 = arrayList19;
                    i2 = i6;
                    i4 = 0;
                } else {
                    arrayList = r3;
                    if (hq91.e(xmlPullParser2, "ContentComponent")) {
                        String checkLanguageConsistency = checkLanguageConsistency(str9, xmlPullParser2.getAttributeValue(null, str6));
                        int checkContentTypeConsistency = checkContentTypeConsistency(i6, parseContentType(xmlPullParser));
                        ArrayList arrayList24 = arrayList15;
                        arrayList6 = arrayList17;
                        arrayList9 = arrayList24;
                        arrayList10 = arrayList20;
                        arrayList2 = arrayList13;
                        str5 = attributeValue2;
                        i3 = parseInt3;
                        str3 = str6;
                        c8q0Var2 = c8q0Var3;
                        arrayList11 = arrayList19;
                        arrayList8 = arrayList21;
                        i2 = checkContentTypeConsistency;
                        i4 = 0;
                        str4 = checkLanguageConsistency;
                    } else {
                        i2 = i6;
                        String str13 = str9;
                        if (hq91.e(xmlPullParser2, "Role")) {
                            arrayList17.add(ggg.parseDescriptor(xmlPullParser2, "Role"));
                        } else if (hq91.e(xmlPullParser2, "AudioChannelConfiguration")) {
                            ArrayList arrayList25 = arrayList15;
                            arrayList6 = arrayList17;
                            arrayList9 = arrayList25;
                            i8 = extendedDashManifestParser.parseAudioChannelConfiguration(xmlPullParser2, attributeValue2);
                            arrayList2 = arrayList13;
                            str5 = attributeValue2;
                            i3 = parseInt3;
                            str3 = str6;
                            c8q0Var2 = c8q0Var3;
                            arrayList8 = arrayList21;
                            list2 = arrayList;
                            i4 = 0;
                            arrayList10 = arrayList20;
                            str4 = str13;
                        } else if (hq91.e(xmlPullParser2, "Accessibility")) {
                            arrayList16.add(ggg.parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (hq91.e(xmlPullParser2, "EssentialProperty")) {
                            arrayList18.add(ggg.parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (hq91.e(xmlPullParser2, "SupplementalProperty")) {
                            arrayList20.add(ggg.parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else {
                            if (hq91.e(xmlPullParser2, "Representation")) {
                                if (arrayList.isEmpty()) {
                                    list3 = list;
                                    list2 = arrayList;
                                } else {
                                    list3 = arrayList;
                                    list2 = list3;
                                }
                                arrayList2 = arrayList13;
                                ArrayList arrayList26 = arrayList18;
                                str3 = str6;
                                arrayList3 = arrayList15;
                                int i9 = i7;
                                arrayList4 = arrayList19;
                                String str14 = str7;
                                arrayList8 = arrayList21;
                                i4 = 0;
                                c8q0 c8q0Var4 = c8q0Var3;
                                ArrayList arrayList27 = arrayList20;
                                XmlPullParser xmlPullParser3 = xmlPullParser2;
                                String str15 = str8;
                                fgg parseRepresentation = extendedDashManifestParser.parseRepresentation(xmlPullParser3, list3, str14, attributeValue2, str15, str2, i, i9, f2, i8, parseInt3, str13, arrayList17, arrayList16, arrayList26, arrayList27, c8q0Var4, j4, j, j6, j9, j5, str, z);
                                str7 = str14;
                                str2 = str2;
                                i = i;
                                i7 = i9;
                                arrayList5 = arrayList26;
                                c8q0Var2 = c8q0Var4;
                                j7 = j9;
                                i3 = parseInt3;
                                arrayList6 = arrayList17;
                                str8 = str15;
                                str4 = str13;
                                j6 = j6;
                                arrayList7 = arrayList16;
                                f = f2;
                                int checkContentTypeConsistency2 = checkContentTypeConsistency(i2, eh20.i(parseRepresentation.a.n));
                                arrayList8.add(parseRepresentation);
                                i2 = checkContentTypeConsistency2;
                                xmlPullParser2 = xmlPullParser3;
                                arrayList10 = arrayList27;
                                str5 = attributeValue2;
                            } else {
                                arrayList2 = arrayList13;
                                i3 = parseInt3;
                                str3 = str6;
                                c8q0Var2 = c8q0Var3;
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList19;
                                list2 = arrayList;
                                i4 = 0;
                                ArrayList arrayList28 = arrayList20;
                                arrayList5 = arrayList18;
                                arrayList6 = arrayList17;
                                arrayList7 = arrayList16;
                                XmlPullParser xmlPullParser4 = xmlPullParser2;
                                String str16 = attributeValue2;
                                f = f2;
                                ArrayList arrayList29 = arrayList21;
                                ExtendedDashManifestParser extendedDashManifestParser2 = extendedDashManifestParser;
                                str4 = str13;
                                j7 = j9;
                                i5 = i8;
                                if (hq91.e(xmlPullParser4, "SegmentBase")) {
                                    b8q0 parseSegmentBase = extendedDashManifestParser2.parseSegmentBase(xmlPullParser4, (b8q0) c8q0Var2);
                                    i2 = i2;
                                    xmlPullParser2 = xmlPullParser4;
                                    c8q0Var2 = parseSegmentBase;
                                    arrayList8 = arrayList29;
                                    arrayList10 = arrayList28;
                                    str5 = str16;
                                    i8 = i5;
                                } else {
                                    if (hq91.e(xmlPullParser4, "SegmentList")) {
                                        long parseAvailabilityTimeOffsetUs = extendedDashManifestParser2.parseAvailabilityTimeOffsetUs(xmlPullParser4, j7);
                                        i2 = i2;
                                        arrayList8 = arrayList29;
                                        str5 = str16;
                                        xmlPullParser2 = xmlPullParser;
                                        arrayList9 = arrayList3;
                                        y7q0 parseSegmentList = extendedDashManifestParser2.parseSegmentList(xmlPullParser2, (y7q0) c8q0Var2, j4, j, j6, parseAvailabilityTimeOffsetUs, j5);
                                        j6 = j6;
                                        c8q0Var2 = parseSegmentList;
                                        arrayList10 = arrayList28;
                                        i8 = i5;
                                        arrayList11 = arrayList4;
                                        j9 = parseAvailabilityTimeOffsetUs;
                                    } else {
                                        i2 = i2;
                                        xmlPullParser2 = xmlPullParser4;
                                        arrayList8 = arrayList29;
                                        str5 = str16;
                                        arrayList9 = arrayList3;
                                        if (hq91.e(xmlPullParser2, "SegmentTemplate")) {
                                            long parseAvailabilityTimeOffsetUs2 = extendedDashManifestParser2.parseAvailabilityTimeOffsetUs(xmlPullParser2, j7);
                                            arrayList10 = arrayList28;
                                            z7q0 parseSegmentTemplate = extendedDashManifestParser2.parseSegmentTemplate(xmlPullParser2, (z7q0) c8q0Var2, arrayList10, j4, j, j6, parseAvailabilityTimeOffsetUs2, j5);
                                            j6 = j6;
                                            i8 = i5;
                                            j9 = parseAvailabilityTimeOffsetUs2;
                                            c8q0Var2 = parseSegmentTemplate;
                                            arrayList11 = arrayList4;
                                        } else {
                                            arrayList10 = arrayList28;
                                            if (hq91.e(xmlPullParser2, "InbandEventStream")) {
                                                arrayList11 = arrayList4;
                                                arrayList11.add(ggg.parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                            } else {
                                                arrayList11 = arrayList4;
                                                if (hq91.e(xmlPullParser2, "Label")) {
                                                    arrayList9.add(parseLabel(xmlPullParser));
                                                } else if (xmlPullParser2.getEventType() == 2) {
                                                    parseAdaptationSetChild(xmlPullParser);
                                                }
                                            }
                                            i8 = i5;
                                            j9 = j7;
                                        }
                                    }
                                    if (hq91.d(xmlPullParser2, "AdaptationSet")) {
                                        break;
                                    }
                                    ArrayList arrayList30 = arrayList6;
                                    arrayList15 = arrayList9;
                                    arrayList17 = arrayList30;
                                    ArrayList arrayList31 = arrayList8;
                                    str9 = str4;
                                    arrayList21 = arrayList31;
                                    extendedDashManifestParser = this;
                                    attributeValue2 = str5;
                                    f2 = f;
                                    parseInt3 = i3;
                                    arrayList16 = arrayList7;
                                    arrayList18 = arrayList5;
                                    parseInt = i;
                                    str6 = str3;
                                    arrayList19 = arrayList11;
                                    arrayList20 = arrayList10;
                                    c8q0Var3 = c8q0Var2;
                                    arrayList13 = arrayList2;
                                    r3 = list2;
                                    j8 = j6;
                                    attributeValue4 = str2;
                                    i6 = i2;
                                }
                            }
                            arrayList11 = arrayList4;
                            arrayList9 = arrayList3;
                            j9 = j7;
                            if (hq91.d(xmlPullParser2, "AdaptationSet")) {
                            }
                        }
                        ArrayList arrayList32 = arrayList15;
                        arrayList6 = arrayList17;
                        arrayList9 = arrayList32;
                        arrayList10 = arrayList20;
                        arrayList2 = arrayList13;
                        str5 = attributeValue2;
                        i3 = parseInt3;
                        str3 = str6;
                        c8q0Var2 = c8q0Var3;
                        arrayList11 = arrayList19;
                        arrayList8 = arrayList21;
                        list2 = arrayList;
                        i4 = 0;
                        str4 = str13;
                        arrayList5 = arrayList18;
                        arrayList7 = arrayList16;
                        j7 = j9;
                        f = f2;
                        i5 = i8;
                        i8 = i5;
                        j9 = j7;
                        if (hq91.d(xmlPullParser2, "AdaptationSet")) {
                        }
                    }
                }
                arrayList5 = arrayList18;
                arrayList7 = arrayList16;
                list2 = arrayList;
                f = f2;
                if (hq91.d(xmlPullParser2, "AdaptationSet")) {
                }
            }
            arrayList7 = arrayList16;
            arrayList11 = arrayList19;
            arrayList5 = arrayList18;
            f = f2;
            if (hq91.d(xmlPullParser2, "AdaptationSet")) {
            }
        }
        ArrayList arrayList33 = new ArrayList(arrayList8.size());
        int i10 = i4;
        while (i10 < arrayList8.size()) {
            ArrayList arrayList34 = arrayList11;
            String str17 = attributeValue6;
            arrayList33.add(buildRepresentation((fgg) arrayList8.get(i10), str17, arrayList9, str10, arrayList2, arrayList34));
            i10++;
            attributeValue6 = str17;
            arrayList11 = arrayList34;
        }
        return buildAdaptationSet(parseLong, i2, arrayList33, arrayList7, arrayList5, arrayList10);
    }

    @Override // defpackage.ggg
    public List<ic5> parseBaseUrl(XmlPullParser xmlPullParser, List<ic5> list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : getBaseUrlsPriority();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String parseText = ggg.parseText(xmlPullParser, "BaseURL");
        if (parseText != null && m4m0.f(parseText)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = parseText;
            }
            return u.a(new ic5(parseText, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ic5 ic5Var = list.get(i);
            String i2 = m4m0.i(ic5Var.a, parseText);
            String str = attributeValue3 == null ? i2 : attributeValue3;
            if (z) {
                parseInt = ic5Var.c;
                parseInt2 = ic5Var.d;
                str = ic5Var.b;
            }
            arrayList.add(new ic5(i2, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022a  */
    @Override // defpackage.ggg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public egg parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        long j;
        long j2;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j3;
        String str;
        long j4;
        ExtendedDashManifestParser extendedDashManifestParser = this;
        extendedDashManifestParser.minTotalAvailabilityTimeOffsetUs = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        boolean isDvbProfileDeclared = extendedDashManifestParser.isDvbProfileDeclared(extendedDashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long parseDateTime = ggg.parseDateTime(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long parseDuration = ggg.parseDuration(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long parseDuration2 = ggg.parseDuration(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long parseDuration3 = equals ? ggg.parseDuration(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration4 = equals ? ggg.parseDuration(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration5 = equals ? ggg.parseDuration(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long parseDateTime2 = ggg.parseDateTime(xmlPullParser, "publishTime", -9223372036854775807L);
        long j5 = equals ? 0L : -9223372036854775807L;
        ArrayList arrayList3 = new ArrayList();
        long j6 = equals ? -9223372036854775807L : 0L;
        ArrayList arrayList4 = new ArrayList();
        String uri2 = uri.toString();
        extendedDashManifestParser.manifestUrl = uri2;
        long j7 = parseDateTime;
        ArrayList a = u.a(new ic5(uri.toString(), uri.toString(), isDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        extendedDashManifestParser.manifestUrl = uri2;
        if (extendedDashManifestParser.isPreloadLiveDashEnabled) {
            extendedDashManifestParser.updatePreloadedLiveDashState(uri, equals);
        } else {
            extendedDashManifestParser.preloadedLiveDashState = PreloadedLiveDashState.DEFAULT_PLAYBACK;
        }
        long j8 = j5;
        Uri uri3 = null;
        kvq0 kvq0Var = null;
        boolean z = false;
        lhf0 lhf0Var = null;
        boolean z2 = false;
        while (true) {
            xmlPullParser.next();
            boolean z3 = equals;
            if (hq91.e(xmlPullParser, "BaseURL")) {
                if (!z) {
                    extendedDashManifestParser.baseUrlPriority = 0;
                    j8 = extendedDashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j8);
                    z = true;
                }
                List<ic5> parseBaseUrl = extendedDashManifestParser.parseBaseUrl(xmlPullParser, a, isDvbProfileDeclared);
                long j9 = j8;
                if (extendedDashManifestParser.parsedBaseUrlsHolder != null) {
                    for (Iterator<ic5> it = parseBaseUrl.iterator(); it.hasNext(); it = it) {
                        extendedDashManifestParser.parsedBaseUrlsHolder.onNewBaseUrlParsed(it.next().a);
                    }
                }
                arrayList4.addAll(parseBaseUrl);
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                j = j9;
                str = uri2;
                j2 = j6;
                j3 = j7;
            } else {
                if (hq91.e(xmlPullParser, "ProgramInformation")) {
                    lhf0Var = parseProgramInformation(xmlPullParser);
                } else if (hq91.e(xmlPullParser, "UTCTiming")) {
                    extendedDashManifestParser.utcTiming = parseUtcTiming(xmlPullParser);
                } else if (hq91.e(xmlPullParser, "Location")) {
                    uri3 = Uri.parse(xmlPullParser.nextText());
                } else if (hq91.e(xmlPullParser, "ServiceDescription")) {
                    kvq0Var = parseServiceDescription(xmlPullParser);
                } else if (!hq91.e(xmlPullParser, "Period") || z2) {
                    j = j8;
                    j2 = j6;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    j3 = j7;
                    str = uri2;
                    ggg.maybeSkipTag(xmlPullParser);
                } else {
                    arrayList2 = arrayList4;
                    long j10 = j8;
                    ArrayList arrayList5 = !arrayList4.isEmpty() ? arrayList2 : a;
                    ArrayList arrayList6 = arrayList3;
                    str = uri2;
                    long j11 = j6;
                    j3 = j7;
                    Pair<pxa0, Long> parsePeriod = extendedDashManifestParser.parsePeriod(xmlPullParser, arrayList5, j11, j10, j3, parseDuration4, str, isDvbProfileDeclared);
                    j2 = j11;
                    pxa0 pxa0Var = (pxa0) parsePeriod.first;
                    j = j10;
                    if (pxa0Var.b != -9223372036854775807L) {
                        long longValue = ((Long) parsePeriod.second).longValue();
                        long j12 = longValue == -9223372036854775807L ? -9223372036854775807L : pxa0Var.b + longValue;
                        arrayList = arrayList6;
                        arrayList.add(pxa0Var);
                        j2 = j12;
                    } else {
                        if (!z3) {
                            throw ParserException.c("Unable to determine start of period " + arrayList6.size());
                        }
                        arrayList = arrayList6;
                        z2 = true;
                    }
                }
                j = j8;
                j2 = j6;
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                j3 = j7;
                str = uri2;
            }
            if (hq91.d(xmlPullParser, "MPD")) {
                if (parseDuration == -9223372036854775807L) {
                    if (j2 != -9223372036854775807L) {
                        j4 = j2;
                        if (!arrayList.isEmpty()) {
                            throw ParserException.c("No periods found.");
                        }
                        if (extendedDashManifestParser.isPreloadedLiveDashManifestExistsInCache()) {
                            extendedDashManifestParser.utcTiming = extendedDashManifestParser.calculateNewUtcTimingElement();
                        }
                        return extendedDashManifestParser.buildMediaPresentationDescription(j3, j4, parseDuration2, z3, parseDuration3, parseDuration4, parseDuration5, parseDateTime2, lhf0Var, extendedDashManifestParser.utcTiming, kvq0Var, uri3, (List<pxa0>) arrayList);
                    }
                    if (!z3) {
                        throw ParserException.c("Unable to determine duration of static manifest.");
                    }
                }
                j4 = parseDuration;
                if (!arrayList.isEmpty()) {
                }
            } else {
                uri3 = uri3;
                parseDuration3 = parseDuration3;
                parseDuration4 = parseDuration4;
                parseDuration5 = parseDuration5;
                j7 = j3;
                uri2 = str;
                kvq0Var = kvq0Var;
                arrayList4 = arrayList2;
                equals = z3;
                j6 = j2;
                arrayList3 = arrayList;
                parseDuration2 = parseDuration2;
                j8 = j;
                extendedDashManifestParser = this;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    public Pair<pxa0, Long> parsePeriod(XmlPullParser xmlPullParser, List<ic5> list, long j, long j2, long j3, long j4, String str, boolean z) throws XmlPullParserException, IOException {
        ExtendedDashManifestParser extendedDashManifestParser;
        ArrayList arrayList;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        c8q0 c8q0Var;
        long j5;
        long j6;
        int i;
        List<ic5> list2;
        long j7;
        ArrayList arrayList4;
        long j8;
        long j9;
        long j10;
        long j11;
        ArrayList arrayList5;
        c8q0 parseSegmentTemplate;
        boolean z2;
        List<ic5> list3;
        long j12;
        ExtendedDashManifestParser extendedDashManifestParser2 = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long parseDuration = ggg.parseDuration(xmlPullParser3, "start", j);
        long j13 = j3 != -9223372036854775807L ? j3 + parseDuration : -9223372036854775807L;
        long parseDuration2 = ggg.parseDuration(xmlPullParser3, "duration", -9223372036854775807L);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        int i2 = 0;
        long j14 = j2;
        eyi eyiVar = null;
        long j15 = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        boolean z3 = false;
        c8q0 c8q0Var2 = null;
        ?? r9 = arrayList8;
        while (true) {
            xmlPullParser3.next();
            if (hq91.e(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    extendedDashManifestParser2.baseUrlPriority = i2;
                    j14 = extendedDashManifestParser2.parseAvailabilityTimeOffsetUs(xmlPullParser3, j14);
                    z3 = true;
                }
                r9.addAll(extendedDashManifestParser2.parseBaseUrl(xmlPullParser3, list, z));
                ArrayList arrayList10 = arrayList9;
                c8q0Var = c8q0Var2;
                j8 = j13;
                j6 = j15;
                list2 = r9;
                arrayList5 = arrayList10;
                j9 = parseDuration2;
                arrayList2 = arrayList7;
                j10 = j14;
                j11 = j16;
                i = 0;
                arrayList4 = arrayList6;
            } else {
                if (hq91.e(xmlPullParser3, "AdaptationSet")) {
                    if (r9.isEmpty()) {
                        XmlPullParser xmlPullParser4 = xmlPullParser3;
                        extendedDashManifestParser = extendedDashManifestParser2;
                        arrayList = arrayList6;
                        xmlPullParser2 = xmlPullParser4;
                        z2 = z;
                        list3 = list;
                        arrayList3 = arrayList9;
                        long j17 = j15;
                        list2 = r9;
                        j12 = j17;
                    } else {
                        XmlPullParser xmlPullParser5 = xmlPullParser3;
                        extendedDashManifestParser = extendedDashManifestParser2;
                        arrayList = arrayList6;
                        xmlPullParser2 = xmlPullParser5;
                        z2 = z;
                        list3 = r9;
                        arrayList3 = arrayList9;
                        j12 = j15;
                        list2 = list3;
                    }
                    long j18 = parseDuration2;
                    arrayList2 = arrayList7;
                    long j19 = j14;
                    i = 0;
                    a70 parseAdaptationSet = extendedDashManifestParser.parseAdaptationSet(xmlPullParser2, list3, c8q0Var2, j18, j19, j12, j13, j4, str, z2);
                    c8q0Var = c8q0Var2;
                    j7 = j19;
                    parseDuration2 = j18;
                    j5 = j13;
                    j6 = j12;
                    arrayList.add(parseAdaptationSet);
                } else {
                    XmlPullParser xmlPullParser6 = xmlPullParser3;
                    extendedDashManifestParser = extendedDashManifestParser2;
                    arrayList = arrayList6;
                    xmlPullParser2 = xmlPullParser6;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList9;
                    c8q0Var = c8q0Var2;
                    j5 = j13;
                    j6 = j15;
                    i = 0;
                    list2 = r9;
                    j7 = j14;
                    if (hq91.e(xmlPullParser2, "EventStream")) {
                        arrayList2.add(parseEventStream(xmlPullParser));
                    } else if (hq91.e(xmlPullParser2, "SegmentBase")) {
                        c8q0 parseSegmentBase = extendedDashManifestParser.parseSegmentBase(xmlPullParser2, null);
                        arrayList4 = arrayList;
                        extendedDashManifestParser2 = extendedDashManifestParser;
                        xmlPullParser3 = xmlPullParser2;
                        c8q0Var = parseSegmentBase;
                        j8 = j5;
                        j9 = parseDuration2;
                        j10 = j7;
                        arrayList2 = arrayList2;
                        arrayList5 = arrayList3;
                        j11 = -9223372036854775807L;
                    } else {
                        if (hq91.e(xmlPullParser2, "SegmentList")) {
                            j8 = j5;
                            j9 = parseDuration2;
                            j10 = j7;
                            arrayList2 = arrayList2;
                            j11 = -9223372036854775807L;
                            long parseAvailabilityTimeOffsetUs = extendedDashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser2, -9223372036854775807L);
                            arrayList4 = arrayList;
                            extendedDashManifestParser2 = extendedDashManifestParser;
                            xmlPullParser3 = xmlPullParser;
                            parseSegmentTemplate = extendedDashManifestParser2.parseSegmentList(xmlPullParser3, null, j8, j9, j10, parseAvailabilityTimeOffsetUs, j4);
                            j6 = parseAvailabilityTimeOffsetUs;
                        } else {
                            arrayList4 = arrayList;
                            extendedDashManifestParser2 = extendedDashManifestParser;
                            xmlPullParser3 = xmlPullParser2;
                            j8 = j5;
                            j9 = parseDuration2;
                            j10 = j7;
                            arrayList2 = arrayList2;
                            j11 = -9223372036854775807L;
                            if (hq91.e(xmlPullParser3, "SegmentTemplate")) {
                                long parseAvailabilityTimeOffsetUs2 = extendedDashManifestParser2.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                                parseSegmentTemplate = extendedDashManifestParser2.parseSegmentTemplate(xmlPullParser3, null, ImmutableList.p(), j8, j9, j10, parseAvailabilityTimeOffsetUs2, j4);
                                j8 = j8;
                                j9 = j9;
                                j10 = j10;
                                j6 = parseAvailabilityTimeOffsetUs2;
                            } else if (hq91.e(xmlPullParser3, "AssetIdentifier")) {
                                eyiVar = ggg.parseDescriptor(xmlPullParser3, "AssetIdentifier");
                                arrayList5 = arrayList3;
                            } else if (extendedDashManifestParser2.supplementalPropertiesInPeriodParseListener == null || !hq91.e(xmlPullParser3, "SupplementalProperty")) {
                                arrayList5 = arrayList3;
                                ggg.maybeSkipTag(xmlPullParser3);
                            } else {
                                arrayList5 = arrayList3;
                                arrayList5.add(ggg.parseDescriptor(xmlPullParser3, "SupplementalProperty"));
                            }
                        }
                        arrayList5 = arrayList3;
                        c8q0Var = parseSegmentTemplate;
                    }
                }
                arrayList4 = arrayList;
                extendedDashManifestParser2 = extendedDashManifestParser;
                xmlPullParser3 = xmlPullParser2;
                j8 = j5;
                j9 = parseDuration2;
                j10 = j7;
                arrayList5 = arrayList3;
                j11 = -9223372036854775807L;
            }
            if (hq91.d(xmlPullParser3, "Period")) {
                break;
            }
            parseDuration = parseDuration;
            i2 = i;
            arrayList6 = arrayList4;
            attributeValue = attributeValue;
            j16 = j11;
            extendedDashManifestParser2 = this;
            j14 = j10;
            arrayList7 = arrayList2;
            parseDuration2 = j9;
            c8q0 c8q0Var3 = c8q0Var;
            arrayList9 = arrayList5;
            r9 = list2;
            j15 = j6;
            j13 = j8;
            c8q0Var2 = c8q0Var3;
        }
        SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener = extendedDashManifestParser2.supplementalPropertiesInPeriodParseListener;
        if (supplementalPropertiesInPeriodParseListener != null) {
            supplementalPropertiesInPeriodParseListener.onSupplementalPropertiesParsed(str, arrayList5);
        }
        return Pair.create(extendedDashManifestParser2.buildPeriod(attributeValue, parseDuration, arrayList4, arrayList2, eyiVar), Long.valueOf(j9));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0278 A[LOOP:0: B:2:0x007a->B:11:0x0278, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0211 A[EDGE_INSN: B:12:0x0211->B:13:0x0211 BREAK  A[LOOP:0: B:2:0x007a->B:11:0x0278], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fgg parseRepresentation(XmlPullParser xmlPullParser, List<ic5> list, String str, String str2, String str3, String str4, int i, int i2, float f, int i3, int i4, String str5, List<eyi> list2, List<eyi> list3, List<eyi> list4, List<eyi> list5, c8q0 c8q0Var, long j, long j2, long j3, long j4, long j5, String str6, boolean z) throws XmlPullParserException, IOException {
        String str7;
        ArrayList arrayList;
        int i5;
        ArrayList arrayList2;
        int i6;
        ArrayList arrayList3;
        XmlPullParser xmlPullParser2;
        String str8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j6;
        String str9;
        boolean z2;
        long j7;
        int i7;
        c8q0 c8q0Var2;
        c8q0 parseSegmentTemplate;
        ExtendedDashManifestParser extendedDashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        int parseInt = ggg.parseInt(xmlPullParser3, "bandwidth", -1);
        String parseString = ggg.parseString(xmlPullParser3, "mimeType", str);
        String parseString2 = ggg.parseString(xmlPullParser3, "codecs", str2);
        String parseString3 = ggg.parseString(xmlPullParser3, "scte214:supplementalCodecs", str3);
        String parseString4 = ggg.parseString(xmlPullParser3, "scte214:supplementalProfiles", str4);
        int parseInt2 = ggg.parseInt(xmlPullParser3, "width", i);
        int parseInt3 = ggg.parseInt(xmlPullParser3, "height", i2);
        float parseFrameRate = ggg.parseFrameRate(xmlPullParser3, f);
        int parseInt4 = ggg.parseInt(xmlPullParser3, "audioSamplingRate", i4);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList(list4);
        ArrayList arrayList9 = new ArrayList(list5);
        ArrayList arrayList10 = new ArrayList();
        int i8 = 0;
        int i9 = i3;
        long j8 = j3;
        long j9 = j4;
        String str10 = null;
        boolean z3 = false;
        c8q0 c8q0Var3 = c8q0Var;
        while (true) {
            xmlPullParser3.next();
            if (hq91.e(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    extendedDashManifestParser.baseUrlPriority = i8;
                    j8 = extendedDashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j8);
                    z3 = true;
                }
                str7 = attributeValue;
                arrayList10.addAll(extendedDashManifestParser.parseBaseUrl(xmlPullParser3, list, z));
            } else {
                str7 = attributeValue;
                if (hq91.e(xmlPullParser3, "AudioChannelConfiguration")) {
                    int parseAudioChannelConfiguration = extendedDashManifestParser.parseAudioChannelConfiguration(xmlPullParser3, parseString2);
                    xmlPullParser2 = xmlPullParser3;
                    arrayList = arrayList6;
                    c8q0Var2 = c8q0Var3;
                    i7 = parseAudioChannelConfiguration;
                    str8 = parseString2;
                    j6 = j9;
                    str9 = str10;
                    z2 = z3;
                    i5 = 0;
                    arrayList2 = arrayList10;
                    j7 = j8;
                    i6 = parseInt;
                    arrayList3 = arrayList7;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList9;
                    if (!hq91.d(xmlPullParser2, "Representation")) {
                        break;
                    }
                    int i10 = parseInt2;
                    ArrayList arrayList11 = arrayList3;
                    String str11 = parseString4;
                    ArrayList arrayList12 = arrayList;
                    String str12 = parseString3;
                    ArrayList arrayList13 = arrayList5;
                    parseString = parseString;
                    arrayList8 = arrayList4;
                    xmlPullParser3 = xmlPullParser2;
                    arrayList6 = arrayList12;
                    c8q0Var3 = c8q0Var2;
                    arrayList10 = arrayList2;
                    j8 = j7;
                    i8 = i5;
                    parseString2 = str8;
                    z3 = z2;
                    extendedDashManifestParser = this;
                    str10 = str9;
                    i9 = i7;
                    parseString4 = str11;
                    arrayList7 = arrayList11;
                    parseInt = i6;
                    j9 = j6;
                    parseInt2 = i10;
                    arrayList9 = arrayList13;
                    parseString3 = str12;
                    attributeValue = str7;
                } else if (hq91.e(xmlPullParser3, "SegmentBase")) {
                    c8q0Var3 = extendedDashManifestParser.parseSegmentBase(xmlPullParser3, (b8q0) c8q0Var3);
                } else {
                    if (hq91.e(xmlPullParser3, "SegmentList")) {
                        long j10 = j8;
                        long parseAvailabilityTimeOffsetUs = extendedDashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j9);
                        arrayList = arrayList6;
                        arrayList2 = arrayList10;
                        i6 = parseInt;
                        i5 = 0;
                        arrayList3 = arrayList7;
                        parseSegmentTemplate = extendedDashManifestParser.parseSegmentList(xmlPullParser3, (y7q0) c8q0Var3, j, j2, j10, parseAvailabilityTimeOffsetUs, j5);
                        xmlPullParser2 = xmlPullParser3;
                        str8 = parseString2;
                        str9 = str10;
                        z2 = z3;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        j7 = j10;
                        j6 = parseAvailabilityTimeOffsetUs;
                    } else {
                        arrayList = arrayList6;
                        c8q0 c8q0Var4 = c8q0Var3;
                        ArrayList arrayList14 = arrayList8;
                        ArrayList arrayList15 = arrayList9;
                        long j11 = j9;
                        i5 = 0;
                        arrayList2 = arrayList10;
                        long j12 = j8;
                        i6 = parseInt;
                        arrayList3 = arrayList7;
                        if (hq91.e(xmlPullParser3, "SegmentTemplate")) {
                            long parseAvailabilityTimeOffsetUs2 = extendedDashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j11);
                            if (parseAvailabilityTimeOffsetUs2 != -9223372036854775807L) {
                                Log.i(TAG, String.format("segmentBaseAvailabilityTimeOffsetUs = %d", Long.valueOf(parseAvailabilityTimeOffsetUs2)));
                                extendedDashManifestParser.minTotalAvailabilityTimeOffsetUs = Math.min(extendedDashManifestParser.minTotalAvailabilityTimeOffsetUs, parseAvailabilityTimeOffsetUs2);
                            }
                            str8 = parseString2;
                            parseSegmentTemplate = extendedDashManifestParser.parseSegmentTemplate(xmlPullParser3, (z7q0) c8q0Var4, list5, j, j2, j12, parseAvailabilityTimeOffsetUs2, j5);
                            xmlPullParser2 = xmlPullParser3;
                            str9 = str10;
                            z2 = z3;
                            arrayList4 = arrayList14;
                            arrayList5 = arrayList15;
                            j7 = j12;
                            j6 = parseAvailabilityTimeOffsetUs2;
                        } else {
                            xmlPullParser2 = xmlPullParser3;
                            str8 = parseString2;
                            if (hq91.e(xmlPullParser2, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                                Object obj = parseContentProtection.first;
                                if (obj != null) {
                                    str10 = (String) obj;
                                }
                                Object obj2 = parseContentProtection.second;
                                if (obj2 != null) {
                                    arrayList.add((DrmInitData.SchemeData) obj2);
                                }
                                str9 = str10;
                                z2 = z3;
                                arrayList4 = arrayList14;
                                arrayList5 = arrayList15;
                                j6 = j11;
                            } else {
                                if (hq91.e(xmlPullParser2, "InbandEventStream")) {
                                    arrayList3.add(ggg.parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                    arrayList4 = arrayList14;
                                } else if (hq91.e(xmlPullParser2, "EssentialProperty")) {
                                    arrayList4 = arrayList14;
                                    arrayList4.add(ggg.parseDescriptor(xmlPullParser2, "EssentialProperty"));
                                } else {
                                    arrayList4 = arrayList14;
                                    if (hq91.e(xmlPullParser2, "SupplementalProperty")) {
                                        arrayList5 = arrayList15;
                                        arrayList5.add(ggg.parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                                    } else {
                                        arrayList5 = arrayList15;
                                        ggg.maybeSkipTag(xmlPullParser2);
                                    }
                                    j6 = j11;
                                    str9 = str10;
                                    z2 = z3;
                                }
                                arrayList5 = arrayList15;
                                j6 = j11;
                                str9 = str10;
                                z2 = z3;
                            }
                            j7 = j12;
                            i7 = i9;
                            c8q0Var2 = c8q0Var4;
                            if (!hq91.d(xmlPullParser2, "Representation")) {
                            }
                        }
                    }
                    i7 = i9;
                    c8q0Var2 = parseSegmentTemplate;
                    if (!hq91.d(xmlPullParser2, "Representation")) {
                    }
                }
            }
            xmlPullParser2 = xmlPullParser3;
            arrayList = arrayList6;
            str8 = parseString2;
            i7 = i9;
            j6 = j9;
            str9 = str10;
            z2 = z3;
            i5 = 0;
            c8q0Var2 = c8q0Var3;
            arrayList2 = arrayList10;
            j7 = j8;
            i6 = parseInt;
            arrayList3 = arrayList7;
            arrayList4 = arrayList8;
            arrayList5 = arrayList9;
            if (!hq91.d(xmlPullParser2, "Representation")) {
            }
        }
        String str13 = str7;
        ArrayList arrayList16 = arrayList4;
        int i11 = parseInt2;
        ArrayList arrayList17 = arrayList3;
        String str14 = parseString4;
        ArrayList arrayList18 = arrayList;
        String str15 = parseString3;
        ArrayList arrayList19 = arrayList5;
        a buildFormat = buildFormat(str13, parseString, i11, parseInt3, parseFrameRate, i7, parseInt4, i6, str5, list2, list3, str8, str15, str14, arrayList16, arrayList19);
        if (c8q0Var2 == null) {
            c8q0Var2 = new b8q0();
        }
        if (this.thumbnailsEssentialPropertiesParseListener != null && str13.equals("thumbnails")) {
            this.thumbnailsEssentialPropertiesParseListener.onThumbnailsEssentialPropertiesParsed(str6, arrayList16);
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        return new fgg(buildFormat, list, c8q0Var2, str9, arrayList18, arrayList17, arrayList16, arrayList19);
    }

    @Override // defpackage.ggg
    public z7q0 parseSegmentTemplate(XmlPullParser xmlPullParser, z7q0 z7q0Var, List<eyi> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2;
        long j6;
        ExtendedDashManifestParser extendedDashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        if (z7q0Var != null) {
            return super.parseSegmentTemplate(xmlPullParser, z7q0Var, list, j, j2, j3, j4, j5);
        }
        long parseLong = ggg.parseLong(xmlPullParser3, "timescale", 1L);
        long parseLong2 = ggg.parseLong(xmlPullParser3, "presentationTimeOffset", 0L);
        long parseLong3 = ggg.parseLong(xmlPullParser3, "duration", -9223372036854775807L);
        long parseLong4 = ggg.parseLong(xmlPullParser3, "startNumber", 1L);
        extendedDashManifestParser.startNumber = parseLong4;
        long parseLastSegmentNumberSupplementalProperty = ggg.parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        xh21 parseUrlTemplate = extendedDashManifestParser.parseUrlTemplate(xmlPullParser3, "media", null);
        xh21 parseUrlTemplate2 = extendedDashManifestParser.parseUrlTemplate(xmlPullParser3, "initialization", null);
        w6i0 w6i0Var = null;
        List<a8q0> list2 = null;
        while (true) {
            xmlPullParser3.next();
            if (hq91.e(xmlPullParser3, "Initialization")) {
                w6i0Var = parseInitialization(xmlPullParser);
                xmlPullParser2 = xmlPullParser3;
                j6 = parseLong;
            } else if (hq91.e(xmlPullParser3, "SegmentTimeline")) {
                j6 = parseLong;
                list2 = extendedDashManifestParser.parseSegmentTimeline(xmlPullParser3, j6, j2);
                xmlPullParser2 = xmlPullParser3;
            } else {
                xmlPullParser2 = xmlPullParser3;
                j6 = parseLong;
                ggg.maybeSkipTag(xmlPullParser2);
            }
            if (hq91.d(xmlPullParser2, "SegmentTemplate")) {
                return buildSegmentTemplate(w6i0Var, j6, parseLong2, parseLong4, parseLastSegmentNumberSupplementalProperty, parseLong3, list2, finalAvailabilityTimeOffset, parseUrlTemplate2, parseUrlTemplate, j5, j);
            }
            xmlPullParser3 = xmlPullParser2;
            finalAvailabilityTimeOffset = finalAvailabilityTimeOffset;
            extendedDashManifestParser = this;
            parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty;
            parseLong4 = parseLong4;
            parseLong2 = parseLong2;
            parseLong = j6;
        }
    }

    @Override // defpackage.ggg
    public List<a8q0> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        long j4;
        long j5;
        long j6;
        long parseLong;
        long j7;
        long j8;
        ExtendedDashManifestParser extendedDashManifestParser = this;
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        int i = 0;
        boolean z = false;
        long j12 = -1;
        while (true) {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "S")) {
                long parseLong2 = ggg.parseLong(xmlPullParser, "t", j10);
                if (extendedDashManifestParser.isPreloadedLiveDashManifestExistsInCache() && j12 == -1) {
                    long parseLong3 = ggg.parseLong(xmlPullParser, "d", j10);
                    extendedDashManifestParser.segmentLengthForLive = parseLong3;
                    parseLong = parseLong3;
                    j6 = extendedDashManifestParser.calculateNewSegmentNumber(extendedDashManifestParser.startNumber);
                    extendedDashManifestParser.newStartNumber = j6;
                    long j13 = j10;
                    long j14 = j9;
                    long j15 = ((j6 - extendedDashManifestParser.startNumber) * extendedDashManifestParser.segmentLengthForLive) + parseLong2;
                    arrayList = arrayList;
                    if (z) {
                        j7 = j15;
                        j8 = extendedDashManifestParser.addSegmentTimelineElementsToList(arrayList, j14, j11, i, j7);
                    } else {
                        j7 = j15;
                        j8 = j14;
                    }
                    j9 = j7 != j13 ? j7 : j8;
                    j5 = j13;
                } else {
                    long j16 = j10;
                    if (z) {
                        j4 = parseLong2;
                        j9 = addSegmentTimelineElementsToList(arrayList, j9, j11, i, j4);
                    } else {
                        j4 = parseLong2;
                    }
                    long j17 = j4 != j16 ? j4 : j9;
                    j5 = j16;
                    j6 = j12;
                    parseLong = ggg.parseLong(xmlPullParser, "d", j5);
                    j9 = j17;
                }
                z = true;
                j3 = j5;
                j11 = parseLong;
                i = ggg.parseInt(xmlPullParser, "r", 0);
                j12 = j6;
            } else {
                ggg.maybeSkipTag(xmlPullParser);
                j3 = j10;
                j11 = j11;
                i = i;
            }
            if (hq91.d(xmlPullParser, "SegmentTimeline")) {
                break;
            }
            extendedDashManifestParser = this;
            j10 = j3;
        }
        if (z) {
            int i2 = tw21.a;
            addSegmentTimelineElementsToList(arrayList, j9, j11, i, tw21.e0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    @Override // defpackage.ggg
    public xh21 parseUrlTemplate(XmlPullParser xmlPullParser, String str, xh21 xh21Var) {
        boolean z = this.originalPlayerSourceIndex != null;
        boolean z2 = this.originalPlayerVsid != null;
        if (!z2 && !z) {
            return super.parseUrlTemplate(xmlPullParser, str, xh21Var);
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return xh21Var;
        }
        if (z2) {
            attributeValue = UrlModifierHelper.INSTANCE.changeVsid(attributeValue, this.originalPlayerVsid, this.mediaSourceListener);
        }
        if (z) {
            attributeValue = UrlModifierHelper.INSTANCE.addOrUpdateQueryParameter(attributeValue, UriQueryParameters.INSTANCE.get(13).getName(), this.originalPlayerSourceIndex);
        }
        return xh21.b(attributeValue);
    }

    public ExtendedDashManifestParser(ParsedBaseUrlsHolder parsedBaseUrlsHolder, ParsedSegmentBaseHolder parsedSegmentBaseHolder, SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener, ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener, String str, String str2, MediaSourceListener mediaSourceListener) {
        this(parsedBaseUrlsHolder, parsedSegmentBaseHolder, supplementalPropertiesInPeriodParseListener, thumbnailsEssentialPropertiesParseListener, str, str2, mediaSourceListener, null, null, false);
    }

    @Override // defpackage.ggg
    public /* bridge */ /* synthetic */ egg buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lhf0 lhf0Var, kw21 kw21Var, kvq0 kvq0Var, Uri uri, List list) {
        return buildMediaPresentationDescription(j, j2, j3, z, j4, j5, j6, j7, lhf0Var, kw21Var, kvq0Var, uri, (List<pxa0>) list);
    }
}
