package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iqx;
import defpackage.pyy0;
import defpackage.z0z0;
import defpackage.z2z0;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;
import ru.yandex.taxi.promotions.model.Promotion;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/a;", "Lru/yandex/taxi/promotions/model/Promotion;", "Companion", "z0z0", "y0z0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a extends Promotion {
    public static final z0z0 Companion = new z0z0();
    public static final i3y[] u;
    public final String b;
    public final Map c;
    public final Calendar d;
    public final String e;
    public boolean f;
    public boolean g;
    public Set h;
    public final TicketMode i;
    public final TypedContentWidget j;
    public final TypedContentWidget k;
    public final TypedContentWidget l;
    public final TicketTopAsset m;
    public final z2z0 n;
    public final boolean o;
    public final String p;
    public final Set q;
    public final List r;
    public final iqx s;
    public final List t;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new pyy0(2)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new pyy0(3)), kotlin.a.b(lazyThreadSafetyMode, new pyy0(4)), null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new pyy0(5)), kotlin.a.b(lazyThreadSafetyMode, new pyy0(6)), null, kotlin.a.b(lazyThreadSafetyMode, new pyy0(7))};
    }

    public a(int i, String str, Map map, Calendar calendar, String str2, boolean z, boolean z2, Set set, TicketMode ticketMode, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, TypedContentWidget typedContentWidget3, TicketTopAsset ticketTopAsset, z2z0 z2z0Var, boolean z3, String str3, Set set2, List list, iqx iqxVar, List list2) {
        if ((i & 1) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = calendar;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 32) == 0) {
            this.g = true;
        } else {
            this.g = z2;
        }
        int i2 = i & 64;
        EmptySet emptySet = EmptySet.a;
        if (i2 == 0) {
            this.h = emptySet;
        } else {
            this.h = set;
        }
        if ((i & 128) == 0) {
            this.i = TicketMode.TICKET;
        } else {
            this.i = ticketMode;
        }
        if ((i & 256) == 0) {
            this.j = new TypedContentWidget(null, null, 15);
        } else {
            this.j = typedContentWidget;
        }
        if ((i & 512) == 0) {
            this.k = new TypedContentWidget(null, null, 15);
        } else {
            this.k = typedContentWidget2;
        }
        if ((i & 1024) == 0) {
            this.l = new TypedContentWidget(null, null, 15);
        } else {
            this.l = typedContentWidget3;
        }
        if ((i & 2048) == 0) {
            this.m = new TicketTopAsset(0);
        } else {
            this.m = ticketTopAsset;
        }
        if ((i & 4096) == 0) {
            this.n = null;
        } else {
            this.n = z2z0Var;
        }
        if ((i & 8192) == 0) {
            this.o = true;
        } else {
            this.o = z3;
        }
        if ((i & 16384) == 0) {
            this.p = "";
        } else {
            this.p = str3;
        }
        if ((32768 & i) == 0) {
            this.q = emptySet;
        } else {
            this.q = set2;
        }
        this.r = (65536 & i) == 0 ? EmptyList.a : list;
        if ((131072 & i) == 0) {
            this.s = null;
        } else {
            this.s = iqxVar;
        }
        this.t = (i & 262144) == 0 ? Collections.singletonList(new TicketBottomButton(0)) : list2;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion a() {
        Set set = this.h;
        return new a(this.b, this.c, this.d, this.e, this.f, this.g, set, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List b() {
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List d() {
        TicketTopAsset ticketTopAsset = this.m;
        String a = ticketTopAsset.getA();
        return (ticketTopAsset.getB() != TicketTopAsset.TicketTopAssetType.LOTTIE || a.length() <= 0) ? EmptyList.a : Collections.singletonList(a);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: e, reason: from getter */
    public final Calendar getG() {
        return this.d;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: f, reason: from getter */
    public final boolean getJ() {
        return this.f;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List h() {
        TicketTopAsset ticketTopAsset = this.m;
        String a = ticketTopAsset.getA();
        return (ticketTopAsset.getB() != TicketTopAsset.TicketTopAssetType.IMAGE || a.length() <= 0) ? EmptyList.a : Collections.singletonList(a);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: i */
    public final int getE() {
        return 100;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: j, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: k, reason: from getter */
    public final Set getH() {
        return this.h;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: l */
    public final Calendar getF() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0L);
        return calendar;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion.Type m() {
        return Promotion.Type.TICKET;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: n */
    public final List getD() {
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void p() {
        this.f = true;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void q(Set set) {
        this.h = set;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void r(boolean z) {
        this.g = z;
    }

    public a() {
        this(0);
    }

    public a(String str, Map map, Calendar calendar, String str2, boolean z, boolean z2, Set set, TicketMode ticketMode, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, TypedContentWidget typedContentWidget3, TicketTopAsset ticketTopAsset, z2z0 z2z0Var, boolean z3, String str3, Set set2, List list, iqx iqxVar, List list2) {
        this.b = str;
        this.c = map;
        this.d = calendar;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = set;
        this.i = ticketMode;
        this.j = typedContentWidget;
        this.k = typedContentWidget2;
        this.l = typedContentWidget3;
        this.m = ticketTopAsset;
        this.n = z2z0Var;
        this.o = z3;
        this.p = str3;
        this.q = set2;
        this.r = list;
        this.s = iqxVar;
        this.t = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i) {
        this("", null, null, "", false, true, r7, r8, r9, r10, r11, r12, null, true, "", r7, EmptyList.a, null, r19);
        TicketMode ticketMode = TicketMode.TICKET;
        TypedContentWidget typedContentWidget = new TypedContentWidget(null, null, 15);
        TypedContentWidget typedContentWidget2 = new TypedContentWidget(null, null, 15);
        TypedContentWidget typedContentWidget3 = new TypedContentWidget(null, null, 15);
        TicketTopAsset ticketTopAsset = new TicketTopAsset(0);
        List singletonList = Collections.singletonList(new TicketBottomButton(0));
        EmptySet emptySet = EmptySet.a;
    }
}
