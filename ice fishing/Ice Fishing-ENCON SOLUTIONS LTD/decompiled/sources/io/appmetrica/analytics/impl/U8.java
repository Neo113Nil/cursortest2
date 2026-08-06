package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class U8 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f5150h;

    /* renamed from: i, reason: collision with root package name */
    public static final U8 f5151i;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0872xd f5152a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0779to f5153b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0893y8 f5154c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0764t9 f5155d;

    /* renamed from: e, reason: collision with root package name */
    public final Vb f5156e;

    /* renamed from: f, reason: collision with root package name */
    public final Ud f5157f;

    /* renamed from: g, reason: collision with root package name */
    public final N9 f5158g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0352da.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0352da.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0352da.UNKNOWN, -1);
        f5150h = Collections.unmodifiableMap(hashMap);
        f5151i = new U8(new Ri(), new Zm(), new C0330ce(), new Qi(), new C0506ja(), new C0532ka(), new C0481ia());
    }

    public U8(T8 t8) {
        this(t8.f5094a, t8.f5095b, t8.f5096c, t8.f5097d, t8.f5098e, t8.f5099f, t8.f5100g);
    }

    public final C0376e9 a(N8 n8, C0539kh c0539kh) {
        C0376e9 c0376e9 = new C0376e9();
        C0351d9 a2 = this.f5157f.a(n8.f4813l, n8.f4814m);
        Z8 a3 = this.f5156e.a(n8.f4808g);
        if (a2 != null) {
            c0376e9.f5911g = a2;
        }
        if (a3 != null) {
            c0376e9.f5910f = a3;
        }
        String a4 = this.f5152a.a(n8.f4802a);
        if (a4 != null) {
            c0376e9.f5908d = a4;
        }
        c0376e9.f5909e = this.f5153b.a(n8, c0539kh);
        String str = n8.f4811j;
        if (str != null) {
            c0376e9.f5912h = str;
        }
        Integer a5 = this.f5155d.a(n8);
        if (a5 != null) {
            c0376e9.f5907c = a5.intValue();
        }
        Long l2 = n8.f4804c;
        if (l2 != null) {
            c0376e9.f5905a = l2.longValue();
        }
        Long l3 = n8.f4805d;
        if (l3 != null) {
            c0376e9.f5918n = l3.longValue();
        }
        Long l4 = n8.f4806e;
        if (l4 != null) {
            c0376e9.f5919o = l4.longValue();
        }
        Long l5 = n8.f4807f;
        if (l5 != null) {
            c0376e9.f5906b = l5.longValue();
        }
        Integer num = n8.f4812k;
        if (num != null) {
            c0376e9.f5913i = num.intValue();
        }
        c0376e9.f5914j = this.f5154c.a(n8.f4816o);
        C0478i7 c0478i7 = n8.f4808g;
        c0376e9.f5915k = c0478i7 != null ? new C0451h6().a(c0478i7.f6166a) : -1;
        String str2 = n8.f4815n;
        if (str2 != null) {
            c0376e9.f5916l = str2.getBytes();
        }
        EnumC0352da enumC0352da = n8.f4817p;
        Integer num2 = enumC0352da != null ? (Integer) f5150h.get(enumC0352da) : null;
        if (num2 != null) {
            c0376e9.f5917m = num2.intValue();
        }
        EnumC0583m9 enumC0583m9 = n8.f4818q;
        if (enumC0583m9 != null) {
            int ordinal = enumC0583m9.ordinal();
            if (ordinal == 0) {
                c0376e9.f5920p = 0;
            } else if (ordinal == 1) {
                c0376e9.f5920p = 1;
            } else if (ordinal == 2) {
                c0376e9.f5920p = 2;
            }
        }
        Boolean bool = n8.f4819r;
        if (bool != null) {
            c0376e9.f5921q = bool.booleanValue();
        }
        if (n8.f4820s != null) {
            c0376e9.f5922r = r6.intValue();
        }
        c0376e9.f5923s = ((C0481ia) this.f5158g).a(n8.t);
        return c0376e9;
    }

    public U8(InterfaceC0872xd interfaceC0872xd, InterfaceC0779to interfaceC0779to, InterfaceC0893y8 interfaceC0893y8, InterfaceC0764t9 interfaceC0764t9, Vb vb, Ud ud, N9 n9) {
        this.f5152a = interfaceC0872xd;
        this.f5153b = interfaceC0779to;
        this.f5154c = interfaceC0893y8;
        this.f5155d = interfaceC0764t9;
        this.f5156e = vb;
        this.f5157f = ud;
        this.f5158g = n9;
    }

    public static T8 a() {
        return new T8(f5151i);
    }
}
