package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class lx4 extends aur implements Function1 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Collection n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx4(vx6 vx6Var, List list, boolean z, qc9 qc9Var, Continuation continuation) {
        super(1, continuation);
        this.m = vx6Var;
        this.n = list;
        this.l = z;
        this.o = qc9Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new lx4((ueo) this.m, continuation, this.l, (Set) this.n, (vhn) this.o);
            default:
                return new lx4((vx6) this.m, (List) this.n, this.l, (qc9) this.o, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((lx4) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Collection collection = this.n;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                q1m K = ((MainDatabase) ((ueo) obj2)).K();
                ysr ysrVar = new ysr("playlist_track");
                um4 um4Var = new um4(pgp.a);
                if (this.l) {
                    um4Var.e("track_id", (Set) collection);
                }
                um4Var.h("playlist_id", (vhn) this.o);
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                this.k = 1;
                K.getClass();
                TreeMap treeMap = afo.h;
                j6e a2 = wyf.x(a).a();
                Object G = up6.G(K.a, true, false, new g20((String) a2.a, a2, K, 7), this);
                return G == nm6Var ? nm6Var : G;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vx6 vx6Var = (vx6) obj2;
                this.k = 1;
                vx6Var.getClass();
                String jSONObject = ((br1) vx6Var.b).a("select_bank_screen.json").toString();
                jSONObject.getClass();
                tc1 tc1Var = (tc1) vx6Var.c;
                JSONObject jSONObject2 = new JSONObject(c.r(c.r(c.r(c.r(jSONObject, "SBP_SCREEN_TITLE", tc1Var.b(R.string.paymentsdk_prebuild_sbp_title), false), "SBP_SCREEN_SUBTITLE", tc1Var.b(R.string.paymentsdk_prebuild_sbp_subtitle), false), "BANK_NOT_FOUND", tc1Var.b(R.string.paymentsdk_prebuild_sbp_bank_not_found), false), "SBP_LEGAL_VISIBILITY", "gone", false));
                JSONArray jSONArray = jSONObject2.getJSONObject("card").getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items").getJSONObject(1).getJSONArray("items").getJSONObject(1).getJSONArray("items");
                for (zl2 zl2Var : CollectionsKt.o0((List) collection, new zda(9))) {
                    JSONObject put = new JSONObject().put("type", "bank_cell");
                    String str = zl2Var.a;
                    JSONObject put2 = put.put("bankName", str).put("logoURL", zl2Var.b);
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    jSONArray.put(put2.put("visibilityExpression", hrg.A(lowerCase, "@{contains('", lowerCase, "', toLowerCase(trim(select_bank_screen_bank_name_filter))) ? 'visible' : 'gone' }")).put("selectBankURL", "payment-sdk://select_bank?scheme=".concat(zl2Var.c)).put("delimeterVisibility", "@{select_bank_screen_last_bank_name == '" + str + "' ? 'gone' : 'visible' }"));
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("templates");
                JSONObject jSONObject4 = jSONObject2.getJSONObject("card");
                jSONObject3.getClass();
                jSONObject4.getClass();
                uv8 uv8Var = new uv8(jSONObject3, jSONObject4);
                return uv8Var == nm6Var2 ? nm6Var2 : uv8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx4(ueo ueoVar, Continuation continuation, boolean z, Set set, vhn vhnVar) {
        super(1, continuation);
        this.m = ueoVar;
        this.l = z;
        this.n = set;
        this.o = vhnVar;
    }
}
