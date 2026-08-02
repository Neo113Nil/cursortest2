package com.yandex.passport.common.network;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.internal.methods.performer.z0;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.widget.ErrorView;
import com.yandex.passport.sloth.data.n0;
import com.yandex.passport.sloth.data.o0;
import defpackage.b0o;
import defpackage.b6e;
import defpackage.bqr;
import defpackage.cg1;
import defpackage.cg6;
import defpackage.d0o;
import defpackage.evw;
import defpackage.hav;
import defpackage.hrg;
import defpackage.l2b;
import defpackage.l3o;
import defpackage.nm6;
import defpackage.o3a;
import defpackage.pce;
import defpackage.qgg;
import defpackage.quj;
import defpackage.r7o;
import defpackage.s7e;
import defpackage.sce;
import defpackage.su4;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.tyf;
import defpackage.u7e;
import defpackage.uz0;
import defpackage.v75;
import defpackage.vz1;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.yd5;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public class n implements com.yandex.passport.data.network.core.e, z0, com.yandex.passport.internal.push.s, com.yandex.passport.sloth.command.t, com.yandex.passport.internal.ui.sloth.webcard.a, com.yandex.passport.sloth.command.r, com.yandex.plus.bdui.b, com.yandex.plus.pay.ui.webview.paymentwidget.ui.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public n(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                str.getClass();
                this.b = str;
                this.c = quj.r(x3f.d, new r(0));
                break;
            default:
                str.getClass();
                b0o b0oVar = new b0o();
                b0oVar.d(HttpMessage.USER_AGENT, com.yandex.passport.common.util.c.a);
                this.b = b0oVar;
                s7e s7eVar = new s7e();
                s7eVar.g(com.yandex.passport.common.url.b.h(str));
                String e = com.yandex.passport.common.url.b.e(str);
                int c = com.yandex.passport.common.url.b.c(e);
                int i2 = -1;
                if (c != -1) {
                    String decode = Uri.decode(e.substring(c + 1));
                    try {
                        decode.getClass();
                        i2 = Integer.parseInt(decode);
                    } catch (NumberFormatException e2) {
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Error parsing port string: " + decode, e2);
                        }
                    }
                }
                Integer valueOf = i2 > 0 ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    s7eVar.i(valueOf.intValue());
                }
                s7eVar.n(com.yandex.passport.common.url.b.k(str));
                this.c = s7eVar;
                break;
        }
    }

    public static com.yandex.passport.internal.ui.base.j D(com.yandex.passport.internal.ui.base.i iVar) {
        if (iVar.d == null) {
            return null;
        }
        int i = iVar.f;
        boolean z = i == 0;
        if (z) {
            i = iVar.e;
        }
        return new com.yandex.passport.internal.ui.base.j(iVar.a, iVar.d, i, z);
    }

    public SpannedString A(com.yandex.plus.acquisition.sdk.pay.common.api.k kVar) {
        kVar.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        com.yandex.plus.acquisition.sdk.pay.common.api.e eVar = kVar.h;
        String str = eVar.a;
        if (str != null) {
            if (str.length() <= 0 || StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append((CharSequence) StringUtil.SPACE);
            }
        }
        String str2 = eVar.b;
        ArrayList<com.yandex.plus.acquisition.sdk.pay.common.api.d> arrayList = eVar.c;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        for (com.yandex.plus.acquisition.sdk.pay.common.api.d dVar : arrayList) {
            StringBuilder sb = new StringBuilder("{{");
            String str3 = dVar.a;
            String str4 = dVar.b;
            String o = su4.o(sb, str3, "}}");
            int T = StringsKt.T(str2, o, 0, false, 6);
            if (T == -1) {
                com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a aVar = (com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a) this.b;
                String str5 = kVar.b;
                String str6 = kVar.c;
                int i = kVar.a;
                String str7 = dVar.a;
                aVar.getClass();
                str7.getClass();
                com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic.e eVar2 = aVar.a;
                if (str5 == null) {
                    str5 = "no_value";
                }
                if (str6 == null) {
                    str6 = "no_value";
                }
                eVar2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Constants.KEY_PAGE, str5);
                linkedHashMap.put("place", str6);
                linkedHashMap.put("position", String.valueOf(i));
                linkedHashMap.put(PListParser.TAG_KEY, str7);
                linkedHashMap.put("_meta", com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic.e.a(new HashMap()));
                eVar2.b("OfferSection.Error.MissingLegalsKey", linkedHashMap);
                return null;
            }
            int length = spannableStringBuilder.length() + T;
            int length2 = str4.length() + length;
            str2 = kotlin.text.c.r(str2, o, str4, false);
            arrayList2.add(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.legals.a(length, length2, dVar.c));
        }
        if (str2.length() == 0 || StringsKt.U(str2)) {
            return null;
        }
        spannableStringBuilder.append((CharSequence) str2);
        Context context = (Context) this.c;
        context.getClass();
        int color = context.getColor(R.color.acquisition_sdk_semantic_link_link);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.yandex.plus.acquisition.sdk.button.section.ui.impl.legals.a aVar2 = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.legals.a) it.next();
            com.yandex.plus.home.common.utils.i iVar = new com.yandex.plus.home.common.utils.i(new hav(28, this, aVar2), false);
            int i2 = aVar2.a;
            int i3 = aVar2.b;
            spannableStringBuilder.setSpan(iVar, i2, i3, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), aVar2.a, i3, 33);
        }
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public void B(com.yandex.plus.bdui.action.a aVar, Map map) {
        com.yandex.plus.bdui.plus.webview.q qVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).a;
        qVar.getClass();
        if (map == null) {
            map = null;
        }
        qVar.a.a.a(aVar, qVar.c, map);
    }

    public com.yandex.plus.bdui.action.a C(String str) {
        com.yandex.plus.bdui.plus.checkout.webview.contract.b bVar = (com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b;
        com.yandex.plus.log.api.b bVar2 = bVar.d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, "WebPaymentWidgetContractWrapper", "getAction(); name = ".concat(str));
        }
        com.yandex.plus.bdui.action.a aVar2 = (com.yandex.plus.bdui.action.a) bVar.a.b.h.get(str);
        if (aVar2 != null) {
            return aVar2;
        }
        com.yandex.plus.bdui.plus.checkout.o oVar = (com.yandex.plus.bdui.plus.checkout.o) this.c;
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
        if (bVar2.b(aVar3)) {
            bVar2.c(aVar3, "WebPaymentWidgetContractWrapper", hrg.q("getAction(); action with name = ", str, " not found in web actions!"));
        }
        return oVar.a(new IllegalStateException(hrg.q("PlusWebContent has not action \"", str, "\"!")));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:23|24))(5:25|26|(1:28)|29|(1:31))|11|(3:13|(1:15)(1:21)|(2:17|18))|22))|36|6|7|(0)(0)|11|(0)|22) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getBitmapFromCache ex: " + r10, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x0028, B:11:0x0075, B:13:0x007b, B:15:0x0083, B:17:0x0089, B:26:0x0038, B:28:0x0040, B:29:0x0055), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(String str, cg6 cg6Var) {
        com.yandex.passport.internal.push.a0 a0Var;
        int i;
        sce sceVar;
        if (cg6Var instanceof com.yandex.passport.internal.push.a0) {
            a0Var = (com.yandex.passport.internal.push.a0) cg6Var;
            int i2 = a0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = a0Var.j;
                nm6 nm6Var = nm6.a;
                i = a0Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "url " + ((Object) com.yandex.passport.common.url.b.m(str)), 8);
                    }
                    pce pceVar = new pce((Context) this.b);
                    pceVar.c = str;
                    com.yandex.passport.internal.provider.communication.c cVar = new com.yandex.passport.internal.provider.communication.c(this, pceVar.a(), continuation, 2);
                    a0Var.l = 1;
                    obj = tyf.J(1000L, cVar, a0Var);
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
                sceVar = (sce) obj;
                if (sceVar instanceof bqr) {
                    Drawable drawable = ((bqr) sceVar).a;
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable != null) {
                        return bitmapDrawable.getBitmap();
                    }
                }
                return null;
            }
        }
        a0Var = new com.yandex.passport.internal.push.a0(this, cg6Var);
        Object obj2 = a0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = a0Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        sceVar = (sce) obj2;
        if (sceVar instanceof bqr) {
        }
        return null;
    }

    public void F(String str, String str2) {
        str.getClass();
        if (str2 != null) {
            ((b0o) this.b).d(str, str2);
        }
    }

    public boolean G(com.yandex.passport.common.core.f fVar) {
        Cursor query = ((SQLiteDatabase) ((evw) this.b).invoke()).query("local_uids", com.yandex.passport.internal.database.tables.a.d, "uid = ?", new String[]{String.valueOf(fVar.b)}, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("uid"));
                if ((string != null ? Long.valueOf(Long.parseLong(string)) : null) != null) {
                    yd5.q(query, null);
                    return true;
                }
            }
            yd5.q(query, null);
            return false;
        } finally {
        }
    }

    public void H(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.ui.social.gimap.p pVar) {
        String str;
        com.yandex.passport.internal.ui.social.gimap.q qVar = (com.yandex.passport.internal.ui.social.gimap.q) this.b;
        qVar.getClass();
        lVar.getClass();
        pVar.getClass();
        com.yandex.passport.internal.core.accounts.i iVar = qVar.r;
        com.yandex.passport.internal.stash.b bVar = com.yandex.passport.internal.stash.b.GIMAP_TRACK;
        String str2 = pVar.a;
        com.yandex.passport.internal.ui.social.gimap.o oVar = pVar.d;
        com.yandex.passport.internal.ui.social.gimap.o oVar2 = pVar.c;
        if (str2 != null && oVar2.d() && oVar.d()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("email", str2);
            jSONObject.put("imapSettings", oVar2.e());
            jSONObject.put("smtpSettings", oVar.e());
            jSONObject.put("environment", pVar.e.a);
            str = jSONObject.toString();
            str.getClass();
        } else {
            str = null;
        }
        com.yandex.passport.internal.core.accounts.i.j(iVar, lVar, new Pair[]{new Pair(bVar, str)});
        qVar.s.m(lVar);
    }

    public void I() {
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((com.yandex.passport.internal.ui.base.k) it.next()).a();
        }
        Stack stack = (Stack) this.b;
        if (stack.isEmpty()) {
            com.yandex.passport.legacy.a.e(3, "Fragment back stack is empty", null);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragments in back stack:\n");
        Iterator it2 = stack.iterator();
        while (it2.hasNext()) {
            com.yandex.passport.internal.ui.base.i iVar = (com.yandex.passport.internal.ui.base.i) it2.next();
            Locale locale = Locale.US;
            sb.append("0. " + iVar.a + StringUtil.LF);
        }
        com.yandex.passport.legacy.a.e(3, sb.toString(), null);
    }

    public void J(String str) {
        s7e s7eVar = (s7e) this.c;
        if (kotlin.text.c.v(str, "/", false)) {
            str = str.substring(1);
        }
        s7eVar.getClass();
        s7eVar.c(str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(com.yandex.passport.sloth.command.data.z0 z0Var, cg6 cg6Var) {
        com.yandex.passport.internal.sloth.performers.webcard.b bVar;
        int i;
        if (cg6Var instanceof com.yandex.passport.internal.sloth.performers.webcard.b) {
            bVar = (com.yandex.passport.internal.sloth.performers.webcard.b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.sloth.performers.webcard.g gVar = (com.yandex.passport.internal.sloth.performers.webcard.g) this.b;
                    com.yandex.passport.internal.sloth.performers.webcard.d dVar = new com.yandex.passport.internal.sloth.performers.webcard.d(z0Var.a, z0Var.b, z0Var.c, z0Var.d, z0Var.e, z0Var.f && ((Boolean) ((com.yandex.passport.internal.flags.i) this.c).b(com.yandex.passport.internal.flags.o.o)).booleanValue());
                    bVar.l = 1;
                    Object emit = gVar.a.emit(dVar, bVar);
                    if (emit != nm6Var) {
                        emit = Unit.a;
                    }
                    if (emit == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new l2b(com.yandex.passport.sloth.command.v.c);
            }
        }
        bVar = new com.yandex.passport.internal.sloth.performers.webcard.b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object L(com.yandex.passport.sloth.data.m mVar, Continuation continuation) {
        com.yandex.passport.internal.sloth.performers.webcard.a aVar;
        int i;
        if (continuation instanceof com.yandex.passport.internal.sloth.performers.webcard.a) {
            aVar = (com.yandex.passport.internal.sloth.performers.webcard.a) continuation;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    o0 o0Var = mVar.a;
                    if (o0Var instanceof n0) {
                        com.yandex.passport.internal.usecase.ui.o oVar = (com.yandex.passport.internal.usecase.ui.o) this.c;
                        com.yandex.passport.internal.usecase.ui.m mVar2 = new com.yandex.passport.internal.usecase.ui.m(((n0) o0Var).c);
                        aVar.l = 1;
                        obj = oVar.g(mVar2, aVar);
                    }
                    return new l2b(com.yandex.passport.sloth.command.v.c);
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return new l2b(com.yandex.passport.sloth.command.v.c);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Object obj2 = ((z7o) obj).a;
                com.yandex.passport.internal.sloth.performers.webcard.g gVar = (com.yandex.passport.internal.sloth.performers.webcard.g) this.b;
                com.yandex.passport.internal.sloth.performers.webcard.c cVar = new com.yandex.passport.internal.sloth.performers.webcard.c(obj2);
                aVar.l = 2;
                Object emit = gVar.a.emit(cVar, aVar);
                if (emit != nm6Var) {
                    emit = Unit.a;
                }
            }
        }
        aVar = new com.yandex.passport.internal.sloth.performers.webcard.a(this, (cg6) continuation);
        Object obj3 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
    }

    public void M() {
        Stack stack = (Stack) this.b;
        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
        I();
    }

    public d0o N(Function1 function1) {
        p pVar = new p((String) Q().b);
        function1.invoke(pVar);
        return pVar.z();
    }

    public void O(String str, String str2) {
        str.getClass();
        if (str2 != null) {
            ((s7e) this.c).d(str, str2);
        }
    }

    public void P(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            O((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public n Q() {
        return new n(((com.yandex.passport.internal.network.h) ((com.yandex.passport.internal.network.d) this.c)).d((com.yandex.passport.common.core.b) this.b, 0L), 1);
    }

    public Object R(com.yandex.passport.common.core.b bVar, int i, com.yandex.passport.internal.push.o oVar) {
        String str;
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) ((com.yandex.passport.internal.network.d) this.c);
        hVar.getClass();
        bVar.getClass();
        String str2 = hVar.d(bVar, null) + "/1/yakey/pictures/" + i;
        int i2 = hVar.d.a.getDisplayMetrics().densityDpi;
        int ordinal = (i2 != 120 ? i2 != 160 ? i2 != 240 ? i2 != 320 ? (i2 == 480 || i2 == 640) ? com.yandex.passport.common.resources.a.e : com.yandex.passport.common.resources.a.b : com.yandex.passport.common.resources.a.d : com.yandex.passport.common.resources.a.c : com.yandex.passport.common.resources.a.b : com.yandex.passport.common.resources.a.a).ordinal();
        if (ordinal == 0) {
            str = "ldpi";
        } else if (ordinal == 1) {
            str = "mdpi";
        } else if (ordinal == 2) {
            str = "hdpi";
        } else if (ordinal == 3) {
            str = "xhdpi";
        } else {
            if (ordinal != 4) {
                b6e.s();
                return null;
            }
            str = "xxhdpi";
        }
        return E(com.yandex.passport.common.url.b.b(str2, new Pair("density", str)), oVar);
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void a() {
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "onWebPageLoadingFinished()");
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void b(String str) {
        com.yandex.plus.bdui.action.a C = C("error");
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "onWebPageLoadingFailed(); dispatch error action = " + C);
        }
        B(C, null);
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void e() {
        com.yandex.plus.bdui.plus.checkout.webview.contract.b bVar = (com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b;
        com.yandex.plus.bdui.plus.webview.q qVar = bVar.a;
        boolean containsKey = qVar.b.h.containsKey("close");
        String str = containsKey ? "close" : "next";
        com.yandex.plus.bdui.action.a C = C(str);
        com.yandex.plus.log.api.b bVar2 = bVar.d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, "WebPaymentWidgetContractWrapper", "onWebPageClose(); dispatch " + str + " = " + C);
        }
        if (containsKey) {
            qVar.a.a.a(C, qVar.c, null);
        } else {
            B(C, null);
        }
    }

    @Override // com.yandex.passport.internal.push.s
    public Object f(Continuation continuation) {
        Object h = ((com.yandex.passport.internal.push.g) this.b).h((com.yandex.passport.common.core.f) this.c, (cg6) continuation);
        return h == nm6.a ? h : Unit.a;
    }

    @Override // com.yandex.passport.data.network.core.e
    public i g(l3o l3oVar) {
        l3oVar.getClass();
        return (i) com.yandex.passport.data.network.core.q.a.b(new j((t9f) this.b, (t9f) this.c, 2), com.yandex.plus.pay.ui.core.b.q(l3oVar));
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void h() {
        com.yandex.plus.bdui.action.a C = C("needAuth");
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "onWebPageNeedAuth(); dispatch need auth action = " + C);
        }
        B(C, null);
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void m(String str, boolean z) {
        com.yandex.plus.bdui.plus.checkout.webview.contract.b bVar = (com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b;
        com.yandex.plus.log.api.b bVar2 = bVar.d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, "WebPaymentWidgetContractWrapper", vz1.p("onWebPageOpenUri(); uri = ", str, ", requireAuthorization = ", z));
        }
        x97.y(bVar.e, null, null, new cg1(z, bVar, str, (Continuation) null, 25), 3);
    }

    @Override // com.yandex.passport.sloth.command.r
    public Object n(Object obj, com.yandex.passport.sloth.command.f fVar) {
        return ((com.yandex.passport.sloth.command.t) this.c).q((com.yandex.passport.sloth.data.m) this.b, obj, fVar);
    }

    @Override // com.yandex.plus.bdui.b
    public void p() {
        com.yandex.plus.bdui.flex.a aVar = (com.yandex.plus.bdui.flex.a) this.b;
        aVar.d = null;
        o3a o3aVar = aVar.a;
        Object obj = ((xqn) this.c).a;
        obj.getClass();
        ((ArrayList) o3aVar.y.b).remove((com.yandex.plus.bdui.flex.b) obj);
    }

    @Override // com.yandex.passport.sloth.command.t
    public /* bridge */ /* synthetic */ Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        switch (this.a) {
            case 15:
                return L(mVar, fVar);
            default:
                return K((com.yandex.passport.sloth.command.data.z0) obj, fVar);
        }
    }

    @Override // com.yandex.plus.bdui.b
    public void r(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.e eVar) {
        ((com.yandex.plus.bdui.flex.a) this.b).h(eVar);
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void t(String str) {
        com.yandex.plus.bdui.action.a C = C("next");
        Map b = com.yandex.plus.bdui.plus.checkout.utils.a.b(str);
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "onWebPageYbOpenCardSuccess(" + str + "); dispatch next action = " + C + " with payload = " + b);
        }
        B(C("next"), b);
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public Object u(v5 v5Var) {
        try {
            r7o r7oVar = z7o.b;
            return ((Function2) this.c).invoke((com.yandex.passport.internal.provider.a) this.b, v5Var);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void v() {
        com.yandex.plus.bdui.action.a C = C("next");
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "onWebPageSuccess(); dispatch next action = " + C);
        }
        B(C, null);
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void y(String str) {
        com.yandex.plus.bdui.action.a C = C("error");
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "onWebPageError(); dispatch error action = " + C);
        }
        B(C, null);
    }

    public d0o z() {
        b0o b0oVar = (b0o) this.b;
        u7e e = ((s7e) this.c).e();
        b0oVar.getClass();
        b0oVar.a = e;
        return b0oVar.b();
    }

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ n() {
        this.a = 17;
    }

    public n(com.yandex.passport.internal.provider.a aVar, Function2 function2) {
        this.a = 10;
        aVar.getClass();
        function2.getClass();
        this.b = aVar;
        this.c = function2;
    }

    public n(com.yandex.plus.resources.core.c cVar, com.yandex.plus.core.strings.a aVar) {
        this.a = 25;
        aVar.getClass();
        this.b = cVar;
        this.c = aVar;
    }

    public n(com.yandex.passport.internal.sloth.performers.webcard.g gVar, com.yandex.passport.internal.flags.i iVar) {
        this.a = 16;
        gVar.getClass();
        iVar.getClass();
        this.b = gVar;
        this.c = iVar;
    }

    public n(Context context, com.yandex.passport.internal.network.d dVar) {
        this.a = 14;
        context.getClass();
        dVar.getClass();
        this.b = context;
        this.c = dVar;
    }

    public n(Context context, com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a aVar) {
        this.a = 24;
        context.getClass();
        aVar.getClass();
        this.b = aVar;
        this.c = context.getApplicationContext();
    }

    public n(com.yandex.passport.internal.flags.experiments.k kVar, com.yandex.passport.internal.flags.i iVar) {
        this.a = 9;
        kVar.getClass();
        iVar.getClass();
        this.b = kVar;
        this.c = iVar;
    }

    public n(com.yandex.passport.internal.sloth.performers.webcard.g gVar, com.yandex.passport.internal.usecase.ui.o oVar) {
        this.a = 15;
        gVar.getClass();
        oVar.getClass();
        this.b = gVar;
        this.c = oVar;
    }

    public n(com.yandex.passport.internal.ui.social.gimap.a aVar, com.yandex.passport.internal.ui.social.gimap.q qVar) {
        this.a = 19;
        this.c = aVar;
        this.b = qVar;
    }

    public n(t9f t9fVar, t9f t9fVar2) {
        this.a = 2;
        t9fVar.getClass();
        t9fVar2.getClass();
        this.b = t9fVar;
        this.c = t9fVar2;
    }

    public n(ArrayList arrayList, List list) {
        this.a = 8;
        list.getClass();
        this.b = arrayList;
        this.c = list;
    }

    public n(com.yandex.passport.sloth.data.m mVar, com.yandex.passport.sloth.command.t tVar) {
        this.a = 23;
        mVar.getClass();
        this.b = mVar;
        this.c = tVar;
    }

    public n(FrameLayout frameLayout, ErrorView[] errorViewArr) {
        this.a = 22;
        frameLayout.getClass();
        this.b = frameLayout;
        this.c = errorViewArr;
    }

    public n(com.yandex.passport.internal.push.g gVar, com.yandex.passport.common.core.f fVar) {
        this.a = 13;
        gVar.getClass();
        this.b = gVar;
        this.c = fVar;
    }

    public n(byte[] bArr) {
        this.a = 3;
        bArr.getClass();
        IntRange intRange = new IntRange(0, 15, 1);
        this.b = new SecretKeySpec(intRange.isEmpty() ? new byte[0] : uz0.j(bArr, 0, intRange.b + 1), "AES");
        IntRange intRange2 = new IntRange(16, bArr.length - 1, 1);
        this.c = new IvParameterSpec(intRange2.isEmpty() ? new byte[0] : uz0.j(bArr, 16, intRange2.b + 1));
    }

    public n(View view, TextView textView) {
        this.a = 21;
        view.getClass();
        textView.getClass();
        this.b = view;
        this.c = textView;
    }
}
