package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.ff20;
import defpackage.g320;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.api.dto.Action;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/x;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/w", "ff20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class x {
    public static final ff20 Companion = new ff20();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g320(20)), null, null, null};
    public final String a;
    public final List b;
    public final Action c;
    public final d d;
    public final MicroWidgetDto.c e;

    public x(int i, String str, List list, Action action, d dVar, MicroWidgetDto.c cVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            Action.Companion.getClass();
            this.c = Action.m;
        } else {
            this.c = action;
        }
        if ((i & 8) == 0) {
            this.d = new d(0);
        } else {
            this.d = dVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return jl40.l(this.a, xVar.a) && jl40.l(this.b, xVar.b) && jl40.l(this.c, xVar.c) && jl40.l(this.d, xVar.d) && jl40.l(this.e, xVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        MicroWidgetDto.c cVar = this.e;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        StringBuilder r = xvz.r("MicroWidgetGroupDto(widgetGroupId=", this.a, ", widgetsIds=", this.b, ", action=");
        r.append(this.c);
        r.append(", displayRules=");
        r.append(this.d);
        r.append(", contentDescriptionDto=");
        r.append(this.e);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public x() {
        Action.Companion.getClass();
        Action action = Action.m;
        d dVar = new d(0);
        this.a = "";
        this.b = EmptyList.a;
        this.c = action;
        this.d = dVar;
        this.e = null;
    }
}
