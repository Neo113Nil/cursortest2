package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class RDN {
    final AVA[] assertion;
    private volatile List avaList;
    private volatile String canonicalString;

    public RDN(String str, String str2, Map map) throws IOException {
        if (!str2.equalsIgnoreCase(X500Principal.RFC2253)) {
            ny61.v("Unsupported format ".concat(str2));
            throw null;
        }
        ArrayList arrayList = new ArrayList(3);
        int indexOf = str.indexOf(43);
        int i = 0;
        while (indexOf >= 0) {
            if (indexOf > 0 && str.charAt(indexOf - 1) != '\\') {
                String substring = str.substring(i, indexOf);
                if (substring.length() == 0) {
                    ny61.v(oyr.p("empty AVA in RDN \"", str, "\""));
                    throw null;
                }
                arrayList.add(new AVA(new StringReader(substring), 3, map));
                i = indexOf + 1;
            }
            indexOf = str.indexOf(43, indexOf + 1);
        }
        String substring2 = str.substring(i);
        if (substring2.length() == 0) {
            ny61.v(oyr.p("empty AVA in RDN \"", str, "\""));
            throw null;
        }
        arrayList.add(new AVA(new StringReader(substring2), 3, map));
        this.assertion = (AVA[]) arrayList.toArray(new AVA[arrayList.size()]);
    }

    private String toRFC2253StringInternal(boolean z, Map map) {
        AVA[] avaArr = this.assertion;
        int i = 0;
        if (avaArr.length == 1) {
            return z ? avaArr[0].toRFC2253CanonicalString() : avaArr[0].toRFC2253String(map);
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (z) {
            ArrayList arrayList = new ArrayList(this.assertion.length);
            int i2 = 0;
            while (true) {
                AVA[] avaArr2 = this.assertion;
                if (i2 >= avaArr2.length) {
                    break;
                }
                arrayList.add(avaArr2[i2]);
                i2++;
            }
            Collections.sort(arrayList, AVAComparator.getInstance());
            while (i < arrayList.size()) {
                if (i > 0) {
                    stringBuffer.append('+');
                }
                stringBuffer.append(((AVA) arrayList.get(i)).toRFC2253CanonicalString());
                i++;
            }
        } else {
            while (i < this.assertion.length) {
                if (i > 0) {
                    stringBuffer.append('+');
                }
                stringBuffer.append(this.assertion[i].toRFC2253String(map));
                i++;
            }
        }
        return stringBuffer.toString();
    }

    public List avas() {
        List list = this.avaList;
        if (list != null) {
            return list;
        }
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList(this.assertion));
        this.avaList = unmodifiableList;
        return unmodifiableList;
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putOrderedSetOf((byte) 49, this.assertion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RDN)) {
            return false;
        }
        RDN rdn = (RDN) obj;
        if (this.assertion.length != rdn.assertion.length) {
            return false;
        }
        return toRFC2253String(true).equals(rdn.toRFC2253String(true));
    }

    public DerValue findAttribute(ObjectIdentifier objectIdentifier) {
        int i = 0;
        while (true) {
            AVA[] avaArr = this.assertion;
            if (i >= avaArr.length) {
                return null;
            }
            if (avaArr[i].oid.equals((Object) objectIdentifier)) {
                return this.assertion[i].value;
            }
            i++;
        }
    }

    public int hashCode() {
        return toRFC2253String(true).hashCode();
    }

    public int size() {
        return this.assertion.length;
    }

    public String toRFC1779String(Map map) {
        AVA[] avaArr = this.assertion;
        if (avaArr.length == 1) {
            return avaArr[0].toRFC1779String(map);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.assertion.length; i++) {
            if (i != 0) {
                stringBuffer.append(" + ");
            }
            stringBuffer.append(this.assertion[i].toRFC1779String(map));
        }
        return stringBuffer.toString();
    }

    public String toRFC2253String(boolean z) {
        if (!z) {
            return toRFC2253StringInternal(false, Collections.EMPTY_MAP);
        }
        String str = this.canonicalString;
        if (str != null) {
            return str;
        }
        String rFC2253StringInternal = toRFC2253StringInternal(true, Collections.EMPTY_MAP);
        this.canonicalString = rFC2253StringInternal;
        return rFC2253StringInternal;
    }

    public String toString() {
        AVA[] avaArr = this.assertion;
        if (avaArr.length == 1) {
            return avaArr[0].toString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.assertion.length; i++) {
            if (i != 0) {
                stringBuffer.append(" + ");
            }
            stringBuffer.append(this.assertion[i].toString());
        }
        return stringBuffer.toString();
    }

    public String toRFC2253String(Map map) {
        return toRFC2253StringInternal(false, map);
    }

    public String toRFC2253String() {
        return toRFC2253StringInternal(false, Collections.EMPTY_MAP);
    }

    public String toRFC1779String() {
        return toRFC1779String(Collections.EMPTY_MAP);
    }

    public RDN(String str) throws IOException {
        this(str, Collections.EMPTY_MAP);
    }

    public RDN(String str, String str2) throws IOException {
        this(str, str2, Collections.EMPTY_MAP);
    }

    public RDN(int i) {
        this.assertion = new AVA[i];
    }

    public RDN(String str, Map map) throws IOException {
        ArrayList arrayList = new ArrayList(3);
        int indexOf = str.indexOf(43);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (indexOf >= 0) {
            int countQuotes = X500Name.countQuotes(str, i3, indexOf) + i2;
            if (indexOf <= 0 || str.charAt(indexOf - 1) == '\\' || countQuotes == 1) {
                i2 = countQuotes;
            } else {
                String substring = str.substring(i, indexOf);
                if (substring.length() == 0) {
                    ny61.v(oyr.p("empty AVA in RDN \"", str, "\""));
                    throw null;
                }
                arrayList.add(new AVA(new StringReader(substring), map));
                i = indexOf + 1;
                i2 = 0;
            }
            i3 = indexOf + 1;
            indexOf = str.indexOf(43, i3);
        }
        String substring2 = str.substring(i);
        if (substring2.length() == 0) {
            ny61.v(oyr.p("empty AVA in RDN \"", str, "\""));
            throw null;
        }
        arrayList.add(new AVA(new StringReader(substring2), map));
        this.assertion = (AVA[]) arrayList.toArray(new AVA[arrayList.size()]);
    }

    public RDN(DerValue derValue) throws IOException {
        if (derValue.tag != 49) {
            ny61.v("X500 RDN");
            throw null;
        }
        DerValue[] set = new DerInputStream(derValue.toByteArray()).getSet(5);
        this.assertion = new AVA[set.length];
        for (int i = 0; i < set.length; i++) {
            this.assertion[i] = new AVA(set[i]);
        }
    }

    public RDN(AVA ava) {
        ava.getClass();
        this.assertion = new AVA[]{ava};
    }

    public RDN(AVA[] avaArr) {
        this.assertion = (AVA[]) avaArr.clone();
        int i = 0;
        while (true) {
            AVA[] avaArr2 = this.assertion;
            if (i >= avaArr2.length) {
                return;
            }
            avaArr2[i].getClass();
            i++;
        }
    }
}
