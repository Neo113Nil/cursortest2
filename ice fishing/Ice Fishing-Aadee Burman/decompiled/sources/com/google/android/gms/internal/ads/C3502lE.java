package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.lE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3502lE {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f31748b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f31749a;

    public C3502lE(ByteArrayInputStream byteArrayInputStream) {
        this.f31749a = byteArrayInputStream;
    }

    public static int b(AbstractC3508lK abstractC3508lK) {
        if (!(abstractC3508lK instanceof C3724pK)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(abstractC3508lK.d().f33063n instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number e9 = abstractC3508lK.d().e();
        try {
            if (!(e9 instanceof OF)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long parseLong = Long.parseLong(((OF) e9).f26595n);
            if (parseLong > 4294967295L || parseLong < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) parseLong;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C3506lI a() {
        char c9;
        int i;
        char c10;
        int i6;
        char c11;
        int i9;
        String str = "status";
        String str2 = "keyData";
        ByteArrayInputStream byteArrayInputStream = this.f31749a;
        try {
            try {
                int i10 = AbstractC4095wE.f34815a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = byteArrayInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                C3616nK c12 = UC.j(new String(byteArrayOutputStream.toByteArray(), f31748b)).c();
                C4047vK c4047vK = c12.f32720n;
                if (!c4047vK.containsKey("key")) {
                    throw new C3670oK("invalid keyset: no key");
                }
                AbstractC3508lK e9 = c12.e("key");
                if (!(e9 instanceof C3454kK)) {
                    throw new C3670oK("invalid keyset: key must be an array");
                }
                e9.getClass();
                if (!(e9 instanceof C3454kK)) {
                    throw new IllegalStateException("Not a JSON Array: ".concat(e9.toString()));
                }
                ArrayList arrayList = ((C3454kK) e9).f31417n;
                if (arrayList.size() == 0) {
                    throw new C3670oK("invalid keyset: key is empty");
                }
                C3346iI G7 = C3506lI.G();
                if (c4047vK.containsKey("primaryKeyId")) {
                    int b9 = b(c12.e("primaryKeyId"));
                    G7.h();
                    ((C3506lI) G7.f27721u).H(b9);
                }
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    C3616nK c13 = ((AbstractC3508lK) arrayList.get(i11)).c();
                    C4047vK c4047vK2 = c13.f32720n;
                    if (!c4047vK2.containsKey(str2) || !c4047vK2.containsKey(str) || !c4047vK2.containsKey("keyId") || !c4047vK2.containsKey("outputPrefixType")) {
                        throw new C3670oK("invalid key");
                    }
                    AbstractC3508lK e10 = c13.e(str2);
                    if (!(e10 instanceof C3616nK)) {
                        throw new C3670oK("invalid key: keyData must be an object");
                    }
                    C3398jI D8 = C3452kI.D();
                    String a9 = c13.e(str).a();
                    String str3 = str;
                    int hashCode = a9.hashCode();
                    String str4 = str2;
                    int i12 = i11;
                    if (hashCode == -891611359) {
                        if (a9.equals("ENABLED")) {
                            c9 = 0;
                        }
                        c9 = 65535;
                    } else if (hashCode != 478389753) {
                        if (hashCode == 1053567612 && a9.equals("DISABLED")) {
                            c9 = 1;
                        }
                        c9 = 65535;
                    } else {
                        if (a9.equals("DESTROYED")) {
                            c9 = 2;
                        }
                        c9 = 65535;
                    }
                    if (c9 == 0) {
                        i = 3;
                    } else if (c9 == 1) {
                        i = 4;
                    } else {
                        if (c9 != 2) {
                            throw new C3670oK("unknown status: ".concat(a9));
                        }
                        i = 5;
                    }
                    D8.h();
                    ((C3452kI) D8.f27721u).I(i);
                    int b10 = b(c13.e("keyId"));
                    D8.h();
                    ((C3452kI) D8.f27721u).F(b10);
                    String a10 = c13.e("outputPrefixType").a();
                    switch (a10.hashCode()) {
                        case -2053249079:
                            if (a10.equals("LEGACY")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 80904:
                            if (a10.equals("RAW")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2575090:
                            if (a10.equals("TINK")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1761684556:
                            if (a10.equals("CRUNCHY")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 == 0) {
                        i6 = 3;
                    } else if (c10 == 1) {
                        i6 = 5;
                    } else if (c10 == 2) {
                        i6 = 4;
                    } else {
                        if (c10 != 3) {
                            throw new C3670oK("unknown output prefix type: ".concat(a10));
                        }
                        i6 = 6;
                    }
                    D8.h();
                    ((C3452kI) D8.f27721u).J(i6);
                    C3616nK c14 = e10.c();
                    C4047vK c4047vK3 = c14.f32720n;
                    if (!c4047vK3.containsKey("typeUrl") || !c4047vK3.containsKey("value") || !c4047vK3.containsKey("keyMaterialType")) {
                        throw new C3670oK("invalid keyData");
                    }
                    byte[] a11 = RJ.a(c14.e("value").a());
                    C3077dI C8 = C3130eI.C();
                    String a12 = c14.e("typeUrl").a();
                    C8.h();
                    ((C3130eI) C8.f27721u).E(a12);
                    HK s9 = JK.s(a11, 0, a11.length);
                    C8.h();
                    ((C3130eI) C8.f27721u).F(s9);
                    String a13 = c14.e("keyMaterialType").a();
                    switch (a13.hashCode()) {
                        case -1881281466:
                            if (a13.equals("REMOTE")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1609477353:
                            if (a13.equals("SYMMETRIC")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 249237018:
                            if (a13.equals("ASYMMETRIC_PRIVATE")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1534613202:
                            if (a13.equals("ASYMMETRIC_PUBLIC")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    if (c11 == 0) {
                        i9 = 3;
                    } else if (c11 == 1) {
                        i9 = 4;
                    } else if (c11 == 2) {
                        i9 = 5;
                    } else {
                        if (c11 != 3) {
                            throw new C3670oK("unknown key material type: ".concat(a13));
                        }
                        i9 = 6;
                    }
                    C8.h();
                    ((C3130eI) C8.f27721u).H(i9);
                    C3130eI c3130eI = (C3130eI) C8.j();
                    D8.h();
                    ((C3452kI) D8.f27721u).E(c3130eI);
                    C3452kI c3452kI = (C3452kI) D8.j();
                    G7.h();
                    ((C3506lI) G7.f27721u).I(c3452kI);
                    i11 = i12 + 1;
                    str = str3;
                    str2 = str4;
                }
                C3506lI c3506lI = (C3506lI) G7.j();
                byteArrayInputStream.close();
                return c3506lI;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (C3670oK e11) {
            e = e11;
            throw new IOException(e);
        } catch (IllegalStateException e12) {
            e = e12;
            throw new IOException(e);
        }
    }
}
