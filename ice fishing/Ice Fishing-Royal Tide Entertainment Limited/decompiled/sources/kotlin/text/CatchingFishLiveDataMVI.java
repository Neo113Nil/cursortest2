package kotlin.text;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataMVI implements Comparable, Parcelable {
    public static final Parcelable.Creator<CatchingFishLiveDataMVI> CREATOR = new CatchingFishSnackbarPayPal(12);
    public final int CatchingFishDaggerWebsocket;
    public String CatchingFishFragmentHandler;
    public final long CatchingFishLayout;
    public final Calendar CatchingFishReduxKtor;
    public final int CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishLiveDataMVI(Calendar calendar) {
        calendar.set(5, 1);
        Calendar CatchingFishParcelableFAB = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(calendar);
        this.CatchingFishReduxKtor = CatchingFishParcelableFAB;
        this.CatchingFishDaggerWebsocket = CatchingFishParcelableFAB.get(2);
        this.CatchingFishWorkManager = CatchingFishParcelableFAB.get(1);
        this.CatchingFishViewModelScope = CatchingFishParcelableFAB.getMaximum(7);
        this.CatchingFishViewModelFAB = CatchingFishParcelableFAB.getActualMaximum(5);
        this.CatchingFishLayout = CatchingFishParcelableFAB.getTimeInMillis();
    }

    public static CatchingFishLiveDataMVI CatchingFishParcelableFAB(int i, int i2) {
        Calendar CatchingFishCoroutine = CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null);
        CatchingFishCoroutine.set(1, i);
        CatchingFishCoroutine.set(2, i2);
        return new CatchingFishLiveDataMVI(CatchingFishCoroutine);
    }

    public static CatchingFishLiveDataMVI CatchingFishSnackbar(long j) {
        Calendar CatchingFishCoroutine = CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null);
        CatchingFishCoroutine.setTimeInMillis(j);
        return new CatchingFishLiveDataMVI(CatchingFishCoroutine);
    }

    public final String CatchingFishCoroutine() {
        if (this.CatchingFishFragmentHandler == null) {
            long timeInMillis = this.CatchingFishReduxKtor.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.CatchingFishFragmentHandler = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.CatchingFishFragmentHandler;
    }

    public final int CatchingFishReduxKtor(CatchingFishLiveDataMVI catchingFishLiveDataMVI) {
        if (!(this.CatchingFishReduxKtor instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (catchingFishLiveDataMVI.CatchingFishDaggerWebsocket - this.CatchingFishDaggerWebsocket) + ((catchingFishLiveDataMVI.CatchingFishWorkManager - this.CatchingFishWorkManager) * 12);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.CatchingFishReduxKtor.compareTo(((CatchingFishLiveDataMVI) obj).CatchingFishReduxKtor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishLiveDataMVI)) {
            return false;
        }
        CatchingFishLiveDataMVI catchingFishLiveDataMVI = (CatchingFishLiveDataMVI) obj;
        return this.CatchingFishDaggerWebsocket == catchingFishLiveDataMVI.CatchingFishDaggerWebsocket && this.CatchingFishWorkManager == catchingFishLiveDataMVI.CatchingFishWorkManager;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.CatchingFishDaggerWebsocket), Integer.valueOf(this.CatchingFishWorkManager)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.CatchingFishWorkManager);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
    }
}
