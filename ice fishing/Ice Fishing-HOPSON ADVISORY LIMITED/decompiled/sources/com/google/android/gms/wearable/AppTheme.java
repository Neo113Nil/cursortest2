package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public class AppTheme extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new zzc();
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private Icon zzf;
    private Headline zzg;
    private Description zzh;
    private CallToAction zzi;

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    public static class Builder {
        private final AppTheme zza = new AppTheme();

        public CallToAction getCallToAction() {
            return this.zza.zzm();
        }

        public int getColorTheme() {
            return this.zza.zze();
        }

        public Description getDescription() {
            return this.zza.zzl();
        }

        public int getDeviceExperience() {
            return this.zza.zzi();
        }

        public int getDynamicColor() {
            return this.zza.zzf();
        }

        public Headline getHeadline() {
            return this.zza.zzk();
        }

        public Icon getIcon() {
            return this.zza.zzj();
        }

        public int getScreenAlignment() {
            return this.zza.zzg();
        }

        public int getScreenItemsSize() {
            return this.zza.zzh();
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    public static class CallToAction extends AbstractSafeParcelable {
        public static final Parcelable.Creator<CallToAction> CREATOR = new zze();
        private final int zza;
        private final int zzb;
        private final int zzc;

        /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
        public static class Builder {
            private final CallToAction zza = new CallToAction();

            public int getButtonSize() {
                return this.zza.zzb();
            }

            public int getCornerRadius() {
                return this.zza.zzc();
            }

            public int getTextSize() {
                return this.zza.zza();
            }
        }

        public CallToAction() {
            this.zza = 0;
            this.zzb = 0;
            this.zzc = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                CallToAction callToAction = (CallToAction) obj;
                if (this.zza == callToAction.zza && this.zzb == callToAction.zzb && this.zzc == callToAction.zzc) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
        }

        public final String toString() {
            int i = this.zza;
            int length = String.valueOf(i).length();
            int i2 = this.zzb;
            int length2 = String.valueOf(i2).length();
            int i3 = this.zzc;
            StringBuilder sb = new StringBuilder(length + 37 + length2 + 15 + String.valueOf(i3).length() + 2);
            sb.append("CallToAction { textSize=");
            sb.append(i);
            sb.append(", buttonSize=");
            sb.append(i2);
            sb.append(", cornerRadius=");
            sb.append(i3);
            sb.append(" }");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zza);
            SafeParcelWriter.writeInt(parcel, 2, this.zzb);
            SafeParcelWriter.writeInt(parcel, 3, this.zzc);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        final /* synthetic */ int zza() {
            return this.zza;
        }

        final /* synthetic */ int zzb() {
            return this.zzb;
        }

        final /* synthetic */ int zzc() {
            return this.zzc;
        }

        public CallToAction(int i, int i2, int i3) {
            this.zza = i;
            this.zzb = i2;
            this.zzc = i3;
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    public static class Description extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Description> CREATOR = new zzm();
        private final int zza;
        private final int zzb;

        /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
        public static class Builder {
            private final Description zza = new Description();

            public int getTextAlignment() {
                return this.zza.zza();
            }

            public int getTextSize() {
                return this.zza.zzb();
            }
        }

        public Description() {
            this.zza = 0;
            this.zzb = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Description description = (Description) obj;
                if (this.zza == description.zza && this.zzb == description.zzb) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
        }

        public final String toString() {
            int i = this.zza;
            int length = String.valueOf(i).length();
            int i2 = this.zzb;
            StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(i2).length() + 2);
            sb.append("Description { textAlignment=");
            sb.append(i);
            sb.append(", textSize=");
            sb.append(i2);
            sb.append(" }");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zza);
            SafeParcelWriter.writeInt(parcel, 2, this.zzb);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        final /* synthetic */ int zza() {
            return this.zza;
        }

        final /* synthetic */ int zzb() {
            return this.zzb;
        }

        public Description(int i, int i2) {
            this.zza = i;
            this.zzb = i2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    public static class Headline extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Headline> CREATOR = new zzo();
        private final int zza;
        private final int zzb;
        private final int zzc;

        /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
        public static class Builder {
            private final Headline zza = new Headline();

            public int getTextAlignment() {
                return this.zza.zza();
            }

            public int getTextSize() {
                return this.zza.zzc();
            }

            public int getTextWeight() {
                return this.zza.zzb();
            }
        }

        public Headline() {
            this.zza = 0;
            this.zzb = 0;
            this.zzc = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Headline headline = (Headline) obj;
                if (this.zza == headline.zza && this.zzb == headline.zzb && this.zzc == headline.zzc) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
        }

        public final String toString() {
            int i = this.zza;
            int length = String.valueOf(i).length();
            int i2 = this.zzb;
            int length2 = String.valueOf(i2).length();
            int i3 = this.zzc;
            StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i3).length() + 2);
            sb.append("Headline { textAlignment=");
            sb.append(i);
            sb.append(", textWeight=");
            sb.append(i2);
            sb.append(", textSize=");
            sb.append(i3);
            sb.append(" }");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zza);
            SafeParcelWriter.writeInt(parcel, 2, this.zzb);
            SafeParcelWriter.writeInt(parcel, 3, this.zzc);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        final /* synthetic */ int zza() {
            return this.zza;
        }

        final /* synthetic */ int zzb() {
            return this.zzb;
        }

        final /* synthetic */ int zzc() {
            return this.zzc;
        }

        public Headline(int i, int i2, int i3) {
            this.zza = i;
            this.zzb = i2;
            this.zzc = i3;
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    public static class Icon extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Icon> CREATOR = new zzp();
        private final int zza;

        /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
        public static class Builder {
            private final Icon zza = new Icon();

            public int getComponentAlignment() {
                return this.zza.zza();
            }
        }

        public Icon() {
            this.zza = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.zza == ((Icon) obj).zza;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.zza));
        }

        public final String toString() {
            int i = this.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
            sb.append("Icon { componentAlignment=");
            sb.append(i);
            sb.append(" }");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zza);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        final /* synthetic */ int zza() {
            return this.zza;
        }

        public Icon(int i) {
            this.zza = i;
        }
    }

    public AppTheme() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = new Icon();
        this.zzg = new Headline();
        this.zzh = new Description();
        this.zzi = new CallToAction();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        return zzd() == appTheme.zzd() && zzc() == appTheme.zzc() && zzb() == appTheme.zzb() && zza() == appTheme.zza() && this.zze == appTheme.zze && Objects.equals(this.zzf, appTheme.zzf) && Objects.equals(this.zzg, appTheme.zzg) && Objects.equals(this.zzh, appTheme.zzh) && Objects.equals(this.zzi, appTheme.zzi);
    }

    public final int hashCode() {
        return (((((((((((((((zzd() * 31) + zzc()) * 31) + zzb()) * 31) + zza()) * 31) + this.zze) * 31) + Objects.hashCode(this.zzf)) * 31) + Objects.hashCode(this.zzg)) * 31) + Objects.hashCode(this.zzh)) * 31) + Objects.hashCode(this.zzi);
    }

    public final String toString() {
        int i = this.zze;
        int zzc = zzc();
        int zzd = zzd();
        int zza = zza();
        int zzb = zzb();
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzg);
        String valueOf3 = String.valueOf(this.zzh);
        String valueOf4 = String.valueOf(this.zzi);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(zzc).length();
        int length3 = String.valueOf(zzd).length();
        int length4 = String.valueOf(zza).length();
        int length5 = String.valueOf(zzb).length();
        int length6 = String.valueOf(valueOf).length();
        int length7 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 42 + length2 + 16 + length3 + 19 + length4 + 19 + length5 + 8 + length6 + 12 + length7 + 15 + String.valueOf(valueOf3).length() + 16 + String.valueOf(valueOf4).length() + 1);
        sb.append("AppTheme {deviceExperience =");
        sb.append(i);
        sb.append(", colorTheme =");
        sb.append(zzc);
        sb.append(", dynamicColor =");
        sb.append(zzd);
        sb.append(", screenItemsSize =");
        sb.append(zza);
        sb.append(", screenAlignment =");
        sb.append(zzb);
        sb.append(", icon =");
        sb.append(valueOf);
        sb.append(", headline =");
        sb.append(valueOf2);
        sb.append(", description =");
        sb.append(valueOf3);
        sb.append(", callToAction =");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, zzc());
        SafeParcelWriter.writeInt(parcel, 2, zzd());
        SafeParcelWriter.writeInt(parcel, 3, zzb());
        SafeParcelWriter.writeInt(parcel, 4, zza());
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        int i = this.zzd;
        if (i == 0) {
            return 3;
        }
        return i;
    }

    public final int zzb() {
        int i = this.zzc;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzc() {
        int i = this.zza;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzd() {
        int i = this.zzb;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    final /* synthetic */ int zze() {
        return this.zza;
    }

    final /* synthetic */ int zzf() {
        return this.zzb;
    }

    final /* synthetic */ int zzg() {
        return this.zzc;
    }

    final /* synthetic */ int zzh() {
        return this.zzd;
    }

    final /* synthetic */ int zzi() {
        return this.zze;
    }

    final /* synthetic */ Icon zzj() {
        return this.zzf;
    }

    final /* synthetic */ Headline zzk() {
        return this.zzg;
    }

    final /* synthetic */ Description zzl() {
        return this.zzh;
    }

    final /* synthetic */ CallToAction zzm() {
        return this.zzi;
    }

    public AppTheme(int i, int i2, int i3, int i4, int i5, Icon icon, Headline headline, Description description, CallToAction callToAction) {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = new Icon();
        this.zzg = new Headline();
        this.zzh = new Description();
        this.zzi = new CallToAction();
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = icon == null ? new Icon() : icon;
        this.zzg = headline == null ? new Headline() : headline;
        this.zzh = description == null ? new Description() : description;
        this.zzi = callToAction == null ? new CallToAction() : callToAction;
    }
}
