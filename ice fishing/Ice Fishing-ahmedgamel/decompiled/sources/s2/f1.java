package s2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class f1 extends S2.a {
    public static final Parcelable.Creator<f1> CREATOR = new C4936i0(9);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f40432A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f40433B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40434C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f40435D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f40436E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f40437F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f40438G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f40439H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f40440I;

    /* renamed from: n, reason: collision with root package name */
    public final String f40441n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40442u;

    /* renamed from: v, reason: collision with root package name */
    public final int f40443v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f40444w;

    /* renamed from: x, reason: collision with root package name */
    public final int f40445x;

    /* renamed from: y, reason: collision with root package name */
    public final int f40446y;

    /* renamed from: z, reason: collision with root package name */
    public final f1[] f40447z;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f1(Context context, m2.h[] hVarArr) {
        int i;
        int i4;
        String sb;
        int i6;
        double d9;
        m2.h hVar = hVarArr[0];
        this.f40444w = false;
        int i9 = hVar.f39380a;
        int i10 = hVar.f39381b;
        boolean z6 = i9 == -3 && i10 == -4;
        this.f40433B = z6;
        this.f40437F = hVar.f39383d;
        boolean z9 = hVar.f39384e;
        this.f40438G = z9;
        boolean z10 = hVar.f39386g;
        this.f40439H = z10;
        this.f40440I = false;
        if (z6) {
            m2.h hVar2 = m2.h.i;
            this.f40445x = hVar2.f39380a;
            i10 = hVar2.f39381b;
            this.f40442u = i10;
        } else if (z9) {
            this.f40445x = i9;
            i10 = hVar.f39385f;
            this.f40442u = i10;
        } else if (z10) {
            this.f40445x = i9;
            i10 = hVar.f39387h;
            this.f40442u = i10;
        } else {
            this.f40445x = i9;
            this.f40442u = i10;
        }
        boolean z11 = this.f40445x == -1;
        boolean z12 = i10 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z11) {
            x2.d dVar = C4949p.f40498g.f40499a;
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r12.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i11 = displayMetrics2.heightPixels;
                        int i12 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i13 = displayMetrics2.heightPixels;
                        int i14 = displayMetrics2.widthPixels;
                        if (i13 == i11 && i14 == i12) {
                            int i15 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                            i6 = i15 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f40446y = i6;
                            d9 = i6 / displayMetrics.density;
                            i = (int) d9;
                            if (d9 - i >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i6 = displayMetrics.widthPixels;
            this.f40446y = i6;
            d9 = i6 / displayMetrics.density;
            i = (int) d9;
            if (d9 - i >= 0.01d) {
            }
        } else {
            i = this.f40445x;
            x2.d dVar2 = C4949p.f40498g.f40499a;
            this.f40446y = x2.d.r(displayMetrics, i);
        }
        if (z12) {
            int i16 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i4 = i16 <= 400 ? 32 : i16 <= 720 ? 50 : 90;
        } else {
            i4 = this.f40442u;
        }
        x2.d dVar3 = C4949p.f40498g.f40499a;
        this.f40443v = x2.d.r(displayMetrics, i4);
        if (z11 || z12) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + Wv.b(i, 1) + 3);
            sb2.append(i);
            sb2.append("x");
            sb2.append(i4);
            sb2.append("_as");
            this.f40441n = sb2.toString();
        } else {
            if (z9 || z10) {
                int i17 = this.f40445x;
                int i18 = this.f40442u;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i18).length() + Wv.b(i17, 1) + 3);
                sb3.append(i17);
                sb3.append("x");
                sb3.append(i18);
                sb3.append("_as");
                sb = sb3.toString();
            } else if (z6) {
                sb = "320x50_mb";
            } else {
                this.f40441n = hVar.f39382c;
            }
            this.f40441n = sb;
        }
        int length = hVarArr.length;
        if (length > 1) {
            this.f40447z = new f1[length];
            for (int i19 = 0; i19 < hVarArr.length; i19++) {
                this.f40447z[i19] = new f1(context, hVarArr[i19]);
            }
        } else {
            this.f40447z = null;
        }
        this.f40432A = false;
        this.f40434C = false;
    }

    public static f1 a() {
        return new f1("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static f1 b() {
        return new f1("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 2, this.f40441n);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f40442u);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f40443v);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f40444w ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 6, 4);
        parcel.writeInt(this.f40445x);
        com.bumptech.glide.e.w(parcel, 7, 4);
        parcel.writeInt(this.f40446y);
        com.bumptech.glide.e.u(parcel, 8, this.f40447z, i);
        com.bumptech.glide.e.w(parcel, 9, 4);
        parcel.writeInt(this.f40432A ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 10, 4);
        parcel.writeInt(this.f40433B ? 1 : 0);
        boolean z6 = this.f40434C;
        com.bumptech.glide.e.w(parcel, 11, 4);
        parcel.writeInt(z6 ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 12, 4);
        parcel.writeInt(this.f40435D ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 13, 4);
        parcel.writeInt(this.f40436E ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 14, 4);
        parcel.writeInt(this.f40437F ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 15, 4);
        parcel.writeInt(this.f40438G ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 16, 4);
        parcel.writeInt(this.f40439H ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 17, 4);
        parcel.writeInt(this.f40440I ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public f1(String str, int i, int i4, boolean z6, int i6, int i9, f1[] f1VarArr, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f40441n = str;
        this.f40442u = i;
        this.f40443v = i4;
        this.f40444w = z6;
        this.f40445x = i6;
        this.f40446y = i9;
        this.f40447z = f1VarArr;
        this.f40432A = z9;
        this.f40433B = z10;
        this.f40434C = z11;
        this.f40435D = z12;
        this.f40436E = z13;
        this.f40437F = z14;
        this.f40438G = z15;
        this.f40439H = z16;
        this.f40440I = z17;
    }

    public f1() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public f1(Context context, m2.h hVar) {
        this(context, new m2.h[]{hVar});
    }
}
