package com.squareup.cash.fidesmo.presenters;

import android.nfc.AvailableNfcAntenna;
import android.nfc.NfcAdapter;
import android.nfc.NfcAntennaInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class FidesmoStarPlacementResolverKt {
    public static final MapBuilder NFC_ANTENNA_POSITIONS;
    public static final NfcAntennaPosition SAMSUNG_DEFAULT_POSITION = new NfcAntennaPosition(-10.0f, 40.0f);

    static {
        MapBuilder mapBuilder = new MapBuilder();
        putPos(mapBuilder, new NfcAntennaPosition(-10.4f, 24.0f), "samsung galaxy a32", "galaxy a32");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 41.0f), "google pixel 3a", "pixel 3a");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 48.0f), "google pixel 6", "pixel 6");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 47.0f), "google pixel 7", "pixel 7");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 57.0f), "google pixel 7a", "pixel 7a");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 55.5f), "google pixel 8a", "pixel 8a");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 46.5f), "google pixel 9", "pixel 9");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 47.0f), "google pixel 9 pro", "pixel 9 pro");
        putPos(mapBuilder, new NfcAntennaPosition(-16.5f, 24.6f), "motorola moto g 2024", "moto g 2024", "moto g 5g 2024", "moto g 5g (2024)", "moto g 5g - 2024");
        putPos(mapBuilder, new NfcAntennaPosition(-16.7f, 34.0f), "motorola moto g power 2025", "moto g power 2025", "moto g power 5g 2025", "moto g power 5g - 2025", "moto g power - 2025");
        putPos(mapBuilder, new NfcAntennaPosition(-18.8f, 25.2f), "motorola moto g stylus 5g", "moto g stylus 5g", "motorola moto g stylus 5g (2025)", "motorola moto g stylus 5g 2025", "moto g stylus 5g 2025", "moto g stylus 5g (2025)");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 125.0f), "motorola razr 40", "razr 40");
        putPos(mapBuilder, new NfcAntennaPosition(-7.2f, 35.3f), "sm-a146u", "samsung galaxy a14", "galaxy a14");
        putPos(mapBuilder, new NfcAntennaPosition(-16.8f, 26.9f), "sm-a156u", "samsung galaxy a15 5g", "galaxy a15 5g");
        putPos(mapBuilder, new NfcAntennaPosition(-17.9f, 34.0f), "sm-a536u", "samsung galaxy a53 5g", "galaxy a53 5g");
        putPos(mapBuilder, new NfcAntennaPosition(-9.9f, 31.9f), "sm-a546u", "samsung galaxy a54", "galaxy a54");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 88.7f), "sm-g781u", "samsung galaxy s20 fe 5g", "galaxy s20 fe 5g");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 72.1f), "sm-g990u", "samsung galaxy s21 fe 5g", "galaxy s21 fe 5g");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 96.5f), "sm-g991u", "samsung galaxy s21 5g", "galaxy s21 5g");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 99.0f), "sm-g998u", "samsung galaxy s21 ultra 5g", "galaxy s21 ultra 5g");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 86.5f), "sm-n986u", "samsung galaxy note 20 ultra", "galaxy note 20 ultra");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 81.7f), "sm-s901u", "samsung galaxy s22 5g", "galaxy s22 5g");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 93.2f), "sm-s908u", "samsung galaxy s22 ultra 5g", "galaxy s22 ultra 5g");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 89.2f), "sm-s911u", "samsung galaxy s23", "galaxy s23");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 88.6f), "sm-s916u", "samsung galaxy s23+", "galaxy s23+");
        putPos(mapBuilder, new NfcAntennaPosition(RecyclerView.DECELERATION_RATE, 100.0f), "sm-s918u", "samsung galaxy s23 ultra", "galaxy s23 ultra");
        putPos(mapBuilder, new NfcAntennaPosition(-9.0f, 29.2f), "sm-s926u", "samsung galaxy s24+", "galaxy s24+");
        putPos(mapBuilder, new NfcAntennaPosition(-9.9f, 32.2f), "sm-s928u", "samsung galaxy s24 ultra", "galaxy s24 ultra");
        putPos(mapBuilder, new NfcAntennaPosition(-8.1f, 41.2f), "sm-s931u", "samsung galaxy s25", "galaxy s25");
        putPos(mapBuilder, new NfcAntennaPosition(-9.5f, 45.0f), "sm-s936u", "sm-s936u1", "sm-s936b", "sm-s936b/ds", "sm-s936w", "sm-s936n", "sm-s9360", "samsung galaxy s25+", "galaxy s25+");
        putPos(mapBuilder, new NfcAntennaPosition(-9.2f, 47.0f), "sm-s938u", "samsung galaxy s25 ultra", "galaxy s25 ultra");
        NFC_ANTENNA_POSITIONS = mapBuilder.build();
    }

    public static final boolean isFoldableDevice() {
        String normalizedDeviceModel = normalizedDeviceModel(Build.MODEL);
        return StringsKt.contains((CharSequence) normalizedDeviceModel, (CharSequence) "fold", false) || StringsKt.contains((CharSequence) normalizedDeviceModel, (CharSequence) "flip", false) || StringsKt.contains((CharSequence) normalizedDeviceModel, (CharSequence) "razr", false) || StringsKt__StringsJVMKt.startsWith(normalizedDeviceModel, "sm-f", false);
    }

    public static final String normalizedDeviceModel(String str) {
        if (str == null) {
            str = "";
        }
        String obj = StringsKt.trim(str).toString();
        Locale locale = Locale.US;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, obj, locale);
    }

    public static final void putPos(MapBuilder mapBuilder, NfcAntennaPosition nfcAntennaPosition, String... strArr) {
        for (String str : strArr) {
            mapBuilder.put(normalizedDeviceModel(str), nfcAntennaPosition);
        }
    }

    public static final ResolvedStarPlacement resolveNfcApiOnlyPlacement(NfcAdapter nfcAdapter, DisplayMetrics displayMetrics, boolean z) {
        String str = Build.MODEL;
        if (displayMetrics != null && nfcAdapter != null && Build.VERSION.SDK_INT >= 34 && !isFoldableDevice()) {
            boolean z2 = false;
            if (z) {
                String normalizedDeviceModel = normalizedDeviceModel(str);
                if (StringsKt__StringsJVMKt.startsWith(normalizedDeviceModel, "moto", false) || StringsKt.contains((CharSequence) normalizedDeviceModel, (CharSequence) "motorola", false)) {
                    z2 = true;
                }
            }
            ScanningStarPlacement.Position tryNfcAntennaInfoPlacement = tryNfcAntennaInfoPlacement(nfcAdapter, displayMetrics, z2);
            if (tryNfcAntennaInfoPlacement != null) {
                return new ResolvedStarPlacement(tryNfcAntennaInfoPlacement, StarPlacementSource.NFC_ANTENNA_INFO);
            }
        }
        return new ResolvedStarPlacement(ScanningStarPlacement.Unknown.INSTANCE, StarPlacementSource.NONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ResolvedStarPlacement resolveScanningStarPlacement$default(DisplayMetrics displayMetrics, NfcAdapter nfcAdapter, boolean z, int i) {
        ScanningStarPlacement.Position placement;
        boolean z2;
        ScanningStarPlacement.Position tryNfcAntennaInfoPlacement;
        String str = Build.MODEL;
        if ((i & 16) != 0) {
            z = false;
        }
        MapBuilder mapBuilder = NFC_ANTENNA_POSITIONS;
        mapBuilder.getClass();
        NfcAntennaPosition nfcAntennaPosition = (NfcAntennaPosition) mapBuilder.get(normalizedDeviceModel(str));
        if (nfcAntennaPosition != null) {
            float f = nfcAntennaPosition.yFromTopMm;
            float f2 = nfcAntennaPosition.xFromCentrelineMm;
            if (Math.abs(f2) <= Float.MAX_VALUE && Math.abs(f) <= Float.MAX_VALUE) {
                Timber.Forest forest = Timber.Forest;
                StringBuilder sb = new StringBuilder("Using hardcoded position for device '");
                sb.append(str);
                sb.append("': x=");
                sb.append(f2);
                sb.append("mm, y=");
                forest.d(Recorder$$ExternalSyntheticOutline1.m(f, "mm", sb), new Object[0]);
                ScanningStarPlacement.Position placement2 = toPlacement(nfcAntennaPosition, displayMetrics);
                if (placement2 != null) {
                    return new ResolvedStarPlacement(placement2, StarPlacementSource.HARDCODED_MAP);
                }
                forest.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid screen metrics for '", str, "' with curated entry, using Center"), new Object[0]);
                return new ResolvedStarPlacement(ScanningStarPlacement.Companion.Center, StarPlacementSource.HARDCODED_MAP_CENTER_FALLBACK);
            }
        }
        boolean isFoldableDevice = isFoldableDevice();
        if (nfcAdapter != null && Build.VERSION.SDK_INT >= 34 && !isFoldableDevice) {
            if (z) {
                String normalizedDeviceModel = normalizedDeviceModel(str);
                if (StringsKt__StringsJVMKt.startsWith(normalizedDeviceModel, "moto", false) || StringsKt.contains((CharSequence) normalizedDeviceModel, (CharSequence) "motorola", false)) {
                    z2 = true;
                    tryNfcAntennaInfoPlacement = tryNfcAntennaInfoPlacement(nfcAdapter, displayMetrics, z2);
                    if (tryNfcAntennaInfoPlacement != null) {
                        Timber.Forest.i("Using NfcAntennaInfo API fallback for star placement: " + tryNfcAntennaInfoPlacement, new Object[0]);
                        return new ResolvedStarPlacement(tryNfcAntennaInfoPlacement, StarPlacementSource.NFC_ANTENNA_INFO);
                    }
                }
            }
            z2 = false;
            tryNfcAntennaInfoPlacement = tryNfcAntennaInfoPlacement(nfcAdapter, displayMetrics, z2);
            if (tryNfcAntennaInfoPlacement != null) {
            }
        }
        String normalizedDeviceModel2 = normalizedDeviceModel(str);
        if ((!StringsKt__StringsJVMKt.startsWith(normalizedDeviceModel2, "sm-", false) && !StringsKt.contains((CharSequence) normalizedDeviceModel2, (CharSequence) "samsung", false)) || isFoldableDevice || (placement = toPlacement(SAMSUNG_DEFAULT_POSITION, displayMetrics)) == null) {
            Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No placement data for device '", str, "', using Unknown placement"), new Object[0]);
            return new ResolvedStarPlacement(ScanningStarPlacement.Unknown.INSTANCE, StarPlacementSource.NONE);
        }
        Timber.Forest.d("Using Samsung-default placement for '" + str + "': " + placement, new Object[0]);
        return new ResolvedStarPlacement(placement, StarPlacementSource.SAMSUNG_DEFAULT);
    }

    public static final ScanningStarPlacement.Position toPlacement(NfcAntennaPosition nfcAntennaPosition, DisplayMetrics displayMetrics) {
        float f = (displayMetrics.widthPixels / displayMetrics.xdpi) * 25.4f;
        float f2 = (displayMetrics.heightPixels / displayMetrics.ydpi) * 25.4f;
        if (Math.abs(f) > Float.MAX_VALUE || f <= RecyclerView.DECELERATION_RATE || Math.abs(f2) > Float.MAX_VALUE || f2 <= RecyclerView.DECELERATION_RATE) {
            return null;
        }
        return new ScanningStarPlacement.Position((nfcAntennaPosition.xFromCentrelineMm / f) + 0.5f, nfcAntennaPosition.yFromTopMm / f2);
    }

    public static final ScanningStarPlacement.Position tryNfcAntennaInfoPlacement(NfcAdapter nfcAdapter, DisplayMetrics displayMetrics, boolean z) {
        NfcAntennaInfo nfcAntennaInfo = nfcAdapter.getNfcAntennaInfo();
        if (nfcAntennaInfo != null) {
            float deviceWidth = nfcAntennaInfo.getDeviceWidth();
            float deviceHeight = nfcAntennaInfo.getDeviceHeight();
            if (deviceWidth <= RecyclerView.DECELERATION_RATE || deviceHeight <= RecyclerView.DECELERATION_RATE) {
                Timber.Forest.w("NfcAntennaInfo reported invalid device size " + deviceWidth + "x" + deviceHeight + "mm, skipping", new Object[0]);
                return null;
            }
            List<AvailableNfcAntenna> availableNfcAntennas = nfcAntennaInfo.getAvailableNfcAntennas();
            availableNfcAntennas.getClass();
            AvailableNfcAntenna availableNfcAntenna = (AvailableNfcAntenna) CollectionsKt.firstOrNull((List) availableNfcAntennas);
            if (availableNfcAntenna != null) {
                float locationX = availableNfcAntenna.getLocationX();
                float locationY = availableNfcAntenna.getLocationY();
                if (Math.abs(locationX) <= Float.MAX_VALUE && Math.abs(locationY) <= Float.MAX_VALUE) {
                    if (locationX == RecyclerView.DECELERATION_RATE && locationY == RecyclerView.DECELERATION_RATE) {
                        Timber.Forest.w("NfcAntennaInfo reported antenna at (0,0), skipping", new Object[0]);
                        return null;
                    }
                    float f = locationX - (deviceWidth / 2.0f);
                    float f2 = z ? deviceHeight - locationY : locationY;
                    Timber.Forest forest = Timber.Forest;
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NfcAntennaInfo: device=", deviceWidth, "x", deviceHeight, "mm, antenna at (");
                    Request$Priority$EnumUnboxingLocalUtility.m(m, locationX, "mm, ", locationY, "mm) absolute, converted to (");
                    m.append(f);
                    m.append("mm, ");
                    m.append(f2);
                    m.append("mm) centerline-relative");
                    forest.d(m.toString(), new Object[0]);
                    float f3 = (displayMetrics.widthPixels / displayMetrics.xdpi) * 25.4f;
                    float f4 = (displayMetrics.heightPixels / displayMetrics.ydpi) * 25.4f;
                    if (Math.abs(f3) <= Float.MAX_VALUE && f3 > RecyclerView.DECELERATION_RATE && Math.abs(f4) <= Float.MAX_VALUE && f4 > RecyclerView.DECELERATION_RATE) {
                        return new ScanningStarPlacement.Position((f / f3) + 0.5f, f2 / f4);
                    }
                }
            }
        }
        return null;
    }
}
