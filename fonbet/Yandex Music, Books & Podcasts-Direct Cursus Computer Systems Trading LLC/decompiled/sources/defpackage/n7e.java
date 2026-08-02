package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.connectsdk.service.command.ServiceCommand;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.MessengerEnvironment;
import com.yandex.messenger.websdk.api.MessengerParams;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n7e implements Cancelable {
    public static final /* synthetic */ s9f[] m;
    public final ChatRequest a;
    public final boolean b;
    public ilt c;
    public ilt d;
    public final MessengerParams e;
    public final qdc f;
    public final tot g;
    public final h02 h;
    public final l0o i;
    public final OkHttpClient j;
    public final Handler k;
    public final qne l;

    static {
        opi opiVar = new opi(n7e.class, "unreadMessagesCall", "getUnreadMessagesCall()Lokhttp3/Call;", 0);
        ern.a.getClass();
        m = new s9f[]{opiVar};
    }

    public n7e(vbv vbvVar, ChatRequest chatRequest, boolean z, ilt iltVar, ilt iltVar2) {
        this.a = chatRequest;
        this.b = z;
        this.c = iltVar;
        this.d = iltVar2;
        Object value = vbvVar.n.getValue();
        value.getClass();
        this.e = vbvVar.g;
        this.f = vbvVar.r;
        this.g = vbvVar.l;
        this.h = (h02) vbvVar.k.getValue();
        this.i = (l0o) vbvVar.D.getValue();
        this.j = (OkHttpClient) vbvVar.j.getValue();
        Handler handler = new Handler((Looper) value);
        this.k = handler;
        this.l = new qne((Function2) new rea(18));
        handler.post(new l7e(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        boolean z2;
        es3 es3Var;
        String c = this.g.c();
        if (c == null) {
            this.f.sendEvent("wm_unread_count_error", tah.b(new Pair("reason", "empty auth token")));
            b(new IllegalArgumentException("Trying get unread count without auth token"));
            return;
        }
        MessengerParams messengerParams = this.e;
        MessengerEnvironment messengerEnvironment = messengerParams.b;
        s7e s7eVar = new s7e();
        s7eVar.h(null, "https://backend.messenger.yandex.net/unread_count");
        s7e f = s7eVar.e().f();
        f.a("count_chats", "1");
        ChatRequest chatRequest = this.a;
        if (chatRequest instanceof oh4) {
            f.a("chat_id", ((oh4) chatRequest).a);
        } else if (chatRequest instanceof rh4) {
            if (!this.b) {
                f.a("other_guid", ((rh4) chatRequest).a);
                z = true;
                String str = f.e().i;
                b0o a = this.i.a();
                a.a("Authorization", c);
                a.g(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("Client", messengerParams.a());
                a.e(ServiceCommand.TYPE_POST, new dn7(jSONObject));
                d0o b = a.b();
                OkHttpClient okHttpClient = this.j;
                okHttpClient.getClass();
                mkn mknVar = new mkn(okHttpClient, b, false);
                s9f[] s9fVarArr = m;
                s9f s9fVar = s9fVarArr[0];
                qne qneVar = this.l;
                qneVar.setValue(this, s9fVar, mknVar);
                es3Var = (es3) qneVar.getValue(this, s9fVarArr[0]);
                if (es3Var == null) {
                    es3Var.z(new m7e(this, z));
                    return;
                }
                return;
            }
            this.e.getClass();
            if (StringsKt.U("music")) {
                this.f.sendEvent("wm_unread_count_error", tah.b(new Pair("reason", "empty auth token")));
                b(new IllegalArgumentException("Cannot fetch both counters without workspace"));
                z2 = false;
            } else {
                if (f.g != null) {
                    f.k(ofc.g("detailed_workspace", true, " \"'<>#&=", 0, 0, 211));
                }
                f.a("detailed_workspace", "1");
                z2 = true;
            }
            if (!z2) {
                return;
            }
        } else if (!(chatRequest instanceof ph4) && chatRequest != null) {
            b6e.s();
            return;
        }
        z = false;
        String str2 = f.e().i;
        b0o a2 = this.i.a();
        a2.a("Authorization", c);
        a2.g(str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("Client", messengerParams.a());
        a2.e(ServiceCommand.TYPE_POST, new dn7(jSONObject2));
        d0o b2 = a2.b();
        OkHttpClient okHttpClient2 = this.j;
        okHttpClient2.getClass();
        mkn mknVar2 = new mkn(okHttpClient2, b2, false);
        s9f[] s9fVarArr2 = m;
        s9f s9fVar2 = s9fVarArr2[0];
        qne qneVar2 = this.l;
        qneVar2.setValue(this, s9fVar2, mknVar2);
        es3Var = (es3) qneVar2.getValue(this, s9fVarArr2[0]);
        if (es3Var == null) {
        }
    }

    public final void b(Exception exc) {
        ilt iltVar = this.c;
        if (iltVar != null) {
            iltVar.invoke(exc);
        }
    }

    @Override // com.yandex.messenger.websdk.api.Cancelable
    public final void cancel() {
        this.c = null;
        this.d = null;
        Handler handler = this.k;
        handler.removeCallbacksAndMessages(null);
        handler.post(new l7e(this, 0));
    }
}
