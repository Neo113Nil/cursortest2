package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.l4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2091l4 implements L8 {
    public static String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ C2090l3 A04;
    public final C06464u A03 = new C06464u(new byte[5]);
    public final SparseArray<LH> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    @Override // com.instagram.common.viewpoint.core.L8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5A(C06474v c06474v) {
        int i;
        List list;
        AnonymousClass53 anonymousClass53;
        int i6;
        int i9;
        SparseArray sparseArray;
        int i10;
        int i11;
        int i12;
        HA ha;
        boolean z3;
        HA ha2;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        LH lh;
        SparseArray sparseArray2;
        HA ha3;
        int i13;
        SparseBooleanArray sparseBooleanArray3;
        int i14;
        LE le;
        LH A5V;
        int i15;
        LH lh2;
        LE le2;
        LH lh3;
        LH lh4;
        HA ha4;
        int i16;
        int i17;
        List list2;
        List list3;
        if (c06474v.A0I() != 2) {
            return;
        }
        i = this.A04.A09;
        if (i != 1) {
            i16 = this.A04.A09;
            if (i16 != 2) {
                i17 = this.A04.A02;
                if (i17 != 1) {
                    list2 = this.A04.A0I;
                    anonymousClass53 = new AnonymousClass53(((AnonymousClass53) list2.get(0)).A02());
                    list3 = this.A04.A0I;
                    list3.add(anonymousClass53);
                    if ((c06474v.A0I() & 128) != 0) {
                        return;
                    }
                    c06474v.A0g(1);
                    int A0M = c06474v.A0M();
                    int i18 = 3;
                    c06474v.A0g(3);
                    c06474v.A0h(this.A03, 2);
                    this.A03.A09(3);
                    int i19 = 13;
                    this.A04.A01 = this.A03.A04(13);
                    c06474v.A0h(this.A03, 2);
                    int i20 = 4;
                    this.A03.A09(4);
                    c06474v.A0g(this.A03.A04(12));
                    i6 = this.A04.A09;
                    int i21 = 21;
                    if (i6 == 2) {
                        lh2 = this.A04.A05;
                        if (lh2 == null) {
                            LD ld = new LD(21, null, null, C5C.A07);
                            C2090l3 c2090l3 = this.A04;
                            le2 = this.A04.A0H;
                            c2090l3.A05 = le2.A5V(21, ld);
                            lh3 = this.A04.A05;
                            if (lh3 != null) {
                                lh4 = this.A04.A05;
                                ha4 = this.A04.A03;
                                lh4.AAA(anonymousClass53, ha4, new LG(A0M, 21, 8192));
                            }
                        }
                    }
                    this.A01.clear();
                    this.A02.clear();
                    int A07 = c06474v.A07();
                    while (A07 > 0) {
                        c06474v.A0h(this.A03, 5);
                        int A04 = this.A03.A04(8);
                        this.A03.A09(i18);
                        int A042 = this.A03.A04(i19);
                        this.A03.A09(i20);
                        int A043 = this.A03.A04(12);
                        LD A00 = A00(c06474v, A043);
                        if (A04 == 6 || A04 == 5) {
                            A04 = A00.A00;
                        }
                        A07 -= A043 + 5;
                        i13 = this.A04.A09;
                        int i22 = i13 == 2 ? A04 : A042;
                        sparseBooleanArray3 = this.A04.A0C;
                        if (!sparseBooleanArray3.get(i22)) {
                            i14 = this.A04.A09;
                            if (i14 == 2 && A04 == i21) {
                                A5V = this.A04.A05;
                            } else {
                                le = this.A04.A0H;
                                A5V = le.A5V(A04, A00);
                            }
                            i15 = this.A04.A09;
                            if (i15 == 2) {
                                SparseIntArray sparseIntArray = this.A02;
                                String[] strArr = A05;
                                if (strArr[0].charAt(21) == strArr[3].charAt(21)) {
                                    throw new RuntimeException();
                                }
                                A05[7] = "JJxGvbQzsWrYD5XHKTSp80Ux1McJryio";
                                if (A042 >= sparseIntArray.get(i22, 8192)) {
                                }
                            }
                            this.A02.put(i22, A042);
                            this.A01.put(i22, A5V);
                        }
                        i21 = 21;
                        i18 = 3;
                        i20 = 4;
                        i19 = 13;
                    }
                    int size = this.A02.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        int keyAt = this.A02.keyAt(i23);
                        int valueAt = this.A02.valueAt(i23);
                        sparseBooleanArray = this.A04.A0C;
                        sparseBooleanArray.put(keyAt, true);
                        sparseBooleanArray2 = this.A04.A0D;
                        sparseBooleanArray2.put(valueAt, true);
                        LH valueAt2 = this.A01.valueAt(i23);
                        if (valueAt2 != null) {
                            lh = this.A04.A05;
                            if (valueAt2 != lh) {
                                ha3 = this.A04.A03;
                                valueAt2.AAA(anonymousClass53, ha3, new LG(A0M, keyAt, 8192));
                            }
                            sparseArray2 = this.A04.A0B;
                            sparseArray2.put(valueAt, valueAt2);
                        }
                    }
                    i9 = this.A04.A09;
                    if (i9 == 2) {
                        z3 = this.A04.A08;
                        if (z3) {
                            return;
                        }
                        ha2 = this.A04.A03;
                        String[] strArr2 = A05;
                        if (strArr2[1].length() != strArr2[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A05;
                        strArr3[0] = "hBvWu7G0FYrLQDeafFD7KKlceKy2jgRX";
                        strArr3[3] = "VoSHbxg0JUdlXnrGoiizfFeUaWFRK7d9";
                        ha2.A6O();
                        this.A04.A02 = 0;
                        this.A04.A08 = true;
                        return;
                    }
                    int i24 = 0;
                    sparseArray = this.A04.A0B;
                    sparseArray.remove(this.A00);
                    C2090l3 c2090l32 = this.A04;
                    i10 = this.A04.A09;
                    if (i10 != 1) {
                        i11 = this.A04.A02;
                        i24 = i11 - 1;
                    }
                    c2090l32.A02 = i24;
                    i12 = this.A04.A02;
                    if (i12 == 0) {
                        ha = this.A04.A03;
                        ha.A6O();
                        this.A04.A08 = true;
                        return;
                    }
                    return;
                }
            }
        }
        list = this.A04.A0I;
        anonymousClass53 = (AnonymousClass53) list.get(0);
        if ((c06474v.A0I() & 128) != 0) {
        }
    }

    public C2091l4(C2090l3 c2090l3, int i) {
        this.A04 = c2090l3;
        this.A00 = i;
    }

    private LD A00(C06474v c06474v, int i) {
        int descriptorTag = c06474v.A09();
        int descriptorLength = descriptorTag + i;
        int i6 = -1;
        String str = null;
        ArrayList arrayList = null;
        while (c06474v.A09() < descriptorLength) {
            int positionOfNextDescriptor = c06474v.A0I();
            int A09 = c06474v.A09() + c06474v.A0I();
            if (A09 > descriptorLength) {
                break;
            }
            if (positionOfNextDescriptor == 5) {
                long A0Q = c06474v.A0Q();
                if (A0Q == 1094921523) {
                    i6 = a.f21730T;
                } else if (A0Q == 1161904947) {
                    i6 = 135;
                } else if (A0Q == 1094921524) {
                    i6 = 172;
                } else if (A0Q == 1212503619) {
                    i6 = 36;
                }
            } else if (positionOfNextDescriptor == 106) {
                i6 = a.f21730T;
            } else if (positionOfNextDescriptor == 122) {
                i6 = 135;
            } else {
                String[] strArr = A05;
                String str2 = strArr[1];
                String str3 = strArr[2];
                int descriptorsStartPosition = str2.length();
                if (descriptorsStartPosition != str3.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (positionOfNextDescriptor == 127) {
                    int descriptorsStartPosition2 = c06474v.A0I();
                    if (descriptorsStartPosition2 == 21) {
                        i6 = 172;
                    }
                } else if (positionOfNextDescriptor == 123) {
                    i6 = 138;
                } else {
                    String[] strArr3 = A05;
                    String str4 = strArr3[1];
                    String str5 = strArr3[2];
                    int descriptorsStartPosition3 = str4.length();
                    if (descriptorsStartPosition3 != str5.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (positionOfNextDescriptor == 10) {
                        String A0W = c06474v.A0W(3);
                        String[] strArr5 = A05;
                        String str6 = strArr5[1];
                        String str7 = strArr5[2];
                        int descriptorsStartPosition4 = str6.length();
                        if (descriptorsStartPosition4 != str7.length()) {
                            str = A0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            str = A0W.trim();
                        }
                    } else if (positionOfNextDescriptor == 89) {
                        i6 = 89;
                        arrayList = new ArrayList();
                        while (c06474v.A09() < A09) {
                            String trim = c06474v.A0W(3).trim();
                            int A0I = c06474v.A0I();
                            byte[] bArr = new byte[4];
                            c06474v.A0k(bArr, 0, 4);
                            arrayList.add(new LC(trim, A0I, bArr));
                        }
                    } else if (positionOfNextDescriptor == 111) {
                        i6 = 257;
                    }
                }
            }
            c06474v.A0g(A09 - c06474v.A09());
        }
        c06474v.A0f(descriptorLength);
        return new LD(i6, str, arrayList, Arrays.copyOfRange(c06474v.A0l(), descriptorTag, descriptorLength));
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
    }
}
