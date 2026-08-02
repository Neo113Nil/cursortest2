package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.repository.api.model.offers.RichText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class sed0 {
    public static final PlusPayRichText a(q3k0 q3k0Var) {
        PlusPayRichText.Item link;
        String str = q3k0Var.a;
        List<p3k0> list = q3k0Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (p3k0 p3k0Var : list) {
            int i = red0.a[p3k0Var.b.ordinal()];
            if (i == 1) {
                String str2 = p3k0Var.a;
                String str3 = p3k0Var.d;
                if (str3 == null) {
                    throw new PlusPayParseException(new gzj0(new Exception("There must be not null link for rich text item with type LINK")));
                }
                link = new PlusPayRichText.Item.Link((String) null, str2, p3k0Var.c, str3, 1, (DefaultConstructorMarker) null);
            } else if (i == 2) {
                link = new PlusPayRichText.Item.Highlight((String) null, p3k0Var.a, p3k0Var.c, 1, (DefaultConstructorMarker) null);
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                link = new PlusPayRichText.Item.Strikethrough((String) null, p3k0Var.a, p3k0Var.c, 1, (DefaultConstructorMarker) null);
            }
            arrayList.add(link);
        }
        return new PlusPayRichText(str, arrayList);
    }

    public static final PlusPayRichText b(RichText richText) {
        PlusPayRichText.Item icon;
        String text = richText.getText();
        List<RichText.Item> items = richText.getItems();
        ArrayList arrayList = new ArrayList(tcc.n(items, 10));
        for (RichText.Item item : items) {
            if (item instanceof RichText.Item.Link) {
                RichText.Item.Link link = (RichText.Item.Link) item;
                icon = new PlusPayRichText.Item.Link(link.getAltText(), link.getKey(), link.getData(), link.getLink());
            } else if (item instanceof RichText.Item.Highlight) {
                RichText.Item.Highlight highlight = (RichText.Item.Highlight) item;
                icon = new PlusPayRichText.Item.Highlight(highlight.getAltText(), highlight.getKey(), highlight.getData());
            } else if (item instanceof RichText.Item.TextColor) {
                RichText.Item.TextColor textColor = (RichText.Item.TextColor) item;
                icon = new PlusPayRichText.Item.TextColor(textColor.getAltText(), textColor.getKey(), textColor.getData(), textColor.getColor());
            } else if (item instanceof RichText.Item.StrikeThrough) {
                RichText.Item.StrikeThrough strikeThrough = (RichText.Item.StrikeThrough) item;
                icon = new PlusPayRichText.Item.Strikethrough(strikeThrough.getAltText(), strikeThrough.getKey(), strikeThrough.getData());
            } else {
                if (!(item instanceof RichText.Item.Icon)) {
                    w511.b();
                    return null;
                }
                RichText.Item.Icon icon2 = (RichText.Item.Icon) item;
                icon = new PlusPayRichText.Item.Icon(icon2.getAltText(), icon2.getKey(), (String) null, icon2.getImage(), 4, (DefaultConstructorMarker) null);
            }
            arrayList.add(icon);
        }
        return new PlusPayRichText(text, arrayList);
    }
}
