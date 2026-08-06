package C0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import n0.InterfaceC0989c;
import n0.g;
import n0.h;

/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a implements InterfaceC0989c {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f133C = 0;

    /* renamed from: A, reason: collision with root package name */
    public final Bundle f134A;

    /* renamed from: B, reason: collision with root package name */
    public final Integer f135B;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f136y;

    /* renamed from: z, reason: collision with root package name */
    public final Q0.c f137z;

    public a(Context context, Looper looper, Q0.c cVar, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, cVar, gVar, hVar);
        this.f136y = true;
        this.f137z = cVar;
        this.f134A = bundle;
        this.f135B = (Integer) cVar.f1523f;
    }

    @Override // com.google.android.gms.common.internal.a, n0.InterfaceC0989c
    public final boolean j() {
        return this.f136y;
    }

    @Override // n0.InterfaceC0989c
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        Q0.c cVar = this.f137z;
        boolean equals = this.f2687c.getPackageName().equals((String) cVar.f1520c);
        Bundle bundle = this.f134A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) cVar.f1520c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
