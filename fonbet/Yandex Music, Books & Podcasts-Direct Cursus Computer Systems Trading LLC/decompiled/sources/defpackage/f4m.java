package defpackage;

import android.R;
import android.content.SharedPreferences;
import android.net.Uri;
import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.network.retrypolicy.api.RetryPolicyApi;
import com.yandex.music.shared.network.retrypolicy.api.RetryPolicyDto;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import retrofit2.Call;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes3.dex */
public class f4m implements x7o, nlr, u0f, oip, c8k, yjo, dn0, bvj, nwu, xjn, w2q, tqj {
    public final /* synthetic */ int a;
    public Object b;

    public f4m(int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.b = new SparseArray();
                return;
            case 21:
                this.b = ByteBuffer.allocate(8);
                return;
            default:
                try {
                    this.b = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e) {
                    kac.k("Couldn't create XmlPullParserFactory instance", e);
                    throw null;
                }
        }
    }

    public static final kk1 q(f4m f4mVar, zp2 zp2Var, String str, c01 c01Var) {
        String str2;
        x41 x41Var;
        String str3 = zp2Var.a;
        String str4 = zp2Var.b;
        boolean z = c01Var != null ? c01Var.c : false;
        String str5 = "unknown";
        if (c01Var != null) {
            String uri = c01Var.q.a.getUri();
            if (uri == null) {
                uri = "null";
            }
            str2 = uri;
        } else {
            str2 = "unknown";
        }
        if (c01Var != null && (str5 = c01Var.l.getUri()) == null) {
            str5 = "null";
        }
        String str6 = str5;
        String str7 = null;
        if (c01Var != null && (x41Var = c01Var.o) != null && x41Var != x41.c) {
            str7 = x41Var == x41.a ? "from-artist-photos" : "from-album-cover";
        }
        return new kk1(str3, str, str4, z, str2, str6, str7);
    }

    public static String r() {
        return ("track_type NOT IN (" + CollectionsKt.X(gys.MyMusic.a, null, null, null, new osl(14), 31) + ")").concat(" AND track_for_kids != 1");
    }

    public void A() {
        View view;
        View view2 = (View) this.b;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new hd3(view, 2));
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
        ((Function1) this.b).invoke(Boolean.valueOf(z));
    }

    @Override // defpackage.nlr
    public void X(PlaybackException playbackException) {
        nlr g = ((olr) this.b).g();
        if (g != null) {
            g.X(playbackException);
        }
    }

    @Override // defpackage.oip
    public void a(f9f f9fVar, f9f f9fVar2, t9f t9fVar) {
        ((mip) this.b).f(f9fVar, f9fVar2, t9fVar, true);
    }

    @Override // defpackage.oip
    public void b(f9f f9fVar, Function1 function1) {
        ((mip) this.b).d(f9fVar, function1, true);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    @Override // defpackage.yjo
    public xjo e(String str) {
        str.getClass();
        vsr vsrVar = (vsr) this.b;
        String databaseName = vsrVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                xq0.o(hrg.q("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !StringsKt.l0('/', databaseName, databaseName).equals(StringsKt.l0('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + vsrVar.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new qsr(vsrVar.getWritableDatabase());
    }

    @Override // defpackage.u0f
    public List e0() {
        return ((ql1) x97.D(g.a, new g2l(this, null, 28))).a;
    }

    @Override // defpackage.bvj
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.b)) {
            ((ByteBuffer) this.b).position(0);
            messageDigest.update(((ByteBuffer) this.b).putLong(l.longValue()).array());
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        String str;
        faqVar.getClass();
        xqn xqnVar = (xqn) this.b;
        if (faqVar instanceof naq) {
            mqs mqsVar = ((naq) faqVar).e;
            mqsVar.getClass();
            str = ngg.q(mqsVar).a();
        } else if (faqVar instanceof daq) {
            str = ((daq) faqVar).e.a;
        } else if (faqVar instanceof saq) {
            str = ((saq) faqVar).e.a;
        } else {
            if (!(faqVar instanceof qaq)) {
                b6e.s();
                return null;
            }
            str = ((qaq) faqVar).c.a;
        }
        xqnVar.a = str;
        return Unit.a;
    }

    @Override // defpackage.dn0
    public qic get(int i) {
        return (bjc) this.b;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        WeakReference weakReference = (WeakReference) this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        xqn xqnVar = (xqn) this.b;
        mqs mqsVar = jzsVar.a;
        mqsVar.getClass();
        xqnVar.a = ngg.q(mqsVar).a();
        return Unit.a;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        String str;
        m1qVar.getClass();
        xqn xqnVar = (xqn) this.b;
        if (m1qVar instanceof c2q) {
            mqs mqsVar = ((c2q) m1qVar).d;
            mqsVar.getClass();
            str = ngg.q(mqsVar).a();
        } else if (m1qVar instanceof j1q) {
            str = ((j1q) m1qVar).d.a;
        } else {
            if (!(m1qVar instanceof e2q)) {
                b6e.s();
                return null;
            }
            str = ((e2q) m1qVar).c.a;
        }
        xqnVar.a = str;
        return Unit.a;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        ((xqn) this.b).a = i5uVar.a.a;
        return Unit.a;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        ((xqn) this.b).a = k4dVar.a.a;
        return Unit.a;
    }

    @Override // defpackage.oip
    public void l(f9f f9fVar, t9f t9fVar) {
        t9fVar.getClass();
        ((mip) this.b).g(f9fVar, new wf6(t9fVar), true);
    }

    @Override // defpackage.oip
    public void m(f9f f9fVar, Function1 function1) {
        ((mip) this.b).e(f9fVar, function1, true);
    }

    @Override // defpackage.yjo
    public boolean n() {
        return true;
    }

    @Override // defpackage.c8k
    public Object o(Uri uri, kb7 kb7Var) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.b).newPullParser();
            newPullParser.setInput(kb7Var, null);
            return (n9r) new r9r(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e) {
            throw r7k.b(null, e);
        }
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 1:
                mgk mgkVar = (mgk) obj;
                mgkVar.getClass();
                mgkVar.e(jfk.a, null, new kpm(0, (lpm) this.b));
                break;
            case 8:
                en enVar = (en) obj;
                enVar.getClass();
                gdp gdpVar = (gdp) this.b;
                boolean z = gdpVar.x;
                voi voiVar = gdpVar.v;
                if (!z) {
                    if (!(enVar instanceof zm)) {
                        if (!(enVar instanceof bn)) {
                            boolean z2 = enVar instanceof xm;
                            h2c h2cVar = h2c.a;
                            if (!z2) {
                                if (!(enVar instanceof dn)) {
                                    if (!(enVar instanceof ym)) {
                                        if (enVar instanceof cn) {
                                            t9i t9iVar = ((cn) enVar).a;
                                            if (!(t9iVar instanceof xa4)) {
                                                if (t9iVar instanceof fb4) {
                                                    fb4 fb4Var = (fb4) t9iVar;
                                                    voiVar.l(new j2c(fb4Var.b, fb4Var.c));
                                                    break;
                                                }
                                            } else {
                                                xa4 xa4Var = (xa4) t9iVar;
                                                voiVar.l(new k2c(xa4Var.b, xa4Var.c, xa4Var.d));
                                                break;
                                            }
                                        }
                                    } else {
                                        String str = ((ym) enVar).a;
                                        eb4[] eb4VarArr = eb4.a;
                                        if (Intrinsics.d(str, "cvv")) {
                                            voiVar.l(i2c.a);
                                            voiVar.l(h2cVar);
                                            break;
                                        }
                                    }
                                } else {
                                    xq0.q("Sbp has its own fragment");
                                    break;
                                }
                            } else {
                                voiVar.l(h2cVar);
                                break;
                            }
                        } else {
                            bn bnVar = (bn) enVar;
                            voiVar.l(new j2c(bnVar.a, bnVar.b));
                            break;
                        }
                    } else {
                        gdpVar.t.l(new ycp(ru.yandex.music.R.string.paymentsdk_success_title));
                        break;
                    }
                }
                break;
            default:
                ((k4x) this.b).a.a.r();
                break;
        }
    }

    @Override // defpackage.oip
    public void p(f9f f9fVar, nip nipVar) {
        f9fVar.getClass();
        ((mip) this.b).g(f9fVar, new xf6(nipVar), true);
    }

    public synchronized Integer s() {
        int i;
        i = ((SharedPreferences) this.b).getInt("USER_CAPPING", -1);
        return i == -1 ? null : Integer.valueOf(i);
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        this.b = obj2 != null ? new WeakReference(obj2) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(cg6 cg6Var) {
        vbo vboVar;
        int i;
        bii biiVar;
        String rawJson;
        if (cg6Var instanceof vbo) {
            vboVar = (vbo) cg6Var;
            int i2 = vboVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vboVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vboVar.j;
                nm6 nm6Var = nm6.a;
                i = vboVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<RetryPolicyDto>> a = ((RetryPolicyApi) ((e0j) this.b).a.b(RetryPolicyApi.class)).a();
                    vboVar.l = 1;
                    obj = swf.N(a, vboVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    RetryPolicyDto retryPolicyDto = (RetryPolicyDto) ((aii) biiVar).a;
                    retryPolicyDto.getClass();
                    Map a2 = dk6.a(retryPolicyDto);
                    ubo uboVar = (a2 == null || (rawJson = retryPolicyDto.getRawJson()) == null) ? null : new ubo(a2, rawJson);
                    return uboVar == null ? new nj6(null) : new qj6(uboVar);
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        vboVar = new vbo(this, cg6Var);
        Object obj2 = vboVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vboVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public void u() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void v() {
        try {
            c1t c1tVar = new c1t("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", 5);
            this.b = c1tVar;
            GLES20.glGetUniformLocation(c1tVar.b, "uMvpMatrix");
            GLES20.glGetUniformLocation(((c1t) this.b).b, "uTexMatrix");
            ((c1t) this.b).j("aPosition");
            ((c1t) this.b).j("aTexCoords");
            GLES20.glGetUniformLocation(((c1t) this.b).b, "uTexture");
        } catch (zcd e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (defpackage.tyf.N(r1, r0, r8) != r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(String str, Iterable iterable, cg6 cg6Var) {
        vws vwsVar;
        int i;
        Iterable iterable2;
        if (cg6Var instanceof vws) {
            vwsVar = (vws) cg6Var;
            int i2 = vwsVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vwsVar.m = i2 - Integer.MIN_VALUE;
                vws vwsVar2 = vwsVar;
                Object obj = vwsVar2.k;
                nm6 nm6Var = nm6.a;
                i = vwsVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.b;
                    vwsVar2.j = iterable;
                    vwsVar2.m = 1;
                    obj = i5hVar.b(str, vwsVar2);
                    if (obj != nm6Var) {
                        iterable2 = iterable;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterable iterable3 = vwsVar2.j;
                    qgg.h0(obj);
                    ssg.a(3, null, "insert tracks", null);
                    return Unit.a;
                }
                Iterable iterable4 = vwsVar2.j;
                qgg.h0(obj);
                iterable2 = iterable4;
                MainDatabase mainDatabase = (MainDatabase) obj;
                wws wwsVar = new wws(mainDatabase, null, mainDatabase.T(), iterable2, mainDatabase.x(), this, mainDatabase.A());
                vwsVar2.j = null;
                vwsVar2.m = 2;
            }
        }
        vwsVar = new vws(this, cg6Var);
        vws vwsVar22 = vwsVar;
        Object obj2 = vwsVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = vwsVar22.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        wws wwsVar2 = new wws(mainDatabase2, null, mainDatabase2.T(), iterable2, mainDatabase2.x(), this, mainDatabase2.A());
        vwsVar22.j = null;
        vwsVar22.m = 2;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        switch (this.a) {
            case 1:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                ((lpm) this.b).r.l(new bpm(true, bfkVar));
                break;
            default:
                bfk bfkVar2 = (bfk) obj;
                bfkVar2.getClass();
                gdp gdpVar = (gdp) this.b;
                if (!gdpVar.x) {
                    gdpVar.t.l(new tcp(bfkVar2));
                    break;
                }
                break;
        }
    }

    public List y(cvl cvlVar, Integer num) {
        cvlVar.getClass();
        long j = cvlVar.k;
        if (j < 0) {
            su4.s(2, null, "nativeId not set", null);
        }
        ysr ysrVar = new ysr("playlist_view");
        um4 um4Var = new um4(pgp.c);
        um4Var.i("playlist_id=?", xz0.X(new Object[]{Long.valueOf(j)}));
        tt0.K(ysrVar, um4Var);
        if (num != null) {
            ysrVar.b(String.valueOf(num.intValue()));
        }
        ysrVar.f = cvlVar.d() ? "timestamp DESC, position_playlist" : "position_playlist";
        atn a = ysrVar.a();
        g4m g4mVar = (g4m) this.b;
        g4mVar.getClass();
        TreeMap treeMap = afo.h;
        j6e a2 = wyf.x(a).a();
        return (List) up6.F(g4mVar.a, true, true, new g20((String) a2.a, a2, 9));
    }

    public synchronized void z(Integer num) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.b).edit();
            edit.putInt("USER_CAPPING", num != null ? num.intValue() : -1);
            edit.apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.nwu
    public void d() {
    }

    public /* synthetic */ f4m(int i, boolean z) {
        this.a = i;
    }

    public f4m(SharedPreferences sharedPreferences) {
        this.a = 19;
        sharedPreferences.getClass();
        this.b = sharedPreferences;
    }

    public f4m(e0j e0jVar) {
        this.a = 11;
        e0jVar.getClass();
        this.b = new jhq(e0jVar);
    }

    public f4m(c01 c01Var) {
        this.a = 7;
        c01Var.getClass();
        this.b = c01Var;
    }

    public f4m(arf[] arfVarArr) {
        this.a = 10;
        arfVarArr.getClass();
        this.b = xz0.w(arfVarArr);
    }

    public f4m(vsr vsrVar) {
        this.a = 15;
        vsrVar.getClass();
        this.b = vsrVar;
    }

    public f4m(g4m g4mVar) {
        this.a = 0;
        g4mVar.getClass();
        this.b = g4mVar;
    }

    public /* synthetic */ f4m(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public f4m(qut qutVar) {
        this.a = 16;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), qutVar);
    }

    public f4m(float f, float f2) {
        this.a = 20;
        this.b = new bjc(f, f2, 0.01f);
    }
}
