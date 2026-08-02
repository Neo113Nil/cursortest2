package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.work.impl.WorkDatabase;
import com.yandex.go.flex.common.descriptors.action.h;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.api.exception.PassportInvalidTokenException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.common.network.u;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.LegacyExtraData;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.PersonProfile;
import com.yandex.passport.internal.methods.a0;
import com.yandex.passport.internal.methods.a1;
import com.yandex.passport.internal.methods.a2;
import com.yandex.passport.internal.methods.b0;
import com.yandex.passport.internal.methods.b1;
import com.yandex.passport.internal.methods.b2;
import com.yandex.passport.internal.methods.c0;
import com.yandex.passport.internal.methods.c1;
import com.yandex.passport.internal.methods.c2;
import com.yandex.passport.internal.methods.d0;
import com.yandex.passport.internal.methods.d1;
import com.yandex.passport.internal.methods.d2;
import com.yandex.passport.internal.methods.e1;
import com.yandex.passport.internal.methods.e2;
import com.yandex.passport.internal.methods.f1;
import com.yandex.passport.internal.methods.f2;
import com.yandex.passport.internal.methods.g1;
import com.yandex.passport.internal.methods.g2;
import com.yandex.passport.internal.methods.h0;
import com.yandex.passport.internal.methods.h1;
import com.yandex.passport.internal.methods.h2;
import com.yandex.passport.internal.methods.i0;
import com.yandex.passport.internal.methods.i1;
import com.yandex.passport.internal.methods.i2;
import com.yandex.passport.internal.methods.j0;
import com.yandex.passport.internal.methods.j1;
import com.yandex.passport.internal.methods.j2;
import com.yandex.passport.internal.methods.k0;
import com.yandex.passport.internal.methods.k1;
import com.yandex.passport.internal.methods.k2;
import com.yandex.passport.internal.methods.l0;
import com.yandex.passport.internal.methods.l1;
import com.yandex.passport.internal.methods.l2;
import com.yandex.passport.internal.methods.m0;
import com.yandex.passport.internal.methods.m1;
import com.yandex.passport.internal.methods.m2;
import com.yandex.passport.internal.methods.n0;
import com.yandex.passport.internal.methods.n1;
import com.yandex.passport.internal.methods.n2;
import com.yandex.passport.internal.methods.o0;
import com.yandex.passport.internal.methods.o1;
import com.yandex.passport.internal.methods.o2;
import com.yandex.passport.internal.methods.p0;
import com.yandex.passport.internal.methods.p1;
import com.yandex.passport.internal.methods.p2;
import com.yandex.passport.internal.methods.performer.u0;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.passport.internal.methods.performer.w0;
import com.yandex.passport.internal.methods.q0;
import com.yandex.passport.internal.methods.q1;
import com.yandex.passport.internal.methods.q2;
import com.yandex.passport.internal.methods.r1;
import com.yandex.passport.internal.methods.r2;
import com.yandex.passport.internal.methods.s0;
import com.yandex.passport.internal.methods.s1;
import com.yandex.passport.internal.methods.s2;
import com.yandex.passport.internal.methods.t0;
import com.yandex.passport.internal.methods.t1;
import com.yandex.passport.internal.methods.t2;
import com.yandex.passport.internal.methods.u1;
import com.yandex.passport.internal.methods.u2;
import com.yandex.passport.internal.methods.v;
import com.yandex.passport.internal.methods.v1;
import com.yandex.passport.internal.methods.v2;
import com.yandex.passport.internal.methods.w;
import com.yandex.passport.internal.methods.w1;
import com.yandex.passport.internal.methods.w2;
import com.yandex.passport.internal.methods.x;
import com.yandex.passport.internal.methods.x0;
import com.yandex.passport.internal.methods.x1;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.methods.y;
import com.yandex.passport.internal.methods.y0;
import com.yandex.passport.internal.methods.y1;
import com.yandex.passport.internal.methods.z;
import com.yandex.passport.internal.methods.z0;
import com.yandex.passport.internal.methods.z1;
import com.yandex.passport.internal.properties.TurboAppAuthProperties;
import com.yandex.passport.internal.provider.b;
import com.yandex.passport.internal.rotation.g;
import com.yandex.passport.internal.stash.StashCell;
import defpackage.gw00;
import defpackage.tcc;
import defpackage.zy11;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.r0;
import org.json.JSONException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes.dex */
public final /* synthetic */ class z8u0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z8u0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object value;
        ListBuilder j;
        w0 w0Var;
        u uVar;
        int i = this.a;
        final int i2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((tls) obj2).invoke((WorkDatabase) obj);
            case 1:
                return new avx0((rxr0) ((h) obj2).a.get(), (i2s0) obj);
            case 2:
                List<TaxiOrder> list = (List) obj;
                r0 r0Var = ((e0) obj2).f;
                do {
                    value = r0Var.getValue();
                    ListBuilder a = rcc.a();
                    for (TaxiOrder taxiOrder : list) {
                        taxiOrder.I();
                        a.add(new o2y0(taxiOrder));
                    }
                    j = a.j();
                } while (!r0Var.k(value, j));
                return (o2y0) a.R(j);
            case 3:
                FragmentManager supportFragmentManager = ((ly01) obj2).c.getSupportFragmentManager();
                androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
                h.f(fjh0.fragment_host, (Fragment) obj, null, 1);
                h.n();
                return zy11.a;
            case 4:
                v0 v0Var = (v0) obj2;
                x2 x2Var = (x2) obj;
                v0Var.b.b(x2Var);
                b bVar = v0Var.a;
                final int i3 = 10;
                if (x2Var instanceof m0) {
                    w0Var = u0.a;
                } else if (x2Var instanceof com.yandex.passport.internal.methods.u0) {
                    w0Var = v0Var.z;
                } else if (x2Var instanceof q0) {
                    w0Var = v0Var.A;
                } else if (x2Var instanceof p0) {
                    w0Var = v0Var.B;
                } else if (x2Var instanceof o0) {
                    w0Var = v0Var.D;
                } else if (x2Var instanceof t1) {
                    w0Var = v0Var.n;
                } else if (x2Var.equals(d1.b)) {
                    w0Var = v0Var.C;
                } else if (x2Var instanceof m2) {
                    w0Var = v0Var.m;
                } else if (x2Var instanceof p1) {
                    w0Var = v0Var.G;
                } else {
                    if (x2Var instanceof k0) {
                        final int i4 = 7;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i5 = i4;
                                zy11 zy11Var = zy11.a;
                                switch (i5) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof l0) {
                        w0Var = v0Var.j;
                    } else if (x2Var instanceof z) {
                        w0Var = v0Var.w;
                    } else if (x2Var instanceof a0) {
                        w0Var = v0Var.v;
                    } else if (x2Var instanceof x0) {
                        w0Var = v0Var.d0;
                    } else if (x2Var instanceof b1) {
                        w0Var = v0Var.r;
                    } else if (x2Var instanceof c1) {
                        w0Var = v0Var.d;
                    } else if (x2Var instanceof a1) {
                        w0Var = v0Var.I;
                    } else if (x2Var instanceof y1) {
                        w0Var = v0Var.f;
                    } else if (x2Var instanceof o2) {
                        final int i5 = 14;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i5;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof p2) {
                        final int i6 = 15;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i6;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof r2) {
                        w0Var = v0Var.J;
                    } else if (x2Var instanceof v1) {
                        final int i7 = 0;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i7;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof g2) {
                        w0Var = v0Var.k;
                    } else if (x2Var instanceof h2) {
                        w0Var = v0Var.g0;
                    } else if (x2Var instanceof k2) {
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i2;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof x) {
                        w0Var = v0Var.H;
                    } else if (x2Var instanceof h0) {
                        w0Var = v0Var.i;
                    } else if (x2Var instanceof j0) {
                        final int i8 = 2;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i8;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof i2) {
                        final int i9 = 3;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i9;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof com.yandex.passport.internal.methods.e0) {
                        w0Var = v0Var.p;
                    } else if (x2Var.equals(e1.b)) {
                        final int i10 = 4;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i10;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof k1) {
                        w0Var = v0Var.l;
                    } else if (x2Var.equals(w1.b)) {
                        final int i11 = 5;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i11;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof b2) {
                        w0Var = v0Var.V;
                    } else if (x2Var instanceof c2) {
                        w0Var = v0Var.U;
                    } else if (x2Var instanceof n0) {
                        w0Var = v0Var.h;
                    } else if (x2Var instanceof l2) {
                        final int i12 = 6;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i12;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof t2) {
                        w0Var = v0Var.x;
                    } else if (x2Var instanceof u2) {
                        final int i13 = 8;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i13;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof w) {
                        w0Var = v0Var.F;
                    } else if (x2Var instanceof b0) {
                        w0Var = v0Var.u;
                    } else if (x2Var instanceof f1) {
                        w0Var = v0Var.t;
                    } else if (x2Var instanceof e2) {
                        w0Var = v0Var.g;
                    } else if (x2Var instanceof v) {
                        final int i14 = 9;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i14;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof d0) {
                        w0Var = v0Var.s;
                    } else if (x2Var instanceof com.yandex.passport.internal.methods.r0) {
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i3;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof com.yandex.passport.internal.methods.v0) {
                        final int i15 = 11;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i15;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof s1) {
                        final int i16 = 12;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i16;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof d2) {
                        final int i17 = 13;
                        uVar = new u(bVar, new wls() { // from class: com.yandex.passport.internal.methods.performer.t0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                int i52 = i17;
                                zy11 zy11Var = zy11.a;
                                switch (i52) {
                                    case 0:
                                        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) ((v1) ((x2) obj4)).b.c);
                                        com.yandex.passport.internal.storage.i iVar = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar.getClass();
                                        return Boolean.valueOf(new com.yandex.passport.internal.storage.b(iVar, B).a());
                                    case 1:
                                        k2 k2Var = (k2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl = (PassportUidImpl) k2Var.b.c;
                                        boolean booleanValue = ((Boolean) k2Var.c.c).booleanValue();
                                        Uid B2 = com.yandex.passport.internal.util.p.B(passportUidImpl);
                                        com.yandex.passport.internal.storage.i iVar2 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar2.getClass();
                                        new com.yandex.passport.internal.storage.b(iVar2, B2).c(booleanValue);
                                        return zy11Var;
                                    case 2:
                                        com.yandex.passport.internal.provider.b bVar2 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e = bVar2.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.j0) ((x2) obj4)).b.c));
                                        if (e != null) {
                                            com.yandex.passport.internal.core.accounts.g gVar = bVar2.c;
                                            gVar.e(AccountRow.copy$default(gVar.l.a(e), null, null, null, null, null, null, null, null, null, NetworkRequestException.REGIONAL_RESTRICTION, null));
                                            com.yandex.passport.internal.core.accounts.j jVar = gVar.a;
                                            Account account = e.getAccount();
                                            jVar.e();
                                            AccountManager accountManager = jVar.a;
                                            accountManager.setUserData(account, "uid", null);
                                            accountManager.setUserData(account, "user_info_body", null);
                                            accountManager.setUserData(account, "user_info_meta", null);
                                            accountManager.setUserData(account, "stash", null);
                                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "downgradeAccount: account=" + account, 8);
                                            }
                                            com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.g);
                                        }
                                        return zy11Var;
                                    case 3:
                                        com.yandex.passport.internal.provider.b bVar3 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e2 = bVar3.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((i2) ((x2) obj4)).b.c));
                                        if (e2 != null) {
                                            LegacyExtraData assembleLegacyExtraData = e2.assembleLegacyExtraData();
                                            com.yandex.passport.internal.core.accounts.g gVar2 = bVar3.c;
                                            String serialize = assembleLegacyExtraData.with(null).serialize();
                                            gVar2.e(AccountRow.copy$default(gVar2.l.a(e2), null, null, null, null, null, null, null, null, serialize, 255, null));
                                            gVar2.a.o(e2.getAccount(), serialize);
                                            com.yandex.passport.internal.core.announcing.c.c(gVar2.b, com.yandex.passport.internal.analytics.i.h);
                                        }
                                        return zy11Var;
                                    case 4:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).f.a();
                                        } catch (JSONException e3) {
                                            com.yandex.passport.legacy.a.c("getDebugJSon()", e3);
                                            throw new PassportRuntimeUnknownException(e3);
                                        }
                                    case 5:
                                        com.yandex.passport.internal.storage.i iVar3 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        return (Boolean) iVar3.h.getValue(iVar3, com.yandex.passport.internal.storage.i.m[6]);
                                    case 6:
                                        Boolean bool = (Boolean) ((l2) ((x2) obj4)).b.c;
                                        bool.booleanValue();
                                        com.yandex.passport.internal.storage.i iVar4 = ((com.yandex.passport.internal.provider.b) obj3).a;
                                        iVar4.h.setValue(iVar4, com.yandex.passport.internal.storage.i.m[6], bool);
                                        return zy11Var;
                                    case 7:
                                        com.yandex.passport.internal.provider.b bVar4 = (com.yandex.passport.internal.provider.b) obj3;
                                        ModernAccount e4 = bVar4.b.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.k0) ((x2) obj4)).b.c));
                                        if (e4 != null) {
                                            bVar4.e.a(e4);
                                        }
                                        return zy11Var;
                                    case 8:
                                        com.yandex.passport.internal.provider.b bVar5 = (com.yandex.passport.internal.provider.b) obj3;
                                        u2 u2Var = (u2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl2 = (PassportUidImpl) u2Var.b.c;
                                        try {
                                            bVar5.g.b(com.yandex.passport.internal.util.p.B(passportUidImpl2), (PersonProfile) u2Var.c.c);
                                            return zy11Var;
                                        } catch (InvalidTokenException unused) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e5) {
                                            throw new PassportFailedResponseException(e5.getMessage());
                                        } catch (IOException | JSONException e6) {
                                            throw new PassportIOException(e6);
                                        }
                                    case 9:
                                        com.yandex.passport.internal.provider.b bVar6 = (com.yandex.passport.internal.provider.b) obj3;
                                        com.yandex.passport.internal.methods.v vVar = (com.yandex.passport.internal.methods.v) ((x2) obj4);
                                        PassportUidImpl passportUidImpl3 = (PassportUidImpl) vVar.b.c;
                                        try {
                                            return Boolean.valueOf(bVar6.h.a(com.yandex.passport.internal.util.p.B(passportUidImpl3), (Uri) vVar.c.c));
                                        } catch (InvalidTokenException unused2) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e7) {
                                            throw new PassportFailedResponseException(e7.getMessage());
                                        } catch (IOException | JSONException e8) {
                                            throw new PassportIOException(e8);
                                        }
                                    case 10:
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).g.a(com.yandex.passport.internal.util.p.B((PassportUidImpl) ((com.yandex.passport.internal.methods.r0) ((x2) obj4)).b.c));
                                        } catch (PassportAccountNotFoundException e9) {
                                            throw e9;
                                        } catch (InvalidTokenException | IOException | JSONException e10) {
                                            throw new PassportIOException(e10);
                                        } catch (FailedResponseException e11) {
                                            throw new PassportFailedResponseException(e11.getMessage());
                                        } catch (Exception e12) {
                                            throw new PassportRuntimeUnknownException(e12);
                                        }
                                    case 11:
                                        com.yandex.passport.internal.provider.b bVar7 = (com.yandex.passport.internal.provider.b) obj3;
                                        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) ((com.yandex.passport.internal.methods.v0) ((x2) obj4)).b.c;
                                        try {
                                            Uid B3 = com.yandex.passport.internal.util.p.B(turboAppAuthProperties.getUid());
                                            ModernAccount e13 = bVar7.b.a().e(B3);
                                            if (e13 != null) {
                                                return bVar7.d.a(B3.getEnvironment()).g(e13.getMasterToken(), turboAppAuthProperties.getClientId(), turboAppAuthProperties.getTurboAppRedirectUri());
                                            }
                                            throw new PassportAccountNotFoundException(B3);
                                        } catch (InvalidTokenException unused3) {
                                            throw new PassportAccountNotAuthorizedException();
                                        } catch (FailedResponseException e14) {
                                            throw new PassportFailedResponseException(e14.getMessage());
                                        } catch (IOException | JSONException e15) {
                                            throw new PassportIOException(e15);
                                        }
                                    case 12:
                                        s1 s1Var = (s1) ((x2) obj4);
                                        try {
                                            return ((com.yandex.passport.internal.provider.b) obj3).d.a(com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) s1Var.b.c)).i((String) s1Var.c.c);
                                        } catch (InvalidTokenException unused4) {
                                            throw new PassportInvalidTokenException();
                                        } catch (FailedResponseException e16) {
                                            throw new PassportFailedResponseException(e16.getMessage());
                                        } catch (IOException | JSONException e17) {
                                            throw new PassportIOException(e17);
                                        }
                                    case 13:
                                        com.yandex.passport.internal.provider.b bVar8 = (com.yandex.passport.internal.provider.b) obj3;
                                        ArrayList<com.yandex.passport.internal.methods.e> arrayList = ((d2) ((x2) obj4)).b;
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                        for (com.yandex.passport.internal.methods.e eVar : arrayList) {
                                            Pair pair = new Pair(eVar.a, eVar.a());
                                            linkedHashMap.put(pair.c(), pair.f());
                                        }
                                        com.yandex.passport.internal.flags.experiments.k kVar = bVar8.i;
                                        kVar.getClass();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            SharedPreferences sharedPreferences = kVar.a;
                                            if (str2 == null) {
                                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                                edit.remove(str);
                                                edit.apply();
                                            } else {
                                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                                edit2.putString(str, str2);
                                                edit2.apply();
                                            }
                                        }
                                        return zy11Var;
                                    case 14:
                                        com.yandex.passport.internal.provider.b bVar9 = (com.yandex.passport.internal.provider.b) obj3;
                                        o2 o2Var = (o2) ((x2) obj4);
                                        PassportUidImpl passportUidImpl4 = (PassportUidImpl) o2Var.b.c;
                                        String value2 = o2Var.c.c().getValue();
                                        String str3 = (String) o2Var.d.c;
                                        com.yandex.passport.legacy.a.a("stashValue: uid=" + passportUidImpl4 + " cell=" + value2 + " value='" + str3 + "'");
                                        ModernAccount e18 = bVar9.b.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl4));
                                        if (e18 == null) {
                                            throw new PassportAccountNotFoundException(passportUidImpl4);
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a2 = com.yandex.passport.internal.stash.b.a(value2);
                                        if (a2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(e18);
                                            bVar9.c.h(arrayList2, a2, str3);
                                        }
                                        return zy11Var;
                                    default:
                                        com.yandex.passport.internal.provider.b bVar10 = (com.yandex.passport.internal.provider.b) obj3;
                                        p2 p2Var = (p2) ((x2) obj4);
                                        List list2 = (List) p2Var.b.c;
                                        String value3 = p2Var.c.c().getValue();
                                        String str4 = (String) p2Var.d.c;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Uid B4 = com.yandex.passport.internal.util.p.B((PassportUidImpl) it.next());
                                            ModernAccount e19 = bVar10.b.a().e(B4);
                                            if (e19 == null) {
                                                com.yandex.passport.legacy.a.b("Account with uid " + B4 + " not found");
                                            } else {
                                                arrayList3.add(e19);
                                            }
                                        }
                                        StashCell.Companion.getClass();
                                        StashCell a3 = com.yandex.passport.internal.stash.b.a(value3);
                                        if (a3 != null) {
                                            bVar10.c.h(arrayList3, a3, str4);
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                    } else if (x2Var instanceof j2) {
                        w0Var = v0Var.q;
                    } else if (x2Var instanceof t0) {
                        w0Var = v0Var.c;
                    } else if (x2Var instanceof z1) {
                        w0Var = v0Var.e;
                    } else if (x2Var instanceof c0) {
                        w0Var = v0Var.o;
                    } else if (x2Var.equals(w2.b)) {
                        w0Var = v0Var.y;
                    } else if (x2Var instanceof x1) {
                        w0Var = v0Var.E;
                    } else if (x2Var instanceof r1) {
                        w0Var = v0Var.K;
                    } else if (x2Var instanceof m1) {
                        w0Var = v0Var.L;
                    } else if (x2Var instanceof y) {
                        w0Var = v0Var.M;
                    } else if (x2Var instanceof q1) {
                        w0Var = v0Var.N;
                    } else if (x2Var instanceof s2) {
                        w0Var = v0Var.O;
                    } else if (x2Var instanceof com.yandex.passport.internal.methods.w0) {
                        w0Var = v0Var.P;
                    } else if (x2Var instanceof h1) {
                        w0Var = v0Var.Q;
                    } else if (x2Var instanceof i1) {
                        w0Var = v0Var.R;
                    } else if (x2Var instanceof g1) {
                        w0Var = v0Var.S;
                    } else if (x2Var instanceof v2) {
                        w0Var = v0Var.T;
                    } else if (x2Var instanceof l1) {
                        w0Var = v0Var.W;
                    } else if (x2Var.equals(o1.b)) {
                        w0Var = v0Var.X;
                    } else if (x2Var.equals(n1.b)) {
                        w0Var = v0Var.Y;
                    } else if (x2Var instanceof i0) {
                        w0Var = v0Var.Z;
                    } else if (x2Var instanceof q2) {
                        w0Var = v0Var.a0;
                    } else if (x2Var instanceof y0) {
                        w0Var = v0Var.b0;
                    } else if (x2Var instanceof f2) {
                        w0Var = v0Var.c0;
                    } else if (x2Var instanceof u1) {
                        w0Var = v0Var.e0;
                    } else if (x2Var instanceof j1) {
                        w0Var = v0Var.f0;
                    } else if (x2Var instanceof z0) {
                        w0Var = v0Var.h0;
                    } else if (x2Var instanceof a2) {
                        w0Var = v0Var.i0;
                    } else if (x2Var instanceof n2) {
                        w0Var = v0Var.j0;
                    } else {
                        if (!(x2Var instanceof s0)) {
                            w511.b();
                            return null;
                        }
                        w0Var = v0Var.k0;
                    }
                    w0Var = uVar;
                }
                if (w0Var == null) {
                    w0Var = null;
                }
                if (w0Var == null) {
                    ny61.r("Internal error: performer type mismatch");
                    return null;
                }
                Result result = new Result(w0Var.a(x2Var));
                LogLevel logLevel = LogLevel.DEBUG;
                c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(logLevel, null, "performMethod resulted in " + ((Object) Result.c(result.getValue())), 10);
                }
                return result;
            default:
                try {
                    return EncryptedSharedPreferences.create("quarantine_master_token_shared_pref", (String) ((g) obj2).b.getValue(), (Context) obj, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
