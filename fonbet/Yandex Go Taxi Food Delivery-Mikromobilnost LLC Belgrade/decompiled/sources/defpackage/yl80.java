package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class yl80 extends dm80 {
    public final String c;
    public final jn80 d;
    public final String e;
    public final u370 f;
    public final String g;
    public final boolean h;

    public yl80(FormattedText formattedText, String str, svj svjVar, lg80 lg80Var, String str2, String str3, u370 u370Var, boolean z, int i) {
        this(svjVar, lg80Var, str2, formattedText != null ? new in80(formattedText) : null, str, u370Var, (i & 32) != 0 ? null : str3, (i & 128) != 0 ? true : z);
    }

    public /* synthetic */ yl80(String str, String str2, String str3, svj svjVar, lg80 lg80Var, int i) {
        this(str, str2, (CharSequence) str3, svjVar, lg80Var, (u370) l76.I, (String) null, true);
    }

    public yl80(String str, String str2, CharSequence charSequence, svj svjVar, lg80 lg80Var, u370 u370Var, String str3, boolean z) {
        this(svjVar, lg80Var, str, charSequence != null ? new hn80(charSequence) : null, str3, u370Var, str2, z);
    }

    public yl80(svj svjVar, lg80 lg80Var, String str, jn80 jn80Var, String str2, u370 u370Var, String str3, boolean z) {
        super(svjVar, lg80Var);
        this.c = str;
        this.d = jn80Var;
        this.e = str2;
        this.f = u370Var;
        this.g = str3;
        this.h = z;
    }
}
