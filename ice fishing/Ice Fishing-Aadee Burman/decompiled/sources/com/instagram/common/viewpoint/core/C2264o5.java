package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyInfo;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.PrivateCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.o5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2264o5 implements InterfaceC0795Bd {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{40, 29, 29, 12, 4, 25, 29, 12, 13, 73, 29, 6, 73, 10, 27, 12, 8, 29, 12, 73, 13, 12, 10, 6, 13, 12, 27, 73, 15, 6, 27, 73, 28, 7, 26, 28, 25, 25, 6, 27, 29, 12, 13, 73, 36, 32, 36, 44, 73, 29, 16, 25, 12, 83, 73, 25, 8, 8, 20, 17, 27, 25, 12, 17, 23, 22, 87, 17, 28, 75, 19, 2, 2, 30, 27, 17, 19, 6, 27, 29, 28, 93, 10, 95, 23, 31, 1, 21, 5, 20, 20, 8, 13, 7, 5, 16, 13, 11, 10, 75, 28, 73, 13, 7, 29, 58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, 116, 35, 118, 40, 56, 47, 62, 104, 110};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0795Bd
    public final InterfaceC0966Hw A5J(C2400qI c2400qI) {
        char c9;
        String str = c2400qI.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case -1348231605:
                    String mimeType = A00(88, 17, 73);
                    if (str.equals(mimeType)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1248341703:
                    String mimeType2 = A00(55, 15, 85);
                    if (str.equals(mimeType2)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1154383568:
                    String mimeType3 = A00(70, 18, 95);
                    if (str.equals(mimeType3)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1652648887:
                    String mimeType4 = A00(105, 20, 118);
                    if (str.equals(mimeType4)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    return new C9U();
                case 1:
                    return new AbstractC2172mZ() { // from class: com.facebook.ads.redexgen.X.9d
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                        	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
                        	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
                        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
                         */
                        private final EventMessage A00(C06474v c06474v) {
                            return new EventMessage((String) AbstractC06243y.A01(c06474v.A0U()), (String) AbstractC06243y.A01(c06474v.A0U()), c06474v.A0P(), c06474v.A0P(), Arrays.copyOfRange(c06474v.A0l(), c06474v.A09(), c06474v.A0A()));
                        }

                        @Override // com.instagram.common.viewpoint.core.AbstractC2172mZ
                        public final Metadata A0R(C07549e c07549e, ByteBuffer byteBuffer) {
                            return new Metadata(A00(new C06474v(byteBuffer.array(), byteBuffer.limit())));
                        }
                    };
                case 2:
                    return new AbstractC2172mZ() { // from class: com.facebook.ads.redexgen.X.94
                        public static String[] A03 = {"LinnqKc1r0Ls5OIb", "1aWHF9GftncklZYsR1NJvylUpCZwYQhA", "WIGwItTSIaUh0S", "86hqVYxCYoyBTLzVv0XRyx6tGel5Hfof", "L8UaESXrw6FNBEuX", "ZSKLe1wjy7TzDmQANFt3bVwH52LTNoGA", "sWuUgP3CrL0lX60YF5iqvlGlBvq7Icsz", "4dV7lZySL5Inrb"};
                        public AnonymousClass53 A00;
                        public final C06474v A02 = new C06474v();
                        public final C06464u A01 = new C06464u();

                        @Override // com.instagram.common.viewpoint.core.AbstractC2172mZ
                        public final Metadata A0R(C07549e c07549e, ByteBuffer byteBuffer) {
                            if (this.A00 == null || c07549e.A00 != this.A00.A04()) {
                                this.A00 = new AnonymousClass53(c07549e.A01);
                                this.A00.A05(c07549e.A01 - c07549e.A00);
                            }
                            byte[] array = byteBuffer.array();
                            int size = byteBuffer.limit();
                            this.A02.A0j(array, size);
                            this.A01.A0E(array, size);
                            this.A01.A09(39);
                            long A04 = (this.A01.A04(1) << 32) | this.A01.A04(32);
                            this.A01.A09(20);
                            int A042 = this.A01.A04(12);
                            int spliceCommandType = this.A01.A04(8);
                            Metadata.Entry entry = null;
                            this.A02.A0g(14);
                            switch (spliceCommandType) {
                                case 0:
                                    entry = new SpliceNullCommand();
                                    break;
                                case 4:
                                    entry = SpliceScheduleCommand.A00(this.A02);
                                    break;
                                case 5:
                                    C06474v c06474v = this.A02;
                                    String[] strArr = A03;
                                    if (strArr[0].length() == strArr[4].length()) {
                                        String[] strArr2 = A03;
                                        strArr2[0] = "3zG9Y3L3pcSl9hsO";
                                        strArr2[4] = "rzd7tnlstbcgZZIh";
                                        entry = SpliceInsertCommand.A00(c06474v, A04, this.A00);
                                        break;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                case 6:
                                    entry = TimeSignalCommand.A01(this.A02, A04, this.A00);
                                    break;
                                case p.f8473b /* 255 */:
                                    entry = PrivateCommand.A00(this.A02, A042, A04);
                                    break;
                            }
                            return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
                        }
                    };
                case 3:
                    return new AbstractC2172mZ() { // from class: com.facebook.ads.redexgen.X.9c
                        public static byte[] A02;
                        public static String[] A03 = {"Lh0eiN4oYILfPl4jy3dJZhwMArdhxg", "ZZdJzt9nksvE8tVcjKh5yb5LHp4DKBwy", "Dbw1S4FpTZ", "Q8KOrM0jMS", "", "1W", "E5bBazuIHkpw9TIkFnjV805WNgqTNchu", "VvZ"};
                        public static final Pattern A04;
                        public final CharsetDecoder A01 = AbstractC2037k9.A05.newDecoder();
                        public final CharsetDecoder A00 = AbstractC2037k9.A00.newDecoder();

                        public static String A00(int i, int i6, int i9) {
                            byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
                            for (int i10 = 0; i10 < copyOfRange.length; i10++) {
                                copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 53);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A02() {
                            byte[] bArr = {72, 78, 75, 95, 73, 93, 71, 72, 78, 74, 95, 73, 71, 91, 11, 12, 10, 29, 25, 21, 12, 17, 12, 20, 29, 17, 22, 16, 7, 3, 15, 23, 16, 14};
                            String[] strArr = A03;
                            if (strArr[3].length() != strArr[2].length()) {
                                throw new RuntimeException();
                            }
                            A03[7] = "K4Z";
                            A02 = bArr;
                        }

                        static {
                            A02();
                            A04 = Pattern.compile(A00(0, 14, 85), 32);
                        }

                        private String A01(ByteBuffer byteBuffer) {
                            try {
                                return this.A01.decode(byteBuffer).toString();
                            } catch (CharacterCodingException unused) {
                                try {
                                    String charBuffer = this.A00.decode(byteBuffer).toString();
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    return charBuffer;
                                } catch (CharacterCodingException unused2) {
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    return null;
                                } catch (Throwable th) {
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    throw th;
                                }
                            } finally {
                                this.A01.reset();
                                byteBuffer.rewind();
                            }
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        @Override // com.instagram.common.viewpoint.core.AbstractC2172mZ
                        public final Metadata A0R(C07549e c07549e, ByteBuffer byteBuffer) {
                            char c10;
                            String A01 = A01(byteBuffer);
                            byte[] bArr = new byte[byteBuffer.limit()];
                            byteBuffer.get(bArr);
                            if (A01 == null) {
                                return new Metadata(new IcyInfo(bArr, null, null));
                            }
                            String str2 = null;
                            String name = null;
                            Pattern pattern = A04;
                            String icyString = A03[7];
                            if (icyString.length() != 3) {
                                throw new RuntimeException();
                            }
                            A03[4] = "";
                            Matcher matcher = pattern.matcher(A01);
                            for (int i = 0; matcher.find(i); i = matcher.end()) {
                                String group = matcher.group(1);
                                String group2 = matcher.group(2);
                                if (group != null) {
                                    String key = AbstractC2035k7.A01(group);
                                    switch (key.hashCode()) {
                                        case -315603473:
                                            if (key.equals(A00(25, 9, 87))) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1646559960:
                                            if (key.equals(A00(14, 11, 77))) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            str2 = group2;
                                            break;
                                        case 1:
                                            name = group2;
                                            break;
                                    }
                                }
                            }
                            return new Metadata(new IcyInfo(bArr, str2, name));
                        }
                    };
            }
        }
        StringBuilder sb = new StringBuilder();
        String mimeType5 = A00(0, 55, 68);
        throw new IllegalArgumentException(sb.append(mimeType5).append(str).toString());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0795Bd
    public final boolean AKN(C2400qI c2400qI) {
        String str = c2400qI.A0W;
        String mimeType = A00(55, 15, 85);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(70, 18, 95);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(105, 20, 118);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(88, 17, 73);
                    if (!mimeType4.equals(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
