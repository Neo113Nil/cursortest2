package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.places.impl.ui.common.chip.ChipView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.ybsdk.core.navigation.cicerone.Screen;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes2.dex */
public final /* synthetic */ class teb implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ teb(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02db  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ull0 T0;
        int i;
        ArrayList arrayList;
        Integer valueOf;
        int i2;
        int i3;
        Integer valueOf2;
        int i4;
        wj00 wj00Var;
        ct20 ct20Var;
        wj00 wj00Var2;
        wx90 wx90Var;
        int i5 = 11;
        int i6 = 16;
        int i7 = 3;
        switch (this.a) {
            case 0:
                T0 = ((oll0) obj).T0("SELECT * FROM chats_view WHERE is_hidden = 0");
                try {
                    int r = eja1.r(T0, "chat_internal_id");
                    int r2 = eja1.r(T0, "chat_id");
                    int r3 = eja1.r(T0, "namespace");
                    int r4 = eja1.r(T0, "url");
                    int r5 = eja1.r(T0, "unseen");
                    int r6 = eja1.r(T0, "addressee_id");
                    int r7 = eja1.r(T0, "average_response_time");
                    int r8 = eja1.r(T0, "first_unseen_row");
                    int r9 = eja1.r(T0, "flags");
                    int r10 = eja1.r(T0, "rights");
                    int r11 = eja1.r(T0, "mute");
                    int r12 = eja1.r(T0, "mute_mentions");
                    int r13 = eja1.r(T0, "is_member");
                    int r14 = eja1.r(T0, "is_blocked");
                    int r15 = eja1.r(T0, "is_subscriber");
                    int r16 = eja1.r(T0, "participants_count");
                    int r17 = eja1.r(T0, "can_call");
                    int r18 = eja1.r(T0, "is_admin");
                    int r19 = eja1.r(T0, "is_phone_required_for_write");
                    int r20 = eja1.r(T0, "current_profile_id");
                    int r21 = eja1.r(T0, "is_transient");
                    int r22 = eja1.r(T0, "sort_time");
                    int r23 = eja1.r(T0, "display_name");
                    int r24 = eja1.r(T0, "is_pinned");
                    int r25 = eja1.r(T0, "is_hidden");
                    int r26 = eja1.r(T0, "min_message_timestamp");
                    int r27 = eja1.r(T0, "last_seq_no");
                    int r28 = eja1.r(T0, "last_message_timestamp");
                    int r29 = eja1.r(T0, "events");
                    int r30 = eja1.r(T0, "has_guests");
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        long j = T0.getLong(r);
                        String Y1 = T0.Y1(r2);
                        if (T0.isNull(r3)) {
                            i = r14;
                            arrayList = arrayList2;
                            valueOf = null;
                        } else {
                            i = r14;
                            arrayList = arrayList2;
                            valueOf = Integer.valueOf((int) T0.getLong(r3));
                        }
                        String Y12 = T0.isNull(r4) ? null : T0.Y1(r4);
                        int i8 = (int) T0.getLong(r5);
                        String Y13 = T0.isNull(r6) ? null : T0.Y1(r6);
                        Long valueOf3 = T0.isNull(r7) ? null : Long.valueOf(T0.getLong(r7));
                        if (T0.isNull(r8)) {
                            i2 = r2;
                            i3 = r3;
                            valueOf2 = null;
                        } else {
                            i2 = r2;
                            i3 = r3;
                            valueOf2 = Integer.valueOf((int) T0.getLong(r8));
                        }
                        long j2 = T0.getLong(r9);
                        int i9 = (int) T0.getLong(r10);
                        boolean z = ((int) T0.getLong(r11)) != 0;
                        boolean z2 = ((int) T0.getLong(r12)) != 0;
                        boolean z3 = ((int) T0.getLong(r13)) != 0;
                        int i10 = i;
                        int i11 = r4;
                        boolean z4 = ((int) T0.getLong(i10)) != 0;
                        int i12 = r15;
                        int i13 = r5;
                        boolean z5 = ((int) T0.getLong(i12)) != 0;
                        int i14 = r16;
                        int i15 = (int) T0.getLong(i14);
                        int i16 = r17;
                        boolean z6 = ((int) T0.getLong(i16)) != 0;
                        int i17 = r18;
                        boolean z7 = ((int) T0.getLong(i17)) != 0;
                        r18 = i17;
                        int i18 = r19;
                        boolean z8 = ((int) T0.getLong(i18)) != 0;
                        int i19 = r20;
                        String Y14 = T0.isNull(i19) ? null : T0.Y1(i19);
                        r19 = i18;
                        r20 = i19;
                        int i20 = r21;
                        boolean z9 = ((int) T0.getLong(i20)) != 0;
                        int i21 = r22;
                        long j3 = T0.getLong(i21);
                        int i22 = r23;
                        String Y15 = T0.Y1(i22);
                        int i23 = r;
                        r22 = i21;
                        r23 = i22;
                        int i24 = r24;
                        boolean z10 = ((int) T0.getLong(i24)) != 0;
                        int i25 = r25;
                        boolean z11 = ((int) T0.getLong(i25)) != 0;
                        int i26 = r26;
                        long j4 = T0.getLong(i26);
                        int i27 = r27;
                        long j5 = T0.getLong(i27);
                        int i28 = r28;
                        long j6 = T0.getLong(i28);
                        r28 = i28;
                        int i29 = r29;
                        long j7 = T0.getLong(i29);
                        r29 = i29;
                        int i30 = r30;
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(new udb(j, Y1, valueOf, Y12, i8, Y13, valueOf3, valueOf2, j2, i9, z, z2, z3, z4, z5, i15, z6, z7, z8, Y14, z9, j3, Y15, z10, z11, j4, j5, j6, j7, ((int) T0.getLong(i30)) != 0));
                        r5 = i13;
                        r15 = i12;
                        r16 = i14;
                        r17 = i16;
                        r30 = i30;
                        r2 = i2;
                        r = i23;
                        r21 = i20;
                        r24 = i24;
                        r25 = i25;
                        r26 = i26;
                        r14 = i10;
                        arrayList2 = arrayList3;
                        r27 = i27;
                        r4 = i11;
                        r3 = i3;
                    }
                    return arrayList2;
                } finally {
                }
            case 1:
                T0 = ((oll0) obj).T0("SELECT SUM(unseen) FROM chats_view WHERE (is_member = 1 OR is_subscriber = 1) AND is_hidden=0");
                try {
                    i4 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(i4);
                } finally {
                }
            case 2:
                T0 = ((oll0) obj).T0("SELECT COUNT(*) FROM chats_view WHERE is_hidden != 0");
                try {
                    long j8 = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j8);
                } finally {
                }
            case 3:
                T0 = ((oll0) obj).T0("SELECT SUM(unseen) FROM chats_view WHERE (is_member = 1 OR is_subscriber = 1)  AND is_blocked <> 1 AND mute <> 1  AND is_hidden=0");
                try {
                    i4 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(i4);
                } finally {
                }
            case 4:
                T0 = ((oll0) obj).T0("\n        SELECT\n            COUNT(CASE WHEN unseen > 0 THEN 1 ELSE NULL END) as unread_chats_count,\n            COUNT(CASE WHEN unseen > 0 AND mute = 1 THEN 1 ELSE NULL END) as unread_muted_chats_count\n        FROM (\n            SELECT chats_view.unseen, chats_view.mute, coalesce(chat_organization_cross_ref.organization_id, 0) as org_id\n            FROM chats_view\n            LEFT JOIN chat_organization_cross_ref ON chats_view.chat_internal_id = chat_organization_cross_ref.chat_internal_id\n            LEFT JOIN organizations ON organizations.organization_id = chat_organization_cross_ref.organization_id\n            WHERE (org_id = 0 OR organizations.is_public = 1) AND (is_member = 1 OR is_subscriber = 1) AND  chats_view.is_hidden = 0 AND is_blocked <> 1\n            GROUP BY chats_view.chat_id\n        )\n        ");
                try {
                    if (T0.q()) {
                        return new sdb((int) T0.getLong(0), (int) T0.getLong(1));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.yandex.messaging.core.db.chats.ChatViewEntity.ChatUnseenReadInfo>.");
                } finally {
                }
            case 5:
                T0 = ((oll0) obj).T0("\n        SELECT SUM(unseen)\n        FROM(\n            SELECT unseen, coalesce(chat_organization_cross_ref.organization_id, 0) as org_id FROM chats_view\n            LEFT JOIN chat_organization_cross_ref ON chats_view.chat_internal_id=chat_organization_cross_ref.chat_internal_id\n            LEFT JOIN organizations ON organizations.organization_id=chat_organization_cross_ref.organization_id\n            WHERE (org_id = 0 OR organizations.is_public = 1) AND (is_member = 1 OR is_subscriber = 1) AND is_hidden=0\n            AND is_blocked <> 1 AND mute <> 1 GROUP BY chats_view.chat_id )\n        LIMIT 1\n    ");
                try {
                    i4 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(i4);
                } finally {
                }
            case 6:
                T0 = ((oll0) obj).T0("\n    SELECT\n        COUNT(CASE WHEN unseen > 0 THEN 1 ELSE NULL END) as unread_chats_count,\n        COUNT(CASE WHEN unseen > 0 AND mute = 1 THEN 1 ELSE NULL END) as unread_muted_chats_count\n    FROM chats_view\n    WHERE (is_member = 1 OR is_subscriber = 1) AND is_hidden=0\n    ");
                try {
                    if (T0.q()) {
                        return new sdb((int) T0.getLong(0), (int) T0.getLong(1));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.yandex.messaging.core.db.chats.ChatViewEntity.ChatUnseenReadInfo>.");
                } finally {
                }
            case 7:
                y3x y3xVar = (y3x) obj;
                whj whjVar = (whj) mbb1.d(y3xVar, new lhj(i7)).d();
                wj00 b = y3xVar.b();
                return new zeb(whjVar.a, whjVar.b, whjVar.c, b.p("payment_method_full"), b.h("rrn"), b.h("redirect_3ds_url"), whjVar.d, b.h("member_id"), b.h("binding_result"), b.h("processing_payment_form_url"), b.h("qrc_id"));
            case 8:
                wj00 b2 = ((y3x) obj).b();
                String p = b2.p(ACSPConstants.STATUS);
                String h = b2.h(AuthSdkActivity.RESPONSE_TYPE_CODE);
                String h2 = b2.h(Constants.KEY_MESSAGE);
                y3x d = b2.d("challenge_info");
                if (d == null || (wj00Var = d.a()) == null) {
                    wj00Var = null;
                }
                if (wj00Var != null) {
                    String p2 = wj00Var.p("method");
                    switch (p2.hashCode()) {
                        case 52226:
                            if (p2.equals("3ds")) {
                                ct20Var = (ct20) mbb1.d(wj00Var, new jv8(10)).a();
                                break;
                            }
                            ct20Var = (y89) mbb1.d(wj00Var, new jv8(i6)).a();
                            if (ct20Var == null) {
                                ct20Var = new ct20(p2);
                                break;
                            }
                            break;
                        case 98915:
                            if (p2.equals("cvv")) {
                                ct20Var = (ct20) mbb1.d(wj00Var, new jv8(i5)).a();
                                break;
                            }
                            ct20Var = (y89) mbb1.d(wj00Var, new jv8(i6)).a();
                            if (ct20Var == null) {
                            }
                            break;
                        case 113665:
                            if (p2.equals("sbp")) {
                                ct20Var = (ct20) mbb1.d(wj00Var, new jv8(14)).a();
                                break;
                            }
                            ct20Var = (y89) mbb1.d(wj00Var, new jv8(i6)).a();
                            if (ct20Var == null) {
                            }
                            break;
                        case 114009:
                            if (p2.equals("sms")) {
                                ct20Var = (ct20) mbb1.d(wj00Var, new jv8(15)).a();
                                break;
                            }
                            ct20Var = (y89) mbb1.d(wj00Var, new jv8(i6)).a();
                            if (ct20Var == null) {
                            }
                            break;
                        case 115962956:
                            if (p2.equals("random_amt")) {
                                ct20Var = (ct20) mbb1.d(wj00Var, new jv8(12)).a();
                                break;
                            }
                            ct20Var = (y89) mbb1.d(wj00Var, new jv8(i6)).a();
                            if (ct20Var == null) {
                            }
                            break;
                        case 860692922:
                            if (p2.equals("device_challenge")) {
                                ct20Var = (ct20) mbb1.d(wj00Var, new nni(i6)).a();
                                break;
                            }
                            ct20Var = (y89) mbb1.d(wj00Var, new jv8(i6)).a();
                            if (ct20Var == null) {
                            }
                            break;
                        case 1499577324:
                            if (p2.equals("system_redirect")) {
                                ct20Var = (ct20) mbb1.d(wj00Var, new jv8(13)).a();
                                break;
                            }
                            ct20Var = (y89) mbb1.d(wj00Var, new jv8(i6)).a();
                            if (ct20Var == null) {
                            }
                            break;
                        default:
                            ct20Var = (y89) mbb1.d(wj00Var, new jv8(i6)).a();
                            if (ct20Var == null) {
                            }
                            break;
                    }
                } else {
                    ct20Var = null;
                }
                b2.h("external_status");
                b2.h("external_details");
                return new ggb(p, h, h2, ct20Var);
            case 9:
                return ((TaxiOrder) obj).h.getB();
            case 10:
                y3x y3xVar2 = (y3x) obj;
                whj whjVar2 = (whj) mbb1.d(y3xVar2, new lhj(i7)).d();
                wj00 b3 = y3xVar2.b();
                y3x d2 = b3.d("challenge_info");
                if (d2 == null || (wj00Var2 = d2.a()) == null) {
                    wj00Var2 = null;
                }
                if (wj00Var2 != null) {
                    tyj0 d3 = mbb1.d(wj00Var2, new bd90(i5));
                    wx90Var = (wx90) (d3.b() ? null : d3.a());
                } else {
                    wx90Var = null;
                }
                return new chb(whjVar2.a, whjVar2.b, whjVar2.c, b3.h("redirect_3ds_url"), b3.h("processing_payment_form_url"), whjVar2.d, wx90Var, b3.h("qrc_id"));
            case 11:
                wj00 b4 = ((y3x) obj).b().l("verification").b();
                return new cib(b4.p(ACSPConstants.STATUS), b4.h("status_code"), b4.h("3ds_url"), b4.h("authorize_rrn"), b4.h("authorize_rc"));
            case 12:
                return Boolean.valueOf(((PlusPayAdditionalOffer) obj).isSelected());
            case 13:
                return ((PlusPayAdditionalOffer) obj).getOffersToReplace();
            case 14:
                return ((wmb) obj).a.a;
            case 15:
                return ((wmb) obj).c;
            case 16:
                return ((wmb) obj).a.a;
            case 17:
                yfd yfdVar = (yfd) obj;
                zy11 zy11Var = zy11.a;
                ((agd) yfdVar).c = new g92(2, zy11Var);
                agd agdVar = (agd) yfdVar;
                agdVar.e = new j01(0);
                p5d.a.getClass();
                agdVar.g = p5d.c;
                return zy11Var;
            case 18:
                return ((blb) obj).a();
            case 19:
                return ((tnb) obj).a;
            case 20:
                return zy11.a;
            case 21:
                ce90 ce90Var = (ce90) ((dd11) obj);
                ce90Var.b = false;
                qje.P(ce90Var).D();
                return Boolean.FALSE;
            case 22:
                return new ChipView(((ViewGroup) obj).getContext());
            case 23:
                u5d.a.getClass();
                ((m6y) ((u6y) obj)).f(3, null, av0.C, u5d.c);
                return zy11.a;
            case 24:
                ((Boolean) obj).getClass();
                return zy11.a;
            case 25:
                return ((Screen) obj).getScreenKey();
            case 26:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                int u = tje.u(16, listItemComponent.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(u, 0, u, 0);
                listItemComponent.setLayoutParams(marginLayoutParams);
                listItemComponent.setLeadFrameMinimumWidth(tje.u(56, listItemComponent.getContext()));
                listItemComponent.setSubTitleEllipsizeMode(1);
                listItemComponent.setSubtitleMaxLines(3);
                listItemComponent.setTrailMode(2);
                return listItemComponent;
            case 27:
                return new omc((ListItemComponent) obj, 0);
            case 28:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                listItemComponent2.setBackgroundResource(dzg0.bg_transparent_ripple);
                listItemComponent2.setSubTitleEllipsizeMode(1);
                listItemComponent2.setSubtitleMaxLines(3);
                listItemComponent2.setTrailMode(2);
                return listItemComponent2;
            default:
                return new ca1((ListItemComponent) obj, 7);
        }
    }
}
