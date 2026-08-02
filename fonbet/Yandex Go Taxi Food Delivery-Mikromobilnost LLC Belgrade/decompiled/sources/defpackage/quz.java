package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1InvalidObjectIDException;
import com.objsys.asn1j.runtime.Asn1MissingRequiredException;
import com.objsys.asn1j.runtime.Asn1SeqOrderException;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.go.navigator.alt_select.AltSelectModalView;
import com.yandex.go.quark.ai_assistant.impl.ui.AiAssistantModalView;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.Bq;
import java.io.ByteArrayOutputStream;
import java.security.cert.CRLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.json.JSONException;
import ru.yandex.taxi.battery.BatteryReceiver;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;

/* loaded from: classes10.dex */
public final /* synthetic */ class quz implements y80, qx0, bx60, aee0, j43, sti0, zf5, r131, ev31, FunctionWithThrowable, vls, ims {
    public static final quz b = new quz(0);
    public static final quz c = new quz(1);
    public static final quz w = new quz(2);
    public final /* synthetic */ int a;

    public /* synthetic */ quz(int i) {
        this.a = i;
    }

    public static /* synthetic */ void g() {
        throw new Asn1SeqOrderException();
    }

    public static /* synthetic */ void h(Asn1BerDecodeBuffer asn1BerDecodeBuffer) {
        throw new Asn1MissingRequiredException(asn1BerDecodeBuffer);
    }

    public static /* synthetic */ void i(ByteArrayOutputStream byteArrayOutputStream) {
        throw new Asn1Exception(byteArrayOutputStream.toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new SSLPeerUnverifiedException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new Asn1MissingRequiredException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void o(String str, Throwable th) {
        throw new CRLException(str + ((Object) th.toString()));
    }

    public static /* synthetic */ void p(StringBuilder sb, int i, int i2) {
        sb.append(" for item at position = ");
        sb.append(i);
        sb.append(" for viewType = ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public static /* synthetic */ void r() {
        throw new Asn1InvalidObjectIDException();
    }

    public static /* synthetic */ void s(String str) {
        throw new Asn1Exception(str);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2) {
        throw new AssertionError(str + obj + obj2);
    }

    @Override // defpackage.zf5
    public void a(int i) {
        BatteryReceiver.batteryReceiverListener$lambda$0(i);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        switch (this.a) {
            case 26:
                return Bq.b((Activity) obj);
            case 27:
                b5p b5pVar = (b5p) obj;
                b5pVar.getClass();
                return b5pVar.getClass().getSimpleName();
            default:
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.j43
    public int b(int i, LayoutDirection layoutDirection) {
        return Math.round((1.0f + (layoutDirection == LayoutDirection.Ltr ? -1.0f : 1.0f)) * (i / 2.0f));
    }

    @Override // defpackage.aee0
    public oeq0 c(int i) {
        oeq0 positionLayoutManager$lambda$0$0;
        positionLayoutManager$lambda$0$0 = AltSelectModalView.positionLayoutManager$lambda$0$0(i);
        return positionLayoutManager$lambda$0$0;
    }

    @Override // defpackage.qx0
    public boolean d() {
        boolean onMapTapped$lambda$0;
        onMapTapped$lambda$0 = AddressMapFragment.onMapTapped$lambda$0();
        return onMapTapped$lambda$0;
    }

    public void e(JSONException jSONException) {
        if (ydz.a.a()) {
            ydz.c("ParsingErrorLogger", "An error occurred during parsing process", jSONException);
        }
    }

    @Override // defpackage.sti0
    public void f() {
        kgx[] kgxVarArr = do3.I;
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        boolean resolveString$lambda$0;
        boolean resolveDouble$lambda$4;
        boolean resolveColor$lambda$2;
        boolean resolveUrl$lambda$6;
        switch (this.a) {
            case 20:
                resolveString$lambda$0 = BduiExpressionResolverImpl.resolveString$lambda$0((String) obj);
                return resolveString$lambda$0;
            case 21:
                resolveDouble$lambda$4 = BduiExpressionResolverImpl.resolveDouble$lambda$4(((Double) obj).doubleValue());
                return resolveDouble$lambda$4;
            case 22:
                resolveColor$lambda$2 = BduiExpressionResolverImpl.resolveColor$lambda$2(((Integer) obj).intValue());
                return resolveColor$lambda$2;
            default:
                resolveUrl$lambda$6 = BduiExpressionResolverImpl.resolveUrl$lambda$6((Uri) obj);
                return resolveUrl$lambda$6;
        }
    }

    @Override // defpackage.y80
    public boolean n(String str) {
        return false;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 chatContainerInsetsHandler$lambda$0;
        chatContainerInsetsHandler$lambda$0 = AiAssistantModalView.setChatContainerInsetsHandler$lambda$0(view, n751Var);
        return chatContainerInsetsHandler$lambda$0;
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        return zy11.a;
    }
}
