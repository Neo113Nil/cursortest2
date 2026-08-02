package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tb5 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final alp a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final sde h;
    public final boolean i;

    static {
        int i = dvt.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
        q = Integer.toString(7, 36);
        r = Integer.toString(8, 36);
    }

    public tb5(alp alpVar, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, sde sdeVar) {
        this.a = alpVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.i = z;
        this.h = sdeVar;
    }

    public static boolean a(List list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((tb5) list.get(i2)).h.a(0) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r19.a(r4) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qsn c(List list, blp blpVar, d8l d8lVar) {
        tde tdeVar = new tde(4);
        for (int i = 0; i < list.size(); i++) {
            tb5 tb5Var = (tb5) list.get(i);
            alp alpVar = tb5Var.a;
            if (alpVar != null) {
                if (blpVar.a.contains(alpVar)) {
                    tdeVar.a(tb5Var);
                }
            }
            int i2 = tb5Var.b;
            if (i2 == -1) {
            }
            if (tb5Var.i) {
                tb5Var = new tb5(tb5Var.a, tb5Var.b, tb5Var.c, tb5Var.d, tb5Var.e, tb5Var.f, new Bundle(tb5Var.g), false, tb5Var.h);
            }
            tdeVar.a(tb5Var);
        }
        return tdeVar.f();
    }

    public static tb5 d(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(j);
        alp a = bundle2 == null ? null : alp.a(bundle2);
        int i2 = bundle.getInt(k, -1);
        int i3 = bundle.getInt(l, 0);
        CharSequence charSequence = bundle.getCharSequence(m, "");
        Bundle bundle3 = bundle.getBundle(n);
        boolean z = i < 3 || bundle.getBoolean(o, true);
        Uri uri = (Uri) bundle.getParcelable(p);
        int i4 = bundle.getInt(q, 0);
        int[] intArray = bundle.getIntArray(r);
        sb5 sb5Var = new sb5(i4, i3);
        if (a != null) {
            sb5Var.c(a);
        }
        if (i2 != -1) {
            sb5Var.b(i2);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            vq1.u("Only content or resource Uris are supported for CommandButton", Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"));
            sb5Var.e = uri;
        }
        sb5Var.f = charSequence;
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        sb5Var.g = new Bundle(bundle3);
        sb5Var.h = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        vq1.v(intArray.length != 0);
        sde sdeVar = sde.c;
        sb5Var.i = intArray.length == 0 ? sde.c : new sde(Arrays.copyOf(intArray, intArray.length));
        return sb5Var.a();
    }

    public static qsn e(List list, boolean z, boolean z2) {
        alp alpVar;
        alp alpVar2;
        int a;
        if (list.isEmpty()) {
            ude udeVar = yde.b;
            return qsn.e;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            tb5 tb5Var = (tb5) list.get(i3);
            boolean z3 = tb5Var.i;
            sde sdeVar = tb5Var.h;
            if (z3 && (alpVar2 = tb5Var.a) != null && alpVar2.a == 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < sdeVar.b && (a = sdeVar.a(i4)) != 6) {
                        if (z && i == -1 && a == 2) {
                            i = i3;
                            break;
                        }
                        if (z2 && i2 == -1 && a == 3) {
                            i2 = i3;
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        tde u = yde.u();
        if (i != -1) {
            u.a(((tb5) list.get(i)).b(sde.b(2)));
        }
        if (i2 != -1) {
            u.a(((tb5) list.get(i2)).b(sde.b(3)));
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            tb5 tb5Var2 = (tb5) list.get(i5);
            if (tb5Var2.i && (alpVar = tb5Var2.a) != null && alpVar.a == 0 && i5 != i && i5 != i2) {
                sde sdeVar2 = tb5Var2.h;
                sdeVar2.getClass();
                int i6 = 0;
                while (true) {
                    if (i6 >= sdeVar2.b) {
                        i6 = -1;
                        break;
                    }
                    if (sdeVar2.a[i6] == 6) {
                        break;
                    }
                    i6++;
                }
                if (i6 >= 0) {
                    u.a(tb5Var2.b(sde.b(6)));
                }
            }
        }
        return u.f();
    }

    public static qsn f(List list, d8l d8lVar, Bundle bundle) {
        if (list.isEmpty()) {
            ude udeVar = yde.b;
            return qsn.e;
        }
        boolean a = d8lVar.a.a(7, 6);
        boolean a2 = d8lVar.a.a(9, 8);
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i = (a || z) ? -1 : 0;
        int i2 = (a2 || z2) ? -1 : i == 0 ? 1 : 0;
        tde u = yde.u();
        for (int i3 = 0; i3 < list.size(); i3++) {
            tb5 tb5Var = (tb5) list.get(i3);
            if (i3 == i) {
                if (i2 == -1) {
                    u.a(tb5Var.b(new sde(new int[]{2, 6})));
                } else {
                    u.a(tb5Var.b(new sde(new int[]{2, 3, 6})));
                }
            } else if (i3 == i2) {
                u.a(tb5Var.b(new sde(new int[]{3, 6})));
            } else {
                u.a(tb5Var.b(sde.b(6)));
            }
        }
        return u.f();
    }

    public final tb5 b(sde sdeVar) {
        if (this.h.equals(sdeVar)) {
            return this;
        }
        return new tb5(this.a, this.b, this.c, this.d, this.e, this.f, new Bundle(this.g), this.i, sdeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb5)) {
            return false;
        }
        tb5 tb5Var = (tb5) obj;
        return Objects.equals(this.a, tb5Var.a) && this.b == tb5Var.b && this.c == tb5Var.c && this.d == tb5Var.d && Objects.equals(this.e, tb5Var.e) && TextUtils.equals(this.f, tb5Var.f) && this.i == tb5Var.i && this.h.equals(tb5Var.h);
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        alp alpVar = this.a;
        if (alpVar != null) {
            bundle.putBundle(j, alpVar.b());
        }
        int i = this.b;
        if (i != -1) {
            bundle.putInt(k, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(q, i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt(l, i3);
        }
        CharSequence charSequence = this.f;
        if (charSequence != "") {
            bundle.putCharSequence(m, charSequence);
        }
        Bundle bundle2 = this.g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(n, bundle2);
        }
        Uri uri = this.e;
        if (uri != null) {
            bundle.putParcelable(p, uri);
        }
        boolean z = this.i;
        if (!z) {
            bundle.putBoolean(o, z);
        }
        sde sdeVar = this.h;
        if (sdeVar.b == 1 && sdeVar.a(0) == 6) {
            return bundle;
        }
        bundle.putIntArray(r, Arrays.copyOfRange(sdeVar.a, 0, sdeVar.b));
        return bundle;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.i), this.e, this.h);
    }
}
