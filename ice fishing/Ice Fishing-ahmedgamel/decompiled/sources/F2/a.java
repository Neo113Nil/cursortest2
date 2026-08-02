package F2;

import D2.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C3010bi;
import com.google.android.gms.internal.ads.C3266gN;
import com.google.android.gms.internal.ads.InterfaceC3320hN;
import s2.C4945n;
import x2.C5189a;

/* loaded from: classes.dex */
public final class a implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final C3010bi f971a;

    /* renamed from: b, reason: collision with root package name */
    public final C3010bi f972b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f973c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f974d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f975e;

    public a(C3010bi c3010bi, C3010bi c3010bi2, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3) {
        this.f971a = c3010bi;
        this.f972b = c3010bi2;
        this.f973c = c3266gN;
        this.f974d = c3266gN2;
        this.f975e = c3266gN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4945n f() {
        return new C4945n((Context) this.f971a.f(), (C5189a) this.f972b.f(), (PackageInfo) this.f973c.f(), (String) this.f974d.f(), (d) this.f975e.f());
    }
}
