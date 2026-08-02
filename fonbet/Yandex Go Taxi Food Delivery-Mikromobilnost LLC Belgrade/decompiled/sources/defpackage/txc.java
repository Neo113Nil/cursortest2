package defpackage;

import com.yandex.go.lootbox.api.domain.analytics.LootBoxAnalytics$ButtonType;
import com.yandex.go.lootbox.impl.presentation.modal.c;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class txc implements ays, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ txc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ays
    public final void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((vqb) obj2).invoke(obj);
                break;
            case 1:
                ((gau) obj2).invoke(obj);
                break;
            case 2:
                c cVar = (c) obj2;
                cVar.getClass();
                cVar.Lg(LootBoxAnalytics$ButtonType.GIFT, ((eqz) obj).e);
                break;
            case 3:
                fr70 fr70Var = (fr70) obj;
                rr70 rr70Var = (rr70) obj2;
                if (!(fr70Var instanceof ar70)) {
                    rr70Var.getClass();
                    if (!(fr70Var instanceof zq70) && !(fr70Var instanceof br70) && !(fr70Var instanceof cr70) && !(fr70Var instanceof dr70) && !(fr70Var instanceof er70)) {
                        w511.b();
                        break;
                    }
                } else {
                    rr70Var.Kg(((ar70) fr70Var).c);
                    break;
                }
                break;
            case 4:
                ((ub60) obj2).invoke(obj);
                break;
            case 5:
                ((f9e0) obj2).c((d8e0) obj);
                break;
            case 6:
                ((iin0) obj2).invoke(obj);
                break;
            case 7:
                ((iix0) obj2).M.d((uhx0) obj);
                break;
            default:
                ((jl01) obj2).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (vqb) obj;
            case 1:
                return (gau) obj;
            case 2:
                return new FunctionReferenceImpl(1, (c) obj, c.class, "onGiftClick", "onGiftClick(Lcom/yandex/go/lootbox/api/domain/entities/lootbox/gift/LootBoxGiftEntity;)V", 0);
            case 3:
                return new FunctionReferenceImpl(1, (rr70) obj, rr70.class, "onButtonClick", "onButtonClick(Lcom/yandex/go/taxi/order/promotions/modal_default/model/OrderDefaultModalAdapterItem;)V", 0);
            case 4:
                return (ub60) obj;
            case 5:
                return new FunctionReferenceImpl(1, (f9e0) obj, f9e0.class, "onItemClicked", "onItemClicked(Lru/yandex/taxi/modal/popup/adapter/PopupDialogModalAdapterItem;)V", 0);
            case 6:
                return (iin0) obj;
            case 7:
                return new FunctionReferenceImpl(1, (iix0) obj, iix0.class, "onItemClicked", "onItemClicked(Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;)V", 0);
            default:
                return (jl01) obj;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
