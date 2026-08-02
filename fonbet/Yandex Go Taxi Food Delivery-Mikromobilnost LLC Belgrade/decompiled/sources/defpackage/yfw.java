package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final class yfw {
    public final xfw a;
    public final Integer b;
    public final IntercityDashboardResponseDto c;
    public final ugw d;
    public final Calendar e;
    public final String f;
    public final String g;
    public final String h;
    public final IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule i;
    public final Integer j;

    public yfw(xfw xfwVar, Integer num, IntercityDashboardResponseDto intercityDashboardResponseDto, ugw ugwVar, Calendar calendar, String str) {
        Object obj;
        IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
        Map map;
        this.a = xfwVar;
        this.b = num;
        this.c = intercityDashboardResponseDto;
        this.d = ugwVar;
        this.e = calendar;
        this.f = str;
        Integer num2 = null;
        this.g = xfwVar != null ? xfwVar.a : null;
        this.h = xfwVar != null ? xfwVar.b : null;
        String str2 = xfwVar != null ? xfwVar.a : null;
        if (intercityDashboardResponseDto == null) {
            intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity = null;
        } else {
            Iterator it = intercityDashboardResponseDto.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((i0) obj) instanceof IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity) {
                        break;
                    }
                }
            }
            intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity) (obj instanceof IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity ? obj : null);
        }
        IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule seatsSelectorTariffRule = (intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity == null || (map = intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.b) == null) ? null : (IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule) map.get(str2);
        this.i = seatsSelectorTariffRule;
        Integer num3 = this.b;
        if (num3 != null) {
            num2 = num3;
        } else if (seatsSelectorTariffRule != null) {
            num2 = seatsSelectorTariffRule.d;
        }
        this.j = num2;
    }

    public static yfw a(yfw yfwVar, xfw xfwVar, Integer num, IntercityDashboardResponseDto intercityDashboardResponseDto, ugw ugwVar, Calendar calendar, String str, int i) {
        if ((i & 1) != 0) {
            xfwVar = yfwVar.a;
        }
        xfw xfwVar2 = xfwVar;
        if ((i & 2) != 0) {
            num = yfwVar.b;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            intercityDashboardResponseDto = yfwVar.c;
        }
        IntercityDashboardResponseDto intercityDashboardResponseDto2 = intercityDashboardResponseDto;
        if ((i & 8) != 0) {
            ugwVar = yfwVar.d;
        }
        ugw ugwVar2 = ugwVar;
        if ((i & 16) != 0) {
            calendar = yfwVar.e;
        }
        Calendar calendar2 = calendar;
        yfwVar.getClass();
        if ((i & 64) != 0) {
            str = yfwVar.f;
        }
        yfwVar.getClass();
        return new yfw(xfwVar2, num2, intercityDashboardResponseDto2, ugwVar2, calendar2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfw)) {
            return false;
        }
        yfw yfwVar = (yfw) obj;
        return jl40.l(this.a, yfwVar.a) && jl40.l(this.b, yfwVar.b) && jl40.l(this.c, yfwVar.c) && jl40.l(this.d, yfwVar.d) && jl40.l(this.e, yfwVar.e) && jl40.l(this.f, yfwVar.f);
    }

    public final int hashCode() {
        xfw xfwVar = this.a;
        int hashCode = (xfwVar == null ? 0 : xfwVar.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        IntercityDashboardResponseDto intercityDashboardResponseDto = this.c;
        int hashCode3 = (hashCode2 + (intercityDashboardResponseDto == null ? 0 : intercityDashboardResponseDto.hashCode())) * 31;
        ugw ugwVar = this.d;
        int hashCode4 = (hashCode3 + (ugwVar == null ? 0 : ugwVar.hashCode())) * 31;
        Calendar calendar = this.e;
        int e = unr0.e((hashCode4 + (calendar == null ? 0 : calendar.hashCode())) * 31, 31, false);
        String str = this.f;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "IntercityDashboardModel(tariffSelection=" + this.a + ", seatsCountSelection=" + this.b + ", dashboardContentDto=" + this.c + ", points=" + this.d + ", selectedDue=" + this.e + ", isError=false, comment=" + this.f + Extension.C_BRAKE;
    }

    public yfw() {
        this(null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP);
    }

    public /* synthetic */ yfw(xfw xfwVar, Integer num, IntercityDashboardResponseDto intercityDashboardResponseDto, ugw ugwVar, Calendar calendar, String str, int i) {
        this((i & 1) != 0 ? null : xfwVar, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : intercityDashboardResponseDto, (i & 8) != 0 ? null : ugwVar, (i & 16) != 0 ? null : calendar, (i & 64) != 0 ? null : str);
    }
}
