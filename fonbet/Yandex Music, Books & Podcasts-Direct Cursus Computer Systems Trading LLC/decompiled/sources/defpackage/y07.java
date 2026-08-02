package defpackage;

import com.connectsdk.service.airplay.PListParser;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class y07 extends aur implements Function2 {
    public z07 j;
    public int k;
    public final /* synthetic */ z07 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y07(z07 z07Var, boolean z, boolean z2, boolean z3, boolean z4, Continuation continuation) {
        super(2, continuation);
        this.l = z07Var;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new y07(this.l, this.m, this.n, this.o, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y07) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e2, code lost:
    
        if (r15 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r15 == r0) goto L25;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z07 z07Var;
        String str;
        String str2;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        boolean z = this.m;
        if (i == 0) {
            qgg.h0(obj);
            z07Var = this.l;
            gs4 gs4Var = z07Var.k;
            qc9 qc9Var = z07Var.H;
            this.j = z07Var;
            this.k = 1;
            gs4Var.getClass();
            JSONObject put = new JSONObject().put("showTermsFooter", false);
            dq8 dq8Var = dq8.BIND_CARD;
            put.getClass();
            obj = ((sfg) gs4Var.d).a(qc9Var, new sfm(dq8Var, put, 2), new sx4(gs4Var, z, continuation, 1), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z07Var = this.j;
            qgg.h0(obj);
        }
        rv8 rv8Var = (rv8) obj;
        this.j = null;
        this.k = 2;
        z07Var.q.m(Boolean.FALSE);
        Pair pair = new Pair("isLightTheme", String.valueOf(this.p));
        Pair pair2 = new Pair("card_input_screen_is_payment", String.valueOf(z));
        Pair pair3 = new Pair("card_input_screen_button_state", "number");
        Pair pair4 = new Pair("card_input_screen_error_state", "none");
        Pair pair5 = new Pair("card_input_screen_anim_div_state", "gone");
        Pair pair6 = new Pair("card_input_screen_checkbox_value", PListParser.TAG_TRUE);
        Pair pair7 = new Pair("card_input_screen_pay_button_text", "Pay 100p");
        if (this.n) {
            str = "visible";
            str2 = str;
        } else {
            str = "invisible";
            str2 = "visible";
        }
        Object emit = z07Var.I.emit(new hw8(rv8Var, u75.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("card_input_screen_back_button_div_state", str), new Pair("card_input_screen_checkbox_state", this.o ? str2 : "gone"))), this);
        if (emit != nm6Var) {
            emit = Unit.a;
        }
    }
}
