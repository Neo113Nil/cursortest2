package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f42106a;

    /* renamed from: b, reason: collision with root package name */
    public final l f42107b;

    /* renamed from: c, reason: collision with root package name */
    public final k f42108c;

    /* renamed from: d, reason: collision with root package name */
    public final j f42109d;

    /* renamed from: e, reason: collision with root package name */
    public final m f42110e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f42111f;

    public i() {
        l lVar = new l();
        lVar.f42185a = 0;
        lVar.f42186b = 0;
        lVar.f42187c = 1.0f;
        lVar.f42188d = Float.NaN;
        this.f42107b = lVar;
        k kVar = new k();
        kVar.f42177a = -1;
        kVar.f42178b = 0;
        kVar.f42179c = -1;
        kVar.f42180d = Float.NaN;
        kVar.f42181e = Float.NaN;
        kVar.f42182f = Float.NaN;
        kVar.f42183g = -1;
        kVar.f42184h = null;
        kVar.i = -1;
        this.f42108c = kVar;
        j jVar = new j();
        jVar.f42137a = false;
        jVar.f42143d = -1;
        jVar.f42145e = -1;
        jVar.f42147f = -1.0f;
        jVar.f42149g = true;
        jVar.f42151h = -1;
        jVar.i = -1;
        jVar.f42154j = -1;
        jVar.f42156k = -1;
        jVar.f42158l = -1;
        jVar.f42160m = -1;
        jVar.f42161n = -1;
        jVar.f42163o = -1;
        jVar.f42165p = -1;
        jVar.f42166q = -1;
        jVar.f42167r = -1;
        jVar.f42168s = -1;
        jVar.f42169t = -1;
        jVar.f42170u = -1;
        jVar.f42171v = -1;
        jVar.f42172w = 0.5f;
        jVar.f42173x = 0.5f;
        jVar.f42174y = null;
        jVar.f42175z = -1;
        jVar.f42113A = 0;
        jVar.f42114B = 0.0f;
        jVar.f42115C = -1;
        jVar.f42116D = -1;
        jVar.f42117E = -1;
        jVar.f42118F = 0;
        jVar.f42119G = 0;
        jVar.f42120H = 0;
        jVar.f42121I = 0;
        jVar.J = 0;
        jVar.f42122K = 0;
        jVar.f42123L = 0;
        jVar.f42124M = Integer.MIN_VALUE;
        jVar.f42125N = Integer.MIN_VALUE;
        jVar.f42126O = Integer.MIN_VALUE;
        jVar.f42127P = Integer.MIN_VALUE;
        jVar.f42128Q = Integer.MIN_VALUE;
        jVar.f42129R = Integer.MIN_VALUE;
        jVar.f42130S = Integer.MIN_VALUE;
        jVar.f42131T = -1.0f;
        jVar.f42132U = -1.0f;
        jVar.f42133V = 0;
        jVar.f42134W = 0;
        jVar.f42135X = 0;
        jVar.Y = 0;
        jVar.f42136Z = 0;
        jVar.f42138a0 = 0;
        jVar.f42140b0 = 0;
        jVar.f42142c0 = 0;
        jVar.f42144d0 = 1.0f;
        jVar.f42146e0 = 1.0f;
        jVar.f42148f0 = -1;
        jVar.f42150g0 = 0;
        jVar.f42152h0 = -1;
        jVar.f42159l0 = false;
        jVar.m0 = false;
        jVar.f42162n0 = true;
        jVar.f42164o0 = 0;
        this.f42109d = jVar;
        m mVar = new m();
        mVar.f42190a = 0.0f;
        mVar.f42191b = 0.0f;
        mVar.f42192c = 0.0f;
        mVar.f42193d = 1.0f;
        mVar.f42194e = 1.0f;
        mVar.f42195f = Float.NaN;
        mVar.f42196g = Float.NaN;
        mVar.f42197h = -1;
        mVar.i = 0.0f;
        mVar.f42198j = 0.0f;
        mVar.f42199k = 0.0f;
        mVar.f42200l = false;
        mVar.f42201m = 0.0f;
        this.f42110e = mVar;
        this.f42111f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f42109d;
        eVar.f42050e = jVar.f42151h;
        eVar.f42052f = jVar.i;
        eVar.f42054g = jVar.f42154j;
        eVar.f42056h = jVar.f42156k;
        eVar.i = jVar.f42158l;
        eVar.f42059j = jVar.f42160m;
        eVar.f42061k = jVar.f42161n;
        eVar.f42063l = jVar.f42163o;
        eVar.f42065m = jVar.f42165p;
        eVar.f42066n = jVar.f42166q;
        eVar.f42068o = jVar.f42167r;
        eVar.f42074s = jVar.f42168s;
        eVar.f42075t = jVar.f42169t;
        eVar.f42076u = jVar.f42170u;
        eVar.f42077v = jVar.f42171v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.f42118F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.f42119G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.f42120H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.f42121I;
        eVar.f42018A = jVar.f42129R;
        eVar.f42019B = jVar.f42128Q;
        eVar.f42079x = jVar.f42125N;
        eVar.f42081z = jVar.f42127P;
        eVar.f42022E = jVar.f42172w;
        eVar.f42023F = jVar.f42173x;
        eVar.f42070p = jVar.f42175z;
        eVar.f42072q = jVar.f42113A;
        eVar.f42073r = jVar.f42114B;
        eVar.f42024G = jVar.f42174y;
        eVar.f42036T = jVar.f42115C;
        eVar.f42037U = jVar.f42116D;
        eVar.f42026I = jVar.f42131T;
        eVar.f42025H = jVar.f42132U;
        eVar.f42027K = jVar.f42134W;
        eVar.J = jVar.f42133V;
        eVar.f42039W = jVar.f42159l0;
        eVar.f42040X = jVar.m0;
        eVar.f42028L = jVar.f42135X;
        eVar.f42029M = jVar.Y;
        eVar.f42032P = jVar.f42136Z;
        eVar.f42033Q = jVar.f42138a0;
        eVar.f42030N = jVar.f42140b0;
        eVar.f42031O = jVar.f42142c0;
        eVar.f42034R = jVar.f42144d0;
        eVar.f42035S = jVar.f42146e0;
        eVar.f42038V = jVar.f42117E;
        eVar.f42046c = jVar.f42147f;
        eVar.f42042a = jVar.f42143d;
        eVar.f42044b = jVar.f42145e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f42139b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f42141c;
        String str = jVar.f42157k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.f42041Z = jVar.f42164o0;
        eVar.setMarginStart(jVar.f42122K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f42109d;
        jVar.getClass();
        j jVar2 = this.f42109d;
        jVar.f42137a = jVar2.f42137a;
        jVar.f42139b = jVar2.f42139b;
        jVar.f42141c = jVar2.f42141c;
        jVar.f42143d = jVar2.f42143d;
        jVar.f42145e = jVar2.f42145e;
        jVar.f42147f = jVar2.f42147f;
        jVar.f42149g = jVar2.f42149g;
        jVar.f42151h = jVar2.f42151h;
        jVar.i = jVar2.i;
        jVar.f42154j = jVar2.f42154j;
        jVar.f42156k = jVar2.f42156k;
        jVar.f42158l = jVar2.f42158l;
        jVar.f42160m = jVar2.f42160m;
        jVar.f42161n = jVar2.f42161n;
        jVar.f42163o = jVar2.f42163o;
        jVar.f42165p = jVar2.f42165p;
        jVar.f42166q = jVar2.f42166q;
        jVar.f42167r = jVar2.f42167r;
        jVar.f42168s = jVar2.f42168s;
        jVar.f42169t = jVar2.f42169t;
        jVar.f42170u = jVar2.f42170u;
        jVar.f42171v = jVar2.f42171v;
        jVar.f42172w = jVar2.f42172w;
        jVar.f42173x = jVar2.f42173x;
        jVar.f42174y = jVar2.f42174y;
        jVar.f42175z = jVar2.f42175z;
        jVar.f42113A = jVar2.f42113A;
        jVar.f42114B = jVar2.f42114B;
        jVar.f42115C = jVar2.f42115C;
        jVar.f42116D = jVar2.f42116D;
        jVar.f42117E = jVar2.f42117E;
        jVar.f42118F = jVar2.f42118F;
        jVar.f42119G = jVar2.f42119G;
        jVar.f42120H = jVar2.f42120H;
        jVar.f42121I = jVar2.f42121I;
        jVar.J = jVar2.J;
        jVar.f42122K = jVar2.f42122K;
        jVar.f42123L = jVar2.f42123L;
        jVar.f42124M = jVar2.f42124M;
        jVar.f42125N = jVar2.f42125N;
        jVar.f42126O = jVar2.f42126O;
        jVar.f42127P = jVar2.f42127P;
        jVar.f42128Q = jVar2.f42128Q;
        jVar.f42129R = jVar2.f42129R;
        jVar.f42130S = jVar2.f42130S;
        jVar.f42131T = jVar2.f42131T;
        jVar.f42132U = jVar2.f42132U;
        jVar.f42133V = jVar2.f42133V;
        jVar.f42134W = jVar2.f42134W;
        jVar.f42135X = jVar2.f42135X;
        jVar.Y = jVar2.Y;
        jVar.f42136Z = jVar2.f42136Z;
        jVar.f42138a0 = jVar2.f42138a0;
        jVar.f42140b0 = jVar2.f42140b0;
        jVar.f42142c0 = jVar2.f42142c0;
        jVar.f42144d0 = jVar2.f42144d0;
        jVar.f42146e0 = jVar2.f42146e0;
        jVar.f42148f0 = jVar2.f42148f0;
        jVar.f42150g0 = jVar2.f42150g0;
        jVar.f42152h0 = jVar2.f42152h0;
        jVar.f42157k0 = jVar2.f42157k0;
        int[] iArr = jVar2.f42153i0;
        if (iArr == null || jVar2.f42155j0 != null) {
            jVar.f42153i0 = null;
        } else {
            jVar.f42153i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f42155j0 = jVar2.f42155j0;
        jVar.f42159l0 = jVar2.f42159l0;
        jVar.m0 = jVar2.m0;
        jVar.f42162n0 = jVar2.f42162n0;
        jVar.f42164o0 = jVar2.f42164o0;
        k kVar = iVar.f42108c;
        kVar.getClass();
        k kVar2 = this.f42108c;
        kVar2.getClass();
        kVar.f42177a = kVar2.f42177a;
        kVar.f42179c = kVar2.f42179c;
        kVar.f42181e = kVar2.f42181e;
        kVar.f42180d = kVar2.f42180d;
        l lVar = iVar.f42107b;
        l lVar2 = this.f42107b;
        lVar.f42185a = lVar2.f42185a;
        lVar.f42187c = lVar2.f42187c;
        lVar.f42188d = lVar2.f42188d;
        lVar.f42186b = lVar2.f42186b;
        m mVar = iVar.f42110e;
        mVar.getClass();
        m mVar2 = this.f42110e;
        mVar2.getClass();
        mVar.f42190a = mVar2.f42190a;
        mVar.f42191b = mVar2.f42191b;
        mVar.f42192c = mVar2.f42192c;
        mVar.f42193d = mVar2.f42193d;
        mVar.f42194e = mVar2.f42194e;
        mVar.f42195f = mVar2.f42195f;
        mVar.f42196g = mVar2.f42196g;
        mVar.f42197h = mVar2.f42197h;
        mVar.i = mVar2.i;
        mVar.f42198j = mVar2.f42198j;
        mVar.f42199k = mVar2.f42199k;
        mVar.f42200l = mVar2.f42200l;
        mVar.f42201m = mVar2.f42201m;
        iVar.f42106a = this.f42106a;
        return iVar;
    }
}
