package D2;

import B2.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C2987bi;
import com.google.android.gms.internal.ads.C3243gN;
import com.google.android.gms.internal.ads.InterfaceC3297hN;
import q2.C4896n;
import v2.C5110a;

/* loaded from: classes.dex */
public final class a implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final C2987bi f627a;

    /* renamed from: b, reason: collision with root package name */
    public final C2987bi f628b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f629c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f630d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f631e;

    public a(C2987bi c2987bi, C2987bi c2987bi2, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3) {
        this.f627a = c2987bi;
        this.f628b = c2987bi2;
        this.f629c = c3243gN;
        this.f630d = c3243gN2;
        this.f631e = c3243gN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4896n f() {
        return new C4896n((Context) this.f627a.f(), (C5110a) this.f628b.f(), (PackageInfo) this.f629c.f(), (String) this.f630d.f(), (d) this.f631e.f());
    }
}
