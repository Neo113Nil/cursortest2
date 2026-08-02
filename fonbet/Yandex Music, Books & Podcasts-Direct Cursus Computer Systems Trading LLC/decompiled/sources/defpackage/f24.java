package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f24 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f24> CREATOR;
    public static final i9w a;
    public static final List b;
    public static final List c;
    public static final f24 d;
    public static final f24 e;
    public static final f24 f;
    public static final f24 g;
    public static final f24 h;
    public static final f24 i;
    public static final f24 j;
    public static final /* synthetic */ f24[] k;

    static {
        f24 f24Var = new f24("Downloads", 0);
        d = f24Var;
        f24 f24Var2 = new f24("Playlists", 1);
        e = f24Var2;
        f24 f24Var3 = new f24("Albums", 2);
        f = f24Var3;
        f24 f24Var4 = new f24("Kids", 3);
        g = f24Var4;
        f24 f24Var5 = new f24("Books", 4);
        h = f24Var5;
        f24 f24Var6 = new f24("Podcasts", 5);
        i = f24Var6;
        f24 f24Var7 = new f24("VideoClips", 6);
        j = f24Var7;
        f24 f24Var8 = new f24("WaveForTwo", 7);
        k = new f24[]{f24Var, f24Var2, f24Var3, f24Var4, f24Var5, f24Var6, f24Var7, f24Var8};
        a = new i9w();
        CREATOR = new i02(22);
        List h2 = u75.h(f24Var2, f24Var3, f24Var7, f24Var5, f24Var6, f24Var4, f24Var, f24Var8);
        b = h2;
        c = h2;
    }

    public static f24 valueOf(String str) {
        return (f24) Enum.valueOf(f24.class, str);
    }

    public static f24[] values() {
        return (f24[]) k.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
