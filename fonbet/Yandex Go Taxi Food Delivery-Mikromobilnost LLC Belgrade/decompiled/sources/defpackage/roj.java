package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;

/* loaded from: classes5.dex */
public final class roj implements pre {
    public final String a;
    public final sbv b;
    public final String c;
    public final FormattedText d;
    public final sbv e;
    public final r9x0 f;
    public final x2s g;

    public roj(String str, sbv sbvVar, String str2, FormattedText formattedText, sbv sbvVar2, r9x0 r9x0Var, x2s x2sVar) {
        this.a = str;
        this.b = sbvVar;
        this.c = str2;
        this.d = formattedText;
        this.e = sbvVar2;
        this.f = r9x0Var;
        this.g = x2sVar;
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "discount";
    }
}
