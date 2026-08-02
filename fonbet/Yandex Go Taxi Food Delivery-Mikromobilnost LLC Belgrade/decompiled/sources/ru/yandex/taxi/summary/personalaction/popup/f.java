package ru.yandex.taxi.summary.personalaction.popup;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.amc;
import defpackage.b580;
import defpackage.bl21;
import defpackage.h55;
import defpackage.n3b0;
import defpackage.ol3;
import defpackage.op70;
import defpackage.pex0;
import defpackage.s3b0;
import defpackage.scc;
import defpackage.t3b0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u3b0;
import defpackage.vqv0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.z6b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;
import ru.yandex.taxi.summary.personalaction.popup.f;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes6.dex */
public final class f extends h55 {
    public final tse D;
    public final ru.yandex.taxi.personalstate.data.remote.a E;
    public final amc F;
    public final wiq0 G;
    public final vqv0 H;
    public final ol3 I;
    public final n3b0 J;
    public BaseDialog K;

    public f(tse tseVar, ru.yandex.taxi.personalstate.data.remote.a aVar, amc amcVar, wiq0 wiq0Var, vqv0 vqv0Var, ol3 ol3Var, n3b0 n3b0Var) {
        super(null);
        this.D = tseVar;
        this.E = aVar;
        this.F = amcVar;
        this.G = wiq0Var;
        this.H = vqv0Var;
        this.I = ol3Var;
        this.J = n3b0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        BaseDialog baseDialog = this.K;
        if (baseDialog != null) {
            baseDialog.dismiss();
        }
        this.K = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        final u3b0 u3b0Var = (u3b0) obj;
        String str = u3b0Var.a;
        List list = u3b0Var.c;
        String str2 = u3b0Var.d;
        z6b0 z6b0Var = this.E.c;
        z6b0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("popup_type", str2);
        }
        if (str != null) {
            hashMap.put("title", str);
        }
        final int i = 1;
        z6b0Var.a.a("PersonalStatePopup.Shown", hashMap, 1, new HashMap());
        ol3 ol3Var = this.I;
        ol3Var.getClass();
        BaseDialog message = new BaseDialog(ol3Var.a).setTitle(u3b0Var.a).setMessage(u3b0Var.b);
        final int i2 = 0;
        if (list.size() == 1) {
            final t3b0 t3b0Var = (t3b0) list.get(0);
            message.setMainActionButton(t3b0Var.a, new Runnable(this) { // from class: r3b0
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    final t3b0 t3b0Var2 = t3b0Var;
                    final u3b0 u3b0Var2 = u3b0Var;
                    final f fVar = this.b;
                    switch (i3) {
                        case 0:
                            final int i4 = 1;
                            fVar.r(new tls() { // from class: q3b0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    int i5 = i4;
                                    zy11 zy11Var = zy11.a;
                                    t3b0 t3b0Var3 = t3b0Var2;
                                    u3b0 u3b0Var3 = u3b0Var2;
                                    f fVar2 = fVar;
                                    switch (i5) {
                                        case 0:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                        case 1:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                        default:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            break;
                        case 1:
                            final int i5 = 2;
                            fVar.r(new tls() { // from class: q3b0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    int i52 = i5;
                                    zy11 zy11Var = zy11.a;
                                    t3b0 t3b0Var3 = t3b0Var2;
                                    u3b0 u3b0Var3 = u3b0Var2;
                                    f fVar2 = fVar;
                                    switch (i52) {
                                        case 0:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                        case 1:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                        default:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            break;
                        default:
                            final int i6 = 0;
                            fVar.r(new tls() { // from class: q3b0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    int i52 = i6;
                                    zy11 zy11Var = zy11.a;
                                    t3b0 t3b0Var3 = t3b0Var2;
                                    u3b0 u3b0Var3 = u3b0Var2;
                                    f fVar2 = fVar;
                                    switch (i52) {
                                        case 0:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                        case 1:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                        default:
                                            fVar2.P(u3b0Var3, t3b0Var3);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            break;
                    }
                }
            }, (String) null);
        } else {
            for (final t3b0 t3b0Var2 : list.subList(0, scc.f(list))) {
                message.addButton(t3b0Var2.a, new Runnable(this) { // from class: r3b0
                    public final /* synthetic */ f b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        final t3b0 t3b0Var22 = t3b0Var2;
                        final u3b0 u3b0Var2 = u3b0Var;
                        final f fVar = this.b;
                        switch (i3) {
                            case 0:
                                final int i4 = 1;
                                fVar.r(new tls() { // from class: q3b0
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        int i52 = i4;
                                        zy11 zy11Var = zy11.a;
                                        t3b0 t3b0Var3 = t3b0Var22;
                                        u3b0 u3b0Var3 = u3b0Var2;
                                        f fVar2 = fVar;
                                        switch (i52) {
                                            case 0:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                            case 1:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                            default:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                });
                                break;
                            case 1:
                                final int i5 = 2;
                                fVar.r(new tls() { // from class: q3b0
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        int i52 = i5;
                                        zy11 zy11Var = zy11.a;
                                        t3b0 t3b0Var3 = t3b0Var22;
                                        u3b0 u3b0Var3 = u3b0Var2;
                                        f fVar2 = fVar;
                                        switch (i52) {
                                            case 0:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                            case 1:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                            default:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                });
                                break;
                            default:
                                final int i6 = 0;
                                fVar.r(new tls() { // from class: q3b0
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        int i52 = i6;
                                        zy11 zy11Var = zy11.a;
                                        t3b0 t3b0Var3 = t3b0Var22;
                                        u3b0 u3b0Var3 = u3b0Var2;
                                        f fVar2 = fVar;
                                        switch (i52) {
                                            case 0:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                            case 1:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                            default:
                                                fVar2.P(u3b0Var3, t3b0Var3);
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                });
                                break;
                        }
                    }
                }, (String) null);
            }
            final t3b0 t3b0Var3 = (t3b0) kotlin.collections.a.Z(list);
            final int i3 = 2;
            message.setMainActionButton(t3b0Var3.a, new Runnable(this) { // from class: r3b0
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i32 = i3;
                    final t3b0 t3b0Var22 = t3b0Var3;
                    final u3b0 u3b0Var2 = u3b0Var;
                    final f fVar = this.b;
                    switch (i32) {
                        case 0:
                            final int i4 = 1;
                            fVar.r(new tls() { // from class: q3b0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    int i52 = i4;
                                    zy11 zy11Var = zy11.a;
                                    t3b0 t3b0Var32 = t3b0Var22;
                                    u3b0 u3b0Var3 = u3b0Var2;
                                    f fVar2 = fVar;
                                    switch (i52) {
                                        case 0:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                        case 1:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                        default:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            break;
                        case 1:
                            final int i5 = 2;
                            fVar.r(new tls() { // from class: q3b0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    int i52 = i5;
                                    zy11 zy11Var = zy11.a;
                                    t3b0 t3b0Var32 = t3b0Var22;
                                    u3b0 u3b0Var3 = u3b0Var2;
                                    f fVar2 = fVar;
                                    switch (i52) {
                                        case 0:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                        case 1:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                        default:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            break;
                        default:
                            final int i6 = 0;
                            fVar.r(new tls() { // from class: q3b0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    int i52 = i6;
                                    zy11 zy11Var = zy11.a;
                                    t3b0 t3b0Var32 = t3b0Var22;
                                    u3b0 u3b0Var3 = u3b0Var2;
                                    f fVar2 = fVar;
                                    switch (i52) {
                                        case 0:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                        case 1:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                        default:
                                            fVar2.P(u3b0Var3, t3b0Var32);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            break;
                    }
                }
            }, (String) null);
        }
        message.setDismissListener(new op70(26, this));
        this.K = message.show();
        LinkedHashMap linkedHashMap = this.J.a;
        linkedHashMap.put(str2, Integer.valueOf(((Number) linkedHashMap.getOrDefault(str2, 0)).intValue() + 1));
    }

    public final void P(u3b0 u3b0Var, t3b0 t3b0Var) {
        String name;
        ru.yandex.taxi.personalstate.data.remote.a aVar = this.E;
        String str = u3b0Var.a;
        String str2 = u3b0Var.d;
        OptionType optionType = t3b0Var.b;
        z6b0 z6b0Var = aVar.c;
        String str3 = null;
        String lowerCase = (optionType == null || (name = optionType.name()) == null) ? null : name.toLowerCase(Locale.US);
        z6b0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("title", str);
        }
        hashMap.put("popup_type", str2);
        if (lowerCase != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, lowerCase);
        }
        z6b0Var.a.a("PersonalStatePopup.OptionSelected", hashMap, 1, new HashMap());
        int i = s3b0.a[t3b0Var.b.ordinal()];
        int i2 = 3;
        if (i == 1) {
            tje.N(this.D, null, null, new PersonalActionPopupRouter$popupOptionSelected$1(this, null), 3);
            return;
        }
        if (i == 2) {
            amc amcVar = this.F;
            amcVar.getClass();
            amcVar.f(new bl21(str3, i2));
            List list = amcVar.a.a.x;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b580.a((b580) it.next(), null, null, null, 31));
            }
            amcVar.a.a.x = arrayList;
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            w511.b();
            return;
        }
        amc amcVar2 = this.F;
        amcVar2.getClass();
        amcVar2.f(new bl21(str3, i2));
        String str4 = t3b0Var.c;
        if (str4 == null) {
            pex0 m = ((k) this.G).m();
            str4 = m != null ? m.b : null;
            if (str4 == null) {
                return;
            }
        }
        tje.N(this.D, null, null, new PersonalActionPopupRouter$popupOptionSelected$2(this, str4, t3b0Var, null), 3);
    }
}
