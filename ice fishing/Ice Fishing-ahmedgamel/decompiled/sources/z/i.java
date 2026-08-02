package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f42080a;

    /* renamed from: b, reason: collision with root package name */
    public final l f42081b;

    /* renamed from: c, reason: collision with root package name */
    public final k f42082c;

    /* renamed from: d, reason: collision with root package name */
    public final j f42083d;

    /* renamed from: e, reason: collision with root package name */
    public final m f42084e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f42085f;

    public i() {
        l lVar = new l();
        lVar.f42159a = 0;
        lVar.f42160b = 0;
        lVar.f42161c = 1.0f;
        lVar.f42162d = Float.NaN;
        this.f42081b = lVar;
        k kVar = new k();
        kVar.f42151a = -1;
        kVar.f42152b = 0;
        kVar.f42153c = -1;
        kVar.f42154d = Float.NaN;
        kVar.f42155e = Float.NaN;
        kVar.f42156f = Float.NaN;
        kVar.f42157g = -1;
        kVar.f42158h = null;
        kVar.i = -1;
        this.f42082c = kVar;
        j jVar = new j();
        jVar.f42111a = false;
        jVar.f42117d = -1;
        jVar.f42119e = -1;
        jVar.f42121f = -1.0f;
        jVar.f42123g = true;
        jVar.f42125h = -1;
        jVar.i = -1;
        jVar.f42128j = -1;
        jVar.f42130k = -1;
        jVar.f42132l = -1;
        jVar.f42134m = -1;
        jVar.f42135n = -1;
        jVar.f42137o = -1;
        jVar.f42139p = -1;
        jVar.f42140q = -1;
        jVar.f42141r = -1;
        jVar.f42142s = -1;
        jVar.f42143t = -1;
        jVar.f42144u = -1;
        jVar.f42145v = -1;
        jVar.f42146w = 0.5f;
        jVar.f42147x = 0.5f;
        jVar.f42148y = null;
        jVar.f42149z = -1;
        jVar.f42087A = 0;
        jVar.f42088B = 0.0f;
        jVar.f42089C = -1;
        jVar.f42090D = -1;
        jVar.f42091E = -1;
        jVar.f42092F = 0;
        jVar.f42093G = 0;
        jVar.f42094H = 0;
        jVar.f42095I = 0;
        jVar.J = 0;
        jVar.f42096K = 0;
        jVar.f42097L = 0;
        jVar.f42098M = Integer.MIN_VALUE;
        jVar.f42099N = Integer.MIN_VALUE;
        jVar.f42100O = Integer.MIN_VALUE;
        jVar.f42101P = Integer.MIN_VALUE;
        jVar.f42102Q = Integer.MIN_VALUE;
        jVar.f42103R = Integer.MIN_VALUE;
        jVar.f42104S = Integer.MIN_VALUE;
        jVar.f42105T = -1.0f;
        jVar.f42106U = -1.0f;
        jVar.f42107V = 0;
        jVar.f42108W = 0;
        jVar.f42109X = 0;
        jVar.Y = 0;
        jVar.f42110Z = 0;
        jVar.f42112a0 = 0;
        jVar.f42114b0 = 0;
        jVar.f42116c0 = 0;
        jVar.f42118d0 = 1.0f;
        jVar.f42120e0 = 1.0f;
        jVar.f42122f0 = -1;
        jVar.f42124g0 = 0;
        jVar.f42126h0 = -1;
        jVar.f42133l0 = false;
        jVar.m0 = false;
        jVar.f42136n0 = true;
        jVar.f42138o0 = 0;
        this.f42083d = jVar;
        m mVar = new m();
        mVar.f42164a = 0.0f;
        mVar.f42165b = 0.0f;
        mVar.f42166c = 0.0f;
        mVar.f42167d = 1.0f;
        mVar.f42168e = 1.0f;
        mVar.f42169f = Float.NaN;
        mVar.f42170g = Float.NaN;
        mVar.f42171h = -1;
        mVar.i = 0.0f;
        mVar.f42172j = 0.0f;
        mVar.f42173k = 0.0f;
        mVar.f42174l = false;
        mVar.f42175m = 0.0f;
        this.f42084e = mVar;
        this.f42085f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f42083d;
        eVar.f42024e = jVar.f42125h;
        eVar.f42026f = jVar.i;
        eVar.f42028g = jVar.f42128j;
        eVar.f42030h = jVar.f42130k;
        eVar.i = jVar.f42132l;
        eVar.f42033j = jVar.f42134m;
        eVar.f42035k = jVar.f42135n;
        eVar.f42037l = jVar.f42137o;
        eVar.f42039m = jVar.f42139p;
        eVar.f42040n = jVar.f42140q;
        eVar.f42042o = jVar.f42141r;
        eVar.f42048s = jVar.f42142s;
        eVar.f42049t = jVar.f42143t;
        eVar.f42050u = jVar.f42144u;
        eVar.f42051v = jVar.f42145v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.f42092F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.f42093G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.f42094H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.f42095I;
        eVar.f41992A = jVar.f42103R;
        eVar.f41993B = jVar.f42102Q;
        eVar.f42053x = jVar.f42099N;
        eVar.f42055z = jVar.f42101P;
        eVar.f41996E = jVar.f42146w;
        eVar.f41997F = jVar.f42147x;
        eVar.f42044p = jVar.f42149z;
        eVar.f42046q = jVar.f42087A;
        eVar.f42047r = jVar.f42088B;
        eVar.f41998G = jVar.f42148y;
        eVar.f42010T = jVar.f42089C;
        eVar.f42011U = jVar.f42090D;
        eVar.f42000I = jVar.f42105T;
        eVar.f41999H = jVar.f42106U;
        eVar.f42001K = jVar.f42108W;
        eVar.J = jVar.f42107V;
        eVar.f42013W = jVar.f42133l0;
        eVar.f42014X = jVar.m0;
        eVar.f42002L = jVar.f42109X;
        eVar.f42003M = jVar.Y;
        eVar.f42006P = jVar.f42110Z;
        eVar.f42007Q = jVar.f42112a0;
        eVar.f42004N = jVar.f42114b0;
        eVar.f42005O = jVar.f42116c0;
        eVar.f42008R = jVar.f42118d0;
        eVar.f42009S = jVar.f42120e0;
        eVar.f42012V = jVar.f42091E;
        eVar.f42020c = jVar.f42121f;
        eVar.f42016a = jVar.f42117d;
        eVar.f42018b = jVar.f42119e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f42113b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f42115c;
        String str = jVar.f42131k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.f42015Z = jVar.f42138o0;
        eVar.setMarginStart(jVar.f42096K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f42083d;
        jVar.getClass();
        j jVar2 = this.f42083d;
        jVar.f42111a = jVar2.f42111a;
        jVar.f42113b = jVar2.f42113b;
        jVar.f42115c = jVar2.f42115c;
        jVar.f42117d = jVar2.f42117d;
        jVar.f42119e = jVar2.f42119e;
        jVar.f42121f = jVar2.f42121f;
        jVar.f42123g = jVar2.f42123g;
        jVar.f42125h = jVar2.f42125h;
        jVar.i = jVar2.i;
        jVar.f42128j = jVar2.f42128j;
        jVar.f42130k = jVar2.f42130k;
        jVar.f42132l = jVar2.f42132l;
        jVar.f42134m = jVar2.f42134m;
        jVar.f42135n = jVar2.f42135n;
        jVar.f42137o = jVar2.f42137o;
        jVar.f42139p = jVar2.f42139p;
        jVar.f42140q = jVar2.f42140q;
        jVar.f42141r = jVar2.f42141r;
        jVar.f42142s = jVar2.f42142s;
        jVar.f42143t = jVar2.f42143t;
        jVar.f42144u = jVar2.f42144u;
        jVar.f42145v = jVar2.f42145v;
        jVar.f42146w = jVar2.f42146w;
        jVar.f42147x = jVar2.f42147x;
        jVar.f42148y = jVar2.f42148y;
        jVar.f42149z = jVar2.f42149z;
        jVar.f42087A = jVar2.f42087A;
        jVar.f42088B = jVar2.f42088B;
        jVar.f42089C = jVar2.f42089C;
        jVar.f42090D = jVar2.f42090D;
        jVar.f42091E = jVar2.f42091E;
        jVar.f42092F = jVar2.f42092F;
        jVar.f42093G = jVar2.f42093G;
        jVar.f42094H = jVar2.f42094H;
        jVar.f42095I = jVar2.f42095I;
        jVar.J = jVar2.J;
        jVar.f42096K = jVar2.f42096K;
        jVar.f42097L = jVar2.f42097L;
        jVar.f42098M = jVar2.f42098M;
        jVar.f42099N = jVar2.f42099N;
        jVar.f42100O = jVar2.f42100O;
        jVar.f42101P = jVar2.f42101P;
        jVar.f42102Q = jVar2.f42102Q;
        jVar.f42103R = jVar2.f42103R;
        jVar.f42104S = jVar2.f42104S;
        jVar.f42105T = jVar2.f42105T;
        jVar.f42106U = jVar2.f42106U;
        jVar.f42107V = jVar2.f42107V;
        jVar.f42108W = jVar2.f42108W;
        jVar.f42109X = jVar2.f42109X;
        jVar.Y = jVar2.Y;
        jVar.f42110Z = jVar2.f42110Z;
        jVar.f42112a0 = jVar2.f42112a0;
        jVar.f42114b0 = jVar2.f42114b0;
        jVar.f42116c0 = jVar2.f42116c0;
        jVar.f42118d0 = jVar2.f42118d0;
        jVar.f42120e0 = jVar2.f42120e0;
        jVar.f42122f0 = jVar2.f42122f0;
        jVar.f42124g0 = jVar2.f42124g0;
        jVar.f42126h0 = jVar2.f42126h0;
        jVar.f42131k0 = jVar2.f42131k0;
        int[] iArr = jVar2.f42127i0;
        if (iArr == null || jVar2.f42129j0 != null) {
            jVar.f42127i0 = null;
        } else {
            jVar.f42127i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f42129j0 = jVar2.f42129j0;
        jVar.f42133l0 = jVar2.f42133l0;
        jVar.m0 = jVar2.m0;
        jVar.f42136n0 = jVar2.f42136n0;
        jVar.f42138o0 = jVar2.f42138o0;
        k kVar = iVar.f42082c;
        kVar.getClass();
        k kVar2 = this.f42082c;
        kVar2.getClass();
        kVar.f42151a = kVar2.f42151a;
        kVar.f42153c = kVar2.f42153c;
        kVar.f42155e = kVar2.f42155e;
        kVar.f42154d = kVar2.f42154d;
        l lVar = iVar.f42081b;
        l lVar2 = this.f42081b;
        lVar.f42159a = lVar2.f42159a;
        lVar.f42161c = lVar2.f42161c;
        lVar.f42162d = lVar2.f42162d;
        lVar.f42160b = lVar2.f42160b;
        m mVar = iVar.f42084e;
        mVar.getClass();
        m mVar2 = this.f42084e;
        mVar2.getClass();
        mVar.f42164a = mVar2.f42164a;
        mVar.f42165b = mVar2.f42165b;
        mVar.f42166c = mVar2.f42166c;
        mVar.f42167d = mVar2.f42167d;
        mVar.f42168e = mVar2.f42168e;
        mVar.f42169f = mVar2.f42169f;
        mVar.f42170g = mVar2.f42170g;
        mVar.f42171h = mVar2.f42171h;
        mVar.i = mVar2.i;
        mVar.f42172j = mVar2.f42172j;
        mVar.f42173k = mVar2.f42173k;
        mVar.f42174l = mVar2.f42174l;
        mVar.f42175m = mVar2.f42175m;
        iVar.f42080a = this.f42080a;
        return iVar;
    }
}
