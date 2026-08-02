package defpackage;

import androidx.compose.ui.semantics.f;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.messaging.core.net.entities.FoldersBucket;
import com.ybsdk.core.transfer.utils.InternationalPhoneInputTextWatcher;
import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;
import com.ybsdk.feature.divkit.internal.domain.hmac.HmacResolveError;
import com.ybsdk.feature.divkit.internal.domain.hmac.a;
import com.ybsdk.feature.divkit.internal.domain.hmac.b;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final /* synthetic */ class vsq implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ vsq(b bVar, String str) {
        this.a = 9;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g processInput$lambda$1;
        String str;
        ArrayList arrayList = null;
        r4 = null;
        Long l = null;
        boolean z = false;
        int i = 1;
        switch (this.a) {
            case 0:
                String str2 = this.b;
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                TaxiOrderTipsState taxiOrderTipsState = new TaxiOrderTipsState(str2, diz0.a(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT, str2), 6);
                taxiOrder.getClass();
                synchronized (taxiOrder) {
                    TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                    TaxiOrderFeedback taxiOrderFeedback = taxiOrderLocalData.W;
                    taxiOrderFeedback.getClass();
                    taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, null, null, taxiOrderTipsState, null, 191), false, null, false, null, null, null, -1, 16711679);
                }
                return zy11.a;
            case 1:
                String str3 = this.b;
                ull0 T0 = ((oll0) obj).T0("SELECT folder_id, organization_id FROM folder_filter_cross_ref WHERE filter_id = ?");
                try {
                    T0.g1(1, str3);
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        arrayList2.add(new vwr(T0.Y1(0), T0.getLong(1)));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                String str4 = this.b;
                ull0 T02 = ((oll0) obj).T0("SELECT filter_id FROM filter_chats_cross_ref WHERE chat_id = ?");
                try {
                    T02.g1(1, str4);
                    ArrayList arrayList3 = new ArrayList();
                    while (T02.q()) {
                        arrayList3.add(T02.Y1(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 3:
                String str5 = this.b;
                ull0 T03 = ((oll0) obj).T0("DELETE FROM filter_chats_cross_ref WHERE chat_id = ?");
                try {
                    T03.g1(1, str5);
                    T03.q();
                    T03.close();
                    return zy11.a;
                } finally {
                }
            case 4:
                String str6 = this.b;
                FoldersBucket.OrganizationFoldersData organizationFoldersData = (FoldersBucket.OrganizationFoldersData) obj;
                List list = EmptyList.a;
                List list2 = organizationFoldersData.customFolders;
                if (list2 == null) {
                    list2 = list;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!jl40.l(((FoldersBucket.FolderData) obj2).id, str6)) {
                        arrayList4.add(obj2);
                    }
                }
                organizationFoldersData.customFolders = arrayList4;
                FoldersBucket.MainFolderConfig mainFolderConfig = organizationFoldersData.mainFolder;
                if (mainFolderConfig != null) {
                    List<String> list3 = mainFolderConfig.excludedFolderIds;
                    if (list3 != null) {
                        arrayList = new ArrayList();
                        for (Object obj3 : list3) {
                            if (!jl40.l((String) obj3, str6)) {
                                arrayList.add(obj3);
                            }
                        }
                    }
                    if (arrayList != null) {
                        list = arrayList;
                    }
                    mainFolderConfig.excludedFolderIds = list;
                }
                return zy11.a;
            case 5:
                ((isd) obj).o(this.b);
                return zy11.a;
            case 6:
                ((mss) obj).H0(this.b);
                return zy11.a;
            case 7:
                return ((at2) obj).a().a(this.b);
            case 8:
                String str7 = this.b;
                ull0 T04 = ((oll0) obj).T0("SELECT hide_timestamp FROM local_hidden_private_chats_bucket WHERE user_id = ?");
                try {
                    T04.g1(1, str7);
                    if (T04.q() && !T04.isNull(0)) {
                        l = Long.valueOf(T04.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 9:
                String str8 = this.b;
                HmacData.Item item = (HmacData.Item) obj;
                int i2 = a.b[item.getType().ordinal()];
                if (i2 == 1) {
                    String value = item.getValue();
                    if (value != null) {
                        return value;
                    }
                    throw new HmacResolveError.MissingValueItem();
                }
                if (i2 == 2) {
                    if (str8 != null) {
                        return str8;
                    }
                    throw new HmacResolveError.IdempotencyTokenUnavailable();
                }
                if (i2 == 3) {
                    throw new HmacResolveError.UnknownItemType();
                }
                w511.b();
                return null;
            case 10:
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, this.b);
                f.p(mnq0Var, 5);
                return zy11.a;
            case 11:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.l(mnq0Var2, this.b);
                f.p(mnq0Var2, 5);
                return zy11.a;
            case 12:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.l(mnq0Var3, this.b);
                f.p(mnq0Var3, 5);
                return zy11.a;
            case 13:
                ((ru.yandex.taxi.intercity.a) obj).n1(this.b);
                return zy11.a;
            case 14:
                String str9 = this.b;
                mi31 mi31Var = (mi31) obj;
                if (mi31Var.a.K0 && jl40.l(mi31Var.b, str9)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                return Boolean.valueOf(jl40.l(((mi31) obj).a.b0, this.b));
            case 16:
                processInput$lambda$1 = InternationalPhoneInputTextWatcher.processInput$lambda$1(this.b, (g) obj);
                return processInput$lambda$1;
            case 17:
                le00 le00Var = new le00(new bot(this.b), qoi0.e(bot.class));
                wy40 wy40Var = ((fe00) obj).a;
                int i3 = wy40Var.b + 1;
                Object[] objArr = wy40Var.a;
                if (objArr.length < i3) {
                    int length = objArr.length;
                    Object[] objArr2 = new Object[Math.max(i3, (length * 3) / 2)];
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    wy40Var.a = objArr2;
                }
                Object[] objArr3 = wy40Var.a;
                int i4 = wy40Var.b;
                objArr3[i4] = le00Var;
                wy40Var.b = i4 + 1;
                return zy11.a;
            case 18:
                String str10 = this.b;
                mnq0 mnq0Var4 = (mnq0) obj;
                if (str10 != null) {
                    f.l(mnq0Var4, str10);
                }
                return zy11.a;
            case 19:
                String str11 = this.b;
                mnq0 mnq0Var5 = (mnq0) obj;
                if (str11 != null) {
                    f.l(mnq0Var5, str11);
                }
                return zy11.a;
            case 20:
                String str12 = this.b;
                ull0 T05 = ((oll0) obj).T0("SELECT * FROM local_contacts WHERE locals_phone_id = ? AND locals_deleted = 0 ORDER BY locals_last_time_contacted DESC, locals_lookup_id");
                try {
                    T05.g1(1, str12);
                    int r = eja1.r(T05, "locals_upload_id");
                    int r2 = eja1.r(T05, "locals_system_id");
                    int r3 = eja1.r(T05, "locals_uploaded");
                    int r4 = eja1.r(T05, "locals_display_name");
                    int r5 = eja1.r(T05, "locals_phone");
                    int r6 = eja1.r(T05, "locals_phone_id");
                    return T05.q() ? new h2z(T05.Y1(r), T05.getLong(r2), ((int) T05.getLong(r3)) != 0, T05.isNull(r4) ? null : T05.Y1(r4), T05.Y1(r5), T05.isNull(r6) ? null : T05.Y1(r6), T05.getLong(eja1.r(T05, "locals_last_time_contacted")), ((int) T05.getLong(eja1.r(T05, "locals_dirty"))) != 0, ((int) T05.getLong(eja1.r(T05, "locals_deleted"))) != 0, T05.Y1(eja1.r(T05, "locals_lookup_id"))) : null;
                } finally {
                }
            case 21:
                String str13 = this.b;
                oll0 oll0Var = (oll0) obj;
                ull0 T06 = oll0Var.T0("UPDATE local_contacts SET locals_deleted=0 WHERE locals_upload_id=?");
                try {
                    T06.g1(1, str13);
                    T06.q();
                    int x = jx81.x(oll0Var);
                    T06.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 22:
                String str14 = this.b;
                v35 v35Var = (v35) ((ym00) obj);
                if (v35Var.e == MapObjectComponentType.IMAGE_OVERLAY) {
                    lcv lcvVar = v35Var instanceof lcv ? (lcv) v35Var : null;
                    if (lcvVar != null && (str = lcvVar.h) != null && cvu0.x(str, str14, false)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 23:
                String str15 = this.b;
                ull0 T07 = ((oll0) obj).T0("INSERT OR REPLACE INTO last_message_view VALUES (0, ?)");
                try {
                    T07.g1(1, str15);
                    T07.q();
                    T07.close();
                    return zy11.a;
                } finally {
                }
            case 24:
                ((mw20) obj).b(this.b);
                return zy11.a;
            case 25:
                ((mw20) obj).b(this.b);
                return zy11.a;
            case 26:
                ((rw20) obj).a.r(new vsq(this.b, 25));
                return zy11.a;
            case 27:
                mnq0 mnq0Var6 = (mnq0) obj;
                f.o(mnq0Var6, this.b);
                f.w(mnq0Var6, 0.0f);
                return zy11.a;
            case 28:
                f.l((mnq0) obj, this.b);
                return zy11.a;
            default:
                ((oy30) obj).a.r(new my30(this.b, i));
                return zy11.a;
        }
    }

    public /* synthetic */ vsq(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
