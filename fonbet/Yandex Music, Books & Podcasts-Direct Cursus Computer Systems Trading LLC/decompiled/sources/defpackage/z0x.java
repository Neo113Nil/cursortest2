package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z0x extends o3x {
    public final /* synthetic */ int r;
    public final /* synthetic */ xun s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0x(xun xunVar) {
        super(xunVar, true);
        this.r = 2;
        this.s = xunVar;
    }

    @Override // defpackage.o3x
    public final void l() {
        switch (this.r) {
            case 0:
                this.s.c.a(m(), -1);
                break;
            case 1:
                this.s.c.a(m(), 1);
                break;
            case 2:
                w1x w1xVar = this.s.c;
                c2x m = m();
                w1xVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = w1xVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", w1xVar.o());
                } catch (JSONException unused) {
                }
                w1xVar.m(l, jSONObject.toString());
                w1xVar.s.a(l, m);
                break;
            case 3:
                w1x w1xVar2 = this.s.c;
                c2x m2 = m();
                w1xVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long l2 = w1xVar2.l();
                try {
                    jSONObject2.put("requestId", l2);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", w1xVar2.o());
                } catch (JSONException unused2) {
                }
                w1xVar2.m(l2, jSONObject2.toString());
                w1xVar2.k.a(l2, m2);
                break;
            case 4:
                w1x w1xVar3 = this.s.c;
                c2x m3 = m();
                w1xVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = w1xVar3.l();
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put("type", "STOP");
                    jSONObject3.put("mediaSessionId", w1xVar3.o());
                } catch (JSONException unused3) {
                }
                w1xVar3.m(l3, jSONObject3.toString());
                w1xVar3.m.a(l3, m3);
                break;
            case 5:
                w1x w1xVar4 = this.s.c;
                c2x m4 = m();
                w1xVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long l4 = w1xVar4.l();
                try {
                    jSONObject4.put("requestId", l4);
                    jSONObject4.put("type", "PLAY");
                    jSONObject4.put("mediaSessionId", w1xVar4.o());
                } catch (JSONException unused4) {
                }
                w1xVar4.m(l4, jSONObject4.toString());
                w1xVar4.l.a(l4, m4);
                break;
            default:
                w1x w1xVar5 = this.s.c;
                c2x m5 = m();
                w1xVar5.getClass();
                JSONObject jSONObject5 = new JSONObject();
                long l5 = w1xVar5.l();
                try {
                    jSONObject5.put("requestId", l5);
                    jSONObject5.put("type", "GET_STATUS");
                    owh owhVar = w1xVar5.f;
                    if (owhVar != null) {
                        jSONObject5.put("mediaSessionId", owhVar.b);
                    }
                } catch (JSONException unused5) {
                }
                w1xVar5.m(l5, jSONObject5.toString());
                w1xVar5.q.a(l5, m5);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0x(xun xunVar, int i) {
        super(xunVar, false);
        this.r = i;
        this.s = xunVar;
    }
}
