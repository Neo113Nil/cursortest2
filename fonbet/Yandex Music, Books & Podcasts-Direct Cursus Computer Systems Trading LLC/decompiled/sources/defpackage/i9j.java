package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class i9j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9j b;

    public /* synthetic */ i9j(k9j k9jVar, int i) {
        this.a = i;
        this.b = k9jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wjb wjbVar;
        switch (this.a) {
            case 0:
                int ordinal = this.b.A().ordinal();
                if (ordinal == 0) {
                    wjbVar = wjb.AudiobookListScreen;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    wjbVar = wjb.PodcastListScreen;
                }
                return new cvo(wjbVar, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 1:
                return new v9j(this.b.A());
            case 2:
                k9j k9jVar = this.b;
                jyr jyrVar = k9jVar.l;
                o15 A = k9jVar.A();
                nnb nnbVar = k9jVar.g;
                int ordinal2 = A.ordinal();
                if (ordinal2 == 0) {
                    maj majVar = (maj) jyrVar.getValue();
                    cvo k = k9jVar.getK();
                    fnb m = nnbVar.m();
                    majVar.getClass();
                    k.getClass();
                    return new j35(0, m, k);
                }
                if (ordinal2 != 1) {
                    b6e.s();
                    return null;
                }
                maj majVar2 = (maj) jyrVar.getValue();
                cvo k2 = k9jVar.getK();
                fnb m2 = nnbVar.m();
                majVar2.getClass();
                k2.getClass();
                return new j35(1, m2, k2);
            case 3:
                k9j k9jVar2 = this.b;
                jyr jyrVar2 = k9jVar2.l;
                int ordinal3 = k9jVar2.A().ordinal();
                if (ordinal3 == 0) {
                    maj majVar3 = (maj) jyrVar2.getValue();
                    t requireActivity = k9jVar2.requireActivity();
                    requireActivity.getClass();
                    majVar3.getClass();
                    return new i35(requireActivity, 0);
                }
                if (ordinal3 != 1) {
                    b6e.s();
                    return null;
                }
                maj majVar4 = (maj) jyrVar2.getValue();
                t requireActivity2 = k9jVar2.requireActivity();
                requireActivity2.getClass();
                majVar4.getClass();
                return new i35(requireActivity2, 1);
            default:
                k9j k9jVar3 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(ibc.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity3 = k9jVar3.requireActivity();
                requireActivity3.getClass();
                return ibc.a(requireActivity3);
        }
    }
}
