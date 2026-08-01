package f0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0097n;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142g implements Parcelable {
    public static final Parcelable.Creator<C0142g> CREATOR = new F0.b(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f2927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2928b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2929c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2930d;

    public C0142g(C0141f c0141f) {
        D1.i.e(c0141f, "entry");
        this.f2927a = c0141f.f2923f;
        this.f2928b = c0141f.f2920b.f2994h;
        this.f2929c = c0141f.e();
        Bundle bundle = new Bundle();
        this.f2930d = bundle;
        c0141f.i.c(bundle);
    }

    public final C0141f a(Context context, w wVar, EnumC0097n enumC0097n, C0150o c0150o) {
        D1.i.e(enumC0097n, "hostLifecycleState");
        Bundle bundle = this.f2929c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f2927a;
        D1.i.e(str, "id");
        return new C0141f(context, wVar, bundle2, enumC0097n, c0150o, str, this.f2930d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D1.i.e(parcel, "parcel");
        parcel.writeString(this.f2927a);
        parcel.writeInt(this.f2928b);
        parcel.writeBundle(this.f2929c);
        parcel.writeBundle(this.f2930d);
    }

    public C0142g(Parcel parcel) {
        D1.i.e(parcel, "inParcel");
        String readString = parcel.readString();
        D1.i.b(readString);
        this.f2927a = readString;
        this.f2928b = parcel.readInt();
        this.f2929c = parcel.readBundle(C0142g.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(C0142g.class.getClassLoader());
        D1.i.b(readBundle);
        this.f2930d = readBundle;
    }
}
