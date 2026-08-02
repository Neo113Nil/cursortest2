package com.google.android.gms.internal.mlkit_common;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zzu implements ModelJsonParser {
    public static final Money sumInDominantCurrency(ArrayList arrayList, CurrencyCode currencyCode) {
        CurrencyCode currencyCode2;
        Long l;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                currencyCode2 = null;
                break;
            }
            currencyCode2 = ((Money) it.next()).currency_code;
            if (currencyCode2 != null) {
                break;
            }
        }
        if (currencyCode2 != null) {
            currencyCode = currencyCode2;
        }
        Iterator it2 = arrayList.iterator();
        long j = 0;
        while (it2.hasNext()) {
            Money money = (Money) it2.next();
            j += (money.currency_code != currencyCode || (l = money.amount) == null) ? 0L : l.longValue();
        }
        return new Money(Long.valueOf(j), currencyCode, 4);
    }

    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                m = "null";
            } else {
                try {
                    m = obj.toString();
                } catch (Exception e) {
                    String m2 = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m2), (Throwable) e);
                    m = Boxes$$ExternalSyntheticOutline1.m("<", m2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = m;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
