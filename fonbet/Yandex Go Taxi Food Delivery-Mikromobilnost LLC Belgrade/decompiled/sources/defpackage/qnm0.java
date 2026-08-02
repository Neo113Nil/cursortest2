package defpackage;

import com.yandex.go.due.data.api.dto.TimetableInfo;
import java.util.Calendar;

/* loaded from: classes12.dex */
public final class qnm0 {
    public final String a;
    public final mp60 b;
    public final int c;
    public final int d;
    public final TimetableInfo e;
    public final Calendar f;
    public final Calendar g;
    public final mp60 h;

    public qnm0(String str, mp60 mp60Var, int i, int i2, TimetableInfo timetableInfo, Calendar calendar, Calendar calendar2, mp60 mp60Var2) {
        this.a = str;
        this.b = mp60Var;
        this.c = i;
        this.d = i2;
        this.e = timetableInfo;
        this.f = calendar;
        this.g = calendar2;
        this.h = mp60Var2;
    }

    public final boolean a() {
        mp60 mp60Var = this.b;
        Object[] objArr = mp60Var.a;
        int i = mp60Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            xy40 xy40Var = ((rsg) objArr[i2]).c;
            Object[] objArr2 = xy40Var.a;
            int i3 = xy40Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                if (((e8z0) objArr2[i4]) instanceof b8z0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnm0)) {
            return false;
        }
        qnm0 qnm0Var = (qnm0) obj;
        return jl40.l(this.a, qnm0Var.a) && jl40.l(this.b, qnm0Var.b) && this.c == qnm0Var.c && this.d == qnm0Var.d && jl40.l(this.e, qnm0Var.e) && jl40.l(this.f, qnm0Var.f) && jl40.l(this.g, qnm0Var.g) && jl40.l(this.h, qnm0Var.h);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, oyr.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
        TimetableInfo timetableInfo = this.e;
        int hashCode = (b + (timetableInfo == null ? 0 : timetableInfo.hashCode())) * 31;
        Calendar calendar = this.f;
        int hashCode2 = (hashCode + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.g;
        return this.h.hashCode() + ((hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31);
    }
}
