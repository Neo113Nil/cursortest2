package e2;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.g0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends pc.k implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public static final r f2007h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f2008i;

    /* renamed from: j, reason: collision with root package name */
    public static final r f2009j;

    /* renamed from: k, reason: collision with root package name */
    public static final r f2010k;

    /* renamed from: l, reason: collision with root package name */
    public static final r f2011l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f2012m;

    /* renamed from: n, reason: collision with root package name */
    public static final r f2013n;

    /* renamed from: o, reason: collision with root package name */
    public static final r f2014o;

    /* renamed from: p, reason: collision with root package name */
    public static final r f2015p;

    /* renamed from: q, reason: collision with root package name */
    public static final r f2016q;

    /* renamed from: r, reason: collision with root package name */
    public static final r f2017r;

    /* renamed from: s, reason: collision with root package name */
    public static final r f2018s;

    /* renamed from: t, reason: collision with root package name */
    public static final r f2019t;

    /* renamed from: u, reason: collision with root package name */
    public static final r f2020u;

    /* renamed from: v, reason: collision with root package name */
    public static final r f2021v;

    /* renamed from: w, reason: collision with root package name */
    public static final r f2022w;

    /* renamed from: x, reason: collision with root package name */
    public static final r f2023x;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2024g;

    static {
        int i10 = 2;
        f2007h = new r(i10, 0);
        f2008i = new r(i10, 1);
        f2009j = new r(i10, 2);
        f2010k = new r(i10, 3);
        f2011l = new r(i10, 4);
        f2012m = new r(i10, 5);
        f2013n = new r(i10, 6);
        f2014o = new r(i10, 7);
        f2015p = new r(i10, 8);
        f2016q = new r(i10, 9);
        f2017r = new r(i10, 10);
        f2018s = new r(i10, 11);
        f2019t = new r(i10, 12);
        f2020u = new r(i10, 13);
        f2021v = new r(i10, 14);
        f2022w = new r(i10, 15);
        f2023x = new r(i10, 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11) {
        super(i10);
        this.f2024g = i11;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        ac.c cVar;
        switch (this.f2024g) {
            case 0:
                return (z0.c) obj;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList f02 = bc.m.f0(list);
                f02.addAll(list2);
                return f02;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return (z0.m) obj;
            case 3:
                return (ac.o) obj;
            case 4:
                return (ac.o) obj;
            case 5:
                return (ac.o) obj;
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 7:
                g gVar = (g) obj;
                int i10 = ((g) obj2).f1956a;
                return gVar;
            case 8:
                return (g0) obj;
            case 9:
                return (String) obj;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList f03 = bc.m.f0(list3);
                f03.addAll(list4);
                return f03;
            case 11:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 12:
                return (String) obj;
            case 13:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 14:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f1944a) == null) {
                    str = aVar2.f1944a;
                }
                if (aVar == null || (cVar = aVar.f1945b) == null) {
                    cVar = aVar2.f1945b;
                }
                return new a(str, cVar);
            case 15:
                return obj == null ? obj2 : obj;
            default:
                n nVar = (n) obj2;
                Object valueOf = Float.valueOf(0.0f);
                j jVar = ((n) obj).f1996d;
                v vVar = s.f2043s;
                Object g8 = jVar.f1985g.g(vVar);
                if (g8 == null) {
                    g8 = valueOf;
                }
                float floatValue = ((Number) g8).floatValue();
                Object g10 = nVar.f1996d.f1985g.g(vVar);
                if (g10 != null) {
                    valueOf = g10;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
