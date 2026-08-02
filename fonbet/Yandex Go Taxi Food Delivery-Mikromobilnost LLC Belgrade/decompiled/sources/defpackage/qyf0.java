package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes15.dex */
public final class qyf0 extends lxy {
    @Override // defpackage.lxy
    public final utn f(ViewGroup viewGroup) {
        int i = olh0.msg_vh_spinner;
        Object systemService = viewGroup.getContext().getSystemService("layout_inflater");
        if (systemService == null) {
            ny61.t("null cannot be cast to non-null type android.view.LayoutInflater");
            return null;
        }
        View inflate = ((LayoutInflater) systemService).inflate(i, viewGroup, false);
        if (inflate != null) {
            return new utn(inflate);
        }
        ny61.t("null cannot be cast to non-null type V of splitties.views.LayoutInflaterKt.inflate");
        return null;
    }
}
