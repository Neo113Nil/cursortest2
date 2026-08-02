package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.model.TextModel$Style;
import com.yandex.go.shortcuts.view.adapter.model.model.TextModel$TextColor;

/* loaded from: classes13.dex */
public final class qry0 implements e6v {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final TextModel$Style e;
    public final TextModel$TextColor f;
    public final String g;

    public qry0(String str, int i, TextModel$TextColor textModel$TextColor) {
        TextModel$Style textModel$Style = TextModel$Style.LIGHT;
        this.a = str;
        this.b = i;
        this.c = 16;
        this.d = 2;
        this.e = textModel$Style;
        this.f = textModel$TextColor;
        this.g = "";
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.g;
    }
}
