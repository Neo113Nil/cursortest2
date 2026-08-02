package defpackage;

import androidx.fragment.app.t;

/* loaded from: classes4.dex */
public final class n74 {
    public static final /* synthetic */ s9f[] f;
    public final t a;
    public b84 b;
    public final m74 c = new m74(l84.c, this, 0);
    public final m74 d = new m74(c5b.a, this, 1);
    public final m74 e = new m74(this);

    static {
        opi opiVar = new opi(n74.class, "selection", "getSelection()Lru/yandex/music/cast/picker/api/data/CastSelection;", 0);
        ern.a.getClass();
        f = new s9f[]{opiVar, new opi(n74.class, "items", "getItems()Ljava/util/List;", 0), new opi(n74.class, "explanation", "getExplanation()Lru/yandex/music/cast/picker/api/data/CastExplanation;", 0)};
    }

    public n74(t tVar) {
        this.a = tVar;
    }

    public final void a() {
        b84 b84Var = this.b;
        if (b84Var != null) {
            b84Var.g.a();
        }
        this.b = null;
        c5b c5bVar = c5b.a;
        c5bVar.getClass();
        this.d.setValue(this, f[1], c5bVar);
    }
}
