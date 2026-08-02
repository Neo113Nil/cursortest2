package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;
import ru.yandex.taxi.summary.requirements.list.ui.SpecialNeedsModalView;

/* loaded from: classes6.dex */
public final class rot0 implements sot0 {
    public final /* synthetic */ SpecialNeedsModalView a;

    public rot0(SpecialNeedsModalView specialNeedsModalView) {
        this.a = specialNeedsModalView;
    }

    @Override // defpackage.sot0
    public final void Hb(Drawable drawable) {
        xot0 binding;
        binding = this.a.getBinding();
        LinearLayout linearLayout = binding.b;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        xw31.E(linearLayout, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
        Drawable mutate = tje.y(f0h0.bg_rounded_24dp_modal_view, linearLayout.getContext()).mutate();
        mutate.setTint(qje.t(xng0.bgFloating, linearLayout.getContext()));
        linearLayout.setBackground(new LayerDrawable(new Drawable[]{drawable, mutate}));
    }

    @Override // defpackage.sot0
    public final void V8() {
        this.a.dismiss();
    }

    @Override // defpackage.sot0
    public final void ib(String str, String str2) {
        lpo lpoVar;
        lpoVar = this.a.adapter;
        Iterator it = lpoVar.a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (jl40.l(((zot0) it.next()).g, str)) {
                break;
            } else {
                i++;
            }
        }
        zot0 zot0Var = (zot0) a.S(i, lpoVar.a);
        if (zot0Var == null) {
            return;
        }
        yot0 yot0Var = zot0Var.e;
        lpoVar.a.set(i, new zot0(zot0Var.a, zot0Var.b, zot0Var.c, zot0Var.d, yot0Var != null ? new yot0(yot0Var.a, yot0Var.b, yot0Var.c, yot0Var.d, str2, yot0Var.f) : null, zot0Var.f, zot0Var.g, zot0Var.h));
        lpoVar.notifyItemChanged(i, zy11.a);
    }

    @Override // defpackage.sot0
    public final void n1(String str, String str2, String str3, String str4) {
        xot0 binding;
        xot0 binding2;
        xot0 binding3;
        xot0 binding4;
        xot0 binding5;
        xot0 binding6;
        xot0 binding7;
        SpecialNeedsModalView specialNeedsModalView = this.a;
        binding = specialNeedsModalView.getBinding();
        binding.h.setTitle(str);
        binding2 = specialNeedsModalView.getBinding();
        binding2.j.setVisibility(str2.length() > 0 ? 0 : 8);
        binding3 = specialNeedsModalView.getBinding();
        binding3.j.setTitle(str2);
        binding4 = specialNeedsModalView.getBinding();
        binding4.c.setText(str3);
        if (evu0.J(str4)) {
            binding7 = specialNeedsModalView.getBinding();
            binding7.g.setVisibility(8);
        } else {
            binding5 = specialNeedsModalView.getBinding();
            binding5.g.setVisibility(0);
            binding6 = specialNeedsModalView.getBinding();
            binding6.g.setText(str4);
        }
    }

    @Override // defpackage.sot0
    public final void sd(ArrayList arrayList) {
        lpo lpoVar;
        lpoVar = this.a.adapter;
        lpoVar.a = new ArrayList(arrayList);
        lpoVar.notifyDataSetChanged();
    }

    @Override // defpackage.sot0
    public final boolean w8() {
        lpo lpoVar;
        lpoVar = this.a.adapter;
        ArrayList arrayList = lpoVar.a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((zot0) it.next()).c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sot0
    public final void z4(Bitmap bitmap) {
        xot0 binding;
        xot0 binding2;
        xot0 binding3;
        xot0 binding4;
        xot0 binding5;
        SpecialNeedsModalView specialNeedsModalView = this.a;
        binding = specialNeedsModalView.getBinding();
        binding.f.setShimmering(false);
        binding2 = specialNeedsModalView.getBinding();
        binding2.f.setBackgroundTintList(null);
        if (bitmap == null) {
            binding3 = specialNeedsModalView.getBinding();
            binding3.e.setVisibility(8);
        } else {
            binding4 = specialNeedsModalView.getBinding();
            binding4.e.setVisibility(0);
            binding5 = specialNeedsModalView.getBinding();
            binding5.e.setImageBitmap(bitmap);
        }
    }
}
