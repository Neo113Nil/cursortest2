package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rlw {
    public final Context a;
    public final oq7 b;
    public final zzp c;
    public final maw d;
    public final jyr f;
    public final jyr g;
    public final rjq e = hyf.b();
    public final xdr h = ydr.a(njs.c);

    public rlw(Context context, oq7 oq7Var, zzp zzpVar, maw mawVar) {
        this.a = context;
        this.b = oq7Var;
        this.c = zzpVar;
        this.d = mawVar;
        final int i = 0;
        this.f = btf.b(new Function0(this) { // from class: nlw
            public final /* synthetic */ rlw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return hld.s(this.b.e, dm6.b.I0(1));
                    default:
                        return this.b.a.getSharedPreferences("QueueLocalStoreTimestamp", 0);
                }
            }
        });
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: nlw
            public final /* synthetic */ rlw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return hld.s(this.b.e, dm6.b.I0(1));
                    default:
                        return this.b.a.getSharedPreferences("QueueLocalStoreTimestamp", 0);
                }
            }
        });
    }

    public static void a(rlw rlwVar, njs njsVar, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        boolean z = (i & 4) == 0;
        xdr xdrVar = rlwVar.h;
        if (z) {
            if (Intrinsics.d(xdrVar.getValue(), njs.c)) {
                xdrVar.m(null, njsVar);
                return;
            }
            return;
        }
        xdrVar.getClass();
        xdrVar.m(null, njsVar);
        SharedPreferences sharedPreferences = (SharedPreferences) rlwVar.g.getValue();
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("timestamp_local", njsVar.a);
        if (str != null) {
            edit.putString("entity_id", str);
        }
        edit.apply();
    }
}
