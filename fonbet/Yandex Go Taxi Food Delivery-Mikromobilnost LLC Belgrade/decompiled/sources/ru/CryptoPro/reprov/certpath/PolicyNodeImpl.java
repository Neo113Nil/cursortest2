package ru.CryptoPro.reprov.certpath;

import defpackage.ny61;
import java.security.cert.PolicyNode;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ru.CryptoPro.AdES.evidence.crl.rfc3280.RFC3280CRLUtility;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
final class PolicyNodeImpl implements PolicyNode {
    public final PolicyNodeImpl a;
    public final String c;
    public final HashSet d;
    public final boolean e;
    public final HashSet f;
    public boolean g;
    public final int h;
    public boolean i = false;
    public final HashSet b = new HashSet();

    public PolicyNodeImpl(PolicyNodeImpl policyNodeImpl, String str, Set set, boolean z, Set set2, boolean z2) {
        this.a = policyNodeImpl;
        this.c = str == null ? "" : str;
        this.d = set != null ? new HashSet(set) : new HashSet();
        this.e = z;
        this.f = set2 != null ? new HashSet(set2) : new HashSet();
        this.g = !z2;
        if (policyNodeImpl == null) {
            this.h = 0;
            return;
        }
        this.h = policyNodeImpl.getDepth() + 1;
        if (policyNodeImpl.i) {
            ny61.r("PolicyNode is immutable");
            throw null;
        }
        policyNodeImpl.b.add(this);
    }

    public final HashSet a(int i, String str) {
        HashSet hashSet = new HashSet();
        if (this.h < i) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((PolicyNodeImpl) it.next()).a(i, str));
            }
        } else if (this.c.equals(str)) {
            hashSet.add(this);
        }
        return hashSet;
    }

    public final void b(int i) {
        if (this.i) {
            ny61.r("PolicyNode is immutable");
            return;
        }
        HashSet hashSet = this.b;
        if (hashSet.size() == 0) {
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            PolicyNodeImpl policyNodeImpl = (PolicyNodeImpl) it.next();
            policyNodeImpl.b(i);
            if (policyNodeImpl.b.size() == 0 && i > this.h + 1) {
                it.remove();
            }
        }
    }

    public final void c(int i, HashSet hashSet) {
        if (this.h == i) {
            hashSet.add(this);
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((PolicyNodeImpl) it.next()).c(i, hashSet);
        }
    }

    public final void d(PolicyNode policyNode) {
        if (this.i) {
            ny61.r("PolicyNode is immutable");
        } else {
            this.b.remove(policyNode);
        }
    }

    public final HashSet e(int i, String str, boolean z) {
        HashSet hashSet = new HashSet();
        if (this.h < i) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((PolicyNodeImpl) it.next()).e(i, str, z));
            }
        } else {
            HashSet hashSet2 = this.f;
            if (z) {
                if (hashSet2.contains(RFC3280CRLUtility.ANY_POLICY)) {
                    hashSet.add(this);
                    return hashSet;
                }
            } else if (hashSet2.contains(str)) {
                hashSet.add(this);
            }
        }
        return hashSet;
    }

    public final PolicyNodeImpl f(PolicyNodeImpl policyNodeImpl) {
        PolicyNodeImpl policyNodeImpl2 = new PolicyNodeImpl(policyNodeImpl, this.c, this.d, this.e, this.f, false);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((PolicyNodeImpl) it.next()).f(policyNodeImpl2);
        }
        return policyNodeImpl2;
    }

    public final void g() {
        if (this.i) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((PolicyNodeImpl) it.next()).g();
        }
        this.i = true;
    }

    @Override // java.security.cert.PolicyNode
    public Iterator getChildren() {
        return Collections.unmodifiableSet(this.b).iterator();
    }

    @Override // java.security.cert.PolicyNode
    public int getDepth() {
        return this.h;
    }

    @Override // java.security.cert.PolicyNode
    public Set getExpectedPolicies() {
        return Collections.unmodifiableSet(this.f);
    }

    @Override // java.security.cert.PolicyNode
    public PolicyNode getParent() {
        return this.a;
    }

    @Override // java.security.cert.PolicyNode
    public Set getPolicyQualifiers() {
        return Collections.unmodifiableSet(this.d);
    }

    @Override // java.security.cert.PolicyNode
    public String getValidPolicy() {
        return this.c;
    }

    public final String h() {
        if (this.a == null) {
            return "anyPolicy  ROOT\n";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int depth = getDepth();
        for (int i = 0; i < depth; i++) {
            stringBuffer.append("  ");
        }
        String validPolicy = getValidPolicy();
        if (validPolicy.equals(RFC3280CRLUtility.ANY_POLICY)) {
            validPolicy = "anyPolicy";
        }
        stringBuffer.append(validPolicy);
        stringBuffer.append("  CRIT: ");
        stringBuffer.append(isCritical());
        stringBuffer.append("  EP: ");
        for (String str : getExpectedPolicies()) {
            if (str.equals(RFC3280CRLUtility.ANY_POLICY)) {
                str = "anyPolicy";
            }
            stringBuffer.append(str);
            stringBuffer.append(" ");
        }
        stringBuffer.append(Extension.O_BRAKE_SPACE);
        stringBuffer.append(getDepth());
        stringBuffer.append(")\n");
        return stringBuffer.toString();
    }

    @Override // java.security.cert.PolicyNode
    public boolean isCritical() {
        return this.e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(h());
        Iterator children = getChildren();
        while (children.hasNext()) {
            stringBuffer.append(children.next());
        }
        return stringBuffer.toString();
    }
}
