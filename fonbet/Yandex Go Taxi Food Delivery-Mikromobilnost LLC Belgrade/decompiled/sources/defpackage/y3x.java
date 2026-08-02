package defpackage;

import com.yandex.xplat.common.JSONItemKind;
import com.yandex.xplat.common.JSONParsingError;

/* loaded from: classes2.dex */
public abstract class y3x {
    public final JSONItemKind a;

    public y3x(JSONItemKind jSONItemKind) {
        this.a = jSONItemKind;
    }

    public final wj00 a() {
        if (this.a == JSONItemKind.map) {
            return (wj00) this;
        }
        return null;
    }

    public final wj00 b() {
        wj00 a = a();
        JSONItemKind jSONItemKind = JSONItemKind.map;
        String c = mbb1.c(this.a);
        String c2 = mbb1.c(jSONItemKind);
        JSONParsingError jSONParsingError = new JSONParsingError(oyr.t(b64.v("Failed to cast JSONItem of kind \"", c, "\" to kind \"", c2, "\", json: \""), mbb1.a(this), "\""), null);
        if (a != null) {
            return a;
        }
        throw jSONParsingError;
    }

    public final ktu0 c() {
        JSONItemKind jSONItemKind = JSONItemKind.string;
        JSONItemKind jSONItemKind2 = this.a;
        ktu0 ktu0Var = jSONItemKind2 == jSONItemKind ? (ktu0) this : null;
        JSONParsingError jSONParsingError = new JSONParsingError(oyr.t(b64.v("Failed to cast JSONItem of kind \"", mbb1.c(jSONItemKind2), "\" to kind \"", mbb1.c(jSONItemKind), "\", json: \""), mbb1.a(this), "\""), null);
        if (ktu0Var != null) {
            return ktu0Var;
        }
        throw jSONParsingError;
    }
}
