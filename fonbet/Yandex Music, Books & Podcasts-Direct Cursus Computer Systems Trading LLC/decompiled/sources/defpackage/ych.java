package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ych extends won {
    public final /* synthetic */ int a = 1;

    public ych(adh adhVar) {
        fut.c(null);
        fut.c(null);
    }

    @Override // defpackage.won
    public void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        switch (this.a) {
            case 1:
                rect.getClass();
                view.getClass();
                kpnVar.getClass();
                rect.left = RecyclerView.Z(view) > 0 ? -r1.k(R.dimen.pay_sdk_product_logo_overlapping, view) : 0;
                break;
            default:
                super.f(rect, view, recyclerView, kpnVar);
                break;
        }
    }

    @Override // defpackage.won
    public void g(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        switch (this.a) {
            case 0:
                if ((recyclerView.getAdapter() instanceof mbw) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ ych() {
    }
}
