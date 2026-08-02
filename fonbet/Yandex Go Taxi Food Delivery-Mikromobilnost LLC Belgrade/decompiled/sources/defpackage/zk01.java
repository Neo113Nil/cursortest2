package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.BottomSheetPayloadSectionEntity$Type;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.ButtonTransferType;
import com.ybsdk.feature.transfer.version2.api.mappers.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zk01 {
    public static final ig6 a(List list, uc8 uc8Var) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            yi1 yi1Var = ((ig6) next).k;
            if (jl40.l(yi1Var != null ? yi1Var.e : null, uc8Var.b)) {
                obj = next;
                break;
            }
        }
        return (ig6) obj;
    }

    public static final wk01 b(xk01 xk01Var) {
        if (xk01Var instanceof wk01) {
            return (wk01) xk01Var;
        }
        return null;
    }

    public static final xk01 c(xk01 xk01Var, tls tlsVar) {
        if (xk01Var instanceof uk01) {
            uk01 uk01Var = (uk01) xk01Var;
            return new uk01(uk01Var.b, uk01Var.a);
        }
        if (xk01Var instanceof vk01) {
            vk01 vk01Var = (vk01) xk01Var;
            return new vk01(vk01Var.a, vk01Var.b);
        }
        if (xk01Var instanceof wk01) {
            return (xk01) tlsVar.invoke(xk01Var);
        }
        w511.b();
        return null;
    }

    public static final void d(ig6 ig6Var) {
        String b = ssa1.b(ig6Var.d);
        String str = ig6Var.e;
        x4c.g("unexpected deeplink in bottom sheet payload item", null, b64.l("title = ", b, ", description = ", str != null ? ssa1.b(str) : null), Collections.singletonList(orp0.e), 2);
    }

    public static final sl e(ig6 ig6Var) {
        String str;
        orp0 orp0Var = orp0.e;
        t910 t910Var = ig6Var.j;
        TransferDeeplink transferDeeplink = ig6Var.i;
        if (jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE)) {
            xmq0 xmq0Var = ig6Var.c;
            if (xmq0Var == null || (str = xmq0Var.a) == null) {
                x4c.g("sourceAgreementId in sourceTransferPayload shouldn't be null", null, null, Collections.singletonList(orp0Var), 6);
                return null;
            }
        } else if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
            ymq0 ymq0Var = ig6Var.b;
            if (ymq0Var == null || (str = ymq0Var.a) == null) {
                x4c.g("targetAgreementId in selfTransferPayload shouldn't be null", null, null, Collections.singletonList(orp0Var), 6);
                return null;
            }
        } else if (!jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
            if (!jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
                if (jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.RawAction) || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) || transferDeeplink == null) {
                    d(ig6Var);
                    return null;
                }
                w511.b();
                return null;
            }
            yi1 yi1Var = ig6Var.k;
            if (yi1Var == null || (str = yi1Var.e) == null) {
                x4c.g("cardId in aftTopupPayload shouldn't be null", null, null, Collections.singletonList(orp0Var), 6);
                return null;
            }
        } else if (t910Var == null || (str = t910Var.e) == null) {
            byte[] bArr = new byte[6];
            for (int i = 0; i < 6; i++) {
                bArr[i] = (byte) (gf91.k[i] ^ gf91.a[i % 8]);
            }
            x4c.g(new String(bArr, uza.a).concat(" in me2meTopupPayload shouldn't be null"), null, null, Collections.singletonList(orp0Var), 6);
            return null;
        }
        return new sl(str, ig6Var.d, ig6Var.e, f(ig6Var), ig6Var.g, ig6Var.h, t910Var != null ? t910Var.g : null);
    }

    public static final rbv f(ig6 ig6Var) {
        TransferDeeplink transferDeeplink = ig6Var.i;
        if (jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE)) {
            xmq0 xmq0Var = ig6Var.c;
            return a.j(xmq0Var != null ? xmq0Var.e : null);
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
            ymq0 ymq0Var = ig6Var.b;
            return a.j(ymq0Var != null ? ymq0Var.e : null);
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
            t910 t910Var = ig6Var.j;
            return a.j(t910Var != null ? t910Var.d : null);
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
            yi1 yi1Var = ig6Var.k;
            return a.a(yi1Var != null ? yi1Var.d : null);
        }
        if (!jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) && !(transferDeeplink instanceof TransferDeeplink.RawAction) && !(transferDeeplink instanceof TransferDeeplink.SelectTarget) && !jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) && transferDeeplink != null) {
            w511.b();
        }
        return null;
    }

    public static final mfq0 g(ak1 ak1Var) {
        return new mfq0(ak1Var.a, null, ak1Var.c, ak1Var.g, true, a.j(ak1Var.e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c1, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00c5, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d5, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00e6, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x00f7, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lfq0 h(ig6 ig6Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        TransferDeeplink.Me2MeTopup me2MeTopup;
        v24 v24Var;
        v24 v24Var2;
        orp0 orp0Var = orp0.e;
        ymq0 ymq0Var = ig6Var.b;
        yi1 yi1Var = ig6Var.k;
        t910 t910Var = ig6Var.j;
        xmq0 xmq0Var = ig6Var.c;
        TransferDeeplink transferDeeplink = ig6Var.i;
        TransferDeeplink.Self.Topup topup = TransferDeeplink.Self.Topup.INSTANCE;
        if (jl40.l(transferDeeplink, topup)) {
            if (xmq0Var == null || (str = xmq0Var.a) == null) {
                x4c.g("sourceAgreementId in sourceTransferPayload shouldn't be null", null, null, Collections.singletonList(orp0Var), 6);
                return null;
            }
        } else if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
            if (ymq0Var == null || (str = ymq0Var.a) == null) {
                x4c.g("targetAgreementId in selfTransferPayload shouldn't be null", null, null, Collections.singletonList(orp0Var), 6);
                return null;
            }
        } else if (!jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
            if (!jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
                if (jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.RawAction) || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) || transferDeeplink == null) {
                    d(ig6Var);
                    return null;
                }
                w511.b();
                return null;
            }
            if (yi1Var == null || (str = yi1Var.e) == null) {
                x4c.g("cardId in aftTopupPayload shouldn't be null", null, null, Collections.singletonList(orp0Var), 6);
                return null;
            }
        } else if (t910Var == null || (str = t910Var.e) == null) {
            byte[] bArr = new byte[6];
            for (int i = 0; i < 6; i++) {
                bArr[i] = (byte) (gf91.k[i] ^ gf91.a[i % 8]);
            }
            x4c.g(new String(bArr, uza.a).concat(" in me2meTopupPayload shouldn't be null"), null, null, Collections.singletonList(orp0Var), 6);
            return null;
        }
        String str7 = str;
        if (!jl40.l(transferDeeplink, topup) && !jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
            if (!jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
                if (jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.RawAction) || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) || transferDeeplink == null) {
                    d(ig6Var);
                    return null;
                }
                w511.b();
                return null;
            }
            if (yi1Var != null) {
                str2 = yi1Var.f;
                if (!jl40.l(transferDeeplink, topup)) {
                    str3 = xmq0Var != null ? xmq0Var.b : null;
                } else if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
                    str3 = ymq0Var != null ? ymq0Var.b : null;
                } else if (jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
                    str3 = t910Var != null ? t910Var.a : null;
                } else {
                    if (!jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
                        if (jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.RawAction) || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) || transferDeeplink == null) {
                            d(ig6Var);
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    str3 = yi1Var != null ? yi1Var.a : null;
                }
                if (!jl40.l(transferDeeplink, topup)) {
                    if (xmq0Var != null) {
                        str5 = xmq0Var.c;
                        str6 = str5;
                    }
                    str6 = null;
                } else if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
                    if (ymq0Var != null) {
                        str5 = ymq0Var.c;
                        str6 = str5;
                    }
                    str6 = null;
                } else if (jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
                    if (t910Var != null) {
                        str5 = t910Var.b;
                        str6 = str5;
                    }
                    str6 = null;
                } else {
                    if (!jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
                        if (jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.RawAction) || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) || transferDeeplink == null) {
                            d(ig6Var);
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    if (yi1Var != null) {
                        str5 = yi1Var.b;
                        str6 = str5;
                    }
                    str6 = null;
                }
                boolean z = true;
                if (jl40.l(transferDeeplink, topup)) {
                    if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
                        if (ymq0Var != null) {
                            z = ymq0Var.d;
                        }
                    } else if (!jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
                        if (!jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
                            if (jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.RawAction) || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) || transferDeeplink == null) {
                                d(ig6Var);
                                return null;
                            }
                            w511.b();
                            return null;
                        }
                        if (yi1Var != null) {
                            z = yi1Var.c;
                        }
                    } else if (t910Var != null) {
                        z = t910Var.c;
                    }
                } else if (xmq0Var != null) {
                    z = xmq0Var.d;
                }
                boolean z2 = z;
                me2MeTopup = TransferDeeplink.Me2MeTopup.INSTANCE;
                if (jl40.l(transferDeeplink, me2MeTopup)) {
                    if (jl40.l(transferDeeplink, topup)) {
                        if (xmq0Var != null) {
                            v24Var = xmq0Var.f;
                            v24Var2 = v24Var;
                        }
                    } else if (!jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
                        if (jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) || (transferDeeplink instanceof TransferDeeplink.RawAction) || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) || jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) || transferDeeplink == null) {
                            d(ig6Var);
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    v24Var2 = null;
                } else {
                    if (t910Var != null) {
                        v24Var = t910Var.f;
                        v24Var2 = v24Var;
                    }
                    v24Var2 = null;
                }
                if (!jl40.l(transferDeeplink, me2MeTopup)) {
                    return new phq0(str7, str4, str6, z2, f(ig6Var), v24Var2, null);
                }
                if (jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
                    return new tfq0(str7, str2, str4, str6, z2, f(ig6Var));
                }
                if (jl40.l(transferDeeplink, topup) || jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
                    return new mfq0(str7, v24Var2, str4, str6, z2, f(ig6Var));
                }
                if (!jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) && !(transferDeeplink instanceof TransferDeeplink.RawAction) && !jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) && !(transferDeeplink instanceof TransferDeeplink.SelectTarget) && !jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) && transferDeeplink != null) {
                    w511.b();
                }
                return null;
            }
        }
        str2 = null;
        if (!jl40.l(transferDeeplink, topup)) {
        }
        if (!jl40.l(transferDeeplink, topup)) {
        }
        boolean z3 = true;
        if (jl40.l(transferDeeplink, topup)) {
        }
        boolean z22 = z3;
        me2MeTopup = TransferDeeplink.Me2MeTopup.INSTANCE;
        if (jl40.l(transferDeeplink, me2MeTopup)) {
        }
        if (!jl40.l(transferDeeplink, me2MeTopup)) {
        }
    }

    public static final ak1 i(ak1 ak1Var, uc8 uc8Var) {
        List<eh01> list = ak1Var.f;
        int i = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (eh01 eh01Var : list) {
            ButtonTransferType buttonTransferType = eh01Var.q;
            int i2 = buttonTransferType == null ? -1 : yk01.c[buttonTransferType.ordinal()];
            r6q0 r6q0Var = null;
            if (i2 == 1) {
                hg6 hg6Var = eh01Var.h;
                eh01Var = eh01.a(eh01Var, hg6Var != null ? hg6.a(hg6Var, j(hg6Var.d, uc8Var)) : null, null, null, null, 130943);
            } else if (i2 == 2) {
                r6q0 r6q0Var2 = eh01Var.i;
                if (r6q0Var2 != null) {
                    List<jg6> list2 = r6q0Var2.c;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, i));
                    for (jg6 jg6Var : list2) {
                        BottomSheetPayloadSectionEntity$Type bottomSheetPayloadSectionEntity$Type = jg6Var.a;
                        int i3 = bottomSheetPayloadSectionEntity$Type == null ? -1 : yk01.d[bottomSheetPayloadSectionEntity$Type.ordinal()];
                        if (i3 != -1) {
                            if (i3 == 1) {
                                jg6Var = new jg6(bottomSheetPayloadSectionEntity$Type, jg6Var.b, j(jg6Var.c, uc8Var));
                            } else if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                        }
                        arrayList2.add(jg6Var);
                    }
                    r6q0Var = r6q0.a(r6q0Var2, arrayList2);
                }
                eh01Var = eh01.a(eh01Var, null, r6q0Var, null, null, 130815);
            } else {
                continue;
            }
            arrayList.add(eh01Var);
            i = 10;
        }
        return ak1.a(ak1Var, null, arrayList, null, null, null, 32735);
    }

    public static final List j(List list, uc8 uc8Var) {
        if (a(list, uc8Var) != null) {
            return list;
        }
        String str = uc8Var.b;
        String str2 = uc8Var.d;
        String str3 = uc8Var.e;
        ThemedImageUrlEntity themedImageUrlEntity = uc8Var.f;
        return kotlin.collections.a.o0(list, new ig6(str, null, null, str2, str3, themedImageUrlEntity, null, null, TransferDeeplink.AftTopup.INSTANCE, null, new yi1(str2, str3, false, themedImageUrlEntity, str, uc8Var.c)));
    }
}
