package defpackage;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.y;
import androidx.media3.exoplayer.ExoPlayer;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.video.m3.player.b;

/* loaded from: classes.dex */
public final class zg extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zg(g23 g23Var, f23 f23Var, Function1 function1, kxt kxtVar) {
        super(0);
        this.r = 20;
        this.s = g23Var;
        this.t = f23Var;
        this.u = (uif) function1;
        this.v = kxtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x05ab, code lost:
    
        if (r3 != 4) goto L231;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r8v31, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        f23 f23Var;
        String str;
        JSONObject jSONObject;
        String str2;
        int i = this.r;
        Continuation continuation = null;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        Object obj = this.v;
        Object obj2 = this.u;
        Object obj3 = this.s;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj4;
                Intent intent = (Intent) obj2;
                String str3 = (String) obj3;
                if (str3 == null) {
                    jj4.j("Name is null");
                } else if (str3.equals("ACTIVITY")) {
                    i3 = 1;
                } else if (str3.equals("BROADCAST")) {
                    i3 = 2;
                } else if (str3.equals("SERVICE")) {
                    i3 = 3;
                } else if (str3.equals("FOREGROUND_SERVICE")) {
                    i3 = 4;
                } else if (str3.equals("CALLBACK")) {
                    i3 = 5;
                } else {
                    xq0.x("No enum constant androidx.glance.appwidget.action.ActionTrampolineType.".concat(str3));
                }
                int D = ouj.D(i3);
                if (D != 0) {
                    if (D != 1) {
                        if (D == 2) {
                            activity.startService(intent);
                        } else if (D == 3) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                l8g.a.a(activity, intent);
                            } else {
                                activity.startService(intent);
                            }
                        }
                    }
                    activity.sendBroadcast(intent);
                } else {
                    activity.startActivity(intent, (Bundle) obj);
                }
                return Unit.a;
            case 1:
                ((d28) obj3).d((Function0) obj4, (z18) obj2, (xof) obj);
                return Unit.a;
            case 2:
                oq5 oq5Var = (oq5) obj3;
                iq5 iq5Var = oq5Var.L;
                wb4 wb4Var = (wb4) obj4;
                exq exqVar = (exq) obj2;
                mfi mfiVar = (mfi) obj;
                wb4 wb4Var2 = iq5Var.b;
                try {
                    iq5Var.b = wb4Var;
                    exq exqVar2 = oq5Var.F;
                    int[] iArr = oq5Var.n;
                    soi soiVar = oq5Var.u;
                    oq5Var.n = null;
                    oq5Var.u = null;
                    try {
                        oq5Var.F = exqVar;
                        boolean z = iq5Var.e;
                        try {
                            iq5Var.e = false;
                            oq5Var.B(mfiVar.a, mfiVar.g, mfiVar.b, true);
                            iq5Var.b = wb4Var2;
                            return Unit.a;
                        } finally {
                            iq5Var.e = z;
                        }
                    } finally {
                        oq5Var.F = exqVar2;
                        oq5Var.n = iArr;
                        oq5Var.u = soiVar;
                    }
                } catch (Throwable th) {
                    iq5Var.b = wb4Var2;
                    throw th;
                }
            case 3:
                f23Var = (f23) obj4;
                ((g23) obj3).d();
                try {
                    if7.a((if7) obj2, (pf7) obj);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            case 4:
                g gVar = (g) obj3;
                ViewGroup viewGroup = (ViewGroup) obj4;
                Object i5 = gVar.f.i(viewGroup, obj2);
                gVar.q = i5;
                if (i5 == null) {
                    throw new IllegalStateException(("Unable to start transition " + obj2 + " for container " + viewGroup + '.').toString());
                }
                ((xqn) obj).a = new tr7(gVar, obj2, viewGroup);
                if (y.M(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + gVar.d + " to " + gVar.e);
                }
                return Unit.a;
            case 5:
                gc8 gc8Var = (gc8) obj3;
                try {
                    gc8Var.getDiv2Component$div_release().v().b(gc8Var.getBindingContext$div_release(), (View) obj4, ((qv8) obj2).a, (pm9) obj);
                } catch (z7k e) {
                    b8k b8kVar = b8k.c;
                    b8k b8kVar2 = e.a;
                    if (b8kVar2 != b8kVar && b8kVar2 != b8k.e && b8kVar2 != b8k.d) {
                        throw e;
                    }
                }
                gc8Var.getDiv2Component$div_release().v().a(gc8Var);
                return Unit.a;
            case 6:
                f23Var = (f23) obj4;
                ((g23) obj3).d();
                try {
                    ((i39) obj2).setImageBitmap((Bitmap) obj);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            case 7:
                f23Var = (f23) obj4;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                ygb ygbVar = (ygb) obj2;
                ((g23) obj3).d();
                try {
                    ygbVar.h = viewGroup2;
                    if (ygb.a(ygbVar)) {
                        if7 if7Var = ygbVar.i;
                        if (if7Var != null) {
                            if7Var.close();
                        }
                        ygbVar.i = new if7(viewGroup2, ygbVar.a, ygbVar.g, ygbVar.d);
                    }
                    g23.b(f23Var);
                    return Unit.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 8:
                le3 le3Var = (le3) obj;
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                erb erbVar = ((b) obj3).j;
                return (!((fcl) obj4).p || Build.VERSION.SDK_INT < 29) ? new dm7(exoPlayer, le3Var) : new ktr(exoPlayer, le3Var);
            case 9:
                ond ondVar = (ond) obj3;
                wwj wwjVar = (wwj) obj4;
                nnd nndVar = new nnd(i3, (Function1) obj2, (Function1) obj);
                ind indVar = ondVar.b;
                if (wwjVar instanceof vwj) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("apiVersion", 2);
                    jSONObject2.put("apiVersionMinor", 0);
                    if (indVar instanceof gnd) {
                        jSONObject = new JSONObject();
                        jSONObject.put("type", "DIRECT");
                        jSONObject.put("parameters", new JSONObject(uah.e(new Pair("protocolVersion", "ECv2"), new Pair("publicKey", ((gnd) indVar).a))));
                    } else {
                        if (!(indVar instanceof hnd)) {
                            LinkedHashMap linkedHashMap = sqg.a;
                            uwf.l("No tokenization params for GooglePay");
                            Parcelable.Creator<bfk> creator = bfk.CREATOR;
                            nndVar.x(y7g.D());
                            return Unit.a;
                        }
                        jSONObject = new JSONObject();
                        jSONObject.put("type", "PAYMENT_GATEWAY");
                        hnd hndVar = (hnd) indVar;
                        jSONObject.put("parameters", new JSONObject(uah.e(new Pair("gateway", hndVar.a), new Pair("gatewayMerchantId", hndVar.b))));
                    }
                    JSONArray jSONArray = new JSONArray((Collection) ondVar.c.a);
                    JSONArray jSONArray2 = new JSONArray((Collection) u75.h("PAN_ONLY", "CRYPTOGRAM_3DS"));
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("allowedAuthMethods", jSONArray2);
                    jSONObject4.put("allowedCardNetworks", jSONArray);
                    jSONObject4.put("billingAddressRequired", true);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("format", "FULL");
                    jSONObject4.put("billingAddressParameters", jSONObject5);
                    jSONObject4.put("allowPrepaidCards", true);
                    jSONObject3.put("type", "CARD");
                    jSONObject3.put("parameters", jSONObject4);
                    jSONObject3.put("tokenizationSpecification", jSONObject);
                    vwj vwjVar = (vwj) wwjVar;
                    BigDecimal bigDecimal = vwjVar.b;
                    if (bigDecimal != null) {
                        str2 = bigDecimal.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0 ? String.format("%.0f", Arrays.copyOf(new Object[]{bigDecimal}, 1)) : String.format("%.2f", Arrays.copyOf(new Object[]{bigDecimal}, 1));
                    } else {
                        str2 = null;
                    }
                    JSONObject jSONObject6 = new JSONObject();
                    String str4 = vwjVar.c;
                    if (str4 != null) {
                        jSONObject6.put("totalPriceStatus", str4);
                        if (str2 != null) {
                            jSONObject6.put("totalPrice", str2);
                        }
                    } else if (str2 == null) {
                        jSONObject6.put("totalPriceStatus", "NOT_CURRENTLY_KNOWN");
                    } else {
                        jSONObject6.put("totalPrice", str2);
                        jSONObject6.put("totalPriceStatus", "FINAL");
                    }
                    String str5 = vwjVar.d;
                    if (str5 != null) {
                        jSONObject6.put("totalPriceLabel", str5);
                    }
                    jSONObject6.put(AppsFlyerProperties.CURRENCY_CODE, vwjVar.a);
                    jSONObject2.put("allowedPaymentMethods", new JSONArray().put(jSONObject3));
                    jSONObject2.put("transactionInfo", jSONObject6);
                    jSONObject2.put("emailRequired", true);
                    jSONObject2.put("shippingAddressRequired", false);
                    str = jSONObject2.toString();
                } else {
                    if (!(wwjVar instanceof uwj)) {
                        b6e.s();
                        return null;
                    }
                    str = ((uwj) wwjVar).a;
                }
                str.getClass();
                lek lekVar = new lek();
                lekVar.i = true;
                lekVar.j = str;
                ondVar.e = nndVar;
                w8c w8cVar = ondVar.d;
                w8cVar.getClass();
                onx c = w8cVar.c(1, new txw(lekVar, i2));
                op2 op2Var = ondVar.a;
                int i6 = q92.b;
                o92 o92Var = new o92();
                int incrementAndGet = o92.f.incrementAndGet();
                o92Var.a = incrementAndGet;
                o92.e.put(incrementAndGet, o92Var);
                o92.d.postDelayed(o92Var, 600000L);
                c.addOnCompleteListener(o92Var);
                FragmentTransaction beginTransaction = op2Var.getFragmentManager().beginTransaction();
                int i7 = o92Var.a;
                int i8 = p92.d;
                Bundle bundle = new Bundle();
                bundle.putInt("resolveCallId", i7);
                bundle.putInt("requestCode", 663);
                bundle.putLong("initializationElapsedRealtime", q92.a);
                p92 p92Var = new p92();
                p92Var.setArguments(bundle);
                int i9 = o92Var.a;
                StringBuilder sb = new StringBuilder(58);
                sb.append("com.google.android.gms.wallet.AutoResolveHelper");
                sb.append(i9);
                beginTransaction.add(p92Var, sb.toString()).commit();
                return Unit.a;
            case 10:
                Number number = (Number) obj2;
                Number number2 = (Number) obj3;
                wje wjeVar = (wje) obj4;
                if (!number2.equals(wjeVar.a) || !number.equals(wjeVar.b)) {
                    wjeVar.a = number2;
                    wjeVar.b = number;
                    wjeVar.e = new l6s((vje) obj, wjeVar.c, number2, number, null);
                    wjeVar.i.b.setValue(Boolean.TRUE);
                    wjeVar.f = false;
                    wjeVar.g = true;
                }
                return Unit.a;
            case 11:
                f23Var = (f23) obj4;
                l0a l0aVar = (l0a) obj2;
                ((g23) obj3).d();
                try {
                    l0aVar.j();
                    ((dph) obj).x(l0aVar);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            case 12:
                f23Var = (f23) obj4;
                i39 i39Var = (i39) obj2;
                ((g23) obj3).d();
                try {
                    i39Var.s();
                    ((dph) obj).x(i39Var);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            case 13:
                f23Var = (f23) obj4;
                v19 v19Var = (v19) obj2;
                ((g23) obj3).d();
                try {
                    v19Var.s();
                    ((dph) obj).x(v19Var);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            case 14:
                mm6 mm6Var = (mm6) obj4;
                zcq zcqVar = (zcq) obj3;
                if (((gdq) ((x6k) zcqVar.b.g).getValue()) == gdq.b) {
                    if (zcqVar.b.g().a.containsKey(gdq.c)) {
                        x97.y(mm6Var, null, null, new v41(i2, (fk0) obj2, continuation), 3);
                        x97.y(mm6Var, null, null, new bbi(zcqVar, continuation, i3), 3);
                        return Unit.a;
                    }
                }
                x97.y(mm6Var, null, null, new bbi(zcqVar, continuation, i4), 3).R(new lna(i4, (Function0) obj));
                return Unit.a;
            case 15:
                ((uai) obj3).c((Function0) obj4, (tbi) obj2, (xof) obj);
                return Unit.a;
            case 16:
                f23Var = (f23) obj4;
                ((g23) obj3).d();
                try {
                    ((dzf) obj2).getLifecycle().a(((stn) obj).d);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            case 17:
                ((yk2) obj3).f((h4b) obj4);
                nnk nnkVar = ((tar) obj2).g;
                uar uarVar = (uar) obj;
                uarVar.getClass();
                ((yjj) nnkVar.b).e(uarVar);
                return Unit.a;
            case 18:
                f23Var = (f23) obj4;
                ((g23) obj3).d();
                try {
                    pat.a((gc8) obj, (pat) obj2);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            case 19:
                f23Var = (f23) obj4;
                rxt rxtVar = (rxt) obj2;
                kxt kxtVar = (kxt) obj;
                ((g23) obj3).d();
                try {
                    Iterator it = CollectionsKt.w0(rxtVar.h.values()).iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(kxtVar);
                    }
                    ckj ckjVar = (ckj) rxtVar.f.get(kxtVar.c());
                    if (ckjVar != null) {
                        akj akjVar = new akj(ckjVar);
                        while (akjVar.hasNext()) {
                            ((Function1) akjVar.next()).invoke(kxtVar);
                        }
                    }
                    g23.b(f23Var);
                    return Unit.a;
                } catch (Throwable th3) {
                    throw th3;
                }
            default:
                f23Var = (f23) obj4;
                ((g23) obj3).d();
                try {
                    ((uif) obj2).invoke((kxt) obj);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }
}
