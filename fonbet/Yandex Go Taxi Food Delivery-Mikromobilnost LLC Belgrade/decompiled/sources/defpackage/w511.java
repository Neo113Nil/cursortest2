package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.datatransport.TransportRegistrar;
import com.yandex.div.data.VariableMutationException;
import io.appmetrica.analytics.impl.Zr;
import io.appmetrica.analytics.impl.as;
import io.appmetrica.analytics.impl.cs;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class w511 implements e1d, ims, rix, cs {
    public final /* synthetic */ int a;

    public /* synthetic */ w511(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void c(int i, Exception exc, String str) {
        throw new VariableMutationException(i, exc, str);
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void e(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void n(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void p(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void q() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void s(String str) {
        throw new Exception(str);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void u() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void w(String str) {
        throw new ArithmeticException(str);
    }

    public static /* synthetic */ void x(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void y(String str) {
        throw new CertificateException(str);
    }

    @Override // defpackage.rix
    public lhx a(yuf0 yuf0Var) {
        if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            ny61.g("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            ad51 C = ad51.C((ByteString) yuf0Var.c, oyo.b());
            if (C.A() == 0) {
                return bd51.a(hd51.a((OutputPrefixType) yuf0Var.e), new va90(u77.a(C.z().j())), (Integer) yuf0Var.f);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            kbs.v("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public Object mo104apply(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ea51) it.next()).a());
        }
        return arrayList;
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        i211 lambda$getComponents$0;
        i211 lambda$getComponents$1;
        i211 lambda$getComponents$2;
        switch (this.a) {
            case 0:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(yuf0Var);
                return lambda$getComponents$0;
            case 1:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(yuf0Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(yuf0Var);
                return lambda$getComponents$2;
        }
    }

    @Override // io.appmetrica.analytics.impl.cs
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.a) {
            case 19:
                return Zr.a(jSONObject, jSONObject2);
            default:
                return as.a(jSONObject, jSONObject2);
        }
    }
}
