package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class hzw extends a {
    public final GoogleSignInOptions E;

    public hzw(Context context, Looper looper, rn5 rn5Var, GoogleSignInOptions googleSignInOptions, rmd rmdVar, smd smdVar) {
        super(context, looper, 91, rn5Var, rmdVar, smdVar, 0);
        Set<Scope> set = (Set) rn5Var.c;
        tnd tndVar = googleSignInOptions != null ? new tnd(googleSignInOptions) : new tnd();
        tndVar.i = bzw.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = tndVar.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.p;
        HashSet hashSet2 = tndVar.a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.o;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (tndVar.d && (tndVar.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.n);
        }
        this.E = new GoogleSignInOptions(3, new ArrayList(hashSet2), tndVar.f, tndVar.d, tndVar.b, tndVar.c, tndVar.e, tndVar.g, tndVar.h, tndVar.i);
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final Intent n() {
        return nzw.a(this.h, this.E);
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof qzw ? (qzw) queryLocalInterface : new qzw(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
