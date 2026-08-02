package ru.yandex.taxi.scooters.domain;

import android.net.Uri;
import defpackage.avj0;
import defpackage.b0i0;
import defpackage.cvu0;
import defpackage.dab1;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.j8p0;
import defpackage.jl40;
import defpackage.k8p0;
import defpackage.l6p0;
import defpackage.msb1;
import defpackage.ny61;
import defpackage.odn0;
import defpackage.pdn0;
import defpackage.pux0;
import defpackage.pw2;
import defpackage.r4b1;
import defpackage.r7p0;
import defpackage.tcc;
import defpackage.ums;
import defpackage.xpb1;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class q {
    public final String A;
    public final String B;
    public final pw2 a;
    public final k8p0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public q(zuj0 zuj0Var, pw2 pw2Var, k8p0 k8p0Var) {
        this.a = pw2Var;
        this.b = k8p0Var;
        avj0 avj0Var = (avj0) zuj0Var;
        this.c = avj0Var.h(b0i0.go_uri_scheme);
        this.d = avj0Var.h(b0i0.go_uri_host);
        this.e = avj0Var.h(b0i0.scooter_go_uri_path);
        this.f = avj0Var.h(b0i0.scooter_go_uri_number_query_param);
        this.g = avj0Var.h(b0i0.yango_uri_scheme);
        this.h = avj0Var.h(b0i0.yango_uri_host);
        this.i = avj0Var.h(b0i0.scooter_yango_uri_path);
        this.j = avj0Var.h(b0i0.scooter_yango_uri_number_query_param);
        this.k = avj0Var.h(b0i0.scooter_jet_uri_scheme);
        this.l = avj0Var.h(b0i0.scooter_jet_uri_host_1);
        this.m = avj0Var.h(b0i0.scooter_jet_uri_host_2);
        this.n = avj0Var.h(b0i0.scooter_jet_uri_path_segment);
        this.o = avj0Var.h(b0i0.scooter_jet_uri_number_prefix);
        this.p = avj0Var.h(b0i0.scooter_jet_uri_scheme_old);
        this.q = avj0Var.h(b0i0.scooter_jet_uri_host_old);
        this.r = avj0Var.h(b0i0.scooter_jet_uri_path_old);
        this.s = avj0Var.h(b0i0.scooter_jet_uri_number_query_param_old);
        this.t = avj0Var.h(b0i0.scooter_jet_abroad_uri_scheme);
        this.u = avj0Var.h(b0i0.scooter_jet_abroad_uri_host);
        this.v = avj0Var.h(b0i0.scooter_jet_abroad_uri_path_segment);
        this.w = avj0Var.h(b0i0.scooter_jet_abroad_uri_number_prefix);
        this.x = avj0Var.h(b0i0.scooter_vb_uri_scheme);
        this.y = avj0Var.h(b0i0.scooter_vb_uri_host);
        this.z = avj0Var.h(b0i0.scooter_vb_uri_path);
        this.A = avj0Var.h(b0i0.scooter_vb_uri_number_prefix);
        this.B = avj0Var.h(b0i0.scooter_vb_uri_number_suffix);
    }

    public static r7p0 b(odn0 odn0Var) {
        String a = odn0Var.a();
        String str = null;
        if (a != null) {
            String upperCase = a.toUpperCase(Locale.US);
            if (upperCase.length() == 0) {
                upperCase = null;
            }
            if (upperCase != null) {
                String b = odn0Var.b();
                if (b != null && b.length() != 0) {
                    str = b;
                }
                return new r7p0(upperCase, str);
            }
        }
        return null;
    }

    public final Uri a(String str) {
        Uri.Builder builder = new Uri.Builder();
        ((pux0) this.a).getClass();
        Uri.Builder appendPath = builder.scheme(pux0.c).authority("scooters").appendPath("order");
        if (str != null) {
            appendPath.appendQueryParameter("id", str);
        }
        return appendPath.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Uri uri, ContinuationImpl continuationImpl) {
        ScootersUriInteractor$extractVehicleNumber$1 scootersUriInteractor$extractVehicleNumber$1;
        int i;
        odn0 odn0Var;
        if (continuationImpl instanceof ScootersUriInteractor$extractVehicleNumber$1) {
            scootersUriInteractor$extractVehicleNumber$1 = (ScootersUriInteractor$extractVehicleNumber$1) continuationImpl;
            int i2 = scootersUriInteractor$extractVehicleNumber$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUriInteractor$extractVehicleNumber$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUriInteractor$extractVehicleNumber$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUriInteractor$extractVehicleNumber$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersUriInteractor$extractVehicleNumber$1.L$0 = null;
                    scootersUriInteractor$extractVehicleNumber$1.label = 1;
                    obj = p(uri, scootersUriInteractor$extractVehicleNumber$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                odn0Var = (odn0) obj;
                if (odn0Var == null) {
                    return b(odn0Var);
                }
                return null;
            }
        }
        scootersUriInteractor$extractVehicleNumber$1 = new ScootersUriInteractor$extractVehicleNumber$1(this, continuationImpl);
        Object obj3 = scootersUriInteractor$extractVehicleNumber$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUriInteractor$extractVehicleNumber$1.label;
        if (i != 0) {
        }
        odn0Var = (odn0) obj3;
        if (odn0Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r7.length() == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r7.length() == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        if (r7.length() == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        if (r5.length() == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e9, code lost:
    
        if (r7.length() == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008e, code lost:
    
        if (r7.length() == 0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Uri uri, ContinuationImpl continuationImpl) {
        ScootersUriInteractor$extractVehicleNumberFromAppLink$1 scootersUriInteractor$extractVehicleNumberFromAppLink$1;
        int i;
        r7p0 r7p0Var;
        String str;
        String str2;
        r7p0 r7p0Var2;
        String queryParameter;
        String queryParameter2;
        String upperCase;
        String str3;
        String str4;
        List<String> pathSegments;
        String str5;
        List<String> pathSegments2;
        String str6;
        String str7;
        String queryParameter3;
        if (continuationImpl instanceof ScootersUriInteractor$extractVehicleNumberFromAppLink$1) {
            scootersUriInteractor$extractVehicleNumberFromAppLink$1 = (ScootersUriInteractor$extractVehicleNumberFromAppLink$1) continuationImpl;
            int i2 = scootersUriInteractor$extractVehicleNumberFromAppLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUriInteractor$extractVehicleNumberFromAppLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUriInteractor$extractVehicleNumberFromAppLink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUriInteractor$extractVehicleNumberFromAppLink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersUriInteractor$extractVehicleNumberFromAppLink$1.L$0 = uri;
                    scootersUriInteractor$extractVehicleNumberFromAppLink$1.label = 1;
                    obj = e(uri, scootersUriInteractor$extractVehicleNumberFromAppLink$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) scootersUriInteractor$extractVehicleNumberFromAppLink$1.L$0;
                    kotlin.b.b(obj);
                }
                r7p0Var = (r7p0) obj;
                if (r7p0Var == null) {
                    return r7p0Var;
                }
                if (i(uri) && (queryParameter3 = uri.getQueryParameter(this.f)) != null) {
                    str = queryParameter3.toUpperCase(Locale.US);
                }
                str = null;
                if (str != null) {
                    String queryParameter4 = uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR);
                    if (queryParameter4 == null || queryParameter4.length() == 0) {
                        queryParameter4 = null;
                    }
                    r7p0Var2 = new r7p0(str, queryParameter4);
                } else {
                    if (o(uri) && (queryParameter = uri.getQueryParameter(this.j)) != null) {
                        str2 = queryParameter.toUpperCase(Locale.US);
                    }
                    str2 = null;
                    if (str2 != null) {
                        String queryParameter5 = uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR);
                        if (queryParameter5 == null || queryParameter5.length() == 0) {
                            queryParameter5 = null;
                        }
                        r7p0Var2 = new r7p0(str2, queryParameter5);
                    } else {
                        r7p0Var2 = null;
                    }
                }
                if (r7p0Var2 != null) {
                    return r7p0Var2;
                }
                if (k(uri)) {
                    List<String> pathSegments3 = uri.getPathSegments();
                    if (pathSegments3 != null && (str7 = (String) kotlin.collections.a.b0(pathSegments3)) != null) {
                        upperCase = evu0.Q(this.o, str7).toUpperCase(Locale.US);
                    }
                    upperCase = null;
                } else {
                    if (l(uri) && (queryParameter2 = uri.getQueryParameter(this.s)) != null) {
                        upperCase = queryParameter2.toUpperCase(Locale.US);
                    }
                    upperCase = null;
                }
                if (upperCase != null) {
                    return new r7p0(dab1.P, upperCase);
                }
                if (j(uri) && (pathSegments2 = uri.getPathSegments()) != null && (str6 = (String) kotlin.collections.a.b0(pathSegments2)) != null) {
                    str3 = evu0.Q(this.w, str6).toUpperCase(Locale.US);
                }
                str3 = null;
                if (str3 != null) {
                    return new r7p0(xpb1.Q, str3);
                }
                if (n(uri) && (pathSegments = uri.getPathSegments()) != null && (str5 = (String) kotlin.collections.a.b0(pathSegments)) != null) {
                    str4 = evu0.S(this.B, evu0.Q(this.A, str5)).toUpperCase(Locale.US);
                }
                str4 = null;
                if (str4 != null) {
                    return new r7p0(msb1.S, str4);
                }
                return null;
            }
        }
        scootersUriInteractor$extractVehicleNumberFromAppLink$1 = new ScootersUriInteractor$extractVehicleNumberFromAppLink$1(this, continuationImpl);
        Object obj3 = scootersUriInteractor$extractVehicleNumberFromAppLink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUriInteractor$extractVehicleNumberFromAppLink$1.label;
        if (i != 0) {
        }
        r7p0Var = (r7p0) obj3;
        if (r7p0Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cd, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d0 A[EDGE_INSN: B:111:0x02d0->B:105:0x02d0 BREAK  A[LOOP:5: B:74:0x017d->B:103:0x017d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0 A[EDGE_INSN: B:26:0x00a0->B:27:0x00a0 BREAK  A[LOOP:0: B:18:0x0085->B:24:0x009c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a1  */
    /* JADX WARN: Type inference failed for: r4v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Uri uri, ContinuationImpl continuationImpl) {
        ScootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1 scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1;
        int i;
        Uri uri2;
        List<j8p0.a> list;
        String host;
        String scheme;
        LinkedHashMap linkedHashMap;
        int d;
        Iterator it;
        String str;
        ?? r4;
        r7p0 r7p0Var;
        String b;
        Map.Entry entry;
        Map.Entry entry2;
        String b2;
        String b3;
        if (continuationImpl instanceof ScootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1) {
            scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1 = (ScootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1) continuationImpl;
            int i2 = scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.L$0 = uri;
                    scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.label = 1;
                    Object b4 = this.b.a.b(scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1);
                    if (b4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b4;
                    uri2 = uri;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri2 = (Uri) scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.L$0;
                    kotlin.b.b(obj);
                }
                list = ((j8p0) obj).d;
                host = uri2.getHost();
                if (host != null && (scheme = uri2.getScheme()) != null) {
                    List<String> pathSegments = uri2.getPathSegments();
                    Set<String> queryParameterNames = uri2.getQueryParameterNames();
                    int i3 = 10;
                    d = gw00.d(tcc.n(queryParameterNames, 10));
                    int i4 = 16;
                    if (d < 16) {
                        d = 16;
                    }
                    linkedHashMap = new LinkedHashMap(d);
                    it = queryParameterNames.iterator();
                    while (true) {
                        str = "";
                        if (it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        String queryParameter = uri2.getQueryParameter((String) next);
                        if (queryParameter != null) {
                            str = queryParameter;
                        }
                        linkedHashMap.put(next, str);
                    }
                    l6p0 l6p0Var = new l6p0(scheme, host, pathSegments, linkedHashMap, uri2.getFragment());
                    for (j8p0.a aVar : list) {
                        List list2 = aVar.c;
                        if (list2 != null) {
                            List list3 = list2;
                            ArrayList arrayList = new ArrayList(tcc.n(list3, i3));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                Uri parse = Uri.parse((String) it2.next());
                                String scheme2 = parse.getScheme();
                                String host2 = parse.getHost();
                                List<String> pathSegments2 = parse.getPathSegments();
                                Set<String> queryParameterNames2 = parse.getQueryParameterNames();
                                int d2 = gw00.d(tcc.n(queryParameterNames2, i3));
                                if (d2 < i4) {
                                    d2 = i4;
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2);
                                for (Object obj2 : queryParameterNames2) {
                                    String queryParameter2 = parse.getQueryParameter((String) obj2);
                                    if (queryParameter2 == null) {
                                        queryParameter2 = "";
                                    }
                                    linkedHashMap2.put(obj2, queryParameter2);
                                }
                                arrayList.add(new l6p0(scheme2, host2, pathSegments2, linkedHashMap2, parse.getFragment()));
                            }
                            r4 = new ArrayList();
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                l6p0 l6p0Var2 = (l6p0) next2;
                                if (jl40.l(l6p0Var2.e(), l6p0Var.e()) && jl40.l(l6p0Var2.b(), l6p0Var.b())) {
                                    r4.add(next2);
                                }
                            }
                        } else {
                            r4 = 0;
                        }
                        String queryParameter3 = uri2.getQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR);
                        if (queryParameter3 == null || queryParameter3.length() == 0) {
                            queryParameter3 = null;
                        }
                        if (queryParameter3 == null) {
                            queryParameter3 = aVar.a;
                        }
                        if (r4 == 0) {
                            r4 = EmptyList.a;
                        }
                        Iterator it4 = r4.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                r7p0Var = null;
                                break;
                            }
                            l6p0 l6p0Var3 = (l6p0) it4.next();
                            if (l6p0Var3.c().size() == l6p0Var.c().size()) {
                                List c = l6p0Var3.c();
                                int size = l6p0Var.c().size();
                                Integer num = null;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size) {
                                        if (!jl40.l(l6p0Var.c().get(i5), c.get(i5)) && !evu0.y((CharSequence) c.get(i5), "$NUMBER$", false)) {
                                            break;
                                        }
                                        if (num == null && evu0.y((CharSequence) c.get(i5), "$NUMBER$", false)) {
                                            num = Integer.valueOf(i5);
                                        }
                                        i5++;
                                    } else if (num != null && (b = ums.b((String) l6p0Var.c().get(num.intValue()), (String) c.get(num.intValue()))) != null) {
                                        r7p0Var = new r7p0(b.toUpperCase(Locale.US), queryParameter3);
                                    }
                                }
                                if (r7p0Var != null) {
                                    break;
                                }
                                Map d3 = l6p0Var3.d();
                                if (!d3.isEmpty()) {
                                    Iterator it5 = ((LinkedHashMap) d3).entrySet().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            entry = null;
                                            break;
                                        }
                                        entry = (Map.Entry) it5.next();
                                        if (!evu0.y((CharSequence) entry.getValue(), "$NUMBER$", false)) {
                                            entry = null;
                                        }
                                        if (entry != null) {
                                            break;
                                        }
                                    }
                                    if (entry != null) {
                                        Iterator it6 = ((LinkedHashMap) l6p0Var.d()).entrySet().iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                entry2 = null;
                                                break;
                                            }
                                            entry2 = (Map.Entry) it6.next();
                                            if (!jl40.l(entry.getKey(), entry2.getKey())) {
                                                entry2 = null;
                                            }
                                            if (entry2 != null) {
                                                break;
                                            }
                                        }
                                        if (entry2 != null && (b2 = ums.b((String) entry2.getValue(), (String) entry.getValue())) != null) {
                                            r7p0Var = new r7p0(b2.toUpperCase(Locale.US), queryParameter3);
                                            if (r7p0Var != null) {
                                                break;
                                            }
                                            String a = l6p0Var3.a();
                                            r7p0Var = (a == null || l6p0Var.a() == null || (b3 = ums.b(l6p0Var.a(), a)) == null) ? null : new r7p0(b3.toUpperCase(Locale.US), queryParameter3);
                                            if (r7p0Var != null) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                r7p0Var = null;
                                if (r7p0Var != null) {
                                }
                            }
                        }
                        if (r7p0Var != null) {
                            return r7p0Var;
                        }
                        i3 = 10;
                        i4 = 16;
                    }
                }
                return null;
            }
        }
        scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1 = new ScootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1(this, continuationImpl);
        Object obj3 = scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUriInteractor$extractVehicleNumberFromAppLinkByExperiment$1.label;
        if (i != 0) {
        }
        list = ((j8p0) obj3).d;
        host = uri2.getHost();
        if (host != null) {
            List<String> pathSegments3 = uri2.getPathSegments();
            Set<String> queryParameterNames3 = uri2.getQueryParameterNames();
            int i32 = 10;
            d = gw00.d(tcc.n(queryParameterNames3, 10));
            int i42 = 16;
            if (d < 16) {
            }
            linkedHashMap = new LinkedHashMap(d);
            it = queryParameterNames3.iterator();
            while (true) {
                str = "";
                if (it.hasNext()) {
                }
                linkedHashMap.put(next, str);
            }
            l6p0 l6p0Var4 = new l6p0(scheme, host, pathSegments3, linkedHashMap, uri2.getFragment());
            while (r1.hasNext()) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Uri uri, ContinuationImpl continuationImpl) {
        ScootersUriInteractor$isAppLinkValid$1 scootersUriInteractor$isAppLinkValid$1;
        int i;
        if (continuationImpl instanceof ScootersUriInteractor$isAppLinkValid$1) {
            scootersUriInteractor$isAppLinkValid$1 = (ScootersUriInteractor$isAppLinkValid$1) continuationImpl;
            int i2 = scootersUriInteractor$isAppLinkValid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUriInteractor$isAppLinkValid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUriInteractor$isAppLinkValid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUriInteractor$isAppLinkValid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersUriInteractor$isAppLinkValid$1.L$0 = uri;
                    scootersUriInteractor$isAppLinkValid$1.label = 1;
                    obj = g(uri, scootersUriInteractor$isAppLinkValid$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) scootersUriInteractor$isAppLinkValid$1.L$0;
                    kotlin.b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : h(uri));
            }
        }
        scootersUriInteractor$isAppLinkValid$1 = new ScootersUriInteractor$isAppLinkValid$1(this, continuationImpl);
        Object obj3 = scootersUriInteractor$isAppLinkValid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUriInteractor$isAppLinkValid$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj3;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : h(uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Uri uri, ContinuationImpl continuationImpl) {
        ScootersUriInteractor$isAppLinkValidByExperiment$1 scootersUriInteractor$isAppLinkValidByExperiment$1;
        int i;
        Iterator it;
        ArrayList arrayList;
        if (continuationImpl instanceof ScootersUriInteractor$isAppLinkValidByExperiment$1) {
            scootersUriInteractor$isAppLinkValidByExperiment$1 = (ScootersUriInteractor$isAppLinkValidByExperiment$1) continuationImpl;
            int i2 = scootersUriInteractor$isAppLinkValidByExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUriInteractor$isAppLinkValidByExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUriInteractor$isAppLinkValidByExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUriInteractor$isAppLinkValidByExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersUriInteractor$isAppLinkValidByExperiment$1.L$0 = uri;
                    scootersUriInteractor$isAppLinkValidByExperiment$1.label = 1;
                    obj = this.b.a.b(scootersUriInteractor$isAppLinkValidByExperiment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) scootersUriInteractor$isAppLinkValidByExperiment$1.L$0;
                    kotlin.b.b(obj);
                }
                it = ((j8p0) obj).d.iterator();
                while (it.hasNext()) {
                    List list = ((j8p0.a) it.next()).c;
                    if (list != null) {
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Uri.parse((String) it2.next()));
                        }
                        arrayList = new ArrayList();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            Uri uri2 = (Uri) next;
                            if (jl40.l(uri2.getScheme(), uri.getScheme()) && jl40.l(uri2.getHost(), uri.getHost()) && jl40.l(uri2.getAuthority(), uri.getAuthority())) {
                                arrayList.add(next);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null && (!arrayList.isEmpty())) {
                        return Boolean.TRUE;
                    }
                }
                return null;
            }
        }
        scootersUriInteractor$isAppLinkValidByExperiment$1 = new ScootersUriInteractor$isAppLinkValidByExperiment$1(this, continuationImpl);
        Object obj2 = scootersUriInteractor$isAppLinkValidByExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUriInteractor$isAppLinkValidByExperiment$1.label;
        if (i != 0) {
        }
        it = ((j8p0) obj2).d.iterator();
        while (it.hasNext()) {
        }
        return null;
    }

    public final boolean h(Uri uri) {
        return i(uri) || o(uri) || k(uri) || l(uri) || j(uri) || n(uri);
    }

    public final boolean i(Uri uri) {
        return jl40.l(uri.getScheme(), this.c) && jl40.l(uri.getAuthority(), this.d) && jl40.l(uri.getPath(), this.e);
    }

    public final boolean j(Uri uri) {
        return jl40.l(uri.getScheme(), this.t) && jl40.l(uri.getAuthority(), this.u) && r4b1.b(uri, this.v);
    }

    public final boolean k(Uri uri) {
        if (jl40.l(uri.getScheme(), this.k)) {
            return (jl40.l(uri.getAuthority(), this.l) || jl40.l(uri.getAuthority(), this.m)) && r4b1.b(uri, this.n);
        }
        return false;
    }

    public final boolean l(Uri uri) {
        return jl40.l(uri.getScheme(), this.p) && jl40.l(uri.getAuthority(), this.q) && jl40.l(uri.getPath(), this.r);
    }

    public final boolean m(Uri uri) {
        ArrayList arrayList;
        Boolean bool = null;
        if ("scooters".equalsIgnoreCase(uri != null ? uri.getAuthority() : null)) {
            return true;
        }
        Iterator it = ((j8p0) this.b.c()).d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List list = ((j8p0.a) it.next()).c;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Uri.parse((String) it2.next()));
                }
                arrayList = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    Uri uri2 = (Uri) next;
                    if (jl40.l(uri2.getScheme(), uri.getScheme()) && jl40.l(uri2.getHost(), uri.getHost()) && jl40.l(uri2.getAuthority(), uri.getAuthority())) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                bool = Boolean.TRUE;
                break;
            }
        }
        return bool != null ? bool.booleanValue() : h(uri);
    }

    public final boolean n(Uri uri) {
        String path;
        return jl40.l(uri.getScheme(), this.x) && jl40.l(uri.getAuthority(), this.y) && (path = uri.getPath()) != null && cvu0.x(path, this.z, false);
    }

    public final boolean o(Uri uri) {
        return jl40.l(uri.getScheme(), this.g) && jl40.l(uri.getAuthority(), this.h) && jl40.l(uri.getPath(), this.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Uri uri, ContinuationImpl continuationImpl) {
        ScootersUriInteractor$parseScootersDeeplink$1 scootersUriInteractor$parseScootersDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersUriInteractor$parseScootersDeeplink$1) {
            scootersUriInteractor$parseScootersDeeplink$1 = (ScootersUriInteractor$parseScootersDeeplink$1) continuationImpl;
            int i2 = scootersUriInteractor$parseScootersDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUriInteractor$parseScootersDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersUriInteractor$parseScootersDeeplink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUriInteractor$parseScootersDeeplink$1.label;
                pdn0 pdn0Var = pdn0.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    odn0 d = pdn0Var.d(uri);
                    if (d != null) {
                        return d;
                    }
                    scootersUriInteractor$parseScootersDeeplink$1.L$0 = uri;
                    scootersUriInteractor$parseScootersDeeplink$1.label = 1;
                    obj = f(uri, scootersUriInteractor$parseScootersDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pdn0Var = (pdn0) scootersUriInteractor$parseScootersDeeplink$1.L$1;
                        kotlin.b.b(obj);
                        return pdn0Var.d((Uri) obj);
                    }
                    uri = (Uri) scootersUriInteractor$parseScootersDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                scootersUriInteractor$parseScootersDeeplink$1.L$0 = null;
                scootersUriInteractor$parseScootersDeeplink$1.L$1 = pdn0Var;
                scootersUriInteractor$parseScootersDeeplink$1.label = 2;
                obj = q(uri, scootersUriInteractor$parseScootersDeeplink$1);
            }
        }
        scootersUriInteractor$parseScootersDeeplink$1 = new ScootersUriInteractor$parseScootersDeeplink$1(this, continuationImpl);
        obj = scootersUriInteractor$parseScootersDeeplink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUriInteractor$parseScootersDeeplink$1.label;
        pdn0 pdn0Var2 = pdn0.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f A[LOOP:0: B:12:0x0099->B:14:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable q(Uri uri, ContinuationImpl continuationImpl) {
        ScootersUriInteractor$toCanonicalScootersUri$1 scootersUriInteractor$toCanonicalScootersUri$1;
        int i;
        List<String> list;
        r7p0 r7p0Var;
        Uri uri2;
        List<String> list2;
        Iterator<T> it;
        String queryParameter;
        if (continuationImpl instanceof ScootersUriInteractor$toCanonicalScootersUri$1) {
            scootersUriInteractor$toCanonicalScootersUri$1 = (ScootersUriInteractor$toCanonicalScootersUri$1) continuationImpl;
            int i2 = scootersUriInteractor$toCanonicalScootersUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUriInteractor$toCanonicalScootersUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUriInteractor$toCanonicalScootersUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUriInteractor$toCanonicalScootersUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<String> pathSegments = uri.getPathSegments();
                    EmptyList emptyList = EmptyList.a;
                    if (pathSegments == null) {
                        pathSegments = emptyList;
                    }
                    List<String> J = cvu0.t((String) kotlin.collections.a.R(pathSegments), "scooters", true) ? kotlin.collections.a.J(pathSegments, 1) : emptyList;
                    if (!J.isEmpty()) {
                        list = J;
                        r7p0Var = null;
                        Uri.Builder builder = new Uri.Builder();
                        ((pux0) this.a).getClass();
                        Uri.Builder authority = builder.scheme(pux0.c).authority("scooters");
                        it = list.iterator();
                        while (it.hasNext()) {
                            authority.appendPath((String) it.next());
                        }
                        for (String str : uri.getQueryParameterNames()) {
                            if (jl40.l(str, "number")) {
                                if ((r7p0Var == null || (queryParameter = r7p0Var.a()) == null) && ((queryParameter = uri.getQueryParameter(str)) == null || queryParameter.length() <= 0)) {
                                    queryParameter = null;
                                }
                                if (queryParameter != null) {
                                    authority.appendQueryParameter(str, queryParameter);
                                }
                            } else {
                                Iterator<T> it2 = uri.getQueryParameters(str).iterator();
                                while (it2.hasNext()) {
                                    authority.appendQueryParameter(str, (String) it2.next());
                                }
                            }
                        }
                        if (r7p0Var != null) {
                            if (uri.getQueryParameter("number") == null) {
                                authority.appendQueryParameter("number", r7p0Var.a());
                            }
                            if (uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR) == null) {
                                authority.appendQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR, r7p0Var.b().k());
                            }
                        }
                        return authority.build();
                    }
                    scootersUriInteractor$toCanonicalScootersUri$1.L$0 = uri;
                    scootersUriInteractor$toCanonicalScootersUri$1.L$1 = null;
                    scootersUriInteractor$toCanonicalScootersUri$1.L$2 = J;
                    scootersUriInteractor$toCanonicalScootersUri$1.label = 1;
                    Object d = d(uri, scootersUriInteractor$toCanonicalScootersUri$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    uri2 = uri;
                    list2 = J;
                    obj = d;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = (List) scootersUriInteractor$toCanonicalScootersUri$1.L$2;
                    uri2 = (Uri) scootersUriInteractor$toCanonicalScootersUri$1.L$0;
                    kotlin.b.b(obj);
                }
                r7p0Var = (r7p0) obj;
                Uri uri3 = uri2;
                list = list2;
                uri = uri3;
                Uri.Builder builder2 = new Uri.Builder();
                ((pux0) this.a).getClass();
                Uri.Builder authority2 = builder2.scheme(pux0.c).authority("scooters");
                it = list.iterator();
                while (it.hasNext()) {
                }
                while (r0.hasNext()) {
                }
                if (r7p0Var != null) {
                }
                return authority2.build();
            }
        }
        scootersUriInteractor$toCanonicalScootersUri$1 = new ScootersUriInteractor$toCanonicalScootersUri$1(this, continuationImpl);
        Object obj2 = scootersUriInteractor$toCanonicalScootersUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUriInteractor$toCanonicalScootersUri$1.label;
        if (i != 0) {
        }
        r7p0Var = (r7p0) obj2;
        Uri uri32 = uri2;
        list = list2;
        uri = uri32;
        Uri.Builder builder22 = new Uri.Builder();
        ((pux0) this.a).getClass();
        Uri.Builder authority22 = builder22.scheme(pux0.c).authority("scooters");
        it = list.iterator();
        while (it.hasNext()) {
        }
        while (r0.hasNext()) {
        }
        if (r7p0Var != null) {
        }
        return authority22.build();
    }
}
