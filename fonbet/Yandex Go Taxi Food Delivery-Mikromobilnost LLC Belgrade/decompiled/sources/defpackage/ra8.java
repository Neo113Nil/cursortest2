package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationInputState;

/* loaded from: classes3.dex */
public final class ra8 implements ev31 {
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        ea8 da8Var;
        String str;
        String str2;
        String str3;
        ea8 ea8Var;
        int i;
        int i2;
        int i3;
        d6w d6wVar;
        Integer valueOf;
        Integer num;
        int i4;
        Text constant;
        String str4;
        int i5;
        String str5;
        String str6;
        pbv pbvVar;
        float f;
        pbv pbvVar2;
        String str7;
        pbv pbvVar3;
        pbv pbvVar4;
        d6w d6wVar2;
        String str8;
        String str9;
        String str10;
        String str11;
        rev revVar = rev.f;
        s98 s98Var = (s98) obj;
        bp8 bp8Var = s98Var.i;
        p98 p98Var = s98Var.d;
        CardActivationInputState cardActivationInputState = s98Var.c;
        ffb1 ffb1Var = s98Var.e;
        if (ffb1Var instanceof w98) {
            w98 w98Var = (w98) ffb1Var;
            String str12 = w98Var.b;
            return new la8(str12, r501.a(w98Var.a, unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_failure_title), new Text.Resource(dzh0.ybsdk_card_card_activation_failure_subtitle), new Text.Resource(str12 != null ? dzh0.ybsdk_common_error_retry : dzh0.ybsdk_card_card_activation_button_support), str12 != null ? new Text.Resource(dzh0.ybsdk_card_card_activation_button_support) : null, null, null, null, null, null, null, null, null, 65474));
        }
        if (ffb1Var instanceof x98) {
            return na8.a;
        }
        if (ffb1Var instanceof t98) {
            return ma8.a;
        }
        if (ffb1Var instanceof u98) {
            return new ja8(r501.a(((u98) ffb1Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        if (ffb1Var instanceof v98) {
            return ka8.a;
        }
        if (ffb1Var != null) {
            w511.b();
            return null;
        }
        int[] iArr = qa8.a;
        int i6 = iArr[cardActivationInputState.ordinal()];
        if (i6 == 1) {
            int i7 = qa8.b[s98Var.f.ordinal()];
            if (i7 == 1) {
                da8Var = new da8((p98Var == null || (str = p98Var.a) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_enter_cvc_code) : g8e.i(Text.Companion, str));
            } else if (i7 == 2) {
                da8Var = new ca8((p98Var == null || (str2 = p98Var.d.a) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_enter_cvc_code) : g8e.i(Text.Companion, str2));
            } else {
                if (i7 != 3) {
                    w511.b();
                    return null;
                }
                da8Var = new ca8((p98Var == null || (str3 = p98Var.d.b) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_enter_cvc_code) : g8e.i(Text.Companion, str3));
            }
        } else {
            if (i6 != 2) {
                w511.b();
                return null;
            }
            int i8 = qa8.c[s98Var.g.ordinal()];
            if (i8 == 1) {
                da8Var = new da8((p98Var == null || (str8 = p98Var.b) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_enter_card_number) : g8e.i(Text.Companion, str8));
            } else if (i8 == 2) {
                da8Var = new ca8((p98Var == null || (str9 = p98Var.e.a) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_enter_card_number) : g8e.i(Text.Companion, str9));
            } else if (i8 == 3) {
                da8Var = new ca8((p98Var == null || (str10 = p98Var.e.c) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_failure) : g8e.i(Text.Companion, str10));
            } else {
                if (i8 != 4) {
                    if (i8 != 5) {
                        w511.b();
                        return null;
                    }
                    ea8Var = new ca8(unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_failure));
                    b bVar = Text.Companion;
                    i = iArr[cardActivationInputState.ordinal()];
                    if (i != 1) {
                        i2 = dzh0.ybsdk_card_card_cvv_title;
                    } else {
                        if (i != 2) {
                            w511.b();
                            return null;
                        }
                        i2 = dzh0.ybsdk_card_card_pan_title;
                    }
                    Text.Resource h = unr0.h(bVar, i2);
                    i3 = iArr[cardActivationInputState.ordinal()];
                    if (i3 != 1) {
                        if (p98Var != null && (d6wVar = p98Var.d.c) != null) {
                            valueOf = Integer.valueOf(d6wVar.b);
                            num = valueOf;
                        }
                        num = null;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        if (p98Var != null && (d6wVar2 = p98Var.e.d) != null) {
                            valueOf = Integer.valueOf(d6wVar2.b);
                            num = valueOf;
                        }
                        num = null;
                    }
                    i4 = iArr[cardActivationInputState.ordinal()];
                    if (i4 != 1) {
                        String str13 = sk8.a;
                        constant = new Text.Constant(sk8.a(s98Var.b()));
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        constant = Text.Empty.INSTANCE;
                    }
                    str4 = p98Var == null ? p98Var.c : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str14 = str4;
                    i5 = iArr[cardActivationInputState.ordinal()];
                    if (i5 != 1) {
                        str5 = s98Var.a;
                    } else {
                        if (i5 != 2) {
                            w511.b();
                            return null;
                        }
                        str5 = s98Var.b;
                    }
                    Text.Constant constant2 = new Text.Constant(str5);
                    str6 = bp8Var.a;
                    if (str6 == null) {
                        pbvVar = null;
                        f = 20.0f;
                        pbvVar2 = new pbv(str6, (ccv) null, revVar, (dcv) null, new ufv(20.0f), 42);
                    } else {
                        pbvVar = null;
                        f = 20.0f;
                        pbvVar2 = null;
                    }
                    str7 = bp8Var.b;
                    if (str7 == null) {
                        pbvVar3 = pbvVar2;
                        pbvVar4 = new pbv(str7, (ccv) null, revVar, (dcv) null, new ufv(f), 42);
                    } else {
                        pbvVar3 = pbvVar2;
                        pbvVar4 = pbvVar;
                    }
                    return new ia8(ea8Var, cardActivationInputState, h, num, constant, str14, constant2, (pbvVar3 != null || pbvVar4 == null) ? pbvVar3 != null ? pbvVar4 : pbvVar3 : fob1.a(pbvVar3, pbvVar4), s98Var.j, s98Var.k, s98Var.l, s98Var.m, s98Var.n);
                }
                da8Var = new ca8((p98Var == null || (str11 = p98Var.e.b) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_enter_card_number) : g8e.i(Text.Companion, str11));
            }
        }
        ea8Var = da8Var;
        b bVar2 = Text.Companion;
        i = iArr[cardActivationInputState.ordinal()];
        if (i != 1) {
        }
        Text.Resource h2 = unr0.h(bVar2, i2);
        i3 = iArr[cardActivationInputState.ordinal()];
        if (i3 != 1) {
        }
        i4 = iArr[cardActivationInputState.ordinal()];
        if (i4 != 1) {
        }
        if (p98Var == null) {
        }
        if (str4 == null) {
        }
        String str142 = str4;
        i5 = iArr[cardActivationInputState.ordinal()];
        if (i5 != 1) {
        }
        Text.Constant constant22 = new Text.Constant(str5);
        str6 = bp8Var.a;
        if (str6 == null) {
        }
        str7 = bp8Var.b;
        if (str7 == null) {
        }
        return new ia8(ea8Var, cardActivationInputState, h2, num, constant, str142, constant22, (pbvVar3 != null || pbvVar4 == null) ? pbvVar3 != null ? pbvVar4 : pbvVar3 : fob1.a(pbvVar3, pbvVar4), s98Var.j, s98Var.k, s98Var.l, s98Var.m, s98Var.n);
    }
}
