package defpackage;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$HorizontalRuleDto;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$VerticalRuleDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes8.dex */
public final class wzj {
    public static final ozj Companion = new ozj();
    public static final i3y[] h;
    public final vqv a;
    public final List b;
    public final oir0 c;
    public final Integer d;
    public final DisplayRulesDto$HorizontalRuleDto e;
    public final DisplayRulesDto$VerticalRuleDto f;
    public final vzj g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, a.b(lazyThreadSafetyMode, new xyi(12)), null, null, a.b(lazyThreadSafetyMode, new xyi(13)), a.b(lazyThreadSafetyMode, new xyi(14)), a.b(lazyThreadSafetyMode, new xyi(15))};
    }

    public /* synthetic */ wzj(int i, vqv vqvVar, List list, oir0 oir0Var, Integer num, DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto, DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto, vzj vzjVar) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, nzj.a.getDescriptor());
            throw null;
        }
        this.a = vqvVar;
        this.b = list;
        this.c = oir0Var;
        this.d = num;
        this.e = displayRulesDto$HorizontalRuleDto;
        this.f = displayRulesDto$VerticalRuleDto;
        this.g = vzjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzj)) {
            return false;
        }
        wzj wzjVar = (wzj) obj;
        return jl40.l(this.a, wzjVar.a) && jl40.l(this.b, wzjVar.b) && jl40.l(this.c, wzjVar.c) && jl40.l(this.d, wzjVar.d) && this.e == wzjVar.e && this.f == wzjVar.f && jl40.l(this.g, wzjVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto = this.e;
        int hashCode3 = (hashCode2 + (displayRulesDto$HorizontalRuleDto == null ? 0 : displayRulesDto$HorizontalRuleDto.hashCode())) * 31;
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto = this.f;
        return this.g.hashCode() + ((hashCode3 + (displayRulesDto$VerticalRuleDto != null ? displayRulesDto$VerticalRuleDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DisplayRulesDto(indent=" + this.a + ", backgroundColorSettings=" + this.b + ", backgroundShapeSettings=" + this.c + ", opacity=" + this.d + ", horizontalRule=" + this.e + ", verticalRule=" + this.f + ", widthType=" + this.g + ')';
    }

    public wzj(vqv vqvVar, ArrayList arrayList, oir0 oir0Var, Integer num, DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto, DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto, vzj vzjVar) {
        this.a = vqvVar;
        this.b = arrayList;
        this.c = oir0Var;
        this.d = num;
        this.e = displayRulesDto$HorizontalRuleDto;
        this.f = displayRulesDto$VerticalRuleDto;
        this.g = vzjVar;
    }
}
