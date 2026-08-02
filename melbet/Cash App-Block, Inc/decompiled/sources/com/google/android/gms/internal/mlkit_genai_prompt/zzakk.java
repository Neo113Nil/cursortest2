package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.earnings.backend.real.EarningsHomeUiChartState;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DateTimeException;
import java.time.YearMonth;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import squareup.cash.earnings.EarningsChartData;
import squareup.cash.earnings.EarningsHomeUIState;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.earnings.EarningsYearMonth;

/* loaded from: classes4.dex */
public abstract class zzakk implements ModelJsonParser {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EarningsChartData access$currentMonthChartMatching(EarningsHomeUIState earningsHomeUIState, DateFilter dateFilter) {
        YearMonth yearMonth;
        DateFilter.Monthly monthly;
        int intValue;
        EarningsChartData earningsChartData = earningsHomeUIState.current_month_chart;
        if (earningsChartData != null) {
            EarningsTimeFrame earningsTimeFrame = earningsChartData.period;
            EarningsTimeFrame.TimeFrame timeFrame = earningsTimeFrame != null ? earningsTimeFrame.time_frame : null;
            if (timeFrame instanceof EarningsTimeFrame.TimeFrame.YearMonth) {
                EarningsYearMonth earningsYearMonth = ((EarningsTimeFrame.TimeFrame.YearMonth) timeFrame).value;
                Integer num = earningsYearMonth.year;
                if (num != null) {
                    int intValue2 = num.intValue();
                    Integer num2 = earningsYearMonth.month;
                    if (num2 != null && 1 <= (intValue = num2.intValue()) && intValue < 13) {
                        try {
                            yearMonth = YearMonth.of(intValue2, intValue);
                        } catch (DateTimeException unused) {
                        }
                        if (yearMonth != null && (dateFilter instanceof DateFilter.Monthly)) {
                            monthly = (DateFilter.Monthly) dateFilter;
                            if (monthly.year != yearMonth.getYear() && monthly.month == yearMonth.getMonthValue()) {
                                return earningsChartData;
                            }
                        }
                    }
                }
                yearMonth = null;
                if (yearMonth != null) {
                    monthly = (DateFilter.Monthly) dateFilter;
                    if (monthly.year != yearMonth.getYear()) {
                    }
                }
            } else if (timeFrame instanceof EarningsTimeFrame.TimeFrame.YearToDate) {
                Integer num3 = ((EarningsTimeFrame.TimeFrame.YearToDate) timeFrame).value.year;
                if (num3 != null) {
                    int intValue3 = num3.intValue();
                    if (!(dateFilter instanceof DateFilter.Yearly) || ((DateFilter.Yearly) dateFilter).year != intValue3) {
                    }
                }
            } else if (timeFrame != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
        }
        return null;
    }

    public static final Flow access$homeUiChartStates(RealEarningsSyncStateRepository realEarningsSyncStateRepository) {
        StateFlow stateFlow = realEarningsSyncStateRepository.homeUiState;
        EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) stateFlow.getValue();
        return FlowKt.distinctUntilChanged(new FlowUtil$createFlow$$inlined$map$1(new EarningsHomeUiChartState(earningsHomeUIState, earningsHomeUIState == null || !Intrinsics.areEqual(earningsHomeUIState.should_show_chart, Boolean.FALSE), earningsHomeUIState != null), stateFlow, new CardModelView.AnonymousClass1.AnonymousClass4(3, (Continuation) null, 7)));
    }

    public static int zza(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        int zzh = zzh(bArr, i, zzacgVar);
        int i2 = zzacgVar.zza;
        if (i2 < 0) {
            throw new zzaly("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zzh) {
            throw new zzaly("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzacgVar.zzc = zzaks.zzb;
            return zzh;
        }
        zzacgVar.zzc = zzaks.zzi(zzh, i2, bArr);
        return zzh + i2;
    }

    public static int zzb(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzc(zzanb zzanbVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        zzals zzd = zzanbVar.zzd();
        int zzl = zzl(zzd, zzanbVar, bArr, i, i2, i3, zzacgVar);
        zzanbVar.zze(zzd);
        zzacgVar.zzc = zzd;
        return zzl;
    }

    public static int zze(zzanb zzanbVar, int i, byte[] bArr, int i2, int i3, zzalw zzalwVar, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        zzals zzd = zzanbVar.zzd();
        zzanb zzanbVar2 = zzanbVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        com.google.android.gms.internal.measurement.zzacg zzacgVar2 = zzacgVar;
        int zzm = zzm(zzd, zzanbVar2, bArr2, i2, i4, zzacgVar2);
        zzanbVar2.zze(zzd);
        zzacgVar2.zzc = zzd;
        zzalwVar.add(zzd);
        while (zzm < i4) {
            com.google.android.gms.internal.measurement.zzacg zzacgVar3 = zzacgVar2;
            int i5 = i4;
            int zzh = zzh(bArr2, zzm, zzacgVar3);
            if (i != zzacgVar3.zza) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzanb zzanbVar3 = zzanbVar2;
            zzals zzd2 = zzanbVar3.zzd();
            zzm = zzm(zzd2, zzanbVar3, bArr3, zzh, i5, zzacgVar3);
            zzanbVar2 = zzanbVar3;
            bArr2 = bArr3;
            i4 = i5;
            zzacgVar2 = zzacgVar3;
            zzanbVar2.zze(zzd2);
            zzacgVar2.zzc = zzd2;
            zzalwVar.add(zzd2);
        }
        return zzm;
    }

    public static int zzg(int i, byte[] bArr, int i2, int i3, zzano zzanoVar, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        if ((i >>> 3) == 0) {
            throw new zzaly("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzk = zzk(bArr, i2, zzacgVar);
            zzanoVar.zzh(i, Long.valueOf(zzacgVar.zzb));
            return zzk;
        }
        if (i4 == 1) {
            zzanoVar.zzh(i, Long.valueOf(zzn(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzh = zzh(bArr, i2, zzacgVar);
            int i5 = zzacgVar.zza;
            if (i5 < 0) {
                throw new zzaly("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zzh) {
                throw new zzaly("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzanoVar.zzh(i, zzaks.zzb);
            } else {
                zzanoVar.zzh(i, zzaks.zzi(zzh, i5, bArr));
            }
            return zzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzaly("Protocol message contained an invalid tag (zero).");
            }
            zzanoVar.zzh(i, Integer.valueOf(zzb(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzano zzd = zzano.zzd();
        int i7 = zzacgVar.zze + 1;
        zzacgVar.zze = i7;
        if (i7 >= 100) {
            throw new zzaly("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzh2 = zzh(bArr, i2, zzacgVar);
            int i9 = zzacgVar.zza;
            if (i9 == i6) {
                i8 = i9;
                i2 = zzh2;
                break;
            }
            i2 = zzg(i9, bArr, zzh2, i3, zzd, zzacgVar);
            i8 = i9;
        }
        zzacgVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzaly("Failed to parse the message.");
        }
        zzanoVar.zzh(i, zzd);
        return i2;
    }

    public static int zzh(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzacgVar);
        }
        zzacgVar.zza = b;
        return i2;
    }

    public static int zzi(int i, byte[] bArr, int i2, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzacgVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzacgVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzacgVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzacgVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzacgVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzk(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzacgVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzacgVar.zzb = j2;
        return i3;
    }

    public static int zzl(Object obj, zzanb zzanbVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        zzamu zzamuVar = (zzamu) zzanbVar;
        int i4 = zzacgVar.zze + 1;
        zzacgVar.zze = i4;
        if (i4 >= 100) {
            throw new zzaly("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int zzb = zzamuVar.zzb(obj, bArr, i, i2, i3, zzacgVar);
        zzacgVar.zze--;
        zzacgVar.zzc = obj;
        return zzb;
    }

    public static int zzm(Object obj, zzanb zzanbVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzi(i4, bArr, i3, zzacgVar);
            i4 = zzacgVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzaly("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzacgVar.zze + 1;
        zzacgVar.zze = i6;
        if (i6 >= 100) {
            throw new zzaly("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        zzanbVar.zzg(obj, bArr, i5, i7, zzacgVar);
        zzacgVar.zze--;
        zzacgVar.zzc = obj;
        return i7;
    }

    public static long zzn(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
