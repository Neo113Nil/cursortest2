package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.k5;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.PlusPayPaymentLoadingView;
import defpackage.gld;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class b0 extends com.yandex.plus.bdui.plus.content.controller.a {
    public final /* synthetic */ int b = 1;
    public final com.yandex.plus.log.api.b c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.yandex.plus.bdui.m mVar, com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.log.api.b bVar2) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.d = bVar;
        this.c = bVar2;
    }

    public static String d(String str, com.yandex.plus.bdui.action.a aVar, Map map) {
        return "onUpdateStateAsync(); dispatch " + str + " action = " + aVar + " with payload = " + map;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        int i = this.b;
        view.getClass();
        switch (i) {
            case 0:
                break;
            default:
                this.d = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        int i = this.b;
        int i2 = 2;
        viewGroup.getClass();
        switch (i) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_progress_view, viewGroup, false);
                inflate.getClass();
                com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
                com.yandex.plus.core.insets.j jVar = com.yandex.plus.core.insets.j.c;
                com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
                aVar.b = new LinkedHashSet(2);
                aVar.d();
                aVar.c();
                dVar.b.put(jVar, aVar);
                dVar.b(inflate);
                return inflate;
            default:
                Context context = viewGroup.getContext();
                context.getClass();
                PlusPayPaymentLoadingView plusPayPaymentLoadingView = new PlusPayPaymentLoadingView(context, null, i2, 0 == true ? 1 : 0);
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b bVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b(plusPayPaymentLoadingView);
                this.d = bVar;
                com.yandex.plus.core.insets.d dVar2 = new com.yandex.plus.core.insets.d(0);
                g gVar = new g(1, bVar);
                com.yandex.plus.core.insets.a aVar2 = new com.yandex.plus.core.insets.a();
                aVar2.b = new LinkedHashSet(2);
                aVar2.d();
                aVar2.c();
                dVar2.b.put(gVar, aVar2);
                dVar2.b(plusPayPaymentLoadingView);
                return plusPayPaymentLoadingView;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:17|(2:19|(9:21|22|(1:(4:25|26|27|28)(2:61|62))(2:63|(9:65|(1:67)|68|69|70|71|72|73|(1:76)(1:75))(3:89|40|41))|29|30|31|(5:33|(1:35)|36|(1:38)|39)|40|41))|90|22|(0)(0)|29|30|31|(0)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0139, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        a0 a0Var;
        int i;
        b0 b0Var;
        Throwable th;
        wis wisVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        int i2 = this.b;
        com.yandex.plus.log.api.b bVar = this.c;
        switch (i2) {
            case 0:
                if (continuation instanceof a0) {
                    a0Var = (a0) continuation;
                    int i3 = a0Var.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a0Var.m = i3 - Integer.MIN_VALUE;
                        Object obj2 = a0Var.k;
                        nm6 nm6Var = nm6.a;
                        i = a0Var.m;
                        Continuation continuation2 = null;
                        if (i != 0) {
                            qgg.h0(obj2);
                            boolean z = dVar.d;
                            com.yandex.plus.bdui.content.a aVar = dVar.b;
                            if (z) {
                                return Unit.a;
                            }
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                            if (bVar.b(aVar2)) {
                                bVar.c(aVar2, "PlusPayGetInAppInfoContentController", "onUpdateStateAsync(); get in-app info for productIds = " + ((com.yandex.plus.bdui.plus.checkout.content.k) aVar).a);
                            }
                            List list = ((com.yandex.plus.bdui.plus.checkout.content.k) aVar).a;
                            try {
                                r7o r7oVar = z7o.b;
                                b0Var = this;
                                try {
                                    try {
                                        com.yandex.passport.sloth.ui.p pVar = new com.yandex.passport.sloth.ui.p(b0Var, dVar, list, continuation2, 2);
                                        a0Var.j = dVar;
                                        a0Var.m = 1;
                                        if (gld.Q(pVar, a0Var) == nm6Var) {
                                            return nm6Var;
                                        }
                                        dVar = dVar;
                                    } catch (CancellationException e) {
                                        e = e;
                                        throw e;
                                    }
                                } catch (wis e2) {
                                    wisVar = e2;
                                    dVar = dVar;
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar = new t7o(wisVar);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a != null) {
                                    }
                                    return Unit.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    dVar = dVar;
                                    r7o r7oVar3 = z7o.b;
                                    t7oVar = new t7o(th);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a != null) {
                                    }
                                    return Unit.a;
                                }
                            } catch (wis e3) {
                                e = e3;
                                b0Var = this;
                                wisVar = e;
                                r7o r7oVar22 = z7o.b;
                                t7oVar = new t7o(wisVar);
                                obj = t7oVar;
                                a = z7o.a(obj);
                                if (a != null) {
                                }
                                return Unit.a;
                            } catch (CancellationException e4) {
                                e = e4;
                                throw e;
                            } catch (Throwable th3) {
                                th = th3;
                                b0Var = this;
                                th = th;
                                r7o r7oVar32 = z7o.b;
                                t7oVar = new t7o(th);
                                obj = t7oVar;
                                a = z7o.a(obj);
                                if (a != null) {
                                }
                                return Unit.a;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            dVar = a0Var.j;
                            try {
                                qgg.h0(obj2);
                                b0Var = this;
                            } catch (wis e5) {
                                wisVar = e5;
                                b0Var = this;
                                r7o r7oVar222 = z7o.b;
                                t7oVar = new t7o(wisVar);
                                obj = t7oVar;
                                a = z7o.a(obj);
                                if (a != null) {
                                }
                                return Unit.a;
                            } catch (CancellationException e6) {
                                throw e6;
                            } catch (Throwable th4) {
                                th = th4;
                                b0Var = this;
                                r7o r7oVar322 = z7o.b;
                                t7oVar = new t7o(th);
                                obj = t7oVar;
                                a = z7o.a(obj);
                                if (a != null) {
                                }
                                return Unit.a;
                            }
                        }
                        obj = Unit.a;
                        r7o r7oVar4 = z7o.b;
                        a = z7o.a(obj);
                        if (a != null) {
                            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                            if (bVar.b(aVar3)) {
                                bVar.a(aVar3, "PlusPayGetInAppInfoContentController", "onUpdateStateAsync(); get in-app info failed", a);
                            }
                            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                            if (bVar.b(aVar4)) {
                                bVar.c(aVar4, "PlusPayGetInAppInfoContentController", d("failure", ((com.yandex.plus.bdui.plus.checkout.content.k) dVar.b).c, null));
                            }
                            b0Var.a.a.a(((com.yandex.plus.bdui.plus.checkout.content.k) dVar.b).c, new com.yandex.plus.bdui.action.h(dVar.c), null);
                        }
                        return Unit.a;
                    }
                }
                a0Var = new a0(this, continuation);
                Object obj22 = a0Var.k;
                nm6 nm6Var2 = nm6.a;
                i = a0Var.m;
                Continuation continuation22 = null;
                if (i != 0) {
                }
                obj = Unit.a;
                r7o r7oVar42 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                }
                return Unit.a;
            default:
                boolean z2 = dVar.d;
                com.yandex.plus.bdui.content.a aVar5 = dVar.b;
                if (!z2) {
                    com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b bVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b) this.d;
                    if (bVar2 != null) {
                        k5 k5Var = (k5) ((com.yandex.plus.bdui.plus.checkout.content.l) aVar5);
                        com.yandex.plus.core.templating.template.j jVar = k5Var.b;
                        s9f[] s9fVarArr = k5.h;
                        String str = (String) jVar.d(s9fVarArr[0]);
                        String str2 = (String) k5Var.c.d(s9fVarArr[1]);
                        String str3 = (String) k5Var.d.d(s9fVarArr[2]);
                        String str4 = (String) k5Var.e.d(s9fVarArr[3]);
                        String str5 = (String) k5Var.f.d(s9fVarArr[4]);
                        str.getClass();
                        com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar6)) {
                            bVar.c(aVar6, "PlusPayPollingContentController", "onUpdateStateAsync(); show content = " + aVar5);
                        }
                        bVar2.h();
                        bVar2.a.setVisibility(0);
                        bVar2.i(true);
                        bVar2.g().setText(str);
                        r1.F(bVar2.f(), str2);
                        r1.F(bVar2.b(), str3);
                        r1.F(bVar2.d(), str4);
                        r1.F(bVar2.c(), str5);
                    } else {
                        com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.d;
                        if (bVar.b(aVar7)) {
                            bVar.c(aVar7, "PlusPayPollingContentController", "onUpdateStateAsync(); content view controller not found!");
                        }
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.yandex.plus.bdui.m mVar, com.yandex.plus.log.api.b bVar) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        this.c = bVar;
    }
}
