package q2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.icefishing.icefishinglive2.AbstractC4404f;

/* loaded from: classes.dex */
public final class f1 extends Q2.a {
    public static final Parcelable.Creator<f1> CREATOR = new C4887i0(9);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f40130A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f40131B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40132C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f40133D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f40134E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f40135F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f40136G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f40137H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f40138I;

    /* renamed from: n, reason: collision with root package name */
    public final String f40139n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40140u;

    /* renamed from: v, reason: collision with root package name */
    public final int f40141v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f40142w;

    /* renamed from: x, reason: collision with root package name */
    public final int f40143x;

    /* renamed from: y, reason: collision with root package name */
    public final int f40144y;

    /* renamed from: z, reason: collision with root package name */
    public final f1[] f40145z;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f1(Context context, k2.h[] hVarArr) {
        int i;
        int i6;
        String sb;
        int i9;
        double d2;
        k2.h hVar = hVarArr[0];
        this.f40142w = false;
        int i10 = hVar.f38591a;
        int i11 = hVar.f38592b;
        boolean z3 = i10 == -3 && i11 == -4;
        this.f40131B = z3;
        this.f40135F = hVar.f38594d;
        boolean z6 = hVar.f38595e;
        this.f40136G = z6;
        boolean z9 = hVar.f38597g;
        this.f40137H = z9;
        this.f40138I = false;
        if (z3) {
            k2.h hVar2 = k2.h.i;
            this.f40143x = hVar2.f38591a;
            i11 = hVar2.f38592b;
            this.f40140u = i11;
        } else if (z6) {
            this.f40143x = i10;
            i11 = hVar.f38596f;
            this.f40140u = i11;
        } else if (z9) {
            this.f40143x = i10;
            i11 = hVar.f38598h;
            this.f40140u = i11;
        } else {
            this.f40143x = i10;
            this.f40140u = i11;
        }
        boolean z10 = this.f40143x == -1;
        boolean z11 = i11 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z10) {
            v2.d dVar = C4900p.f40196g.f40197a;
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
                            this.f40144y = i9;
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
            this.f40144y = i9;
            d2 = i9 / displayMetrics.density;
            i = (int) d2;
            if (d2 - i >= 0.01d) {
            }
        } else {
            i = this.f40143x;
            v2.d dVar2 = C4900p.f40196g.f40197a;
            this.f40144y = v2.d.r(displayMetrics, i);
        }
        if (z11) {
            int i17 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i6 = i17 <= 400 ? 32 : i17 <= 720 ? 50 : 90;
        } else {
            i6 = this.f40140u;
        }
        v2.d dVar3 = C4900p.f40196g.f40197a;
        this.f40141v = v2.d.r(displayMetrics, i6);
        if (z10 || z11) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + AbstractC4404f.b(i, 1) + 3);
            sb2.append(i);
            sb2.append("x");
            sb2.append(i6);
            sb2.append("_as");
            this.f40139n = sb2.toString();
        } else {
            if (z6 || z9) {
                int i18 = this.f40143x;
                int i19 = this.f40140u;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i19).length() + AbstractC4404f.b(i18, 1) + 3);
                sb3.append(i18);
                sb3.append("x");
                sb3.append(i19);
                sb3.append("_as");
                sb = sb3.toString();
            } else if (z3) {
                sb = "320x50_mb";
            } else {
                this.f40139n = hVar.f38593c;
            }
            this.f40139n = sb;
        }
        int length = hVarArr.length;
        if (length > 1) {
            this.f40145z = new f1[length];
            for (int i20 = 0; i20 < hVarArr.length; i20++) {
                this.f40145z[i20] = new f1(context, hVarArr[i20]);
            }
        } else {
            this.f40145z = null;
        }
        this.f40130A = false;
        this.f40132C = false;
    }

    public static f1 a() {
        return new f1("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static f1 b() {
        return new f1("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 2, this.f40139n);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f40140u);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f40141v);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f40142w ? 1 : 0);
        A8.b.F(parcel, 6, 4);
        parcel.writeInt(this.f40143x);
        A8.b.F(parcel, 7, 4);
        parcel.writeInt(this.f40144y);
        A8.b.C(parcel, 8, this.f40145z, i);
        A8.b.F(parcel, 9, 4);
        parcel.writeInt(this.f40130A ? 1 : 0);
        A8.b.F(parcel, 10, 4);
        parcel.writeInt(this.f40131B ? 1 : 0);
        boolean z3 = this.f40132C;
        A8.b.F(parcel, 11, 4);
        parcel.writeInt(z3 ? 1 : 0);
        A8.b.F(parcel, 12, 4);
        parcel.writeInt(this.f40133D ? 1 : 0);
        A8.b.F(parcel, 13, 4);
        parcel.writeInt(this.f40134E ? 1 : 0);
        A8.b.F(parcel, 14, 4);
        parcel.writeInt(this.f40135F ? 1 : 0);
        A8.b.F(parcel, 15, 4);
        parcel.writeInt(this.f40136G ? 1 : 0);
        A8.b.F(parcel, 16, 4);
        parcel.writeInt(this.f40137H ? 1 : 0);
        A8.b.F(parcel, 17, 4);
        parcel.writeInt(this.f40138I ? 1 : 0);
        A8.b.I(parcel, G7);
    }

    public f1(String str, int i, int i6, boolean z3, int i9, int i10, f1[] f1VarArr, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f40139n = str;
        this.f40140u = i;
        this.f40141v = i6;
        this.f40142w = z3;
        this.f40143x = i9;
        this.f40144y = i10;
        this.f40145z = f1VarArr;
        this.f40130A = z6;
        this.f40131B = z9;
        this.f40132C = z10;
        this.f40133D = z11;
        this.f40134E = z12;
        this.f40135F = z13;
        this.f40136G = z14;
        this.f40137H = z15;
        this.f40138I = z16;
    }

    public f1() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public f1(Context context, k2.h hVar) {
        this(context, new k2.h[]{hVar});
    }
}
