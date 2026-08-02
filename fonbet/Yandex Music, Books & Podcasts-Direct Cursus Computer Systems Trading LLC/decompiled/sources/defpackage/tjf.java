package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.t;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.player.a;

/* loaded from: classes3.dex */
public final class tjf {
    public static final /* synthetic */ s9f[] y;
    public final kxi a;
    public final ylf b;
    public yfx c;
    public ekf d;
    public final jyr e;
    public final rjf f;
    public jkf g;
    public final r2e h;
    public final mka i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final ybf n;
    public final jyr o;
    public final jyr p;
    public final hkf q;
    public final t1f r;
    public final jyr s;
    public final rjq t;
    public vqi u;
    public boolean v;
    public boolean w;
    public boolean x;

    static {
        opi opiVar = new opi(tjf.class, "blockAlpha", "getBlockAlpha()F", 0);
        ern.a.getClass();
        y = new s9f[]{opiVar};
    }

    public tjf(Context context, jfu jfuVar, kxi kxiVar, ylf ylfVar) {
        context.getClass();
        jfuVar.getClass();
        this.a = kxiVar;
        this.b = ylfVar;
        l18 l18Var = l18.b;
        jyr b = l18Var.b(hag.I(yjf.class), true);
        this.e = b;
        ((yjf) b.getValue()).getClass();
        this.f = new rjf(new ime(jfuVar));
        this.h = new r2e(this);
        this.i = new mka(this);
        this.j = l18Var.b(hag.I(frt.class), true);
        this.k = l18Var.b(hag.I(wst.class), true);
        this.l = l18Var.b(hag.I(lwc.class), true);
        this.m = l18Var.b(hag.I(ior.class), true);
        this.n = new ybf(ern.a(sor.class), new r71(jfuVar, 8), new pva(29, new sjf(this, 0)));
        this.o = btf.b(new sjf(this, 1));
        this.p = btf.b(new bff(9));
        ((yjf) b.getValue()).getClass();
        this.q = new hkf();
        ((yjf) b.getValue()).getClass();
        bdt I = hag.I(Context.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.r = new t1f((Context) qdcVar.C(I));
        this.s = l18Var.b(hag.I(mg5.class), true);
        this.t = new rjq(false);
    }

    public static w5l f(s9p s9pVar) {
        return new w5l(new cvo(wjb.MainScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), new jab(qkb.MyWave, 1, 2, 0), new thj(pkb.Wave, s9pVar.toString(), 1, 1, ""), null);
    }

    public final StationId a() {
        s9p y2 = tyf.y((lwu) b().e.a.getValue());
        if (y2 != null) {
            return StationId.e(y2);
        }
        return null;
    }

    public final mg5 b() {
        return (mg5) this.s.getValue();
    }

    public final void c() {
        n7q n7qVar;
        rjf rjfVar = this.f;
        ime imeVar = (ime) rjfVar.c;
        d6l x = p6g.x((e6l) ((oq7) ((jyr) imeVar.c).getValue()).a.c.getValue());
        Continuation continuation = null;
        mwk mwkVar = (x == null || (n7qVar = x.a) == null) ? null : (mwk) wdg.A(n7qVar, mvn.d);
        if (mwkVar != null) {
            ((t3g) ((jyr) imeVar.d).getValue()).s(mwkVar);
            l5v l5vVar = (l5v) rjfVar.f;
            if (l5vVar != null) {
                l5vVar.f();
            }
        }
        x97.y(hld.s(this.t, dm6.b), null, null, new ox1(this, continuation, 24), 3);
    }

    public final void d() {
        ((y18) this.q.b.getValue()).getClass();
        b9s[] b9sVarArr = d9s.a;
        if (d9s.a(b9s.b) && !((Boolean) ((wst) this.k.getValue()).a(((frt) this.j.getValue()).c()).f(vye.e)).booleanValue()) {
            pst pstVar = (pst) ((jyr) this.r.c).getValue();
            pstVar.getClass();
            if (pstVar.a.getBoolean("smart_radio_block_wizard_skipped", false) || this.w) {
                return;
            }
            ot0.A(dhn.b.e(), "RadioSmartBlock_WizardAlert_Shown", null);
            this.w = true;
            yfx yfxVar = this.c;
            if (yfxVar != null) {
                sjf sjfVar = new sjf(this, 2);
                x1e x1eVar = ((u1e) yfxVar.b).a;
                x1eVar.getClass();
                ybf ybfVar = x1eVar.j;
                pcg.M(x1eVar.a, (muv) x1eVar.h.getValue(), (dvv) ybfVar.getValue(), ((dvv) ybfVar.getValue()).G(), sjfVar);
            }
        }
    }

    public final void e() {
        boolean z;
        jyr jyrVar = this.p;
        jyr jyrVar2 = this.o;
        r9p r9pVar = r9p.a;
        kxi kxiVar = this.a;
        t1f t1fVar = this.r;
        lwu lwuVar = (lwu) b().e.a.getValue();
        s9p y2 = tyf.y(lwuVar);
        Continuation continuation = null;
        StationId e = y2 != null ? StationId.e(y2) : null;
        weo.t();
        if (lwuVar instanceof zvu) {
            return;
        }
        if (lwuVar instanceof dwu) {
            x3n x3nVar = (x3n) t1fVar.d;
            ((y18) ((jyr) x3nVar.c).getValue()).getClass();
            b9s[] b9sVarArr = d9s.a;
            if (d9s.a(b9s.e)) {
                pst pstVar = (pst) ((jyr) x3nVar.d).getValue();
                pstVar.getClass();
                z = !pstVar.a.getBoolean("smart_radio_player_animation_showed", false);
            } else {
                z = false;
            }
            if (z) {
                yfx yfxVar = this.c;
                if (yfxVar != null) {
                    t l = ((u1e) yfxVar.b).a.a.l();
                    a aVar = l instanceof a ? (a) l : null;
                    if (aVar != null) {
                        cjl cjlVar = aVar.v;
                        x97.y(cjlVar.f, null, null, new bjl(cjlVar, continuation, 2), 3);
                    }
                }
                SharedPreferences.Editor edit = ((pst) ((jyr) ((x3n) t1fVar.d).d).getValue()).edit();
                edit.putBoolean("smart_radio_player_animation_showed", true);
                edit.apply();
            }
            if (e != null) {
                dhn dhnVar = dhn.b;
                String n = e.n();
                n.getClass();
                dhnVar.g(n);
            }
            ((k1l) jyrVar2.getValue()).a(new ToggleCommand(false), new b3t("core_toggle"));
            ekf ekfVar = this.d;
            if (ekfVar == null || e == null) {
                return;
            }
            ekfVar.a(e.h(), wre.a, this.x, ah.a);
            return;
        }
        if (lwuVar instanceof ewu) {
            if (e != null) {
                ot0.A(dhn.b.e(), "RadioSmartBlock_Playing_Paused", null);
            }
            ((k1l) jyrVar2.getValue()).a(new ToggleCommand(false), new b3t("core_toggle"));
            ekf ekfVar2 = this.d;
            if (ekfVar2 == null || e == null) {
                return;
            }
            ekfVar2.a(e.h(), wre.a, this.x, ah.b);
            return;
        }
        if (lwuVar instanceof cwu) {
            d();
            mg5 b = b();
            iwu iwuVar = ((cwu) lwuVar).a;
            b.b(iwuVar.a, kxiVar, f(iwuVar.a), (chn) jyrVar.getValue());
            ekf ekfVar3 = this.d;
            if (ekfVar3 == null || e == null) {
                return;
            }
            ekfVar3.a(e.h(), wre.a, this.x, ah.a);
            return;
        }
        if (!lwuVar.equals(hwu.a)) {
            b6e.s();
            return;
        }
        StationId f = StationId.f("user:onyourwave");
        f.getClass();
        d();
        b().b(new s9p(t75.c(r9pVar)), kxiVar, f(new s9p(t75.c(r9pVar))), (chn) jyrVar.getValue());
        ekf ekfVar4 = this.d;
        if (ekfVar4 != null) {
            ekfVar4.a(f.h(), wre.a, this.x, ah.a);
        }
    }
}
