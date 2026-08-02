package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u7w implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<u7w> CREATOR;
    public static final u7w a;
    public static final u7w b;
    public static final u7w c;
    public static final /* synthetic */ u7w[] d;

    static {
        u7w u7wVar = new u7w("ProCard", 0);
        a = u7wVar;
        u7w u7wVar2 = new u7w("PlusCard", 1);
        b = u7wVar2;
        u7w u7wVar3 = new u7w("SplitCard", 2);
        c = u7wVar3;
        d = new u7w[]{u7wVar, u7wVar2, u7wVar3};
        CREATOR = new onv(2);
    }

    public static u7w valueOf(String str) {
        return (u7w) Enum.valueOf(u7w.class, str);
    }

    public static u7w[] values() {
        return (u7w[]) d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
