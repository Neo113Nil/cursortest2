package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class tum0 implements bvm0 {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;

    public tum0(String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.bvm0
    public final String a() {
        return this.d;
    }

    @Override // defpackage.bvm0
    public final FormattedText b() {
        return this.a;
    }

    @Override // defpackage.bvm0
    public final FormattedText c() {
        return this.b;
    }

    @Override // defpackage.bvm0
    public final String getBackgroundColor() {
        return this.c;
    }
}
