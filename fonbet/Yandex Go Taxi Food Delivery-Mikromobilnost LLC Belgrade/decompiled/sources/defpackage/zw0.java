package defpackage;

import androidx.compose.ui.semantics.f;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.api.entities.TransactionsListShimmerType;
import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import com.ybsdk.feature.transactions.api.entities.TransactionsState;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.c;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;
import ru.yandex.taxi.summary.promotions.repository.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class zw0 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ zw0(bx5 bx5Var, String str, wj00 wj00Var, boolean z, us20 us20Var) {
        this.w = bx5Var;
        this.b = str;
        this.x = wj00Var;
        this.c = z;
        this.y = us20Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        nif nifVar;
        TransactionsListShimmerType transactionsListShimmerType;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = false;
        z = false;
        boolean z2 = this.c;
        nif nifVar2 = null;
        final int i2 = 1;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                final n81 n81Var = (n81) obj4;
                final tls tlsVar = (tls) obj3;
                v81 v81Var = (v81) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, (String) obj5);
                if (z2) {
                    f.p(mnq0Var, 0);
                    f.f(mnq0Var, null, new ax0(tlsVar, v81Var, 2));
                }
                if (n81Var != null) {
                    if (n81Var instanceof l81) {
                        String str = ((l81) n81Var).c;
                        final int i3 = z ? 1 : 0;
                        nifVar = new nif(new sls() { // from class: cx0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = i3;
                                n81 n81Var2 = n81Var;
                                tls tlsVar2 = tlsVar;
                                switch (i4) {
                                    case 0:
                                        tlsVar2.invoke(((l81) n81Var2).b);
                                        break;
                                    default:
                                        tlsVar2.invoke(((m81) n81Var2).b);
                                        break;
                                }
                                return Boolean.TRUE;
                            }
                        }, str);
                    } else {
                        if (!(n81Var instanceof m81)) {
                            w511.b();
                            return null;
                        }
                        nifVar = new nif(new sls() { // from class: cx0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = i2;
                                n81 n81Var2 = n81Var;
                                tls tlsVar2 = tlsVar;
                                switch (i4) {
                                    case 0:
                                        tlsVar2.invoke(((l81) n81Var2).b);
                                        break;
                                    default:
                                        tlsVar2.invoke(((m81) n81Var2).b);
                                        break;
                                }
                                return Boolean.TRUE;
                            }
                        }, ((m81) n81Var).a);
                    }
                    nifVar2 = nifVar;
                }
                f.m(mnq0Var, scc.h(nifVar2));
                return zy11Var;
            case 1:
                bx5 bx5Var = (bx5) obj4;
                String str2 = (String) obj5;
                return bx5Var.b((String) bx5Var.n.invoke(), str2, null, ((ynz0) obj).b, (wj00) obj3, this.c, null, null).g(new q(20, bx5Var, (us20) obj2, str2));
            case 2:
                oz40 oz40Var = ((sz40) obj5).c;
                oz40 oz40Var2 = (oz40) obj4;
                m3u0 m3u0Var = (m3u0) obj3;
                m3u0 m3u0Var2 = (m3u0) obj2;
                m2k0 m2k0Var = (m2k0) obj;
                float f = 0.8f;
                float f2 = 1.0f;
                m2k0Var.u(!z2 ? ((Number) m3u0Var.getValue()).floatValue() : ((Boolean) oz40Var.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z2) {
                    f = ((Number) m3u0Var.getValue()).floatValue();
                } else if (((Boolean) oz40Var.getValue()).booleanValue()) {
                    f = 1.0f;
                }
                m2k0Var.v(f);
                if (!z2) {
                    f2 = ((Number) m3u0Var2.getValue()).floatValue();
                } else if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                    f2 = 0.0f;
                }
                m2k0Var.b(f2);
                m2k0Var.B(((jw01) oz40Var2.getValue()).a);
                return zy11Var;
            case 3:
                String str3 = (String) obj5;
                SummaryPromotionsResponse.a aVar = (SummaryPromotionsResponse.a) obj;
                boolean c = e.c(aVar, (Map) obj4, (List) obj3, (List) obj2, z2);
                List list = aVar.o;
                if (c) {
                    if (list.isEmpty() ? true : list.contains(str3)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                TransactionsFeedFilterEntity transactionsFeedFilterEntity = (TransactionsFeedFilterEntity) obj3;
                ppl pplVar = (ppl) obj2;
                ff01 ff01Var = (ff01) obj;
                TransactionsState transactionsState = TransactionsState.LOADING;
                ((c) obj5).getClass();
                int i4 = nf01.a[((TransactionsLoadType) obj4).ordinal()];
                if (i4 == 1) {
                    transactionsListShimmerType = TransactionsListShimmerType.SHORT;
                } else {
                    if (i4 != 2 && i4 != 3) {
                        w511.b();
                        return null;
                    }
                    transactionsListShimmerType = TransactionsListShimmerType.FULL;
                }
                return ff01.a(ff01Var, transactionsFeedFilterEntity, null, pplVar, transactionsState, this.c, transactionsListShimmerType, null, 0, 1550);
        }
    }

    public /* synthetic */ zw0(c cVar, TransactionsLoadType transactionsLoadType, TransactionsFeedFilterEntity transactionsFeedFilterEntity, ppl pplVar, boolean z) {
        this.b = cVar;
        this.w = transactionsLoadType;
        this.x = transactionsFeedFilterEntity;
        this.y = pplVar;
        this.c = z;
    }

    public /* synthetic */ zw0(String str, boolean z, n81 n81Var, tls tlsVar, v81 v81Var) {
        this.b = str;
        this.c = z;
        this.w = n81Var;
        this.x = tlsVar;
        this.y = v81Var;
    }

    public /* synthetic */ zw0(e eVar, Map map, List list, List list2, boolean z, String str) {
        this.w = map;
        this.x = list;
        this.y = list2;
        this.c = z;
        this.b = str;
    }

    public /* synthetic */ zw0(boolean z, sz40 sz40Var, oz40 oz40Var, tx01 tx01Var, tx01 tx01Var2) {
        this.c = z;
        this.b = sz40Var;
        this.w = oz40Var;
        this.x = tx01Var;
        this.y = tx01Var2;
    }
}
