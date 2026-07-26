package com.frosthunter.arcticwildlands.frozenexpedition.adventure.splash.assembly.fetcher.service;

import android.content.Context.FrostHunterMeteringPointRogueDeltaNebula9629;
import android.content.Context.FrostHunterOnTouchListenerCelestialTitanNova9943;
import android.content.Context.FrostHunterProximitySensorLegendAuroraPrime1541;
import android.content.Context.FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
import android.content.Context.FrostHunterViewModelDeltaPhoenix7086;
import android.util.Base64;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.splash.assembly.fetcher.nativebridge.NativeCardinalSource;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.splash.assembly.fetcher.nativebridge.NativeNexusSource;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.splash.assembly.fetcher.nativebridge.NativeVerticalSource;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostFetcherAssembler {
    public static final int $stable = 0;
    private final NativeCardinalSource cardinalSource;
    private final NativeNexusSource nexusSource;
    private final NativeVerticalSource verticalSource;

    public FrostFetcherAssembler(NativeCardinalSource nativeCardinalSource, NativeVerticalSource nativeVerticalSource, NativeNexusSource nativeNexusSource, int i, FrostHunterViewModelDeltaPhoenix7086 frostHunterViewModelDeltaPhoenix7086) {
        this((i & 1) != 0 ? new NativeCardinalSource() : nativeCardinalSource, (i & 2) != 0 ? new NativeVerticalSource() : nativeVerticalSource, (i & 4) != 0 ? new NativeNexusSource() : nativeNexusSource);
    }

    public static /* synthetic */ String unpack$default(FrostFetcherAssembler frostFetcherAssembler, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "minLoop";
        }
        return frostFetcherAssembler.unpack(str, str2);
    }

    /* renamed from: processCenter, reason: collision with other method in class */
    public String m7processCenter() {
        return unpack$default(this, this.nexusSource.acquireCenter(), null, 1, null);
    }

    /* renamed from: processCore, reason: collision with other method in class */
    public String m8processCore() {
        return unpack$default(this, this.nexusSource.acquireCore(), null, 1, null);
    }

    /* renamed from: processEast, reason: collision with other method in class */
    public String m9processEast() {
        return unpack$default(this, this.cardinalSource.acquireEast(), null, 1, null);
    }

    /* renamed from: processLower, reason: collision with other method in class */
    public String m10processLower() {
        return unpack$default(this, this.verticalSource.acquireLower(), null, 1, null);
    }

    /* renamed from: processNorth, reason: collision with other method in class */
    public String m11processNorth() {
        return unpack$default(this, this.cardinalSource.acquireNorth(), null, 1, null);
    }

    /* renamed from: processSouth, reason: collision with other method in class */
    public String m12processSouth() {
        return unpack$default(this, this.cardinalSource.acquireSouth(), null, 1, null);
    }

    /* renamed from: processUpper, reason: collision with other method in class */
    public String m13processUpper() {
        return unpack$default(this, this.verticalSource.acquireUpper(), null, 1, null);
    }

    /* renamed from: processWest, reason: collision with other method in class */
    public String m14processWest() {
        return unpack$default(this, this.cardinalSource.acquireWest(), null, 1, null);
    }

    public final String unpack(String str, String str2) {
        Object frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
        str.getClass();
        str2.getClass();
        int i = 0;
        try {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = Base64.decode(FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterR8MasterNebulaSpark7247(str).toString(), 0);
        } catch (Throwable th) {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409(th);
        }
        if (FrostHunterProximitySensorLegendAuroraPrime1541.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRealtimeDatabaseBetaOlympianPhoenix2409) != null) {
            return "";
        }
        byte[] bArr = (byte[]) frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
        byte[] bytes = str2.getBytes(FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761);
        bytes.getClass();
        bArr.getClass();
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(Byte.valueOf((byte) (bytes[i3 % bytes.length] ^ bArr[i2])));
            i2++;
            i3++;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            bArr2[i] = ((Number) obj).byteValue();
            i++;
        }
        return new String(bArr2, FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public /* bridge */ Object processCenter() {
        return m7processCenter();
    }

    public /* bridge */ Object processCore() {
        return m8processCore();
    }

    public /* bridge */ Object processEast() {
        return m9processEast();
    }

    public /* bridge */ Object processLower() {
        return m10processLower();
    }

    public /* bridge */ Object processNorth() {
        return m11processNorth();
    }

    public /* bridge */ Object processSouth() {
        return m12processSouth();
    }

    public /* bridge */ Object processUpper() {
        return m13processUpper();
    }

    public /* bridge */ Object processWest() {
        return m14processWest();
    }

    public FrostFetcherAssembler(NativeCardinalSource nativeCardinalSource, NativeVerticalSource nativeVerticalSource, NativeNexusSource nativeNexusSource) {
        nativeCardinalSource.getClass();
        nativeVerticalSource.getClass();
        nativeNexusSource.getClass();
        this.cardinalSource = nativeCardinalSource;
        this.verticalSource = nativeVerticalSource;
        this.nexusSource = nativeNexusSource;
        System.loadLibrary("frost_assemble");
    }

    public FrostFetcherAssembler() {
        this(null, null, null, 7, null);
    }
}
