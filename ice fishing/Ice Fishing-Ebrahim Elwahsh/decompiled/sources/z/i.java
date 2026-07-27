package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f41991a;

    /* renamed from: b, reason: collision with root package name */
    public final l f41992b;

    /* renamed from: c, reason: collision with root package name */
    public final k f41993c;

    /* renamed from: d, reason: collision with root package name */
    public final j f41994d;

    /* renamed from: e, reason: collision with root package name */
    public final m f41995e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f41996f;

    public i() {
        l lVar = new l();
        lVar.f42070a = 0;
        lVar.f42071b = 0;
        lVar.f42072c = 1.0f;
        lVar.f42073d = Float.NaN;
        this.f41992b = lVar;
        k kVar = new k();
        kVar.f42062a = -1;
        kVar.f42063b = 0;
        kVar.f42064c = -1;
        kVar.f42065d = Float.NaN;
        kVar.f42066e = Float.NaN;
        kVar.f42067f = Float.NaN;
        kVar.f42068g = -1;
        kVar.f42069h = null;
        kVar.i = -1;
        this.f41993c = kVar;
        j jVar = new j();
        jVar.f42022a = false;
        jVar.f42028d = -1;
        jVar.f42030e = -1;
        jVar.f42032f = -1.0f;
        jVar.f42034g = true;
        jVar.f42036h = -1;
        jVar.i = -1;
        jVar.f42039j = -1;
        jVar.f42041k = -1;
        jVar.f42043l = -1;
        jVar.f42045m = -1;
        jVar.f42046n = -1;
        jVar.f42048o = -1;
        jVar.f42050p = -1;
        jVar.f42051q = -1;
        jVar.f42052r = -1;
        jVar.f42053s = -1;
        jVar.f42054t = -1;
        jVar.f42055u = -1;
        jVar.f42056v = -1;
        jVar.f42057w = 0.5f;
        jVar.f42058x = 0.5f;
        jVar.f42059y = null;
        jVar.f42060z = -1;
        jVar.f41998A = 0;
        jVar.f41999B = 0.0f;
        jVar.f42000C = -1;
        jVar.f42001D = -1;
        jVar.f42002E = -1;
        jVar.f42003F = 0;
        jVar.f42004G = 0;
        jVar.f42005H = 0;
        jVar.f42006I = 0;
        jVar.J = 0;
        jVar.f42007K = 0;
        jVar.f42008L = 0;
        jVar.f42009M = Integer.MIN_VALUE;
        jVar.f42010N = Integer.MIN_VALUE;
        jVar.f42011O = Integer.MIN_VALUE;
        jVar.f42012P = Integer.MIN_VALUE;
        jVar.f42013Q = Integer.MIN_VALUE;
        jVar.f42014R = Integer.MIN_VALUE;
        jVar.f42015S = Integer.MIN_VALUE;
        jVar.f42016T = -1.0f;
        jVar.f42017U = -1.0f;
        jVar.f42018V = 0;
        jVar.f42019W = 0;
        jVar.f42020X = 0;
        jVar.Y = 0;
        jVar.f42021Z = 0;
        jVar.f42023a0 = 0;
        jVar.f42025b0 = 0;
        jVar.f42027c0 = 0;
        jVar.f42029d0 = 1.0f;
        jVar.f42031e0 = 1.0f;
        jVar.f42033f0 = -1;
        jVar.f42035g0 = 0;
        jVar.f42037h0 = -1;
        jVar.f42044l0 = false;
        jVar.m0 = false;
        jVar.f42047n0 = true;
        jVar.f42049o0 = 0;
        this.f41994d = jVar;
        m mVar = new m();
        mVar.f42075a = 0.0f;
        mVar.f42076b = 0.0f;
        mVar.f42077c = 0.0f;
        mVar.f42078d = 1.0f;
        mVar.f42079e = 1.0f;
        mVar.f42080f = Float.NaN;
        mVar.f42081g = Float.NaN;
        mVar.f42082h = -1;
        mVar.i = 0.0f;
        mVar.f42083j = 0.0f;
        mVar.f42084k = 0.0f;
        mVar.f42085l = false;
        mVar.f42086m = 0.0f;
        this.f41995e = mVar;
        this.f41996f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f41994d;
        eVar.f41935e = jVar.f42036h;
        eVar.f41937f = jVar.i;
        eVar.f41939g = jVar.f42039j;
        eVar.f41941h = jVar.f42041k;
        eVar.i = jVar.f42043l;
        eVar.f41944j = jVar.f42045m;
        eVar.f41946k = jVar.f42046n;
        eVar.f41948l = jVar.f42048o;
        eVar.f41950m = jVar.f42050p;
        eVar.f41951n = jVar.f42051q;
        eVar.f41953o = jVar.f42052r;
        eVar.f41959s = jVar.f42053s;
        eVar.f41960t = jVar.f42054t;
        eVar.f41961u = jVar.f42055u;
        eVar.f41962v = jVar.f42056v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.f42003F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.f42004G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.f42005H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.f42006I;
        eVar.f41903A = jVar.f42014R;
        eVar.f41904B = jVar.f42013Q;
        eVar.f41964x = jVar.f42010N;
        eVar.f41966z = jVar.f42012P;
        eVar.f41907E = jVar.f42057w;
        eVar.f41908F = jVar.f42058x;
        eVar.f41955p = jVar.f42060z;
        eVar.f41957q = jVar.f41998A;
        eVar.f41958r = jVar.f41999B;
        eVar.f41909G = jVar.f42059y;
        eVar.f41921T = jVar.f42000C;
        eVar.f41922U = jVar.f42001D;
        eVar.f41911I = jVar.f42016T;
        eVar.f41910H = jVar.f42017U;
        eVar.f41912K = jVar.f42019W;
        eVar.J = jVar.f42018V;
        eVar.f41924W = jVar.f42044l0;
        eVar.f41925X = jVar.m0;
        eVar.f41913L = jVar.f42020X;
        eVar.f41914M = jVar.Y;
        eVar.f41917P = jVar.f42021Z;
        eVar.f41918Q = jVar.f42023a0;
        eVar.f41915N = jVar.f42025b0;
        eVar.f41916O = jVar.f42027c0;
        eVar.f41919R = jVar.f42029d0;
        eVar.f41920S = jVar.f42031e0;
        eVar.f41923V = jVar.f42002E;
        eVar.f41931c = jVar.f42032f;
        eVar.f41927a = jVar.f42028d;
        eVar.f41929b = jVar.f42030e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f42024b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f42026c;
        String str = jVar.f42042k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.f41926Z = jVar.f42049o0;
        eVar.setMarginStart(jVar.f42007K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f41994d;
        jVar.getClass();
        j jVar2 = this.f41994d;
        jVar.f42022a = jVar2.f42022a;
        jVar.f42024b = jVar2.f42024b;
        jVar.f42026c = jVar2.f42026c;
        jVar.f42028d = jVar2.f42028d;
        jVar.f42030e = jVar2.f42030e;
        jVar.f42032f = jVar2.f42032f;
        jVar.f42034g = jVar2.f42034g;
        jVar.f42036h = jVar2.f42036h;
        jVar.i = jVar2.i;
        jVar.f42039j = jVar2.f42039j;
        jVar.f42041k = jVar2.f42041k;
        jVar.f42043l = jVar2.f42043l;
        jVar.f42045m = jVar2.f42045m;
        jVar.f42046n = jVar2.f42046n;
        jVar.f42048o = jVar2.f42048o;
        jVar.f42050p = jVar2.f42050p;
        jVar.f42051q = jVar2.f42051q;
        jVar.f42052r = jVar2.f42052r;
        jVar.f42053s = jVar2.f42053s;
        jVar.f42054t = jVar2.f42054t;
        jVar.f42055u = jVar2.f42055u;
        jVar.f42056v = jVar2.f42056v;
        jVar.f42057w = jVar2.f42057w;
        jVar.f42058x = jVar2.f42058x;
        jVar.f42059y = jVar2.f42059y;
        jVar.f42060z = jVar2.f42060z;
        jVar.f41998A = jVar2.f41998A;
        jVar.f41999B = jVar2.f41999B;
        jVar.f42000C = jVar2.f42000C;
        jVar.f42001D = jVar2.f42001D;
        jVar.f42002E = jVar2.f42002E;
        jVar.f42003F = jVar2.f42003F;
        jVar.f42004G = jVar2.f42004G;
        jVar.f42005H = jVar2.f42005H;
        jVar.f42006I = jVar2.f42006I;
        jVar.J = jVar2.J;
        jVar.f42007K = jVar2.f42007K;
        jVar.f42008L = jVar2.f42008L;
        jVar.f42009M = jVar2.f42009M;
        jVar.f42010N = jVar2.f42010N;
        jVar.f42011O = jVar2.f42011O;
        jVar.f42012P = jVar2.f42012P;
        jVar.f42013Q = jVar2.f42013Q;
        jVar.f42014R = jVar2.f42014R;
        jVar.f42015S = jVar2.f42015S;
        jVar.f42016T = jVar2.f42016T;
        jVar.f42017U = jVar2.f42017U;
        jVar.f42018V = jVar2.f42018V;
        jVar.f42019W = jVar2.f42019W;
        jVar.f42020X = jVar2.f42020X;
        jVar.Y = jVar2.Y;
        jVar.f42021Z = jVar2.f42021Z;
        jVar.f42023a0 = jVar2.f42023a0;
        jVar.f42025b0 = jVar2.f42025b0;
        jVar.f42027c0 = jVar2.f42027c0;
        jVar.f42029d0 = jVar2.f42029d0;
        jVar.f42031e0 = jVar2.f42031e0;
        jVar.f42033f0 = jVar2.f42033f0;
        jVar.f42035g0 = jVar2.f42035g0;
        jVar.f42037h0 = jVar2.f42037h0;
        jVar.f42042k0 = jVar2.f42042k0;
        int[] iArr = jVar2.f42038i0;
        if (iArr == null || jVar2.f42040j0 != null) {
            jVar.f42038i0 = null;
        } else {
            jVar.f42038i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f42040j0 = jVar2.f42040j0;
        jVar.f42044l0 = jVar2.f42044l0;
        jVar.m0 = jVar2.m0;
        jVar.f42047n0 = jVar2.f42047n0;
        jVar.f42049o0 = jVar2.f42049o0;
        k kVar = iVar.f41993c;
        kVar.getClass();
        k kVar2 = this.f41993c;
        kVar2.getClass();
        kVar.f42062a = kVar2.f42062a;
        kVar.f42064c = kVar2.f42064c;
        kVar.f42066e = kVar2.f42066e;
        kVar.f42065d = kVar2.f42065d;
        l lVar = iVar.f41992b;
        l lVar2 = this.f41992b;
        lVar.f42070a = lVar2.f42070a;
        lVar.f42072c = lVar2.f42072c;
        lVar.f42073d = lVar2.f42073d;
        lVar.f42071b = lVar2.f42071b;
        m mVar = iVar.f41995e;
        mVar.getClass();
        m mVar2 = this.f41995e;
        mVar2.getClass();
        mVar.f42075a = mVar2.f42075a;
        mVar.f42076b = mVar2.f42076b;
        mVar.f42077c = mVar2.f42077c;
        mVar.f42078d = mVar2.f42078d;
        mVar.f42079e = mVar2.f42079e;
        mVar.f42080f = mVar2.f42080f;
        mVar.f42081g = mVar2.f42081g;
        mVar.f42082h = mVar2.f42082h;
        mVar.i = mVar2.i;
        mVar.f42083j = mVar2.f42083j;
        mVar.f42084k = mVar2.f42084k;
        mVar.f42085l = mVar2.f42085l;
        mVar.f42086m = mVar2.f42086m;
        iVar.f41991a = this.f41991a;
        return iVar;
    }
}
