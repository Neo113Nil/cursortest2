package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.oE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3677oE {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f33118b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f33119a;

    public C3677oE(ByteArrayInputStream byteArrayInputStream) {
        this.f33119a = byteArrayInputStream;
    }

    public static int b(AbstractC4006uK abstractC4006uK) {
        if (!(abstractC4006uK instanceof C4222yK)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(abstractC4006uK.d().f35341n instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number e6 = abstractC4006uK.d().e();
        try {
            if (!(e6 instanceof RF)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long parseLong = Long.parseLong(((RF) e6).f27326n);
            if (parseLong > 4294967295L || parseLong < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) parseLong;
        } catch (NumberFormatException e9) {
            throw new IOException(e9);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C3842rI a() {
        char c4;
        int i;
        char c9;
        EI ei;
        char c10;
        String str = "status";
        String str2 = "keyData";
        ByteArrayInputStream byteArrayInputStream = this.f33119a;
        try {
            try {
                int i4 = AbstractC4162xE.f35129a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = byteArrayInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                C4114wK c11 = YD.e(new String(byteArrayOutputStream.toByteArray(), f33118b)).c();
                EK ek = c11.f34974n;
                if (!ek.containsKey("key")) {
                    throw new C4168xK("invalid keyset: no key");
                }
                AbstractC4006uK e6 = c11.e("key");
                if (!(e6 instanceof C3952tK)) {
                    throw new C4168xK("invalid keyset: key must be an array");
                }
                e6.getClass();
                if (!(e6 instanceof C3952tK)) {
                    throw new IllegalStateException("Not a JSON Array: ".concat(e6.toString()));
                }
                ArrayList arrayList = ((C3952tK) e6).f34396n;
                if (arrayList.size() == 0) {
                    throw new C4168xK("invalid keyset: key is empty");
                }
                C3681oI G7 = C3842rI.G();
                if (ek.containsKey("primaryKeyId")) {
                    int b9 = b(c11.e("primaryKeyId"));
                    G7.h();
                    ((C3842rI) G7.f30000u).H(b9);
                }
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    C4114wK c12 = ((AbstractC4006uK) arrayList.get(i9)).c();
                    EK ek2 = c12.f34974n;
                    if (!ek2.containsKey(str2) || !ek2.containsKey(str) || !ek2.containsKey("keyId") || !ek2.containsKey("outputPrefixType")) {
                        throw new C4168xK("invalid key");
                    }
                    AbstractC4006uK e9 = c12.e(str2);
                    if (!(e9 instanceof C4114wK)) {
                        throw new C4168xK("invalid key: keyData must be an object");
                    }
                    C3735pI E8 = C3789qI.E();
                    String a9 = c12.e(str).a();
                    String str3 = str;
                    int hashCode = a9.hashCode();
                    String str4 = str2;
                    int i10 = i9;
                    int i11 = 2;
                    if (hashCode == -891611359) {
                        if (a9.equals("ENABLED")) {
                            c4 = 0;
                        }
                        c4 = 65535;
                    } else if (hashCode != 478389753) {
                        if (hashCode == 1053567612 && a9.equals("DISABLED")) {
                            c4 = 1;
                        }
                        c4 = 65535;
                    } else {
                        if (a9.equals("DESTROYED")) {
                            c4 = 2;
                        }
                        c4 = 65535;
                    }
                    if (c4 == 0) {
                        i = 3;
                    } else if (c4 == 1) {
                        i = 4;
                    } else {
                        if (c4 != 2) {
                            throw new C4168xK("unknown status: ".concat(a9));
                        }
                        i = 5;
                    }
                    E8.h();
                    ((C3789qI) E8.f30000u).J(i);
                    int b10 = b(c12.e("keyId"));
                    E8.h();
                    ((C3789qI) E8.f30000u).G(b10);
                    String a10 = c12.e("outputPrefixType").a();
                    switch (a10.hashCode()) {
                        case -2053249079:
                            if (a10.equals("LEGACY")) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 80904:
                            if (a10.equals("RAW")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2575090:
                            if (a10.equals("TINK")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1761684556:
                            if (a10.equals("CRUNCHY")) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    if (c9 == 0) {
                        ei = EI.TINK;
                    } else if (c9 == 1) {
                        ei = EI.RAW;
                    } else if (c9 == 2) {
                        ei = EI.LEGACY;
                    } else {
                        if (c9 != 3) {
                            throw new C4168xK("unknown output prefix type: ".concat(a10));
                        }
                        ei = EI.CRUNCHY;
                    }
                    E8.h();
                    ((C3789qI) E8.f30000u).H(ei);
                    C4114wK c13 = e9.c();
                    EK ek3 = c13.f34974n;
                    if (!ek3.containsKey("typeUrl") || !ek3.containsKey("value") || !ek3.containsKey("keyMaterialType")) {
                        throw new C4168xK("invalid keyData");
                    }
                    byte[] a11 = AbstractC2925aK.a(c13.e("value").a());
                    C3411jI D8 = C3465kI.D();
                    String a12 = c13.e("typeUrl").a();
                    D8.h();
                    ((C3465kI) D8.f30000u).F(a12);
                    QK s3 = SK.s(a11, 0, a11.length);
                    D8.h();
                    ((C3465kI) D8.f30000u).G(s3);
                    String a13 = c13.e("keyMaterialType").a();
                    switch (a13.hashCode()) {
                        case -1881281466:
                            if (a13.equals("REMOTE")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1609477353:
                            if (a13.equals("SYMMETRIC")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 249237018:
                            if (a13.equals("ASYMMETRIC_PRIVATE")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1534613202:
                            if (a13.equals("ASYMMETRIC_PUBLIC")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 != 0) {
                        if (c10 == 1) {
                            i11 = 3;
                        } else if (c10 == 2) {
                            i11 = 4;
                        } else {
                            if (c10 != 3) {
                                throw new C4168xK("unknown key material type: ".concat(a13));
                            }
                            i11 = 5;
                        }
                    }
                    D8.h();
                    ((C3465kI) D8.f30000u).H(i11);
                    C3465kI c3465kI = (C3465kI) D8.j();
                    E8.h();
                    ((C3789qI) E8.f30000u).F(c3465kI);
                    C3789qI c3789qI = (C3789qI) E8.j();
                    G7.h();
                    ((C3842rI) G7.f30000u).I(c3789qI);
                    i9 = i10 + 1;
                    str = str3;
                    str2 = str4;
                }
                C3842rI c3842rI = (C3842rI) G7.j();
                byteArrayInputStream.close();
                return c3842rI;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (C4168xK e10) {
            e = e10;
            throw new IOException(e);
        } catch (IllegalStateException e11) {
            e = e11;
            throw new IOException(e);
        }
    }
}
