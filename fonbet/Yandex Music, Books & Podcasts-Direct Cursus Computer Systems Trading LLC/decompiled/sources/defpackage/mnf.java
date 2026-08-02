package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class mnf extends l9 {

    @NonNull
    public static final Parcelable.Creator<mnf> CREATOR = new k2x(21);
    public boolean a;
    public final String b;
    public boolean c;
    public final wt6 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mnf() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = d94.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mnf)) {
            return false;
        }
        mnf mnfVar = (mnf) obj;
        return this.a == mnfVar.a && d94.d(this.b, mnfVar.b) && this.c == mnfVar.c && d94.d(this.d, mnfVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(z);
        sb.append(", language=");
        sb.append(this.b);
        sb.append(", androidReceiverCompatible: ");
        return ouj.r(sb, z2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        boolean z = this.a;
        o8g.q0(2, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        o8g.j0(parcel, 3, this.b);
        boolean z2 = this.c;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(z2 ? 1 : 0);
        o8g.i0(parcel, 5, this.d, i);
        o8g.p0(parcel, o0);
    }

    public mnf(boolean z, String str, boolean z2, wt6 wt6Var) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = wt6Var;
    }
}
