package bo.app;

import com.braze.models.outgoing.BrazeProperties;

/* loaded from: classes3.dex */
public final class a4 extends ig {
    public final String f;

    public a4(String str, BrazeProperties brazeProperties, y8 y8Var) {
        super(brazeProperties, y8Var);
        this.f = str;
    }

    @Override // bo.app.v9
    public final String a() {
        return "custom_event";
    }
}
