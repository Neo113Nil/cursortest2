package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u8b extends uif implements Function1 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8b(int i, Object obj) {
        super(1);
        this.r = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z9h z9hVar;
        z9h z9hVar2;
        z9h z9hVar3;
        z9h a;
        z9h a2;
        switch (this.r) {
            case 0:
                return new hqe((((int) (((hqe) obj).a >> 32)) << 32) | (0 & 4294967295L));
            case 1:
                return new hqe((((int) (((hqe) obj).a & 4294967295L)) & 4294967295L) | (0 << 32));
            case 2:
                return new hqe((((int) (((hqe) obj).a >> 32)) << 32) | (0 & 4294967295L));
            case 3:
                return new wpe((((-((int) (((hqe) obj).a >> 32))) / 2) << 32) | (0 & 4294967295L));
            case 4:
                return Boolean.valueOf(((dpc) obj).W0(7));
            case 5:
                ((j4e) obj).getClass();
                return Boolean.TRUE;
            case 6:
                qi4 qi4Var = (qi4) obj;
                qi4Var.getClass();
                return xdh.d(qi4Var);
            case 7:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b = q1fVar.b();
                Map map = b.b;
                String o = b.o("paysystem");
                String o2 = b.o("token");
                String g = b.g("license_url");
                String g2 = b.g("acquirer");
                if (Intrinsics.d(g2, "")) {
                    g2 = null;
                }
                hd hdVar = Intrinsics.d(g2, "kassa") ? hd.a : null;
                String g3 = b.g("environment");
                if (g3 == null) {
                    g3 = "production";
                }
                String str = g3;
                String o3 = b.o("total");
                String o4 = b.o("currency");
                q1f q1fVar2 = (q1f) map.get("merchant");
                if (q1fVar2 == null || (z9hVar = q1fVar2.a()) == null) {
                    z9hVar = null;
                }
                q1f q1fVar3 = (q1f) map.get("paymethod_markup");
                if (q1fVar3 == null || (z9hVar2 = q1fVar3.a()) == null) {
                    z9hVar2 = null;
                }
                String g4 = b.g("credit_form_url");
                gjn gjnVar = (gjn) bkp.a0(q1fVar, hhm.A).d();
                q1f q1fVar4 = (q1f) map.get("tokenization_context");
                z9h z9hVar4 = (q1fVar4 == null || (a2 = q1fVar4.a()) == null) ? null : a2;
                Boolean e = b.e("legal_for_sbp_qr");
                boolean booleanValue = e != null ? e.booleanValue() : false;
                q1f q1fVar5 = (q1f) map.get("integration_profile");
                if (q1fVar5 == null || (z9hVar3 = q1fVar5.a()) == null) {
                    z9hVar3 = null;
                }
                syh syhVar = z9hVar == null ? null : (syh) bkp.a0(z9hVar, vsf.L).d();
                yhk yhkVar = z9hVar2 == null ? null : (yhk) bkp.a0(z9hVar2, kzj.w0).d();
                q1f q1fVar6 = (q1f) map.get("meta_json");
                return new wle(gjnVar.a, o, o2, g, hdVar, str, o3, o4, syhVar, yhkVar, g4, z9hVar4, gjnVar.b, gjnVar.c, gjnVar.d, gjnVar.e, booleanValue, (q1fVar6 == null || (a = q1fVar6.a()) == null) ? null : a, gjnVar.f, z9hVar3 != null ? (qre) bkp.a0(z9hVar3, lhb.w0).d() : null);
            case 8:
                ((Number) obj).intValue();
                return null;
            case 9:
                return new c4k(((Number) obj).intValue());
            case 10:
                ((Number) obj).intValue();
                return null;
            case 11:
                ((Number) obj).intValue();
                return null;
            case 12:
                return Boolean.valueOf(((tkd) obj) instanceof jg);
            case 13:
                throw ouj.g(obj);
            case 14:
                throw ouj.g(obj);
            case 15:
                throw ouj.g(obj);
            case 16:
                throw ouj.g(obj);
            case 17:
                throw ouj.g(obj);
            case 18:
                throw ouj.g(obj);
            case 19:
                throw ouj.g(obj);
            case 20:
                throw ouj.g(obj);
            case 21:
                throw ouj.g(obj);
            default:
                yr7 yr7Var = (yr7) obj;
                yr7Var.getClass();
                yr7Var.g = "ru.yandex.music";
                yr7Var.j = new g06(new n4f(), new ksa(), (Object) null, "AndroidPlayer");
                yr7Var.h = dfi.n("from_block", "list_sdk");
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8b(int i, int i2) {
        super(i);
        this.r = i2;
    }
}
