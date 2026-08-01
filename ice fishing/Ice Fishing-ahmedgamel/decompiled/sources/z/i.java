package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f42109a;

    /* renamed from: b, reason: collision with root package name */
    public final l f42110b;

    /* renamed from: c, reason: collision with root package name */
    public final k f42111c;

    /* renamed from: d, reason: collision with root package name */
    public final j f42112d;

    /* renamed from: e, reason: collision with root package name */
    public final m f42113e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f42114f;

    public i() {
        l lVar = new l();
        lVar.f42188a = 0;
        lVar.f42189b = 0;
        lVar.f42190c = 1.0f;
        lVar.f42191d = Float.NaN;
        this.f42110b = lVar;
        k kVar = new k();
        kVar.f42180a = -1;
        kVar.f42181b = 0;
        kVar.f42182c = -1;
        kVar.f42183d = Float.NaN;
        kVar.f42184e = Float.NaN;
        kVar.f42185f = Float.NaN;
        kVar.f42186g = -1;
        kVar.f42187h = null;
        kVar.i = -1;
        this.f42111c = kVar;
        j jVar = new j();
        jVar.f42140a = false;
        jVar.f42146d = -1;
        jVar.f42148e = -1;
        jVar.f42150f = -1.0f;
        jVar.f42152g = true;
        jVar.f42154h = -1;
        jVar.i = -1;
        jVar.f42157j = -1;
        jVar.f42159k = -1;
        jVar.f42161l = -1;
        jVar.f42163m = -1;
        jVar.f42164n = -1;
        jVar.f42166o = -1;
        jVar.f42168p = -1;
        jVar.f42169q = -1;
        jVar.f42170r = -1;
        jVar.f42171s = -1;
        jVar.f42172t = -1;
        jVar.f42173u = -1;
        jVar.f42174v = -1;
        jVar.f42175w = 0.5f;
        jVar.f42176x = 0.5f;
        jVar.f42177y = null;
        jVar.f42178z = -1;
        jVar.f42116A = 0;
        jVar.f42117B = 0.0f;
        jVar.f42118C = -1;
        jVar.f42119D = -1;
        jVar.f42120E = -1;
        jVar.f42121F = 0;
        jVar.f42122G = 0;
        jVar.f42123H = 0;
        jVar.f42124I = 0;
        jVar.J = 0;
        jVar.f42125K = 0;
        jVar.f42126L = 0;
        jVar.f42127M = Integer.MIN_VALUE;
        jVar.f42128N = Integer.MIN_VALUE;
        jVar.f42129O = Integer.MIN_VALUE;
        jVar.f42130P = Integer.MIN_VALUE;
        jVar.f42131Q = Integer.MIN_VALUE;
        jVar.f42132R = Integer.MIN_VALUE;
        jVar.f42133S = Integer.MIN_VALUE;
        jVar.f42134T = -1.0f;
        jVar.f42135U = -1.0f;
        jVar.f42136V = 0;
        jVar.f42137W = 0;
        jVar.f42138X = 0;
        jVar.Y = 0;
        jVar.f42139Z = 0;
        jVar.f42141a0 = 0;
        jVar.f42143b0 = 0;
        jVar.f42145c0 = 0;
        jVar.f42147d0 = 1.0f;
        jVar.f42149e0 = 1.0f;
        jVar.f42151f0 = -1;
        jVar.f42153g0 = 0;
        jVar.f42155h0 = -1;
        jVar.f42162l0 = false;
        jVar.m0 = false;
        jVar.f42165n0 = true;
        jVar.f42167o0 = 0;
        this.f42112d = jVar;
        m mVar = new m();
        mVar.f42193a = 0.0f;
        mVar.f42194b = 0.0f;
        mVar.f42195c = 0.0f;
        mVar.f42196d = 1.0f;
        mVar.f42197e = 1.0f;
        mVar.f42198f = Float.NaN;
        mVar.f42199g = Float.NaN;
        mVar.f42200h = -1;
        mVar.i = 0.0f;
        mVar.f42201j = 0.0f;
        mVar.f42202k = 0.0f;
        mVar.f42203l = false;
        mVar.f42204m = 0.0f;
        this.f42113e = mVar;
        this.f42114f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f42112d;
        eVar.f42053e = jVar.f42154h;
        eVar.f42055f = jVar.i;
        eVar.f42057g = jVar.f42157j;
        eVar.f42059h = jVar.f42159k;
        eVar.i = jVar.f42161l;
        eVar.f42062j = jVar.f42163m;
        eVar.f42064k = jVar.f42164n;
        eVar.f42066l = jVar.f42166o;
        eVar.f42068m = jVar.f42168p;
        eVar.f42069n = jVar.f42169q;
        eVar.f42071o = jVar.f42170r;
        eVar.f42077s = jVar.f42171s;
        eVar.f42078t = jVar.f42172t;
        eVar.f42079u = jVar.f42173u;
        eVar.f42080v = jVar.f42174v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.f42121F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.f42122G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.f42123H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.f42124I;
        eVar.f42021A = jVar.f42132R;
        eVar.f42022B = jVar.f42131Q;
        eVar.f42082x = jVar.f42128N;
        eVar.f42084z = jVar.f42130P;
        eVar.f42025E = jVar.f42175w;
        eVar.f42026F = jVar.f42176x;
        eVar.f42073p = jVar.f42178z;
        eVar.f42075q = jVar.f42116A;
        eVar.f42076r = jVar.f42117B;
        eVar.f42027G = jVar.f42177y;
        eVar.f42039T = jVar.f42118C;
        eVar.f42040U = jVar.f42119D;
        eVar.f42029I = jVar.f42134T;
        eVar.f42028H = jVar.f42135U;
        eVar.f42030K = jVar.f42137W;
        eVar.J = jVar.f42136V;
        eVar.f42042W = jVar.f42162l0;
        eVar.f42043X = jVar.m0;
        eVar.f42031L = jVar.f42138X;
        eVar.f42032M = jVar.Y;
        eVar.f42035P = jVar.f42139Z;
        eVar.f42036Q = jVar.f42141a0;
        eVar.f42033N = jVar.f42143b0;
        eVar.f42034O = jVar.f42145c0;
        eVar.f42037R = jVar.f42147d0;
        eVar.f42038S = jVar.f42149e0;
        eVar.f42041V = jVar.f42120E;
        eVar.f42049c = jVar.f42150f;
        eVar.f42045a = jVar.f42146d;
        eVar.f42047b = jVar.f42148e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f42142b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f42144c;
        String str = jVar.f42160k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.f42044Z = jVar.f42167o0;
        eVar.setMarginStart(jVar.f42125K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f42112d;
        jVar.getClass();
        j jVar2 = this.f42112d;
        jVar.f42140a = jVar2.f42140a;
        jVar.f42142b = jVar2.f42142b;
        jVar.f42144c = jVar2.f42144c;
        jVar.f42146d = jVar2.f42146d;
        jVar.f42148e = jVar2.f42148e;
        jVar.f42150f = jVar2.f42150f;
        jVar.f42152g = jVar2.f42152g;
        jVar.f42154h = jVar2.f42154h;
        jVar.i = jVar2.i;
        jVar.f42157j = jVar2.f42157j;
        jVar.f42159k = jVar2.f42159k;
        jVar.f42161l = jVar2.f42161l;
        jVar.f42163m = jVar2.f42163m;
        jVar.f42164n = jVar2.f42164n;
        jVar.f42166o = jVar2.f42166o;
        jVar.f42168p = jVar2.f42168p;
        jVar.f42169q = jVar2.f42169q;
        jVar.f42170r = jVar2.f42170r;
        jVar.f42171s = jVar2.f42171s;
        jVar.f42172t = jVar2.f42172t;
        jVar.f42173u = jVar2.f42173u;
        jVar.f42174v = jVar2.f42174v;
        jVar.f42175w = jVar2.f42175w;
        jVar.f42176x = jVar2.f42176x;
        jVar.f42177y = jVar2.f42177y;
        jVar.f42178z = jVar2.f42178z;
        jVar.f42116A = jVar2.f42116A;
        jVar.f42117B = jVar2.f42117B;
        jVar.f42118C = jVar2.f42118C;
        jVar.f42119D = jVar2.f42119D;
        jVar.f42120E = jVar2.f42120E;
        jVar.f42121F = jVar2.f42121F;
        jVar.f42122G = jVar2.f42122G;
        jVar.f42123H = jVar2.f42123H;
        jVar.f42124I = jVar2.f42124I;
        jVar.J = jVar2.J;
        jVar.f42125K = jVar2.f42125K;
        jVar.f42126L = jVar2.f42126L;
        jVar.f42127M = jVar2.f42127M;
        jVar.f42128N = jVar2.f42128N;
        jVar.f42129O = jVar2.f42129O;
        jVar.f42130P = jVar2.f42130P;
        jVar.f42131Q = jVar2.f42131Q;
        jVar.f42132R = jVar2.f42132R;
        jVar.f42133S = jVar2.f42133S;
        jVar.f42134T = jVar2.f42134T;
        jVar.f42135U = jVar2.f42135U;
        jVar.f42136V = jVar2.f42136V;
        jVar.f42137W = jVar2.f42137W;
        jVar.f42138X = jVar2.f42138X;
        jVar.Y = jVar2.Y;
        jVar.f42139Z = jVar2.f42139Z;
        jVar.f42141a0 = jVar2.f42141a0;
        jVar.f42143b0 = jVar2.f42143b0;
        jVar.f42145c0 = jVar2.f42145c0;
        jVar.f42147d0 = jVar2.f42147d0;
        jVar.f42149e0 = jVar2.f42149e0;
        jVar.f42151f0 = jVar2.f42151f0;
        jVar.f42153g0 = jVar2.f42153g0;
        jVar.f42155h0 = jVar2.f42155h0;
        jVar.f42160k0 = jVar2.f42160k0;
        int[] iArr = jVar2.f42156i0;
        if (iArr == null || jVar2.f42158j0 != null) {
            jVar.f42156i0 = null;
        } else {
            jVar.f42156i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f42158j0 = jVar2.f42158j0;
        jVar.f42162l0 = jVar2.f42162l0;
        jVar.m0 = jVar2.m0;
        jVar.f42165n0 = jVar2.f42165n0;
        jVar.f42167o0 = jVar2.f42167o0;
        k kVar = iVar.f42111c;
        kVar.getClass();
        k kVar2 = this.f42111c;
        kVar2.getClass();
        kVar.f42180a = kVar2.f42180a;
        kVar.f42182c = kVar2.f42182c;
        kVar.f42184e = kVar2.f42184e;
        kVar.f42183d = kVar2.f42183d;
        l lVar = iVar.f42110b;
        l lVar2 = this.f42110b;
        lVar.f42188a = lVar2.f42188a;
        lVar.f42190c = lVar2.f42190c;
        lVar.f42191d = lVar2.f42191d;
        lVar.f42189b = lVar2.f42189b;
        m mVar = iVar.f42113e;
        mVar.getClass();
        m mVar2 = this.f42113e;
        mVar2.getClass();
        mVar.f42193a = mVar2.f42193a;
        mVar.f42194b = mVar2.f42194b;
        mVar.f42195c = mVar2.f42195c;
        mVar.f42196d = mVar2.f42196d;
        mVar.f42197e = mVar2.f42197e;
        mVar.f42198f = mVar2.f42198f;
        mVar.f42199g = mVar2.f42199g;
        mVar.f42200h = mVar2.f42200h;
        mVar.i = mVar2.i;
        mVar.f42201j = mVar2.f42201j;
        mVar.f42202k = mVar2.f42202k;
        mVar.f42203l = mVar2.f42203l;
        mVar.f42204m = mVar2.f42204m;
        iVar.f42109a = this.f42109a;
        return iVar;
    }
}
