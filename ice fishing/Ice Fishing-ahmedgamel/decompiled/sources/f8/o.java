package f8;

import java.util.Map;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.i implements I7.l {

    /* renamed from: u, reason: collision with root package name */
    public static final o f37532u = new o(1, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final o f37533v = new o(1, 1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37534n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, int i4) {
        super(i);
        this.f37534n = i4;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        switch (this.f37534n) {
            case 0:
                c8.a buildSerialDescriptor = (c8.a) obj;
                kotlin.jvm.internal.h.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                c8.a.a(buildSerialDescriptor, "JsonPrimitive", new q(n.f37525u));
                c8.a.a(buildSerialDescriptor, "JsonNull", new q(n.f37526v));
                c8.a.a(buildSerialDescriptor, "JsonLiteral", new q(n.f37527w));
                c8.a.a(buildSerialDescriptor, "JsonObject", new q(n.f37528x));
                c8.a.a(buildSerialDescriptor, "JsonArray", new q(n.f37529y));
                return u7.v.f41073a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                StringBuilder sb = new StringBuilder();
                g8.s.a(sb, str);
                sb.append(':');
                sb.append(lVar);
                String sb2 = sb.toString();
                kotlin.jvm.internal.h.d(sb2, "toString(...)");
                return sb2;
        }
    }
}
