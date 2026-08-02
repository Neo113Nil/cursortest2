package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lz8v0;", "Lw8v0;", "Companion", "x8v0", "y8v0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class z8v0 extends w8v0 {
    public static final y8v0 Companion = new y8v0();
    public final FormattedText a;
    public final FormattedText b;
    public final n7v c;
    public final rl2 d;
    public final String e;
    public final t1k f;
    public final String g;
    public final zzs h;
    public final String i;

    public z8v0(int i, FormattedText formattedText, FormattedText formattedText2, n7v n7vVar, rl2 rl2Var, String str, t1k t1kVar, String str2, zzs zzsVar, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = n7vVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = rl2Var;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = t1kVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = zzsVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
    }

    @Override // defpackage.w8v0
    /* renamed from: a, reason: from getter */
    public final rl2 getD() {
        return this.d;
    }

    @Override // defpackage.w8v0
    /* renamed from: b, reason: from getter */
    public final n7v getC() {
        return this.c;
    }

    @Override // defpackage.w8v0
    /* renamed from: c, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    @Override // defpackage.w8v0
    /* renamed from: d, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    public z8v0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = "";
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
