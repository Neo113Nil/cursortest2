package ru.yandex.taxi.favorites.address.impl.ui;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import defpackage.g92;
import defpackage.jep;
import defpackage.kep;
import defpackage.lep;
import defpackage.mep;
import defpackage.mvg;
import defpackage.ndl0;
import defpackage.ndp;
import defpackage.nep;
import defpackage.ny61;
import defpackage.oep;
import defpackage.ogp;
import defpackage.pep;
import defpackage.pvn;
import defpackage.qep;
import defpackage.rep;
import defpackage.sep;
import defpackage.tep;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uep;
import defpackage.w511;
import defpackage.wls;
import defpackage.x770;
import defpackage.xj50;
import defpackage.y0m0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.address.impl.ui.FavoriteAddressUiStateInteractor$handleAction$1", f = "FavoriteAddressUiStateInteractor.kt", l = {58, 61, 62, 69}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteAddressUiStateInteractor$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ tep $action;
    final /* synthetic */ ndp $navigator;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteAddressUiStateInteractor$handleAction$1(tep tepVar, b bVar, ndp ndpVar, Continuation continuation) {
        super(2, continuation);
        this.$action = tepVar;
        this.this$0 = bVar;
        this.$navigator = ndpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoriteAddressUiStateInteractor$handleAction$1(this.$action, this.this$0, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteAddressUiStateInteractor$handleAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0202, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r2, r4, r23) == r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r2 == r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        if (r2 == r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        if (r2 == r1) goto L104;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g92 g92Var;
        tpr c;
        Object a;
        String str;
        Object a2;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tep tepVar = this.$action;
            if (tepVar instanceof sep) {
                this.label = 1;
                b = b.b(this.this$0, (sep) tepVar, this);
            } else {
                boolean z = tepVar instanceof lep;
                pvn pvnVar = pvn.a;
                if (z) {
                    uep c2 = this.this$0.c();
                    if (c2 != null) {
                        g92Var = new g92(2, uep.a(c2, ((lep) tepVar).a, null, null, null, false, null, null, 509));
                        c = g92Var;
                    }
                    c = pvnVar;
                } else if (tepVar instanceof mep) {
                    b bVar = this.this$0;
                    ogp ogpVar = bVar.b;
                    uep c3 = bVar.c();
                    String str2 = ((mep) this.$action).a;
                    ogpVar.getClass();
                    if (c3 != null) {
                        if (str2.length() > 40) {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = c3.c;
                        }
                        String str3 = str2;
                        g92Var = new g92(2, uep.a(c3, null, str3, null, ogpVar.a.a(str3, c3.f), false, null, null, 475));
                        c = g92Var;
                    }
                    c = pvnVar;
                } else {
                    if (tepVar instanceof pep) {
                        b bVar2 = this.this$0;
                        PlaceType placeType = ((pep) tepVar).a;
                        this.label = 2;
                        ndl0 ndl0Var = bVar2.g;
                        uep c4 = bVar2.c();
                        String str4 = c4 != null ? c4.c : null;
                        String str5 = str4 != null ? str4 : "";
                        String str6 = bVar2.j;
                        x770 x770Var = (x770) ndl0Var.b;
                        int i2 = y0m0.a[placeType.ordinal()];
                        if (i2 == 1) {
                            str = "home";
                        } else if (i2 == 2) {
                            str = "work";
                        } else {
                            if (i2 != 3) {
                                w511.b();
                                return null;
                            }
                            str = "new";
                        }
                        x770Var.b(str5, str, str6);
                        a2 = bVar2.e.a(bVar2.c(), placeType, this);
                    } else if (tepVar instanceof jep) {
                        b bVar3 = this.this$0;
                        ru.yandex.taxi.favorites.address.impl.domain.a aVar = bVar3.d;
                        uep c5 = bVar3.c();
                        FavoriteAddress favoriteAddress = ((jep) this.$action).a;
                        this.label = 3;
                        a = aVar.a(c5, favoriteAddress, this);
                    } else if (tepVar instanceof qep) {
                        b bVar4 = this.this$0;
                        ndp ndpVar = this.$navigator;
                        ndl0 ndl0Var2 = bVar4.g;
                        uep c6 = bVar4.c();
                        String str7 = c6 != null ? c6.c : null;
                        ((x770) ndl0Var2.b).b(str7 != null ? str7 : "", "save", bVar4.j);
                        c = bVar4.c.b(bVar4.c(), ndpVar);
                    } else if (tepVar instanceof oep) {
                        uep c7 = this.this$0.c();
                        if (c7 != null) {
                            g92Var = new g92(2, uep.a(c7, null, null, null, null, false, null, null, 255));
                            c = g92Var;
                        }
                        c = pvnVar;
                    } else if (tepVar instanceof nep) {
                        b bVar5 = this.this$0;
                        int i3 = ((nep) tepVar).a;
                        uep c8 = bVar5.c();
                        if (c8 != null) {
                            xj50 xj50Var = c8.i;
                            g92Var = new g92(2, uep.a(c8, null, null, null, null, false, null, xj50Var != null ? new xj50(xj50Var.a, xj50Var.b, i3, xj50Var.d, xj50Var.e) : null, 255));
                            c = g92Var;
                        }
                        c = pvnVar;
                    } else if (tepVar instanceof rep) {
                        b bVar6 = this.this$0;
                        c = bVar6.f.c(bVar6.c(), this.$navigator);
                    } else {
                        if (!(tepVar instanceof kep)) {
                            w511.b();
                            return null;
                        }
                        b bVar7 = this.this$0;
                        ndp ndpVar2 = this.$navigator;
                        uep c9 = bVar7.c();
                        if (c9 != null) {
                            ((ru.yandex.taxi.favorites.address.impl.a) ndpVar2).a();
                            g92Var = new g92(2, c9);
                            c = g92Var;
                        }
                        c = pvnVar;
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            b = obj;
            c = (tpr) b;
        } else if (i == 2) {
            kotlin.b.b(obj);
            a2 = obj;
            c = (tpr) a2;
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = obj;
            c = (tpr) a;
        }
        r0 r0Var = this.this$0.h;
        this.L$0 = null;
        this.label = 4;
    }
}
