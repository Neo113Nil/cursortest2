package defpackage;

import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class xgh implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ xgh(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int x;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                qz90 qz90Var = (qz90) obj;
                zgh.d(qz90Var);
                qz90Var.b("GP001");
                return zy11Var;
            case 1:
                qz90 qz90Var2 = (qz90) obj;
                qz90Var2.e(zyh0.PlusPay_Error_PaymentTimeout_Title);
                qz90Var2.d(zyh0.PlusPay_Error_PaymentTimeout_Subtitle);
                qz90Var2.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var2.b("P003");
                return zy11Var;
            case 2:
                qz90 qz90Var3 = (qz90) obj;
                qz90Var3.e(zyh0.PlusPay_Error_AuthorizationReject_Title);
                qz90Var3.d(zyh0.PlusPay_Error_AuthorizationReject_Subtitle);
                qz90Var3.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var3.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var3.b("P014");
                return zy11Var;
            case 3:
                qz90 qz90Var4 = (qz90) obj;
                qz90Var4.e(zyh0.PlusPay_Error_LimitExceeded_Title);
                qz90Var4.d(zyh0.PlusPay_Error_LimitExceeded_Subtitle);
                qz90Var4.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var4.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var4.b("P034");
                return zy11Var;
            case 4:
                qz90 qz90Var5 = (qz90) obj;
                qz90Var5.e(zyh0.PlusPay_Error_RestrictedCard_Title);
                qz90Var5.d(zyh0.PlusPay_Error_RestrictedCard_Subtitle);
                qz90Var5.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var5.b("P008");
                return zy11Var;
            case 5:
                qz90 qz90Var6 = (qz90) obj;
                zgh.d(qz90Var6);
                qz90Var6.b("GP002");
                return zy11Var;
            case 6:
                qz90 qz90Var7 = (qz90) obj;
                zgh.d(qz90Var7);
                qz90Var7.b("GP003");
                return zy11Var;
            case 7:
                qz90 qz90Var8 = (qz90) obj;
                qz90Var8.e(zyh0.PlusPay_Error_TransactionNotPermitted_Title);
                qz90Var8.d(zyh0.PlusPay_Error_TransactionNotPermitted_Subtitle);
                qz90Var8.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var8.b("P016");
                return zy11Var;
            case 8:
                qz90 qz90Var9 = (qz90) obj;
                qz90Var9.e(zyh0.PlusPay_Error_NotEnoughFunds_Title);
                qz90Var9.d(zyh0.PlusPay_Error_NotEnoughFunds_Subtitle);
                qz90Var9.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var9.b("GP005");
                return zy11Var;
            case 9:
                qz90 qz90Var10 = (qz90) obj;
                qz90Var10.e(zyh0.PlusPay_Error_Connection_Title);
                qz90Var10.d(zyh0.PlusPay_Error_Connection_Subtitle);
                qz90Var10.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var10.b("F520");
                return zy11Var;
            case 10:
                qz90 qz90Var11 = (qz90) obj;
                zgh.d(qz90Var11);
                qz90Var11.b("GP004");
                return zy11Var;
            case 11:
                qz90 qz90Var12 = (qz90) obj;
                qz90Var12.e(zyh0.PlusPay_Error_Blacklisted_Title);
                qz90Var12.d(zyh0.PlusPay_Error_Blacklisted_Subtitle);
                qz90Var12.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var12.b("P005");
                return zy11Var;
            case 12:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.g = true;
                return zy11Var;
            case 13:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM user_roles WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var);
                    T0.close();
                    break;
                } finally {
                }
            case 14:
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("DELETE FROM cache_chat_edit_history_timestamps WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var2);
                    T0.close();
                    break;
                } finally {
                }
            case 15:
                oll0 oll0Var3 = (oll0) obj;
                T0 = oll0Var3.T0("DELETE FROM messages WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var3);
                    T0.close();
                    break;
                } finally {
                }
            case 16:
                oll0 oll0Var4 = (oll0) obj;
                T0 = oll0Var4.T0("DELETE FROM personal_mentions WHERE chat_id\n         NOT IN ( SELECT chat_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var4);
                    T0.close();
                    break;
                } finally {
                }
            case 17:
                oll0 oll0Var5 = (oll0) obj;
                T0 = oll0Var5.T0("DELETE FROM chat_events WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var5);
                    T0.close();
                    break;
                } finally {
                }
            case 18:
                oll0 oll0Var6 = (oll0) obj;
                T0 = oll0Var6.T0("DELETE FROM threads_view WHERE thread_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var6);
                    T0.close();
                    break;
                } finally {
                }
            case 19:
                oll0 oll0Var7 = (oll0) obj;
                T0 = oll0Var7.T0("DELETE FROM chat_miniapp WHERE chat_id\n         NOT IN ( SELECT chat_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var7);
                    T0.close();
                    break;
                } finally {
                }
            case 20:
                oll0 oll0Var8 = (oll0) obj;
                T0 = oll0Var8.T0("DELETE FROM cache_timeline_versions WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var8);
                    T0.close();
                    break;
                } finally {
                }
            case 21:
                oll0 oll0Var9 = (oll0) obj;
                T0 = oll0Var9.T0("DELETE FROM message_translations WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var9);
                    T0.close();
                    break;
                } finally {
                }
            case 22:
                oll0 oll0Var10 = (oll0) obj;
                T0 = oll0Var10.T0("DELETE FROM filter_chats_cross_ref WHERE chat_id\n         NOT IN ( SELECT chat_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var10);
                    T0.close();
                    break;
                } finally {
                }
            case 23:
                oll0 oll0Var11 = (oll0) obj;
                T0 = oll0Var11.T0("DELETE FROM member_rights WHERE internal_chat_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var11);
                    T0.close();
                    break;
                } finally {
                }
            case 24:
                oll0 oll0Var12 = (oll0) obj;
                T0 = oll0Var12.T0("DELETE FROM members WHERE internal_chat_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var12);
                    T0.close();
                    break;
                } finally {
                }
            case 25:
                oll0 oll0Var13 = (oll0) obj;
                T0 = oll0Var13.T0("DELETE FROM threads_messages_view WHERE thread_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var13);
                    T0.close();
                    break;
                } finally {
                }
            case 26:
                oll0 oll0Var14 = (oll0) obj;
                T0 = oll0Var14.T0("DELETE FROM chat_notifications WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var14);
                    T0.close();
                    break;
                } finally {
                }
            case 27:
                oll0 oll0Var15 = (oll0) obj;
                T0 = oll0Var15.T0("DELETE FROM chat_translations WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var15);
                    T0.close();
                    break;
                } finally {
                }
            case 28:
                oll0 oll0Var16 = (oll0) obj;
                T0 = oll0Var16.T0("DELETE FROM messages_view WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ");
                try {
                    T0.q();
                    x = jx81.x(oll0Var16);
                    T0.close();
                    break;
                } finally {
                }
            default:
                oll0 oll0Var17 = (oll0) obj;
                try {
                    oll0Var17.T0("DELETE FROM chat_metadata WHERE chat_internal_id\n         NOT IN ( SELECT chat_internal_id FROM chats )\n    ").q();
                    x = jx81.x(oll0Var17);
                    break;
                } finally {
                }
        }
        return Integer.valueOf(x);
    }

    public /* synthetic */ xgh(zgh zghVar, int i) {
        this.a = i;
    }
}
