package defpackage;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import java.util.Date;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.g;

/* loaded from: classes12.dex */
public final class rpa extends r8 {
    public final wnt c;
    public final jtq0 w;
    public final g x;
    public final r0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rpa(dne0 dne0Var, wnt wntVar, jtq0 jtq0Var, g gVar) {
        super(7, r2);
        Object failure;
        cne0 b = dne0Var.b();
        this.c = wntVar;
        this.w = jtq0Var;
        this.x = gVar;
        String l = b.l(Hg(), null);
        if (l != null) {
            try {
                ChargersSelectedDiscountDto chargersSelectedDiscountDto = (ChargersSelectedDiscountDto) ((xnt) wntVar).c(l, ChargersSelectedDiscountDto.Companion.serializer());
                failure = new ow9(chargersSelectedDiscountDto.a, chargersSelectedDiscountDto.b, chargersSelectedDiscountDto.c);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            r5 = (ow9) (failure instanceof Result.Failure ? null : failure);
        }
        this.y = bvf0.c(r5);
    }

    public final String Hg() {
        return this.x.i() + "_chargers_selected_discount_key";
    }

    public final void Ig(ir9 ir9Var) {
        ChargersDiscountTypeDto chargersDiscountTypeDto;
        r0 r0Var = this.y;
        ow9 ow9Var = (ow9) r0Var.getValue();
        if ((ow9Var != null ? ow9Var.a : null) == (ir9Var != null ? ir9Var.a : null)) {
            if (jl40.l(ow9Var != null ? ow9Var.b : null, ir9Var != null ? ir9Var.b : null)) {
                return;
            }
        }
        if (ir9Var == null || (chargersDiscountTypeDto = ir9Var.a) == null) {
            chargersDiscountTypeDto = ChargersDiscountTypeDto.NONE;
        }
        String str = ir9Var != null ? ir9Var.b : null;
        Date c = this.w.c();
        ow9 ow9Var2 = new ow9(chargersDiscountTypeDto, str, c);
        r0Var.getClass();
        r0Var.m(null, ow9Var2);
        ((cne0) this.b).r(Hg(), ((xnt) this.c).e(new ChargersSelectedDiscountDto(chargersDiscountTypeDto, str, c, null), ChargersSelectedDiscountDto.Companion.serializer()));
    }

    public final void Jg(ChargersDiscountDto chargersDiscountDto) {
        if (chargersDiscountDto != null) {
            Ig(new ir9(chargersDiscountDto.a, chargersDiscountDto.b, null));
            return;
        }
        r0 r0Var = this.y;
        ow9 ow9Var = (ow9) r0Var.getValue();
        if ((ow9Var != null ? ow9Var.a : null) != ChargersDiscountTypeDto.NONE) {
            r0Var.l(null);
            ((cne0) this.b).w(Hg());
        }
    }
}
