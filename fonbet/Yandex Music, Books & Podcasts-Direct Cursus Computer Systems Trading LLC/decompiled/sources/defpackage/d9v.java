package defpackage;

/* loaded from: classes4.dex */
public final class d9v {
    public final mm6 a;
    public final aqi b;
    public rar c;

    public d9v(mm6 mm6Var, aqi aqiVar) {
        aqiVar.getClass();
        this.a = mm6Var;
        this.b = aqiVar;
    }

    public final void a(m6v m6vVar, boolean z) {
        rar rarVar = this.c;
        rar rarVar2 = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        if (m6vVar.j) {
            ssg.a(4, "WaveWordsWidgetAiLabelAnimationHelper", "play label animation for ".concat(m6vVar.a), null);
            rarVar2 = x97.y(this.a, null, null, new z11(z, this, rarVar2, 22), 3);
        } else {
            this.b.setValue(Boolean.FALSE);
        }
        this.c = rarVar2;
    }

    public final void b() {
        this.b.setValue(Boolean.FALSE);
        rar rarVar = this.c;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.c = null;
    }
}
