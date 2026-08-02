package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.lE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3525lE {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f32528b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f32529a;

    public C3525lE(ByteArrayInputStream byteArrayInputStream) {
        this.f32529a = byteArrayInputStream;
    }

    public static int b(AbstractC3531lK abstractC3531lK) {
        if (!(abstractC3531lK instanceof C3747pK)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(abstractC3531lK.d().f33853n instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number e9 = abstractC3531lK.d().e();
        try {
            if (!(e9 instanceof OF)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long parseLong = Long.parseLong(((OF) e9).f27377n);
            if (parseLong > 4294967295L || parseLong < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) parseLong;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C3529lI a() {
        char c9;
        int i;
        char c10;
        int i4;
        char c11;
        int i6;
        String str = "status";
        String str2 = "keyData";
        ByteArrayInputStream byteArrayInputStream = this.f32529a;
        try {
            try {
                int i9 = AbstractC4118wE.f35584a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = byteArrayInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                C3639nK c12 = UC.j(new String(byteArrayOutputStream.toByteArray(), f32528b)).c();
                C4070vK c4070vK = c12.f33498n;
                if (!c4070vK.containsKey("key")) {
                    throw new C3693oK("invalid keyset: no key");
                }
                AbstractC3531lK e9 = c12.e("key");
                if (!(e9 instanceof C3477kK)) {
                    throw new C3693oK("invalid keyset: key must be an array");
                }
                e9.getClass();
                if (!(e9 instanceof C3477kK)) {
                    throw new IllegalStateException("Not a JSON Array: ".concat(e9.toString()));
                }
                ArrayList arrayList = ((C3477kK) e9).f32196n;
                if (arrayList.size() == 0) {
                    throw new C3693oK("invalid keyset: key is empty");
                }
                C3369iI G2 = C3529lI.G();
                if (c4070vK.containsKey("primaryKeyId")) {
                    int b9 = b(c12.e("primaryKeyId"));
                    G2.h();
                    ((C3529lI) G2.f28504u).H(b9);
                }
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    C3639nK c13 = ((AbstractC3531lK) arrayList.get(i10)).c();
                    C4070vK c4070vK2 = c13.f33498n;
                    if (!c4070vK2.containsKey(str2) || !c4070vK2.containsKey(str) || !c4070vK2.containsKey("keyId") || !c4070vK2.containsKey("outputPrefixType")) {
                        throw new C3693oK("invalid key");
                    }
                    AbstractC3531lK e10 = c13.e(str2);
                    if (!(e10 instanceof C3639nK)) {
                        throw new C3693oK("invalid key: keyData must be an object");
                    }
                    C3421jI D8 = C3475kI.D();
                    String a9 = c13.e(str).a();
                    String str3 = str;
                    int hashCode = a9.hashCode();
                    String str4 = str2;
                    int i11 = i10;
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
                            throw new C3693oK("unknown status: ".concat(a9));
                        }
                        i = 5;
                    }
                    D8.h();
                    ((C3475kI) D8.f28504u).I(i);
                    int b10 = b(c13.e("keyId"));
                    D8.h();
                    ((C3475kI) D8.f28504u).F(b10);
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
                        i4 = 3;
                    } else if (c10 == 1) {
                        i4 = 5;
                    } else if (c10 == 2) {
                        i4 = 4;
                    } else {
                        if (c10 != 3) {
                            throw new C3693oK("unknown output prefix type: ".concat(a10));
                        }
                        i4 = 6;
                    }
                    D8.h();
                    ((C3475kI) D8.f28504u).J(i4);
                    C3639nK c14 = e10.c();
                    C4070vK c4070vK3 = c14.f33498n;
                    if (!c4070vK3.containsKey("typeUrl") || !c4070vK3.containsKey("value") || !c4070vK3.containsKey("keyMaterialType")) {
                        throw new C3693oK("invalid keyData");
                    }
                    byte[] a11 = RJ.a(c14.e("value").a());
                    C3100dI C8 = C3153eI.C();
                    String a12 = c14.e("typeUrl").a();
                    C8.h();
                    ((C3153eI) C8.f28504u).E(a12);
                    HK s9 = JK.s(a11, 0, a11.length);
                    C8.h();
                    ((C3153eI) C8.f28504u).F(s9);
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
                        i6 = 3;
                    } else if (c11 == 1) {
                        i6 = 4;
                    } else if (c11 == 2) {
                        i6 = 5;
                    } else {
                        if (c11 != 3) {
                            throw new C3693oK("unknown key material type: ".concat(a13));
                        }
                        i6 = 6;
                    }
                    C8.h();
                    ((C3153eI) C8.f28504u).H(i6);
                    C3153eI c3153eI = (C3153eI) C8.j();
                    D8.h();
                    ((C3475kI) D8.f28504u).E(c3153eI);
                    C3475kI c3475kI = (C3475kI) D8.j();
                    G2.h();
                    ((C3529lI) G2.f28504u).I(c3475kI);
                    i10 = i11 + 1;
                    str = str3;
                    str2 = str4;
                }
                C3529lI c3529lI = (C3529lI) G2.j();
                byteArrayInputStream.close();
                return c3529lI;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (C3693oK e11) {
            e = e11;
            throw new IOException(e);
        } catch (IllegalStateException e12) {
            e = e12;
            throw new IOException(e);
        }
    }
}
