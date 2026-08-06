package Z0;

import F.C0038n;
import a1.C0100p;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f1954a;

    /* renamed from: b, reason: collision with root package name */
    public int f1955b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1956c;

    /* renamed from: d, reason: collision with root package name */
    public final C0038n f1957d;

    public c(R0.b bVar) {
        C0038n c0038n = new C0038n(bVar, "flutter/lifecycle", C0100p.f2038b, null);
        this.f1954a = 0;
        this.f1955b = 0;
        this.f1956c = true;
        this.f1957d = c0038n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z2) {
        int i3;
        String str;
        int i4 = this.f1954a;
        if (i4 == i2 && z2 == this.f1956c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f1956c = z2;
            return;
        }
        int b2 = H.j.b(i2);
        if (b2 != 0) {
            if (b2 == 1) {
                i3 = z2 ? 2 : 3;
            } else if (b2 != 2 && b2 != 3 && b2 != 4) {
                i3 = 0;
            }
            this.f1954a = i2;
            this.f1956c = z2;
            if (i3 != this.f1955b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i3 == 1) {
                str = "DETACHED";
            } else if (i3 == 2) {
                str = "RESUMED";
            } else if (i3 == 3) {
                str = "INACTIVE";
            } else if (i3 == 4) {
                str = "HIDDEN";
            } else {
                if (i3 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            this.f1957d.g(sb.toString(), null);
            this.f1955b = i3;
            return;
        }
        i3 = i2;
        this.f1954a = i2;
        this.f1956c = z2;
        if (i3 != this.f1955b) {
        }
    }
}
