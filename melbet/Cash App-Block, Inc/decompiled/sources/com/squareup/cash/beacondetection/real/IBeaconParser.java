package com.squareup.cash.beacondetection.real;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity$WhenMappings;
import com.squareup.cash.beacondetection.api.IBeaconDevice;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningPrefixes;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class IBeaconParser {
    public static final LightningPrefixes access$toLightningPrefix(String str) {
        Object obj;
        Iterator it = LightningPrefixes.$ENTRIES.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt__StringsJVMKt.startsWith(str, ((LightningPrefixes) obj).prefix, false)) {
                break;
            }
        }
        return (LightningPrefixes) obj;
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m3411component2impl(long j) {
        int i = (int) (j & BodyPartID.bodyIdMax);
        if (i < 0) {
            return null;
        }
        return i == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3412constructorimpl(int i, WedgeAffinity wedgeAffinity) {
        int i2 = CursorAndWedgeAffinity$WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        int i3 = -1;
        if (i2 != -1) {
            i3 = 1;
            if (i2 == 1) {
                i3 = 0;
            } else if (i2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0L;
            }
        }
        return (i << 32) | (i3 & BodyPartID.bodyIdMax);
    }

    public static IBeaconDevice parse(ScanResult scanResult) {
        byte[] manufacturerSpecificData;
        scanResult.getClass();
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null || (manufacturerSpecificData = scanRecord.getManufacturerSpecificData(76)) == null) {
            return null;
        }
        int rssi = scanResult.getRssi();
        if (manufacturerSpecificData.length < 23) {
            return null;
        }
        if (manufacturerSpecificData[0] != 2 || manufacturerSpecificData[1] != 21) {
            return null;
        }
        StringBuilder sb = new StringBuilder(36);
        for (int i = 2; i < 18; i++) {
            if (sb.length() == 8 || sb.length() == 13 || sb.length() == 18 || sb.length() == 23) {
                sb.append('-');
            }
            sb.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(manufacturerSpecificData[i])}, 1)));
        }
        String sb2 = sb.toString();
        if (sb2.equalsIgnoreCase("D2A6E1C8-5F3B-4E8D-9C7A-1B0F3E6D8A42")) {
            return new IBeaconDevice((manufacturerSpecificData[19] & 255) | ((manufacturerSpecificData[18] & 255) << 8), (manufacturerSpecificData[21] & 255) | ((manufacturerSpecificData[20] & 255) << 8), rssi, manufacturerSpecificData[22], sb2);
        }
        return null;
    }
}
