package defpackage;

/* loaded from: classes.dex */
public class ugg extends bfu {
    public static final s40 m = new s40(22);
    public final q4r k = new q4r(0);
    public boolean l = false;

    @Override // defpackage.bfu
    public final void onCleared() {
        super.onCleared();
        q4r q4rVar = this.k;
        int i = q4rVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            sgg sggVar = (sgg) q4rVar.f(i2);
            dzw dzwVar = sggVar.l;
            dzwVar.a();
            dzwVar.c = true;
            tgg tggVar = sggVar.n;
            if (tggVar != null) {
                sggVar.j(tggVar);
            }
            sgg sggVar2 = dzwVar.a;
            if (sggVar2 == null) {
                xq0.q("No listener register");
                return;
            }
            if (sggVar2 != sggVar) {
                xq0.x("Attempting to unregister the wrong listener");
                return;
            }
            dzwVar.a = null;
            if (tggVar != null) {
                boolean z = tggVar.b;
            }
            dzwVar.d = true;
            dzwVar.b = false;
            dzwVar.c = false;
            dzwVar.e = false;
        }
        int i3 = q4rVar.c;
        Object[] objArr = q4rVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        q4rVar.c = 0;
    }
}
