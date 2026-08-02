package defpackage;

import android.content.Context;
import android.net.Uri;
import com.connectsdk.device.ConnectableDevice;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class ls4 implements a39 {
    public final Context a;
    public final jyr b;
    public final jyr c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public ls4(Context context, jyr jyrVar, jyr jyrVar2) {
        this.a = context;
        this.b = jyrVar;
        this.c = jyrVar2;
    }

    public static final String e(ls4 ls4Var, Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Uri) {
            return ((Uri) obj).toString();
        }
        if (obj instanceof u7e) {
            return ((u7e) obj).i;
        }
        return null;
    }

    @Override // defpackage.a39
    public final ffg a(String str, n7w n7wVar) {
        str.getClass();
        return b(str, n7wVar);
    }

    @Override // defpackage.a39
    public final ffg b(String str, n7w n7wVar) {
        str.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        Uri parse = Uri.parse(str);
        pce pceVar = new pce(this.a);
        pceVar.c = parse;
        pceVar.o = Boolean.FALSE;
        parse.getClass();
        pceVar.e = new kkp(this, uuid, n7wVar, parse);
        rce a = pceVar.a();
        this.d.put(uuid, Long.valueOf(System.currentTimeMillis()));
        la8 d = ((cce) this.b.getValue()).d(a);
        qy2 qy2Var = (qy2) this.c.getValue();
        qy2Var.getClass();
        qy2Var.a.a("image_load_start", uah.e(new Pair("url", str), new Pair(ConnectableDevice.KEY_ID, qy2Var.b), new Pair("placeName", qy2Var.c)));
        return new ks4(0, d);
    }
}
