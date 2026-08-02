package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.screens.result.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class qk01 implements vpr {
    public final /* synthetic */ a a;

    public qk01(a aVar, tse tseVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        r0 r0Var;
        Object value;
        String str2;
        r0 r0Var2;
        Object value2;
        final dqg dqgVar = (dqg) obj;
        boolean z = dqgVar instanceof bqg;
        gs01 gs01Var = gs01.a;
        bh01 bh01Var = bh01.b;
        a aVar = this.a;
        if (z) {
            aVar.D.a();
            aVar.e0(ResultStatus.FAILED, null, ((bqg) dqgVar).a);
            a.c0(aVar, aVar.G, gs01Var);
            aVar.p0(bh01Var);
            pz40 Y = aVar.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, kk01.a((kk01) value2, null, ResultStatus.FAILED, null, null, null, null, null, null, null, null, null, 8187)));
        } else {
            if (!(dqgVar instanceof cqg)) {
                w511.b();
                return null;
            }
            Object obj2 = ((cqg) dqgVar).a;
            yr01 yr01Var = (yr01) obj2;
            ResultStatus resultStatus = yr01Var.a;
            TransferResultPageEntity transferResultPageEntity = yr01Var.b;
            ResultStatus resultStatus2 = yr01Var.a;
            p39 p39Var = yr01Var.e;
            aVar.getClass();
            TransferMainResultScreenParams transferMainResultScreenParams = aVar.B;
            c1x0 c1x0Var = aVar.G;
            ji01 ji01Var = aVar.D;
            int i = mk01.a[resultStatus2.ordinal()];
            if (i == 5) {
                str = "timeout";
            } else if (i == 6) {
                str = "getResultError";
            } else if (i != 7 || transferResultPageEntity == null || (str = transferResultPageEntity.getTitle()) == null) {
                str = null;
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) {
                str = "failedStatus";
            }
            aVar.e0(resultStatus, p39Var, str);
            switch (pk01.a[resultStatus2.ordinal()]) {
                case 1:
                    aVar.p0(ch01.b);
                    final int i2 = 0;
                    aVar.a0(new tls() { // from class: ok01
                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            String description;
                            String title;
                            String description2;
                            String title2;
                            String description3;
                            String title3;
                            int i3 = i2;
                            Text.Constant constant = null;
                            dqg dqgVar2 = dqgVar;
                            switch (i3) {
                                case 0:
                                    kk01 kk01Var = (kk01) obj3;
                                    yr01 yr01Var2 = (yr01) ((cqg) dqgVar2).a;
                                    ResultStatus resultStatus3 = yr01Var2.a;
                                    TransferResultPageEntity transferResultPageEntity2 = yr01Var2.b;
                                    Text.Constant i4 = (transferResultPageEntity2 == null || (title = transferResultPageEntity2.getTitle()) == null) ? null : g8e.i(Text.Companion, title);
                                    TransferResultPageEntity transferResultPageEntity3 = yr01Var2.b;
                                    if (transferResultPageEntity3 != null && (description = transferResultPageEntity3.getDescription()) != null) {
                                        constant = g8e.i(Text.Companion, description);
                                    }
                                    Text.Constant constant2 = constant;
                                    TransferResultPageEntity transferResultPageEntity4 = yr01Var2.b;
                                    if (transferResultPageEntity4 == null) {
                                        transferResultPageEntity4 = kk01Var.a;
                                    }
                                    return kk01.a(kk01Var, transferResultPageEntity4, resultStatus3, null, null, i4, constant2, null, yr01Var2.d, yr01Var2.e, yr01Var2.f, null, 4506);
                                case 1:
                                    kk01 kk01Var2 = (kk01) obj3;
                                    yr01 yr01Var3 = (yr01) ((cqg) dqgVar2).a;
                                    ResultStatus resultStatus4 = yr01Var3.a;
                                    TransferResultPageEntity transferResultPageEntity5 = yr01Var3.b;
                                    Text.Constant i5 = (transferResultPageEntity5 == null || (title2 = transferResultPageEntity5.getTitle()) == null) ? null : g8e.i(Text.Companion, title2);
                                    TransferResultPageEntity transferResultPageEntity6 = yr01Var3.b;
                                    if (transferResultPageEntity6 != null && (description2 = transferResultPageEntity6.getDescription()) != null) {
                                        constant = g8e.i(Text.Companion, description2);
                                    }
                                    Text.Constant constant3 = constant;
                                    TransferResultPageEntity transferResultPageEntity7 = yr01Var3.b;
                                    if (transferResultPageEntity7 == null) {
                                        transferResultPageEntity7 = kk01Var2.a;
                                    }
                                    return kk01.a(kk01Var2, transferResultPageEntity7, resultStatus4, null, null, i5, constant3, null, yr01Var3.d, yr01Var3.e, null, null, 6554);
                                default:
                                    kk01 kk01Var3 = (kk01) obj3;
                                    ResultStatus resultStatus5 = ResultStatus.FAILED;
                                    yr01 yr01Var4 = (yr01) ((cqg) dqgVar2).a;
                                    TransferResultPageEntity transferResultPageEntity8 = yr01Var4.b;
                                    Text.Constant i6 = (transferResultPageEntity8 == null || (title3 = transferResultPageEntity8.getTitle()) == null) ? null : g8e.i(Text.Companion, title3);
                                    TransferResultPageEntity transferResultPageEntity9 = yr01Var4.b;
                                    if (transferResultPageEntity9 != null && (description3 = transferResultPageEntity9.getDescription()) != null) {
                                        constant = g8e.i(Text.Companion, description3);
                                    }
                                    return kk01.a(kk01Var3, null, resultStatus5, null, null, i6, constant, null, yr01Var4.d, yr01Var4.e, null, null, 6555);
                            }
                        }
                    });
                    break;
                case 2:
                case 3:
                    ji01Var.a();
                    a.c0(aVar, c1x0Var, hs01.a);
                    aVar.p0(bh01Var);
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, a.f0(kk01.a((kk01) value, null, ((yr01) obj2).a, null, null, null, null, null, null, null, null, null, 8187), transferMainResultScreenParams.getTimeoutResultPage())));
                case 4:
                    ji01Var.a();
                    a.c0(aVar, c1x0Var, gs01Var);
                    aVar.p0(bh01Var);
                    final int i3 = 1;
                    aVar.a0(new tls() { // from class: ok01
                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            String description;
                            String title;
                            String description2;
                            String title2;
                            String description3;
                            String title3;
                            int i32 = i3;
                            Text.Constant constant = null;
                            dqg dqgVar2 = dqgVar;
                            switch (i32) {
                                case 0:
                                    kk01 kk01Var = (kk01) obj3;
                                    yr01 yr01Var2 = (yr01) ((cqg) dqgVar2).a;
                                    ResultStatus resultStatus3 = yr01Var2.a;
                                    TransferResultPageEntity transferResultPageEntity2 = yr01Var2.b;
                                    Text.Constant i4 = (transferResultPageEntity2 == null || (title = transferResultPageEntity2.getTitle()) == null) ? null : g8e.i(Text.Companion, title);
                                    TransferResultPageEntity transferResultPageEntity3 = yr01Var2.b;
                                    if (transferResultPageEntity3 != null && (description = transferResultPageEntity3.getDescription()) != null) {
                                        constant = g8e.i(Text.Companion, description);
                                    }
                                    Text.Constant constant2 = constant;
                                    TransferResultPageEntity transferResultPageEntity4 = yr01Var2.b;
                                    if (transferResultPageEntity4 == null) {
                                        transferResultPageEntity4 = kk01Var.a;
                                    }
                                    return kk01.a(kk01Var, transferResultPageEntity4, resultStatus3, null, null, i4, constant2, null, yr01Var2.d, yr01Var2.e, yr01Var2.f, null, 4506);
                                case 1:
                                    kk01 kk01Var2 = (kk01) obj3;
                                    yr01 yr01Var3 = (yr01) ((cqg) dqgVar2).a;
                                    ResultStatus resultStatus4 = yr01Var3.a;
                                    TransferResultPageEntity transferResultPageEntity5 = yr01Var3.b;
                                    Text.Constant i5 = (transferResultPageEntity5 == null || (title2 = transferResultPageEntity5.getTitle()) == null) ? null : g8e.i(Text.Companion, title2);
                                    TransferResultPageEntity transferResultPageEntity6 = yr01Var3.b;
                                    if (transferResultPageEntity6 != null && (description2 = transferResultPageEntity6.getDescription()) != null) {
                                        constant = g8e.i(Text.Companion, description2);
                                    }
                                    Text.Constant constant3 = constant;
                                    TransferResultPageEntity transferResultPageEntity7 = yr01Var3.b;
                                    if (transferResultPageEntity7 == null) {
                                        transferResultPageEntity7 = kk01Var2.a;
                                    }
                                    return kk01.a(kk01Var2, transferResultPageEntity7, resultStatus4, null, null, i5, constant3, null, yr01Var3.d, yr01Var3.e, null, null, 6554);
                                default:
                                    kk01 kk01Var3 = (kk01) obj3;
                                    ResultStatus resultStatus5 = ResultStatus.FAILED;
                                    yr01 yr01Var4 = (yr01) ((cqg) dqgVar2).a;
                                    TransferResultPageEntity transferResultPageEntity8 = yr01Var4.b;
                                    Text.Constant i6 = (transferResultPageEntity8 == null || (title3 = transferResultPageEntity8.getTitle()) == null) ? null : g8e.i(Text.Companion, title3);
                                    TransferResultPageEntity transferResultPageEntity9 = yr01Var4.b;
                                    if (transferResultPageEntity9 != null && (description3 = transferResultPageEntity9.getDescription()) != null) {
                                        constant = g8e.i(Text.Companion, description3);
                                    }
                                    return kk01.a(kk01Var3, null, resultStatus5, null, null, i6, constant, null, yr01Var4.d, yr01Var4.e, null, null, 6555);
                            }
                        }
                    });
                    break;
                case 5:
                case 6:
                case 7:
                    ji01Var.a();
                    a.c0(aVar, c1x0Var, new is01(transferMainResultScreenParams.getMoney().getAmount()));
                    if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams)) {
                        if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams)) {
                            if ((transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams)) {
                                str2 = "e_payment";
                            }
                            if (transferResultPageEntity != null) {
                                aVar.p0(bh01Var);
                                final int i4 = 2;
                                aVar.a0(new tls() { // from class: ok01
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        String description;
                                        String title;
                                        String description2;
                                        String title2;
                                        String description3;
                                        String title3;
                                        int i32 = i4;
                                        Text.Constant constant = null;
                                        dqg dqgVar2 = dqgVar;
                                        switch (i32) {
                                            case 0:
                                                kk01 kk01Var = (kk01) obj3;
                                                yr01 yr01Var2 = (yr01) ((cqg) dqgVar2).a;
                                                ResultStatus resultStatus3 = yr01Var2.a;
                                                TransferResultPageEntity transferResultPageEntity2 = yr01Var2.b;
                                                Text.Constant i42 = (transferResultPageEntity2 == null || (title = transferResultPageEntity2.getTitle()) == null) ? null : g8e.i(Text.Companion, title);
                                                TransferResultPageEntity transferResultPageEntity3 = yr01Var2.b;
                                                if (transferResultPageEntity3 != null && (description = transferResultPageEntity3.getDescription()) != null) {
                                                    constant = g8e.i(Text.Companion, description);
                                                }
                                                Text.Constant constant2 = constant;
                                                TransferResultPageEntity transferResultPageEntity4 = yr01Var2.b;
                                                if (transferResultPageEntity4 == null) {
                                                    transferResultPageEntity4 = kk01Var.a;
                                                }
                                                return kk01.a(kk01Var, transferResultPageEntity4, resultStatus3, null, null, i42, constant2, null, yr01Var2.d, yr01Var2.e, yr01Var2.f, null, 4506);
                                            case 1:
                                                kk01 kk01Var2 = (kk01) obj3;
                                                yr01 yr01Var3 = (yr01) ((cqg) dqgVar2).a;
                                                ResultStatus resultStatus4 = yr01Var3.a;
                                                TransferResultPageEntity transferResultPageEntity5 = yr01Var3.b;
                                                Text.Constant i5 = (transferResultPageEntity5 == null || (title2 = transferResultPageEntity5.getTitle()) == null) ? null : g8e.i(Text.Companion, title2);
                                                TransferResultPageEntity transferResultPageEntity6 = yr01Var3.b;
                                                if (transferResultPageEntity6 != null && (description2 = transferResultPageEntity6.getDescription()) != null) {
                                                    constant = g8e.i(Text.Companion, description2);
                                                }
                                                Text.Constant constant3 = constant;
                                                TransferResultPageEntity transferResultPageEntity7 = yr01Var3.b;
                                                if (transferResultPageEntity7 == null) {
                                                    transferResultPageEntity7 = kk01Var2.a;
                                                }
                                                return kk01.a(kk01Var2, transferResultPageEntity7, resultStatus4, null, null, i5, constant3, null, yr01Var3.d, yr01Var3.e, null, null, 6554);
                                            default:
                                                kk01 kk01Var3 = (kk01) obj3;
                                                ResultStatus resultStatus5 = ResultStatus.FAILED;
                                                yr01 yr01Var4 = (yr01) ((cqg) dqgVar2).a;
                                                TransferResultPageEntity transferResultPageEntity8 = yr01Var4.b;
                                                Text.Constant i6 = (transferResultPageEntity8 == null || (title3 = transferResultPageEntity8.getTitle()) == null) ? null : g8e.i(Text.Companion, title3);
                                                TransferResultPageEntity transferResultPageEntity9 = yr01Var4.b;
                                                if (transferResultPageEntity9 != null && (description3 = transferResultPageEntity9.getDescription()) != null) {
                                                    constant = g8e.i(Text.Companion, description3);
                                                }
                                                return kk01.a(kk01Var3, null, resultStatus5, null, null, i6, constant, null, yr01Var4.d, yr01Var4.e, null, null, 6555);
                                        }
                                    }
                                });
                                break;
                            } else {
                                aVar.p0(dh01.b);
                                aVar.a0(new rmy0(28, dqgVar, transferResultPageEntity));
                                break;
                            }
                        } else {
                            str2 = "hcs";
                        }
                    } else {
                        str2 = "c2g";
                    }
                    aVar.K.a.a(gtu0.a("external_transaction.transfer.success", str2));
                    if (transferResultPageEntity != null) {
                    }
                    break;
                default:
                    w511.b();
                    return null;
            }
        }
        return zy11.a;
    }
}
