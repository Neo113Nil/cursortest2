package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import com.squareup.protos.cash.compass.api.CellTowerContext;
import com.squareup.protos.cash.compass.api.CellTowerInfo;
import com.squareup.protos.cash.compass.api.RadioType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public abstract class d {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", eVar.a);
            bundle.putLong("event_timestamp", eVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x000b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.squareup.protos.cash.compass.api.CellTowerInfo] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.squareup.protos.cash.compass.api.CellTowerInfo] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.squareup.protos.cash.compass.api.CellTowerInfo] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.squareup.protos.cash.compass.api.CellTowerInfo] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.squareup.protos.cash.compass.api.CellTowerInfo] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.squareup.protos.cash.compass.api.CellTowerInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CellTowerContext access$toCellTowerContext(List list) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if (cellInfo instanceof CellInfoLte) {
                CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
                String mccString = cellIdentity.getMccString();
                Integer intOrNull = mccString != null ? StringsKt.toIntOrNull(mccString) : null;
                String mncString = cellIdentity.getMncString();
                num = new CellTowerInfo(intOrNull, mncString != null ? StringsKt.toIntOrNull(mncString) : null, sanitizedLong(cellIdentity.getCi()), sanitizedInt(cellIdentity.getTac()), sanitizedInt(cellIdentity.getPci()), sanitizedInt(cellInfoLte.getCellSignalStrength().getDbm()), Boolean.valueOf(cellInfoLte.isRegistered()), RadioType.RADIO_TYPE_LTE);
            } else {
                if (cellInfo instanceof CellInfoNr) {
                    CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
                    CellIdentity cellIdentity2 = cellInfoNr.getCellIdentity();
                    cellIdentity2.getClass();
                    CellIdentityNr cellIdentityNr = (CellIdentityNr) cellIdentity2;
                    String mccString2 = cellIdentityNr.getMccString();
                    Integer intOrNull2 = mccString2 != null ? StringsKt.toIntOrNull(mccString2) : null;
                    String mncString2 = cellIdentityNr.getMncString();
                    Integer intOrNull3 = mncString2 != null ? StringsKt.toIntOrNull(mncString2) : null;
                    long nci = cellIdentityNr.getNci();
                    Long valueOf = Long.valueOf(nci);
                    if (nci == Long.MAX_VALUE) {
                        valueOf = null;
                    }
                    r3 = new CellTowerInfo(intOrNull2, intOrNull3, valueOf, sanitizedInt(cellIdentityNr.getTac()), sanitizedInt(cellIdentityNr.getPci()), sanitizedInt(cellInfoNr.getCellSignalStrength().getDbm()), Boolean.valueOf(cellInfoNr.isRegistered()), RadioType.RADIO_TYPE_NR);
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity3 = cellInfoGsm.getCellIdentity();
                    String mccString3 = cellIdentity3.getMccString();
                    Integer intOrNull4 = mccString3 != null ? StringsKt.toIntOrNull(mccString3) : null;
                    String mncString3 = cellIdentity3.getMncString();
                    num = new CellTowerInfo(intOrNull4, mncString3 != null ? StringsKt.toIntOrNull(mncString3) : null, sanitizedLong(cellIdentity3.getCid()), sanitizedInt(cellIdentity3.getLac()), null, sanitizedInt(cellInfoGsm.getCellSignalStrength().getDbm()), Boolean.valueOf(cellInfoGsm.isRegistered()), RadioType.RADIO_TYPE_GSM);
                } else if (cellInfo instanceof CellInfoWcdma) {
                    CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                    CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                    String mccString4 = cellIdentity4.getMccString();
                    Integer intOrNull5 = mccString4 != null ? StringsKt.toIntOrNull(mccString4) : null;
                    String mncString4 = cellIdentity4.getMncString();
                    num = new CellTowerInfo(intOrNull5, mncString4 != null ? StringsKt.toIntOrNull(mncString4) : null, sanitizedLong(cellIdentity4.getCid()), sanitizedInt(cellIdentity4.getLac()), sanitizedInt(cellIdentity4.getPsc()), sanitizedInt(cellInfoWcdma.getCellSignalStrength().getDbm()), Boolean.valueOf(cellInfoWcdma.isRegistered()), RadioType.RADIO_TYPE_WCDMA);
                } else if (cellInfo instanceof CellInfoCdma) {
                    CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                    num = new CellTowerInfo(null, null, sanitizedLong(cellInfoCdma.getCellIdentity().getBasestationId()), null, null, sanitizedInt(cellInfoCdma.getCellSignalStrength().getDbm()), Boolean.valueOf(cellInfoCdma.isRegistered()), RadioType.RADIO_TYPE_CDMA);
                } else if (cellInfo instanceof CellInfoTdscdma) {
                    CellInfoTdscdma cellInfoTdscdma = (CellInfoTdscdma) cellInfo;
                    CellIdentityTdscdma cellIdentity5 = cellInfoTdscdma.getCellIdentity();
                    String mccString5 = cellIdentity5.getMccString();
                    Integer intOrNull6 = mccString5 != null ? StringsKt.toIntOrNull(mccString5) : null;
                    String mncString5 = cellIdentity5.getMncString();
                    num = new CellTowerInfo(intOrNull6, mncString5 != null ? StringsKt.toIntOrNull(mncString5) : null, sanitizedLong(cellIdentity5.getCid()), sanitizedInt(cellIdentity5.getLac()), sanitizedInt(cellIdentity5.getCpid()), sanitizedInt(cellInfoTdscdma.getCellSignalStrength().getDbm()), Boolean.valueOf(cellInfoTdscdma.isRegistered()), RadioType.RADIO_TYPE_UNKNOWN);
                }
                if (r3 == null) {
                    arrayList.add(r3);
                }
            }
            r3 = num;
            if (r3 == null) {
            }
        }
        return new CellTowerContext(arrayList);
    }

    public static final void b(int i, ArrayList arrayList) {
        arrayList.add(new e(i, System.currentTimeMillis()));
    }

    public static final Integer sanitizedInt(int i) {
        if (i == -1 || i == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static final Long sanitizedLong(int i) {
        if (i == -1 || i == Integer.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(i);
    }
}
