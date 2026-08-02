package defpackage;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class f74 {
    public final c48 a;
    public final udp b;

    public f74(c48 c48Var, udp udpVar) {
        this.a = c48Var;
        this.b = udpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zvs zvsVar, cg6 cg6Var) {
        e74 e74Var;
        int i;
        List list;
        eh ehVar;
        if (cg6Var instanceof e74) {
            e74Var = (e74) cg6Var;
            int i2 = e74Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e74Var.l = i2 - Integer.MIN_VALUE;
                Object obj = e74Var.j;
                nm6 nm6Var = nm6.a;
                i = e74Var.l;
                String str = null;
                if (i != 0) {
                    qgg.h0(obj);
                    e74Var.l = 1;
                    obj = this.a.a(zvsVar, e74Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                list = (List) obj;
                o5n a = this.b.a();
                list.getClass();
                a.getClass();
                if (!list.isEmpty()) {
                    xq0.x("Empty collection, can't select download info");
                    return null;
                }
                if (a == o5n.c) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((vaa) it.next()).a == oq4.f) {
                                ehVar = new eh(4, new dl4(23));
                                break;
                            }
                        }
                    }
                    ehVar = new eh(5, new dl4(24));
                } else {
                    ehVar = new eh(3, new dl4(25));
                }
                vaa vaaVar = (vaa) CollectionsKt.Y(CollectionsKt.o0(list, ehVar));
                String str2 = vaaVar.c;
                s7e s7eVar = new s7e();
                s7eVar.h(null, str2);
                u7e e = s7eVar.e();
                String o = ouj.o(e.b(), "/", e.g("ts"));
                try {
                    Mac mac = Mac.getInstance("HmacMD5");
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = "aeCai1shu6Is5cheiwofeing6id".getBytes(charset);
                    bytes.getClass();
                    mac.init(new SecretKeySpec(bytes, mac.getAlgorithm()));
                    pn3 pn3Var = pn3.d;
                    byte[] bytes2 = o.getBytes(charset);
                    bytes2.getClass();
                    byte[] doFinal = mac.doFinal(bytes2);
                    str = ovn.M(Arrays.copyOf(doFinal, doFinal.length)).e();
                } catch (InvalidKeyException e2) {
                    ssg.a(6, null, "Cannot encode text string", e2);
                } catch (NoSuchAlgorithmException e3) {
                    ssg.a(6, null, "Cannot encode text string", e3);
                }
                s7e f = e.f();
                f.d("sign", str);
                return new u84(f.e().i, "audio/".concat(vaaVar.a.a));
            }
        }
        e74Var = new e74(this, cg6Var);
        Object obj2 = e74Var.j;
        nm6 nm6Var2 = nm6.a;
        i = e74Var.l;
        String str3 = null;
        if (i != 0) {
        }
        list = (List) obj2;
        o5n a2 = this.b.a();
        list.getClass();
        a2.getClass();
        if (!list.isEmpty()) {
        }
    }
}
