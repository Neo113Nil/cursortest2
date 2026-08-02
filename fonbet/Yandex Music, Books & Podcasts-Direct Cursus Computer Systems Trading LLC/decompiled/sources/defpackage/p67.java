package defpackage;

import java.net.InetAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class p67 extends q67 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p67(String str, y67 y67Var, x67 x67Var, boolean z, int i) {
        super(str, y67Var, x67Var, z);
        this.i = i;
    }

    @Override // defpackage.j67
    public boolean j(j67 j67Var) {
        switch (this.i) {
            case 0:
                return true;
            default:
                return super.j(j67Var);
        }
    }

    @Override // defpackage.q67
    public void p(p2f p2fVar, HashSet hashSet) {
        switch (this.i) {
            case 0:
                String lowerCase = c().toLowerCase();
                boolean equalsIgnoreCase = p2fVar.i.a.equalsIgnoreCase(lowerCase);
                boolean z = this.f;
                if (!equalsIgnoreCase) {
                    if (!p2fVar.h.containsKey(lowerCase)) {
                        q(p2fVar, hashSet, (a) p2fVar.g.get(lowerCase));
                        break;
                    } else {
                        new p67(c(), y67.TYPE_PTR, d(), z, 4).p(p2fVar, hashSet);
                        break;
                    }
                } else {
                    hashSet.addAll(p2fVar.i.a(d(), z, 3600));
                    break;
                }
            case 1:
                s67 c = p2fVar.i.c(e(), true);
                if (c != null) {
                    hashSet.add(c);
                    break;
                }
                break;
            case 2:
                s67 c2 = p2fVar.i.c(e(), true);
                if (c2 != null) {
                    hashSet.add(c2);
                    break;
                }
                break;
            case 4:
                ConcurrentHashMap concurrentHashMap = p2fVar.g;
                ConcurrentHashMap concurrentHashMap2 = p2fVar.h;
                a4e a4eVar = p2fVar.i;
                Iterator it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    q(p2fVar, hashSet, (a) ((fkp) it.next()));
                }
                if (!k()) {
                    HashMap hashMap = this.g;
                    ekp ekpVar = ekp.a;
                    if (!((String) hashMap.get(ekpVar)).endsWith("in-addr.arpa") && !((String) hashMap.get(ekpVar)).endsWith("ip6.arpa")) {
                        g();
                        break;
                    } else {
                        String str = (String) Collections.unmodifiableMap(hashMap).get(ekp.d);
                        if (str != null && str.length() > 0) {
                            InetAddress inetAddress = a4eVar.b;
                            if (str.equalsIgnoreCase(inetAddress != null ? inetAddress.getHostAddress() : "")) {
                                if (((String) hashMap.get(ekpVar)).endsWith("in-addr.arpa")) {
                                    hashSet.add(a4eVar.d(y67.TYPE_A));
                                }
                                if (((String) hashMap.get(ekpVar)).endsWith("ip6.arpa")) {
                                    hashSet.add(a4eVar.d(y67.TYPE_AAAA));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    Iterator it2 = concurrentHashMap2.keySet().iterator();
                    while (it2.hasNext()) {
                        hashSet.add(new t67("_services._dns-sd._udp.local.", x67.CLASS_IN, false, 3600, ((o2f) concurrentHashMap2.get((String) it2.next())).b));
                    }
                    break;
                }
                break;
            case 5:
                String lowerCase2 = c().toLowerCase();
                boolean equalsIgnoreCase2 = p2fVar.i.a.equalsIgnoreCase(lowerCase2);
                boolean z2 = this.f;
                if (!equalsIgnoreCase2) {
                    if (!p2fVar.h.containsKey(lowerCase2)) {
                        q(p2fVar, hashSet, (a) p2fVar.g.get(lowerCase2));
                        break;
                    } else {
                        new p67(c(), y67.TYPE_PTR, d(), z2, 4).p(p2fVar, hashSet);
                        break;
                    }
                } else {
                    hashSet.addAll(p2fVar.i.a(d(), z2, 3600));
                    break;
                }
            case 6:
                q(p2fVar, hashSet, (a) p2fVar.g.get(c().toLowerCase()));
                break;
        }
    }

    @Override // defpackage.q67
    public boolean r(p2f p2fVar) {
        switch (this.i) {
            case 0:
                String lowerCase = c().toLowerCase();
                return p2fVar.i.a.equals(lowerCase) || p2fVar.g.keySet().contains(lowerCase);
            case 1:
                String lowerCase2 = c().toLowerCase();
                return p2fVar.i.a.equals(lowerCase2) || p2fVar.g.keySet().contains(lowerCase2);
            case 2:
                String lowerCase3 = c().toLowerCase();
                return p2fVar.i.a.equals(lowerCase3) || p2fVar.g.keySet().contains(lowerCase3);
            case 3:
            case 4:
            default:
                return super.r(p2fVar);
            case 5:
                String lowerCase4 = c().toLowerCase();
                return p2fVar.i.a.equals(lowerCase4) || p2fVar.g.keySet().contains(lowerCase4);
            case 6:
                String lowerCase5 = c().toLowerCase();
                return p2fVar.i.a.equals(lowerCase5) || p2fVar.g.keySet().contains(lowerCase5);
        }
    }
}
