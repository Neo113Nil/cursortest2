package defpackage;

import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.home.repository.api.model.panel.ShortcutStyledText;
import com.yandex.plus.home.repository.api.model.panel.ShortcutTextIcon;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class qdg {
    public final q7d0 a;

    public qdg(q7d0 q7d0Var) {
        this.a = q7d0Var;
    }

    public static ArrayList b(List list) {
        List<ShortcutTextIcon> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ShortcutTextIcon shortcutTextIcon : list2) {
            arrayList.add(new tld0(shortcutTextIcon.getId(), shortcutTextIcon.getIconUrl(), shortcutTextIcon.getFallbackText()));
        }
        return arrayList;
    }

    public final ArrayList a(List list) {
        List<ShortcutStyledText> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ShortcutStyledText shortcutStyledText : list2) {
            PlusThemedColor<PlusColor> textColor = shortcutStyledText.getTextColor();
            Integer num = null;
            h2d0 f = textColor != null ? this.a.f(textColor) : null;
            f2d0 f2d0Var = f instanceof f2d0 ? (f2d0) f : null;
            String id = shortcutStyledText.getId();
            String text = shortcutStyledText.getText();
            if (f2d0Var != null) {
                num = Integer.valueOf(f2d0Var.a);
            }
            arrayList.add(new uld0(id, text, num, shortcutStyledText.isBold(), shortcutStyledText.isItalic()));
        }
        return arrayList;
    }
}
