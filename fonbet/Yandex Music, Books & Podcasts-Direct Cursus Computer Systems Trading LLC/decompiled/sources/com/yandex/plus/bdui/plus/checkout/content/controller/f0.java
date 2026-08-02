package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.internal.report.we;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleContentView;
import defpackage.cg6;
import defpackage.gld;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.tf6;
import defpackage.xq0;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class f0 extends a {
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.design.api.api.a c;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d d;
    public final com.yandex.plus.home.internal.di.y e;
    public final com.yandex.plus.log.api.b f;
    public final tf6 g;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a h;
    public com.yandex.plus.bdui.content.d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.yandex.plus.bdui.m mVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.log.api.b bVar2) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
        yVar.getClass();
        bVar2.getClass();
        this.b = bVar;
        this.c = aVar;
        this.d = dVar;
        this.e = yVar;
        this.f = bVar2;
        this.g = gld.B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(f0 f0Var, com.yandex.plus.bdui.plus.checkout.content.m mVar, cg6 cg6Var) {
        c0 c0Var;
        com.yandex.plus.bdui.plus.checkout.content.m mVar2;
        CharSequence charSequence;
        Object g;
        com.yandex.plus.bdui.plus.checkout.content.m mVar3;
        Object g2;
        CharSequence charSequence2;
        com.yandex.plus.bdui.plus.checkout.content.m mVar4;
        CharSequence charSequence3;
        Object g3;
        com.yandex.plus.bdui.plus.checkout.content.m mVar5;
        CharSequence charSequence4;
        Object g4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        PlusPayRichText plusPayRichText;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        CharSequence charSequence15;
        if (cg6Var instanceof c0) {
            c0Var = (c0) cg6Var;
            int i = c0Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0Var.r = i - Integer.MIN_VALUE;
                Object obj = c0Var.p;
                Object obj2 = nm6.a;
                CharSequence charSequence16 = null;
                switch (c0Var.r) {
                    case 0:
                        qgg.h0(obj);
                        PlusPayRichText plusPayRichText2 = mVar.a;
                        if (plusPayRichText2 == null) {
                            mVar2 = mVar;
                            charSequence = null;
                            PlusPayRichText plusPayRichText3 = mVar2.b;
                            c0Var.j = mVar2;
                            c0Var.k = charSequence;
                            c0Var.r = 2;
                            g = f0Var.g(plusPayRichText3, c0Var);
                            if (g != obj2) {
                                mVar3 = mVar2;
                                obj = g;
                                CharSequence charSequence17 = (CharSequence) obj;
                                PlusPayRichText plusPayRichText4 = mVar3.c;
                                c0Var.j = mVar3;
                                c0Var.k = charSequence;
                                c0Var.l = charSequence17;
                                c0Var.r = 3;
                                g2 = f0Var.g(plusPayRichText4, c0Var);
                                if (g2 != obj2) {
                                    com.yandex.plus.bdui.plus.checkout.content.m mVar6 = mVar3;
                                    charSequence2 = charSequence;
                                    mVar4 = mVar6;
                                    charSequence3 = charSequence17;
                                    obj = g2;
                                    CharSequence charSequence18 = (CharSequence) obj;
                                    PlusPayRichText plusPayRichText5 = mVar4.d;
                                    c0Var.j = mVar4;
                                    c0Var.k = charSequence2;
                                    c0Var.l = charSequence3;
                                    c0Var.m = charSequence18;
                                    c0Var.r = 4;
                                    g3 = f0Var.g(plusPayRichText5, c0Var);
                                    if (g3 != obj2) {
                                        mVar5 = mVar4;
                                        charSequence4 = charSequence18;
                                        obj = g3;
                                        CharSequence charSequence19 = (CharSequence) obj;
                                        PlusPayRichText plusPayRichText6 = mVar5.e;
                                        c0Var.j = mVar5;
                                        c0Var.k = charSequence2;
                                        c0Var.l = charSequence3;
                                        c0Var.m = charSequence4;
                                        c0Var.n = charSequence19;
                                        c0Var.r = 5;
                                        g4 = f0Var.g(plusPayRichText6, c0Var);
                                        if (g4 != obj2) {
                                            CharSequence charSequence20 = charSequence3;
                                            charSequence5 = charSequence4;
                                            charSequence6 = charSequence19;
                                            obj = g4;
                                            charSequence7 = charSequence20;
                                            CharSequence charSequence21 = (CharSequence) obj;
                                            plusPayRichText = mVar5.f;
                                            if (plusPayRichText != null) {
                                                charSequence8 = charSequence21;
                                                charSequence9 = charSequence5;
                                                charSequence10 = charSequence7;
                                                charSequence11 = charSequence2;
                                                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b(charSequence11, charSequence10, charSequence9, charSequence6, charSequence8, charSequence16);
                                            }
                                            c0Var.j = null;
                                            c0Var.k = charSequence2;
                                            c0Var.l = charSequence7;
                                            c0Var.m = charSequence5;
                                            c0Var.n = charSequence6;
                                            c0Var.o = charSequence21;
                                            c0Var.r = 6;
                                            Object g5 = f0Var.g(plusPayRichText, c0Var);
                                            if (g5 != obj2) {
                                                obj = g5;
                                                charSequence12 = charSequence21;
                                                charSequence13 = charSequence5;
                                                charSequence14 = charSequence2;
                                                charSequence15 = charSequence7;
                                                charSequence16 = (CharSequence) obj;
                                                charSequence8 = charSequence12;
                                                charSequence11 = charSequence14;
                                                charSequence9 = charSequence13;
                                                charSequence10 = charSequence15;
                                                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b(charSequence11, charSequence10, charSequence9, charSequence6, charSequence8, charSequence16);
                                            }
                                        }
                                    }
                                }
                            }
                            return obj2;
                        }
                        c0Var.j = mVar;
                        c0Var.r = 1;
                        obj = f0Var.g(plusPayRichText2, c0Var);
                        break;
                    case 1:
                        mVar = c0Var.j;
                        qgg.h0(obj);
                        CharSequence charSequence22 = (CharSequence) obj;
                        mVar2 = mVar;
                        charSequence = charSequence22;
                        PlusPayRichText plusPayRichText32 = mVar2.b;
                        c0Var.j = mVar2;
                        c0Var.k = charSequence;
                        c0Var.r = 2;
                        g = f0Var.g(plusPayRichText32, c0Var);
                        if (g != obj2) {
                        }
                        return obj2;
                    case 2:
                        charSequence = c0Var.k;
                        com.yandex.plus.bdui.plus.checkout.content.m mVar7 = c0Var.j;
                        qgg.h0(obj);
                        mVar3 = mVar7;
                        CharSequence charSequence172 = (CharSequence) obj;
                        PlusPayRichText plusPayRichText42 = mVar3.c;
                        c0Var.j = mVar3;
                        c0Var.k = charSequence;
                        c0Var.l = charSequence172;
                        c0Var.r = 3;
                        g2 = f0Var.g(plusPayRichText42, c0Var);
                        if (g2 != obj2) {
                        }
                        return obj2;
                    case 3:
                        CharSequence charSequence23 = c0Var.l;
                        CharSequence charSequence24 = c0Var.k;
                        com.yandex.plus.bdui.plus.checkout.content.m mVar8 = c0Var.j;
                        qgg.h0(obj);
                        charSequence3 = charSequence23;
                        mVar4 = mVar8;
                        charSequence2 = charSequence24;
                        CharSequence charSequence182 = (CharSequence) obj;
                        PlusPayRichText plusPayRichText52 = mVar4.d;
                        c0Var.j = mVar4;
                        c0Var.k = charSequence2;
                        c0Var.l = charSequence3;
                        c0Var.m = charSequence182;
                        c0Var.r = 4;
                        g3 = f0Var.g(plusPayRichText52, c0Var);
                        if (g3 != obj2) {
                        }
                        return obj2;
                    case 4:
                        charSequence4 = c0Var.m;
                        charSequence3 = c0Var.l;
                        charSequence2 = c0Var.k;
                        com.yandex.plus.bdui.plus.checkout.content.m mVar9 = c0Var.j;
                        qgg.h0(obj);
                        mVar5 = mVar9;
                        CharSequence charSequence192 = (CharSequence) obj;
                        PlusPayRichText plusPayRichText62 = mVar5.e;
                        c0Var.j = mVar5;
                        c0Var.k = charSequence2;
                        c0Var.l = charSequence3;
                        c0Var.m = charSequence4;
                        c0Var.n = charSequence192;
                        c0Var.r = 5;
                        g4 = f0Var.g(plusPayRichText62, c0Var);
                        if (g4 != obj2) {
                        }
                        return obj2;
                    case 5:
                        charSequence6 = c0Var.n;
                        charSequence5 = c0Var.m;
                        CharSequence charSequence25 = c0Var.l;
                        CharSequence charSequence26 = c0Var.k;
                        mVar5 = c0Var.j;
                        qgg.h0(obj);
                        charSequence7 = charSequence25;
                        charSequence2 = charSequence26;
                        CharSequence charSequence212 = (CharSequence) obj;
                        plusPayRichText = mVar5.f;
                        if (plusPayRichText != null) {
                        }
                        break;
                    case 6:
                        charSequence12 = c0Var.o;
                        charSequence6 = c0Var.n;
                        charSequence13 = c0Var.m;
                        charSequence15 = c0Var.l;
                        charSequence14 = c0Var.k;
                        qgg.h0(obj);
                        charSequence16 = (CharSequence) obj;
                        charSequence8 = charSequence12;
                        charSequence11 = charSequence14;
                        charSequence9 = charSequence13;
                        charSequence10 = charSequence15;
                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b(charSequence11, charSequence10, charSequence9, charSequence6, charSequence8, charSequence16);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        c0Var = new c0(f0Var, cg6Var);
        Object obj3 = c0Var.p;
        Object obj22 = nm6.a;
        CharSequence charSequence162 = null;
        switch (c0Var.r) {
        }
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.h = null;
        this.i = null;
        com.yandex.plus.bdui.plus.analytics.b.d(this.g);
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        PresaleContentView presaleContentView = new PresaleContentView(context, null, 0, 0, 14, null);
        int i = 0;
        int i2 = 0;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a(presaleContentView, this.b, this.c, new w(i2, this, f0.class, "onCloseClick", "onCloseClick()V", i, 5), new w(i2, this, f0.class, "onSuggestedOfferButtonClick", "onSuggestedOfferButtonClick()V", i, 6), new w(i2, this, f0.class, "onOriginalOfferButtonClick", "onOriginalOfferButtonClick()V", i, 7), new w(i2, this, f0.class, "onLegalTextShown", "onLegalTextShown()V", i, 8));
        this.h = aVar;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        d0 d0Var = new d0(aVar, 0);
        com.yandex.plus.core.insets.a aVar2 = new com.yandex.plus.core.insets.a();
        aVar2.b = new LinkedHashSet(2);
        aVar2.d();
        aVar2.c();
        dVar.b.put(d0Var, aVar2);
        dVar.b(presaleContentView);
        return presaleContentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        e0 e0Var;
        int i;
        if (continuation instanceof e0) {
            e0Var = (e0) continuation;
            int i2 = e0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = e0Var.j;
                nm6 nm6Var = nm6.a;
                i = e0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!dVar.d) {
                        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar = this.h;
                        if (aVar != null) {
                            this.i = dVar;
                            we weVar = new we(this, dVar, aVar, (Continuation) null, 26);
                            e0Var.l = 1;
                            if (gld.Q(weVar, e0Var) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                            com.yandex.plus.log.api.b bVar = this.f;
                            if (bVar.b(aVar2)) {
                                bVar.c(aVar2, "PlusPayPresaleContentController", "onUpdateStateAsync(); content view controller not found!");
                            }
                        }
                        return Unit.a;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        e0Var = new e0(this, continuation);
        Object obj2 = e0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = e0Var.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    public final void f(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.action.a aVar) {
        if (aVar != null) {
            this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(dVar.c), null);
            return;
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
        com.yandex.plus.log.api.b bVar = this.f;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "PlusPayPresaleContentController", "dispatchAction(); action is null!");
        }
    }

    public final Object g(PlusPayRichText plusPayRichText, cg6 cg6Var) {
        return ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.d).a(plusPayRichText, new r0w(22, this), cg6Var);
    }
}
