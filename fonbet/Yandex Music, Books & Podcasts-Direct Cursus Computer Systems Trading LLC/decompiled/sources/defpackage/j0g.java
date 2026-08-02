package defpackage;

import android.content.SharedPreferences;
import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class j0g extends aur implements Function2 {
    public boolean j;
    public int k;
    public int l;
    public final /* synthetic */ l0g m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0g(l0g l0gVar, Continuation continuation) {
        super(2, continuation);
        this.m = l0gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new j0g(this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0g) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r11 == r2) goto L31;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        l0g l0gVar = this.m;
        pst pstVar = l0gVar.a;
        nm6 nm6Var = nm6.a;
        int i2 = this.l;
        if (i2 != 0) {
            if (i2 == 1) {
                qgg.h0(obj);
                return obj;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    qgg.h0(obj);
                    return (h0g) obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.k;
            z = this.j;
            qgg.h0(obj);
            SharedPreferences.Editor edit = pstVar.edit();
            edit.getClass();
            edit.putBoolean("legacy_migrated", true);
            edit.apply();
            return new h0g(i, z);
        }
        qgg.h0(obj);
        if (pstVar.a.getBoolean("legacy_migrated", false)) {
            this.l = 1;
            Object a = l0g.a(l0gVar, this);
            if (a != nm6Var) {
                return a;
            }
        } else if (pstVar.a.contains("like_dialog_showed") || pstVar.a.contains("user_has_some_like")) {
            final boolean z2 = pstVar.a.getBoolean("like_dialog_showed", false);
            final int i3 = pstVar.a.getInt("user_has_some_like", 0);
            wb7 wb7Var = (wb7) l0gVar.d.getValue();
            Function1 function1 = new Function1() { // from class: i0g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    lpi lpiVar = (lpi) obj2;
                    ec7.d(lpiVar, "bottom_sheet_showed", z2);
                    lpiVar.h(new hmm.a("like_count"), Integer.valueOf(i3));
                    return Unit.a;
                }
            };
            this.j = z2;
            this.k = i3;
            this.l = 2;
            if (ec7.c(wb7Var, function1, this) != nm6Var) {
                z = z2;
                i = i3;
                SharedPreferences.Editor edit2 = pstVar.edit();
                edit2.getClass();
                edit2.putBoolean("legacy_migrated", true);
                edit2.apply();
                return new h0g(i, z);
            }
        } else {
            SharedPreferences.Editor edit3 = pstVar.edit();
            edit3.getClass();
            edit3.putBoolean("legacy_migrated", true);
            edit3.apply();
            this.l = 3;
            obj = l0g.a(l0gVar, this);
        }
        return nm6Var;
    }
}
