package q2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.CL;
import k2.C4637h;

/* loaded from: classes.dex */
public final class g1 extends P2.a {
    public static final Parcelable.Creator<g1> CREATOR = new C4894i0(9);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f40047A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f40048B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40049C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f40050D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f40051E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f40052F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f40053G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f40054H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f40055I;

    /* renamed from: n, reason: collision with root package name */
    public final String f40056n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40057u;

    /* renamed from: v, reason: collision with root package name */
    public final int f40058v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f40059w;

    /* renamed from: x, reason: collision with root package name */
    public final int f40060x;

    /* renamed from: y, reason: collision with root package name */
    public final int f40061y;

    /* renamed from: z, reason: collision with root package name */
    public final g1[] f40062z;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g1(Context context, C4637h[] c4637hArr) {
        int i;
        int i4;
        String sb;
        int i9;
        double d2;
        C4637h c4637h = c4637hArr[0];
        this.f40059w = false;
        int i10 = c4637h.f38711a;
        int i11 = c4637h.f38712b;
        boolean z8 = i10 == -3 && i11 == -4;
        this.f40048B = z8;
        this.f40052F = c4637h.f38714d;
        boolean z9 = c4637h.f38715e;
        this.f40053G = z9;
        boolean z10 = c4637h.f38717g;
        this.f40054H = z10;
        this.f40055I = false;
        if (z8) {
            C4637h c4637h2 = C4637h.i;
            this.f40060x = c4637h2.f38711a;
            i11 = c4637h2.f38712b;
            this.f40057u = i11;
        } else if (z9) {
            this.f40060x = i10;
            i11 = c4637h.f38716f;
            this.f40057u = i11;
        } else if (z10) {
            this.f40060x = i10;
            i11 = c4637h.f38718h;
            this.f40057u = i11;
        } else {
            this.f40060x = i10;
            this.f40057u = i11;
        }
        boolean z11 = this.f40060x == -1;
        boolean z12 = i11 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z11) {
            u2.d dVar = C4907p.f40108g.f40109a;
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r12.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i12 = displayMetrics2.heightPixels;
                        int i13 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i14 = displayMetrics2.heightPixels;
                        int i15 = displayMetrics2.widthPixels;
                        if (i14 == i12 && i15 == i13) {
                            int i16 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                            i9 = i16 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f40061y = i9;
                            d2 = i9 / displayMetrics.density;
                            i = (int) d2;
                            if (d2 - i >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i9 = displayMetrics.widthPixels;
            this.f40061y = i9;
            d2 = i9 / displayMetrics.density;
            i = (int) d2;
            if (d2 - i >= 0.01d) {
            }
        } else {
            i = this.f40060x;
            u2.d dVar2 = C4907p.f40108g.f40109a;
            this.f40061y = u2.d.q(displayMetrics, i);
        }
        if (z12) {
            int i17 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i4 = i17 <= 400 ? 32 : i17 <= 720 ? 50 : 90;
        } else {
            i4 = this.f40057u;
        }
        u2.d dVar3 = C4907p.f40108g.f40109a;
        this.f40058v = u2.d.q(displayMetrics, i4);
        if (z11 || z12) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + CL.b(i, 1) + 3);
            sb2.append(i);
            sb2.append("x");
            sb2.append(i4);
            sb2.append("_as");
            this.f40056n = sb2.toString();
        } else {
            if (z9 || z10) {
                int i18 = this.f40060x;
                int i19 = this.f40057u;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i19).length() + CL.b(i18, 1) + 3);
                sb3.append(i18);
                sb3.append("x");
                sb3.append(i19);
                sb3.append("_as");
                sb = sb3.toString();
            } else if (z8) {
                sb = "320x50_mb";
            } else {
                this.f40056n = c4637h.f38713c;
            }
            this.f40056n = sb;
        }
        int length = c4637hArr.length;
        if (length > 1) {
            this.f40062z = new g1[length];
            for (int i20 = 0; i20 < c4637hArr.length; i20++) {
                this.f40062z[i20] = new g1(context, c4637hArr[i20]);
            }
        } else {
            this.f40062z = null;
        }
        this.f40047A = false;
        this.f40049C = false;
    }

    public static g1 a() {
        return new g1("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static g1 b() {
        return new g1("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 2, this.f40056n);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f40057u);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f40058v);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f40059w ? 1 : 0);
        S0.f.A(parcel, 6, 4);
        parcel.writeInt(this.f40060x);
        S0.f.A(parcel, 7, 4);
        parcel.writeInt(this.f40061y);
        S0.f.x(parcel, 8, this.f40062z, i);
        S0.f.A(parcel, 9, 4);
        parcel.writeInt(this.f40047A ? 1 : 0);
        S0.f.A(parcel, 10, 4);
        parcel.writeInt(this.f40048B ? 1 : 0);
        boolean z8 = this.f40049C;
        S0.f.A(parcel, 11, 4);
        parcel.writeInt(z8 ? 1 : 0);
        S0.f.A(parcel, 12, 4);
        parcel.writeInt(this.f40050D ? 1 : 0);
        S0.f.A(parcel, 13, 4);
        parcel.writeInt(this.f40051E ? 1 : 0);
        S0.f.A(parcel, 14, 4);
        parcel.writeInt(this.f40052F ? 1 : 0);
        S0.f.A(parcel, 15, 4);
        parcel.writeInt(this.f40053G ? 1 : 0);
        S0.f.A(parcel, 16, 4);
        parcel.writeInt(this.f40054H ? 1 : 0);
        S0.f.A(parcel, 17, 4);
        parcel.writeInt(this.f40055I ? 1 : 0);
        S0.f.C(parcel, B8);
    }

    public g1(String str, int i, int i4, boolean z8, int i9, int i10, g1[] g1VarArr, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f40056n = str;
        this.f40057u = i;
        this.f40058v = i4;
        this.f40059w = z8;
        this.f40060x = i9;
        this.f40061y = i10;
        this.f40062z = g1VarArr;
        this.f40047A = z9;
        this.f40048B = z10;
        this.f40049C = z11;
        this.f40050D = z12;
        this.f40051E = z13;
        this.f40052F = z14;
        this.f40053G = z15;
        this.f40054H = z16;
        this.f40055I = z17;
    }

    public g1() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public g1(Context context, C4637h c4637h) {
        this(context, new C4637h[]{c4637h});
    }
}
