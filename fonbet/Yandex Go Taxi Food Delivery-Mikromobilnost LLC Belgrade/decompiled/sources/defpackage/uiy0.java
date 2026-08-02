package defpackage;

import android.text.Editable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.semantics.d;
import com.yandex.messaging.views.TextSwitcherView;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.surge.dialog.TextBlockView;

/* loaded from: classes6.dex */
public final /* synthetic */ class uiy0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ uiy0(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 onBlockClickListener$lambda$0;
        zy11 onSelectorClickListener$lambda$0;
        int i;
        hry0 b;
        bmt0 bmt0Var;
        boolean outAnimation$lambda$5$lambda$2;
        zy11 _init_$lambda$0;
        ull0 T0;
        int i2 = this.a;
        int i3 = 2;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        switch (i2) {
            case 0:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                listItemComponent.setTrailMode(2);
                listItemComponent.setBackgroundResource(dzg0.bg_transparent_ripple);
                return listItemComponent;
            case 1:
                return new viy0((ListItemComponent) obj, r10);
            case 2:
                return new c6r0((TextBlockView) obj, i3);
            case 3:
                onBlockClickListener$lambda$0 = TextBlockView.onBlockClickListener$lambda$0((kky0) obj);
                return onBlockClickListener$lambda$0;
            case 4:
                onSelectorClickListener$lambda$0 = TextBlockView.onSelectorClickListener$lambda$0((nky0) obj);
                return onSelectorClickListener$lambda$0;
            case 5:
                tny0 tny0Var = (tny0) obj;
                String str = tny0Var.g.b;
                long j = tny0Var.f;
                int i5 = asy0.c;
                int i6 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                if (i6 > 0) {
                    ftn d = nhb1.d();
                    if (d != null) {
                        int b2 = d.b(i6 - 1, str);
                        if (b2 >= 0) {
                            i = b2;
                        } else if (i6 > 0) {
                            i = Character.offsetByCodePoints(str, i6, -1);
                        }
                        if (i == -1) {
                        }
                    } else if (i6 > 0) {
                        i = Character.offsetByCodePoints(str, i6, -1);
                        if (i == -1) {
                            return null;
                        }
                        return new csh(((int) (tny0Var.f & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - i, 0);
                    }
                }
                i = -1;
                if (i == -1) {
                }
            case 6:
                tny0 tny0Var2 = (tny0) obj;
                String str2 = tny0Var2.g.b;
                long j2 = tny0Var2.f;
                int i7 = asy0.c;
                int b3 = nhb1.b((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), str2);
                if (b3 != -1) {
                    return new csh(0, b3 - ((int) (tny0Var2.f & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                }
                return null;
            case 7:
                tny0 tny0Var3 = (tny0) obj;
                Integer e = tny0Var3.e();
                if (e == null) {
                    return null;
                }
                int intValue = e.intValue();
                long j3 = tny0Var3.f;
                int i8 = asy0.c;
                return new csh(((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - intValue, 0);
            case 8:
                tny0 tny0Var4 = (tny0) obj;
                Integer d2 = tny0Var4.d();
                if (d2 == null) {
                    return null;
                }
                int intValue2 = d2.intValue();
                long j4 = tny0Var4.f;
                int i9 = asy0.c;
                return new csh(0, intValue2 - ((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            case 9:
                tny0 tny0Var5 = (tny0) obj;
                Integer c = tny0Var5.c();
                if (c == null) {
                    return null;
                }
                int intValue3 = c.intValue();
                long j5 = tny0Var5.f;
                int i10 = asy0.c;
                return new csh(((int) (j5 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - intValue3, 0);
            case 10:
                tny0 tny0Var6 = (tny0) obj;
                Integer b4 = tny0Var6.b();
                if (b4 == null) {
                    return null;
                }
                int intValue4 = b4.intValue();
                long j6 = tny0Var6.f;
                int i11 = asy0.c;
                return new csh(0, intValue4 - ((int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            case 11:
                List list = (List) obj;
                return new yny0(((Boolean) list.get(1)).booleanValue() ? Orientation.Vertical : Orientation.Horizontal, ((Float) list.get(0)).floatValue());
            case 12:
                viy0 viy0Var = new viy0((ListItemComponent) obj, i4);
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) viy0Var.R);
                listItemComponent2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent2.setTrailCompanionTextAlignment(2);
                listItemComponent2.setTrailTextSize(tje.r(mrg0.component_text_size_subtitle, listItemComponent2.getContext()));
                listItemComponent2.setTrailTextStyle(3);
                return viy0Var;
            case 13:
                qwd qwdVar = wqy0.a;
                return zy11Var;
            case 14:
                qwd qwdVar2 = vqy0.a;
                return zy11Var;
            case 15:
                ik2 ik2Var = (ik2) obj;
                Object obj2 = ik2Var.a;
                if (!(obj2 instanceof kky) || (b = ((kky) obj2).b()) == null || (b.a == null && b.b == null && b.c == null && b.d == null)) {
                    return scc.c(ik2Var);
                }
                hry0 b5 = ((kky) ik2Var.a).b();
                if (b5 == null || (bmt0Var = b5.a) == null) {
                    bmt0Var = new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65535);
                }
                return scc.c(ik2Var, new ik2(bmt0Var, ik2Var.b, ik2Var.c));
            case 16:
                ((mnq0) obj).a(d.B, zy11Var);
                return zy11Var;
            case 17:
                return Boolean.TRUE;
            case 18:
                outAnimation$lambda$5$lambda$2 = TextSwitcherView.setOutAnimation$lambda$5$lambda$2((View) obj);
                return Boolean.valueOf(outAnimation$lambda$5$lambda$2);
            case 19:
                return (Spanned) obj;
            case 20:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
            case 21:
                return String.valueOf(0.5f);
            case 22:
                _init_$lambda$0 = ThousandSeparatorTextWatcher._init_$lambda$0((Editable) obj);
                return _init_$lambda$0;
            case 23:
                T0 = ((oll0) obj).T0("SELECT thread_id FROM threads_view");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(T0.Y1(0));
                    }
                    return arrayList;
                } finally {
                }
            case 24:
                try {
                    ((oll0) obj).T0("DELETE FROM threads_messages_view").q();
                    return zy11Var;
                } finally {
                }
            case 25:
                T0 = ((oll0) obj).T0("\n        SELECT SUM(unseen)\n        FROM(\n            SELECT threads_view.unseen\n            FROM threads_view\n            LEFT JOIN chat_organization_cross_ref ON threads_view.parent_internal_id=chat_organization_cross_ref.chat_internal_id\n            LEFT JOIN organizations ON organizations.organization_id=chat_organization_cross_ref.organization_id\n            WHERE threads_view.is_hidden=0\n                AND (coalesce(chat_organization_cross_ref.organization_id, 0)=0 OR organizations.is_public=1)\n            GROUP BY threads_view.thread_id\n        )\n        LIMIT 1\n    ");
                try {
                    r10 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(r10);
                } finally {
                }
            case 26:
                T0 = ((oll0) obj).T0("SELECT SUM(unseen) FROM threads_view WHERE is_hidden=0");
                try {
                    r10 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(r10);
                } finally {
                }
            case 27:
                T0 = ((oll0) obj).T0("\n        SELECT\n            COUNT(CASE WHEN unseen > 0 THEN 1 ELSE NULL END) as unread_threads_count\n        FROM (\n            SELECT threads_view.unseen\n            FROM threads_view\n            LEFT JOIN chat_organization_cross_ref ON threads_view.parent_internal_id = chat_organization_cross_ref.chat_internal_id\n            LEFT JOIN organizations ON organizations.organization_id = chat_organization_cross_ref.organization_id\n            WHERE threads_view.is_hidden = 0\n                AND (coalesce(chat_organization_cross_ref.organization_id, 0) = 0 OR organizations.is_public = 1)\n            GROUP BY threads_view.thread_id\n        )\n    ");
                try {
                    if (T0.q()) {
                        return new ezy0((int) T0.getLong(0));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.yandex.messaging.core.db.chats.ThreadViewEntity.ThreadUnseenReadInfo>.");
                } finally {
                }
            case 28:
                T0 = ((oll0) obj).T0("\n        SELECT COUNT(CASE WHEN unseen > 0 THEN 1 ELSE NULL END) as unread_threads_count\n        FROM threads_view\n        WHERE threads_view.is_hidden = 0\n    ");
                try {
                    if (T0.q()) {
                        return new ezy0((int) T0.getLong(0));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.yandex.messaging.core.db.chats.ThreadViewEntity.ThreadUnseenReadInfo>.");
                } finally {
                }
            default:
                try {
                    ((oll0) obj).T0("DELETE FROM threads_view").q();
                    return zy11Var;
                } finally {
                }
        }
    }
}
