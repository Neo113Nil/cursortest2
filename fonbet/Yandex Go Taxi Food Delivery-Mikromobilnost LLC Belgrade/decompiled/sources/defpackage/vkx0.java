package defpackage;

import android.view.View;
import androidx.core.view.b;
import com.yandex.go.taxi.auction.ui.AuctionView;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final /* synthetic */ class vkx0 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ vkx0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                de3 de3Var = (de3) obj;
                if (eVar.i0 == null && !jl40.l(de3Var, ce3.a)) {
                    AuctionView auctionView = new AuctionView(eVar.d0.getContext(), null, 0, 6, null);
                    View view = eVar.a;
                    int i2 = yfh0.tariff_page_auction_view;
                    WeakHashMap weakHashMap = b.a;
                    c.w((View) rp31.d(view, i2), auctionView);
                    eVar.i0 = auctionView;
                }
                AuctionView auctionView2 = eVar.i0;
                if (auctionView2 != null) {
                    auctionView2.setState(de3Var);
                    break;
                }
                break;
            default:
                eVar.applyTheme((ThemeType) obj);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, e.class, "renderAuction", "renderAuction(Lcom/yandex/go/taxi/auction/ui/state/AuctionCardUiState;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, e.class, "applyTheme", "applyTheme(Lru/yandex/taxi/theme/ThemeType;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
