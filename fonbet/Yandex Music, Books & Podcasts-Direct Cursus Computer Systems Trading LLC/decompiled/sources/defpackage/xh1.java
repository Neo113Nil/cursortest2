package defpackage;

import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class xh1 {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;

    public xh1(bi1 bi1Var) {
        this.a = btf.b(new vh1(bi1Var, 9));
        int i = 10;
        this.b = btf.b(new vh1(bi1Var, i));
        this.c = btf.b(new pa1(i));
        int i2 = 11;
        this.d = btf.b(new vh1(bi1Var, i2));
        this.e = btf.b(new pa1(i2));
        this.f = btf.b(new vh1(bi1Var, 12));
        this.g = btf.b(new pa1(12));
        this.h = btf.b(new pa1(13));
        this.i = btf.b(new pa1(14));
        this.j = btf.b(new pa1(15));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(nrf nrfVar, cg6 cg6Var) {
        vig vigVar;
        int i;
        String c;
        Object a;
        if (cg6Var instanceof vig) {
            vigVar = (vig) cg6Var;
            int i2 = vigVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vigVar.n = i2 - Integer.MIN_VALUE;
                Object obj = vigVar.l;
                nm6 nm6Var = nm6.a;
                i = vigVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    c = e().c(R.string.your_dislikes);
                    t88 t88Var = (t88) this.f.getValue();
                    vigVar.j = nrfVar;
                    vigVar.k = c;
                    vigVar.n = 1;
                    a = t88Var.a(vigVar);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = vigVar.k;
                    nrf nrfVar2 = vigVar.j;
                    qgg.h0(obj);
                    c = str;
                    nrfVar = nrfVar2;
                    a = obj;
                }
                return new n88(nrfVar, c, ((o98) a).a);
            }
        }
        vigVar = new vig(this, cg6Var);
        Object obj2 = vigVar.l;
        nm6 nm6Var2 = nm6.a;
        i = vigVar.n;
        if (i != 0) {
        }
        return new n88(nrfVar, c, ((o98) a).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(nrf nrfVar, cg6 cg6Var) {
        wig wigVar;
        int i;
        if (cg6Var instanceof wig) {
            wigVar = (wig) cg6Var;
            int i2 = wigVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wigVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wigVar.k;
                nm6 nm6Var = nm6.a;
                i = wigVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    a04 a04Var = (a04) this.i.getValue();
                    wigVar.j = nrfVar;
                    wigVar.m = 1;
                    obj = a04Var.e(8, wigVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nrfVar = wigVar.j;
                    qgg.h0(obj);
                }
                xgg xggVar = (xgg) obj;
                return new hz3(nrfVar, e().c(R.string.collection_block_favorite_artists), xggVar.a, xggVar.b);
            }
        }
        wigVar = new wig(this, cg6Var);
        Object obj2 = wigVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wigVar.m;
        if (i != 0) {
        }
        xgg xggVar2 = (xgg) obj2;
        return new hz3(nrfVar, e().c(R.string.collection_block_favorite_artists), xggVar2.a, xggVar2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(nrf nrfVar, cg6 cg6Var) {
        xig xigVar;
        int i;
        if (cg6Var instanceof xig) {
            xigVar = (xig) cg6Var;
            int i2 = xigVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xigVar.m = i2 - Integer.MIN_VALUE;
                Object obj = xigVar.k;
                nm6 nm6Var = nm6.a;
                i = xigVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    u5c u5cVar = (u5c) this.e.getValue();
                    xigVar.j = nrfVar;
                    xigVar.m = 1;
                    obj = u5cVar.a.a(xigVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nrfVar = xigVar.j;
                    qgg.h0(obj);
                }
                return new q5c(nrfVar, (cvl) obj);
            }
        }
        xigVar = new xig(this, cg6Var);
        Object obj2 = xigVar.k;
        nm6 nm6Var2 = nm6.a;
        i = xigVar.m;
        if (i != 0) {
        }
        return new q5c(nrfVar, (cvl) obj2);
    }

    public r44 d(nrf nrfVar) {
        nrfVar.getClass();
        return new r44(nrfVar, e().c(R.string.new_collection_items_title), y7g.z((o34) ((q34) this.g.getValue()).a.getValue()).size());
    }

    public skr e() {
        return (skr) this.c.getValue();
    }

    public xh1() {
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(wst.class), true);
        this.c = l18Var.b(hag.I(skr.class), true);
        this.d = l18Var.b(hag.I(ow4.class), true);
        this.e = btf.b(wg.w);
        this.f = btf.b(wg.x);
        this.g = btf.b(wg.y);
        final int i = 0;
        this.h = btf.b(new Function0(this) { // from class: uig
            public final /* synthetic */ xh1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((ow4) this.b.d.getValue()).e;
                    case 1:
                        return ((ow4) this.b.d.getValue()).f;
                    default:
                        return ((ow4) this.b.d.getValue()).g;
                }
            }
        });
        final int i2 = 1;
        this.i = btf.b(new Function0(this) { // from class: uig
            public final /* synthetic */ xh1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((ow4) this.b.d.getValue()).e;
                    case 1:
                        return ((ow4) this.b.d.getValue()).f;
                    default:
                        return ((ow4) this.b.d.getValue()).g;
                }
            }
        });
        final int i3 = 2;
        this.j = btf.b(new Function0(this) { // from class: uig
            public final /* synthetic */ xh1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((ow4) this.b.d.getValue()).e;
                    case 1:
                        return ((ow4) this.b.d.getValue()).f;
                    default:
                        return ((ow4) this.b.d.getValue()).g;
                }
            }
        });
    }
}
