package ru.yandex.taxi.requirements.models.net.experiment;

import defpackage.c6z;
import defpackage.eqj0;
import defpackage.gqj0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.sls;
import defpackage.tgj0;
import defpackage.vci0;
import defpackage.xn11;
import defpackage.yij0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.requirements.models.net.experiment.c;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/models/net/experiment/c;", "Lxn11;", "Lc6z;", "Companion", "gqj0", "fqj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c implements xn11, c6z {
    public static final gqj0 Companion = new gqj0();
    public static final i3y[] o;
    public final boolean b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final List f;
    public final String g;
    public final Map h;
    public final yij0 i;
    public final List j;
    public final tgj0 k;
    public final List l;
    public final List m;
    public final i3y n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new vci0(29)), kotlin.a.b(lazyThreadSafetyMode, new eqj0(0)), kotlin.a.b(lazyThreadSafetyMode, new eqj0(1)), kotlin.a.b(lazyThreadSafetyMode, new eqj0(2)), null, kotlin.a.b(lazyThreadSafetyMode, new eqj0(3)), null, kotlin.a.b(lazyThreadSafetyMode, new eqj0(4)), null, kotlin.a.b(lazyThreadSafetyMode, new eqj0(5)), kotlin.a.b(lazyThreadSafetyMode, new eqj0(6))};
    }

    public /* synthetic */ c(int i, boolean z, Map map, Map map2, Map map3, List list, String str, Map map4, yij0 yij0Var, List list2, tgj0 tgj0Var, List list3, List list4) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map2;
        }
        if ((i & 8) == 0) {
            this.e = kotlin.collections.b.f();
        } else {
            this.e = map3;
        }
        int i2 = i & 16;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.f = emptyList;
        } else {
            this.f = list;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
        if ((i & 64) == 0) {
            this.h = kotlin.collections.b.f();
        } else {
            this.h = map4;
        }
        if ((i & 128) == 0) {
            this.i = new yij0(0);
        } else {
            this.i = yij0Var;
        }
        if ((i & 256) == 0) {
            this.j = emptyList;
        } else {
            this.j = list2;
        }
        if ((i & 512) == 0) {
            this.k = new tgj0(0);
        } else {
            this.k = tgj0Var;
        }
        if ((i & 1024) == 0) {
            this.l = emptyList;
        } else {
            this.l = list3;
        }
        if ((i & 2048) == 0) {
            this.m = emptyList;
        } else {
            this.m = list4;
        }
        final int i3 = 1;
        this.n = kotlin.a.a(new sls(this) { // from class: dqj0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                c cVar = this.b;
                switch (i4) {
                    case 0:
                        hpj0 hpj0Var = (hpj0) cVar.d.get("__default__");
                        if (hpj0Var == null) {
                            break;
                        }
                        break;
                    default:
                        hpj0 hpj0Var2 = (hpj0) cVar.d.get("__default__");
                        if (hpj0Var2 == null) {
                            break;
                        }
                        break;
                }
                return new hpj0(0);
            }
        });
    }

    public final RequirementBubbleDto a() {
        RequirementBubbleDto requirementBubbleDto = (RequirementBubbleDto) this.h.get("__order_for_other__");
        return requirementBubbleDto == null ? new RequirementBubbleDto(0) : requirementBubbleDto;
    }

    public final RequirementBubbleDto b() {
        RequirementBubbleDto requirementBubbleDto = (RequirementBubbleDto) this.h.get("__preorder__");
        return requirementBubbleDto == null ? new RequirementBubbleDto(0) : requirementBubbleDto;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public c() {
        this(4095);
    }

    public c(int i) {
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        Map f3 = kotlin.collections.b.f();
        Map f4 = kotlin.collections.b.f();
        final int i2 = 0;
        yij0 yij0Var = new yij0(0);
        tgj0 tgj0Var = new tgj0(0);
        this.b = false;
        this.c = f;
        this.d = f2;
        this.e = f3;
        EmptyList emptyList = EmptyList.a;
        this.f = emptyList;
        this.g = "";
        this.h = f4;
        this.i = yij0Var;
        this.j = emptyList;
        this.k = tgj0Var;
        this.l = emptyList;
        this.m = emptyList;
        this.n = kotlin.a.a(new sls(this) { // from class: dqj0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i2;
                c cVar = this.b;
                switch (i4) {
                    case 0:
                        hpj0 hpj0Var = (hpj0) cVar.d.get("__default__");
                        if (hpj0Var == null) {
                            break;
                        }
                        break;
                    default:
                        hpj0 hpj0Var2 = (hpj0) cVar.d.get("__default__");
                        if (hpj0Var2 == null) {
                            break;
                        }
                        break;
                }
                return new hpj0(0);
            }
        });
    }
}
