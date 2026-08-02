package defpackage;

import androidx.fragment.app.t;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class mza {
    public static final long i;
    public final z66 a;
    public final vx6 b;
    public final yza c;
    public final tya d;
    public final zzp e;
    public final zza f;
    public final xdr g = ydr.a(Boolean.FALSE);
    public nnk h;

    static {
        msa msaVar = nsa.b;
        i = nsa.f(yd5.M(30, ssa.DAYS));
    }

    public mza(z66 z66Var, vx6 vx6Var, yza yzaVar, tya tyaVar, zzp zzpVar, zza zzaVar) {
        this.a = z66Var;
        this.b = vx6Var;
        this.c = yzaVar;
        this.d = tyaVar;
        this.e = zzpVar;
        this.f = zzaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ih4 ih4Var, t tVar, vya vyaVar, cg6 cg6Var) {
        kza kzaVar;
        Object obj;
        int i2;
        if (cg6Var instanceof kza) {
            kzaVar = (kza) cg6Var;
            int i3 = kzaVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kzaVar.o = i3 - Integer.MIN_VALUE;
                obj = kzaVar.m;
                nm6 nm6Var = nm6.a;
                i2 = kzaVar.o;
                Continuation continuation = null;
                if (i2 != 0) {
                    qgg.h0(obj);
                    kzaVar.j = ih4Var;
                    kzaVar.k = tVar;
                    kzaVar.l = vyaVar;
                    kzaVar.o = 1;
                    obj = gld.Q(new ov(this, ih4Var, continuation, 19), kzaVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vyaVar = kzaVar.l;
                    tVar = kzaVar.k;
                    ih4Var = kzaVar.j;
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                ih4Var.getClass();
                nmb nmbVar = this.d.a;
                String str = ih4Var.a;
                wjb H = ywf.H(ih4Var);
                pkb I = ywf.I(ih4Var);
                hlb hlbVar = hlb.Fullscreen;
                str.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("hash", str);
                linkedHashMap.put("page_id", H.a);
                linkedHashMap.put("page_style", "bottomsheet");
                linkedHashMap.put("skeleton_id", "");
                linkedHashMap.put("main_object_type", I.a);
                linkedHashMap.put("main_object_id", "");
                eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
                linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
                linkedHashMap.put("view_uuid", "");
                linkedHashMap.put("_meta", nmb.u(2));
                nmbVar.C("Screen.Opened", linkedHashMap);
                this.h = new nnk(tVar, 25);
                es6 a = this.f.a(tVar);
                Boolean bool = Boolean.TRUE;
                xdr xdrVar = this.g;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                nnk nnkVar = this.h;
                if (nnkVar != null) {
                    vya vyaVar2 = new vya(0, new lza(this, ih4Var, vyaVar, a), nnkVar);
                    t tVar2 = (t) nnkVar.a;
                    yfx yfxVar = new yfx(tVar2, vyaVar2);
                    nnkVar.b = yfxVar;
                    nt0.M(tVar2, (jp0) yfxVar.c, new wn5(new kw5(28, yfxVar, ih4Var), -1339118604, true));
                }
                return bool;
            }
        }
        kzaVar = new kza(this, cg6Var);
        obj = kzaVar.m;
        nm6 nm6Var2 = nm6.a;
        i2 = kzaVar.o;
        Continuation continuation2 = null;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
