package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.cdf.earningstracker.Timeframe;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class zzhx implements ModelJsonParser {
    public static final Triple toAnalyticsTimeframeData(DateFilter dateFilter) {
        dateFilter.getClass();
        if (dateFilter instanceof DateFilter.Monthly) {
            DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter;
            return new Triple(Timeframe.MONTH, Integer.valueOf(monthly.month), Integer.valueOf(monthly.year));
        }
        if (dateFilter instanceof DateFilter.Yearly) {
            return new Triple(Timeframe.YEAR, null, Integer.valueOf(((DateFilter.Yearly) dateFilter).year));
        }
        if (Intrinsics.areEqual(dateFilter, DateFilter.AllTime.INSTANCE)) {
            return new Triple(Timeframe.ALL_TIME, null, null);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static String zzb(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(zze(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(zze(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String zze(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String m = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m), (Throwable) e);
            return Boxes$$ExternalSyntheticOutline1.m("<", m, " threw ", e.getClass().getName(), ">");
        }
    }
}
