package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.support.ui.support_menu.adapter.a;
import com.ybsdk.core.utils.ext.view.FontSpan;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class z2v0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ z2v0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return new RobotoTextView(this.b, null, 0, 6, null);
            case 1:
                return new FrameLayout(context);
            case 2:
                ListItemComponent listItemComponent = new ListItemComponent(this.b, null, 0, 6, null);
                listItemComponent.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                listItemComponent.setLeadImagePadding(tje.r(mrg0.go_design_s_space, listItemComponent.getContext()));
                xw31.F(listItemComponent, Integer.valueOf(tje.r(mrg0.go_design_s_space, listItemComponent.getContext())), null, null, null);
                xw31.F(listItemComponent, null, null, Integer.valueOf(tje.r(mrg0.go_design_s_space, listItemComponent.getContext())), null);
                listItemComponent.setLeadImage(new ColorDrawable(0));
                listItemComponent.setMinHeight(tje.r(mrg0.list_item_component_size_L, listItemComponent.getContext()));
                return listItemComponent;
            case 3:
                int i2 = a.T;
                ListItemComponent listItemComponent2 = new ListItemComponent(this.b, null, 0, 6, null);
                listItemComponent2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                listItemComponent2.setBackground(vng.t(dzg0.bg_transparent_ripple, listItemComponent2.getContext()));
                listItemComponent2.setTrailMode(2);
                return listItemComponent2;
            case 4:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 5:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 6:
                Spanned spanned = (Spanned) obj;
                StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class);
                SpannableString valueOf = SpannableString.valueOf(spanned);
                Typeface b = wuj0.b(x4h0.ys_text_medium, context);
                if (b != null) {
                    ArrayList arrayList = new ArrayList();
                    for (StyleSpan styleSpan : styleSpanArr) {
                        if (styleSpan.getStyle() == 1) {
                            arrayList.add(styleSpan);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        StyleSpan styleSpan2 = (StyleSpan) it.next();
                        int spanStart = spanned.getSpanStart(styleSpan2);
                        int spanEnd = spanned.getSpanEnd(styleSpan2);
                        valueOf.removeSpan(styleSpan2);
                        valueOf.setSpan(new FontSpan(b), spanStart, spanEnd, 33);
                    }
                }
                return valueOf;
            case 7:
                return new RobotoTextView(this.b, null, 0, 6, null);
            case 8:
                return new RobotoTextView(this.b, null, 0, 6, null);
            default:
                return new ListItemComponent(this.b, null, 0, 6, null);
        }
    }
}
