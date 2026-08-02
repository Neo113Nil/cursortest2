package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.navigator.settings.BaseSettingsModalView;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class y95 implements ebr0 {
    public final /* synthetic */ BaseSettingsModalView a;

    public y95(BaseSettingsModalView baseSettingsModalView) {
        this.a = baseSettingsModalView;
    }

    @Override // defpackage.ebr0
    public final void Y3(y27 y27Var, y27 y27Var2) {
        per0 binding;
        per0 binding2;
        BaseSettingsModalView baseSettingsModalView = this.a;
        binding = baseSettingsModalView.getBinding();
        a5b1.a(binding.b, y27Var);
        binding2 = baseSettingsModalView.getBinding();
        a5b1.a(binding2.e, y27Var2);
    }

    @Override // defpackage.ebr0
    public final void q(Drawable drawable, Drawable drawable2) {
        per0 binding;
        per0 binding2;
        int i = v2h0.bg_top_round;
        BaseSettingsModalView baseSettingsModalView = this.a;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, vng.t(i, baseSettingsModalView.getContext())});
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable2, vng.t(v2h0.bg_bottom_round, baseSettingsModalView.getContext())});
        binding = baseSettingsModalView.getBinding();
        cvw.e0(binding.g, layerDrawable, null, Integer.valueOf(tje.u(8, baseSettingsModalView.getContext())), 10);
        binding2 = baseSettingsModalView.getBinding();
        cvw.e0(binding2.h, layerDrawable2, null, Integer.valueOf(tje.u(8, baseSettingsModalView.getContext())), 10);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        ler0 adapter;
        mer0 mer0Var;
        d6r0 d6r0Var = (d6r0) obj;
        List list = d6r0Var.a;
        ThemeType themeType = d6r0Var.b;
        List<g5r0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (g5r0 g5r0Var : list2) {
            if (g5r0Var instanceof a5r0) {
                mer0Var = new p57((a5r0) g5r0Var, themeType);
            } else if (g5r0Var instanceof e5r0) {
                mer0Var = new blz0((e5r0) g5r0Var, themeType);
            } else if (g5r0Var instanceof z4r0) {
                mer0Var = new vt((z4r0) g5r0Var, themeType);
            } else if (g5r0Var instanceof d5r0) {
                mer0Var = new s5r0((d5r0) g5r0Var, themeType);
            } else if (g5r0Var instanceof b5r0) {
                mer0Var = new whb((b5r0) g5r0Var, themeType);
            } else if (g5r0Var instanceof f5r0) {
                mer0Var = new iy31((f5r0) g5r0Var, themeType);
            } else {
                if (!jl40.l(g5r0Var, c5r0.a)) {
                    w511.b();
                    return;
                }
                mer0Var = n5r0.a;
            }
            arrayList.add(mer0Var);
        }
        BaseSettingsModalView baseSettingsModalView = this.a;
        adapter = baseSettingsModalView.getAdapter();
        adapter.submitList(arrayList, null);
        OneShotPreDrawListener.add(baseSettingsModalView, new uz(4, baseSettingsModalView));
    }
}
