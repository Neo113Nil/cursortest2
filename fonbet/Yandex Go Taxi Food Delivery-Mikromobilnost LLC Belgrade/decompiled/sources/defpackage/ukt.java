package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ukt extends a implements om2, wz81 {
    public final y2c W;
    public final Set Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ukt(Context context, Looper looper, int i, y2c y2cVar, t4e t4eVar, yx60 yx60Var) {
        super(context, looper, r3, r4, i, new dxf0(t4eVar), new va90(yx60Var), y2cVar.e);
        b a = vkt.a(context);
        com.google.android.gms.common.a aVar = com.google.android.gms.common.a.d;
        cvw.l(t4eVar);
        cvw.l(yx60Var);
        this.W = y2cVar;
        Set set = y2cVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                ny61.r("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.Z = set;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Account e() {
        return null;
    }

    @Override // defpackage.om2
    public final Set getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.Z : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Set h() {
        return this.Z;
    }
}
