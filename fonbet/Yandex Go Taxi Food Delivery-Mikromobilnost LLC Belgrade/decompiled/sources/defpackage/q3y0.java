package defpackage;

import com.yandex.go.taxi.order.models.api.objects.LackOfMoneyNotificationDto;

/* loaded from: classes14.dex */
public final class q3y0 {
    public final String a;
    public final lv90 b;
    public final xh60 c;

    public q3y0(String str, lv90 lv90Var, xh60 xh60Var) {
        this.a = str;
        this.b = lv90Var;
        this.c = xh60Var;
    }

    public final xh60 a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final lv90 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q3y0)) {
            return false;
        }
        q3y0 q3y0Var = (q3y0) obj;
        if (jl40.l(this.a, q3y0Var.a) && jl40.l(this.b, q3y0Var.b)) {
            xh60 xh60Var = this.c;
            LackOfMoneyNotificationDto lackOfMoneyNotificationDto = xh60Var != null ? (LackOfMoneyNotificationDto) xh60Var.b : null;
            xh60 xh60Var2 = q3y0Var.c;
            if (jl40.l(lackOfMoneyNotificationDto, xh60Var2 != null ? (LackOfMoneyNotificationDto) xh60Var2.b : null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        xh60 xh60Var = this.c;
        LackOfMoneyNotificationDto lackOfMoneyNotificationDto = xh60Var != null ? (LackOfMoneyNotificationDto) xh60Var.b : null;
        return hashCode + (lackOfMoneyNotificationDto != null ? lackOfMoneyNotificationDto.hashCode() : 0);
    }
}
