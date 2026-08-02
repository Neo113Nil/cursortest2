package com.yandex.passport.internal.methods.performer;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.methods.a5;
import com.yandex.passport.internal.methods.b5;
import com.yandex.passport.internal.methods.d4;
import com.yandex.passport.internal.methods.f3;
import com.yandex.passport.internal.methods.g3;
import com.yandex.passport.internal.methods.g5;
import com.yandex.passport.internal.methods.i5;
import com.yandex.passport.internal.methods.j5;
import com.yandex.passport.internal.methods.m5;
import com.yandex.passport.internal.methods.n3;
import com.yandex.passport.internal.methods.n5;
import com.yandex.passport.internal.methods.p4;
import com.yandex.passport.internal.methods.q3;
import com.yandex.passport.internal.methods.s4;
import com.yandex.passport.internal.methods.s5;
import com.yandex.passport.internal.methods.v5;
import defpackage.tah;
import defpackage.v75;
import defpackage.xy0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes4.dex */
public final class w0 implements Function2 {
    public static final w0 b = new w0(0);
    public static final w0 c = new w0(1);
    public static final w0 d = new w0(2);
    public static final w0 e = new w0(3);
    public static final w0 f = new w0(4);
    public static final w0 g = new w0(5);
    public static final w0 h = new w0(6);
    public static final w0 i = new w0(7);
    public static final w0 j = new w0(8);
    public static final w0 k = new w0(9);
    public static final w0 l = new w0(10);
    public static final w0 m = new w0(11);
    public static final w0 n = new w0(12);
    public static final w0 o = new w0(13);
    public static final w0 p = new w0(14);
    public static final w0 q = new w0(15);
    public final /* synthetic */ int a;

    public /* synthetic */ w0(int i2) {
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.provider.a aVar = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var = (v5) obj2;
                aVar.getClass();
                v5Var.getClass();
                com.yandex.passport.internal.l e2 = aVar.b.a().e(com.yandex.plus.pay.ui.core.b.K((z1) ((g5) v5Var).c.c));
                if (e2 != null) {
                    com.yandex.passport.internal.g d2 = e2.d();
                    com.yandex.passport.internal.core.accounts.i iVar = aVar.c;
                    String d3 = new com.yandex.passport.internal.g(null, d2.b, d2.c, d2.d, d2.e, d2.f, d2.g, d2.h, 0L).d();
                    iVar.getClass();
                    iVar.f(com.yandex.passport.internal.b.a(iVar.l.a(e2), null, null, null, d3, KotlinVersion.MAX_COMPONENT_VALUE));
                    iVar.a.o(e2.g, d3);
                    com.yandex.passport.internal.core.announcing.b.d(iVar.b, com.yandex.passport.internal.analytics.j.i);
                }
                return Unit.a;
            case 1:
                com.yandex.passport.internal.provider.a aVar2 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var2 = (v5) obj2;
                aVar2.getClass();
                v5Var2.getClass();
                Boolean bool = (Boolean) ((j5) v5Var2).c.c;
                bool.booleanValue();
                com.yandex.passport.internal.storage.m mVar = aVar2.a;
                mVar.h.setValue(mVar, com.yandex.passport.internal.storage.m.m[6], bool);
                return Unit.a;
            case 2:
                com.yandex.passport.internal.provider.a aVar3 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var3 = (v5) obj2;
                aVar3.getClass();
                v5Var3.getClass();
                s5 s5Var = (s5) v5Var3;
                try {
                    aVar3.j.b(com.yandex.plus.pay.ui.core.b.K((z1) s5Var.c.c), (com.yandex.passport.internal.entities.r) s5Var.d.c);
                    return Unit.a;
                } catch (com.yandex.passport.common.exception.a unused) {
                    throw new com.yandex.passport.api.exception.a();
                } catch (com.yandex.passport.data.exceptions.h e3) {
                    throw new com.yandex.passport.api.exception.k(e3.getMessage());
                } catch (IOException e4) {
                    e = e4;
                    throw new com.yandex.passport.api.exception.p(e);
                } catch (JSONException e5) {
                    e = e5;
                    throw new com.yandex.passport.api.exception.p(e);
                }
            case 3:
                com.yandex.passport.internal.provider.a aVar4 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var4 = (v5) obj2;
                aVar4.getClass();
                v5Var4.getClass();
                com.yandex.passport.internal.methods.y yVar = (com.yandex.passport.internal.methods.y) v5Var4;
                try {
                    return Boolean.valueOf(aVar4.k.a(com.yandex.plus.pay.ui.core.b.K((z1) yVar.c.c), (Uri) yVar.d.c));
                } catch (com.yandex.passport.common.exception.a unused2) {
                    throw new com.yandex.passport.api.exception.a();
                } catch (com.yandex.passport.data.exceptions.h e6) {
                    throw new com.yandex.passport.api.exception.k(e6.getMessage());
                } catch (IOException e7) {
                    e = e7;
                    throw new com.yandex.passport.api.exception.p(e);
                } catch (JSONException e8) {
                    e = e8;
                    throw new com.yandex.passport.api.exception.p(e);
                }
            case 4:
                com.yandex.passport.internal.provider.a aVar5 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var5 = (v5) obj2;
                aVar5.getClass();
                v5Var5.getClass();
                try {
                    Uri a = aVar5.j.a(com.yandex.plus.pay.ui.core.b.K((z1) ((n3) v5Var5).c.c));
                    a.getClass();
                    return a;
                } catch (com.yandex.passport.api.exception.b e9) {
                    throw e9;
                } catch (com.yandex.passport.common.exception.a e10) {
                    e = e10;
                    throw new com.yandex.passport.api.exception.p(e);
                } catch (com.yandex.passport.data.exceptions.h e11) {
                    throw new com.yandex.passport.api.exception.k(e11.getMessage());
                } catch (IOException e12) {
                    e = e12;
                    throw new com.yandex.passport.api.exception.p(e);
                } catch (JSONException e13) {
                    e = e13;
                    throw new com.yandex.passport.api.exception.p(e);
                } catch (Exception e14) {
                    throw new com.yandex.passport.api.exception.t(e14);
                }
            case 5:
                com.yandex.passport.internal.provider.a aVar6 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var6 = (v5) obj2;
                aVar6.getClass();
                v5Var6.getClass();
                com.yandex.passport.internal.properties.h0 h0Var = (com.yandex.passport.internal.properties.h0) ((q3) v5Var6).c.c;
                try {
                    com.yandex.passport.common.core.f K = com.yandex.plus.pay.ui.core.b.K(h0Var.c);
                    com.yandex.passport.internal.l e15 = aVar6.b.a().e(K);
                    if (e15 != null) {
                        return aVar6.d.a(K.a).d(e15.d, h0Var.d, h0Var.d());
                    }
                    throw new com.yandex.passport.api.exception.b(K);
                } catch (com.yandex.passport.common.exception.a unused3) {
                    throw new com.yandex.passport.api.exception.a();
                } catch (com.yandex.passport.data.exceptions.h e16) {
                    throw new com.yandex.passport.api.exception.k(e16.getMessage());
                } catch (IOException e17) {
                    e = e17;
                    throw new com.yandex.passport.api.exception.p(e);
                } catch (JSONException e18) {
                    e = e18;
                    throw new com.yandex.passport.api.exception.p(e);
                }
            case 6:
                com.yandex.passport.internal.provider.a aVar7 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var7 = (v5) obj2;
                aVar7.getClass();
                v5Var7.getClass();
                p4 p4Var = (p4) v5Var7;
                try {
                    return aVar7.d.a(com.yandex.plus.core.network.api.utils.a.L((com.yandex.passport.api.impl.b) p4Var.c.c)).f((String) p4Var.d.c);
                } catch (com.yandex.passport.common.exception.a unused4) {
                    throw new com.yandex.passport.api.exception.k("invalid_token");
                } catch (com.yandex.passport.data.exceptions.h e19) {
                    throw new com.yandex.passport.api.exception.k(e19.getMessage());
                } catch (IOException e20) {
                    e = e20;
                    throw new com.yandex.passport.api.exception.p(e);
                } catch (JSONException e21) {
                    e = e21;
                    throw new com.yandex.passport.api.exception.p(e);
                }
            case 7:
                com.yandex.passport.internal.provider.a aVar8 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var8 = (v5) obj2;
                aVar8.getClass();
                v5Var8.getClass();
                ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((a5) v5Var8).c;
                int a2 = tah.a(v75.o(arrayList, 10));
                if (a2 < 16) {
                    a2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                    linkedHashMap.put(eVar.a, eVar.a());
                }
                com.yandex.passport.internal.flags.experiments.k kVar = aVar8.l;
                kVar.getClass();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    str.getClass();
                    SharedPreferences sharedPreferences = kVar.a;
                    if (str2 == null) {
                        sharedPreferences.getClass();
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove(str);
                        edit.apply();
                    } else {
                        sharedPreferences.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        edit2.putString(str, str2);
                        edit2.apply();
                    }
                }
                return Unit.a;
            case 8:
                com.yandex.passport.internal.provider.a aVar9 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var9 = (v5) obj2;
                aVar9.getClass();
                v5Var9.getClass();
                com.yandex.passport.internal.l e22 = aVar9.b.a().e(com.yandex.plus.pay.ui.core.b.K((z1) ((g3) v5Var9).c.c));
                if (e22 != null) {
                    aVar9.f.a(e22);
                }
                return Unit.a;
            case 9:
                com.yandex.passport.internal.provider.a aVar10 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var10 = (v5) obj2;
                aVar10.getClass();
                v5Var10.getClass();
                m5 m5Var = (m5) v5Var10;
                z1 z1Var = (z1) m5Var.c.c;
                String str3 = m5Var.d.c().a;
                String str4 = (String) m5Var.e.c;
                com.yandex.passport.legacy.a.e(3, "stashValue: uid=" + z1Var + " cell=" + str3 + " value='" + str4 + "'", null);
                com.yandex.passport.internal.l e23 = aVar10.b.a().e(com.yandex.plus.pay.ui.core.b.K(z1Var));
                if (e23 == null) {
                    throw new com.yandex.passport.api.exception.b(z1Var);
                }
                com.yandex.passport.internal.stash.b.b.getClass();
                com.yandex.passport.internal.stash.b h2 = com.yandex.passport.data.network.token.i.h(str3);
                if (h2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(e23);
                    aVar10.c.i(arrayList2, h2, str4);
                }
                return Unit.a;
            case 10:
                com.yandex.passport.internal.provider.a aVar11 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var11 = (v5) obj2;
                aVar11.getClass();
                v5Var11.getClass();
                n5 n5Var = (n5) v5Var11;
                List list = (List) n5Var.c.c;
                String str5 = n5Var.d.c().a;
                String str6 = (String) n5Var.e.c;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.yandex.passport.common.core.f K2 = com.yandex.plus.pay.ui.core.b.K((z1) it.next());
                    com.yandex.passport.internal.l e24 = aVar11.b.a().e(K2);
                    if (e24 == null) {
                        com.yandex.passport.legacy.a.e(6, "Account with uid " + K2 + " not found", null);
                    } else {
                        arrayList3.add(e24);
                    }
                }
                com.yandex.passport.internal.stash.b.b.getClass();
                com.yandex.passport.internal.stash.b h3 = com.yandex.passport.data.network.token.i.h(str5);
                if (h3 != null) {
                    aVar11.c.i(arrayList3, h3, str6);
                }
                return Unit.a;
            case 11:
                com.yandex.passport.internal.provider.a aVar12 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var12 = (v5) obj2;
                aVar12.getClass();
                v5Var12.getClass();
                com.yandex.passport.common.core.f K3 = com.yandex.plus.pay.ui.core.b.K((z1) ((s4) v5Var12).c.c);
                com.yandex.passport.internal.storage.m mVar2 = aVar12.a;
                mVar2.getClass();
                com.yandex.passport.internal.storage.e eVar2 = new com.yandex.passport.internal.storage.e(mVar2, K3);
                return (Boolean) eVar2.a.getValue(eVar2, com.yandex.passport.internal.storage.e.d[0]);
            case 12:
                com.yandex.passport.internal.provider.a aVar13 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var13 = (v5) obj2;
                aVar13.getClass();
                v5Var13.getClass();
                i5 i5Var = (i5) v5Var13;
                z1 z1Var2 = (z1) i5Var.c.c;
                boolean booleanValue = ((Boolean) i5Var.d.c).booleanValue();
                com.yandex.passport.common.core.f K4 = com.yandex.plus.pay.ui.core.b.K(z1Var2);
                com.yandex.passport.internal.storage.m mVar3 = aVar13.a;
                mVar3.getClass();
                new com.yandex.passport.internal.storage.e(mVar3, K4).a(booleanValue);
                return Unit.a;
            case 13:
                com.yandex.passport.internal.provider.a aVar14 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var14 = (v5) obj2;
                aVar14.getClass();
                v5Var14.getClass();
                com.yandex.passport.internal.l e25 = aVar14.b.a().e(com.yandex.plus.pay.ui.core.b.K((z1) ((f3) v5Var14).c.c));
                if (e25 != null) {
                    com.yandex.passport.internal.core.accounts.i iVar2 = aVar14.c;
                    iVar2.getClass();
                    iVar2.f(com.yandex.passport.internal.b.a(iVar2.l.a(e25), null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION));
                    com.yandex.passport.internal.core.accounts.k kVar2 = iVar2.a;
                    Account account = e25.g;
                    account.getClass();
                    kVar2.e();
                    AccountManager accountManager = kVar2.a;
                    accountManager.setUserData(account, "uid", null);
                    accountManager.setUserData(account, "user_info_body", null);
                    accountManager.setUserData(account, "user_info_meta", null);
                    accountManager.setUserData(account, "stash", null);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "downgradeAccount: account=" + account, 8);
                    }
                    com.yandex.passport.internal.core.announcing.b.d(iVar2.b, com.yandex.passport.internal.analytics.j.h);
                }
                return Unit.a;
            case 14:
                com.yandex.passport.internal.provider.a aVar15 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var15 = (v5) obj2;
                aVar15.getClass();
                v5Var15.getClass();
                z1 z1Var3 = (z1) ((d4) v5Var15).c.c;
                com.yandex.passport.internal.analytics.o0 o0Var = aVar15.e;
                try {
                    com.yandex.passport.internal.l a3 = aVar15.g.a(com.yandex.plus.pay.ui.core.b.K(z1Var3));
                    com.yandex.passport.internal.account.f B = a3 != null ? com.yandex.plus.core.locale.b.B(a3) : null;
                    boolean z = B != null;
                    o0Var.getClass();
                    xy0 xy0Var = new xy0(0);
                    xy0Var.put("success", String.valueOf(z));
                    o0Var.a.b(com.yandex.passport.internal.analytics.o.c, xy0Var);
                    return B;
                } catch (Exception e26) {
                    o0Var.getClass();
                    xy0 xy0Var2 = new xy0(0);
                    xy0Var2.put("success", String.valueOf(false));
                    o0Var.a.b(com.yandex.passport.internal.analytics.o.c, xy0Var2);
                    throw e26;
                }
            default:
                com.yandex.passport.internal.provider.a aVar16 = (com.yandex.passport.internal.provider.a) obj;
                v5 v5Var16 = (v5) obj2;
                aVar16.getClass();
                v5Var16.getClass();
                Object obj3 = ((b5) v5Var16).c.c;
                z1 z1Var4 = (z1) ((Pair) obj3).a;
                z1 z1Var5 = (z1) ((Pair) obj3).b;
                com.yandex.passport.internal.analytics.o0 o0Var2 = aVar16.e;
                try {
                    aVar16.h.a(com.yandex.plus.pay.ui.core.b.K(z1Var4), com.yandex.plus.pay.ui.core.b.K(z1Var5));
                    o0Var2.getClass();
                    xy0 xy0Var3 = new xy0(0);
                    xy0Var3.put("success", String.valueOf(true));
                    o0Var2.a.b(com.yandex.passport.internal.analytics.o.d, xy0Var3);
                    return Unit.a;
                } catch (Exception e27) {
                    o0Var2.getClass();
                    xy0 xy0Var4 = new xy0(0);
                    xy0Var4.put("success", String.valueOf(false));
                    o0Var2.a.b(com.yandex.passport.internal.analytics.o.d, xy0Var4);
                    throw e27;
                }
        }
    }
}
