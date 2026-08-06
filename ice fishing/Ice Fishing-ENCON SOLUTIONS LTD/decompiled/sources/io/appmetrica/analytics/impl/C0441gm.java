package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441gm implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0899ye f6090a = new C0899ye();

    /* renamed from: b, reason: collision with root package name */
    public final C0403fa f6091b = new C0403fa();

    /* renamed from: c, reason: collision with root package name */
    public final Hm f6092c = new Hm();

    /* renamed from: d, reason: collision with root package name */
    public final C0396f3 f6093d = new C0396f3();

    /* renamed from: e, reason: collision with root package name */
    public final C0602n2 f6094e = new C0602n2();

    /* renamed from: f, reason: collision with root package name */
    public final C0839w6 f6095f = new C0839w6();

    /* renamed from: g, reason: collision with root package name */
    public final Dm f6096g = new Dm();

    /* renamed from: h, reason: collision with root package name */
    public final C0665pd f6097h = new C0665pd();

    /* renamed from: i, reason: collision with root package name */
    public final C9 f6098i = new C9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0855wm fromModel(C0518jm c0518jm) {
        C0855wm c0855wm = new C0855wm();
        c0855wm.f7148s = c0518jm.f6325u;
        c0855wm.t = c0518jm.f6326v;
        String str = c0518jm.f6306a;
        if (str != null) {
            c0855wm.f7130a = str;
        }
        List list = c0518jm.f6311f;
        if (list != null) {
            c0855wm.f7135f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0518jm.f6312g;
        if (list2 != null) {
            c0855wm.f7136g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0518jm.f6307b;
        if (list3 != null) {
            c0855wm.f7132c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0518jm.f6313h;
        if (list4 != null) {
            c0855wm.f7144o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0518jm.f6314i;
        if (map != null) {
            c0855wm.f7137h = this.f6095f.fromModel(map);
        }
        C0873xe c0873xe = c0518jm.f6324s;
        if (c0873xe != null) {
            c0855wm.f7150v = this.f6090a.fromModel(c0873xe);
        }
        String str2 = c0518jm.f6315j;
        if (str2 != null) {
            c0855wm.f7139j = str2;
        }
        String str3 = c0518jm.f6308c;
        if (str3 != null) {
            c0855wm.f7133d = str3;
        }
        String str4 = c0518jm.f6309d;
        if (str4 != null) {
            c0855wm.f7134e = str4;
        }
        String str5 = c0518jm.f6310e;
        if (str5 != null) {
            c0855wm.f7147r = str5;
        }
        c0855wm.f7138i = this.f6091b.fromModel(c0518jm.f6318m);
        String str6 = c0518jm.f6316k;
        if (str6 != null) {
            c0855wm.f7140k = str6;
        }
        String str7 = c0518jm.f6317l;
        if (str7 != null) {
            c0855wm.f7141l = str7;
        }
        c0855wm.f7142m = c0518jm.f6321p;
        c0855wm.f7131b = c0518jm.f6319n;
        c0855wm.f7146q = c0518jm.f6320o;
        RetryPolicyConfig retryPolicyConfig = c0518jm.t;
        c0855wm.f7151w = retryPolicyConfig.maxIntervalSeconds;
        c0855wm.f7152x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0518jm.f6322q;
        if (str8 != null) {
            c0855wm.f7143n = str8;
        }
        Gm gm = c0518jm.f6323r;
        if (gm != null) {
            this.f6092c.getClass();
            C0829vm c0829vm = new C0829vm();
            c0829vm.f7076a = gm.f4443a;
            c0855wm.f7145p = c0829vm;
        }
        c0855wm.f7149u = c0518jm.f6327w;
        C0345d3 c0345d3 = c0518jm.f6328x;
        if (c0345d3 != null) {
            this.f6093d.getClass();
            C0648om c0648om = new C0648om();
            c0648om.f6695a = c0345d3.f5783a;
            c0855wm.f7153y = c0648om;
        }
        C0576m2 c0576m2 = c0518jm.f6329y;
        if (c0576m2 != null) {
            c0855wm.f7154z = this.f6094e.fromModel(c0576m2);
        }
        c0855wm.f7127A = this.f6096g.fromModel(c0518jm.f6330z);
        c0855wm.f7128B = this.f6097h.fromModel(c0518jm.f6304A);
        c0855wm.f7129C = this.f6098i.fromModel(c0518jm.f6305B);
        return c0855wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0518jm toModel(C0855wm c0855wm) {
        C0492im c0492im = new C0492im(this.f6091b.toModel(c0855wm.f7138i));
        c0492im.f6203a = c0855wm.f7130a;
        c0492im.f6212j = c0855wm.f7139j;
        c0492im.f6205c = c0855wm.f7133d;
        c0492im.f6204b = Arrays.asList(c0855wm.f7132c);
        c0492im.f6209g = Arrays.asList(c0855wm.f7136g);
        c0492im.f6208f = Arrays.asList(c0855wm.f7135f);
        c0492im.f6206d = c0855wm.f7134e;
        c0492im.f6207e = c0855wm.f7147r;
        c0492im.f6210h = Arrays.asList(c0855wm.f7144o);
        c0492im.f6213k = c0855wm.f7140k;
        c0492im.f6214l = c0855wm.f7141l;
        c0492im.f6219q = c0855wm.f7142m;
        c0492im.f6217o = c0855wm.f7131b;
        c0492im.f6218p = c0855wm.f7146q;
        c0492im.t = c0855wm.f7148s;
        c0492im.f6222u = c0855wm.t;
        c0492im.f6220r = c0855wm.f7143n;
        c0492im.f6223v = c0855wm.f7149u;
        c0492im.f6224w = new RetryPolicyConfig(c0855wm.f7151w, c0855wm.f7152x);
        c0492im.f6211i = this.f6095f.toModel(c0855wm.f7137h);
        C0777tm c0777tm = c0855wm.f7150v;
        if (c0777tm != null) {
            this.f6090a.getClass();
            c0492im.f6216n = new C0873xe(c0777tm.f6956a, c0777tm.f6957b);
        }
        C0829vm c0829vm = c0855wm.f7145p;
        if (c0829vm != null) {
            this.f6092c.getClass();
            c0492im.f6221s = new Gm(c0829vm.f7076a);
        }
        C0648om c0648om = c0855wm.f7153y;
        if (c0648om != null) {
            this.f6093d.getClass();
            c0492im.f6225x = new C0345d3(c0648om.f6695a);
        }
        C0622nm c0622nm = c0855wm.f7154z;
        if (c0622nm != null) {
            c0492im.f6226y = this.f6094e.toModel(c0622nm);
        }
        C0803um c0803um = c0855wm.f7127A;
        if (c0803um != null) {
            this.f6096g.getClass();
            c0492im.f6227z = new Cm(c0803um.f7025a);
        }
        c0492im.f6201A = this.f6097h.toModel(c0855wm.f7128B);
        C0700qm c0700qm = c0855wm.f7129C;
        if (c0700qm != null) {
            this.f6098i.getClass();
            c0492im.f6202B = new B9(c0700qm.f6791a);
        }
        return new C0518jm(c0492im);
    }
}
