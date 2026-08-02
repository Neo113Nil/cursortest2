package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class zi30 extends mao {
    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(uqh0.mt_main_fallback_view, viewGroup, false);
        int i = reh0.icon;
        if (((GoImageView) cma1.O(i, inflate)) != null) {
            i = reh0.title;
            if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                return (GoConstraintLayout) inflate;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
