package ru.yandex.taxi.utils;

import android.text.Editable;
import android.text.Html;
import android.text.style.StrikethroughSpan;
import defpackage.cvu0;
import kotlin.Metadata;
import org.xml.sax.XMLReader;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\r\"\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/utils/HtmlTagHandler;", "Landroid/text/Html$TagHandler;", "<init>", "()V", "Landroid/text/Editable;", "output", "", "mark", "Lzy11;", "start", "(Landroid/text/Editable;Ljava/lang/Object;)V", "Ljava/lang/Class;", "kind", "", "replaces", "end", "(Landroid/text/Editable;Ljava/lang/Class;[Ljava/lang/Object;)V", "text", "getLast", "(Landroid/text/Editable;Ljava/lang/Class;)Ljava/lang/Object;", "", "opening", "", "tag", "Lorg/xml/sax/XMLReader;", "xmlReader", "handleTag", "(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V", "a", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HtmlTagHandler implements Html.TagHandler {

    public static final class a {
    }

    private final void end(Editable output, Class<?> kind, Object... replaces) {
        Object last = getLast(output, kind);
        if (last == null) {
            return;
        }
        int spanStart = output.getSpanStart(last);
        int length = output.length();
        output.removeSpan(last);
        if (spanStart != length) {
            for (Object obj : replaces) {
                output.setSpan(obj, spanStart, length, 33);
            }
        }
    }

    private final Object getLast(Editable text, Class<?> kind) {
        Object[] spans = text.getSpans(0, text.length(), kind);
        if (spans.length == 0) {
            return null;
        }
        for (int length = spans.length; length > 0; length--) {
            int i = length - 1;
            if (text.getSpanFlags(spans[i]) == 17) {
                return spans[i];
            }
        }
        return null;
    }

    private final void start(Editable output, Object mark) {
        int length = output.length();
        output.setSpan(mark, length, length, 17);
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
        if (opening) {
            if (cvu0.t(tag, "s", true) || cvu0.t(tag, "strike", true)) {
                start(output, new a());
                return;
            }
            return;
        }
        if (cvu0.t(tag, "s", true) || cvu0.t(tag, "strike", true)) {
            end(output, a.class, Boolean.FALSE, new StrikethroughSpan());
        }
    }
}
