package defpackage;

import com.squareup.wire.Message;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import okio.ByteString;
import org.json.JSONObject;
import ru.yandex.alice.protos.endpoint.platform.utils.TAnyCapabilityHolder;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

/* loaded from: classes8.dex */
public final class ul2 implements png {
    public final TCapability.ECapabilityType a;
    public final Message b;
    public final gcx c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public ul2(TCapability.ECapabilityType eCapabilityType, Message message, gcx gcxVar) {
        this.a = eCapabilityType;
        this.b = message;
        this.c = gcxVar;
        final int i = 0;
        this.d = a.a(new sls(this) { // from class: tl2
            public final /* synthetic */ ul2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ul2 ul2Var = this.b;
                switch (i2) {
                    case 0:
                        byte[] encode = ul2Var.b.encode();
                        int length = encode.length;
                        j.b(encode.length, 0L, length);
                        return new TAnyCapabilityHolder(new ByteString(f73.m(0, length, encode)), ul2Var.a, null, 4, null);
                    case 1:
                        gcx gcxVar2 = ul2Var.c;
                        i3y i3yVar = ul2Var.d;
                        String str = (String) q5z.C(((t830) gcxVar2).b(((TAnyCapabilityHolder) i3yVar.getValue()).getClass(), (TAnyCapabilityHolder) i3yVar.getValue()));
                        Message message2 = ul2Var.b;
                        String str2 = (String) q5z.C(((t830) gcxVar2).b(message2.getClass(), message2));
                        JSONObject jSONObject = new JSONObject();
                        String simpleName = message2.getClass().getSimpleName();
                        if (str2 == null) {
                            str2 = "{}";
                        }
                        jSONObject.put(simpleName, new JSONObject(str2));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("json_capability", jSONObject);
                        if (str == null) {
                            str = "{}";
                        }
                        jSONObject2.put("any_capability", new JSONObject(str));
                        return jSONObject2.toString();
                    default:
                        return TAnyCapabilityHolder.ADAPTER.encode((TAnyCapabilityHolder) ul2Var.d.getValue());
                }
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i2 = 1;
        this.e = a.b(lazyThreadSafetyMode, new sls(this) { // from class: tl2
            public final /* synthetic */ ul2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ul2 ul2Var = this.b;
                switch (i22) {
                    case 0:
                        byte[] encode = ul2Var.b.encode();
                        int length = encode.length;
                        j.b(encode.length, 0L, length);
                        return new TAnyCapabilityHolder(new ByteString(f73.m(0, length, encode)), ul2Var.a, null, 4, null);
                    case 1:
                        gcx gcxVar2 = ul2Var.c;
                        i3y i3yVar = ul2Var.d;
                        String str = (String) q5z.C(((t830) gcxVar2).b(((TAnyCapabilityHolder) i3yVar.getValue()).getClass(), (TAnyCapabilityHolder) i3yVar.getValue()));
                        Message message2 = ul2Var.b;
                        String str2 = (String) q5z.C(((t830) gcxVar2).b(message2.getClass(), message2));
                        JSONObject jSONObject = new JSONObject();
                        String simpleName = message2.getClass().getSimpleName();
                        if (str2 == null) {
                            str2 = "{}";
                        }
                        jSONObject.put(simpleName, new JSONObject(str2));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("json_capability", jSONObject);
                        if (str == null) {
                            str = "{}";
                        }
                        jSONObject2.put("any_capability", new JSONObject(str));
                        return jSONObject2.toString();
                    default:
                        return TAnyCapabilityHolder.ADAPTER.encode((TAnyCapabilityHolder) ul2Var.d.getValue());
                }
            }
        });
        final int i3 = 2;
        this.f = a.b(lazyThreadSafetyMode, new sls(this) { // from class: tl2
            public final /* synthetic */ ul2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                ul2 ul2Var = this.b;
                switch (i22) {
                    case 0:
                        byte[] encode = ul2Var.b.encode();
                        int length = encode.length;
                        j.b(encode.length, 0L, length);
                        return new TAnyCapabilityHolder(new ByteString(f73.m(0, length, encode)), ul2Var.a, null, 4, null);
                    case 1:
                        gcx gcxVar2 = ul2Var.c;
                        i3y i3yVar = ul2Var.d;
                        String str = (String) q5z.C(((t830) gcxVar2).b(((TAnyCapabilityHolder) i3yVar.getValue()).getClass(), (TAnyCapabilityHolder) i3yVar.getValue()));
                        Message message2 = ul2Var.b;
                        String str2 = (String) q5z.C(((t830) gcxVar2).b(message2.getClass(), message2));
                        JSONObject jSONObject = new JSONObject();
                        String simpleName = message2.getClass().getSimpleName();
                        if (str2 == null) {
                            str2 = "{}";
                        }
                        jSONObject.put(simpleName, new JSONObject(str2));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("json_capability", jSONObject);
                        if (str == null) {
                            str = "{}";
                        }
                        jSONObject2.put("any_capability", new JSONObject(str));
                        return jSONObject2.toString();
                    default:
                        return TAnyCapabilityHolder.ADAPTER.encode((TAnyCapabilityHolder) ul2Var.d.getValue());
                }
            }
        });
    }

    @Override // defpackage.png
    public final String a() {
        return (String) this.e.getValue();
    }

    @Override // defpackage.png
    public final byte[] b() {
        return (byte[]) this.f.getValue();
    }
}
