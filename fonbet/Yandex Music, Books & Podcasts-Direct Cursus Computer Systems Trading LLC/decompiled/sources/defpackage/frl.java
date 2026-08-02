package defpackage;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class frl extends aur implements Function2 {
    public final /* synthetic */ int j;
    public grl k;
    public j1g l;
    public int m;
    public final /* synthetic */ grl n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ frl(int i, grl grlVar, Continuation continuation) {
        super(2, continuation);
        this.j = i;
        this.n = grlVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new frl(0, this.n, continuation);
            default:
                return new frl(1, this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((frl) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023f  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j1g j1gVar;
        e0g e0gVar;
        Object emit;
        j1g j1gVar2;
        boolean z;
        Object emit2;
        j1g j1gVar3;
        j1g j1gVar4;
        int i = this.j;
        grl grlVar = this.n;
        e0g e0gVar2 = null;
        j1g j1gVar5 = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.m;
                if (i2 == 0) {
                    qgg.h0(obj);
                    dn9 dn9Var = grlVar.q;
                    t3g t3gVar = (t3g) dn9Var.b;
                    igl iglVar = (igl) ((xdr) dn9Var.d).getValue();
                    if (iglVar != null) {
                        mwk mwkVar = iglVar.a;
                        int ordinal = iglVar.b.ordinal();
                        if (ordinal == 0) {
                            t3gVar.a(mwkVar);
                            dn9Var.r(mwkVar, fx.b);
                            j1gVar = j1g.c;
                        } else if (ordinal == 1) {
                            t3gVar.a(mwkVar);
                            dn9Var.r(mwkVar, fx.b);
                            j1gVar = j1g.c;
                        } else if (ordinal != 2) {
                            b6e.s();
                            break;
                        } else {
                            t3gVar.z(mwkVar);
                            j1gVar = j1g.b;
                        }
                        xdr xdrVar = (xdr) dn9Var.e;
                        k1g k1gVar = new k1g(j1gVar, System.currentTimeMillis());
                        xdrVar.getClass();
                        xdrVar.m(null, k1gVar);
                    } else {
                        j1gVar = null;
                    }
                    if (j1gVar != null) {
                        n7q J = grlVar.J();
                        if (J != null) {
                            yks yksVar = grlVar.u;
                            hve hveVar = (hve) grlVar.E.a.getValue();
                            Object[] objArr = j1gVar == j1g.c;
                            this.k = grlVar;
                            this.l = j1gVar;
                            this.m = 1;
                            Resources resources = (Resources) yksVar.b;
                            resources.getClass();
                            hveVar.getClass();
                            es6 es6Var = new es6();
                            String string = resources.getString(objArr != false ? R.string.track_added_to_dislikes : R.string.track_was_removed_from_dislikes);
                            string.getClass();
                            es6Var.a = new e0g(string, true);
                            if (hveVar instanceof fve) {
                                String[] stringArray = resources.getStringArray(R.array.track_generative_disliked);
                                stringArray.getClass();
                                Object O = xz0.O(stringArray, phn.a);
                                O.getClass();
                                e0gVar2 = new e0g((String) O, false);
                            }
                            es6Var.b = e0gVar2;
                            if (objArr == true) {
                                String[] stringArray2 = resources.getStringArray(R.array.rup_onboarding_toast_dislike);
                                stringArray2.getClass();
                                Object O2 = xz0.O(stringArray2, phn.a);
                                O2.getClass();
                                e0gVar = new e0g((String) O2, false);
                            } else {
                                String string2 = resources.getString(R.string.track_was_removed_from_dislikes);
                                string2.getClass();
                                e0gVar = new e0g(string2, true);
                            }
                            es6Var.c = e0gVar;
                            e0g e0gVar3 = (e0g) wdg.A(J, es6Var);
                            if (e0gVar3 == null) {
                                emit = Unit.a;
                            } else {
                                if (e0gVar3.b) {
                                    if (!((atn) yksVar.c).T(objArr != false ? "ADDED_TO_DISLIKES_MESSAGE" : "REMOVED_FROM_DISLIKES_MESSAGE")) {
                                        emit = Unit.a;
                                    }
                                }
                                emit = ((x0q) yksVar.d).emit(e0gVar3.a, this);
                                if (emit != nm6Var) {
                                    emit = Unit.a;
                                }
                            }
                            if (emit == nm6Var) {
                                break;
                            } else {
                                j1gVar2 = j1gVar;
                            }
                        }
                        nwh nwhVar = grlVar.C;
                        z = j1gVar == j1g.c;
                        nwhVar.getClass();
                        nwhVar.c(!z ? olb.Ban : olb.Unban);
                    }
                    break;
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    j1gVar2 = this.l;
                    grlVar = this.k;
                    qgg.h0(obj);
                }
                j1gVar = j1gVar2;
                nwh nwhVar2 = grlVar.C;
                if (j1gVar == j1g.c) {
                }
                nwhVar2.getClass();
                nwhVar2.c(!z ? olb.Ban : olb.Unban);
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.m;
                if (i3 == 0) {
                    qgg.h0(obj);
                    dn9 dn9Var2 = grlVar.q;
                    t3g t3gVar2 = (t3g) dn9Var2.b;
                    igl iglVar2 = (igl) ((xdr) dn9Var2.d).getValue();
                    if (iglVar2 != null) {
                        mwk mwkVar2 = iglVar2.a;
                        int ordinal2 = iglVar2.b.ordinal();
                        if (ordinal2 == 0) {
                            t3gVar2.z(mwkVar2);
                            j1gVar4 = j1g.b;
                        } else if (ordinal2 == 1) {
                            t3gVar2.s(mwkVar2);
                            dn9Var2.r(mwkVar2, fx.a);
                            j1gVar4 = j1g.a;
                        } else if (ordinal2 != 2) {
                            b6e.s();
                            break;
                        } else {
                            t3gVar2.s(mwkVar2);
                            dn9Var2.r(mwkVar2, fx.a);
                            j1gVar4 = j1g.a;
                        }
                        xdr xdrVar2 = (xdr) dn9Var2.e;
                        k1g k1gVar2 = new k1g(j1gVar4, System.currentTimeMillis());
                        xdrVar2.getClass();
                        xdrVar2.m(null, k1gVar2);
                        j1gVar5 = j1gVar4;
                    }
                    if (j1gVar5 != null) {
                        n7q J2 = grlVar.J();
                        if (J2 != null) {
                            yks yksVar2 = grlVar.u;
                            hve hveVar2 = (hve) grlVar.E.a.getValue();
                            boolean z2 = j1gVar5 == j1g.a;
                            this.k = grlVar;
                            this.l = j1gVar5;
                            this.m = 1;
                            e0g e0gVar4 = (e0g) wdg.A(J2, new r0o((Resources) yksVar2.b, hveVar2, z2));
                            if (e0gVar4 == null) {
                                emit2 = Unit.a;
                            } else {
                                if (e0gVar4.b) {
                                    if (!((atn) yksVar2.c).T(z2 ? "ADDED_TO_FAVOURITES_MESSAGE" : "REMOVED_FROM_FAVOURITES_MESSAGE")) {
                                        emit2 = Unit.a;
                                    }
                                }
                                emit2 = ((x0q) yksVar2.d).emit(e0gVar4.a, this);
                                if (emit2 != nm6Var2) {
                                    emit2 = Unit.a;
                                }
                            }
                            if (emit2 == nm6Var2) {
                                break;
                            } else {
                                j1gVar3 = j1gVar5;
                            }
                        }
                        nwh nwhVar3 = grlVar.C;
                        z = j1gVar5 == j1g.a;
                        nwhVar3.getClass();
                        nwhVar3.c(!z ? olb.Like : olb.Unlike);
                    }
                    break;
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    j1gVar3 = this.l;
                    grlVar = this.k;
                    qgg.h0(obj);
                }
                j1gVar5 = j1gVar3;
                nwh nwhVar32 = grlVar.C;
                if (j1gVar5 == j1g.a) {
                }
                nwhVar32.getClass();
                nwhVar32.c(!z ? olb.Like : olb.Unlike);
        }
        return Unit.a;
    }
}
