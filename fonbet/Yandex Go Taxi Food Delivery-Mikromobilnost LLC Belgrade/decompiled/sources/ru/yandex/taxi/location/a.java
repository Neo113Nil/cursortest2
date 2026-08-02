package ru.yandex.taxi.location;

import android.net.wifi.ScanResult;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import defpackage.a8y;
import defpackage.bvu0;
import defpackage.d8y;
import defpackage.e8y;
import defpackage.kb20;
import defpackage.ny61;
import defpackage.q7y;
import defpackage.s3u;
import defpackage.s66;
import defpackage.t3v;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class a {
    public final kb20 a;
    public final q7y b;
    public final s66 c;

    public a(kb20 kb20Var, q7y q7yVar, s66 s66Var) {
        this.a = kb20Var;
        this.b = q7yVar;
        this.c = s66Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ru.yandex.taxi.location.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, List list2, ContinuationImpl continuationImpl) {
        LbsParamsFactory$create$1 lbsParamsFactory$create$1;
        int i;
        String str2;
        ?? r11;
        if (continuationImpl instanceof LbsParamsFactory$create$1) {
            lbsParamsFactory$create$1 = (LbsParamsFactory$create$1) continuationImpl;
            int i2 = lbsParamsFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsParamsFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsParamsFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsParamsFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = t3v.a();
                    lbsParamsFactory$create$1.L$0 = str;
                    lbsParamsFactory$create$1.L$1 = list;
                    lbsParamsFactory$create$1.L$2 = null;
                    lbsParamsFactory$create$1.L$3 = a;
                    lbsParamsFactory$create$1.label = 1;
                    Object g = g(list2, lbsParamsFactory$create$1);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = g;
                    str2 = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) lbsParamsFactory$create$1.L$3;
                    list = (List) lbsParamsFactory$create$1.L$1;
                    str = (String) lbsParamsFactory$create$1.L$0;
                    kotlin.b.b(obj);
                }
                List list3 = (List) obj;
                if (list == null) {
                    List<ScanResult> list4 = list;
                    r11 = new ArrayList(tcc.n(list4, 10));
                    for (ScanResult scanResult : list4) {
                        r11.add(new d8y(scanResult.BSSID, scanResult.level, TimeUnit.MICROSECONDS.toNanos(scanResult.timestamp)));
                    }
                } else {
                    r11 = EmptyList.a;
                }
                return new e8y(str2, str, list3, r11);
            }
        }
        lbsParamsFactory$create$1 = new LbsParamsFactory$create$1(this, continuationImpl);
        Object obj2 = lbsParamsFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsParamsFactory$create$1.label;
        if (i != 0) {
        }
        List list32 = (List) obj2;
        if (list == null) {
        }
        return new e8y(str2, str, list32, r11);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(CellInfoGsm cellInfoGsm, ContinuationImpl continuationImpl) {
        LbsParamsFactory$createGsmCell$3 lbsParamsFactory$createGsmCell$3;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        s66 s66Var;
        CellInfoGsm cellInfoGsm2;
        CellIdentityGsm cellIdentityGsm;
        CellSignalStrengthGsm cellSignalStrengthGsm;
        Integer num;
        Integer num2;
        CellSignalStrengthGsm cellSignalStrengthGsm2;
        CellInfoGsm cellInfoGsm3;
        CellIdentityGsm cellIdentityGsm2;
        long j;
        if (continuationImpl instanceof LbsParamsFactory$createGsmCell$3) {
            lbsParamsFactory$createGsmCell$3 = (LbsParamsFactory$createGsmCell$3) continuationImpl;
            int i2 = lbsParamsFactory$createGsmCell$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsParamsFactory$createGsmCell$3.label = i2 - Integer.MIN_VALUE;
                obj = lbsParamsFactory$createGsmCell$3.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsParamsFactory$createGsmCell$3.label;
                s66Var = this.c;
                q7y q7yVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
                    CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
                    Integer num3 = new Integer(cellIdentity.getMcc());
                    int intValue = num3.intValue();
                    if (intValue == Integer.MAX_VALUE || intValue < 0 || intValue >= 1000) {
                        num3 = null;
                    }
                    if (num3 == null) {
                        q7yVar.getClass();
                        return null;
                    }
                    cellInfoGsm2 = cellInfoGsm;
                    lbsParamsFactory$createGsmCell$3.L$0 = cellInfoGsm2;
                    lbsParamsFactory$createGsmCell$3.L$1 = cellIdentity;
                    lbsParamsFactory$createGsmCell$3.L$2 = cellSignalStrength;
                    lbsParamsFactory$createGsmCell$3.L$3 = num3;
                    lbsParamsFactory$createGsmCell$3.label = 1;
                    Object b = s66Var.b.b(lbsParamsFactory$createGsmCell$3);
                    if (b != coroutineSingletons) {
                        Integer num4 = num3;
                        cellIdentityGsm = cellIdentity;
                        obj = b;
                        cellSignalStrengthGsm = cellSignalStrength;
                        num = num4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = lbsParamsFactory$createGsmCell$3.J$0;
                    num2 = (Integer) lbsParamsFactory$createGsmCell$3.L$3;
                    cellSignalStrengthGsm2 = (CellSignalStrengthGsm) lbsParamsFactory$createGsmCell$3.L$2;
                    cellIdentityGsm2 = (CellIdentityGsm) lbsParamsFactory$createGsmCell$3.L$1;
                    cellInfoGsm3 = (CellInfoGsm) lbsParamsFactory$createGsmCell$3.L$0;
                    kotlin.b.b(obj);
                    j = j2;
                    if (((s3u) obj).c || j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                        return new a8y(num2.intValue(), cellIdentityGsm2.getMnc(), cellIdentityGsm2.getLac(), cellSignalStrengthGsm2.getDbm(), j, cellInfoGsm3.getTimeStamp());
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                    q7yVar.getClass();
                    q7y.a(illegalArgumentException, "cellId == Long.MAX_VALUE");
                    return null;
                }
                num = (Integer) lbsParamsFactory$createGsmCell$3.L$3;
                cellSignalStrengthGsm = (CellSignalStrengthGsm) lbsParamsFactory$createGsmCell$3.L$2;
                CellIdentityGsm cellIdentityGsm3 = (CellIdentityGsm) lbsParamsFactory$createGsmCell$3.L$1;
                CellInfoGsm cellInfoGsm4 = (CellInfoGsm) lbsParamsFactory$createGsmCell$3.L$0;
                kotlin.b.b(obj);
                cellIdentityGsm = cellIdentityGsm3;
                cellInfoGsm2 = cellInfoGsm4;
                if (!((s3u) obj).d && cellIdentityGsm.getCid() == Integer.MAX_VALUE) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
                    q7yVar.getClass();
                    q7y.a(illegalArgumentException2, "cellId == Int.MAX_VALUE");
                    return null;
                }
                long cid = cellIdentityGsm.getCid();
                lbsParamsFactory$createGsmCell$3.L$0 = cellInfoGsm2;
                lbsParamsFactory$createGsmCell$3.L$1 = cellIdentityGsm;
                lbsParamsFactory$createGsmCell$3.L$2 = cellSignalStrengthGsm;
                lbsParamsFactory$createGsmCell$3.L$3 = num;
                lbsParamsFactory$createGsmCell$3.J$0 = cid;
                lbsParamsFactory$createGsmCell$3.label = 2;
                obj = s66Var.b.b(lbsParamsFactory$createGsmCell$3);
                if (obj != coroutineSingletons) {
                    num2 = num;
                    cellSignalStrengthGsm2 = cellSignalStrengthGsm;
                    cellInfoGsm3 = cellInfoGsm2;
                    cellIdentityGsm2 = cellIdentityGsm;
                    j = cid;
                    if (((s3u) obj).c) {
                    }
                    return new a8y(num2.intValue(), cellIdentityGsm2.getMnc(), cellIdentityGsm2.getLac(), cellSignalStrengthGsm2.getDbm(), j, cellInfoGsm3.getTimeStamp());
                }
                return coroutineSingletons;
            }
        }
        lbsParamsFactory$createGsmCell$3 = new LbsParamsFactory$createGsmCell$3(this, continuationImpl);
        obj = lbsParamsFactory$createGsmCell$3.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsParamsFactory$createGsmCell$3.label;
        s66Var = this.c;
        q7y q7yVar2 = this.b;
        if (i != 0) {
        }
        if (!((s3u) obj).d) {
        }
        long cid2 = cellIdentityGsm.getCid();
        lbsParamsFactory$createGsmCell$3.L$0 = cellInfoGsm2;
        lbsParamsFactory$createGsmCell$3.L$1 = cellIdentityGsm;
        lbsParamsFactory$createGsmCell$3.L$2 = cellSignalStrengthGsm;
        lbsParamsFactory$createGsmCell$3.L$3 = num;
        lbsParamsFactory$createGsmCell$3.J$0 = cid2;
        lbsParamsFactory$createGsmCell$3.label = 2;
        obj = s66Var.b.b(lbsParamsFactory$createGsmCell$3);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CellInfoLte cellInfoLte, ContinuationImpl continuationImpl) {
        LbsParamsFactory$createGsmCell$2 lbsParamsFactory$createGsmCell$2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        s66 s66Var;
        CellInfoLte cellInfoLte2;
        CellIdentityLte cellIdentityLte;
        CellSignalStrengthLte cellSignalStrengthLte;
        Integer num;
        Integer num2;
        CellSignalStrengthLte cellSignalStrengthLte2;
        CellInfoLte cellInfoLte3;
        CellIdentityLte cellIdentityLte2;
        long j;
        if (continuationImpl instanceof LbsParamsFactory$createGsmCell$2) {
            lbsParamsFactory$createGsmCell$2 = (LbsParamsFactory$createGsmCell$2) continuationImpl;
            int i2 = lbsParamsFactory$createGsmCell$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsParamsFactory$createGsmCell$2.label = i2 - Integer.MIN_VALUE;
                obj = lbsParamsFactory$createGsmCell$2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsParamsFactory$createGsmCell$2.label;
                s66Var = this.c;
                q7y q7yVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
                    CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
                    Integer num3 = new Integer(cellIdentity.getMcc());
                    int intValue = num3.intValue();
                    if (intValue == Integer.MAX_VALUE || intValue < 0 || intValue >= 1000) {
                        num3 = null;
                    }
                    if (num3 == null) {
                        q7yVar.getClass();
                        return null;
                    }
                    cellInfoLte2 = cellInfoLte;
                    lbsParamsFactory$createGsmCell$2.L$0 = cellInfoLte2;
                    lbsParamsFactory$createGsmCell$2.L$1 = cellIdentity;
                    lbsParamsFactory$createGsmCell$2.L$2 = cellSignalStrength;
                    lbsParamsFactory$createGsmCell$2.L$3 = num3;
                    lbsParamsFactory$createGsmCell$2.label = 1;
                    Object b = s66Var.b.b(lbsParamsFactory$createGsmCell$2);
                    if (b != coroutineSingletons) {
                        Integer num4 = num3;
                        cellIdentityLte = cellIdentity;
                        obj = b;
                        cellSignalStrengthLte = cellSignalStrength;
                        num = num4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = lbsParamsFactory$createGsmCell$2.J$0;
                    num2 = (Integer) lbsParamsFactory$createGsmCell$2.L$3;
                    cellSignalStrengthLte2 = (CellSignalStrengthLte) lbsParamsFactory$createGsmCell$2.L$2;
                    cellIdentityLte2 = (CellIdentityLte) lbsParamsFactory$createGsmCell$2.L$1;
                    cellInfoLte3 = (CellInfoLte) lbsParamsFactory$createGsmCell$2.L$0;
                    kotlin.b.b(obj);
                    j = j2;
                    if (((s3u) obj).c || j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                        return new a8y(num2.intValue(), cellIdentityLte2.getMnc(), cellIdentityLte2.getTac(), cellSignalStrengthLte2.getDbm(), j, cellInfoLte3.getTimeStamp());
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                    q7yVar.getClass();
                    q7y.a(illegalArgumentException, "cellId == Long.MAX_VALUE");
                    return null;
                }
                num = (Integer) lbsParamsFactory$createGsmCell$2.L$3;
                cellSignalStrengthLte = (CellSignalStrengthLte) lbsParamsFactory$createGsmCell$2.L$2;
                CellIdentityLte cellIdentityLte3 = (CellIdentityLte) lbsParamsFactory$createGsmCell$2.L$1;
                CellInfoLte cellInfoLte4 = (CellInfoLte) lbsParamsFactory$createGsmCell$2.L$0;
                kotlin.b.b(obj);
                cellIdentityLte = cellIdentityLte3;
                cellInfoLte2 = cellInfoLte4;
                if (!((s3u) obj).d && cellIdentityLte.getCi() == Integer.MAX_VALUE) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
                    q7yVar.getClass();
                    q7y.a(illegalArgumentException2, "cellId == Int.MAX_VALUE");
                    return null;
                }
                long ci = cellIdentityLte.getCi();
                lbsParamsFactory$createGsmCell$2.L$0 = cellInfoLte2;
                lbsParamsFactory$createGsmCell$2.L$1 = cellIdentityLte;
                lbsParamsFactory$createGsmCell$2.L$2 = cellSignalStrengthLte;
                lbsParamsFactory$createGsmCell$2.L$3 = num;
                lbsParamsFactory$createGsmCell$2.J$0 = ci;
                lbsParamsFactory$createGsmCell$2.label = 2;
                obj = s66Var.b.b(lbsParamsFactory$createGsmCell$2);
                if (obj != coroutineSingletons) {
                    num2 = num;
                    cellSignalStrengthLte2 = cellSignalStrengthLte;
                    cellInfoLte3 = cellInfoLte2;
                    cellIdentityLte2 = cellIdentityLte;
                    j = ci;
                    if (((s3u) obj).c) {
                    }
                    return new a8y(num2.intValue(), cellIdentityLte2.getMnc(), cellIdentityLte2.getTac(), cellSignalStrengthLte2.getDbm(), j, cellInfoLte3.getTimeStamp());
                }
                return coroutineSingletons;
            }
        }
        lbsParamsFactory$createGsmCell$2 = new LbsParamsFactory$createGsmCell$2(this, continuationImpl);
        obj = lbsParamsFactory$createGsmCell$2.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsParamsFactory$createGsmCell$2.label;
        s66Var = this.c;
        q7y q7yVar2 = this.b;
        if (i != 0) {
        }
        if (!((s3u) obj).d) {
        }
        long ci2 = cellIdentityLte.getCi();
        lbsParamsFactory$createGsmCell$2.L$0 = cellInfoLte2;
        lbsParamsFactory$createGsmCell$2.L$1 = cellIdentityLte;
        lbsParamsFactory$createGsmCell$2.L$2 = cellSignalStrengthLte;
        lbsParamsFactory$createGsmCell$2.L$3 = num;
        lbsParamsFactory$createGsmCell$2.J$0 = ci2;
        lbsParamsFactory$createGsmCell$2.label = 2;
        obj = s66Var.b.b(lbsParamsFactory$createGsmCell$2);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(CellInfoNr cellInfoNr, ContinuationImpl continuationImpl) {
        LbsParamsFactory$createGsmCell$4 lbsParamsFactory$createGsmCell$4;
        Object obj;
        int i;
        CellIdentityNr cellIdentityNr;
        Integer num;
        Integer num2;
        long j;
        CellInfoNr cellInfoNr2;
        CellSignalStrength cellSignalStrength;
        int intValue;
        CellIdentityNr cellIdentityNr2;
        int intValue2;
        String mncString;
        Integer l;
        if (continuationImpl instanceof LbsParamsFactory$createGsmCell$4) {
            lbsParamsFactory$createGsmCell$4 = (LbsParamsFactory$createGsmCell$4) continuationImpl;
            int i2 = lbsParamsFactory$createGsmCell$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsParamsFactory$createGsmCell$4.label = i2 - Integer.MIN_VALUE;
                obj = lbsParamsFactory$createGsmCell$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsParamsFactory$createGsmCell$4.label;
                q7y q7yVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CellIdentity cellIdentity = cellInfoNr.getCellIdentity();
                    cellIdentityNr = cellIdentity instanceof CellIdentityNr ? (CellIdentityNr) cellIdentity : null;
                    if (cellIdentityNr != null) {
                        String mccString = cellIdentityNr.getMccString();
                        if (mccString == null || (num = bvu0.l(10, mccString)) == null || (intValue = num.intValue()) == Integer.MAX_VALUE || intValue < 0 || intValue >= 1000) {
                            num = null;
                        }
                        if (num == null) {
                            q7yVar.getClass();
                            return null;
                        }
                        CellSignalStrength cellSignalStrength2 = cellInfoNr.getCellSignalStrength();
                        long nci = cellIdentityNr.getNci();
                        lbsParamsFactory$createGsmCell$4.L$0 = cellInfoNr;
                        lbsParamsFactory$createGsmCell$4.L$1 = cellIdentityNr;
                        lbsParamsFactory$createGsmCell$4.L$2 = num;
                        lbsParamsFactory$createGsmCell$4.L$3 = cellSignalStrength2;
                        lbsParamsFactory$createGsmCell$4.J$0 = nci;
                        lbsParamsFactory$createGsmCell$4.label = 1;
                        Object b = this.c.b.b(lbsParamsFactory$createGsmCell$4);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        num2 = num;
                        j = nci;
                        cellInfoNr2 = cellInfoNr;
                        obj = b;
                        cellSignalStrength = cellSignalStrength2;
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = lbsParamsFactory$createGsmCell$4.J$0;
                cellSignalStrength = (CellSignalStrength) lbsParamsFactory$createGsmCell$4.L$3;
                num2 = (Integer) lbsParamsFactory$createGsmCell$4.L$2;
                cellIdentityNr = (CellIdentityNr) lbsParamsFactory$createGsmCell$4.L$1;
                cellInfoNr2 = (CellInfoNr) lbsParamsFactory$createGsmCell$4.L$0;
                kotlin.b.b(obj);
                j = j2;
                if (!((s3u) obj).c && j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                    q7yVar.getClass();
                    q7y.a(illegalArgumentException, "cellId == Long.MAX_VALUE");
                    return null;
                }
                cellIdentityNr2 = cellIdentityNr;
                intValue2 = num2.intValue();
                mncString = cellIdentityNr2.getMncString();
                if (mncString != null && (l = bvu0.l(10, mncString)) != null) {
                    return new a8y(intValue2, l.intValue(), cellIdentityNr2.getTac(), cellSignalStrength.getDbm(), j, cellInfoNr2.getTimeStamp());
                }
                return null;
            }
        }
        lbsParamsFactory$createGsmCell$4 = new LbsParamsFactory$createGsmCell$4(this, continuationImpl);
        obj = lbsParamsFactory$createGsmCell$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsParamsFactory$createGsmCell$4.label;
        q7y q7yVar2 = this.b;
        if (i != 0) {
        }
        if (!((s3u) obj).c) {
        }
        cellIdentityNr2 = cellIdentityNr;
        intValue2 = num2.intValue();
        mncString = cellIdentityNr2.getMncString();
        if (mncString != null) {
            return new a8y(intValue2, l.intValue(), cellIdentityNr2.getTac(), cellSignalStrength.getDbm(), j, cellInfoNr2.getTimeStamp());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(CellInfoTdscdma cellInfoTdscdma, ContinuationImpl continuationImpl) {
        LbsParamsFactory$createGsmCell$5 lbsParamsFactory$createGsmCell$5;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        s66 s66Var;
        Integer num;
        CellInfoTdscdma cellInfoTdscdma2;
        CellIdentityTdscdma cellIdentityTdscdma;
        CellSignalStrengthTdscdma cellSignalStrengthTdscdma;
        Integer num2;
        int intValue;
        Integer num3;
        CellSignalStrengthTdscdma cellSignalStrengthTdscdma2;
        CellIdentityTdscdma cellIdentityTdscdma2;
        CellInfoTdscdma cellInfoTdscdma3;
        long j;
        String mncString;
        Integer l;
        if (continuationImpl instanceof LbsParamsFactory$createGsmCell$5) {
            lbsParamsFactory$createGsmCell$5 = (LbsParamsFactory$createGsmCell$5) continuationImpl;
            int i2 = lbsParamsFactory$createGsmCell$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsParamsFactory$createGsmCell$5.label = i2 - Integer.MIN_VALUE;
                obj = lbsParamsFactory$createGsmCell$5.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsParamsFactory$createGsmCell$5.label;
                s66Var = this.c;
                q7y q7yVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
                    CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
                    String mccString = cellIdentity.getMccString();
                    if (mccString == null || (num = bvu0.l(10, mccString)) == null || (intValue = num.intValue()) == Integer.MAX_VALUE || intValue < 0 || intValue >= 1000) {
                        num = null;
                    }
                    if (num == null) {
                        q7yVar.getClass();
                        return null;
                    }
                    cellInfoTdscdma2 = cellInfoTdscdma;
                    lbsParamsFactory$createGsmCell$5.L$0 = cellInfoTdscdma2;
                    lbsParamsFactory$createGsmCell$5.L$1 = cellIdentity;
                    lbsParamsFactory$createGsmCell$5.L$2 = cellSignalStrength;
                    lbsParamsFactory$createGsmCell$5.L$3 = num;
                    lbsParamsFactory$createGsmCell$5.label = 1;
                    Object b = s66Var.b.b(lbsParamsFactory$createGsmCell$5);
                    if (b != coroutineSingletons) {
                        Integer num4 = num;
                        cellIdentityTdscdma = cellIdentity;
                        obj = b;
                        cellSignalStrengthTdscdma = cellSignalStrength;
                        num2 = num4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = lbsParamsFactory$createGsmCell$5.J$0;
                    num3 = (Integer) lbsParamsFactory$createGsmCell$5.L$3;
                    cellSignalStrengthTdscdma2 = (CellSignalStrengthTdscdma) lbsParamsFactory$createGsmCell$5.L$2;
                    cellIdentityTdscdma2 = (CellIdentityTdscdma) lbsParamsFactory$createGsmCell$5.L$1;
                    cellInfoTdscdma3 = (CellInfoTdscdma) lbsParamsFactory$createGsmCell$5.L$0;
                    kotlin.b.b(obj);
                    j = j2;
                    if (!((s3u) obj).c && j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                        q7yVar.getClass();
                        q7y.a(illegalArgumentException, "cellId == Long.MAX_VALUE");
                        return null;
                    }
                    int intValue2 = num3.intValue();
                    mncString = cellIdentityTdscdma2.getMncString();
                    if (mncString != null || (l = bvu0.l(10, mncString)) == null) {
                        return null;
                    }
                    return new a8y(intValue2, l.intValue(), cellIdentityTdscdma2.getLac(), cellSignalStrengthTdscdma2.getDbm(), j, cellInfoTdscdma3.getTimeStamp());
                }
                num2 = (Integer) lbsParamsFactory$createGsmCell$5.L$3;
                cellSignalStrengthTdscdma = (CellSignalStrengthTdscdma) lbsParamsFactory$createGsmCell$5.L$2;
                cellIdentityTdscdma = (CellIdentityTdscdma) lbsParamsFactory$createGsmCell$5.L$1;
                cellInfoTdscdma2 = (CellInfoTdscdma) lbsParamsFactory$createGsmCell$5.L$0;
                kotlin.b.b(obj);
                if (!((s3u) obj).d && cellIdentityTdscdma.getCid() == Integer.MAX_VALUE) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
                    q7yVar.getClass();
                    q7y.a(illegalArgumentException2, "cellId == Int.MAX_VALUE");
                    return null;
                }
                long cid = cellIdentityTdscdma.getCid();
                lbsParamsFactory$createGsmCell$5.L$0 = cellInfoTdscdma2;
                lbsParamsFactory$createGsmCell$5.L$1 = cellIdentityTdscdma;
                lbsParamsFactory$createGsmCell$5.L$2 = cellSignalStrengthTdscdma;
                lbsParamsFactory$createGsmCell$5.L$3 = num2;
                lbsParamsFactory$createGsmCell$5.J$0 = cid;
                lbsParamsFactory$createGsmCell$5.label = 2;
                obj = s66Var.b.b(lbsParamsFactory$createGsmCell$5);
                if (obj != coroutineSingletons) {
                    num3 = num2;
                    cellSignalStrengthTdscdma2 = cellSignalStrengthTdscdma;
                    cellIdentityTdscdma2 = cellIdentityTdscdma;
                    cellInfoTdscdma3 = cellInfoTdscdma2;
                    j = cid;
                    if (!((s3u) obj).c) {
                    }
                    int intValue22 = num3.intValue();
                    mncString = cellIdentityTdscdma2.getMncString();
                    if (mncString != null) {
                    }
                    return null;
                }
                return coroutineSingletons;
            }
        }
        lbsParamsFactory$createGsmCell$5 = new LbsParamsFactory$createGsmCell$5(this, continuationImpl);
        obj = lbsParamsFactory$createGsmCell$5.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsParamsFactory$createGsmCell$5.label;
        s66Var = this.c;
        q7y q7yVar2 = this.b;
        if (i != 0) {
        }
        if (!((s3u) obj).d) {
        }
        long cid2 = cellIdentityTdscdma.getCid();
        lbsParamsFactory$createGsmCell$5.L$0 = cellInfoTdscdma2;
        lbsParamsFactory$createGsmCell$5.L$1 = cellIdentityTdscdma;
        lbsParamsFactory$createGsmCell$5.L$2 = cellSignalStrengthTdscdma;
        lbsParamsFactory$createGsmCell$5.L$3 = num2;
        lbsParamsFactory$createGsmCell$5.J$0 = cid2;
        lbsParamsFactory$createGsmCell$5.label = 2;
        obj = s66Var.b.b(lbsParamsFactory$createGsmCell$5);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(CellInfoWcdma cellInfoWcdma, ContinuationImpl continuationImpl) {
        LbsParamsFactory$createGsmCell$6 lbsParamsFactory$createGsmCell$6;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        s66 s66Var;
        Integer num;
        CellInfoWcdma cellInfoWcdma2;
        CellIdentityWcdma cellIdentityWcdma;
        CellSignalStrengthWcdma cellSignalStrengthWcdma;
        Integer num2;
        int intValue;
        Integer num3;
        CellSignalStrengthWcdma cellSignalStrengthWcdma2;
        CellIdentityWcdma cellIdentityWcdma2;
        CellInfoWcdma cellInfoWcdma3;
        long j;
        int intValue2;
        String mncString;
        Integer l;
        if (continuationImpl instanceof LbsParamsFactory$createGsmCell$6) {
            lbsParamsFactory$createGsmCell$6 = (LbsParamsFactory$createGsmCell$6) continuationImpl;
            int i2 = lbsParamsFactory$createGsmCell$6.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsParamsFactory$createGsmCell$6.label = i2 - Integer.MIN_VALUE;
                obj = lbsParamsFactory$createGsmCell$6.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsParamsFactory$createGsmCell$6.label;
                s66Var = this.c;
                q7y q7yVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
                    if (cellIdentity == null) {
                        cellIdentity = null;
                    }
                    if (cellIdentity != null) {
                        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
                        String mccString = cellIdentity.getMccString();
                        if (mccString == null || (num = bvu0.l(10, mccString)) == null || (intValue = num.intValue()) == Integer.MAX_VALUE || intValue < 0 || intValue >= 1000) {
                            num = null;
                        }
                        if (num == null) {
                            q7yVar.getClass();
                            return null;
                        }
                        cellInfoWcdma2 = cellInfoWcdma;
                        lbsParamsFactory$createGsmCell$6.L$0 = cellInfoWcdma2;
                        lbsParamsFactory$createGsmCell$6.L$1 = cellIdentity;
                        lbsParamsFactory$createGsmCell$6.L$2 = cellSignalStrength;
                        lbsParamsFactory$createGsmCell$6.L$3 = num;
                        lbsParamsFactory$createGsmCell$6.label = 1;
                        Object b = s66Var.b.b(lbsParamsFactory$createGsmCell$6);
                        if (b != coroutineSingletons) {
                            Integer num4 = num;
                            cellIdentityWcdma = cellIdentity;
                            obj = b;
                            cellSignalStrengthWcdma = cellSignalStrength;
                            num2 = num4;
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = lbsParamsFactory$createGsmCell$6.J$0;
                    num3 = (Integer) lbsParamsFactory$createGsmCell$6.L$3;
                    cellSignalStrengthWcdma2 = (CellSignalStrengthWcdma) lbsParamsFactory$createGsmCell$6.L$2;
                    cellIdentityWcdma2 = (CellIdentityWcdma) lbsParamsFactory$createGsmCell$6.L$1;
                    cellInfoWcdma3 = (CellInfoWcdma) lbsParamsFactory$createGsmCell$6.L$0;
                    kotlin.b.b(obj);
                    j = j2;
                    if (!((s3u) obj).c && j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                        q7yVar.getClass();
                        q7y.a(illegalArgumentException, "cellId == Long.MAX_VALUE");
                        return null;
                    }
                    intValue2 = num3.intValue();
                    mncString = cellIdentityWcdma2.getMncString();
                    if (mncString != null && (l = bvu0.l(10, mncString)) != null) {
                        return new a8y(intValue2, l.intValue(), cellIdentityWcdma2.getLac(), cellSignalStrengthWcdma2.getDbm(), j, cellInfoWcdma3.getTimeStamp());
                    }
                    return null;
                }
                num2 = (Integer) lbsParamsFactory$createGsmCell$6.L$3;
                cellSignalStrengthWcdma = (CellSignalStrengthWcdma) lbsParamsFactory$createGsmCell$6.L$2;
                cellIdentityWcdma = (CellIdentityWcdma) lbsParamsFactory$createGsmCell$6.L$1;
                cellInfoWcdma2 = (CellInfoWcdma) lbsParamsFactory$createGsmCell$6.L$0;
                kotlin.b.b(obj);
                if (!((s3u) obj).d && cellIdentityWcdma.getCid() == Integer.MAX_VALUE) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
                    q7yVar.getClass();
                    q7y.a(illegalArgumentException2, "cellId == Int.MAX_VALUE");
                    return null;
                }
                long cid = cellIdentityWcdma.getCid();
                lbsParamsFactory$createGsmCell$6.L$0 = cellInfoWcdma2;
                lbsParamsFactory$createGsmCell$6.L$1 = cellIdentityWcdma;
                lbsParamsFactory$createGsmCell$6.L$2 = cellSignalStrengthWcdma;
                lbsParamsFactory$createGsmCell$6.L$3 = num2;
                lbsParamsFactory$createGsmCell$6.J$0 = cid;
                lbsParamsFactory$createGsmCell$6.label = 2;
                obj = s66Var.b.b(lbsParamsFactory$createGsmCell$6);
                if (obj != coroutineSingletons) {
                    num3 = num2;
                    cellSignalStrengthWcdma2 = cellSignalStrengthWcdma;
                    cellIdentityWcdma2 = cellIdentityWcdma;
                    cellInfoWcdma3 = cellInfoWcdma2;
                    j = cid;
                    if (!((s3u) obj).c) {
                    }
                    intValue2 = num3.intValue();
                    mncString = cellIdentityWcdma2.getMncString();
                    if (mncString != null) {
                        return new a8y(intValue2, l.intValue(), cellIdentityWcdma2.getLac(), cellSignalStrengthWcdma2.getDbm(), j, cellInfoWcdma3.getTimeStamp());
                    }
                    return null;
                }
                return coroutineSingletons;
            }
        }
        lbsParamsFactory$createGsmCell$6 = new LbsParamsFactory$createGsmCell$6(this, continuationImpl);
        obj = lbsParamsFactory$createGsmCell$6.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsParamsFactory$createGsmCell$6.label;
        s66Var = this.c;
        q7y q7yVar2 = this.b;
        if (i != 0) {
        }
        if (!((s3u) obj).d) {
        }
        long cid2 = cellIdentityWcdma.getCid();
        lbsParamsFactory$createGsmCell$6.L$0 = cellInfoWcdma2;
        lbsParamsFactory$createGsmCell$6.L$1 = cellIdentityWcdma;
        lbsParamsFactory$createGsmCell$6.L$2 = cellSignalStrengthWcdma;
        lbsParamsFactory$createGsmCell$6.L$3 = num2;
        lbsParamsFactory$createGsmCell$6.J$0 = cid2;
        lbsParamsFactory$createGsmCell$6.label = 2;
        obj = s66Var.b.b(lbsParamsFactory$createGsmCell$6);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00b4 -> B:10:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(List list, ContinuationImpl continuationImpl) {
        LbsParamsFactory$mapCellInfo$1 lbsParamsFactory$mapCellInfo$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof LbsParamsFactory$mapCellInfo$1) {
            lbsParamsFactory$mapCellInfo$1 = (LbsParamsFactory$mapCellInfo$1) continuationImpl;
            int i2 = lbsParamsFactory$mapCellInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsParamsFactory$mapCellInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsParamsFactory$mapCellInfo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsParamsFactory$mapCellInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        it = list.iterator();
                        collection = arrayList;
                        if (it.hasNext()) {
                        }
                    }
                    return EmptyList.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) lbsParamsFactory$mapCellInfo$1.L$5;
                collection = (Collection) lbsParamsFactory$mapCellInfo$1.L$3;
                kotlin.b.b(obj);
                a8y a8yVar = (a8y) obj;
                if (a8yVar != null) {
                    collection.add(a8yVar);
                }
                if (it.hasNext()) {
                    CellInfo cellInfo = (CellInfo) it.next();
                    lbsParamsFactory$mapCellInfo$1.L$0 = null;
                    lbsParamsFactory$mapCellInfo$1.L$1 = null;
                    lbsParamsFactory$mapCellInfo$1.L$2 = null;
                    lbsParamsFactory$mapCellInfo$1.L$3 = collection;
                    lbsParamsFactory$mapCellInfo$1.L$4 = null;
                    lbsParamsFactory$mapCellInfo$1.L$5 = it;
                    lbsParamsFactory$mapCellInfo$1.L$6 = null;
                    lbsParamsFactory$mapCellInfo$1.L$7 = null;
                    lbsParamsFactory$mapCellInfo$1.L$8 = null;
                    lbsParamsFactory$mapCellInfo$1.label = 1;
                    obj = !(cellInfo instanceof CellInfoNr) ? !(cellInfo instanceof CellInfoTdscdma) ? !(cellInfo instanceof CellInfoLte) ? !(cellInfo instanceof CellInfoGsm) ? cellInfo instanceof CellInfoWcdma ? f((CellInfoWcdma) cellInfo, lbsParamsFactory$mapCellInfo$1) : null : b((CellInfoGsm) cellInfo, lbsParamsFactory$mapCellInfo$1) : c((CellInfoLte) cellInfo, lbsParamsFactory$mapCellInfo$1) : e((CellInfoTdscdma) cellInfo, lbsParamsFactory$mapCellInfo$1) : d((CellInfoNr) cellInfo, lbsParamsFactory$mapCellInfo$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    a8y a8yVar2 = (a8y) obj;
                    if (a8yVar2 != null) {
                    }
                    if (it.hasNext()) {
                        List list2 = (List) collection;
                        if (list2 != null) {
                            return list2;
                        }
                        return EmptyList.a;
                    }
                }
            }
        }
        lbsParamsFactory$mapCellInfo$1 = new LbsParamsFactory$mapCellInfo$1(this, continuationImpl);
        Object obj3 = lbsParamsFactory$mapCellInfo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsParamsFactory$mapCellInfo$1.label;
        if (i != 0) {
        }
    }
}
